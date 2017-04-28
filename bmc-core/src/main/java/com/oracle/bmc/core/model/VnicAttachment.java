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
 * Represents an attachment between a VNIC and an instance. For more information, see
 * [Overview of the Compute Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Concepts/computeoverview.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = VnicAttachment.Builder.class)
public class VnicAttachment {
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

        @JsonProperty("id")
        private String id;

        @JsonProperty("instanceId")
        private String instanceId;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("subnetId")
        private String subnetId;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        @JsonProperty("vnicId")
        private String vnicId;

        public VnicAttachment build() {
            return new VnicAttachment(
                    availabilityDomain,
                    compartmentId,
                    displayName,
                    id,
                    instanceId,
                    lifecycleState,
                    subnetId,
                    timeCreated,
                    vnicId);
        }

        @JsonIgnore
        public Builder copy(VnicAttachment o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .id(o.getId())
                    .instanceId(o.getInstanceId())
                    .lifecycleState(o.getLifecycleState())
                    .subnetId(o.getSubnetId())
                    .timeCreated(o.getTimeCreated())
                    .vnicId(o.getVnicId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The Availability Domain of an instance.
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
     * The OCID of the compartment.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the VNIC attachment.
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String id;

    /**
     * The OCID of the instance.
     **/
    @JsonProperty("instanceId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String instanceId;
    /**
     * The current state of the VNIC attachment.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Attaching("ATTACHING"),
        Attached("ATTACHED"),
        Detaching("DETACHING"),
        Detached("DETACHED"),

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
     * The current state of the VNIC attachment.
     **/
    @JsonProperty("lifecycleState")
    @Valid
    @NotNull
    LifecycleState lifecycleState;

    /**
     * The OCID of the subnet of the VNIC.
     **/
    @JsonProperty("subnetId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String subnetId;

    /**
     * The date and time the VNIC attachment was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    @Valid
    @NotNull
    Date timeCreated;

    /**
     * The OCID of the VNIC.
     **/
    @JsonProperty("vnicId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String vnicId;
}
