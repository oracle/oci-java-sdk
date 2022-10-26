/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * The information about new MediaAsset. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMediaAssetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateMediaAssetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceMediaWorkflowId",
        "mediaWorkflowJobId",
        "sourceMediaWorkflowVersion",
        "displayName",
        "compartmentId",
        "type",
        "parentMediaAssetId",
        "masterMediaAssetId",
        "bucketName",
        "namespaceName",
        "objectName",
        "objectEtag",
        "metadata",
        "segmentRangeStartIndex",
        "segmentRangeEndIndex",
        "mediaAssetTags",
        "freeformTags",
        "definedTags"
    })
    public CreateMediaAssetDetails(
            String sourceMediaWorkflowId,
            String mediaWorkflowJobId,
            Long sourceMediaWorkflowVersion,
            String displayName,
            String compartmentId,
            AssetType type,
            String parentMediaAssetId,
            String masterMediaAssetId,
            String bucketName,
            String namespaceName,
            String objectName,
            String objectEtag,
            java.util.List<Metadata> metadata,
            Long segmentRangeStartIndex,
            Long segmentRangeEndIndex,
            java.util.List<MediaAssetTag> mediaAssetTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.sourceMediaWorkflowId = sourceMediaWorkflowId;
        this.mediaWorkflowJobId = mediaWorkflowJobId;
        this.sourceMediaWorkflowVersion = sourceMediaWorkflowVersion;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.type = type;
        this.parentMediaAssetId = parentMediaAssetId;
        this.masterMediaAssetId = masterMediaAssetId;
        this.bucketName = bucketName;
        this.namespaceName = namespaceName;
        this.objectName = objectName;
        this.objectEtag = objectEtag;
        this.metadata = metadata;
        this.segmentRangeStartIndex = segmentRangeStartIndex;
        this.segmentRangeEndIndex = segmentRangeEndIndex;
        this.mediaAssetTags = mediaAssetTags;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The ID of the MediaWorkflow used to produce this asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceMediaWorkflowId")
        private String sourceMediaWorkflowId;

        /**
         * The ID of the MediaWorkflow used to produce this asset.
         *
         * @param sourceMediaWorkflowId the value to set
         * @return this builder
         */
        public Builder sourceMediaWorkflowId(String sourceMediaWorkflowId) {
            this.sourceMediaWorkflowId = sourceMediaWorkflowId;
            this.__explicitlySet__.add("sourceMediaWorkflowId");
            return this;
        }
        /** The ID of the MediaWorkflowJob used to produce this asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowJobId")
        private String mediaWorkflowJobId;

        /**
         * The ID of the MediaWorkflowJob used to produce this asset.
         *
         * @param mediaWorkflowJobId the value to set
         * @return this builder
         */
        public Builder mediaWorkflowJobId(String mediaWorkflowJobId) {
            this.mediaWorkflowJobId = mediaWorkflowJobId;
            this.__explicitlySet__.add("mediaWorkflowJobId");
            return this;
        }
        /** The version of the MediaWorkflow used to produce this asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceMediaWorkflowVersion")
        private Long sourceMediaWorkflowVersion;

        /**
         * The version of the MediaWorkflow used to produce this asset.
         *
         * @param sourceMediaWorkflowVersion the value to set
         * @return this builder
         */
        public Builder sourceMediaWorkflowVersion(Long sourceMediaWorkflowVersion) {
            this.sourceMediaWorkflowVersion = sourceMediaWorkflowVersion;
            this.__explicitlySet__.add("sourceMediaWorkflowVersion");
            return this;
        }
        /**
         * Display name for the Media Asset. Does not have to be unique. Avoid entering confidential
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for the Media Asset. Does not have to be unique. Avoid entering confidential
         * information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Compartment Identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The type of the media asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private AssetType type;

        /**
         * The type of the media asset.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(AssetType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The ID of the parent asset from which this asset is derived. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentMediaAssetId")
        private String parentMediaAssetId;

        /**
         * The ID of the parent asset from which this asset is derived.
         *
         * @param parentMediaAssetId the value to set
         * @return this builder
         */
        public Builder parentMediaAssetId(String parentMediaAssetId) {
            this.parentMediaAssetId = parentMediaAssetId;
            this.__explicitlySet__.add("parentMediaAssetId");
            return this;
        }
        /** The ID of the senior most asset from which this asset is derived. */
        @com.fasterxml.jackson.annotation.JsonProperty("masterMediaAssetId")
        private String masterMediaAssetId;

        /**
         * The ID of the senior most asset from which this asset is derived.
         *
         * @param masterMediaAssetId the value to set
         * @return this builder
         */
        public Builder masterMediaAssetId(String masterMediaAssetId) {
            this.masterMediaAssetId = masterMediaAssetId;
            this.__explicitlySet__.add("masterMediaAssetId");
            return this;
        }
        /** The name of the object storage bucket where this asset is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The name of the object storage bucket where this asset is located.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** The object storage namespace where this asset is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * The object storage namespace where this asset is located.
         *
         * @param namespaceName the value to set
         * @return this builder
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }
        /** The object storage object name that identifies this asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The object storage object name that identifies this asset.
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /** eTag of the underlying object storage object. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectEtag")
        private String objectEtag;

        /**
         * eTag of the underlying object storage object.
         *
         * @param objectEtag the value to set
         * @return this builder
         */
        public Builder objectEtag(String objectEtag) {
            this.objectEtag = objectEtag;
            this.__explicitlySet__.add("objectEtag");
            return this;
        }
        /** List of Metadata. */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.List<Metadata> metadata;

        /**
         * List of Metadata.
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.List<Metadata> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /** The start index for video segment files. */
        @com.fasterxml.jackson.annotation.JsonProperty("segmentRangeStartIndex")
        private Long segmentRangeStartIndex;

        /**
         * The start index for video segment files.
         *
         * @param segmentRangeStartIndex the value to set
         * @return this builder
         */
        public Builder segmentRangeStartIndex(Long segmentRangeStartIndex) {
            this.segmentRangeStartIndex = segmentRangeStartIndex;
            this.__explicitlySet__.add("segmentRangeStartIndex");
            return this;
        }
        /** The end index for video segment files. */
        @com.fasterxml.jackson.annotation.JsonProperty("segmentRangeEndIndex")
        private Long segmentRangeEndIndex;

        /**
         * The end index for video segment files.
         *
         * @param segmentRangeEndIndex the value to set
         * @return this builder
         */
        public Builder segmentRangeEndIndex(Long segmentRangeEndIndex) {
            this.segmentRangeEndIndex = segmentRangeEndIndex;
            this.__explicitlySet__.add("segmentRangeEndIndex");
            return this;
        }
        /** list of tags for the MediaAsset. */
        @com.fasterxml.jackson.annotation.JsonProperty("mediaAssetTags")
        private java.util.List<MediaAssetTag> mediaAssetTags;

        /**
         * list of tags for the MediaAsset.
         *
         * @param mediaAssetTags the value to set
         * @return this builder
         */
        public Builder mediaAssetTags(java.util.List<MediaAssetTag> mediaAssetTags) {
            this.mediaAssetTags = mediaAssetTags;
            this.__explicitlySet__.add("mediaAssetTags");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMediaAssetDetails build() {
            CreateMediaAssetDetails model =
                    new CreateMediaAssetDetails(
                            this.sourceMediaWorkflowId,
                            this.mediaWorkflowJobId,
                            this.sourceMediaWorkflowVersion,
                            this.displayName,
                            this.compartmentId,
                            this.type,
                            this.parentMediaAssetId,
                            this.masterMediaAssetId,
                            this.bucketName,
                            this.namespaceName,
                            this.objectName,
                            this.objectEtag,
                            this.metadata,
                            this.segmentRangeStartIndex,
                            this.segmentRangeEndIndex,
                            this.mediaAssetTags,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMediaAssetDetails model) {
            if (model.wasPropertyExplicitlySet("sourceMediaWorkflowId")) {
                this.sourceMediaWorkflowId(model.getSourceMediaWorkflowId());
            }
            if (model.wasPropertyExplicitlySet("mediaWorkflowJobId")) {
                this.mediaWorkflowJobId(model.getMediaWorkflowJobId());
            }
            if (model.wasPropertyExplicitlySet("sourceMediaWorkflowVersion")) {
                this.sourceMediaWorkflowVersion(model.getSourceMediaWorkflowVersion());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("parentMediaAssetId")) {
                this.parentMediaAssetId(model.getParentMediaAssetId());
            }
            if (model.wasPropertyExplicitlySet("masterMediaAssetId")) {
                this.masterMediaAssetId(model.getMasterMediaAssetId());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("objectEtag")) {
                this.objectEtag(model.getObjectEtag());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("segmentRangeStartIndex")) {
                this.segmentRangeStartIndex(model.getSegmentRangeStartIndex());
            }
            if (model.wasPropertyExplicitlySet("segmentRangeEndIndex")) {
                this.segmentRangeEndIndex(model.getSegmentRangeEndIndex());
            }
            if (model.wasPropertyExplicitlySet("mediaAssetTags")) {
                this.mediaAssetTags(model.getMediaAssetTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The ID of the MediaWorkflow used to produce this asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMediaWorkflowId")
    private final String sourceMediaWorkflowId;

    /**
     * The ID of the MediaWorkflow used to produce this asset.
     *
     * @return the value
     */
    public String getSourceMediaWorkflowId() {
        return sourceMediaWorkflowId;
    }

    /** The ID of the MediaWorkflowJob used to produce this asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowJobId")
    private final String mediaWorkflowJobId;

    /**
     * The ID of the MediaWorkflowJob used to produce this asset.
     *
     * @return the value
     */
    public String getMediaWorkflowJobId() {
        return mediaWorkflowJobId;
    }

    /** The version of the MediaWorkflow used to produce this asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMediaWorkflowVersion")
    private final Long sourceMediaWorkflowVersion;

    /**
     * The version of the MediaWorkflow used to produce this asset.
     *
     * @return the value
     */
    public Long getSourceMediaWorkflowVersion() {
        return sourceMediaWorkflowVersion;
    }

    /**
     * Display name for the Media Asset. Does not have to be unique. Avoid entering confidential
     * information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for the Media Asset. Does not have to be unique. Avoid entering confidential
     * information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Compartment Identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The type of the media asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final AssetType type;

    /**
     * The type of the media asset.
     *
     * @return the value
     */
    public AssetType getType() {
        return type;
    }

    /** The ID of the parent asset from which this asset is derived. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentMediaAssetId")
    private final String parentMediaAssetId;

    /**
     * The ID of the parent asset from which this asset is derived.
     *
     * @return the value
     */
    public String getParentMediaAssetId() {
        return parentMediaAssetId;
    }

    /** The ID of the senior most asset from which this asset is derived. */
    @com.fasterxml.jackson.annotation.JsonProperty("masterMediaAssetId")
    private final String masterMediaAssetId;

    /**
     * The ID of the senior most asset from which this asset is derived.
     *
     * @return the value
     */
    public String getMasterMediaAssetId() {
        return masterMediaAssetId;
    }

    /** The name of the object storage bucket where this asset is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The name of the object storage bucket where this asset is located.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** The object storage namespace where this asset is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * The object storage namespace where this asset is located.
     *
     * @return the value
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    /** The object storage object name that identifies this asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The object storage object name that identifies this asset.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /** eTag of the underlying object storage object. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectEtag")
    private final String objectEtag;

    /**
     * eTag of the underlying object storage object.
     *
     * @return the value
     */
    public String getObjectEtag() {
        return objectEtag;
    }

    /** List of Metadata. */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.List<Metadata> metadata;

    /**
     * List of Metadata.
     *
     * @return the value
     */
    public java.util.List<Metadata> getMetadata() {
        return metadata;
    }

    /** The start index for video segment files. */
    @com.fasterxml.jackson.annotation.JsonProperty("segmentRangeStartIndex")
    private final Long segmentRangeStartIndex;

    /**
     * The start index for video segment files.
     *
     * @return the value
     */
    public Long getSegmentRangeStartIndex() {
        return segmentRangeStartIndex;
    }

    /** The end index for video segment files. */
    @com.fasterxml.jackson.annotation.JsonProperty("segmentRangeEndIndex")
    private final Long segmentRangeEndIndex;

    /**
     * The end index for video segment files.
     *
     * @return the value
     */
    public Long getSegmentRangeEndIndex() {
        return segmentRangeEndIndex;
    }

    /** list of tags for the MediaAsset. */
    @com.fasterxml.jackson.annotation.JsonProperty("mediaAssetTags")
    private final java.util.List<MediaAssetTag> mediaAssetTags;

    /**
     * list of tags for the MediaAsset.
     *
     * @return the value
     */
    public java.util.List<MediaAssetTag> getMediaAssetTags() {
        return mediaAssetTags;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateMediaAssetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceMediaWorkflowId=").append(String.valueOf(this.sourceMediaWorkflowId));
        sb.append(", mediaWorkflowJobId=").append(String.valueOf(this.mediaWorkflowJobId));
        sb.append(", sourceMediaWorkflowVersion=")
                .append(String.valueOf(this.sourceMediaWorkflowVersion));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", parentMediaAssetId=").append(String.valueOf(this.parentMediaAssetId));
        sb.append(", masterMediaAssetId=").append(String.valueOf(this.masterMediaAssetId));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", objectEtag=").append(String.valueOf(this.objectEtag));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", segmentRangeStartIndex=").append(String.valueOf(this.segmentRangeStartIndex));
        sb.append(", segmentRangeEndIndex=").append(String.valueOf(this.segmentRangeEndIndex));
        sb.append(", mediaAssetTags=").append(String.valueOf(this.mediaAssetTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMediaAssetDetails)) {
            return false;
        }

        CreateMediaAssetDetails other = (CreateMediaAssetDetails) o;
        return java.util.Objects.equals(this.sourceMediaWorkflowId, other.sourceMediaWorkflowId)
                && java.util.Objects.equals(this.mediaWorkflowJobId, other.mediaWorkflowJobId)
                && java.util.Objects.equals(
                        this.sourceMediaWorkflowVersion, other.sourceMediaWorkflowVersion)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.parentMediaAssetId, other.parentMediaAssetId)
                && java.util.Objects.equals(this.masterMediaAssetId, other.masterMediaAssetId)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.objectEtag, other.objectEtag)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(
                        this.segmentRangeStartIndex, other.segmentRangeStartIndex)
                && java.util.Objects.equals(this.segmentRangeEndIndex, other.segmentRangeEndIndex)
                && java.util.Objects.equals(this.mediaAssetTags, other.mediaAssetTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceMediaWorkflowId == null
                                ? 43
                                : this.sourceMediaWorkflowId.hashCode());
        result =
                (result * PRIME)
                        + (this.mediaWorkflowJobId == null
                                ? 43
                                : this.mediaWorkflowJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceMediaWorkflowVersion == null
                                ? 43
                                : this.sourceMediaWorkflowVersion.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.parentMediaAssetId == null
                                ? 43
                                : this.parentMediaAssetId.hashCode());
        result =
                (result * PRIME)
                        + (this.masterMediaAssetId == null
                                ? 43
                                : this.masterMediaAssetId.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.objectEtag == null ? 43 : this.objectEtag.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.segmentRangeStartIndex == null
                                ? 43
                                : this.segmentRangeStartIndex.hashCode());
        result =
                (result * PRIME)
                        + (this.segmentRangeEndIndex == null
                                ? 43
                                : this.segmentRangeEndIndex.hashCode());
        result =
                (result * PRIME)
                        + (this.mediaAssetTags == null ? 43 : this.mediaAssetTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
