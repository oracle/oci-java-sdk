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

        @JsonProperty("id")
        private String id;

        @JsonProperty("imageId")
        private String imageId;

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
                    id,
                    imageId,
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
                    .id(o.getId())
                    .imageId(o.getImageId())
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
     * The current state of the instance.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Running("RUNNING"),
        Starting("STARTING"),
        Stopping("STOPPING"),
        Stopped("STOPPED"),
        CreatingImage("CREATING_IMAGE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
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
