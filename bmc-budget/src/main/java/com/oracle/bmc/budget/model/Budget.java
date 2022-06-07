/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.model;

/**
 * A budget.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Budget.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Budget {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "targetCompartmentId",
        "displayName",
        "description",
        "amount",
        "resetPeriod",
        "budgetProcessingPeriodStartOffset",
        "processingPeriodType",
        "targetType",
        "targets",
        "lifecycleState",
        "alertRuleCount",
        "version",
        "actualSpend",
        "forecastedSpend",
        "timeSpendComputed",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags"
    })
    public Budget(
            String id,
            String compartmentId,
            String targetCompartmentId,
            String displayName,
            String description,
            java.math.BigDecimal amount,
            ResetPeriod resetPeriod,
            Integer budgetProcessingPeriodStartOffset,
            ProcessingPeriodType processingPeriodType,
            TargetType targetType,
            java.util.List<String> targets,
            LifecycleState lifecycleState,
            Integer alertRuleCount,
            Integer version,
            java.math.BigDecimal actualSpend,
            java.math.BigDecimal forecastedSpend,
            java.util.Date timeSpendComputed,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.targetCompartmentId = targetCompartmentId;
        this.displayName = displayName;
        this.description = description;
        this.amount = amount;
        this.resetPeriod = resetPeriod;
        this.budgetProcessingPeriodStartOffset = budgetProcessingPeriodStartOffset;
        this.processingPeriodType = processingPeriodType;
        this.targetType = targetType;
        this.targets = targets;
        this.lifecycleState = lifecycleState;
        this.alertRuleCount = alertRuleCount;
        this.version = version;
        this.actualSpend = actualSpend;
        this.forecastedSpend = forecastedSpend;
        this.timeSpendComputed = timeSpendComputed;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
        private String targetCompartmentId;

        public Builder targetCompartmentId(String targetCompartmentId) {
            this.targetCompartmentId = targetCompartmentId;
            this.__explicitlySet__.add("targetCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("amount")
        private java.math.BigDecimal amount;

        public Builder amount(java.math.BigDecimal amount) {
            this.amount = amount;
            this.__explicitlySet__.add("amount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resetPeriod")
        private ResetPeriod resetPeriod;

        public Builder resetPeriod(ResetPeriod resetPeriod) {
            this.resetPeriod = resetPeriod;
            this.__explicitlySet__.add("resetPeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("budgetProcessingPeriodStartOffset")
        private Integer budgetProcessingPeriodStartOffset;

        public Builder budgetProcessingPeriodStartOffset(
                Integer budgetProcessingPeriodStartOffset) {
            this.budgetProcessingPeriodStartOffset = budgetProcessingPeriodStartOffset;
            this.__explicitlySet__.add("budgetProcessingPeriodStartOffset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("processingPeriodType")
        private ProcessingPeriodType processingPeriodType;

        public Builder processingPeriodType(ProcessingPeriodType processingPeriodType) {
            this.processingPeriodType = processingPeriodType;
            this.__explicitlySet__.add("processingPeriodType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetType")
        private TargetType targetType;

        public Builder targetType(TargetType targetType) {
            this.targetType = targetType;
            this.__explicitlySet__.add("targetType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targets")
        private java.util.List<String> targets;

        public Builder targets(java.util.List<String> targets) {
            this.targets = targets;
            this.__explicitlySet__.add("targets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("alertRuleCount")
        private Integer alertRuleCount;

        public Builder alertRuleCount(Integer alertRuleCount) {
            this.alertRuleCount = alertRuleCount;
            this.__explicitlySet__.add("alertRuleCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Integer version;

        public Builder version(Integer version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actualSpend")
        private java.math.BigDecimal actualSpend;

        public Builder actualSpend(java.math.BigDecimal actualSpend) {
            this.actualSpend = actualSpend;
            this.__explicitlySet__.add("actualSpend");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("forecastedSpend")
        private java.math.BigDecimal forecastedSpend;

        public Builder forecastedSpend(java.math.BigDecimal forecastedSpend) {
            this.forecastedSpend = forecastedSpend;
            this.__explicitlySet__.add("forecastedSpend");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeSpendComputed")
        private java.util.Date timeSpendComputed;

        public Builder timeSpendComputed(java.util.Date timeSpendComputed) {
            this.timeSpendComputed = timeSpendComputed;
            this.__explicitlySet__.add("timeSpendComputed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Budget build() {
            Budget __instance__ =
                    new Budget(
                            id,
                            compartmentId,
                            targetCompartmentId,
                            displayName,
                            description,
                            amount,
                            resetPeriod,
                            budgetProcessingPeriodStartOffset,
                            processingPeriodType,
                            targetType,
                            targets,
                            lifecycleState,
                            alertRuleCount,
                            version,
                            actualSpend,
                            forecastedSpend,
                            timeSpendComputed,
                            timeCreated,
                            timeUpdated,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Budget o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .targetCompartmentId(o.getTargetCompartmentId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .amount(o.getAmount())
                            .resetPeriod(o.getResetPeriod())
                            .budgetProcessingPeriodStartOffset(
                                    o.getBudgetProcessingPeriodStartOffset())
                            .processingPeriodType(o.getProcessingPeriodType())
                            .targetType(o.getTargetType())
                            .targets(o.getTargets())
                            .lifecycleState(o.getLifecycleState())
                            .alertRuleCount(o.getAlertRuleCount())
                            .version(o.getVersion())
                            .actualSpend(o.getActualSpend())
                            .forecastedSpend(o.getForecastedSpend())
                            .timeSpendComputed(o.getTimeSpendComputed())
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
     * The OCID of the budget.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * This is DEPRECATED. For backwards compatability, the property is populated when
     * the targetType is "COMPARTMENT", and targets contain the specific target compartment OCID.
     * For all other scenarios, this property will be left empty.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
    private final String targetCompartmentId;

    public String getTargetCompartmentId() {
        return targetCompartmentId;
    }

    /**
     * The display name of the budget. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The description of the budget.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The amount of the budget expressed in the currency of the customer's rate card.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    private final java.math.BigDecimal amount;

    public java.math.BigDecimal getAmount() {
        return amount;
    }

    /**
     * The reset period for the budget.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resetPeriod")
    private final ResetPeriod resetPeriod;

    public ResetPeriod getResetPeriod() {
        return resetPeriod;
    }

    /**
     * The number of days offset from the first day of the month, at which the budget processing period starts. In months that have fewer days than this value, processing will begin on the last day of that month. For example, for a value of 12, processing starts every month on the 12th at midnight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("budgetProcessingPeriodStartOffset")
    private final Integer budgetProcessingPeriodStartOffset;

    public Integer getBudgetProcessingPeriodStartOffset() {
        return budgetProcessingPeriodStartOffset;
    }

    /**
     * The type of the budget processing period. Valid values are INVOICE and MONTH.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("processingPeriodType")
    private final ProcessingPeriodType processingPeriodType;

    public ProcessingPeriodType getProcessingPeriodType() {
        return processingPeriodType;
    }

    /**
     * The type of target on which the budget is applied.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetType")
    private final TargetType targetType;

    public TargetType getTargetType() {
        return targetType;
    }

    /**
     * The list of targets on which the budget is applied.
     *   If the targetType is "COMPARTMENT", the targets contain the list of compartment OCIDs.
     *   If the targetType is "TAG", the targets contain the list of cost tracking tag identifiers in the form of "{tagNamespace}.{tagKey}.{tagValue}".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targets")
    private final java.util.List<String> targets;

    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * The current state of the budget.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The total number of alert rules in the budget.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alertRuleCount")
    private final Integer alertRuleCount;

    public Integer getAlertRuleCount() {
        return alertRuleCount;
    }

    /**
     * The version of the budget. Starts from 1 and increments by 1.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Integer version;

    public Integer getVersion() {
        return version;
    }

    /**
     * The actual spend in currency for the current budget cycle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actualSpend")
    private final java.math.BigDecimal actualSpend;

    public java.math.BigDecimal getActualSpend() {
        return actualSpend;
    }

    /**
     * The forecasted spend in currency by the end of the current budget cycle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("forecastedSpend")
    private final java.math.BigDecimal forecastedSpend;

    public java.math.BigDecimal getForecastedSpend() {
        return forecastedSpend;
    }

    /**
     * The time that the budget spend was last computed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeSpendComputed")
    private final java.util.Date timeSpendComputed;

    public java.util.Date getTimeSpendComputed() {
        return timeSpendComputed;
    }

    /**
     * The time that the budget was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time that the budget was updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Budget(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targetCompartmentId=").append(String.valueOf(this.targetCompartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", amount=").append(String.valueOf(this.amount));
        sb.append(", resetPeriod=").append(String.valueOf(this.resetPeriod));
        sb.append(", budgetProcessingPeriodStartOffset=")
                .append(String.valueOf(this.budgetProcessingPeriodStartOffset));
        sb.append(", processingPeriodType=").append(String.valueOf(this.processingPeriodType));
        sb.append(", targetType=").append(String.valueOf(this.targetType));
        sb.append(", targets=").append(String.valueOf(this.targets));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", alertRuleCount=").append(String.valueOf(this.alertRuleCount));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", actualSpend=").append(String.valueOf(this.actualSpend));
        sb.append(", forecastedSpend=").append(String.valueOf(this.forecastedSpend));
        sb.append(", timeSpendComputed=").append(String.valueOf(this.timeSpendComputed));
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
        if (!(o instanceof Budget)) {
            return false;
        }

        Budget other = (Budget) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetCompartmentId, other.targetCompartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.amount, other.amount)
                && java.util.Objects.equals(this.resetPeriod, other.resetPeriod)
                && java.util.Objects.equals(
                        this.budgetProcessingPeriodStartOffset,
                        other.budgetProcessingPeriodStartOffset)
                && java.util.Objects.equals(this.processingPeriodType, other.processingPeriodType)
                && java.util.Objects.equals(this.targetType, other.targetType)
                && java.util.Objects.equals(this.targets, other.targets)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.alertRuleCount, other.alertRuleCount)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.actualSpend, other.actualSpend)
                && java.util.Objects.equals(this.forecastedSpend, other.forecastedSpend)
                && java.util.Objects.equals(this.timeSpendComputed, other.timeSpendComputed)
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
        result =
                (result * PRIME)
                        + (this.targetCompartmentId == null
                                ? 43
                                : this.targetCompartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.amount == null ? 43 : this.amount.hashCode());
        result = (result * PRIME) + (this.resetPeriod == null ? 43 : this.resetPeriod.hashCode());
        result =
                (result * PRIME)
                        + (this.budgetProcessingPeriodStartOffset == null
                                ? 43
                                : this.budgetProcessingPeriodStartOffset.hashCode());
        result =
                (result * PRIME)
                        + (this.processingPeriodType == null
                                ? 43
                                : this.processingPeriodType.hashCode());
        result = (result * PRIME) + (this.targetType == null ? 43 : this.targetType.hashCode());
        result = (result * PRIME) + (this.targets == null ? 43 : this.targets.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.alertRuleCount == null ? 43 : this.alertRuleCount.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.actualSpend == null ? 43 : this.actualSpend.hashCode());
        result =
                (result * PRIME)
                        + (this.forecastedSpend == null ? 43 : this.forecastedSpend.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSpendComputed == null ? 43 : this.timeSpendComputed.hashCode());
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
