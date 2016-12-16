/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
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
 * A base object for all types of attachments between a storage volume and an instance.
 * For specific details about iSCSI attachments, see
 * {@link IScsiVolumeAttachment}.
 * <p>
 * For general information about Volume Attachments, see
 * [Overview of Block Volume Storage](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/overview.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@NonFinal
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "attachmentType"
)
@JsonSubTypes({@JsonSubTypes.Type(value = IScsiVolumeAttachment.class, name = "iscsi")})
public abstract class VolumeAttachment {

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
     * A user-friendly name. Does not have to be unique, and it cannot be changed.
     * <p>
     * Example: `My volume attachment`
     *
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the volume attachment.
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String id;

    /**
     * The OCID of the instance the volume is attached to.
     **/
    @JsonProperty("instanceId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String instanceId;
    /**
     * The current state of the volume attachment.
     **/
    public enum LifecycleState {
        Attaching("ATTACHING"),
        Attached("ATTACHED"),
        Detaching("DETACHING"),
        Detached("DETACHED"),
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
    /**
     * The current state of the volume attachment.
     **/
    @JsonProperty("lifecycleState")
    @Valid
    @NotNull
    LifecycleState lifecycleState;

    /**
     * The date and time the volume was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    @Valid
    @NotNull
    Date timeCreated;

    /**
     * The OCID of the volume.
     **/
    @JsonProperty("volumeId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String volumeId;
}
