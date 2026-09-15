/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.internal.AsyncFederationClient;
import com.oracle.bmc.auth.internal.AuthUtils;
import com.oracle.bmc.auth.internal.WorkloadIdentityFederationClient;
import com.oracle.bmc.auth.internal.WorkloadIdentityFederationConstants;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.retrier.RetryConfiguration;
import org.slf4j.Logger;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.interfaces.RSAPrivateKey;
import java.time.Duration;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A {@link BasicAuthenticationDetailsProvider} implementation that uses workload identity
 * federation to authenticate with Oracle Cloud Infrastructure. This provider exchanges a subject
 * token (e.g., a Kubernetes service account token) for an OCI session token, which is then used to
 * sign API requests.
 *
 * <p>This provider offers two key features for robust authentication in long-running applications:
 *
 * <ol>
 *   <li><b>Asynchronous Initialization with {@code buildAsync()}:</b><br>
 *       The {@link #builder()} provides a {@code buildAsync()} method that pre-fetches the first
 *       authentication token upon initialization. This "fail-fast" approach ensures that
 *       authentication issues are discovered at startup rather than during the first API call, and
 *       it eliminates the initial authentication delay.
 *   <li><b>Automatic Proactive Token Refresh with {@code retryConfiguration()}:</b><br>
 *       For applications that make continuous API calls, this provider offers automatic proactive
 *       token refresh when retry configuration is provided via {@link
 *       WorkloadIdentityFederationAuthenticationDetailProviderBuilder#retryConfiguration(RetryConfiguration)}.
 *       When retry configuration is set, the provider uses a background thread to automatically
 *       refresh the session token before it expires, preventing the calling thread from being
 *       blocked by token refresh operations and ensuring consistent API call performance. When no
 *       retry configuration is provided, proactive refresh is disabled to conserve resources.
 * </ol>
 *
 * <p>When proactive refresh is enabled (via retry configuration), it is crucial to call {@link
 * #close()} (or {@link #shutdown()}) * when the provider is no longer needed to release the
 * background scheduling thread.
 *
 * @see WorkloadIdentityFederationAuthenticationDetailProviderBuilder
 */
@AuthCachingPolicy(cacheKeyId = false, cachePrivateKey = false)
public class WorkloadIdentityFederationAuthenticationDetailProvider
        implements BasicAuthenticationDetailsProvider,
                RegionProvider,
                RefreshableOnNotAuthenticatedProvider<String>,
                ProvidesConfigurableRefresh,
                AutoCloseable {

    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    WorkloadIdentityFederationAuthenticationDetailProvider.class);

    private final AsyncFederationClient federationClient;
    private final SessionKeySupplier sessionKeySupplier;
    private final Region region;

    private WorkloadIdentityFederationAuthenticationDetailProvider(
            AsyncFederationClient federationClient,
            SessionKeySupplier sessionKeySupplier,
            String tokenExchangeUrl,
            Region region) {
        if (federationClient == null) {
            throw new IllegalArgumentException("Federation client must not be null");
        }
        if (tokenExchangeUrl == null || tokenExchangeUrl.trim().isEmpty()) {
            throw new IllegalArgumentException("Token exchange URL must not be null or empty");
        }
        if (sessionKeySupplier == null) {
            throw new IllegalArgumentException("Session key supplier must not be null");
        }
        if (region == null) {
            throw new IllegalArgumentException("Region must not be null");
        }

        this.federationClient = federationClient;
        this.sessionKeySupplier = sessionKeySupplier;
        this.region = region;
    }

    /**
     * Creates a new WorkloadIdentityFederationAuthenticationDetailProviderBuilder.
     *
     * @return A new builder instance.
     */
    public static WorkloadIdentityFederationAuthenticationDetailProviderBuilder builder() {
        return new WorkloadIdentityFederationAuthenticationDetailProviderBuilder();
    }

    /**
     * Builder for {@link WorkloadIdentityFederationAuthenticationDetailProvider}.
     *
     * <p><b>Required Setters:</b>
     *
     * <ul>
     *   <li>{@link #tokenExchangeUrl(String)}
     *   <li>{@link #region(Region)}
     * </ul>
     *
     * <p><b>Optional Setters:</b>
     *
     * <ul>
     *   <li>{@link #earlySessionTokenExpirationInSeconds(Long)}
     *   <li>{@link #enableCircuitBreaker(Boolean)}
     *   <li>{@link #retryConfiguration(RetryConfiguration)}
     * </ul>
     */
    public static class WorkloadIdentityFederationAuthenticationDetailProviderBuilder {

        private String tokenExchangeUrl;
        private Region region;
        private SessionKeySupplier sessionKeySupplier;
        private AsyncFederationClient federationClient;
        private Supplier<String> subjectTokenSupplier;
        private String clientCredential;
        private Map<String, String> requestPayload;
        private Boolean isInstanceCertificatesRequired;
        private Long earlySessionTokenExpirationInSeconds; // Default to 5 minutes early expiration
        private boolean enableCircuitBreaker = false;
        private RetryConfiguration retryConfiguration = null;

        private static final long DEFAULT_EARLY_SESSION_TOKEN_EXPIRATION = 300L;

        /** Type of requested token for token exchange. */
        public enum RequestedTokenType {
            RPST,
            UPST;

            @Override
            public String toString() {
                return name().toLowerCase();
            }

            public static RequestedTokenType fromString(String requestedTokenType) {
                for (RequestedTokenType t : RequestedTokenType.values()) {
                    if (t.toString().equalsIgnoreCase(requestedTokenType)) {
                        return t;
                    }
                }
                return null;
            }
        }

        private static final Logger LOG =
                org.slf4j.LoggerFactory.getLogger(
                        WorkloadIdentityFederationAuthenticationDetailProviderBuilder.class);

        public WorkloadIdentityFederationAuthenticationDetailProviderBuilder() {
            this.requestPayload = new HashMap<>();
            this.requestPayload.put(
                    WorkloadIdentityFederationConstants.OAUTH_PARAM_REQUESTED_TOKEN_TYPE,
                    WorkloadIdentityFederationConstants.REQUESTED_TOKEN_STRING
                            + RequestedTokenType.UPST.toString());
            this.isInstanceCertificatesRequired = false;
            this.earlySessionTokenExpirationInSeconds = DEFAULT_EARLY_SESSION_TOKEN_EXPIRATION;
        }

        /**
         * Creates a new AsyncFederationClient instance.
         *
         * @param sessionKeySupplier the session key supplier to use
         * @return a new AsyncFederationClient instance
         */
        protected AsyncFederationClient createFederationClient(
                SessionKeySupplier sessionKeySupplier) {
            if (this.federationClient == null) {
                CircuitBreakerConfiguration circuitBreakerConfig = null;
                if (enableCircuitBreaker) {
                    LOG.debug("Enabling default circuit breaker for federation client.");
                    circuitBreakerConfig = CircuitBreakerConfiguration.builder().build();
                }

                // Proactive refresh is automatically enabled when a retry configuration is
                // provided.
                // The retry configuration is passed through to the token exchange ClientCall.
                boolean enableProactiveRefresh = retryConfiguration != null;

                this.federationClient =
                        new WorkloadIdentityFederationClient(
                                tokenExchangeUrl,
                                subjectTokenSupplier,
                                sessionKeySupplier,
                                clientCredential,
                                requestPayload,
                                isInstanceCertificatesRequired,
                                null, // No custom client configurator
                                circuitBreakerConfig,
                                Collections.emptyList(), // No additional client configurators
                                earlySessionTokenExpirationInSeconds,
                                enableProactiveRefresh, // Automatically enabled when retry config
                                // is provided
                                retryConfiguration);
                LOG.debug(
                        "WorkloadIdentityFederationClient created with early expiration: {} seconds, proactive refresh: {}, retry config: {}",
                        this.earlySessionTokenExpirationInSeconds,
                        enableProactiveRefresh,
                        retryConfiguration != null
                                ? retryConfiguration
                                : "none (proactive refresh disabled)");
            }
            return this.federationClient;
        }

        /**
         * Sets the client credential. If not already Base64 encoded, it will be encoded.
         *
         * @param clientCredential the client credential string.
         * @return this builder.
         */
        public WorkloadIdentityFederationAuthenticationDetailProviderBuilder clientCredential(
                String clientCredential) {
            if (clientCredential == null || clientCredential.trim().isEmpty()) {
                throw new IllegalArgumentException("Client credential must not be null or empty");
            }
            if (!isBase64Encoded(clientCredential)) {
                this.clientCredential = base64Encode(clientCredential);
                LOG.debug("Client credential configured (Base64 encoded)");
            } else {
                this.clientCredential = clientCredential;
                LOG.debug("Client credential configured (already Base64 encoded)");
            }
            return this;
        }

        /**
         * Sets the appId (optional)
         *
         * @param appId the app guid string.
         * @return this builder.
         */
        public WorkloadIdentityFederationAuthenticationDetailProviderBuilder appId(String appId) {
            if (appId == null || appId.trim().isEmpty()) {
                throw new IllegalArgumentException("Client credential must not be null or empty");
            }
            this.requestPayload.put(WorkloadIdentityFederationConstants.OAUTH_PARAM_APP_ID, appId);
            return this;
        }

        /**
         * Sets the resourceType (optional)
         *
         * @param resourceType the resource type string.
         * @return this builder.
         */
        public WorkloadIdentityFederationAuthenticationDetailProviderBuilder resourceType(
                String resourceType) {
            if (resourceType == null || resourceType.trim().isEmpty()) {
                throw new IllegalArgumentException("Resource type must not be null or empty");
            }
            this.requestPayload.put(
                    WorkloadIdentityFederationConstants.OAUTH_PARAM_RES_TYPE, resourceType);
            return this;
        }

        /**
         * Sets the rpstExpiry (optional)
         *
         * @param rpstExpiry the custom RPST expiry (in minutes) string.
         * @return this builder.
         */
        public WorkloadIdentityFederationAuthenticationDetailProviderBuilder rpstExpiry(
                String rpstExpiry) {
            if (rpstExpiry == null || rpstExpiry.trim().isEmpty()) {
                throw new IllegalArgumentException("RPST expiry must not be null or empty");
            }
            this.requestPayload.put(
                    WorkloadIdentityFederationConstants.OAUTH_PARAM_RPST_EXP, rpstExpiry);
            return this;
        }

        /**
         * Sets the requestedTokenType (optional)
         *
         * @param requestedTokenType requested token type string.
         * @return this builder.
         */
        @Deprecated
        public WorkloadIdentityFederationAuthenticationDetailProviderBuilder requestedTokenType(
                String requestedTokenType) {
            if (requestedTokenType == null || requestedTokenType.trim().isEmpty()) {
                throw new IllegalArgumentException(
                        "Requested token type must not be null or empty");
            }
            RequestedTokenType tokenType = RequestedTokenType.fromString(requestedTokenType);
            if (tokenType != null) {
                requestedTokenType(tokenType);
            } else {
                throw new IllegalArgumentException(
                        "Requested token type is not supported: " + requestedTokenType);
            }

            return this;
        }

        /**
         * Sets the requestedTokenType (optional)
         *
         * @param requestedTokenType requested token type.
         * @return this builder.
         */
        public WorkloadIdentityFederationAuthenticationDetailProviderBuilder requestedTokenType(
                RequestedTokenType requestedTokenType) {
            this.requestPayload.put(
                    WorkloadIdentityFederationConstants.OAUTH_PARAM_REQUESTED_TOKEN_TYPE,
                    WorkloadIdentityFederationConstants.REQUESTED_TOKEN_STRING
                            + requestedTokenType.toString());
            return this;
        }
        /**
         * Sets the isInstanceCertificatesRequired (optional)
         *
         * @param isInstanceCertificatesRequired whether instance certificates are required boolean.
         * @return this builder.
         */
        public WorkloadIdentityFederationAuthenticationDetailProviderBuilder
                isInstanceCertificatesRequired(Boolean isInstanceCertificatesRequired) {
            this.isInstanceCertificatesRequired = isInstanceCertificatesRequired;
            return this;
        }

        private static boolean isBase64Encoded(String str) {
            try {
                Base64.getDecoder().decode(str);
                return true;
            } catch (IllegalArgumentException e) {
                return false;
            }
        }

        private static String base64Encode(String str) {
            return Base64.getEncoder()
                    .encodeToString(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        }

        /**
         * Sets the number of seconds before the session token expires to consider it expired
         * (optional).
         *
         * @param seconds The number of seconds.
         * @return this builder.
         */
        public WorkloadIdentityFederationAuthenticationDetailProviderBuilder
                earlySessionTokenExpirationInSeconds(Long seconds) {
            this.earlySessionTokenExpirationInSeconds = seconds;
            return this;
        }

        /**
         * Sets the token exchange URL (required).
         *
         * @param tokenExchangeUrl The URL for token exchange.
         * @return this builder.
         */
        public WorkloadIdentityFederationAuthenticationDetailProviderBuilder tokenExchangeUrl(
                String tokenExchangeUrl) {
            if (tokenExchangeUrl == null || tokenExchangeUrl.trim().isEmpty()) {
                throw new IllegalArgumentException("Token exchange URL must not be null or empty");
            }
            this.tokenExchangeUrl = tokenExchangeUrl;
            return this;
        }

        /**
         * Sets the subject token supplier.
         *
         * @param subjectTokenSupplier The supplier for the subject token.
         * @return this builder.
         */
        public WorkloadIdentityFederationAuthenticationDetailProviderBuilder subjectTokenSupplier(
                Supplier<String> subjectTokenSupplier) {
            if (subjectTokenSupplier == null) {
                throw new IllegalArgumentException("Subject token supplier must not be null");
            }
            this.subjectTokenSupplier = subjectTokenSupplier;
            return this;
        }

        /**
         * Sets the region (required).
         *
         * @param region The region.
         * @return this builder.
         */
        public WorkloadIdentityFederationAuthenticationDetailProviderBuilder region(Region region) {
            if (region == null) {
                throw new IllegalArgumentException("Region must not be null");
            }
            this.region = region;
            return this;
        }

        /**
         * Enables a default circuit breaker for the federation client.
         *
         * @return this builder
         */
        public WorkloadIdentityFederationAuthenticationDetailProviderBuilder enableCircuitBreaker(
                Boolean enableCircuitBreaker) {
            this.enableCircuitBreaker = enableCircuitBreaker;
            return this;
        }

        /**
         * Sets the SDK retry configuration used for the token exchange call.
         *
         * <p>When a retry configuration is provided, this builder will also enable proactive
         * background refresh. The retry configuration is passed through to the token exchange
         * {@code ClientCall}.
         *
         * @param retryConfiguration SDK retry configuration to use (must not be null)
         * @return this builder
         */
        public WorkloadIdentityFederationAuthenticationDetailProviderBuilder retryConfiguration(
                RetryConfiguration retryConfiguration) {
            if (retryConfiguration == null) {
                throw new IllegalArgumentException("Retry configuration must not be null");
            }
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Builds the {@link WorkloadIdentityFederationAuthenticationDetailProvider}. All required
         * fields must be set before calling this method.
         *
         * @throws IllegalArgumentException if any required field is not set.
         * @return a new instance of {@link WorkloadIdentityFederationAuthenticationDetailProvider}.
         */
        public WorkloadIdentityFederationAuthenticationDetailProvider build() {
            if (tokenExchangeUrl == null || tokenExchangeUrl.trim().isEmpty()) {
                throw new IllegalArgumentException("Token exchange URL must not be null or empty");
            }
            if (region == null) {
                throw new IllegalArgumentException("Region must not be null");
            }

            SessionKeySupplier sessionKeySupplierToUse =
                    sessionKeySupplier != null ? sessionKeySupplier : new SessionKeySupplierImpl();
            this.sessionKeySupplier = new CachingSessionKeySupplier(sessionKeySupplierToUse);
            this.federationClient = createFederationClient(sessionKeySupplierToUse);

            return new WorkloadIdentityFederationAuthenticationDetailProvider(
                    this.federationClient, this.sessionKeySupplier, this.tokenExchangeUrl, region);
        }

        /**
         * Builds the {@link WorkloadIdentityFederationAuthenticationDetailProvider} asynchronously.
         * This method initializes the federation client and pre-fetches the first token, then
         * returns a CompletableFuture that completes with the fully initialized provider.
         *
         * <p>This is useful when you want to ensure the provider is ready with a valid token before
         * passing it to a client that needs authentication.
         *
         * @throws IllegalArgumentException if any required field is not set.
         * @return a CompletableFuture containing the initialized authentication provider
         */
        public CompletableFuture<WorkloadIdentityFederationAuthenticationDetailProvider>
                buildAsync() {
            if (tokenExchangeUrl == null || tokenExchangeUrl.trim().isEmpty()) {
                throw new IllegalArgumentException("Token exchange URL must not be null or empty");
            }
            if (region == null) {
                throw new IllegalArgumentException("Region must not be null");
            }

            SessionKeySupplier sessionKeySupplierToUse =
                    sessionKeySupplier != null ? sessionKeySupplier : new SessionKeySupplierImpl();
            this.sessionKeySupplier = new CachingSessionKeySupplier(sessionKeySupplierToUse);
            this.federationClient = createFederationClient(sessionKeySupplierToUse);

            WorkloadIdentityFederationAuthenticationDetailProvider provider =
                    new WorkloadIdentityFederationAuthenticationDetailProvider(
                            this.federationClient,
                            this.sessionKeySupplier,
                            this.tokenExchangeUrl,
                            region);

            // Pre-fetch the first token to ensure the provider is ready
            return provider.federationClient
                    .getSecurityToken()
                    .thenApply(
                            token -> {
                                LOG.debug(
                                        "Authentication provider initialized with token: {}",
                                        token != null ? "***" : "null");
                                return provider;
                            });
        }
    }

    @Override
    public String refresh() {
        try {
            return federationClient.refreshAndGetSecurityToken().get();
        } catch (Exception e) {
            throw new RuntimeException(
                    e.getCause() != null ? e.getCause().getMessage() : e.getMessage(), e);
        }
    }

    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration duration) {
        try {
            return ((ProvidesConfigurableRefresh) federationClient)
                    .refreshAndGetSecurityTokenIfExpiringWithin(duration);
        } catch (Exception e) {
            throw new RuntimeException(
                    e.getCause() != null ? e.getCause().getMessage() : e.getMessage(), e);
        }
    }

    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(
            Duration duration, boolean refreshKeys) {
        try {
            return ((ProvidesConfigurableRefresh) federationClient)
                    .refreshAndGetSecurityTokenIfExpiringWithin(duration, refreshKeys);
        } catch (Exception e) {
            throw new RuntimeException(
                    e.getCause() != null ? e.getCause().getMessage() : e.getMessage(), e);
        }
    }

    @Override
    public Region getRegion() {
        return region;
    }

    @Override
    public String getKeyId() {
        return "ST$" + federationClient.getSecurityToken().join();
    }

    @Override
    public InputStream getPrivateKey() {
        if (sessionKeySupplier instanceof CachingSessionKeySupplier) {
            return new ByteArrayInputStream(
                    ((CachingSessionKeySupplier) sessionKeySupplier).getPrivateKeyBytes());
        } else {
            return new ByteArrayInputStream(
                    AuthUtils.toByteArrayFromRSAPrivateKey(
                            (RSAPrivateKey) sessionKeySupplier.getKeyPair().getPrivate()));
        }
    }

    @Override
    public String getPassPhrase() {
        return null; // Not applicable for token exchange
    }

    @Override
    public char[] getPassphraseCharacters() {
        return null; // Not applicable for token exchange
    }

    @Override
    public void close() {
        shutdown();
    }

    /**
     * Shuts down the authentication provider and releases resources. This method delegates to the
     * federation client's shutdown method to ensure proper cleanup of the proactive refresh
     * scheduler.
     */
    public void shutdown() {
        if (federationClient instanceof WorkloadIdentityFederationClient) {
            ((WorkloadIdentityFederationClient) federationClient).shutdown();
            LOG.debug("Authentication provider shut down");
        }
    }
}
