/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CopyVolumeBackupDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CopyVolumeBackupDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"destinationRegion", "displayName", "kmsKeyId"})
    public CopyVolumeBackupDetails(String destinationRegion, String displayName, String kmsKeyId) {
        super();
        this.destinationRegion = destinationRegion;
        this.displayName = displayName;
        this.kmsKeyId = kmsKeyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the destination region.
         * <p>
         * Example: {@code us-ashburn-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationRegion")
        private String destinationRegion;

        /**
         * The name of the destination region.
         * <p>
         * Example: {@code us-ashburn-1}
         *
         * @param destinationRegion the value to set
         * @return this builder
         **/
        public Builder destinationRegion(String destinationRegion) {
            this.destinationRegion = destinationRegion;
            this.__explicitlySet__.add("destinationRegion");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the Key Management key in the destination region which will be the master encryption key
         * for the copied volume backup.
         * If you do not specify this attribute the volume backup will be encrypted with the Oracle-provided encryption
         * key when it is copied to the destination region.
         * <p>
         *
         * For more information about the Key Management service and encryption keys, see
         * [Overview of Key Management](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
         * [Using Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the Key Management key in the destination region which will be the master encryption key
         * for the copied volume backup.
         * If you do not specify this attribute the volume backup will be encrypted with the Oracle-provided encryption
         * key when it is copied to the destination region.
         * <p>
         *
         * For more information about the Key Management service and encryption keys, see
         * [Overview of Key Management](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
         * [Using Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
         *
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CopyVolumeBackupDetails build() {
            CopyVolumeBackupDetails __instance__ =
                    new CopyVolumeBackupDetails(destinationRegion, displayName, kmsKeyId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CopyVolumeBackupDetails o) {
            Builder copiedBuilder =
                    destinationRegion(o.getDestinationRegion())
                            .displayName(o.getDisplayName())
                            .kmsKeyId(o.getKmsKeyId());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The name of the destination region.
     * <p>
     * Example: {@code us-ashburn-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationRegion")
    private final String destinationRegion;

    /**
     * The name of the destination region.
     * <p>
     * Example: {@code us-ashburn-1}
     *
     * @return the value
     **/
    public String getDestinationRegion() {
        return destinationRegion;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the Key Management key in the destination region which will be the master encryption key
     * for the copied volume backup.
     * If you do not specify this attribute the volume backup will be encrypted with the Oracle-provided encryption
     * key when it is copied to the destination region.
     * <p>
     *
     * For more information about the Key Management service and encryption keys, see
     * [Overview of Key Management](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
     * [Using Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the Key Management key in the destination region which will be the master encryption key
     * for the copied volume backup.
     * If you do not specify this attribute the volume backup will be encrypted with the Oracle-provided encryption
     * key when it is copied to the destination region.
     * <p>
     *
     * For more information about the Key Management service and encryption keys, see
     * [Overview of Key Management](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
     * [Using Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
     *
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CopyVolumeBackupDetails(");
        sb.append("destinationRegion=").append(String.valueOf(this.destinationRegion));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CopyVolumeBackupDetails)) {
            return false;
        }

        CopyVolumeBackupDetails other = (CopyVolumeBackupDetails) o;
        return java.util.Objects.equals(this.destinationRegion, other.destinationRegion)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.destinationRegion == null ? 43 : this.destinationRegion.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
