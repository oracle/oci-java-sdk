/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * A parser test result field value object.
 *
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
    builder = ParserTestResultFieldValue.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ParserTestResultFieldValue
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "position",
        "fieldName",
        "value",
        "parserName",
        "subParserResult"
    })
    public ParserTestResultFieldValue(
            Long position,
            String fieldName,
            String value,
            String parserName,
            ParserTestResult subParserResult) {
        super();
        this.position = position;
        this.fieldName = fieldName;
        this.value = value;
        this.parserName = parserName;
        this.subParserResult = subParserResult;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The field position.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Long position;

        /**
         * The field position.
         * @param position the value to set
         * @return this builder
         **/
        public Builder position(Long position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }
        /**
         * The field name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        /**
         * The field name.
         * @param fieldName the value to set
         * @return this builder
         **/
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }
        /**
         * The field value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The field value.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The sub parser name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parserName")
        private String parserName;

        /**
         * The sub parser name.
         * @param parserName the value to set
         * @return this builder
         **/
        public Builder parserName(String parserName) {
            this.parserName = parserName;
            this.__explicitlySet__.add("parserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subParserResult")
        private ParserTestResult subParserResult;

        public Builder subParserResult(ParserTestResult subParserResult) {
            this.subParserResult = subParserResult;
            this.__explicitlySet__.add("subParserResult");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParserTestResultFieldValue build() {
            ParserTestResultFieldValue model =
                    new ParserTestResultFieldValue(
                            this.position,
                            this.fieldName,
                            this.value,
                            this.parserName,
                            this.subParserResult);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParserTestResultFieldValue model) {
            if (model.wasPropertyExplicitlySet("position")) {
                this.position(model.getPosition());
            }
            if (model.wasPropertyExplicitlySet("fieldName")) {
                this.fieldName(model.getFieldName());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("parserName")) {
                this.parserName(model.getParserName());
            }
            if (model.wasPropertyExplicitlySet("subParserResult")) {
                this.subParserResult(model.getSubParserResult());
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
     * The field position.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    private final Long position;

    /**
     * The field position.
     * @return the value
     **/
    public Long getPosition() {
        return position;
    }

    /**
     * The field name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    /**
     * The field name.
     * @return the value
     **/
    public String getFieldName() {
        return fieldName;
    }

    /**
     * The field value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The field value.
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * The sub parser name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserName")
    private final String parserName;

    /**
     * The sub parser name.
     * @return the value
     **/
    public String getParserName() {
        return parserName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("subParserResult")
    private final ParserTestResult subParserResult;

    public ParserTestResult getSubParserResult() {
        return subParserResult;
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
        sb.append("ParserTestResultFieldValue(");
        sb.append("super=").append(super.toString());
        sb.append("position=").append(String.valueOf(this.position));
        sb.append(", fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", parserName=").append(String.valueOf(this.parserName));
        sb.append(", subParserResult=").append(String.valueOf(this.subParserResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParserTestResultFieldValue)) {
            return false;
        }

        ParserTestResultFieldValue other = (ParserTestResultFieldValue) o;
        return java.util.Objects.equals(this.position, other.position)
                && java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.parserName, other.parserName)
                && java.util.Objects.equals(this.subParserResult, other.subParserResult)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.position == null ? 43 : this.position.hashCode());
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.parserName == null ? 43 : this.parserName.hashCode());
        result =
                (result * PRIME)
                        + (this.subParserResult == null ? 43 : this.subParserResult.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
