/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RegexMatchResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RegexMatchResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("matchedLogEntryEndIndex")
        private Integer matchedLogEntryEndIndex;

        public Builder matchedLogEntryEndIndex(Integer matchedLogEntryEndIndex) {
            this.matchedLogEntryEndIndex = matchedLogEntryEndIndex;
            this.__explicitlySet__.add("matchedLogEntryEndIndex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regexScore")
        private Integer regexScore;

        public Builder regexScore(Integer regexScore) {
            this.regexScore = regexScore;
            this.__explicitlySet__.add("regexScore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regexStepsInfo")
        private java.util.List<StepInfo> regexStepsInfo;

        public Builder regexStepsInfo(java.util.List<StepInfo> regexStepsInfo) {
            this.regexStepsInfo = regexStepsInfo;
            this.__explicitlySet__.add("regexStepsInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stepCount")
        private Integer stepCount;

        public Builder stepCount(Integer stepCount) {
            this.stepCount = stepCount;
            this.__explicitlySet__.add("stepCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subRegexesMatchInfo")
        private java.util.Map<String, MatchInfo> subRegexesMatchInfo;

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

    /**
     * The matched log entry end index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchedLogEntryEndIndex")
    Integer matchedLogEntryEndIndex;

    /**
     * The regular expression score.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regexScore")
    Integer regexScore;

    /**
     * The regular expression steps information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regexStepsInfo")
    java.util.List<StepInfo> regexStepsInfo;

    /**
     * The regular expression step count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepCount")
    Integer stepCount;

    /**
     * The regular expression match information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subRegexesMatchInfo")
    java.util.Map<String, MatchInfo> subRegexesMatchInfo;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
