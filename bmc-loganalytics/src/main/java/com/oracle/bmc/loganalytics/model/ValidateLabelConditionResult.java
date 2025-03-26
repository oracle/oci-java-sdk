/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The result of the label condition validation
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ValidateLabelConditionResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ValidateLabelConditionResult
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "conditionString",
        "conditionBlock",
        "fieldValues",
        "status",
        "statusDescription",
        "evaluationResult"
    })
    public ValidateLabelConditionResult(
            String conditionString,
            ConditionBlock conditionBlock,
            java.util.List<LogAnalyticsProperty> fieldValues,
            String status,
            String statusDescription,
            Boolean evaluationResult) {
        super();
        this.conditionString = conditionString;
        this.conditionBlock = conditionBlock;
        this.fieldValues = fieldValues;
        this.status = status;
        this.statusDescription = statusDescription;
        this.evaluationResult = evaluationResult;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * String representation of the validated label condition.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("conditionString")
        private String conditionString;

        /**
         * String representation of the validated label condition.
         * @param conditionString the value to set
         * @return this builder
         **/
        public Builder conditionString(String conditionString) {
            this.conditionString = conditionString;
            this.__explicitlySet__.add("conditionString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conditionBlock")
        private ConditionBlock conditionBlock;

        public Builder conditionBlock(ConditionBlock conditionBlock) {
            this.conditionBlock = conditionBlock;
            this.__explicitlySet__.add("conditionBlock");
            return this;
        }
        /**
         * Field values against which the label condition was evaluated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldValues")
        private java.util.List<LogAnalyticsProperty> fieldValues;

        /**
         * Field values against which the label condition was evaluated.
         * @param fieldValues the value to set
         * @return this builder
         **/
        public Builder fieldValues(java.util.List<LogAnalyticsProperty> fieldValues) {
            this.fieldValues = fieldValues;
            this.__explicitlySet__.add("fieldValues");
            return this;
        }
        /**
         * The validation status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The validation status.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The validation status description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statusDescription")
        private String statusDescription;

        /**
         * The validation status description.
         * @param statusDescription the value to set
         * @return this builder
         **/
        public Builder statusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            this.__explicitlySet__.add("statusDescription");
            return this;
        }
        /**
         * The result of evaluating the condition blocks against the specified field values. Either true or false.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("evaluationResult")
        private Boolean evaluationResult;

        /**
         * The result of evaluating the condition blocks against the specified field values. Either true or false.
         *
         * @param evaluationResult the value to set
         * @return this builder
         **/
        public Builder evaluationResult(Boolean evaluationResult) {
            this.evaluationResult = evaluationResult;
            this.__explicitlySet__.add("evaluationResult");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidateLabelConditionResult build() {
            ValidateLabelConditionResult model =
                    new ValidateLabelConditionResult(
                            this.conditionString,
                            this.conditionBlock,
                            this.fieldValues,
                            this.status,
                            this.statusDescription,
                            this.evaluationResult);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidateLabelConditionResult model) {
            if (model.wasPropertyExplicitlySet("conditionString")) {
                this.conditionString(model.getConditionString());
            }
            if (model.wasPropertyExplicitlySet("conditionBlock")) {
                this.conditionBlock(model.getConditionBlock());
            }
            if (model.wasPropertyExplicitlySet("fieldValues")) {
                this.fieldValues(model.getFieldValues());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("statusDescription")) {
                this.statusDescription(model.getStatusDescription());
            }
            if (model.wasPropertyExplicitlySet("evaluationResult")) {
                this.evaluationResult(model.getEvaluationResult());
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
     * String representation of the validated label condition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conditionString")
    private final String conditionString;

    /**
     * String representation of the validated label condition.
     * @return the value
     **/
    public String getConditionString() {
        return conditionString;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("conditionBlock")
    private final ConditionBlock conditionBlock;

    public ConditionBlock getConditionBlock() {
        return conditionBlock;
    }

    /**
     * Field values against which the label condition was evaluated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldValues")
    private final java.util.List<LogAnalyticsProperty> fieldValues;

    /**
     * Field values against which the label condition was evaluated.
     * @return the value
     **/
    public java.util.List<LogAnalyticsProperty> getFieldValues() {
        return fieldValues;
    }

    /**
     * The validation status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The validation status.
     * @return the value
     **/
    public String getStatus() {
        return status;
    }

    /**
     * The validation status description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusDescription")
    private final String statusDescription;

    /**
     * The validation status description.
     * @return the value
     **/
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * The result of evaluating the condition blocks against the specified field values. Either true or false.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("evaluationResult")
    private final Boolean evaluationResult;

    /**
     * The result of evaluating the condition blocks against the specified field values. Either true or false.
     *
     * @return the value
     **/
    public Boolean getEvaluationResult() {
        return evaluationResult;
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
        sb.append("ValidateLabelConditionResult(");
        sb.append("super=").append(super.toString());
        sb.append("conditionString=").append(String.valueOf(this.conditionString));
        sb.append(", conditionBlock=").append(String.valueOf(this.conditionBlock));
        sb.append(", fieldValues=").append(String.valueOf(this.fieldValues));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", statusDescription=").append(String.valueOf(this.statusDescription));
        sb.append(", evaluationResult=").append(String.valueOf(this.evaluationResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateLabelConditionResult)) {
            return false;
        }

        ValidateLabelConditionResult other = (ValidateLabelConditionResult) o;
        return java.util.Objects.equals(this.conditionString, other.conditionString)
                && java.util.Objects.equals(this.conditionBlock, other.conditionBlock)
                && java.util.Objects.equals(this.fieldValues, other.fieldValues)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusDescription, other.statusDescription)
                && java.util.Objects.equals(this.evaluationResult, other.evaluationResult)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.conditionString == null ? 43 : this.conditionString.hashCode());
        result =
                (result * PRIME)
                        + (this.conditionBlock == null ? 43 : this.conditionBlock.hashCode());
        result = (result * PRIME) + (this.fieldValues == null ? 43 : this.fieldValues.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.statusDescription == null ? 43 : this.statusDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.evaluationResult == null ? 43 : this.evaluationResult.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
