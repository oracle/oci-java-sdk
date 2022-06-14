/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * MatchInfo
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MatchInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MatchInfo {
    @Deprecated
    @java.beans.ConstructorProperties({"matchingLogEntryEndIndex", "regexScore", "stepCount"})
    public MatchInfo(Integer matchingLogEntryEndIndex, Integer regexScore, Integer stepCount) {
        super();
        this.matchingLogEntryEndIndex = matchingLogEntryEndIndex;
        this.regexScore = regexScore;
        this.stepCount = stepCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The end index of the matching log entry.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("matchingLogEntryEndIndex")
        private Integer matchingLogEntryEndIndex;

        /**
         * The end index of the matching log entry.
         * @param matchingLogEntryEndIndex the value to set
         * @return this builder
         **/
        public Builder matchingLogEntryEndIndex(Integer matchingLogEntryEndIndex) {
            this.matchingLogEntryEndIndex = matchingLogEntryEndIndex;
            this.__explicitlySet__.add("matchingLogEntryEndIndex");
            return this;
        }
        /**
         * The regular expression score.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regexScore")
        private Integer regexScore;

        /**
         * The regular expression score.
         * @param regexScore the value to set
         * @return this builder
         **/
        public Builder regexScore(Integer regexScore) {
            this.regexScore = regexScore;
            this.__explicitlySet__.add("regexScore");
            return this;
        }
        /**
         * The step count.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stepCount")
        private Integer stepCount;

        /**
         * The step count.
         * @param stepCount the value to set
         * @return this builder
         **/
        public Builder stepCount(Integer stepCount) {
            this.stepCount = stepCount;
            this.__explicitlySet__.add("stepCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MatchInfo build() {
            MatchInfo __instance__ = new MatchInfo(matchingLogEntryEndIndex, regexScore, stepCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MatchInfo o) {
            Builder copiedBuilder =
                    matchingLogEntryEndIndex(o.getMatchingLogEntryEndIndex())
                            .regexScore(o.getRegexScore())
                            .stepCount(o.getStepCount());

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
     * The end index of the matching log entry.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchingLogEntryEndIndex")
    private final Integer matchingLogEntryEndIndex;

    /**
     * The end index of the matching log entry.
     * @return the value
     **/
    public Integer getMatchingLogEntryEndIndex() {
        return matchingLogEntryEndIndex;
    }

    /**
     * The regular expression score.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regexScore")
    private final Integer regexScore;

    /**
     * The regular expression score.
     * @return the value
     **/
    public Integer getRegexScore() {
        return regexScore;
    }

    /**
     * The step count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepCount")
    private final Integer stepCount;

    /**
     * The step count.
     * @return the value
     **/
    public Integer getStepCount() {
        return stepCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MatchInfo(");
        sb.append("matchingLogEntryEndIndex=")
                .append(String.valueOf(this.matchingLogEntryEndIndex));
        sb.append(", regexScore=").append(String.valueOf(this.regexScore));
        sb.append(", stepCount=").append(String.valueOf(this.stepCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MatchInfo)) {
            return false;
        }

        MatchInfo other = (MatchInfo) o;
        return java.util.Objects.equals(
                        this.matchingLogEntryEndIndex, other.matchingLogEntryEndIndex)
                && java.util.Objects.equals(this.regexScore, other.regexScore)
                && java.util.Objects.equals(this.stepCount, other.stepCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.matchingLogEntryEndIndex == null
                                ? 43
                                : this.matchingLogEntryEndIndex.hashCode());
        result = (result * PRIME) + (this.regexScore == null ? 43 : this.regexScore.hashCode());
        result = (result * PRIME) + (this.stepCount == null ? 43 : this.stepCount.hashCode());
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
