/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The CIDR utilization details of a subnet. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IpInventoryCidrUtilizationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IpInventoryCidrUtilizationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"cidr", "utilization", "addressType"})
    public IpInventoryCidrUtilizationSummary(String cidr, Float utilization, String addressType) {
        super();
        this.cidr = cidr;
        this.utilization = utilization;
        this.addressType = addressType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The CIDR range of a subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("cidr")
        private String cidr;

        /**
         * The CIDR range of a subnet.
         *
         * @param cidr the value to set
         * @return this builder
         */
        public Builder cidr(String cidr) {
            this.cidr = cidr;
            this.__explicitlySet__.add("cidr");
            return this;
        }
        /** The CIDR utilisation of a subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("utilization")
        private Float utilization;

        /**
         * The CIDR utilisation of a subnet.
         *
         * @param utilization the value to set
         * @return this builder
         */
        public Builder utilization(Float utilization) {
            this.utilization = utilization;
            this.__explicitlySet__.add("utilization");
            return this;
        }
        /** Address type of the CIDR within a subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("addressType")
        private String addressType;

        /**
         * Address type of the CIDR within a subnet.
         *
         * @param addressType the value to set
         * @return this builder
         */
        public Builder addressType(String addressType) {
            this.addressType = addressType;
            this.__explicitlySet__.add("addressType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IpInventoryCidrUtilizationSummary build() {
            IpInventoryCidrUtilizationSummary model =
                    new IpInventoryCidrUtilizationSummary(
                            this.cidr, this.utilization, this.addressType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IpInventoryCidrUtilizationSummary model) {
            if (model.wasPropertyExplicitlySet("cidr")) {
                this.cidr(model.getCidr());
            }
            if (model.wasPropertyExplicitlySet("utilization")) {
                this.utilization(model.getUtilization());
            }
            if (model.wasPropertyExplicitlySet("addressType")) {
                this.addressType(model.getAddressType());
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

    /** The CIDR range of a subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("cidr")
    private final String cidr;

    /**
     * The CIDR range of a subnet.
     *
     * @return the value
     */
    public String getCidr() {
        return cidr;
    }

    /** The CIDR utilisation of a subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("utilization")
    private final Float utilization;

    /**
     * The CIDR utilisation of a subnet.
     *
     * @return the value
     */
    public Float getUtilization() {
        return utilization;
    }

    /** Address type of the CIDR within a subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("addressType")
    private final String addressType;

    /**
     * Address type of the CIDR within a subnet.
     *
     * @return the value
     */
    public String getAddressType() {
        return addressType;
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
        sb.append("IpInventoryCidrUtilizationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("cidr=").append(String.valueOf(this.cidr));
        sb.append(", utilization=").append(String.valueOf(this.utilization));
        sb.append(", addressType=").append(String.valueOf(this.addressType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IpInventoryCidrUtilizationSummary)) {
            return false;
        }

        IpInventoryCidrUtilizationSummary other = (IpInventoryCidrUtilizationSummary) o;
        return java.util.Objects.equals(this.cidr, other.cidr)
                && java.util.Objects.equals(this.utilization, other.utilization)
                && java.util.Objects.equals(this.addressType, other.addressType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cidr == null ? 43 : this.cidr.hashCode());
        result = (result * PRIME) + (this.utilization == null ? 43 : this.utilization.hashCode());
        result = (result * PRIME) + (this.addressType == null ? 43 : this.addressType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
