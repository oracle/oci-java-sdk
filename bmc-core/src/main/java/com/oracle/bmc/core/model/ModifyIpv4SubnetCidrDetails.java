/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details object for updating the specified Ipv4 CIDR block of a Subnet. <br>
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
        builder = ModifyIpv4SubnetCidrDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModifyIpv4SubnetCidrDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ipv4CidrBlock", "updatedIpv4CidrBlock"})
    public ModifyIpv4SubnetCidrDetails(String ipv4CidrBlock, String updatedIpv4CidrBlock) {
        super();
        this.ipv4CidrBlock = ipv4CidrBlock;
        this.updatedIpv4CidrBlock = updatedIpv4CidrBlock;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Ipv4 CIDR IP address to update. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv4CidrBlock")
        private String ipv4CidrBlock;

        /**
         * The Ipv4 CIDR IP address to update.
         *
         * @param ipv4CidrBlock the value to set
         * @return this builder
         */
        public Builder ipv4CidrBlock(String ipv4CidrBlock) {
            this.ipv4CidrBlock = ipv4CidrBlock;
            this.__explicitlySet__.add("ipv4CidrBlock");
            return this;
        }
        /** The new Ipv4 CIDR IP address. */
        @com.fasterxml.jackson.annotation.JsonProperty("updatedIpv4CidrBlock")
        private String updatedIpv4CidrBlock;

        /**
         * The new Ipv4 CIDR IP address.
         *
         * @param updatedIpv4CidrBlock the value to set
         * @return this builder
         */
        public Builder updatedIpv4CidrBlock(String updatedIpv4CidrBlock) {
            this.updatedIpv4CidrBlock = updatedIpv4CidrBlock;
            this.__explicitlySet__.add("updatedIpv4CidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModifyIpv4SubnetCidrDetails build() {
            ModifyIpv4SubnetCidrDetails model =
                    new ModifyIpv4SubnetCidrDetails(this.ipv4CidrBlock, this.updatedIpv4CidrBlock);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModifyIpv4SubnetCidrDetails model) {
            if (model.wasPropertyExplicitlySet("ipv4CidrBlock")) {
                this.ipv4CidrBlock(model.getIpv4CidrBlock());
            }
            if (model.wasPropertyExplicitlySet("updatedIpv4CidrBlock")) {
                this.updatedIpv4CidrBlock(model.getUpdatedIpv4CidrBlock());
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

    /** The Ipv4 CIDR IP address to update. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv4CidrBlock")
    private final String ipv4CidrBlock;

    /**
     * The Ipv4 CIDR IP address to update.
     *
     * @return the value
     */
    public String getIpv4CidrBlock() {
        return ipv4CidrBlock;
    }

    /** The new Ipv4 CIDR IP address. */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedIpv4CidrBlock")
    private final String updatedIpv4CidrBlock;

    /**
     * The new Ipv4 CIDR IP address.
     *
     * @return the value
     */
    public String getUpdatedIpv4CidrBlock() {
        return updatedIpv4CidrBlock;
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
        sb.append("ModifyIpv4SubnetCidrDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ipv4CidrBlock=").append(String.valueOf(this.ipv4CidrBlock));
        sb.append(", updatedIpv4CidrBlock=").append(String.valueOf(this.updatedIpv4CidrBlock));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModifyIpv4SubnetCidrDetails)) {
            return false;
        }

        ModifyIpv4SubnetCidrDetails other = (ModifyIpv4SubnetCidrDetails) o;
        return java.util.Objects.equals(this.ipv4CidrBlock, other.ipv4CidrBlock)
                && java.util.Objects.equals(this.updatedIpv4CidrBlock, other.updatedIpv4CidrBlock)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ipv4CidrBlock == null ? 43 : this.ipv4CidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.updatedIpv4CidrBlock == null
                                ? 43
                                : this.updatedIpv4CidrBlock.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
