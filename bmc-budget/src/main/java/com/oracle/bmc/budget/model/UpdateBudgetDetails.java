/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.model;

/**
 * The update budget details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateBudgetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateBudgetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "amount",
        "budgetProcessingPeriodStartOffset",
        "processingPeriodType",
        "startDate",
        "endDate",
        "resetPeriod",
        "freeformTags",
        "definedTags"
    })
    public UpdateBudgetDetails(
            String displayName,
            String description,
            java.math.BigDecimal amount,
            Integer budgetProcessingPeriodStartOffset,
            ProcessingPeriodType processingPeriodType,
            java.util.Date startDate,
            java.util.Date endDate,
            ResetPeriod resetPeriod,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.amount = amount;
        this.budgetProcessingPeriodStartOffset = budgetProcessingPeriodStartOffset;
        this.processingPeriodType = processingPeriodType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.resetPeriod = resetPeriod;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /**
         * The type of the budget processing period. Valid values are INVOICE, MONTH, and
         * SINGLE_USE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("processingPeriodType")
        private ProcessingPeriodType processingPeriodType;

        /**
         * The type of the budget processing period. Valid values are INVOICE, MONTH, and
         * SINGLE_USE.
         *
         * @param processingPeriodType the value to set
         * @return this builder
         */
        public Builder processingPeriodType(ProcessingPeriodType processingPeriodType) {
            this.processingPeriodType = processingPeriodType;
            this.__explicitlySet__.add("processingPeriodType");
            return this;
        }
        /**
         * The date when the one-time budget begins. For example, {@code 2023-03-23}. The date-time
         * format conforms to RFC 3339, and will be truncated to the starting point of the date
         * provided after being converted to UTC time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("startDate")
        private java.util.Date startDate;

        /**
         * The date when the one-time budget begins. For example, {@code 2023-03-23}. The date-time
         * format conforms to RFC 3339, and will be truncated to the starting point of the date
         * provided after being converted to UTC time.
         *
         * @param startDate the value to set
         * @return this builder
         */
        public Builder startDate(java.util.Date startDate) {
            this.startDate = startDate;
            this.__explicitlySet__.add("startDate");
            return this;
        }
        /**
         * The time when the one-time budget concludes. For example, {@code 2023-03-23}. The
         * date-time format conforms to RFC 3339, and will be truncated to the starting point of the
         * date provided after being converted to UTC time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endDate")
        private java.util.Date endDate;

        /**
         * The time when the one-time budget concludes. For example, {@code 2023-03-23}. The
         * date-time format conforms to RFC 3339, and will be truncated to the starting point of the
         * date provided after being converted to UTC time.
         *
         * @param endDate the value to set
         * @return this builder
         */
        public Builder endDate(java.util.Date endDate) {
            this.endDate = endDate;
            this.__explicitlySet__.add("endDate");
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

        public UpdateBudgetDetails build() {
            UpdateBudgetDetails model =
                    new UpdateBudgetDetails(
                            this.displayName,
                            this.description,
                            this.amount,
                            this.budgetProcessingPeriodStartOffset,
                            this.processingPeriodType,
                            this.startDate,
                            this.endDate,
                            this.resetPeriod,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBudgetDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("amount")) {
                this.amount(model.getAmount());
            }
            if (model.wasPropertyExplicitlySet("budgetProcessingPeriodStartOffset")) {
                this.budgetProcessingPeriodStartOffset(
                        model.getBudgetProcessingPeriodStartOffset());
            }
            if (model.wasPropertyExplicitlySet("processingPeriodType")) {
                this.processingPeriodType(model.getProcessingPeriodType());
            }
            if (model.wasPropertyExplicitlySet("startDate")) {
                this.startDate(model.getStartDate());
            }
            if (model.wasPropertyExplicitlySet("endDate")) {
                this.endDate(model.getEndDate());
            }
            if (model.wasPropertyExplicitlySet("resetPeriod")) {
                this.resetPeriod(model.getResetPeriod());
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

    /**
     * The type of the budget processing period. Valid values are INVOICE, MONTH, and SINGLE_USE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("processingPeriodType")
    private final ProcessingPeriodType processingPeriodType;

    /**
     * The type of the budget processing period. Valid values are INVOICE, MONTH, and SINGLE_USE.
     *
     * @return the value
     */
    public ProcessingPeriodType getProcessingPeriodType() {
        return processingPeriodType;
    }

    /**
     * The date when the one-time budget begins. For example, {@code 2023-03-23}. The date-time
     * format conforms to RFC 3339, and will be truncated to the starting point of the date provided
     * after being converted to UTC time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startDate")
    private final java.util.Date startDate;

    /**
     * The date when the one-time budget begins. For example, {@code 2023-03-23}. The date-time
     * format conforms to RFC 3339, and will be truncated to the starting point of the date provided
     * after being converted to UTC time.
     *
     * @return the value
     */
    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * The time when the one-time budget concludes. For example, {@code 2023-03-23}. The date-time
     * format conforms to RFC 3339, and will be truncated to the starting point of the date provided
     * after being converted to UTC time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endDate")
    private final java.util.Date endDate;

    /**
     * The time when the one-time budget concludes. For example, {@code 2023-03-23}. The date-time
     * format conforms to RFC 3339, and will be truncated to the starting point of the date provided
     * after being converted to UTC time.
     *
     * @return the value
     */
    public java.util.Date getEndDate() {
        return endDate;
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
        sb.append("UpdateBudgetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", amount=").append(String.valueOf(this.amount));
        sb.append(", budgetProcessingPeriodStartOffset=")
                .append(String.valueOf(this.budgetProcessingPeriodStartOffset));
        sb.append(", processingPeriodType=").append(String.valueOf(this.processingPeriodType));
        sb.append(", startDate=").append(String.valueOf(this.startDate));
        sb.append(", endDate=").append(String.valueOf(this.endDate));
        sb.append(", resetPeriod=").append(String.valueOf(this.resetPeriod));
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
        if (!(o instanceof UpdateBudgetDetails)) {
            return false;
        }

        UpdateBudgetDetails other = (UpdateBudgetDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.amount, other.amount)
                && java.util.Objects.equals(
                        this.budgetProcessingPeriodStartOffset,
                        other.budgetProcessingPeriodStartOffset)
                && java.util.Objects.equals(this.processingPeriodType, other.processingPeriodType)
                && java.util.Objects.equals(this.startDate, other.startDate)
                && java.util.Objects.equals(this.endDate, other.endDate)
                && java.util.Objects.equals(this.resetPeriod, other.resetPeriod)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.amount == null ? 43 : this.amount.hashCode());
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
        result = (result * PRIME) + (this.startDate == null ? 43 : this.startDate.hashCode());
        result = (result * PRIME) + (this.endDate == null ? 43 : this.endDate.hashCode());
        result = (result * PRIME) + (this.resetPeriod == null ? 43 : this.resetPeriod.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
