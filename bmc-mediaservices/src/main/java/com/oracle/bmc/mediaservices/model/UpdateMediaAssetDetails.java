/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * The information to be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateMediaAssetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateMediaAssetDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "type",
        "parentMediaAssetId",
        "masterMediaAssetId",
        "metadata",
        "mediaAssetTags",
        "freeformTags",
        "definedTags"
    })
    public UpdateMediaAssetDetails(
            String displayName,
            AssetType type,
            String parentMediaAssetId,
            String masterMediaAssetId,
            java.util.List<Metadata> metadata,
            java.util.List<MediaAssetTag> mediaAssetTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.type = type;
        this.parentMediaAssetId = parentMediaAssetId;
        this.masterMediaAssetId = masterMediaAssetId;
        this.metadata = metadata;
        this.mediaAssetTags = mediaAssetTags;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Display name for the Media Asset. Does not have to be unique. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for the Media Asset. Does not have to be unique. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMediaAssetDetails build() {
            UpdateMediaAssetDetails __instance__ =
                    new UpdateMediaAssetDetails(
                            displayName,
                            type,
                            parentMediaAssetId,
                            masterMediaAssetId,
                            metadata,
                            mediaAssetTags,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMediaAssetDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .type(o.getType())
                            .parentMediaAssetId(o.getParentMediaAssetId())
                            .masterMediaAssetId(o.getMasterMediaAssetId())
                            .metadata(o.getMetadata())
                            .mediaAssetTags(o.getMediaAssetTags())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * Display name for the Media Asset. Does not have to be unique. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for the Media Asset. Does not have to be unique. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
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
        sb.append("UpdateMediaAssetDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", parentMediaAssetId=").append(String.valueOf(this.parentMediaAssetId));
        sb.append(", masterMediaAssetId=").append(String.valueOf(this.masterMediaAssetId));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", mediaAssetTags=").append(String.valueOf(this.mediaAssetTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMediaAssetDetails)) {
            return false;
        }

        UpdateMediaAssetDetails other = (UpdateMediaAssetDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.parentMediaAssetId, other.parentMediaAssetId)
                && java.util.Objects.equals(this.masterMediaAssetId, other.masterMediaAssetId)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.mediaAssetTags, other.mediaAssetTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
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
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.mediaAssetTags == null ? 43 : this.mediaAssetTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
