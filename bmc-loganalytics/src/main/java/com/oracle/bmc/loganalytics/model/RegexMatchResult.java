/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * RegexMatchResult
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RegexMatchResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RegexMatchResult {
    @Deprecated
    @java.beans.ConstructorProperties({
        "matchedLogEntryEndIndex",
        "regexScore",
        "regexStepsInfo",
        "stepCount",
        "subRegexesMatchInfo"
    })
    public RegexMatchResult(
            Integer matchedLogEntryEndIndex,
            Integer regexScore,
            java.util.List<StepInfo> regexStepsInfo,
            Integer stepCount,
            java.util.Map<String, MatchInfo> subRegexesMatchInfo) {
        super();
        this.matchedLogEntryEndIndex = matchedLogEntryEndIndex;
        this.regexScore = regexScore;
        this.regexStepsInfo = regexStepsInfo;
        this.stepCount = stepCount;
        this.subRegexesMatchInfo = subRegexesMatchInfo;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The matched log entry end index.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("matchedLogEntryEndIndex")
        private Integer matchedLogEntryEndIndex;

        /**
         * The matched log entry end index.
         * @param matchedLogEntryEndIndex the value to set
         * @return this builder
         **/
        public Builder matchedLogEntryEndIndex(Integer matchedLogEntryEndIndex) {
            this.matchedLogEntryEndIndex = matchedLogEntryEndIndex;
            this.__explicitlySet__.add("matchedLogEntryEndIndex");
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
         * The regular expression steps information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regexStepsInfo")
        private java.util.List<StepInfo> regexStepsInfo;

        /**
         * The regular expression steps information.
         * @param regexStepsInfo the value to set
         * @return this builder
         **/
        public Builder regexStepsInfo(java.util.List<StepInfo> regexStepsInfo) {
            this.regexStepsInfo = regexStepsInfo;
            this.__explicitlySet__.add("regexStepsInfo");
            return this;
        }
        /**
         * The regular expression step count.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stepCount")
        private Integer stepCount;

        /**
         * The regular expression step count.
         * @param stepCount the value to set
         * @return this builder
         **/
        public Builder stepCount(Integer stepCount) {
            this.stepCount = stepCount;
            this.__explicitlySet__.add("stepCount");
            return this;
        }
        /**
         * The regular expression match information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subRegexesMatchInfo")
        private java.util.Map<String, MatchInfo> subRegexesMatchInfo;

        /**
         * The regular expression match information.
         * @param subRegexesMatchInfo the value to set
         * @return this builder
         **/
        public Builder subRegexesMatchInfo(java.util.Map<String, MatchInfo> subRegexesMatchInfo) {
            this.subRegexesMatchInfo = subRegexesMatchInfo;
            this.__explicitlySet__.add("subRegexesMatchInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RegexMatchResult build() {
            RegexMatchResult __instance__ =
                    new RegexMatchResult(
                            matchedLogEntryEndIndex,
                            regexScore,
                            regexStepsInfo,
                            stepCount,
                            subRegexesMatchInfo);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RegexMatchResult o) {
            Builder copiedBuilder =
                    matchedLogEntryEndIndex(o.getMatchedLogEntryEndIndex())
                            .regexScore(o.getRegexScore())
                            .regexStepsInfo(o.getRegexStepsInfo())
                            .stepCount(o.getStepCount())
                            .subRegexesMatchInfo(o.getSubRegexesMatchInfo());

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
     * The matched log entry end index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchedLogEntryEndIndex")
    private final Integer matchedLogEntryEndIndex;

    /**
     * The matched log entry end index.
     * @return the value
     **/
    public Integer getMatchedLogEntryEndIndex() {
        return matchedLogEntryEndIndex;
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
     * The regular expression steps information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regexStepsInfo")
    private final java.util.List<StepInfo> regexStepsInfo;

    /**
     * The regular expression steps information.
     * @return the value
     **/
    public java.util.List<StepInfo> getRegexStepsInfo() {
        return regexStepsInfo;
    }

    /**
     * The regular expression step count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepCount")
    private final Integer stepCount;

    /**
     * The regular expression step count.
     * @return the value
     **/
    public Integer getStepCount() {
        return stepCount;
    }

    /**
     * The regular expression match information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subRegexesMatchInfo")
    private final java.util.Map<String, MatchInfo> subRegexesMatchInfo;

    /**
     * The regular expression match information.
     * @return the value
     **/
    public java.util.Map<String, MatchInfo> getSubRegexesMatchInfo() {
        return subRegexesMatchInfo;
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
        sb.append("RegexMatchResult(");
        sb.append("matchedLogEntryEndIndex=").append(String.valueOf(this.matchedLogEntryEndIndex));
        sb.append(", regexScore=").append(String.valueOf(this.regexScore));
        sb.append(", regexStepsInfo=").append(String.valueOf(this.regexStepsInfo));
        sb.append(", stepCount=").append(String.valueOf(this.stepCount));
        sb.append(", subRegexesMatchInfo=").append(String.valueOf(this.subRegexesMatchInfo));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegexMatchResult)) {
            return false;
        }

        RegexMatchResult other = (RegexMatchResult) o;
        return java.util.Objects.equals(this.matchedLogEntryEndIndex, other.matchedLogEntryEndIndex)
                && java.util.Objects.equals(this.regexScore, other.regexScore)
                && java.util.Objects.equals(this.regexStepsInfo, other.regexStepsInfo)
                && java.util.Objects.equals(this.stepCount, other.stepCount)
                && java.util.Objects.equals(this.subRegexesMatchInfo, other.subRegexesMatchInfo)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.matchedLogEntryEndIndex == null
                                ? 43
                                : this.matchedLogEntryEndIndex.hashCode());
        result = (result * PRIME) + (this.regexScore == null ? 43 : this.regexScore.hashCode());
        result =
                (result * PRIME)
                        + (this.regexStepsInfo == null ? 43 : this.regexStepsInfo.hashCode());
        result = (result * PRIME) + (this.stepCount == null ? 43 : this.stepCount.hashCode());
        result =
                (result * PRIME)
                        + (this.subRegexesMatchInfo == null
                                ? 43
                                : this.subRegexesMatchInfo.hashCode());
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
