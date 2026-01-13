/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * <br>
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
        builder = RemotePeeringConnectionDrgAttachmentNetworkCreateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RemotePeeringConnectionDrgAttachmentNetworkCreateDetails
        extends DrgAttachmentNetworkCreateDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * compartment that contains the remote peering connection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * compartment that contains the remote peering connection.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The BGP ASN to use for the remote peering connection's route target. */
        @com.fasterxml.jackson.annotation.JsonProperty("regionalOciAsn")
        private String regionalOciAsn;

        /**
         * The BGP ASN to use for the remote peering connection's route target.
         *
         * @param regionalOciAsn the value to set
         * @return this builder
         */
        public Builder regionalOciAsn(String regionalOciAsn) {
            this.regionalOciAsn = regionalOciAsn;
            this.__explicitlySet__.add("regionalOciAsn");
            return this;
        }
        /**
         * Whether the RPC attachment is for a GFC DRG, indicating the mpls label should be
         * allocated from the VC label range.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isGlobalFastConnect")
        private Boolean isGlobalFastConnect;

        /**
         * Whether the RPC attachment is for a GFC DRG, indicating the mpls label should be
         * allocated from the VC label range.
         *
         * <p>Example: {@code true}
         *
         * @param isGlobalFastConnect the value to set
         * @return this builder
         */
        public Builder isGlobalFastConnect(Boolean isGlobalFastConnect) {
            this.isGlobalFastConnect = isGlobalFastConnect;
            this.__explicitlySet__.add("isGlobalFastConnect");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemotePeeringConnectionDrgAttachmentNetworkCreateDetails build() {
            RemotePeeringConnectionDrgAttachmentNetworkCreateDetails model =
                    new RemotePeeringConnectionDrgAttachmentNetworkCreateDetails(
                            this.id,
                            this.compartmentId,
                            this.regionalOciAsn,
                            this.isGlobalFastConnect);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemotePeeringConnectionDrgAttachmentNetworkCreateDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("regionalOciAsn")) {
                this.regionalOciAsn(model.getRegionalOciAsn());
            }
            if (model.wasPropertyExplicitlySet("isGlobalFastConnect")) {
                this.isGlobalFastConnect(model.getIsGlobalFastConnect());
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
    public RemotePeeringConnectionDrgAttachmentNetworkCreateDetails(
            String id, String compartmentId, String regionalOciAsn, Boolean isGlobalFastConnect) {
        super(id);
        this.compartmentId = compartmentId;
        this.regionalOciAsn = regionalOciAsn;
        this.isGlobalFastConnect = isGlobalFastConnect;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * compartment that contains the remote peering connection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * compartment that contains the remote peering connection.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The BGP ASN to use for the remote peering connection's route target. */
    @com.fasterxml.jackson.annotation.JsonProperty("regionalOciAsn")
    private final String regionalOciAsn;

    /**
     * The BGP ASN to use for the remote peering connection's route target.
     *
     * @return the value
     */
    public String getRegionalOciAsn() {
        return regionalOciAsn;
    }

    /**
     * Whether the RPC attachment is for a GFC DRG, indicating the mpls label should be allocated
     * from the VC label range.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isGlobalFastConnect")
    private final Boolean isGlobalFastConnect;

    /**
     * Whether the RPC attachment is for a GFC DRG, indicating the mpls label should be allocated
     * from the VC label range.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsGlobalFastConnect() {
        return isGlobalFastConnect;
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
        sb.append("RemotePeeringConnectionDrgAttachmentNetworkCreateDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", regionalOciAsn=").append(String.valueOf(this.regionalOciAsn));
        sb.append(", isGlobalFastConnect=").append(String.valueOf(this.isGlobalFastConnect));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemotePeeringConnectionDrgAttachmentNetworkCreateDetails)) {
            return false;
        }

        RemotePeeringConnectionDrgAttachmentNetworkCreateDetails other =
                (RemotePeeringConnectionDrgAttachmentNetworkCreateDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.regionalOciAsn, other.regionalOciAsn)
                && java.util.Objects.equals(this.isGlobalFastConnect, other.isGlobalFastConnect)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.regionalOciAsn == null ? 43 : this.regionalOciAsn.hashCode());
        result =
                (result * PRIME)
                        + (this.isGlobalFastConnect == null
                                ? 43
                                : this.isGlobalFastConnect.hashCode());
        return result;
    }
}
