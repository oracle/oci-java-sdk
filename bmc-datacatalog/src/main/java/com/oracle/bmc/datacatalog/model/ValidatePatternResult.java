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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ValidatePatternResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ValidatePatternResult {
    @Deprecated
    @java.beans.ConstructorProperties({
        "message",
        "status",
        "expression",
        "filePathPrefix",
        "derivedLogicalEntities"
    })
    public ValidatePatternResult(
            String message,
            String status,
            String expression,
            String filePathPrefix,
            java.util.List<DerivedLogicalEntities> derivedLogicalEntities) {
        super();
        this.message = message;
        this.status = status;
        this.expression = expression;
        this.filePathPrefix = filePathPrefix;
        this.derivedLogicalEntities = derivedLogicalEntities;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The message from the pattern validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    public String getMessage() {
        return message;
    }

    /**
     * The status returned from the pattern validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    public String getStatus() {
        return status;
    }

    /**
     * The expression used in the pattern validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    private final String expression;

    public String getExpression() {
        return expression;
    }

    /**
     * The prefix used in the pattern validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filePathPrefix")
    private final String filePathPrefix;

    public String getFilePathPrefix() {
        return filePathPrefix;
    }

    /**
     * Collection of logical entities derived from the pattern, as applied to a list of file paths.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("derivedLogicalEntities")
    private final java.util.List<DerivedLogicalEntities> derivedLogicalEntities;

    public java.util.List<DerivedLogicalEntities> getDerivedLogicalEntities() {
        return derivedLogicalEntities;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ValidatePatternResult(");
        sb.append("message=").append(String.valueOf(this.message));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", expression=").append(String.valueOf(this.expression));
        sb.append(", filePathPrefix=").append(String.valueOf(this.filePathPrefix));
        sb.append(", derivedLogicalEntities=").append(String.valueOf(this.derivedLogicalEntities));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidatePatternResult)) {
            return false;
        }

        ValidatePatternResult other = (ValidatePatternResult) o;
        return java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.expression, other.expression)
                && java.util.Objects.equals(this.filePathPrefix, other.filePathPrefix)
                && java.util.Objects.equals(
                        this.derivedLogicalEntities, other.derivedLogicalEntities)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.expression == null ? 43 : this.expression.hashCode());
        result =
                (result * PRIME)
                        + (this.filePathPrefix == null ? 43 : this.filePathPrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.derivedLogicalEntities == null
                                ? 43
                                : this.derivedLogicalEntities.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
