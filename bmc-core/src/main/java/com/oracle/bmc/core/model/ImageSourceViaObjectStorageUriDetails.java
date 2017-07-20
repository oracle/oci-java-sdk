/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ImageSourceViaObjectStorageUriDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
public class ImageSourceViaObjectStorageUriDetails extends ImageSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sourceUri")
        private String sourceUri;

        public ImageSourceViaObjectStorageUriDetails build() {
            return new ImageSourceViaObjectStorageUriDetails(sourceUri);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageSourceViaObjectStorageUriDetails o) {
            return sourceUri(o.getSourceUri());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public ImageSourceViaObjectStorageUriDetails(String sourceUri) {
        super();
        this.sourceUri = sourceUri;
    }

    /**
     * The Object Storage Service URL for the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceUri")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String sourceUri;
}
