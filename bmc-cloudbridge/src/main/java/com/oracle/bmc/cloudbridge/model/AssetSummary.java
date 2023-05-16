/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Summary of the asset. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AssetSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AssetSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "inventoryId",
        "id",
        "compartmentId",
        "sourceKey",
        "externalAssetKey",
        "assetType",
        "timeCreated",
        "timeUpdated",
        "assetSourceIds",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public AssetSummary(
            String displayName,
            String inventoryId,
            String id,
            String compartmentId,
            String sourceKey,
            String externalAssetKey,
            AssetType assetType,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.List<String> assetSourceIds,
            Asset.LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.displayName = displayName;
        this.inventoryId = inventoryId;
        this.id = id;
        this.compartmentId = compartmentId;
        this.sourceKey = sourceKey;
        this.externalAssetKey = externalAssetKey;
        this.assetType = assetType;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.assetSourceIds = assetSourceIds;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Asset display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Asset display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Inventory ID that the asset belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("inventoryId")
        private String inventoryId;

        /**
         * Inventory ID that the asset belongs to.
         *
         * @param inventoryId the value to set
         * @return this builder
         */
        public Builder inventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
            this.__explicitlySet__.add("inventoryId");
            return this;
        }
        /** Asset OCID that is immutable on creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Asset OCID that is immutable on creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment that the asset belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that the asset belongs to.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The source key to which the asset belongs. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceKey")
        private String sourceKey;

        /**
         * The source key to which the asset belongs.
         *
         * @param sourceKey the value to set
         * @return this builder
         */
        public Builder sourceKey(String sourceKey) {
            this.sourceKey = sourceKey;
            this.__explicitlySet__.add("sourceKey");
            return this;
        }
        /** The key of the asset from the external environment. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalAssetKey")
        private String externalAssetKey;

        /**
         * The key of the asset from the external environment.
         *
         * @param externalAssetKey the value to set
         * @return this builder
         */
        public Builder externalAssetKey(String externalAssetKey) {
            this.externalAssetKey = externalAssetKey;
            this.__explicitlySet__.add("externalAssetKey");
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
        /** The time when the asset was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when the asset was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time when the asset was updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time when the asset was updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** List of asset source OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("assetSourceIds")
        private java.util.List<String> assetSourceIds;

        /**
         * List of asset source OCID.
         *
         * @param assetSourceIds the value to set
         * @return this builder
         */
        public Builder assetSourceIds(java.util.List<String> assetSourceIds) {
            this.assetSourceIds = assetSourceIds;
            this.__explicitlySet__.add("assetSourceIds");
            return this;
        }
        /** The current state of the asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Asset.LifecycleState lifecycleState;

        /**
         * The current state of the asset.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(Asset.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The freeform tags associated with this resource, if any. Each tag is a simple key-value
         * pair with no predefined name, type, or namespace/scope. For more information, see
         * [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * The freeform tags associated with this resource, if any. Each tag is a simple key-value
         * pair with no predefined name, type, or namespace/scope. For more information, see
         * [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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
         * The defined tags associated with this resource, if any. Each key is predefined and scoped
         * to namespaces. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * The defined tags associated with this resource, if any. Each key is predefined and scoped
         * to namespaces. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssetSummary build() {
            AssetSummary model =
                    new AssetSummary(
                            this.displayName,
                            this.inventoryId,
                            this.id,
                            this.compartmentId,
                            this.sourceKey,
                            this.externalAssetKey,
                            this.assetType,
                            this.timeCreated,
                            this.timeUpdated,
                            this.assetSourceIds,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssetSummary model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("inventoryId")) {
                this.inventoryId(model.getInventoryId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
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
            if (model.wasPropertyExplicitlySet("assetType")) {
                this.assetType(model.getAssetType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("assetSourceIds")) {
                this.assetSourceIds(model.getAssetSourceIds());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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

    /** Asset display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Asset display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Inventory ID that the asset belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("inventoryId")
    private final String inventoryId;

    /**
     * Inventory ID that the asset belongs to.
     *
     * @return the value
     */
    public String getInventoryId() {
        return inventoryId;
    }

    /** Asset OCID that is immutable on creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Asset OCID that is immutable on creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment that the asset belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that the asset belongs to.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The source key to which the asset belongs. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceKey")
    private final String sourceKey;

    /**
     * The source key to which the asset belongs.
     *
     * @return the value
     */
    public String getSourceKey() {
        return sourceKey;
    }

    /** The key of the asset from the external environment. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalAssetKey")
    private final String externalAssetKey;

    /**
     * The key of the asset from the external environment.
     *
     * @return the value
     */
    public String getExternalAssetKey() {
        return externalAssetKey;
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

    /** The time when the asset was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when the asset was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time when the asset was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when the asset was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** List of asset source OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("assetSourceIds")
    private final java.util.List<String> assetSourceIds;

    /**
     * List of asset source OCID.
     *
     * @return the value
     */
    public java.util.List<String> getAssetSourceIds() {
        return assetSourceIds;
    }

    /** The current state of the asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Asset.LifecycleState lifecycleState;

    /**
     * The current state of the asset.
     *
     * @return the value
     */
    public Asset.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace/scope. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace/scope. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to
     * namespaces. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to
     * namespaces. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {orcl-cloud: {free-tier-retain: true}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("AssetSummary(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", inventoryId=").append(String.valueOf(this.inventoryId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sourceKey=").append(String.valueOf(this.sourceKey));
        sb.append(", externalAssetKey=").append(String.valueOf(this.externalAssetKey));
        sb.append(", assetType=").append(String.valueOf(this.assetType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", assetSourceIds=").append(String.valueOf(this.assetSourceIds));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssetSummary)) {
            return false;
        }

        AssetSummary other = (AssetSummary) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.inventoryId, other.inventoryId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.sourceKey, other.sourceKey)
                && java.util.Objects.equals(this.externalAssetKey, other.externalAssetKey)
                && java.util.Objects.equals(this.assetType, other.assetType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.assetSourceIds, other.assetSourceIds)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.inventoryId == null ? 43 : this.inventoryId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.sourceKey == null ? 43 : this.sourceKey.hashCode());
        result =
                (result * PRIME)
                        + (this.externalAssetKey == null ? 43 : this.externalAssetKey.hashCode());
        result = (result * PRIME) + (this.assetType == null ? 43 : this.assetType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.assetSourceIds == null ? 43 : this.assetSourceIds.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
