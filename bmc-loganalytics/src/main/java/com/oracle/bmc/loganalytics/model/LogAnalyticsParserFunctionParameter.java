/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsParserFunctionParameter
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
    builder = LogAnalyticsParserFunctionParameter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsParserFunctionParameter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionId")
        private Long parserFunctionId;

        public Builder parserFunctionId(Long parserFunctionId) {
            this.parserFunctionId = parserFunctionId;
            this.__explicitlySet__.add("parserFunctionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionParameterName")
        private String parserFunctionParameterName;

        public Builder parserFunctionParameterName(String parserFunctionParameterName) {
            this.parserFunctionParameterName = parserFunctionParameterName;
            this.__explicitlySet__.add("parserFunctionParameterName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionParameterId")
        private Long parserFunctionParameterId;

        public Builder parserFunctionParameterId(Long parserFunctionParameterId) {
            this.parserFunctionParameterId = parserFunctionParameterId;
            this.__explicitlySet__.add("parserFunctionParameterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginParameterName")
        private String parserMetaPluginParameterName;

        public Builder parserMetaPluginParameterName(String parserMetaPluginParameterName) {
            this.parserMetaPluginParameterName = parserMetaPluginParameterName;
            this.__explicitlySet__.add("parserMetaPluginParameterName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginParameterValue")
        private String parserMetaPluginParameterValue;

        public Builder parserMetaPluginParameterValue(String parserMetaPluginParameterValue) {
            this.parserMetaPluginParameterValue = parserMetaPluginParameterValue;
            this.__explicitlySet__.add("parserMetaPluginParameterValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserName")
        private String parserName;

        public Builder parserName(String parserName) {
            this.parserName = parserName;
            this.__explicitlySet__.add("parserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginParameter")
        private LogAnalyticsParserMetaPluginParameter parserMetaPluginParameter;

        public Builder parserMetaPluginParameter(
                LogAnalyticsParserMetaPluginParameter parserMetaPluginParameter) {
            this.parserMetaPluginParameter = parserMetaPluginParameter;
            this.__explicitlySet__.add("parserMetaPluginParameter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsParserFunctionParameter build() {
            LogAnalyticsParserFunctionParameter __instance__ =
                    new LogAnalyticsParserFunctionParameter(
                            parserFunctionId,
                            parserFunctionParameterName,
                            parserFunctionParameterId,
                            parserMetaPluginParameterName,
                            parserMetaPluginParameterValue,
                            parserName,
                            parserMetaPluginParameter);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsParserFunctionParameter o) {
            Builder copiedBuilder =
                    parserFunctionId(o.getParserFunctionId())
                            .parserFunctionParameterName(o.getParserFunctionParameterName())
                            .parserFunctionParameterId(o.getParserFunctionParameterId())
                            .parserMetaPluginParameterName(o.getParserMetaPluginParameterName())
                            .parserMetaPluginParameterValue(o.getParserMetaPluginParameterValue())
                            .parserName(o.getParserName())
                            .parserMetaPluginParameter(o.getParserMetaPluginParameter());

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
     * plugin Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionId")
    Long parserFunctionId;

    /**
     * internal name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionParameterName")
    String parserFunctionParameterName;

    /**
     * plugin instance Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionParameterId")
    Long parserFunctionParameterId;

    /**
     * parameter internal name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginParameterName")
    String parserMetaPluginParameterName;

    /**
     * parameter value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginParameterValue")
    String parserMetaPluginParameterValue;

    /**
     * parser internal name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserName")
    String parserName;

    @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginParameter")
    LogAnalyticsParserMetaPluginParameter parserMetaPluginParameter;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
