/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CopyObjectDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CopyObjectDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceObjectName",
        "sourceObjectIfMatchETag",
        "sourceVersionId",
        "destinationRegion",
        "destinationNamespace",
        "destinationBucket",
        "destinationObjectName",
        "destinationObjectIfMatchETag",
        "destinationObjectIfNoneMatchETag",
        "destinationObjectMetadata",
        "destinationObjectStorageTier"
    })
    public CopyObjectDetails(
            String sourceObjectName,
            String sourceObjectIfMatchETag,
            String sourceVersionId,
            String destinationRegion,
            String destinationNamespace,
            String destinationBucket,
            String destinationObjectName,
            String destinationObjectIfMatchETag,
            String destinationObjectIfNoneMatchETag,
            java.util.Map<String, String> destinationObjectMetadata,
            StorageTier destinationObjectStorageTier) {
        super();
        this.sourceObjectName = sourceObjectName;
        this.sourceObjectIfMatchETag = sourceObjectIfMatchETag;
        this.sourceVersionId = sourceVersionId;
        this.destinationRegion = destinationRegion;
        this.destinationNamespace = destinationNamespace;
        this.destinationBucket = destinationBucket;
        this.destinationObjectName = destinationObjectName;
        this.destinationObjectIfMatchETag = destinationObjectIfMatchETag;
        this.destinationObjectIfNoneMatchETag = destinationObjectIfNoneMatchETag;
        this.destinationObjectMetadata = destinationObjectMetadata;
        this.destinationObjectStorageTier = destinationObjectStorageTier;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the object to be copied.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectName")
        private String sourceObjectName;

        /**
         * The name of the object to be copied.
         * @param sourceObjectName the value to set
         * @return this builder
         **/
        public Builder sourceObjectName(String sourceObjectName) {
            this.sourceObjectName = sourceObjectName;
            this.__explicitlySet__.add("sourceObjectName");
            return this;
        }
        /**
         * The entity tag (ETag) to match against that of the source object. Used to confirm that the source object
         * with a given name is the version of that object storing a specified ETag.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectIfMatchETag")
        private String sourceObjectIfMatchETag;

        /**
         * The entity tag (ETag) to match against that of the source object. Used to confirm that the source object
         * with a given name is the version of that object storing a specified ETag.
         *
         * @param sourceObjectIfMatchETag the value to set
         * @return this builder
         **/
        public Builder sourceObjectIfMatchETag(String sourceObjectIfMatchETag) {
            this.sourceObjectIfMatchETag = sourceObjectIfMatchETag;
            this.__explicitlySet__.add("sourceObjectIfMatchETag");
            return this;
        }
        /**
         * VersionId of the object to copy. If not provided then current version is copied by default.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceVersionId")
        private String sourceVersionId;

        /**
         * VersionId of the object to copy. If not provided then current version is copied by default.
         * @param sourceVersionId the value to set
         * @return this builder
         **/
        public Builder sourceVersionId(String sourceVersionId) {
            this.sourceVersionId = sourceVersionId;
            this.__explicitlySet__.add("sourceVersionId");
            return this;
        }
        /**
         * The destination region the object will be copied to, for example "us-ashburn-1".
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationRegion")
        private String destinationRegion;

        /**
         * The destination region the object will be copied to, for example "us-ashburn-1".
         * @param destinationRegion the value to set
         * @return this builder
         **/
        public Builder destinationRegion(String destinationRegion) {
            this.destinationRegion = destinationRegion;
            this.__explicitlySet__.add("destinationRegion");
            return this;
        }
        /**
         * The destination Object Storage namespace the object will be copied to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationNamespace")
        private String destinationNamespace;

        /**
         * The destination Object Storage namespace the object will be copied to.
         * @param destinationNamespace the value to set
         * @return this builder
         **/
        public Builder destinationNamespace(String destinationNamespace) {
            this.destinationNamespace = destinationNamespace;
            this.__explicitlySet__.add("destinationNamespace");
            return this;
        }
        /**
         * The destination bucket the object will be copied to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationBucket")
        private String destinationBucket;

        /**
         * The destination bucket the object will be copied to.
         * @param destinationBucket the value to set
         * @return this builder
         **/
        public Builder destinationBucket(String destinationBucket) {
            this.destinationBucket = destinationBucket;
            this.__explicitlySet__.add("destinationBucket");
            return this;
        }
        /**
         * The name of the destination object resulting from the copy operation. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectName")
        private String destinationObjectName;

        /**
         * The name of the destination object resulting from the copy operation. Avoid entering confidential information.
         * @param destinationObjectName the value to set
         * @return this builder
         **/
        public Builder destinationObjectName(String destinationObjectName) {
            this.destinationObjectName = destinationObjectName;
            this.__explicitlySet__.add("destinationObjectName");
            return this;
        }
        /**
         * The entity tag (ETag) to match against that of the destination object (an object intended to be overwritten).
         * Used to confirm that the destination object stored under a given name is the version of that object
         * storing a specified entity tag.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectIfMatchETag")
        private String destinationObjectIfMatchETag;

        /**
         * The entity tag (ETag) to match against that of the destination object (an object intended to be overwritten).
         * Used to confirm that the destination object stored under a given name is the version of that object
         * storing a specified entity tag.
         *
         * @param destinationObjectIfMatchETag the value to set
         * @return this builder
         **/
        public Builder destinationObjectIfMatchETag(String destinationObjectIfMatchETag) {
            this.destinationObjectIfMatchETag = destinationObjectIfMatchETag;
            this.__explicitlySet__.add("destinationObjectIfMatchETag");
            return this;
        }
        /**
         * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates that the request should fail
         * if the object already exists in the destination bucket.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectIfNoneMatchETag")
        private String destinationObjectIfNoneMatchETag;

        /**
         * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates that the request should fail
         * if the object already exists in the destination bucket.
         *
         * @param destinationObjectIfNoneMatchETag the value to set
         * @return this builder
         **/
        public Builder destinationObjectIfNoneMatchETag(String destinationObjectIfNoneMatchETag) {
            this.destinationObjectIfNoneMatchETag = destinationObjectIfNoneMatchETag;
            this.__explicitlySet__.add("destinationObjectIfNoneMatchETag");
            return this;
        }
        /**
         * Arbitrary string keys and values for the user-defined metadata for the object. Keys must be in
         * "opc-meta-*" format. Avoid entering confidential information. Metadata key-value pairs entered
         * in this field are assigned to the destination object. If you enter no metadata values, the destination
         * object will inherit any existing metadata values associated with the source object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectMetadata")
        private java.util.Map<String, String> destinationObjectMetadata;

        /**
         * Arbitrary string keys and values for the user-defined metadata for the object. Keys must be in
         * "opc-meta-*" format. Avoid entering confidential information. Metadata key-value pairs entered
         * in this field are assigned to the destination object. If you enter no metadata values, the destination
         * object will inherit any existing metadata values associated with the source object.
         *
         * @param destinationObjectMetadata the value to set
         * @return this builder
         **/
        public Builder destinationObjectMetadata(
                java.util.Map<String, String> destinationObjectMetadata) {
            this.destinationObjectMetadata = destinationObjectMetadata;
            this.__explicitlySet__.add("destinationObjectMetadata");
            return this;
        }
        /**
         * The storage tier that the object should be stored in. If not specified, the object will be stored in
         * the same storage tier as the bucket.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectStorageTier")
        private StorageTier destinationObjectStorageTier;

        /**
         * The storage tier that the object should be stored in. If not specified, the object will be stored in
         * the same storage tier as the bucket.
         *
         * @param destinationObjectStorageTier the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The name of the object to be copied.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectName")
    private final String sourceObjectName;

    /**
     * The name of the object to be copied.
     * @return the value
     **/
    public String getSourceObjectName() {
        return sourceObjectName;
    }

    /**
     * The entity tag (ETag) to match against that of the source object. Used to confirm that the source object
     * with a given name is the version of that object storing a specified ETag.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectIfMatchETag")
    private final String sourceObjectIfMatchETag;

    /**
     * The entity tag (ETag) to match against that of the source object. Used to confirm that the source object
     * with a given name is the version of that object storing a specified ETag.
     *
     * @return the value
     **/
    public String getSourceObjectIfMatchETag() {
        return sourceObjectIfMatchETag;
    }

    /**
     * VersionId of the object to copy. If not provided then current version is copied by default.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceVersionId")
    private final String sourceVersionId;

    /**
     * VersionId of the object to copy. If not provided then current version is copied by default.
     * @return the value
     **/
    public String getSourceVersionId() {
        return sourceVersionId;
    }

    /**
     * The destination region the object will be copied to, for example "us-ashburn-1".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationRegion")
    private final String destinationRegion;

    /**
     * The destination region the object will be copied to, for example "us-ashburn-1".
     * @return the value
     **/
    public String getDestinationRegion() {
        return destinationRegion;
    }

    /**
     * The destination Object Storage namespace the object will be copied to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationNamespace")
    private final String destinationNamespace;

    /**
     * The destination Object Storage namespace the object will be copied to.
     * @return the value
     **/
    public String getDestinationNamespace() {
        return destinationNamespace;
    }

    /**
     * The destination bucket the object will be copied to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationBucket")
    private final String destinationBucket;

    /**
     * The destination bucket the object will be copied to.
     * @return the value
     **/
    public String getDestinationBucket() {
        return destinationBucket;
    }

    /**
     * The name of the destination object resulting from the copy operation. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectName")
    private final String destinationObjectName;

    /**
     * The name of the destination object resulting from the copy operation. Avoid entering confidential information.
     * @return the value
     **/
    public String getDestinationObjectName() {
        return destinationObjectName;
    }

    /**
     * The entity tag (ETag) to match against that of the destination object (an object intended to be overwritten).
     * Used to confirm that the destination object stored under a given name is the version of that object
     * storing a specified entity tag.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectIfMatchETag")
    private final String destinationObjectIfMatchETag;

    /**
     * The entity tag (ETag) to match against that of the destination object (an object intended to be overwritten).
     * Used to confirm that the destination object stored under a given name is the version of that object
     * storing a specified entity tag.
     *
     * @return the value
     **/
    public String getDestinationObjectIfMatchETag() {
        return destinationObjectIfMatchETag;
    }

    /**
     * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates that the request should fail
     * if the object already exists in the destination bucket.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectIfNoneMatchETag")
    private final String destinationObjectIfNoneMatchETag;

    /**
     * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates that the request should fail
     * if the object already exists in the destination bucket.
     *
     * @return the value
     **/
    public String getDestinationObjectIfNoneMatchETag() {
        return destinationObjectIfNoneMatchETag;
    }

    /**
     * Arbitrary string keys and values for the user-defined metadata for the object. Keys must be in
     * "opc-meta-*" format. Avoid entering confidential information. Metadata key-value pairs entered
     * in this field are assigned to the destination object. If you enter no metadata values, the destination
     * object will inherit any existing metadata values associated with the source object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectMetadata")
    private final java.util.Map<String, String> destinationObjectMetadata;

    /**
     * Arbitrary string keys and values for the user-defined metadata for the object. Keys must be in
     * "opc-meta-*" format. Avoid entering confidential information. Metadata key-value pairs entered
     * in this field are assigned to the destination object. If you enter no metadata values, the destination
     * object will inherit any existing metadata values associated with the source object.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getDestinationObjectMetadata() {
        return destinationObjectMetadata;
    }

    /**
     * The storage tier that the object should be stored in. If not specified, the object will be stored in
     * the same storage tier as the bucket.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectStorageTier")
    private final StorageTier destinationObjectStorageTier;

    /**
     * The storage tier that the object should be stored in. If not specified, the object will be stored in
     * the same storage tier as the bucket.
     *
     * @return the value
     **/
    public StorageTier getDestinationObjectStorageTier() {
        return destinationObjectStorageTier;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CopyObjectDetails(");
        sb.append("sourceObjectName=").append(String.valueOf(this.sourceObjectName));
        sb.append(", sourceObjectIfMatchETag=")
                .append(String.valueOf(this.sourceObjectIfMatchETag));
        sb.append(", sourceVersionId=").append(String.valueOf(this.sourceVersionId));
        sb.append(", destinationRegion=").append(String.valueOf(this.destinationRegion));
        sb.append(", destinationNamespace=").append(String.valueOf(this.destinationNamespace));
        sb.append(", destinationBucket=").append(String.valueOf(this.destinationBucket));
        sb.append(", destinationObjectName=").append(String.valueOf(this.destinationObjectName));
        sb.append(", destinationObjectIfMatchETag=")
                .append(String.valueOf(this.destinationObjectIfMatchETag));
        sb.append(", destinationObjectIfNoneMatchETag=")
                .append(String.valueOf(this.destinationObjectIfNoneMatchETag));
        sb.append(", destinationObjectMetadata=")
                .append(String.valueOf(this.destinationObjectMetadata));
        sb.append(", destinationObjectStorageTier=")
                .append(String.valueOf(this.destinationObjectStorageTier));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CopyObjectDetails)) {
            return false;
        }

        CopyObjectDetails other = (CopyObjectDetails) o;
        return java.util.Objects.equals(this.sourceObjectName, other.sourceObjectName)
                && java.util.Objects.equals(
                        this.sourceObjectIfMatchETag, other.sourceObjectIfMatchETag)
                && java.util.Objects.equals(this.sourceVersionId, other.sourceVersionId)
                && java.util.Objects.equals(this.destinationRegion, other.destinationRegion)
                && java.util.Objects.equals(this.destinationNamespace, other.destinationNamespace)
                && java.util.Objects.equals(this.destinationBucket, other.destinationBucket)
                && java.util.Objects.equals(this.destinationObjectName, other.destinationObjectName)
                && java.util.Objects.equals(
                        this.destinationObjectIfMatchETag, other.destinationObjectIfMatchETag)
                && java.util.Objects.equals(
                        this.destinationObjectIfNoneMatchETag,
                        other.destinationObjectIfNoneMatchETag)
                && java.util.Objects.equals(
                        this.destinationObjectMetadata, other.destinationObjectMetadata)
                && java.util.Objects.equals(
                        this.destinationObjectStorageTier, other.destinationObjectStorageTier)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceObjectName == null ? 43 : this.sourceObjectName.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceObjectIfMatchETag == null
                                ? 43
                                : this.sourceObjectIfMatchETag.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceVersionId == null ? 43 : this.sourceVersionId.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationRegion == null ? 43 : this.destinationRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationNamespace == null
                                ? 43
                                : this.destinationNamespace.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationBucket == null ? 43 : this.destinationBucket.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationObjectName == null
                                ? 43
                                : this.destinationObjectName.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationObjectIfMatchETag == null
                                ? 43
                                : this.destinationObjectIfMatchETag.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationObjectIfNoneMatchETag == null
                                ? 43
                                : this.destinationObjectIfNoneMatchETag.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationObjectMetadata == null
                                ? 43
                                : this.destinationObjectMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationObjectStorageTier == null
                                ? 43
                                : this.destinationObjectStorageTier.hashCode());
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
