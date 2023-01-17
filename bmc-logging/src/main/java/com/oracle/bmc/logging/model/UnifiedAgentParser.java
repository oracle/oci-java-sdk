/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * source parser object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "parserType",
    defaultImpl = UnifiedAgentParser.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UnifiedAgentMultilineGrokParser.class,
        name = "MULTILINE_GROK"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UnifiedJSONParser.class,
        name = "JSON"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UnifiedAgentGrokParser.class,
        name = "GROK"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UnifiedAgentNoneParser.class,
        name = "NONE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UnifiedAgentSyslogParser.class,
        name = "SYSLOG"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UnifiedAgentAuditdParser.class,
        name = "AUDITD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UnifiedAgentApache2Parser.class,
        name = "APACHE2"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UnifiedAgentRegexParser.class,
        name = "REGEXP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UnifiedAgentMultilineParser.class,
        name = "MULTILINE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UnifiedAgentTsvParser.class,
        name = "TSV"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UnifiedAgentApacheErrorParser.class,
        name = "APACHE_ERROR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UnifiedAgentMsgpackParser.class,
        name = "MSGPACK"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UnifiedAgentCsvParser.class,
        name = "CSV"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UnifiedAgentParser extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "fieldTimeKey",
        "types",
        "nullValuePattern",
        "isNullEmptyString",
        "isEstimateCurrentEvent",
        "isKeepTimeKey",
        "timeoutInMilliseconds"
    })
    protected UnifiedAgentParser(
            String fieldTimeKey,
            java.util.Map<String, String> types,
            String nullValuePattern,
            Boolean isNullEmptyString,
            Boolean isEstimateCurrentEvent,
            Boolean isKeepTimeKey,
            Integer timeoutInMilliseconds) {
        super();
        this.fieldTimeKey = fieldTimeKey;
        this.types = types;
        this.nullValuePattern = nullValuePattern;
        this.isNullEmptyString = isNullEmptyString;
        this.isEstimateCurrentEvent = isEstimateCurrentEvent;
        this.isKeepTimeKey = isKeepTimeKey;
        this.timeoutInMilliseconds = timeoutInMilliseconds;
    }

    /**
     * Specify time field for the event time. If the event doesn't have this field, the current time is used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeKey")
    private final String fieldTimeKey;

    /**
     * Specify time field for the event time. If the event doesn't have this field, the current time is used.
     * @return the value
     **/
    public String getFieldTimeKey() {
        return fieldTimeKey;
    }

    /**
     * Specify types for converting a field into another type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("types")
    private final java.util.Map<String, String> types;

    /**
     * Specify types for converting a field into another type.
     * @return the value
     **/
    public java.util.Map<String, String> getTypes() {
        return types;
    }

    /**
     * Specify the null value pattern.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nullValuePattern")
    private final String nullValuePattern;

    /**
     * Specify the null value pattern.
     * @return the value
     **/
    public String getNullValuePattern() {
        return nullValuePattern;
    }

    /**
     * If true, an empty string field is replaced with nil.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isNullEmptyString")
    private final Boolean isNullEmptyString;

    /**
     * If true, an empty string field is replaced with nil.
     * @return the value
     **/
    public Boolean getIsNullEmptyString() {
        return isNullEmptyString;
    }

    /**
     * If true, use Fluent::EventTime.now(current time) as a timestamp when time_key is specified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEstimateCurrentEvent")
    private final Boolean isEstimateCurrentEvent;

    /**
     * If true, use Fluent::EventTime.now(current time) as a timestamp when time_key is specified.
     * @return the value
     **/
    public Boolean getIsEstimateCurrentEvent() {
        return isEstimateCurrentEvent;
    }

    /**
     * If true, keep time field in the record.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isKeepTimeKey")
    private final Boolean isKeepTimeKey;

    /**
     * If true, keep time field in the record.
     * @return the value
     **/
    public Boolean getIsKeepTimeKey() {
        return isKeepTimeKey;
    }

    /**
     * Specify the timeout for parse processing. This is mainly for detecting an incorrect regexp pattern.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMilliseconds")
    private final Integer timeoutInMilliseconds;

    /**
     * Specify the timeout for parse processing. This is mainly for detecting an incorrect regexp pattern.
     * @return the value
     **/
    public Integer getTimeoutInMilliseconds() {
        return timeoutInMilliseconds;
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
        sb.append("UnifiedAgentParser(");
        sb.append("super=").append(super.toString());
        sb.append("fieldTimeKey=").append(String.valueOf(this.fieldTimeKey));
        sb.append(", types=").append(String.valueOf(this.types));
        sb.append(", nullValuePattern=").append(String.valueOf(this.nullValuePattern));
        sb.append(", isNullEmptyString=").append(String.valueOf(this.isNullEmptyString));
        sb.append(", isEstimateCurrentEvent=").append(String.valueOf(this.isEstimateCurrentEvent));
        sb.append(", isKeepTimeKey=").append(String.valueOf(this.isKeepTimeKey));
        sb.append(", timeoutInMilliseconds=").append(String.valueOf(this.timeoutInMilliseconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentParser)) {
            return false;
        }

        UnifiedAgentParser other = (UnifiedAgentParser) o;
        return java.util.Objects.equals(this.fieldTimeKey, other.fieldTimeKey)
                && java.util.Objects.equals(this.types, other.types)
                && java.util.Objects.equals(this.nullValuePattern, other.nullValuePattern)
                && java.util.Objects.equals(this.isNullEmptyString, other.isNullEmptyString)
                && java.util.Objects.equals(
                        this.isEstimateCurrentEvent, other.isEstimateCurrentEvent)
                && java.util.Objects.equals(this.isKeepTimeKey, other.isKeepTimeKey)
                && java.util.Objects.equals(this.timeoutInMilliseconds, other.timeoutInMilliseconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldTimeKey == null ? 43 : this.fieldTimeKey.hashCode());
        result = (result * PRIME) + (this.types == null ? 43 : this.types.hashCode());
        result =
                (result * PRIME)
                        + (this.nullValuePattern == null ? 43 : this.nullValuePattern.hashCode());
        result =
                (result * PRIME)
                        + (this.isNullEmptyString == null ? 43 : this.isNullEmptyString.hashCode());
        result =
                (result * PRIME)
                        + (this.isEstimateCurrentEvent == null
                                ? 43
                                : this.isEstimateCurrentEvent.hashCode());
        result =
                (result * PRIME)
                        + (this.isKeepTimeKey == null ? 43 : this.isKeepTimeKey.hashCode());
        result =
                (result * PRIME)
                        + (this.timeoutInMilliseconds == null
                                ? 43
                                : this.timeoutInMilliseconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Type of fluent parser.
     **/
    public enum ParserType {
        Auditd("AUDITD"),
        Json("JSON"),
        Tsv("TSV"),
        Csv("CSV"),
        None("NONE"),
        Syslog("SYSLOG"),
        Apache2("APACHE2"),
        ApacheError("APACHE_ERROR"),
        Msgpack("MSGPACK"),
        Regexp("REGEXP"),
        Multiline("MULTILINE"),
        Grok("GROK"),
        MultilineGrok("MULTILINE_GROK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ParserType.class);

        private final String value;
        private static java.util.Map<String, ParserType> map;

        static {
            map = new java.util.HashMap<>();
            for (ParserType v : ParserType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ParserType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ParserType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ParserType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
