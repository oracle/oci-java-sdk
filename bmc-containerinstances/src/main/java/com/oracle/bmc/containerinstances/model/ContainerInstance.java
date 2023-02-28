/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * A ContainerInstance for hosting Containers.
 *
 * <p>If this ContainerInstance is DELETED, the record will remain visible for a short period of
 * time before being permanently removed. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ContainerInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ContainerInstance
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        "volumes",
        "volumeCount",
        "containers",
        "containerCount",
        "timeCreated",
        "timeUpdated",
        "shape",
        "shapeConfig",
        "vnics",
        "dnsConfig",
        "gracefulShutdownTimeoutInSeconds",
        "imagePullSecrets",
        "containerRestartPolicy"
    })
    public ContainerInstance(
            String id,
            String displayName,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String availabilityDomain,
            String faultDomain,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.List<ContainerVolume> volumes,
            Integer volumeCount,
            java.util.List<ContainerInstanceContainer> containers,
            Integer containerCount,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String shape,
            ContainerInstanceShapeConfig shapeConfig,
            java.util.List<ContainerVnic> vnics,
            ContainerDnsConfig dnsConfig,
            Long gracefulShutdownTimeoutInSeconds,
            java.util.List<ImagePullSecret> imagePullSecrets,
            ContainerRestartPolicy containerRestartPolicy) {
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
        this.volumes = volumes;
        this.volumeCount = volumeCount;
        this.containers = containers;
        this.containerCount = containerCount;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.shape = shape;
        this.shapeConfig = shapeConfig;
        this.vnics = vnics;
        this.dnsConfig = dnsConfig;
        this.gracefulShutdownTimeoutInSeconds = gracefulShutdownTimeoutInSeconds;
        this.imagePullSecrets = imagePullSecrets;
        this.containerRestartPolicy = containerRestartPolicy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable on creation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Display name for the ContainerInstance. Can be renamed. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for the ContainerInstance. Can be renamed.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** Availability Domain where the ContainerInstance is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * Availability Domain where the ContainerInstance is running.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /** Fault Domain where the ContainerInstance is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * Fault Domain where the ContainerInstance is running.
         *
         * @param faultDomain the value to set
         * @return this builder
         */
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /** The current state of the ContainerInstance. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the ContainerInstance.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * A Volume represents a directory with data that is accessible across multiple containers
         * in a ContainerInstance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("volumes")
        private java.util.List<ContainerVolume> volumes;

        /**
         * A Volume represents a directory with data that is accessible across multiple containers
         * in a ContainerInstance.
         *
         * @param volumes the value to set
         * @return this builder
         */
        public Builder volumes(java.util.List<ContainerVolume> volumes) {
            this.volumes = volumes;
            this.__explicitlySet__.add("volumes");
            return this;
        }
        /** The number of volumes that attached to this Instance */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeCount")
        private Integer volumeCount;

        /**
         * The number of volumes that attached to this Instance
         *
         * @param volumeCount the value to set
         * @return this builder
         */
        public Builder volumeCount(Integer volumeCount) {
            this.volumeCount = volumeCount;
            this.__explicitlySet__.add("volumeCount");
            return this;
        }
        /** The Containers on this Instance */
        @com.fasterxml.jackson.annotation.JsonProperty("containers")
        private java.util.List<ContainerInstanceContainer> containers;

        /**
         * The Containers on this Instance
         *
         * @param containers the value to set
         * @return this builder
         */
        public Builder containers(java.util.List<ContainerInstanceContainer> containers) {
            this.containers = containers;
            this.__explicitlySet__.add("containers");
            return this;
        }
        /** The number of containers on this Instance */
        @com.fasterxml.jackson.annotation.JsonProperty("containerCount")
        private Integer containerCount;

        /**
         * The number of containers on this Instance
         *
         * @param containerCount the value to set
         * @return this builder
         */
        public Builder containerCount(Integer containerCount) {
            this.containerCount = containerCount;
            this.__explicitlySet__.add("containerCount");
            return this;
        }
        /** The time the the ContainerInstance was created. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the ContainerInstance was created. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the ContainerInstance was updated. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the ContainerInstance was updated. An RFC3339 formatted datetime string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The shape of the Container Instance. The shape determines the resources available to the
         * Container Instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the Container Instance. The shape determines the resources available to the
         * Container Instance.
         *
         * @param shape the value to set
         * @return this builder
         */
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
        /** The virtual networks available to containers running on this Container Instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("vnics")
        private java.util.List<ContainerVnic> vnics;

        /**
         * The virtual networks available to containers running on this Container Instance.
         *
         * @param vnics the value to set
         * @return this builder
         */
        public Builder vnics(java.util.List<ContainerVnic> vnics) {
            this.vnics = vnics;
            this.__explicitlySet__.add("vnics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dnsConfig")
        private ContainerDnsConfig dnsConfig;

        public Builder dnsConfig(ContainerDnsConfig dnsConfig) {
            this.dnsConfig = dnsConfig;
            this.__explicitlySet__.add("dnsConfig");
            return this;
        }
        /**
         * Duration in seconds processes within a Container have to gracefully terminate. This
         * applies whenever a Container must be halted, such as when the Container Instance is
         * deleted. Processes will first be sent a termination signal. After this timeout is
         * reached, the processes will be sent a termination signal.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gracefulShutdownTimeoutInSeconds")
        private Long gracefulShutdownTimeoutInSeconds;

        /**
         * Duration in seconds processes within a Container have to gracefully terminate. This
         * applies whenever a Container must be halted, such as when the Container Instance is
         * deleted. Processes will first be sent a termination signal. After this timeout is
         * reached, the processes will be sent a termination signal.
         *
         * @param gracefulShutdownTimeoutInSeconds the value to set
         * @return this builder
         */
        public Builder gracefulShutdownTimeoutInSeconds(Long gracefulShutdownTimeoutInSeconds) {
            this.gracefulShutdownTimeoutInSeconds = gracefulShutdownTimeoutInSeconds;
            this.__explicitlySet__.add("gracefulShutdownTimeoutInSeconds");
            return this;
        }
        /** The image pull secrets for accessing private registry to pull images for containers */
        @com.fasterxml.jackson.annotation.JsonProperty("imagePullSecrets")
        private java.util.List<ImagePullSecret> imagePullSecrets;

        /**
         * The image pull secrets for accessing private registry to pull images for containers
         *
         * @param imagePullSecrets the value to set
         * @return this builder
         */
        public Builder imagePullSecrets(java.util.List<ImagePullSecret> imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
            this.__explicitlySet__.add("imagePullSecrets");
            return this;
        }
        /** The container restart policy is applied for all containers in container instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("containerRestartPolicy")
        private ContainerRestartPolicy containerRestartPolicy;

        /**
         * The container restart policy is applied for all containers in container instance.
         *
         * @param containerRestartPolicy the value to set
         * @return this builder
         */
        public Builder containerRestartPolicy(ContainerRestartPolicy containerRestartPolicy) {
            this.containerRestartPolicy = containerRestartPolicy;
            this.__explicitlySet__.add("containerRestartPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerInstance build() {
            ContainerInstance model =
                    new ContainerInstance(
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
                            this.volumes,
                            this.volumeCount,
                            this.containers,
                            this.containerCount,
                            this.timeCreated,
                            this.timeUpdated,
                            this.shape,
                            this.shapeConfig,
                            this.vnics,
                            this.dnsConfig,
                            this.gracefulShutdownTimeoutInSeconds,
                            this.imagePullSecrets,
                            this.containerRestartPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerInstance model) {
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
            if (model.wasPropertyExplicitlySet("volumes")) {
                this.volumes(model.getVolumes());
            }
            if (model.wasPropertyExplicitlySet("volumeCount")) {
                this.volumeCount(model.getVolumeCount());
            }
            if (model.wasPropertyExplicitlySet("containers")) {
                this.containers(model.getContainers());
            }
            if (model.wasPropertyExplicitlySet("containerCount")) {
                this.containerCount(model.getContainerCount());
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
            if (model.wasPropertyExplicitlySet("vnics")) {
                this.vnics(model.getVnics());
            }
            if (model.wasPropertyExplicitlySet("dnsConfig")) {
                this.dnsConfig(model.getDnsConfig());
            }
            if (model.wasPropertyExplicitlySet("gracefulShutdownTimeoutInSeconds")) {
                this.gracefulShutdownTimeoutInSeconds(model.getGracefulShutdownTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("imagePullSecrets")) {
                this.imagePullSecrets(model.getImagePullSecrets());
            }
            if (model.wasPropertyExplicitlySet("containerRestartPolicy")) {
                this.containerRestartPolicy(model.getContainerRestartPolicy());
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

    /** Unique identifier that is immutable on creation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Display name for the ContainerInstance. Can be renamed. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for the ContainerInstance. Can be renamed.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** Availability Domain where the ContainerInstance is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * Availability Domain where the ContainerInstance is running.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** Fault Domain where the ContainerInstance is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * Fault Domain where the ContainerInstance is running.
     *
     * @return the value
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    /** The current state of the ContainerInstance. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
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
    /** The current state of the ContainerInstance. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the ContainerInstance.
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

    /**
     * A Volume represents a directory with data that is accessible across multiple containers in a
     * ContainerInstance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumes")
    private final java.util.List<ContainerVolume> volumes;

    /**
     * A Volume represents a directory with data that is accessible across multiple containers in a
     * ContainerInstance.
     *
     * @return the value
     */
    public java.util.List<ContainerVolume> getVolumes() {
        return volumes;
    }

    /** The number of volumes that attached to this Instance */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeCount")
    private final Integer volumeCount;

    /**
     * The number of volumes that attached to this Instance
     *
     * @return the value
     */
    public Integer getVolumeCount() {
        return volumeCount;
    }

    /** The Containers on this Instance */
    @com.fasterxml.jackson.annotation.JsonProperty("containers")
    private final java.util.List<ContainerInstanceContainer> containers;

    /**
     * The Containers on this Instance
     *
     * @return the value
     */
    public java.util.List<ContainerInstanceContainer> getContainers() {
        return containers;
    }

    /** The number of containers on this Instance */
    @com.fasterxml.jackson.annotation.JsonProperty("containerCount")
    private final Integer containerCount;

    /**
     * The number of containers on this Instance
     *
     * @return the value
     */
    public Integer getContainerCount() {
        return containerCount;
    }

    /** The time the the ContainerInstance was created. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the ContainerInstance was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the ContainerInstance was updated. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the ContainerInstance was updated. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The shape of the Container Instance. The shape determines the resources available to the
     * Container Instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the Container Instance. The shape determines the resources available to the
     * Container Instance.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
    private final ContainerInstanceShapeConfig shapeConfig;

    public ContainerInstanceShapeConfig getShapeConfig() {
        return shapeConfig;
    }

    /** The virtual networks available to containers running on this Container Instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("vnics")
    private final java.util.List<ContainerVnic> vnics;

    /**
     * The virtual networks available to containers running on this Container Instance.
     *
     * @return the value
     */
    public java.util.List<ContainerVnic> getVnics() {
        return vnics;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dnsConfig")
    private final ContainerDnsConfig dnsConfig;

    public ContainerDnsConfig getDnsConfig() {
        return dnsConfig;
    }

    /**
     * Duration in seconds processes within a Container have to gracefully terminate. This applies
     * whenever a Container must be halted, such as when the Container Instance is deleted.
     * Processes will first be sent a termination signal. After this timeout is reached, the
     * processes will be sent a termination signal.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gracefulShutdownTimeoutInSeconds")
    private final Long gracefulShutdownTimeoutInSeconds;

    /**
     * Duration in seconds processes within a Container have to gracefully terminate. This applies
     * whenever a Container must be halted, such as when the Container Instance is deleted.
     * Processes will first be sent a termination signal. After this timeout is reached, the
     * processes will be sent a termination signal.
     *
     * @return the value
     */
    public Long getGracefulShutdownTimeoutInSeconds() {
        return gracefulShutdownTimeoutInSeconds;
    }

    /** The image pull secrets for accessing private registry to pull images for containers */
    @com.fasterxml.jackson.annotation.JsonProperty("imagePullSecrets")
    private final java.util.List<ImagePullSecret> imagePullSecrets;

    /**
     * The image pull secrets for accessing private registry to pull images for containers
     *
     * @return the value
     */
    public java.util.List<ImagePullSecret> getImagePullSecrets() {
        return imagePullSecrets;
    }

    /** The container restart policy is applied for all containers in container instance. */
    public enum ContainerRestartPolicy implements com.oracle.bmc.http.internal.BmcEnum {
        Always("ALWAYS"),
        Never("NEVER"),
        OnFailure("ON_FAILURE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ContainerRestartPolicy.class);

        private final String value;
        private static java.util.Map<String, ContainerRestartPolicy> map;

        static {
            map = new java.util.HashMap<>();
            for (ContainerRestartPolicy v : ContainerRestartPolicy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ContainerRestartPolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ContainerRestartPolicy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ContainerRestartPolicy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The container restart policy is applied for all containers in container instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("containerRestartPolicy")
    private final ContainerRestartPolicy containerRestartPolicy;

    /**
     * The container restart policy is applied for all containers in container instance.
     *
     * @return the value
     */
    public ContainerRestartPolicy getContainerRestartPolicy() {
        return containerRestartPolicy;
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
        sb.append("ContainerInstance(");
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
        sb.append(", volumes=").append(String.valueOf(this.volumes));
        sb.append(", volumeCount=").append(String.valueOf(this.volumeCount));
        sb.append(", containers=").append(String.valueOf(this.containers));
        sb.append(", containerCount=").append(String.valueOf(this.containerCount));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", shapeConfig=").append(String.valueOf(this.shapeConfig));
        sb.append(", vnics=").append(String.valueOf(this.vnics));
        sb.append(", dnsConfig=").append(String.valueOf(this.dnsConfig));
        sb.append(", gracefulShutdownTimeoutInSeconds=")
                .append(String.valueOf(this.gracefulShutdownTimeoutInSeconds));
        sb.append(", imagePullSecrets=").append(String.valueOf(this.imagePullSecrets));
        sb.append(", containerRestartPolicy=").append(String.valueOf(this.containerRestartPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerInstance)) {
            return false;
        }

        ContainerInstance other = (ContainerInstance) o;
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
                && java.util.Objects.equals(this.volumes, other.volumes)
                && java.util.Objects.equals(this.volumeCount, other.volumeCount)
                && java.util.Objects.equals(this.containers, other.containers)
                && java.util.Objects.equals(this.containerCount, other.containerCount)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.shapeConfig, other.shapeConfig)
                && java.util.Objects.equals(this.vnics, other.vnics)
                && java.util.Objects.equals(this.dnsConfig, other.dnsConfig)
                && java.util.Objects.equals(
                        this.gracefulShutdownTimeoutInSeconds,
                        other.gracefulShutdownTimeoutInSeconds)
                && java.util.Objects.equals(this.imagePullSecrets, other.imagePullSecrets)
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
        result = (result * PRIME) + (this.volumes == null ? 43 : this.volumes.hashCode());
        result = (result * PRIME) + (this.volumeCount == null ? 43 : this.volumeCount.hashCode());
        result = (result * PRIME) + (this.containers == null ? 43 : this.containers.hashCode());
        result =
                (result * PRIME)
                        + (this.containerCount == null ? 43 : this.containerCount.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.shapeConfig == null ? 43 : this.shapeConfig.hashCode());
        result = (result * PRIME) + (this.vnics == null ? 43 : this.vnics.hashCode());
        result = (result * PRIME) + (this.dnsConfig == null ? 43 : this.dnsConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.gracefulShutdownTimeoutInSeconds == null
                                ? 43
                                : this.gracefulShutdownTimeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.imagePullSecrets == null ? 43 : this.imagePullSecrets.hashCode());
        result =
                (result * PRIME)
                        + (this.containerRestartPolicy == null
                                ? 43
                                : this.containerRestartPolicy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
