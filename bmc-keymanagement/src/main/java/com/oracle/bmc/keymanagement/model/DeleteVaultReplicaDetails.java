/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Deletes a vault replica <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DeleteVaultReplicaDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DeleteVaultReplicaDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"replicaRegion"})
    public DeleteVaultReplicaDetails(String replicaRegion) {
        super();
        this.replicaRegion = replicaRegion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The region in the realm on which the replica should be deleted */
        @com.fasterxml.jackson.annotation.JsonProperty("replicaRegion")
        private String replicaRegion;

        /**
         * The region in the realm on which the replica should be deleted
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

        public DeleteVaultReplicaDetails build() {
            DeleteVaultReplicaDetails model = new DeleteVaultReplicaDetails(this.replicaRegion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeleteVaultReplicaDetails model) {
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

    /** The region in the realm on which the replica should be deleted */
    @com.fasterxml.jackson.annotation.JsonProperty("replicaRegion")
    private final String replicaRegion;

    /**
     * The region in the realm on which the replica should be deleted
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
        sb.append("DeleteVaultReplicaDetails(");
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
        if (!(o instanceof DeleteVaultReplicaDetails)) {
            return false;
        }

        DeleteVaultReplicaDetails other = (DeleteVaultReplicaDetails) o;
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
