/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
public final class SteeringPolicyFilterAnswerData
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"answerCondition", "shouldKeep"})
    public SteeringPolicyFilterAnswerData(String answerCondition, Boolean shouldKeep) {
        super();
        this.answerCondition = answerCondition;
        this.shouldKeep = shouldKeep;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An expression that is used to select a set of answers that match a condition. For example, answers with matching pool properties.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("answerCondition")
        private String answerCondition;

        /**
         * An expression that is used to select a set of answers that match a condition. For example, answers with matching pool properties.
         *
         * @param answerCondition the value to set
         * @return this builder
         **/
        public Builder answerCondition(String answerCondition) {
            this.answerCondition = answerCondition;
            this.__explicitlySet__.add("answerCondition");
            return this;
        }
        /**
         * Keeps the answer only if the value is {@code true}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shouldKeep")
        private Boolean shouldKeep;

        /**
         * Keeps the answer only if the value is {@code true}.
         * @param shouldKeep the value to set
         * @return this builder
         **/
        public Builder shouldKeep(Boolean shouldKeep) {
            this.shouldKeep = shouldKeep;
            this.__explicitlySet__.add("shouldKeep");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyFilterAnswerData build() {
            SteeringPolicyFilterAnswerData model =
                    new SteeringPolicyFilterAnswerData(this.answerCondition, this.shouldKeep);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyFilterAnswerData model) {
            if (model.wasPropertyExplicitlySet("answerCondition")) {
                this.answerCondition(model.getAnswerCondition());
            }
            if (model.wasPropertyExplicitlySet("shouldKeep")) {
                this.shouldKeep(model.getShouldKeep());
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
     * An expression that is used to select a set of answers that match a condition. For example, answers with matching pool properties.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("answerCondition")
    private final String answerCondition;

    /**
     * An expression that is used to select a set of answers that match a condition. For example, answers with matching pool properties.
     *
     * @return the value
     **/
    public String getAnswerCondition() {
        return answerCondition;
    }

    /**
     * Keeps the answer only if the value is {@code true}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldKeep")
    private final Boolean shouldKeep;

    /**
     * Keeps the answer only if the value is {@code true}.
     * @return the value
     **/
    public Boolean getShouldKeep() {
        return shouldKeep;
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
        sb.append("SteeringPolicyFilterAnswerData(");
        sb.append("super=").append(super.toString());
        sb.append("answerCondition=").append(String.valueOf(this.answerCondition));
        sb.append(", shouldKeep=").append(String.valueOf(this.shouldKeep));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.answerCondition == null ? 43 : this.answerCondition.hashCode());
        result = (result * PRIME) + (this.shouldKeep == null ? 43 : this.shouldKeep.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
