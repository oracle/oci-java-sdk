/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Job details that are specific to an apply rollback job. For more information about apply rollback jobs, see
 * [Creating an Apply Rollback Job](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/create-job-apply-rollback.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApplyRollbackJobOperationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "operation"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApplyRollbackJobOperationDetails extends JobOperationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("terraformAdvancedOptions")
        private TerraformAdvancedOptions terraformAdvancedOptions;

        public Builder terraformAdvancedOptions(TerraformAdvancedOptions terraformAdvancedOptions) {
            this.terraformAdvancedOptions = terraformAdvancedOptions;
            this.__explicitlySet__.add("terraformAdvancedOptions");
            return this;
        }
        /**
         * Specifies the source of the execution plan for rollback to apply.
         * Use {@code AUTO_APPROVED} to run the job without an execution plan for rollback.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executionPlanRollbackStrategy")
        private ExecutionPlanRollbackStrategy executionPlanRollbackStrategy;

        /**
         * Specifies the source of the execution plan for rollback to apply.
         * Use {@code AUTO_APPROVED} to run the job without an execution plan for rollback.
         *
         * @param executionPlanRollbackStrategy the value to set
         * @return this builder
         **/
        public Builder executionPlanRollbackStrategy(
                ExecutionPlanRollbackStrategy executionPlanRollbackStrategy) {
            this.executionPlanRollbackStrategy = executionPlanRollbackStrategy;
            this.__explicitlySet__.add("executionPlanRollbackStrategy");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a plan rollback job, for use when specifying {@code "FROM_PLAN_ROLLBACK_JOB_ID"} as the {@code executionPlanRollbackStrategy}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executionPlanRollbackJobId")
        private String executionPlanRollbackJobId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a plan rollback job, for use when specifying {@code "FROM_PLAN_ROLLBACK_JOB_ID"} as the {@code executionPlanRollbackStrategy}.
         *
         * @param executionPlanRollbackJobId the value to set
         * @return this builder
         **/
        public Builder executionPlanRollbackJobId(String executionPlanRollbackJobId) {
            this.executionPlanRollbackJobId = executionPlanRollbackJobId;
            this.__explicitlySet__.add("executionPlanRollbackJobId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a successful apply job, for use when specifying {@code "AUTO_APPROVED"} as the {@code executionPlanRollbackStrategy}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetRollbackJobId")
        private String targetRollbackJobId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a successful apply job, for use when specifying {@code "AUTO_APPROVED"} as the {@code executionPlanRollbackStrategy}.
         *
         * @param targetRollbackJobId the value to set
         * @return this builder
         **/
        public Builder targetRollbackJobId(String targetRollbackJobId) {
            this.targetRollbackJobId = targetRollbackJobId;
            this.__explicitlySet__.add("targetRollbackJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplyRollbackJobOperationDetails build() {
            ApplyRollbackJobOperationDetails model =
                    new ApplyRollbackJobOperationDetails(
                            this.terraformAdvancedOptions,
                            this.executionPlanRollbackStrategy,
                            this.executionPlanRollbackJobId,
                            this.targetRollbackJobId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplyRollbackJobOperationDetails model) {
            if (model.wasPropertyExplicitlySet("terraformAdvancedOptions")) {
                this.terraformAdvancedOptions(model.getTerraformAdvancedOptions());
            }
            if (model.wasPropertyExplicitlySet("executionPlanRollbackStrategy")) {
                this.executionPlanRollbackStrategy(model.getExecutionPlanRollbackStrategy());
            }
            if (model.wasPropertyExplicitlySet("executionPlanRollbackJobId")) {
                this.executionPlanRollbackJobId(model.getExecutionPlanRollbackJobId());
            }
            if (model.wasPropertyExplicitlySet("targetRollbackJobId")) {
                this.targetRollbackJobId(model.getTargetRollbackJobId());
            }
            return this;
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

    @Deprecated
    public ApplyRollbackJobOperationDetails(
            TerraformAdvancedOptions terraformAdvancedOptions,
            ExecutionPlanRollbackStrategy executionPlanRollbackStrategy,
            String executionPlanRollbackJobId,
            String targetRollbackJobId) {
        super();
        this.terraformAdvancedOptions = terraformAdvancedOptions;
        this.executionPlanRollbackStrategy = executionPlanRollbackStrategy;
        this.executionPlanRollbackJobId = executionPlanRollbackJobId;
        this.targetRollbackJobId = targetRollbackJobId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("terraformAdvancedOptions")
    private final TerraformAdvancedOptions terraformAdvancedOptions;

    public TerraformAdvancedOptions getTerraformAdvancedOptions() {
        return terraformAdvancedOptions;
    }

    /**
     * Specifies the source of the execution plan for rollback to apply.
     * Use {@code AUTO_APPROVED} to run the job without an execution plan for rollback.
     *
     **/
    public enum ExecutionPlanRollbackStrategy {
        FromPlanRollbackJobId("FROM_PLAN_ROLLBACK_JOB_ID"),
        FromLatestPlanRollbackJobId("FROM_LATEST_PLAN_ROLLBACK_JOB_ID"),
        AutoApproved("AUTO_APPROVED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExecutionPlanRollbackStrategy.class);

        private final String value;
        private static java.util.Map<String, ExecutionPlanRollbackStrategy> map;

        static {
            map = new java.util.HashMap<>();
            for (ExecutionPlanRollbackStrategy v : ExecutionPlanRollbackStrategy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExecutionPlanRollbackStrategy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExecutionPlanRollbackStrategy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExecutionPlanRollbackStrategy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the source of the execution plan for rollback to apply.
     * Use {@code AUTO_APPROVED} to run the job without an execution plan for rollback.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionPlanRollbackStrategy")
    private final ExecutionPlanRollbackStrategy executionPlanRollbackStrategy;

    /**
     * Specifies the source of the execution plan for rollback to apply.
     * Use {@code AUTO_APPROVED} to run the job without an execution plan for rollback.
     *
     * @return the value
     **/
    public ExecutionPlanRollbackStrategy getExecutionPlanRollbackStrategy() {
        return executionPlanRollbackStrategy;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a plan rollback job, for use when specifying {@code "FROM_PLAN_ROLLBACK_JOB_ID"} as the {@code executionPlanRollbackStrategy}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionPlanRollbackJobId")
    private final String executionPlanRollbackJobId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a plan rollback job, for use when specifying {@code "FROM_PLAN_ROLLBACK_JOB_ID"} as the {@code executionPlanRollbackStrategy}.
     *
     * @return the value
     **/
    public String getExecutionPlanRollbackJobId() {
        return executionPlanRollbackJobId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a successful apply job, for use when specifying {@code "AUTO_APPROVED"} as the {@code executionPlanRollbackStrategy}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetRollbackJobId")
    private final String targetRollbackJobId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a successful apply job, for use when specifying {@code "AUTO_APPROVED"} as the {@code executionPlanRollbackStrategy}.
     *
     * @return the value
     **/
    public String getTargetRollbackJobId() {
        return targetRollbackJobId;
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
        sb.append("ApplyRollbackJobOperationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", terraformAdvancedOptions=")
                .append(String.valueOf(this.terraformAdvancedOptions));
        sb.append(", executionPlanRollbackStrategy=")
                .append(String.valueOf(this.executionPlanRollbackStrategy));
        sb.append(", executionPlanRollbackJobId=")
                .append(String.valueOf(this.executionPlanRollbackJobId));
        sb.append(", targetRollbackJobId=").append(String.valueOf(this.targetRollbackJobId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplyRollbackJobOperationDetails)) {
            return false;
        }

        ApplyRollbackJobOperationDetails other = (ApplyRollbackJobOperationDetails) o;
        return java.util.Objects.equals(
                        this.terraformAdvancedOptions, other.terraformAdvancedOptions)
                && java.util.Objects.equals(
                        this.executionPlanRollbackStrategy, other.executionPlanRollbackStrategy)
                && java.util.Objects.equals(
                        this.executionPlanRollbackJobId, other.executionPlanRollbackJobId)
                && java.util.Objects.equals(this.targetRollbackJobId, other.targetRollbackJobId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.terraformAdvancedOptions == null
                                ? 43
                                : this.terraformAdvancedOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.executionPlanRollbackStrategy == null
                                ? 43
                                : this.executionPlanRollbackStrategy.hashCode());
        result =
                (result * PRIME)
                        + (this.executionPlanRollbackJobId == null
                                ? 43
                                : this.executionPlanRollbackJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetRollbackJobId == null
                                ? 43
                                : this.targetRollbackJobId.hashCode());
        return result;
    }
}
