/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of the Optimizer Statistics Advisor findings and recommendations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RuleFinding.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RuleFinding extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"message", "details", "recommendations"})
    public RuleFinding(
            String message,
            java.util.List<FindingSchemaOrOperation> details,
            java.util.List<Recommendation> recommendations) {
        super();
        this.message = message;
        this.details = details;
        this.recommendations = recommendations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A high-level overview of the findings of the Optimizer Statistics Advisor. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A high-level overview of the findings of the Optimizer Statistics Advisor.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** The details of the schema or operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private java.util.List<FindingSchemaOrOperation> details;

        /**
         * The details of the schema or operation.
         *
         * @param details the value to set
         * @return this builder
         */
        public Builder details(java.util.List<FindingSchemaOrOperation> details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }
        /** The list of recommendations. */
        @com.fasterxml.jackson.annotation.JsonProperty("recommendations")
        private java.util.List<Recommendation> recommendations;

        /**
         * The list of recommendations.
         *
         * @param recommendations the value to set
         * @return this builder
         */
        public Builder recommendations(java.util.List<Recommendation> recommendations) {
            this.recommendations = recommendations;
            this.__explicitlySet__.add("recommendations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RuleFinding build() {
            RuleFinding model = new RuleFinding(this.message, this.details, this.recommendations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RuleFinding model) {
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
            }
            if (model.wasPropertyExplicitlySet("recommendations")) {
                this.recommendations(model.getRecommendations());
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

    /** A high-level overview of the findings of the Optimizer Statistics Advisor. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A high-level overview of the findings of the Optimizer Statistics Advisor.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** The details of the schema or operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final java.util.List<FindingSchemaOrOperation> details;

    /**
     * The details of the schema or operation.
     *
     * @return the value
     */
    public java.util.List<FindingSchemaOrOperation> getDetails() {
        return details;
    }

    /** The list of recommendations. */
    @com.fasterxml.jackson.annotation.JsonProperty("recommendations")
    private final java.util.List<Recommendation> recommendations;

    /**
     * The list of recommendations.
     *
     * @return the value
     */
    public java.util.List<Recommendation> getRecommendations() {
        return recommendations;
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
        sb.append("RuleFinding(");
        sb.append("super=").append(super.toString());
        sb.append("message=").append(String.valueOf(this.message));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(", recommendations=").append(String.valueOf(this.recommendations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RuleFinding)) {
            return false;
        }

        RuleFinding other = (RuleFinding) o;
        return java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.details, other.details)
                && java.util.Objects.equals(this.recommendations, other.recommendations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendations == null ? 43 : this.recommendations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
