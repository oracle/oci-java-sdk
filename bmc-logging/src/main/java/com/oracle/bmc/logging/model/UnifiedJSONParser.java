/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * JSON parser. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UnifiedJSONParser.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "parserType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UnifiedJSONParser extends UnifiedAgentParser {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeKey")
        private String fieldTimeKey;

        public Builder fieldTimeKey(String fieldTimeKey) {
            this.fieldTimeKey = fieldTimeKey;
            this.__explicitlySet__.add("fieldTimeKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("types")
        private java.util.Map<String, String> types;

        public Builder types(java.util.Map<String, String> types) {
            this.types = types;
            this.__explicitlySet__.add("types");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nullValuePattern")
        private String nullValuePattern;

        public Builder nullValuePattern(String nullValuePattern) {
            this.nullValuePattern = nullValuePattern;
            this.__explicitlySet__.add("nullValuePattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isNullEmptyString")
        private Boolean isNullEmptyString;

        public Builder isNullEmptyString(Boolean isNullEmptyString) {
            this.isNullEmptyString = isNullEmptyString;
            this.__explicitlySet__.add("isNullEmptyString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEstimateCurrentEvent")
        private Boolean isEstimateCurrentEvent;

        public Builder isEstimateCurrentEvent(Boolean isEstimateCurrentEvent) {
            this.isEstimateCurrentEvent = isEstimateCurrentEvent;
            this.__explicitlySet__.add("isEstimateCurrentEvent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isKeepTimeKey")
        private Boolean isKeepTimeKey;

        public Builder isKeepTimeKey(Boolean isKeepTimeKey) {
            this.isKeepTimeKey = isKeepTimeKey;
            this.__explicitlySet__.add("isKeepTimeKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMilliseconds")
        private Integer timeoutInMilliseconds;

        public Builder timeoutInMilliseconds(Integer timeoutInMilliseconds) {
            this.timeoutInMilliseconds = timeoutInMilliseconds;
            this.__explicitlySet__.add("timeoutInMilliseconds");
            return this;
        }
        /** JSON parser time type. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeType")
        private TimeType timeType;

        /**
         * JSON parser time type.
         *
         * @param timeType the value to set
         * @return this builder
         */
        public Builder timeType(TimeType timeType) {
            this.timeType = timeType;
            this.__explicitlySet__.add("timeType");
            return this;
        }
        /** Process time value using the specified format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFormat")
        private String timeFormat;

        /**
         * Process time value using the specified format.
         *
         * @param timeFormat the value to set
         * @return this builder
         */
        public Builder timeFormat(String timeFormat) {
            this.timeFormat = timeFormat;
            this.__explicitlySet__.add("timeFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedJSONParser build() {
            UnifiedJSONParser model =
                    new UnifiedJSONParser(
                            this.fieldTimeKey,
                            this.types,
                            this.nullValuePattern,
                            this.isNullEmptyString,
                            this.isEstimateCurrentEvent,
                            this.isKeepTimeKey,
                            this.timeoutInMilliseconds,
                            this.timeType,
                            this.timeFormat);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedJSONParser model) {
            if (model.wasPropertyExplicitlySet("fieldTimeKey")) {
                this.fieldTimeKey(model.getFieldTimeKey());
            }
            if (model.wasPropertyExplicitlySet("types")) {
                this.types(model.getTypes());
            }
            if (model.wasPropertyExplicitlySet("nullValuePattern")) {
                this.nullValuePattern(model.getNullValuePattern());
            }
            if (model.wasPropertyExplicitlySet("isNullEmptyString")) {
                this.isNullEmptyString(model.getIsNullEmptyString());
            }
            if (model.wasPropertyExplicitlySet("isEstimateCurrentEvent")) {
                this.isEstimateCurrentEvent(model.getIsEstimateCurrentEvent());
            }
            if (model.wasPropertyExplicitlySet("isKeepTimeKey")) {
                this.isKeepTimeKey(model.getIsKeepTimeKey());
            }
            if (model.wasPropertyExplicitlySet("timeoutInMilliseconds")) {
                this.timeoutInMilliseconds(model.getTimeoutInMilliseconds());
            }
            if (model.wasPropertyExplicitlySet("timeType")) {
                this.timeType(model.getTimeType());
            }
            if (model.wasPropertyExplicitlySet("timeFormat")) {
                this.timeFormat(model.getTimeFormat());
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

    @Deprecated
    public UnifiedJSONParser(
            String fieldTimeKey,
            java.util.Map<String, String> types,
            String nullValuePattern,
            Boolean isNullEmptyString,
            Boolean isEstimateCurrentEvent,
            Boolean isKeepTimeKey,
            Integer timeoutInMilliseconds,
            TimeType timeType,
            String timeFormat) {
        super(
                fieldTimeKey,
                types,
                nullValuePattern,
                isNullEmptyString,
                isEstimateCurrentEvent,
                isKeepTimeKey,
                timeoutInMilliseconds);
        this.timeType = timeType;
        this.timeFormat = timeFormat;
    }

    /** JSON parser time type. */
    public enum TimeType implements com.oracle.bmc.http.internal.BmcEnum {
        Float("FLOAT"),
        Unixtime("UNIXTIME"),
        String("STRING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TimeType.class);

        private final String value;
        private static java.util.Map<String, TimeType> map;

        static {
            map = new java.util.HashMap<>();
            for (TimeType v : TimeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TimeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TimeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TimeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** JSON parser time type. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeType")
    private final TimeType timeType;

    /**
     * JSON parser time type.
     *
     * @return the value
     */
    public TimeType getTimeType() {
        return timeType;
    }

    /** Process time value using the specified format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFormat")
    private final String timeFormat;

    /**
     * Process time value using the specified format.
     *
     * @return the value
     */
    public String getTimeFormat() {
        return timeFormat;
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
        sb.append("UnifiedJSONParser(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", timeType=").append(String.valueOf(this.timeType));
        sb.append(", timeFormat=").append(String.valueOf(this.timeFormat));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedJSONParser)) {
            return false;
        }

        UnifiedJSONParser other = (UnifiedJSONParser) o;
        return java.util.Objects.equals(this.timeType, other.timeType)
                && java.util.Objects.equals(this.timeFormat, other.timeFormat)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.timeType == null ? 43 : this.timeType.hashCode());
        result = (result * PRIME) + (this.timeFormat == null ? 43 : this.timeFormat.hashCode());
        return result;
    }
}
