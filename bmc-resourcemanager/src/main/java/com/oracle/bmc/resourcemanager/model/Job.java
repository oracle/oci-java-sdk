/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * The properties that define a job. Jobs perform the actions that are defined in your configuration.
 * - **Plan job**. A plan job takes your Terraform configuration, parses it, and creates an execution plan.
 * - **Apply job**. The apply job takes your execution plan, applies it to the associated stack, then executes
 * the configuration's instructions.
 * - **Destroy job**. To clean up the infrastructure controlled by the stack, you run a destroy job.
 * A destroy job does not delete the stack or associated job resources,
 * but instead releases the resources managed by the stack.
 * - **Import_TF_State job**. An import Terraform state job takes a Terraform state file and sets it as the current
 * state of the stack. This is used to migrate local Terraform environments to Resource Manager.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Job.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Job {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "stackId",
        "compartmentId",
        "displayName",
        "operation",
        "jobOperationDetails",
        "applyJobPlanResolution",
        "resolvedPlanJobId",
        "timeCreated",
        "timeFinished",
        "lifecycleState",
        "failureDetails",
        "cancellationDetails",
        "workingDirectory",
        "variables",
        "configSource",
        "freeformTags",
        "definedTags"
    })
    public Job(
            String id,
            String stackId,
            String compartmentId,
            String displayName,
            Operation operation,
            JobOperationDetails jobOperationDetails,
            ApplyJobPlanResolution applyJobPlanResolution,
            String resolvedPlanJobId,
            java.util.Date timeCreated,
            java.util.Date timeFinished,
            LifecycleState lifecycleState,
            FailureDetails failureDetails,
            CancellationDetails cancellationDetails,
            String workingDirectory,
            java.util.Map<String, String> variables,
            ConfigSourceRecord configSource,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.stackId = stackId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.operation = operation;
        this.jobOperationDetails = jobOperationDetails;
        this.applyJobPlanResolution = applyJobPlanResolution;
        this.resolvedPlanJobId = resolvedPlanJobId;
        this.timeCreated = timeCreated;
        this.timeFinished = timeFinished;
        this.lifecycleState = lifecycleState;
        this.failureDetails = failureDetails;
        this.cancellationDetails = cancellationDetails;
        this.workingDirectory = workingDirectory;
        this.variables = variables;
        this.configSource = configSource;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stackId")
        private String stackId;

        public Builder stackId(String stackId) {
            this.stackId = stackId;
            this.__explicitlySet__.add("stackId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private Operation operation;

        public Builder operation(Operation operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobOperationDetails")
        private JobOperationDetails jobOperationDetails;

        public Builder jobOperationDetails(JobOperationDetails jobOperationDetails) {
            this.jobOperationDetails = jobOperationDetails;
            this.__explicitlySet__.add("jobOperationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applyJobPlanResolution")
        private ApplyJobPlanResolution applyJobPlanResolution;

        public Builder applyJobPlanResolution(ApplyJobPlanResolution applyJobPlanResolution) {
            this.applyJobPlanResolution = applyJobPlanResolution;
            this.__explicitlySet__.add("applyJobPlanResolution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resolvedPlanJobId")
        private String resolvedPlanJobId;

        public Builder resolvedPlanJobId(String resolvedPlanJobId) {
            this.resolvedPlanJobId = resolvedPlanJobId;
            this.__explicitlySet__.add("resolvedPlanJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failureDetails")
        private FailureDetails failureDetails;

        public Builder failureDetails(FailureDetails failureDetails) {
            this.failureDetails = failureDetails;
            this.__explicitlySet__.add("failureDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cancellationDetails")
        private CancellationDetails cancellationDetails;

        public Builder cancellationDetails(CancellationDetails cancellationDetails) {
            this.cancellationDetails = cancellationDetails;
            this.__explicitlySet__.add("cancellationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
        private String workingDirectory;

        public Builder workingDirectory(String workingDirectory) {
            this.workingDirectory = workingDirectory;
            this.__explicitlySet__.add("workingDirectory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("variables")
        private java.util.Map<String, String> variables;

        public Builder variables(java.util.Map<String, String> variables) {
            this.variables = variables;
            this.__explicitlySet__.add("variables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configSource")
        private ConfigSourceRecord configSource;

        public Builder configSource(ConfigSourceRecord configSource) {
            this.configSource = configSource;
            this.__explicitlySet__.add("configSource");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Job build() {
            Job __instance__ =
                    new Job(
                            id,
                            stackId,
                            compartmentId,
                            displayName,
                            operation,
                            jobOperationDetails,
                            applyJobPlanResolution,
                            resolvedPlanJobId,
                            timeCreated,
                            timeFinished,
                            lifecycleState,
                            failureDetails,
                            cancellationDetails,
                            workingDirectory,
                            variables,
                            configSource,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Job o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .stackId(o.getStackId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .operation(o.getOperation())
                            .jobOperationDetails(o.getJobOperationDetails())
                            .applyJobPlanResolution(o.getApplyJobPlanResolution())
                            .resolvedPlanJobId(o.getResolvedPlanJobId())
                            .timeCreated(o.getTimeCreated())
                            .timeFinished(o.getTimeFinished())
                            .lifecycleState(o.getLifecycleState())
                            .failureDetails(o.getFailureDetails())
                            .cancellationDetails(o.getCancellationDetails())
                            .workingDirectory(o.getWorkingDirectory())
                            .variables(o.getVariables())
                            .configSource(o.getConfigSource())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the stack that is associated with the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stackId")
    private final String stackId;

    public String getStackId() {
        return stackId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the job's associated stack resides.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The job's display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The type of job executing.
     **/
    public enum Operation {
        Plan("PLAN"),
        Apply("APPLY"),
        Destroy("DESTROY"),
        ImportTfState("IMPORT_TF_STATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Operation.class);

        private final String value;
        private static java.util.Map<String, Operation> map;

        static {
            map = new java.util.HashMap<>();
            for (Operation v : Operation.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Operation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Operation', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of job executing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final Operation operation;

    public Operation getOperation() {
        return operation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jobOperationDetails")
    private final JobOperationDetails jobOperationDetails;

    public JobOperationDetails getJobOperationDetails() {
        return jobOperationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("applyJobPlanResolution")
    private final ApplyJobPlanResolution applyJobPlanResolution;

    public ApplyJobPlanResolution getApplyJobPlanResolution() {
        return applyJobPlanResolution;
    }

    /**
     * Deprecated. Use the property {@code executionPlanJobId} in {@code jobOperationDetails} instead.
     * The plan job [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that was used (if this was an apply job and was not auto-approved).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resolvedPlanJobId")
    private final String resolvedPlanJobId;

    public String getResolvedPlanJobId() {
        return resolvedPlanJobId;
    }

    /**
     * The date and time when the job was created.
     * Format is defined by RFC3339.
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time when the job stopped running, irrespective of whether the job ran successfully.
     * Format is defined by RFC3339.
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * Current state of the specified job.
     * For more information about job lifecycle states in Resource Manager, see
     * [Key Concepts](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resourcemanager.htm#concepts__JobStates).
     *
     **/
    public enum LifecycleState {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * Current state of the specified job.
     * For more information about job lifecycle states in Resource Manager, see
     * [Key Concepts](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resourcemanager.htm#concepts__JobStates).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("failureDetails")
    private final FailureDetails failureDetails;

    public FailureDetails getFailureDetails() {
        return failureDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cancellationDetails")
    private final CancellationDetails cancellationDetails;

    public CancellationDetails getCancellationDetails() {
        return cancellationDetails;
    }

    /**
     * File path to the directory to use for running Terraform.
     * If not specified, the root directory is used.
     * Required when using a zip Terraform configuration ({@code configSourceType} value of {@code ZIP_UPLOAD}) that contains folders.
     * Ignored for the {@code configSourceType} value of {@code COMPARTMENT_CONFIG_SOURCE}.
     * For more information about required and recommended file structure, see
     * [File Structure (Terraform Configurations for Resource Manager)](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/terraformconfigresourcemanager.htm#filestructure).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
    private final String workingDirectory;

    public String getWorkingDirectory() {
        return workingDirectory;
    }

    /**
     * Terraform variables associated with this resource.
     * Maximum number of variables supported is 250.
     * The maximum size of each variable, including both name and value, is 8192 bytes.
     * Example: {@code {"CompartmentId": "compartment-id-value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    private final java.util.Map<String, String> variables;

    public java.util.Map<String, String> getVariables() {
        return variables;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configSource")
    private final ConfigSourceRecord configSource;

    public ConfigSourceRecord getConfigSource() {
        return configSource;
    }

    /**
     * Free-form tags associated with this resource. Each tag is a key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Job(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", stackId=").append(String.valueOf(this.stackId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(", jobOperationDetails=").append(String.valueOf(this.jobOperationDetails));
        sb.append(", applyJobPlanResolution=").append(String.valueOf(this.applyJobPlanResolution));
        sb.append(", resolvedPlanJobId=").append(String.valueOf(this.resolvedPlanJobId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", failureDetails=").append(String.valueOf(this.failureDetails));
        sb.append(", cancellationDetails=").append(String.valueOf(this.cancellationDetails));
        sb.append(", workingDirectory=").append(String.valueOf(this.workingDirectory));
        sb.append(", variables=").append(String.valueOf(this.variables));
        sb.append(", configSource=").append(String.valueOf(this.configSource));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Job)) {
            return false;
        }

        Job other = (Job) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.stackId, other.stackId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.operation, other.operation)
                && java.util.Objects.equals(this.jobOperationDetails, other.jobOperationDetails)
                && java.util.Objects.equals(
                        this.applyJobPlanResolution, other.applyJobPlanResolution)
                && java.util.Objects.equals(this.resolvedPlanJobId, other.resolvedPlanJobId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.failureDetails, other.failureDetails)
                && java.util.Objects.equals(this.cancellationDetails, other.cancellationDetails)
                && java.util.Objects.equals(this.workingDirectory, other.workingDirectory)
                && java.util.Objects.equals(this.variables, other.variables)
                && java.util.Objects.equals(this.configSource, other.configSource)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.stackId == null ? 43 : this.stackId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result =
                (result * PRIME)
                        + (this.jobOperationDetails == null
                                ? 43
                                : this.jobOperationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.applyJobPlanResolution == null
                                ? 43
                                : this.applyJobPlanResolution.hashCode());
        result =
                (result * PRIME)
                        + (this.resolvedPlanJobId == null ? 43 : this.resolvedPlanJobId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.failureDetails == null ? 43 : this.failureDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.cancellationDetails == null
                                ? 43
                                : this.cancellationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.workingDirectory == null ? 43 : this.workingDirectory.hashCode());
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        result = (result * PRIME) + (this.configSource == null ? 43 : this.configSource.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
