/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.ConfigFileReader.ConfigFile;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.internal.Yubikey;

import java.io.IOException;
import java.io.InputStream;
import java.security.PrivateKey;

/** Implementation of {@link AuthenticationDetailsProvider} that uses yubikey for authentication. */
public class YubikeyAuthenticationDetailsProvider
        implements AuthenticationDetailsProvider, RegionProvider {
    private final ConfigFile configFile;
    private final Region region;
    private final String tenantId;
    private final String userId;
    private final String keyId;
    private final char[] yubikeyPassphraseCharacters;
    private final String yubikeyFingerprint;
    private final PrivateKey privateKey;
    private YubikeyConfig yubikeyConfig;
    private Yubikey yubikey;

    /**
     * Creates a new YubikeyAuthenticationDetailsProvider instance.
     * Details come from Builder.
     * For certain parameters, if the value is @null, then the details from YubikeyConfig are used,
     * if the values are still null, then config file is tried.
     *
     * @param configFile The configuration file to use, if any
     * @param region region which overrides the region from the configFile
     * @param tenantId tenantId which overrides tenantId in the configFile
     * @param userId userId which overrides the user in the configFile
     * @param yubikeyPassphraseCharacters passphraseCharacters which override passphrase in the configFile
     * @param yubikeyConfig The yubikeyConfig to use, if any
     * @param keyId keyId to use with form tenantId/userId/YubikeyFingerprint
     * @throws IOException if the configuration file could not be loaded
     */
    public YubikeyAuthenticationDetailsProvider(
            ConfigFile configFile,
            Region region,
            String tenantId,
            String userId,
            char[] yubikeyPassphraseCharacters,
            YubikeyConfig yubikeyConfig,
            String keyId)
            throws IOException, NullPointerException {
        this.configFile = configFile != null ? configFile : ConfigFileReader.parseDefault();
        this.region =
                region != null
                        ? region
                        : ConfigFileAuthenticationDetailsProvider.getRegionFromConfigFile(
                                this.configFile);
        this.tenantId = tenantId != null ? tenantId : this.configFile.get("tenancy");
        this.userId = userId != null ? userId : this.configFile.get("user");
        char[] passphraseChars = null;
        if (yubikeyPassphraseCharacters != null) {
            passphraseChars = yubikeyPassphraseCharacters;
        } else if (this.yubikeyConfig.getPassphrase() != null) {
            passphraseChars = this.yubikeyConfig.getPassphrase();
        } else if (this.configFile.get("pass_phrase") != null) {
            passphraseChars = this.configFile.get("pass_phrase").toCharArray();
        }
        this.yubikeyPassphraseCharacters = passphraseChars;
        this.yubikeyConfig =
                yubikeyConfig != null
                        ? yubikeyConfig
                        : new YubikeyConfig(this.yubikeyPassphraseCharacters);
        this.yubikey = Yubikey.instance(this.yubikeyConfig);
        this.privateKey = this.yubikey.getPrivateKey();
        this.yubikeyFingerprint = this.yubikey.getPublicKeyFingerPrint();
        this.keyId =
                keyId != null
                        ? keyId
                        : String.format(
                                "%s/%s/%s", this.tenantId, this.userId, this.yubikeyFingerprint);
    }

    @Override
    public String getKeyId() {
        return this.keyId;
    }

    @Override
    public InputStream getPrivateKey() {
        return null;
    }

    @Deprecated
    @Override
    public String getPassPhrase() {
        return yubikeyPassphraseCharacters != null ? new String(yubikeyPassphraseCharacters) : null;
    }

    @Override
    public char[] getPassphraseCharacters() {
        return this.yubikeyPassphraseCharacters;
    }

    @Override
    public String getFingerprint() {
        return this.yubikeyFingerprint;
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

    public PrivateKey getYubikeyPrivateKey() {
        return this.privateKey;
    }

    @Override
    public String toString() {
        return "YubikeyAuthenticationDetailsProvider{"
                + ", configFile="
                + configFile
                + ", region="
                + region
                + ", tenantId='"
                + tenantId
                + '\''
                + ", userId='"
                + userId
                + '\''
                + ", keyId='"
                + keyId
                + '\''
                + ", passphraseCharacters=<redacted>"
                + ", yubikeyFingerprint='"
                + yubikeyFingerprint
                + '\''
                + ", yubikeyConfig="
                + yubikeyConfig
                + ", yubikey="
                + yubikey
                + '}';
    }

    public static YubikeyAuthenticationDetailsProviderBuilder builder() {
        return new YubikeyAuthenticationDetailsProviderBuilder();
    }

    public static class YubikeyAuthenticationDetailsProviderBuilder {
        private ConfigFile configFile;
        private YubikeyConfig yubikeyConfig;
        private Region region;
        private char[] passphraseCharacters;
        private String tenantId;
        private String userId;
        private String keyId;

        public YubikeyAuthenticationDetailsProviderBuilder configFile(ConfigFile configFile) {
            this.configFile = configFile;
            return this;
        }

        public YubikeyAuthenticationDetailsProviderBuilder yubikeyConfig(
                YubikeyConfig yubikeyConfig) {
            this.yubikeyConfig = yubikeyConfig;
            return this;
        }

        public YubikeyAuthenticationDetailsProviderBuilder region(Region region) {
            this.region = region;
            return this;
        }

        public YubikeyAuthenticationDetailsProviderBuilder yubikeyPassphraseCharacters(
                char[] passphraseCharacters) {
            this.passphraseCharacters = passphraseCharacters;
            return this;
        }

        public YubikeyAuthenticationDetailsProviderBuilder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public YubikeyAuthenticationDetailsProviderBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public YubikeyAuthenticationDetailsProviderBuilder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        public YubikeyAuthenticationDetailsProvider build() throws IOException {
            return new YubikeyAuthenticationDetailsProvider(
                    configFile,
                    region,
                    tenantId,
                    userId,
                    passphraseCharacters,
                    yubikeyConfig,
                    keyId);
        }
    }
}
