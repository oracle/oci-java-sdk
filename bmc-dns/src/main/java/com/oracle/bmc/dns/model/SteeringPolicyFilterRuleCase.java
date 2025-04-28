/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SteeringPolicyFilterRuleCase.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SteeringPolicyFilterRuleCase
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /**
         * An expression that uses conditions at the time of a DNS query to indicate whether a case
         * matches. Conditions may include the geographical location, IP subnet, or ASN the DNS
         * query originated. **Example:** If you have an office that uses the subnet {@code
         * 192.0.2.0/24} you could use a {@code caseCondition} expression {@code
         * query.client.address in ('192.0.2.0/24')} to define a case that matches queries from that
         * office.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("caseCondition")
        private String caseCondition;

        /**
         * An expression that uses conditions at the time of a DNS query to indicate whether a case
         * matches. Conditions may include the geographical location, IP subnet, or ASN the DNS
         * query originated. **Example:** If you have an office that uses the subnet {@code
         * 192.0.2.0/24} you could use a {@code caseCondition} expression {@code
         * query.client.address in ('192.0.2.0/24')} to define a case that matches queries from that
         * office.
         *
         * @param caseCondition the value to set
         * @return this builder
         */
        public Builder caseCondition(String caseCondition) {
            this.caseCondition = caseCondition;
            this.__explicitlySet__.add("caseCondition");
            return this;
        }
        /** An array of {@code SteeringPolicyFilterAnswerData} objects. */
        @com.fasterxml.jackson.annotation.JsonProperty("answerData")
        private java.util.List<SteeringPolicyFilterAnswerData> answerData;

        /**
         * An array of {@code SteeringPolicyFilterAnswerData} objects.
         *
         * @param answerData the value to set
         * @return this builder
         */
        public Builder answerData(java.util.List<SteeringPolicyFilterAnswerData> answerData) {
            this.answerData = answerData;
            this.__explicitlySet__.add("answerData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyFilterRuleCase build() {
            SteeringPolicyFilterRuleCase model =
                    new SteeringPolicyFilterRuleCase(this.caseCondition, this.answerData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyFilterRuleCase model) {
            if (model.wasPropertyExplicitlySet("caseCondition")) {
                this.caseCondition(model.getCaseCondition());
            }
            if (model.wasPropertyExplicitlySet("answerData")) {
                this.answerData(model.getAnswerData());
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

    /**
     * An expression that uses conditions at the time of a DNS query to indicate whether a case
     * matches. Conditions may include the geographical location, IP subnet, or ASN the DNS query
     * originated. **Example:** If you have an office that uses the subnet {@code 192.0.2.0/24} you
     * could use a {@code caseCondition} expression {@code query.client.address in ('192.0.2.0/24')}
     * to define a case that matches queries from that office.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caseCondition")
    private final String caseCondition;

    /**
     * An expression that uses conditions at the time of a DNS query to indicate whether a case
     * matches. Conditions may include the geographical location, IP subnet, or ASN the DNS query
     * originated. **Example:** If you have an office that uses the subnet {@code 192.0.2.0/24} you
     * could use a {@code caseCondition} expression {@code query.client.address in ('192.0.2.0/24')}
     * to define a case that matches queries from that office.
     *
     * @return the value
     */
    public String getCaseCondition() {
        return caseCondition;
    }

    /** An array of {@code SteeringPolicyFilterAnswerData} objects. */
    @com.fasterxml.jackson.annotation.JsonProperty("answerData")
    private final java.util.List<SteeringPolicyFilterAnswerData> answerData;

    /**
     * An array of {@code SteeringPolicyFilterAnswerData} objects.
     *
     * @return the value
     */
    public java.util.List<SteeringPolicyFilterAnswerData> getAnswerData() {
        return answerData;
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
        sb.append("SteeringPolicyFilterRuleCase(");
        sb.append("super=").append(super.toString());
        sb.append("caseCondition=").append(String.valueOf(this.caseCondition));
        sb.append(", answerData=").append(String.valueOf(this.answerData));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.caseCondition == null ? 43 : this.caseCondition.hashCode());
        result = (result * PRIME) + (this.answerData == null ? 43 : this.answerData.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
