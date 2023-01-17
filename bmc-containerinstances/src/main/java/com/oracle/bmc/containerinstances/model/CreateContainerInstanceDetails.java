/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * The information about new ContainerInstance.
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
    builder = CreateContainerInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateContainerInstanceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "availabilityDomain",
        "faultDomain",
        "shape",
        "shapeConfig",
        "volumes",
        "containers",
        "vnics",
        "dnsConfig",
        "gracefulShutdownTimeoutInSeconds",
        "imagePullSecrets",
        "containerRestartPolicy",
        "freeformTags",
        "definedTags"
    })
    public CreateContainerInstanceDetails(
            String displayName,
            String compartmentId,
            String availabilityDomain,
            String faultDomain,
            String shape,
            CreateContainerInstanceShapeConfigDetails shapeConfig,
            java.util.List<CreateContainerVolumeDetails> volumes,
            java.util.List<CreateContainerDetails> containers,
            java.util.List<CreateContainerVnicDetails> vnics,
            CreateContainerDnsConfigDetails dnsConfig,
            Long gracefulShutdownTimeoutInSeconds,
            java.util.List<CreateImagePullSecretDetails> imagePullSecrets,
            ContainerInstance.ContainerRestartPolicy containerRestartPolicy,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.availabilityDomain = availabilityDomain;
        this.faultDomain = faultDomain;
        this.shape = shape;
        this.shapeConfig = shapeConfig;
        this.volumes = volumes;
        this.containers = containers;
        this.vnics = vnics;
        this.dnsConfig = dnsConfig;
        this.gracefulShutdownTimeoutInSeconds = gracefulShutdownTimeoutInSeconds;
        this.imagePullSecrets = imagePullSecrets;
        this.containerRestartPolicy = containerRestartPolicy;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Human-readable name for the ContainerInstance. If none is provided,
         * OCI will select one for you.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Human-readable name for the ContainerInstance. If none is provided,
         * OCI will select one for you.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Compartment Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Availability Domain where the ContainerInstance should be created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * Availability Domain where the ContainerInstance should be created.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * Fault Domain where the ContainerInstance should run.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * Fault Domain where the ContainerInstance should run.
         *
         * @param faultDomain the value to set
         * @return this builder
         **/
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /**
         * The shape of the Container Instance. The shape determines the resources available to the Container Instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the Container Instance. The shape determines the resources available to the Container Instance.
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
        private CreateContainerInstanceShapeConfigDetails shapeConfig;

        public Builder shapeConfig(CreateContainerInstanceShapeConfigDetails shapeConfig) {
            this.shapeConfig = shapeConfig;
            this.__explicitlySet__.add("shapeConfig");
            return this;
        }
        /**
         * A Volume represents a directory with data that is accessible across multiple containers in a
         * ContainerInstance.
         * Up to 32 volumes can be attached to single container instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumes")
        private java.util.List<CreateContainerVolumeDetails> volumes;

        /**
         * A Volume represents a directory with data that is accessible across multiple containers in a
         * ContainerInstance.
         * Up to 32 volumes can be attached to single container instance.
         *
         * @param volumes the value to set
         * @return this builder
         **/
        public Builder volumes(java.util.List<CreateContainerVolumeDetails> volumes) {
            this.volumes = volumes;
            this.__explicitlySet__.add("volumes");
            return this;
        }
        /**
         * The Containers to create on this Instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("containers")
        private java.util.List<CreateContainerDetails> containers;

        /**
         * The Containers to create on this Instance.
         * @param containers the value to set
         * @return this builder
         **/
        public Builder containers(java.util.List<CreateContainerDetails> containers) {
            this.containers = containers;
            this.__explicitlySet__.add("containers");
            return this;
        }
        /**
         * The networks to make available to containers on this Instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vnics")
        private java.util.List<CreateContainerVnicDetails> vnics;

        /**
         * The networks to make available to containers on this Instance.
         * @param vnics the value to set
         * @return this builder
         **/
        public Builder vnics(java.util.List<CreateContainerVnicDetails> vnics) {
            this.vnics = vnics;
            this.__explicitlySet__.add("vnics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dnsConfig")
        private CreateContainerDnsConfigDetails dnsConfig;

        public Builder dnsConfig(CreateContainerDnsConfigDetails dnsConfig) {
            this.dnsConfig = dnsConfig;
            this.__explicitlySet__.add("dnsConfig");
            return this;
        }
        /**
         * Duration in seconds processes within a Container have to gracefully terminate. This applies whenever a Container must be halted, such as when the Container Instance is deleted. Processes will first be sent a termination signal. After this timeout is reached, the processes will be sent a termination signal.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gracefulShutdownTimeoutInSeconds")
        private Long gracefulShutdownTimeoutInSeconds;

        /**
         * Duration in seconds processes within a Container have to gracefully terminate. This applies whenever a Container must be halted, such as when the Container Instance is deleted. Processes will first be sent a termination signal. After this timeout is reached, the processes will be sent a termination signal.
         * @param gracefulShutdownTimeoutInSeconds the value to set
         * @return this builder
         **/
        public Builder gracefulShutdownTimeoutInSeconds(Long gracefulShutdownTimeoutInSeconds) {
            this.gracefulShutdownTimeoutInSeconds = gracefulShutdownTimeoutInSeconds;
            this.__explicitlySet__.add("gracefulShutdownTimeoutInSeconds");
            return this;
        }
        /**
         * The image pull secrets for accessing private registry to pull images for containers
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imagePullSecrets")
        private java.util.List<CreateImagePullSecretDetails> imagePullSecrets;

        /**
         * The image pull secrets for accessing private registry to pull images for containers
         * @param imagePullSecrets the value to set
         * @return this builder
         **/
        public Builder imagePullSecrets(
                java.util.List<CreateImagePullSecretDetails> imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
            this.__explicitlySet__.add("imagePullSecrets");
            return this;
        }
        /**
         * Container restart policy
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("containerRestartPolicy")
        private ContainerInstance.ContainerRestartPolicy containerRestartPolicy;

        /**
         * Container restart policy
         * @param containerRestartPolicy the value to set
         * @return this builder
         **/
        public Builder containerRestartPolicy(
                ContainerInstance.ContainerRestartPolicy containerRestartPolicy) {
            this.containerRestartPolicy = containerRestartPolicy;
            this.__explicitlySet__.add("containerRestartPolicy");
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateContainerInstanceDetails build() {
            CreateContainerInstanceDetails model =
                    new CreateContainerInstanceDetails(
                            this.displayName,
                            this.compartmentId,
                            this.availabilityDomain,
                            this.faultDomain,
                            this.shape,
                            this.shapeConfig,
                            this.volumes,
                            this.containers,
                            this.vnics,
                            this.dnsConfig,
                            this.gracefulShutdownTimeoutInSeconds,
                            this.imagePullSecrets,
                            this.containerRestartPolicy,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateContainerInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("shapeConfig")) {
                this.shapeConfig(model.getShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("volumes")) {
                this.volumes(model.getVolumes());
            }
            if (model.wasPropertyExplicitlySet("containers")) {
                this.containers(model.getContainers());
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * Human-readable name for the ContainerInstance. If none is provided,
     * OCI will select one for you.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Human-readable name for the ContainerInstance. If none is provided,
     * OCI will select one for you.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Availability Domain where the ContainerInstance should be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * Availability Domain where the ContainerInstance should be created.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * Fault Domain where the ContainerInstance should run.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * Fault Domain where the ContainerInstance should run.
     *
     * @return the value
     **/
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The shape of the Container Instance. The shape determines the resources available to the Container Instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the Container Instance. The shape determines the resources available to the Container Instance.
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
    private final CreateContainerInstanceShapeConfigDetails shapeConfig;

    public CreateContainerInstanceShapeConfigDetails getShapeConfig() {
        return shapeConfig;
    }

    /**
     * A Volume represents a directory with data that is accessible across multiple containers in a
     * ContainerInstance.
     * Up to 32 volumes can be attached to single container instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumes")
    private final java.util.List<CreateContainerVolumeDetails> volumes;

    /**
     * A Volume represents a directory with data that is accessible across multiple containers in a
     * ContainerInstance.
     * Up to 32 volumes can be attached to single container instance.
     *
     * @return the value
     **/
    public java.util.List<CreateContainerVolumeDetails> getVolumes() {
        return volumes;
    }

    /**
     * The Containers to create on this Instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containers")
    private final java.util.List<CreateContainerDetails> containers;

    /**
     * The Containers to create on this Instance.
     * @return the value
     **/
    public java.util.List<CreateContainerDetails> getContainers() {
        return containers;
    }

    /**
     * The networks to make available to containers on this Instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnics")
    private final java.util.List<CreateContainerVnicDetails> vnics;

    /**
     * The networks to make available to containers on this Instance.
     * @return the value
     **/
    public java.util.List<CreateContainerVnicDetails> getVnics() {
        return vnics;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dnsConfig")
    private final CreateContainerDnsConfigDetails dnsConfig;

    public CreateContainerDnsConfigDetails getDnsConfig() {
        return dnsConfig;
    }

    /**
     * Duration in seconds processes within a Container have to gracefully terminate. This applies whenever a Container must be halted, such as when the Container Instance is deleted. Processes will first be sent a termination signal. After this timeout is reached, the processes will be sent a termination signal.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gracefulShutdownTimeoutInSeconds")
    private final Long gracefulShutdownTimeoutInSeconds;

    /**
     * Duration in seconds processes within a Container have to gracefully terminate. This applies whenever a Container must be halted, such as when the Container Instance is deleted. Processes will first be sent a termination signal. After this timeout is reached, the processes will be sent a termination signal.
     * @return the value
     **/
    public Long getGracefulShutdownTimeoutInSeconds() {
        return gracefulShutdownTimeoutInSeconds;
    }

    /**
     * The image pull secrets for accessing private registry to pull images for containers
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imagePullSecrets")
    private final java.util.List<CreateImagePullSecretDetails> imagePullSecrets;

    /**
     * The image pull secrets for accessing private registry to pull images for containers
     * @return the value
     **/
    public java.util.List<CreateImagePullSecretDetails> getImagePullSecrets() {
        return imagePullSecrets;
    }

    /**
     * Container restart policy
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerRestartPolicy")
    private final ContainerInstance.ContainerRestartPolicy containerRestartPolicy;

    /**
     * Container restart policy
     * @return the value
     **/
    public ContainerInstance.ContainerRestartPolicy getContainerRestartPolicy() {
        return containerRestartPolicy;
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
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
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
        sb.append("CreateContainerInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", shapeConfig=").append(String.valueOf(this.shapeConfig));
        sb.append(", volumes=").append(String.valueOf(this.volumes));
        sb.append(", containers=").append(String.valueOf(this.containers));
        sb.append(", vnics=").append(String.valueOf(this.vnics));
        sb.append(", dnsConfig=").append(String.valueOf(this.dnsConfig));
        sb.append(", gracefulShutdownTimeoutInSeconds=")
                .append(String.valueOf(this.gracefulShutdownTimeoutInSeconds));
        sb.append(", imagePullSecrets=").append(String.valueOf(this.imagePullSecrets));
        sb.append(", containerRestartPolicy=").append(String.valueOf(this.containerRestartPolicy));
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
        if (!(o instanceof CreateContainerInstanceDetails)) {
            return false;
        }

        CreateContainerInstanceDetails other = (CreateContainerInstanceDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.shapeConfig, other.shapeConfig)
                && java.util.Objects.equals(this.volumes, other.volumes)
                && java.util.Objects.equals(this.containers, other.containers)
                && java.util.Objects.equals(this.vnics, other.vnics)
                && java.util.Objects.equals(this.dnsConfig, other.dnsConfig)
                && java.util.Objects.equals(
                        this.gracefulShutdownTimeoutInSeconds,
                        other.gracefulShutdownTimeoutInSeconds)
                && java.util.Objects.equals(this.imagePullSecrets, other.imagePullSecrets)
                && java.util.Objects.equals(
                        this.containerRestartPolicy, other.containerRestartPolicy)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.shapeConfig == null ? 43 : this.shapeConfig.hashCode());
        result = (result * PRIME) + (this.volumes == null ? 43 : this.volumes.hashCode());
        result = (result * PRIME) + (this.containers == null ? 43 : this.containers.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
