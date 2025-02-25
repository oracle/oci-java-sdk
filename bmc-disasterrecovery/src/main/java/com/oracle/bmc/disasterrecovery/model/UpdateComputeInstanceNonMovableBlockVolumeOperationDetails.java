/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for updating the operations performed on a block volume.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateComputeInstanceNonMovableBlockVolumeOperationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateComputeInstanceNonMovableBlockVolumeOperationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"blockVolumeId", "attachmentDetails", "mountDetails"})
    public UpdateComputeInstanceNonMovableBlockVolumeOperationDetails(
            String blockVolumeId,
            UpdateBlockVolumeAttachmentDetails attachmentDetails,
            UpdateBlockVolumeMountDetails mountDetails) {
        super();
        this.blockVolumeId = blockVolumeId;
        this.attachmentDetails = attachmentDetails;
        this.mountDetails = mountDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the block volume.
         * <p>
         * Example: {@code ocid1.volume.oc1..uniqueID}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeId")
        private String blockVolumeId;

        /**
         * The OCID of the block volume.
         * <p>
         * Example: {@code ocid1.volume.oc1..uniqueID}
         *
         * @param blockVolumeId the value to set
         * @return this builder
         **/
        public Builder blockVolumeId(String blockVolumeId) {
            this.blockVolumeId = blockVolumeId;
            this.__explicitlySet__.add("blockVolumeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attachmentDetails")
        private UpdateBlockVolumeAttachmentDetails attachmentDetails;

        public Builder attachmentDetails(UpdateBlockVolumeAttachmentDetails attachmentDetails) {
            this.attachmentDetails = attachmentDetails;
            this.__explicitlySet__.add("attachmentDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mountDetails")
        private UpdateBlockVolumeMountDetails mountDetails;

        public Builder mountDetails(UpdateBlockVolumeMountDetails mountDetails) {
            this.mountDetails = mountDetails;
            this.__explicitlySet__.add("mountDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateComputeInstanceNonMovableBlockVolumeOperationDetails build() {
            UpdateComputeInstanceNonMovableBlockVolumeOperationDetails model =
                    new UpdateComputeInstanceNonMovableBlockVolumeOperationDetails(
                            this.blockVolumeId, this.attachmentDetails, this.mountDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateComputeInstanceNonMovableBlockVolumeOperationDetails model) {
            if (model.wasPropertyExplicitlySet("blockVolumeId")) {
                this.blockVolumeId(model.getBlockVolumeId());
            }
            if (model.wasPropertyExplicitlySet("attachmentDetails")) {
                this.attachmentDetails(model.getAttachmentDetails());
            }
            if (model.wasPropertyExplicitlySet("mountDetails")) {
                this.mountDetails(model.getMountDetails());
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
     * The OCID of the block volume.
     * <p>
     * Example: {@code ocid1.volume.oc1..uniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeId")
    private final String blockVolumeId;

    /**
     * The OCID of the block volume.
     * <p>
     * Example: {@code ocid1.volume.oc1..uniqueID}
     *
     * @return the value
     **/
    public String getBlockVolumeId() {
        return blockVolumeId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("attachmentDetails")
    private final UpdateBlockVolumeAttachmentDetails attachmentDetails;

    public UpdateBlockVolumeAttachmentDetails getAttachmentDetails() {
        return attachmentDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mountDetails")
    private final UpdateBlockVolumeMountDetails mountDetails;

    public UpdateBlockVolumeMountDetails getMountDetails() {
        return mountDetails;
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
        sb.append("UpdateComputeInstanceNonMovableBlockVolumeOperationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("blockVolumeId=").append(String.valueOf(this.blockVolumeId));
        sb.append(", attachmentDetails=").append(String.valueOf(this.attachmentDetails));
        sb.append(", mountDetails=").append(String.valueOf(this.mountDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateComputeInstanceNonMovableBlockVolumeOperationDetails)) {
            return false;
        }

        UpdateComputeInstanceNonMovableBlockVolumeOperationDetails other =
                (UpdateComputeInstanceNonMovableBlockVolumeOperationDetails) o;
        return java.util.Objects.equals(this.blockVolumeId, other.blockVolumeId)
                && java.util.Objects.equals(this.attachmentDetails, other.attachmentDetails)
                && java.util.Objects.equals(this.mountDetails, other.mountDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.blockVolumeId == null ? 43 : this.blockVolumeId.hashCode());
        result =
                (result * PRIME)
                        + (this.attachmentDetails == null ? 43 : this.attachmentDetails.hashCode());
        result = (result * PRIME) + (this.mountDetails == null ? 43 : this.mountDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
