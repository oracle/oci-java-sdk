/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * An example line of the recommendation
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RecommendationExampleLine.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RecommendationExampleLine
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"operation", "comment"})
    public RecommendationExampleLine(String operation, String comment) {
        super();
        this.operation = operation;
        this.comment = comment;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The details of the example operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private String operation;

        /**
         * The details of the example operation.
         * @param operation the value to set
         * @return this builder
         **/
        public Builder operation(String operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }
        /**
         * The comments about the operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * The comments about the operation.
         * @param comment the value to set
         * @return this builder
         **/
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecommendationExampleLine build() {
            RecommendationExampleLine model =
                    new RecommendationExampleLine(this.operation, this.comment);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecommendationExampleLine model) {
            if (model.wasPropertyExplicitlySet("operation")) {
                this.operation(model.getOperation());
            }
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            return this;
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
     * The details of the example operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final String operation;

    /**
     * The details of the example operation.
     * @return the value
     **/
    public String getOperation() {
        return operation;
    }

    /**
     * The comments about the operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * The comments about the operation.
     * @return the value
     **/
    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RecommendationExampleLine(");
        sb.append("super=").append(super.toString());
        sb.append("operation=").append(String.valueOf(this.operation));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecommendationExampleLine)) {
            return false;
        }

        RecommendationExampleLine other = (RecommendationExampleLine) o;
        return java.util.Objects.equals(this.operation, other.operation)
                && java.util.Objects.equals(this.comment, other.comment)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
