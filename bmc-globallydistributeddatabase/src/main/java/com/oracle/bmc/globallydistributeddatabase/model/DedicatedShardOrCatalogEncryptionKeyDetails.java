/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.model;

/**
 * Details of encryption key to be used to encrypt data for shards and catalog for sharded database. For system-defined
 * sharding type, all shards have to use same encryptionKeyDetails. For system-defined sharding, if encryptionKeyDetails
 * are not specified for catalog, then Oracle managed key will be used for catalog.
 * For user-defined sharding type, if encryptionKeyDetails are not provided for any shard or catalog, then Oracle managed
 * key will be used for such shard or catalog. For system-defined or user-defined sharding type, if the shard or catalog
 * has a peer in region other than primary shard or catalog region, then make sure to provide virtual vault for such shard
 * or catalog, which is also replicated to peer region (the region where peer or standby shard or catalog exists).
 *
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
    builder = DedicatedShardOrCatalogEncryptionKeyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DedicatedShardOrCatalogEncryptionKeyDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vaultId", "kmsKeyId", "kmsKeyVersionId"})
    public DedicatedShardOrCatalogEncryptionKeyDetails(
            String vaultId, String kmsKeyId, String kmsKeyVersionId) {
        super();
        this.vaultId = vaultId;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the vault in customer tenancy where KMS key is present.
         * For shard or catalog with cross-region data guard enabled, user needs to make sure to provide virtual private vault only,
         * which is also replicated in the region of standby shard.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the vault in customer tenancy where KMS key is present.
         * For shard or catalog with cross-region data guard enabled, user needs to make sure to provide virtual private vault only,
         * which is also replicated in the region of standby shard.
         *
         * @param vaultId the value to set
         * @return this builder
         **/
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the KMS key in vault identified by vaultId in customer tenancy
         * that is used as the master encryption key.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the KMS key in vault identified by vaultId in customer tenancy
         * that is used as the master encryption key.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the KMS key version for key identified by kmsKeyId
         * that is used in data encryption (TDE) operations.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the KMS key version for key identified by kmsKeyId
         * that is used in data encryption (TDE) operations.
         *
         * @param kmsKeyVersionId the value to set
         * @return this builder
         **/
        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DedicatedShardOrCatalogEncryptionKeyDetails build() {
            DedicatedShardOrCatalogEncryptionKeyDetails model =
                    new DedicatedShardOrCatalogEncryptionKeyDetails(
                            this.vaultId, this.kmsKeyId, this.kmsKeyVersionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DedicatedShardOrCatalogEncryptionKeyDetails model) {
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyVersionId")) {
                this.kmsKeyVersionId(model.getKmsKeyVersionId());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the vault in customer tenancy where KMS key is present.
     * For shard or catalog with cross-region data guard enabled, user needs to make sure to provide virtual private vault only,
     * which is also replicated in the region of standby shard.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the vault in customer tenancy where KMS key is present.
     * For shard or catalog with cross-region data guard enabled, user needs to make sure to provide virtual private vault only,
     * which is also replicated in the region of standby shard.
     *
     * @return the value
     **/
    public String getVaultId() {
        return vaultId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the KMS key in vault identified by vaultId in customer tenancy
     * that is used as the master encryption key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the KMS key in vault identified by vaultId in customer tenancy
     * that is used as the master encryption key.
     *
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the KMS key version for key identified by kmsKeyId
     * that is used in data encryption (TDE) operations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    private final String kmsKeyVersionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the KMS key version for key identified by kmsKeyId
     * that is used in data encryption (TDE) operations.
     *
     * @return the value
     **/
    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
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
        sb.append("DedicatedShardOrCatalogEncryptionKeyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DedicatedShardOrCatalogEncryptionKeyDetails)) {
            return false;
        }

        DedicatedShardOrCatalogEncryptionKeyDetails other =
                (DedicatedShardOrCatalogEncryptionKeyDetails) o;
        return java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
