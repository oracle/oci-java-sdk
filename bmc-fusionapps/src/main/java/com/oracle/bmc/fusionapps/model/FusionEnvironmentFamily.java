/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Details of a Fusion environment family. An environment family is a logical grouping of
 * environments. The environment family defines a set of characteristics that are shared across the
 * environments to allow consistent management and maintenance across your production, test, and
 * development environments. For more information, see [Planning an Environment
 * Family](https://docs.cloud.oracle.com/iaas/Content/fusion-applications/plan-environment-family.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FusionEnvironmentFamily.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FusionEnvironmentFamily
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "familyMaintenancePolicy",
        "compartmentId",
        "subscriptionIds",
        "isSubscriptionUpdateNeeded",
        "timeCreated",
        "lifecycleState",
        "lifecycleDetails",
        "systemName",
        "freeformTags",
        "definedTags",
        "timeLastSubscriptionUpdate"
    })
    public FusionEnvironmentFamily(
            String id,
            String displayName,
            FamilyMaintenancePolicy familyMaintenancePolicy,
            String compartmentId,
            java.util.List<String> subscriptionIds,
            Boolean isSubscriptionUpdateNeeded,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String systemName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Date timeLastSubscriptionUpdate) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.familyMaintenancePolicy = familyMaintenancePolicy;
        this.compartmentId = compartmentId;
        this.subscriptionIds = subscriptionIds;
        this.isSubscriptionUpdateNeeded = isSubscriptionUpdateNeeded;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.systemName = systemName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.timeLastSubscriptionUpdate = timeLastSubscriptionUpdate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier (OCID) of the environment family. Can't be changed after creation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier (OCID) of the environment family. Can't be changed after creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A friendly name for the environment family. The name must contain only letters, numbers,
         * dashes, and underscores. Can be changed later.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A friendly name for the environment family. The name must contain only letters, numbers,
         * dashes, and underscores. Can be changed later.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("familyMaintenancePolicy")
        private FamilyMaintenancePolicy familyMaintenancePolicy;

        public Builder familyMaintenancePolicy(FamilyMaintenancePolicy familyMaintenancePolicy) {
            this.familyMaintenancePolicy = familyMaintenancePolicy;
            this.__explicitlySet__.add("familyMaintenancePolicy");
            return this;
        }
        /** The OCID of the compartment where the environment family is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the environment family is located.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The list of the IDs of the applications subscriptions that are associated with the
         * environment family.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionIds")
        private java.util.List<String> subscriptionIds;

        /**
         * The list of the IDs of the applications subscriptions that are associated with the
         * environment family.
         *
         * @param subscriptionIds the value to set
         * @return this builder
         */
        public Builder subscriptionIds(java.util.List<String> subscriptionIds) {
            this.subscriptionIds = subscriptionIds;
            this.__explicitlySet__.add("subscriptionIds");
            return this;
        }
        /** When set to True, a subscription update is required for the environment family. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSubscriptionUpdateNeeded")
        private Boolean isSubscriptionUpdateNeeded;

        /**
         * When set to True, a subscription update is required for the environment family.
         *
         * @param isSubscriptionUpdateNeeded the value to set
         * @return this builder
         */
        public Builder isSubscriptionUpdateNeeded(Boolean isSubscriptionUpdateNeeded) {
            this.isSubscriptionUpdateNeeded = isSubscriptionUpdateNeeded;
            this.__explicitlySet__.add("isSubscriptionUpdateNeeded");
            return this;
        }
        /**
         * The time the the FusionEnvironmentFamily was created. An RFC3339 formatted datetime
         * string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the FusionEnvironmentFamily was created. An RFC3339 formatted datetime
         * string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The current state of the FusionEnvironmentFamily. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the FusionEnvironmentFamily.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** Environment Specific Guid/ System Name */
        @com.fasterxml.jackson.annotation.JsonProperty("systemName")
        private String systemName;

        /**
         * Environment Specific Guid/ System Name
         *
         * @param systemName the value to set
         * @return this builder
         */
        public Builder systemName(String systemName) {
            this.systemName = systemName;
            this.__explicitlySet__.add("systemName");
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
        /** Indicates when the family received the last subscription update */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSubscriptionUpdate")
        private java.util.Date timeLastSubscriptionUpdate;

        /**
         * Indicates when the family received the last subscription update
         *
         * @param timeLastSubscriptionUpdate the value to set
         * @return this builder
         */
        public Builder timeLastSubscriptionUpdate(java.util.Date timeLastSubscriptionUpdate) {
            this.timeLastSubscriptionUpdate = timeLastSubscriptionUpdate;
            this.__explicitlySet__.add("timeLastSubscriptionUpdate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FusionEnvironmentFamily build() {
            FusionEnvironmentFamily model =
                    new FusionEnvironmentFamily(
                            this.id,
                            this.displayName,
                            this.familyMaintenancePolicy,
                            this.compartmentId,
                            this.subscriptionIds,
                            this.isSubscriptionUpdateNeeded,
                            this.timeCreated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.systemName,
                            this.freeformTags,
                            this.definedTags,
                            this.timeLastSubscriptionUpdate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FusionEnvironmentFamily model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("familyMaintenancePolicy")) {
                this.familyMaintenancePolicy(model.getFamilyMaintenancePolicy());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionIds")) {
                this.subscriptionIds(model.getSubscriptionIds());
            }
            if (model.wasPropertyExplicitlySet("isSubscriptionUpdateNeeded")) {
                this.isSubscriptionUpdateNeeded(model.getIsSubscriptionUpdateNeeded());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("systemName")) {
                this.systemName(model.getSystemName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("timeLastSubscriptionUpdate")) {
                this.timeLastSubscriptionUpdate(model.getTimeLastSubscriptionUpdate());
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

    /** The unique identifier (OCID) of the environment family. Can't be changed after creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier (OCID) of the environment family. Can't be changed after creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * A friendly name for the environment family. The name must contain only letters, numbers,
     * dashes, and underscores. Can be changed later.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A friendly name for the environment family. The name must contain only letters, numbers,
     * dashes, and underscores. Can be changed later.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("familyMaintenancePolicy")
    private final FamilyMaintenancePolicy familyMaintenancePolicy;

    public FamilyMaintenancePolicy getFamilyMaintenancePolicy() {
        return familyMaintenancePolicy;
    }

    /** The OCID of the compartment where the environment family is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the environment family is located.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The list of the IDs of the applications subscriptions that are associated with the
     * environment family.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionIds")
    private final java.util.List<String> subscriptionIds;

    /**
     * The list of the IDs of the applications subscriptions that are associated with the
     * environment family.
     *
     * @return the value
     */
    public java.util.List<String> getSubscriptionIds() {
        return subscriptionIds;
    }

    /** When set to True, a subscription update is required for the environment family. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSubscriptionUpdateNeeded")
    private final Boolean isSubscriptionUpdateNeeded;

    /**
     * When set to True, a subscription update is required for the environment family.
     *
     * @return the value
     */
    public Boolean getIsSubscriptionUpdateNeeded() {
        return isSubscriptionUpdateNeeded;
    }

    /**
     * The time the the FusionEnvironmentFamily was created. An RFC3339 formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the FusionEnvironmentFamily was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The current state of the FusionEnvironmentFamily. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The current state of the FusionEnvironmentFamily. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the FusionEnvironmentFamily.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** Environment Specific Guid/ System Name */
    @com.fasterxml.jackson.annotation.JsonProperty("systemName")
    private final String systemName;

    /**
     * Environment Specific Guid/ System Name
     *
     * @return the value
     */
    public String getSystemName() {
        return systemName;
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

    /** Indicates when the family received the last subscription update */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSubscriptionUpdate")
    private final java.util.Date timeLastSubscriptionUpdate;

    /**
     * Indicates when the family received the last subscription update
     *
     * @return the value
     */
    public java.util.Date getTimeLastSubscriptionUpdate() {
        return timeLastSubscriptionUpdate;
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
        sb.append("FusionEnvironmentFamily(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", familyMaintenancePolicy=")
                .append(String.valueOf(this.familyMaintenancePolicy));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", subscriptionIds=").append(String.valueOf(this.subscriptionIds));
        sb.append(", isSubscriptionUpdateNeeded=")
                .append(String.valueOf(this.isSubscriptionUpdateNeeded));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", systemName=").append(String.valueOf(this.systemName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", timeLastSubscriptionUpdate=")
                .append(String.valueOf(this.timeLastSubscriptionUpdate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FusionEnvironmentFamily)) {
            return false;
        }

        FusionEnvironmentFamily other = (FusionEnvironmentFamily) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.familyMaintenancePolicy, other.familyMaintenancePolicy)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.subscriptionIds, other.subscriptionIds)
                && java.util.Objects.equals(
                        this.isSubscriptionUpdateNeeded, other.isSubscriptionUpdateNeeded)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.systemName, other.systemName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(
                        this.timeLastSubscriptionUpdate, other.timeLastSubscriptionUpdate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.familyMaintenancePolicy == null
                                ? 43
                                : this.familyMaintenancePolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionIds == null ? 43 : this.subscriptionIds.hashCode());
        result =
                (result * PRIME)
                        + (this.isSubscriptionUpdateNeeded == null
                                ? 43
                                : this.isSubscriptionUpdateNeeded.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.systemName == null ? 43 : this.systemName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastSubscriptionUpdate == null
                                ? 43
                                : this.timeLastSubscriptionUpdate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
