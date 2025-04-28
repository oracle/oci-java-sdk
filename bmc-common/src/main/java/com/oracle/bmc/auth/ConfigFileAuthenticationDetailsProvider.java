/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.internal.Alloy;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.ConfigFileReader.ConfigFile;
import com.oracle.bmc.Realm;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.internal.ConfigFileDelegationTokenUtils;
import com.oracle.bmc.auth.internal.DelegationTokenConfigurator;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.util.internal.StringUtils;
import com.oracle.bmc.util.internal.Validate;
import org.slf4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Implementation of {@link AuthenticationDetailsProvider} that uses a standard OCI configuration
 * file as an input.
 */
public class ConfigFileAuthenticationDetailsProvider
        implements AuthenticationDetailsProvider, RegionProvider, ProvidesClientConfigurators {

    private static final String OCI_REGION_ENV_VAR_NAME = "OCI_REGION";
    private static final String AUTHENTICATION_TYPE_KEY = "authentication_type";
    private static final String INSTANCE_PRINCIPAL_AUTHENTICATION_TYPE_VALUE = "instance_principal";
    private static final String RESOURCE_PRINCIPAL_AUTHENTICATION_TYPE_VALUE = "resource_principal";

    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ConfigFileAuthenticationDetailsProvider.class);
    protected final BasicConfigFileAuthenticationProvider delegate;
    private final Region region;
    private static final String CONFIG_FILE_DEBUG_INFORMATION_LOG =
            "\nFor more information about OCI configuration file and how to get required information, see https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdkconfig.htm";

    /**
     * Creates a new instance using the config file at the default location, see {@link
     * ConfigFileReader#DEFAULT_FILE_PATH}.
     *
     * @param profile profile to load, optional
     * @throws IOException if the configuration file could not be loaded
     */
    public ConfigFileAuthenticationDetailsProvider(String profile) throws IOException {
        this(ConfigFileReader.parseDefault(profile));
    }

    /**
     * Creates a new instance.
     *
     * @param configurationFilePath path to the OCI configuration file
     * @param profile profile to load, optional
     * @throws IOException if the configuration file could not be loaded
     */
    public ConfigFileAuthenticationDetailsProvider(String configurationFilePath, String profile)
            throws IOException {
        this(ConfigFileReader.parse(configurationFilePath, profile));
    }

    /**
     * Creates a new instance.
     *
     * @param configFile The configuration file to use.
     */
    public ConfigFileAuthenticationDetailsProvider(ConfigFile configFile) {
        final String authentication_type = configFile.get(AUTHENTICATION_TYPE_KEY);
        if (INSTANCE_PRINCIPAL_AUTHENTICATION_TYPE_VALUE.equals(authentication_type)) {
            this.delegate =
                    new ConfigFileInstancePrincipalAuthenticationDetailsProvider(configFile);
        } else if (RESOURCE_PRINCIPAL_AUTHENTICATION_TYPE_VALUE.equals(authentication_type)) {
            LOG.debug(
                    "Authentication type in config file: "
                            + configFile.get(AUTHENTICATION_TYPE_KEY));
            this.delegate =
                    new ConfigFileResourcePrincipalAuthenticationDetailsProvider(configFile);
        } else {
            this.delegate = new ConfigFileSimpleAuthenticationDetailsProvider(configFile);
        }
        this.region = getRegionFromConfigFile(configFile);
    }

    public static Region getRegionFromConfigFile(ConfigFile configFile) {

        // region is optional, for backwards compatibility, if region is not known, log an error and
        // continue.
        // the same file may be used by other tools, where the region can be a newly launched region
        // value
        // that is not supported by the SDK yet.
        Region region = null;
        String regionId = configFile.get("region");

        // if regionId is not defined in config file check env variable
        if (StringUtils.isBlank(regionId)) {
            regionId = System.getenv(OCI_REGION_ENV_VAR_NAME);
            LOG.info("regionId from OCI_REGION env variable: " + regionId);
        }

        if (regionId != null) {
            try {
                region = Region.fromRegionId(regionId);
            } catch (IllegalArgumentException e) {
                Alloy.throwUnknownAlloyRegionIfAppropriate(regionId, e);
                LOG.warn(
                        "Found regionId '{}' in config file or OCI_REGION env variable, but not supported by this version of the SDK."
                                + CONFIG_FILE_DEBUG_INFORMATION_LOG,
                        regionId,
                        e);
                // Proceed by assuming the region id in the config file belongs to OC1 realm.
                region = Region.register(regionId, Realm.OC1);
            }
        } else {
            LOG.info(
                    "Region not specified in Config file or OCI_REGION env variable. Proceeding without setting a region.");
        }
        return region;
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
    public List<ClientConfigurator> getClientConfigurators() {
        return this.delegate.getClientConfigurators();
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
        return this.region;
    }

    /**
     * Returns the file path to the private key.
     *
     * @return the PEM File Path.
     */
    public String getPemFilePath() {
        return this.delegate.getPemFilePath();
    }

    public String toString() {
        return "ConfigFileAuthenticationDetailsProvider(delegate="
                + this.delegate
                + ", region="
                + this.getRegion()
                + ")";
    }

    protected static class ConfigFileSimpleAuthenticationDetailsProvider
            implements BasicConfigFileAuthenticationProvider {

        private final SimpleAuthenticationDetailsProvider delegate;
        private final String pemFilePath;
        private final List<ClientConfigurator> clientConfigurators;

        protected ConfigFileSimpleAuthenticationDetailsProvider(ConfigFile configFile) {
            String fingerprint =
                    Validate.notNull(
                            configFile.get("fingerprint"),
                            "Missing fingerprint in config." + CONFIG_FILE_DEBUG_INFORMATION_LOG);
            String tenantId =
                    Validate.notNull(
                            configFile.get("tenancy"),
                            "Missing tenancy in config." + CONFIG_FILE_DEBUG_INFORMATION_LOG);
            String userId =
                    Validate.notNull(
                            configFile.get("user"),
                            "Missing user in config." + CONFIG_FILE_DEBUG_INFORMATION_LOG);
            String pemFilePath =
                    Validate.notNull(
                            configFile.get("key_file"),
                            "Missing key_file in config." + CONFIG_FILE_DEBUG_INFORMATION_LOG);
            // pass phrase is optional
            String passPhrase = configFile.get("pass_phrase");

            Supplier<InputStream> privateKeySupplier = new SimplePrivateKeySupplier(pemFilePath);

            SimpleAuthenticationDetailsProvider.SimpleAuthenticationDetailsProviderBuilder builder =
                    SimpleAuthenticationDetailsProvider.builder()
                            .privateKeySupplier(privateKeySupplier)
                            .fingerprint(fingerprint)
                            .userId(userId)
                            .tenantId(tenantId);
            if (passPhrase != null) {
                builder = builder.passphraseCharacters(passPhrase.toCharArray());
            }
            this.delegate = builder.build();
            this.pemFilePath = pemFilePath;
            this.clientConfigurators = new ArrayList<>();
        }

        public String getFingerprint() {
            return this.delegate.getFingerprint();
        }

        public String getTenantId() {
            return this.delegate.getTenantId();
        }

        public String getUserId() {
            return this.delegate.getUserId();
        }

        @Deprecated
        public String getPassPhrase() {
            return this.delegate.getPassPhrase();
        }

        @Deprecated
        public char[] getPassphraseCharacters() {
            return this.delegate.getPassphraseCharacters();
        }

        public InputStream getPrivateKey() {
            return this.delegate.getPrivateKey();
        }

        public String getKeyId() {
            return this.delegate.getKeyId();
        }

        @Override
        public String getPemFilePath() {
            return this.pemFilePath;
        }

        @Override
        public List<ClientConfigurator> getClientConfigurators() {
            return this.clientConfigurators;
        }
    }

    protected static class ConfigFileInstancePrincipalAuthenticationDetailsProvider
            implements BasicConfigFileAuthenticationProvider {

        private final InstancePrincipalsAuthenticationDetailsProvider delegate;
        private final String tenantId;
        private final List<ClientConfigurator> clientConfigurators;

        protected ConfigFileInstancePrincipalAuthenticationDetailsProvider(ConfigFile configFile) {
            this.delegate = InstancePrincipalsAuthenticationDetailsProvider.builder().build();
            String tenantId = configFile.get("tenancy");
            if (tenantId == null) tenantId = "";
            this.tenantId = tenantId;
            this.clientConfigurators = new ArrayList<>();
            try {
                String delegationToken =
                        ConfigFileDelegationTokenUtils.parseAndGetToken(configFile);
                if (!StringUtils.isBlank(delegationToken)) {
                    this.clientConfigurators.add(new DelegationTokenConfigurator(delegationToken));
                }
            } catch (Exception e) {
                LOG.debug("Could not load delegation token!", e);
            }
        }

        @Override
        public String getFingerprint() {
            return null;
        }

        @Override
        public String getTenantId() {
            return this.tenantId;
        }

        @Override
        public String getUserId() {
            return null;
        }

        @Override
        public String getKeyId() {
            return this.delegate.getKeyId();
        }

        @Override
        public InputStream getPrivateKey() {
            return this.delegate.getPrivateKey();
        }

        @Override
        public String getPassPhrase() {
            return null;
        }

        @Override
        public char[] getPassphraseCharacters() {
            return null;
        }

        @Override
        public String getPemFilePath() {
            return null;
        }

        @Override
        public List<ClientConfigurator> getClientConfigurators() {
            return this.clientConfigurators;
        }
    }

    protected static class ConfigFileResourcePrincipalAuthenticationDetailsProvider
            implements BasicConfigFileAuthenticationProvider {

        private final ResourcePrincipalAuthenticationDetailsProvider delegate;
        private final String tenantId;
        private final List<ClientConfigurator> clientConfigurators;

        protected ConfigFileResourcePrincipalAuthenticationDetailsProvider(ConfigFile configFile) {
            this.delegate = ResourcePrincipalAuthenticationDetailsProvider.builder().build();
            String tenantId = configFile.get("tenancy");
            if (tenantId == null) {
                tenantId = "";
            }
            this.tenantId = tenantId;
            this.clientConfigurators = new ArrayList<>();
            try {
                String delegationToken =
                        ConfigFileDelegationTokenUtils.parseAndGetToken(configFile);
                if (!StringUtils.isBlank(delegationToken)) {
                    this.clientConfigurators.add(new DelegationTokenConfigurator(delegationToken));
                }
            } catch (Exception e) {
                LOG.debug("Could not load delegation token!", e);
            }
        }

        @Override
        public String getFingerprint() {
            return null;
        }

        @Override
        public String getTenantId() {
            return this.tenantId;
        }

        @Override
        public String getUserId() {
            return null;
        }

        @Override
        public String getKeyId() {
            return this.delegate.getKeyId();
        }

        @Override
        public InputStream getPrivateKey() {
            return this.delegate.getPrivateKey();
        }

        @Override
        public String getPassPhrase() {
            return null;
        }

        @Override
        public char[] getPassphraseCharacters() {
            return null;
        }

        @Override
        public String getPemFilePath() {
            return null;
        }

        @Override
        public List<ClientConfigurator> getClientConfigurators() {
            return this.clientConfigurators;
        }
    }
}
