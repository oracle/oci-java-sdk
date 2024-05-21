/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.model;

/**
 * Encapsulates a collection of Hard and Soft Limits for a resource within a subscription.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UsageLimitSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UsageLimitSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeCreated",
        "entitlementId",
        "id",
        "timeModified",
        "resourceName",
        "serviceName",
        "limit",
        "createdBy",
        "modifiedBy",
        "action",
        "alertLevel",
        "limitType",
        "valueType",
        "lifecycleState",
        "maxHardLimit",
        "skuPartId"
    })
    public UsageLimitSummary(
            java.util.Date timeCreated,
            String entitlementId,
            String id,
            java.util.Date timeModified,
            String resourceName,
            String serviceName,
            String limit,
            String createdBy,
            String modifiedBy,
            Action action,
            java.math.BigDecimal alertLevel,
            LimitType limitType,
            ValueType valueType,
            LifecycleState lifecycleState,
            String maxHardLimit,
            String skuPartId) {
        super();
        this.timeCreated = timeCreated;
        this.entitlementId = entitlementId;
        this.id = id;
        this.timeModified = timeModified;
        this.resourceName = resourceName;
        this.serviceName = serviceName;
        this.limit = limit;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.action = action;
        this.alertLevel = alertLevel;
        this.limitType = limitType;
        this.valueType = valueType;
        this.lifecycleState = lifecycleState;
        this.maxHardLimit = maxHardLimit;
        this.skuPartId = skuPartId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Time when the usage limit was created
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time when the usage limit was created
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Entitlement ID of the usage limit
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entitlementId")
        private String entitlementId;

        /**
         * Entitlement ID of the usage limit
         * @param entitlementId the value to set
         * @return this builder
         **/
        public Builder entitlementId(String entitlementId) {
            this.entitlementId = entitlementId;
            this.__explicitlySet__.add("entitlementId");
            return this;
        }
        /**
         * The usage limit ID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The usage limit ID
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Time when the usage limit was modified
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        /**
         * Time when the usage limit was modified
         * @param timeModified the value to set
         * @return this builder
         **/
        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }
        /**
         * The resource for which the limit is defined
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The resource for which the limit is defined
         * @param resourceName the value to set
         * @return this builder
         **/
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * The service for which the limit is defined
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * The service for which the limit is defined
         * @param serviceName the value to set
         * @return this builder
         **/
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /**
         * The limit value
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("limit")
        private String limit;

        /**
         * The limit value
         * @param limit the value to set
         * @return this builder
         **/
        public Builder limit(String limit) {
            this.limit = limit;
            this.__explicitlySet__.add("limit");
            return this;
        }
        /**
         * The user who created the limit
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The user who created the limit
         * @param createdBy the value to set
         * @return this builder
         **/
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * The user who modified the limit
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modifiedBy")
        private String modifiedBy;

        /**
         * The user who modified the limit
         * @param modifiedBy the value to set
         * @return this builder
         **/
        public Builder modifiedBy(String modifiedBy) {
            this.modifiedBy = modifiedBy;
            this.__explicitlySet__.add("modifiedBy");
            return this;
        }
        /**
         * The action when usage limit is hit
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The action when usage limit is hit
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The alert level of the usage limit
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alertLevel")
        private java.math.BigDecimal alertLevel;

        /**
         * The alert level of the usage limit
         * @param alertLevel the value to set
         * @return this builder
         **/
        public Builder alertLevel(java.math.BigDecimal alertLevel) {
            this.alertLevel = alertLevel;
            this.__explicitlySet__.add("alertLevel");
            return this;
        }
        /**
         * The limit type of the usage limit
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("limitType")
        private LimitType limitType;

        /**
         * The limit type of the usage limit
         * @param limitType the value to set
         * @return this builder
         **/
        public Builder limitType(LimitType limitType) {
            this.limitType = limitType;
            this.__explicitlySet__.add("limitType");
            return this;
        }
        /**
         * The value type of the usage limit
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("valueType")
        private ValueType valueType;

        /**
         * The value type of the usage limit
         * @param valueType the value to set
         * @return this builder
         **/
        public Builder valueType(ValueType valueType) {
            this.valueType = valueType;
            this.__explicitlySet__.add("valueType");
            return this;
        }
        /**
         * The usage limit lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The usage limit lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The maximum hard limit set for the usage limit
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxHardLimit")
        private String maxHardLimit;

        /**
         * The maximum hard limit set for the usage limit
         * @param maxHardLimit the value to set
         * @return this builder
         **/
        public Builder maxHardLimit(String maxHardLimit) {
            this.maxHardLimit = maxHardLimit;
            this.__explicitlySet__.add("maxHardLimit");
            return this;
        }
        /**
         * The SKU for which the usage limit is set
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("skuPartId")
        private String skuPartId;

        /**
         * The SKU for which the usage limit is set
         * @param skuPartId the value to set
         * @return this builder
         **/
        public Builder skuPartId(String skuPartId) {
            this.skuPartId = skuPartId;
            this.__explicitlySet__.add("skuPartId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageLimitSummary build() {
            UsageLimitSummary model =
                    new UsageLimitSummary(
                            this.timeCreated,
                            this.entitlementId,
                            this.id,
                            this.timeModified,
                            this.resourceName,
                            this.serviceName,
                            this.limit,
                            this.createdBy,
                            this.modifiedBy,
                            this.action,
                            this.alertLevel,
                            this.limitType,
                            this.valueType,
                            this.lifecycleState,
                            this.maxHardLimit,
                            this.skuPartId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageLimitSummary model) {
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("entitlementId")) {
                this.entitlementId(model.getEntitlementId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("timeModified")) {
                this.timeModified(model.getTimeModified());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("limit")) {
                this.limit(model.getLimit());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("modifiedBy")) {
                this.modifiedBy(model.getModifiedBy());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("alertLevel")) {
                this.alertLevel(model.getAlertLevel());
            }
            if (model.wasPropertyExplicitlySet("limitType")) {
                this.limitType(model.getLimitType());
            }
            if (model.wasPropertyExplicitlySet("valueType")) {
                this.valueType(model.getValueType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("maxHardLimit")) {
                this.maxHardLimit(model.getMaxHardLimit());
            }
            if (model.wasPropertyExplicitlySet("skuPartId")) {
                this.skuPartId(model.getSkuPartId());
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
     * Time when the usage limit was created
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time when the usage limit was created
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Entitlement ID of the usage limit
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entitlementId")
    private final String entitlementId;

    /**
     * Entitlement ID of the usage limit
     * @return the value
     **/
    public String getEntitlementId() {
        return entitlementId;
    }

    /**
     * The usage limit ID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The usage limit ID
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Time when the usage limit was modified
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    private final java.util.Date timeModified;

    /**
     * Time when the usage limit was modified
     * @return the value
     **/
    public java.util.Date getTimeModified() {
        return timeModified;
    }

    /**
     * The resource for which the limit is defined
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The resource for which the limit is defined
     * @return the value
     **/
    public String getResourceName() {
        return resourceName;
    }

    /**
     * The service for which the limit is defined
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * The service for which the limit is defined
     * @return the value
     **/
    public String getServiceName() {
        return serviceName;
    }

    /**
     * The limit value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    private final String limit;

    /**
     * The limit value
     * @return the value
     **/
    public String getLimit() {
        return limit;
    }

    /**
     * The user who created the limit
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The user who created the limit
     * @return the value
     **/
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * The user who modified the limit
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modifiedBy")
    private final String modifiedBy;

    /**
     * The user who modified the limit
     * @return the value
     **/
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * The action when usage limit is hit
     **/
    public enum Action {
        QuotaBreach("QUOTA_BREACH"),
        QuotaAlert("QUOTA_ALERT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Action.class);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The action when usage limit is hit
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The action when usage limit is hit
     * @return the value
     **/
    public Action getAction() {
        return action;
    }

    /**
     * The alert level of the usage limit
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alertLevel")
    private final java.math.BigDecimal alertLevel;

    /**
     * The alert level of the usage limit
     * @return the value
     **/
    public java.math.BigDecimal getAlertLevel() {
        return alertLevel;
    }

    /**
     * The limit type of the usage limit
     **/
    public enum LimitType {
        Hard("HARD"),
        Soft("SOFT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LimitType.class);

        private final String value;
        private static java.util.Map<String, LimitType> map;

        static {
            map = new java.util.HashMap<>();
            for (LimitType v : LimitType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LimitType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LimitType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LimitType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The limit type of the usage limit
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("limitType")
    private final LimitType limitType;

    /**
     * The limit type of the usage limit
     * @return the value
     **/
    public LimitType getLimitType() {
        return limitType;
    }

    /**
     * The value type of the usage limit
     **/
    public enum ValueType {
        Absolute("ABSOLUTE"),
        Percentage("PERCENTAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ValueType.class);

        private final String value;
        private static java.util.Map<String, ValueType> map;

        static {
            map = new java.util.HashMap<>();
            for (ValueType v : ValueType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ValueType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValueType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ValueType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The value type of the usage limit
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("valueType")
    private final ValueType valueType;

    /**
     * The value type of the usage limit
     * @return the value
     **/
    public ValueType getValueType() {
        return valueType;
    }

    /**
     * The usage limit lifecycle state.
     **/
    public enum LifecycleState {
        Active("ACTIVE"),

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
     * The usage limit lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The usage limit lifecycle state.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The maximum hard limit set for the usage limit
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxHardLimit")
    private final String maxHardLimit;

    /**
     * The maximum hard limit set for the usage limit
     * @return the value
     **/
    public String getMaxHardLimit() {
        return maxHardLimit;
    }

    /**
     * The SKU for which the usage limit is set
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("skuPartId")
    private final String skuPartId;

    /**
     * The SKU for which the usage limit is set
     * @return the value
     **/
    public String getSkuPartId() {
        return skuPartId;
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
        sb.append("UsageLimitSummary(");
        sb.append("super=").append(super.toString());
        sb.append("timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", entitlementId=").append(String.valueOf(this.entitlementId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", timeModified=").append(String.valueOf(this.timeModified));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", limit=").append(String.valueOf(this.limit));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", modifiedBy=").append(String.valueOf(this.modifiedBy));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", alertLevel=").append(String.valueOf(this.alertLevel));
        sb.append(", limitType=").append(String.valueOf(this.limitType));
        sb.append(", valueType=").append(String.valueOf(this.valueType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", maxHardLimit=").append(String.valueOf(this.maxHardLimit));
        sb.append(", skuPartId=").append(String.valueOf(this.skuPartId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsageLimitSummary)) {
            return false;
        }

        UsageLimitSummary other = (UsageLimitSummary) o;
        return java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.entitlementId, other.entitlementId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeModified, other.timeModified)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.modifiedBy, other.modifiedBy)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.alertLevel, other.alertLevel)
                && java.util.Objects.equals(this.limitType, other.limitType)
                && java.util.Objects.equals(this.valueType, other.valueType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.maxHardLimit, other.maxHardLimit)
                && java.util.Objects.equals(this.skuPartId, other.skuPartId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.entitlementId == null ? 43 : this.entitlementId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.timeModified == null ? 43 : this.timeModified.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.modifiedBy == null ? 43 : this.modifiedBy.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.alertLevel == null ? 43 : this.alertLevel.hashCode());
        result = (result * PRIME) + (this.limitType == null ? 43 : this.limitType.hashCode());
        result = (result * PRIME) + (this.valueType == null ? 43 : this.valueType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.maxHardLimit == null ? 43 : this.maxHardLimit.hashCode());
        result = (result * PRIME) + (this.skuPartId == null ? 43 : this.skuPartId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
