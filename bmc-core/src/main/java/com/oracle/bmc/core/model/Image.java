/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

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
@Value
@JsonDeserialize(builder = Image.Builder.class)
public class Image {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("baseImageId")
        private String baseImageId;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("createImageAllowed")
        private Boolean createImageAllowed;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("id")
        private String id;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("operatingSystem")
        private String operatingSystem;

        @JsonProperty("operatingSystemVersion")
        private String operatingSystemVersion;

        @JsonProperty("timeCreated")
        private Date timeCreated;

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

        @JsonIgnore
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
    @JsonProperty("baseImageId")
    @Size(min = 1, max = 255)
    String baseImageId;

    /**
     * The OCID of the compartment containing the instance you want to use as the basis for the image.
     *
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * Whether instances launched with this image can be used to create new images.
     * For example, you cannot create an image of an Oracle Database instance.
     * <p>
     * Example: `true`
     *
     **/
    @JsonProperty("createImageAllowed")
    @Valid
    @NotNull
    Boolean createImageAllowed;

    /**
     * A user-friendly name for the image. It does not have to be unique, and it's changeable.
     * You cannot use an Oracle-provided image name as a custom image name.
     * <p>
     * Example: `My custom Oracle Linux image`
     *
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the image.
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String id;
    /**
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Disabled("DISABLED"),
        Deleted("DELETED"),
        ;

        private final String value;
        private static Map<String, LifecycleState> map;

        static {
            map = new HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid LifecycleState: " + key);
        }
    };

    @JsonProperty("lifecycleState")
    @Valid
    @NotNull
    LifecycleState lifecycleState;

    /**
     * The image's operating system.
     * <p>
     * Example: `Oracle Linux`
     *
     **/
    @JsonProperty("operatingSystem")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String operatingSystem;

    /**
     * The image's operating system version.
     * <p>
     * Example: `7.2`
     *
     **/
    @JsonProperty("operatingSystemVersion")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String operatingSystemVersion;

    /**
     * The date and time the image was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    @Valid
    @NotNull
    Date timeCreated;
}
