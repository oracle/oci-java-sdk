/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * A single node in a pipeline. It is usually associated with some action on a specific set of OCI
 * resources such as environments. For example, updating a Function or a Kubernetes cluster. <br>
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
        property = "deployStageType",
        defaultImpl = DeployStage.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ComputeInstanceGroupBlueGreenTrafficShiftDeployStage.class,
            name = "COMPUTE_INSTANCE_GROUP_BLUE_GREEN_TRAFFIC_SHIFT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LoadBalancerTrafficShiftDeployStage.class,
            name = "LOAD_BALANCER_TRAFFIC_SHIFT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ShellDeployStage.class,
            name = "SHELL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InvokeFunctionDeployStage.class,
            name = "INVOKE_FUNCTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OkeCanaryDeployStage.class,
            name = "OKE_CANARY_DEPLOYMENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OkeDeployStage.class,
            name = "OKE_DEPLOYMENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OkeCanaryTrafficShiftDeployStage.class,
            name = "OKE_CANARY_TRAFFIC_SHIFT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FunctionDeployStage.class,
            name = "DEPLOY_FUNCTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OkeBlueGreenDeployStage.class,
            name = "OKE_BLUE_GREEN_DEPLOYMENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OkeCanaryApprovalDeployStage.class,
            name = "OKE_CANARY_APPROVAL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ComputeInstanceGroupCanaryTrafficShiftDeployStage.class,
            name = "COMPUTE_INSTANCE_GROUP_CANARY_TRAFFIC_SHIFT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ComputeInstanceGroupCanaryApprovalDeployStage.class,
            name = "COMPUTE_INSTANCE_GROUP_CANARY_APPROVAL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = WaitDeployStage.class,
            name = "WAIT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OkeHelmChartDeployStage.class,
            name = "OKE_HELM_CHART_DEPLOYMENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ComputeInstanceGroupBlueGreenDeployStage.class,
            name = "COMPUTE_INSTANCE_GROUP_BLUE_GREEN_DEPLOYMENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ComputeInstanceGroupCanaryDeployStage.class,
            name = "COMPUTE_INSTANCE_GROUP_CANARY_DEPLOYMENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OkeBlueGreenTrafficShiftDeployStage.class,
            name = "OKE_BLUE_GREEN_TRAFFIC_SHIFT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ManualApprovalDeployStage.class,
            name = "MANUAL_APPROVAL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ComputeInstanceGroupDeployStage.class,
            name = "COMPUTE_INSTANCE_GROUP_ROLLING_DEPLOYMENT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DeployStage extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "description",
        "displayName",
        "projectId",
        "deployPipelineId",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "deployStagePredecessorCollection",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    protected DeployStage(
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
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.description = description;
        this.displayName = displayName;
        this.projectId = projectId;
        this.deployPipelineId = deployPipelineId;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.deployStagePredecessorCollection = deployStagePredecessorCollection;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
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

    /** Optional description about the deployment stage. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Optional description about the deployment stage.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Deployment stage display name, which can be renamed and is not necessarily unique. Avoid
     * entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Deployment stage display name, which can be renamed and is not necessarily unique. Avoid
     * entering confidential information.
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
     * Time the deployment stage was created. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time the deployment stage was created. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time the deployment stage was updated. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time the deployment stage was updated. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the deployment stage. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
    /** The current state of the deployment stage. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the deployment stage.
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

    @com.fasterxml.jackson.annotation.JsonProperty("deployStagePredecessorCollection")
    private final DeployStagePredecessorCollection deployStagePredecessorCollection;

    public DeployStagePredecessorCollection getDeployStagePredecessorCollection() {
        return deployStagePredecessorCollection;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
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
        sb.append("DeployStage(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", deployPipelineId=").append(String.valueOf(this.deployPipelineId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", deployStagePredecessorCollection=")
                .append(String.valueOf(this.deployStagePredecessorCollection));
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
        if (!(o instanceof DeployStage)) {
            return false;
        }

        DeployStage other = (DeployStage) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.deployPipelineId, other.deployPipelineId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(
                        this.deployStagePredecessorCollection,
                        other.deployStagePredecessorCollection)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
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
                        + (this.deployStagePredecessorCollection == null
                                ? 43
                                : this.deployStagePredecessorCollection.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Deployment stage type. */
    public enum DeployStageType implements com.oracle.bmc.http.internal.BmcEnum {
        Wait("WAIT"),
        ComputeInstanceGroupRollingDeployment("COMPUTE_INSTANCE_GROUP_ROLLING_DEPLOYMENT"),
        ComputeInstanceGroupBlueGreenDeployment("COMPUTE_INSTANCE_GROUP_BLUE_GREEN_DEPLOYMENT"),
        ComputeInstanceGroupBlueGreenTrafficShift(
                "COMPUTE_INSTANCE_GROUP_BLUE_GREEN_TRAFFIC_SHIFT"),
        ComputeInstanceGroupCanaryDeployment("COMPUTE_INSTANCE_GROUP_CANARY_DEPLOYMENT"),
        ComputeInstanceGroupCanaryTrafficShift("COMPUTE_INSTANCE_GROUP_CANARY_TRAFFIC_SHIFT"),
        ComputeInstanceGroupCanaryApproval("COMPUTE_INSTANCE_GROUP_CANARY_APPROVAL"),
        OkeBlueGreenDeployment("OKE_BLUE_GREEN_DEPLOYMENT"),
        OkeBlueGreenTrafficShift("OKE_BLUE_GREEN_TRAFFIC_SHIFT"),
        OkeCanaryDeployment("OKE_CANARY_DEPLOYMENT"),
        OkeCanaryTrafficShift("OKE_CANARY_TRAFFIC_SHIFT"),
        OkeCanaryApproval("OKE_CANARY_APPROVAL"),
        OkeDeployment("OKE_DEPLOYMENT"),
        DeployFunction("DEPLOY_FUNCTION"),
        InvokeFunction("INVOKE_FUNCTION"),
        LoadBalancerTrafficShift("LOAD_BALANCER_TRAFFIC_SHIFT"),
        ManualApproval("MANUAL_APPROVAL"),
        OkeHelmChartDeployment("OKE_HELM_CHART_DEPLOYMENT"),
        Shell("SHELL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DeployStageType.class);

        private final String value;
        private static java.util.Map<String, DeployStageType> map;

        static {
            map = new java.util.HashMap<>();
            for (DeployStageType v : DeployStageType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DeployStageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DeployStageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DeployStageType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
