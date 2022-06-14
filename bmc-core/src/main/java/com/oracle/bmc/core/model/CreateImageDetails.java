/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Either instanceId or imageSourceDetails must be provided in addition to other required parameters.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateImageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateImageDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "imageSourceDetails",
        "instanceId",
        "launchMode"
    })
    public CreateImageDetails(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            ImageSourceDetails imageSourceDetails,
            String instanceId,
            LaunchMode launchMode) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.imageSourceDetails = imageSourceDetails;
        this.instanceId = instanceId;
        this.launchMode = launchMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment you want the image to be created in.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment you want the image to be created in.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * A user-friendly name for the image. It does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * You cannot use a platform image name as a custom image name.
         * <p>
         * Example: {@code My Oracle Linux image}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the image. It does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * You cannot use a platform image name as a custom image name.
         * <p>
         * Example: {@code My Oracle Linux image}
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
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
        /**
         * The OCID of the instance you want to use as the basis for the image.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * The OCID of the instance you want to use as the basis for the image.
         *
         * @param instanceId the value to set
         * @return this builder
         **/
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * Specifies the configuration mode for launching virtual machine (VM) instances. The configuration modes are:
         * * {@code NATIVE} - VM instances launch with paravirtualized boot and VFIO devices. The default value for platform images.
         * * {@code EMULATED} - VM instances launch with emulated devices, such as the E1000 network driver and emulated SCSI disk controller.
         * * {@code PARAVIRTUALIZED} - VM instances launch with paravirtualized devices using VirtIO drivers.
         * * {@code CUSTOM} - VM instances launch with custom configuration settings specified in the {@code LaunchOptions} parameter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("launchMode")
        private LaunchMode launchMode;

        /**
         * Specifies the configuration mode for launching virtual machine (VM) instances. The configuration modes are:
         * * {@code NATIVE} - VM instances launch with paravirtualized boot and VFIO devices. The default value for platform images.
         * * {@code EMULATED} - VM instances launch with emulated devices, such as the E1000 network driver and emulated SCSI disk controller.
         * * {@code PARAVIRTUALIZED} - VM instances launch with paravirtualized devices using VirtIO drivers.
         * * {@code CUSTOM} - VM instances launch with custom configuration settings specified in the {@code LaunchOptions} parameter.
         *
         * @param launchMode the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the compartment you want the image to be created in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment you want the image to be created in.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name for the image. It does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * You cannot use a platform image name as a custom image name.
     * <p>
     * Example: {@code My Oracle Linux image}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the image. It does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * You cannot use a platform image name as a custom image name.
     * <p>
     * Example: {@code My Oracle Linux image}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("imageSourceDetails")
    private final ImageSourceDetails imageSourceDetails;

    public ImageSourceDetails getImageSourceDetails() {
        return imageSourceDetails;
    }

    /**
     * The OCID of the instance you want to use as the basis for the image.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * The OCID of the instance you want to use as the basis for the image.
     *
     * @return the value
     **/
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Specifies the configuration mode for launching virtual machine (VM) instances. The configuration modes are:
     * * {@code NATIVE} - VM instances launch with paravirtualized boot and VFIO devices. The default value for platform images.
     * * {@code EMULATED} - VM instances launch with emulated devices, such as the E1000 network driver and emulated SCSI disk controller.
     * * {@code PARAVIRTUALIZED} - VM instances launch with paravirtualized devices using VirtIO drivers.
     * * {@code CUSTOM} - VM instances launch with custom configuration settings specified in the {@code LaunchOptions} parameter.
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
            throw new IllegalArgumentException("Invalid LaunchMode: " + key);
        }
    };
    /**
     * Specifies the configuration mode for launching virtual machine (VM) instances. The configuration modes are:
     * * {@code NATIVE} - VM instances launch with paravirtualized boot and VFIO devices. The default value for platform images.
     * * {@code EMULATED} - VM instances launch with emulated devices, such as the E1000 network driver and emulated SCSI disk controller.
     * * {@code PARAVIRTUALIZED} - VM instances launch with paravirtualized devices using VirtIO drivers.
     * * {@code CUSTOM} - VM instances launch with custom configuration settings specified in the {@code LaunchOptions} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("launchMode")
    private final LaunchMode launchMode;

    /**
     * Specifies the configuration mode for launching virtual machine (VM) instances. The configuration modes are:
     * * {@code NATIVE} - VM instances launch with paravirtualized boot and VFIO devices. The default value for platform images.
     * * {@code EMULATED} - VM instances launch with emulated devices, such as the E1000 network driver and emulated SCSI disk controller.
     * * {@code PARAVIRTUALIZED} - VM instances launch with paravirtualized devices using VirtIO drivers.
     * * {@code CUSTOM} - VM instances launch with custom configuration settings specified in the {@code LaunchOptions} parameter.
     *
     * @return the value
     **/
    public LaunchMode getLaunchMode() {
        return launchMode;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateImageDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", imageSourceDetails=").append(String.valueOf(this.imageSourceDetails));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", launchMode=").append(String.valueOf(this.launchMode));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateImageDetails)) {
            return false;
        }

        CreateImageDetails other = (CreateImageDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.imageSourceDetails, other.imageSourceDetails)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.launchMode, other.launchMode)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.imageSourceDetails == null
                                ? 43
                                : this.imageSourceDetails.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.launchMode == null ? 43 : this.launchMode.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
