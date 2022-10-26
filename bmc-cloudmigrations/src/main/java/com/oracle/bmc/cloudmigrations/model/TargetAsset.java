/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Description of the target asset. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = TargetAsset.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VmTargetAsset.class,
            name = "INSTANCE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class TargetAsset extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "lifecycleState",
        "lifecycleDetails",
        "migrationPlanId",
        "compartmentId",
        "createdResourceId",
        "isExcludedFromExecution",
        "compatibilityMessages",
        "estimatedCost",
        "timeCreated",
        "timeUpdated",
        "timeAssessed",
        "migrationAsset"
    })
    protected TargetAsset(
            String id,
            String displayName,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String migrationPlanId,
            String compartmentId,
            String createdResourceId,
            Boolean isExcludedFromExecution,
            java.util.List<CompatibilityMessage> compatibilityMessages,
            CostEstimation estimatedCost,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeAssessed,
            MigrationAsset migrationAsset) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.migrationPlanId = migrationPlanId;
        this.compartmentId = compartmentId;
        this.createdResourceId = createdResourceId;
        this.isExcludedFromExecution = isExcludedFromExecution;
        this.compatibilityMessages = compatibilityMessages;
        this.estimatedCost = estimatedCost;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeAssessed = timeAssessed;
        this.migrationAsset = migrationAsset;
    }

    /** Unique identifier that is immutable on creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The current state of the target asset. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        NeedsAttention("NEEDS_ATTENTION"),
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
    /** The current state of the target asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the target asset.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, it can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, it can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** OCID of the associated migration plan. */
    @com.fasterxml.jackson.annotation.JsonProperty("migrationPlanId")
    private final String migrationPlanId;

    /**
     * OCID of the associated migration plan.
     *
     * @return the value
     */
    public String getMigrationPlanId() {
        return migrationPlanId;
    }

    /** Compartment identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Created resource identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("createdResourceId")
    private final String createdResourceId;

    /**
     * Created resource identifier
     *
     * @return the value
     */
    public String getCreatedResourceId() {
        return createdResourceId;
    }

    /** A boolean indicating whether the asset should be migrated. */
    @com.fasterxml.jackson.annotation.JsonProperty("isExcludedFromExecution")
    private final Boolean isExcludedFromExecution;

    /**
     * A boolean indicating whether the asset should be migrated.
     *
     * @return the value
     */
    public Boolean getIsExcludedFromExecution() {
        return isExcludedFromExecution;
    }

    /** Messages about the compatibility issues. */
    @com.fasterxml.jackson.annotation.JsonProperty("compatibilityMessages")
    private final java.util.List<CompatibilityMessage> compatibilityMessages;

    /**
     * Messages about the compatibility issues.
     *
     * @return the value
     */
    public java.util.List<CompatibilityMessage> getCompatibilityMessages() {
        return compatibilityMessages;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("estimatedCost")
    private final CostEstimation estimatedCost;

    public CostEstimation getEstimatedCost() {
        return estimatedCost;
    }

    /** The time when the target asset was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when the target asset was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time when the target asset was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when the target asset was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The time when the assessment was done. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAssessed")
    private final java.util.Date timeAssessed;

    /**
     * The time when the assessment was done. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeAssessed() {
        return timeAssessed;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("migrationAsset")
    private final MigrationAsset migrationAsset;

    public MigrationAsset getMigrationAsset() {
        return migrationAsset;
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
        sb.append("TargetAsset(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", migrationPlanId=").append(String.valueOf(this.migrationPlanId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", createdResourceId=").append(String.valueOf(this.createdResourceId));
        sb.append(", isExcludedFromExecution=")
                .append(String.valueOf(this.isExcludedFromExecution));
        sb.append(", compatibilityMessages=").append(String.valueOf(this.compatibilityMessages));
        sb.append(", estimatedCost=").append(String.valueOf(this.estimatedCost));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeAssessed=").append(String.valueOf(this.timeAssessed));
        sb.append(", migrationAsset=").append(String.valueOf(this.migrationAsset));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetAsset)) {
            return false;
        }

        TargetAsset other = (TargetAsset) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.migrationPlanId, other.migrationPlanId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.createdResourceId, other.createdResourceId)
                && java.util.Objects.equals(
                        this.isExcludedFromExecution, other.isExcludedFromExecution)
                && java.util.Objects.equals(this.compatibilityMessages, other.compatibilityMessages)
                && java.util.Objects.equals(this.estimatedCost, other.estimatedCost)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeAssessed, other.timeAssessed)
                && java.util.Objects.equals(this.migrationAsset, other.migrationAsset)
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
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.migrationPlanId == null ? 43 : this.migrationPlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.createdResourceId == null ? 43 : this.createdResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.isExcludedFromExecution == null
                                ? 43
                                : this.isExcludedFromExecution.hashCode());
        result =
                (result * PRIME)
                        + (this.compatibilityMessages == null
                                ? 43
                                : this.compatibilityMessages.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedCost == null ? 43 : this.estimatedCost.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeAssessed == null ? 43 : this.timeAssessed.hashCode());
        result =
                (result * PRIME)
                        + (this.migrationAsset == null ? 43 : this.migrationAsset.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of target asset. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Instance("INSTANCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
