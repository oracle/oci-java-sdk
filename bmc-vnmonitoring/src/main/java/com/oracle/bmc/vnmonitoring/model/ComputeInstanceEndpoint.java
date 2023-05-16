/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the details required for a COMPUTE_INSTANCE-type {@code Endpoint}. <br>
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
        builder = ComputeInstanceEndpoint.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeInstanceEndpoint extends Endpoint {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The IPv4 address of the COMPUTE_INSTANCE-type {@code Endpoint} object. */
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private String address;

        /**
         * The IPv4 address of the COMPUTE_INSTANCE-type {@code Endpoint} object.
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
         * compute instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compute instance.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VNIC attached to the compute instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VNIC attached to the compute instance.
         *
         * @param vnicId the value to set
         * @return this builder
         */
        public Builder vnicId(String vnicId) {
            this.vnicId = vnicId;
            this.__explicitlySet__.add("vnicId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeInstanceEndpoint build() {
            ComputeInstanceEndpoint model =
                    new ComputeInstanceEndpoint(this.address, this.instanceId, this.vnicId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeInstanceEndpoint model) {
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("vnicId")) {
                this.vnicId(model.getVnicId());
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
    public ComputeInstanceEndpoint(String address, String instanceId, String vnicId) {
        super();
        this.address = address;
        this.instanceId = instanceId;
        this.vnicId = vnicId;
    }

    /** The IPv4 address of the COMPUTE_INSTANCE-type {@code Endpoint} object. */
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final String address;

    /**
     * The IPv4 address of the COMPUTE_INSTANCE-type {@code Endpoint} object.
     *
     * @return the value
     */
    public String getAddress() {
        return address;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compute instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compute instance.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VNIC attached to the compute instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VNIC attached to the compute instance.
     *
     * @return the value
     */
    public String getVnicId() {
        return vnicId;
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
        sb.append("ComputeInstanceEndpoint(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", address=").append(String.valueOf(this.address));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", vnicId=").append(String.valueOf(this.vnicId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeInstanceEndpoint)) {
            return false;
        }

        ComputeInstanceEndpoint other = (ComputeInstanceEndpoint) o;
        return java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.vnicId, other.vnicId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.address == null ? 43 : this.address.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        return result;
    }
}
