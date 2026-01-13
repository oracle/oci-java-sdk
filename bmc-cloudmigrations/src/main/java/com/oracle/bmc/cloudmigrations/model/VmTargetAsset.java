/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Description of the VM target asset. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VmTargetAsset.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VmTargetAsset extends TargetAsset {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("migrationPlanId")
        private String migrationPlanId;

        public Builder migrationPlanId(String migrationPlanId) {
            this.migrationPlanId = migrationPlanId;
            this.__explicitlySet__.add("migrationPlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdResourceId")
        private String createdResourceId;

        public Builder createdResourceId(String createdResourceId) {
            this.createdResourceId = createdResourceId;
            this.__explicitlySet__.add("createdResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isExcludedFromExecution")
        private Boolean isExcludedFromExecution;

        public Builder isExcludedFromExecution(Boolean isExcludedFromExecution) {
            this.isExcludedFromExecution = isExcludedFromExecution;
            this.__explicitlySet__.add("isExcludedFromExecution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compatibilityMessages")
        private java.util.List<CompatibilityMessage> compatibilityMessages;

        public Builder compatibilityMessages(
                java.util.List<CompatibilityMessage> compatibilityMessages) {
            this.compatibilityMessages = compatibilityMessages;
            this.__explicitlySet__.add("compatibilityMessages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("estimatedCost")
        private CostEstimation estimatedCost;

        public Builder estimatedCost(CostEstimation estimatedCost) {
            this.estimatedCost = estimatedCost;
            this.__explicitlySet__.add("estimatedCost");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeAssessed")
        private java.util.Date timeAssessed;

        public Builder timeAssessed(java.util.Date timeAssessed) {
            this.timeAssessed = timeAssessed;
            this.__explicitlySet__.add("timeAssessed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("migrationAsset")
        private MigrationAsset migrationAsset;

        public Builder migrationAsset(MigrationAsset migrationAsset) {
            this.migrationAsset = migrationAsset;
            this.__explicitlySet__.add("migrationAsset");
            return this;
        }
        /** Preferred VM shape type that you provide. */
        @com.fasterxml.jackson.annotation.JsonProperty("preferredShapeType")
        private PreferredShapeType preferredShapeType;

        /**
         * Preferred VM shape type that you provide.
         *
         * @param preferredShapeType the value to set
         * @return this builder
         */
        public Builder preferredShapeType(PreferredShapeType preferredShapeType) {
            this.preferredShapeType = preferredShapeType;
            this.__explicitlySet__.add("preferredShapeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("testSpec")
        private LaunchInstanceDetails testSpec;

        public Builder testSpec(LaunchInstanceDetails testSpec) {
            this.testSpec = testSpec;
            this.__explicitlySet__.add("testSpec");
            return this;
        }
        /** Performance of the block volumes. */
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumesPerformance")
        private Integer blockVolumesPerformance;

        /**
         * Performance of the block volumes.
         *
         * @param blockVolumesPerformance the value to set
         * @return this builder
         */
        public Builder blockVolumesPerformance(Integer blockVolumesPerformance) {
            this.blockVolumesPerformance = blockVolumesPerformance;
            this.__explicitlySet__.add("blockVolumesPerformance");
            return this;
        }
        /** Microsoft license for VM configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("msLicense")
        private String msLicense;

        /**
         * Microsoft license for VM configuration.
         *
         * @param msLicense the value to set
         * @return this builder
         */
        public Builder msLicense(String msLicense) {
            this.msLicense = msLicense;
            this.__explicitlySet__.add("msLicense");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userSpec")
        private LaunchInstanceDetails userSpec;

        public Builder userSpec(LaunchInstanceDetails userSpec) {
            this.userSpec = userSpec;
            this.__explicitlySet__.add("userSpec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendedSpec")
        private LaunchInstanceDetails recommendedSpec;

        public Builder recommendedSpec(LaunchInstanceDetails recommendedSpec) {
            this.recommendedSpec = recommendedSpec;
            this.__explicitlySet__.add("recommendedSpec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VmTargetAsset build() {
            VmTargetAsset model =
                    new VmTargetAsset(
                            this.id,
                            this.displayName,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.migrationPlanId,
                            this.compartmentId,
                            this.createdResourceId,
                            this.isExcludedFromExecution,
                            this.compatibilityMessages,
                            this.estimatedCost,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeAssessed,
                            this.migrationAsset,
                            this.preferredShapeType,
                            this.testSpec,
                            this.blockVolumesPerformance,
                            this.msLicense,
                            this.userSpec,
                            this.recommendedSpec);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VmTargetAsset model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("migrationPlanId")) {
                this.migrationPlanId(model.getMigrationPlanId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("createdResourceId")) {
                this.createdResourceId(model.getCreatedResourceId());
            }
            if (model.wasPropertyExplicitlySet("isExcludedFromExecution")) {
                this.isExcludedFromExecution(model.getIsExcludedFromExecution());
            }
            if (model.wasPropertyExplicitlySet("compatibilityMessages")) {
                this.compatibilityMessages(model.getCompatibilityMessages());
            }
            if (model.wasPropertyExplicitlySet("estimatedCost")) {
                this.estimatedCost(model.getEstimatedCost());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeAssessed")) {
                this.timeAssessed(model.getTimeAssessed());
            }
            if (model.wasPropertyExplicitlySet("migrationAsset")) {
                this.migrationAsset(model.getMigrationAsset());
            }
            if (model.wasPropertyExplicitlySet("preferredShapeType")) {
                this.preferredShapeType(model.getPreferredShapeType());
            }
            if (model.wasPropertyExplicitlySet("testSpec")) {
                this.testSpec(model.getTestSpec());
            }
            if (model.wasPropertyExplicitlySet("blockVolumesPerformance")) {
                this.blockVolumesPerformance(model.getBlockVolumesPerformance());
            }
            if (model.wasPropertyExplicitlySet("msLicense")) {
                this.msLicense(model.getMsLicense());
            }
            if (model.wasPropertyExplicitlySet("userSpec")) {
                this.userSpec(model.getUserSpec());
            }
            if (model.wasPropertyExplicitlySet("recommendedSpec")) {
                this.recommendedSpec(model.getRecommendedSpec());
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
    public VmTargetAsset(
            String id,
            String displayName,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String migrationPlanId,
            String compartmentId,
            String createdResourceId,
            Boolean isExcludedFromExecution,
            java.util.List<CompatibilityMessage> compatibilityMessages,
            CostEstimation estimatedCost,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeAssessed,
            MigrationAsset migrationAsset,
            PreferredShapeType preferredShapeType,
            LaunchInstanceDetails testSpec,
            Integer blockVolumesPerformance,
            String msLicense,
            LaunchInstanceDetails userSpec,
            LaunchInstanceDetails recommendedSpec) {
        super(
                id,
                displayName,
                lifecycleState,
                lifecycleDetails,
                migrationPlanId,
                compartmentId,
                createdResourceId,
                isExcludedFromExecution,
                compatibilityMessages,
                estimatedCost,
                timeCreated,
                timeUpdated,
                timeAssessed,
                migrationAsset);
        this.preferredShapeType = preferredShapeType;
        this.testSpec = testSpec;
        this.blockVolumesPerformance = blockVolumesPerformance;
        this.msLicense = msLicense;
        this.userSpec = userSpec;
        this.recommendedSpec = recommendedSpec;
    }

    /** Preferred VM shape type that you provide. */
    public enum PreferredShapeType implements com.oracle.bmc.http.internal.BmcEnum {
        Vm("VM"),
        VmIntel("VM_INTEL"),
        VmIntelStandard("VM_INTEL_Standard"),
        VmIntelDensIo("VM_INTEL_DensIO"),
        VmIntelGpu("VM_INTEL_GPU"),
        VmIntelOptimized("VM_INTEL_Optimized"),
        VmAmd("VM_AMD"),
        VmAmdStandard("VM_AMD_Standard"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PreferredShapeType.class);

        private final String value;
        private static java.util.Map<String, PreferredShapeType> map;

        static {
            map = new java.util.HashMap<>();
            for (PreferredShapeType v : PreferredShapeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PreferredShapeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PreferredShapeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PreferredShapeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Preferred VM shape type that you provide. */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredShapeType")
    private final PreferredShapeType preferredShapeType;

    /**
     * Preferred VM shape type that you provide.
     *
     * @return the value
     */
    public PreferredShapeType getPreferredShapeType() {
        return preferredShapeType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("testSpec")
    private final LaunchInstanceDetails testSpec;

    public LaunchInstanceDetails getTestSpec() {
        return testSpec;
    }

    /** Performance of the block volumes. */
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumesPerformance")
    private final Integer blockVolumesPerformance;

    /**
     * Performance of the block volumes.
     *
     * @return the value
     */
    public Integer getBlockVolumesPerformance() {
        return blockVolumesPerformance;
    }

    /** Microsoft license for VM configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("msLicense")
    private final String msLicense;

    /**
     * Microsoft license for VM configuration.
     *
     * @return the value
     */
    public String getMsLicense() {
        return msLicense;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("userSpec")
    private final LaunchInstanceDetails userSpec;

    public LaunchInstanceDetails getUserSpec() {
        return userSpec;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("recommendedSpec")
    private final LaunchInstanceDetails recommendedSpec;

    public LaunchInstanceDetails getRecommendedSpec() {
        return recommendedSpec;
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
        sb.append("VmTargetAsset(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", preferredShapeType=").append(String.valueOf(this.preferredShapeType));
        sb.append(", testSpec=").append(String.valueOf(this.testSpec));
        sb.append(", blockVolumesPerformance=")
                .append(String.valueOf(this.blockVolumesPerformance));
        sb.append(", msLicense=").append(String.valueOf(this.msLicense));
        sb.append(", userSpec=").append(String.valueOf(this.userSpec));
        sb.append(", recommendedSpec=").append(String.valueOf(this.recommendedSpec));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VmTargetAsset)) {
            return false;
        }

        VmTargetAsset other = (VmTargetAsset) o;
        return java.util.Objects.equals(this.preferredShapeType, other.preferredShapeType)
                && java.util.Objects.equals(this.testSpec, other.testSpec)
                && java.util.Objects.equals(
                        this.blockVolumesPerformance, other.blockVolumesPerformance)
                && java.util.Objects.equals(this.msLicense, other.msLicense)
                && java.util.Objects.equals(this.userSpec, other.userSpec)
                && java.util.Objects.equals(this.recommendedSpec, other.recommendedSpec)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.preferredShapeType == null
                                ? 43
                                : this.preferredShapeType.hashCode());
        result = (result * PRIME) + (this.testSpec == null ? 43 : this.testSpec.hashCode());
        result =
                (result * PRIME)
                        + (this.blockVolumesPerformance == null
                                ? 43
                                : this.blockVolumesPerformance.hashCode());
        result = (result * PRIME) + (this.msLicense == null ? 43 : this.msLicense.hashCode());
        result = (result * PRIME) + (this.userSpec == null ? 43 : this.userSpec.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendedSpec == null ? 43 : this.recommendedSpec.hashCode());
        return result;
    }
}
