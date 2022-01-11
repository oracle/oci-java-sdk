/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Details regarding the validation of a pattern resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ValidatePatternResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ValidatePatternResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expression")
        private String expression;

        public Builder expression(String expression) {
            this.expression = expression;
            this.__explicitlySet__.add("expression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filePathPrefix")
        private String filePathPrefix;

        public Builder filePathPrefix(String filePathPrefix) {
            this.filePathPrefix = filePathPrefix;
            this.__explicitlySet__.add("filePathPrefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("derivedLogicalEntities")
        private java.util.List<DerivedLogicalEntities> derivedLogicalEntities;

        public Builder derivedLogicalEntities(
                java.util.List<DerivedLogicalEntities> derivedLogicalEntities) {
            this.derivedLogicalEntities = derivedLogicalEntities;
            this.__explicitlySet__.add("derivedLogicalEntities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidatePatternResult build() {
            ValidatePatternResult __instance__ =
                    new ValidatePatternResult(
                            message, status, expression, filePathPrefix, derivedLogicalEntities);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidatePatternResult o) {
            Builder copiedBuilder =
                    message(o.getMessage())
                            .status(o.getStatus())
                            .expression(o.getExpression())
                            .filePathPrefix(o.getFilePathPrefix())
                            .derivedLogicalEntities(o.getDerivedLogicalEntities());

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
     * The message from the pattern validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    String message;

    /**
     * The status returned from the pattern validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    String status;

    /**
     * The expression used in the pattern validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    String expression;

    /**
     * The prefix used in the pattern validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filePathPrefix")
    String filePathPrefix;

    /**
     * Collection of logical entities derived from the pattern, as applied to a list of file paths.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("derivedLogicalEntities")
    java.util.List<DerivedLogicalEntities> derivedLogicalEntities;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
