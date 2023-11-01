/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for attaching or detaching a block volume. <br>
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
        builder = BlockVolumeAttachmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BlockVolumeAttachmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"volumeAttachmentReferenceInstanceId"})
    public BlockVolumeAttachmentDetails(String volumeAttachmentReferenceInstanceId) {
        super();
        this.volumeAttachmentReferenceInstanceId = volumeAttachmentReferenceInstanceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the reference compute instance from which to obtain the attachment details
         * for the volume. This reference compute instance is from the peer DR protection group.
         *
         * <p>Example: {@code ocid1.instance.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeAttachmentReferenceInstanceId")
        private String volumeAttachmentReferenceInstanceId;

        /**
         * The OCID of the reference compute instance from which to obtain the attachment details
         * for the volume. This reference compute instance is from the peer DR protection group.
         *
         * <p>Example: {@code ocid1.instance.oc1..uniqueID}
         *
         * @param volumeAttachmentReferenceInstanceId the value to set
         * @return this builder
         */
        public Builder volumeAttachmentReferenceInstanceId(
                String volumeAttachmentReferenceInstanceId) {
            this.volumeAttachmentReferenceInstanceId = volumeAttachmentReferenceInstanceId;
            this.__explicitlySet__.add("volumeAttachmentReferenceInstanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BlockVolumeAttachmentDetails build() {
            BlockVolumeAttachmentDetails model =
                    new BlockVolumeAttachmentDetails(this.volumeAttachmentReferenceInstanceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BlockVolumeAttachmentDetails model) {
            if (model.wasPropertyExplicitlySet("volumeAttachmentReferenceInstanceId")) {
                this.volumeAttachmentReferenceInstanceId(
                        model.getVolumeAttachmentReferenceInstanceId());
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
     * The OCID of the reference compute instance from which to obtain the attachment details for
     * the volume. This reference compute instance is from the peer DR protection group.
     *
     * <p>Example: {@code ocid1.instance.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeAttachmentReferenceInstanceId")
    private final String volumeAttachmentReferenceInstanceId;

    /**
     * The OCID of the reference compute instance from which to obtain the attachment details for
     * the volume. This reference compute instance is from the peer DR protection group.
     *
     * <p>Example: {@code ocid1.instance.oc1..uniqueID}
     *
     * @return the value
     */
    public String getVolumeAttachmentReferenceInstanceId() {
        return volumeAttachmentReferenceInstanceId;
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
        sb.append("BlockVolumeAttachmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("volumeAttachmentReferenceInstanceId=")
                .append(String.valueOf(this.volumeAttachmentReferenceInstanceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BlockVolumeAttachmentDetails)) {
            return false;
        }

        BlockVolumeAttachmentDetails other = (BlockVolumeAttachmentDetails) o;
        return java.util.Objects.equals(
                        this.volumeAttachmentReferenceInstanceId,
                        other.volumeAttachmentReferenceInstanceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.volumeAttachmentReferenceInstanceId == null
                                ? 43
                                : this.volumeAttachmentReferenceInstanceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
