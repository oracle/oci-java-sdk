/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The details of a ZeroETL pipeline. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ZeroEtlPipeline.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "recipeType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ZeroEtlPipeline extends Pipeline {
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
        private Boolean isAutoScalingEnabled;

        public Builder isAutoScalingEnabled(Boolean isAutoScalingEnabled) {
            this.isAutoScalingEnabled = isAutoScalingEnabled;
            this.__explicitlySet__.add("isAutoScalingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceConnectionDetails")
        private SourcePipelineConnectionDetails sourceConnectionDetails;

        public Builder sourceConnectionDetails(
                SourcePipelineConnectionDetails sourceConnectionDetails) {
            this.sourceConnectionDetails = sourceConnectionDetails;
            this.__explicitlySet__.add("sourceConnectionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetConnectionDetails")
        private TargetPipelineConnectionDetails targetConnectionDetails;

        public Builder targetConnectionDetails(
                TargetPipelineConnectionDetails targetConnectionDetails) {
            this.targetConnectionDetails = targetConnectionDetails;
            this.__explicitlySet__.add("targetConnectionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pipelineDiagnosticData")
        private PipelineDiagnosticData pipelineDiagnosticData;

        public Builder pipelineDiagnosticData(PipelineDiagnosticData pipelineDiagnosticData) {
            this.pipelineDiagnosticData = pipelineDiagnosticData;
            this.__explicitlySet__.add("pipelineDiagnosticData");
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

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubState")
        private PipelineLifecycleSubState lifecycleSubState;

        public Builder lifecycleSubState(PipelineLifecycleSubState lifecycleSubState) {
            this.lifecycleSubState = lifecycleSubState;
            this.__explicitlySet__.add("lifecycleSubState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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
        /** Mapping for source/target schema/tables for the pipeline data replication. */
        @com.fasterxml.jackson.annotation.JsonProperty("mappingRules")
        private java.util.List<MappingRule> mappingRules;

        /**
         * Mapping for source/target schema/tables for the pipeline data replication.
         *
         * @param mappingRules the value to set
         * @return this builder
         */
        public Builder mappingRules(java.util.List<MappingRule> mappingRules) {
            this.mappingRules = mappingRules;
            this.__explicitlySet__.add("mappingRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("processOptions")
        private ProcessOptions processOptions;

        public Builder processOptions(ProcessOptions processOptions) {
            this.processOptions = processOptions;
            this.__explicitlySet__.add("processOptions");
            return this;
        }
        /**
         * When the resource was last updated. This option applies when retrieving a pipeline. The
         * format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
         * 2024-07-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastRecorded")
        private java.util.Date timeLastRecorded;

        /**
         * When the resource was last updated. This option applies when retrieving a pipeline. The
         * format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
         * 2024-07-25T21:10:29.600Z}.
         *
         * @param timeLastRecorded the value to set
         * @return this builder
         */
        public Builder timeLastRecorded(java.util.Date timeLastRecorded) {
            this.timeLastRecorded = timeLastRecorded;
            this.__explicitlySet__.add("timeLastRecorded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ZeroEtlPipeline build() {
            ZeroEtlPipeline model =
                    new ZeroEtlPipeline(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.licenseModel,
                            this.cpuCoreCount,
                            this.isAutoScalingEnabled,
                            this.sourceConnectionDetails,
                            this.targetConnectionDetails,
                            this.pipelineDiagnosticData,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.locks,
                            this.lifecycleState,
                            this.lifecycleSubState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.mappingRules,
                            this.processOptions,
                            this.timeLastRecorded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ZeroEtlPipeline model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingEnabled")) {
                this.isAutoScalingEnabled(model.getIsAutoScalingEnabled());
            }
            if (model.wasPropertyExplicitlySet("sourceConnectionDetails")) {
                this.sourceConnectionDetails(model.getSourceConnectionDetails());
            }
            if (model.wasPropertyExplicitlySet("targetConnectionDetails")) {
                this.targetConnectionDetails(model.getTargetConnectionDetails());
            }
            if (model.wasPropertyExplicitlySet("pipelineDiagnosticData")) {
                this.pipelineDiagnosticData(model.getPipelineDiagnosticData());
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
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleSubState")) {
                this.lifecycleSubState(model.getLifecycleSubState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("mappingRules")) {
                this.mappingRules(model.getMappingRules());
            }
            if (model.wasPropertyExplicitlySet("processOptions")) {
                this.processOptions(model.getProcessOptions());
            }
            if (model.wasPropertyExplicitlySet("timeLastRecorded")) {
                this.timeLastRecorded(model.getTimeLastRecorded());
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
    public ZeroEtlPipeline(
            String id,
            String displayName,
            String description,
            String compartmentId,
            LicenseModel licenseModel,
            Integer cpuCoreCount,
            Boolean isAutoScalingEnabled,
            SourcePipelineConnectionDetails sourceConnectionDetails,
            TargetPipelineConnectionDetails targetConnectionDetails,
            PipelineDiagnosticData pipelineDiagnosticData,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<ResourceLock> locks,
            LifecycleState lifecycleState,
            PipelineLifecycleSubState lifecycleSubState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.List<MappingRule> mappingRules,
            ProcessOptions processOptions,
            java.util.Date timeLastRecorded) {
        super(
                id,
                displayName,
                description,
                compartmentId,
                licenseModel,
                cpuCoreCount,
                isAutoScalingEnabled,
                sourceConnectionDetails,
                targetConnectionDetails,
                pipelineDiagnosticData,
                freeformTags,
                definedTags,
                systemTags,
                locks,
                lifecycleState,
                lifecycleSubState,
                lifecycleDetails,
                timeCreated,
                timeUpdated);
        this.mappingRules = mappingRules;
        this.processOptions = processOptions;
        this.timeLastRecorded = timeLastRecorded;
    }

    /** Mapping for source/target schema/tables for the pipeline data replication. */
    @com.fasterxml.jackson.annotation.JsonProperty("mappingRules")
    private final java.util.List<MappingRule> mappingRules;

    /**
     * Mapping for source/target schema/tables for the pipeline data replication.
     *
     * @return the value
     */
    public java.util.List<MappingRule> getMappingRules() {
        return mappingRules;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("processOptions")
    private final ProcessOptions processOptions;

    public ProcessOptions getProcessOptions() {
        return processOptions;
    }

    /**
     * When the resource was last updated. This option applies when retrieving a pipeline. The
     * format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
     * 2024-07-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastRecorded")
    private final java.util.Date timeLastRecorded;

    /**
     * When the resource was last updated. This option applies when retrieving a pipeline. The
     * format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
     * 2024-07-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeLastRecorded() {
        return timeLastRecorded;
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
        sb.append("ZeroEtlPipeline(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", mappingRules=").append(String.valueOf(this.mappingRules));
        sb.append(", processOptions=").append(String.valueOf(this.processOptions));
        sb.append(", timeLastRecorded=").append(String.valueOf(this.timeLastRecorded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ZeroEtlPipeline)) {
            return false;
        }

        ZeroEtlPipeline other = (ZeroEtlPipeline) o;
        return java.util.Objects.equals(this.mappingRules, other.mappingRules)
                && java.util.Objects.equals(this.processOptions, other.processOptions)
                && java.util.Objects.equals(this.timeLastRecorded, other.timeLastRecorded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.mappingRules == null ? 43 : this.mappingRules.hashCode());
        result =
                (result * PRIME)
                        + (this.processOptions == null ? 43 : this.processOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastRecorded == null ? 43 : this.timeLastRecorded.hashCode());
        return result;
    }
}
