/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.ClientRuntime;

import javax.annotation.Nonnull;
import java.nio.file.Files;
import java.nio.file.Paths;

public class YubikeyConfig {

    private static final String DEFAULT_PROVIDER_TYPE = "PKCS11";
    private static final String DEFAULT_PROVIDER_NAME = "SunPKCS11-Yubikey";
    private static final String DEFAULT_LIB_LOCATION_OSX = "/Library/OpenSC/lib/opensc-pkcs11.so";
    private static final String DEFAULT_LIB_LOCATION_ORACLE_LINUX =
            "/usr/lib64/pkcs11/opensc-pkcs11.so";
    private static final String DEFAULT_LIB_LOCATION_WIN =
            "C:\\Windows\\System32\\opensc-pkcs11.dll";
    private final String providerName;
    private final String providerType;
    private final String libraryLocation;
    private final char[] passphrase;

    YubikeyConfig(
            String providerName,
            String providerType,
            String libraryLocation,
            @Nonnull char[] passphrase) {
        this.providerName = providerName != null ? providerName : DEFAULT_PROVIDER_NAME;
        this.providerType = providerType != null ? providerType : DEFAULT_PROVIDER_TYPE;
        this.libraryLocation = libraryLocation != null ? libraryLocation : locateDefaultLibrary();
        this.passphrase = passphrase;
    }

    YubikeyConfig(char[] passphrase) {
        this.providerName = DEFAULT_PROVIDER_NAME;
        this.providerType = DEFAULT_PROVIDER_TYPE;
        this.libraryLocation = locateDefaultLibrary();
        this.passphrase = passphrase;
    }

    /**
     * Locates and returns the default opensc-pkcs11 library location for the detected operating system.
     *
     * @return String of library location in the system.
     */
    private String locateDefaultLibrary() {
        if (ClientRuntime.IS_OS_MAC && Files.isReadable(Paths.get(DEFAULT_LIB_LOCATION_OSX))) {
            return DEFAULT_LIB_LOCATION_OSX;
        } else if (ClientRuntime.IS_OS_LINUX
                && Files.isReadable(Paths.get(DEFAULT_LIB_LOCATION_ORACLE_LINUX))) {
            return DEFAULT_LIB_LOCATION_ORACLE_LINUX;
        } else if (ClientRuntime.IS_OS_WINDOWS
                && Files.isReadable(Paths.get(DEFAULT_LIB_LOCATION_WIN))) {
            return DEFAULT_LIB_LOCATION_WIN;
        }
        throw new RuntimeException("Unable to load opensc-pkcs11 library for your OS");
    }

    /**
     * Returns the yubikey provider name.
     *
     * @return String of yubikey provider name (e.g. SunPKCS11-Yubikey).
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Returns the yubikey provider type.
     *
     * @return String of yubikey provider type (e.g. PKCS11).
     */
    public String getProviderType() {
        return providerType;
    }

    /**
     * Returns the opensc-pkcs11 library location used in this configuration.
     *
     * @return String of library location in the system for this configuration.
     */
    public String getLibraryLocation() {
        return libraryLocation;
    }

    /**
     * Returns the yubikey passphrase.
     *
     * @return char[] yubikey passphrase.
     */
    public char[] getPassphrase() {
        return passphrase;
    }

    @Override
    public String toString() {
        return "YubikeyConfig{"
                + "providerName='"
                + providerName
                + '\''
                + ", providerType='"
                + providerType
                + '\''
                + ", libraryLocation='"
                + libraryLocation
                + '\''
                + ", passphrase=<redacted>"
                + '}';
    }

    public static YubikeyConfigBuilder builder() {
        return new YubikeyConfigBuilder();
    }

    public static class YubikeyConfigBuilder {
        private String providerName;
        private String providerType;
        private String libraryLocation;
        private char[] passphrase;

        public YubikeyConfigBuilder providerName(String providerName) {
            this.providerName = providerName;
            return this;
        }

        public YubikeyConfigBuilder providerType(String providerType) {
            this.providerType = providerType;
            return this;
        }

        public YubikeyConfigBuilder libraryLocation(String libraryLocation) {
            this.libraryLocation = libraryLocation;
            return this;
        }

        public YubikeyConfigBuilder yubikeyPassphraseCharacters(char[] passphrase) {
            this.passphrase = passphrase;
            return this;
        }

        public YubikeyConfig build() {
            return new YubikeyConfig(providerName, providerType, libraryLocation, passphrase);
        }
    }
}
