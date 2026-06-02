/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Create a JSON formatted type of asset.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateInventoryAssetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "assetType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateInventoryAssetDetails extends CreateAssetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inventoryId")
        private String inventoryId;

        public Builder inventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
            this.__explicitlySet__.add("inventoryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceKey")
        private String sourceKey;

        public Builder sourceKey(String sourceKey) {
            this.sourceKey = sourceKey;
            this.__explicitlySet__.add("sourceKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalAssetKey")
        private String externalAssetKey;

        public Builder externalAssetKey(String externalAssetKey) {
            this.externalAssetKey = externalAssetKey;
            this.__explicitlySet__.add("externalAssetKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("assetSourceIds")
        private java.util.List<String> assetSourceIds;

        public Builder assetSourceIds(java.util.List<String> assetSourceIds) {
            this.assetSourceIds = assetSourceIds;
            this.__explicitlySet__.add("assetSourceIds");
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
        /**
         * The class name of the asset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assetClassName")
        private String assetClassName;

        /**
         * The class name of the asset.
         * @param assetClassName the value to set
         * @return this builder
         **/
        public Builder assetClassName(String assetClassName) {
            this.assetClassName = assetClassName;
            this.__explicitlySet__.add("assetClassName");
            return this;
        }
        /**
         * The version of the asset class.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assetClassVersion")
        private String assetClassVersion;

        /**
         * The version of the asset class.
         * @param assetClassVersion the value to set
         * @return this builder
         **/
        public Builder assetClassVersion(String assetClassVersion) {
            this.assetClassVersion = assetClassVersion;
            this.__explicitlySet__.add("assetClassVersion");
            return this;
        }
        /**
         * The details of the asset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assetDetails")
        private java.util.Map<String, Object> assetDetails;

        /**
         * The details of the asset.
         * @param assetDetails the value to set
         * @return this builder
         **/
        public Builder assetDetails(java.util.Map<String, Object> assetDetails) {
            this.assetDetails = assetDetails;
            this.__explicitlySet__.add("assetDetails");
            return this;
        }
        /**
         * Specifies if this is the Source or Destination point for migration - different assets may be discovered depending on setting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("environmentType")
        private EnvironmentType environmentType;

        /**
         * Specifies if this is the Source or Destination point for migration - different assets may be discovered depending on setting.
         * @param environmentType the value to set
         * @return this builder
         **/
        public Builder environmentType(EnvironmentType environmentType) {
            this.environmentType = environmentType;
            this.__explicitlySet__.add("environmentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateInventoryAssetDetails build() {
            CreateInventoryAssetDetails model =
                    new CreateInventoryAssetDetails(
                            this.displayName,
                            this.inventoryId,
                            this.compartmentId,
                            this.sourceKey,
                            this.externalAssetKey,
                            this.assetSourceIds,
                            this.freeformTags,
                            this.definedTags,
                            this.assetClassName,
                            this.assetClassVersion,
                            this.assetDetails,
                            this.environmentType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateInventoryAssetDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("inventoryId")) {
                this.inventoryId(model.getInventoryId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("sourceKey")) {
                this.sourceKey(model.getSourceKey());
            }
            if (model.wasPropertyExplicitlySet("externalAssetKey")) {
                this.externalAssetKey(model.getExternalAssetKey());
            }
            if (model.wasPropertyExplicitlySet("assetSourceIds")) {
                this.assetSourceIds(model.getAssetSourceIds());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("assetClassName")) {
                this.assetClassName(model.getAssetClassName());
            }
            if (model.wasPropertyExplicitlySet("assetClassVersion")) {
                this.assetClassVersion(model.getAssetClassVersion());
            }
            if (model.wasPropertyExplicitlySet("assetDetails")) {
                this.assetDetails(model.getAssetDetails());
            }
            if (model.wasPropertyExplicitlySet("environmentType")) {
                this.environmentType(model.getEnvironmentType());
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
    public CreateInventoryAssetDetails(
            String displayName,
            String inventoryId,
            String compartmentId,
            String sourceKey,
            String externalAssetKey,
            java.util.List<String> assetSourceIds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String assetClassName,
            String assetClassVersion,
            java.util.Map<String, Object> assetDetails,
            EnvironmentType environmentType) {
        super(
                displayName,
                inventoryId,
                compartmentId,
                sourceKey,
                externalAssetKey,
                assetSourceIds,
                freeformTags,
                definedTags);
        this.assetClassName = assetClassName;
        this.assetClassVersion = assetClassVersion;
        this.assetDetails = assetDetails;
        this.environmentType = environmentType;
    }

    /**
     * The class name of the asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assetClassName")
    private final String assetClassName;

    /**
     * The class name of the asset.
     * @return the value
     **/
    public String getAssetClassName() {
        return assetClassName;
    }

    /**
     * The version of the asset class.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assetClassVersion")
    private final String assetClassVersion;

    /**
     * The version of the asset class.
     * @return the value
     **/
    public String getAssetClassVersion() {
        return assetClassVersion;
    }

    /**
     * The details of the asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assetDetails")
    private final java.util.Map<String, Object> assetDetails;

    /**
     * The details of the asset.
     * @return the value
     **/
    public java.util.Map<String, Object> getAssetDetails() {
        return assetDetails;
    }

    /**
     * Specifies if this is the Source or Destination point for migration - different assets may be discovered depending on setting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("environmentType")
    private final EnvironmentType environmentType;

    /**
     * Specifies if this is the Source or Destination point for migration - different assets may be discovered depending on setting.
     * @return the value
     **/
    public EnvironmentType getEnvironmentType() {
        return environmentType;
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
        sb.append("CreateInventoryAssetDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", assetClassName=").append(String.valueOf(this.assetClassName));
        sb.append(", assetClassVersion=").append(String.valueOf(this.assetClassVersion));
        sb.append(", assetDetails=").append(String.valueOf(this.assetDetails));
        sb.append(", environmentType=").append(String.valueOf(this.environmentType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateInventoryAssetDetails)) {
            return false;
        }

        CreateInventoryAssetDetails other = (CreateInventoryAssetDetails) o;
        return java.util.Objects.equals(this.assetClassName, other.assetClassName)
                && java.util.Objects.equals(this.assetClassVersion, other.assetClassVersion)
                && java.util.Objects.equals(this.assetDetails, other.assetDetails)
                && java.util.Objects.equals(this.environmentType, other.environmentType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.assetClassName == null ? 43 : this.assetClassName.hashCode());
        result =
                (result * PRIME)
                        + (this.assetClassVersion == null ? 43 : this.assetClassVersion.hashCode());
        result = (result * PRIME) + (this.assetDetails == null ? 43 : this.assetDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentType == null ? 43 : this.environmentType.hashCode());
        return result;
    }
}
