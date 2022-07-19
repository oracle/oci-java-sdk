/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The general details of a Configuration such as its id, displayName, type, and shape association.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConfigurationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConfigurationSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "description",
        "displayName",
        "shapeName",
        "type",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags"
    })
    public ConfigurationSummary(
            String id,
            String compartmentId,
            String description,
            String displayName,
            String shapeName,
            Configuration.Type type,
            Configuration.LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.description = description;
        this.displayName = displayName;
        this.shapeName = shapeName;
        this.type = type;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the Configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the Configuration.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * OCID of the Compartment the Configuration exists in.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the Compartment the Configuration exists in.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * User-provided data about the Configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-provided data about the Configuration.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The display name of the Configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the Configuration.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The name of the associated Shape.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The name of the associated Shape.
         * @param shapeName the value to set
         * @return this builder
         **/
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /**
         * The Configuration type, DEFAULT or CUSTOM
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Configuration.Type type;

        /**
         * The Configuration type, DEFAULT or CUSTOM
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Configuration.Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The current state of the Configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Configuration.LifecycleState lifecycleState;

        /**
         * The current state of the Configuration.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(Configuration.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the Configuration was created, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Configuration was created, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the Configuration was last updated, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the Configuration was last updated, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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

        public ConfigurationSummary build() {
            ConfigurationSummary __instance__ =
                    new ConfigurationSummary(
                            id,
                            compartmentId,
                            description,
                            displayName,
                            shapeName,
                            type,
                            lifecycleState,
                            timeCreated,
                            timeUpdated,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigurationSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .shapeName(o.getShapeName())
                            .type(o.getType())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The OCID of the Configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the Configuration.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * OCID of the Compartment the Configuration exists in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the Compartment the Configuration exists in.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * User-provided data about the Configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-provided data about the Configuration.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The display name of the Configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the Configuration.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The name of the associated Shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The name of the associated Shape.
     * @return the value
     **/
    public String getShapeName() {
        return shapeName;
    }

    /**
     * The Configuration type, DEFAULT or CUSTOM
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Configuration.Type type;

    /**
     * The Configuration type, DEFAULT or CUSTOM
     * @return the value
     **/
    public Configuration.Type getType() {
        return type;
    }

    /**
     * The current state of the Configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Configuration.LifecycleState lifecycleState;

    /**
     * The current state of the Configuration.
     * @return the value
     **/
    public Configuration.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the Configuration was created, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Configuration was created, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the Configuration was last updated, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the Configuration was last updated, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("ConfigurationSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigurationSummary)) {
            return false;
        }

        ConfigurationSummary other = (ConfigurationSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
