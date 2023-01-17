/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * Asset Metadata entry information.
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
    builder = AssetMetadataEntryDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "ingestPayloadType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AssetMetadataEntryDetails extends IngestStreamDistributionChannelDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Media Asset ID to ingest into the Distribution Channel.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mediaAssetId")
        private String mediaAssetId;

        /**
         * The Media Asset ID to ingest into the Distribution Channel.
         * @param mediaAssetId the value to set
         * @return this builder
         **/
        public Builder mediaAssetId(String mediaAssetId) {
            this.mediaAssetId = mediaAssetId;
            this.__explicitlySet__.add("mediaAssetId");
            return this;
        }
        /**
         * The compartment ID where the Ingest Workflow Job will be run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment ID where the Ingest Workflow Job will be run.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssetMetadataEntryDetails build() {
            AssetMetadataEntryDetails model =
                    new AssetMetadataEntryDetails(this.mediaAssetId, this.compartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssetMetadataEntryDetails model) {
            if (model.wasPropertyExplicitlySet("mediaAssetId")) {
                this.mediaAssetId(model.getMediaAssetId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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

    @Deprecated
    public AssetMetadataEntryDetails(String mediaAssetId, String compartmentId) {
        super();
        this.mediaAssetId = mediaAssetId;
        this.compartmentId = compartmentId;
    }

    /**
     * The Media Asset ID to ingest into the Distribution Channel.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mediaAssetId")
    private final String mediaAssetId;

    /**
     * The Media Asset ID to ingest into the Distribution Channel.
     * @return the value
     **/
    public String getMediaAssetId() {
        return mediaAssetId;
    }

    /**
     * The compartment ID where the Ingest Workflow Job will be run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment ID where the Ingest Workflow Job will be run.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
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
        sb.append("AssetMetadataEntryDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", mediaAssetId=").append(String.valueOf(this.mediaAssetId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssetMetadataEntryDetails)) {
            return false;
        }

        AssetMetadataEntryDetails other = (AssetMetadataEntryDetails) o;
        return java.util.Objects.equals(this.mediaAssetId, other.mediaAssetId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.mediaAssetId == null ? 43 : this.mediaAssetId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        return result;
    }
}
