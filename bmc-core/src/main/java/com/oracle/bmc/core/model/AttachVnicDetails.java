/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AttachVnicDetails.Builder.class
)
public class AttachVnicDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("createVnicDetails")
        private CreateVnicDetails createVnicDetails;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        public AttachVnicDetails build() {
            return new AttachVnicDetails(createVnicDetails, displayName, instanceId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachVnicDetails o) {
            return createVnicDetails(o.getCreateVnicDetails())
                    .displayName(o.getDisplayName())
                    .instanceId(o.getInstanceId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Details for creating a new VNIC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createVnicDetails")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    CreateVnicDetails createVnicDetails;

    /**
     * A user-friendly name for the attachment. Does not have to be unique, and it cannot be changed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String instanceId;
}
