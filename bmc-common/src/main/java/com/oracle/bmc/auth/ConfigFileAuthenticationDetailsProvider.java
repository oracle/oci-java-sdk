/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import java.io.IOException;
import java.io.InputStream;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.ConfigFileReader.ConfigFile;

import lombok.ToString;

/**
 * Implementation of {@link AuthenticationDetailsProvider} that uses a standard
 * BMC configuration file as an input.
 */
@ToString
public class ConfigFileAuthenticationDetailsProvider implements AuthenticationDetailsProvider {

    private final SimpleAuthenticationDetailsProvider delegate;

    /**
     * Creates a new instance using the config file at the default location,
     * see {@link ConfigFileReader#DEFAULT_FILE_PATH}.
     *
     * @param profile
     *            profile to load, optional
     * @throws IOException
     *             if the configuration file could not be loaded
     */
    public ConfigFileAuthenticationDetailsProvider(String profile) throws IOException {
        this(ConfigFileReader.parseDefault(profile));
    }

    /**
     * Creates a new instance.
     *
     * @param configurationFilePath
     *            path to the BMC configuration file
     * @param profile
     *            profile to load, optional
     * @throws IOException
     *             if the configuration file could not be loaded
     */
    public ConfigFileAuthenticationDetailsProvider(String configurationFilePath, String profile)
            throws IOException {
        this(ConfigFileReader.parse(configurationFilePath, profile));
    }

    /**
     * Creates a new instance.
     *
     * @param configFile
     *            The configuration file to use.
     */
    public ConfigFileAuthenticationDetailsProvider(ConfigFile configFile) {
        String fingerprint =
                Preconditions.checkNotNull(
                        configFile.get("fingerprint"), "missing fingerprint in config");
        String tenantId =
                Preconditions.checkNotNull(configFile.get("tenancy"), "missing tenancy in config");
        String userId =
                Preconditions.checkNotNull(configFile.get("user"), "missing user in config");
        String pemFilePath =
                Preconditions.checkNotNull(
                        configFile.get("key_file"), "missing key_file in config");
        // pass phrase is optional
        String passPhrase = configFile.get("pass_phrase");

        Supplier<InputStream> privateKeySupplier = new SimplePrivateKeySupplier(pemFilePath);

        this.delegate =
                SimpleAuthenticationDetailsProvider.builder()
                        .fingerprint(fingerprint)
                        .passPhrase(passPhrase)
                        .privateKeySupplier(privateKeySupplier)
                        .tenantId(tenantId)
                        .userId(userId)
                        .build();
    }

    @Override
    public String getFingerprint() {
        return this.delegate.getFingerprint();
    }

    @Override
    public String getTenantId() {
        return this.delegate.getTenantId();
    }

    @Override
    public String getUserId() {
        return this.delegate.getUserId();
    }

    @Override
    public String getPassPhrase() {
        return this.delegate.getPassPhrase();
    }

    @Override
    public InputStream getPrivateKey() {
        return this.delegate.getPrivateKey();
    }
}
