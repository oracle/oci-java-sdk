/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * The Letter of Authority for the cross-connect. You must submit this letter when
 * requesting cabling for the cross-connect at the FastConnect location.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LetterOfAuthority.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class LetterOfAuthority {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("circuitType")
        private CircuitType circuitType;

        public Builder circuitType(CircuitType circuitType) {
            this.circuitType = circuitType;
            this.__explicitlySet__.add("circuitType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectId")
        private String crossConnectId;

        public Builder crossConnectId(String crossConnectId) {
            this.crossConnectId = crossConnectId;
            this.__explicitlySet__.add("crossConnectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("facilityLocation")
        private String facilityLocation;

        public Builder facilityLocation(String facilityLocation) {
            this.facilityLocation = facilityLocation;
            this.__explicitlySet__.add("facilityLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("portName")
        private String portName;

        public Builder portName(String portName) {
            this.portName = portName;
            this.__explicitlySet__.add("portName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeIssued")
        private java.util.Date timeIssued;

        public Builder timeIssued(java.util.Date timeIssued) {
            this.timeIssued = timeIssued;
            this.__explicitlySet__.add("timeIssued");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LetterOfAuthority build() {
            LetterOfAuthority __instance__ =
                    new LetterOfAuthority(
                            circuitType,
                            crossConnectId,
                            facilityLocation,
                            portName,
                            timeExpires,
                            timeIssued);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LetterOfAuthority o) {
            Builder copiedBuilder =
                    circuitType(o.getCircuitType())
                            .crossConnectId(o.getCrossConnectId())
                            .facilityLocation(o.getFacilityLocation())
                            .portName(o.getPortName())
                            .timeExpires(o.getTimeExpires())
                            .timeIssued(o.getTimeIssued());

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
     * The type of cross-connect fiber, termination, and optical specification.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum CircuitType {
        SingleModeLc("Single_mode_LC"),
        SingleModeSc("Single_mode_SC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, CircuitType> map;

        static {
            map = new java.util.HashMap<>();
            for (CircuitType v : CircuitType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CircuitType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CircuitType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CircuitType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of cross-connect fiber, termination, and optical specification.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("circuitType")
    CircuitType circuitType;

    /**
     * The OCID of the cross-connect.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectId")
    String crossConnectId;

    /**
     * The address of the FastConnect location.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("facilityLocation")
    String facilityLocation;

    /**
     * The meet-me room port for this cross-connect.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portName")
    String portName;

    /**
     * The date and time when the Letter of Authority expires, in the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    java.util.Date timeExpires;

    /**
     * The date and time the Letter of Authority was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeIssued")
    java.util.Date timeIssued;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
