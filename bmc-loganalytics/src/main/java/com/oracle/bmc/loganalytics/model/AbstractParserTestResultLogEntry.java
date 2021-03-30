/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * AbstractParserTestResultLogEntry
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AbstractParserTestResultLogEntry.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AbstractParserTestResultLogEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("extraInfoAttributes")
        private java.util.Map<String, String> extraInfoAttributes;

        public Builder extraInfoAttributes(java.util.Map<String, String> extraInfoAttributes) {
            this.extraInfoAttributes = extraInfoAttributes;
            this.__explicitlySet__.add("extraInfoAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldNameValueMap")
        private java.util.Map<String, String> fieldNameValueMap;

        public Builder fieldNameValueMap(java.util.Map<String, String> fieldNameValueMap) {
            this.fieldNameValueMap = fieldNameValueMap;
            this.__explicitlySet__.add("fieldNameValueMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldPositionValueMap")
        private java.util.Map<String, String> fieldPositionValueMap;

        public Builder fieldPositionValueMap(java.util.Map<String, String> fieldPositionValueMap) {
            this.fieldPositionValueMap = fieldPositionValueMap;
            this.__explicitlySet__.add("fieldPositionValueMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.Map<String, String> fields;

        public Builder fields(java.util.Map<String, String> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logEntry")
        private String logEntry;

        public Builder logEntry(String logEntry) {
            this.logEntry = logEntry;
            this.__explicitlySet__.add("logEntry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("matchStatus")
        private String matchStatus;

        public Builder matchStatus(String matchStatus) {
            this.matchStatus = matchStatus;
            this.__explicitlySet__.add("matchStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("matchStatusDescription")
        private String matchStatusDescription;

        public Builder matchStatusDescription(String matchStatusDescription) {
            this.matchStatusDescription = matchStatusDescription;
            this.__explicitlySet__.add("matchStatusDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AbstractParserTestResultLogEntry build() {
            AbstractParserTestResultLogEntry __instance__ =
                    new AbstractParserTestResultLogEntry(
                            extraInfoAttributes,
                            fieldNameValueMap,
                            fieldPositionValueMap,
                            fields,
                            logEntry,
                            matchStatus,
                            matchStatusDescription);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AbstractParserTestResultLogEntry o) {
            Builder copiedBuilder =
                    extraInfoAttributes(o.getExtraInfoAttributes())
                            .fieldNameValueMap(o.getFieldNameValueMap())
                            .fieldPositionValueMap(o.getFieldPositionValueMap())
                            .fields(o.getFields())
                            .logEntry(o.getLogEntry())
                            .matchStatus(o.getMatchStatus())
                            .matchStatusDescription(o.getMatchStatusDescription());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Extra information attributes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extraInfoAttributes")
    java.util.Map<String, String> extraInfoAttributes;

    /**
     * The field name value map.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldNameValueMap")
    java.util.Map<String, String> fieldNameValueMap;

    /**
     * The field position value map.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldPositionValueMap")
    java.util.Map<String, String> fieldPositionValueMap;

    /**
     * The parser fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    java.util.Map<String, String> fields;

    /**
     * The log entry.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logEntry")
    String logEntry;

    /**
     * The match status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchStatus")
    String matchStatus;

    /**
     * The match status description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchStatusDescription")
    String matchStatusDescription;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
