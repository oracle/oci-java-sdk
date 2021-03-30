/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsParserFunction
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
    builder = LogAnalyticsParserFunction.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsParserFunction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPlugin")
        private LogAnalyticsParserMetaPlugin parserMetaPlugin;

        public Builder parserMetaPlugin(LogAnalyticsParserMetaPlugin parserMetaPlugin) {
            this.parserMetaPlugin = parserMetaPlugin;
            this.__explicitlySet__.add("parserMetaPlugin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionId")
        private Long parserFunctionId;

        public Builder parserFunctionId(Long parserFunctionId) {
            this.parserFunctionId = parserFunctionId;
            this.__explicitlySet__.add("parserFunctionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionName")
        private String parserFunctionName;

        public Builder parserFunctionName(String parserFunctionName) {
            this.parserFunctionName = parserFunctionName;
            this.__explicitlySet__.add("parserFunctionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserId")
        private Long parserId;

        public Builder parserId(Long parserId) {
            this.parserId = parserId;
            this.__explicitlySet__.add("parserId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserName")
        private String parserName;

        public Builder parserName(String parserName) {
            this.parserName = parserName;
            this.__explicitlySet__.add("parserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginName")
        private String parserMetaPluginName;

        public Builder parserMetaPluginName(String parserMetaPluginName) {
            this.parserMetaPluginName = parserMetaPluginName;
            this.__explicitlySet__.add("parserMetaPluginName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionPriority")
        private Long parserFunctionPriority;

        public Builder parserFunctionPriority(Long parserFunctionPriority) {
            this.parserFunctionPriority = parserFunctionPriority;
            this.__explicitlySet__.add("parserFunctionPriority");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionParameters")
        private java.util.List<LogAnalyticsParserFunctionParameter> parserFunctionParameters;

        public Builder parserFunctionParameters(
                java.util.List<LogAnalyticsParserFunctionParameter> parserFunctionParameters) {
            this.parserFunctionParameters = parserFunctionParameters;
            this.__explicitlySet__.add("parserFunctionParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsParserFunction build() {
            LogAnalyticsParserFunction __instance__ =
                    new LogAnalyticsParserFunction(
                            parserMetaPlugin,
                            parserFunctionId,
                            parserFunctionName,
                            isEnabled,
                            isSystem,
                            parserId,
                            parserName,
                            parserMetaPluginName,
                            parserFunctionPriority,
                            parserFunctionParameters);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsParserFunction o) {
            Builder copiedBuilder =
                    parserMetaPlugin(o.getParserMetaPlugin())
                            .parserFunctionId(o.getParserFunctionId())
                            .parserFunctionName(o.getParserFunctionName())
                            .isEnabled(o.getIsEnabled())
                            .isSystem(o.getIsSystem())
                            .parserId(o.getParserId())
                            .parserName(o.getParserName())
                            .parserMetaPluginName(o.getParserMetaPluginName())
                            .parserFunctionPriority(o.getParserFunctionPriority())
                            .parserFunctionParameters(o.getParserFunctionParameters());

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

    @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPlugin")
    LogAnalyticsParserMetaPlugin parserMetaPlugin;

    /**
     * The parser function unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionId")
    Long parserFunctionId;

    /**
     * The parser function internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionName")
    String parserFunctionName;

    /**
     * A flag inidcating whether or not the parser function is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    Boolean isSystem;

    /**
     * The associated parser unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserId")
    Long parserId;

    /**
     * The associated parser internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserName")
    String parserName;

    /**
     * The plugin internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginName")
    String parserMetaPluginName;

    /**
     * The parser function priority.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionPriority")
    Long parserFunctionPriority;

    /**
     * The parser function parameter list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionParameters")
    java.util.List<LogAnalyticsParserFunctionParameter> parserFunctionParameters;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
