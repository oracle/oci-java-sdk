/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Instance launch details. Use the {@code sourceDetails} parameter to specify whether a boot volume
 * or an image should be used to launch a new instance. <br>
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
        builder = LaunchInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LaunchInstanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "capacityReservationId",
        "compartmentId",
        "createVnicDetails",
        "dedicatedVmHostId",
        "definedTags",
        "displayName",
        "extendedMetadata",
        "faultDomain",
        "freeformTags",
        "computeClusterId",
        "hostnameLabel",
        "imageId",
        "ipxeScript",
        "launchOptions",
        "instanceOptions",
        "availabilityConfig",
        "preemptibleInstanceConfig",
        "metadata",
        "agentConfig",
        "shape",
        "shapeConfig",
        "sourceDetails",
        "subnetId",
        "isPvEncryptionInTransitEnabled",
        "platformConfig",
        "instanceConfigurationId"
    })
    public LaunchInstanceDetails(
            String availabilityDomain,
            String capacityReservationId,
            String compartmentId,
            CreateVnicDetails createVnicDetails,
            String dedicatedVmHostId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, Object> extendedMetadata,
            String faultDomain,
            java.util.Map<String, String> freeformTags,
            String computeClusterId,
            String hostnameLabel,
            String imageId,
            String ipxeScript,
            LaunchOptions launchOptions,
            InstanceOptions instanceOptions,
            LaunchInstanceAvailabilityConfigDetails availabilityConfig,
            PreemptibleInstanceConfigDetails preemptibleInstanceConfig,
            java.util.Map<String, String> metadata,
            LaunchInstanceAgentConfigDetails agentConfig,
            String shape,
            LaunchInstanceShapeConfigDetails shapeConfig,
            InstanceSourceDetails sourceDetails,
            String subnetId,
            Boolean isPvEncryptionInTransitEnabled,
            LaunchInstancePlatformConfig platformConfig,
            String instanceConfigurationId) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.capacityReservationId = capacityReservationId;
        this.compartmentId = compartmentId;
        this.createVnicDetails = createVnicDetails;
        this.dedicatedVmHostId = dedicatedVmHostId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.extendedMetadata = extendedMetadata;
        this.faultDomain = faultDomain;
        this.freeformTags = freeformTags;
        this.computeClusterId = computeClusterId;
        this.hostnameLabel = hostnameLabel;
        this.imageId = imageId;
        this.ipxeScript = ipxeScript;
        this.launchOptions = launchOptions;
        this.instanceOptions = instanceOptions;
        this.availabilityConfig = availabilityConfig;
        this.preemptibleInstanceConfig = preemptibleInstanceConfig;
        this.metadata = metadata;
        this.agentConfig = agentConfig;
        this.shape = shape;
        this.shapeConfig = shapeConfig;
        this.sourceDetails = sourceDetails;
        this.subnetId = subnetId;
        this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
        this.platformConfig = platformConfig;
        this.instanceConfigurationId = instanceConfigurationId;
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
        /**
         * The OCID of the compute capacity reservation this instance is launched under. You can opt
         * out of all default reservations by specifying an empty string as input for this field.
         * For more information, see [Capacity
         * Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
        private String capacityReservationId;

        /**
         * The OCID of the compute capacity reservation this instance is launched under. You can opt
         * out of all default reservations by specifying an empty string as input for this field.
         * For more information, see [Capacity
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
        /** The OCID of the compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
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
        /** The OCID of the dedicated virtual machine host to place the instance on. */
        @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostId")
        private String dedicatedVmHostId;

        /**
         * The OCID of the dedicated virtual machine host to place the instance on.
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
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the [compute
         * cluster](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm)
         * that the instance will be created in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeClusterId")
        private String computeClusterId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the [compute
         * cluster](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm)
         * that the instance will be created in.
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
         * Deprecated. Instead use {@code hostnameLabel} in {@link CreateVnicDetails}. If you
         * provide both, the values must match.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        /**
         * Deprecated. Instead use {@code hostnameLabel} in {@link CreateVnicDetails}. If you
         * provide both, the values must match.
         *
         * @param hostnameLabel the value to set
         * @return this builder
         */
        public Builder hostnameLabel(String hostnameLabel) {
            this.hostnameLabel = hostnameLabel;
            this.__explicitlySet__.add("hostnameLabel");
            return this;
        }
        /**
         * Deprecated. Use {@code sourceDetails} with {@link
         * #instanceSourceViaImageDetails(InstanceSourceViaImageDetailsRequest)
         * instanceSourceViaImageDetails} source type instead. If you specify values for both, the
         * values must match.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        /**
         * Deprecated. Use {@code sourceDetails} with {@link
         * #instanceSourceViaImageDetails(InstanceSourceViaImageDetailsRequest)
         * instanceSourceViaImageDetails} source type instead. If you specify values for both, the
         * values must match.
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
         * This is an advanced option.
         *
         * <p>When a bare metal or virtual machine instance boots, the iPXE firmware that runs on
         * the instance is configured to run an iPXE script to continue the boot process.
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
         * This is an advanced option.
         *
         * <p>When a bare metal or virtual machine instance boots, the iPXE firmware that runs on
         * the instance is configured to run an iPXE script to continue the boot process.
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
        private LaunchInstanceAvailabilityConfigDetails availabilityConfig;

        public Builder availabilityConfig(
                LaunchInstanceAvailabilityConfigDetails availabilityConfig) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("agentConfig")
        private LaunchInstanceAgentConfigDetails agentConfig;

        public Builder agentConfig(LaunchInstanceAgentConfigDetails agentConfig) {
            this.agentConfig = agentConfig;
            this.__explicitlySet__.add("agentConfig");
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
         * Deprecated. Instead use {@code subnetId} in {@link CreateVnicDetails}. At least one of
         * them is required; if you provide both, the values must match.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * Deprecated. Instead use {@code subnetId} in {@link CreateVnicDetails}. At least one of
         * them is required; if you provide both, the values must match.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * Whether to enable in-transit encryption for the data volume's paravirtualized attachment.
         * This field applies to both block volumes and boot volumes. The default value is false.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
        private Boolean isPvEncryptionInTransitEnabled;

        /**
         * Whether to enable in-transit encryption for the data volume's paravirtualized attachment.
         * This field applies to both block volumes and boot volumes. The default value is false.
         *
         * @param isPvEncryptionInTransitEnabled the value to set
         * @return this builder
         */
        public Builder isPvEncryptionInTransitEnabled(Boolean isPvEncryptionInTransitEnabled) {
            this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
            this.__explicitlySet__.add("isPvEncryptionInTransitEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformConfig")
        private LaunchInstancePlatformConfig platformConfig;

        public Builder platformConfig(LaunchInstancePlatformConfig platformConfig) {
            this.platformConfig = platformConfig;
            this.__explicitlySet__.add("platformConfig");
            return this;
        }
        /**
         * The OCID of the Instance Configuration containing instance launch details. Any other
         * fields supplied in this instance launch request will override the details stored in the
         * Instance Configuration for this instance launch.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceConfigurationId")
        private String instanceConfigurationId;

        /**
         * The OCID of the Instance Configuration containing instance launch details. Any other
         * fields supplied in this instance launch request will override the details stored in the
         * Instance Configuration for this instance launch.
         *
         * @param instanceConfigurationId the value to set
         * @return this builder
         */
        public Builder instanceConfigurationId(String instanceConfigurationId) {
            this.instanceConfigurationId = instanceConfigurationId;
            this.__explicitlySet__.add("instanceConfigurationId");
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
                            this.extendedMetadata,
                            this.faultDomain,
                            this.freeformTags,
                            this.computeClusterId,
                            this.hostnameLabel,
                            this.imageId,
                            this.ipxeScript,
                            this.launchOptions,
                            this.instanceOptions,
                            this.availabilityConfig,
                            this.preemptibleInstanceConfig,
                            this.metadata,
                            this.agentConfig,
                            this.shape,
                            this.shapeConfig,
                            this.sourceDetails,
                            this.subnetId,
                            this.isPvEncryptionInTransitEnabled,
                            this.platformConfig,
                            this.instanceConfigurationId);
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
            if (model.wasPropertyExplicitlySet("extendedMetadata")) {
                this.extendedMetadata(model.getExtendedMetadata());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("computeClusterId")) {
                this.computeClusterId(model.getComputeClusterId());
            }
            if (model.wasPropertyExplicitlySet("hostnameLabel")) {
                this.hostnameLabel(model.getHostnameLabel());
            }
            if (model.wasPropertyExplicitlySet("imageId")) {
                this.imageId(model.getImageId());
            }
            if (model.wasPropertyExplicitlySet("ipxeScript")) {
                this.ipxeScript(model.getIpxeScript());
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
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("isPvEncryptionInTransitEnabled")) {
                this.isPvEncryptionInTransitEnabled(model.getIsPvEncryptionInTransitEnabled());
            }
            if (model.wasPropertyExplicitlySet("platformConfig")) {
                this.platformConfig(model.getPlatformConfig());
            }
            if (model.wasPropertyExplicitlySet("instanceConfigurationId")) {
                this.instanceConfigurationId(model.getInstanceConfigurationId());
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

    /**
     * The OCID of the compute capacity reservation this instance is launched under. You can opt out
     * of all default reservations by specifying an empty string as input for this field. For more
     * information, see [Capacity
     * Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
    private final String capacityReservationId;

    /**
     * The OCID of the compute capacity reservation this instance is launched under. You can opt out
     * of all default reservations by specifying an empty string as input for this field. For more
     * information, see [Capacity
     * Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
     *
     * @return the value
     */
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /** The OCID of the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("createVnicDetails")
    private final CreateVnicDetails createVnicDetails;

    public CreateVnicDetails getCreateVnicDetails() {
        return createVnicDetails;
    }

    /** The OCID of the dedicated virtual machine host to place the instance on. */
    @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostId")
    private final String dedicatedVmHostId;

    /**
     * The OCID of the dedicated virtual machine host to place the instance on.
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the [compute
     * cluster](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm) that
     * the instance will be created in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeClusterId")
    private final String computeClusterId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the [compute
     * cluster](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm) that
     * the instance will be created in.
     *
     * @return the value
     */
    public String getComputeClusterId() {
        return computeClusterId;
    }

    /**
     * Deprecated. Instead use {@code hostnameLabel} in {@link CreateVnicDetails}. If you provide
     * both, the values must match.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    private final String hostnameLabel;

    /**
     * Deprecated. Instead use {@code hostnameLabel} in {@link CreateVnicDetails}. If you provide
     * both, the values must match.
     *
     * @return the value
     */
    public String getHostnameLabel() {
        return hostnameLabel;
    }

    /**
     * Deprecated. Use {@code sourceDetails} with {@link
     * #instanceSourceViaImageDetails(InstanceSourceViaImageDetailsRequest)
     * instanceSourceViaImageDetails} source type instead. If you specify values for both, the
     * values must match.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    /**
     * Deprecated. Use {@code sourceDetails} with {@link
     * #instanceSourceViaImageDetails(InstanceSourceViaImageDetailsRequest)
     * instanceSourceViaImageDetails} source type instead. If you specify values for both, the
     * values must match.
     *
     * @return the value
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * This is an advanced option.
     *
     * <p>When a bare metal or virtual machine instance boots, the iPXE firmware that runs on the
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
     * This is an advanced option.
     *
     * <p>When a bare metal or virtual machine instance boots, the iPXE firmware that runs on the
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
    private final LaunchInstanceAvailabilityConfigDetails availabilityConfig;

    public LaunchInstanceAvailabilityConfigDetails getAvailabilityConfig() {
        return availabilityConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("preemptibleInstanceConfig")
    private final PreemptibleInstanceConfigDetails preemptibleInstanceConfig;

    public PreemptibleInstanceConfigDetails getPreemptibleInstanceConfig() {
        return preemptibleInstanceConfig;
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

    @com.fasterxml.jackson.annotation.JsonProperty("agentConfig")
    private final LaunchInstanceAgentConfigDetails agentConfig;

    public LaunchInstanceAgentConfigDetails getAgentConfig() {
        return agentConfig;
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
     * Deprecated. Instead use {@code subnetId} in {@link CreateVnicDetails}. At least one of them
     * is required; if you provide both, the values must match.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * Deprecated. Instead use {@code subnetId} in {@link CreateVnicDetails}. At least one of them
     * is required; if you provide both, the values must match.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * Whether to enable in-transit encryption for the data volume's paravirtualized attachment.
     * This field applies to both block volumes and boot volumes. The default value is false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
    private final Boolean isPvEncryptionInTransitEnabled;

    /**
     * Whether to enable in-transit encryption for the data volume's paravirtualized attachment.
     * This field applies to both block volumes and boot volumes. The default value is false.
     *
     * @return the value
     */
    public Boolean getIsPvEncryptionInTransitEnabled() {
        return isPvEncryptionInTransitEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("platformConfig")
    private final LaunchInstancePlatformConfig platformConfig;

    public LaunchInstancePlatformConfig getPlatformConfig() {
        return platformConfig;
    }

    /**
     * The OCID of the Instance Configuration containing instance launch details. Any other fields
     * supplied in this instance launch request will override the details stored in the Instance
     * Configuration for this instance launch.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceConfigurationId")
    private final String instanceConfigurationId;

    /**
     * The OCID of the Instance Configuration containing instance launch details. Any other fields
     * supplied in this instance launch request will override the details stored in the Instance
     * Configuration for this instance launch.
     *
     * @return the value
     */
    public String getInstanceConfigurationId() {
        return instanceConfigurationId;
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
        sb.append("LaunchInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", createVnicDetails=").append(String.valueOf(this.createVnicDetails));
        sb.append(", dedicatedVmHostId=").append(String.valueOf(this.dedicatedVmHostId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", extendedMetadata=").append(String.valueOf(this.extendedMetadata));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", computeClusterId=").append(String.valueOf(this.computeClusterId));
        sb.append(", hostnameLabel=").append(String.valueOf(this.hostnameLabel));
        sb.append(", imageId=").append(String.valueOf(this.imageId));
        sb.append(", ipxeScript=").append(String.valueOf(this.ipxeScript));
        sb.append(", launchOptions=").append(String.valueOf(this.launchOptions));
        sb.append(", instanceOptions=").append(String.valueOf(this.instanceOptions));
        sb.append(", availabilityConfig=").append(String.valueOf(this.availabilityConfig));
        sb.append(", preemptibleInstanceConfig=")
                .append(String.valueOf(this.preemptibleInstanceConfig));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", agentConfig=").append(String.valueOf(this.agentConfig));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", shapeConfig=").append(String.valueOf(this.shapeConfig));
        sb.append(", sourceDetails=").append(String.valueOf(this.sourceDetails));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", isPvEncryptionInTransitEnabled=")
                .append(String.valueOf(this.isPvEncryptionInTransitEnabled));
        sb.append(", platformConfig=").append(String.valueOf(this.platformConfig));
        sb.append(", instanceConfigurationId=")
                .append(String.valueOf(this.instanceConfigurationId));
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
                && java.util.Objects.equals(this.extendedMetadata, other.extendedMetadata)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.computeClusterId, other.computeClusterId)
                && java.util.Objects.equals(this.hostnameLabel, other.hostnameLabel)
                && java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.ipxeScript, other.ipxeScript)
                && java.util.Objects.equals(this.launchOptions, other.launchOptions)
                && java.util.Objects.equals(this.instanceOptions, other.instanceOptions)
                && java.util.Objects.equals(this.availabilityConfig, other.availabilityConfig)
                && java.util.Objects.equals(
                        this.preemptibleInstanceConfig, other.preemptibleInstanceConfig)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.agentConfig, other.agentConfig)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.shapeConfig, other.shapeConfig)
                && java.util.Objects.equals(this.sourceDetails, other.sourceDetails)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(
                        this.isPvEncryptionInTransitEnabled, other.isPvEncryptionInTransitEnabled)
                && java.util.Objects.equals(this.platformConfig, other.platformConfig)
                && java.util.Objects.equals(
                        this.instanceConfigurationId, other.instanceConfigurationId)
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
        result =
                (result * PRIME)
                        + (this.extendedMetadata == null ? 43 : this.extendedMetadata.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.computeClusterId == null ? 43 : this.computeClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.hostnameLabel == null ? 43 : this.hostnameLabel.hashCode());
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result = (result * PRIME) + (this.ipxeScript == null ? 43 : this.ipxeScript.hashCode());
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
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.agentConfig == null ? 43 : this.agentConfig.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.shapeConfig == null ? 43 : this.shapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDetails == null ? 43 : this.sourceDetails.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.isPvEncryptionInTransitEnabled == null
                                ? 43
                                : this.isPvEncryptionInTransitEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.platformConfig == null ? 43 : this.platformConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceConfigurationId == null
                                ? 43
                                : this.instanceConfigurationId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
