/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A boot disk image for launching an instance. For more information, see
 * [Overview of the Compute Service](https://docs.cloud.oracle.com/iaas/Content/Compute/Concepts/computeoverview.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Image.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Image {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("baseImageId")
        private String baseImageId;

        public Builder baseImageId(String baseImageId) {
            this.baseImageId = baseImageId;
            this.__explicitlySet__.add("baseImageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createImageAllowed")
        private Boolean createImageAllowed;

        public Builder createImageAllowed(Boolean createImageAllowed) {
            this.createImageAllowed = createImageAllowed;
            this.__explicitlySet__.add("createImageAllowed");
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

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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

        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private String operatingSystem;

        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            this.__explicitlySet__.add("operatingSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystemVersion")
        private String operatingSystemVersion;

        public Builder operatingSystemVersion(String operatingSystemVersion) {
            this.operatingSystemVersion = operatingSystemVersion;
            this.__explicitlySet__.add("operatingSystemVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("agentFeatures")
        private InstanceAgentFeatures agentFeatures;

        public Builder agentFeatures(InstanceAgentFeatures agentFeatures) {
            this.agentFeatures = agentFeatures;
            this.__explicitlySet__.add("agentFeatures");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listingType")
        private ListingType listingType;

        public Builder listingType(ListingType listingType) {
            this.listingType = listingType;
            this.__explicitlySet__.add("listingType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
        private Long sizeInMBs;

        public Builder sizeInMBs(Long sizeInMBs) {
            this.sizeInMBs = sizeInMBs;
            this.__explicitlySet__.add("sizeInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("billableSizeInGBs")
        private Long billableSizeInGBs;

        public Builder billableSizeInGBs(Long billableSizeInGBs) {
            this.billableSizeInGBs = billableSizeInGBs;
            this.__explicitlySet__.add("billableSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Image build() {
            Image __instance__ =
                    new Image(
                            baseImageId,
                            compartmentId,
                            createImageAllowed,
                            definedTags,
                            displayName,
                            freeformTags,
                            id,
                            launchMode,
                            launchOptions,
                            lifecycleState,
                            operatingSystem,
                            operatingSystemVersion,
                            agentFeatures,
                            listingType,
                            sizeInMBs,
                            billableSizeInGBs,
                            timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Image o) {
            Builder copiedBuilder =
                    baseImageId(o.getBaseImageId())
                            .compartmentId(o.getCompartmentId())
                            .createImageAllowed(o.getCreateImageAllowed())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .launchMode(o.getLaunchMode())
                            .launchOptions(o.getLaunchOptions())
                            .lifecycleState(o.getLifecycleState())
                            .operatingSystem(o.getOperatingSystem())
                            .operatingSystemVersion(o.getOperatingSystemVersion())
                            .agentFeatures(o.getAgentFeatures())
                            .listingType(o.getListingType())
                            .sizeInMBs(o.getSizeInMBs())
                            .billableSizeInGBs(o.getBillableSizeInGBs())
                            .timeCreated(o.getTimeCreated());

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
     * The OCID of the image originally used to launch the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseImageId")
    String baseImageId;

    /**
     * The OCID of the compartment containing the instance you want to use as the basis for the image.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Whether instances launched with this image can be used to create new images.
     * For example, you cannot create an image of an Oracle Database instance.
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createImageAllowed")
    Boolean createImageAllowed;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name for the image. It does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * You cannot use a platform image name as a custom image name.
     * <p>
     * Example: {@code My custom Oracle Linux image}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The OCID of the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * Specifies the configuration mode for launching virtual machine (VM) instances. The configuration modes are:
     * * {@code NATIVE} - VM instances launch with iSCSI boot and VFIO devices. The default value for platform images.
     * * {@code EMULATED} - VM instances launch with emulated devices, such as the E1000 network driver and emulated SCSI disk controller.
     * * {@code PARAVIRTUALIZED} - VM instances launch with paravirtualized devices using VirtIO drivers.
     * * {@code CUSTOM} - VM instances launch with custom configuration settings specified in the {@code LaunchOptions} parameter.
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
     * * {@code NATIVE} - VM instances launch with iSCSI boot and VFIO devices. The default value for platform images.
     * * {@code EMULATED} - VM instances launch with emulated devices, such as the E1000 network driver and emulated SCSI disk controller.
     * * {@code PARAVIRTUALIZED} - VM instances launch with paravirtualized devices using VirtIO drivers.
     * * {@code CUSTOM} - VM instances launch with custom configuration settings specified in the {@code LaunchOptions} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("launchMode")
    LaunchMode launchMode;

    @com.fasterxml.jackson.annotation.JsonProperty("launchOptions")
    LaunchOptions launchOptions;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Importing("IMPORTING"),
        Available("AVAILABLE"),
        Exporting("EXPORTING"),
        Disabled("DISABLED"),
        Deleted("DELETED"),

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

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The image's operating system.
     * <p>
     * Example: {@code Oracle Linux}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    String operatingSystem;

    /**
     * The image's operating system version.
     * <p>
     * Example: {@code 7.2}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystemVersion")
    String operatingSystemVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("agentFeatures")
    InstanceAgentFeatures agentFeatures;
    /**
     * The listing type of the image. The default value is "NONE".
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ListingType {
        Community("COMMUNITY"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ListingType> map;

        static {
            map = new java.util.HashMap<>();
            for (ListingType v : ListingType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ListingType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ListingType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ListingType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The listing type of the image. The default value is "NONE".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingType")
    ListingType listingType;

    /**
     * The boot volume size for an instance launched from this image (1 MB = 1,048,576 bytes).
     * Note this is not the same as the size of the image when it was exported or the actual size of the image.
     * <p>
     * Example: {@code 47694}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
    Long sizeInMBs;

    /**
     * The size of the internal storage for this image that is subject to billing (1 GB = 1,073,741,824 bytes).
     * <p>
     * Example: {@code 100}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billableSizeInGBs")
    Long billableSizeInGBs;

    /**
     * The date and time the image was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
