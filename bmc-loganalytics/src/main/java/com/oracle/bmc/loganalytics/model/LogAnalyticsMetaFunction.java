/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsMetaFunction
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
    builder = LogAnalyticsMetaFunction.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsMetaFunction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("metaFunctionArgument")
        private java.util.List<LogAnalyticsMetaFunctionArgument> metaFunctionArgument;

        public Builder metaFunctionArgument(
                java.util.List<LogAnalyticsMetaFunctionArgument> metaFunctionArgument) {
            this.metaFunctionArgument = metaFunctionArgument;
            this.__explicitlySet__.add("metaFunctionArgument");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("component")
        private String component;

        public Builder component(String component) {
            this.component = component;
            this.__explicitlySet__.add("component");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
        private Long editVersion;

        public Builder editVersion(Long editVersion) {
            this.editVersion = editVersion;
            this.__explicitlySet__.add("editVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metaFunctionId")
        private Long metaFunctionId;

        public Builder metaFunctionId(Long metaFunctionId) {
            this.metaFunctionId = metaFunctionId;
            this.__explicitlySet__.add("metaFunctionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("javaClassName")
        private String javaClassName;

        public Builder javaClassName(String javaClassName) {
            this.javaClassName = javaClassName;
            this.__explicitlySet__.add("javaClassName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsMetaFunction build() {
            LogAnalyticsMetaFunction __instance__ =
                    new LogAnalyticsMetaFunction(
                            metaFunctionArgument,
                            component,
                            description,
                            editVersion,
                            metaFunctionId,
                            javaClassName,
                            name);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsMetaFunction o) {
            Builder copiedBuilder =
                    metaFunctionArgument(o.getMetaFunctionArgument())
                            .component(o.getComponent())
                            .description(o.getDescription())
                            .editVersion(o.getEditVersion())
                            .metaFunctionId(o.getMetaFunctionId())
                            .javaClassName(o.getJavaClassName())
                            .name(o.getName());

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
     * meta function argument object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metaFunctionArgument")
    java.util.List<LogAnalyticsMetaFunctionArgument> metaFunctionArgument;

    /**
     * component
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("component")
    String component;

    /**
     * description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * edit version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    Long editVersion;

    /**
     * meta function Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metaFunctionId")
    Long metaFunctionId;

    /**
     * java class name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("javaClassName")
    String javaClassName;

    /**
     * meta function name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
