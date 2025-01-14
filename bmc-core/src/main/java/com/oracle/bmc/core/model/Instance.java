/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A compute host. The image used to launch the instance determines its operating system and other
 * software. The shape specified during the launch process determines the number of CPUs and memory
 * allocated to the instance.
 *
 * <p>When you launch an instance, it is automatically attached to a virtual network interface card
 * (VNIC), called the *primary VNIC*. The VNIC has a private IP address from the subnet's CIDR. You
 * can either assign a private IP address of your choice or let Oracle automatically assign one. You
 * can choose whether the instance has a public IP address. To retrieve the addresses, use the
 * {@link #listVnicAttachments(ListVnicAttachmentsRequest) listVnicAttachments} operation to get the
 * VNIC ID for the instance, and then call {@link #getVnic(GetVnicRequest) getVnic} with the VNIC
 * ID.
 *
 * <p>For more information, see [Overview of the Compute
 * Service](https://docs.cloud.oracle.com/iaas/Content/Compute/Concepts/computeoverview.htm).
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Instance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Instance extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "capacityReservationId",
        "compartmentId",
        "clusterPlacementGroupId",
        "dedicatedVmHostId",
        "definedTags",
        "securityAttributes",
        "securityAttributesState",
        "displayName",
        "extendedMetadata",
        "faultDomain",
        "freeformTags",
        "id",
        "imageId",
        "ipxeScript",
        "launchMode",
        "launchOptions",
        "instanceOptions",
        "availabilityConfig",
        "preemptibleInstanceConfig",
        "lifecycleState",
        "metadata",
        "region",
        "shape",
        "shapeConfig",
        "isCrossNumaNode",
        "sourceDetails",
        "systemTags",
        "timeCreated",
        "agentConfig",
        "timeMaintenanceRebootDue",
        "platformConfig",
        "instanceConfigurationId",
        "licensingConfigs"
    })
    public Instance(
            String availabilityDomain,
            String capacityReservationId,
            String compartmentId,
            String clusterPlacementGroupId,
            String dedicatedVmHostId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            SecurityAttributesState securityAttributesState,
            String displayName,
            java.util.Map<String, Object> extendedMetadata,
            String faultDomain,
            java.util.Map<String, String> freeformTags,
            String id,
            String imageId,
            String ipxeScript,
            LaunchMode launchMode,
            LaunchOptions launchOptions,
            InstanceOptions instanceOptions,
            InstanceAvailabilityConfig availabilityConfig,
            PreemptibleInstanceConfigDetails preemptibleInstanceConfig,
            LifecycleState lifecycleState,
            java.util.Map<String, String> metadata,
            String region,
            String shape,
            InstanceShapeConfig shapeConfig,
            Boolean isCrossNumaNode,
            InstanceSourceDetails sourceDetails,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Date timeCreated,
            InstanceAgentConfig agentConfig,
            java.util.Date timeMaintenanceRebootDue,
            PlatformConfig platformConfig,
            String instanceConfigurationId,
            java.util.List<LicensingConfig> licensingConfigs) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.capacityReservationId = capacityReservationId;
        this.compartmentId = compartmentId;
        this.clusterPlacementGroupId = clusterPlacementGroupId;
        this.dedicatedVmHostId = dedicatedVmHostId;
        this.definedTags = definedTags;
        this.securityAttributes = securityAttributes;
        this.securityAttributesState = securityAttributesState;
        this.displayName = displayName;
        this.extendedMetadata = extendedMetadata;
        this.faultDomain = faultDomain;
        this.freeformTags = freeformTags;
        this.id = id;
        this.imageId = imageId;
        this.ipxeScript = ipxeScript;
        this.launchMode = launchMode;
        this.launchOptions = launchOptions;
        this.instanceOptions = instanceOptions;
        this.availabilityConfig = availabilityConfig;
        this.preemptibleInstanceConfig = preemptibleInstanceConfig;
        this.lifecycleState = lifecycleState;
        this.metadata = metadata;
        this.region = region;
        this.shape = shape;
        this.shapeConfig = shapeConfig;
        this.isCrossNumaNode = isCrossNumaNode;
        this.sourceDetails = sourceDetails;
        this.systemTags = systemTags;
        this.timeCreated = timeCreated;
        this.agentConfig = agentConfig;
        this.timeMaintenanceRebootDue = timeMaintenanceRebootDue;
        this.platformConfig = platformConfig;
        this.instanceConfigurationId = instanceConfigurationId;
        this.licensingConfigs = licensingConfigs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain the instance is running in.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain the instance is running in.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The OCID of the compute capacity reservation this instance is launched under. When this
         * field contains an empty string or is null, the instance is not currently in a capacity
         * reservation. For more information, see [Capacity
         * Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
        private String capacityReservationId;

        /**
         * The OCID of the compute capacity reservation this instance is launched under. When this
         * field contains an empty string or is null, the instance is not currently in a capacity
         * reservation. For more information, see [Capacity
         * Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
         *
         * @param capacityReservationId the value to set
         * @return this builder
         */
        public Builder capacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            this.__explicitlySet__.add("capacityReservationId");
            return this;
        }
        /** The OCID of the compartment that contains the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the instance.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The OCID of the cluster placement group of the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
        private String clusterPlacementGroupId;

        /**
         * The OCID of the cluster placement group of the instance.
         *
         * @param clusterPlacementGroupId the value to set
         * @return this builder
         */
        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            this.__explicitlySet__.add("clusterPlacementGroupId");
            return this;
        }
        /** The OCID of the dedicated virtual machine host that the instance is placed on. */
        @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostId")
        private String dedicatedVmHostId;

        /**
         * The OCID of the dedicated virtual machine host that the instance is placed on.
         *
         * @param dedicatedVmHostId the value to set
         * @return this builder
         */
        public Builder dedicatedVmHostId(String dedicatedVmHostId) {
            this.dedicatedVmHostId = dedicatedVmHostId;
            this.__explicitlySet__.add("dedicatedVmHostId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * [Security
         * attributes](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
         * are labels for a resource that can be referenced in a [Zero Trust Packet
         * Routing](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
         * (ZPR) policy to control access to ZPR-supported resources.
         *
         * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
         * {"value":"42","mode":"audit"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * [Security
         * attributes](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
         * are labels for a resource that can be referenced in a [Zero Trust Packet
         * Routing](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
         * (ZPR) policy to control access to ZPR-supported resources.
         *
         * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
         * {"value":"42","mode":"audit"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         */
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }
        /** The lifecycle state of the {@code securityAttributes} */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributesState")
        private SecurityAttributesState securityAttributesState;

        /**
         * The lifecycle state of the {@code securityAttributes}
         *
         * @param securityAttributesState the value to set
         * @return this builder
         */
        public Builder securityAttributesState(SecurityAttributesState securityAttributesState) {
            this.securityAttributesState = securityAttributesState;
            this.__explicitlySet__.add("securityAttributesState");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Additional metadata key/value pairs that you provide. They serve the same purpose and
         * functionality as fields in the {@code metadata} object.
         *
         * <p>They are distinguished from {@code metadata} fields in that these can be nested JSON
         * objects (whereas {@code metadata} fields are string/string maps only).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, Object> extendedMetadata;

        /**
         * Additional metadata key/value pairs that you provide. They serve the same purpose and
         * functionality as fields in the {@code metadata} object.
         *
         * <p>They are distinguished from {@code metadata} fields in that these can be nested JSON
         * objects (whereas {@code metadata} fields are string/string maps only).
         *
         * @param extendedMetadata the value to set
         * @return this builder
         */
        public Builder extendedMetadata(java.util.Map<String, Object> extendedMetadata) {
            this.extendedMetadata = extendedMetadata;
            this.__explicitlySet__.add("extendedMetadata");
            return this;
        }
        /**
         * The name of the fault domain the instance is running in.
         *
         * <p>A fault domain is a grouping of hardware and infrastructure within an availability
         * domain. Each availability domain contains three fault domains. Fault domains let you
         * distribute your instances so that they are not on the same physical hardware within a
         * single availability domain. A hardware failure or Compute hardware maintenance that
         * affects one fault domain does not affect instances in other fault domains.
         *
         * <p>If you do not specify the fault domain, the system selects one for you.
         *
         * <p>Example: {@code FAULT-DOMAIN-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * The name of the fault domain the instance is running in.
         *
         * <p>A fault domain is a grouping of hardware and infrastructure within an availability
         * domain. Each availability domain contains three fault domains. Fault domains let you
         * distribute your instances so that they are not on the same physical hardware within a
         * single availability domain. A hardware failure or Compute hardware maintenance that
         * affects one fault domain does not affect instances in other fault domains.
         *
         * <p>If you do not specify the fault domain, the system selects one for you.
         *
         * <p>Example: {@code FAULT-DOMAIN-1}
         *
         * @param faultDomain the value to set
         * @return this builder
         */
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /** The OCID of the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the instance.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Deprecated. Use {@code sourceDetails} instead. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        /**
         * Deprecated. Use {@code sourceDetails} instead.
         *
         * @param imageId the value to set
         * @return this builder
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }
        /**
         * When a bare metal or virtual machine instance boots, the iPXE firmware that runs on the
         * instance is configured to run an iPXE script to continue the boot process.
         *
         * <p>If you want more control over the boot process, you can provide your own custom iPXE
         * script that will run when the instance boots. Be aware that the same iPXE script will run
         * every time an instance boots, not only after the initial LaunchInstance call.
         *
         * <p>The default iPXE script connects to the instance's local boot volume over iSCSI and
         * performs a network boot. If you use a custom iPXE script and want to network-boot from
         * the instance's local boot volume over iSCSI the same way as the default iPXE script, use
         * the following iSCSI IP address: 169.254.0.2, and boot volume IQN:
         * iqn.2015-02.oracle.boot.
         *
         * <p>If your instance boot volume attachment type is paravirtualized, the boot volume is
         * attached to the instance through virtio-scsi and no iPXE script is used. If your instance
         * boot volume attachment type is paravirtualized and you use custom iPXE to network boot
         * into your instance, the primary boot volume is attached as a data volume through
         * virtio-scsi drive.
         *
         * <p>For more information about the Bring Your Own Image feature of Oracle Cloud
         * Infrastructure, see [Bring Your Own
         * Image](https://docs.cloud.oracle.com/iaas/Content/Compute/References/bringyourownimage.htm).
         *
         * <p>For more information about iPXE, see http://ipxe.org.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipxeScript")
        private String ipxeScript;

        /**
         * When a bare metal or virtual machine instance boots, the iPXE firmware that runs on the
         * instance is configured to run an iPXE script to continue the boot process.
         *
         * <p>If you want more control over the boot process, you can provide your own custom iPXE
         * script that will run when the instance boots. Be aware that the same iPXE script will run
         * every time an instance boots, not only after the initial LaunchInstance call.
         *
         * <p>The default iPXE script connects to the instance's local boot volume over iSCSI and
         * performs a network boot. If you use a custom iPXE script and want to network-boot from
         * the instance's local boot volume over iSCSI the same way as the default iPXE script, use
         * the following iSCSI IP address: 169.254.0.2, and boot volume IQN:
         * iqn.2015-02.oracle.boot.
         *
         * <p>If your instance boot volume attachment type is paravirtualized, the boot volume is
         * attached to the instance through virtio-scsi and no iPXE script is used. If your instance
         * boot volume attachment type is paravirtualized and you use custom iPXE to network boot
         * into your instance, the primary boot volume is attached as a data volume through
         * virtio-scsi drive.
         *
         * <p>For more information about the Bring Your Own Image feature of Oracle Cloud
         * Infrastructure, see [Bring Your Own
         * Image](https://docs.cloud.oracle.com/iaas/Content/Compute/References/bringyourownimage.htm).
         *
         * <p>For more information about iPXE, see http://ipxe.org.
         *
         * @param ipxeScript the value to set
         * @return this builder
         */
        public Builder ipxeScript(String ipxeScript) {
            this.ipxeScript = ipxeScript;
            this.__explicitlySet__.add("ipxeScript");
            return this;
        }
        /**
         * Specifies the configuration mode for launching virtual machine (VM) instances. The
         * configuration modes are: * {@code NATIVE} - VM instances launch with iSCSI boot and VFIO
         * devices. The default value for platform images. * {@code EMULATED} - VM instances launch
         * with emulated devices, such as the E1000 network driver and emulated SCSI disk
         * controller. * {@code PARAVIRTUALIZED} - VM instances launch with paravirtualized devices
         * using VirtIO drivers. * {@code CUSTOM} - VM instances launch with custom configuration
         * settings specified in the {@code LaunchOptions} parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("launchMode")
        private LaunchMode launchMode;

        /**
         * Specifies the configuration mode for launching virtual machine (VM) instances. The
         * configuration modes are: * {@code NATIVE} - VM instances launch with iSCSI boot and VFIO
         * devices. The default value for platform images. * {@code EMULATED} - VM instances launch
         * with emulated devices, such as the E1000 network driver and emulated SCSI disk
         * controller. * {@code PARAVIRTUALIZED} - VM instances launch with paravirtualized devices
         * using VirtIO drivers. * {@code CUSTOM} - VM instances launch with custom configuration
         * settings specified in the {@code LaunchOptions} parameter.
         *
         * @param launchMode the value to set
         * @return this builder
         */
        public Builder launchMode(LaunchMode launchMode) {
            this.launchMode = launchMode;
            this.__explicitlySet__.add("launchMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("launchOptions")
        private LaunchOptions launchOptions;

        public Builder launchOptions(LaunchOptions launchOptions) {
            this.launchOptions = launchOptions;
            this.__explicitlySet__.add("launchOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceOptions")
        private InstanceOptions instanceOptions;

        public Builder instanceOptions(InstanceOptions instanceOptions) {
            this.instanceOptions = instanceOptions;
            this.__explicitlySet__.add("instanceOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityConfig")
        private InstanceAvailabilityConfig availabilityConfig;

        public Builder availabilityConfig(InstanceAvailabilityConfig availabilityConfig) {
            this.availabilityConfig = availabilityConfig;
            this.__explicitlySet__.add("availabilityConfig");
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
        /** The current state of the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the instance.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Custom metadata that you provide. */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * Custom metadata that you provide.
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The region that contains the availability domain the instance is running in.
         *
         * <p>For the us-phoenix-1 and us-ashburn-1 regions, {@code phx} and {@code iad} are
         * returned, respectively. For all other regions, the full region name is returned.
         *
         * <p>Examples: {@code phx}, {@code eu-frankfurt-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region that contains the availability domain the instance is running in.
         *
         * <p>For the us-phoenix-1 and us-ashburn-1 regions, {@code phx} and {@code iad} are
         * returned, respectively. For all other regions, the full region name is returned.
         *
         * <p>Examples: {@code phx}, {@code eu-frankfurt-1}
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The shape of the instance. The shape determines the number of CPUs and the amount of
         * memory allocated to the instance. You can enumerate all available shapes by calling
         * {@link #listShapes(ListShapesRequest) listShapes}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the instance. The shape determines the number of CPUs and the amount of
         * memory allocated to the instance. You can enumerate all available shapes by calling
         * {@link #listShapes(ListShapesRequest) listShapes}.
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
        private InstanceShapeConfig shapeConfig;

        public Builder shapeConfig(InstanceShapeConfig shapeConfig) {
            this.shapeConfig = shapeConfig;
            this.__explicitlySet__.add("shapeConfig");
            return this;
        }
        /**
         * Whether the instance\u2019s OCPUs and memory are distributed across multiple NUMA nodes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCrossNumaNode")
        private Boolean isCrossNumaNode;

        /**
         * Whether the instance\u2019s OCPUs and memory are distributed across multiple NUMA nodes.
         *
         * @param isCrossNumaNode the value to set
         * @return this builder
         */
        public Builder isCrossNumaNode(Boolean isCrossNumaNode) {
            this.isCrossNumaNode = isCrossNumaNode;
            this.__explicitlySet__.add("isCrossNumaNode");
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
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The date and time the instance was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the instance was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("agentConfig")
        private InstanceAgentConfig agentConfig;

        public Builder agentConfig(InstanceAgentConfig agentConfig) {
            this.agentConfig = agentConfig;
            this.__explicitlySet__.add("agentConfig");
            return this;
        }
        /**
         * The date and time the instance is expected to be stopped / started, in the format defined
         * by [RFC3339](https://tools.ietf.org/html/rfc3339). After that time if instance hasn't
         * been rebooted, Oracle will reboot the instance within 24 hours of the due time.
         * Regardless of how the instance was stopped, the flag will be reset to empty as soon as
         * instance reaches Stopped state. Example: {@code 2018-05-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceRebootDue")
        private java.util.Date timeMaintenanceRebootDue;

        /**
         * The date and time the instance is expected to be stopped / started, in the format defined
         * by [RFC3339](https://tools.ietf.org/html/rfc3339). After that time if instance hasn't
         * been rebooted, Oracle will reboot the instance within 24 hours of the due time.
         * Regardless of how the instance was stopped, the flag will be reset to empty as soon as
         * instance reaches Stopped state. Example: {@code 2018-05-25T21:10:29.600Z}
         *
         * @param timeMaintenanceRebootDue the value to set
         * @return this builder
         */
        public Builder timeMaintenanceRebootDue(java.util.Date timeMaintenanceRebootDue) {
            this.timeMaintenanceRebootDue = timeMaintenanceRebootDue;
            this.__explicitlySet__.add("timeMaintenanceRebootDue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformConfig")
        private PlatformConfig platformConfig;

        public Builder platformConfig(PlatformConfig platformConfig) {
            this.platformConfig = platformConfig;
            this.__explicitlySet__.add("platformConfig");
            return this;
        }
        /**
         * The OCID of the Instance Configuration used to source launch details for this instance.
         * Any other fields supplied in the instance launch request override the details stored in
         * the Instance Configuration for this instance launch.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceConfigurationId")
        private String instanceConfigurationId;

        /**
         * The OCID of the Instance Configuration used to source launch details for this instance.
         * Any other fields supplied in the instance launch request override the details stored in
         * the Instance Configuration for this instance launch.
         *
         * @param instanceConfigurationId the value to set
         * @return this builder
         */
        public Builder instanceConfigurationId(String instanceConfigurationId) {
            this.instanceConfigurationId = instanceConfigurationId;
            this.__explicitlySet__.add("instanceConfigurationId");
            return this;
        }
        /** List of licensing configurations associated with the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("licensingConfigs")
        private java.util.List<LicensingConfig> licensingConfigs;

        /**
         * List of licensing configurations associated with the instance.
         *
         * @param licensingConfigs the value to set
         * @return this builder
         */
        public Builder licensingConfigs(java.util.List<LicensingConfig> licensingConfigs) {
            this.licensingConfigs = licensingConfigs;
            this.__explicitlySet__.add("licensingConfigs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Instance build() {
            Instance model =
                    new Instance(
                            this.availabilityDomain,
                            this.capacityReservationId,
                            this.compartmentId,
                            this.clusterPlacementGroupId,
                            this.dedicatedVmHostId,
                            this.definedTags,
                            this.securityAttributes,
                            this.securityAttributesState,
                            this.displayName,
                            this.extendedMetadata,
                            this.faultDomain,
                            this.freeformTags,
                            this.id,
                            this.imageId,
                            this.ipxeScript,
                            this.launchMode,
                            this.launchOptions,
                            this.instanceOptions,
                            this.availabilityConfig,
                            this.preemptibleInstanceConfig,
                            this.lifecycleState,
                            this.metadata,
                            this.region,
                            this.shape,
                            this.shapeConfig,
                            this.isCrossNumaNode,
                            this.sourceDetails,
                            this.systemTags,
                            this.timeCreated,
                            this.agentConfig,
                            this.timeMaintenanceRebootDue,
                            this.platformConfig,
                            this.instanceConfigurationId,
                            this.licensingConfigs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Instance model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("capacityReservationId")) {
                this.capacityReservationId(model.getCapacityReservationId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
            }
            if (model.wasPropertyExplicitlySet("dedicatedVmHostId")) {
                this.dedicatedVmHostId(model.getDedicatedVmHostId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("securityAttributesState")) {
                this.securityAttributesState(model.getSecurityAttributesState());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("extendedMetadata")) {
                this.extendedMetadata(model.getExtendedMetadata());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("imageId")) {
                this.imageId(model.getImageId());
            }
            if (model.wasPropertyExplicitlySet("ipxeScript")) {
                this.ipxeScript(model.getIpxeScript());
            }
            if (model.wasPropertyExplicitlySet("launchMode")) {
                this.launchMode(model.getLaunchMode());
            }
            if (model.wasPropertyExplicitlySet("launchOptions")) {
                this.launchOptions(model.getLaunchOptions());
            }
            if (model.wasPropertyExplicitlySet("instanceOptions")) {
                this.instanceOptions(model.getInstanceOptions());
            }
            if (model.wasPropertyExplicitlySet("availabilityConfig")) {
                this.availabilityConfig(model.getAvailabilityConfig());
            }
            if (model.wasPropertyExplicitlySet("preemptibleInstanceConfig")) {
                this.preemptibleInstanceConfig(model.getPreemptibleInstanceConfig());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("shapeConfig")) {
                this.shapeConfig(model.getShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("isCrossNumaNode")) {
                this.isCrossNumaNode(model.getIsCrossNumaNode());
            }
            if (model.wasPropertyExplicitlySet("sourceDetails")) {
                this.sourceDetails(model.getSourceDetails());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("agentConfig")) {
                this.agentConfig(model.getAgentConfig());
            }
            if (model.wasPropertyExplicitlySet("timeMaintenanceRebootDue")) {
                this.timeMaintenanceRebootDue(model.getTimeMaintenanceRebootDue());
            }
            if (model.wasPropertyExplicitlySet("platformConfig")) {
                this.platformConfig(model.getPlatformConfig());
            }
            if (model.wasPropertyExplicitlySet("instanceConfigurationId")) {
                this.instanceConfigurationId(model.getInstanceConfigurationId());
            }
            if (model.wasPropertyExplicitlySet("licensingConfigs")) {
                this.licensingConfigs(model.getLicensingConfigs());
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

    /**
     * The availability domain the instance is running in.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain the instance is running in.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the compute capacity reservation this instance is launched under. When this field
     * contains an empty string or is null, the instance is not currently in a capacity reservation.
     * For more information, see [Capacity
     * Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
    private final String capacityReservationId;

    /**
     * The OCID of the compute capacity reservation this instance is launched under. When this field
     * contains an empty string or is null, the instance is not currently in a capacity reservation.
     * For more information, see [Capacity
     * Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
     *
     * @return the value
     */
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /** The OCID of the compartment that contains the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the instance.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the cluster placement group of the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
    private final String clusterPlacementGroupId;

    /**
     * The OCID of the cluster placement group of the instance.
     *
     * @return the value
     */
    public String getClusterPlacementGroupId() {
        return clusterPlacementGroupId;
    }

    /** The OCID of the dedicated virtual machine host that the instance is placed on. */
    @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostId")
    private final String dedicatedVmHostId;

    /**
     * The OCID of the dedicated virtual machine host that the instance is placed on.
     *
     * @return the value
     */
    public String getDedicatedVmHostId() {
        return dedicatedVmHostId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * [Security
     * attributes](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
     * are labels for a resource that can be referenced in a [Zero Trust Packet
     * Routing](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
     * (ZPR) policy to control access to ZPR-supported resources.
     *
     * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
     * {"value":"42","mode":"audit"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * [Security
     * attributes](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
     * are labels for a resource that can be referenced in a [Zero Trust Packet
     * Routing](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
     * (ZPR) policy to control access to ZPR-supported resources.
     *
     * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
     * {"value":"42","mode":"audit"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
    }

    /** The lifecycle state of the {@code securityAttributes} */
    public enum SecurityAttributesState implements com.oracle.bmc.http.internal.BmcEnum {
        Stable("STABLE"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SecurityAttributesState.class);

        private final String value;
        private static java.util.Map<String, SecurityAttributesState> map;

        static {
            map = new java.util.HashMap<>();
            for (SecurityAttributesState v : SecurityAttributesState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SecurityAttributesState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SecurityAttributesState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SecurityAttributesState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The lifecycle state of the {@code securityAttributes} */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributesState")
    private final SecurityAttributesState securityAttributesState;

    /**
     * The lifecycle state of the {@code securityAttributes}
     *
     * @return the value
     */
    public SecurityAttributesState getSecurityAttributesState() {
        return securityAttributesState;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Additional metadata key/value pairs that you provide. They serve the same purpose and
     * functionality as fields in the {@code metadata} object.
     *
     * <p>They are distinguished from {@code metadata} fields in that these can be nested JSON
     * objects (whereas {@code metadata} fields are string/string maps only).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    private final java.util.Map<String, Object> extendedMetadata;

    /**
     * Additional metadata key/value pairs that you provide. They serve the same purpose and
     * functionality as fields in the {@code metadata} object.
     *
     * <p>They are distinguished from {@code metadata} fields in that these can be nested JSON
     * objects (whereas {@code metadata} fields are string/string maps only).
     *
     * @return the value
     */
    public java.util.Map<String, Object> getExtendedMetadata() {
        return extendedMetadata;
    }

    /**
     * The name of the fault domain the instance is running in.
     *
     * <p>A fault domain is a grouping of hardware and infrastructure within an availability domain.
     * Each availability domain contains three fault domains. Fault domains let you distribute your
     * instances so that they are not on the same physical hardware within a single availability
     * domain. A hardware failure or Compute hardware maintenance that affects one fault domain does
     * not affect instances in other fault domains.
     *
     * <p>If you do not specify the fault domain, the system selects one for you.
     *
     * <p>Example: {@code FAULT-DOMAIN-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * The name of the fault domain the instance is running in.
     *
     * <p>A fault domain is a grouping of hardware and infrastructure within an availability domain.
     * Each availability domain contains three fault domains. Fault domains let you distribute your
     * instances so that they are not on the same physical hardware within a single availability
     * domain. A hardware failure or Compute hardware maintenance that affects one fault domain does
     * not affect instances in other fault domains.
     *
     * <p>If you do not specify the fault domain, the system selects one for you.
     *
     * <p>Example: {@code FAULT-DOMAIN-1}
     *
     * @return the value
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /** The OCID of the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the instance.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Deprecated. Use {@code sourceDetails} instead. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    /**
     * Deprecated. Use {@code sourceDetails} instead.
     *
     * @return the value
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * When a bare metal or virtual machine instance boots, the iPXE firmware that runs on the
     * instance is configured to run an iPXE script to continue the boot process.
     *
     * <p>If you want more control over the boot process, you can provide your own custom iPXE
     * script that will run when the instance boots. Be aware that the same iPXE script will run
     * every time an instance boots, not only after the initial LaunchInstance call.
     *
     * <p>The default iPXE script connects to the instance's local boot volume over iSCSI and
     * performs a network boot. If you use a custom iPXE script and want to network-boot from the
     * instance's local boot volume over iSCSI the same way as the default iPXE script, use the
     * following iSCSI IP address: 169.254.0.2, and boot volume IQN: iqn.2015-02.oracle.boot.
     *
     * <p>If your instance boot volume attachment type is paravirtualized, the boot volume is
     * attached to the instance through virtio-scsi and no iPXE script is used. If your instance
     * boot volume attachment type is paravirtualized and you use custom iPXE to network boot into
     * your instance, the primary boot volume is attached as a data volume through virtio-scsi
     * drive.
     *
     * <p>For more information about the Bring Your Own Image feature of Oracle Cloud
     * Infrastructure, see [Bring Your Own
     * Image](https://docs.cloud.oracle.com/iaas/Content/Compute/References/bringyourownimage.htm).
     *
     * <p>For more information about iPXE, see http://ipxe.org.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipxeScript")
    private final String ipxeScript;

    /**
     * When a bare metal or virtual machine instance boots, the iPXE firmware that runs on the
     * instance is configured to run an iPXE script to continue the boot process.
     *
     * <p>If you want more control over the boot process, you can provide your own custom iPXE
     * script that will run when the instance boots. Be aware that the same iPXE script will run
     * every time an instance boots, not only after the initial LaunchInstance call.
     *
     * <p>The default iPXE script connects to the instance's local boot volume over iSCSI and
     * performs a network boot. If you use a custom iPXE script and want to network-boot from the
     * instance's local boot volume over iSCSI the same way as the default iPXE script, use the
     * following iSCSI IP address: 169.254.0.2, and boot volume IQN: iqn.2015-02.oracle.boot.
     *
     * <p>If your instance boot volume attachment type is paravirtualized, the boot volume is
     * attached to the instance through virtio-scsi and no iPXE script is used. If your instance
     * boot volume attachment type is paravirtualized and you use custom iPXE to network boot into
     * your instance, the primary boot volume is attached as a data volume through virtio-scsi
     * drive.
     *
     * <p>For more information about the Bring Your Own Image feature of Oracle Cloud
     * Infrastructure, see [Bring Your Own
     * Image](https://docs.cloud.oracle.com/iaas/Content/Compute/References/bringyourownimage.htm).
     *
     * <p>For more information about iPXE, see http://ipxe.org.
     *
     * @return the value
     */
    public String getIpxeScript() {
        return ipxeScript;
    }

    /**
     * Specifies the configuration mode for launching virtual machine (VM) instances. The
     * configuration modes are: * {@code NATIVE} - VM instances launch with iSCSI boot and VFIO
     * devices. The default value for platform images. * {@code EMULATED} - VM instances launch with
     * emulated devices, such as the E1000 network driver and emulated SCSI disk controller. *
     * {@code PARAVIRTUALIZED} - VM instances launch with paravirtualized devices using VirtIO
     * drivers. * {@code CUSTOM} - VM instances launch with custom configuration settings specified
     * in the {@code LaunchOptions} parameter.
     */
    public enum LaunchMode implements com.oracle.bmc.http.internal.BmcEnum {
        Native("NATIVE"),
        Emulated("EMULATED"),
        Paravirtualized("PARAVIRTUALIZED"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LaunchMode.class);

        private final String value;
        private static java.util.Map<String, LaunchMode> map;

        static {
            map = new java.util.HashMap<>();
            for (LaunchMode v : LaunchMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LaunchMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LaunchMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LaunchMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the configuration mode for launching virtual machine (VM) instances. The
     * configuration modes are: * {@code NATIVE} - VM instances launch with iSCSI boot and VFIO
     * devices. The default value for platform images. * {@code EMULATED} - VM instances launch with
     * emulated devices, such as the E1000 network driver and emulated SCSI disk controller. *
     * {@code PARAVIRTUALIZED} - VM instances launch with paravirtualized devices using VirtIO
     * drivers. * {@code CUSTOM} - VM instances launch with custom configuration settings specified
     * in the {@code LaunchOptions} parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("launchMode")
    private final LaunchMode launchMode;

    /**
     * Specifies the configuration mode for launching virtual machine (VM) instances. The
     * configuration modes are: * {@code NATIVE} - VM instances launch with iSCSI boot and VFIO
     * devices. The default value for platform images. * {@code EMULATED} - VM instances launch with
     * emulated devices, such as the E1000 network driver and emulated SCSI disk controller. *
     * {@code PARAVIRTUALIZED} - VM instances launch with paravirtualized devices using VirtIO
     * drivers. * {@code CUSTOM} - VM instances launch with custom configuration settings specified
     * in the {@code LaunchOptions} parameter.
     *
     * @return the value
     */
    public LaunchMode getLaunchMode() {
        return launchMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("launchOptions")
    private final LaunchOptions launchOptions;

    public LaunchOptions getLaunchOptions() {
        return launchOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("instanceOptions")
    private final InstanceOptions instanceOptions;

    public InstanceOptions getInstanceOptions() {
        return instanceOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("availabilityConfig")
    private final InstanceAvailabilityConfig availabilityConfig;

    public InstanceAvailabilityConfig getAvailabilityConfig() {
        return availabilityConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("preemptibleInstanceConfig")
    private final PreemptibleInstanceConfigDetails preemptibleInstanceConfig;

    public PreemptibleInstanceConfigDetails getPreemptibleInstanceConfig() {
        return preemptibleInstanceConfig;
    }

    /** The current state of the instance. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Moving("MOVING"),
        Provisioning("PROVISIONING"),
        Running("RUNNING"),
        Starting("STARTING"),
        Stopping("STOPPING"),
        Stopped("STOPPED"),
        CreatingImage("CREATING_IMAGE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

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
    /** The current state of the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the instance.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Custom metadata that you provide. */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * Custom metadata that you provide.
     *
     * @return the value
     */
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * The region that contains the availability domain the instance is running in.
     *
     * <p>For the us-phoenix-1 and us-ashburn-1 regions, {@code phx} and {@code iad} are returned,
     * respectively. For all other regions, the full region name is returned.
     *
     * <p>Examples: {@code phx}, {@code eu-frankfurt-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region that contains the availability domain the instance is running in.
     *
     * <p>For the us-phoenix-1 and us-ashburn-1 regions, {@code phx} and {@code iad} are returned,
     * respectively. For all other regions, the full region name is returned.
     *
     * <p>Examples: {@code phx}, {@code eu-frankfurt-1}
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * The shape of the instance. The shape determines the number of CPUs and the amount of memory
     * allocated to the instance. You can enumerate all available shapes by calling {@link
     * #listShapes(ListShapesRequest) listShapes}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the instance. The shape determines the number of CPUs and the amount of memory
     * allocated to the instance. You can enumerate all available shapes by calling {@link
     * #listShapes(ListShapesRequest) listShapes}.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
    private final InstanceShapeConfig shapeConfig;

    public InstanceShapeConfig getShapeConfig() {
        return shapeConfig;
    }

    /** Whether the instance\u2019s OCPUs and memory are distributed across multiple NUMA nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCrossNumaNode")
    private final Boolean isCrossNumaNode;

    /**
     * Whether the instance\u2019s OCPUs and memory are distributed across multiple NUMA nodes.
     *
     * @return the value
     */
    public Boolean getIsCrossNumaNode() {
        return isCrossNumaNode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
    private final InstanceSourceDetails sourceDetails;

    public InstanceSourceDetails getSourceDetails() {
        return sourceDetails;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * The date and time the instance was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the instance was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("agentConfig")
    private final InstanceAgentConfig agentConfig;

    public InstanceAgentConfig getAgentConfig() {
        return agentConfig;
    }

    /**
     * The date and time the instance is expected to be stopped / started, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). After that time if instance hasn't been
     * rebooted, Oracle will reboot the instance within 24 hours of the due time. Regardless of how
     * the instance was stopped, the flag will be reset to empty as soon as instance reaches Stopped
     * state. Example: {@code 2018-05-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceRebootDue")
    private final java.util.Date timeMaintenanceRebootDue;

    /**
     * The date and time the instance is expected to be stopped / started, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). After that time if instance hasn't been
     * rebooted, Oracle will reboot the instance within 24 hours of the due time. Regardless of how
     * the instance was stopped, the flag will be reset to empty as soon as instance reaches Stopped
     * state. Example: {@code 2018-05-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeMaintenanceRebootDue() {
        return timeMaintenanceRebootDue;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("platformConfig")
    private final PlatformConfig platformConfig;

    public PlatformConfig getPlatformConfig() {
        return platformConfig;
    }

    /**
     * The OCID of the Instance Configuration used to source launch details for this instance. Any
     * other fields supplied in the instance launch request override the details stored in the
     * Instance Configuration for this instance launch.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceConfigurationId")
    private final String instanceConfigurationId;

    /**
     * The OCID of the Instance Configuration used to source launch details for this instance. Any
     * other fields supplied in the instance launch request override the details stored in the
     * Instance Configuration for this instance launch.
     *
     * @return the value
     */
    public String getInstanceConfigurationId() {
        return instanceConfigurationId;
    }

    /** List of licensing configurations associated with the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("licensingConfigs")
    private final java.util.List<LicensingConfig> licensingConfigs;

    /**
     * List of licensing configurations associated with the instance.
     *
     * @return the value
     */
    public java.util.List<LicensingConfig> getLicensingConfigs() {
        return licensingConfigs;
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
        sb.append("Instance(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", clusterPlacementGroupId=")
                .append(String.valueOf(this.clusterPlacementGroupId));
        sb.append(", dedicatedVmHostId=").append(String.valueOf(this.dedicatedVmHostId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", securityAttributesState=")
                .append(String.valueOf(this.securityAttributesState));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", extendedMetadata=").append(String.valueOf(this.extendedMetadata));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", imageId=").append(String.valueOf(this.imageId));
        sb.append(", ipxeScript=").append(String.valueOf(this.ipxeScript));
        sb.append(", launchMode=").append(String.valueOf(this.launchMode));
        sb.append(", launchOptions=").append(String.valueOf(this.launchOptions));
        sb.append(", instanceOptions=").append(String.valueOf(this.instanceOptions));
        sb.append(", availabilityConfig=").append(String.valueOf(this.availabilityConfig));
        sb.append(", preemptibleInstanceConfig=")
                .append(String.valueOf(this.preemptibleInstanceConfig));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", shapeConfig=").append(String.valueOf(this.shapeConfig));
        sb.append(", isCrossNumaNode=").append(String.valueOf(this.isCrossNumaNode));
        sb.append(", sourceDetails=").append(String.valueOf(this.sourceDetails));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", agentConfig=").append(String.valueOf(this.agentConfig));
        sb.append(", timeMaintenanceRebootDue=")
                .append(String.valueOf(this.timeMaintenanceRebootDue));
        sb.append(", platformConfig=").append(String.valueOf(this.platformConfig));
        sb.append(", instanceConfigurationId=")
                .append(String.valueOf(this.instanceConfigurationId));
        sb.append(", licensingConfigs=").append(String.valueOf(this.licensingConfigs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Instance)) {
            return false;
        }

        Instance other = (Instance) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupId, other.clusterPlacementGroupId)
                && java.util.Objects.equals(this.dedicatedVmHostId, other.dedicatedVmHostId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(
                        this.securityAttributesState, other.securityAttributesState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.extendedMetadata, other.extendedMetadata)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.ipxeScript, other.ipxeScript)
                && java.util.Objects.equals(this.launchMode, other.launchMode)
                && java.util.Objects.equals(this.launchOptions, other.launchOptions)
                && java.util.Objects.equals(this.instanceOptions, other.instanceOptions)
                && java.util.Objects.equals(this.availabilityConfig, other.availabilityConfig)
                && java.util.Objects.equals(
                        this.preemptibleInstanceConfig, other.preemptibleInstanceConfig)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.shapeConfig, other.shapeConfig)
                && java.util.Objects.equals(this.isCrossNumaNode, other.isCrossNumaNode)
                && java.util.Objects.equals(this.sourceDetails, other.sourceDetails)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.agentConfig, other.agentConfig)
                && java.util.Objects.equals(
                        this.timeMaintenanceRebootDue, other.timeMaintenanceRebootDue)
                && java.util.Objects.equals(this.platformConfig, other.platformConfig)
                && java.util.Objects.equals(
                        this.instanceConfigurationId, other.instanceConfigurationId)
                && java.util.Objects.equals(this.licensingConfigs, other.licensingConfigs)
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
                        + (this.clusterPlacementGroupId == null
                                ? 43
                                : this.clusterPlacementGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.dedicatedVmHostId == null ? 43 : this.dedicatedVmHostId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributesState == null
                                ? 43
                                : this.securityAttributesState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedMetadata == null ? 43 : this.extendedMetadata.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result = (result * PRIME) + (this.ipxeScript == null ? 43 : this.ipxeScript.hashCode());
        result = (result * PRIME) + (this.launchMode == null ? 43 : this.launchMode.hashCode());
        result =
                (result * PRIME)
                        + (this.launchOptions == null ? 43 : this.launchOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceOptions == null ? 43 : this.instanceOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityConfig == null
                                ? 43
                                : this.availabilityConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.preemptibleInstanceConfig == null
                                ? 43
                                : this.preemptibleInstanceConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.shapeConfig == null ? 43 : this.shapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.isCrossNumaNode == null ? 43 : this.isCrossNumaNode.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDetails == null ? 43 : this.sourceDetails.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.agentConfig == null ? 43 : this.agentConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaintenanceRebootDue == null
                                ? 43
                                : this.timeMaintenanceRebootDue.hashCode());
        result =
                (result * PRIME)
                        + (this.platformConfig == null ? 43 : this.platformConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceConfigurationId == null
                                ? 43
                                : this.instanceConfigurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.licensingConfigs == null ? 43 : this.licensingConfigs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
