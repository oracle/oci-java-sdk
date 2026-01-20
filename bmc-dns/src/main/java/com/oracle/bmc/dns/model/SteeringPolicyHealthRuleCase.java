/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
        builder = SteeringPolicyHealthRuleCase.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SteeringPolicyHealthRuleCase
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"caseCondition"})
    public SteeringPolicyHealthRuleCase(String caseCondition) {
        super();
        this.caseCondition = caseCondition;
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyHealthRuleCase build() {
            SteeringPolicyHealthRuleCase model =
                    new SteeringPolicyHealthRuleCase(this.caseCondition);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyHealthRuleCase model) {
            if (model.wasPropertyExplicitlySet("caseCondition")) {
                this.caseCondition(model.getCaseCondition());
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
        sb.append("SteeringPolicyHealthRuleCase(");
        sb.append("super=").append(super.toString());
        sb.append("caseCondition=").append(String.valueOf(this.caseCondition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SteeringPolicyHealthRuleCase)) {
            return false;
        }

        SteeringPolicyHealthRuleCase other = (SteeringPolicyHealthRuleCase) o;
        return java.util.Objects.equals(this.caseCondition, other.caseCondition)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.caseCondition == null ? 43 : this.caseCondition.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
