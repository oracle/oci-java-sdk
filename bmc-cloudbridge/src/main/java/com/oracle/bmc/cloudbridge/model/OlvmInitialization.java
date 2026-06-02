/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Type representing initialization configuration of a virtual machine.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OlvmInitialization.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OlvmInitialization extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "activeDirectoryOu",
        "cloudInitNetworkProtocol",
        "configuration",
        "customScript",
        "dnsSearch",
        "dnsServers",
        "domain",
        "hostName",
        "inputLocale",
        "nicConfigurations",
        "orgName",
        "isRegenerateIds",
        "isRegenerateSshKeys",
        "systemLocale",
        "timezone",
        "uiLanguage",
        "userLocale",
        "username",
        "windowsLicenseKey"
    })
    public OlvmInitialization(
            String activeDirectoryOu,
            CloudInitNetworkProtocol cloudInitNetworkProtocol,
            OlvmConfiguration configuration,
            String customScript,
            String dnsSearch,
            String dnsServers,
            String domain,
            String hostName,
            String inputLocale,
            java.util.List<OlvmNicConfiguration> nicConfigurations,
            String orgName,
            Boolean isRegenerateIds,
            Boolean isRegenerateSshKeys,
            String systemLocale,
            String timezone,
            String uiLanguage,
            String userLocale,
            String username,
            String windowsLicenseKey) {
        super();
        this.activeDirectoryOu = activeDirectoryOu;
        this.cloudInitNetworkProtocol = cloudInitNetworkProtocol;
        this.configuration = configuration;
        this.customScript = customScript;
        this.dnsSearch = dnsSearch;
        this.dnsServers = dnsServers;
        this.domain = domain;
        this.hostName = hostName;
        this.inputLocale = inputLocale;
        this.nicConfigurations = nicConfigurations;
        this.orgName = orgName;
        this.isRegenerateIds = isRegenerateIds;
        this.isRegenerateSshKeys = isRegenerateSshKeys;
        this.systemLocale = systemLocale;
        this.timezone = timezone;
        this.uiLanguage = uiLanguage;
        this.userLocale = userLocale;
        this.username = username;
        this.windowsLicenseKey = windowsLicenseKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Active Directory Organizational Unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("activeDirectoryOu")
        private String activeDirectoryOu;

        /**
         * Active Directory Organizational Unit.
         * @param activeDirectoryOu the value to set
         * @return this builder
         **/
        public Builder activeDirectoryOu(String activeDirectoryOu) {
            this.activeDirectoryOu = activeDirectoryOu;
            this.__explicitlySet__.add("activeDirectoryOu");
            return this;
        }
        /**
         * Defines the values for the cloud-init protocol. This protocol decides how the cloud-init network parameters are formatted before being passed to the virtual machine in order to be processed by cloud-init.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cloudInitNetworkProtocol")
        private CloudInitNetworkProtocol cloudInitNetworkProtocol;

        /**
         * Defines the values for the cloud-init protocol. This protocol decides how the cloud-init network parameters are formatted before being passed to the virtual machine in order to be processed by cloud-init.
         * @param cloudInitNetworkProtocol the value to set
         * @return this builder
         **/
        public Builder cloudInitNetworkProtocol(CloudInitNetworkProtocol cloudInitNetworkProtocol) {
            this.cloudInitNetworkProtocol = cloudInitNetworkProtocol;
            this.__explicitlySet__.add("cloudInitNetworkProtocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private OlvmConfiguration configuration;

        public Builder configuration(OlvmConfiguration configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }
        /**
         * Custom script that will be run when the VM starts.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customScript")
        private String customScript;

        /**
         * Custom script that will be run when the VM starts.
         * @param customScript the value to set
         * @return this builder
         **/
        public Builder customScript(String customScript) {
            this.customScript = customScript;
            this.__explicitlySet__.add("customScript");
            return this;
        }
        /**
         * DNS Search of the virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsSearch")
        private String dnsSearch;

        /**
         * DNS Search of the virtual machine.
         * @param dnsSearch the value to set
         * @return this builder
         **/
        public Builder dnsSearch(String dnsSearch) {
            this.dnsSearch = dnsSearch;
            this.__explicitlySet__.add("dnsSearch");
            return this;
        }
        /**
         * DNS Servers of the virtual  machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsServers")
        private String dnsServers;

        /**
         * DNS Servers of the virtual  machine.
         * @param dnsServers the value to set
         * @return this builder
         **/
        public Builder dnsServers(String dnsServers) {
            this.dnsServers = dnsServers;
            this.__explicitlySet__.add("dnsServers");
            return this;
        }
        /**
         * Domain of the virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * Domain of the virtual machine.
         * @param domain the value to set
         * @return this builder
         **/
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /**
         * Host name of the virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * Host name of the virtual machine.
         * @param hostName the value to set
         * @return this builder
         **/
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /**
         * Input locale of the virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inputLocale")
        private String inputLocale;

        /**
         * Input locale of the virtual machine.
         * @param inputLocale the value to set
         * @return this builder
         **/
        public Builder inputLocale(String inputLocale) {
            this.inputLocale = inputLocale;
            this.__explicitlySet__.add("inputLocale");
            return this;
        }
        /**
         * The configuration of a virtual network interface.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nicConfigurations")
        private java.util.List<OlvmNicConfiguration> nicConfigurations;

        /**
         * The configuration of a virtual network interface.
         * @param nicConfigurations the value to set
         * @return this builder
         **/
        public Builder nicConfigurations(java.util.List<OlvmNicConfiguration> nicConfigurations) {
            this.nicConfigurations = nicConfigurations;
            this.__explicitlySet__.add("nicConfigurations");
            return this;
        }
        /**
         * Organization name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("orgName")
        private String orgName;

        /**
         * Organization name.
         * @param orgName the value to set
         * @return this builder
         **/
        public Builder orgName(String orgName) {
            this.orgName = orgName;
            this.__explicitlySet__.add("orgName");
            return this;
        }
        /**
         * Indicates if new IDs should be regenerated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRegenerateIds")
        private Boolean isRegenerateIds;

        /**
         * Indicates if new IDs should be regenerated.
         * @param isRegenerateIds the value to set
         * @return this builder
         **/
        public Builder isRegenerateIds(Boolean isRegenerateIds) {
            this.isRegenerateIds = isRegenerateIds;
            this.__explicitlySet__.add("isRegenerateIds");
            return this;
        }
        /**
         * Indicates if new SSH Keys should be regenerated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRegenerateSshKeys")
        private Boolean isRegenerateSshKeys;

        /**
         * Indicates if new SSH Keys should be regenerated.
         * @param isRegenerateSshKeys the value to set
         * @return this builder
         **/
        public Builder isRegenerateSshKeys(Boolean isRegenerateSshKeys) {
            this.isRegenerateSshKeys = isRegenerateSshKeys;
            this.__explicitlySet__.add("isRegenerateSshKeys");
            return this;
        }
        /**
         * System locale of the virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemLocale")
        private String systemLocale;

        /**
         * System locale of the virtual machine.
         * @param systemLocale the value to set
         * @return this builder
         **/
        public Builder systemLocale(String systemLocale) {
            this.systemLocale = systemLocale;
            this.__explicitlySet__.add("systemLocale");
            return this;
        }
        /**
         * Timezone of the virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private String timezone;

        /**
         * Timezone of the virtual machine.
         * @param timezone the value to set
         * @return this builder
         **/
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            this.__explicitlySet__.add("timezone");
            return this;
        }
        /**
         * UI Language of the virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uiLanguage")
        private String uiLanguage;

        /**
         * UI Language of the virtual machine.
         * @param uiLanguage the value to set
         * @return this builder
         **/
        public Builder uiLanguage(String uiLanguage) {
            this.uiLanguage = uiLanguage;
            this.__explicitlySet__.add("uiLanguage");
            return this;
        }
        /**
         * User Locale of the virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userLocale")
        private String userLocale;

        /**
         * User Locale of the virtual machine.
         * @param userLocale the value to set
         * @return this builder
         **/
        public Builder userLocale(String userLocale) {
            this.userLocale = userLocale;
            this.__explicitlySet__.add("userLocale");
            return this;
        }
        /**
         * User name of the virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * User name of the virtual machine.
         * @param username the value to set
         * @return this builder
         **/
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * Windows License Key of the virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("windowsLicenseKey")
        private String windowsLicenseKey;

        /**
         * Windows License Key of the virtual machine.
         * @param windowsLicenseKey the value to set
         * @return this builder
         **/
        public Builder windowsLicenseKey(String windowsLicenseKey) {
            this.windowsLicenseKey = windowsLicenseKey;
            this.__explicitlySet__.add("windowsLicenseKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmInitialization build() {
            OlvmInitialization model =
                    new OlvmInitialization(
                            this.activeDirectoryOu,
                            this.cloudInitNetworkProtocol,
                            this.configuration,
                            this.customScript,
                            this.dnsSearch,
                            this.dnsServers,
                            this.domain,
                            this.hostName,
                            this.inputLocale,
                            this.nicConfigurations,
                            this.orgName,
                            this.isRegenerateIds,
                            this.isRegenerateSshKeys,
                            this.systemLocale,
                            this.timezone,
                            this.uiLanguage,
                            this.userLocale,
                            this.username,
                            this.windowsLicenseKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmInitialization model) {
            if (model.wasPropertyExplicitlySet("activeDirectoryOu")) {
                this.activeDirectoryOu(model.getActiveDirectoryOu());
            }
            if (model.wasPropertyExplicitlySet("cloudInitNetworkProtocol")) {
                this.cloudInitNetworkProtocol(model.getCloudInitNetworkProtocol());
            }
            if (model.wasPropertyExplicitlySet("configuration")) {
                this.configuration(model.getConfiguration());
            }
            if (model.wasPropertyExplicitlySet("customScript")) {
                this.customScript(model.getCustomScript());
            }
            if (model.wasPropertyExplicitlySet("dnsSearch")) {
                this.dnsSearch(model.getDnsSearch());
            }
            if (model.wasPropertyExplicitlySet("dnsServers")) {
                this.dnsServers(model.getDnsServers());
            }
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("inputLocale")) {
                this.inputLocale(model.getInputLocale());
            }
            if (model.wasPropertyExplicitlySet("nicConfigurations")) {
                this.nicConfigurations(model.getNicConfigurations());
            }
            if (model.wasPropertyExplicitlySet("orgName")) {
                this.orgName(model.getOrgName());
            }
            if (model.wasPropertyExplicitlySet("isRegenerateIds")) {
                this.isRegenerateIds(model.getIsRegenerateIds());
            }
            if (model.wasPropertyExplicitlySet("isRegenerateSshKeys")) {
                this.isRegenerateSshKeys(model.getIsRegenerateSshKeys());
            }
            if (model.wasPropertyExplicitlySet("systemLocale")) {
                this.systemLocale(model.getSystemLocale());
            }
            if (model.wasPropertyExplicitlySet("timezone")) {
                this.timezone(model.getTimezone());
            }
            if (model.wasPropertyExplicitlySet("uiLanguage")) {
                this.uiLanguage(model.getUiLanguage());
            }
            if (model.wasPropertyExplicitlySet("userLocale")) {
                this.userLocale(model.getUserLocale());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("windowsLicenseKey")) {
                this.windowsLicenseKey(model.getWindowsLicenseKey());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Active Directory Organizational Unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeDirectoryOu")
    private final String activeDirectoryOu;

    /**
     * Active Directory Organizational Unit.
     * @return the value
     **/
    public String getActiveDirectoryOu() {
        return activeDirectoryOu;
    }

    /**
     * Defines the values for the cloud-init protocol. This protocol decides how the cloud-init network parameters are formatted before being passed to the virtual machine in order to be processed by cloud-init.
     **/
    public enum CloudInitNetworkProtocol {
        Eni("ENI"),
        OpenstackMetadata("OPENSTACK_METADATA"),
        ;

        private final String value;
        private static java.util.Map<String, CloudInitNetworkProtocol> map;

        static {
            map = new java.util.HashMap<>();
            for (CloudInitNetworkProtocol v : CloudInitNetworkProtocol.values()) {
                map.put(v.getValue(), v);
            }
        }

        CloudInitNetworkProtocol(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CloudInitNetworkProtocol create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CloudInitNetworkProtocol: " + key);
        }
    };
    /**
     * Defines the values for the cloud-init protocol. This protocol decides how the cloud-init network parameters are formatted before being passed to the virtual machine in order to be processed by cloud-init.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudInitNetworkProtocol")
    private final CloudInitNetworkProtocol cloudInitNetworkProtocol;

    /**
     * Defines the values for the cloud-init protocol. This protocol decides how the cloud-init network parameters are formatted before being passed to the virtual machine in order to be processed by cloud-init.
     * @return the value
     **/
    public CloudInitNetworkProtocol getCloudInitNetworkProtocol() {
        return cloudInitNetworkProtocol;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final OlvmConfiguration configuration;

    public OlvmConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Custom script that will be run when the VM starts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customScript")
    private final String customScript;

    /**
     * Custom script that will be run when the VM starts.
     * @return the value
     **/
    public String getCustomScript() {
        return customScript;
    }

    /**
     * DNS Search of the virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsSearch")
    private final String dnsSearch;

    /**
     * DNS Search of the virtual machine.
     * @return the value
     **/
    public String getDnsSearch() {
        return dnsSearch;
    }

    /**
     * DNS Servers of the virtual  machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsServers")
    private final String dnsServers;

    /**
     * DNS Servers of the virtual  machine.
     * @return the value
     **/
    public String getDnsServers() {
        return dnsServers;
    }

    /**
     * Domain of the virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * Domain of the virtual machine.
     * @return the value
     **/
    public String getDomain() {
        return domain;
    }

    /**
     * Host name of the virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * Host name of the virtual machine.
     * @return the value
     **/
    public String getHostName() {
        return hostName;
    }

    /**
     * Input locale of the virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputLocale")
    private final String inputLocale;

    /**
     * Input locale of the virtual machine.
     * @return the value
     **/
    public String getInputLocale() {
        return inputLocale;
    }

    /**
     * The configuration of a virtual network interface.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nicConfigurations")
    private final java.util.List<OlvmNicConfiguration> nicConfigurations;

    /**
     * The configuration of a virtual network interface.
     * @return the value
     **/
    public java.util.List<OlvmNicConfiguration> getNicConfigurations() {
        return nicConfigurations;
    }

    /**
     * Organization name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orgName")
    private final String orgName;

    /**
     * Organization name.
     * @return the value
     **/
    public String getOrgName() {
        return orgName;
    }

    /**
     * Indicates if new IDs should be regenerated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRegenerateIds")
    private final Boolean isRegenerateIds;

    /**
     * Indicates if new IDs should be regenerated.
     * @return the value
     **/
    public Boolean getIsRegenerateIds() {
        return isRegenerateIds;
    }

    /**
     * Indicates if new SSH Keys should be regenerated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRegenerateSshKeys")
    private final Boolean isRegenerateSshKeys;

    /**
     * Indicates if new SSH Keys should be regenerated.
     * @return the value
     **/
    public Boolean getIsRegenerateSshKeys() {
        return isRegenerateSshKeys;
    }

    /**
     * System locale of the virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemLocale")
    private final String systemLocale;

    /**
     * System locale of the virtual machine.
     * @return the value
     **/
    public String getSystemLocale() {
        return systemLocale;
    }

    /**
     * Timezone of the virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    private final String timezone;

    /**
     * Timezone of the virtual machine.
     * @return the value
     **/
    public String getTimezone() {
        return timezone;
    }

    /**
     * UI Language of the virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uiLanguage")
    private final String uiLanguage;

    /**
     * UI Language of the virtual machine.
     * @return the value
     **/
    public String getUiLanguage() {
        return uiLanguage;
    }

    /**
     * User Locale of the virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userLocale")
    private final String userLocale;

    /**
     * User Locale of the virtual machine.
     * @return the value
     **/
    public String getUserLocale() {
        return userLocale;
    }

    /**
     * User name of the virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * User name of the virtual machine.
     * @return the value
     **/
    public String getUsername() {
        return username;
    }

    /**
     * Windows License Key of the virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("windowsLicenseKey")
    private final String windowsLicenseKey;

    /**
     * Windows License Key of the virtual machine.
     * @return the value
     **/
    public String getWindowsLicenseKey() {
        return windowsLicenseKey;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OlvmInitialization(");
        sb.append("super=").append(super.toString());
        sb.append("activeDirectoryOu=").append(String.valueOf(this.activeDirectoryOu));
        sb.append(", cloudInitNetworkProtocol=")
                .append(String.valueOf(this.cloudInitNetworkProtocol));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(", customScript=").append(String.valueOf(this.customScript));
        sb.append(", dnsSearch=").append(String.valueOf(this.dnsSearch));
        sb.append(", dnsServers=").append(String.valueOf(this.dnsServers));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", inputLocale=").append(String.valueOf(this.inputLocale));
        sb.append(", nicConfigurations=").append(String.valueOf(this.nicConfigurations));
        sb.append(", orgName=").append(String.valueOf(this.orgName));
        sb.append(", isRegenerateIds=").append(String.valueOf(this.isRegenerateIds));
        sb.append(", isRegenerateSshKeys=").append(String.valueOf(this.isRegenerateSshKeys));
        sb.append(", systemLocale=").append(String.valueOf(this.systemLocale));
        sb.append(", timezone=").append(String.valueOf(this.timezone));
        sb.append(", uiLanguage=").append(String.valueOf(this.uiLanguage));
        sb.append(", userLocale=").append(String.valueOf(this.userLocale));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", windowsLicenseKey=").append(String.valueOf(this.windowsLicenseKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmInitialization)) {
            return false;
        }

        OlvmInitialization other = (OlvmInitialization) o;
        return java.util.Objects.equals(this.activeDirectoryOu, other.activeDirectoryOu)
                && java.util.Objects.equals(
                        this.cloudInitNetworkProtocol, other.cloudInitNetworkProtocol)
                && java.util.Objects.equals(this.configuration, other.configuration)
                && java.util.Objects.equals(this.customScript, other.customScript)
                && java.util.Objects.equals(this.dnsSearch, other.dnsSearch)
                && java.util.Objects.equals(this.dnsServers, other.dnsServers)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.inputLocale, other.inputLocale)
                && java.util.Objects.equals(this.nicConfigurations, other.nicConfigurations)
                && java.util.Objects.equals(this.orgName, other.orgName)
                && java.util.Objects.equals(this.isRegenerateIds, other.isRegenerateIds)
                && java.util.Objects.equals(this.isRegenerateSshKeys, other.isRegenerateSshKeys)
                && java.util.Objects.equals(this.systemLocale, other.systemLocale)
                && java.util.Objects.equals(this.timezone, other.timezone)
                && java.util.Objects.equals(this.uiLanguage, other.uiLanguage)
                && java.util.Objects.equals(this.userLocale, other.userLocale)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.windowsLicenseKey, other.windowsLicenseKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.activeDirectoryOu == null ? 43 : this.activeDirectoryOu.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudInitNetworkProtocol == null
                                ? 43
                                : this.cloudInitNetworkProtocol.hashCode());
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        result = (result * PRIME) + (this.customScript == null ? 43 : this.customScript.hashCode());
        result = (result * PRIME) + (this.dnsSearch == null ? 43 : this.dnsSearch.hashCode());
        result = (result * PRIME) + (this.dnsServers == null ? 43 : this.dnsServers.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.inputLocale == null ? 43 : this.inputLocale.hashCode());
        result =
                (result * PRIME)
                        + (this.nicConfigurations == null ? 43 : this.nicConfigurations.hashCode());
        result = (result * PRIME) + (this.orgName == null ? 43 : this.orgName.hashCode());
        result =
                (result * PRIME)
                        + (this.isRegenerateIds == null ? 43 : this.isRegenerateIds.hashCode());
        result =
                (result * PRIME)
                        + (this.isRegenerateSshKeys == null
                                ? 43
                                : this.isRegenerateSshKeys.hashCode());
        result = (result * PRIME) + (this.systemLocale == null ? 43 : this.systemLocale.hashCode());
        result = (result * PRIME) + (this.timezone == null ? 43 : this.timezone.hashCode());
        result = (result * PRIME) + (this.uiLanguage == null ? 43 : this.uiLanguage.hashCode());
        result = (result * PRIME) + (this.userLocale == null ? 43 : this.userLocale.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result =
                (result * PRIME)
                        + (this.windowsLicenseKey == null ? 43 : this.windowsLicenseKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
