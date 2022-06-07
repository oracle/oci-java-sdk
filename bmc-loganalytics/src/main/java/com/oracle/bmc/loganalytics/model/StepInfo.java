/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * StepInfo
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StepInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StepInfo {
    @Deprecated
    @java.beans.ConstructorProperties({
        "inputSequenceCurrentMatch",
        "regexEngineClassName",
        "stepCount"
    })
    public StepInfo(
            String inputSequenceCurrentMatch, String regexEngineClassName, Integer stepCount) {
        super();
        this.inputSequenceCurrentMatch = inputSequenceCurrentMatch;
        this.regexEngineClassName = regexEngineClassName;
        this.stepCount = stepCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("inputSequenceCurrentMatch")
        private String inputSequenceCurrentMatch;

        public Builder inputSequenceCurrentMatch(String inputSequenceCurrentMatch) {
            this.inputSequenceCurrentMatch = inputSequenceCurrentMatch;
            this.__explicitlySet__.add("inputSequenceCurrentMatch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regexEngineClassName")
        private String regexEngineClassName;

        public Builder regexEngineClassName(String regexEngineClassName) {
            this.regexEngineClassName = regexEngineClassName;
            this.__explicitlySet__.add("regexEngineClassName");
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

        public StepInfo build() {
            StepInfo __instance__ =
                    new StepInfo(inputSequenceCurrentMatch, regexEngineClassName, stepCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StepInfo o) {
            Builder copiedBuilder =
                    inputSequenceCurrentMatch(o.getInputSequenceCurrentMatch())
                            .regexEngineClassName(o.getRegexEngineClassName())
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
     * The currnet input sequence match.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputSequenceCurrentMatch")
    private final String inputSequenceCurrentMatch;

    public String getInputSequenceCurrentMatch() {
        return inputSequenceCurrentMatch;
    }

    /**
     * The regular expression engine class name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regexEngineClassName")
    private final String regexEngineClassName;

    public String getRegexEngineClassName() {
        return regexEngineClassName;
    }

    /**
     * The step count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepCount")
    private final Integer stepCount;

    public Integer getStepCount() {
        return stepCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StepInfo(");
        sb.append("inputSequenceCurrentMatch=")
                .append(String.valueOf(this.inputSequenceCurrentMatch));
        sb.append(", regexEngineClassName=").append(String.valueOf(this.regexEngineClassName));
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
        if (!(o instanceof StepInfo)) {
            return false;
        }

        StepInfo other = (StepInfo) o;
        return java.util.Objects.equals(
                        this.inputSequenceCurrentMatch, other.inputSequenceCurrentMatch)
                && java.util.Objects.equals(this.regexEngineClassName, other.regexEngineClassName)
                && java.util.Objects.equals(this.stepCount, other.stepCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.inputSequenceCurrentMatch == null
                                ? 43
                                : this.inputSequenceCurrentMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.regexEngineClassName == null
                                ? 43
                                : this.regexEngineClassName.hashCode());
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
