/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Logging parser filter object.
 * Ref: https://docs.fluentd.org/filter/parser
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UnifiedAgentParserFilter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "filterType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UnifiedAgentParserFilter extends UnifiedAgentLoggingFilter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parser")
        private UnifiedAgentParser parser;

        public Builder parser(UnifiedAgentParser parser) {
            this.parser = parser;
            this.__explicitlySet__.add("parser");
            return this;
        }
        /**
         * The field name in the record to parse.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyName")
        private String keyName;

        /**
         * The field name in the record to parse.
         * @param keyName the value to set
         * @return this builder
         **/
        public Builder keyName(String keyName) {
            this.keyName = keyName;
            this.__explicitlySet__.add("keyName");
            return this;
        }
        /**
         * If true, keep the original event time in the parsed result.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reserveTime")
        private Boolean reserveTime;

        /**
         * If true, keep the original event time in the parsed result.
         * @param reserveTime the value to set
         * @return this builder
         **/
        public Builder reserveTime(Boolean reserveTime) {
            this.reserveTime = reserveTime;
            this.__explicitlySet__.add("reserveTime");
            return this;
        }
        /**
         * If true, keep the original key-value pair in the parsed result.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reserveData")
        private Boolean reserveData;

        /**
         * If true, keep the original key-value pair in the parsed result.
         * @param reserveData the value to set
         * @return this builder
         **/
        public Builder reserveData(Boolean reserveData) {
            this.reserveData = reserveData;
            this.__explicitlySet__.add("reserveData");
            return this;
        }
        /**
         * If true, remove the keyName field when parsing is succeeded.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("removeKeyNameField")
        private Boolean removeKeyNameField;

        /**
         * If true, remove the keyName field when parsing is succeeded.
         * @param removeKeyNameField the value to set
         * @return this builder
         **/
        public Builder removeKeyNameField(Boolean removeKeyNameField) {
            this.removeKeyNameField = removeKeyNameField;
            this.__explicitlySet__.add("removeKeyNameField");
            return this;
        }
        /**
         * If true, the invalid string is replaced with safe characters and is re-parsed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("replaceInvalidSequence")
        private Boolean replaceInvalidSequence;

        /**
         * If true, the invalid string is replaced with safe characters and is re-parsed.
         * @param replaceInvalidSequence the value to set
         * @return this builder
         **/
        public Builder replaceInvalidSequence(Boolean replaceInvalidSequence) {
            this.replaceInvalidSequence = replaceInvalidSequence;
            this.__explicitlySet__.add("replaceInvalidSequence");
            return this;
        }
        /**
         * Store the parsed values with the specified key name prefix.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("injectKeyPrefix")
        private String injectKeyPrefix;

        /**
         * Store the parsed values with the specified key name prefix.
         * @param injectKeyPrefix the value to set
         * @return this builder
         **/
        public Builder injectKeyPrefix(String injectKeyPrefix) {
            this.injectKeyPrefix = injectKeyPrefix;
            this.__explicitlySet__.add("injectKeyPrefix");
            return this;
        }
        /**
         * Store the parsed values as a hash value in a field.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hashValueField")
        private String hashValueField;

        /**
         * Store the parsed values as a hash value in a field.
         * @param hashValueField the value to set
         * @return this builder
         **/
        public Builder hashValueField(String hashValueField) {
            this.hashValueField = hashValueField;
            this.__explicitlySet__.add("hashValueField");
            return this;
        }
        /**
         * If true, emit invalid record to @ERROR label. Invalid cases are: 1) key does not exist; 2) the format
         * does not match; or 3) an unexpected error. You can rescue unexpected format logs in the @ERROR lable.
         * If you want to ignore these errors, set this to false.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emitInvalidRecordToError")
        private Boolean emitInvalidRecordToError;

        /**
         * If true, emit invalid record to @ERROR label. Invalid cases are: 1) key does not exist; 2) the format
         * does not match; or 3) an unexpected error. You can rescue unexpected format logs in the @ERROR lable.
         * If you want to ignore these errors, set this to false.
         *
         * @param emitInvalidRecordToError the value to set
         * @return this builder
         **/
        public Builder emitInvalidRecordToError(Boolean emitInvalidRecordToError) {
            this.emitInvalidRecordToError = emitInvalidRecordToError;
            this.__explicitlySet__.add("emitInvalidRecordToError");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentParserFilter build() {
            UnifiedAgentParserFilter model =
                    new UnifiedAgentParserFilter(
                            this.name,
                            this.parser,
                            this.keyName,
                            this.reserveTime,
                            this.reserveData,
                            this.removeKeyNameField,
                            this.replaceInvalidSequence,
                            this.injectKeyPrefix,
                            this.hashValueField,
                            this.emitInvalidRecordToError);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentParserFilter model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("parser")) {
                this.parser(model.getParser());
            }
            if (model.wasPropertyExplicitlySet("keyName")) {
                this.keyName(model.getKeyName());
            }
            if (model.wasPropertyExplicitlySet("reserveTime")) {
                this.reserveTime(model.getReserveTime());
            }
            if (model.wasPropertyExplicitlySet("reserveData")) {
                this.reserveData(model.getReserveData());
            }
            if (model.wasPropertyExplicitlySet("removeKeyNameField")) {
                this.removeKeyNameField(model.getRemoveKeyNameField());
            }
            if (model.wasPropertyExplicitlySet("replaceInvalidSequence")) {
                this.replaceInvalidSequence(model.getReplaceInvalidSequence());
            }
            if (model.wasPropertyExplicitlySet("injectKeyPrefix")) {
                this.injectKeyPrefix(model.getInjectKeyPrefix());
            }
            if (model.wasPropertyExplicitlySet("hashValueField")) {
                this.hashValueField(model.getHashValueField());
            }
            if (model.wasPropertyExplicitlySet("emitInvalidRecordToError")) {
                this.emitInvalidRecordToError(model.getEmitInvalidRecordToError());
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

    @Deprecated
    public UnifiedAgentParserFilter(
            String name,
            UnifiedAgentParser parser,
            String keyName,
            Boolean reserveTime,
            Boolean reserveData,
            Boolean removeKeyNameField,
            Boolean replaceInvalidSequence,
            String injectKeyPrefix,
            String hashValueField,
            Boolean emitInvalidRecordToError) {
        super(name);
        this.parser = parser;
        this.keyName = keyName;
        this.reserveTime = reserveTime;
        this.reserveData = reserveData;
        this.removeKeyNameField = removeKeyNameField;
        this.replaceInvalidSequence = replaceInvalidSequence;
        this.injectKeyPrefix = injectKeyPrefix;
        this.hashValueField = hashValueField;
        this.emitInvalidRecordToError = emitInvalidRecordToError;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parser")
    private final UnifiedAgentParser parser;

    public UnifiedAgentParser getParser() {
        return parser;
    }

    /**
     * The field name in the record to parse.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyName")
    private final String keyName;

    /**
     * The field name in the record to parse.
     * @return the value
     **/
    public String getKeyName() {
        return keyName;
    }

    /**
     * If true, keep the original event time in the parsed result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reserveTime")
    private final Boolean reserveTime;

    /**
     * If true, keep the original event time in the parsed result.
     * @return the value
     **/
    public Boolean getReserveTime() {
        return reserveTime;
    }

    /**
     * If true, keep the original key-value pair in the parsed result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reserveData")
    private final Boolean reserveData;

    /**
     * If true, keep the original key-value pair in the parsed result.
     * @return the value
     **/
    public Boolean getReserveData() {
        return reserveData;
    }

    /**
     * If true, remove the keyName field when parsing is succeeded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("removeKeyNameField")
    private final Boolean removeKeyNameField;

    /**
     * If true, remove the keyName field when parsing is succeeded.
     * @return the value
     **/
    public Boolean getRemoveKeyNameField() {
        return removeKeyNameField;
    }

    /**
     * If true, the invalid string is replaced with safe characters and is re-parsed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replaceInvalidSequence")
    private final Boolean replaceInvalidSequence;

    /**
     * If true, the invalid string is replaced with safe characters and is re-parsed.
     * @return the value
     **/
    public Boolean getReplaceInvalidSequence() {
        return replaceInvalidSequence;
    }

    /**
     * Store the parsed values with the specified key name prefix.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("injectKeyPrefix")
    private final String injectKeyPrefix;

    /**
     * Store the parsed values with the specified key name prefix.
     * @return the value
     **/
    public String getInjectKeyPrefix() {
        return injectKeyPrefix;
    }

    /**
     * Store the parsed values as a hash value in a field.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hashValueField")
    private final String hashValueField;

    /**
     * Store the parsed values as a hash value in a field.
     * @return the value
     **/
    public String getHashValueField() {
        return hashValueField;
    }

    /**
     * If true, emit invalid record to @ERROR label. Invalid cases are: 1) key does not exist; 2) the format
     * does not match; or 3) an unexpected error. You can rescue unexpected format logs in the @ERROR lable.
     * If you want to ignore these errors, set this to false.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emitInvalidRecordToError")
    private final Boolean emitInvalidRecordToError;

    /**
     * If true, emit invalid record to @ERROR label. Invalid cases are: 1) key does not exist; 2) the format
     * does not match; or 3) an unexpected error. You can rescue unexpected format logs in the @ERROR lable.
     * If you want to ignore these errors, set this to false.
     *
     * @return the value
     **/
    public Boolean getEmitInvalidRecordToError() {
        return emitInvalidRecordToError;
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
        sb.append("UnifiedAgentParserFilter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", parser=").append(String.valueOf(this.parser));
        sb.append(", keyName=").append(String.valueOf(this.keyName));
        sb.append(", reserveTime=").append(String.valueOf(this.reserveTime));
        sb.append(", reserveData=").append(String.valueOf(this.reserveData));
        sb.append(", removeKeyNameField=").append(String.valueOf(this.removeKeyNameField));
        sb.append(", replaceInvalidSequence=").append(String.valueOf(this.replaceInvalidSequence));
        sb.append(", injectKeyPrefix=").append(String.valueOf(this.injectKeyPrefix));
        sb.append(", hashValueField=").append(String.valueOf(this.hashValueField));
        sb.append(", emitInvalidRecordToError=")
                .append(String.valueOf(this.emitInvalidRecordToError));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentParserFilter)) {
            return false;
        }

        UnifiedAgentParserFilter other = (UnifiedAgentParserFilter) o;
        return java.util.Objects.equals(this.parser, other.parser)
                && java.util.Objects.equals(this.keyName, other.keyName)
                && java.util.Objects.equals(this.reserveTime, other.reserveTime)
                && java.util.Objects.equals(this.reserveData, other.reserveData)
                && java.util.Objects.equals(this.removeKeyNameField, other.removeKeyNameField)
                && java.util.Objects.equals(
                        this.replaceInvalidSequence, other.replaceInvalidSequence)
                && java.util.Objects.equals(this.injectKeyPrefix, other.injectKeyPrefix)
                && java.util.Objects.equals(this.hashValueField, other.hashValueField)
                && java.util.Objects.equals(
                        this.emitInvalidRecordToError, other.emitInvalidRecordToError)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.parser == null ? 43 : this.parser.hashCode());
        result = (result * PRIME) + (this.keyName == null ? 43 : this.keyName.hashCode());
        result = (result * PRIME) + (this.reserveTime == null ? 43 : this.reserveTime.hashCode());
        result = (result * PRIME) + (this.reserveData == null ? 43 : this.reserveData.hashCode());
        result =
                (result * PRIME)
                        + (this.removeKeyNameField == null
                                ? 43
                                : this.removeKeyNameField.hashCode());
        result =
                (result * PRIME)
                        + (this.replaceInvalidSequence == null
                                ? 43
                                : this.replaceInvalidSequence.hashCode());
        result =
                (result * PRIME)
                        + (this.injectKeyPrefix == null ? 43 : this.injectKeyPrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.hashValueField == null ? 43 : this.hashValueField.hashCode());
        result =
                (result * PRIME)
                        + (this.emitInvalidRecordToError == null
                                ? 43
                                : this.emitInvalidRecordToError.hashCode());
        return result;
    }
}
