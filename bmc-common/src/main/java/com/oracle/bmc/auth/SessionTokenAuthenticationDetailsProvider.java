/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.ConfigFileReader.ConfigFile;
import com.oracle.bmc.Region;
import com.oracle.bmc.util.internal.Validate;
import org.slf4j.Logger;
import java.io.File;
import java.io.InputStream;
import java.io.IOException;
import java.util.Scanner;

import static com.oracle.bmc.util.internal.FileUtils.expandUserHome;

/**
 * Implementation of {@link AuthenticationDetailsProvider} that uses a session token for authentication.
 */
@AuthCachingPolicy(cacheKeyId = false, cachePrivateKey = false)
public class SessionTokenAuthenticationDetailsProvider
        implements AuthenticationDetailsProvider, RegionProvider,
                RefreshableOnNotAuthenticatedProvider<String> {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SessionTokenAuthenticationDetailsProvider.class);
    private final static String CONFIG_FILE_DEBUG_INFORMATION_LOG =
            "\nFor more information about OCI configuration file and how to get required information, see https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdkconfig.htm";
    private final SimplePrivateKeySupplier privateKeySupplier;
    private final Region region;
    private final char[] passphraseCharacters;
    private final String tenantId;
    private final String fingerprint;
    private final String userId;
    private final String sessionTokenFilePath;
    private String sessionToken;

    /**
     * Creates a new instance using the config file at the default location
     *  and the default profile. See {@link ConfigFileReader#DEFAULT_FILE_PATH}.
     *
     * @throws IOException
     *             if the configuration file could not be loaded
     */
    public SessionTokenAuthenticationDetailsProvider() throws IOException {
        this(ConfigFileReader.parseDefault());
    }

    /**
     * Creates a new instance using the config file at the default location,
     * see {@link ConfigFileReader#DEFAULT_FILE_PATH}.
     *
     * @param profile
     *            profile to load, optional
     * @throws IOException
     *             if the configuration file could not be loaded
     */
    public SessionTokenAuthenticationDetailsProvider(String profile) throws IOException {
        this(ConfigFileReader.parseDefault(profile));
    }

    /**
     * Creates a new instance.
     *
     * @param configurationFilePath
     *            path to the OCI configuration file
     * @param profile
     *            profile to load, optional
     * @throws IOException
     *             if the configuration file could not be loaded
     */
    public SessionTokenAuthenticationDetailsProvider(String configurationFilePath, String profile)
            throws IOException {
        this(ConfigFileReader.parse(configurationFilePath, profile));
    }

    /**
     * Creates a new instance.
     *
     * @param configFile
     *            The configuration file to use.
     * @throws IOException
     *            if the configuration file could not be loaded
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

        // optional parameters with session token authentication.
        this.fingerprint = configFile.get("fingerprint");
        this.userId = configFile.get("user");
        String passPhrase = configFile.get("pass_phrase");
        this.passphraseCharacters = passPhrase != null ? passPhrase.toCharArray() : null;
    }

    /**
     * Loads the session token from the file specified in the file path.
     *
     * @param sessionTokenFilePath
     *            The file path to set the session token from.
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
     * Sets the session token directly from a string.
     *
     * @param sessionToken
     *            The session token to use.
     */
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * Refreshes the session token from the file defined in the OCI config file.
     */
    @Override
    public String refresh() {
        LOG.debug("Refreshing session token");
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
}
