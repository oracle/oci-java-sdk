/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Details required for creation of ExadbXs infrastructure based shard peer. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateShardPeerWithExadbXsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateShardPeerWithExadbXsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vmClusterId", "protectionMode", "transportType"})
    public CreateShardPeerWithExadbXsDetails(
            String vmClusterId,
            DistributedDbProtectionMode protectionMode,
            DistributedDbTransportType transportType) {
        super();
        this.vmClusterId = vmClusterId;
        this.protectionMode = protectionMode;
        this.transportType = transportType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VM Cluster for the shard peer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
        private String vmClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VM Cluster for the shard peer.
         *
         * @param vmClusterId the value to set
         * @return this builder
         */
        public Builder vmClusterId(String vmClusterId) {
            this.vmClusterId = vmClusterId;
            this.__explicitlySet__.add("vmClusterId");
            return this;
        }
        /** The protectionMode for the shard peer. */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private DistributedDbProtectionMode protectionMode;

        /**
         * The protectionMode for the shard peer.
         *
         * @param protectionMode the value to set
         * @return this builder
         */
        public Builder protectionMode(DistributedDbProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }
        /** The redo transport type to use for this Data Guard association. */
        @com.fasterxml.jackson.annotation.JsonProperty("transportType")
        private DistributedDbTransportType transportType;

        /**
         * The redo transport type to use for this Data Guard association.
         *
         * @param transportType the value to set
         * @return this builder
         */
        public Builder transportType(DistributedDbTransportType transportType) {
            this.transportType = transportType;
            this.__explicitlySet__.add("transportType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateShardPeerWithExadbXsDetails build() {
            CreateShardPeerWithExadbXsDetails model =
                    new CreateShardPeerWithExadbXsDetails(
                            this.vmClusterId, this.protectionMode, this.transportType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateShardPeerWithExadbXsDetails model) {
            if (model.wasPropertyExplicitlySet("vmClusterId")) {
                this.vmClusterId(model.getVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("transportType")) {
                this.transportType(model.getTransportType());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM
     * Cluster for the shard peer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
    private final String vmClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM
     * Cluster for the shard peer.
     *
     * @return the value
     */
    public String getVmClusterId() {
        return vmClusterId;
    }

    /** The protectionMode for the shard peer. */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final DistributedDbProtectionMode protectionMode;

    /**
     * The protectionMode for the shard peer.
     *
     * @return the value
     */
    public DistributedDbProtectionMode getProtectionMode() {
        return protectionMode;
    }

    /** The redo transport type to use for this Data Guard association. */
    @com.fasterxml.jackson.annotation.JsonProperty("transportType")
    private final DistributedDbTransportType transportType;

    /**
     * The redo transport type to use for this Data Guard association.
     *
     * @return the value
     */
    public DistributedDbTransportType getTransportType() {
        return transportType;
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
        sb.append("CreateShardPeerWithExadbXsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vmClusterId=").append(String.valueOf(this.vmClusterId));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", transportType=").append(String.valueOf(this.transportType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateShardPeerWithExadbXsDetails)) {
            return false;
        }

        CreateShardPeerWithExadbXsDetails other = (CreateShardPeerWithExadbXsDetails) o;
        return java.util.Objects.equals(this.vmClusterId, other.vmClusterId)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(this.transportType, other.transportType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vmClusterId == null ? 43 : this.vmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.transportType == null ? 43 : this.transportType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
