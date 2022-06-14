/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details about the execution progress of a stage in a deployment.
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
    defaultImpl = DeployStageExecutionProgress.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupBlueGreenTrafficShiftDeployStageExecutionProgress.class,
        name = "COMPUTE_INSTANCE_GROUP_BLUE_GREEN_TRAFFIC_SHIFT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupCanaryDeployStageExecutionProgress.class,
        name = "COMPUTE_INSTANCE_GROUP_CANARY_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OkeBlueGreenDeployStageExecutionProgress.class,
        name = "OKE_BLUE_GREEN_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupDeployStageExecutionProgress.class,
        name = "COMPUTE_INSTANCE_GROUP_ROLLING_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OkeCanaryDeployStageExecutionProgress.class,
        name = "OKE_CANARY_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = LoadBalancerTrafficShiftDeployStageExecutionProgress.class,
        name = "LOAD_BALANCER_TRAFFIC_SHIFT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = WaitDeployStageExecutionProgress.class,
        name = "WAIT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupCanaryTrafficShiftDeployStageExecutionProgress.class,
        name = "COMPUTE_INSTANCE_GROUP_CANARY_TRAFFIC_SHIFT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OkeCanaryApprovalDeployStageExecutionProgress.class,
        name = "OKE_CANARY_APPROVAL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ManualApprovalDeployStageExecutionProgress.class,
        name = "MANUAL_APPROVAL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OkeDeployStageExecutionProgress.class,
        name = "OKE_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FunctionDeployStageExecutionProgress.class,
        name = "DEPLOY_FUNCTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OkeBlueGreenTrafficShiftDeployStageExecutionProgress.class,
        name = "OKE_BLUE_GREEN_TRAFFIC_SHIFT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OkeHelmChartDeploymentStageExecutionProgress.class,
        name = "OKE_HELM_CHART_DEPLOYMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = InvokeFunctionDeployStageExecutionProgress.class,
        name = "INVOKE_FUNCTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OkeCanaryTrafficShiftDeployStageExecutionProgress.class,
        name = "OKE_CANARY_TRAFFIC_SHIFT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupCanaryApprovalDeployStageExecutionProgress.class,
        name = "COMPUTE_INSTANCE_GROUP_CANARY_APPROVAL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupBlueGreenDeployStageExecutionProgress.class,
        name = "COMPUTE_INSTANCE_GROUP_BLUE_GREEN_DEPLOYMENT"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DeployStageExecutionProgress {
    @Deprecated
    @java.beans.ConstructorProperties({
        "deployStageDisplayName",
        "deployStageId",
        "timeStarted",
        "timeFinished",
        "status",
        "deployStagePredecessors",
        "deployStageExecutionProgressDetails"
    })
    protected DeployStageExecutionProgress(
            String deployStageDisplayName,
            String deployStageId,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            Status status,
            DeployStagePredecessorCollection deployStagePredecessors,
            java.util.List<DeployStageExecutionProgressDetails>
                    deployStageExecutionProgressDetails) {
        super();
        this.deployStageDisplayName = deployStageDisplayName;
        this.deployStageId = deployStageId;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.status = status;
        this.deployStagePredecessors = deployStagePredecessors;
        this.deployStageExecutionProgressDetails = deployStageExecutionProgressDetails;
    }

    /**
     * Stage display name. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployStageDisplayName")
    private final String deployStageDisplayName;

    /**
     * Stage display name. Avoid entering confidential information.
     * @return the value
     **/
    public String getDeployStageDisplayName() {
        return deployStageDisplayName;
    }

    /**
     * The OCID of the stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployStageId")
    private final String deployStageId;

    /**
     * The OCID of the stage.
     * @return the value
     **/
    public String getDeployStageId() {
        return deployStageId;
    }

    /**
     * Time the stage started executing. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Time the stage started executing. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * Time the stage finished executing. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * Time the stage finished executing. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * The current state of the stage.
     **/
    public enum Status {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),
        RollbackInProgress("ROLLBACK_IN_PROGRESS"),
        RollbackSucceeded("ROLLBACK_SUCCEEDED"),
        RollbackFailed("ROLLBACK_FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current state of the stage.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deployStagePredecessors")
    private final DeployStagePredecessorCollection deployStagePredecessors;

    public DeployStagePredecessorCollection getDeployStagePredecessors() {
        return deployStagePredecessors;
    }

    /**
     * Details about stage execution for all the target environments.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployStageExecutionProgressDetails")
    private final java.util.List<DeployStageExecutionProgressDetails>
            deployStageExecutionProgressDetails;

    /**
     * Details about stage execution for all the target environments.
     * @return the value
     **/
    public java.util.List<DeployStageExecutionProgressDetails>
            getDeployStageExecutionProgressDetails() {
        return deployStageExecutionProgressDetails;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DeployStageExecutionProgress(");
        sb.append("deployStageDisplayName=").append(String.valueOf(this.deployStageDisplayName));
        sb.append(", deployStageId=").append(String.valueOf(this.deployStageId));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", deployStagePredecessors=")
                .append(String.valueOf(this.deployStagePredecessors));
        sb.append(", deployStageExecutionProgressDetails=")
                .append(String.valueOf(this.deployStageExecutionProgressDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeployStageExecutionProgress)) {
            return false;
        }

        DeployStageExecutionProgress other = (DeployStageExecutionProgress) o;
        return java.util.Objects.equals(this.deployStageDisplayName, other.deployStageDisplayName)
                && java.util.Objects.equals(this.deployStageId, other.deployStageId)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(
                        this.deployStagePredecessors, other.deployStagePredecessors)
                && java.util.Objects.equals(
                        this.deployStageExecutionProgressDetails,
                        other.deployStageExecutionProgressDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.deployStageDisplayName == null
                                ? 43
                                : this.deployStageDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.deployStageId == null ? 43 : this.deployStageId.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.deployStagePredecessors == null
                                ? 43
                                : this.deployStagePredecessors.hashCode());
        result =
                (result * PRIME)
                        + (this.deployStageExecutionProgressDetails == null
                                ? 43
                                : this.deployStageExecutionProgressDetails.hashCode());
        return result;
    }
}
