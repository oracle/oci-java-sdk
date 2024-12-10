/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.ConfigFileReader.ConfigFile;
import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.Region;
import com.oracle.bmc.Services;
import com.oracle.bmc.http.Priorities;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpProvider;
import com.oracle.bmc.http.internal.AuthnClientFilter;
import com.oracle.bmc.http.internal.ClientCall;
import com.oracle.bmc.http.signing.DefaultRequestSigner;
import com.oracle.bmc.responses.BmcResponse;
import com.oracle.bmc.util.internal.Validate;
import org.slf4j.Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import static com.oracle.bmc.util.internal.FileUtils.expandUserHome;

/**
 * Implementation of {@link AuthenticationDetailsProvider} that uses a session token for
 * authentication.
 */
@AuthCachingPolicy(cacheKeyId = false, cachePrivateKey = false)
public class SessionTokenAuthenticationDetailsProvider
        implements AuthenticationDetailsProvider,
                RegionProvider,
                RefreshableOnNotAuthenticatedProvider<String> {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SessionTokenAuthenticationDetailsProvider.class);
    private static final String CONFIG_FILE_DEBUG_INFORMATION_LOG =
            "\nFor more information about OCI configuration file and how to get required information, see https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdkconfig.htm";
    private static final String DEFAULT_PRIVATE_KEY_FILE_PATH =
            "~/.oci/sessions/DEFAULT/oci_api_key.pem";
    private static final long DEFAULT_REFRESH_INITIAL_DELAY_MINUTES = 0;
    private static final long DEFAULT_REFRESH_INTERVAL_MINUTES = 55;
    private static final long DEFAULT_SESSION_LIFETIME_HOURS = 24;
    private final ScheduledExecutorService scheduler;
    private ScheduledFuture scheduledFuture;
    private final boolean usingDefaultScheduler;
    private final SimplePrivateKeySupplier privateKeySupplier;
    private final Region region;
    private final char[] passphraseCharacters;
    private final String tenantId;
    private final String fingerprint;
    private final String userId;
    private final String sessionTokenFilePath;
    private volatile String sessionToken;

    /**
     * Creates a new instance using the config file at the default location and the default profile.
     * See {@link ConfigFileReader#DEFAULT_FILE_PATH}.
     *
     * @throws IOException if the configuration file could not be loaded
     */
    public SessionTokenAuthenticationDetailsProvider() throws IOException {
        this(ConfigFileReader.parseDefault());
    }

    /**
     * Creates a new instance using the config file at the default location, see {@link
     * ConfigFileReader#DEFAULT_FILE_PATH}.
     *
     * @param profile profile to load, optional
     * @throws IOException if the configuration file could not be loaded
     */
    public SessionTokenAuthenticationDetailsProvider(String profile) throws IOException {
        this(ConfigFileReader.parseDefault(profile));
    }

    /**
     * Creates a new instance.
     *
     * @param configurationFilePath path to the OCI configuration file
     * @param profile profile to load, optional
     * @throws IOException if the configuration file could not be loaded
     */
    public SessionTokenAuthenticationDetailsProvider(String configurationFilePath, String profile)
            throws IOException {
        this(ConfigFileReader.parse(configurationFilePath, profile));
    }

    protected SessionTokenAuthenticationDetailsProvider(
            String privateKeyFilePath,
            Region region,
            String regionId,
            String passPhrase,
            String tenantId,
            String fingerprint,
            String userId,
            String sessionTokenFilePath,
            String sessionToken,
            long initialRefreshDelay,
            long refreshPeriod,
            TimeUnit timeUnit,
            long sessionLifetimeHours,
            ScheduledExecutorService scheduler,
            boolean usingDefaultScheduler)
            throws IOException {
        if (privateKeyFilePath == null) {
            LOG.debug(
                    "privateKeyFilePath was not provided, using the default path: {}",
                    DEFAULT_PRIVATE_KEY_FILE_PATH);
            privateKeyFilePath = DEFAULT_PRIVATE_KEY_FILE_PATH;
        }
        this.privateKeySupplier = new SimplePrivateKeySupplier(privateKeyFilePath);
        if (region == null) {
            Validate.notNull(
                    regionId,
                    "SessionTokenAuthenticationDetailsProvider: Set either region or regionId");
            this.region = Region.fromRegionCodeOrId(regionId);
        } else {
            this.region = region;
        }
        this.passphraseCharacters = passPhrase != null ? passPhrase.toCharArray() : null;
        this.tenantId =
                Validate.notNull(
                        tenantId,
                        "SessionTokenAuthenticationDetailsProvider: tenantId is a required parameter");
        this.fingerprint = fingerprint;
        this.userId = userId;
        this.sessionTokenFilePath = sessionTokenFilePath;
        this.sessionToken = sessionToken;
        if (sessionToken == null) {
            Validate.notNull(
                    sessionTokenFilePath,
                    "SessionTokenAuthenticationDetailsProvider: Set either sessionToken or sessionTokenFilePath");
            setSessionTokenFromFilePath(sessionTokenFilePath);
        }
        this.scheduler = scheduler;
        this.usingDefaultScheduler = usingDefaultScheduler;
        setTokenRefreshSchedule(initialRefreshDelay, refreshPeriod, timeUnit, sessionLifetimeHours);
    }

    /**
     * Creates a new instance.
     *
     * @param configFile The configuration file to use.
     * @throws IOException if the configuration file could not be loaded
     */
    public SessionTokenAuthenticationDetailsProvider(ConfigFile configFile) throws IOException {
        this.sessionTokenFilePath =
                Validate.notNull(
                        configFile.get("security_token_file"),
                        "Missing security_token_file in config."
                                + CONFIG_FILE_DEBUG_INFORMATION_LOG);
        this.tenantId =
                Validate.notNull(
                        configFile.get("tenancy"),
                        "Missing tenancy in config." + CONFIG_FILE_DEBUG_INFORMATION_LOG);
        String pemFilePath =
                Validate.notNull(
                        configFile.get("key_file"),
                        "Missing key_file in config." + CONFIG_FILE_DEBUG_INFORMATION_LOG);
        this.privateKeySupplier = new SimplePrivateKeySupplier(pemFilePath);
        this.region = ConfigFileAuthenticationDetailsProvider.getRegionFromConfigFile(configFile);
        setSessionTokenFromFilePath(sessionTokenFilePath);

        // use default refresh schedule
        this.usingDefaultScheduler = true;
        this.scheduler = Executors.newSingleThreadScheduledExecutor();
        setTokenRefreshSchedule(
                DEFAULT_REFRESH_INITIAL_DELAY_MINUTES,
                DEFAULT_REFRESH_INTERVAL_MINUTES,
                TimeUnit.MINUTES,
                DEFAULT_SESSION_LIFETIME_HOURS);
        // optional parameters for session token authentication.
        this.fingerprint = configFile.get("fingerprint");
        this.userId = configFile.get("user");
        String passPhrase = configFile.get("pass_phrase");
        this.passphraseCharacters = passPhrase != null ? passPhrase.toCharArray() : null;
    }

    /**
     * Sets the session token directly from a string.
     *
     * @param sessionToken The session token to use.
     */
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /** @return current session token. */
    public String getSessionToken() {
        return this.sessionToken;
    }

    /** Returns the token refresh scheduler. */
    public java.util.concurrent.ExecutorService getScheduler() {
        return this.scheduler;
    }

    /** Stops the token refresh scheduler. */
    public void close() {
        scheduledFuture.cancel(false);
        // Only shutdown the default scheduler
        if (usingDefaultScheduler) {
            this.scheduler.shutdownNow();
        }
    }

    /**
     * Default scheduler refreshes session tokens every 55 minutes and stops after 24 hours. Initial
     * delay is 0 to refresh immediately so the next refresh is still valid 55 minutes later. The
     * sessionLifetime variable cannot extend sessions beyond 24 hours, it can only reduce the
     * lifetime.
     */
    private void setTokenRefreshSchedule(
            long refreshDelay, long refreshInterval, TimeUnit timeUnit, long sessionLifetime) {
        if (scheduler == null) {
            LOG.debug("Refresh schedule disabled");
            return;
        }
        scheduledFuture =
                scheduler.scheduleWithFixedDelay(
                        () -> refreshSessionToken(), refreshDelay, refreshInterval, timeUnit);
        scheduler.schedule(() -> close(), sessionLifetime, TimeUnit.HOURS);
    }

    /**
     * Loads the session token from the file specified in the file path.
     *
     * @param sessionTokenFilePath The file path to set the session token from.
     */
    public void setSessionTokenFromFilePath(String sessionTokenFilePath) throws IOException {
        File sessionTokenFile = new File(expandUserHome(sessionTokenFilePath));
        StringBuilder token = new StringBuilder();
        LOG.info("Loading session token from: {}", sessionTokenFile.getAbsolutePath());
        final Scanner reader = new Scanner(sessionTokenFile);
        while (reader.hasNextLine()) {
            token.append(reader.nextLine());
        }
        reader.close();
        setSessionToken(token.toString());
    }

    /**
     * Puts the current session token into the file specified by the {@code sessionTokenFilePath}
     * variable.
     */
    private void writeCurrentSessionTokenToFile() throws IOException {
        if (sessionTokenFilePath == null) {
            LOG.debug("Not writing token to file");
            return;
        }
        FileWriter writer = new FileWriter(expandUserHome(sessionTokenFilePath));
        LOG.info("Writing current session token to token path");
        writer.write(this.sessionToken);
        writer.close();
    }

    /** Refreshes the session token from the file defined in the OCI config file. */
    @Override
    public String refresh() {
        LOG.debug("Refreshing session token from file");
        String oldSessionToken = this.sessionToken;
        try {
            setSessionTokenFromFilePath(sessionTokenFilePath);
            if (this.sessionToken.equals(oldSessionToken)) {
                LOG.warn(
                        "A session token refresh was attempted but it did not change. The token file has not been updated!");
            } else {
                LOG.info(
                        "A session token refresh was attempted and the token was successfully changed. The token file has been updated!");
            }
        } catch (IOException e) {
            LOG.warn("Unable to refresh session token.", e);
            e.printStackTrace();
        }
        return this.sessionToken;
    }

    /**
     * Makes a call to the Identity service to refresh the session token.
     *
     * @return true if refresh was successful, false otherwise
     */
    public synchronized boolean refreshSessionToken() {
        com.oracle.bmc.Service service =
                Services.serviceBuilder().serviceName("auth").serviceEndpointPrefix("auth").build();
        String endpoint = Region.formatDefaultRegionEndpoint(service, region);
        LOG.debug(
                "Refreshing session token, refresh endpoint: {}/v1/authentication/refresh",
                endpoint);

        try {
            HttpClient httpClient =
                    HttpProvider.getDefault()
                            .newBuilder()
                            .baseUri(endpoint)
                            .registerRequestInterceptor(
                                    Priorities.AUTHENTICATION,
                                    new AuthnClientFilter(
                                            DefaultRequestSigner.createRequestSigner(this),
                                            Collections.emptyMap()))
                            .build();

            SessionTokenRefreshRequest request =
                    new SessionTokenRefreshRequest((this.sessionToken));

            this.sessionToken =
                    ClientCall.builder(httpClient, request, TokenRefreshResponse.Builder::new)
                            .logger(LOG, "SessionTokenRefresh")
                            .method(com.oracle.bmc.http.client.Method.POST)
                            .serviceDetails(
                                    "Java SDK Authentication",
                                    "SessionTokenRefresh",
                                    "https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm")
                            .appendPathPart("v1")
                            .appendPathPart("authentication")
                            .appendPathPart("refresh")
                            .appendHeader("content-type", "application/json")
                            .handleBody(SessionToken.class, TokenRefreshResponse.Builder::token)
                            .hasBody()
                            .callSync()
                            .token
                            .getToken();

            writeCurrentSessionTokenToFile();
        } catch (Exception e) {
            LOG.error("Unable to refresh session token.", e);
            close();
            return false;
        }
        return true;
    }

    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SessionToken.Builder.class)
    public static class SessionToken {
        @com.fasterxml.jackson.annotation.JsonProperty("currentToken")
        private String currentToken;

        public SessionToken(String token) {
            this.currentToken = token;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getToken() {
            return currentToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
        public static class Builder {
            String token;

            public Builder() {}

            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public SessionToken build() {
                return new SessionToken(this.token);
            }
        }
    }

    @InternalSdk
    public static class SessionTokenRefreshRequest
            extends com.oracle.bmc.requests.BmcRequest<
                    SessionTokenRefreshRequest.SessionTokenRequest> {
        private String token;

        SessionTokenRefreshRequest(String token) {
            this.token = token;
        }

        @Override
        @InternalSdk
        public SessionTokenRequest getBody$() {
            return new SessionTokenRequest(token);
        }

        @InternalSdk
        public static class SessionTokenRequest {
            public String currentToken;

            public SessionTokenRequest(String token) {
                this.currentToken = token;
            }
        }
    }

    static class TokenRefreshResponse extends BmcResponse {
        final SessionToken token;

        TokenRefreshResponse(int status, Map<String, List<String>> headers, SessionToken token) {
            super(status, headers);
            this.token = token;
        }

        public static Builder builder() {
            return new Builder();
        }

        static class Builder implements BmcResponse.Builder<TokenRefreshResponse> {
            private int status;
            private Map<String, List<String>> headers;
            SessionToken token;

            Builder() {}

            private Builder(TokenRefreshResponse b) {
                this.status = b.get__httpStatusCode__();
                this.headers = b.getHeaders();
                this.token = b.token;
            }

            public BmcResponse.Builder<TokenRefreshResponse> token(SessionToken token) {
                this.token = token;
                return this;
            }

            @Override
            public BmcResponse.Builder<TokenRefreshResponse> __httpStatusCode__(
                    int __httpStatusCode__) {
                this.status = __httpStatusCode__;
                return this;
            }

            @Override
            public BmcResponse.Builder<TokenRefreshResponse> headers(
                    Map<String, List<String>> headers) {
                this.headers = headers;
                return this;
            }

            @Override
            public BmcResponse.Builder<TokenRefreshResponse> copy(TokenRefreshResponse o) {
                return new TokenRefreshResponse.Builder(o);
            }

            @Override
            public TokenRefreshResponse build() {
                return new TokenRefreshResponse(status, headers, token);
            }
        }
    }

    @Override
    public String getKeyId() {
        return "ST$" + this.sessionToken;
    }

    @Override
    public InputStream getPrivateKey() {
        return privateKeySupplier.get();
    }

    @Deprecated
    @Override
    public String getPassPhrase() {
        return passphraseCharacters != null ? new String(passphraseCharacters) : null;
    }

    @Override
    public char[] getPassphraseCharacters() {
        return this.passphraseCharacters;
    }

    @Override
    public String getFingerprint() {
        return this.fingerprint;
    }

    @Override
    public String getTenantId() {
        return this.tenantId;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public Region getRegion() {
        return this.region;
    }

    @Override
    public String toString() {
        return String.format(
                "SessionTokenAuthenticationDetailsProvider(region=%s, tenantId=%s, userId=%s, fingerprint=%s, passphraseCharacters=%s, privateKeySupplier=%s, sessionTokenFilePath=%s, sessionToken=%s)",
                region.toString(),
                tenantId,
                userId,
                fingerprint,
                passphraseCharacters != null ? "<provided>" : null,
                privateKeySupplier != null ? "<provided>" : null,
                sessionTokenFilePath != null ? "<provided>" : null,
                sessionToken != null ? "<provided>" : null);
    }

    /**
     * Creates a new SessionTokenAuthenticationDetailsProviderBuilder.
     *
     * @return A new builder instance.
     */
    public static SessionTokenAuthenticationDetailsProviderBuilder builder() {
        return new SessionTokenAuthenticationDetailsProviderBuilder();
    }

    /** Builder for SessionTokenAuthenticationDetailsProvider. */
    public static class SessionTokenAuthenticationDetailsProviderBuilder {
        private String privateKeyFilePath = null;
        private Region region = null;
        private String regionId = null;
        private String passPhrase = null;
        private String tenantId = null;
        private String fingerprint = null;
        private String userId = null;
        private String sessionTokenFilePath = null;
        private String sessionToken = null;
        private boolean usingDefaultScheduler = true;
        private long initialRefreshDelay = DEFAULT_REFRESH_INITIAL_DELAY_MINUTES;
        private long refreshPeriod = DEFAULT_REFRESH_INTERVAL_MINUTES;
        private TimeUnit timeUnit = TimeUnit.MINUTES;
        private long sessionLifetimeHours = DEFAULT_SESSION_LIFETIME_HOURS;
        private ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        public SessionTokenAuthenticationDetailsProviderBuilder privateKeyFilePath(
                String privateKeyFilePath) {
            this.privateKeyFilePath = privateKeyFilePath;
            return this;
        }

        public SessionTokenAuthenticationDetailsProviderBuilder region(Region region) {
            this.region = region;
            return this;
        }

        public SessionTokenAuthenticationDetailsProviderBuilder region(String regionId) {
            this.regionId = regionId;
            return this;
        }

        public SessionTokenAuthenticationDetailsProviderBuilder passPhrase(String passPhrase) {
            this.passPhrase = passPhrase;
            return this;
        }

        public SessionTokenAuthenticationDetailsProviderBuilder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public SessionTokenAuthenticationDetailsProviderBuilder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        public SessionTokenAuthenticationDetailsProviderBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public SessionTokenAuthenticationDetailsProviderBuilder sessionTokenFilePath(
                String sessionTokenFilePath) {
            this.sessionTokenFilePath = sessionTokenFilePath;
            return this;
        }

        public SessionTokenAuthenticationDetailsProviderBuilder sessionToken(String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }

        public SessionTokenAuthenticationDetailsProviderBuilder initialRefreshDelay(
                long initialRefreshDelay) {
            this.initialRefreshDelay = initialRefreshDelay;
            return this;
        }

        public SessionTokenAuthenticationDetailsProviderBuilder refreshPeriod(long refreshPeriod) {
            this.refreshPeriod = refreshPeriod;
            return this;
        }

        public SessionTokenAuthenticationDetailsProviderBuilder timeUnit(TimeUnit timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }

        public SessionTokenAuthenticationDetailsProviderBuilder sessionLifetimeHours(
                long sessionLifetimeHours) {
            this.sessionLifetimeHours = sessionLifetimeHours;
            return this;
        }

        public SessionTokenAuthenticationDetailsProviderBuilder scheduler(
                ScheduledExecutorService scheduler) {
            this.scheduler = scheduler;
            this.usingDefaultScheduler = false;
            return this;
        }

        public SessionTokenAuthenticationDetailsProviderBuilder disableScheduledRefresh() {
            this.scheduler = null;
            this.usingDefaultScheduler = false;
            return this;
        }

        /** @return the SessionTokenAuthenticationDetailsProvider */
        public SessionTokenAuthenticationDetailsProvider build() throws IOException {
            return new SessionTokenAuthenticationDetailsProvider(
                    privateKeyFilePath,
                    region,
                    regionId,
                    passPhrase,
                    tenantId,
                    fingerprint,
                    userId,
                    sessionTokenFilePath,
                    sessionToken,
                    initialRefreshDelay,
                    refreshPeriod,
                    timeUnit,
                    sessionLifetimeHours,
                    scheduler,
                    usingDefaultScheduler);
        }
    }
}
