/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Parsed representation of the log file.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ParsedContent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ParsedContent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("fieldNames")
        private java.util.List<String> fieldNames;

        public Builder fieldNames(java.util.List<String> fieldNames) {
            this.fieldNames = fieldNames;
            this.__explicitlySet__.add("fieldNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldDisplayNames")
        private java.util.List<String> fieldDisplayNames;

        public Builder fieldDisplayNames(java.util.List<String> fieldDisplayNames) {
            this.fieldDisplayNames = fieldDisplayNames;
            this.__explicitlySet__.add("fieldDisplayNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parsedFieldValues")
        private java.util.List<ParsedField> parsedFieldValues;

        public Builder parsedFieldValues(java.util.List<ParsedField> parsedFieldValues) {
            this.parsedFieldValues = parsedFieldValues;
            this.__explicitlySet__.add("parsedFieldValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logContent")
        private String logContent;

        public Builder logContent(String logContent) {
            this.logContent = logContent;
            this.__explicitlySet__.add("logContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sampleSize")
        private Integer sampleSize;

        public Builder sampleSize(Integer sampleSize) {
            this.sampleSize = sampleSize;
            this.__explicitlySet__.add("sampleSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("matchStatus")
        private String matchStatus;

        public Builder matchStatus(String matchStatus) {
            this.matchStatus = matchStatus;
            this.__explicitlySet__.add("matchStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParsedContent build() {
            ParsedContent __instance__ =
                    new ParsedContent(
                            fieldNames,
                            fieldDisplayNames,
                            parsedFieldValues,
                            logContent,
                            sampleSize,
                            matchStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParsedContent o) {
            Builder copiedBuilder =
                    fieldNames(o.getFieldNames())
                            .fieldDisplayNames(o.getFieldDisplayNames())
                            .parsedFieldValues(o.getParsedFieldValues())
                            .logContent(o.getLogContent())
                            .sampleSize(o.getSampleSize())
                            .matchStatus(o.getMatchStatus());

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
     * List of field names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldNames")
    java.util.List<String> fieldNames;

    /**
     * List of field display names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldDisplayNames")
    java.util.List<String> fieldDisplayNames;

    /**
     * Parsed field values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parsedFieldValues")
    java.util.List<ParsedField> parsedFieldValues;

    /**
     * Sample log entries picked up from the given file for validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logContent")
    String logContent;

    /**
     * Sample Size taken for validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sampleSize")
    Integer sampleSize;

    /**
     * Match Status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchStatus")
    String matchStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
