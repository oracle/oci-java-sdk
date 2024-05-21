/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * A detail of the attached block volume.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VolumeAttachmentDetail.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VolumeAttachmentDetail
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"volumeAttachmentId", "volumeSizeInGBs"})
    public VolumeAttachmentDetail(String volumeAttachmentId, Long volumeSizeInGBs) {
        super();
        this.volumeAttachmentId = volumeAttachmentId;
        this.volumeSizeInGBs = volumeSizeInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the volume attachment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumeAttachmentId")
        private String volumeAttachmentId;

        /**
         * The OCID of the volume attachment.
         * @param volumeAttachmentId the value to set
         * @return this builder
         **/
        public Builder volumeAttachmentId(String volumeAttachmentId) {
            this.volumeAttachmentId = volumeAttachmentId;
            this.__explicitlySet__.add("volumeAttachmentId");
            return this;
        }
        /**
         * The size of the volume in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumeSizeInGBs")
        private Long volumeSizeInGBs;

        /**
         * The size of the volume in GBs.
         * @param volumeSizeInGBs the value to set
         * @return this builder
         **/
        public Builder volumeSizeInGBs(Long volumeSizeInGBs) {
            this.volumeSizeInGBs = volumeSizeInGBs;
            this.__explicitlySet__.add("volumeSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VolumeAttachmentDetail build() {
            VolumeAttachmentDetail model =
                    new VolumeAttachmentDetail(this.volumeAttachmentId, this.volumeSizeInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VolumeAttachmentDetail model) {
            if (model.wasPropertyExplicitlySet("volumeAttachmentId")) {
                this.volumeAttachmentId(model.getVolumeAttachmentId());
            }
            if (model.wasPropertyExplicitlySet("volumeSizeInGBs")) {
                this.volumeSizeInGBs(model.getVolumeSizeInGBs());
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
     * The OCID of the volume attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeAttachmentId")
    private final String volumeAttachmentId;

    /**
     * The OCID of the volume attachment.
     * @return the value
     **/
    public String getVolumeAttachmentId() {
        return volumeAttachmentId;
    }

    /**
     * The size of the volume in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeSizeInGBs")
    private final Long volumeSizeInGBs;

    /**
     * The size of the volume in GBs.
     * @return the value
     **/
    public Long getVolumeSizeInGBs() {
        return volumeSizeInGBs;
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
        sb.append("VolumeAttachmentDetail(");
        sb.append("super=").append(super.toString());
        sb.append("volumeAttachmentId=").append(String.valueOf(this.volumeAttachmentId));
        sb.append(", volumeSizeInGBs=").append(String.valueOf(this.volumeSizeInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VolumeAttachmentDetail)) {
            return false;
        }

        VolumeAttachmentDetail other = (VolumeAttachmentDetail) o;
        return java.util.Objects.equals(this.volumeAttachmentId, other.volumeAttachmentId)
                && java.util.Objects.equals(this.volumeSizeInGBs, other.volumeSizeInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.volumeAttachmentId == null
                                ? 43
                                : this.volumeAttachmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.volumeSizeInGBs == null ? 43 : this.volumeSizeInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
