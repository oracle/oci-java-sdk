/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Provides the dimensions and their corresponding time and security score. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SecurityScoreTrendAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SecurityScoreTrendAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dimensionsMap",
        "startTimestamp",
        "durationInSeconds",
        "securityRating",
        "securityScore"
    })
    public SecurityScoreTrendAggregation(
            java.util.Map<String, String> dimensionsMap,
            java.math.BigDecimal startTimestamp,
            Integer durationInSeconds,
            SecurityRating securityRating,
            Integer securityScore) {
        super();
        this.dimensionsMap = dimensionsMap;
        this.startTimestamp = startTimestamp;
        this.durationInSeconds = durationInSeconds;
        this.securityRating = securityRating;
        this.securityScore = securityScore;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The key-value pairs of dimensions and their names. */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
        private java.util.Map<String, String> dimensionsMap;

        /**
         * The key-value pairs of dimensions and their names.
         *
         * @param dimensionsMap the value to set
         * @return this builder
         */
        public Builder dimensionsMap(java.util.Map<String, String> dimensionsMap) {
            this.dimensionsMap = dimensionsMap;
            this.__explicitlySet__.add("dimensionsMap");
            return this;
        }
        /** Start Time in epoch seconds */
        @com.fasterxml.jackson.annotation.JsonProperty("startTimestamp")
        private java.math.BigDecimal startTimestamp;

        /**
         * Start Time in epoch seconds
         *
         * @param startTimestamp the value to set
         * @return this builder
         */
        public Builder startTimestamp(java.math.BigDecimal startTimestamp) {
            this.startTimestamp = startTimestamp;
            this.__explicitlySet__.add("startTimestamp");
            return this;
        }
        /** Duration */
        @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
        private Integer durationInSeconds;

        /**
         * Duration
         *
         * @param durationInSeconds the value to set
         * @return this builder
         */
        public Builder durationInSeconds(Integer durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            this.__explicitlySet__.add("durationInSeconds");
            return this;
        }
        /** The security rating with given dimensions and time range */
        @com.fasterxml.jackson.annotation.JsonProperty("securityRating")
        private SecurityRating securityRating;

        /**
         * The security rating with given dimensions and time range
         *
         * @param securityRating the value to set
         * @return this builder
         */
        public Builder securityRating(SecurityRating securityRating) {
            this.securityRating = securityRating;
            this.__explicitlySet__.add("securityRating");
            return this;
        }
        /** The security score with given dimensions and time range */
        @com.fasterxml.jackson.annotation.JsonProperty("securityScore")
        private Integer securityScore;

        /**
         * The security score with given dimensions and time range
         *
         * @param securityScore the value to set
         * @return this builder
         */
        public Builder securityScore(Integer securityScore) {
            this.securityScore = securityScore;
            this.__explicitlySet__.add("securityScore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityScoreTrendAggregation build() {
            SecurityScoreTrendAggregation model =
                    new SecurityScoreTrendAggregation(
                            this.dimensionsMap,
                            this.startTimestamp,
                            this.durationInSeconds,
                            this.securityRating,
                            this.securityScore);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityScoreTrendAggregation model) {
            if (model.wasPropertyExplicitlySet("dimensionsMap")) {
                this.dimensionsMap(model.getDimensionsMap());
            }
            if (model.wasPropertyExplicitlySet("startTimestamp")) {
                this.startTimestamp(model.getStartTimestamp());
            }
            if (model.wasPropertyExplicitlySet("durationInSeconds")) {
                this.durationInSeconds(model.getDurationInSeconds());
            }
            if (model.wasPropertyExplicitlySet("securityRating")) {
                this.securityRating(model.getSecurityRating());
            }
            if (model.wasPropertyExplicitlySet("securityScore")) {
                this.securityScore(model.getSecurityScore());
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

    /** The key-value pairs of dimensions and their names. */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
    private final java.util.Map<String, String> dimensionsMap;

    /**
     * The key-value pairs of dimensions and their names.
     *
     * @return the value
     */
    public java.util.Map<String, String> getDimensionsMap() {
        return dimensionsMap;
    }

    /** Start Time in epoch seconds */
    @com.fasterxml.jackson.annotation.JsonProperty("startTimestamp")
    private final java.math.BigDecimal startTimestamp;

    /**
     * Start Time in epoch seconds
     *
     * @return the value
     */
    public java.math.BigDecimal getStartTimestamp() {
        return startTimestamp;
    }

    /** Duration */
    @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
    private final Integer durationInSeconds;

    /**
     * Duration
     *
     * @return the value
     */
    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }

    /** The security rating with given dimensions and time range */
    @com.fasterxml.jackson.annotation.JsonProperty("securityRating")
    private final SecurityRating securityRating;

    /**
     * The security rating with given dimensions and time range
     *
     * @return the value
     */
    public SecurityRating getSecurityRating() {
        return securityRating;
    }

    /** The security score with given dimensions and time range */
    @com.fasterxml.jackson.annotation.JsonProperty("securityScore")
    private final Integer securityScore;

    /**
     * The security score with given dimensions and time range
     *
     * @return the value
     */
    public Integer getSecurityScore() {
        return securityScore;
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
        sb.append("SecurityScoreTrendAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("dimensionsMap=").append(String.valueOf(this.dimensionsMap));
        sb.append(", startTimestamp=").append(String.valueOf(this.startTimestamp));
        sb.append(", durationInSeconds=").append(String.valueOf(this.durationInSeconds));
        sb.append(", securityRating=").append(String.valueOf(this.securityRating));
        sb.append(", securityScore=").append(String.valueOf(this.securityScore));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityScoreTrendAggregation)) {
            return false;
        }

        SecurityScoreTrendAggregation other = (SecurityScoreTrendAggregation) o;
        return java.util.Objects.equals(this.dimensionsMap, other.dimensionsMap)
                && java.util.Objects.equals(this.startTimestamp, other.startTimestamp)
                && java.util.Objects.equals(this.durationInSeconds, other.durationInSeconds)
                && java.util.Objects.equals(this.securityRating, other.securityRating)
                && java.util.Objects.equals(this.securityScore, other.securityScore)
                && super.equals(other);
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
                        + (this.startTimestamp == null ? 43 : this.startTimestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.durationInSeconds == null ? 43 : this.durationInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.securityRating == null ? 43 : this.securityRating.hashCode());
        result =
                (result * PRIME)
                        + (this.securityScore == null ? 43 : this.securityScore.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
