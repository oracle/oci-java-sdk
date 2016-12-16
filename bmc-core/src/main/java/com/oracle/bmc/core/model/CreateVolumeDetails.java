/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
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
@JsonDeserialize(builder = CreateVolumeDetails.Builder.class)
public class CreateVolumeDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("availabilityDomain")
        private String availabilityDomain;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("sizeInMBs")
        private Long sizeInMBs;

        @JsonProperty("volumeBackupId")
        private String volumeBackupId;

        public CreateVolumeDetails build() {
            return new CreateVolumeDetails(
                    availabilityDomain, compartmentId, displayName, sizeInMBs, volumeBackupId);
        }

        @JsonIgnore
        public Builder copy(CreateVolumeDetails o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .sizeInMBs(o.getSizeInMBs())
                    .volumeBackupId(o.getVolumeBackupId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The Availability Domain of the volume.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @JsonProperty("availabilityDomain")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String availabilityDomain;

    /**
     * The OCID of the compartment that contains the volume.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     *
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The size of the volume in MBs.
     **/
    @JsonProperty("sizeInMBs")
    Long sizeInMBs;

    /**
     * The OCID of the volume backup from which the data should be restored on the newly created volume.
     *
     **/
    @JsonProperty("volumeBackupId")
    @Size(min = 1, max = 255)
    String volumeBackupId;
}
