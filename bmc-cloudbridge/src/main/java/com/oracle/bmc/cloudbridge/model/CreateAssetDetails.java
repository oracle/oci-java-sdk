/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * The information about the new asset. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "assetType",
        defaultImpl = CreateAssetDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateAwsEbsAssetDetails.class,
            name = "AWS_EBS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateVmwareVmAssetDetails.class,
            name = "VMWARE_VM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateAwsEc2AssetDetails.class,
            name = "AWS_EC2")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CreateAssetDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "inventoryId",
        "compartmentId",
        "sourceKey",
        "externalAssetKey",
        "assetSourceIds",
        "freeformTags",
        "definedTags"
    })
    protected CreateAssetDetails(
            String displayName,
            String inventoryId,
            String compartmentId,
            String sourceKey,
            String externalAssetKey,
            java.util.List<String> assetSourceIds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.inventoryId = inventoryId;
        this.compartmentId = compartmentId;
        this.sourceKey = sourceKey;
        this.externalAssetKey = externalAssetKey;
        this.assetSourceIds = assetSourceIds;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
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

    /** Inventory ID to which an asset belongs. */
    @com.fasterxml.jackson.annotation.JsonProperty("inventoryId")
    private final String inventoryId;

    /**
     * Inventory ID to which an asset belongs.
     *
     * @return the value
     */
    public String getInventoryId() {
        return inventoryId;
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

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace/scope. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace/scope. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to
     * namespaces. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("CreateAssetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", inventoryId=").append(String.valueOf(this.inventoryId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sourceKey=").append(String.valueOf(this.sourceKey));
        sb.append(", externalAssetKey=").append(String.valueOf(this.externalAssetKey));
        sb.append(", assetSourceIds=").append(String.valueOf(this.assetSourceIds));
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
        if (!(o instanceof CreateAssetDetails)) {
            return false;
        }

        CreateAssetDetails other = (CreateAssetDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.inventoryId, other.inventoryId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.sourceKey, other.sourceKey)
                && java.util.Objects.equals(this.externalAssetKey, other.externalAssetKey)
                && java.util.Objects.equals(this.assetSourceIds, other.assetSourceIds)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.inventoryId == null ? 43 : this.inventoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.sourceKey == null ? 43 : this.sourceKey.hashCode());
        result =
                (result * PRIME)
                        + (this.externalAssetKey == null ? 43 : this.externalAssetKey.hashCode());
        result =
                (result * PRIME)
                        + (this.assetSourceIds == null ? 43 : this.assetSourceIds.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
