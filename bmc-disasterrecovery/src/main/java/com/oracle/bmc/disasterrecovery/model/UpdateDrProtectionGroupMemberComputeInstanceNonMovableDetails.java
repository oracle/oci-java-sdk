/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Update properties for a non-movable compute instance member. <br>
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
        builder = UpdateDrProtectionGroupMemberComputeInstanceNonMovableDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "memberType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDrProtectionGroupMemberComputeInstanceNonMovableDetails
        extends UpdateDrProtectionGroupMemberDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("memberId")
        private String memberId;

        public Builder memberId(String memberId) {
            this.memberId = memberId;
            this.__explicitlySet__.add("memberId");
            return this;
        }
        /**
         * A flag indicating whether the non-movable compute instance should be started and stopped
         * during DR operations. *Prechecks cannot be executed on stopped instances that are
         * configured to be started.*
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isStartStopEnabled")
        private Boolean isStartStopEnabled;

        /**
         * A flag indicating whether the non-movable compute instance should be started and stopped
         * during DR operations. *Prechecks cannot be executed on stopped instances that are
         * configured to be started.*
         *
         * @param isStartStopEnabled the value to set
         * @return this builder
         */
        public Builder isStartStopEnabled(Boolean isStartStopEnabled) {
            this.isStartStopEnabled = isStartStopEnabled;
            this.__explicitlySet__.add("isStartStopEnabled");
            return this;
        }
        /** A list of operations performed on file systems used by the compute instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemOperations")
        private java.util.List<UpdateComputeInstanceNonMovableFileSystemOperationDetails>
                fileSystemOperations;

        /**
         * A list of operations performed on file systems used by the compute instance.
         *
         * @param fileSystemOperations the value to set
         * @return this builder
         */
        public Builder fileSystemOperations(
                java.util.List<UpdateComputeInstanceNonMovableFileSystemOperationDetails>
                        fileSystemOperations) {
            this.fileSystemOperations = fileSystemOperations;
            this.__explicitlySet__.add("fileSystemOperations");
            return this;
        }
        /** A list of operations performed on block volumes used by the compute instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeOperations")
        private java.util.List<UpdateComputeInstanceNonMovableBlockVolumeOperationDetails>
                blockVolumeOperations;

        /**
         * A list of operations performed on block volumes used by the compute instance.
         *
         * @param blockVolumeOperations the value to set
         * @return this builder
         */
        public Builder blockVolumeOperations(
                java.util.List<UpdateComputeInstanceNonMovableBlockVolumeOperationDetails>
                        blockVolumeOperations) {
            this.blockVolumeOperations = blockVolumeOperations;
            this.__explicitlySet__.add("blockVolumeOperations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDrProtectionGroupMemberComputeInstanceNonMovableDetails build() {
            UpdateDrProtectionGroupMemberComputeInstanceNonMovableDetails model =
                    new UpdateDrProtectionGroupMemberComputeInstanceNonMovableDetails(
                            this.memberId,
                            this.isStartStopEnabled,
                            this.fileSystemOperations,
                            this.blockVolumeOperations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDrProtectionGroupMemberComputeInstanceNonMovableDetails model) {
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("isStartStopEnabled")) {
                this.isStartStopEnabled(model.getIsStartStopEnabled());
            }
            if (model.wasPropertyExplicitlySet("fileSystemOperations")) {
                this.fileSystemOperations(model.getFileSystemOperations());
            }
            if (model.wasPropertyExplicitlySet("blockVolumeOperations")) {
                this.blockVolumeOperations(model.getBlockVolumeOperations());
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

    @Deprecated
    public UpdateDrProtectionGroupMemberComputeInstanceNonMovableDetails(
            String memberId,
            Boolean isStartStopEnabled,
            java.util.List<UpdateComputeInstanceNonMovableFileSystemOperationDetails>
                    fileSystemOperations,
            java.util.List<UpdateComputeInstanceNonMovableBlockVolumeOperationDetails>
                    blockVolumeOperations) {
        super(memberId);
        this.isStartStopEnabled = isStartStopEnabled;
        this.fileSystemOperations = fileSystemOperations;
        this.blockVolumeOperations = blockVolumeOperations;
    }

    /**
     * A flag indicating whether the non-movable compute instance should be started and stopped
     * during DR operations. *Prechecks cannot be executed on stopped instances that are configured
     * to be started.*
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isStartStopEnabled")
    private final Boolean isStartStopEnabled;

    /**
     * A flag indicating whether the non-movable compute instance should be started and stopped
     * during DR operations. *Prechecks cannot be executed on stopped instances that are configured
     * to be started.*
     *
     * @return the value
     */
    public Boolean getIsStartStopEnabled() {
        return isStartStopEnabled;
    }

    /** A list of operations performed on file systems used by the compute instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemOperations")
    private final java.util.List<UpdateComputeInstanceNonMovableFileSystemOperationDetails>
            fileSystemOperations;

    /**
     * A list of operations performed on file systems used by the compute instance.
     *
     * @return the value
     */
    public java.util.List<UpdateComputeInstanceNonMovableFileSystemOperationDetails>
            getFileSystemOperations() {
        return fileSystemOperations;
    }

    /** A list of operations performed on block volumes used by the compute instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeOperations")
    private final java.util.List<UpdateComputeInstanceNonMovableBlockVolumeOperationDetails>
            blockVolumeOperations;

    /**
     * A list of operations performed on block volumes used by the compute instance.
     *
     * @return the value
     */
    public java.util.List<UpdateComputeInstanceNonMovableBlockVolumeOperationDetails>
            getBlockVolumeOperations() {
        return blockVolumeOperations;
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
        sb.append("UpdateDrProtectionGroupMemberComputeInstanceNonMovableDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isStartStopEnabled=").append(String.valueOf(this.isStartStopEnabled));
        sb.append(", fileSystemOperations=").append(String.valueOf(this.fileSystemOperations));
        sb.append(", blockVolumeOperations=").append(String.valueOf(this.blockVolumeOperations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrProtectionGroupMemberComputeInstanceNonMovableDetails)) {
            return false;
        }

        UpdateDrProtectionGroupMemberComputeInstanceNonMovableDetails other =
                (UpdateDrProtectionGroupMemberComputeInstanceNonMovableDetails) o;
        return java.util.Objects.equals(this.isStartStopEnabled, other.isStartStopEnabled)
                && java.util.Objects.equals(this.fileSystemOperations, other.fileSystemOperations)
                && java.util.Objects.equals(this.blockVolumeOperations, other.blockVolumeOperations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isStartStopEnabled == null
                                ? 43
                                : this.isStartStopEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSystemOperations == null
                                ? 43
                                : this.fileSystemOperations.hashCode());
        result =
                (result * PRIME)
                        + (this.blockVolumeOperations == null
                                ? 43
                                : this.blockVolumeOperations.hashCode());
        return result;
    }
}
