/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.model;

/**
 * The create budget details.
 *
 * <p>Clients should use 'targetType' and 'targets' to specify the target type and list of targets
 * on which the budget is applied.
 *
 * <p>For backwards compatibility, 'targetCompartmentId' is still supported for all existing
 * clients. This is considered deprecated, however, and all clients are upgraded to use 'targetType'
 * and 'targets'.
 *
 * <p>Specifying both 'targetCompartmentId' and 'targets' causes a Bad Request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateBudgetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateBudgetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
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
        "freeformTags",
        "definedTags"
    })
    public CreateBudgetDetails(
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
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
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
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** This is DEPRECATED. Set the target compartment ID in targets instead. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
        private String targetCompartmentId;

        /**
         * This is DEPRECATED. Set the target compartment ID in targets instead.
         *
         * @param targetCompartmentId the value to set
         * @return this builder
         */
        public Builder targetCompartmentId(String targetCompartmentId) {
            this.targetCompartmentId = targetCompartmentId;
            this.__explicitlySet__.add("targetCompartmentId");
            return this;
        }
        /** The displayName of the budget. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The displayName of the budget. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The description of the budget. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the budget.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The amount of the budget expressed as a whole number in the currency of the customer's
         * rate card.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("amount")
        private java.math.BigDecimal amount;

        /**
         * The amount of the budget expressed as a whole number in the currency of the customer's
         * rate card.
         *
         * @param amount the value to set
         * @return this builder
         */
        public Builder amount(java.math.BigDecimal amount) {
            this.amount = amount;
            this.__explicitlySet__.add("amount");
            return this;
        }
        /** The reset period for the budget. */
        @com.fasterxml.jackson.annotation.JsonProperty("resetPeriod")
        private ResetPeriod resetPeriod;

        /**
         * The reset period for the budget.
         *
         * @param resetPeriod the value to set
         * @return this builder
         */
        public Builder resetPeriod(ResetPeriod resetPeriod) {
            this.resetPeriod = resetPeriod;
            this.__explicitlySet__.add("resetPeriod");
            return this;
        }
        /**
         * The number of days offset from the first day of the month, at which the budget processing
         * period starts. In months that have fewer days than this value, processing will begin on
         * the last day of that month. For example, for a value of 12, processing starts every month
         * on the 12th at midnight.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("budgetProcessingPeriodStartOffset")
        private Integer budgetProcessingPeriodStartOffset;

        /**
         * The number of days offset from the first day of the month, at which the budget processing
         * period starts. In months that have fewer days than this value, processing will begin on
         * the last day of that month. For example, for a value of 12, processing starts every month
         * on the 12th at midnight.
         *
         * @param budgetProcessingPeriodStartOffset the value to set
         * @return this builder
         */
        public Builder budgetProcessingPeriodStartOffset(
                Integer budgetProcessingPeriodStartOffset) {
            this.budgetProcessingPeriodStartOffset = budgetProcessingPeriodStartOffset;
            this.__explicitlySet__.add("budgetProcessingPeriodStartOffset");
            return this;
        }
        /** The type of the budget processing period. Valid values are INVOICE and MONTH. */
        @com.fasterxml.jackson.annotation.JsonProperty("processingPeriodType")
        private ProcessingPeriodType processingPeriodType;

        /**
         * The type of the budget processing period. Valid values are INVOICE and MONTH.
         *
         * @param processingPeriodType the value to set
         * @return this builder
         */
        public Builder processingPeriodType(ProcessingPeriodType processingPeriodType) {
            this.processingPeriodType = processingPeriodType;
            this.__explicitlySet__.add("processingPeriodType");
            return this;
        }
        /** The type of target on which the budget is applied. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetType")
        private TargetType targetType;

        /**
         * The type of target on which the budget is applied.
         *
         * @param targetType the value to set
         * @return this builder
         */
        public Builder targetType(TargetType targetType) {
            this.targetType = targetType;
            this.__explicitlySet__.add("targetType");
            return this;
        }
        /**
         * The list of targets on which the budget is applied. If targetType is "COMPARTMENT", the
         * targets contain the list of compartment OCIDs. If targetType is "TAG", the targets
         * contain the list of cost tracking tag identifiers in the form of
         * "{tagNamespace}.{tagKey}.{tagValue}". Curerntly, the array should contain exactly one
         * item.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targets")
        private java.util.List<String> targets;

        /**
         * The list of targets on which the budget is applied. If targetType is "COMPARTMENT", the
         * targets contain the list of compartment OCIDs. If targetType is "TAG", the targets
         * contain the list of cost tracking tag identifiers in the form of
         * "{tagNamespace}.{tagKey}.{tagValue}". Curerntly, the array should contain exactly one
         * item.
         *
         * @param targets the value to set
         * @return this builder
         */
        public Builder targets(java.util.List<String> targets) {
            this.targets = targets;
            this.__explicitlySet__.add("targets");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBudgetDetails build() {
            CreateBudgetDetails model =
                    new CreateBudgetDetails(
                            this.compartmentId,
                            this.targetCompartmentId,
                            this.displayName,
                            this.description,
                            this.amount,
                            this.resetPeriod,
                            this.budgetProcessingPeriodStartOffset,
                            this.processingPeriodType,
                            this.targetType,
                            this.targets,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBudgetDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("targetCompartmentId")) {
                this.targetCompartmentId(model.getTargetCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("amount")) {
                this.amount(model.getAmount());
            }
            if (model.wasPropertyExplicitlySet("resetPeriod")) {
                this.resetPeriod(model.getResetPeriod());
            }
            if (model.wasPropertyExplicitlySet("budgetProcessingPeriodStartOffset")) {
                this.budgetProcessingPeriodStartOffset(
                        model.getBudgetProcessingPeriodStartOffset());
            }
            if (model.wasPropertyExplicitlySet("processingPeriodType")) {
                this.processingPeriodType(model.getProcessingPeriodType());
            }
            if (model.wasPropertyExplicitlySet("targetType")) {
                this.targetType(model.getTargetType());
            }
            if (model.wasPropertyExplicitlySet("targets")) {
                this.targets(model.getTargets());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The OCID of the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** This is DEPRECATED. Set the target compartment ID in targets instead. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
    private final String targetCompartmentId;

    /**
     * This is DEPRECATED. Set the target compartment ID in targets instead.
     *
     * @return the value
     */
    public String getTargetCompartmentId() {
        return targetCompartmentId;
    }

    /** The displayName of the budget. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The displayName of the budget. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The description of the budget. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the budget.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The amount of the budget expressed as a whole number in the currency of the customer's rate
     * card.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    private final java.math.BigDecimal amount;

    /**
     * The amount of the budget expressed as a whole number in the currency of the customer's rate
     * card.
     *
     * @return the value
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }

    /** The reset period for the budget. */
    @com.fasterxml.jackson.annotation.JsonProperty("resetPeriod")
    private final ResetPeriod resetPeriod;

    /**
     * The reset period for the budget.
     *
     * @return the value
     */
    public ResetPeriod getResetPeriod() {
        return resetPeriod;
    }

    /**
     * The number of days offset from the first day of the month, at which the budget processing
     * period starts. In months that have fewer days than this value, processing will begin on the
     * last day of that month. For example, for a value of 12, processing starts every month on the
     * 12th at midnight.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("budgetProcessingPeriodStartOffset")
    private final Integer budgetProcessingPeriodStartOffset;

    /**
     * The number of days offset from the first day of the month, at which the budget processing
     * period starts. In months that have fewer days than this value, processing will begin on the
     * last day of that month. For example, for a value of 12, processing starts every month on the
     * 12th at midnight.
     *
     * @return the value
     */
    public Integer getBudgetProcessingPeriodStartOffset() {
        return budgetProcessingPeriodStartOffset;
    }

    /** The type of the budget processing period. Valid values are INVOICE and MONTH. */
    @com.fasterxml.jackson.annotation.JsonProperty("processingPeriodType")
    private final ProcessingPeriodType processingPeriodType;

    /**
     * The type of the budget processing period. Valid values are INVOICE and MONTH.
     *
     * @return the value
     */
    public ProcessingPeriodType getProcessingPeriodType() {
        return processingPeriodType;
    }

    /** The type of target on which the budget is applied. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetType")
    private final TargetType targetType;

    /**
     * The type of target on which the budget is applied.
     *
     * @return the value
     */
    public TargetType getTargetType() {
        return targetType;
    }

    /**
     * The list of targets on which the budget is applied. If targetType is "COMPARTMENT", the
     * targets contain the list of compartment OCIDs. If targetType is "TAG", the targets contain
     * the list of cost tracking tag identifiers in the form of
     * "{tagNamespace}.{tagKey}.{tagValue}". Curerntly, the array should contain exactly one item.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targets")
    private final java.util.List<String> targets;

    /**
     * The list of targets on which the budget is applied. If targetType is "COMPARTMENT", the
     * targets contain the list of compartment OCIDs. If targetType is "TAG", the targets contain
     * the list of cost tracking tag identifiers in the form of
     * "{tagNamespace}.{tagKey}.{tagValue}". Curerntly, the array should contain exactly one item.
     *
     * @return the value
     */
    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateBudgetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
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
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateBudgetDetails)) {
            return false;
        }

        CreateBudgetDetails other = (CreateBudgetDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
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
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
