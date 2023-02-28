/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SteeringPolicyLimitRuleCase.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SteeringPolicyLimitRuleCase
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"caseCondition", "count"})
    public SteeringPolicyLimitRuleCase(String caseCondition, Integer count) {
        super();
        this.caseCondition = caseCondition;
        this.count = count;
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
        /**
         * The number of answers allowed to remain after the limit rule has been processed, keeping
         * only the first of the remaining answers in the list. Example: If the {@code count}
         * property is set to {@code 2} and four answers remain before the limit rule is processed,
         * only the first two answers in the list will remain after the limit rule has been
         * processed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * The number of answers allowed to remain after the limit rule has been processed, keeping
         * only the first of the remaining answers in the list. Example: If the {@code count}
         * property is set to {@code 2} and four answers remain before the limit rule is processed,
         * only the first two answers in the list will remain after the limit rule has been
         * processed.
         *
         * @param count the value to set
         * @return this builder
         */
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyLimitRuleCase build() {
            SteeringPolicyLimitRuleCase model =
                    new SteeringPolicyLimitRuleCase(this.caseCondition, this.count);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyLimitRuleCase model) {
            if (model.wasPropertyExplicitlySet("caseCondition")) {
                this.caseCondition(model.getCaseCondition());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
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

    /**
     * The number of answers allowed to remain after the limit rule has been processed, keeping only
     * the first of the remaining answers in the list. Example: If the {@code count} property is set
     * to {@code 2} and four answers remain before the limit rule is processed, only the first two
     * answers in the list will remain after the limit rule has been processed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * The number of answers allowed to remain after the limit rule has been processed, keeping only
     * the first of the remaining answers in the list. Example: If the {@code count} property is set
     * to {@code 2} and four answers remain before the limit rule is processed, only the first two
     * answers in the list will remain after the limit rule has been processed.
     *
     * @return the value
     */
    public Integer getCount() {
        return count;
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
        sb.append("SteeringPolicyLimitRuleCase(");
        sb.append("super=").append(super.toString());
        sb.append("caseCondition=").append(String.valueOf(this.caseCondition));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SteeringPolicyLimitRuleCase)) {
            return false;
        }

        SteeringPolicyLimitRuleCase other = (SteeringPolicyLimitRuleCase) o;
        return java.util.Objects.equals(this.caseCondition, other.caseCondition)
                && java.util.Objects.equals(this.count, other.count)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.caseCondition == null ? 43 : this.caseCondition.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
