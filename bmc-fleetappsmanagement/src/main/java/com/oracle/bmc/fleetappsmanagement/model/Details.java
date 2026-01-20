/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The details of the task. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Details.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Details extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "executionDetails",
        "platform",
        "osType",
        "scope",
        "properties",
        "isDiscoveryOutputTask",
        "isApplySubjectTask",
        "operation"
    })
    public Details(
            ExecutionDetails executionDetails,
            String platform,
            OsType osType,
            TaskScope scope,
            Properties properties,
            Boolean isDiscoveryOutputTask,
            Boolean isApplySubjectTask,
            String operation) {
        super();
        this.executionDetails = executionDetails;
        this.platform = platform;
        this.osType = osType;
        this.scope = scope;
        this.properties = properties;
        this.isDiscoveryOutputTask = isDiscoveryOutputTask;
        this.isApplySubjectTask = isApplySubjectTask;
        this.operation = operation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("executionDetails")
        private ExecutionDetails executionDetails;

        public Builder executionDetails(ExecutionDetails executionDetails) {
            this.executionDetails = executionDetails;
            this.__explicitlySet__.add("executionDetails");
            return this;
        }
        /** The platform of the runbook. */
        @com.fasterxml.jackson.annotation.JsonProperty("platform")
        private String platform;

        /**
         * The platform of the runbook.
         *
         * @param platform the value to set
         * @return this builder
         */
        public Builder platform(String platform) {
            this.platform = platform;
            this.__explicitlySet__.add("platform");
            return this;
        }
        /** The OS for the task */
        @com.fasterxml.jackson.annotation.JsonProperty("osType")
        private OsType osType;

        /**
         * The OS for the task
         *
         * @param osType the value to set
         * @return this builder
         */
        public Builder osType(OsType osType) {
            this.osType = osType;
            this.__explicitlySet__.add("osType");
            return this;
        }
        /** The scope of the task */
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private TaskScope scope;

        /**
         * The scope of the task
         *
         * @param scope the value to set
         * @return this builder
         */
        public Builder scope(TaskScope scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private Properties properties;

        public Builder properties(Properties properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }
        /** Is this a discovery output task? */
        @com.fasterxml.jackson.annotation.JsonProperty("isDiscoveryOutputTask")
        private Boolean isDiscoveryOutputTask;

        /**
         * Is this a discovery output task?
         *
         * @param isDiscoveryOutputTask the value to set
         * @return this builder
         */
        public Builder isDiscoveryOutputTask(Boolean isDiscoveryOutputTask) {
            this.isDiscoveryOutputTask = isDiscoveryOutputTask;
            this.__explicitlySet__.add("isDiscoveryOutputTask");
            return this;
        }
        /**
         * Is this an Apply Subject Task? Set this to true for a Patch Execution Task which applies
         * patches(subjects) on a target.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isApplySubjectTask")
        private Boolean isApplySubjectTask;

        /**
         * Is this an Apply Subject Task? Set this to true for a Patch Execution Task which applies
         * patches(subjects) on a target.
         *
         * @param isApplySubjectTask the value to set
         * @return this builder
         */
        public Builder isApplySubjectTask(Boolean isApplySubjectTask) {
            this.isApplySubjectTask = isApplySubjectTask;
            this.__explicitlySet__.add("isApplySubjectTask");
            return this;
        }
        /** The lifecycle operation performed by the runbook. */
        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private String operation;

        /**
         * The lifecycle operation performed by the runbook.
         *
         * @param operation the value to set
         * @return this builder
         */
        public Builder operation(String operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Details build() {
            Details model =
                    new Details(
                            this.executionDetails,
                            this.platform,
                            this.osType,
                            this.scope,
                            this.properties,
                            this.isDiscoveryOutputTask,
                            this.isApplySubjectTask,
                            this.operation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Details model) {
            if (model.wasPropertyExplicitlySet("executionDetails")) {
                this.executionDetails(model.getExecutionDetails());
            }
            if (model.wasPropertyExplicitlySet("platform")) {
                this.platform(model.getPlatform());
            }
            if (model.wasPropertyExplicitlySet("osType")) {
                this.osType(model.getOsType());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("isDiscoveryOutputTask")) {
                this.isDiscoveryOutputTask(model.getIsDiscoveryOutputTask());
            }
            if (model.wasPropertyExplicitlySet("isApplySubjectTask")) {
                this.isApplySubjectTask(model.getIsApplySubjectTask());
            }
            if (model.wasPropertyExplicitlySet("operation")) {
                this.operation(model.getOperation());
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

    @com.fasterxml.jackson.annotation.JsonProperty("executionDetails")
    private final ExecutionDetails executionDetails;

    public ExecutionDetails getExecutionDetails() {
        return executionDetails;
    }

    /** The platform of the runbook. */
    @com.fasterxml.jackson.annotation.JsonProperty("platform")
    private final String platform;

    /**
     * The platform of the runbook.
     *
     * @return the value
     */
    public String getPlatform() {
        return platform;
    }

    /** The OS for the task */
    @com.fasterxml.jackson.annotation.JsonProperty("osType")
    private final OsType osType;

    /**
     * The OS for the task
     *
     * @return the value
     */
    public OsType getOsType() {
        return osType;
    }

    /** The scope of the task */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final TaskScope scope;

    /**
     * The scope of the task
     *
     * @return the value
     */
    public TaskScope getScope() {
        return scope;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final Properties properties;

    public Properties getProperties() {
        return properties;
    }

    /** Is this a discovery output task? */
    @com.fasterxml.jackson.annotation.JsonProperty("isDiscoveryOutputTask")
    private final Boolean isDiscoveryOutputTask;

    /**
     * Is this a discovery output task?
     *
     * @return the value
     */
    public Boolean getIsDiscoveryOutputTask() {
        return isDiscoveryOutputTask;
    }

    /**
     * Is this an Apply Subject Task? Set this to true for a Patch Execution Task which applies
     * patches(subjects) on a target.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isApplySubjectTask")
    private final Boolean isApplySubjectTask;

    /**
     * Is this an Apply Subject Task? Set this to true for a Patch Execution Task which applies
     * patches(subjects) on a target.
     *
     * @return the value
     */
    public Boolean getIsApplySubjectTask() {
        return isApplySubjectTask;
    }

    /** The lifecycle operation performed by the runbook. */
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final String operation;

    /**
     * The lifecycle operation performed by the runbook.
     *
     * @return the value
     */
    public String getOperation() {
        return operation;
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
        sb.append("Details(");
        sb.append("super=").append(super.toString());
        sb.append("executionDetails=").append(String.valueOf(this.executionDetails));
        sb.append(", platform=").append(String.valueOf(this.platform));
        sb.append(", osType=").append(String.valueOf(this.osType));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", isDiscoveryOutputTask=").append(String.valueOf(this.isDiscoveryOutputTask));
        sb.append(", isApplySubjectTask=").append(String.valueOf(this.isApplySubjectTask));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Details)) {
            return false;
        }

        Details other = (Details) o;
        return java.util.Objects.equals(this.executionDetails, other.executionDetails)
                && java.util.Objects.equals(this.platform, other.platform)
                && java.util.Objects.equals(this.osType, other.osType)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.isDiscoveryOutputTask, other.isDiscoveryOutputTask)
                && java.util.Objects.equals(this.isApplySubjectTask, other.isApplySubjectTask)
                && java.util.Objects.equals(this.operation, other.operation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.executionDetails == null ? 43 : this.executionDetails.hashCode());
        result = (result * PRIME) + (this.platform == null ? 43 : this.platform.hashCode());
        result = (result * PRIME) + (this.osType == null ? 43 : this.osType.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result =
                (result * PRIME)
                        + (this.isDiscoveryOutputTask == null
                                ? 43
                                : this.isDiscoveryOutputTask.hashCode());
        result =
                (result * PRIME)
                        + (this.isApplySubjectTask == null
                                ? 43
                                : this.isApplySubjectTask.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
