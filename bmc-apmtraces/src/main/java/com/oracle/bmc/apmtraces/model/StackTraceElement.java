/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Stack trace element.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StackTraceElement.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class StackTraceElement {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("methodName")
        private String methodName;

        public Builder methodName(String methodName) {
            this.methodName = methodName;
            this.__explicitlySet__.add("methodName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fileName")
        private String fileName;

        public Builder fileName(String fileName) {
            this.fileName = fileName;
            this.__explicitlySet__.add("fileName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lineNumber")
        private Integer lineNumber;

        public Builder lineNumber(Integer lineNumber) {
            this.lineNumber = lineNumber;
            this.__explicitlySet__.add("lineNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("className")
        private String className;

        public Builder className(String className) {
            this.className = className;
            this.__explicitlySet__.add("className");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("weightage")
        private Float weightage;

        public Builder weightage(Float weightage) {
            this.weightage = weightage;
            this.__explicitlySet__.add("weightage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StackTraceElement build() {
            StackTraceElement __instance__ =
                    new StackTraceElement(methodName, fileName, lineNumber, className, weightage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StackTraceElement o) {
            Builder copiedBuilder =
                    methodName(o.getMethodName())
                            .fileName(o.getFileName())
                            .lineNumber(o.getLineNumber())
                            .className(o.getClassName())
                            .weightage(o.getWeightage());

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
     * Name of the method containing the execution point.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("methodName")
    String methodName;

    /**
     * Name of the source file containing the execution point.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileName")
    String fileName;

    /**
     * Line number of the source line containing the execution point.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lineNumber")
    Integer lineNumber;

    /**
     * Name of the class containing the execution point.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("className")
    String className;

    /**
     * The weight distribution that denotes the percentage occurrence of a method in the captured snapshots.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weightage")
    Float weightage;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
