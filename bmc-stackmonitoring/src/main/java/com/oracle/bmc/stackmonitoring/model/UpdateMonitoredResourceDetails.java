/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
public final class UpdateMonitoredResourceDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "hostName",
        "resourceTimeZone",
        "properties",
        "databaseConnectionDetails",
        "credentials",
        "aliases"
    })
    public UpdateMonitoredResourceDetails(
            String displayName,
            String hostName,
            String resourceTimeZone,
            java.util.List<MonitoredResourceProperty> properties,
            ConnectionDetails databaseConnectionDetails,
            MonitoredResourceCredential credentials,
            MonitoredResourceAliasCredential aliases) {
        super();
        this.displayName = displayName;
        this.hostName = hostName;
        this.resourceTimeZone = resourceTimeZone;
        this.properties = properties;
        this.databaseConnectionDetails = databaseConnectionDetails;
        this.credentials = credentials;
        this.aliases = aliases;
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
         * Host name of the monitored resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * Host name of the monitored resource
         * @param hostName the value to set
         * @return this builder
         **/
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /**
         * Time zone in the form of tz database canonical zone ID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTimeZone")
        private String resourceTimeZone;

        /**
         * Time zone in the form of tz database canonical zone ID.
         * @param resourceTimeZone the value to set
         * @return this builder
         **/
        public Builder resourceTimeZone(String resourceTimeZone) {
            this.resourceTimeZone = resourceTimeZone;
            this.__explicitlySet__.add("resourceTimeZone");
            return this;
        }
        /**
         * List of monitored resource properties
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<MonitoredResourceProperty> properties;

        /**
         * List of monitored resource properties
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMonitoredResourceDetails build() {
            UpdateMonitoredResourceDetails __instance__ =
                    new UpdateMonitoredResourceDetails(
                            displayName,
                            hostName,
                            resourceTimeZone,
                            properties,
                            databaseConnectionDetails,
                            credentials,
                            aliases);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMonitoredResourceDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .hostName(o.getHostName())
                            .resourceTimeZone(o.getResourceTimeZone())
                            .properties(o.getProperties())
                            .databaseConnectionDetails(o.getDatabaseConnectionDetails())
                            .credentials(o.getCredentials())
                            .aliases(o.getAliases());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Host name of the monitored resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * Host name of the monitored resource
     * @return the value
     **/
    public String getHostName() {
        return hostName;
    }

    /**
     * Time zone in the form of tz database canonical zone ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTimeZone")
    private final String resourceTimeZone;

    /**
     * Time zone in the form of tz database canonical zone ID.
     * @return the value
     **/
    public String getResourceTimeZone() {
        return resourceTimeZone;
    }

    /**
     * List of monitored resource properties
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<MonitoredResourceProperty> properties;

    /**
     * List of monitored resource properties
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

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateMonitoredResourceDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", resourceTimeZone=").append(String.valueOf(this.resourceTimeZone));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", databaseConnectionDetails=")
                .append(String.valueOf(this.databaseConnectionDetails));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(", aliases=").append(String.valueOf(this.aliases));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
