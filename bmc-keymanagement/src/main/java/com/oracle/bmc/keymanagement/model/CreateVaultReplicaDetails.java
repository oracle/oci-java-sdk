/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Creates a vault replica. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateVaultReplicaDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateVaultReplicaDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"replicaRegion", "replicaVaultMetadata"})
    public CreateVaultReplicaDetails(
            String replicaRegion, ReplicaVaultMetadata replicaVaultMetadata) {
        super();
        this.replicaRegion = replicaRegion;
        this.replicaVaultMetadata = replicaVaultMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The region in the realm to which the vault need to be replicated to */
        @com.fasterxml.jackson.annotation.JsonProperty("replicaRegion")
        private String replicaRegion;

        /**
         * The region in the realm to which the vault need to be replicated to
         *
         * @param replicaRegion the value to set
         * @return this builder
         */
        public Builder replicaRegion(String replicaRegion) {
            this.replicaRegion = replicaRegion;
            this.__explicitlySet__.add("replicaRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicaVaultMetadata")
        private ReplicaVaultMetadata replicaVaultMetadata;

        public Builder replicaVaultMetadata(ReplicaVaultMetadata replicaVaultMetadata) {
            this.replicaVaultMetadata = replicaVaultMetadata;
            this.__explicitlySet__.add("replicaVaultMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVaultReplicaDetails build() {
            CreateVaultReplicaDetails model =
                    new CreateVaultReplicaDetails(this.replicaRegion, this.replicaVaultMetadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVaultReplicaDetails model) {
            if (model.wasPropertyExplicitlySet("replicaRegion")) {
                this.replicaRegion(model.getReplicaRegion());
            }
            if (model.wasPropertyExplicitlySet("replicaVaultMetadata")) {
                this.replicaVaultMetadata(model.getReplicaVaultMetadata());
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

    /** The region in the realm to which the vault need to be replicated to */
    @com.fasterxml.jackson.annotation.JsonProperty("replicaRegion")
    private final String replicaRegion;

    /**
     * The region in the realm to which the vault need to be replicated to
     *
     * @return the value
     */
    public String getReplicaRegion() {
        return replicaRegion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicaVaultMetadata")
    private final ReplicaVaultMetadata replicaVaultMetadata;

    public ReplicaVaultMetadata getReplicaVaultMetadata() {
        return replicaVaultMetadata;
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
        sb.append("CreateVaultReplicaDetails(");
        sb.append("super=").append(super.toString());
        sb.append("replicaRegion=").append(String.valueOf(this.replicaRegion));
        sb.append(", replicaVaultMetadata=").append(String.valueOf(this.replicaVaultMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVaultReplicaDetails)) {
            return false;
        }

        CreateVaultReplicaDetails other = (CreateVaultReplicaDetails) o;
        return java.util.Objects.equals(this.replicaRegion, other.replicaRegion)
                && java.util.Objects.equals(this.replicaVaultMetadata, other.replicaVaultMetadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.replicaRegion == null ? 43 : this.replicaRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.replicaVaultMetadata == null
                                ? 43
                                : this.replicaVaultMetadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
