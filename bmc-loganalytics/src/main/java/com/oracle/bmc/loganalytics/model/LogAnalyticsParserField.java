/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsParserField
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
    builder = LogAnalyticsParserField.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsParserField {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("field")
        private LogAnalyticsField field;

        public Builder field(LogAnalyticsField field) {
            this.field = field;
            this.__explicitlySet__.add("field");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserFieldId")
        private Long parserFieldId;

        public Builder parserFieldId(Long parserFieldId) {
            this.parserFieldId = parserFieldId;
            this.__explicitlySet__.add("parserFieldId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserFieldExpression")
        private String parserFieldExpression;

        public Builder parserFieldExpression(String parserFieldExpression) {
            this.parserFieldExpression = parserFieldExpression;
            this.__explicitlySet__.add("parserFieldExpression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserFieldName")
        private String parserFieldName;

        public Builder parserFieldName(String parserFieldName) {
            this.parserFieldName = parserFieldName;
            this.__explicitlySet__.add("parserFieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageFieldName")
        private String storageFieldName;

        public Builder storageFieldName(String storageFieldName) {
            this.storageFieldName = storageFieldName;
            this.__explicitlySet__.add("storageFieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserFieldIntegratorName")
        private String parserFieldIntegratorName;

        public Builder parserFieldIntegratorName(String parserFieldIntegratorName) {
            this.parserFieldIntegratorName = parserFieldIntegratorName;
            this.__explicitlySet__.add("parserFieldIntegratorName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserName")
        private String parserName;

        public Builder parserName(String parserName) {
            this.parserName = parserName;
            this.__explicitlySet__.add("parserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserFieldSequence")
        private Long parserFieldSequence;

        public Builder parserFieldSequence(Long parserFieldSequence) {
            this.parserFieldSequence = parserFieldSequence;
            this.__explicitlySet__.add("parserFieldSequence");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parser")
        private LogAnalyticsParser parser;

        public Builder parser(LogAnalyticsParser parser) {
            this.parser = parser;
            this.__explicitlySet__.add("parser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("structuredColumnInfo")
        private String structuredColumnInfo;

        public Builder structuredColumnInfo(String structuredColumnInfo) {
            this.structuredColumnInfo = structuredColumnInfo;
            this.__explicitlySet__.add("structuredColumnInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsParserField build() {
            LogAnalyticsParserField __instance__ =
                    new LogAnalyticsParserField(
                            field,
                            parserFieldId,
                            parserFieldExpression,
                            parserFieldName,
                            storageFieldName,
                            parserFieldIntegratorName,
                            parserName,
                            parserFieldSequence,
                            parser,
                            structuredColumnInfo);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsParserField o) {
            Builder copiedBuilder =
                    field(o.getField())
                            .parserFieldId(o.getParserFieldId())
                            .parserFieldExpression(o.getParserFieldExpression())
                            .parserFieldName(o.getParserFieldName())
                            .storageFieldName(o.getStorageFieldName())
                            .parserFieldIntegratorName(o.getParserFieldIntegratorName())
                            .parserName(o.getParserName())
                            .parserFieldSequence(o.getParserFieldSequence())
                            .parser(o.getParser())
                            .structuredColumnInfo(o.getStructuredColumnInfo());

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

    @com.fasterxml.jackson.annotation.JsonProperty("field")
    LogAnalyticsField field;

    /**
     * parser field map Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFieldId")
    Long parserFieldId;

    /**
     * field expression
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFieldExpression")
    String parserFieldExpression;

    /**
     * field internal name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFieldName")
    String parserFieldName;

    /**
     * internal name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageFieldName")
    String storageFieldName;

    /**
     * integrator name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFieldIntegratorName")
    String parserFieldIntegratorName;

    /**
     * parser internal name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserName")
    String parserName;

    /**
     * sequence
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFieldSequence")
    Long parserFieldSequence;

    @com.fasterxml.jackson.annotation.JsonProperty("parser")
    LogAnalyticsParser parser;

    /**
     * structured column information
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("structuredColumnInfo")
    String structuredColumnInfo;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
