/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Specifies the boot volume backups (first & second) and block size in bytes.
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
    builder = BootVolumeSourceFromBootVolumeBackupDeltaDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BootVolumeSourceFromBootVolumeBackupDeltaDetails
        extends BootVolumeSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the first boot volume backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("firstBackupId")
        private String firstBackupId;

        /**
         * The OCID of the first boot volume backup.
         * @param firstBackupId the value to set
         * @return this builder
         **/
        public Builder firstBackupId(String firstBackupId) {
            this.firstBackupId = firstBackupId;
            this.__explicitlySet__.add("firstBackupId");
            return this;
        }
        /**
         * The OCID of the second boot volume backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secondBackupId")
        private String secondBackupId;

        /**
         * The OCID of the second boot volume backup.
         * @param secondBackupId the value to set
         * @return this builder
         **/
        public Builder secondBackupId(String secondBackupId) {
            this.secondBackupId = secondBackupId;
            this.__explicitlySet__.add("secondBackupId");
            return this;
        }
        /**
         * Block size in bytes to be considered while performing volume restore. The value must be a power of 2; ranging from 4KB (4096 bytes) to 1MB (1048576 bytes). If omitted, defaults to 4,096 bytes (4 KiB).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("changeBlockSizeInBytes")
        private Long changeBlockSizeInBytes;

        /**
         * Block size in bytes to be considered while performing volume restore. The value must be a power of 2; ranging from 4KB (4096 bytes) to 1MB (1048576 bytes). If omitted, defaults to 4,096 bytes (4 KiB).
         *
         * @param changeBlockSizeInBytes the value to set
         * @return this builder
         **/
        public Builder changeBlockSizeInBytes(Long changeBlockSizeInBytes) {
            this.changeBlockSizeInBytes = changeBlockSizeInBytes;
            this.__explicitlySet__.add("changeBlockSizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BootVolumeSourceFromBootVolumeBackupDeltaDetails build() {
            BootVolumeSourceFromBootVolumeBackupDeltaDetails model =
                    new BootVolumeSourceFromBootVolumeBackupDeltaDetails(
                            this.firstBackupId, this.secondBackupId, this.changeBlockSizeInBytes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BootVolumeSourceFromBootVolumeBackupDeltaDetails model) {
            if (model.wasPropertyExplicitlySet("firstBackupId")) {
                this.firstBackupId(model.getFirstBackupId());
            }
            if (model.wasPropertyExplicitlySet("secondBackupId")) {
                this.secondBackupId(model.getSecondBackupId());
            }
            if (model.wasPropertyExplicitlySet("changeBlockSizeInBytes")) {
                this.changeBlockSizeInBytes(model.getChangeBlockSizeInBytes());
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
    public BootVolumeSourceFromBootVolumeBackupDeltaDetails(
            String firstBackupId, String secondBackupId, Long changeBlockSizeInBytes) {
        super();
        this.firstBackupId = firstBackupId;
        this.secondBackupId = secondBackupId;
        this.changeBlockSizeInBytes = changeBlockSizeInBytes;
    }

    /**
     * The OCID of the first boot volume backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstBackupId")
    private final String firstBackupId;

    /**
     * The OCID of the first boot volume backup.
     * @return the value
     **/
    public String getFirstBackupId() {
        return firstBackupId;
    }

    /**
     * The OCID of the second boot volume backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secondBackupId")
    private final String secondBackupId;

    /**
     * The OCID of the second boot volume backup.
     * @return the value
     **/
    public String getSecondBackupId() {
        return secondBackupId;
    }

    /**
     * Block size in bytes to be considered while performing volume restore. The value must be a power of 2; ranging from 4KB (4096 bytes) to 1MB (1048576 bytes). If omitted, defaults to 4,096 bytes (4 KiB).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeBlockSizeInBytes")
    private final Long changeBlockSizeInBytes;

    /**
     * Block size in bytes to be considered while performing volume restore. The value must be a power of 2; ranging from 4KB (4096 bytes) to 1MB (1048576 bytes). If omitted, defaults to 4,096 bytes (4 KiB).
     *
     * @return the value
     **/
    public Long getChangeBlockSizeInBytes() {
        return changeBlockSizeInBytes;
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
        sb.append("BootVolumeSourceFromBootVolumeBackupDeltaDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", firstBackupId=").append(String.valueOf(this.firstBackupId));
        sb.append(", secondBackupId=").append(String.valueOf(this.secondBackupId));
        sb.append(", changeBlockSizeInBytes=").append(String.valueOf(this.changeBlockSizeInBytes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BootVolumeSourceFromBootVolumeBackupDeltaDetails)) {
            return false;
        }

        BootVolumeSourceFromBootVolumeBackupDeltaDetails other =
                (BootVolumeSourceFromBootVolumeBackupDeltaDetails) o;
        return java.util.Objects.equals(this.firstBackupId, other.firstBackupId)
                && java.util.Objects.equals(this.secondBackupId, other.secondBackupId)
                && java.util.Objects.equals(
                        this.changeBlockSizeInBytes, other.changeBlockSizeInBytes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.firstBackupId == null ? 43 : this.firstBackupId.hashCode());
        result =
                (result * PRIME)
                        + (this.secondBackupId == null ? 43 : this.secondBackupId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeBlockSizeInBytes == null
                                ? 43
                                : this.changeBlockSizeInBytes.hashCode());
        return result;
    }
}
