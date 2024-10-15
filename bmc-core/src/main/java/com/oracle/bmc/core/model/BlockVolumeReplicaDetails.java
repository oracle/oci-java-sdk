/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Contains the details for the block volume replica <br>
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
        builder = BlockVolumeReplicaDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BlockVolumeReplicaDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "availabilityDomain", "xrrKmsKeyId"})
    public BlockVolumeReplicaDetails(
            String displayName, String availabilityDomain, String xrrKmsKeyId) {
        super();
        this.displayName = displayName;
        this.availabilityDomain = availabilityDomain;
        this.xrrKmsKeyId = xrrKmsKeyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The availability domain of the block volume replica.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of the block volume replica.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The OCID of the Vault service key which is the master encryption key for the cross region
         * block volume replicas, which will be used in the destination region to encrypt the block
         * volume replica's encryption keys. For more information about the Vault service and
         * encryption keys, see [Overview of Vault
         * service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm)
         * and [Using
         * Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("xrrKmsKeyId")
        private String xrrKmsKeyId;

        /**
         * The OCID of the Vault service key which is the master encryption key for the cross region
         * block volume replicas, which will be used in the destination region to encrypt the block
         * volume replica's encryption keys. For more information about the Vault service and
         * encryption keys, see [Overview of Vault
         * service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm)
         * and [Using
         * Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
         *
         * @param xrrKmsKeyId the value to set
         * @return this builder
         */
        public Builder xrrKmsKeyId(String xrrKmsKeyId) {
            this.xrrKmsKeyId = xrrKmsKeyId;
            this.__explicitlySet__.add("xrrKmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BlockVolumeReplicaDetails build() {
            BlockVolumeReplicaDetails model =
                    new BlockVolumeReplicaDetails(
                            this.displayName, this.availabilityDomain, this.xrrKmsKeyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BlockVolumeReplicaDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("xrrKmsKeyId")) {
                this.xrrKmsKeyId(model.getXrrKmsKeyId());
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
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The availability domain of the block volume replica.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of the block volume replica.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the Vault service key which is the master encryption key for the cross region
     * block volume replicas, which will be used in the destination region to encrypt the block
     * volume replica's encryption keys. For more information about the Vault service and encryption
     * keys, see [Overview of Vault
     * service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm)
     * and [Using
     * Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("xrrKmsKeyId")
    private final String xrrKmsKeyId;

    /**
     * The OCID of the Vault service key which is the master encryption key for the cross region
     * block volume replicas, which will be used in the destination region to encrypt the block
     * volume replica's encryption keys. For more information about the Vault service and encryption
     * keys, see [Overview of Vault
     * service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm)
     * and [Using
     * Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
     *
     * @return the value
     */
    public String getXrrKmsKeyId() {
        return xrrKmsKeyId;
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
        sb.append("BlockVolumeReplicaDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", xrrKmsKeyId=").append(String.valueOf(this.xrrKmsKeyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BlockVolumeReplicaDetails)) {
            return false;
        }

        BlockVolumeReplicaDetails other = (BlockVolumeReplicaDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.xrrKmsKeyId, other.xrrKmsKeyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.xrrKmsKeyId == null ? 43 : this.xrrKmsKeyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
