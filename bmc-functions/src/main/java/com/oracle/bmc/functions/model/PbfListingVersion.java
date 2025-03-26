/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * This represents a version of a PbfListing. Each new update from the publisher or the change in the image will
 * result in the creation of new PbfListingVersion resource creation. This is a sub-resource of a PbfListing.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PbfListingVersion.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PbfListingVersion extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "pbfListingId",
        "name",
        "config",
        "requirements",
        "changeSummary",
        "triggers",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public PbfListingVersion(
            String id,
            String pbfListingId,
            String name,
            java.util.List<ConfigDetails> config,
            RequirementDetails requirements,
            String changeSummary,
            java.util.List<Trigger> triggers,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.pbfListingId = pbfListingId;
        this.name = name;
        this.config = config;
        this.requirements = requirements;
        this.changeSummary = changeSummary;
        this.triggers = triggers;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier that is immutable on creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the PbfListing this resource version belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pbfListingId")
        private String pbfListingId;

        /**
         * The OCID of the PbfListing this resource version belongs to.
         * @param pbfListingId the value to set
         * @return this builder
         **/
        public Builder pbfListingId(String pbfListingId) {
            this.pbfListingId = pbfListingId;
            this.__explicitlySet__.add("pbfListingId");
            return this;
        }
        /**
         * Semantic version
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Semantic version
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Details about the required and optional Function configurations needed for proper performance of the PBF.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("config")
        private java.util.List<ConfigDetails> config;

        /**
         * Details about the required and optional Function configurations needed for proper performance of the PBF.
         *
         * @param config the value to set
         * @return this builder
         **/
        public Builder config(java.util.List<ConfigDetails> config) {
            this.config = config;
            this.__explicitlySet__.add("config");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requirements")
        private RequirementDetails requirements;

        public Builder requirements(RequirementDetails requirements) {
            this.requirements = requirements;
            this.__explicitlySet__.add("requirements");
            return this;
        }
        /**
         * Details changes are included in this version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("changeSummary")
        private String changeSummary;

        /**
         * Details changes are included in this version.
         * @param changeSummary the value to set
         * @return this builder
         **/
        public Builder changeSummary(String changeSummary) {
            this.changeSummary = changeSummary;
            this.__explicitlySet__.add("changeSummary");
            return this;
        }
        /**
         * An array of Trigger. A list of triggers that may activate the PBF.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("triggers")
        private java.util.List<Trigger> triggers;

        /**
         * An array of Trigger. A list of triggers that may activate the PBF.
         * @param triggers the value to set
         * @return this builder
         **/
        public Builder triggers(java.util.List<Trigger> triggers) {
            this.triggers = triggers;
            this.__explicitlySet__.add("triggers");
            return this;
        }
        /**
         * The time the PbfListingVersion was created. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the PbfListingVersion was created. An RFC3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The last time the PbfListingVersion was updated. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last time the PbfListingVersion was updated. An RFC3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the PBF resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the PBF resource.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PbfListingVersion build() {
            PbfListingVersion model =
                    new PbfListingVersion(
                            this.id,
                            this.pbfListingId,
                            this.name,
                            this.config,
                            this.requirements,
                            this.changeSummary,
                            this.triggers,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PbfListingVersion model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("pbfListingId")) {
                this.pbfListingId(model.getPbfListingId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("config")) {
                this.config(model.getConfig());
            }
            if (model.wasPropertyExplicitlySet("requirements")) {
                this.requirements(model.getRequirements());
            }
            if (model.wasPropertyExplicitlySet("changeSummary")) {
                this.changeSummary(model.getChangeSummary());
            }
            if (model.wasPropertyExplicitlySet("triggers")) {
                this.triggers(model.getTriggers());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * Unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the PbfListing this resource version belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pbfListingId")
    private final String pbfListingId;

    /**
     * The OCID of the PbfListing this resource version belongs to.
     * @return the value
     **/
    public String getPbfListingId() {
        return pbfListingId;
    }

    /**
     * Semantic version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Semantic version
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Details about the required and optional Function configurations needed for proper performance of the PBF.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final java.util.List<ConfigDetails> config;

    /**
     * Details about the required and optional Function configurations needed for proper performance of the PBF.
     *
     * @return the value
     **/
    public java.util.List<ConfigDetails> getConfig() {
        return config;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("requirements")
    private final RequirementDetails requirements;

    public RequirementDetails getRequirements() {
        return requirements;
    }

    /**
     * Details changes are included in this version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeSummary")
    private final String changeSummary;

    /**
     * Details changes are included in this version.
     * @return the value
     **/
    public String getChangeSummary() {
        return changeSummary;
    }

    /**
     * An array of Trigger. A list of triggers that may activate the PBF.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("triggers")
    private final java.util.List<Trigger> triggers;

    /**
     * An array of Trigger. A list of triggers that may activate the PBF.
     * @return the value
     **/
    public java.util.List<Trigger> getTriggers() {
        return triggers;
    }

    /**
     * The time the PbfListingVersion was created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the PbfListingVersion was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The last time the PbfListingVersion was updated. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last time the PbfListingVersion was updated. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the PBF resource.
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the PBF resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the PBF resource.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("PbfListingVersion(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", pbfListingId=").append(String.valueOf(this.pbfListingId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", config=").append(String.valueOf(this.config));
        sb.append(", requirements=").append(String.valueOf(this.requirements));
        sb.append(", changeSummary=").append(String.valueOf(this.changeSummary));
        sb.append(", triggers=").append(String.valueOf(this.triggers));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PbfListingVersion)) {
            return false;
        }

        PbfListingVersion other = (PbfListingVersion) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.pbfListingId, other.pbfListingId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.config, other.config)
                && java.util.Objects.equals(this.requirements, other.requirements)
                && java.util.Objects.equals(this.changeSummary, other.changeSummary)
                && java.util.Objects.equals(this.triggers, other.triggers)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.pbfListingId == null ? 43 : this.pbfListingId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.config == null ? 43 : this.config.hashCode());
        result = (result * PRIME) + (this.requirements == null ? 43 : this.requirements.hashCode());
        result =
                (result * PRIME)
                        + (this.changeSummary == null ? 43 : this.changeSummary.hashCode());
        result = (result * PRIME) + (this.triggers == null ? 43 : this.triggers.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
