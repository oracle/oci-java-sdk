/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the network security group configuration that allowed the traffic.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NsgConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NsgConfiguration extends AllowedSecurityConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network
         * security group that allowed the traffic.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgId")
        private String nsgId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network
         * security group that allowed the traffic.
         *
         * @param nsgId the value to set
         * @return this builder
         **/
        public Builder nsgId(String nsgId) {
            this.nsgId = nsgId;
            this.__explicitlySet__.add("nsgId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityRule")
        private SecurityRule securityRule;

        public Builder securityRule(SecurityRule securityRule) {
            this.securityRule = securityRule;
            this.__explicitlySet__.add("securityRule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NsgConfiguration build() {
            NsgConfiguration model = new NsgConfiguration(this.nsgId, this.securityRule);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NsgConfiguration model) {
            if (model.wasPropertyExplicitlySet("nsgId")) {
                this.nsgId(model.getNsgId());
            }
            if (model.wasPropertyExplicitlySet("securityRule")) {
                this.securityRule(model.getSecurityRule());
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

    @Deprecated
    public NsgConfiguration(String nsgId, SecurityRule securityRule) {
        super();
        this.nsgId = nsgId;
        this.securityRule = securityRule;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network
     * security group that allowed the traffic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgId")
    private final String nsgId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network
     * security group that allowed the traffic.
     *
     * @return the value
     **/
    public String getNsgId() {
        return nsgId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("securityRule")
    private final SecurityRule securityRule;

    public SecurityRule getSecurityRule() {
        return securityRule;
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
        sb.append("NsgConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", nsgId=").append(String.valueOf(this.nsgId));
        sb.append(", securityRule=").append(String.valueOf(this.securityRule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NsgConfiguration)) {
            return false;
        }

        NsgConfiguration other = (NsgConfiguration) o;
        return java.util.Objects.equals(this.nsgId, other.nsgId)
                && java.util.Objects.equals(this.securityRule, other.securityRule)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.nsgId == null ? 43 : this.nsgId.hashCode());
        result = (result * PRIME) + (this.securityRule == null ? 43 : this.securityRule.hashCode());
        return result;
    }
}
