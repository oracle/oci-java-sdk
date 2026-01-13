/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Information about the other remote peering connection (RPC). <br>
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
        builder = ConnectRemotePeeringConnectionsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConnectRemotePeeringConnectionsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"peerId", "peerRegionName"})
    public ConnectRemotePeeringConnectionsDetails(String peerId, String peerRegionName) {
        super();
        this.peerId = peerId;
        this.peerRegionName = peerRegionName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * RPC you want to peer with.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerId")
        private String peerId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * RPC you want to peer with.
         *
         * @param peerId the value to set
         * @return this builder
         */
        public Builder peerId(String peerId) {
            this.peerId = peerId;
            this.__explicitlySet__.add("peerId");
            return this;
        }
        /**
         * The name of the region that contains the RPC you want to peer with.
         *
         * <p>Example: {@code us-ashburn-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerRegionName")
        private String peerRegionName;

        /**
         * The name of the region that contains the RPC you want to peer with.
         *
         * <p>Example: {@code us-ashburn-1}
         *
         * @param peerRegionName the value to set
         * @return this builder
         */
        public Builder peerRegionName(String peerRegionName) {
            this.peerRegionName = peerRegionName;
            this.__explicitlySet__.add("peerRegionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectRemotePeeringConnectionsDetails build() {
            ConnectRemotePeeringConnectionsDetails model =
                    new ConnectRemotePeeringConnectionsDetails(this.peerId, this.peerRegionName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectRemotePeeringConnectionsDetails model) {
            if (model.wasPropertyExplicitlySet("peerId")) {
                this.peerId(model.getPeerId());
            }
            if (model.wasPropertyExplicitlySet("peerRegionName")) {
                this.peerRegionName(model.getPeerRegionName());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the RPC
     * you want to peer with.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerId")
    private final String peerId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the RPC
     * you want to peer with.
     *
     * @return the value
     */
    public String getPeerId() {
        return peerId;
    }

    /**
     * The name of the region that contains the RPC you want to peer with.
     *
     * <p>Example: {@code us-ashburn-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerRegionName")
    private final String peerRegionName;

    /**
     * The name of the region that contains the RPC you want to peer with.
     *
     * <p>Example: {@code us-ashburn-1}
     *
     * @return the value
     */
    public String getPeerRegionName() {
        return peerRegionName;
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
        sb.append("ConnectRemotePeeringConnectionsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("peerId=").append(String.valueOf(this.peerId));
        sb.append(", peerRegionName=").append(String.valueOf(this.peerRegionName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectRemotePeeringConnectionsDetails)) {
            return false;
        }

        ConnectRemotePeeringConnectionsDetails other = (ConnectRemotePeeringConnectionsDetails) o;
        return java.util.Objects.equals(this.peerId, other.peerId)
                && java.util.Objects.equals(this.peerRegionName, other.peerRegionName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.peerId == null ? 43 : this.peerId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerRegionName == null ? 43 : this.peerRegionName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
