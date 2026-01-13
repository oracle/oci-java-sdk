/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Update source volume ID to destination customer managed vault and encryption key ID mapping for a
 * volume group. <br>
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
        builder = UpdateSourceVolumeToDestinationEncryptionKeyMappingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSourceVolumeToDestinationEncryptionKeyMappingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceVolumeId", "destinationEncryptionKey"})
    public UpdateSourceVolumeToDestinationEncryptionKeyMappingDetails(
            String sourceVolumeId, UpdateVaultAndEncryptionKeyDetails destinationEncryptionKey) {
        super();
        this.sourceVolumeId = sourceVolumeId;
        this.destinationEncryptionKey = destinationEncryptionKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the source boot volume or block volume.
         *
         * <p>Example: {@code ocid1.volume.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceVolumeId")
        private String sourceVolumeId;

        /**
         * The OCID of the source boot volume or block volume.
         *
         * <p>Example: {@code ocid1.volume.oc1..uniqueID}
         *
         * @param sourceVolumeId the value to set
         * @return this builder
         */
        public Builder sourceVolumeId(String sourceVolumeId) {
            this.sourceVolumeId = sourceVolumeId;
            this.__explicitlySet__.add("sourceVolumeId");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSourceVolumeToDestinationEncryptionKeyMappingDetails build() {
            UpdateSourceVolumeToDestinationEncryptionKeyMappingDetails model =
                    new UpdateSourceVolumeToDestinationEncryptionKeyMappingDetails(
                            this.sourceVolumeId, this.destinationEncryptionKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSourceVolumeToDestinationEncryptionKeyMappingDetails model) {
            if (model.wasPropertyExplicitlySet("sourceVolumeId")) {
                this.sourceVolumeId(model.getSourceVolumeId());
            }
            if (model.wasPropertyExplicitlySet("destinationEncryptionKey")) {
                this.destinationEncryptionKey(model.getDestinationEncryptionKey());
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
     * The OCID of the source boot volume or block volume.
     *
     * <p>Example: {@code ocid1.volume.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceVolumeId")
    private final String sourceVolumeId;

    /**
     * The OCID of the source boot volume or block volume.
     *
     * <p>Example: {@code ocid1.volume.oc1..uniqueID}
     *
     * @return the value
     */
    public String getSourceVolumeId() {
        return sourceVolumeId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("destinationEncryptionKey")
    private final UpdateVaultAndEncryptionKeyDetails destinationEncryptionKey;

    public UpdateVaultAndEncryptionKeyDetails getDestinationEncryptionKey() {
        return destinationEncryptionKey;
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
        sb.append("UpdateSourceVolumeToDestinationEncryptionKeyMappingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceVolumeId=").append(String.valueOf(this.sourceVolumeId));
        sb.append(", destinationEncryptionKey=")
                .append(String.valueOf(this.destinationEncryptionKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSourceVolumeToDestinationEncryptionKeyMappingDetails)) {
            return false;
        }

        UpdateSourceVolumeToDestinationEncryptionKeyMappingDetails other =
                (UpdateSourceVolumeToDestinationEncryptionKeyMappingDetails) o;
        return java.util.Objects.equals(this.sourceVolumeId, other.sourceVolumeId)
                && java.util.Objects.equals(
                        this.destinationEncryptionKey, other.destinationEncryptionKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceVolumeId == null ? 43 : this.sourceVolumeId.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationEncryptionKey == null
                                ? 43
                                : this.destinationEncryptionKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
