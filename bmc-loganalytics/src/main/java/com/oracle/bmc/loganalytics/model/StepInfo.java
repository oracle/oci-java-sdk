/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * StepInfo <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StepInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StepInfo extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The currnet input sequence match. */
        @com.fasterxml.jackson.annotation.JsonProperty("inputSequenceCurrentMatch")
        private String inputSequenceCurrentMatch;

        /**
         * The currnet input sequence match.
         *
         * @param inputSequenceCurrentMatch the value to set
         * @return this builder
         */
        public Builder inputSequenceCurrentMatch(String inputSequenceCurrentMatch) {
            this.inputSequenceCurrentMatch = inputSequenceCurrentMatch;
            this.__explicitlySet__.add("inputSequenceCurrentMatch");
            return this;
        }
        /** The regular expression engine class name. */
        @com.fasterxml.jackson.annotation.JsonProperty("regexEngineClassName")
        private String regexEngineClassName;

        /**
         * The regular expression engine class name.
         *
         * @param regexEngineClassName the value to set
         * @return this builder
         */
        public Builder regexEngineClassName(String regexEngineClassName) {
            this.regexEngineClassName = regexEngineClassName;
            this.__explicitlySet__.add("regexEngineClassName");
            return this;
        }
        /** The step count. */
        @com.fasterxml.jackson.annotation.JsonProperty("stepCount")
        private Integer stepCount;

        /**
         * The step count.
         *
         * @param stepCount the value to set
         * @return this builder
         */
        public Builder stepCount(Integer stepCount) {
            this.stepCount = stepCount;
            this.__explicitlySet__.add("stepCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StepInfo build() {
            StepInfo model =
                    new StepInfo(
                            this.inputSequenceCurrentMatch,
                            this.regexEngineClassName,
                            this.stepCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StepInfo model) {
            if (model.wasPropertyExplicitlySet("inputSequenceCurrentMatch")) {
                this.inputSequenceCurrentMatch(model.getInputSequenceCurrentMatch());
            }
            if (model.wasPropertyExplicitlySet("regexEngineClassName")) {
                this.regexEngineClassName(model.getRegexEngineClassName());
            }
            if (model.wasPropertyExplicitlySet("stepCount")) {
                this.stepCount(model.getStepCount());
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

    /** The currnet input sequence match. */
    @com.fasterxml.jackson.annotation.JsonProperty("inputSequenceCurrentMatch")
    private final String inputSequenceCurrentMatch;

    /**
     * The currnet input sequence match.
     *
     * @return the value
     */
    public String getInputSequenceCurrentMatch() {
        return inputSequenceCurrentMatch;
    }

    /** The regular expression engine class name. */
    @com.fasterxml.jackson.annotation.JsonProperty("regexEngineClassName")
    private final String regexEngineClassName;

    /**
     * The regular expression engine class name.
     *
     * @return the value
     */
    public String getRegexEngineClassName() {
        return regexEngineClassName;
    }

    /** The step count. */
    @com.fasterxml.jackson.annotation.JsonProperty("stepCount")
    private final Integer stepCount;

    /**
     * The step count.
     *
     * @return the value
     */
    public Integer getStepCount() {
        return stepCount;
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
        sb.append("StepInfo(");
        sb.append("super=").append(super.toString());
        sb.append("inputSequenceCurrentMatch=")
                .append(String.valueOf(this.inputSequenceCurrentMatch));
        sb.append(", regexEngineClassName=").append(String.valueOf(this.regexEngineClassName));
        sb.append(", stepCount=").append(String.valueOf(this.stepCount));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
