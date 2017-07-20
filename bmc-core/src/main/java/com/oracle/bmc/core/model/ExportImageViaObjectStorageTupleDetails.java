/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExportImageViaObjectStorageTupleDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "destinationType"
)
public class ExportImageViaObjectStorageTupleDetails extends ExportImageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        public ExportImageViaObjectStorageTupleDetails build() {
            return new ExportImageViaObjectStorageTupleDetails(
                    bucketName, namespaceName, objectName);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportImageViaObjectStorageTupleDetails o) {
            return bucketName(o.getBucketName())
                    .namespaceName(o.getNamespaceName())
                    .objectName(o.getObjectName());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public ExportImageViaObjectStorageTupleDetails(
            String bucketName, String namespaceName, String objectName) {
        super();
        this.bucketName = bucketName;
        this.namespaceName = namespaceName;
        this.objectName = objectName;
    }

    /**
     * The Object Storage Service bucket to export the image to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    String bucketName;

    /**
     * The Object Storage Service namespace to export the image to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    String namespaceName;

    /**
     * The Object Storage Service object name for the exported image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    String objectName;
}
