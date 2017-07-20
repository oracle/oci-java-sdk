/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * A boot disk image for launching an instance. For more information, see
 * [Overview of the Compute Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Concepts/computeoverview.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Image.Builder.class)
public class Image {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("baseImageId")
        private String baseImageId;

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("createImageAllowed")
        private Boolean createImageAllowed;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private String operatingSystem;

        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystemVersion")
        private String operatingSystemVersion;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Image build() {
            return new Image(
                    baseImageId,
                    compartmentId,
                    createImageAllowed,
                    displayName,
                    id,
                    lifecycleState,
                    operatingSystem,
                    operatingSystemVersion,
                    timeCreated);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Image o) {
            return baseImageId(o.getBaseImageId())
                    .compartmentId(o.getCompartmentId())
                    .createImageAllowed(o.getCreateImageAllowed())
                    .displayName(o.getDisplayName())
                    .id(o.getId())
                    .lifecycleState(o.getLifecycleState())
                    .operatingSystem(o.getOperatingSystem())
                    .operatingSystemVersion(o.getOperatingSystemVersion())
                    .timeCreated(o.getTimeCreated());
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
    @javax.validation.constraints.Size(min = 1, max = 255)
    String baseImageId;

    /**
     * The OCID of the compartment containing the instance you want to use as the basis for the image.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * Whether instances launched with this image can be used to create new images.
     * For example, you cannot create an image of an Oracle Database instance.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createImageAllowed")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Boolean createImageAllowed;

    /**
     * A user-friendly name for the image. It does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * You cannot use an Oracle-provided image name as a custom image name.
     * <p>
     * Example: `My custom Oracle Linux image`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String id;
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    LifecycleState lifecycleState;

    /**
     * The image's operating system.
     * <p>
     * Example: `Oracle Linux`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String operatingSystem;

    /**
     * The image's operating system version.
     * <p>
     * Example: `7.2`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystemVersion")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String operatingSystemVersion;

    /**
     * The date and time the image was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.Date timeCreated;
}
