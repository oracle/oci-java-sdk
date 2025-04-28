/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * A single execution or run of a pipeline. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "deploymentType",
        defaultImpl = Deployment.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SingleDeployStageRedeployment.class,
            name = "SINGLE_STAGE_REDEPLOYMENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DeployPipelineDeployment.class,
            name = "PIPELINE_DEPLOYMENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DeployPipelineRedeployment.class,
            name = "PIPELINE_REDEPLOYMENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SingleDeployStageDeployment.class,
            name = "SINGLE_STAGE_DEPLOYMENT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class Deployment extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "deployPipelineArtifacts",
        "deployPipelineEnvironments",
        "id",
        "displayName",
        "projectId",
        "deployPipelineId",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "deploymentArguments",
        "deployStageOverrideArguments",
        "deployArtifactOverrideArguments",
        "deploymentExecutionProgress",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    protected Deployment(
            DeployPipelineArtifactCollection deployPipelineArtifacts,
            DeployPipelineEnvironmentCollection deployPipelineEnvironments,
            String id,
            String displayName,
            String projectId,
            String deployPipelineId,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            DeploymentArgumentCollection deploymentArguments,
            DeployStageOverrideArgumentCollection deployStageOverrideArguments,
            DeployArtifactOverrideArgumentCollection deployArtifactOverrideArguments,
            DeploymentExecutionProgress deploymentExecutionProgress,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.deployPipelineArtifacts = deployPipelineArtifacts;
        this.deployPipelineEnvironments = deployPipelineEnvironments;
        this.id = id;
        this.displayName = displayName;
        this.projectId = projectId;
        this.deployPipelineId = deployPipelineId;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.deploymentArguments = deploymentArguments;
        this.deployStageOverrideArguments = deployStageOverrideArguments;
        this.deployArtifactOverrideArguments = deployArtifactOverrideArguments;
        this.deploymentExecutionProgress = deploymentExecutionProgress;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineArtifacts")
    private final DeployPipelineArtifactCollection deployPipelineArtifacts;

    public DeployPipelineArtifactCollection getDeployPipelineArtifacts() {
        return deployPipelineArtifacts;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineEnvironments")
    private final DeployPipelineEnvironmentCollection deployPipelineEnvironments;

    public DeployPipelineEnvironmentCollection getDeployPipelineEnvironments() {
        return deployPipelineEnvironments;
    }

    /** Unique identifier that is immutable on creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Deployment identifier which can be renamed and is not necessarily unique. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Deployment identifier which can be renamed and is not necessarily unique. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of a project. */
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * The OCID of a project.
     *
     * @return the value
     */
    public String getProjectId() {
        return projectId;
    }

    /** The OCID of a pipeline. */
    @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineId")
    private final String deployPipelineId;

    /**
     * The OCID of a pipeline.
     *
     * @return the value
     */
    public String getDeployPipelineId() {
        return deployPipelineId;
    }

    /** The OCID of a compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of a compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Time the deployment was created. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time the deployment was created. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time the deployment was updated. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time the deployment was updated. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the deployment. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the deployment.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deploymentArguments")
    private final DeploymentArgumentCollection deploymentArguments;

    public DeploymentArgumentCollection getDeploymentArguments() {
        return deploymentArguments;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deployStageOverrideArguments")
    private final DeployStageOverrideArgumentCollection deployStageOverrideArguments;

    public DeployStageOverrideArgumentCollection getDeployStageOverrideArguments() {
        return deployStageOverrideArguments;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactOverrideArguments")
    private final DeployArtifactOverrideArgumentCollection deployArtifactOverrideArguments;

    public DeployArtifactOverrideArgumentCollection getDeployArtifactOverrideArguments() {
        return deployArtifactOverrideArguments;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deploymentExecutionProgress")
    private final DeploymentExecutionProgress deploymentExecutionProgress;

    public DeploymentExecutionProgress getDeploymentExecutionProgress() {
        return deploymentExecutionProgress;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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
        sb.append("Deployment(");
        sb.append("super=").append(super.toString());
        sb.append("deployPipelineArtifacts=").append(String.valueOf(this.deployPipelineArtifacts));
        sb.append(", deployPipelineEnvironments=")
                .append(String.valueOf(this.deployPipelineEnvironments));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", deployPipelineId=").append(String.valueOf(this.deployPipelineId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", deploymentArguments=").append(String.valueOf(this.deploymentArguments));
        sb.append(", deployStageOverrideArguments=")
                .append(String.valueOf(this.deployStageOverrideArguments));
        sb.append(", deployArtifactOverrideArguments=")
                .append(String.valueOf(this.deployArtifactOverrideArguments));
        sb.append(", deploymentExecutionProgress=")
                .append(String.valueOf(this.deploymentExecutionProgress));
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
        if (!(o instanceof Deployment)) {
            return false;
        }

        Deployment other = (Deployment) o;
        return java.util.Objects.equals(this.deployPipelineArtifacts, other.deployPipelineArtifacts)
                && java.util.Objects.equals(
                        this.deployPipelineEnvironments, other.deployPipelineEnvironments)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.deployPipelineId, other.deployPipelineId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.deploymentArguments, other.deploymentArguments)
                && java.util.Objects.equals(
                        this.deployStageOverrideArguments, other.deployStageOverrideArguments)
                && java.util.Objects.equals(
                        this.deployArtifactOverrideArguments, other.deployArtifactOverrideArguments)
                && java.util.Objects.equals(
                        this.deploymentExecutionProgress, other.deploymentExecutionProgress)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.deployPipelineArtifacts == null
                                ? 43
                                : this.deployPipelineArtifacts.hashCode());
        result =
                (result * PRIME)
                        + (this.deployPipelineEnvironments == null
                                ? 43
                                : this.deployPipelineEnvironments.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result =
                (result * PRIME)
                        + (this.deployPipelineId == null ? 43 : this.deployPipelineId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentArguments == null
                                ? 43
                                : this.deploymentArguments.hashCode());
        result =
                (result * PRIME)
                        + (this.deployStageOverrideArguments == null
                                ? 43
                                : this.deployStageOverrideArguments.hashCode());
        result =
                (result * PRIME)
                        + (this.deployArtifactOverrideArguments == null
                                ? 43
                                : this.deployArtifactOverrideArguments.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentExecutionProgress == null
                                ? 43
                                : this.deploymentExecutionProgress.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Specifies type of deployment. */
    public enum DeploymentType implements com.oracle.bmc.http.internal.BmcEnum {
        PipelineDeployment("PIPELINE_DEPLOYMENT"),
        PipelineRedeployment("PIPELINE_REDEPLOYMENT"),
        SingleStageDeployment("SINGLE_STAGE_DEPLOYMENT"),
        SingleStageRedeployment("SINGLE_STAGE_REDEPLOYMENT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DeploymentType.class);

        private final String value;
        private static java.util.Map<String, DeploymentType> map;

        static {
            map = new java.util.HashMap<>();
            for (DeploymentType v : DeploymentType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DeploymentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DeploymentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DeploymentType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
