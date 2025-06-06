/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Specifies the IPSec tunnel attached to the DRG. <br>
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
        builder = IpsecTunnelDrgAttachmentNetworkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IpsecTunnelDrgAttachmentNetworkDetails extends DrgAttachmentNetworkDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The IPSec connection that contains the attached IPSec tunnel. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipsecConnectionId")
        private String ipsecConnectionId;

        /**
         * The IPSec connection that contains the attached IPSec tunnel.
         *
         * @param ipsecConnectionId the value to set
         * @return this builder
         */
        public Builder ipsecConnectionId(String ipsecConnectionId) {
            this.ipsecConnectionId = ipsecConnectionId;
            this.__explicitlySet__.add("ipsecConnectionId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * virtual circuit's DRG attachment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("transportAttachmentId")
        private String transportAttachmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * virtual circuit's DRG attachment.
         *
         * @param transportAttachmentId the value to set
         * @return this builder
         */
        public Builder transportAttachmentId(String transportAttachmentId) {
            this.transportAttachmentId = transportAttachmentId;
            this.__explicitlySet__.add("transportAttachmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IpsecTunnelDrgAttachmentNetworkDetails build() {
            IpsecTunnelDrgAttachmentNetworkDetails model =
                    new IpsecTunnelDrgAttachmentNetworkDetails(
                            this.id, this.ipsecConnectionId, this.transportAttachmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IpsecTunnelDrgAttachmentNetworkDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("ipsecConnectionId")) {
                this.ipsecConnectionId(model.getIpsecConnectionId());
            }
            if (model.wasPropertyExplicitlySet("transportAttachmentId")) {
                this.transportAttachmentId(model.getTransportAttachmentId());
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
    public IpsecTunnelDrgAttachmentNetworkDetails(
            String id, String ipsecConnectionId, String transportAttachmentId) {
        super(id);
        this.ipsecConnectionId = ipsecConnectionId;
        this.transportAttachmentId = transportAttachmentId;
    }

    /** The IPSec connection that contains the attached IPSec tunnel. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipsecConnectionId")
    private final String ipsecConnectionId;

    /**
     * The IPSec connection that contains the attached IPSec tunnel.
     *
     * @return the value
     */
    public String getIpsecConnectionId() {
        return ipsecConnectionId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * virtual circuit's DRG attachment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transportAttachmentId")
    private final String transportAttachmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * virtual circuit's DRG attachment.
     *
     * @return the value
     */
    public String getTransportAttachmentId() {
        return transportAttachmentId;
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
        sb.append("IpsecTunnelDrgAttachmentNetworkDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", ipsecConnectionId=").append(String.valueOf(this.ipsecConnectionId));
        sb.append(", transportAttachmentId=").append(String.valueOf(this.transportAttachmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IpsecTunnelDrgAttachmentNetworkDetails)) {
            return false;
        }

        IpsecTunnelDrgAttachmentNetworkDetails other = (IpsecTunnelDrgAttachmentNetworkDetails) o;
        return java.util.Objects.equals(this.ipsecConnectionId, other.ipsecConnectionId)
                && java.util.Objects.equals(this.transportAttachmentId, other.transportAttachmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.ipsecConnectionId == null ? 43 : this.ipsecConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.transportAttachmentId == null
                                ? 43
                                : this.transportAttachmentId.hashCode());
        return result;
    }
}
