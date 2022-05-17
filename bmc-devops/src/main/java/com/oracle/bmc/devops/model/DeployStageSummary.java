/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Summary of the deployment stage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployStageType",
    defaultImpl = DeployStageSummary.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupBlueGreenDeployStageSummary.class,
        name = "COMPUTE_INSTANCE_GROUP_BLUE_GREEN_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupBlueGreenTrafficShiftDeployStageSummary.class,
        name = "COMPUTE_INSTANCE_GROUP_BLUE_GREEN_TRAFFIC_SHIFT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OkeBlueGreenDeployStageSummary.class,
        name = "OKE_BLUE_GREEN_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = WaitDeployStageSummary.class,
        name = "WAIT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OkeDeployStageSummary.class,
        name = "OKE_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupCanaryApprovalDeployStageSummary.class,
        name = "COMPUTE_INSTANCE_GROUP_CANARY_APPROVAL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = InvokeFunctionDeployStageSummary.class,
        name = "INVOKE_FUNCTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OkeHelmChartDeployStageSummary.class,
        name = "OKE_HELM_CHART_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OkeCanaryTrafficShiftDeployStageSummary.class,
        name = "OKE_CANARY_TRAFFIC_SHIFT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupDeployStageSummary.class,
        name = "COMPUTE_INSTANCE_GROUP_ROLLING_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupCanaryDeployStageSummary.class,
        name = "COMPUTE_INSTANCE_GROUP_CANARY_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OkeCanaryApprovalDeployStageSummary.class,
        name = "OKE_CANARY_APPROVAL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OkeCanaryDeployStageSummary.class,
        name = "OKE_CANARY_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = LoadBalancerTrafficShiftDeployStageSummary.class,
        name = "LOAD_BALANCER_TRAFFIC_SHIFT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ManualApprovalDeployStageSummary.class,
        name = "MANUAL_APPROVAL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OkeBlueGreenTrafficShiftDeployStageSummary.class,
        name = "OKE_BLUE_GREEN_TRAFFIC_SHIFT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FunctionDeployStageSummary.class,
        name = "DEPLOY_FUNCTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupCanaryTrafficShiftDeployStageSummary.class,
        name = "COMPUTE_INSTANCE_GROUP_CANARY_TRAFFIC_SHIFT"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DeployStageSummary {

    /**
     * Unique identifier that is immutable on creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Optional description about the deployment stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Deployment stage display name, which can be renamed and is not necessarily unique. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of a project.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    String projectId;

    /**
     * The OCID of a pipeline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineId")
    String deployPipelineId;

    /**
     * The OCID of a compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Time the deployment stage was created. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Time the deployment stage was updated. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The current state of the deployment stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    DeployStage.LifecycleState lifecycleState;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("deployStagePredecessorCollection")
    DeployStagePredecessorCollection deployStagePredecessorCollection;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;
}
