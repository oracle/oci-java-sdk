/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The information to be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployStageType",
    defaultImpl = UpdateDeployStageDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateOkeCanaryTrafficShiftDeployStageDetails.class,
        name = "OKE_CANARY_TRAFFIC_SHIFT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateOkeCanaryDeployStageDetails.class,
        name = "OKE_CANARY_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateOkeHelmChartDeployStageDetails.class,
        name = "OKE_HELM_CHART_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateComputeInstanceGroupDeployStageDetails.class,
        name = "COMPUTE_INSTANCE_GROUP_ROLLING_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateOkeCanaryApprovalDeployStageDetails.class,
        name = "OKE_CANARY_APPROVAL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateShellDeployStageDetails.class,
        name = "SHELL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateOkeDeployStageDetails.class,
        name = "OKE_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateComputeInstanceGroupCanaryApprovalDeployStageDetails.class,
        name = "COMPUTE_INSTANCE_GROUP_CANARY_APPROVAL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateLoadBalancerTrafficShiftDeployStageDetails.class,
        name = "LOAD_BALANCER_TRAFFIC_SHIFT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateOkeBlueGreenDeployStageDetails.class,
        name = "OKE_BLUE_GREEN_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateWaitDeployStageDetails.class,
        name = "WAIT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateOkeBlueGreenTrafficShiftDeployStageDetails.class,
        name = "OKE_BLUE_GREEN_TRAFFIC_SHIFT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateManualApprovalDeployStageDetails.class,
        name = "MANUAL_APPROVAL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateComputeInstanceGroupBlueGreenDeployStageDetails.class,
        name = "COMPUTE_INSTANCE_GROUP_BLUE_GREEN_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateComputeInstanceGroupCanaryDeployStageDetails.class,
        name = "COMPUTE_INSTANCE_GROUP_CANARY_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateFunctionDeployStageDetails.class,
        name = "DEPLOY_FUNCTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateComputeInstanceGroupBlueGreenTrafficShiftDeployStageDetails.class,
        name = "COMPUTE_INSTANCE_GROUP_BLUE_GREEN_TRAFFIC_SHIFT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateComputeInstanceGroupCanaryTrafficShiftDeployStageDetails.class,
        name = "COMPUTE_INSTANCE_GROUP_CANARY_TRAFFIC_SHIFT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateInvokeFunctionDeployStageDetails.class,
        name = "INVOKE_FUNCTION"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateDeployStageDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "displayName",
        "deployStagePredecessorCollection",
        "freeformTags",
        "definedTags"
    })
    protected UpdateDeployStageDetails(
            String description,
            String displayName,
            DeployStagePredecessorCollection deployStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.description = description;
        this.displayName = displayName;
        this.deployStagePredecessorCollection = deployStagePredecessorCollection;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    /**
     * Optional description about the deployment stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Optional description about the deployment stage.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Deployment stage display name, which can be renamed and is not necessarily unique. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Deployment stage display name, which can be renamed and is not necessarily unique. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deployStagePredecessorCollection")
    private final DeployStagePredecessorCollection deployStagePredecessorCollection;

    public DeployStagePredecessorCollection getDeployStagePredecessorCollection() {
        return deployStagePredecessorCollection;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateDeployStageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", deployStagePredecessorCollection=")
                .append(String.valueOf(this.deployStagePredecessorCollection));
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
        if (!(o instanceof UpdateDeployStageDetails)) {
            return false;
        }

        UpdateDeployStageDetails other = (UpdateDeployStageDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.deployStagePredecessorCollection,
                        other.deployStagePredecessorCollection)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.deployStagePredecessorCollection == null
                                ? 43
                                : this.deployStagePredecessorCollection.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
