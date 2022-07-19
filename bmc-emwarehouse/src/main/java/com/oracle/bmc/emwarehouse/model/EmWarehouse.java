/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.emwarehouse.model;

/**
 * Description of EmWarehouse.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EmWarehouse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EmWarehouse {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationsInsightsWarehouseId",
        "latestEtlRunStatus",
        "latestEtlRunMessage",
        "latestEtlRunTime",
        "id",
        "displayName",
        "compartmentId",
        "emWarehouseType",
        "emBridgeId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public EmWarehouse(
            String operationsInsightsWarehouseId,
            String latestEtlRunStatus,
            String latestEtlRunMessage,
            String latestEtlRunTime,
            String id,
            String displayName,
            String compartmentId,
            String emWarehouseType,
            String emBridgeId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.operationsInsightsWarehouseId = operationsInsightsWarehouseId;
        this.latestEtlRunStatus = latestEtlRunStatus;
        this.latestEtlRunMessage = latestEtlRunMessage;
        this.latestEtlRunTime = latestEtlRunTime;
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.emWarehouseType = emWarehouseType;
        this.emBridgeId = emBridgeId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * operations Insights Warehouse Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsWarehouseId")
        private String operationsInsightsWarehouseId;

        /**
         * operations Insights Warehouse Identifier
         * @param operationsInsightsWarehouseId the value to set
         * @return this builder
         **/
        public Builder operationsInsightsWarehouseId(String operationsInsightsWarehouseId) {
            this.operationsInsightsWarehouseId = operationsInsightsWarehouseId;
            this.__explicitlySet__.add("operationsInsightsWarehouseId");
            return this;
        }
        /**
         * Data Flow Run Status
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("latestEtlRunStatus")
        private String latestEtlRunStatus;

        /**
         * Data Flow Run Status
         * @param latestEtlRunStatus the value to set
         * @return this builder
         **/
        public Builder latestEtlRunStatus(String latestEtlRunStatus) {
            this.latestEtlRunStatus = latestEtlRunStatus;
            this.__explicitlySet__.add("latestEtlRunStatus");
            return this;
        }
        /**
         * Data Flow Run Status Message
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("latestEtlRunMessage")
        private String latestEtlRunMessage;

        /**
         * Data Flow Run Status Message
         * @param latestEtlRunMessage the value to set
         * @return this builder
         **/
        public Builder latestEtlRunMessage(String latestEtlRunMessage) {
            this.latestEtlRunMessage = latestEtlRunMessage;
            this.__explicitlySet__.add("latestEtlRunMessage");
            return this;
        }
        /**
         * Data Flow Run Total Time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("latestEtlRunTime")
        private String latestEtlRunTime;

        /**
         * Data Flow Run Total Time
         * @param latestEtlRunTime the value to set
         * @return this builder
         **/
        public Builder latestEtlRunTime(String latestEtlRunTime) {
            this.latestEtlRunTime = latestEtlRunTime;
            this.__explicitlySet__.add("latestEtlRunTime");
            return this;
        }
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
         * EmWarehouse Identifier, can be renamed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * EmWarehouse Identifier, can be renamed
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Compartment Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Type of the EmWarehouse.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emWarehouseType")
        private String emWarehouseType;

        /**
         * Type of the EmWarehouse.
         * @param emWarehouseType the value to set
         * @return this builder
         **/
        public Builder emWarehouseType(String emWarehouseType) {
            this.emWarehouseType = emWarehouseType;
            this.__explicitlySet__.add("emWarehouseType");
            return this;
        }
        /**
         * EMBridge Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emBridgeId")
        private String emBridgeId;

        /**
         * EMBridge Identifier
         * @param emBridgeId the value to set
         * @return this builder
         **/
        public Builder emBridgeId(String emBridgeId) {
            this.emBridgeId = emBridgeId;
            this.__explicitlySet__.add("emBridgeId");
            return this;
        }
        /**
         * The time the the EmWarehouse was created. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the EmWarehouse was created. An RFC3339 formatted datetime string
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the EmWarehouse was updated. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the EmWarehouse was updated. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the EmWarehouse.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the EmWarehouse.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
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

        public EmWarehouse build() {
            EmWarehouse __instance__ =
                    new EmWarehouse(
                            operationsInsightsWarehouseId,
                            latestEtlRunStatus,
                            latestEtlRunMessage,
                            latestEtlRunTime,
                            id,
                            displayName,
                            compartmentId,
                            emWarehouseType,
                            emBridgeId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmWarehouse o) {
            Builder copiedBuilder =
                    operationsInsightsWarehouseId(o.getOperationsInsightsWarehouseId())
                            .latestEtlRunStatus(o.getLatestEtlRunStatus())
                            .latestEtlRunMessage(o.getLatestEtlRunMessage())
                            .latestEtlRunTime(o.getLatestEtlRunTime())
                            .id(o.getId())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .emWarehouseType(o.getEmWarehouseType())
                            .emBridgeId(o.getEmBridgeId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * operations Insights Warehouse Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsWarehouseId")
    private final String operationsInsightsWarehouseId;

    /**
     * operations Insights Warehouse Identifier
     * @return the value
     **/
    public String getOperationsInsightsWarehouseId() {
        return operationsInsightsWarehouseId;
    }

    /**
     * Data Flow Run Status
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latestEtlRunStatus")
    private final String latestEtlRunStatus;

    /**
     * Data Flow Run Status
     * @return the value
     **/
    public String getLatestEtlRunStatus() {
        return latestEtlRunStatus;
    }

    /**
     * Data Flow Run Status Message
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latestEtlRunMessage")
    private final String latestEtlRunMessage;

    /**
     * Data Flow Run Status Message
     * @return the value
     **/
    public String getLatestEtlRunMessage() {
        return latestEtlRunMessage;
    }

    /**
     * Data Flow Run Total Time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latestEtlRunTime")
    private final String latestEtlRunTime;

    /**
     * Data Flow Run Total Time
     * @return the value
     **/
    public String getLatestEtlRunTime() {
        return latestEtlRunTime;
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
     * EmWarehouse Identifier, can be renamed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * EmWarehouse Identifier, can be renamed
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Type of the EmWarehouse.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emWarehouseType")
    private final String emWarehouseType;

    /**
     * Type of the EmWarehouse.
     * @return the value
     **/
    public String getEmWarehouseType() {
        return emWarehouseType;
    }

    /**
     * EMBridge Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emBridgeId")
    private final String emBridgeId;

    /**
     * EMBridge Identifier
     * @return the value
     **/
    public String getEmBridgeId() {
        return emBridgeId;
    }

    /**
     * The time the the EmWarehouse was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the EmWarehouse was created. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the EmWarehouse was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the EmWarehouse was updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the EmWarehouse.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
     * The current state of the EmWarehouse.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the EmWarehouse.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
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
        sb.append("EmWarehouse(");
        sb.append("operationsInsightsWarehouseId=")
                .append(String.valueOf(this.operationsInsightsWarehouseId));
        sb.append(", latestEtlRunStatus=").append(String.valueOf(this.latestEtlRunStatus));
        sb.append(", latestEtlRunMessage=").append(String.valueOf(this.latestEtlRunMessage));
        sb.append(", latestEtlRunTime=").append(String.valueOf(this.latestEtlRunTime));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", emWarehouseType=").append(String.valueOf(this.emWarehouseType));
        sb.append(", emBridgeId=").append(String.valueOf(this.emBridgeId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmWarehouse)) {
            return false;
        }

        EmWarehouse other = (EmWarehouse) o;
        return java.util.Objects.equals(
                        this.operationsInsightsWarehouseId, other.operationsInsightsWarehouseId)
                && java.util.Objects.equals(this.latestEtlRunStatus, other.latestEtlRunStatus)
                && java.util.Objects.equals(this.latestEtlRunMessage, other.latestEtlRunMessage)
                && java.util.Objects.equals(this.latestEtlRunTime, other.latestEtlRunTime)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.emWarehouseType, other.emWarehouseType)
                && java.util.Objects.equals(this.emBridgeId, other.emBridgeId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationsInsightsWarehouseId == null
                                ? 43
                                : this.operationsInsightsWarehouseId.hashCode());
        result =
                (result * PRIME)
                        + (this.latestEtlRunStatus == null
                                ? 43
                                : this.latestEtlRunStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.latestEtlRunMessage == null
                                ? 43
                                : this.latestEtlRunMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.latestEtlRunTime == null ? 43 : this.latestEtlRunTime.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.emWarehouseType == null ? 43 : this.emWarehouseType.hashCode());
        result = (result * PRIME) + (this.emBridgeId == null ? 43 : this.emBridgeId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
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
