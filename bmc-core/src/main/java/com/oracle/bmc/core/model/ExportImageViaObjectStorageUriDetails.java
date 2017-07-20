/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExportImageViaObjectStorageUriDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "destinationType"
)
public class ExportImageViaObjectStorageUriDetails extends ExportImageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("destinationUri")
        private String destinationUri;

        public ExportImageViaObjectStorageUriDetails build() {
            return new ExportImageViaObjectStorageUriDetails(destinationUri);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportImageViaObjectStorageUriDetails o) {
            return destinationUri(o.getDestinationUri());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public ExportImageViaObjectStorageUriDetails(String destinationUri) {
        super();
        this.destinationUri = destinationUri;
    }

    /**
     * The Object Storage Service URL to export the image to. See [Object Storage URLs](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Tasks/imageimportexport.htm#URLs)
     * and [pre-authenticated requests](https://docs.us-phoenix-1.oraclecloud.com/Content/Object/Tasks/managingaccess.htm#pre-auth) for constructing URLs for image import/export.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationUri")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String destinationUri;
}
