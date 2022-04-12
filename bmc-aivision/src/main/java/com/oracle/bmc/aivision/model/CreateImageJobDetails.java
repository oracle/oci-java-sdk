/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The details of the batch image analysis.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateImageJobDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateImageJobDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
        private InputLocation inputLocation;

        public Builder inputLocation(InputLocation inputLocation) {
            this.inputLocation = inputLocation;
            this.__explicitlySet__.add("inputLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("features")
        private java.util.List<ImageFeature> features;

        public Builder features(java.util.List<ImageFeature> features) {
            this.features = features;
            this.__explicitlySet__.add("features");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
        private OutputLocation outputLocation;

        public Builder outputLocation(OutputLocation outputLocation) {
            this.outputLocation = outputLocation;
            this.__explicitlySet__.add("outputLocation");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("isZipOutputEnabled")
        private Boolean isZipOutputEnabled;

        public Builder isZipOutputEnabled(Boolean isZipOutputEnabled) {
            this.isZipOutputEnabled = isZipOutputEnabled;
            this.__explicitlySet__.add("isZipOutputEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateImageJobDetails build() {
            CreateImageJobDetails __instance__ =
                    new CreateImageJobDetails(
                            inputLocation,
                            features,
                            outputLocation,
                            compartmentId,
                            displayName,
                            isZipOutputEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateImageJobDetails o) {
            Builder copiedBuilder =
                    inputLocation(o.getInputLocation())
                            .features(o.getFeatures())
                            .outputLocation(o.getOutputLocation())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .isZipOutputEnabled(o.getIsZipOutputEnabled());

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

    @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
    InputLocation inputLocation;

    /**
     * The list of requested image analysis types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    java.util.List<ImageFeature> features;

    @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
    OutputLocation outputLocation;

    /**
     * The compartment identifier from the requester.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The image job display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Whether or not to generate a ZIP file containing the results.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isZipOutputEnabled")
    Boolean isZipOutputEnabled;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
