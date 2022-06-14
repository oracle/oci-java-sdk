/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The details of how to analyze an image.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AnalyzeImageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AnalyzeImageDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"features", "image", "compartmentId"})
    public AnalyzeImageDetails(
            java.util.List<ImageFeature> features, ImageDetails image, String compartmentId) {
        super();
        this.features = features;
        this.image = image;
        this.compartmentId = compartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The types of image analysis.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("features")
        private java.util.List<ImageFeature> features;

        /**
         * The types of image analysis.
         * @param features the value to set
         * @return this builder
         **/
        public Builder features(java.util.List<ImageFeature> features) {
            this.features = features;
            this.__explicitlySet__.add("features");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("image")
        private ImageDetails image;

        public Builder image(ImageDetails image) {
            this.image = image;
            this.__explicitlySet__.add("image");
            return this;
        }
        /**
         * The OCID of the compartment that calls the API.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that calls the API.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnalyzeImageDetails build() {
            AnalyzeImageDetails __instance__ =
                    new AnalyzeImageDetails(features, image, compartmentId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnalyzeImageDetails o) {
            Builder copiedBuilder =
                    features(o.getFeatures())
                            .image(o.getImage())
                            .compartmentId(o.getCompartmentId());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The types of image analysis.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    private final java.util.List<ImageFeature> features;

    /**
     * The types of image analysis.
     * @return the value
     **/
    public java.util.List<ImageFeature> getFeatures() {
        return features;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("image")
    private final ImageDetails image;

    public ImageDetails getImage() {
        return image;
    }

    /**
     * The OCID of the compartment that calls the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that calls the API.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AnalyzeImageDetails(");
        sb.append("features=").append(String.valueOf(this.features));
        sb.append(", image=").append(String.valueOf(this.image));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyzeImageDetails)) {
            return false;
        }

        AnalyzeImageDetails other = (AnalyzeImageDetails) o;
        return java.util.Objects.equals(this.features, other.features)
                && java.util.Objects.equals(this.image, other.image)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.features == null ? 43 : this.features.hashCode());
        result = (result * PRIME) + (this.image == null ? 43 : this.image.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
