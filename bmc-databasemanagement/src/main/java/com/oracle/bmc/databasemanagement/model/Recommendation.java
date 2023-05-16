/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the Optimizer Statistics Advisor findings and recommendations. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Recommendation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Recommendation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"message", "example", "rationales"})
    public Recommendation(
            String message,
            RecommendationExample example,
            java.util.List<RecommendationRationale> rationales) {
        super();
        this.message = message;
        this.example = example;
        this.rationales = rationales;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An overview of the Optimizer Statistics Advisor recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * An overview of the Optimizer Statistics Advisor recommendation.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("example")
        private RecommendationExample example;

        public Builder example(RecommendationExample example) {
            this.example = example;
            this.__explicitlySet__.add("example");
            return this;
        }
        /** The rationale of the recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("rationales")
        private java.util.List<RecommendationRationale> rationales;

        /**
         * The rationale of the recommendation.
         *
         * @param rationales the value to set
         * @return this builder
         */
        public Builder rationales(java.util.List<RecommendationRationale> rationales) {
            this.rationales = rationales;
            this.__explicitlySet__.add("rationales");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Recommendation build() {
            Recommendation model = new Recommendation(this.message, this.example, this.rationales);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Recommendation model) {
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("example")) {
                this.example(model.getExample());
            }
            if (model.wasPropertyExplicitlySet("rationales")) {
                this.rationales(model.getRationales());
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

    /** An overview of the Optimizer Statistics Advisor recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * An overview of the Optimizer Statistics Advisor recommendation.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("example")
    private final RecommendationExample example;

    public RecommendationExample getExample() {
        return example;
    }

    /** The rationale of the recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("rationales")
    private final java.util.List<RecommendationRationale> rationales;

    /**
     * The rationale of the recommendation.
     *
     * @return the value
     */
    public java.util.List<RecommendationRationale> getRationales() {
        return rationales;
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
        sb.append("Recommendation(");
        sb.append("super=").append(super.toString());
        sb.append("message=").append(String.valueOf(this.message));
        sb.append(", example=").append(String.valueOf(this.example));
        sb.append(", rationales=").append(String.valueOf(this.rationales));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Recommendation)) {
            return false;
        }

        Recommendation other = (Recommendation) o;
        return java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.example, other.example)
                && java.util.Objects.equals(this.rationales, other.rationales)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.example == null ? 43 : this.example.hashCode());
        result = (result * PRIME) + (this.rationales == null ? 43 : this.rationales.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
