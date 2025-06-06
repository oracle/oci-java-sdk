/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Update properties for a file system member. <br>
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
        builder = UpdateDrProtectionGroupMemberFileSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "memberType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDrProtectionGroupMemberFileSystemDetails
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
         * The availability domain of the destination mount target.
         *
         * <p>Example: {@code BBTh:region-AD}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationAvailabilityDomain")
        private String destinationAvailabilityDomain;

        /**
         * The availability domain of the destination mount target.
         *
         * <p>Example: {@code BBTh:region-AD}
         *
         * @param destinationAvailabilityDomain the value to set
         * @return this builder
         */
        public Builder destinationAvailabilityDomain(String destinationAvailabilityDomain) {
            this.destinationAvailabilityDomain = destinationAvailabilityDomain;
            this.__explicitlySet__.add("destinationAvailabilityDomain");
            return this;
        }
        /**
         * A list of mappings between file system exports in the primary region and mount targets in
         * the standby region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exportMappings")
        private java.util.List<FileSystemExportMappingDetails> exportMappings;

        /**
         * A list of mappings between file system exports in the primary region and mount targets in
         * the standby region.
         *
         * @param exportMappings the value to set
         * @return this builder
         */
        public Builder exportMappings(
                java.util.List<FileSystemExportMappingDetails> exportMappings) {
            this.exportMappings = exportMappings;
            this.__explicitlySet__.add("exportMappings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationEncryptionKey")
        private UpdateVaultAndEncryptionKeyDetails destinationEncryptionKey;

        public Builder destinationEncryptionKey(
                UpdateVaultAndEncryptionKeyDetails destinationEncryptionKey) {
            this.destinationEncryptionKey = destinationEncryptionKey;
            this.__explicitlySet__.add("destinationEncryptionKey");
            return this;
        }
        /**
         * The OCID of the snapshot policy to use in the destination region. This policy will be
         * attached to the file system after it moves to the destination region.
         *
         * <p>Example: {@code ocid1.filesystemsnapshotpolicy.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationSnapshotPolicyId")
        private String destinationSnapshotPolicyId;

        /**
         * The OCID of the snapshot policy to use in the destination region. This policy will be
         * attached to the file system after it moves to the destination region.
         *
         * <p>Example: {@code ocid1.filesystemsnapshotpolicy.oc1..uniqueID}
         *
         * @param destinationSnapshotPolicyId the value to set
         * @return this builder
         */
        public Builder destinationSnapshotPolicyId(String destinationSnapshotPolicyId) {
            this.destinationSnapshotPolicyId = destinationSnapshotPolicyId;
            this.__explicitlySet__.add("destinationSnapshotPolicyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDrProtectionGroupMemberFileSystemDetails build() {
            UpdateDrProtectionGroupMemberFileSystemDetails model =
                    new UpdateDrProtectionGroupMemberFileSystemDetails(
                            this.memberId,
                            this.destinationAvailabilityDomain,
                            this.exportMappings,
                            this.destinationEncryptionKey,
                            this.destinationSnapshotPolicyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDrProtectionGroupMemberFileSystemDetails model) {
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("destinationAvailabilityDomain")) {
                this.destinationAvailabilityDomain(model.getDestinationAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("exportMappings")) {
                this.exportMappings(model.getExportMappings());
            }
            if (model.wasPropertyExplicitlySet("destinationEncryptionKey")) {
                this.destinationEncryptionKey(model.getDestinationEncryptionKey());
            }
            if (model.wasPropertyExplicitlySet("destinationSnapshotPolicyId")) {
                this.destinationSnapshotPolicyId(model.getDestinationSnapshotPolicyId());
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
    public UpdateDrProtectionGroupMemberFileSystemDetails(
            String memberId,
            String destinationAvailabilityDomain,
            java.util.List<FileSystemExportMappingDetails> exportMappings,
            UpdateVaultAndEncryptionKeyDetails destinationEncryptionKey,
            String destinationSnapshotPolicyId) {
        super(memberId);
        this.destinationAvailabilityDomain = destinationAvailabilityDomain;
        this.exportMappings = exportMappings;
        this.destinationEncryptionKey = destinationEncryptionKey;
        this.destinationSnapshotPolicyId = destinationSnapshotPolicyId;
    }

    /**
     * The availability domain of the destination mount target.
     *
     * <p>Example: {@code BBTh:region-AD}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationAvailabilityDomain")
    private final String destinationAvailabilityDomain;

    /**
     * The availability domain of the destination mount target.
     *
     * <p>Example: {@code BBTh:region-AD}
     *
     * @return the value
     */
    public String getDestinationAvailabilityDomain() {
        return destinationAvailabilityDomain;
    }

    /**
     * A list of mappings between file system exports in the primary region and mount targets in the
     * standby region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exportMappings")
    private final java.util.List<FileSystemExportMappingDetails> exportMappings;

    /**
     * A list of mappings between file system exports in the primary region and mount targets in the
     * standby region.
     *
     * @return the value
     */
    public java.util.List<FileSystemExportMappingDetails> getExportMappings() {
        return exportMappings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("destinationEncryptionKey")
    private final UpdateVaultAndEncryptionKeyDetails destinationEncryptionKey;

    public UpdateVaultAndEncryptionKeyDetails getDestinationEncryptionKey() {
        return destinationEncryptionKey;
    }

    /**
     * The OCID of the snapshot policy to use in the destination region. This policy will be
     * attached to the file system after it moves to the destination region.
     *
     * <p>Example: {@code ocid1.filesystemsnapshotpolicy.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationSnapshotPolicyId")
    private final String destinationSnapshotPolicyId;

    /**
     * The OCID of the snapshot policy to use in the destination region. This policy will be
     * attached to the file system after it moves to the destination region.
     *
     * <p>Example: {@code ocid1.filesystemsnapshotpolicy.oc1..uniqueID}
     *
     * @return the value
     */
    public String getDestinationSnapshotPolicyId() {
        return destinationSnapshotPolicyId;
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
        sb.append("UpdateDrProtectionGroupMemberFileSystemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", destinationAvailabilityDomain=")
                .append(String.valueOf(this.destinationAvailabilityDomain));
        sb.append(", exportMappings=").append(String.valueOf(this.exportMappings));
        sb.append(", destinationEncryptionKey=")
                .append(String.valueOf(this.destinationEncryptionKey));
        sb.append(", destinationSnapshotPolicyId=")
                .append(String.valueOf(this.destinationSnapshotPolicyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrProtectionGroupMemberFileSystemDetails)) {
            return false;
        }

        UpdateDrProtectionGroupMemberFileSystemDetails other =
                (UpdateDrProtectionGroupMemberFileSystemDetails) o;
        return java.util.Objects.equals(
                        this.destinationAvailabilityDomain, other.destinationAvailabilityDomain)
                && java.util.Objects.equals(this.exportMappings, other.exportMappings)
                && java.util.Objects.equals(
                        this.destinationEncryptionKey, other.destinationEncryptionKey)
                && java.util.Objects.equals(
                        this.destinationSnapshotPolicyId, other.destinationSnapshotPolicyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.destinationAvailabilityDomain == null
                                ? 43
                                : this.destinationAvailabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.exportMappings == null ? 43 : this.exportMappings.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationEncryptionKey == null
                                ? 43
                                : this.destinationEncryptionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationSnapshotPolicyId == null
                                ? 43
                                : this.destinationSnapshotPolicyId.hashCode());
        return result;
    }
}
