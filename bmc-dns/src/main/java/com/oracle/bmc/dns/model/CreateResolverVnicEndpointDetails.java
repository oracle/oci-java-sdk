/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * The body for defining a new resolver VNIC endpoint. Either isForwarding or isListening must be
 * true, but not both. If isListening is true, a listeningAddress may be provided. If isForwarding
 * is true, a forwardingAddress may be provided. When not provided, an address will be chosen
 * automatically.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateResolverVnicEndpointDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "endpointType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateResolverVnicEndpointDetails extends CreateResolverEndpointDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("forwardingAddress")
        private String forwardingAddress;

        public Builder forwardingAddress(String forwardingAddress) {
            this.forwardingAddress = forwardingAddress;
            this.__explicitlySet__.add("forwardingAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isForwarding")
        private Boolean isForwarding;

        public Builder isForwarding(Boolean isForwarding) {
            this.isForwarding = isForwarding;
            this.__explicitlySet__.add("isForwarding");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isListening")
        private Boolean isListening;

        public Builder isListening(Boolean isListening) {
            this.isListening = isListening;
            this.__explicitlySet__.add("isListening");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listeningAddress")
        private String listeningAddress;

        public Builder listeningAddress(String listeningAddress) {
            this.listeningAddress = listeningAddress;
            this.__explicitlySet__.add("listeningAddress");
            return this;
        }
        /** The OCID of a subnet. Must be part of the VCN that the resolver is attached to. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of a subnet. Must be part of the VCN that the resolver is attached to.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * An array of network security group OCIDs for the resolver endpoint. These must be part of
         * the VCN that the resolver endpoint is a part of.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * An array of network security group OCIDs for the resolver endpoint. These must be part of
         * the VCN that the resolver endpoint is a part of.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateResolverVnicEndpointDetails build() {
            CreateResolverVnicEndpointDetails model =
                    new CreateResolverVnicEndpointDetails(
                            this.name,
                            this.forwardingAddress,
                            this.isForwarding,
                            this.isListening,
                            this.listeningAddress,
                            this.subnetId,
                            this.nsgIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateResolverVnicEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("forwardingAddress")) {
                this.forwardingAddress(model.getForwardingAddress());
            }
            if (model.wasPropertyExplicitlySet("isForwarding")) {
                this.isForwarding(model.getIsForwarding());
            }
            if (model.wasPropertyExplicitlySet("isListening")) {
                this.isListening(model.getIsListening());
            }
            if (model.wasPropertyExplicitlySet("listeningAddress")) {
                this.listeningAddress(model.getListeningAddress());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
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
    public CreateResolverVnicEndpointDetails(
            String name,
            String forwardingAddress,
            Boolean isForwarding,
            Boolean isListening,
            String listeningAddress,
            String subnetId,
            java.util.List<String> nsgIds) {
        super(name, forwardingAddress, isForwarding, isListening, listeningAddress);
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
    }

    /** The OCID of a subnet. Must be part of the VCN that the resolver is attached to. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of a subnet. Must be part of the VCN that the resolver is attached to.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * An array of network security group OCIDs for the resolver endpoint. These must be part of the
     * VCN that the resolver endpoint is a part of.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * An array of network security group OCIDs for the resolver endpoint. These must be part of the
     * VCN that the resolver endpoint is a part of.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
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
        sb.append("CreateResolverVnicEndpointDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateResolverVnicEndpointDetails)) {
            return false;
        }

        CreateResolverVnicEndpointDetails other = (CreateResolverVnicEndpointDetails) o;
        return java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        return result;
    }
}
