/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.model;

/**
 * compute task represents a single executable command together with its dependencies and resources.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ComputeTask.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeTask extends BatchTask {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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

        @com.fasterxml.jackson.annotation.JsonProperty("entitlementClaims")
        private java.util.List<String> entitlementClaims;

        public Builder entitlementClaims(java.util.List<String> entitlementClaims) {
            this.entitlementClaims = entitlementClaims;
            this.__explicitlySet__.add("entitlementClaims");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
        private java.util.List<String> dependencies;

        public Builder dependencies(java.util.List<String> dependencies) {
            this.dependencies = dependencies;
            this.__explicitlySet__.add("dependencies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
        private java.util.List<EnvironmentVariable> environmentVariables;

        public Builder environmentVariables(
                java.util.List<EnvironmentVariable> environmentVariables) {
            this.environmentVariables = environmentVariables;
            this.__explicitlySet__.add("environmentVariables");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * batch task profile used for this task.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("batchTaskProfileId")
        private String batchTaskProfileId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * batch task profile used for this task.
         *
         * @param batchTaskProfileId the value to set
         * @return this builder
         */
        public Builder batchTaskProfileId(String batchTaskProfileId) {
            this.batchTaskProfileId = batchTaskProfileId;
            this.__explicitlySet__.add("batchTaskProfileId");
            return this;
        }
        /** An executable command to start the processing of this task. */
        @com.fasterxml.jackson.annotation.JsonProperty("command")
        private java.util.List<String> command;

        /**
         * An executable command to start the processing of this task.
         *
         * @param command the value to set
         * @return this builder
         */
        public Builder command(java.util.List<String> command) {
            this.command = command;
            this.__explicitlySet__.add("command");
            return this;
        }
        /** Task arguments. */
        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private java.util.List<String> arguments;

        /**
         * Task arguments.
         *
         * @param arguments the value to set
         * @return this builder
         */
        public Builder arguments(java.util.List<String> arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fleetAssignmentPolicy")
        private FleetAssignmentPolicy fleetAssignmentPolicy;

        public Builder fleetAssignmentPolicy(FleetAssignmentPolicy fleetAssignmentPolicy) {
            this.fleetAssignmentPolicy = fleetAssignmentPolicy;
            this.__explicitlySet__.add("fleetAssignmentPolicy");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * BatchTaskEnvironment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("batchTaskEnvironmentId")
        private String batchTaskEnvironmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * BatchTaskEnvironment.
         *
         * @param batchTaskEnvironmentId the value to set
         * @return this builder
         */
        public Builder batchTaskEnvironmentId(String batchTaskEnvironmentId) {
            this.batchTaskEnvironmentId = batchTaskEnvironmentId;
            this.__explicitlySet__.add("batchTaskEnvironmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeTask build() {
            ComputeTask model =
                    new ComputeTask(
                            this.id,
                            this.name,
                            this.description,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.entitlementClaims,
                            this.dependencies,
                            this.environmentVariables,
                            this.batchTaskProfileId,
                            this.command,
                            this.arguments,
                            this.fleetAssignmentPolicy,
                            this.batchTaskEnvironmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeTask model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("entitlementClaims")) {
                this.entitlementClaims(model.getEntitlementClaims());
            }
            if (model.wasPropertyExplicitlySet("dependencies")) {
                this.dependencies(model.getDependencies());
            }
            if (model.wasPropertyExplicitlySet("environmentVariables")) {
                this.environmentVariables(model.getEnvironmentVariables());
            }
            if (model.wasPropertyExplicitlySet("batchTaskProfileId")) {
                this.batchTaskProfileId(model.getBatchTaskProfileId());
            }
            if (model.wasPropertyExplicitlySet("command")) {
                this.command(model.getCommand());
            }
            if (model.wasPropertyExplicitlySet("arguments")) {
                this.arguments(model.getArguments());
            }
            if (model.wasPropertyExplicitlySet("fleetAssignmentPolicy")) {
                this.fleetAssignmentPolicy(model.getFleetAssignmentPolicy());
            }
            if (model.wasPropertyExplicitlySet("batchTaskEnvironmentId")) {
                this.batchTaskEnvironmentId(model.getBatchTaskEnvironmentId());
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
    public ComputeTask(
            String id,
            String name,
            String description,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.List<String> entitlementClaims,
            java.util.List<String> dependencies,
            java.util.List<EnvironmentVariable> environmentVariables,
            String batchTaskProfileId,
            java.util.List<String> command,
            java.util.List<String> arguments,
            FleetAssignmentPolicy fleetAssignmentPolicy,
            String batchTaskEnvironmentId) {
        super(
                id,
                name,
                description,
                lifecycleState,
                lifecycleDetails,
                entitlementClaims,
                dependencies,
                environmentVariables);
        this.batchTaskProfileId = batchTaskProfileId;
        this.command = command;
        this.arguments = arguments;
        this.fleetAssignmentPolicy = fleetAssignmentPolicy;
        this.batchTaskEnvironmentId = batchTaskEnvironmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * batch task profile used for this task.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("batchTaskProfileId")
    private final String batchTaskProfileId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * batch task profile used for this task.
     *
     * @return the value
     */
    public String getBatchTaskProfileId() {
        return batchTaskProfileId;
    }

    /** An executable command to start the processing of this task. */
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    private final java.util.List<String> command;

    /**
     * An executable command to start the processing of this task.
     *
     * @return the value
     */
    public java.util.List<String> getCommand() {
        return command;
    }

    /** Task arguments. */
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    private final java.util.List<String> arguments;

    /**
     * Task arguments.
     *
     * @return the value
     */
    public java.util.List<String> getArguments() {
        return arguments;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fleetAssignmentPolicy")
    private final FleetAssignmentPolicy fleetAssignmentPolicy;

    public FleetAssignmentPolicy getFleetAssignmentPolicy() {
        return fleetAssignmentPolicy;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * BatchTaskEnvironment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("batchTaskEnvironmentId")
    private final String batchTaskEnvironmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * BatchTaskEnvironment.
     *
     * @return the value
     */
    public String getBatchTaskEnvironmentId() {
        return batchTaskEnvironmentId;
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
        sb.append("ComputeTask(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", batchTaskProfileId=").append(String.valueOf(this.batchTaskProfileId));
        sb.append(", command=").append(String.valueOf(this.command));
        sb.append(", arguments=").append(String.valueOf(this.arguments));
        sb.append(", fleetAssignmentPolicy=").append(String.valueOf(this.fleetAssignmentPolicy));
        sb.append(", batchTaskEnvironmentId=").append(String.valueOf(this.batchTaskEnvironmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeTask)) {
            return false;
        }

        ComputeTask other = (ComputeTask) o;
        return java.util.Objects.equals(this.batchTaskProfileId, other.batchTaskProfileId)
                && java.util.Objects.equals(this.command, other.command)
                && java.util.Objects.equals(this.arguments, other.arguments)
                && java.util.Objects.equals(this.fleetAssignmentPolicy, other.fleetAssignmentPolicy)
                && java.util.Objects.equals(
                        this.batchTaskEnvironmentId, other.batchTaskEnvironmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.batchTaskProfileId == null
                                ? 43
                                : this.batchTaskProfileId.hashCode());
        result = (result * PRIME) + (this.command == null ? 43 : this.command.hashCode());
        result = (result * PRIME) + (this.arguments == null ? 43 : this.arguments.hashCode());
        result =
                (result * PRIME)
                        + (this.fleetAssignmentPolicy == null
                                ? 43
                                : this.fleetAssignmentPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.batchTaskEnvironmentId == null
                                ? 43
                                : this.batchTaskEnvironmentId.hashCode());
        return result;
    }
}
