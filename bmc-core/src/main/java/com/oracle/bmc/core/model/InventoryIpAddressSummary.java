/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Provides the IP address and its corresponding VNIC ID, VNIC name, and DNS hostname. <br>
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
        builder = InventoryIpAddressSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InventoryIpAddressSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ipAddress", "vnicId", "vnicName", "dnsHostName"})
    public InventoryIpAddressSummary(
            String ipAddress, String vnicId, String vnicName, String dnsHostName) {
        super();
        this.ipAddress = ipAddress;
        this.vnicId = vnicId;
        this.vnicName = vnicName;
        this.dnsHostName = dnsHostName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The IP address assigned from a subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The IP address assigned from a subnet.
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VNIC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VNIC.
         *
         * @param vnicId the value to set
         * @return this builder
         */
        public Builder vnicId(String vnicId) {
            this.vnicId = vnicId;
            this.__explicitlySet__.add("vnicId");
            return this;
        }
        /** The name of the VNIC. */
        @com.fasterxml.jackson.annotation.JsonProperty("vnicName")
        private String vnicName;

        /**
         * The name of the VNIC.
         *
         * @param vnicName the value to set
         * @return this builder
         */
        public Builder vnicName(String vnicName) {
            this.vnicName = vnicName;
            this.__explicitlySet__.add("vnicName");
            return this;
        }
        /** The DNS hostname of the resource assigned with the IP address. */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsHostName")
        private String dnsHostName;

        /**
         * The DNS hostname of the resource assigned with the IP address.
         *
         * @param dnsHostName the value to set
         * @return this builder
         */
        public Builder dnsHostName(String dnsHostName) {
            this.dnsHostName = dnsHostName;
            this.__explicitlySet__.add("dnsHostName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InventoryIpAddressSummary build() {
            InventoryIpAddressSummary model =
                    new InventoryIpAddressSummary(
                            this.ipAddress, this.vnicId, this.vnicName, this.dnsHostName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InventoryIpAddressSummary model) {
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("vnicId")) {
                this.vnicId(model.getVnicId());
            }
            if (model.wasPropertyExplicitlySet("vnicName")) {
                this.vnicName(model.getVnicName());
            }
            if (model.wasPropertyExplicitlySet("dnsHostName")) {
                this.dnsHostName(model.getDnsHostName());
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

    /** The IP address assigned from a subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The IP address assigned from a subnet.
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * VNIC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * VNIC.
     *
     * @return the value
     */
    public String getVnicId() {
        return vnicId;
    }

    /** The name of the VNIC. */
    @com.fasterxml.jackson.annotation.JsonProperty("vnicName")
    private final String vnicName;

    /**
     * The name of the VNIC.
     *
     * @return the value
     */
    public String getVnicName() {
        return vnicName;
    }

    /** The DNS hostname of the resource assigned with the IP address. */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsHostName")
    private final String dnsHostName;

    /**
     * The DNS hostname of the resource assigned with the IP address.
     *
     * @return the value
     */
    public String getDnsHostName() {
        return dnsHostName;
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
        sb.append("InventoryIpAddressSummary(");
        sb.append("super=").append(super.toString());
        sb.append("ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", vnicId=").append(String.valueOf(this.vnicId));
        sb.append(", vnicName=").append(String.valueOf(this.vnicName));
        sb.append(", dnsHostName=").append(String.valueOf(this.dnsHostName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InventoryIpAddressSummary)) {
            return false;
        }

        InventoryIpAddressSummary other = (InventoryIpAddressSummary) o;
        return java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.vnicName, other.vnicName)
                && java.util.Objects.equals(this.dnsHostName, other.dnsHostName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result = (result * PRIME) + (this.vnicName == null ? 43 : this.vnicName.hashCode());
        result = (result * PRIME) + (this.dnsHostName == null ? 43 : this.dnsHostName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
