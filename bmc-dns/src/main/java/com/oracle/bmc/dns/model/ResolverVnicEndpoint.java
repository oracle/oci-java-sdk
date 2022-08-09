/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * An OCI DNS resolver VNIC endpoint. A VNIC is created for each ResolverVnicEndpoint. VCNs and subnets cannot be
 * deleted while ResolverVnicEndpoints exist in them due to the VNIC.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResolverVnicEndpoint.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "endpointType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResolverVnicEndpoint extends ResolverEndpoint {
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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("self")
        private String self;

        public Builder self(String self) {
            this.self = self;
            this.__explicitlySet__.add("self");
            return this;
        }
        /**
         * The OCID of a subnet. Must be part of the VCN that the resolver is attached to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of a subnet. Must be part of the VCN that the resolver is attached to.
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * An array of network security group OCIDs for the resolver endpoint. These must be part of the VCN that the
         * resolver endpoint is a part of.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * An array of network security group OCIDs for the resolver endpoint. These must be part of the VCN that the
         * resolver endpoint is a part of.
         *
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResolverVnicEndpoint build() {
            ResolverVnicEndpoint model =
                    new ResolverVnicEndpoint(
                            this.name,
                            this.forwardingAddress,
                            this.isForwarding,
                            this.isListening,
                            this.listeningAddress,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.self,
                            this.subnetId,
                            this.nsgIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResolverVnicEndpoint model) {
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
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("self")) {
                this.self(model.getSelf());
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

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public ResolverVnicEndpoint(
            String name,
            String forwardingAddress,
            Boolean isForwarding,
            Boolean isListening,
            String listeningAddress,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String self,
            String subnetId,
            java.util.List<String> nsgIds) {
        super(
                name,
                forwardingAddress,
                isForwarding,
                isListening,
                listeningAddress,
                compartmentId,
                timeCreated,
                timeUpdated,
                lifecycleState,
                self);
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
    }

    /**
     * The OCID of a subnet. Must be part of the VCN that the resolver is attached to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of a subnet. Must be part of the VCN that the resolver is attached to.
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * An array of network security group OCIDs for the resolver endpoint. These must be part of the VCN that the
     * resolver endpoint is a part of.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * An array of network security group OCIDs for the resolver endpoint. These must be part of the VCN that the
     * resolver endpoint is a part of.
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResolverVnicEndpoint(");
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
        if (!(o instanceof ResolverVnicEndpoint)) {
            return false;
        }

        ResolverVnicEndpoint other = (ResolverVnicEndpoint) o;
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
