/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Instance launch details.
 * Use the {@code sourceDetails} parameter to specify whether a boot volume or an image should be used to launch a new instance.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LaunchInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LaunchInstanceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "capacityReservationId",
        "compartmentId",
        "createVnicDetails",
        "dedicatedVmHostId",
        "definedTags",
        "displayName",
        "faultDomain",
        "freeformTags",
        "hostnameLabel",
        "ipxeScript",
        "instanceOptions",
        "preemptibleInstanceConfig",
        "agentConfig",
        "shape",
        "shapeConfig",
        "sourceDetails",
        "isPvEncryptionInTransitEnabled"
    })
    public LaunchInstanceDetails(
            String availabilityDomain,
            String capacityReservationId,
            String compartmentId,
            CreateVnicDetails createVnicDetails,
            String dedicatedVmHostId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String faultDomain,
            java.util.Map<String, String> freeformTags,
            String hostnameLabel,
            String ipxeScript,
            InstanceOptions instanceOptions,
            PreemptibleInstanceConfigDetails preemptibleInstanceConfig,
            LaunchInstanceAgentConfigDetails agentConfig,
            String shape,
            LaunchInstanceShapeConfigDetails shapeConfig,
            InstanceSourceDetails sourceDetails,
            Boolean isPvEncryptionInTransitEnabled) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.capacityReservationId = capacityReservationId;
        this.compartmentId = compartmentId;
        this.createVnicDetails = createVnicDetails;
        this.dedicatedVmHostId = dedicatedVmHostId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.faultDomain = faultDomain;
        this.freeformTags = freeformTags;
        this.hostnameLabel = hostnameLabel;
        this.ipxeScript = ipxeScript;
        this.instanceOptions = instanceOptions;
        this.preemptibleInstanceConfig = preemptibleInstanceConfig;
        this.agentConfig = agentConfig;
        this.shape = shape;
        this.shapeConfig = shapeConfig;
        this.sourceDetails = sourceDetails;
        this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain of the instance.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of the instance.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The OCID of the compute capacity reservation under which this instance is launched.
         * You can opt out of all default reservations by specifying an empty string as input for this field.
         * For more information, see [Capacity Reservations](https://docs.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
        private String capacityReservationId;

        /**
         * The OCID of the compute capacity reservation under which this instance is launched.
         * You can opt out of all default reservations by specifying an empty string as input for this field.
         * For more information, see [Capacity Reservations](https://docs.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
         *
         * @param capacityReservationId the value to set
         * @return this builder
         **/
        public Builder capacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            this.__explicitlySet__.add("capacityReservationId");
            return this;
        }
        /**
         * The OCID of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createVnicDetails")
        private CreateVnicDetails createVnicDetails;

        public Builder createVnicDetails(CreateVnicDetails createVnicDetails) {
            this.createVnicDetails = createVnicDetails;
            this.__explicitlySet__.add("createVnicDetails");
            return this;
        }
        /**
         * The OCID of the dedicated VM host.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostId")
        private String dedicatedVmHostId;

        /**
         * The OCID of the dedicated VM host.
         *
         * @param dedicatedVmHostId the value to set
         * @return this builder
         **/
        public Builder dedicatedVmHostId(String dedicatedVmHostId) {
            this.dedicatedVmHostId = dedicatedVmHostId;
            this.__explicitlySet__.add("dedicatedVmHostId");
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
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
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
         * A fault domain is a grouping of hardware and infrastructure within an availability domain.
         * Each availability domain contains three fault domains. Fault domains lets you distribute your
         * instances so that they are not on the same physical hardware within a single availability domain.
         * A hardware failure or Compute hardware maintenance that affects one fault domain does not affect
         * instances in other fault domains.
         * <p>
         * If you do not specify the fault domain, the system selects one for you.
         * <p>
         *
         * To get a list of fault domains, use the
         * {@link #listFaultDomains(ListFaultDomainsRequest) listFaultDomains} operation in the
         * Identity and Access Management Service API.
         * <p>
         * Example: {@code FAULT-DOMAIN-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * A fault domain is a grouping of hardware and infrastructure within an availability domain.
         * Each availability domain contains three fault domains. Fault domains lets you distribute your
         * instances so that they are not on the same physical hardware within a single availability domain.
         * A hardware failure or Compute hardware maintenance that affects one fault domain does not affect
         * instances in other fault domains.
         * <p>
         * If you do not specify the fault domain, the system selects one for you.
         * <p>
         *
         * To get a list of fault domains, use the
         * {@link #listFaultDomains(ListFaultDomainsRequest) listFaultDomains} operation in the
         * Identity and Access Management Service API.
         * <p>
         * Example: {@code FAULT-DOMAIN-1}
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
         * Simple key-value pair that is applied without any predefined name, type or scope. It exists only for cross-compatibility.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. It exists only for cross-compatibility.
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
         * Deprecated. Instead use {@code hostnameLabel} in
         * {@link CreateVnicDetails}.
         * If you provide both, the values must match.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        /**
         * Deprecated. Instead use {@code hostnameLabel} in
         * {@link CreateVnicDetails}.
         * If you provide both, the values must match.
         *
         * @param hostnameLabel the value to set
         * @return this builder
         **/
        public Builder hostnameLabel(String hostnameLabel) {
            this.hostnameLabel = hostnameLabel;
            this.__explicitlySet__.add("hostnameLabel");
            return this;
        }
        /**
         * This is an advanced option.
         * <p>
         * When a bare metal or virtual machine
         * instance boots, the iPXE firmware that runs on the instance is
         * configured to run an iPXE script to continue the boot process.
         * <p>
         * If you want more control over the boot process, you can provide
         * your own custom iPXE script that will run when the instance boots.
         * Be aware that the same iPXE script will run
         * every time an instance boots, not only after the initial
         * LaunchInstance call.
         * <p>
         * By default, the iPXE script connects to the instance's local boot
         * volume over iSCSI and performs a network boot. If you use a custom iPXE
         * script and want to network-boot from the instance's local boot volume
         * over iSCSI in the same way as the default iPXE script, use the
         * following iSCSI IP address: 169.254.0.2, and boot volume IQN:
         * iqn.2015-02.oracle.boot.
         * <p>
         * If your instance boot volume type is paravirtualized,
         * the boot volume is attached to the instance through virtio-scsi and no iPXE script is used.
         * If your instance boot volume type is paravirtualized
         * and you use custom iPXE to perform network-boot into your instance,
         * the primary boot volume is attached as a data volume through the virtio-scsi drive.
         * <p>
         * For more information about the Bring Your Own Image feature of
         * Oracle Cloud Infrastructure, see
         * [Bring Your Own Image](https://docs.oracle.com/iaas/Content/Compute/References/bringyourownimage.htm).
         * <p>
         * For more information about iPXE, see http://ipxe.org.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipxeScript")
        private String ipxeScript;

        /**
         * This is an advanced option.
         * <p>
         * When a bare metal or virtual machine
         * instance boots, the iPXE firmware that runs on the instance is
         * configured to run an iPXE script to continue the boot process.
         * <p>
         * If you want more control over the boot process, you can provide
         * your own custom iPXE script that will run when the instance boots.
         * Be aware that the same iPXE script will run
         * every time an instance boots, not only after the initial
         * LaunchInstance call.
         * <p>
         * By default, the iPXE script connects to the instance's local boot
         * volume over iSCSI and performs a network boot. If you use a custom iPXE
         * script and want to network-boot from the instance's local boot volume
         * over iSCSI in the same way as the default iPXE script, use the
         * following iSCSI IP address: 169.254.0.2, and boot volume IQN:
         * iqn.2015-02.oracle.boot.
         * <p>
         * If your instance boot volume type is paravirtualized,
         * the boot volume is attached to the instance through virtio-scsi and no iPXE script is used.
         * If your instance boot volume type is paravirtualized
         * and you use custom iPXE to perform network-boot into your instance,
         * the primary boot volume is attached as a data volume through the virtio-scsi drive.
         * <p>
         * For more information about the Bring Your Own Image feature of
         * Oracle Cloud Infrastructure, see
         * [Bring Your Own Image](https://docs.oracle.com/iaas/Content/Compute/References/bringyourownimage.htm).
         * <p>
         * For more information about iPXE, see http://ipxe.org.
         *
         * @param ipxeScript the value to set
         * @return this builder
         **/
        public Builder ipxeScript(String ipxeScript) {
            this.ipxeScript = ipxeScript;
            this.__explicitlySet__.add("ipxeScript");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceOptions")
        private InstanceOptions instanceOptions;

        public Builder instanceOptions(InstanceOptions instanceOptions) {
            this.instanceOptions = instanceOptions;
            this.__explicitlySet__.add("instanceOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("preemptibleInstanceConfig")
        private PreemptibleInstanceConfigDetails preemptibleInstanceConfig;

        public Builder preemptibleInstanceConfig(
                PreemptibleInstanceConfigDetails preemptibleInstanceConfig) {
            this.preemptibleInstanceConfig = preemptibleInstanceConfig;
            this.__explicitlySet__.add("preemptibleInstanceConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("agentConfig")
        private LaunchInstanceAgentConfigDetails agentConfig;

        public Builder agentConfig(LaunchInstanceAgentConfigDetails agentConfig) {
            this.agentConfig = agentConfig;
            this.__explicitlySet__.add("agentConfig");
            return this;
        }
        /**
         * The shape of an instance. The shape determines the number of CPUs, amount of memory,
         * and other resources allocated to the instance.
         * <p>
         * You can enumerate all available shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of an instance. The shape determines the number of CPUs, amount of memory,
         * and other resources allocated to the instance.
         * <p>
         * You can enumerate all available shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
         *
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
        private LaunchInstanceShapeConfigDetails shapeConfig;

        public Builder shapeConfig(LaunchInstanceShapeConfigDetails shapeConfig) {
            this.shapeConfig = shapeConfig;
            this.__explicitlySet__.add("shapeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
        private InstanceSourceDetails sourceDetails;

        public Builder sourceDetails(InstanceSourceDetails sourceDetails) {
            this.sourceDetails = sourceDetails;
            this.__explicitlySet__.add("sourceDetails");
            return this;
        }
        /**
         * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. This field applies to both block volumes and boot volumes. By default, the value is false.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
        private Boolean isPvEncryptionInTransitEnabled;

        /**
         * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. This field applies to both block volumes and boot volumes. By default, the value is false.
         * @param isPvEncryptionInTransitEnabled the value to set
         * @return this builder
         **/
        public Builder isPvEncryptionInTransitEnabled(Boolean isPvEncryptionInTransitEnabled) {
            this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
            this.__explicitlySet__.add("isPvEncryptionInTransitEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LaunchInstanceDetails build() {
            LaunchInstanceDetails model =
                    new LaunchInstanceDetails(
                            this.availabilityDomain,
                            this.capacityReservationId,
                            this.compartmentId,
                            this.createVnicDetails,
                            this.dedicatedVmHostId,
                            this.definedTags,
                            this.displayName,
                            this.faultDomain,
                            this.freeformTags,
                            this.hostnameLabel,
                            this.ipxeScript,
                            this.instanceOptions,
                            this.preemptibleInstanceConfig,
                            this.agentConfig,
                            this.shape,
                            this.shapeConfig,
                            this.sourceDetails,
                            this.isPvEncryptionInTransitEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LaunchInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("capacityReservationId")) {
                this.capacityReservationId(model.getCapacityReservationId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("createVnicDetails")) {
                this.createVnicDetails(model.getCreateVnicDetails());
            }
            if (model.wasPropertyExplicitlySet("dedicatedVmHostId")) {
                this.dedicatedVmHostId(model.getDedicatedVmHostId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("hostnameLabel")) {
                this.hostnameLabel(model.getHostnameLabel());
            }
            if (model.wasPropertyExplicitlySet("ipxeScript")) {
                this.ipxeScript(model.getIpxeScript());
            }
            if (model.wasPropertyExplicitlySet("instanceOptions")) {
                this.instanceOptions(model.getInstanceOptions());
            }
            if (model.wasPropertyExplicitlySet("preemptibleInstanceConfig")) {
                this.preemptibleInstanceConfig(model.getPreemptibleInstanceConfig());
            }
            if (model.wasPropertyExplicitlySet("agentConfig")) {
                this.agentConfig(model.getAgentConfig());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("shapeConfig")) {
                this.shapeConfig(model.getShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("sourceDetails")) {
                this.sourceDetails(model.getSourceDetails());
            }
            if (model.wasPropertyExplicitlySet("isPvEncryptionInTransitEnabled")) {
                this.isPvEncryptionInTransitEnabled(model.getIsPvEncryptionInTransitEnabled());
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
     * The availability domain of the instance.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of the instance.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the compute capacity reservation under which this instance is launched.
     * You can opt out of all default reservations by specifying an empty string as input for this field.
     * For more information, see [Capacity Reservations](https://docs.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
    private final String capacityReservationId;

    /**
     * The OCID of the compute capacity reservation under which this instance is launched.
     * You can opt out of all default reservations by specifying an empty string as input for this field.
     * For more information, see [Capacity Reservations](https://docs.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
     *
     * @return the value
     **/
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("createVnicDetails")
    private final CreateVnicDetails createVnicDetails;

    public CreateVnicDetails getCreateVnicDetails() {
        return createVnicDetails;
    }

    /**
     * The OCID of the dedicated VM host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostId")
    private final String dedicatedVmHostId;

    /**
     * The OCID of the dedicated VM host.
     *
     * @return the value
     **/
    public String getDedicatedVmHostId() {
        return dedicatedVmHostId;
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

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A fault domain is a grouping of hardware and infrastructure within an availability domain.
     * Each availability domain contains three fault domains. Fault domains lets you distribute your
     * instances so that they are not on the same physical hardware within a single availability domain.
     * A hardware failure or Compute hardware maintenance that affects one fault domain does not affect
     * instances in other fault domains.
     * <p>
     * If you do not specify the fault domain, the system selects one for you.
     * <p>
     *
     * To get a list of fault domains, use the
     * {@link #listFaultDomains(ListFaultDomainsRequest) listFaultDomains} operation in the
     * Identity and Access Management Service API.
     * <p>
     * Example: {@code FAULT-DOMAIN-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * A fault domain is a grouping of hardware and infrastructure within an availability domain.
     * Each availability domain contains three fault domains. Fault domains lets you distribute your
     * instances so that they are not on the same physical hardware within a single availability domain.
     * A hardware failure or Compute hardware maintenance that affects one fault domain does not affect
     * instances in other fault domains.
     * <p>
     * If you do not specify the fault domain, the system selects one for you.
     * <p>
     *
     * To get a list of fault domains, use the
     * {@link #listFaultDomains(ListFaultDomainsRequest) listFaultDomains} operation in the
     * Identity and Access Management Service API.
     * <p>
     * Example: {@code FAULT-DOMAIN-1}
     *
     * @return the value
     **/
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. It exists only for cross-compatibility.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. It exists only for cross-compatibility.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Deprecated. Instead use {@code hostnameLabel} in
     * {@link CreateVnicDetails}.
     * If you provide both, the values must match.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    private final String hostnameLabel;

    /**
     * Deprecated. Instead use {@code hostnameLabel} in
     * {@link CreateVnicDetails}.
     * If you provide both, the values must match.
     *
     * @return the value
     **/
    public String getHostnameLabel() {
        return hostnameLabel;
    }

    /**
     * This is an advanced option.
     * <p>
     * When a bare metal or virtual machine
     * instance boots, the iPXE firmware that runs on the instance is
     * configured to run an iPXE script to continue the boot process.
     * <p>
     * If you want more control over the boot process, you can provide
     * your own custom iPXE script that will run when the instance boots.
     * Be aware that the same iPXE script will run
     * every time an instance boots, not only after the initial
     * LaunchInstance call.
     * <p>
     * By default, the iPXE script connects to the instance's local boot
     * volume over iSCSI and performs a network boot. If you use a custom iPXE
     * script and want to network-boot from the instance's local boot volume
     * over iSCSI in the same way as the default iPXE script, use the
     * following iSCSI IP address: 169.254.0.2, and boot volume IQN:
     * iqn.2015-02.oracle.boot.
     * <p>
     * If your instance boot volume type is paravirtualized,
     * the boot volume is attached to the instance through virtio-scsi and no iPXE script is used.
     * If your instance boot volume type is paravirtualized
     * and you use custom iPXE to perform network-boot into your instance,
     * the primary boot volume is attached as a data volume through the virtio-scsi drive.
     * <p>
     * For more information about the Bring Your Own Image feature of
     * Oracle Cloud Infrastructure, see
     * [Bring Your Own Image](https://docs.oracle.com/iaas/Content/Compute/References/bringyourownimage.htm).
     * <p>
     * For more information about iPXE, see http://ipxe.org.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipxeScript")
    private final String ipxeScript;

    /**
     * This is an advanced option.
     * <p>
     * When a bare metal or virtual machine
     * instance boots, the iPXE firmware that runs on the instance is
     * configured to run an iPXE script to continue the boot process.
     * <p>
     * If you want more control over the boot process, you can provide
     * your own custom iPXE script that will run when the instance boots.
     * Be aware that the same iPXE script will run
     * every time an instance boots, not only after the initial
     * LaunchInstance call.
     * <p>
     * By default, the iPXE script connects to the instance's local boot
     * volume over iSCSI and performs a network boot. If you use a custom iPXE
     * script and want to network-boot from the instance's local boot volume
     * over iSCSI in the same way as the default iPXE script, use the
     * following iSCSI IP address: 169.254.0.2, and boot volume IQN:
     * iqn.2015-02.oracle.boot.
     * <p>
     * If your instance boot volume type is paravirtualized,
     * the boot volume is attached to the instance through virtio-scsi and no iPXE script is used.
     * If your instance boot volume type is paravirtualized
     * and you use custom iPXE to perform network-boot into your instance,
     * the primary boot volume is attached as a data volume through the virtio-scsi drive.
     * <p>
     * For more information about the Bring Your Own Image feature of
     * Oracle Cloud Infrastructure, see
     * [Bring Your Own Image](https://docs.oracle.com/iaas/Content/Compute/References/bringyourownimage.htm).
     * <p>
     * For more information about iPXE, see http://ipxe.org.
     *
     * @return the value
     **/
    public String getIpxeScript() {
        return ipxeScript;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("instanceOptions")
    private final InstanceOptions instanceOptions;

    public InstanceOptions getInstanceOptions() {
        return instanceOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("preemptibleInstanceConfig")
    private final PreemptibleInstanceConfigDetails preemptibleInstanceConfig;

    public PreemptibleInstanceConfigDetails getPreemptibleInstanceConfig() {
        return preemptibleInstanceConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("agentConfig")
    private final LaunchInstanceAgentConfigDetails agentConfig;

    public LaunchInstanceAgentConfigDetails getAgentConfig() {
        return agentConfig;
    }

    /**
     * The shape of an instance. The shape determines the number of CPUs, amount of memory,
     * and other resources allocated to the instance.
     * <p>
     * You can enumerate all available shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of an instance. The shape determines the number of CPUs, amount of memory,
     * and other resources allocated to the instance.
     * <p>
     * You can enumerate all available shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
     *
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
    private final LaunchInstanceShapeConfigDetails shapeConfig;

    public LaunchInstanceShapeConfigDetails getShapeConfig() {
        return shapeConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
    private final InstanceSourceDetails sourceDetails;

    public InstanceSourceDetails getSourceDetails() {
        return sourceDetails;
    }

    /**
     * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. This field applies to both block volumes and boot volumes. By default, the value is false.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
    private final Boolean isPvEncryptionInTransitEnabled;

    /**
     * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. This field applies to both block volumes and boot volumes. By default, the value is false.
     * @return the value
     **/
    public Boolean getIsPvEncryptionInTransitEnabled() {
        return isPvEncryptionInTransitEnabled;
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
        sb.append("LaunchInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", createVnicDetails=").append(String.valueOf(this.createVnicDetails));
        sb.append(", dedicatedVmHostId=").append(String.valueOf(this.dedicatedVmHostId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", hostnameLabel=").append(String.valueOf(this.hostnameLabel));
        sb.append(", ipxeScript=").append(String.valueOf(this.ipxeScript));
        sb.append(", instanceOptions=").append(String.valueOf(this.instanceOptions));
        sb.append(", preemptibleInstanceConfig=")
                .append(String.valueOf(this.preemptibleInstanceConfig));
        sb.append(", agentConfig=").append(String.valueOf(this.agentConfig));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", shapeConfig=").append(String.valueOf(this.shapeConfig));
        sb.append(", sourceDetails=").append(String.valueOf(this.sourceDetails));
        sb.append(", isPvEncryptionInTransitEnabled=")
                .append(String.valueOf(this.isPvEncryptionInTransitEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LaunchInstanceDetails)) {
            return false;
        }

        LaunchInstanceDetails other = (LaunchInstanceDetails) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.createVnicDetails, other.createVnicDetails)
                && java.util.Objects.equals(this.dedicatedVmHostId, other.dedicatedVmHostId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.hostnameLabel, other.hostnameLabel)
                && java.util.Objects.equals(this.ipxeScript, other.ipxeScript)
                && java.util.Objects.equals(this.instanceOptions, other.instanceOptions)
                && java.util.Objects.equals(
                        this.preemptibleInstanceConfig, other.preemptibleInstanceConfig)
                && java.util.Objects.equals(this.agentConfig, other.agentConfig)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.shapeConfig, other.shapeConfig)
                && java.util.Objects.equals(this.sourceDetails, other.sourceDetails)
                && java.util.Objects.equals(
                        this.isPvEncryptionInTransitEnabled, other.isPvEncryptionInTransitEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityReservationId == null
                                ? 43
                                : this.capacityReservationId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.createVnicDetails == null ? 43 : this.createVnicDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.dedicatedVmHostId == null ? 43 : this.dedicatedVmHostId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.hostnameLabel == null ? 43 : this.hostnameLabel.hashCode());
        result = (result * PRIME) + (this.ipxeScript == null ? 43 : this.ipxeScript.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceOptions == null ? 43 : this.instanceOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.preemptibleInstanceConfig == null
                                ? 43
                                : this.preemptibleInstanceConfig.hashCode());
        result = (result * PRIME) + (this.agentConfig == null ? 43 : this.agentConfig.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.shapeConfig == null ? 43 : this.shapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDetails == null ? 43 : this.sourceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isPvEncryptionInTransitEnabled == null
                                ? 43
                                : this.isPvEncryptionInTransitEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
