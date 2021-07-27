/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * The parameters required by Object Storage to process a request to copy an object to another bucket.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not authorized,
 * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CopyObjectDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CopyObjectDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectName")
        private String sourceObjectName;

        public Builder sourceObjectName(String sourceObjectName) {
            this.sourceObjectName = sourceObjectName;
            this.__explicitlySet__.add("sourceObjectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectIfMatchETag")
        private String sourceObjectIfMatchETag;

        public Builder sourceObjectIfMatchETag(String sourceObjectIfMatchETag) {
            this.sourceObjectIfMatchETag = sourceObjectIfMatchETag;
            this.__explicitlySet__.add("sourceObjectIfMatchETag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceVersionId")
        private String sourceVersionId;

        public Builder sourceVersionId(String sourceVersionId) {
            this.sourceVersionId = sourceVersionId;
            this.__explicitlySet__.add("sourceVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationRegion")
        private String destinationRegion;

        public Builder destinationRegion(String destinationRegion) {
            this.destinationRegion = destinationRegion;
            this.__explicitlySet__.add("destinationRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationNamespace")
        private String destinationNamespace;

        public Builder destinationNamespace(String destinationNamespace) {
            this.destinationNamespace = destinationNamespace;
            this.__explicitlySet__.add("destinationNamespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationBucket")
        private String destinationBucket;

        public Builder destinationBucket(String destinationBucket) {
            this.destinationBucket = destinationBucket;
            this.__explicitlySet__.add("destinationBucket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectName")
        private String destinationObjectName;

        public Builder destinationObjectName(String destinationObjectName) {
            this.destinationObjectName = destinationObjectName;
            this.__explicitlySet__.add("destinationObjectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectIfMatchETag")
        private String destinationObjectIfMatchETag;

        public Builder destinationObjectIfMatchETag(String destinationObjectIfMatchETag) {
            this.destinationObjectIfMatchETag = destinationObjectIfMatchETag;
            this.__explicitlySet__.add("destinationObjectIfMatchETag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectIfNoneMatchETag")
        private String destinationObjectIfNoneMatchETag;

        public Builder destinationObjectIfNoneMatchETag(String destinationObjectIfNoneMatchETag) {
            this.destinationObjectIfNoneMatchETag = destinationObjectIfNoneMatchETag;
            this.__explicitlySet__.add("destinationObjectIfNoneMatchETag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectMetadata")
        private java.util.Map<String, String> destinationObjectMetadata;

        public Builder destinationObjectMetadata(
                java.util.Map<String, String> destinationObjectMetadata) {
            this.destinationObjectMetadata = destinationObjectMetadata;
            this.__explicitlySet__.add("destinationObjectMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectStorageTier")
        private StorageTier destinationObjectStorageTier;

        public Builder destinationObjectStorageTier(StorageTier destinationObjectStorageTier) {
            this.destinationObjectStorageTier = destinationObjectStorageTier;
            this.__explicitlySet__.add("destinationObjectStorageTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CopyObjectDetails build() {
            CopyObjectDetails __instance__ =
                    new CopyObjectDetails(
                            sourceObjectName,
                            sourceObjectIfMatchETag,
                            sourceVersionId,
                            destinationRegion,
                            destinationNamespace,
                            destinationBucket,
                            destinationObjectName,
                            destinationObjectIfMatchETag,
                            destinationObjectIfNoneMatchETag,
                            destinationObjectMetadata,
                            destinationObjectStorageTier);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CopyObjectDetails o) {
            Builder copiedBuilder =
                    sourceObjectName(o.getSourceObjectName())
                            .sourceObjectIfMatchETag(o.getSourceObjectIfMatchETag())
                            .sourceVersionId(o.getSourceVersionId())
                            .destinationRegion(o.getDestinationRegion())
                            .destinationNamespace(o.getDestinationNamespace())
                            .destinationBucket(o.getDestinationBucket())
                            .destinationObjectName(o.getDestinationObjectName())
                            .destinationObjectIfMatchETag(o.getDestinationObjectIfMatchETag())
                            .destinationObjectIfNoneMatchETag(
                                    o.getDestinationObjectIfNoneMatchETag())
                            .destinationObjectMetadata(o.getDestinationObjectMetadata())
                            .destinationObjectStorageTier(o.getDestinationObjectStorageTier());

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

    /**
     * The name of the object to be copied.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectName")
    String sourceObjectName;

    /**
     * The entity tag (ETag) to match against that of the source object. Used to confirm that the source object
     * with a given name is the version of that object storing a specified ETag.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectIfMatchETag")
    String sourceObjectIfMatchETag;

    /**
     * VersionId of the object to copy. If not provided then current version is copied by default.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceVersionId")
    String sourceVersionId;

    /**
     * The destination region the object will be copied to, for example "us-ashburn-1".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationRegion")
    String destinationRegion;

    /**
     * The destination Object Storage namespace the object will be copied to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationNamespace")
    String destinationNamespace;

    /**
     * The destination bucket the object will be copied to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationBucket")
    String destinationBucket;

    /**
     * The name of the destination object resulting from the copy operation. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectName")
    String destinationObjectName;

    /**
     * The entity tag (ETag) to match against that of the destination object (an object intended to be overwritten).
     * Used to confirm that the destination object stored under a given name is the version of that object
     * storing a specified entity tag.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectIfMatchETag")
    String destinationObjectIfMatchETag;

    /**
     * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates that the request should fail
     * if the object already exists in the destination bucket.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectIfNoneMatchETag")
    String destinationObjectIfNoneMatchETag;

    /**
     * Arbitrary string keys and values for the user-defined metadata for the object. Keys must be in
     * "opc-meta-*" format. Avoid entering confidential information. Metadata key-value pairs entered
     * in this field are assigned to the destination object. If you enter no metadata values, the destination
     * object will inherit any existing metadata values associated with the source object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectMetadata")
    java.util.Map<String, String> destinationObjectMetadata;

    /**
     * The storage tier that the object should be stored in. If not specified, the object will be stored in
     * the same storage tier as the bucket.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectStorageTier")
    StorageTier destinationObjectStorageTier;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
