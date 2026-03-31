/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.gdp.model;

/**
 * Details about the peering pipeline.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PeerGdpPipelineDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PeerGdpPipelineDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"peeringGdpPipelineId", "peerValidationNonce"})
    public PeerGdpPipelineDetails(String peeringGdpPipelineId, String peerValidationNonce) {
        super();
        this.peeringGdpPipelineId = peeringGdpPipelineId;
        this.peerValidationNonce = peerValidationNonce;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the peering pipeline.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peeringGdpPipelineId")
        private String peeringGdpPipelineId;

        /**
         * OCID of the peering pipeline.
         * @param peeringGdpPipelineId the value to set
         * @return this builder
         **/
        public Builder peeringGdpPipelineId(String peeringGdpPipelineId) {
            this.peeringGdpPipelineId = peeringGdpPipelineId;
            this.__explicitlySet__.add("peeringGdpPipelineId");
            return this;
        }
        /**
         * Unique one-time-token generated to validate the identity of the sender and prevent the peer request from being tampered with.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peerValidationNonce")
        private String peerValidationNonce;

        /**
         * Unique one-time-token generated to validate the identity of the sender and prevent the peer request from being tampered with.
         * @param peerValidationNonce the value to set
         * @return this builder
         **/
        public Builder peerValidationNonce(String peerValidationNonce) {
            this.peerValidationNonce = peerValidationNonce;
            this.__explicitlySet__.add("peerValidationNonce");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PeerGdpPipelineDetails build() {
            PeerGdpPipelineDetails model =
                    new PeerGdpPipelineDetails(this.peeringGdpPipelineId, this.peerValidationNonce);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PeerGdpPipelineDetails model) {
            if (model.wasPropertyExplicitlySet("peeringGdpPipelineId")) {
                this.peeringGdpPipelineId(model.getPeeringGdpPipelineId());
            }
            if (model.wasPropertyExplicitlySet("peerValidationNonce")) {
                this.peerValidationNonce(model.getPeerValidationNonce());
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

    /**
     * OCID of the peering pipeline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peeringGdpPipelineId")
    private final String peeringGdpPipelineId;

    /**
     * OCID of the peering pipeline.
     * @return the value
     **/
    public String getPeeringGdpPipelineId() {
        return peeringGdpPipelineId;
    }

    /**
     * Unique one-time-token generated to validate the identity of the sender and prevent the peer request from being tampered with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerValidationNonce")
    private final String peerValidationNonce;

    /**
     * Unique one-time-token generated to validate the identity of the sender and prevent the peer request from being tampered with.
     * @return the value
     **/
    public String getPeerValidationNonce() {
        return peerValidationNonce;
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
        sb.append("PeerGdpPipelineDetails(");
        sb.append("super=").append(super.toString());
        sb.append("peeringGdpPipelineId=").append(String.valueOf(this.peeringGdpPipelineId));
        sb.append(", peerValidationNonce=").append(String.valueOf(this.peerValidationNonce));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeerGdpPipelineDetails)) {
            return false;
        }

        PeerGdpPipelineDetails other = (PeerGdpPipelineDetails) o;
        return java.util.Objects.equals(this.peeringGdpPipelineId, other.peeringGdpPipelineId)
                && java.util.Objects.equals(this.peerValidationNonce, other.peerValidationNonce)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.peeringGdpPipelineId == null
                                ? 43
                                : this.peeringGdpPipelineId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerValidationNonce == null
                                ? 43
                                : this.peerValidationNonce.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
