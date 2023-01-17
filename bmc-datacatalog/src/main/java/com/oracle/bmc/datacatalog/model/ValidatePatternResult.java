/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Details regarding the validation of a pattern resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ValidatePatternResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ValidatePatternResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The message from the pattern validation. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * The message from the pattern validation.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** The status returned from the pattern validation. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The status returned from the pattern validation.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The expression used in the pattern validation. */
        @com.fasterxml.jackson.annotation.JsonProperty("expression")
        private String expression;

        /**
         * The expression used in the pattern validation.
         *
         * @param expression the value to set
         * @return this builder
         */
        public Builder expression(String expression) {
            this.expression = expression;
            this.__explicitlySet__.add("expression");
            return this;
        }
        /** The prefix used in the pattern validation. */
        @com.fasterxml.jackson.annotation.JsonProperty("filePathPrefix")
        private String filePathPrefix;

        /**
         * The prefix used in the pattern validation.
         *
         * @param filePathPrefix the value to set
         * @return this builder
         */
        public Builder filePathPrefix(String filePathPrefix) {
            this.filePathPrefix = filePathPrefix;
            this.__explicitlySet__.add("filePathPrefix");
            return this;
        }
        /**
         * Collection of logical entities derived from the pattern, as applied to a list of file
         * paths.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("derivedLogicalEntities")
        private java.util.List<DerivedLogicalEntities> derivedLogicalEntities;

        /**
         * Collection of logical entities derived from the pattern, as applied to a list of file
         * paths.
         *
         * @param derivedLogicalEntities the value to set
         * @return this builder
         */
        public Builder derivedLogicalEntities(
                java.util.List<DerivedLogicalEntities> derivedLogicalEntities) {
            this.derivedLogicalEntities = derivedLogicalEntities;
            this.__explicitlySet__.add("derivedLogicalEntities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidatePatternResult build() {
            ValidatePatternResult model =
                    new ValidatePatternResult(
                            this.message,
                            this.status,
                            this.expression,
                            this.filePathPrefix,
                            this.derivedLogicalEntities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidatePatternResult model) {
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("expression")) {
                this.expression(model.getExpression());
            }
            if (model.wasPropertyExplicitlySet("filePathPrefix")) {
                this.filePathPrefix(model.getFilePathPrefix());
            }
            if (model.wasPropertyExplicitlySet("derivedLogicalEntities")) {
                this.derivedLogicalEntities(model.getDerivedLogicalEntities());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The message from the pattern validation. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * The message from the pattern validation.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** The status returned from the pattern validation. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The status returned from the pattern validation.
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** The expression used in the pattern validation. */
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    private final String expression;

    /**
     * The expression used in the pattern validation.
     *
     * @return the value
     */
    public String getExpression() {
        return expression;
    }

    /** The prefix used in the pattern validation. */
    @com.fasterxml.jackson.annotation.JsonProperty("filePathPrefix")
    private final String filePathPrefix;

    /**
     * The prefix used in the pattern validation.
     *
     * @return the value
     */
    public String getFilePathPrefix() {
        return filePathPrefix;
    }

    /**
     * Collection of logical entities derived from the pattern, as applied to a list of file paths.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("derivedLogicalEntities")
    private final java.util.List<DerivedLogicalEntities> derivedLogicalEntities;

    /**
     * Collection of logical entities derived from the pattern, as applied to a list of file paths.
     *
     * @return the value
     */
    public java.util.List<DerivedLogicalEntities> getDerivedLogicalEntities() {
        return derivedLogicalEntities;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ValidatePatternResult(");
        sb.append("super=").append(super.toString());
        sb.append("message=").append(String.valueOf(this.message));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", expression=").append(String.valueOf(this.expression));
        sb.append(", filePathPrefix=").append(String.valueOf(this.filePathPrefix));
        sb.append(", derivedLogicalEntities=").append(String.valueOf(this.derivedLogicalEntities));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
