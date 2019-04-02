/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Either instanceId or imageSourceDetails must be provided in addition to other required parameters.
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
    builder = CreateImageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateImageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageSourceDetails")
        private ImageSourceDetails imageSourceDetails;

        public Builder imageSourceDetails(ImageSourceDetails imageSourceDetails) {
            this.imageSourceDetails = imageSourceDetails;
            this.__explicitlySet__.add("imageSourceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("launchMode")
        private LaunchMode launchMode;

        public Builder launchMode(LaunchMode launchMode) {
            this.launchMode = launchMode;
            this.__explicitlySet__.add("launchMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateImageDetails build() {
            CreateImageDetails __instance__ =
                    new CreateImageDetails(
                            compartmentId,
                            definedTags,
                            displayName,
                            freeformTags,
                            imageSourceDetails,
                            instanceId,
                            launchMode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateImageDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .imageSourceDetails(o.getImageSourceDetails())
                            .instanceId(o.getInstanceId())
                            .launchMode(o.getLaunchMode());

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
     * The OCID of the compartment containing the instance you want to use as the basis for the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name for the image. It does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * You cannot use an Oracle-provided image name as a custom image name.
     * <p>
     * Example: `My Oracle Linux image`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Details for creating an image through import
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageSourceDetails")
    ImageSourceDetails imageSourceDetails;

    /**
     * The OCID of the instance you want to use as the basis for the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    String instanceId;
    /**
     * Specifies the configuration mode for launching virtual machine (VM) instances. The configuration modes are:
     * * `NATIVE` - VM instances launch with paravirtualized boot and VFIO devices. The default value for Oracle-provided images.
     * * `EMULATED` - VM instances launch with emulated devices, such as the E1000 network driver and emulated SCSI disk controller.
     * * `PARAVIRTUALIZED` - VM instances launch with paravirtualized devices using virtio drivers.
     * * `CUSTOM` - VM instances launch with custom configuration settings specified in the `LaunchOptions` parameter.
     *
     **/
    public enum LaunchMode {
        Native("NATIVE"),
        Emulated("EMULATED"),
        Paravirtualized("PARAVIRTUALIZED"),
        Custom("CUSTOM"),
        ;

        private final String value;
        private static java.util.Map<String, LaunchMode> map;

        static {
            map = new java.util.HashMap<>();
            for (LaunchMode v : LaunchMode.values()) {
                map.put(v.getValue(), v);
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
            throw new RuntimeException("Invalid LaunchMode: " + key);
        }
    };
    /**
     * Specifies the configuration mode for launching virtual machine (VM) instances. The configuration modes are:
     * * `NATIVE` - VM instances launch with paravirtualized boot and VFIO devices. The default value for Oracle-provided images.
     * * `EMULATED` - VM instances launch with emulated devices, such as the E1000 network driver and emulated SCSI disk controller.
     * * `PARAVIRTUALIZED` - VM instances launch with paravirtualized devices using virtio drivers.
     * * `CUSTOM` - VM instances launch with custom configuration settings specified in the `LaunchOptions` parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("launchMode")
    LaunchMode launchMode;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
