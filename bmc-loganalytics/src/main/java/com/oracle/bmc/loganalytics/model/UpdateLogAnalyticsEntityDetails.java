/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Details of log analytics entity to be updated.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateLogAnalyticsEntityDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateLogAnalyticsEntityDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "managementAgentId",
        "timezoneRegion",
        "hostname",
        "properties",
        "freeformTags",
        "definedTags",
        "timeLastDiscovered",
        "metadata"
    })
    public UpdateLogAnalyticsEntityDetails(
            String name,
            String managementAgentId,
            String timezoneRegion,
            String hostname,
            java.util.Map<String, String> properties,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Date timeLastDiscovered,
            LogAnalyticsMetadataDetails metadata) {
        super();
        this.name = name;
        this.managementAgentId = managementAgentId;
        this.timezoneRegion = timezoneRegion;
        this.hostname = hostname;
        this.properties = properties;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.timeLastDiscovered = timeLastDiscovered;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Log analytics entity name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Log analytics entity name.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The OCID of the Management Agent.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        /**
         * The OCID of the Management Agent.
         *
         * @param managementAgentId the value to set
         * @return this builder
         **/
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }
        /**
         * The timezone region of the log analytics entity.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timezoneRegion")
        private String timezoneRegion;

        /**
         * The timezone region of the log analytics entity.
         *
         * @param timezoneRegion the value to set
         * @return this builder
         **/
        public Builder timezoneRegion(String timezoneRegion) {
            this.timezoneRegion = timezoneRegion;
            this.__explicitlySet__.add("timezoneRegion");
            return this;
        }
        /**
         * The hostname where the entity represented here is actually present. This would be the output one would get if
         * they run {@code echo $HOSTNAME} on Linux or an equivalent OS command. This may be different from
         * management agents host since logs may be collected remotely.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The hostname where the entity represented here is actually present. This would be the output one would get if
         * they run {@code echo $HOSTNAME} on Linux or an equivalent OS command. This may be different from
         * management agents host since logs may be collected remotely.
         *
         * @param hostname the value to set
         * @return this builder
         **/
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * The name/value pairs for parameter values to be used in file patterns specified in log sources.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, String> properties;

        /**
         * The name/value pairs for parameter values to be used in file patterns specified in log sources.
         *
         * @param properties the value to set
         * @return this builder
         **/
        public Builder properties(java.util.Map<String, String> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
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
        /**
         * The date and time the resource was last discovered, in the format defined by RFC3339.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastDiscovered")
        private java.util.Date timeLastDiscovered;

        /**
         * The date and time the resource was last discovered, in the format defined by RFC3339.
         *
         * @param timeLastDiscovered the value to set
         * @return this builder
         **/
        public Builder timeLastDiscovered(java.util.Date timeLastDiscovered) {
            this.timeLastDiscovered = timeLastDiscovered;
            this.__explicitlySet__.add("timeLastDiscovered");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private LogAnalyticsMetadataDetails metadata;

        public Builder metadata(LogAnalyticsMetadataDetails metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateLogAnalyticsEntityDetails build() {
            UpdateLogAnalyticsEntityDetails model =
                    new UpdateLogAnalyticsEntityDetails(
                            this.name,
                            this.managementAgentId,
                            this.timezoneRegion,
                            this.hostname,
                            this.properties,
                            this.freeformTags,
                            this.definedTags,
                            this.timeLastDiscovered,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateLogAnalyticsEntityDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("managementAgentId")) {
                this.managementAgentId(model.getManagementAgentId());
            }
            if (model.wasPropertyExplicitlySet("timezoneRegion")) {
                this.timezoneRegion(model.getTimezoneRegion());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("timeLastDiscovered")) {
                this.timeLastDiscovered(model.getTimeLastDiscovered());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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
     * Log analytics entity name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Log analytics entity name.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The OCID of the Management Agent.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    /**
     * The OCID of the Management Agent.
     *
     * @return the value
     **/
    public String getManagementAgentId() {
        return managementAgentId;
    }

    /**
     * The timezone region of the log analytics entity.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timezoneRegion")
    private final String timezoneRegion;

    /**
     * The timezone region of the log analytics entity.
     *
     * @return the value
     **/
    public String getTimezoneRegion() {
        return timezoneRegion;
    }

    /**
     * The hostname where the entity represented here is actually present. This would be the output one would get if
     * they run {@code echo $HOSTNAME} on Linux or an equivalent OS command. This may be different from
     * management agents host since logs may be collected remotely.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The hostname where the entity represented here is actually present. This would be the output one would get if
     * they run {@code echo $HOSTNAME} on Linux or an equivalent OS command. This may be different from
     * management agents host since logs may be collected remotely.
     *
     * @return the value
     **/
    public String getHostname() {
        return hostname;
    }

    /**
     * The name/value pairs for parameter values to be used in file patterns specified in log sources.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, String> properties;

    /**
     * The name/value pairs for parameter values to be used in file patterns specified in log sources.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getProperties() {
        return properties;
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

    /**
     * The date and time the resource was last discovered, in the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastDiscovered")
    private final java.util.Date timeLastDiscovered;

    /**
     * The date and time the resource was last discovered, in the format defined by RFC3339.
     *
     * @return the value
     **/
    public java.util.Date getTimeLastDiscovered() {
        return timeLastDiscovered;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final LogAnalyticsMetadataDetails metadata;

    public LogAnalyticsMetadataDetails getMetadata() {
        return metadata;
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
        sb.append("UpdateLogAnalyticsEntityDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", timezoneRegion=").append(String.valueOf(this.timezoneRegion));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", timeLastDiscovered=").append(String.valueOf(this.timeLastDiscovered));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateLogAnalyticsEntityDetails)) {
            return false;
        }

        UpdateLogAnalyticsEntityDetails other = (UpdateLogAnalyticsEntityDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.timezoneRegion, other.timezoneRegion)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.timeLastDiscovered, other.timeLastDiscovered)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result =
                (result * PRIME)
                        + (this.timezoneRegion == null ? 43 : this.timezoneRegion.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastDiscovered == null
                                ? 43
                                : this.timeLastDiscovered.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
