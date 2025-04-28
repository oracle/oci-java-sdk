/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Parsed field response. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ParsedField.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ParsedField extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"logContent", "fieldValues"})
    public ParsedField(String logContent, java.util.List<String> fieldValues) {
        super();
        this.logContent = logContent;
        this.fieldValues = fieldValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Sample log entries picked up from the given file for validation. */
        @com.fasterxml.jackson.annotation.JsonProperty("logContent")
        private String logContent;

        /**
         * Sample log entries picked up from the given file for validation.
         *
         * @param logContent the value to set
         * @return this builder
         */
        public Builder logContent(String logContent) {
            this.logContent = logContent;
            this.__explicitlySet__.add("logContent");
            return this;
        }
        /** List of field Values. */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldValues")
        private java.util.List<String> fieldValues;

        /**
         * List of field Values.
         *
         * @param fieldValues the value to set
         * @return this builder
         */
        public Builder fieldValues(java.util.List<String> fieldValues) {
            this.fieldValues = fieldValues;
            this.__explicitlySet__.add("fieldValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParsedField build() {
            ParsedField model = new ParsedField(this.logContent, this.fieldValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParsedField model) {
            if (model.wasPropertyExplicitlySet("logContent")) {
                this.logContent(model.getLogContent());
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

    /** Sample log entries picked up from the given file for validation. */
    @com.fasterxml.jackson.annotation.JsonProperty("logContent")
    private final String logContent;

    /**
     * Sample log entries picked up from the given file for validation.
     *
     * @return the value
     */
    public String getLogContent() {
        return logContent;
    }

    /** List of field Values. */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldValues")
    private final java.util.List<String> fieldValues;

    /**
     * List of field Values.
     *
     * @return the value
     */
    public java.util.List<String> getFieldValues() {
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
        sb.append("ParsedField(");
        sb.append("super=").append(super.toString());
        sb.append("logContent=").append(String.valueOf(this.logContent));
        sb.append(", fieldValues=").append(String.valueOf(this.fieldValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParsedField)) {
            return false;
        }

        ParsedField other = (ParsedField) o;
        return java.util.Objects.equals(this.logContent, other.logContent)
                && java.util.Objects.equals(this.fieldValues, other.fieldValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.logContent == null ? 43 : this.logContent.hashCode());
        result = (result * PRIME) + (this.fieldValues == null ? 43 : this.fieldValues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
