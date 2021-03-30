/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MatchInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MatchInfo {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("matchingLogEntryEndIndex")
        private Integer matchingLogEntryEndIndex;

        public Builder matchingLogEntryEndIndex(Integer matchingLogEntryEndIndex) {
            this.matchingLogEntryEndIndex = matchingLogEntryEndIndex;
            this.__explicitlySet__.add("matchingLogEntryEndIndex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regexScore")
        private Integer regexScore;

        public Builder regexScore(Integer regexScore) {
            this.regexScore = regexScore;
            this.__explicitlySet__.add("regexScore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stepCount")
        private Integer stepCount;

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

    /**
     * The end index of the matching log entry.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchingLogEntryEndIndex")
    Integer matchingLogEntryEndIndex;

    /**
     * The regular expression score.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regexScore")
    Integer regexScore;

    /**
     * The step count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepCount")
    Integer stepCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
