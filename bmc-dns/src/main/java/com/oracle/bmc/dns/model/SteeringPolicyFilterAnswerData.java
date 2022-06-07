/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SteeringPolicyFilterAnswerData.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SteeringPolicyFilterAnswerData {
    @Deprecated
    @java.beans.ConstructorProperties({"answerCondition", "shouldKeep"})
    public SteeringPolicyFilterAnswerData(String answerCondition, Boolean shouldKeep) {
        super();
        this.answerCondition = answerCondition;
        this.shouldKeep = shouldKeep;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("answerCondition")
        private String answerCondition;

        public Builder answerCondition(String answerCondition) {
            this.answerCondition = answerCondition;
            this.__explicitlySet__.add("answerCondition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shouldKeep")
        private Boolean shouldKeep;

        public Builder shouldKeep(Boolean shouldKeep) {
            this.shouldKeep = shouldKeep;
            this.__explicitlySet__.add("shouldKeep");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyFilterAnswerData build() {
            SteeringPolicyFilterAnswerData __instance__ =
                    new SteeringPolicyFilterAnswerData(answerCondition, shouldKeep);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyFilterAnswerData o) {
            Builder copiedBuilder =
                    answerCondition(o.getAnswerCondition()).shouldKeep(o.getShouldKeep());

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
     * An expression that is used to select a set of answers that match a condition. For example, answers with matching pool properties.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("answerCondition")
    private final String answerCondition;

    public String getAnswerCondition() {
        return answerCondition;
    }

    /**
     * Keeps the answer only if the value is {@code true}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldKeep")
    private final Boolean shouldKeep;

    public Boolean getShouldKeep() {
        return shouldKeep;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SteeringPolicyFilterAnswerData(");
        sb.append("answerCondition=").append(String.valueOf(this.answerCondition));
        sb.append(", shouldKeep=").append(String.valueOf(this.shouldKeep));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SteeringPolicyFilterAnswerData)) {
            return false;
        }

        SteeringPolicyFilterAnswerData other = (SteeringPolicyFilterAnswerData) o;
        return java.util.Objects.equals(this.answerCondition, other.answerCondition)
                && java.util.Objects.equals(this.shouldKeep, other.shouldKeep)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.answerCondition == null ? 43 : this.answerCondition.hashCode());
        result = (result * PRIME) + (this.shouldKeep == null ? 43 : this.shouldKeep.hashCode());
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
