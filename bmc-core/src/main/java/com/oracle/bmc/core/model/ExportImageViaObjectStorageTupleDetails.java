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
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ExportImageViaObjectStorageTupleDetails extends ExportImageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportImageViaObjectStorageTupleDetails build() {
            ExportImageViaObjectStorageTupleDetails __instance__ =
                    new ExportImageViaObjectStorageTupleDetails(
                            bucketName, namespaceName, objectName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
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

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
