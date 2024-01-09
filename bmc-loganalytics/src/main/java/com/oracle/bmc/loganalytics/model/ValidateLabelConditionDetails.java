/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Required information needed to evaluate a source label condition. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ValidateLabelConditionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ValidateLabelConditionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"conditionString", "conditionBlock", "fieldValues"})
    public ValidateLabelConditionDetails(
            String conditionString,
            ConditionBlock conditionBlock,
            java.util.List<LogAnalyticsProperty> fieldValues) {
        super();
        this.conditionString = conditionString;
        this.conditionBlock = conditionBlock;
        this.fieldValues = fieldValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** String representation of the label condition to validate. */
        @com.fasterxml.jackson.annotation.JsonProperty("conditionString")
        private String conditionString;

        /**
         * String representation of the label condition to validate.
         *
         * @param conditionString the value to set
         * @return this builder
         */
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
        /** An array of field name-value pairs to evaluate the label condition. */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldValues")
        private java.util.List<LogAnalyticsProperty> fieldValues;

        /**
         * An array of field name-value pairs to evaluate the label condition.
         *
         * @param fieldValues the value to set
         * @return this builder
         */
        public Builder fieldValues(java.util.List<LogAnalyticsProperty> fieldValues) {
            this.fieldValues = fieldValues;
            this.__explicitlySet__.add("fieldValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidateLabelConditionDetails build() {
            ValidateLabelConditionDetails model =
                    new ValidateLabelConditionDetails(
                            this.conditionString, this.conditionBlock, this.fieldValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidateLabelConditionDetails model) {
            if (model.wasPropertyExplicitlySet("conditionString")) {
                this.conditionString(model.getConditionString());
            }
            if (model.wasPropertyExplicitlySet("conditionBlock")) {
                this.conditionBlock(model.getConditionBlock());
            }
            if (model.wasPropertyExplicitlySet("fieldValues")) {
                this.fieldValues(model.getFieldValues());
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

    /** String representation of the label condition to validate. */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionString")
    private final String conditionString;

    /**
     * String representation of the label condition to validate.
     *
     * @return the value
     */
    public String getConditionString() {
        return conditionString;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("conditionBlock")
    private final ConditionBlock conditionBlock;

    public ConditionBlock getConditionBlock() {
        return conditionBlock;
    }

    /** An array of field name-value pairs to evaluate the label condition. */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldValues")
    private final java.util.List<LogAnalyticsProperty> fieldValues;

    /**
     * An array of field name-value pairs to evaluate the label condition.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsProperty> getFieldValues() {
        return fieldValues;
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
        sb.append("ValidateLabelConditionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("conditionString=").append(String.valueOf(this.conditionString));
        sb.append(", conditionBlock=").append(String.valueOf(this.conditionBlock));
        sb.append(", fieldValues=").append(String.valueOf(this.fieldValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateLabelConditionDetails)) {
            return false;
        }

        ValidateLabelConditionDetails other = (ValidateLabelConditionDetails) o;
        return java.util.Objects.equals(this.conditionString, other.conditionString)
                && java.util.Objects.equals(this.conditionBlock, other.conditionBlock)
                && java.util.Objects.equals(this.fieldValues, other.fieldValues)
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
