/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
        value = ComputeInstanceGroupDeployStageExecutionProgress.class,
        name = "COMPUTE_INSTANCE_GROUP_ROLLING_DEPLOYMENT"
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
        value = RunValidationTestOnComputeInstanceDeployStageExecutionProgress.class,
        name = "RUN_VALIDATION_TEST_ON_COMPUTE_INSTANCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ManualApprovalDeployStageExecutionProgress.class,
        name = "MANUAL_APPROVAL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RunPipelineDeployStageExecutionProgress.class,
        name = "RUN_DEPLOYMENT_PIPELINE"
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
        value = InvokeFunctionDeployStageExecutionProgress.class,
        name = "INVOKE_FUNCTION"
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

    /**
     * Stage display name. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployStageDisplayName")
    String deployStageDisplayName;

    /**
     * The OCID of the stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployStageId")
    String deployStageId;

    /**
     * Time the stage started executing. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * Time the stage finished executing. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    java.util.Date timeFinished;
    /**
     * The current state of the stage.
     **/
    @lombok.extern.slf4j.Slf4j
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
    Status status;

    @com.fasterxml.jackson.annotation.JsonProperty("deployStagePredecessors")
    DeployStagePredecessorCollection deployStagePredecessors;

    /**
     * Details about stage execution for all the target environments.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployStageExecutionProgressDetails")
    java.util.List<DeployStageExecutionProgressDetails> deployStageExecutionProgressDetails;
}
