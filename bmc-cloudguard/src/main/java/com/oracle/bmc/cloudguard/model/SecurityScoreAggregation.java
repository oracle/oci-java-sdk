/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Provides the dimensions and their corresponding count value.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SecurityScoreAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SecurityScoreAggregation {
    @Deprecated
    @java.beans.ConstructorProperties({"dimensionsMap", "securityRating", "securityScore"})
    public SecurityScoreAggregation(
            java.util.Map<String, String> dimensionsMap,
            SecurityRating securityRating,
            Integer securityScore) {
        super();
        this.dimensionsMap = dimensionsMap;
        this.securityRating = securityRating;
        this.securityScore = securityScore;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
        private java.util.Map<String, String> dimensionsMap;

        public Builder dimensionsMap(java.util.Map<String, String> dimensionsMap) {
            this.dimensionsMap = dimensionsMap;
            this.__explicitlySet__.add("dimensionsMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityRating")
        private SecurityRating securityRating;

        public Builder securityRating(SecurityRating securityRating) {
            this.securityRating = securityRating;
            this.__explicitlySet__.add("securityRating");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityScore")
        private Integer securityScore;

        public Builder securityScore(Integer securityScore) {
            this.securityScore = securityScore;
            this.__explicitlySet__.add("securityScore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityScoreAggregation build() {
            SecurityScoreAggregation __instance__ =
                    new SecurityScoreAggregation(dimensionsMap, securityRating, securityScore);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityScoreAggregation o) {
            Builder copiedBuilder =
                    dimensionsMap(o.getDimensionsMap())
                            .securityRating(o.getSecurityRating())
                            .securityScore(o.getSecurityScore());

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
     * The key-value pairs of dimensions and their names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
    private final java.util.Map<String, String> dimensionsMap;

    public java.util.Map<String, String> getDimensionsMap() {
        return dimensionsMap;
    }

    /**
     * The security rating with given dimension/s
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityRating")
    private final SecurityRating securityRating;

    public SecurityRating getSecurityRating() {
        return securityRating;
    }

    /**
     * The security score with given dimension/s
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityScore")
    private final Integer securityScore;

    public Integer getSecurityScore() {
        return securityScore;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SecurityScoreAggregation(");
        sb.append("dimensionsMap=").append(String.valueOf(this.dimensionsMap));
        sb.append(", securityRating=").append(String.valueOf(this.securityRating));
        sb.append(", securityScore=").append(String.valueOf(this.securityScore));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityScoreAggregation)) {
            return false;
        }

        SecurityScoreAggregation other = (SecurityScoreAggregation) o;
        return java.util.Objects.equals(this.dimensionsMap, other.dimensionsMap)
                && java.util.Objects.equals(this.securityRating, other.securityRating)
                && java.util.Objects.equals(this.securityScore, other.securityScore)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dimensionsMap == null ? 43 : this.dimensionsMap.hashCode());
        result =
                (result * PRIME)
                        + (this.securityRating == null ? 43 : this.securityRating.hashCode());
        result =
                (result * PRIME)
                        + (this.securityScore == null ? 43 : this.securityScore.hashCode());
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
