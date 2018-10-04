/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CopyObjectDetails build() {
            CopyObjectDetails __instance__ =
                    new CopyObjectDetails(
                            sourceObjectName,
                            sourceObjectIfMatchETag,
                            destinationRegion,
                            destinationNamespace,
                            destinationBucket,
                            destinationObjectName,
                            destinationObjectIfMatchETag,
                            destinationObjectIfNoneMatchETag,
                            destinationObjectMetadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CopyObjectDetails o) {
            Builder copiedBuilder =
                    sourceObjectName(o.getSourceObjectName())
                            .sourceObjectIfMatchETag(o.getSourceObjectIfMatchETag())
                            .destinationRegion(o.getDestinationRegion())
                            .destinationNamespace(o.getDestinationNamespace())
                            .destinationBucket(o.getDestinationBucket())
                            .destinationObjectName(o.getDestinationObjectName())
                            .destinationObjectIfMatchETag(o.getDestinationObjectIfMatchETag())
                            .destinationObjectIfNoneMatchETag(
                                    o.getDestinationObjectIfNoneMatchETag())
                            .destinationObjectMetadata(o.getDestinationObjectMetadata());

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
     * The name of the object to be copied
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectName")
    String sourceObjectName;

    /**
     * The entity tag to match the target object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectIfMatchETag")
    String sourceObjectIfMatchETag;

    /**
     * The destination region object will be copied to. Please specify name of the region, for example \"us-ashburn-1\".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationRegion")
    String destinationRegion;

    /**
     * The destination namespace object will be copied to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationNamespace")
    String destinationNamespace;

    /**
     * The destination bucket object will be copied to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationBucket")
    String destinationBucket;

    /**
     * The destination name for the copy object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectName")
    String destinationObjectName;

    /**
     * The entity tag to match the target object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectIfMatchETag")
    String destinationObjectIfMatchETag;

    /**
     * The entity tag to not match the target object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectIfNoneMatchETag")
    String destinationObjectIfNoneMatchETag;

    /**
     * Arbitrary string keys and values for the user-defined metadata for the object. Keys must be in
     * \"opc-meta-*\" format. Avoid entering confidential information. If user enter value in this field, the value
     * will become the object metadata for destination Object. If no value pass in, the destination object will have
     * the exact object metadata as source object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectMetadata")
    java.util.Map<String, String> destinationObjectMetadata;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
