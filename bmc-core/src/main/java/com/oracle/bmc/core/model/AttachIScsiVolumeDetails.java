/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AttachIScsiVolumeDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
public class AttachIScsiVolumeDetails extends AttachVolumeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
        private String volumeId;

        @com.fasterxml.jackson.annotation.JsonProperty("useChap")
        private Boolean useChap;

        public AttachIScsiVolumeDetails build() {
            return new AttachIScsiVolumeDetails(displayName, instanceId, volumeId, useChap);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachIScsiVolumeDetails o) {
            return displayName(o.getDisplayName())
                    .instanceId(o.getInstanceId())
                    .volumeId(o.getVolumeId())
                    .useChap(o.getUseChap());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public AttachIScsiVolumeDetails(
            String displayName, String instanceId, String volumeId, Boolean useChap) {
        super(displayName, instanceId, volumeId);
        this.useChap = useChap;
    }

    /**
     * Whether to use CHAP authentication for the volume attachment. Defaults to false.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("useChap")
    Boolean useChap;
}
