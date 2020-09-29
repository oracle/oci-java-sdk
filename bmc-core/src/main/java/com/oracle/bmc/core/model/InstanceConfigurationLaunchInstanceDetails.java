/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Instance launch details for creating an instance from an instance configuration. Use the `sourceDetails`
 * parameter to specify whether a boot volume or an image should be used to launch a new instance.
 * <p>
 * See {@link LaunchInstanceDetails} for more information.
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
    builder = InstanceConfigurationLaunchInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class InstanceConfigurationLaunchInstanceDetails {
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
        private InstanceConfigurationCreateVnicDetails createVnicDetails;

        public Builder createVnicDetails(InstanceConfigurationCreateVnicDetails createVnicDetails) {
            this.createVnicDetails = createVnicDetails;
            this.__explicitlySet__.add("createVnicDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipxeScript")
        private String ipxeScript;

        public Builder ipxeScript(String ipxeScript) {
            this.ipxeScript = ipxeScript;
            this.__explicitlySet__.add("ipxeScript");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
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
        private InstanceConfigurationLaunchInstanceShapeConfigDetails shapeConfig;

        public Builder shapeConfig(
                InstanceConfigurationLaunchInstanceShapeConfigDetails shapeConfig) {
            this.shapeConfig = shapeConfig;
            this.__explicitlySet__.add("shapeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
        private InstanceConfigurationInstanceSourceDetails sourceDetails;

        public Builder sourceDetails(InstanceConfigurationInstanceSourceDetails sourceDetails) {
            this.sourceDetails = sourceDetails;
            this.__explicitlySet__.add("sourceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostId")
        private String dedicatedVmHostId;

        public Builder dedicatedVmHostId(String dedicatedVmHostId) {
            this.dedicatedVmHostId = dedicatedVmHostId;
            this.__explicitlySet__.add("dedicatedVmHostId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("launchMode")
        private LaunchMode launchMode;

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

        @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
        private Boolean isPvEncryptionInTransitEnabled;

        public Builder isPvEncryptionInTransitEnabled(Boolean isPvEncryptionInTransitEnabled) {
            this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
            this.__explicitlySet__.add("isPvEncryptionInTransitEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("preferredMaintenanceAction")
        private PreferredMaintenanceAction preferredMaintenanceAction;

        public Builder preferredMaintenanceAction(
                PreferredMaintenanceAction preferredMaintenanceAction) {
            this.preferredMaintenanceAction = preferredMaintenanceAction;
            this.__explicitlySet__.add("preferredMaintenanceAction");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConfigurationLaunchInstanceDetails build() {
            InstanceConfigurationLaunchInstanceDetails __instance__ =
                    new InstanceConfigurationLaunchInstanceDetails(
                            availabilityDomain,
                            compartmentId,
                            createVnicDetails,
                            definedTags,
                            displayName,
                            extendedMetadata,
                            freeformTags,
                            ipxeScript,
                            metadata,
                            shape,
                            shapeConfig,
                            sourceDetails,
                            faultDomain,
                            dedicatedVmHostId,
                            launchMode,
                            launchOptions,
                            agentConfig,
                            isPvEncryptionInTransitEnabled,
                            preferredMaintenanceAction,
                            availabilityConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfigurationLaunchInstanceDetails o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .compartmentId(o.getCompartmentId())
                            .createVnicDetails(o.getCreateVnicDetails())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .extendedMetadata(o.getExtendedMetadata())
                            .freeformTags(o.getFreeformTags())
                            .ipxeScript(o.getIpxeScript())
                            .metadata(o.getMetadata())
                            .shape(o.getShape())
                            .shapeConfig(o.getShapeConfig())
                            .sourceDetails(o.getSourceDetails())
                            .faultDomain(o.getFaultDomain())
                            .dedicatedVmHostId(o.getDedicatedVmHostId())
                            .launchMode(o.getLaunchMode())
                            .launchOptions(o.getLaunchOptions())
                            .agentConfig(o.getAgentConfig())
                            .isPvEncryptionInTransitEnabled(o.getIsPvEncryptionInTransitEnabled())
                            .preferredMaintenanceAction(o.getPreferredMaintenanceAction())
                            .availabilityConfig(o.getAvailabilityConfig());

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
    InstanceConfigurationCreateVnicDetails createVnicDetails;

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
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

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
    InstanceConfigurationLaunchInstanceShapeConfigDetails shapeConfig;

    /**
     * Details for creating an instance.
     * Use this parameter to specify whether a boot volume or an image should be used to launch a new instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
    InstanceConfigurationInstanceSourceDetails sourceDetails;

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
     * The OCID of dedicated VM host.
     * <p>
     * Dedicated VM hosts can be used when launching individual instances from an instance configuration. They
     * cannot be used to launch instance pools.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostId")
    String dedicatedVmHostId;
    /**
     * Specifies the configuration mode for launching virtual machine (VM) instances. The configuration modes are:
     * * `NATIVE` - VM instances launch with iSCSI boot and VFIO devices. The default value for Oracle-provided images.
     * * `EMULATED` - VM instances launch with emulated devices, such as the E1000 network driver and emulated SCSI disk controller.
     * * `PARAVIRTUALIZED` - VM instances launch with paravirtualized devices using VirtIO drivers.
     * * `CUSTOM` - VM instances launch with custom configuration settings specified in the `LaunchOptions` parameter.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LaunchMode {
        Native("NATIVE"),
        Emulated("EMULATED"),
        Paravirtualized("PARAVIRTUALIZED"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Specifies the configuration mode for launching virtual machine (VM) instances. The configuration modes are:
     * * `NATIVE` - VM instances launch with iSCSI boot and VFIO devices. The default value for Oracle-provided images.
     * * `EMULATED` - VM instances launch with emulated devices, such as the E1000 network driver and emulated SCSI disk controller.
     * * `PARAVIRTUALIZED` - VM instances launch with paravirtualized devices using VirtIO drivers.
     * * `CUSTOM` - VM instances launch with custom configuration settings specified in the `LaunchOptions` parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("launchMode")
    LaunchMode launchMode;

    /**
     * Options for tuning the compatibility and performance of VM shapes. The values that you specify override any default values.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("launchOptions")
    InstanceConfigurationLaunchOptions launchOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("agentConfig")
    InstanceConfigurationLaunchInstanceAgentConfigDetails agentConfig;

    /**
     * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. The default value is false.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
    Boolean isPvEncryptionInTransitEnabled;
    /**
     * The preferred maintenance action for an instance. The default is LIVE_MIGRATE, if live migration is supported.
     * * `LIVE_MIGRATE` - Run maintenance using a live migration.
     * * `REBOOT` - Run maintenance using a reboot.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PreferredMaintenanceAction {
        LiveMigrate("LIVE_MIGRATE"),
        Reboot("REBOOT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The preferred maintenance action for an instance. The default is LIVE_MIGRATE, if live migration is supported.
     * * `LIVE_MIGRATE` - Run maintenance using a live migration.
     * * `REBOOT` - Run maintenance using a reboot.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preferredMaintenanceAction")
    PreferredMaintenanceAction preferredMaintenanceAction;

    /**
     * Options for defining the availabiity of a VM instance after a maintenance event that impacts the underlying hardware.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityConfig")
    InstanceConfigurationAvailabilityConfig availabilityConfig;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
