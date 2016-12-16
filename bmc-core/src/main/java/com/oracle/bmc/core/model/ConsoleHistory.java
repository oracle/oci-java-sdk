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
@JsonDeserialize(builder = ConsoleHistory.Builder.class)
public class ConsoleHistory {
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

        @JsonProperty("timeCreated")
        private Date timeCreated;

        public ConsoleHistory build() {
            return new ConsoleHistory(
                    availabilityDomain,
                    compartmentId,
                    displayName,
                    id,
                    instanceId,
                    lifecycleState,
                    timeCreated);
        }

        @JsonIgnore
        public Builder copy(ConsoleHistory o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .id(o.getId())
                    .instanceId(o.getInstanceId())
                    .lifecycleState(o.getLifecycleState())
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
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * <p>
     * Example: `My console history metadata`
     *
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the console history metadata object.
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String id;

    /**
     * The OCID of the instance this console history was fetched from.
     **/
    @JsonProperty("instanceId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String instanceId;
    /**
     * The current state of the console history.
     **/
    public enum LifecycleState {
        Requested("REQUESTED"),
        GettingHistory("GETTING-HISTORY"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
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
     * The current state of the console history.
     **/
    @JsonProperty("lifecycleState")
    @Valid
    @NotNull
    LifecycleState lifecycleState;

    /**
     * The date and time the history was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    @Valid
    @NotNull
    Date timeCreated;
}
