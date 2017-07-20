/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Specific connection details for an IPSec tunnel.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TunnelStatus.Builder.class)
public class TunnelStatus {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        @com.fasterxml.jackson.annotation.JsonProperty("timeStateModified")
        private java.util.Date timeStateModified;

        public TunnelStatus build() {
            return new TunnelStatus(ipAddress, lifecycleState, timeCreated, timeStateModified);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 46)
    String ipAddress;
    /**
     * The tunnel's current state.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Up("UP"),
        Down("DOWN"),
        DownForMaintenance("DOWN_FOR_MAINTENANCE"),

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
    /**
     * The tunnel's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The date and time the IPSec connection was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * When the state of the tunnel last changed, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStateModified")
    java.util.Date timeStateModified;
}
