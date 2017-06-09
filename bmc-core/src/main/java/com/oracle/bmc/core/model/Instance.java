/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
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
 * A compute host. The image used to launch the instance determines its operating system and other
 * software. The shape specified during the launch process determines the number of CPUs and memory
 * allocated to the instance. For more information, see
 * [Overview of the Compute Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Concepts/computeoverview.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = Instance.Builder.class)
public class Instance {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("availabilityDomain")
        private String availabilityDomain;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("extendedMetadata")
        private Map<String, Object> extendedMetadata;

        @JsonProperty("id")
        private String id;

        @JsonProperty("imageId")
        private String imageId;

        @JsonProperty("ipxeScript")
        private String ipxeScript;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("metadata")
        private Map<String, String> metadata;

        @JsonProperty("region")
        private String region;

        @JsonProperty("shape")
        private String shape;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        public Instance build() {
            return new Instance(
                    availabilityDomain,
                    compartmentId,
                    displayName,
                    extendedMetadata,
                    id,
                    imageId,
                    ipxeScript,
                    lifecycleState,
                    metadata,
                    region,
                    shape,
                    timeCreated);
        }

        @JsonIgnore
        public Builder copy(Instance o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .extendedMetadata(o.getExtendedMetadata())
                    .id(o.getId())
                    .imageId(o.getImageId())
                    .ipxeScript(o.getIpxeScript())
                    .lifecycleState(o.getLifecycleState())
                    .metadata(o.getMetadata())
                    .region(o.getRegion())
                    .shape(o.getShape())
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
     * The Availability Domain the instance is running in.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @JsonProperty("availabilityDomain")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String availabilityDomain;

    /**
     * The OCID of the compartment that contains the instance.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * <p>
     * Example: `My bare metal instance`
     *
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * Additional metadata key/value pairs that you provide.  They serve a similar purpose and functionality from fields in the 'metadata' object.
     * <p>
     * They are distinguished from 'metadata' fields in that these can be nested JSON objects (whereas 'metadata' fields are string/string maps only).
     * <p>
     * If you don't need nested metadata values, it is strongly advised to avoid using this object and use the Metadata object instead.
     *
     **/
    @JsonProperty("extendedMetadata")
    Map<String, Object> extendedMetadata;

    /**
     * The OCID of the instance.
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String id;

    /**
     * The image used to boot the instance. You can enumerate all available images by calling
     * {@link #listImages(ListImagesRequest) listImages}.
     *
     **/
    @JsonProperty("imageId")
    @Size(min = 1, max = 255)
    String imageId;

    /**
     * When an Oracle Bare Metal Cloud Services or virtual machine
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
     * Oracle Bare Metal Cloud Services, see
     * [Bring Your Own Image](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/References/bringyourownimage.htm).
     * <p>
     * For more information about iPXE, see http://ipxe.org.
     *
     **/
    @JsonProperty("ipxeScript")
    @Size(min = 1, max = 10240)
    String ipxeScript;
    /**
     * The current state of the instance.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
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
        private static Map<String, LifecycleState> map;

        static {
            map = new HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the instance.
     **/
    @JsonProperty("lifecycleState")
    @Valid
    @NotNull
    LifecycleState lifecycleState;

    /**
     * Custom metadata that you provide.
     **/
    @JsonProperty("metadata")
    Map<String, String> metadata;

    /**
     * The region that contains the Availability Domain the instance is running in.
     * <p>
     * Example: `phx`
     *
     **/
    @JsonProperty("region")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String region;

    /**
     * The shape of the instance. The shape determines the number of CPUs and the amount of memory
     * allocated to the instance. You can enumerate all available shapes by calling
     * {@link #listShapes(ListShapesRequest) listShapes}.
     *
     **/
    @JsonProperty("shape")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String shape;

    /**
     * The date and time the instance was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    @Valid
    @NotNull
    Date timeCreated;
}
