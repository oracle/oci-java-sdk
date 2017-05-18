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
 * The status of the cross-connect.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CrossConnectStatus.Builder.class)
public class CrossConnectStatus {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("crossConnectId")
        private String crossConnectId;

        @JsonProperty("interfaceState")
        private InterfaceState interfaceState;

        @JsonProperty("lightLevelIndBm")
        private Float lightLevelIndBm;

        @JsonProperty("lightLevelIndicator")
        private LightLevelIndicator lightLevelIndicator;

        public CrossConnectStatus build() {
            return new CrossConnectStatus(
                    crossConnectId, interfaceState, lightLevelIndBm, lightLevelIndicator);
        }

        @JsonIgnore
        public Builder copy(CrossConnectStatus o) {
            return crossConnectId(o.getCrossConnectId())
                    .interfaceState(o.getInterfaceState())
                    .lightLevelIndBm(o.getLightLevelIndBm())
                    .lightLevelIndicator(o.getLightLevelIndicator());
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
    @JsonProperty("crossConnectId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
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
        private static Map<String, InterfaceState> map;

        static {
            map = new HashMap<>();
            for (InterfaceState v : InterfaceState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InterfaceState(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
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
    @JsonProperty("interfaceState")
    InterfaceState interfaceState;

    /**
     * The light level of the cross-connect (in dBm).
     * <p>
     * Example: `14.0`
     *
     **/
    @JsonProperty("lightLevelIndBm")
    @Min(-50)
    @Max(50)
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
        private static Map<String, LightLevelIndicator> map;

        static {
            map = new HashMap<>();
            for (LightLevelIndicator v : LightLevelIndicator.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LightLevelIndicator(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
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
    @JsonProperty("lightLevelIndicator")
    LightLevelIndicator lightLevelIndicator;
}
