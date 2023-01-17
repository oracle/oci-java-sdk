/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A boot disk image for launching an instance. For more information, see [Overview of the Compute
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
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Image.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Image extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "baseImageId",
        "compartmentId",
        "createImageAllowed",
        "definedTags",
        "displayName",
        "freeformTags",
        "id",
        "launchMode",
        "launchOptions",
        "lifecycleState",
        "operatingSystem",
        "operatingSystemVersion",
        "agentFeatures",
        "listingType",
        "sizeInMBs",
        "billableSizeInGBs",
        "timeCreated"
    })
    public Image(
            String baseImageId,
            String compartmentId,
            Boolean createImageAllowed,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            LaunchMode launchMode,
            LaunchOptions launchOptions,
            LifecycleState lifecycleState,
            String operatingSystem,
            String operatingSystemVersion,
            InstanceAgentFeatures agentFeatures,
            ListingType listingType,
            Long sizeInMBs,
            Long billableSizeInGBs,
            java.util.Date timeCreated) {
        super();
        this.baseImageId = baseImageId;
        this.compartmentId = compartmentId;
        this.createImageAllowed = createImageAllowed;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.launchMode = launchMode;
        this.launchOptions = launchOptions;
        this.lifecycleState = lifecycleState;
        this.operatingSystem = operatingSystem;
        this.operatingSystemVersion = operatingSystemVersion;
        this.agentFeatures = agentFeatures;
        this.listingType = listingType;
        this.sizeInMBs = sizeInMBs;
        this.billableSizeInGBs = billableSizeInGBs;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the image originally used to launch the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("baseImageId")
        private String baseImageId;

        /**
         * The OCID of the image originally used to launch the instance.
         *
         * @param baseImageId the value to set
         * @return this builder
         */
        public Builder baseImageId(String baseImageId) {
            this.baseImageId = baseImageId;
            this.__explicitlySet__.add("baseImageId");
            return this;
        }
        /**
         * The OCID of the compartment containing the instance you want to use as the basis for the
         * image.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the instance you want to use as the basis for the
         * image.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Whether instances launched with this image can be used to create new images. For example,
         * you cannot create an image of an Oracle Database instance.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("createImageAllowed")
        private Boolean createImageAllowed;

        /**
         * Whether instances launched with this image can be used to create new images. For example,
         * you cannot create an image of an Oracle Database instance.
         *
         * <p>Example: {@code true}
         *
         * @param createImageAllowed the value to set
         * @return this builder
         */
        public Builder createImageAllowed(Boolean createImageAllowed) {
            this.createImageAllowed = createImageAllowed;
            this.__explicitlySet__.add("createImageAllowed");
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
         * A user-friendly name for the image. It does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * <p>You cannot use a platform image name as a custom image name.
         *
         * <p>Example: {@code My custom Oracle Linux image}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the image. It does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * <p>You cannot use a platform image name as a custom image name.
         *
         * <p>Example: {@code My custom Oracle Linux image}
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
        /** The OCID of the image. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the image.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The image's operating system.
         *
         * <p>Example: {@code Oracle Linux}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private String operatingSystem;

        /**
         * The image's operating system.
         *
         * <p>Example: {@code Oracle Linux}
         *
         * @param operatingSystem the value to set
         * @return this builder
         */
        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            this.__explicitlySet__.add("operatingSystem");
            return this;
        }
        /**
         * The image's operating system version.
         *
         * <p>Example: {@code 7.2}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystemVersion")
        private String operatingSystemVersion;

        /**
         * The image's operating system version.
         *
         * <p>Example: {@code 7.2}
         *
         * @param operatingSystemVersion the value to set
         * @return this builder
         */
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
        /** The listing type of the image. The default value is "NONE". */
        @com.fasterxml.jackson.annotation.JsonProperty("listingType")
        private ListingType listingType;

        /**
         * The listing type of the image. The default value is "NONE".
         *
         * @param listingType the value to set
         * @return this builder
         */
        public Builder listingType(ListingType listingType) {
            this.listingType = listingType;
            this.__explicitlySet__.add("listingType");
            return this;
        }
        /**
         * The boot volume size for an instance launched from this image (1 MB = 1,048,576 bytes).
         * Note this is not the same as the size of the image when it was exported or the actual
         * size of the image.
         *
         * <p>Example: {@code 47694}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
        private Long sizeInMBs;

        /**
         * The boot volume size for an instance launched from this image (1 MB = 1,048,576 bytes).
         * Note this is not the same as the size of the image when it was exported or the actual
         * size of the image.
         *
         * <p>Example: {@code 47694}
         *
         * @param sizeInMBs the value to set
         * @return this builder
         */
        public Builder sizeInMBs(Long sizeInMBs) {
            this.sizeInMBs = sizeInMBs;
            this.__explicitlySet__.add("sizeInMBs");
            return this;
        }
        /**
         * The size of the internal storage for this image that is subject to billing (1 GB =
         * 1,073,741,824 bytes).
         *
         * <p>Example: {@code 100}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("billableSizeInGBs")
        private Long billableSizeInGBs;

        /**
         * The size of the internal storage for this image that is subject to billing (1 GB =
         * 1,073,741,824 bytes).
         *
         * <p>Example: {@code 100}
         *
         * @param billableSizeInGBs the value to set
         * @return this builder
         */
        public Builder billableSizeInGBs(Long billableSizeInGBs) {
            this.billableSizeInGBs = billableSizeInGBs;
            this.__explicitlySet__.add("billableSizeInGBs");
            return this;
        }
        /**
         * The date and time the image was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the image was created, in the format defined by
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Image build() {
            Image model =
                    new Image(
                            this.baseImageId,
                            this.compartmentId,
                            this.createImageAllowed,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.id,
                            this.launchMode,
                            this.launchOptions,
                            this.lifecycleState,
                            this.operatingSystem,
                            this.operatingSystemVersion,
                            this.agentFeatures,
                            this.listingType,
                            this.sizeInMBs,
                            this.billableSizeInGBs,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Image model) {
            if (model.wasPropertyExplicitlySet("baseImageId")) {
                this.baseImageId(model.getBaseImageId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("createImageAllowed")) {
                this.createImageAllowed(model.getCreateImageAllowed());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("launchMode")) {
                this.launchMode(model.getLaunchMode());
            }
            if (model.wasPropertyExplicitlySet("launchOptions")) {
                this.launchOptions(model.getLaunchOptions());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("operatingSystem")) {
                this.operatingSystem(model.getOperatingSystem());
            }
            if (model.wasPropertyExplicitlySet("operatingSystemVersion")) {
                this.operatingSystemVersion(model.getOperatingSystemVersion());
            }
            if (model.wasPropertyExplicitlySet("agentFeatures")) {
                this.agentFeatures(model.getAgentFeatures());
            }
            if (model.wasPropertyExplicitlySet("listingType")) {
                this.listingType(model.getListingType());
            }
            if (model.wasPropertyExplicitlySet("sizeInMBs")) {
                this.sizeInMBs(model.getSizeInMBs());
            }
            if (model.wasPropertyExplicitlySet("billableSizeInGBs")) {
                this.billableSizeInGBs(model.getBillableSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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

    /** The OCID of the image originally used to launch the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("baseImageId")
    private final String baseImageId;

    /**
     * The OCID of the image originally used to launch the instance.
     *
     * @return the value
     */
    public String getBaseImageId() {
        return baseImageId;
    }

    /**
     * The OCID of the compartment containing the instance you want to use as the basis for the
     * image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the instance you want to use as the basis for the
     * image.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Whether instances launched with this image can be used to create new images. For example, you
     * cannot create an image of an Oracle Database instance.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("createImageAllowed")
    private final Boolean createImageAllowed;

    /**
     * Whether instances launched with this image can be used to create new images. For example, you
     * cannot create an image of an Oracle Database instance.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getCreateImageAllowed() {
        return createImageAllowed;
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
     * A user-friendly name for the image. It does not have to be unique, and it's changeable. Avoid
     * entering confidential information.
     *
     * <p>You cannot use a platform image name as a custom image name.
     *
     * <p>Example: {@code My custom Oracle Linux image}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the image. It does not have to be unique, and it's changeable. Avoid
     * entering confidential information.
     *
     * <p>You cannot use a platform image name as a custom image name.
     *
     * <p>Example: {@code My custom Oracle Linux image}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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

    /** The OCID of the image. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the image.
     *
     * @return the value
     */
    public String getId() {
        return id;
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

    /** */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Importing("IMPORTING"),
        Available("AVAILABLE"),
        Exporting("EXPORTING"),
        Disabled("DISABLED"),
        Deleted("DELETED"),

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

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The image's operating system.
     *
     * <p>Example: {@code Oracle Linux}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    private final String operatingSystem;

    /**
     * The image's operating system.
     *
     * <p>Example: {@code Oracle Linux}
     *
     * @return the value
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * The image's operating system version.
     *
     * <p>Example: {@code 7.2}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystemVersion")
    private final String operatingSystemVersion;

    /**
     * The image's operating system version.
     *
     * <p>Example: {@code 7.2}
     *
     * @return the value
     */
    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("agentFeatures")
    private final InstanceAgentFeatures agentFeatures;

    public InstanceAgentFeatures getAgentFeatures() {
        return agentFeatures;
    }

    /** The listing type of the image. The default value is "NONE". */
    public enum ListingType implements com.oracle.bmc.http.internal.BmcEnum {
        Community("COMMUNITY"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ListingType.class);

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
    /** The listing type of the image. The default value is "NONE". */
    @com.fasterxml.jackson.annotation.JsonProperty("listingType")
    private final ListingType listingType;

    /**
     * The listing type of the image. The default value is "NONE".
     *
     * @return the value
     */
    public ListingType getListingType() {
        return listingType;
    }

    /**
     * The boot volume size for an instance launched from this image (1 MB = 1,048,576 bytes). Note
     * this is not the same as the size of the image when it was exported or the actual size of the
     * image.
     *
     * <p>Example: {@code 47694}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
    private final Long sizeInMBs;

    /**
     * The boot volume size for an instance launched from this image (1 MB = 1,048,576 bytes). Note
     * this is not the same as the size of the image when it was exported or the actual size of the
     * image.
     *
     * <p>Example: {@code 47694}
     *
     * @return the value
     */
    public Long getSizeInMBs() {
        return sizeInMBs;
    }

    /**
     * The size of the internal storage for this image that is subject to billing (1 GB =
     * 1,073,741,824 bytes).
     *
     * <p>Example: {@code 100}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("billableSizeInGBs")
    private final Long billableSizeInGBs;

    /**
     * The size of the internal storage for this image that is subject to billing (1 GB =
     * 1,073,741,824 bytes).
     *
     * <p>Example: {@code 100}
     *
     * @return the value
     */
    public Long getBillableSizeInGBs() {
        return billableSizeInGBs;
    }

    /**
     * The date and time the image was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the image was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("Image(");
        sb.append("super=").append(super.toString());
        sb.append("baseImageId=").append(String.valueOf(this.baseImageId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", createImageAllowed=").append(String.valueOf(this.createImageAllowed));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", launchMode=").append(String.valueOf(this.launchMode));
        sb.append(", launchOptions=").append(String.valueOf(this.launchOptions));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", operatingSystem=").append(String.valueOf(this.operatingSystem));
        sb.append(", operatingSystemVersion=").append(String.valueOf(this.operatingSystemVersion));
        sb.append(", agentFeatures=").append(String.valueOf(this.agentFeatures));
        sb.append(", listingType=").append(String.valueOf(this.listingType));
        sb.append(", sizeInMBs=").append(String.valueOf(this.sizeInMBs));
        sb.append(", billableSizeInGBs=").append(String.valueOf(this.billableSizeInGBs));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Image)) {
            return false;
        }

        Image other = (Image) o;
        return java.util.Objects.equals(this.baseImageId, other.baseImageId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.createImageAllowed, other.createImageAllowed)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.launchMode, other.launchMode)
                && java.util.Objects.equals(this.launchOptions, other.launchOptions)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.operatingSystem, other.operatingSystem)
                && java.util.Objects.equals(
                        this.operatingSystemVersion, other.operatingSystemVersion)
                && java.util.Objects.equals(this.agentFeatures, other.agentFeatures)
                && java.util.Objects.equals(this.listingType, other.listingType)
                && java.util.Objects.equals(this.sizeInMBs, other.sizeInMBs)
                && java.util.Objects.equals(this.billableSizeInGBs, other.billableSizeInGBs)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.baseImageId == null ? 43 : this.baseImageId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.createImageAllowed == null
                                ? 43
                                : this.createImageAllowed.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.launchMode == null ? 43 : this.launchMode.hashCode());
        result =
                (result * PRIME)
                        + (this.launchOptions == null ? 43 : this.launchOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystem == null ? 43 : this.operatingSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystemVersion == null
                                ? 43
                                : this.operatingSystemVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.agentFeatures == null ? 43 : this.agentFeatures.hashCode());
        result = (result * PRIME) + (this.listingType == null ? 43 : this.listingType.hashCode());
        result = (result * PRIME) + (this.sizeInMBs == null ? 43 : this.sizeInMBs.hashCode());
        result =
                (result * PRIME)
                        + (this.billableSizeInGBs == null ? 43 : this.billableSizeInGBs.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
