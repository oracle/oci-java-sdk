/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Create properties for a volume group member. <br>
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
        builder = CreateDrProtectionGroupMemberVolumeGroupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "memberType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDrProtectionGroupMemberVolumeGroupDetails
        extends CreateDrProtectionGroupMemberDetails {
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
         * The OCID of the backup policy to use in the destination region. This policy will be used
         * to create backups for this volume group after it moves the destination region.
         *
         * <p>Example: {@code ocid1.volumebackuppolicy.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationBackupPolicyId")
        private String destinationBackupPolicyId;

        /**
         * The OCID of the backup policy to use in the destination region. This policy will be used
         * to create backups for this volume group after it moves the destination region.
         *
         * <p>Example: {@code ocid1.volumebackuppolicy.oc1..uniqueID}
         *
         * @param destinationBackupPolicyId the value to set
         * @return this builder
         */
        public Builder destinationBackupPolicyId(String destinationBackupPolicyId) {
            this.destinationBackupPolicyId = destinationBackupPolicyId;
            this.__explicitlySet__.add("destinationBackupPolicyId");
            return this;
        }
        /**
         * A list of mappings between source volume IDs in the volume group and customer-managed
         * encryption keys in the destination region which will be used to encrypt the volume after
         * it moves to the destination region.
         *
         * <p>If you add the entry for source volumes and its corresponding vault and encryption
         * keys here, you can not use 'commonDestinationKey' for encrypting all volumes with common
         * encryption key. Similarly, if you specify common vault and encryption key using
         * 'commonDestinationKey', you cannot specify vaults and encryption keys individually for
         * each volume using 'sourceVolumeToDestinationEncryptionKeyMappings'.
         *
         * <p>An entry for each volume in volume group should be added in this list. The encryption
         * key will not be updated for the volumes that are part of volume group but missing in this
         * list.
         */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "sourceVolumeToDestinationEncryptionKeyMappings")
        private java.util.List<CreateSourceVolumeToDestinationEncryptionKeyMappingDetails>
                sourceVolumeToDestinationEncryptionKeyMappings;

        /**
         * A list of mappings between source volume IDs in the volume group and customer-managed
         * encryption keys in the destination region which will be used to encrypt the volume after
         * it moves to the destination region.
         *
         * <p>If you add the entry for source volumes and its corresponding vault and encryption
         * keys here, you can not use 'commonDestinationKey' for encrypting all volumes with common
         * encryption key. Similarly, if you specify common vault and encryption key using
         * 'commonDestinationKey', you cannot specify vaults and encryption keys individually for
         * each volume using 'sourceVolumeToDestinationEncryptionKeyMappings'.
         *
         * <p>An entry for each volume in volume group should be added in this list. The encryption
         * key will not be updated for the volumes that are part of volume group but missing in this
         * list.
         *
         * @param sourceVolumeToDestinationEncryptionKeyMappings the value to set
         * @return this builder
         */
        public Builder sourceVolumeToDestinationEncryptionKeyMappings(
                java.util.List<CreateSourceVolumeToDestinationEncryptionKeyMappingDetails>
                        sourceVolumeToDestinationEncryptionKeyMappings) {
            this.sourceVolumeToDestinationEncryptionKeyMappings =
                    sourceVolumeToDestinationEncryptionKeyMappings;
            this.__explicitlySet__.add("sourceVolumeToDestinationEncryptionKeyMappings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commonDestinationKey")
        private CreateVaultAndEncryptionKeyDetails commonDestinationKey;

        public Builder commonDestinationKey(
                CreateVaultAndEncryptionKeyDetails commonDestinationKey) {
            this.commonDestinationKey = commonDestinationKey;
            this.__explicitlySet__.add("commonDestinationKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDrProtectionGroupMemberVolumeGroupDetails build() {
            CreateDrProtectionGroupMemberVolumeGroupDetails model =
                    new CreateDrProtectionGroupMemberVolumeGroupDetails(
                            this.memberId,
                            this.destinationBackupPolicyId,
                            this.sourceVolumeToDestinationEncryptionKeyMappings,
                            this.commonDestinationKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDrProtectionGroupMemberVolumeGroupDetails model) {
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("destinationBackupPolicyId")) {
                this.destinationBackupPolicyId(model.getDestinationBackupPolicyId());
            }
            if (model.wasPropertyExplicitlySet("sourceVolumeToDestinationEncryptionKeyMappings")) {
                this.sourceVolumeToDestinationEncryptionKeyMappings(
                        model.getSourceVolumeToDestinationEncryptionKeyMappings());
            }
            if (model.wasPropertyExplicitlySet("commonDestinationKey")) {
                this.commonDestinationKey(model.getCommonDestinationKey());
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
    public CreateDrProtectionGroupMemberVolumeGroupDetails(
            String memberId,
            String destinationBackupPolicyId,
            java.util.List<CreateSourceVolumeToDestinationEncryptionKeyMappingDetails>
                    sourceVolumeToDestinationEncryptionKeyMappings,
            CreateVaultAndEncryptionKeyDetails commonDestinationKey) {
        super(memberId);
        this.destinationBackupPolicyId = destinationBackupPolicyId;
        this.sourceVolumeToDestinationEncryptionKeyMappings =
                sourceVolumeToDestinationEncryptionKeyMappings;
        this.commonDestinationKey = commonDestinationKey;
    }

    /**
     * The OCID of the backup policy to use in the destination region. This policy will be used to
     * create backups for this volume group after it moves the destination region.
     *
     * <p>Example: {@code ocid1.volumebackuppolicy.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationBackupPolicyId")
    private final String destinationBackupPolicyId;

    /**
     * The OCID of the backup policy to use in the destination region. This policy will be used to
     * create backups for this volume group after it moves the destination region.
     *
     * <p>Example: {@code ocid1.volumebackuppolicy.oc1..uniqueID}
     *
     * @return the value
     */
    public String getDestinationBackupPolicyId() {
        return destinationBackupPolicyId;
    }

    /**
     * A list of mappings between source volume IDs in the volume group and customer-managed
     * encryption keys in the destination region which will be used to encrypt the volume after it
     * moves to the destination region.
     *
     * <p>If you add the entry for source volumes and its corresponding vault and encryption keys
     * here, you can not use 'commonDestinationKey' for encrypting all volumes with common
     * encryption key. Similarly, if you specify common vault and encryption key using
     * 'commonDestinationKey', you cannot specify vaults and encryption keys individually for each
     * volume using 'sourceVolumeToDestinationEncryptionKeyMappings'.
     *
     * <p>An entry for each volume in volume group should be added in this list. The encryption key
     * will not be updated for the volumes that are part of volume group but missing in this list.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceVolumeToDestinationEncryptionKeyMappings")
    private final java.util.List<CreateSourceVolumeToDestinationEncryptionKeyMappingDetails>
            sourceVolumeToDestinationEncryptionKeyMappings;

    /**
     * A list of mappings between source volume IDs in the volume group and customer-managed
     * encryption keys in the destination region which will be used to encrypt the volume after it
     * moves to the destination region.
     *
     * <p>If you add the entry for source volumes and its corresponding vault and encryption keys
     * here, you can not use 'commonDestinationKey' for encrypting all volumes with common
     * encryption key. Similarly, if you specify common vault and encryption key using
     * 'commonDestinationKey', you cannot specify vaults and encryption keys individually for each
     * volume using 'sourceVolumeToDestinationEncryptionKeyMappings'.
     *
     * <p>An entry for each volume in volume group should be added in this list. The encryption key
     * will not be updated for the volumes that are part of volume group but missing in this list.
     *
     * @return the value
     */
    public java.util.List<CreateSourceVolumeToDestinationEncryptionKeyMappingDetails>
            getSourceVolumeToDestinationEncryptionKeyMappings() {
        return sourceVolumeToDestinationEncryptionKeyMappings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("commonDestinationKey")
    private final CreateVaultAndEncryptionKeyDetails commonDestinationKey;

    public CreateVaultAndEncryptionKeyDetails getCommonDestinationKey() {
        return commonDestinationKey;
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
        sb.append("CreateDrProtectionGroupMemberVolumeGroupDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", destinationBackupPolicyId=")
                .append(String.valueOf(this.destinationBackupPolicyId));
        sb.append(", sourceVolumeToDestinationEncryptionKeyMappings=")
                .append(String.valueOf(this.sourceVolumeToDestinationEncryptionKeyMappings));
        sb.append(", commonDestinationKey=").append(String.valueOf(this.commonDestinationKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDrProtectionGroupMemberVolumeGroupDetails)) {
            return false;
        }

        CreateDrProtectionGroupMemberVolumeGroupDetails other =
                (CreateDrProtectionGroupMemberVolumeGroupDetails) o;
        return java.util.Objects.equals(
                        this.destinationBackupPolicyId, other.destinationBackupPolicyId)
                && java.util.Objects.equals(
                        this.sourceVolumeToDestinationEncryptionKeyMappings,
                        other.sourceVolumeToDestinationEncryptionKeyMappings)
                && java.util.Objects.equals(this.commonDestinationKey, other.commonDestinationKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.destinationBackupPolicyId == null
                                ? 43
                                : this.destinationBackupPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceVolumeToDestinationEncryptionKeyMappings == null
                                ? 43
                                : this.sourceVolumeToDestinationEncryptionKeyMappings.hashCode());
        result =
                (result * PRIME)
                        + (this.commonDestinationKey == null
                                ? 43
                                : this.commonDestinationKey.hashCode());
        return result;
    }
}
