/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the subnet ingress security list configuration that allowed the traffic.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IngressSecurityListConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IngressSecurityListConfiguration extends AllowedSecurityConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the security
         * list that allowed the traffic.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityListId")
        private String securityListId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the security
         * list that allowed the traffic.
         *
         * @param securityListId the value to set
         * @return this builder
         **/
        public Builder securityListId(String securityListId) {
            this.securityListId = securityListId;
            this.__explicitlySet__.add("securityListId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityRule")
        private IngressSecurityRule securityRule;

        public Builder securityRule(IngressSecurityRule securityRule) {
            this.securityRule = securityRule;
            this.__explicitlySet__.add("securityRule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IngressSecurityListConfiguration build() {
            IngressSecurityListConfiguration __instance__ =
                    new IngressSecurityListConfiguration(securityListId, securityRule);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IngressSecurityListConfiguration o) {
            Builder copiedBuilder =
                    securityListId(o.getSecurityListId()).securityRule(o.getSecurityRule());

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

    @Deprecated
    public IngressSecurityListConfiguration(
            String securityListId, IngressSecurityRule securityRule) {
        super();
        this.securityListId = securityListId;
        this.securityRule = securityRule;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the security
     * list that allowed the traffic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityListId")
    private final String securityListId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the security
     * list that allowed the traffic.
     *
     * @return the value
     **/
    public String getSecurityListId() {
        return securityListId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("securityRule")
    private final IngressSecurityRule securityRule;

    public IngressSecurityRule getSecurityRule() {
        return securityRule;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IngressSecurityListConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append(", securityListId=").append(String.valueOf(this.securityListId));
        sb.append(", securityRule=").append(String.valueOf(this.securityRule));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IngressSecurityListConfiguration)) {
            return false;
        }

        IngressSecurityListConfiguration other = (IngressSecurityListConfiguration) o;
        return java.util.Objects.equals(this.securityListId, other.securityListId)
                && java.util.Objects.equals(this.securityRule, other.securityRule)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.securityListId == null ? 43 : this.securityListId.hashCode());
        result = (result * PRIME) + (this.securityRule == null ? 43 : this.securityRule.hashCode());
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
