/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
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
public class UnifiedAgentParser {

    /**
     * Specify time field for event time. If the event doesn't have this field, current time is used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeKey")
    String fieldTimeKey;

    /**
     * Specify types for converting field into other type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("types")
    java.util.Map<String, String> types;

    /**
     * Specify null value pattern
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nullValuePattern")
    String nullValuePattern;

    /**
     * If true, empty string field is replaced with nil
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isNullEmptyString")
    Boolean isNullEmptyString;

    /**
     * If true, use Fluent::EventTime.now(current time) as a timestamp when time_key is specified
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEstimateCurrentEvent")
    Boolean isEstimateCurrentEvent;

    /**
     * If true, keep time field in the record.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isKeepTimeKey")
    Boolean isKeepTimeKey;

    /**
     * Specify timeout for parse processing. This is mainly for detecting wrong regexp pattern.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMilliseconds")
    Integer timeoutInMilliseconds;

    /**
     * type of fluent parser.
     **/
    @lombok.extern.slf4j.Slf4j
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
