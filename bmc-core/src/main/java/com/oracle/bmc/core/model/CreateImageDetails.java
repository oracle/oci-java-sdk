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
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateImageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageSourceDetails")
        private ImageSourceDetails imageSourceDetails;

        public Builder imageSourceDetails(ImageSourceDetails imageSourceDetails) {
            this.imageSourceDetails = imageSourceDetails;
            this.__explicitlySet__.add("imageSourceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateImageDetails build() {
            CreateImageDetails __instance__ =
                    new CreateImageDetails(
                            compartmentId, displayName, imageSourceDetails, instanceId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
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
    String instanceId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
