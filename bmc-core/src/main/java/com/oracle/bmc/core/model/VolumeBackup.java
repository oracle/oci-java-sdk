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
 * A point-in-time copy of a volume that can then be used to create a new block volume
 * or recover a block volume. For more information, see
 * [Overview of Cloud Volume Storage](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/overview.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = VolumeBackup.Builder.class)
public class VolumeBackup {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("id")
        private String id;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("sizeInMBs")
        private Long sizeInMBs;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        @JsonProperty("timeRequestReceived")
        private Date timeRequestReceived;

        @JsonProperty("uniqueSizeInMbs")
        private Long uniqueSizeInMbs;

        @JsonProperty("volumeId")
        private String volumeId;

        public VolumeBackup build() {
            return new VolumeBackup(
                    compartmentId,
                    displayName,
                    id,
                    lifecycleState,
                    sizeInMBs,
                    timeCreated,
                    timeRequestReceived,
                    uniqueSizeInMbs,
                    volumeId);
        }

        @JsonIgnore
        public Builder copy(VolumeBackup o) {
            return compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .id(o.getId())
                    .lifecycleState(o.getLifecycleState())
                    .sizeInMBs(o.getSizeInMBs())
                    .timeCreated(o.getTimeCreated())
                    .timeRequestReceived(o.getTimeRequestReceived())
                    .uniqueSizeInMbs(o.getUniqueSizeInMbs())
                    .volumeId(o.getVolumeId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the compartment that contains the volume backup.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name for the volume backup. Does not have to be unique and it's changeable.
     **/
    @JsonProperty("displayName")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the volume backup.
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String id;
    /**
     * The current state of a volume backup.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Faulty("FAULTY"),
        RequestReceived("REQUEST_RECEIVED"),

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
     * The current state of a volume backup.
     **/
    @JsonProperty("lifecycleState")
    @Valid
    @NotNull
    LifecycleState lifecycleState;

    /**
     * The size of the volume, in MBs.
     *
     **/
    @JsonProperty("sizeInMBs")
    @Min(100)
    @Max(262144)
    Long sizeInMBs;

    /**
     * The date and time the volume backup was created. This is the time the actual point-in-time image
     * of the volume data was taken. Format defined by RFC3339.
     *
     **/
    @JsonProperty("timeCreated")
    @Valid
    @NotNull
    Date timeCreated;

    /**
     * The date and time the request to create the volume backup was received. Format defined by RFC3339.
     *
     **/
    @JsonProperty("timeRequestReceived")
    Date timeRequestReceived;

    /**
     * The size used by the backup, in MBs. It is typically smaller than sizeInMBs, depending on the space
     * consumed on the volume and whether the backup is full or incremental.
     *
     **/
    @JsonProperty("uniqueSizeInMbs")
    @Min(100)
    @Max(262144)
    Long uniqueSizeInMbs;

    /**
     * The OCID of the volume.
     **/
    @JsonProperty("volumeId")
    @Size(min = 1, max = 255)
    String volumeId;
}
