/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
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
@JsonDeserialize(builder = CreateVolumeBackupDetails.Builder.class)
public class CreateVolumeBackupDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("volumeId")
        private String volumeId;

        public CreateVolumeBackupDetails build() {
            return new CreateVolumeBackupDetails(displayName, volumeId);
        }

        @JsonIgnore
        public Builder copy(CreateVolumeBackupDetails o) {
            return displayName(o.getDisplayName()).volumeId(o.getVolumeId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A user-friendly name for the volume backup. Does not have to be unique and it's changeable.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the volume that needs to be backed up.
     **/
    @JsonProperty("volumeId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String volumeId;
}
