/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Details for importing assets from a file. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImportInventoryViaAssetsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "resourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ImportInventoryViaAssetsDetails extends ImportInventoryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** The file body to be sent in the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private byte[] data;

        /**
         * The file body to be sent in the request.
         *
         * @param data the value to set
         * @return this builder
         */
        public Builder data(byte[] data) {
            this.data = data;
            this.__explicitlySet__.add("data");
            return this;
        }
        /** The type of asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("assetType")
        private AssetType assetType;

        /**
         * The type of asset.
         *
         * @param assetType the value to set
         * @return this builder
         */
        public Builder assetType(AssetType assetType) {
            this.assetType = assetType;
            this.__explicitlySet__.add("assetType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportInventoryViaAssetsDetails build() {
            ImportInventoryViaAssetsDetails model =
                    new ImportInventoryViaAssetsDetails(
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.data,
                            this.assetType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportInventoryViaAssetsDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("data")) {
                this.data(model.getData());
            }
            if (model.wasPropertyExplicitlySet("assetType")) {
                this.assetType(model.getAssetType());
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

    @Deprecated
    public ImportInventoryViaAssetsDetails(
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            byte[] data,
            AssetType assetType) {
        super(compartmentId, freeformTags, definedTags);
        this.data = data;
        this.assetType = assetType;
    }

    /** The file body to be sent in the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final byte[] data;

    /**
     * The file body to be sent in the request.
     *
     * @return the value
     */
    public byte[] getData() {
        return data;
    }

    /** The type of asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("assetType")
    private final AssetType assetType;

    /**
     * The type of asset.
     *
     * @return the value
     */
    public AssetType getAssetType() {
        return assetType;
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
        sb.append("ImportInventoryViaAssetsDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", data=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.data)
                                : (String.valueOf(this.data)
                                        + (this.data != null
                                                ? " (byte[" + this.data.length + "])"
                                                : ""))));
        sb.append(", assetType=").append(String.valueOf(this.assetType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportInventoryViaAssetsDetails)) {
            return false;
        }

        ImportInventoryViaAssetsDetails other = (ImportInventoryViaAssetsDetails) o;
        return java.util.Arrays.equals(this.data, other.data)
                && java.util.Objects.equals(this.assetType, other.assetType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + java.util.Arrays.hashCode(this.data);
        result = (result * PRIME) + (this.assetType == null ? 43 : this.assetType.hashCode());
        return result;
    }
}
