/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * The metadata associated with the recommendation strategy.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RecommendationStrategySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RecommendationStrategySummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "strategies"})
    public RecommendationStrategySummary(String name, java.util.List<Strategy> strategies) {
        super();
        this.name = name;
        this.strategies = strategies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The display name of the recommendation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The display name of the recommendation.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The list of strategies used.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("strategies")
        private java.util.List<Strategy> strategies;

        /**
         * The list of strategies used.
         * @param strategies the value to set
         * @return this builder
         **/
        public Builder strategies(java.util.List<Strategy> strategies) {
            this.strategies = strategies;
            this.__explicitlySet__.add("strategies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecommendationStrategySummary build() {
            RecommendationStrategySummary model =
                    new RecommendationStrategySummary(this.name, this.strategies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecommendationStrategySummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("strategies")) {
                this.strategies(model.getStrategies());
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
     * The display name of the recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The display name of the recommendation.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The list of strategies used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("strategies")
    private final java.util.List<Strategy> strategies;

    /**
     * The list of strategies used.
     * @return the value
     **/
    public java.util.List<Strategy> getStrategies() {
        return strategies;
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
        sb.append("RecommendationStrategySummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", strategies=").append(String.valueOf(this.strategies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecommendationStrategySummary)) {
            return false;
        }

        RecommendationStrategySummary other = (RecommendationStrategySummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.strategies, other.strategies)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.strategies == null ? 43 : this.strategies.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
