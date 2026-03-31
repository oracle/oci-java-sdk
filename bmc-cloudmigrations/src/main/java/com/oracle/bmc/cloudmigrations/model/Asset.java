/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Description of an asset. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "assetType",
        defaultImpl = Asset.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AwsEc2Asset.class,
            name = "AWS_EC2"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VmwareVmAsset.class,
            name = "VMWARE_VM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AwsEbsAsset.class,
            name = "AWS_EBS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = VmAsset.class, name = "VM")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class Asset extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "inventoryId",
        "id",
        "compartmentId",
        "sourceKey",
        "externalAssetKey",
        "timeCreated",
        "timeUpdated",
        "assetSourceIds",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags",
        "environmentType"
    })
    protected Asset(
            String displayName,
            String inventoryId,
            String id,
            String compartmentId,
            String sourceKey,
            String externalAssetKey,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.List<String> assetSourceIds,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            EnvironmentType environmentType) {
        super();
        this.displayName = displayName;
        this.inventoryId = inventoryId;
        this.id = id;
        this.compartmentId = compartmentId;
        this.sourceKey = sourceKey;
        this.externalAssetKey = externalAssetKey;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.assetSourceIds = assetSourceIds;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.environmentType = environmentType;
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

    /** Inventory ID to which an asset belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("inventoryId")
    private final String inventoryId;

    /**
     * Inventory ID to which an asset belongs to.
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

    /** The OCID of the compartment to which an asset belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment to which an asset belongs to.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The source key that the asset belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceKey")
    private final String sourceKey;

    /**
     * The source key that the asset belongs to.
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
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Deleted("DELETED"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };
    /** The current state of the asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the asset.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. It exists
     * only for cross-compatibility. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. It exists
     * only for cross-compatibility. Example: {@code {"bar-key": "value"}}
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

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * Specifies if this is the Source or Destination point for migration - different assets may be
     * discovered depending on setting.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentType")
    private final EnvironmentType environmentType;

    /**
     * Specifies if this is the Source or Destination point for migration - different assets may be
     * discovered depending on setting.
     *
     * @return the value
     */
    public EnvironmentType getEnvironmentType() {
        return environmentType;
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
        sb.append("Asset(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", inventoryId=").append(String.valueOf(this.inventoryId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sourceKey=").append(String.valueOf(this.sourceKey));
        sb.append(", externalAssetKey=").append(String.valueOf(this.externalAssetKey));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", assetSourceIds=").append(String.valueOf(this.assetSourceIds));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", environmentType=").append(String.valueOf(this.environmentType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Asset)) {
            return false;
        }

        Asset other = (Asset) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.inventoryId, other.inventoryId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.sourceKey, other.sourceKey)
                && java.util.Objects.equals(this.externalAssetKey, other.externalAssetKey)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.assetSourceIds, other.assetSourceIds)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.environmentType, other.environmentType)
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
        result =
                (result * PRIME)
                        + (this.environmentType == null ? 43 : this.environmentType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
