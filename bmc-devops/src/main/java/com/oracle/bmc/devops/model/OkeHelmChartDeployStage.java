/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the OKE cluster deployment stage using helm charts. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OkeHelmChartDeployStage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "deployStageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OkeHelmChartDeployStage extends DeployStage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineId")
        private String deployPipelineId;

        public Builder deployPipelineId(String deployPipelineId) {
            this.deployPipelineId = deployPipelineId;
            this.__explicitlySet__.add("deployPipelineId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("deployStagePredecessorCollection")
        private DeployStagePredecessorCollection deployStagePredecessorCollection;

        public Builder deployStagePredecessorCollection(
                DeployStagePredecessorCollection deployStagePredecessorCollection) {
            this.deployStagePredecessorCollection = deployStagePredecessorCollection;
            this.__explicitlySet__.add("deployStagePredecessorCollection");
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
        /** Kubernetes cluster environment OCID for deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("okeClusterDeployEnvironmentId")
        private String okeClusterDeployEnvironmentId;

        /**
         * Kubernetes cluster environment OCID for deployment.
         *
         * @param okeClusterDeployEnvironmentId the value to set
         * @return this builder
         */
        public Builder okeClusterDeployEnvironmentId(String okeClusterDeployEnvironmentId) {
            this.okeClusterDeployEnvironmentId = okeClusterDeployEnvironmentId;
            this.__explicitlySet__.add("okeClusterDeployEnvironmentId");
            return this;
        }
        /** Helm chart artifact OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("helmChartDeployArtifactId")
        private String helmChartDeployArtifactId;

        /**
         * Helm chart artifact OCID.
         *
         * @param helmChartDeployArtifactId the value to set
         * @return this builder
         */
        public Builder helmChartDeployArtifactId(String helmChartDeployArtifactId) {
            this.helmChartDeployArtifactId = helmChartDeployArtifactId;
            this.__explicitlySet__.add("helmChartDeployArtifactId");
            return this;
        }
        /** List of values.yaml file artifact OCIDs. */
        @com.fasterxml.jackson.annotation.JsonProperty("valuesArtifactIds")
        private java.util.List<String> valuesArtifactIds;

        /**
         * List of values.yaml file artifact OCIDs.
         *
         * @param valuesArtifactIds the value to set
         * @return this builder
         */
        public Builder valuesArtifactIds(java.util.List<String> valuesArtifactIds) {
            this.valuesArtifactIds = valuesArtifactIds;
            this.__explicitlySet__.add("valuesArtifactIds");
            return this;
        }
        /** Release name of the Helm chart. */
        @com.fasterxml.jackson.annotation.JsonProperty("releaseName")
        private String releaseName;

        /**
         * Release name of the Helm chart.
         *
         * @param releaseName the value to set
         * @return this builder
         */
        public Builder releaseName(String releaseName) {
            this.releaseName = releaseName;
            this.__explicitlySet__.add("releaseName");
            return this;
        }
        /** Uninstall the Helm chart release on deleting the stage. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUninstallOnStageDelete")
        private Boolean isUninstallOnStageDelete;

        /**
         * Uninstall the Helm chart release on deleting the stage.
         *
         * @param isUninstallOnStageDelete the value to set
         * @return this builder
         */
        public Builder isUninstallOnStageDelete(Boolean isUninstallOnStageDelete) {
            this.isUninstallOnStageDelete = isUninstallOnStageDelete;
            this.__explicitlySet__.add("isUninstallOnStageDelete");
            return this;
        }
        /** List of Helm command artifact OCIDs. */
        @com.fasterxml.jackson.annotation.JsonProperty("helmCommandArtifactIds")
        private java.util.List<String> helmCommandArtifactIds;

        /**
         * List of Helm command artifact OCIDs.
         *
         * @param helmCommandArtifactIds the value to set
         * @return this builder
         */
        public Builder helmCommandArtifactIds(java.util.List<String> helmCommandArtifactIds) {
            this.helmCommandArtifactIds = helmCommandArtifactIds;
            this.__explicitlySet__.add("helmCommandArtifactIds");
            return this;
        }
        /** The purpose of running this Helm stage */
        @com.fasterxml.jackson.annotation.JsonProperty("purpose")
        private Purpose purpose;

        /**
         * The purpose of running this Helm stage
         *
         * @param purpose the value to set
         * @return this builder
         */
        public Builder purpose(Purpose purpose) {
            this.purpose = purpose;
            this.__explicitlySet__.add("purpose");
            return this;
        }
        /**
         * Default namespace to be used for Kubernetes deployment when not specified in the
         * manifest.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * Default namespace to be used for Kubernetes deployment when not specified in the
         * manifest.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** Time to wait for execution of a helm stage. Defaults to 300 seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
        private Integer timeoutInSeconds;

        /**
         * Time to wait for execution of a helm stage. Defaults to 300 seconds.
         *
         * @param timeoutInSeconds the value to set
         * @return this builder
         */
        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            this.__explicitlySet__.add("timeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rollbackPolicy")
        private DeployStageRollbackPolicy rollbackPolicy;

        public Builder rollbackPolicy(DeployStageRollbackPolicy rollbackPolicy) {
            this.rollbackPolicy = rollbackPolicy;
            this.__explicitlySet__.add("rollbackPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("setValues")
        private HelmSetValueCollection setValues;

        public Builder setValues(HelmSetValueCollection setValues) {
            this.setValues = setValues;
            this.__explicitlySet__.add("setValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("setString")
        private HelmSetValueCollection setString;

        public Builder setString(HelmSetValueCollection setString) {
            this.setString = setString;
            this.__explicitlySet__.add("setString");
            return this;
        }
        /** Disable pre/post upgrade hooks. Set to false by default. */
        @com.fasterxml.jackson.annotation.JsonProperty("areHooksEnabled")
        private Boolean areHooksEnabled;

        /**
         * Disable pre/post upgrade hooks. Set to false by default.
         *
         * @param areHooksEnabled the value to set
         * @return this builder
         */
        public Builder areHooksEnabled(Boolean areHooksEnabled) {
            this.areHooksEnabled = areHooksEnabled;
            this.__explicitlySet__.add("areHooksEnabled");
            return this;
        }
        /**
         * During upgrade, reuse the values of the last release and merge overrides from the command
         * line. Set to false by default.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldReuseValues")
        private Boolean shouldReuseValues;

        /**
         * During upgrade, reuse the values of the last release and merge overrides from the command
         * line. Set to false by default.
         *
         * @param shouldReuseValues the value to set
         * @return this builder
         */
        public Builder shouldReuseValues(Boolean shouldReuseValues) {
            this.shouldReuseValues = shouldReuseValues;
            this.__explicitlySet__.add("shouldReuseValues");
            return this;
        }
        /**
         * During upgrade, reset the values to the ones built into the chart. It overrides
         * shouldReuseValues. Set to false by default.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldResetValues")
        private Boolean shouldResetValues;

        /**
         * During upgrade, reset the values to the ones built into the chart. It overrides
         * shouldReuseValues. Set to false by default.
         *
         * @param shouldResetValues the value to set
         * @return this builder
         */
        public Builder shouldResetValues(Boolean shouldResetValues) {
            this.shouldResetValues = shouldResetValues;
            this.__explicitlySet__.add("shouldResetValues");
            return this;
        }
        /**
         * Force resource update through delete; or if required, recreate. Set to false by default.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isForceEnabled")
        private Boolean isForceEnabled;

        /**
         * Force resource update through delete; or if required, recreate. Set to false by default.
         *
         * @param isForceEnabled the value to set
         * @return this builder
         */
        public Builder isForceEnabled(Boolean isForceEnabled) {
            this.isForceEnabled = isForceEnabled;
            this.__explicitlySet__.add("isForceEnabled");
            return this;
        }
        /**
         * Allow deletion of new resources created during when an upgrade fails. Set to false by
         * default.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldCleanupOnFail")
        private Boolean shouldCleanupOnFail;

        /**
         * Allow deletion of new resources created during when an upgrade fails. Set to false by
         * default.
         *
         * @param shouldCleanupOnFail the value to set
         * @return this builder
         */
        public Builder shouldCleanupOnFail(Boolean shouldCleanupOnFail) {
            this.shouldCleanupOnFail = shouldCleanupOnFail;
            this.__explicitlySet__.add("shouldCleanupOnFail");
            return this;
        }
        /**
         * Limit the maximum number of revisions saved per release. Use 0 for no limit. Set to 10 by
         * default
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxHistory")
        private Integer maxHistory;

        /**
         * Limit the maximum number of revisions saved per release. Use 0 for no limit. Set to 10 by
         * default
         *
         * @param maxHistory the value to set
         * @return this builder
         */
        public Builder maxHistory(Integer maxHistory) {
            this.maxHistory = maxHistory;
            this.__explicitlySet__.add("maxHistory");
            return this;
        }
        /**
         * If set, no CRDs are installed. By default, CRDs are installed only if they are not
         * present already. Set to false by default.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldSkipCrds")
        private Boolean shouldSkipCrds;

        /**
         * If set, no CRDs are installed. By default, CRDs are installed only if they are not
         * present already. Set to false by default.
         *
         * @param shouldSkipCrds the value to set
         * @return this builder
         */
        public Builder shouldSkipCrds(Boolean shouldSkipCrds) {
            this.shouldSkipCrds = shouldSkipCrds;
            this.__explicitlySet__.add("shouldSkipCrds");
            return this;
        }
        /** If set, renders subchart notes along with the parent. Set to false by default. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldSkipRenderSubchartNotes")
        private Boolean shouldSkipRenderSubchartNotes;

        /**
         * If set, renders subchart notes along with the parent. Set to false by default.
         *
         * @param shouldSkipRenderSubchartNotes the value to set
         * @return this builder
         */
        public Builder shouldSkipRenderSubchartNotes(Boolean shouldSkipRenderSubchartNotes) {
            this.shouldSkipRenderSubchartNotes = shouldSkipRenderSubchartNotes;
            this.__explicitlySet__.add("shouldSkipRenderSubchartNotes");
            return this;
        }
        /**
         * Waits until all the resources are in a ready state to mark the release as successful. Set
         * to false by default.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldNotWait")
        private Boolean shouldNotWait;

        /**
         * Waits until all the resources are in a ready state to mark the release as successful. Set
         * to false by default.
         *
         * @param shouldNotWait the value to set
         * @return this builder
         */
        public Builder shouldNotWait(Boolean shouldNotWait) {
            this.shouldNotWait = shouldNotWait;
            this.__explicitlySet__.add("shouldNotWait");
            return this;
        }
        /** Enables helm --debug option to stream output to tf stdout. Set to false by default. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDebugEnabled")
        private Boolean isDebugEnabled;

        /**
         * Enables helm --debug option to stream output to tf stdout. Set to false by default.
         *
         * @param isDebugEnabled the value to set
         * @return this builder
         */
        public Builder isDebugEnabled(Boolean isDebugEnabled) {
            this.isDebugEnabled = isDebugEnabled;
            this.__explicitlySet__.add("isDebugEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OkeHelmChartDeployStage build() {
            OkeHelmChartDeployStage model =
                    new OkeHelmChartDeployStage(
                            this.id,
                            this.description,
                            this.displayName,
                            this.projectId,
                            this.deployPipelineId,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.deployStagePredecessorCollection,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.okeClusterDeployEnvironmentId,
                            this.helmChartDeployArtifactId,
                            this.valuesArtifactIds,
                            this.releaseName,
                            this.isUninstallOnStageDelete,
                            this.helmCommandArtifactIds,
                            this.purpose,
                            this.namespace,
                            this.timeoutInSeconds,
                            this.rollbackPolicy,
                            this.setValues,
                            this.setString,
                            this.areHooksEnabled,
                            this.shouldReuseValues,
                            this.shouldResetValues,
                            this.isForceEnabled,
                            this.shouldCleanupOnFail,
                            this.maxHistory,
                            this.shouldSkipCrds,
                            this.shouldSkipRenderSubchartNotes,
                            this.shouldNotWait,
                            this.isDebugEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OkeHelmChartDeployStage model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("deployPipelineId")) {
                this.deployPipelineId(model.getDeployPipelineId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("deployStagePredecessorCollection")) {
                this.deployStagePredecessorCollection(model.getDeployStagePredecessorCollection());
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
            if (model.wasPropertyExplicitlySet("okeClusterDeployEnvironmentId")) {
                this.okeClusterDeployEnvironmentId(model.getOkeClusterDeployEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("helmChartDeployArtifactId")) {
                this.helmChartDeployArtifactId(model.getHelmChartDeployArtifactId());
            }
            if (model.wasPropertyExplicitlySet("valuesArtifactIds")) {
                this.valuesArtifactIds(model.getValuesArtifactIds());
            }
            if (model.wasPropertyExplicitlySet("releaseName")) {
                this.releaseName(model.getReleaseName());
            }
            if (model.wasPropertyExplicitlySet("isUninstallOnStageDelete")) {
                this.isUninstallOnStageDelete(model.getIsUninstallOnStageDelete());
            }
            if (model.wasPropertyExplicitlySet("helmCommandArtifactIds")) {
                this.helmCommandArtifactIds(model.getHelmCommandArtifactIds());
            }
            if (model.wasPropertyExplicitlySet("purpose")) {
                this.purpose(model.getPurpose());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("timeoutInSeconds")) {
                this.timeoutInSeconds(model.getTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("rollbackPolicy")) {
                this.rollbackPolicy(model.getRollbackPolicy());
            }
            if (model.wasPropertyExplicitlySet("setValues")) {
                this.setValues(model.getSetValues());
            }
            if (model.wasPropertyExplicitlySet("setString")) {
                this.setString(model.getSetString());
            }
            if (model.wasPropertyExplicitlySet("areHooksEnabled")) {
                this.areHooksEnabled(model.getAreHooksEnabled());
            }
            if (model.wasPropertyExplicitlySet("shouldReuseValues")) {
                this.shouldReuseValues(model.getShouldReuseValues());
            }
            if (model.wasPropertyExplicitlySet("shouldResetValues")) {
                this.shouldResetValues(model.getShouldResetValues());
            }
            if (model.wasPropertyExplicitlySet("isForceEnabled")) {
                this.isForceEnabled(model.getIsForceEnabled());
            }
            if (model.wasPropertyExplicitlySet("shouldCleanupOnFail")) {
                this.shouldCleanupOnFail(model.getShouldCleanupOnFail());
            }
            if (model.wasPropertyExplicitlySet("maxHistory")) {
                this.maxHistory(model.getMaxHistory());
            }
            if (model.wasPropertyExplicitlySet("shouldSkipCrds")) {
                this.shouldSkipCrds(model.getShouldSkipCrds());
            }
            if (model.wasPropertyExplicitlySet("shouldSkipRenderSubchartNotes")) {
                this.shouldSkipRenderSubchartNotes(model.getShouldSkipRenderSubchartNotes());
            }
            if (model.wasPropertyExplicitlySet("shouldNotWait")) {
                this.shouldNotWait(model.getShouldNotWait());
            }
            if (model.wasPropertyExplicitlySet("isDebugEnabled")) {
                this.isDebugEnabled(model.getIsDebugEnabled());
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
    public OkeHelmChartDeployStage(
            String id,
            String description,
            String displayName,
            String projectId,
            String deployPipelineId,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            DeployStagePredecessorCollection deployStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String okeClusterDeployEnvironmentId,
            String helmChartDeployArtifactId,
            java.util.List<String> valuesArtifactIds,
            String releaseName,
            Boolean isUninstallOnStageDelete,
            java.util.List<String> helmCommandArtifactIds,
            Purpose purpose,
            String namespace,
            Integer timeoutInSeconds,
            DeployStageRollbackPolicy rollbackPolicy,
            HelmSetValueCollection setValues,
            HelmSetValueCollection setString,
            Boolean areHooksEnabled,
            Boolean shouldReuseValues,
            Boolean shouldResetValues,
            Boolean isForceEnabled,
            Boolean shouldCleanupOnFail,
            Integer maxHistory,
            Boolean shouldSkipCrds,
            Boolean shouldSkipRenderSubchartNotes,
            Boolean shouldNotWait,
            Boolean isDebugEnabled) {
        super(
                id,
                description,
                displayName,
                projectId,
                deployPipelineId,
                compartmentId,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleDetails,
                deployStagePredecessorCollection,
                freeformTags,
                definedTags,
                systemTags);
        this.okeClusterDeployEnvironmentId = okeClusterDeployEnvironmentId;
        this.helmChartDeployArtifactId = helmChartDeployArtifactId;
        this.valuesArtifactIds = valuesArtifactIds;
        this.releaseName = releaseName;
        this.isUninstallOnStageDelete = isUninstallOnStageDelete;
        this.helmCommandArtifactIds = helmCommandArtifactIds;
        this.purpose = purpose;
        this.namespace = namespace;
        this.timeoutInSeconds = timeoutInSeconds;
        this.rollbackPolicy = rollbackPolicy;
        this.setValues = setValues;
        this.setString = setString;
        this.areHooksEnabled = areHooksEnabled;
        this.shouldReuseValues = shouldReuseValues;
        this.shouldResetValues = shouldResetValues;
        this.isForceEnabled = isForceEnabled;
        this.shouldCleanupOnFail = shouldCleanupOnFail;
        this.maxHistory = maxHistory;
        this.shouldSkipCrds = shouldSkipCrds;
        this.shouldSkipRenderSubchartNotes = shouldSkipRenderSubchartNotes;
        this.shouldNotWait = shouldNotWait;
        this.isDebugEnabled = isDebugEnabled;
    }

    /** Kubernetes cluster environment OCID for deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("okeClusterDeployEnvironmentId")
    private final String okeClusterDeployEnvironmentId;

    /**
     * Kubernetes cluster environment OCID for deployment.
     *
     * @return the value
     */
    public String getOkeClusterDeployEnvironmentId() {
        return okeClusterDeployEnvironmentId;
    }

    /** Helm chart artifact OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("helmChartDeployArtifactId")
    private final String helmChartDeployArtifactId;

    /**
     * Helm chart artifact OCID.
     *
     * @return the value
     */
    public String getHelmChartDeployArtifactId() {
        return helmChartDeployArtifactId;
    }

    /** List of values.yaml file artifact OCIDs. */
    @com.fasterxml.jackson.annotation.JsonProperty("valuesArtifactIds")
    private final java.util.List<String> valuesArtifactIds;

    /**
     * List of values.yaml file artifact OCIDs.
     *
     * @return the value
     */
    public java.util.List<String> getValuesArtifactIds() {
        return valuesArtifactIds;
    }

    /** Release name of the Helm chart. */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseName")
    private final String releaseName;

    /**
     * Release name of the Helm chart.
     *
     * @return the value
     */
    public String getReleaseName() {
        return releaseName;
    }

    /** Uninstall the Helm chart release on deleting the stage. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUninstallOnStageDelete")
    private final Boolean isUninstallOnStageDelete;

    /**
     * Uninstall the Helm chart release on deleting the stage.
     *
     * @return the value
     */
    public Boolean getIsUninstallOnStageDelete() {
        return isUninstallOnStageDelete;
    }

    /** List of Helm command artifact OCIDs. */
    @com.fasterxml.jackson.annotation.JsonProperty("helmCommandArtifactIds")
    private final java.util.List<String> helmCommandArtifactIds;

    /**
     * List of Helm command artifact OCIDs.
     *
     * @return the value
     */
    public java.util.List<String> getHelmCommandArtifactIds() {
        return helmCommandArtifactIds;
    }

    /** The purpose of running this Helm stage */
    public enum Purpose implements com.oracle.bmc.http.internal.BmcEnum {
        ExecuteHelmUpgrade("EXECUTE_HELM_UPGRADE"),
        ExecuteHelmCommand("EXECUTE_HELM_COMMAND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Purpose.class);

        private final String value;
        private static java.util.Map<String, Purpose> map;

        static {
            map = new java.util.HashMap<>();
            for (Purpose v : Purpose.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Purpose(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Purpose create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Purpose', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The purpose of running this Helm stage */
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    private final Purpose purpose;

    /**
     * The purpose of running this Helm stage
     *
     * @return the value
     */
    public Purpose getPurpose() {
        return purpose;
    }

    /**
     * Default namespace to be used for Kubernetes deployment when not specified in the manifest.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * Default namespace to be used for Kubernetes deployment when not specified in the manifest.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** Time to wait for execution of a helm stage. Defaults to 300 seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
    private final Integer timeoutInSeconds;

    /**
     * Time to wait for execution of a helm stage. Defaults to 300 seconds.
     *
     * @return the value
     */
    public Integer getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rollbackPolicy")
    private final DeployStageRollbackPolicy rollbackPolicy;

    public DeployStageRollbackPolicy getRollbackPolicy() {
        return rollbackPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("setValues")
    private final HelmSetValueCollection setValues;

    public HelmSetValueCollection getSetValues() {
        return setValues;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("setString")
    private final HelmSetValueCollection setString;

    public HelmSetValueCollection getSetString() {
        return setString;
    }

    /** Disable pre/post upgrade hooks. Set to false by default. */
    @com.fasterxml.jackson.annotation.JsonProperty("areHooksEnabled")
    private final Boolean areHooksEnabled;

    /**
     * Disable pre/post upgrade hooks. Set to false by default.
     *
     * @return the value
     */
    public Boolean getAreHooksEnabled() {
        return areHooksEnabled;
    }

    /**
     * During upgrade, reuse the values of the last release and merge overrides from the command
     * line. Set to false by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldReuseValues")
    private final Boolean shouldReuseValues;

    /**
     * During upgrade, reuse the values of the last release and merge overrides from the command
     * line. Set to false by default.
     *
     * @return the value
     */
    public Boolean getShouldReuseValues() {
        return shouldReuseValues;
    }

    /**
     * During upgrade, reset the values to the ones built into the chart. It overrides
     * shouldReuseValues. Set to false by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldResetValues")
    private final Boolean shouldResetValues;

    /**
     * During upgrade, reset the values to the ones built into the chart. It overrides
     * shouldReuseValues. Set to false by default.
     *
     * @return the value
     */
    public Boolean getShouldResetValues() {
        return shouldResetValues;
    }

    /** Force resource update through delete; or if required, recreate. Set to false by default. */
    @com.fasterxml.jackson.annotation.JsonProperty("isForceEnabled")
    private final Boolean isForceEnabled;

    /**
     * Force resource update through delete; or if required, recreate. Set to false by default.
     *
     * @return the value
     */
    public Boolean getIsForceEnabled() {
        return isForceEnabled;
    }

    /**
     * Allow deletion of new resources created during when an upgrade fails. Set to false by
     * default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldCleanupOnFail")
    private final Boolean shouldCleanupOnFail;

    /**
     * Allow deletion of new resources created during when an upgrade fails. Set to false by
     * default.
     *
     * @return the value
     */
    public Boolean getShouldCleanupOnFail() {
        return shouldCleanupOnFail;
    }

    /**
     * Limit the maximum number of revisions saved per release. Use 0 for no limit. Set to 10 by
     * default
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxHistory")
    private final Integer maxHistory;

    /**
     * Limit the maximum number of revisions saved per release. Use 0 for no limit. Set to 10 by
     * default
     *
     * @return the value
     */
    public Integer getMaxHistory() {
        return maxHistory;
    }

    /**
     * If set, no CRDs are installed. By default, CRDs are installed only if they are not present
     * already. Set to false by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldSkipCrds")
    private final Boolean shouldSkipCrds;

    /**
     * If set, no CRDs are installed. By default, CRDs are installed only if they are not present
     * already. Set to false by default.
     *
     * @return the value
     */
    public Boolean getShouldSkipCrds() {
        return shouldSkipCrds;
    }

    /** If set, renders subchart notes along with the parent. Set to false by default. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldSkipRenderSubchartNotes")
    private final Boolean shouldSkipRenderSubchartNotes;

    /**
     * If set, renders subchart notes along with the parent. Set to false by default.
     *
     * @return the value
     */
    public Boolean getShouldSkipRenderSubchartNotes() {
        return shouldSkipRenderSubchartNotes;
    }

    /**
     * Waits until all the resources are in a ready state to mark the release as successful. Set to
     * false by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldNotWait")
    private final Boolean shouldNotWait;

    /**
     * Waits until all the resources are in a ready state to mark the release as successful. Set to
     * false by default.
     *
     * @return the value
     */
    public Boolean getShouldNotWait() {
        return shouldNotWait;
    }

    /** Enables helm --debug option to stream output to tf stdout. Set to false by default. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDebugEnabled")
    private final Boolean isDebugEnabled;

    /**
     * Enables helm --debug option to stream output to tf stdout. Set to false by default.
     *
     * @return the value
     */
    public Boolean getIsDebugEnabled() {
        return isDebugEnabled;
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
        sb.append("OkeHelmChartDeployStage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", okeClusterDeployEnvironmentId=")
                .append(String.valueOf(this.okeClusterDeployEnvironmentId));
        sb.append(", helmChartDeployArtifactId=")
                .append(String.valueOf(this.helmChartDeployArtifactId));
        sb.append(", valuesArtifactIds=").append(String.valueOf(this.valuesArtifactIds));
        sb.append(", releaseName=").append(String.valueOf(this.releaseName));
        sb.append(", isUninstallOnStageDelete=")
                .append(String.valueOf(this.isUninstallOnStageDelete));
        sb.append(", helmCommandArtifactIds=").append(String.valueOf(this.helmCommandArtifactIds));
        sb.append(", purpose=").append(String.valueOf(this.purpose));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", timeoutInSeconds=").append(String.valueOf(this.timeoutInSeconds));
        sb.append(", rollbackPolicy=").append(String.valueOf(this.rollbackPolicy));
        sb.append(", setValues=").append(String.valueOf(this.setValues));
        sb.append(", setString=").append(String.valueOf(this.setString));
        sb.append(", areHooksEnabled=").append(String.valueOf(this.areHooksEnabled));
        sb.append(", shouldReuseValues=").append(String.valueOf(this.shouldReuseValues));
        sb.append(", shouldResetValues=").append(String.valueOf(this.shouldResetValues));
        sb.append(", isForceEnabled=").append(String.valueOf(this.isForceEnabled));
        sb.append(", shouldCleanupOnFail=").append(String.valueOf(this.shouldCleanupOnFail));
        sb.append(", maxHistory=").append(String.valueOf(this.maxHistory));
        sb.append(", shouldSkipCrds=").append(String.valueOf(this.shouldSkipCrds));
        sb.append(", shouldSkipRenderSubchartNotes=")
                .append(String.valueOf(this.shouldSkipRenderSubchartNotes));
        sb.append(", shouldNotWait=").append(String.valueOf(this.shouldNotWait));
        sb.append(", isDebugEnabled=").append(String.valueOf(this.isDebugEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OkeHelmChartDeployStage)) {
            return false;
        }

        OkeHelmChartDeployStage other = (OkeHelmChartDeployStage) o;
        return java.util.Objects.equals(
                        this.okeClusterDeployEnvironmentId, other.okeClusterDeployEnvironmentId)
                && java.util.Objects.equals(
                        this.helmChartDeployArtifactId, other.helmChartDeployArtifactId)
                && java.util.Objects.equals(this.valuesArtifactIds, other.valuesArtifactIds)
                && java.util.Objects.equals(this.releaseName, other.releaseName)
                && java.util.Objects.equals(
                        this.isUninstallOnStageDelete, other.isUninstallOnStageDelete)
                && java.util.Objects.equals(
                        this.helmCommandArtifactIds, other.helmCommandArtifactIds)
                && java.util.Objects.equals(this.purpose, other.purpose)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.timeoutInSeconds, other.timeoutInSeconds)
                && java.util.Objects.equals(this.rollbackPolicy, other.rollbackPolicy)
                && java.util.Objects.equals(this.setValues, other.setValues)
                && java.util.Objects.equals(this.setString, other.setString)
                && java.util.Objects.equals(this.areHooksEnabled, other.areHooksEnabled)
                && java.util.Objects.equals(this.shouldReuseValues, other.shouldReuseValues)
                && java.util.Objects.equals(this.shouldResetValues, other.shouldResetValues)
                && java.util.Objects.equals(this.isForceEnabled, other.isForceEnabled)
                && java.util.Objects.equals(this.shouldCleanupOnFail, other.shouldCleanupOnFail)
                && java.util.Objects.equals(this.maxHistory, other.maxHistory)
                && java.util.Objects.equals(this.shouldSkipCrds, other.shouldSkipCrds)
                && java.util.Objects.equals(
                        this.shouldSkipRenderSubchartNotes, other.shouldSkipRenderSubchartNotes)
                && java.util.Objects.equals(this.shouldNotWait, other.shouldNotWait)
                && java.util.Objects.equals(this.isDebugEnabled, other.isDebugEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.okeClusterDeployEnvironmentId == null
                                ? 43
                                : this.okeClusterDeployEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.helmChartDeployArtifactId == null
                                ? 43
                                : this.helmChartDeployArtifactId.hashCode());
        result =
                (result * PRIME)
                        + (this.valuesArtifactIds == null ? 43 : this.valuesArtifactIds.hashCode());
        result = (result * PRIME) + (this.releaseName == null ? 43 : this.releaseName.hashCode());
        result =
                (result * PRIME)
                        + (this.isUninstallOnStageDelete == null
                                ? 43
                                : this.isUninstallOnStageDelete.hashCode());
        result =
                (result * PRIME)
                        + (this.helmCommandArtifactIds == null
                                ? 43
                                : this.helmCommandArtifactIds.hashCode());
        result = (result * PRIME) + (this.purpose == null ? 43 : this.purpose.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.timeoutInSeconds == null ? 43 : this.timeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.rollbackPolicy == null ? 43 : this.rollbackPolicy.hashCode());
        result = (result * PRIME) + (this.setValues == null ? 43 : this.setValues.hashCode());
        result = (result * PRIME) + (this.setString == null ? 43 : this.setString.hashCode());
        result =
                (result * PRIME)
                        + (this.areHooksEnabled == null ? 43 : this.areHooksEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldReuseValues == null ? 43 : this.shouldReuseValues.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldResetValues == null ? 43 : this.shouldResetValues.hashCode());
        result =
                (result * PRIME)
                        + (this.isForceEnabled == null ? 43 : this.isForceEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldCleanupOnFail == null
                                ? 43
                                : this.shouldCleanupOnFail.hashCode());
        result = (result * PRIME) + (this.maxHistory == null ? 43 : this.maxHistory.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldSkipCrds == null ? 43 : this.shouldSkipCrds.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldSkipRenderSubchartNotes == null
                                ? 43
                                : this.shouldSkipRenderSubchartNotes.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldNotWait == null ? 43 : this.shouldNotWait.hashCode());
        result =
                (result * PRIME)
                        + (this.isDebugEnabled == null ? 43 : this.isDebugEnabled.hashCode());
        return result;
    }
}
