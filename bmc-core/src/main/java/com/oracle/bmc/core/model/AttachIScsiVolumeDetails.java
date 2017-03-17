/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = AttachIScsiVolumeDetails.Builder.class)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class AttachIScsiVolumeDetails extends AttachVolumeDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("instanceId")
        private String instanceId;

        @JsonProperty("volumeId")
        private String volumeId;

        @JsonProperty("useChap")
        private Boolean useChap;

        public AttachIScsiVolumeDetails build() {
            return new AttachIScsiVolumeDetails(displayName, instanceId, volumeId, useChap);
        }

        @JsonIgnore
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
    @JsonProperty("useChap")
    Boolean useChap;
}
