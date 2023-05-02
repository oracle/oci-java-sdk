/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The information about updating a monitored resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateMonitoredResourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateMonitoredResourceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "hostName",
        "resourceTimeZone",
        "properties",
        "databaseConnectionDetails",
        "credentials",
        "aliases",
        "additionalCredentials",
        "additionalAliases",
        "freeformTags",
        "definedTags"
    })
    public UpdateMonitoredResourceDetails(
            String displayName,
            String hostName,
            String resourceTimeZone,
            java.util.List<MonitoredResourceProperty> properties,
            ConnectionDetails databaseConnectionDetails,
            MonitoredResourceCredential credentials,
            MonitoredResourceAliasCredential aliases,
            java.util.List<MonitoredResourceCredential> additionalCredentials,
            java.util.List<MonitoredResourceAliasCredential> additionalAliases,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.hostName = hostName;
        this.resourceTimeZone = resourceTimeZone;
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
        /**
         * Monitored resource display name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Monitored resource display name.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Host name of the monitored resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * Host name of the monitored resource.
         *
         * @param hostName the value to set
         * @return this builder
         **/
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /**
         * Time zone in the form of tz database canonical zone ID. Specifies the preference with
         * a value that uses the IANA Time Zone Database format (x-obmcs-time-zone).
         * For example - America/Los_Angeles
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTimeZone")
        private String resourceTimeZone;

        /**
         * Time zone in the form of tz database canonical zone ID. Specifies the preference with
         * a value that uses the IANA Time Zone Database format (x-obmcs-time-zone).
         * For example - America/Los_Angeles
         *
         * @param resourceTimeZone the value to set
         * @return this builder
         **/
        public Builder resourceTimeZone(String resourceTimeZone) {
            this.resourceTimeZone = resourceTimeZone;
            this.__explicitlySet__.add("resourceTimeZone");
            return this;
        }
        /**
         * List of monitored resource properties.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<MonitoredResourceProperty> properties;

        /**
         * List of monitored resource properties.
         *
         * @param properties the value to set
         * @return this builder
         **/
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
         * "credentials" property by allowing user to specify more than one credential.
         * If both "credential" and "additionalCredentials" are specified, union of the
         * values is used as list of credentials applicable for this resource.
         * If any duplicate found in the combined list of "credentials" and "additionalCredentials",
         * an error will be thrown.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalCredentials")
        private java.util.List<MonitoredResourceCredential> additionalCredentials;

        /**
         * List of MonitoredResourceCredentials. This property complements the existing
         * "credentials" property by allowing user to specify more than one credential.
         * If both "credential" and "additionalCredentials" are specified, union of the
         * values is used as list of credentials applicable for this resource.
         * If any duplicate found in the combined list of "credentials" and "additionalCredentials",
         * an error will be thrown.
         *
         * @param additionalCredentials the value to set
         * @return this builder
         **/
        public Builder additionalCredentials(
                java.util.List<MonitoredResourceCredential> additionalCredentials) {
            this.additionalCredentials = additionalCredentials;
            this.__explicitlySet__.add("additionalCredentials");
            return this;
        }
        /**
         * List of MonitoredResourceAliasCredentials. This property complements the existing
         * "aliases" property by allowing user to specify more than one credential alias.
         * If both "aliases" and "additionalAliases" are specified, union of the
         * values is used as list of aliases applicable for this resource.
         * If any duplicate found in the combined list of "alias" and "additionalAliases",
         * an error will be thrown.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalAliases")
        private java.util.List<MonitoredResourceAliasCredential> additionalAliases;

        /**
         * List of MonitoredResourceAliasCredentials. This property complements the existing
         * "aliases" property by allowing user to specify more than one credential alias.
         * If both "aliases" and "additionalAliases" are specified, union of the
         * values is used as list of aliases applicable for this resource.
         * If any duplicate found in the combined list of "alias" and "additionalAliases",
         * an error will be thrown.
         *
         * @param additionalAliases the value to set
         * @return this builder
         **/
        public Builder additionalAliases(
                java.util.List<MonitoredResourceAliasCredential> additionalAliases) {
            this.additionalAliases = additionalAliases;
            this.__explicitlySet__.add("additionalAliases");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMonitoredResourceDetails build() {
            UpdateMonitoredResourceDetails model =
                    new UpdateMonitoredResourceDetails(
                            this.displayName,
                            this.hostName,
                            this.resourceTimeZone,
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
        public Builder copy(UpdateMonitoredResourceDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("resourceTimeZone")) {
                this.resourceTimeZone(model.getResourceTimeZone());
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
     * Monitored resource display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Monitored resource display name.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Host name of the monitored resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * Host name of the monitored resource.
     *
     * @return the value
     **/
    public String getHostName() {
        return hostName;
    }

    /**
     * Time zone in the form of tz database canonical zone ID. Specifies the preference with
     * a value that uses the IANA Time Zone Database format (x-obmcs-time-zone).
     * For example - America/Los_Angeles
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTimeZone")
    private final String resourceTimeZone;

    /**
     * Time zone in the form of tz database canonical zone ID. Specifies the preference with
     * a value that uses the IANA Time Zone Database format (x-obmcs-time-zone).
     * For example - America/Los_Angeles
     *
     * @return the value
     **/
    public String getResourceTimeZone() {
        return resourceTimeZone;
    }

    /**
     * List of monitored resource properties.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<MonitoredResourceProperty> properties;

    /**
     * List of monitored resource properties.
     *
     * @return the value
     **/
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
     * List of MonitoredResourceCredentials. This property complements the existing
     * "credentials" property by allowing user to specify more than one credential.
     * If both "credential" and "additionalCredentials" are specified, union of the
     * values is used as list of credentials applicable for this resource.
     * If any duplicate found in the combined list of "credentials" and "additionalCredentials",
     * an error will be thrown.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalCredentials")
    private final java.util.List<MonitoredResourceCredential> additionalCredentials;

    /**
     * List of MonitoredResourceCredentials. This property complements the existing
     * "credentials" property by allowing user to specify more than one credential.
     * If both "credential" and "additionalCredentials" are specified, union of the
     * values is used as list of credentials applicable for this resource.
     * If any duplicate found in the combined list of "credentials" and "additionalCredentials",
     * an error will be thrown.
     *
     * @return the value
     **/
    public java.util.List<MonitoredResourceCredential> getAdditionalCredentials() {
        return additionalCredentials;
    }

    /**
     * List of MonitoredResourceAliasCredentials. This property complements the existing
     * "aliases" property by allowing user to specify more than one credential alias.
     * If both "aliases" and "additionalAliases" are specified, union of the
     * values is used as list of aliases applicable for this resource.
     * If any duplicate found in the combined list of "alias" and "additionalAliases",
     * an error will be thrown.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalAliases")
    private final java.util.List<MonitoredResourceAliasCredential> additionalAliases;

    /**
     * List of MonitoredResourceAliasCredentials. This property complements the existing
     * "aliases" property by allowing user to specify more than one credential alias.
     * If both "aliases" and "additionalAliases" are specified, union of the
     * values is used as list of aliases applicable for this resource.
     * If any duplicate found in the combined list of "alias" and "additionalAliases",
     * an error will be thrown.
     *
     * @return the value
     **/
    public java.util.List<MonitoredResourceAliasCredential> getAdditionalAliases() {
        return additionalAliases;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateMonitoredResourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", resourceTimeZone=").append(String.valueOf(this.resourceTimeZone));
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
        if (!(o instanceof UpdateMonitoredResourceDetails)) {
            return false;
        }

        UpdateMonitoredResourceDetails other = (UpdateMonitoredResourceDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.resourceTimeZone, other.resourceTimeZone)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTimeZone == null ? 43 : this.resourceTimeZone.hashCode());
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
