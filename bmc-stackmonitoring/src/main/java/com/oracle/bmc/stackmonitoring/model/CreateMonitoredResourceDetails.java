/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The information about new monitored resource to be created. The combination of monitored resource
 * name and type should be unique across tenancy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMonitoredResourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMonitoredResourceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "displayName",
        "type",
        "compartmentId",
        "hostName",
        "externalId",
        "managementAgentId",
        "resourceTimeZone",
        "license",
        "properties",
        "databaseConnectionDetails",
        "credentials",
        "aliases",
        "additionalCredentials",
        "additionalAliases",
        "freeformTags",
        "definedTags"
    })
    public CreateMonitoredResourceDetails(
            String name,
            String displayName,
            String type,
            String compartmentId,
            String hostName,
            String externalId,
            String managementAgentId,
            String resourceTimeZone,
            LicenseType license,
            java.util.List<MonitoredResourceProperty> properties,
            ConnectionDetails databaseConnectionDetails,
            MonitoredResourceCredential credentials,
            MonitoredResourceAliasCredential aliases,
            java.util.List<MonitoredResourceCredential> additionalCredentials,
            java.util.List<MonitoredResourceAliasCredential> additionalAliases,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.name = name;
        this.displayName = displayName;
        this.type = type;
        this.compartmentId = compartmentId;
        this.hostName = hostName;
        this.externalId = externalId;
        this.managementAgentId = managementAgentId;
        this.resourceTimeZone = resourceTimeZone;
        this.license = license;
        this.properties = properties;
        this.databaseConnectionDetails = databaseConnectionDetails;
        this.credentials = credentials;
        this.aliases = aliases;
        this.additionalCredentials = additionalCredentials;
        this.additionalAliases = additionalAliases;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Monitored Resource Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Monitored Resource Name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Monitored resource display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Monitored resource display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Monitored Resource Type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Monitored Resource Type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Compartment Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Host name of the monitored resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * Host name of the monitored resource.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /**
         * External resource is any OCI resource identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) which is
         * not a Stack Monitoring service resource. Currently supports only OCI compute instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalId")
        private String externalId;

        /**
         * External resource is any OCI resource identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) which is
         * not a Stack Monitoring service resource. Currently supports only OCI compute instance.
         *
         * @param externalId the value to set
         * @return this builder
         */
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            this.__explicitlySet__.add("externalId");
            return this;
        }
        /**
         * Management Agent Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        /**
         * Management Agent Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param managementAgentId the value to set
         * @return this builder
         */
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }
        /**
         * Time zone in the form of tz database canonical zone ID. Specifies the preference with a
         * value that uses the IANA Time Zone Database format (x-obmcs-time-zone). For example -
         * America/Los_Angeles
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTimeZone")
        private String resourceTimeZone;

        /**
         * Time zone in the form of tz database canonical zone ID. Specifies the preference with a
         * value that uses the IANA Time Zone Database format (x-obmcs-time-zone). For example -
         * America/Los_Angeles
         *
         * @param resourceTimeZone the value to set
         * @return this builder
         */
        public Builder resourceTimeZone(String resourceTimeZone) {
            this.resourceTimeZone = resourceTimeZone;
            this.__explicitlySet__.add("resourceTimeZone");
            return this;
        }
        /**
         * License edition of the monitored resource. If not provided the default license type for
         * the compartment will be used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("license")
        private LicenseType license;

        /**
         * License edition of the monitored resource. If not provided the default license type for
         * the compartment will be used.
         *
         * @param license the value to set
         * @return this builder
         */
        public Builder license(LicenseType license) {
            this.license = license;
            this.__explicitlySet__.add("license");
            return this;
        }
        /** List of monitored resource properties. */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<MonitoredResourceProperty> properties;

        /**
         * List of monitored resource properties.
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.List<MonitoredResourceProperty> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseConnectionDetails")
        private ConnectionDetails databaseConnectionDetails;

        public Builder databaseConnectionDetails(ConnectionDetails databaseConnectionDetails) {
            this.databaseConnectionDetails = databaseConnectionDetails;
            this.__explicitlySet__.add("databaseConnectionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentials")
        private MonitoredResourceCredential credentials;

        public Builder credentials(MonitoredResourceCredential credentials) {
            this.credentials = credentials;
            this.__explicitlySet__.add("credentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("aliases")
        private MonitoredResourceAliasCredential aliases;

        public Builder aliases(MonitoredResourceAliasCredential aliases) {
            this.aliases = aliases;
            this.__explicitlySet__.add("aliases");
            return this;
        }
        /**
         * List of MonitoredResourceCredentials. This property complements the existing
         * "credentials" property by allowing user to specify more than one credential. If both
         * "credential" and "additionalCredentials" are specified, union of the values is used as
         * list of credentials applicable for this resource. If any duplicate found in the combined
         * list of "credentials" and "additionalCredentials", an error will be thrown.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalCredentials")
        private java.util.List<MonitoredResourceCredential> additionalCredentials;

        /**
         * List of MonitoredResourceCredentials. This property complements the existing
         * "credentials" property by allowing user to specify more than one credential. If both
         * "credential" and "additionalCredentials" are specified, union of the values is used as
         * list of credentials applicable for this resource. If any duplicate found in the combined
         * list of "credentials" and "additionalCredentials", an error will be thrown.
         *
         * @param additionalCredentials the value to set
         * @return this builder
         */
        public Builder additionalCredentials(
                java.util.List<MonitoredResourceCredential> additionalCredentials) {
            this.additionalCredentials = additionalCredentials;
            this.__explicitlySet__.add("additionalCredentials");
            return this;
        }
        /**
         * List of MonitoredResourceAliasCredentials. This property complements the existing
         * "aliases" property by allowing user to specify more than one credential alias. If both
         * "aliases" and "additionalAliases" are specified, union of the values is used as list of
         * aliases applicable for this resource. If any duplicate found in the combined list of
         * "alias" and "additionalAliases", an error will be thrown.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalAliases")
        private java.util.List<MonitoredResourceAliasCredential> additionalAliases;

        /**
         * List of MonitoredResourceAliasCredentials. This property complements the existing
         * "aliases" property by allowing user to specify more than one credential alias. If both
         * "aliases" and "additionalAliases" are specified, union of the values is used as list of
         * aliases applicable for this resource. If any duplicate found in the combined list of
         * "alias" and "additionalAliases", an error will be thrown.
         *
         * @param additionalAliases the value to set
         * @return this builder
         */
        public Builder additionalAliases(
                java.util.List<MonitoredResourceAliasCredential> additionalAliases) {
            this.additionalAliases = additionalAliases;
            this.__explicitlySet__.add("additionalAliases");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMonitoredResourceDetails build() {
            CreateMonitoredResourceDetails model =
                    new CreateMonitoredResourceDetails(
                            this.name,
                            this.displayName,
                            this.type,
                            this.compartmentId,
                            this.hostName,
                            this.externalId,
                            this.managementAgentId,
                            this.resourceTimeZone,
                            this.license,
                            this.properties,
                            this.databaseConnectionDetails,
                            this.credentials,
                            this.aliases,
                            this.additionalCredentials,
                            this.additionalAliases,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMonitoredResourceDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("externalId")) {
                this.externalId(model.getExternalId());
            }
            if (model.wasPropertyExplicitlySet("managementAgentId")) {
                this.managementAgentId(model.getManagementAgentId());
            }
            if (model.wasPropertyExplicitlySet("resourceTimeZone")) {
                this.resourceTimeZone(model.getResourceTimeZone());
            }
            if (model.wasPropertyExplicitlySet("license")) {
                this.license(model.getLicense());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("databaseConnectionDetails")) {
                this.databaseConnectionDetails(model.getDatabaseConnectionDetails());
            }
            if (model.wasPropertyExplicitlySet("credentials")) {
                this.credentials(model.getCredentials());
            }
            if (model.wasPropertyExplicitlySet("aliases")) {
                this.aliases(model.getAliases());
            }
            if (model.wasPropertyExplicitlySet("additionalCredentials")) {
                this.additionalCredentials(model.getAdditionalCredentials());
            }
            if (model.wasPropertyExplicitlySet("additionalAliases")) {
                this.additionalAliases(model.getAdditionalAliases());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Monitored Resource Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Monitored Resource Name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Monitored resource display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Monitored resource display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Monitored Resource Type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Monitored Resource Type.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /**
     * Compartment Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Host name of the monitored resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * Host name of the monitored resource.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * External resource is any OCI resource identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) which is not a
     * Stack Monitoring service resource. Currently supports only OCI compute instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalId")
    private final String externalId;

    /**
     * External resource is any OCI resource identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) which is not a
     * Stack Monitoring service resource. Currently supports only OCI compute instance.
     *
     * @return the value
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Management Agent Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    /**
     * Management Agent Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getManagementAgentId() {
        return managementAgentId;
    }

    /**
     * Time zone in the form of tz database canonical zone ID. Specifies the preference with a value
     * that uses the IANA Time Zone Database format (x-obmcs-time-zone). For example -
     * America/Los_Angeles
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTimeZone")
    private final String resourceTimeZone;

    /**
     * Time zone in the form of tz database canonical zone ID. Specifies the preference with a value
     * that uses the IANA Time Zone Database format (x-obmcs-time-zone). For example -
     * America/Los_Angeles
     *
     * @return the value
     */
    public String getResourceTimeZone() {
        return resourceTimeZone;
    }

    /**
     * License edition of the monitored resource. If not provided the default license type for the
     * compartment will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("license")
    private final LicenseType license;

    /**
     * License edition of the monitored resource. If not provided the default license type for the
     * compartment will be used.
     *
     * @return the value
     */
    public LicenseType getLicense() {
        return license;
    }

    /** List of monitored resource properties. */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<MonitoredResourceProperty> properties;

    /**
     * List of monitored resource properties.
     *
     * @return the value
     */
    public java.util.List<MonitoredResourceProperty> getProperties() {
        return properties;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseConnectionDetails")
    private final ConnectionDetails databaseConnectionDetails;

    public ConnectionDetails getDatabaseConnectionDetails() {
        return databaseConnectionDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    private final MonitoredResourceCredential credentials;

    public MonitoredResourceCredential getCredentials() {
        return credentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("aliases")
    private final MonitoredResourceAliasCredential aliases;

    public MonitoredResourceAliasCredential getAliases() {
        return aliases;
    }

    /**
     * List of MonitoredResourceCredentials. This property complements the existing "credentials"
     * property by allowing user to specify more than one credential. If both "credential" and
     * "additionalCredentials" are specified, union of the values is used as list of credentials
     * applicable for this resource. If any duplicate found in the combined list of "credentials"
     * and "additionalCredentials", an error will be thrown.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalCredentials")
    private final java.util.List<MonitoredResourceCredential> additionalCredentials;

    /**
     * List of MonitoredResourceCredentials. This property complements the existing "credentials"
     * property by allowing user to specify more than one credential. If both "credential" and
     * "additionalCredentials" are specified, union of the values is used as list of credentials
     * applicable for this resource. If any duplicate found in the combined list of "credentials"
     * and "additionalCredentials", an error will be thrown.
     *
     * @return the value
     */
    public java.util.List<MonitoredResourceCredential> getAdditionalCredentials() {
        return additionalCredentials;
    }

    /**
     * List of MonitoredResourceAliasCredentials. This property complements the existing "aliases"
     * property by allowing user to specify more than one credential alias. If both "aliases" and
     * "additionalAliases" are specified, union of the values is used as list of aliases applicable
     * for this resource. If any duplicate found in the combined list of "alias" and
     * "additionalAliases", an error will be thrown.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalAliases")
    private final java.util.List<MonitoredResourceAliasCredential> additionalAliases;

    /**
     * List of MonitoredResourceAliasCredentials. This property complements the existing "aliases"
     * property by allowing user to specify more than one credential alias. If both "aliases" and
     * "additionalAliases" are specified, union of the values is used as list of aliases applicable
     * for this resource. If any duplicate found in the combined list of "alias" and
     * "additionalAliases", an error will be thrown.
     *
     * @return the value
     */
    public java.util.List<MonitoredResourceAliasCredential> getAdditionalAliases() {
        return additionalAliases;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateMonitoredResourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", externalId=").append(String.valueOf(this.externalId));
        sb.append(", managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", resourceTimeZone=").append(String.valueOf(this.resourceTimeZone));
        sb.append(", license=").append(String.valueOf(this.license));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", databaseConnectionDetails=")
                .append(String.valueOf(this.databaseConnectionDetails));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(", aliases=").append(String.valueOf(this.aliases));
        sb.append(", additionalCredentials=").append(String.valueOf(this.additionalCredentials));
        sb.append(", additionalAliases=").append(String.valueOf(this.additionalAliases));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMonitoredResourceDetails)) {
            return false;
        }

        CreateMonitoredResourceDetails other = (CreateMonitoredResourceDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.externalId, other.externalId)
                && java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.resourceTimeZone, other.resourceTimeZone)
                && java.util.Objects.equals(this.license, other.license)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(
                        this.databaseConnectionDetails, other.databaseConnectionDetails)
                && java.util.Objects.equals(this.credentials, other.credentials)
                && java.util.Objects.equals(this.aliases, other.aliases)
                && java.util.Objects.equals(this.additionalCredentials, other.additionalCredentials)
                && java.util.Objects.equals(this.additionalAliases, other.additionalAliases)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.externalId == null ? 43 : this.externalId.hashCode());
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTimeZone == null ? 43 : this.resourceTimeZone.hashCode());
        result = (result * PRIME) + (this.license == null ? 43 : this.license.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseConnectionDetails == null
                                ? 43
                                : this.databaseConnectionDetails.hashCode());
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result = (result * PRIME) + (this.aliases == null ? 43 : this.aliases.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalCredentials == null
                                ? 43
                                : this.additionalCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalAliases == null ? 43 : this.additionalAliases.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
