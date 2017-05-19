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
 * The Letter of Authority for the cross-connect. You must submit this letter when
 * requesting cabling for the cross-connect at the FastConnect location.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = LetterOfAuthority.Builder.class)
public class LetterOfAuthority {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("circuitType")
        private CircuitType circuitType;

        @JsonProperty("crossConnectId")
        private String crossConnectId;

        @JsonProperty("facilityLocation")
        private String facilityLocation;

        @JsonProperty("portName")
        private String portName;

        @JsonProperty("timeExpires")
        private Date timeExpires;

        @JsonProperty("timeIssued")
        private Date timeIssued;

        public LetterOfAuthority build() {
            return new LetterOfAuthority(
                    circuitType,
                    crossConnectId,
                    facilityLocation,
                    portName,
                    timeExpires,
                    timeIssued);
        }

        @JsonIgnore
        public Builder copy(LetterOfAuthority o) {
            return circuitType(o.getCircuitType())
                    .crossConnectId(o.getCrossConnectId())
                    .facilityLocation(o.getFacilityLocation())
                    .portName(o.getPortName())
                    .timeExpires(o.getTimeExpires())
                    .timeIssued(o.getTimeIssued());
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
        private static Map<String, CircuitType> map;

        static {
            map = new HashMap<>();
            for (CircuitType v : CircuitType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CircuitType(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
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
    @JsonProperty("circuitType")
    CircuitType circuitType;

    /**
     * The OCID of the cross-connect.
     **/
    @JsonProperty("crossConnectId")
    @Size(min = 1)
    String crossConnectId;

    /**
     * The address of the FastConnect location.
     **/
    @JsonProperty("facilityLocation")
    @Size(min = 1)
    String facilityLocation;

    /**
     * The meet-me room port for this cross-connect.
     **/
    @JsonProperty("portName")
    @Size(min = 1, max = 255)
    String portName;

    /**
     * The date and time when the Letter of Authority expires, in the format defined by RFC3339.
     *
     **/
    @JsonProperty("timeExpires")
    Date timeExpires;

    /**
     * The date and time the Letter of Authority was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeIssued")
    Date timeIssued;
}
