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
 * Specific connection details for an IPSec tunnel.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = TunnelStatus.Builder.class)
public class TunnelStatus {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("ipAddress")
        private String ipAddress;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        @JsonProperty("timeStateModified")
        private Date timeStateModified;

        public TunnelStatus build() {
            return new TunnelStatus(ipAddress, lifecycleState, timeCreated, timeStateModified);
        }

        @JsonIgnore
        public Builder copy(TunnelStatus o) {
            return ipAddress(o.getIpAddress())
                    .lifecycleState(o.getLifecycleState())
                    .timeCreated(o.getTimeCreated())
                    .timeStateModified(o.getTimeStateModified());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The IP address of Oracle's VPN headend.
     * <p>
     * Example: `129.146.17.50`
     *
     **/
    @JsonProperty("ipAddress")
    @Valid
    @NotNull
    @Size(min = 1, max = 46)
    String ipAddress;
    /**
     * The tunnel's current state.
     **/
    public enum LifecycleState {
        Up("UP"),
        Down("DOWN"),
        DownForMaintenance("DOWN_FOR_MAINTENANCE"),
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
     * The tunnel's current state.
     **/
    @JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The date and time the IPSec connection was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    Date timeCreated;

    /**
     * When the state of the tunnel last changed, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeStateModified")
    Date timeStateModified;
}
