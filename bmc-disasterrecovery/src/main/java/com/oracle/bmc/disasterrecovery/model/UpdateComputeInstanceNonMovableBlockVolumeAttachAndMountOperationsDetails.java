/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for updating the block volume operations performed on the non-movable compute
 * instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder =
                UpdateComputeInstanceNonMovableBlockVolumeAttachAndMountOperationsDetails.Builder
                        .class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateComputeInstanceNonMovableBlockVolumeAttachAndMountOperationsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"attachments", "mounts"})
    public UpdateComputeInstanceNonMovableBlockVolumeAttachAndMountOperationsDetails(
            java.util.List<UpdateComputeInstanceNonMovableBlockVolumeAttachOperationDetails>
                    attachments,
            java.util.List<UpdateComputeInstanceNonMovableBlockVolumeMountOperationDetails>
                    mounts) {
        super();
        this.attachments = attachments;
        this.mounts = mounts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A list of details of attach or detach operations performed on block volumes. */
        @com.fasterxml.jackson.annotation.JsonProperty("attachments")
        private java.util.List<UpdateComputeInstanceNonMovableBlockVolumeAttachOperationDetails>
                attachments;

        /**
         * A list of details of attach or detach operations performed on block volumes.
         *
         * @param attachments the value to set
         * @return this builder
         */
        public Builder attachments(
                java.util.List<UpdateComputeInstanceNonMovableBlockVolumeAttachOperationDetails>
                        attachments) {
            this.attachments = attachments;
            this.__explicitlySet__.add("attachments");
            return this;
        }
        /** A list of details of mount operations performed on block volumes. */
        @com.fasterxml.jackson.annotation.JsonProperty("mounts")
        private java.util.List<UpdateComputeInstanceNonMovableBlockVolumeMountOperationDetails>
                mounts;

        /**
         * A list of details of mount operations performed on block volumes.
         *
         * @param mounts the value to set
         * @return this builder
         */
        public Builder mounts(
                java.util.List<UpdateComputeInstanceNonMovableBlockVolumeMountOperationDetails>
                        mounts) {
            this.mounts = mounts;
            this.__explicitlySet__.add("mounts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateComputeInstanceNonMovableBlockVolumeAttachAndMountOperationsDetails build() {
            UpdateComputeInstanceNonMovableBlockVolumeAttachAndMountOperationsDetails model =
                    new UpdateComputeInstanceNonMovableBlockVolumeAttachAndMountOperationsDetails(
                            this.attachments, this.mounts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(
                UpdateComputeInstanceNonMovableBlockVolumeAttachAndMountOperationsDetails model) {
            if (model.wasPropertyExplicitlySet("attachments")) {
                this.attachments(model.getAttachments());
            }
            if (model.wasPropertyExplicitlySet("mounts")) {
                this.mounts(model.getMounts());
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

    /** A list of details of attach or detach operations performed on block volumes. */
    @com.fasterxml.jackson.annotation.JsonProperty("attachments")
    private final java.util.List<UpdateComputeInstanceNonMovableBlockVolumeAttachOperationDetails>
            attachments;

    /**
     * A list of details of attach or detach operations performed on block volumes.
     *
     * @return the value
     */
    public java.util.List<UpdateComputeInstanceNonMovableBlockVolumeAttachOperationDetails>
            getAttachments() {
        return attachments;
    }

    /** A list of details of mount operations performed on block volumes. */
    @com.fasterxml.jackson.annotation.JsonProperty("mounts")
    private final java.util.List<UpdateComputeInstanceNonMovableBlockVolumeMountOperationDetails>
            mounts;

    /**
     * A list of details of mount operations performed on block volumes.
     *
     * @return the value
     */
    public java.util.List<UpdateComputeInstanceNonMovableBlockVolumeMountOperationDetails>
            getMounts() {
        return mounts;
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
        sb.append("UpdateComputeInstanceNonMovableBlockVolumeAttachAndMountOperationsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("attachments=").append(String.valueOf(this.attachments));
        sb.append(", mounts=").append(String.valueOf(this.mounts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o
                instanceof
                UpdateComputeInstanceNonMovableBlockVolumeAttachAndMountOperationsDetails)) {
            return false;
        }

        UpdateComputeInstanceNonMovableBlockVolumeAttachAndMountOperationsDetails other =
                (UpdateComputeInstanceNonMovableBlockVolumeAttachAndMountOperationsDetails) o;
        return java.util.Objects.equals(this.attachments, other.attachments)
                && java.util.Objects.equals(this.mounts, other.mounts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.attachments == null ? 43 : this.attachments.hashCode());
        result = (result * PRIME) + (this.mounts == null ? 43 : this.mounts.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
