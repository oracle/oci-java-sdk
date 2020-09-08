/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceFunction
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
    builder = LogAnalyticsSourceFunction.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsSourceFunction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private java.util.List<LogAnalyticsMetaFunctionArgument> arguments;

        public Builder arguments(java.util.List<LogAnalyticsMetaFunctionArgument> arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("function")
        private LogAnalyticsMetaFunction function;

        public Builder function(LogAnalyticsMetaFunction function) {
            this.function = function;
            this.__explicitlySet__.add("function");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("functionId")
        private Long functionId;

        public Builder functionId(Long functionId) {
            this.functionId = functionId;
            this.__explicitlySet__.add("functionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("order")
        private Long order;

        public Builder order(Long order) {
            this.order = order;
            this.__explicitlySet__.add("order");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupColumn")
        private String lookupColumn;

        public Builder lookupColumn(String lookupColumn) {
            this.lookupColumn = lookupColumn;
            this.__explicitlySet__.add("lookupColumn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupColumnPosition")
        private Long lookupColumnPosition;

        public Builder lookupColumnPosition(Long lookupColumnPosition) {
            this.lookupColumnPosition = lookupColumnPosition;
            this.__explicitlySet__.add("lookupColumnPosition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupDisplayName")
        private String lookupDisplayName;

        public Builder lookupDisplayName(String lookupDisplayName) {
            this.lookupDisplayName = lookupDisplayName;
            this.__explicitlySet__.add("lookupDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupMode")
        private Long lookupMode;

        public Builder lookupMode(Long lookupMode) {
            this.lookupMode = lookupMode;
            this.__explicitlySet__.add("lookupMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupTable")
        private String lookupTable;

        public Builder lookupTable(String lookupTable) {
            this.lookupTable = lookupTable;
            this.__explicitlySet__.add("lookupTable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceFunction build() {
            LogAnalyticsSourceFunction __instance__ =
                    new LogAnalyticsSourceFunction(
                            arguments,
                            isEnabled,
                            function,
                            functionId,
                            order,
                            isSystem,
                            lookupColumn,
                            lookupColumnPosition,
                            lookupDisplayName,
                            lookupMode,
                            lookupTable,
                            sourceId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceFunction o) {
            Builder copiedBuilder =
                    arguments(o.getArguments())
                            .isEnabled(o.getIsEnabled())
                            .function(o.getFunction())
                            .functionId(o.getFunctionId())
                            .order(o.getOrder())
                            .isSystem(o.getIsSystem())
                            .lookupColumn(o.getLookupColumn())
                            .lookupColumnPosition(o.getLookupColumnPosition())
                            .lookupDisplayName(o.getLookupDisplayName())
                            .lookupMode(o.getLookupMode())
                            .lookupTable(o.getLookupTable())
                            .sourceId(o.getSourceId());

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
     * argument
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    java.util.List<LogAnalyticsMetaFunctionArgument> arguments;

    /**
     * enabled flag
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    @com.fasterxml.jackson.annotation.JsonProperty("function")
    LogAnalyticsMetaFunction function;

    /**
     * source function Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionId")
    Long functionId;

    /**
     * source function order
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("order")
    Long order;

    /**
     * is system flag
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    Boolean isSystem;

    /**
     * column
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lookupColumn")
    String lookupColumn;

    /**
     * column position
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lookupColumnPosition")
    Long lookupColumnPosition;

    /**
     * lookup display name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lookupDisplayName")
    String lookupDisplayName;

    /**
     * lookup mode
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lookupMode")
    Long lookupMode;

    /**
     * lookup table
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lookupTable")
    String lookupTable;

    /**
     * source Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    Long sourceId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
