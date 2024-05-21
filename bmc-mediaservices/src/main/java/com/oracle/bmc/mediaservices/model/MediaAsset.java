/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * Represents the metadata associated with an asset that has been either produced by or registered with Media Services.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MediaAsset.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MediaAsset extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "sourceMediaWorkflowId",
        "mediaWorkflowJobId",
        "sourceMediaWorkflowVersion",
        "displayName",
        "timeCreated",
        "lifecycleState",
        "type",
        "parentMediaAssetId",
        "masterMediaAssetId",
        "bucketName",
        "namespaceName",
        "objectName",
        "objectEtag",
        "timeUpdated",
        "segmentRangeStartIndex",
        "segmentRangeEndIndex",
        "metadata",
        "mediaAssetTags",
        "freeformTags",
        "definedTags",
        "systemTags",
        "locks"
    })
    public MediaAsset(
            String id,
            String compartmentId,
            String sourceMediaWorkflowId,
            String mediaWorkflowJobId,
            Long sourceMediaWorkflowVersion,
            String displayName,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            AssetType type,
            String parentMediaAssetId,
            String masterMediaAssetId,
            String bucketName,
            String namespaceName,
            String objectName,
            String objectEtag,
            java.util.Date timeUpdated,
            Long segmentRangeStartIndex,
            Long segmentRangeEndIndex,
            java.util.List<Metadata> metadata,
            java.util.List<MediaAssetTag> mediaAssetTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<ResourceLock> locks) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.sourceMediaWorkflowId = sourceMediaWorkflowId;
        this.mediaWorkflowJobId = mediaWorkflowJobId;
        this.sourceMediaWorkflowVersion = sourceMediaWorkflowVersion;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.type = type;
        this.parentMediaAssetId = parentMediaAssetId;
        this.masterMediaAssetId = masterMediaAssetId;
        this.bucketName = bucketName;
        this.namespaceName = namespaceName;
        this.objectName = objectName;
        this.objectEtag = objectEtag;
        this.timeUpdated = timeUpdated;
        this.segmentRangeStartIndex = segmentRangeStartIndex;
        this.segmentRangeEndIndex = segmentRangeEndIndex;
        this.metadata = metadata;
        this.mediaAssetTags = mediaAssetTags;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.locks = locks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier that is immutable on creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The ID of the compartment containing the MediaAsset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The ID of the compartment containing the MediaAsset.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The ID of the MediaWorkflow used to produce this asset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceMediaWorkflowId")
        private String sourceMediaWorkflowId;

        /**
         * The ID of the MediaWorkflow used to produce this asset.
         * @param sourceMediaWorkflowId the value to set
         * @return this builder
         **/
        public Builder sourceMediaWorkflowId(String sourceMediaWorkflowId) {
            this.sourceMediaWorkflowId = sourceMediaWorkflowId;
            this.__explicitlySet__.add("sourceMediaWorkflowId");
            return this;
        }
        /**
         * The ID of the MediaWorkflowJob used to produce this asset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowJobId")
        private String mediaWorkflowJobId;

        /**
         * The ID of the MediaWorkflowJob used to produce this asset.
         * @param mediaWorkflowJobId the value to set
         * @return this builder
         **/
        public Builder mediaWorkflowJobId(String mediaWorkflowJobId) {
            this.mediaWorkflowJobId = mediaWorkflowJobId;
            this.__explicitlySet__.add("mediaWorkflowJobId");
            return this;
        }
        /**
         * The version of the MediaWorkflow used to produce this asset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceMediaWorkflowVersion")
        private Long sourceMediaWorkflowVersion;

        /**
         * The version of the MediaWorkflow used to produce this asset.
         * @param sourceMediaWorkflowVersion the value to set
         * @return this builder
         **/
        public Builder sourceMediaWorkflowVersion(Long sourceMediaWorkflowVersion) {
            this.sourceMediaWorkflowVersion = sourceMediaWorkflowVersion;
            this.__explicitlySet__.add("sourceMediaWorkflowVersion");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The time when the MediaAsset was created. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when the MediaAsset was created. An RFC3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The current state of the MediaAsset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the MediaAsset.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The type of the media asset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private AssetType type;

        /**
         * The type of the media asset.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(AssetType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The ID of the parent asset from which this asset is derived.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentMediaAssetId")
        private String parentMediaAssetId;

        /**
         * The ID of the parent asset from which this asset is derived.
         * @param parentMediaAssetId the value to set
         * @return this builder
         **/
        public Builder parentMediaAssetId(String parentMediaAssetId) {
            this.parentMediaAssetId = parentMediaAssetId;
            this.__explicitlySet__.add("parentMediaAssetId");
            return this;
        }
        /**
         * The ID of the senior most asset from which this asset is derived.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("masterMediaAssetId")
        private String masterMediaAssetId;

        /**
         * The ID of the senior most asset from which this asset is derived.
         * @param masterMediaAssetId the value to set
         * @return this builder
         **/
        public Builder masterMediaAssetId(String masterMediaAssetId) {
            this.masterMediaAssetId = masterMediaAssetId;
            this.__explicitlySet__.add("masterMediaAssetId");
            return this;
        }
        /**
         * The name of the object storage bucket where this represented asset is located.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The name of the object storage bucket where this represented asset is located.
         * @param bucketName the value to set
         * @return this builder
         **/
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /**
         * The object storage namespace where this asset is located.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * The object storage namespace where this asset is located.
         * @param namespaceName the value to set
         * @return this builder
         **/
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }
        /**
         * The object storage object name that identifies this asset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The object storage object name that identifies this asset.
         * @param objectName the value to set
         * @return this builder
         **/
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /**
         * eTag of the underlying object storage object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectEtag")
        private String objectEtag;

        /**
         * eTag of the underlying object storage object.
         * @param objectEtag the value to set
         * @return this builder
         **/
        public Builder objectEtag(String objectEtag) {
            this.objectEtag = objectEtag;
            this.__explicitlySet__.add("objectEtag");
            return this;
        }
        /**
         * The time when the MediaAsset was updated. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time when the MediaAsset was updated. An RFC3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The start index for video segment files.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("segmentRangeStartIndex")
        private Long segmentRangeStartIndex;

        /**
         * The start index for video segment files.
         * @param segmentRangeStartIndex the value to set
         * @return this builder
         **/
        public Builder segmentRangeStartIndex(Long segmentRangeStartIndex) {
            this.segmentRangeStartIndex = segmentRangeStartIndex;
            this.__explicitlySet__.add("segmentRangeStartIndex");
            return this;
        }
        /**
         * The end index of video segment files.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("segmentRangeEndIndex")
        private Long segmentRangeEndIndex;

        /**
         * The end index of video segment files.
         * @param segmentRangeEndIndex the value to set
         * @return this builder
         **/
        public Builder segmentRangeEndIndex(Long segmentRangeEndIndex) {
            this.segmentRangeEndIndex = segmentRangeEndIndex;
            this.__explicitlySet__.add("segmentRangeEndIndex");
            return this;
        }
        /**
         * List of Metadata.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.List<Metadata> metadata;

        /**
         * List of Metadata.
         * @param metadata the value to set
         * @return this builder
         **/
        public Builder metadata(java.util.List<Metadata> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * List of tags for the MediaAsset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mediaAssetTags")
        private java.util.List<MediaAssetTag> mediaAssetTags;

        /**
         * List of tags for the MediaAsset.
         * @param mediaAssetTags the value to set
         * @return this builder
         **/
        public Builder mediaAssetTags(java.util.List<MediaAssetTag> mediaAssetTags) {
            this.mediaAssetTags = mediaAssetTags;
            this.__explicitlySet__.add("mediaAssetTags");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * Locks associated with this resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         * @param locks the value to set
         * @return this builder
         **/
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MediaAsset build() {
            MediaAsset model =
                    new MediaAsset(
                            this.id,
                            this.compartmentId,
                            this.sourceMediaWorkflowId,
                            this.mediaWorkflowJobId,
                            this.sourceMediaWorkflowVersion,
                            this.displayName,
                            this.timeCreated,
                            this.lifecycleState,
                            this.type,
                            this.parentMediaAssetId,
                            this.masterMediaAssetId,
                            this.bucketName,
                            this.namespaceName,
                            this.objectName,
                            this.objectEtag,
                            this.timeUpdated,
                            this.segmentRangeStartIndex,
                            this.segmentRangeEndIndex,
                            this.metadata,
                            this.mediaAssetTags,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.locks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MediaAsset model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
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
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("segmentRangeStartIndex")) {
                this.segmentRangeStartIndex(model.getSegmentRangeStartIndex());
            }
            if (model.wasPropertyExplicitlySet("segmentRangeEndIndex")) {
                this.segmentRangeEndIndex(model.getSegmentRangeEndIndex());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            return this;
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
     * Unique identifier that is immutable on creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The ID of the compartment containing the MediaAsset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The ID of the compartment containing the MediaAsset.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The ID of the MediaWorkflow used to produce this asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMediaWorkflowId")
    private final String sourceMediaWorkflowId;

    /**
     * The ID of the MediaWorkflow used to produce this asset.
     * @return the value
     **/
    public String getSourceMediaWorkflowId() {
        return sourceMediaWorkflowId;
    }

    /**
     * The ID of the MediaWorkflowJob used to produce this asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowJobId")
    private final String mediaWorkflowJobId;

    /**
     * The ID of the MediaWorkflowJob used to produce this asset.
     * @return the value
     **/
    public String getMediaWorkflowJobId() {
        return mediaWorkflowJobId;
    }

    /**
     * The version of the MediaWorkflow used to produce this asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMediaWorkflowVersion")
    private final Long sourceMediaWorkflowVersion;

    /**
     * The version of the MediaWorkflow used to produce this asset.
     * @return the value
     **/
    public Long getSourceMediaWorkflowVersion() {
        return sourceMediaWorkflowVersion;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The time when the MediaAsset was created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when the MediaAsset was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The current state of the MediaAsset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the MediaAsset.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The type of the media asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final AssetType type;

    /**
     * The type of the media asset.
     * @return the value
     **/
    public AssetType getType() {
        return type;
    }

    /**
     * The ID of the parent asset from which this asset is derived.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentMediaAssetId")
    private final String parentMediaAssetId;

    /**
     * The ID of the parent asset from which this asset is derived.
     * @return the value
     **/
    public String getParentMediaAssetId() {
        return parentMediaAssetId;
    }

    /**
     * The ID of the senior most asset from which this asset is derived.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("masterMediaAssetId")
    private final String masterMediaAssetId;

    /**
     * The ID of the senior most asset from which this asset is derived.
     * @return the value
     **/
    public String getMasterMediaAssetId() {
        return masterMediaAssetId;
    }

    /**
     * The name of the object storage bucket where this represented asset is located.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The name of the object storage bucket where this represented asset is located.
     * @return the value
     **/
    public String getBucketName() {
        return bucketName;
    }

    /**
     * The object storage namespace where this asset is located.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * The object storage namespace where this asset is located.
     * @return the value
     **/
    public String getNamespaceName() {
        return namespaceName;
    }

    /**
     * The object storage object name that identifies this asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The object storage object name that identifies this asset.
     * @return the value
     **/
    public String getObjectName() {
        return objectName;
    }

    /**
     * eTag of the underlying object storage object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectEtag")
    private final String objectEtag;

    /**
     * eTag of the underlying object storage object.
     * @return the value
     **/
    public String getObjectEtag() {
        return objectEtag;
    }

    /**
     * The time when the MediaAsset was updated. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when the MediaAsset was updated. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The start index for video segment files.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("segmentRangeStartIndex")
    private final Long segmentRangeStartIndex;

    /**
     * The start index for video segment files.
     * @return the value
     **/
    public Long getSegmentRangeStartIndex() {
        return segmentRangeStartIndex;
    }

    /**
     * The end index of video segment files.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("segmentRangeEndIndex")
    private final Long segmentRangeEndIndex;

    /**
     * The end index of video segment files.
     * @return the value
     **/
    public Long getSegmentRangeEndIndex() {
        return segmentRangeEndIndex;
    }

    /**
     * List of Metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.List<Metadata> metadata;

    /**
     * List of Metadata.
     * @return the value
     **/
    public java.util.List<Metadata> getMetadata() {
        return metadata;
    }

    /**
     * List of tags for the MediaAsset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mediaAssetTags")
    private final java.util.List<MediaAssetTag> mediaAssetTags;

    /**
     * List of tags for the MediaAsset.
     * @return the value
     **/
    public java.util.List<MediaAssetTag> getMediaAssetTags() {
        return mediaAssetTags;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * Locks associated with this resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     * @return the value
     **/
    public java.util.List<ResourceLock> getLocks() {
        return locks;
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
        sb.append("MediaAsset(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sourceMediaWorkflowId=").append(String.valueOf(this.sourceMediaWorkflowId));
        sb.append(", mediaWorkflowJobId=").append(String.valueOf(this.mediaWorkflowJobId));
        sb.append(", sourceMediaWorkflowVersion=")
                .append(String.valueOf(this.sourceMediaWorkflowVersion));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", parentMediaAssetId=").append(String.valueOf(this.parentMediaAssetId));
        sb.append(", masterMediaAssetId=").append(String.valueOf(this.masterMediaAssetId));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", objectEtag=").append(String.valueOf(this.objectEtag));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", segmentRangeStartIndex=").append(String.valueOf(this.segmentRangeStartIndex));
        sb.append(", segmentRangeEndIndex=").append(String.valueOf(this.segmentRangeEndIndex));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", mediaAssetTags=").append(String.valueOf(this.mediaAssetTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MediaAsset)) {
            return false;
        }

        MediaAsset other = (MediaAsset) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.sourceMediaWorkflowId, other.sourceMediaWorkflowId)
                && java.util.Objects.equals(this.mediaWorkflowJobId, other.mediaWorkflowJobId)
                && java.util.Objects.equals(
                        this.sourceMediaWorkflowVersion, other.sourceMediaWorkflowVersion)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.parentMediaAssetId, other.parentMediaAssetId)
                && java.util.Objects.equals(this.masterMediaAssetId, other.masterMediaAssetId)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.objectEtag, other.objectEtag)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(
                        this.segmentRangeStartIndex, other.segmentRangeStartIndex)
                && java.util.Objects.equals(this.segmentRangeEndIndex, other.segmentRangeEndIndex)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.mediaAssetTags, other.mediaAssetTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.locks, other.locks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
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
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
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
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
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
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.mediaAssetTags == null ? 43 : this.mediaAssetTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
