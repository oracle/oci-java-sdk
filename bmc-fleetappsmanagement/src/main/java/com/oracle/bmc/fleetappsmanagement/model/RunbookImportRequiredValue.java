/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Runbook import required value. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RunbookImportRequiredValue.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RunbookImportRequiredValue
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"stepName", "placeholder", "value", "field"})
    public RunbookImportRequiredValue(
            String stepName, String placeholder, String value, String field) {
        super();
        this.stepName = stepName;
        this.placeholder = placeholder;
        this.value = value;
        this.field = field;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Stepname for required value. */
        @com.fasterxml.jackson.annotation.JsonProperty("stepName")
        private String stepName;

        /**
         * Stepname for required value.
         *
         * @param stepName the value to set
         * @return this builder
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            this.__explicitlySet__.add("stepName");
            return this;
        }
        /** Placeholder for required value. */
        @com.fasterxml.jackson.annotation.JsonProperty("placeholder")
        private String placeholder;

        /**
         * Placeholder for required value.
         *
         * @param placeholder the value to set
         * @return this builder
         */
        public Builder placeholder(String placeholder) {
            this.placeholder = placeholder;
            this.__explicitlySet__.add("placeholder");
            return this;
        }
        /** Value for required value. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Value for required value.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** Field for required value. */
        @com.fasterxml.jackson.annotation.JsonProperty("field")
        private String field;

        /**
         * Field for required value.
         *
         * @param field the value to set
         * @return this builder
         */
        public Builder field(String field) {
            this.field = field;
            this.__explicitlySet__.add("field");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RunbookImportRequiredValue build() {
            RunbookImportRequiredValue model =
                    new RunbookImportRequiredValue(
                            this.stepName, this.placeholder, this.value, this.field);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RunbookImportRequiredValue model) {
            if (model.wasPropertyExplicitlySet("stepName")) {
                this.stepName(model.getStepName());
            }
            if (model.wasPropertyExplicitlySet("placeholder")) {
                this.placeholder(model.getPlaceholder());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("field")) {
                this.field(model.getField());
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

    /** Stepname for required value. */
    @com.fasterxml.jackson.annotation.JsonProperty("stepName")
    private final String stepName;

    /**
     * Stepname for required value.
     *
     * @return the value
     */
    public String getStepName() {
        return stepName;
    }

    /** Placeholder for required value. */
    @com.fasterxml.jackson.annotation.JsonProperty("placeholder")
    private final String placeholder;

    /**
     * Placeholder for required value.
     *
     * @return the value
     */
    public String getPlaceholder() {
        return placeholder;
    }

    /** Value for required value. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Value for required value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** Field for required value. */
    @com.fasterxml.jackson.annotation.JsonProperty("field")
    private final String field;

    /**
     * Field for required value.
     *
     * @return the value
     */
    public String getField() {
        return field;
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
        sb.append("RunbookImportRequiredValue(");
        sb.append("super=").append(super.toString());
        sb.append("stepName=").append(String.valueOf(this.stepName));
        sb.append(", placeholder=").append(String.valueOf(this.placeholder));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", field=").append(String.valueOf(this.field));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunbookImportRequiredValue)) {
            return false;
        }

        RunbookImportRequiredValue other = (RunbookImportRequiredValue) o;
        return java.util.Objects.equals(this.stepName, other.stepName)
                && java.util.Objects.equals(this.placeholder, other.placeholder)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.field, other.field)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stepName == null ? 43 : this.stepName.hashCode());
        result = (result * PRIME) + (this.placeholder == null ? 43 : this.placeholder.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.field == null ? 43 : this.field.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
