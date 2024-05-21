/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * A set of details about a single container instance returned by list APIs.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ContainerInstanceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ContainerInstanceSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "freeformTags",
        "definedTags",
        "systemTags",
        "availabilityDomain",
        "faultDomain",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "shape",
        "shapeConfig",
        "containerCount",
        "gracefulShutdownTimeoutInSeconds",
        "volumeCount",
        "containerRestartPolicy"
    })
    public ContainerInstanceSummary(
            String id,
            String displayName,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String availabilityDomain,
            String faultDomain,
            ContainerInstance.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String shape,
            ContainerInstanceShapeConfig shapeConfig,
            Integer containerCount,
            Long gracefulShutdownTimeoutInSeconds,
            Integer volumeCount,
            ContainerInstance.ContainerRestartPolicy containerRestartPolicy) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.availabilityDomain = availabilityDomain;
        this.faultDomain = faultDomain;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.shape = shape;
        this.shapeConfig = shapeConfig;
        this.containerCount = containerCount;
        this.gracefulShutdownTimeoutInSeconds = gracefulShutdownTimeoutInSeconds;
        this.volumeCount = volumeCount;
        this.containerRestartPolicy = containerRestartPolicy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID that cannot be changed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID that cannot be changed.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the compartment to create the container instance in.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment to create the container instance in.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}.
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}.
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The availability domain where the container instance runs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain where the container instance runs.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The fault domain where the container instance runs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * The fault domain where the container instance runs.
         * @param faultDomain the value to set
         * @return this builder
         **/
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /**
         * The current state of the container instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ContainerInstance.LifecycleState lifecycleState;

        /**
         * The current state of the container instance.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(ContainerInstance.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message that describes the current state of the container instance in more detail. Can be used to provide
         * actionable information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message that describes the current state of the container instance in more detail. Can be used to provide
         * actionable information.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The time the container instance was created, in the format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the container instance was created, in the format defined by RFC3339.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the container instance was updated, in the format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the container instance was updated, in the format defined by RFC3339.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The shape of the container instance. The shape determines the resources available to the container instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the container instance. The shape determines the resources available to the container instance.
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
        private ContainerInstanceShapeConfig shapeConfig;

        public Builder shapeConfig(ContainerInstanceShapeConfig shapeConfig) {
            this.shapeConfig = shapeConfig;
            this.__explicitlySet__.add("shapeConfig");
            return this;
        }
        /**
         * The number of containers in the container instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("containerCount")
        private Integer containerCount;

        /**
         * The number of containers in the container instance.
         * @param containerCount the value to set
         * @return this builder
         **/
        public Builder containerCount(Integer containerCount) {
            this.containerCount = containerCount;
            this.__explicitlySet__.add("containerCount");
            return this;
        }
        /**
         * The amount of time that processes in a container have to gracefully end when the container must be stopped. For example, when you delete a container instance. After the timeout is reached, the processes are sent a signal to be deleted.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gracefulShutdownTimeoutInSeconds")
        private Long gracefulShutdownTimeoutInSeconds;

        /**
         * The amount of time that processes in a container have to gracefully end when the container must be stopped. For example, when you delete a container instance. After the timeout is reached, the processes are sent a signal to be deleted.
         * @param gracefulShutdownTimeoutInSeconds the value to set
         * @return this builder
         **/
        public Builder gracefulShutdownTimeoutInSeconds(Long gracefulShutdownTimeoutInSeconds) {
            this.gracefulShutdownTimeoutInSeconds = gracefulShutdownTimeoutInSeconds;
            this.__explicitlySet__.add("gracefulShutdownTimeoutInSeconds");
            return this;
        }
        /**
         * The number of volumes that are attached to the container instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumeCount")
        private Integer volumeCount;

        /**
         * The number of volumes that are attached to the container instance.
         * @param volumeCount the value to set
         * @return this builder
         **/
        public Builder volumeCount(Integer volumeCount) {
            this.volumeCount = volumeCount;
            this.__explicitlySet__.add("volumeCount");
            return this;
        }
        /**
         * Container Restart Policy
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("containerRestartPolicy")
        private ContainerInstance.ContainerRestartPolicy containerRestartPolicy;

        /**
         * Container Restart Policy
         * @param containerRestartPolicy the value to set
         * @return this builder
         **/
        public Builder containerRestartPolicy(
                ContainerInstance.ContainerRestartPolicy containerRestartPolicy) {
            this.containerRestartPolicy = containerRestartPolicy;
            this.__explicitlySet__.add("containerRestartPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerInstanceSummary build() {
            ContainerInstanceSummary model =
                    new ContainerInstanceSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.availabilityDomain,
                            this.faultDomain,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.shape,
                            this.shapeConfig,
                            this.containerCount,
                            this.gracefulShutdownTimeoutInSeconds,
                            this.volumeCount,
                            this.containerRestartPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerInstanceSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("shapeConfig")) {
                this.shapeConfig(model.getShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("containerCount")) {
                this.containerCount(model.getContainerCount());
            }
            if (model.wasPropertyExplicitlySet("gracefulShutdownTimeoutInSeconds")) {
                this.gracefulShutdownTimeoutInSeconds(model.getGracefulShutdownTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("volumeCount")) {
                this.volumeCount(model.getVolumeCount());
            }
            if (model.wasPropertyExplicitlySet("containerRestartPolicy")) {
                this.containerRestartPolicy(model.getContainerRestartPolicy());
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

    /**
     * OCID that cannot be changed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID that cannot be changed.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the compartment to create the container instance in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment to create the container instance in.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}.
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}.
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * The availability domain where the container instance runs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain where the container instance runs.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The fault domain where the container instance runs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * The fault domain where the container instance runs.
     * @return the value
     **/
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The current state of the container instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ContainerInstance.LifecycleState lifecycleState;

    /**
     * The current state of the container instance.
     * @return the value
     **/
    public ContainerInstance.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message that describes the current state of the container instance in more detail. Can be used to provide
     * actionable information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message that describes the current state of the container instance in more detail. Can be used to provide
     * actionable information.
     *
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The time the container instance was created, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the container instance was created, in the format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the container instance was updated, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the container instance was updated, in the format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The shape of the container instance. The shape determines the resources available to the container instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the container instance. The shape determines the resources available to the container instance.
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
    private final ContainerInstanceShapeConfig shapeConfig;

    public ContainerInstanceShapeConfig getShapeConfig() {
        return shapeConfig;
    }

    /**
     * The number of containers in the container instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerCount")
    private final Integer containerCount;

    /**
     * The number of containers in the container instance.
     * @return the value
     **/
    public Integer getContainerCount() {
        return containerCount;
    }

    /**
     * The amount of time that processes in a container have to gracefully end when the container must be stopped. For example, when you delete a container instance. After the timeout is reached, the processes are sent a signal to be deleted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gracefulShutdownTimeoutInSeconds")
    private final Long gracefulShutdownTimeoutInSeconds;

    /**
     * The amount of time that processes in a container have to gracefully end when the container must be stopped. For example, when you delete a container instance. After the timeout is reached, the processes are sent a signal to be deleted.
     * @return the value
     **/
    public Long getGracefulShutdownTimeoutInSeconds() {
        return gracefulShutdownTimeoutInSeconds;
    }

    /**
     * The number of volumes that are attached to the container instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeCount")
    private final Integer volumeCount;

    /**
     * The number of volumes that are attached to the container instance.
     * @return the value
     **/
    public Integer getVolumeCount() {
        return volumeCount;
    }

    /**
     * Container Restart Policy
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerRestartPolicy")
    private final ContainerInstance.ContainerRestartPolicy containerRestartPolicy;

    /**
     * Container Restart Policy
     * @return the value
     **/
    public ContainerInstance.ContainerRestartPolicy getContainerRestartPolicy() {
        return containerRestartPolicy;
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
        sb.append("ContainerInstanceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", shapeConfig=").append(String.valueOf(this.shapeConfig));
        sb.append(", containerCount=").append(String.valueOf(this.containerCount));
        sb.append(", gracefulShutdownTimeoutInSeconds=")
                .append(String.valueOf(this.gracefulShutdownTimeoutInSeconds));
        sb.append(", volumeCount=").append(String.valueOf(this.volumeCount));
        sb.append(", containerRestartPolicy=").append(String.valueOf(this.containerRestartPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerInstanceSummary)) {
            return false;
        }

        ContainerInstanceSummary other = (ContainerInstanceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.shapeConfig, other.shapeConfig)
                && java.util.Objects.equals(this.containerCount, other.containerCount)
                && java.util.Objects.equals(
                        this.gracefulShutdownTimeoutInSeconds,
                        other.gracefulShutdownTimeoutInSeconds)
                && java.util.Objects.equals(this.volumeCount, other.volumeCount)
                && java.util.Objects.equals(
                        this.containerRestartPolicy, other.containerRestartPolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.shapeConfig == null ? 43 : this.shapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.containerCount == null ? 43 : this.containerCount.hashCode());
        result =
                (result * PRIME)
                        + (this.gracefulShutdownTimeoutInSeconds == null
                                ? 43
                                : this.gracefulShutdownTimeoutInSeconds.hashCode());
        result = (result * PRIME) + (this.volumeCount == null ? 43 : this.volumeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.containerRestartPolicy == null
                                ? 43
                                : this.containerRestartPolicy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
