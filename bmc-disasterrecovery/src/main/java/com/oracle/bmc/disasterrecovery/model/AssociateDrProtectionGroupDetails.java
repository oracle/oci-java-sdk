/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for associating this DR Protection Group with a peer (remote) DR Protection Group.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AssociateDrProtectionGroupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AssociateDrProtectionGroupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"peerId", "peerRegion", "role"})
    public AssociateDrProtectionGroupDetails(
            String peerId, String peerRegion, DrProtectionGroupRole role) {
        super();
        this.peerId = peerId;
        this.peerRegion = peerRegion;
        this.role = role;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the peer (remote) DR Protection Group.
         *
         * <p>Example: {@code ocid1.drprotectiongroup.oc1.iad.exampleocid2}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerId")
        private String peerId;

        /**
         * The OCID of the peer (remote) DR Protection Group.
         *
         * <p>Example: {@code ocid1.drprotectiongroup.oc1.iad.exampleocid2}
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
         * The region of the peer (remote) DR Protection Group.
         *
         * <p>Example: {@code us-ashburn-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerRegion")
        private String peerRegion;

        /**
         * The region of the peer (remote) DR Protection Group.
         *
         * <p>Example: {@code us-ashburn-1}
         *
         * @param peerRegion the value to set
         * @return this builder
         */
        public Builder peerRegion(String peerRegion) {
            this.peerRegion = peerRegion;
            this.__explicitlySet__.add("peerRegion");
            return this;
        }
        /** The role of this DR Protection Group. */
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private DrProtectionGroupRole role;

        /**
         * The role of this DR Protection Group.
         *
         * @param role the value to set
         * @return this builder
         */
        public Builder role(DrProtectionGroupRole role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociateDrProtectionGroupDetails build() {
            AssociateDrProtectionGroupDetails model =
                    new AssociateDrProtectionGroupDetails(this.peerId, this.peerRegion, this.role);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociateDrProtectionGroupDetails model) {
            if (model.wasPropertyExplicitlySet("peerId")) {
                this.peerId(model.getPeerId());
            }
            if (model.wasPropertyExplicitlySet("peerRegion")) {
                this.peerRegion(model.getPeerRegion());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
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
     * The OCID of the peer (remote) DR Protection Group.
     *
     * <p>Example: {@code ocid1.drprotectiongroup.oc1.iad.exampleocid2}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerId")
    private final String peerId;

    /**
     * The OCID of the peer (remote) DR Protection Group.
     *
     * <p>Example: {@code ocid1.drprotectiongroup.oc1.iad.exampleocid2}
     *
     * @return the value
     */
    public String getPeerId() {
        return peerId;
    }

    /**
     * The region of the peer (remote) DR Protection Group.
     *
     * <p>Example: {@code us-ashburn-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerRegion")
    private final String peerRegion;

    /**
     * The region of the peer (remote) DR Protection Group.
     *
     * <p>Example: {@code us-ashburn-1}
     *
     * @return the value
     */
    public String getPeerRegion() {
        return peerRegion;
    }

    /** The role of this DR Protection Group. */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final DrProtectionGroupRole role;

    /**
     * The role of this DR Protection Group.
     *
     * @return the value
     */
    public DrProtectionGroupRole getRole() {
        return role;
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
        sb.append("AssociateDrProtectionGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("peerId=").append(String.valueOf(this.peerId));
        sb.append(", peerRegion=").append(String.valueOf(this.peerRegion));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociateDrProtectionGroupDetails)) {
            return false;
        }

        AssociateDrProtectionGroupDetails other = (AssociateDrProtectionGroupDetails) o;
        return java.util.Objects.equals(this.peerId, other.peerId)
                && java.util.Objects.equals(this.peerRegion, other.peerRegion)
                && java.util.Objects.equals(this.role, other.role)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.peerId == null ? 43 : this.peerId.hashCode());
        result = (result * PRIME) + (this.peerRegion == null ? 43 : this.peerRegion.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
