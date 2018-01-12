/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * The status of the cross-connect.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CrossConnectStatus.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CrossConnectStatus {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectId")
        private String crossConnectId;

        public Builder crossConnectId(String crossConnectId) {
            this.crossConnectId = crossConnectId;
            this.__explicitlySet__.add("crossConnectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("interfaceState")
        private InterfaceState interfaceState;

        public Builder interfaceState(InterfaceState interfaceState) {
            this.interfaceState = interfaceState;
            this.__explicitlySet__.add("interfaceState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lightLevelIndBm")
        private Float lightLevelIndBm;

        public Builder lightLevelIndBm(Float lightLevelIndBm) {
            this.lightLevelIndBm = lightLevelIndBm;
            this.__explicitlySet__.add("lightLevelIndBm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lightLevelIndicator")
        private LightLevelIndicator lightLevelIndicator;

        public Builder lightLevelIndicator(LightLevelIndicator lightLevelIndicator) {
            this.lightLevelIndicator = lightLevelIndicator;
            this.__explicitlySet__.add("lightLevelIndicator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CrossConnectStatus build() {
            CrossConnectStatus __instance__ =
                    new CrossConnectStatus(
                            crossConnectId, interfaceState, lightLevelIndBm, lightLevelIndicator);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrossConnectStatus o) {
            Builder copiedBuilder =
                    crossConnectId(o.getCrossConnectId())
                            .interfaceState(o.getInterfaceState())
                            .lightLevelIndBm(o.getLightLevelIndBm())
                            .lightLevelIndicator(o.getLightLevelIndicator());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the cross-connect.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectId")
    String crossConnectId;
    /**
     * Whether Oracle's side of the interface is up or down.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum InterfaceState {
        Up("UP"),
        Down("DOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, InterfaceState> map;

        static {
            map = new java.util.HashMap<>();
            for (InterfaceState v : InterfaceState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InterfaceState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InterfaceState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InterfaceState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Whether Oracle's side of the interface is up or down.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("interfaceState")
    InterfaceState interfaceState;

    /**
     * The light level of the cross-connect (in dBm).
     * <p>
     * Example: `14.0`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lightLevelIndBm")
    Float lightLevelIndBm;
    /**
     * Status indicator corresponding to the light level.
     * <p>
     * **NO_LIGHT:** No measurable light
     * <p>
     * **LOW_WARN:** There's measurable light but it's too low
     * <p>
     * **HIGH_WARN:** Light level is too high
     * <p>
     * **BAD:** There's measurable light but the signal-to-noise ratio is bad
     * <p>
     * **GOOD:** Good light level
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LightLevelIndicator {
        NoLight("NO_LIGHT"),
        LowWarn("LOW_WARN"),
        HighWarn("HIGH_WARN"),
        Bad("BAD"),
        Good("GOOD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LightLevelIndicator> map;

        static {
            map = new java.util.HashMap<>();
            for (LightLevelIndicator v : LightLevelIndicator.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LightLevelIndicator(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LightLevelIndicator create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LightLevelIndicator', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status indicator corresponding to the light level.
     * <p>
     * **NO_LIGHT:** No measurable light
     * <p>
     * **LOW_WARN:** There's measurable light but it's too low
     * <p>
     * **HIGH_WARN:** Light level is too high
     * <p>
     * **BAD:** There's measurable light but the signal-to-noise ratio is bad
     * <p>
     * **GOOD:** Good light level
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lightLevelIndicator")
    LightLevelIndicator lightLevelIndicator;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
