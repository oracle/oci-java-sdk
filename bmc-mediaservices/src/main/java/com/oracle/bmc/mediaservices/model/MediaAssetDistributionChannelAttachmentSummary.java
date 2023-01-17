/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * Summary of the MediaAssetDistributionChannelAttachment. <br>
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
        builder = MediaAssetDistributionChannelAttachmentSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class MediaAssetDistributionChannelAttachmentSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "mediaAssetId",
        "displayName",
        "distributionChannelId",
        "version",
        "lifecycleState",
        "metadataRef",
        "mediaWorkflowJobId"
    })
    public MediaAssetDistributionChannelAttachmentSummary(
            String mediaAssetId,
            String displayName,
            String distributionChannelId,
            Long version,
            LifecycleState lifecycleState,
            String metadataRef,
            String mediaWorkflowJobId) {
        super();
        this.mediaAssetId = mediaAssetId;
        this.displayName = displayName;
        this.distributionChannelId = distributionChannelId;
        this.version = version;
        this.lifecycleState = lifecycleState;
        this.metadataRef = metadataRef;
        this.mediaWorkflowJobId = mediaWorkflowJobId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of associated media asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("mediaAssetId")
        private String mediaAssetId;

        /**
         * OCID of associated media asset.
         *
         * @param mediaAssetId the value to set
         * @return this builder
         */
        public Builder mediaAssetId(String mediaAssetId) {
            this.mediaAssetId = mediaAssetId;
            this.__explicitlySet__.add("mediaAssetId");
            return this;
        }
        /**
         * Display name for the MediaAssetDistributionChannelAttachment. Does not have to be unique,
         * and it's changeable. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for the MediaAssetDistributionChannelAttachment. Does not have to be unique,
         * and it's changeable. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** OCID of associated Distribution Channel. */
        @com.fasterxml.jackson.annotation.JsonProperty("distributionChannelId")
        private String distributionChannelId;

        /**
         * OCID of associated Distribution Channel.
         *
         * @param distributionChannelId the value to set
         * @return this builder
         */
        public Builder distributionChannelId(String distributionChannelId) {
            this.distributionChannelId = distributionChannelId;
            this.__explicitlySet__.add("distributionChannelId");
            return this;
        }
        /** Version number of the attachment. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Long version;

        /**
         * Version number of the attachment.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(Long version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** Lifecycle state of the attachment. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Lifecycle state of the attachment.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The identifier for the metadata. */
        @com.fasterxml.jackson.annotation.JsonProperty("metadataRef")
        private String metadataRef;

        /**
         * The identifier for the metadata.
         *
         * @param metadataRef the value to set
         * @return this builder
         */
        public Builder metadataRef(String metadataRef) {
            this.metadataRef = metadataRef;
            this.__explicitlySet__.add("metadataRef");
            return this;
        }
        /** The ingest MediaWorkflowJob ID that created this attachment. */
        @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowJobId")
        private String mediaWorkflowJobId;

        /**
         * The ingest MediaWorkflowJob ID that created this attachment.
         *
         * @param mediaWorkflowJobId the value to set
         * @return this builder
         */
        public Builder mediaWorkflowJobId(String mediaWorkflowJobId) {
            this.mediaWorkflowJobId = mediaWorkflowJobId;
            this.__explicitlySet__.add("mediaWorkflowJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MediaAssetDistributionChannelAttachmentSummary build() {
            MediaAssetDistributionChannelAttachmentSummary model =
                    new MediaAssetDistributionChannelAttachmentSummary(
                            this.mediaAssetId,
                            this.displayName,
                            this.distributionChannelId,
                            this.version,
                            this.lifecycleState,
                            this.metadataRef,
                            this.mediaWorkflowJobId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MediaAssetDistributionChannelAttachmentSummary model) {
            if (model.wasPropertyExplicitlySet("mediaAssetId")) {
                this.mediaAssetId(model.getMediaAssetId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("distributionChannelId")) {
                this.distributionChannelId(model.getDistributionChannelId());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("metadataRef")) {
                this.metadataRef(model.getMetadataRef());
            }
            if (model.wasPropertyExplicitlySet("mediaWorkflowJobId")) {
                this.mediaWorkflowJobId(model.getMediaWorkflowJobId());
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

    /** OCID of associated media asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("mediaAssetId")
    private final String mediaAssetId;

    /**
     * OCID of associated media asset.
     *
     * @return the value
     */
    public String getMediaAssetId() {
        return mediaAssetId;
    }

    /**
     * Display name for the MediaAssetDistributionChannelAttachment. Does not have to be unique, and
     * it's changeable. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for the MediaAssetDistributionChannelAttachment. Does not have to be unique, and
     * it's changeable. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** OCID of associated Distribution Channel. */
    @com.fasterxml.jackson.annotation.JsonProperty("distributionChannelId")
    private final String distributionChannelId;

    /**
     * OCID of associated Distribution Channel.
     *
     * @return the value
     */
    public String getDistributionChannelId() {
        return distributionChannelId;
    }

    /** Version number of the attachment. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Long version;

    /**
     * Version number of the attachment.
     *
     * @return the value
     */
    public Long getVersion() {
        return version;
    }

    /** Lifecycle state of the attachment. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        NeedsAttention("NEEDS_ATTENTION"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Lifecycle state of the attachment. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Lifecycle state of the attachment.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The identifier for the metadata. */
    @com.fasterxml.jackson.annotation.JsonProperty("metadataRef")
    private final String metadataRef;

    /**
     * The identifier for the metadata.
     *
     * @return the value
     */
    public String getMetadataRef() {
        return metadataRef;
    }

    /** The ingest MediaWorkflowJob ID that created this attachment. */
    @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowJobId")
    private final String mediaWorkflowJobId;

    /**
     * The ingest MediaWorkflowJob ID that created this attachment.
     *
     * @return the value
     */
    public String getMediaWorkflowJobId() {
        return mediaWorkflowJobId;
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
        sb.append("MediaAssetDistributionChannelAttachmentSummary(");
        sb.append("super=").append(super.toString());
        sb.append("mediaAssetId=").append(String.valueOf(this.mediaAssetId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", distributionChannelId=").append(String.valueOf(this.distributionChannelId));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", metadataRef=").append(String.valueOf(this.metadataRef));
        sb.append(", mediaWorkflowJobId=").append(String.valueOf(this.mediaWorkflowJobId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MediaAssetDistributionChannelAttachmentSummary)) {
            return false;
        }

        MediaAssetDistributionChannelAttachmentSummary other =
                (MediaAssetDistributionChannelAttachmentSummary) o;
        return java.util.Objects.equals(this.mediaAssetId, other.mediaAssetId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.distributionChannelId, other.distributionChannelId)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.metadataRef, other.metadataRef)
                && java.util.Objects.equals(this.mediaWorkflowJobId, other.mediaWorkflowJobId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mediaAssetId == null ? 43 : this.mediaAssetId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.distributionChannelId == null
                                ? 43
                                : this.distributionChannelId.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.metadataRef == null ? 43 : this.metadataRef.hashCode());
        result =
                (result * PRIME)
                        + (this.mediaWorkflowJobId == null
                                ? 43
                                : this.mediaWorkflowJobId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
