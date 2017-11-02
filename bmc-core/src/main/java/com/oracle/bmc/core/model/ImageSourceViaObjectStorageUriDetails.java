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
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ImageSourceViaObjectStorageUriDetails extends ImageSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sourceUri")
        private String sourceUri;

        public Builder sourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            this.__explicitlySet__.add("sourceUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImageSourceViaObjectStorageUriDetails build() {
            ImageSourceViaObjectStorageUriDetails __instance__ =
                    new ImageSourceViaObjectStorageUriDetails(sourceUri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
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
     * The Object Storage URL for the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceUri")
    String sourceUri;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
