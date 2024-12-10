/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Fleet Application Management onboarding resource.
 * The onboarding process lets\u00A0Fleet Application Management\u00A0create a few required policies that you need to start using it and its features.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Onboarding.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Onboarding extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "resourceRegion",
        "timeCreated",
        "timeUpdated",
        "isFamsTagEnabled",
        "version",
        "isCostTrackingTagEnabled",
        "appliedPolicies",
        "discoveryFrequency",
        "lifecycleState",
        "systemTags"
    })
    public Onboarding(
            String id,
            String compartmentId,
            String resourceRegion,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Boolean isFamsTagEnabled,
            String version,
            Boolean isCostTrackingTagEnabled,
            OnboardingPolicySummary appliedPolicies,
            String discoveryFrequency,
            LifecycleState lifecycleState,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.resourceRegion = resourceRegion;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.isFamsTagEnabled = isFamsTagEnabled;
        this.version = version;
        this.isCostTrackingTagEnabled = isCostTrackingTagEnabled;
        this.appliedPolicies = appliedPolicies;
        this.discoveryFrequency = discoveryFrequency;
        this.lifecycleState = lifecycleState;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique id of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique id of the resource.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Tenancy OCID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Tenancy OCID
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Associated region
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceRegion")
        private String resourceRegion;

        /**
         * Associated region
         * @param resourceRegion the value to set
         * @return this builder
         **/
        public Builder resourceRegion(String resourceRegion) {
            this.resourceRegion = resourceRegion;
            this.__explicitlySet__.add("resourceRegion");
            return this;
        }
        /**
         * The time this resource was created. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time this resource was created. An RFC3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time this resource was last updated. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time this resource was last updated. An RFC3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * A value determining if the Fleet Application Management tagging is enabled or not.
         * Allow Fleet Application Management to tag resources with fleet name using "Oracle$FAMS-Tags.FleetName" tag.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFamsTagEnabled")
        private Boolean isFamsTagEnabled;

        /**
         * A value determining if the Fleet Application Management tagging is enabled or not.
         * Allow Fleet Application Management to tag resources with fleet name using "Oracle$FAMS-Tags.FleetName" tag.
         *
         * @param isFamsTagEnabled the value to set
         * @return this builder
         **/
        public Builder isFamsTagEnabled(Boolean isFamsTagEnabled) {
            this.isFamsTagEnabled = isFamsTagEnabled;
            this.__explicitlySet__.add("isFamsTagEnabled");
            return this;
        }
        /**
         * The version of Fleet Application Management that the tenant is onboarded to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of Fleet Application Management that the tenant is onboarded to.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * A value determining if the cost tracking tag is enabled or not.
         * Allow Fleet Application Management to tag resources with cost tracking tag using "Oracle$FAMS-Tags.FAMSManaged" tag.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCostTrackingTagEnabled")
        private Boolean isCostTrackingTagEnabled;

        /**
         * A value determining if the cost tracking tag is enabled or not.
         * Allow Fleet Application Management to tag resources with cost tracking tag using "Oracle$FAMS-Tags.FAMSManaged" tag.
         *
         * @param isCostTrackingTagEnabled the value to set
         * @return this builder
         **/
        public Builder isCostTrackingTagEnabled(Boolean isCostTrackingTagEnabled) {
            this.isCostTrackingTagEnabled = isCostTrackingTagEnabled;
            this.__explicitlySet__.add("isCostTrackingTagEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("appliedPolicies")
        private OnboardingPolicySummary appliedPolicies;

        public Builder appliedPolicies(OnboardingPolicySummary appliedPolicies) {
            this.appliedPolicies = appliedPolicies;
            this.__explicitlySet__.add("appliedPolicies");
            return this;
        }
        /**
         * Provide discovery frequency.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("discoveryFrequency")
        private String discoveryFrequency;

        /**
         * Provide discovery frequency.
         * @param discoveryFrequency the value to set
         * @return this builder
         **/
        public Builder discoveryFrequency(String discoveryFrequency) {
            this.discoveryFrequency = discoveryFrequency;
            this.__explicitlySet__.add("discoveryFrequency");
            return this;
        }
        /**
         * The current state of the Onboarding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Onboarding.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        public Onboarding build() {
            Onboarding model =
                    new Onboarding(
                            this.id,
                            this.compartmentId,
                            this.resourceRegion,
                            this.timeCreated,
                            this.timeUpdated,
                            this.isFamsTagEnabled,
                            this.version,
                            this.isCostTrackingTagEnabled,
                            this.appliedPolicies,
                            this.discoveryFrequency,
                            this.lifecycleState,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Onboarding model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceRegion")) {
                this.resourceRegion(model.getResourceRegion());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("isFamsTagEnabled")) {
                this.isFamsTagEnabled(model.getIsFamsTagEnabled());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("isCostTrackingTagEnabled")) {
                this.isCostTrackingTagEnabled(model.getIsCostTrackingTagEnabled());
            }
            if (model.wasPropertyExplicitlySet("appliedPolicies")) {
                this.appliedPolicies(model.getAppliedPolicies());
            }
            if (model.wasPropertyExplicitlySet("discoveryFrequency")) {
                this.discoveryFrequency(model.getDiscoveryFrequency());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
     * The unique id of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique id of the resource.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Tenancy OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Tenancy OCID
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Associated region
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceRegion")
    private final String resourceRegion;

    /**
     * Associated region
     * @return the value
     **/
    public String getResourceRegion() {
        return resourceRegion;
    }

    /**
     * The time this resource was created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time this resource was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time this resource was last updated. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time this resource was last updated. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * A value determining if the Fleet Application Management tagging is enabled or not.
     * Allow Fleet Application Management to tag resources with fleet name using "Oracle$FAMS-Tags.FleetName" tag.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFamsTagEnabled")
    private final Boolean isFamsTagEnabled;

    /**
     * A value determining if the Fleet Application Management tagging is enabled or not.
     * Allow Fleet Application Management to tag resources with fleet name using "Oracle$FAMS-Tags.FleetName" tag.
     *
     * @return the value
     **/
    public Boolean getIsFamsTagEnabled() {
        return isFamsTagEnabled;
    }

    /**
     * The version of Fleet Application Management that the tenant is onboarded to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of Fleet Application Management that the tenant is onboarded to.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * A value determining if the cost tracking tag is enabled or not.
     * Allow Fleet Application Management to tag resources with cost tracking tag using "Oracle$FAMS-Tags.FAMSManaged" tag.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCostTrackingTagEnabled")
    private final Boolean isCostTrackingTagEnabled;

    /**
     * A value determining if the cost tracking tag is enabled or not.
     * Allow Fleet Application Management to tag resources with cost tracking tag using "Oracle$FAMS-Tags.FAMSManaged" tag.
     *
     * @return the value
     **/
    public Boolean getIsCostTrackingTagEnabled() {
        return isCostTrackingTagEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("appliedPolicies")
    private final OnboardingPolicySummary appliedPolicies;

    public OnboardingPolicySummary getAppliedPolicies() {
        return appliedPolicies;
    }

    /**
     * Provide discovery frequency.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryFrequency")
    private final String discoveryFrequency;

    /**
     * Provide discovery frequency.
     * @return the value
     **/
    public String getDiscoveryFrequency() {
        return discoveryFrequency;
    }

    /**
     * The current state of the Onboarding.
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Creating("CREATING"),
        Deleted("DELETED"),
        Deleting("DELETING"),
        Failed("FAILED"),
        Updating("UPDATING"),
        NeedsAttention("NEEDS_ATTENTION"),

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
     * The current state of the Onboarding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Onboarding.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("Onboarding(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceRegion=").append(String.valueOf(this.resourceRegion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", isFamsTagEnabled=").append(String.valueOf(this.isFamsTagEnabled));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", isCostTrackingTagEnabled=")
                .append(String.valueOf(this.isCostTrackingTagEnabled));
        sb.append(", appliedPolicies=").append(String.valueOf(this.appliedPolicies));
        sb.append(", discoveryFrequency=").append(String.valueOf(this.discoveryFrequency));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Onboarding)) {
            return false;
        }

        Onboarding other = (Onboarding) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceRegion, other.resourceRegion)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.isFamsTagEnabled, other.isFamsTagEnabled)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(
                        this.isCostTrackingTagEnabled, other.isCostTrackingTagEnabled)
                && java.util.Objects.equals(this.appliedPolicies, other.appliedPolicies)
                && java.util.Objects.equals(this.discoveryFrequency, other.discoveryFrequency)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceRegion == null ? 43 : this.resourceRegion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.isFamsTagEnabled == null ? 43 : this.isFamsTagEnabled.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.isCostTrackingTagEnabled == null
                                ? 43
                                : this.isCostTrackingTagEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.appliedPolicies == null ? 43 : this.appliedPolicies.hashCode());
        result =
                (result * PRIME)
                        + (this.discoveryFrequency == null
                                ? 43
                                : this.discoveryFrequency.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
