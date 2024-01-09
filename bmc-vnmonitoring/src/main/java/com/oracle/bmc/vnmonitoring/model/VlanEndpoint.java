/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the details required for a VLAN-type {@code Endpoint}. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VlanEndpoint.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VlanEndpoint extends Endpoint {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The IPv4 address of the {@code Endpoint}. */
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private String address;

        /**
         * The IPv4 address of the {@code Endpoint}.
         *
         * @param address the value to set
         * @return this builder
         */
        public Builder address(String address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN containing the IP address. This can be used to disambiguate which VLAN is queried,
         * in case the endpoint IP address belongs to more than one VLAN (when there are VLANs with
         * overlapping IP ranges).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
        private String vlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN containing the IP address. This can be used to disambiguate which VLAN is queried,
         * in case the endpoint IP address belongs to more than one VLAN (when there are VLANs with
         * overlapping IP ranges).
         *
         * @param vlanId the value to set
         * @return this builder
         */
        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            this.__explicitlySet__.add("vlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VlanEndpoint build() {
            VlanEndpoint model = new VlanEndpoint(this.address, this.vlanId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VlanEndpoint model) {
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("vlanId")) {
                this.vlanId(model.getVlanId());
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

    @Deprecated
    public VlanEndpoint(String address, String vlanId) {
        super();
        this.address = address;
        this.vlanId = vlanId;
    }

    /** The IPv4 address of the {@code Endpoint}. */
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final String address;

    /**
     * The IPv4 address of the {@code Endpoint}.
     *
     * @return the value
     */
    public String getAddress() {
        return address;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN containing the IP address. This can be used to disambiguate which VLAN is queried, in
     * case the endpoint IP address belongs to more than one VLAN (when there are VLANs with
     * overlapping IP ranges).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
    private final String vlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN containing the IP address. This can be used to disambiguate which VLAN is queried, in
     * case the endpoint IP address belongs to more than one VLAN (when there are VLANs with
     * overlapping IP ranges).
     *
     * @return the value
     */
    public String getVlanId() {
        return vlanId;
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
        sb.append("VlanEndpoint(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", address=").append(String.valueOf(this.address));
        sb.append(", vlanId=").append(String.valueOf(this.vlanId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VlanEndpoint)) {
            return false;
        }

        VlanEndpoint other = (VlanEndpoint) o;
        return java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.vlanId, other.vlanId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.address == null ? 43 : this.address.hashCode());
        result = (result * PRIME) + (this.vlanId == null ? 43 : this.vlanId.hashCode());
        return result;
    }
}
