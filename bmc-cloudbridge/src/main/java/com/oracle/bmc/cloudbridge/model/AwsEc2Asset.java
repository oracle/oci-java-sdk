/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * AWS EC2 type of asset. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AwsEc2Asset.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "assetType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AwsEc2Asset extends Asset {
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

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("assetSourceIds")
        private java.util.List<String> assetSourceIds;

        public Builder assetSourceIds(java.util.List<String> assetSourceIds) {
            this.assetSourceIds = assetSourceIds;
            this.__explicitlySet__.add("assetSourceIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
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

        @com.fasterxml.jackson.annotation.JsonProperty("awsEc2")
        private AwsEc2Properties awsEc2;

        public Builder awsEc2(AwsEc2Properties awsEc2) {
            this.awsEc2 = awsEc2;
            this.__explicitlySet__.add("awsEc2");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("awsEc2Cost")
        private MonthlyCostSummary awsEc2Cost;

        public Builder awsEc2Cost(MonthlyCostSummary awsEc2Cost) {
            this.awsEc2Cost = awsEc2Cost;
            this.__explicitlySet__.add("awsEc2Cost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attachedEbsVolumesCost")
        private MonthlyCostSummary attachedEbsVolumesCost;

        public Builder attachedEbsVolumesCost(MonthlyCostSummary attachedEbsVolumesCost) {
            this.attachedEbsVolumesCost = attachedEbsVolumesCost;
            this.__explicitlySet__.add("attachedEbsVolumesCost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwsEc2Asset build() {
            AwsEc2Asset model =
                    new AwsEc2Asset(
                            this.displayName,
                            this.inventoryId,
                            this.id,
                            this.compartmentId,
                            this.sourceKey,
                            this.externalAssetKey,
                            this.timeCreated,
                            this.timeUpdated,
                            this.assetSourceIds,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.compute,
                            this.vm,
                            this.awsEc2,
                            this.awsEc2Cost,
                            this.attachedEbsVolumesCost);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwsEc2Asset model) {
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
            if (model.wasPropertyExplicitlySet("compute")) {
                this.compute(model.getCompute());
            }
            if (model.wasPropertyExplicitlySet("vm")) {
                this.vm(model.getVm());
            }
            if (model.wasPropertyExplicitlySet("awsEc2")) {
                this.awsEc2(model.getAwsEc2());
            }
            if (model.wasPropertyExplicitlySet("awsEc2Cost")) {
                this.awsEc2Cost(model.getAwsEc2Cost());
            }
            if (model.wasPropertyExplicitlySet("attachedEbsVolumesCost")) {
                this.attachedEbsVolumesCost(model.getAttachedEbsVolumesCost());
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
    public AwsEc2Asset(
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
            ComputeProperties compute,
            VmProperties vm,
            AwsEc2Properties awsEc2,
            MonthlyCostSummary awsEc2Cost,
            MonthlyCostSummary attachedEbsVolumesCost) {
        super(
                displayName,
                inventoryId,
                id,
                compartmentId,
                sourceKey,
                externalAssetKey,
                timeCreated,
                timeUpdated,
                assetSourceIds,
                lifecycleState,
                freeformTags,
                definedTags,
                systemTags);
        this.compute = compute;
        this.vm = vm;
        this.awsEc2 = awsEc2;
        this.awsEc2Cost = awsEc2Cost;
        this.attachedEbsVolumesCost = attachedEbsVolumesCost;
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

    @com.fasterxml.jackson.annotation.JsonProperty("awsEc2")
    private final AwsEc2Properties awsEc2;

    public AwsEc2Properties getAwsEc2() {
        return awsEc2;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("awsEc2Cost")
    private final MonthlyCostSummary awsEc2Cost;

    public MonthlyCostSummary getAwsEc2Cost() {
        return awsEc2Cost;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("attachedEbsVolumesCost")
    private final MonthlyCostSummary attachedEbsVolumesCost;

    public MonthlyCostSummary getAttachedEbsVolumesCost() {
        return attachedEbsVolumesCost;
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
        sb.append("AwsEc2Asset(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", compute=").append(String.valueOf(this.compute));
        sb.append(", vm=").append(String.valueOf(this.vm));
        sb.append(", awsEc2=").append(String.valueOf(this.awsEc2));
        sb.append(", awsEc2Cost=").append(String.valueOf(this.awsEc2Cost));
        sb.append(", attachedEbsVolumesCost=").append(String.valueOf(this.attachedEbsVolumesCost));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwsEc2Asset)) {
            return false;
        }

        AwsEc2Asset other = (AwsEc2Asset) o;
        return java.util.Objects.equals(this.compute, other.compute)
                && java.util.Objects.equals(this.vm, other.vm)
                && java.util.Objects.equals(this.awsEc2, other.awsEc2)
                && java.util.Objects.equals(this.awsEc2Cost, other.awsEc2Cost)
                && java.util.Objects.equals(
                        this.attachedEbsVolumesCost, other.attachedEbsVolumesCost)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.compute == null ? 43 : this.compute.hashCode());
        result = (result * PRIME) + (this.vm == null ? 43 : this.vm.hashCode());
        result = (result * PRIME) + (this.awsEc2 == null ? 43 : this.awsEc2.hashCode());
        result = (result * PRIME) + (this.awsEc2Cost == null ? 43 : this.awsEc2Cost.hashCode());
        result =
                (result * PRIME)
                        + (this.attachedEbsVolumesCost == null
                                ? 43
                                : this.attachedEbsVolumesCost.hashCode());
        return result;
    }
}
