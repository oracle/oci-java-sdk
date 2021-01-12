/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsMetaFunctionArgument
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
    builder = LogAnalyticsMetaFunctionArgument.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsMetaFunctionArgument {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isOverrideOutputFields")
        private Boolean isOverrideOutputFields;

        public Builder isOverrideOutputFields(Boolean isOverrideOutputFields) {
            this.isOverrideOutputFields = isOverrideOutputFields;
            this.__explicitlySet__.add("isOverrideOutputFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentDisplayName")
        private String argumentDisplayName;

        public Builder argumentDisplayName(String argumentDisplayName) {
            this.argumentDisplayName = argumentDisplayName;
            this.__explicitlySet__.add("argumentDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentExample")
        private String argumentExample;

        public Builder argumentExample(String argumentExample) {
            this.argumentExample = argumentExample;
            this.__explicitlySet__.add("argumentExample");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentService")
        private String argumentService;

        public Builder argumentService(String argumentService) {
            this.argumentService = argumentService;
            this.__explicitlySet__.add("argumentService");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentDataType")
        private String argumentDataType;

        public Builder argumentDataType(String argumentDataType) {
            this.argumentDataType = argumentDataType;
            this.__explicitlySet__.add("argumentDataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentDescription")
        private String argumentDescription;

        public Builder argumentDescription(String argumentDescription) {
            this.argumentDescription = argumentDescription;
            this.__explicitlySet__.add("argumentDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentName")
        private String argumentName;

        public Builder argumentName(String argumentName) {
            this.argumentName = argumentName;
            this.__explicitlySet__.add("argumentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentOrder")
        private Long argumentOrder;

        public Builder argumentOrder(Long argumentOrder) {
            this.argumentOrder = argumentOrder;
            this.__explicitlySet__.add("argumentOrder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentType")
        private Long argumentType;

        public Builder argumentType(Long argumentType) {
            this.argumentType = argumentType;
            this.__explicitlySet__.add("argumentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentId")
        private Long argumentId;

        public Builder argumentId(Long argumentId) {
            this.argumentId = argumentId;
            this.__explicitlySet__.add("argumentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentLookupColumn")
        private String argumentLookupColumn;

        public Builder argumentLookupColumn(String argumentLookupColumn) {
            this.argumentLookupColumn = argumentLookupColumn;
            this.__explicitlySet__.add("argumentLookupColumn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentLookupColumnPosition")
        private Long argumentLookupColumnPosition;

        public Builder argumentLookupColumnPosition(Long argumentLookupColumnPosition) {
            this.argumentLookupColumnPosition = argumentLookupColumnPosition;
            this.__explicitlySet__.add("argumentLookupColumnPosition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentValue")
        private String argumentValue;

        public Builder argumentValue(String argumentValue) {
            this.argumentValue = argumentValue;
            this.__explicitlySet__.add("argumentValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsMetaFunctionArgument build() {
            LogAnalyticsMetaFunctionArgument __instance__ =
                    new LogAnalyticsMetaFunctionArgument(
                            isOverrideOutputFields,
                            argumentDisplayName,
                            argumentExample,
                            argumentService,
                            argumentDataType,
                            argumentDescription,
                            argumentName,
                            argumentOrder,
                            argumentType,
                            argumentId,
                            argumentLookupColumn,
                            argumentLookupColumnPosition,
                            argumentValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsMetaFunctionArgument o) {
            Builder copiedBuilder =
                    isOverrideOutputFields(o.getIsOverrideOutputFields())
                            .argumentDisplayName(o.getArgumentDisplayName())
                            .argumentExample(o.getArgumentExample())
                            .argumentService(o.getArgumentService())
                            .argumentDataType(o.getArgumentDataType())
                            .argumentDescription(o.getArgumentDescription())
                            .argumentName(o.getArgumentName())
                            .argumentOrder(o.getArgumentOrder())
                            .argumentType(o.getArgumentType())
                            .argumentId(o.getArgumentId())
                            .argumentLookupColumn(o.getArgumentLookupColumn())
                            .argumentLookupColumnPosition(o.getArgumentLookupColumnPosition())
                            .argumentValue(o.getArgumentValue());

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
     * override output fields
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOverrideOutputFields")
    Boolean isOverrideOutputFields;

    /**
     * argument display name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentDisplayName")
    String argumentDisplayName;

    /**
     * argument example
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentExample")
    String argumentExample;

    /**
     * argument service
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentService")
    String argumentService;

    /**
     * argument data type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentDataType")
    String argumentDataType;

    /**
     * argument description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentDescription")
    String argumentDescription;

    /**
     * argument name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentName")
    String argumentName;

    /**
     * argument order
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentOrder")
    Long argumentOrder;

    /**
     * argument type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentType")
    Long argumentType;

    /**
     * meta function id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentId")
    Long argumentId;

    /**
     * column
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentLookupColumn")
    String argumentLookupColumn;

    /**
     * column position
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentLookupColumnPosition")
    Long argumentLookupColumnPosition;

    /**
     * value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentValue")
    String argumentValue;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
