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
    builder = SteeringPolicyFilterRuleCase.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SteeringPolicyFilterRuleCase {
    @Deprecated
    @java.beans.ConstructorProperties({"caseCondition", "answerData"})
    public SteeringPolicyFilterRuleCase(
            String caseCondition, java.util.List<SteeringPolicyFilterAnswerData> answerData) {
        super();
        this.caseCondition = caseCondition;
        this.answerData = answerData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("caseCondition")
        private String caseCondition;

        public Builder caseCondition(String caseCondition) {
            this.caseCondition = caseCondition;
            this.__explicitlySet__.add("caseCondition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("answerData")
        private java.util.List<SteeringPolicyFilterAnswerData> answerData;

        public Builder answerData(java.util.List<SteeringPolicyFilterAnswerData> answerData) {
            this.answerData = answerData;
            this.__explicitlySet__.add("answerData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyFilterRuleCase build() {
            SteeringPolicyFilterRuleCase __instance__ =
                    new SteeringPolicyFilterRuleCase(caseCondition, answerData);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyFilterRuleCase o) {
            Builder copiedBuilder =
                    caseCondition(o.getCaseCondition()).answerData(o.getAnswerData());

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
     * An expression that uses conditions at the time of a DNS query to indicate
     * whether a case matches. Conditions may include the geographical location, IP
     * subnet, or ASN the DNS query originated. **Example:** If you have an
     * office that uses the subnet {@code 192.0.2.0/24} you could use a {@code caseCondition}
     * expression {@code query.client.address in ('192.0.2.0/24')} to define a case that
     * matches queries from that office.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caseCondition")
    private final String caseCondition;

    public String getCaseCondition() {
        return caseCondition;
    }

    /**
     * An array of {@code SteeringPolicyFilterAnswerData} objects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("answerData")
    private final java.util.List<SteeringPolicyFilterAnswerData> answerData;

    public java.util.List<SteeringPolicyFilterAnswerData> getAnswerData() {
        return answerData;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SteeringPolicyFilterRuleCase(");
        sb.append("caseCondition=").append(String.valueOf(this.caseCondition));
        sb.append(", answerData=").append(String.valueOf(this.answerData));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SteeringPolicyFilterRuleCase)) {
            return false;
        }

        SteeringPolicyFilterRuleCase other = (SteeringPolicyFilterRuleCase) o;
        return java.util.Objects.equals(this.caseCondition, other.caseCondition)
                && java.util.Objects.equals(this.answerData, other.answerData)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.caseCondition == null ? 43 : this.caseCondition.hashCode());
        result = (result * PRIME) + (this.answerData == null ? 43 : this.answerData.hashCode());
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
