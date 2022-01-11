/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VolumeAttachmentDetail.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class VolumeAttachmentDetail {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("volumeAttachmentId")
        private String volumeAttachmentId;

        public Builder volumeAttachmentId(String volumeAttachmentId) {
            this.volumeAttachmentId = volumeAttachmentId;
            this.__explicitlySet__.add("volumeAttachmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("volumeSizeInGBs")
        private Long volumeSizeInGBs;

        public Builder volumeSizeInGBs(Long volumeSizeInGBs) {
            this.volumeSizeInGBs = volumeSizeInGBs;
            this.__explicitlySet__.add("volumeSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VolumeAttachmentDetail build() {
            VolumeAttachmentDetail __instance__ =
                    new VolumeAttachmentDetail(volumeAttachmentId, volumeSizeInGBs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VolumeAttachmentDetail o) {
            Builder copiedBuilder =
                    volumeAttachmentId(o.getVolumeAttachmentId())
                            .volumeSizeInGBs(o.getVolumeSizeInGBs());

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

    /**
     * The OCID of the volume attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeAttachmentId")
    String volumeAttachmentId;

    /**
     * The size of the volume in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeSizeInGBs")
    Long volumeSizeInGBs;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
