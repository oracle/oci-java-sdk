/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateVolumeBackupDetails.Builder.class
)
public class CreateVolumeBackupDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
        private String volumeId;

        public CreateVolumeBackupDetails build() {
            return new CreateVolumeBackupDetails(displayName, volumeId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the volume that needs to be backed up.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String volumeId;
}
