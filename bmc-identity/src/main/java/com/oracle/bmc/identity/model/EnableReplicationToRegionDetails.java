/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * (For tenancies that support identity domains) Identity domain replication request packet. <br>
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
        builder = EnableReplicationToRegionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EnableReplicationToRegionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"replicaRegion"})
    public EnableReplicationToRegionDetails(String replicaRegion) {
        super();
        this.replicaRegion = replicaRegion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A region to which you want identity domain replication to occur. See [Regions and
         * Availability Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm)
         * for the full list of supported region names.
         *
         * <p>Example: {@code us-phoenix-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicaRegion")
        private String replicaRegion;

        /**
         * A region to which you want identity domain replication to occur. See [Regions and
         * Availability Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm)
         * for the full list of supported region names.
         *
         * <p>Example: {@code us-phoenix-1}
         *
         * @param replicaRegion the value to set
         * @return this builder
         */
        public Builder replicaRegion(String replicaRegion) {
            this.replicaRegion = replicaRegion;
            this.__explicitlySet__.add("replicaRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnableReplicationToRegionDetails build() {
            EnableReplicationToRegionDetails model =
                    new EnableReplicationToRegionDetails(this.replicaRegion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnableReplicationToRegionDetails model) {
            if (model.wasPropertyExplicitlySet("replicaRegion")) {
                this.replicaRegion(model.getReplicaRegion());
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
     * A region to which you want identity domain replication to occur. See [Regions and
     * Availability Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm) for
     * the full list of supported region names.
     *
     * <p>Example: {@code us-phoenix-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicaRegion")
    private final String replicaRegion;

    /**
     * A region to which you want identity domain replication to occur. See [Regions and
     * Availability Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm) for
     * the full list of supported region names.
     *
     * <p>Example: {@code us-phoenix-1}
     *
     * @return the value
     */
    public String getReplicaRegion() {
        return replicaRegion;
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
        sb.append("EnableReplicationToRegionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("replicaRegion=").append(String.valueOf(this.replicaRegion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnableReplicationToRegionDetails)) {
            return false;
        }

        EnableReplicationToRegionDetails other = (EnableReplicationToRegionDetails) o;
        return java.util.Objects.equals(this.replicaRegion, other.replicaRegion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.replicaRegion == null ? 43 : this.replicaRegion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
