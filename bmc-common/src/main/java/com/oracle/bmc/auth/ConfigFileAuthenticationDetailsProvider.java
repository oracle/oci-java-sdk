/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import java.io.IOException;
import java.io.InputStream;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Realm;
import com.oracle.bmc.Region;
import com.oracle.bmc.ConfigFileReader.ConfigFile;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Implementation of {@link AuthenticationDetailsProvider} that uses a standard
 * OCI configuration file as an input.
 */
@ToString
@Slf4j
public class ConfigFileAuthenticationDetailsProvider
        implements AuthenticationDetailsProvider, RegionProvider {

    private final SimpleAuthenticationDetailsProvider delegate;
    private final String pemFilePath;

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
     *            path to the OCI configuration file
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

        // region is optional, for backwards compatibility, if region is not known, log an error and continue.
        // the same file may be used by other tools, where the region can be a newly launched region value
        // that is not supported by the SDK yet.
        Region region = null;
        String regionId = configFile.get("region");
        if (regionId != null) {
            try {
                region = Region.fromRegionId(regionId);
            } catch (IllegalArgumentException e) {
                LOG.warn(
                        "Found regionId '{}' in config file, but not supported by this version of the SDK",
                        regionId,
                        e);
                // Proceed by assuming the region id in the config file belongs to OC1 realm.
                region = Region.register(regionId, Realm.OC1);
            }
        } else {
            LOG.info("Region not specified in Config file. Proceeding without setting a region.");
        }

        SimpleAuthenticationDetailsProvider.SimpleAuthenticationDetailsProviderBuilder builder =
                SimpleAuthenticationDetailsProvider.builder()
                        .fingerprint(fingerprint)
                        .privateKeySupplier(privateKeySupplier)
                        .tenantId(tenantId)
                        .userId(userId)
                        .region(region);
        if (passPhrase != null) {
            builder = builder.passphraseCharacters(passPhrase.toCharArray());
        }
        this.delegate = builder.build();
        this.pemFilePath = pemFilePath;
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

    @Deprecated
    @Override
    public String getPassPhrase() {
        return this.delegate.getPassPhrase();
    }

    @Override
    public char[] getPassphraseCharacters() {
        return this.delegate.getPassphraseCharacters();
    }

    @Override
    public InputStream getPrivateKey() {
        return this.delegate.getPrivateKey();
    }

    @Override
    public String getKeyId() {
        return this.delegate.getKeyId();
    }

    @Override
    public Region getRegion() {
        return this.delegate.getRegion();
    }

    /**
     * Returns the file path to the private key.
     *
     * @return the PEM File Path.
     */
    public String getPemFilePath() {
        return this.pemFilePath;
    }
}
