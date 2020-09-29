/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Instance launch details.
 * Use the `sourceDetails` parameter to specify whether a boot volume or an image should be used to launch a new instance.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LaunchInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LaunchInstanceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

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

        @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostId")
        private String dedicatedVmHostId;

        public Builder dedicatedVmHostId(String dedicatedVmHostId) {
            this.dedicatedVmHostId = dedicatedVmHostId;
            this.__explicitlySet__.add("dedicatedVmHostId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, Object> extendedMetadata;

        public Builder extendedMetadata(java.util.Map<String, Object> extendedMetadata) {
            this.extendedMetadata = extendedMetadata;
            this.__explicitlySet__.add("extendedMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        public Builder hostnameLabel(String hostnameLabel) {
            this.hostnameLabel = hostnameLabel;
            this.__explicitlySet__.add("hostnameLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipxeScript")
        private String ipxeScript;

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

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityConfig")
        private LaunchInstanceAvailabilityConfigDetails availabilityConfig;

        public Builder availabilityConfig(
                LaunchInstanceAvailabilityConfigDetails availabilityConfig) {
            this.availabilityConfig = availabilityConfig;
            this.__explicitlySet__.add("availabilityConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

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

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

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

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
        private Boolean isPvEncryptionInTransitEnabled;

        public Builder isPvEncryptionInTransitEnabled(Boolean isPvEncryptionInTransitEnabled) {
            this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
            this.__explicitlySet__.add("isPvEncryptionInTransitEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LaunchInstanceDetails build() {
            LaunchInstanceDetails __instance__ =
                    new LaunchInstanceDetails(
                            availabilityDomain,
                            compartmentId,
                            createVnicDetails,
                            dedicatedVmHostId,
                            definedTags,
                            displayName,
                            extendedMetadata,
                            faultDomain,
                            freeformTags,
                            hostnameLabel,
                            imageId,
                            ipxeScript,
                            launchOptions,
                            availabilityConfig,
                            metadata,
                            agentConfig,
                            shape,
                            shapeConfig,
                            sourceDetails,
                            subnetId,
                            isPvEncryptionInTransitEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LaunchInstanceDetails o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .compartmentId(o.getCompartmentId())
                            .createVnicDetails(o.getCreateVnicDetails())
                            .dedicatedVmHostId(o.getDedicatedVmHostId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .extendedMetadata(o.getExtendedMetadata())
                            .faultDomain(o.getFaultDomain())
                            .freeformTags(o.getFreeformTags())
                            .hostnameLabel(o.getHostnameLabel())
                            .imageId(o.getImageId())
                            .ipxeScript(o.getIpxeScript())
                            .launchOptions(o.getLaunchOptions())
                            .availabilityConfig(o.getAvailabilityConfig())
                            .metadata(o.getMetadata())
                            .agentConfig(o.getAgentConfig())
                            .shape(o.getShape())
                            .shapeConfig(o.getShapeConfig())
                            .sourceDetails(o.getSourceDetails())
                            .subnetId(o.getSubnetId())
                            .isPvEncryptionInTransitEnabled(o.getIsPvEncryptionInTransitEnabled());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The availability domain of the instance.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Details for the primary VNIC, which is automatically created and attached when
     * the instance is launched.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createVnicDetails")
    CreateVnicDetails createVnicDetails;

    /**
     * The OCID of the dedicated VM host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostId")
    String dedicatedVmHostId;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: `My bare metal instance`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Additional metadata key/value pairs that you provide. They serve the same purpose and
     * functionality as fields in the `metadata` object.
     * <p>
     * They are distinguished from `metadata` fields in that these can be nested JSON objects
     * (whereas `metadata` fields are string/string maps only).
     * <p>
     * The combined size of the `metadata` and `extendedMetadata` objects can be a maximum of
     * 32,000 bytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    java.util.Map<String, Object> extendedMetadata;

    /**
     * A fault domain is a grouping of hardware and infrastructure within an availability domain.
     * Each availability domain contains three fault domains. Fault domains let you distribute your
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
     * Example: `FAULT-DOMAIN-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    String faultDomain;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Deprecated. Instead use `hostnameLabel` in
     * {@link CreateVnicDetails}.
     * If you provide both, the values must match.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    String hostnameLabel;

    /**
     * Deprecated. Use `sourceDetails` with {@link #instanceSourceViaImageDetails(InstanceSourceViaImageDetailsRequest) instanceSourceViaImageDetails}
     * source type instead. If you specify values for both, the values must match.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    String imageId;

    /**
     * This is an advanced option.
     * <p>
     * When a bare metal or virtual machine
     * instance boots, the iPXE firmware that runs on the instance is
     * configured to run an iPXE script to continue the boot process.
     * <p>
     * If you want more control over the boot process, you can provide
     * your own custom iPXE script that will run when the instance boots;
     * however, you should be aware that the same iPXE script will run
     * every time an instance boots; not only after the initial
     * LaunchInstance call.
     * <p>
     * The default iPXE script connects to the instance's local boot
     * volume over iSCSI and performs a network boot. If you use a custom iPXE
     * script and want to network-boot from the instance's local boot volume
     * over iSCSI the same way as the default iPXE script, you should use the
     * following iSCSI IP address: 169.254.0.2, and boot volume IQN:
     * iqn.2015-02.oracle.boot.
     * <p>
     * For more information about the Bring Your Own Image feature of
     * Oracle Cloud Infrastructure, see
     * [Bring Your Own Image](https://docs.cloud.oracle.com/Content/Compute/References/bringyourownimage.htm).
     * <p>
     * For more information about iPXE, see http://ipxe.org.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipxeScript")
    String ipxeScript;

    /**
     * Options for tuning the compatibility and performance of VM shapes. The values that you specify override any
     * default values.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("launchOptions")
    LaunchOptions launchOptions;

    /**
     * Options for defining the availability of a VM instance after a maintenance event that impacts the underlying hardware.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityConfig")
    LaunchInstanceAvailabilityConfigDetails availabilityConfig;

    /**
     * Custom metadata key/value pairs that you provide, such as the SSH public key
     * required to connect to the instance.
     * <p>
     * A metadata service runs on every launched instance. The service is an HTTP
     * endpoint listening on 169.254.169.254. You can use the service to:
     * <p>
     * Provide information to [Cloud-Init](https://cloudinit.readthedocs.org/en/latest/)
     *   to be used for various system initialization tasks.
     * <p>
     * Get information about the instance, including the custom metadata that you
     *   provide when you launch the instance.
     * <p>
     **Providing Cloud-Init Metadata**
     * <p>
     * You can use the following metadata key names to provide information to
     *  Cloud-Init:
     * <p>
     **\"ssh_authorized_keys\"** - Provide one or more public SSH keys to be
     *  included in the `~/.ssh/authorized_keys` file for the default user on the
     *  instance. Use a newline character to separate multiple keys. The SSH
     *  keys must be in the format necessary for the `authorized_keys` file, as shown
     *  in the example below.
     * <p>
     **\"user_data\"** - Provide your own base64-encoded data to be used by
     *  Cloud-Init to run custom scripts or provide custom Cloud-Init configuration. For
     *  information about how to take advantage of user data, see the
     *  [Cloud-Init Documentation](http://cloudinit.readthedocs.org/en/latest/topics/format.html).
     * <p>
     **Metadata Example**
     * <p>
     * \"metadata\" : {
     *          \"quake_bot_level\" : \"Severe\",
     *          \"ssh_authorized_keys\" : \"ssh-rsa <your_public_SSH_key>== rsa-key-20160227\",
     *          \"user_data\" : \"<your_public_SSH_key>==\"
     *       }
     *  **Getting Metadata on the Instance**
     * <p>
     * To get information about your instance, connect to the instance using SSH and issue any of the
     *  following GET requests:
     * <p>
     * curl -H \"Authorization: Bearer Oracle\" http://169.254.169.254/opc/v2/instance/
     *      curl -H \"Authorization: Bearer Oracle\" http://169.254.169.254/opc/v2/instance/metadata/
     *      curl -H \"Authorization: Bearer Oracle\" http://169.254.169.254/opc/v2/instance/metadata/<any-key-name>
     * <p>
     * You'll get back a response that includes all the instance information; only the metadata information; or
     *  the metadata information for the specified key name, respectively.
     * <p>
     * The combined size of the `metadata` and `extendedMetadata` objects can be a maximum of 32,000 bytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    java.util.Map<String, String> metadata;

    @com.fasterxml.jackson.annotation.JsonProperty("agentConfig")
    LaunchInstanceAgentConfigDetails agentConfig;

    /**
     * The shape of an instance. The shape determines the number of CPUs, amount of memory,
     * and other resources allocated to the instance.
     * <p>
     * You can enumerate all available shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    String shape;

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
    LaunchInstanceShapeConfigDetails shapeConfig;

    /**
     * Details for creating an instance.
     * Use this parameter to specify whether a boot volume or an image should be used to launch a new instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
    InstanceSourceDetails sourceDetails;

    /**
     * Deprecated. Instead use `subnetId` in
     * {@link CreateVnicDetails}.
     * At least one of them is required; if you provide both, the values must match.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    String subnetId;

    /**
     * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. The default value is false.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
    Boolean isPvEncryptionInTransitEnabled;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
