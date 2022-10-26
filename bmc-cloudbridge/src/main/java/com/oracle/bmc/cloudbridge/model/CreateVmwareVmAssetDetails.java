/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Create VMware VM type of asset. <br>
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
        builder = CreateVmwareVmAssetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "assetType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateVmwareVmAssetDetails extends CreateAssetDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("compute")
        private ComputeProperties compute;

        public Builder compute(ComputeProperties compute) {
            this.compute = compute;
            this.__explicitlySet__.add("compute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vm")
        private VmProperties vm;

        public Builder vm(VmProperties vm) {
            this.vm = vm;
            this.__explicitlySet__.add("vm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vmwareVm")
        private VmwareVmProperties vmwareVm;

        public Builder vmwareVm(VmwareVmProperties vmwareVm) {
            this.vmwareVm = vmwareVm;
            this.__explicitlySet__.add("vmwareVm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vmwareVCenter")
        private VmwareVCenterProperties vmwareVCenter;

        public Builder vmwareVCenter(VmwareVCenterProperties vmwareVCenter) {
            this.vmwareVCenter = vmwareVCenter;
            this.__explicitlySet__.add("vmwareVCenter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVmwareVmAssetDetails build() {
            CreateVmwareVmAssetDetails model =
                    new CreateVmwareVmAssetDetails(
                            this.displayName,
                            this.inventoryId,
                            this.compartmentId,
                            this.sourceKey,
                            this.externalAssetKey,
                            this.assetSourceIds,
                            this.freeformTags,
                            this.definedTags,
                            this.compute,
                            this.vm,
                            this.vmwareVm,
                            this.vmwareVCenter);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVmwareVmAssetDetails model) {
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
            if (model.wasPropertyExplicitlySet("compute")) {
                this.compute(model.getCompute());
            }
            if (model.wasPropertyExplicitlySet("vm")) {
                this.vm(model.getVm());
            }
            if (model.wasPropertyExplicitlySet("vmwareVm")) {
                this.vmwareVm(model.getVmwareVm());
            }
            if (model.wasPropertyExplicitlySet("vmwareVCenter")) {
                this.vmwareVCenter(model.getVmwareVCenter());
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
    public CreateVmwareVmAssetDetails(
            String displayName,
            String inventoryId,
            String compartmentId,
            String sourceKey,
            String externalAssetKey,
            java.util.List<String> assetSourceIds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            ComputeProperties compute,
            VmProperties vm,
            VmwareVmProperties vmwareVm,
            VmwareVCenterProperties vmwareVCenter) {
        super(
                displayName,
                inventoryId,
                compartmentId,
                sourceKey,
                externalAssetKey,
                assetSourceIds,
                freeformTags,
                definedTags);
        this.compute = compute;
        this.vm = vm;
        this.vmwareVm = vmwareVm;
        this.vmwareVCenter = vmwareVCenter;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("compute")
    private final ComputeProperties compute;

    public ComputeProperties getCompute() {
        return compute;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vm")
    private final VmProperties vm;

    public VmProperties getVm() {
        return vm;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vmwareVm")
    private final VmwareVmProperties vmwareVm;

    public VmwareVmProperties getVmwareVm() {
        return vmwareVm;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vmwareVCenter")
    private final VmwareVCenterProperties vmwareVCenter;

    public VmwareVCenterProperties getVmwareVCenter() {
        return vmwareVCenter;
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
        sb.append("CreateVmwareVmAssetDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", compute=").append(String.valueOf(this.compute));
        sb.append(", vm=").append(String.valueOf(this.vm));
        sb.append(", vmwareVm=").append(String.valueOf(this.vmwareVm));
        sb.append(", vmwareVCenter=").append(String.valueOf(this.vmwareVCenter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVmwareVmAssetDetails)) {
            return false;
        }

        CreateVmwareVmAssetDetails other = (CreateVmwareVmAssetDetails) o;
        return java.util.Objects.equals(this.compute, other.compute)
                && java.util.Objects.equals(this.vm, other.vm)
                && java.util.Objects.equals(this.vmwareVm, other.vmwareVm)
                && java.util.Objects.equals(this.vmwareVCenter, other.vmwareVCenter)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.compute == null ? 43 : this.compute.hashCode());
        result = (result * PRIME) + (this.vm == null ? 43 : this.vm.hashCode());
        result = (result * PRIME) + (this.vmwareVm == null ? 43 : this.vmwareVm.hashCode());
        result =
                (result * PRIME)
                        + (this.vmwareVCenter == null ? 43 : this.vmwareVCenter.hashCode());
        return result;
    }
}
