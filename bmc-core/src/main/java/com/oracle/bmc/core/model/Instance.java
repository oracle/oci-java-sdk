/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A compute host. The image used to launch the instance determines its operating system and other
 * software. The shape specified during the launch process determines the number of CPUs and memory
 * allocated to the instance. For more information, see
 * [Overview of the Compute Service](https://docs.cloud.oracle.com/Content/Compute/Concepts/computeoverview.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Instance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Instance {
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

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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

        @com.fasterxml.jackson.annotation.JsonProperty("launchMode")
        private LaunchMode launchMode;

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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
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
        private InstanceShapeConfig shapeConfig;

        public Builder shapeConfig(InstanceShapeConfig shapeConfig) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

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

        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceRebootDue")
        private java.util.Date timeMaintenanceRebootDue;

        public Builder timeMaintenanceRebootDue(java.util.Date timeMaintenanceRebootDue) {
            this.timeMaintenanceRebootDue = timeMaintenanceRebootDue;
            this.__explicitlySet__.add("timeMaintenanceRebootDue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Instance build() {
            Instance __instance__ =
                    new Instance(
                            availabilityDomain,
                            compartmentId,
                            dedicatedVmHostId,
                            definedTags,
                            displayName,
                            extendedMetadata,
                            faultDomain,
                            freeformTags,
                            id,
                            imageId,
                            ipxeScript,
                            launchMode,
                            launchOptions,
                            lifecycleState,
                            metadata,
                            region,
                            shape,
                            shapeConfig,
                            sourceDetails,
                            systemTags,
                            timeCreated,
                            agentConfig,
                            timeMaintenanceRebootDue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Instance o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .compartmentId(o.getCompartmentId())
                            .dedicatedVmHostId(o.getDedicatedVmHostId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .extendedMetadata(o.getExtendedMetadata())
                            .faultDomain(o.getFaultDomain())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .imageId(o.getImageId())
                            .ipxeScript(o.getIpxeScript())
                            .launchMode(o.getLaunchMode())
                            .launchOptions(o.getLaunchOptions())
                            .lifecycleState(o.getLifecycleState())
                            .metadata(o.getMetadata())
                            .region(o.getRegion())
                            .shape(o.getShape())
                            .shapeConfig(o.getShapeConfig())
                            .sourceDetails(o.getSourceDetails())
                            .systemTags(o.getSystemTags())
                            .timeCreated(o.getTimeCreated())
                            .agentConfig(o.getAgentConfig())
                            .timeMaintenanceRebootDue(o.getTimeMaintenanceRebootDue());

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
     * The availability domain the instance is running in.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The OCID of the compartment that contains the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The OCID of dedicated VM host.
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
     * Additional metadata key/value pairs that you provide. They serve the same purpose and functionality
     * as fields in the `metadata` object.
     * <p>
     * They are distinguished from `metadata` fields in that these can be nested JSON objects (whereas `metadata`
     * fields are string/string maps only).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    java.util.Map<String, Object> extendedMetadata;

    /**
     * The name of the fault domain the instance is running in.
     * <p>
     * A fault domain is a grouping of hardware and infrastructure within an availability domain.
     * Each availability domain contains three fault domains. Fault domains let you distribute your
     * instances so that they are not on the same physical hardware within a single availability domain.
     * A hardware failure or Compute hardware maintenance that affects one fault domain does not affect
     * instances in other fault domains.
     * <p>
     * If you do not specify the fault domain, the system selects one for you.
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
     * The OCID of the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Deprecated. Use `sourceDetails` instead.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    String imageId;

    /**
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
    LaunchOptions launchOptions;
    /**
     * The current state of the instance.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
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
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The current state of the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Custom metadata that you provide.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    java.util.Map<String, String> metadata;

    /**
     * The region that contains the availability domain the instance is running in.
     * <p>
     * For the us-phoenix-1 and us-ashburn-1 regions, `phx` and `iad` are returned, respectively.
     * For all other regions, the full region name is returned.
     * <p>
     * Examples: `phx`, `eu-frankfurt-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    String region;

    /**
     * The shape of the instance. The shape determines the number of CPUs and the amount of memory
     * allocated to the instance. You can enumerate all available shapes by calling
     * {@link #listShapes(ListShapesRequest) listShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    String shape;

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
    InstanceShapeConfig shapeConfig;

    /**
     * Details for creating an instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
    InstanceSourceDetails sourceDetails;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The date and time the instance was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    @com.fasterxml.jackson.annotation.JsonProperty("agentConfig")
    InstanceAgentConfig agentConfig;

    /**
     * The date and time the instance is expected to be stopped / started,  in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * After that time if instance hasn't been rebooted, Oracle will reboot the instance within 24 hours of the due time.
     * Regardless of how the instance was stopped, the flag will be reset to empty as soon as instance reaches Stopped state.
     * Example: `2018-05-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceRebootDue")
    java.util.Date timeMaintenanceRebootDue;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
