/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Instance launch details for creating an instance from an instance configuration. Use the {@code
 * sourceDetails} parameter to specify whether a boot volume or an image should be used to launch a
 * new instance.
 *
 * <p>See {@link LaunchInstanceDetails} for more information. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstanceConfigurationLaunchInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceConfigurationLaunchInstanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "capacityReservationId",
        "isAIEnterpriseEnabled",
        "placementConstraintDetails",
        "computeClusterId",
        "compartmentId",
        "clusterPlacementGroupId",
        "createVnicDetails",
        "definedTags",
        "securityAttributes",
        "displayName",
        "extendedMetadata",
        "freeformTags",
        "ipxeScript",
        "metadata",
        "shape",
        "shapeConfig",
        "platformConfig",
        "sourceDetails",
        "faultDomain",
        "dedicatedVmHostId",
        "launchMode",
        "launchOptions",
        "agentConfig",
        "isPvEncryptionInTransitEnabled",
        "preferredMaintenanceAction",
        "instanceOptions",
        "availabilityConfig",
        "preemptibleInstanceConfig",
        "licensingConfigs"
    })
    public InstanceConfigurationLaunchInstanceDetails(
            String availabilityDomain,
            String capacityReservationId,
            Boolean isAIEnterpriseEnabled,
            InstanceConfigurationPlacementConstraintDetails placementConstraintDetails,
            String computeClusterId,
            String compartmentId,
            String clusterPlacementGroupId,
            InstanceConfigurationCreateVnicDetails createVnicDetails,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            String displayName,
            java.util.Map<String, Object> extendedMetadata,
            java.util.Map<String, String> freeformTags,
            String ipxeScript,
            java.util.Map<String, String> metadata,
            String shape,
            InstanceConfigurationLaunchInstanceShapeConfigDetails shapeConfig,
            InstanceConfigurationLaunchInstancePlatformConfig platformConfig,
            InstanceConfigurationInstanceSourceDetails sourceDetails,
            String faultDomain,
            String dedicatedVmHostId,
            LaunchMode launchMode,
            InstanceConfigurationLaunchOptions launchOptions,
            InstanceConfigurationLaunchInstanceAgentConfigDetails agentConfig,
            Boolean isPvEncryptionInTransitEnabled,
            PreferredMaintenanceAction preferredMaintenanceAction,
            InstanceConfigurationInstanceOptions instanceOptions,
            InstanceConfigurationAvailabilityConfig availabilityConfig,
            PreemptibleInstanceConfigDetails preemptibleInstanceConfig,
            java.util.List<LaunchInstanceLicensingConfig> licensingConfigs) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.capacityReservationId = capacityReservationId;
        this.isAIEnterpriseEnabled = isAIEnterpriseEnabled;
        this.placementConstraintDetails = placementConstraintDetails;
        this.computeClusterId = computeClusterId;
        this.compartmentId = compartmentId;
        this.clusterPlacementGroupId = clusterPlacementGroupId;
        this.createVnicDetails = createVnicDetails;
        this.definedTags = definedTags;
        this.securityAttributes = securityAttributes;
        this.displayName = displayName;
        this.extendedMetadata = extendedMetadata;
        this.freeformTags = freeformTags;
        this.ipxeScript = ipxeScript;
        this.metadata = metadata;
        this.shape = shape;
        this.shapeConfig = shapeConfig;
        this.platformConfig = platformConfig;
        this.sourceDetails = sourceDetails;
        this.faultDomain = faultDomain;
        this.dedicatedVmHostId = dedicatedVmHostId;
        this.launchMode = launchMode;
        this.launchOptions = launchOptions;
        this.agentConfig = agentConfig;
        this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
        this.preferredMaintenanceAction = preferredMaintenanceAction;
        this.instanceOptions = instanceOptions;
        this.availabilityConfig = availabilityConfig;
        this.preemptibleInstanceConfig = preemptibleInstanceConfig;
        this.licensingConfigs = licensingConfigs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain of the instance.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of the instance.
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
        /** The OCID of the compute capacity reservation this instance is launched under. */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
        private String capacityReservationId;

        /**
         * The OCID of the compute capacity reservation this instance is launched under.
         *
         * @param capacityReservationId the value to set
         * @return this builder
         */
        public Builder capacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            this.__explicitlySet__.add("capacityReservationId");
            return this;
        }
        /** Whether to enable AI enterprise on the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAIEnterpriseEnabled")
        private Boolean isAIEnterpriseEnabled;

        /**
         * Whether to enable AI enterprise on the instance.
         *
         * @param isAIEnterpriseEnabled the value to set
         * @return this builder
         */
        public Builder isAIEnterpriseEnabled(Boolean isAIEnterpriseEnabled) {
            this.isAIEnterpriseEnabled = isAIEnterpriseEnabled;
            this.__explicitlySet__.add("isAIEnterpriseEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("placementConstraintDetails")
        private InstanceConfigurationPlacementConstraintDetails placementConstraintDetails;

        public Builder placementConstraintDetails(
                InstanceConfigurationPlacementConstraintDetails placementConstraintDetails) {
            this.placementConstraintDetails = placementConstraintDetails;
            this.__explicitlySet__.add("placementConstraintDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * [compute
         * cluster](https://docs.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm) that
         * the instance will be created in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeClusterId")
        private String computeClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * [compute
         * cluster](https://docs.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm) that
         * the instance will be created in.
         *
         * @param computeClusterId the value to set
         * @return this builder
         */
        public Builder computeClusterId(String computeClusterId) {
            this.computeClusterId = computeClusterId;
            this.__explicitlySet__.add("computeClusterId");
            return this;
        }
        /**
         * The OCID of the compartment containing the instance. Instances created from instance
         * configurations are placed in the same compartment as the instance that was used to create
         * the instance configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the instance. Instances created from instance
         * configurations are placed in the same compartment as the instance that was used to create
         * the instance configuration.
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

        @com.fasterxml.jackson.annotation.JsonProperty("createVnicDetails")
        private InstanceConfigurationCreateVnicDetails createVnicDetails;

        public Builder createVnicDetails(InstanceConfigurationCreateVnicDetails createVnicDetails) {
            this.createVnicDetails = createVnicDetails;
            this.__explicitlySet__.add("createVnicDetails");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
         * are labels for a resource that can be referenced in a [Zero Trust Packet
         * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
         * (ZPR) policy to control access to ZPR-supported resources.
         *
         * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
         * {"value":"42","mode":"audit"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * [Security
         * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
         * are labels for a resource that can be referenced in a [Zero Trust Packet
         * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
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
         *
         * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be
         * a maximum of 32,000 bytes.
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
         * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be
         * a maximum of 32,000 bytes.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        /**
         * This is an advanced option.
         *
         * <p>When a bare metal or virtual machine instance boots, the iPXE firmware that runs on
         * the instance is configured to run an iPXE script to continue the boot process.
         *
         * <p>If you want more control over the boot process, you can provide your own custom iPXE
         * script that will run when the instance boots; however, you should be aware that the same
         * iPXE script will run every time an instance boots; not only after the initial
         * LaunchInstance call.
         *
         * <p>The default iPXE script connects to the instance's local boot volume over iSCSI and
         * performs a network boot. If you use a custom iPXE script and want to network-boot from
         * the instance's local boot volume over iSCSI the same way as the default iPXE script, you
         * should use the following iSCSI IP address: 169.254.0.2, and boot volume IQN:
         * iqn.2015-02.oracle.boot.
         *
         * <p>For more information about the Bring Your Own Image feature of Oracle Cloud
         * Infrastructure, see [Bring Your Own
         * Image](https://docs.oracle.com/iaas/Content/Compute/References/bringyourownimage.htm).
         *
         * <p>For more information about iPXE, see http://ipxe.org.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipxeScript")
        private String ipxeScript;

        /**
         * This is an advanced option.
         *
         * <p>When a bare metal or virtual machine instance boots, the iPXE firmware that runs on
         * the instance is configured to run an iPXE script to continue the boot process.
         *
         * <p>If you want more control over the boot process, you can provide your own custom iPXE
         * script that will run when the instance boots; however, you should be aware that the same
         * iPXE script will run every time an instance boots; not only after the initial
         * LaunchInstance call.
         *
         * <p>The default iPXE script connects to the instance's local boot volume over iSCSI and
         * performs a network boot. If you use a custom iPXE script and want to network-boot from
         * the instance's local boot volume over iSCSI the same way as the default iPXE script, you
         * should use the following iSCSI IP address: 169.254.0.2, and boot volume IQN:
         * iqn.2015-02.oracle.boot.
         *
         * <p>For more information about the Bring Your Own Image feature of Oracle Cloud
         * Infrastructure, see [Bring Your Own
         * Image](https://docs.oracle.com/iaas/Content/Compute/References/bringyourownimage.htm).
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
         * Custom metadata key/value pairs that you provide, such as the SSH public key required to
         * connect to the instance.
         *
         * <p>A metadata service runs on every launched instance. The service is an HTTP endpoint
         * listening on 169.254.169.254. You can use the service to:
         *
         * <p>Provide information to [Cloud-Init](https://cloudinit.readthedocs.org/en/latest/) to
         * be used for various system initialization tasks.
         *
         * <p>Get information about the instance, including the custom metadata that you provide
         * when you launch the instance.
         *
         * <p>*Providing Cloud-Init Metadata**
         *
         * <p>You can use the following metadata key names to provide information to Cloud-Init:
         *
         * <p>*"ssh_authorized_keys"** - Provide one or more public SSH keys to be included in the
         * {@code ~/.ssh/authorized_keys} file for the default user on the instance. Use a newline
         * character to separate multiple keys. The SSH keys must be in the format necessary for the
         * {@code authorized_keys} file, as shown in the example below.
         *
         * <p>*"user_data"** - Provide your own base64-encoded data to be used by Cloud-Init to run
         * custom scripts or provide custom Cloud-Init configuration. For information about how to
         * take advantage of user data, see the [Cloud-Init
         * Documentation](http://cloudinit.readthedocs.org/en/latest/topics/format.html).
         *
         * <p>*Metadata Example**
         *
         * <p>"metadata" : { "quake_bot_level" : "Severe", "ssh_authorized_keys" : "ssh-rsa
         * <your_public_SSH_key>== rsa-key-20160227", "user_data" : "<your_public_SSH_key>==" }
         * **Getting Metadata on the Instance**
         *
         * <p>To get information about your instance, connect to the instance using SSH and issue
         * any of the following GET requests:
         *
         * <p>curl -H "Authorization: Bearer Oracle" http://169.254.169.254/opc/v2/instance/ curl -H
         * "Authorization: Bearer Oracle" http://169.254.169.254/opc/v2/instance/metadata/ curl -H
         * "Authorization: Bearer Oracle"
         * http://169.254.169.254/opc/v2/instance/metadata/<any-key-name>
         *
         * <p>You'll get back a response that includes all the instance information; only the
         * metadata information; or the metadata information for the specified key name,
         * respectively.
         *
         * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be
         * a maximum of 32,000 bytes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * Custom metadata key/value pairs that you provide, such as the SSH public key required to
         * connect to the instance.
         *
         * <p>A metadata service runs on every launched instance. The service is an HTTP endpoint
         * listening on 169.254.169.254. You can use the service to:
         *
         * <p>Provide information to [Cloud-Init](https://cloudinit.readthedocs.org/en/latest/) to
         * be used for various system initialization tasks.
         *
         * <p>Get information about the instance, including the custom metadata that you provide
         * when you launch the instance.
         *
         * <p>*Providing Cloud-Init Metadata**
         *
         * <p>You can use the following metadata key names to provide information to Cloud-Init:
         *
         * <p>*"ssh_authorized_keys"** - Provide one or more public SSH keys to be included in the
         * {@code ~/.ssh/authorized_keys} file for the default user on the instance. Use a newline
         * character to separate multiple keys. The SSH keys must be in the format necessary for the
         * {@code authorized_keys} file, as shown in the example below.
         *
         * <p>*"user_data"** - Provide your own base64-encoded data to be used by Cloud-Init to run
         * custom scripts or provide custom Cloud-Init configuration. For information about how to
         * take advantage of user data, see the [Cloud-Init
         * Documentation](http://cloudinit.readthedocs.org/en/latest/topics/format.html).
         *
         * <p>*Metadata Example**
         *
         * <p>"metadata" : { "quake_bot_level" : "Severe", "ssh_authorized_keys" : "ssh-rsa
         * <your_public_SSH_key>== rsa-key-20160227", "user_data" : "<your_public_SSH_key>==" }
         * **Getting Metadata on the Instance**
         *
         * <p>To get information about your instance, connect to the instance using SSH and issue
         * any of the following GET requests:
         *
         * <p>curl -H "Authorization: Bearer Oracle" http://169.254.169.254/opc/v2/instance/ curl -H
         * "Authorization: Bearer Oracle" http://169.254.169.254/opc/v2/instance/metadata/ curl -H
         * "Authorization: Bearer Oracle"
         * http://169.254.169.254/opc/v2/instance/metadata/<any-key-name>
         *
         * <p>You'll get back a response that includes all the instance information; only the
         * metadata information; or the metadata information for the specified key name,
         * respectively.
         *
         * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be
         * a maximum of 32,000 bytes.
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
         * The shape of an instance. The shape determines the number of CPUs, amount of memory, and
         * other resources allocated to the instance.
         *
         * <p>You can enumerate all available shapes by calling {@link
         * #listShapes(ListShapesRequest) listShapes}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of an instance. The shape determines the number of CPUs, amount of memory, and
         * other resources allocated to the instance.
         *
         * <p>You can enumerate all available shapes by calling {@link
         * #listShapes(ListShapesRequest) listShapes}.
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
        private InstanceConfigurationLaunchInstanceShapeConfigDetails shapeConfig;

        public Builder shapeConfig(
                InstanceConfigurationLaunchInstanceShapeConfigDetails shapeConfig) {
            this.shapeConfig = shapeConfig;
            this.__explicitlySet__.add("shapeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformConfig")
        private InstanceConfigurationLaunchInstancePlatformConfig platformConfig;

        public Builder platformConfig(
                InstanceConfigurationLaunchInstancePlatformConfig platformConfig) {
            this.platformConfig = platformConfig;
            this.__explicitlySet__.add("platformConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
        private InstanceConfigurationInstanceSourceDetails sourceDetails;

        public Builder sourceDetails(InstanceConfigurationInstanceSourceDetails sourceDetails) {
            this.sourceDetails = sourceDetails;
            this.__explicitlySet__.add("sourceDetails");
            return this;
        }
        /**
         * A fault domain is a grouping of hardware and infrastructure within an availability
         * domain. Each availability domain contains three fault domains. Fault domains let you
         * distribute your instances so that they are not on the same physical hardware within a
         * single availability domain. A hardware failure or Compute hardware maintenance that
         * affects one fault domain does not affect instances in other fault domains.
         *
         * <p>If you do not specify the fault domain, the system selects one for you.
         *
         * <p>To get a list of fault domains, use the {@link
         * #listFaultDomains(ListFaultDomainsRequest) listFaultDomains} operation in the Identity
         * and Access Management Service API.
         *
         * <p>Example: {@code FAULT-DOMAIN-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * A fault domain is a grouping of hardware and infrastructure within an availability
         * domain. Each availability domain contains three fault domains. Fault domains let you
         * distribute your instances so that they are not on the same physical hardware within a
         * single availability domain. A hardware failure or Compute hardware maintenance that
         * affects one fault domain does not affect instances in other fault domains.
         *
         * <p>If you do not specify the fault domain, the system selects one for you.
         *
         * <p>To get a list of fault domains, use the {@link
         * #listFaultDomains(ListFaultDomainsRequest) listFaultDomains} operation in the Identity
         * and Access Management Service API.
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
         * The OCID of the dedicated virtual machine host to place the instance on.
         *
         * <p>Dedicated VM hosts can be used when launching individual instances from an instance
         * configuration. They cannot be used to launch instance pools.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostId")
        private String dedicatedVmHostId;

        /**
         * The OCID of the dedicated virtual machine host to place the instance on.
         *
         * <p>Dedicated VM hosts can be used when launching individual instances from an instance
         * configuration. They cannot be used to launch instance pools.
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
        private InstanceConfigurationLaunchOptions launchOptions;

        public Builder launchOptions(InstanceConfigurationLaunchOptions launchOptions) {
            this.launchOptions = launchOptions;
            this.__explicitlySet__.add("launchOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("agentConfig")
        private InstanceConfigurationLaunchInstanceAgentConfigDetails agentConfig;

        public Builder agentConfig(
                InstanceConfigurationLaunchInstanceAgentConfigDetails agentConfig) {
            this.agentConfig = agentConfig;
            this.__explicitlySet__.add("agentConfig");
            return this;
        }
        /**
         * Whether to enable in-transit encryption for the data volume's paravirtualized attachment.
         * The default value is false.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
        private Boolean isPvEncryptionInTransitEnabled;

        /**
         * Whether to enable in-transit encryption for the data volume's paravirtualized attachment.
         * The default value is false.
         *
         * @param isPvEncryptionInTransitEnabled the value to set
         * @return this builder
         */
        public Builder isPvEncryptionInTransitEnabled(Boolean isPvEncryptionInTransitEnabled) {
            this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
            this.__explicitlySet__.add("isPvEncryptionInTransitEnabled");
            return this;
        }
        /**
         * The preferred maintenance action for an instance. The default is LIVE_MIGRATE, if live
         * migration is supported. * {@code LIVE_MIGRATE} - Run maintenance using a live migration.
         * * {@code REBOOT} - Run maintenance using a reboot.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("preferredMaintenanceAction")
        private PreferredMaintenanceAction preferredMaintenanceAction;

        /**
         * The preferred maintenance action for an instance. The default is LIVE_MIGRATE, if live
         * migration is supported. * {@code LIVE_MIGRATE} - Run maintenance using a live migration.
         * * {@code REBOOT} - Run maintenance using a reboot.
         *
         * @param preferredMaintenanceAction the value to set
         * @return this builder
         */
        public Builder preferredMaintenanceAction(
                PreferredMaintenanceAction preferredMaintenanceAction) {
            this.preferredMaintenanceAction = preferredMaintenanceAction;
            this.__explicitlySet__.add("preferredMaintenanceAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceOptions")
        private InstanceConfigurationInstanceOptions instanceOptions;

        public Builder instanceOptions(InstanceConfigurationInstanceOptions instanceOptions) {
            this.instanceOptions = instanceOptions;
            this.__explicitlySet__.add("instanceOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityConfig")
        private InstanceConfigurationAvailabilityConfig availabilityConfig;

        public Builder availabilityConfig(
                InstanceConfigurationAvailabilityConfig availabilityConfig) {
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
        /** List of licensing configurations associated with target launch values. */
        @com.fasterxml.jackson.annotation.JsonProperty("licensingConfigs")
        private java.util.List<LaunchInstanceLicensingConfig> licensingConfigs;

        /**
         * List of licensing configurations associated with target launch values.
         *
         * @param licensingConfigs the value to set
         * @return this builder
         */
        public Builder licensingConfigs(
                java.util.List<LaunchInstanceLicensingConfig> licensingConfigs) {
            this.licensingConfigs = licensingConfigs;
            this.__explicitlySet__.add("licensingConfigs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConfigurationLaunchInstanceDetails build() {
            InstanceConfigurationLaunchInstanceDetails model =
                    new InstanceConfigurationLaunchInstanceDetails(
                            this.availabilityDomain,
                            this.capacityReservationId,
                            this.isAIEnterpriseEnabled,
                            this.placementConstraintDetails,
                            this.computeClusterId,
                            this.compartmentId,
                            this.clusterPlacementGroupId,
                            this.createVnicDetails,
                            this.definedTags,
                            this.securityAttributes,
                            this.displayName,
                            this.extendedMetadata,
                            this.freeformTags,
                            this.ipxeScript,
                            this.metadata,
                            this.shape,
                            this.shapeConfig,
                            this.platformConfig,
                            this.sourceDetails,
                            this.faultDomain,
                            this.dedicatedVmHostId,
                            this.launchMode,
                            this.launchOptions,
                            this.agentConfig,
                            this.isPvEncryptionInTransitEnabled,
                            this.preferredMaintenanceAction,
                            this.instanceOptions,
                            this.availabilityConfig,
                            this.preemptibleInstanceConfig,
                            this.licensingConfigs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfigurationLaunchInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("capacityReservationId")) {
                this.capacityReservationId(model.getCapacityReservationId());
            }
            if (model.wasPropertyExplicitlySet("isAIEnterpriseEnabled")) {
                this.isAIEnterpriseEnabled(model.getIsAIEnterpriseEnabled());
            }
            if (model.wasPropertyExplicitlySet("placementConstraintDetails")) {
                this.placementConstraintDetails(model.getPlacementConstraintDetails());
            }
            if (model.wasPropertyExplicitlySet("computeClusterId")) {
                this.computeClusterId(model.getComputeClusterId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
            }
            if (model.wasPropertyExplicitlySet("createVnicDetails")) {
                this.createVnicDetails(model.getCreateVnicDetails());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("extendedMetadata")) {
                this.extendedMetadata(model.getExtendedMetadata());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("ipxeScript")) {
                this.ipxeScript(model.getIpxeScript());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("shapeConfig")) {
                this.shapeConfig(model.getShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("platformConfig")) {
                this.platformConfig(model.getPlatformConfig());
            }
            if (model.wasPropertyExplicitlySet("sourceDetails")) {
                this.sourceDetails(model.getSourceDetails());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("dedicatedVmHostId")) {
                this.dedicatedVmHostId(model.getDedicatedVmHostId());
            }
            if (model.wasPropertyExplicitlySet("launchMode")) {
                this.launchMode(model.getLaunchMode());
            }
            if (model.wasPropertyExplicitlySet("launchOptions")) {
                this.launchOptions(model.getLaunchOptions());
            }
            if (model.wasPropertyExplicitlySet("agentConfig")) {
                this.agentConfig(model.getAgentConfig());
            }
            if (model.wasPropertyExplicitlySet("isPvEncryptionInTransitEnabled")) {
                this.isPvEncryptionInTransitEnabled(model.getIsPvEncryptionInTransitEnabled());
            }
            if (model.wasPropertyExplicitlySet("preferredMaintenanceAction")) {
                this.preferredMaintenanceAction(model.getPreferredMaintenanceAction());
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
     * The availability domain of the instance.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of the instance.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** The OCID of the compute capacity reservation this instance is launched under. */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
    private final String capacityReservationId;

    /**
     * The OCID of the compute capacity reservation this instance is launched under.
     *
     * @return the value
     */
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /** Whether to enable AI enterprise on the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAIEnterpriseEnabled")
    private final Boolean isAIEnterpriseEnabled;

    /**
     * Whether to enable AI enterprise on the instance.
     *
     * @return the value
     */
    public Boolean getIsAIEnterpriseEnabled() {
        return isAIEnterpriseEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("placementConstraintDetails")
    private final InstanceConfigurationPlacementConstraintDetails placementConstraintDetails;

    public InstanceConfigurationPlacementConstraintDetails getPlacementConstraintDetails() {
        return placementConstraintDetails;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * [compute cluster](https://docs.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm)
     * that the instance will be created in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeClusterId")
    private final String computeClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * [compute cluster](https://docs.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm)
     * that the instance will be created in.
     *
     * @return the value
     */
    public String getComputeClusterId() {
        return computeClusterId;
    }

    /**
     * The OCID of the compartment containing the instance. Instances created from instance
     * configurations are placed in the same compartment as the instance that was used to create the
     * instance configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the instance. Instances created from instance
     * configurations are placed in the same compartment as the instance that was used to create the
     * instance configuration.
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

    @com.fasterxml.jackson.annotation.JsonProperty("createVnicDetails")
    private final InstanceConfigurationCreateVnicDetails createVnicDetails;

    public InstanceConfigurationCreateVnicDetails getCreateVnicDetails() {
        return createVnicDetails;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
     * are labels for a resource that can be referenced in a [Zero Trust Packet
     * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm) (ZPR)
     * policy to control access to ZPR-supported resources.
     *
     * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
     * {"value":"42","mode":"audit"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * [Security
     * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
     * are labels for a resource that can be referenced in a [Zero Trust Packet
     * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm) (ZPR)
     * policy to control access to ZPR-supported resources.
     *
     * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
     * {"value":"42","mode":"audit"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
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
     *
     * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be a
     * maximum of 32,000 bytes.
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
     * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be a
     * maximum of 32,000 bytes.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getExtendedMetadata() {
        return extendedMetadata;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * This is an advanced option.
     *
     * <p>When a bare metal or virtual machine instance boots, the iPXE firmware that runs on the
     * instance is configured to run an iPXE script to continue the boot process.
     *
     * <p>If you want more control over the boot process, you can provide your own custom iPXE
     * script that will run when the instance boots; however, you should be aware that the same iPXE
     * script will run every time an instance boots; not only after the initial LaunchInstance call.
     *
     * <p>The default iPXE script connects to the instance's local boot volume over iSCSI and
     * performs a network boot. If you use a custom iPXE script and want to network-boot from the
     * instance's local boot volume over iSCSI the same way as the default iPXE script, you should
     * use the following iSCSI IP address: 169.254.0.2, and boot volume IQN:
     * iqn.2015-02.oracle.boot.
     *
     * <p>For more information about the Bring Your Own Image feature of Oracle Cloud
     * Infrastructure, see [Bring Your Own
     * Image](https://docs.oracle.com/iaas/Content/Compute/References/bringyourownimage.htm).
     *
     * <p>For more information about iPXE, see http://ipxe.org.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipxeScript")
    private final String ipxeScript;

    /**
     * This is an advanced option.
     *
     * <p>When a bare metal or virtual machine instance boots, the iPXE firmware that runs on the
     * instance is configured to run an iPXE script to continue the boot process.
     *
     * <p>If you want more control over the boot process, you can provide your own custom iPXE
     * script that will run when the instance boots; however, you should be aware that the same iPXE
     * script will run every time an instance boots; not only after the initial LaunchInstance call.
     *
     * <p>The default iPXE script connects to the instance's local boot volume over iSCSI and
     * performs a network boot. If you use a custom iPXE script and want to network-boot from the
     * instance's local boot volume over iSCSI the same way as the default iPXE script, you should
     * use the following iSCSI IP address: 169.254.0.2, and boot volume IQN:
     * iqn.2015-02.oracle.boot.
     *
     * <p>For more information about the Bring Your Own Image feature of Oracle Cloud
     * Infrastructure, see [Bring Your Own
     * Image](https://docs.oracle.com/iaas/Content/Compute/References/bringyourownimage.htm).
     *
     * <p>For more information about iPXE, see http://ipxe.org.
     *
     * @return the value
     */
    public String getIpxeScript() {
        return ipxeScript;
    }

    /**
     * Custom metadata key/value pairs that you provide, such as the SSH public key required to
     * connect to the instance.
     *
     * <p>A metadata service runs on every launched instance. The service is an HTTP endpoint
     * listening on 169.254.169.254. You can use the service to:
     *
     * <p>Provide information to [Cloud-Init](https://cloudinit.readthedocs.org/en/latest/) to be
     * used for various system initialization tasks.
     *
     * <p>Get information about the instance, including the custom metadata that you provide when
     * you launch the instance.
     *
     * <p>*Providing Cloud-Init Metadata**
     *
     * <p>You can use the following metadata key names to provide information to Cloud-Init:
     *
     * <p>*"ssh_authorized_keys"** - Provide one or more public SSH keys to be included in the
     * {@code ~/.ssh/authorized_keys} file for the default user on the instance. Use a newline
     * character to separate multiple keys. The SSH keys must be in the format necessary for the
     * {@code authorized_keys} file, as shown in the example below.
     *
     * <p>*"user_data"** - Provide your own base64-encoded data to be used by Cloud-Init to run
     * custom scripts or provide custom Cloud-Init configuration. For information about how to take
     * advantage of user data, see the [Cloud-Init
     * Documentation](http://cloudinit.readthedocs.org/en/latest/topics/format.html).
     *
     * <p>*Metadata Example**
     *
     * <p>"metadata" : { "quake_bot_level" : "Severe", "ssh_authorized_keys" : "ssh-rsa
     * <your_public_SSH_key>== rsa-key-20160227", "user_data" : "<your_public_SSH_key>==" }
     * **Getting Metadata on the Instance**
     *
     * <p>To get information about your instance, connect to the instance using SSH and issue any of
     * the following GET requests:
     *
     * <p>curl -H "Authorization: Bearer Oracle" http://169.254.169.254/opc/v2/instance/ curl -H
     * "Authorization: Bearer Oracle" http://169.254.169.254/opc/v2/instance/metadata/ curl -H
     * "Authorization: Bearer Oracle" http://169.254.169.254/opc/v2/instance/metadata/<any-key-name>
     *
     * <p>You'll get back a response that includes all the instance information; only the metadata
     * information; or the metadata information for the specified key name, respectively.
     *
     * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be a
     * maximum of 32,000 bytes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * Custom metadata key/value pairs that you provide, such as the SSH public key required to
     * connect to the instance.
     *
     * <p>A metadata service runs on every launched instance. The service is an HTTP endpoint
     * listening on 169.254.169.254. You can use the service to:
     *
     * <p>Provide information to [Cloud-Init](https://cloudinit.readthedocs.org/en/latest/) to be
     * used for various system initialization tasks.
     *
     * <p>Get information about the instance, including the custom metadata that you provide when
     * you launch the instance.
     *
     * <p>*Providing Cloud-Init Metadata**
     *
     * <p>You can use the following metadata key names to provide information to Cloud-Init:
     *
     * <p>*"ssh_authorized_keys"** - Provide one or more public SSH keys to be included in the
     * {@code ~/.ssh/authorized_keys} file for the default user on the instance. Use a newline
     * character to separate multiple keys. The SSH keys must be in the format necessary for the
     * {@code authorized_keys} file, as shown in the example below.
     *
     * <p>*"user_data"** - Provide your own base64-encoded data to be used by Cloud-Init to run
     * custom scripts or provide custom Cloud-Init configuration. For information about how to take
     * advantage of user data, see the [Cloud-Init
     * Documentation](http://cloudinit.readthedocs.org/en/latest/topics/format.html).
     *
     * <p>*Metadata Example**
     *
     * <p>"metadata" : { "quake_bot_level" : "Severe", "ssh_authorized_keys" : "ssh-rsa
     * <your_public_SSH_key>== rsa-key-20160227", "user_data" : "<your_public_SSH_key>==" }
     * **Getting Metadata on the Instance**
     *
     * <p>To get information about your instance, connect to the instance using SSH and issue any of
     * the following GET requests:
     *
     * <p>curl -H "Authorization: Bearer Oracle" http://169.254.169.254/opc/v2/instance/ curl -H
     * "Authorization: Bearer Oracle" http://169.254.169.254/opc/v2/instance/metadata/ curl -H
     * "Authorization: Bearer Oracle" http://169.254.169.254/opc/v2/instance/metadata/<any-key-name>
     *
     * <p>You'll get back a response that includes all the instance information; only the metadata
     * information; or the metadata information for the specified key name, respectively.
     *
     * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be a
     * maximum of 32,000 bytes.
     *
     * @return the value
     */
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * The shape of an instance. The shape determines the number of CPUs, amount of memory, and
     * other resources allocated to the instance.
     *
     * <p>You can enumerate all available shapes by calling {@link #listShapes(ListShapesRequest)
     * listShapes}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of an instance. The shape determines the number of CPUs, amount of memory, and
     * other resources allocated to the instance.
     *
     * <p>You can enumerate all available shapes by calling {@link #listShapes(ListShapesRequest)
     * listShapes}.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
    private final InstanceConfigurationLaunchInstanceShapeConfigDetails shapeConfig;

    public InstanceConfigurationLaunchInstanceShapeConfigDetails getShapeConfig() {
        return shapeConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("platformConfig")
    private final InstanceConfigurationLaunchInstancePlatformConfig platformConfig;

    public InstanceConfigurationLaunchInstancePlatformConfig getPlatformConfig() {
        return platformConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
    private final InstanceConfigurationInstanceSourceDetails sourceDetails;

    public InstanceConfigurationInstanceSourceDetails getSourceDetails() {
        return sourceDetails;
    }

    /**
     * A fault domain is a grouping of hardware and infrastructure within an availability domain.
     * Each availability domain contains three fault domains. Fault domains let you distribute your
     * instances so that they are not on the same physical hardware within a single availability
     * domain. A hardware failure or Compute hardware maintenance that affects one fault domain does
     * not affect instances in other fault domains.
     *
     * <p>If you do not specify the fault domain, the system selects one for you.
     *
     * <p>To get a list of fault domains, use the {@link #listFaultDomains(ListFaultDomainsRequest)
     * listFaultDomains} operation in the Identity and Access Management Service API.
     *
     * <p>Example: {@code FAULT-DOMAIN-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * A fault domain is a grouping of hardware and infrastructure within an availability domain.
     * Each availability domain contains three fault domains. Fault domains let you distribute your
     * instances so that they are not on the same physical hardware within a single availability
     * domain. A hardware failure or Compute hardware maintenance that affects one fault domain does
     * not affect instances in other fault domains.
     *
     * <p>If you do not specify the fault domain, the system selects one for you.
     *
     * <p>To get a list of fault domains, use the {@link #listFaultDomains(ListFaultDomainsRequest)
     * listFaultDomains} operation in the Identity and Access Management Service API.
     *
     * <p>Example: {@code FAULT-DOMAIN-1}
     *
     * @return the value
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The OCID of the dedicated virtual machine host to place the instance on.
     *
     * <p>Dedicated VM hosts can be used when launching individual instances from an instance
     * configuration. They cannot be used to launch instance pools.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostId")
    private final String dedicatedVmHostId;

    /**
     * The OCID of the dedicated virtual machine host to place the instance on.
     *
     * <p>Dedicated VM hosts can be used when launching individual instances from an instance
     * configuration. They cannot be used to launch instance pools.
     *
     * @return the value
     */
    public String getDedicatedVmHostId() {
        return dedicatedVmHostId;
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
    private final InstanceConfigurationLaunchOptions launchOptions;

    public InstanceConfigurationLaunchOptions getLaunchOptions() {
        return launchOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("agentConfig")
    private final InstanceConfigurationLaunchInstanceAgentConfigDetails agentConfig;

    public InstanceConfigurationLaunchInstanceAgentConfigDetails getAgentConfig() {
        return agentConfig;
    }

    /**
     * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. The
     * default value is false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
    private final Boolean isPvEncryptionInTransitEnabled;

    /**
     * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. The
     * default value is false.
     *
     * @return the value
     */
    public Boolean getIsPvEncryptionInTransitEnabled() {
        return isPvEncryptionInTransitEnabled;
    }

    /**
     * The preferred maintenance action for an instance. The default is LIVE_MIGRATE, if live
     * migration is supported. * {@code LIVE_MIGRATE} - Run maintenance using a live migration. *
     * {@code REBOOT} - Run maintenance using a reboot.
     */
    public enum PreferredMaintenanceAction implements com.oracle.bmc.http.internal.BmcEnum {
        LiveMigrate("LIVE_MIGRATE"),
        Reboot("REBOOT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PreferredMaintenanceAction.class);

        private final String value;
        private static java.util.Map<String, PreferredMaintenanceAction> map;

        static {
            map = new java.util.HashMap<>();
            for (PreferredMaintenanceAction v : PreferredMaintenanceAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PreferredMaintenanceAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PreferredMaintenanceAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PreferredMaintenanceAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The preferred maintenance action for an instance. The default is LIVE_MIGRATE, if live
     * migration is supported. * {@code LIVE_MIGRATE} - Run maintenance using a live migration. *
     * {@code REBOOT} - Run maintenance using a reboot.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredMaintenanceAction")
    private final PreferredMaintenanceAction preferredMaintenanceAction;

    /**
     * The preferred maintenance action for an instance. The default is LIVE_MIGRATE, if live
     * migration is supported. * {@code LIVE_MIGRATE} - Run maintenance using a live migration. *
     * {@code REBOOT} - Run maintenance using a reboot.
     *
     * @return the value
     */
    public PreferredMaintenanceAction getPreferredMaintenanceAction() {
        return preferredMaintenanceAction;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("instanceOptions")
    private final InstanceConfigurationInstanceOptions instanceOptions;

    public InstanceConfigurationInstanceOptions getInstanceOptions() {
        return instanceOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("availabilityConfig")
    private final InstanceConfigurationAvailabilityConfig availabilityConfig;

    public InstanceConfigurationAvailabilityConfig getAvailabilityConfig() {
        return availabilityConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("preemptibleInstanceConfig")
    private final PreemptibleInstanceConfigDetails preemptibleInstanceConfig;

    public PreemptibleInstanceConfigDetails getPreemptibleInstanceConfig() {
        return preemptibleInstanceConfig;
    }

    /** List of licensing configurations associated with target launch values. */
    @com.fasterxml.jackson.annotation.JsonProperty("licensingConfigs")
    private final java.util.List<LaunchInstanceLicensingConfig> licensingConfigs;

    /**
     * List of licensing configurations associated with target launch values.
     *
     * @return the value
     */
    public java.util.List<LaunchInstanceLicensingConfig> getLicensingConfigs() {
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
        sb.append("InstanceConfigurationLaunchInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
        sb.append(", isAIEnterpriseEnabled=").append(String.valueOf(this.isAIEnterpriseEnabled));
        sb.append(", placementConstraintDetails=")
                .append(String.valueOf(this.placementConstraintDetails));
        sb.append(", computeClusterId=").append(String.valueOf(this.computeClusterId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", clusterPlacementGroupId=")
                .append(String.valueOf(this.clusterPlacementGroupId));
        sb.append(", createVnicDetails=").append(String.valueOf(this.createVnicDetails));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", extendedMetadata=").append(String.valueOf(this.extendedMetadata));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", ipxeScript=").append(String.valueOf(this.ipxeScript));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", shapeConfig=").append(String.valueOf(this.shapeConfig));
        sb.append(", platformConfig=").append(String.valueOf(this.platformConfig));
        sb.append(", sourceDetails=").append(String.valueOf(this.sourceDetails));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", dedicatedVmHostId=").append(String.valueOf(this.dedicatedVmHostId));
        sb.append(", launchMode=").append(String.valueOf(this.launchMode));
        sb.append(", launchOptions=").append(String.valueOf(this.launchOptions));
        sb.append(", agentConfig=").append(String.valueOf(this.agentConfig));
        sb.append(", isPvEncryptionInTransitEnabled=")
                .append(String.valueOf(this.isPvEncryptionInTransitEnabled));
        sb.append(", preferredMaintenanceAction=")
                .append(String.valueOf(this.preferredMaintenanceAction));
        sb.append(", instanceOptions=").append(String.valueOf(this.instanceOptions));
        sb.append(", availabilityConfig=").append(String.valueOf(this.availabilityConfig));
        sb.append(", preemptibleInstanceConfig=")
                .append(String.valueOf(this.preemptibleInstanceConfig));
        sb.append(", licensingConfigs=").append(String.valueOf(this.licensingConfigs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceConfigurationLaunchInstanceDetails)) {
            return false;
        }

        InstanceConfigurationLaunchInstanceDetails other =
                (InstanceConfigurationLaunchInstanceDetails) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
                && java.util.Objects.equals(this.isAIEnterpriseEnabled, other.isAIEnterpriseEnabled)
                && java.util.Objects.equals(
                        this.placementConstraintDetails, other.placementConstraintDetails)
                && java.util.Objects.equals(this.computeClusterId, other.computeClusterId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupId, other.clusterPlacementGroupId)
                && java.util.Objects.equals(this.createVnicDetails, other.createVnicDetails)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.extendedMetadata, other.extendedMetadata)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.ipxeScript, other.ipxeScript)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.shapeConfig, other.shapeConfig)
                && java.util.Objects.equals(this.platformConfig, other.platformConfig)
                && java.util.Objects.equals(this.sourceDetails, other.sourceDetails)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.dedicatedVmHostId, other.dedicatedVmHostId)
                && java.util.Objects.equals(this.launchMode, other.launchMode)
                && java.util.Objects.equals(this.launchOptions, other.launchOptions)
                && java.util.Objects.equals(this.agentConfig, other.agentConfig)
                && java.util.Objects.equals(
                        this.isPvEncryptionInTransitEnabled, other.isPvEncryptionInTransitEnabled)
                && java.util.Objects.equals(
                        this.preferredMaintenanceAction, other.preferredMaintenanceAction)
                && java.util.Objects.equals(this.instanceOptions, other.instanceOptions)
                && java.util.Objects.equals(this.availabilityConfig, other.availabilityConfig)
                && java.util.Objects.equals(
                        this.preemptibleInstanceConfig, other.preemptibleInstanceConfig)
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
                        + (this.isAIEnterpriseEnabled == null
                                ? 43
                                : this.isAIEnterpriseEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.placementConstraintDetails == null
                                ? 43
                                : this.placementConstraintDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.computeClusterId == null ? 43 : this.computeClusterId.hashCode());
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
                        + (this.createVnicDetails == null ? 43 : this.createVnicDetails.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedMetadata == null ? 43 : this.extendedMetadata.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.ipxeScript == null ? 43 : this.ipxeScript.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.shapeConfig == null ? 43 : this.shapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.platformConfig == null ? 43 : this.platformConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDetails == null ? 43 : this.sourceDetails.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.dedicatedVmHostId == null ? 43 : this.dedicatedVmHostId.hashCode());
        result = (result * PRIME) + (this.launchMode == null ? 43 : this.launchMode.hashCode());
        result =
                (result * PRIME)
                        + (this.launchOptions == null ? 43 : this.launchOptions.hashCode());
        result = (result * PRIME) + (this.agentConfig == null ? 43 : this.agentConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.isPvEncryptionInTransitEnabled == null
                                ? 43
                                : this.isPvEncryptionInTransitEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.preferredMaintenanceAction == null
                                ? 43
                                : this.preferredMaintenanceAction.hashCode());
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
                        + (this.licensingConfigs == null ? 43 : this.licensingConfigs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
