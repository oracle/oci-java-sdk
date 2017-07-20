/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Either instanceId or imageSourceDetails must be provided in addition to other required parameters.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateImageDetails.Builder.class
)
public class CreateImageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("imageSourceDetails")
        private ImageSourceDetails imageSourceDetails;

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        public CreateImageDetails build() {
            return new CreateImageDetails(
                    compartmentId, displayName, imageSourceDetails, instanceId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateImageDetails o) {
            return compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .imageSourceDetails(o.getImageSourceDetails())
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
     * The OCID of the compartment containing the instance you want to use as the basis for the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name for the image. It does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * You cannot use an Oracle-provided image name as a custom image name.
     * <p>
     * Example: `My Oracle Linux image`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * Details for creating an image through import
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageSourceDetails")
    ImageSourceDetails imageSourceDetails;

    /**
     * The OCID of the instance you want to use as the basis for the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String instanceId;
}
