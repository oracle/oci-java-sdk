/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Available OCI Regions supported by CIMS. eg: PHX, IAD
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@lombok.extern.slf4j.Slf4j
public enum Region {
    Dev("DEV"),
    Sea("SEA"),
    IntegNext("INTEG_NEXT"),
    IntegStable("INTEG_STABLE"),
    Phx("PHX"),
    Iad("IAD"),
    Fra("FRA"),
    EuFrankfurt1("EU_FRANKFURT_1"),
    Lhr("LHR"),
    Yyz("YYZ"),
    Nrt("NRT"),
    UsLangley1("US_LANGLEY_1"),
    UsLuke1("US_LUKE_1"),
    Icn("ICN"),
    Bom("BOM"),
    Gru("GRU"),
    UsGovAshburn1("US_GOV_ASHBURN_1"),
    UsGovPhoenix1("US_GOV_PHOENIX_1"),
    UsGovChicago1("US_GOV_CHICAGO_1"),
    Syd("SYD"),
    Zrh("ZRH"),
    Jed("JED"),
    Ams("AMS"),
    Kix("KIX"),
    Mel("MEL"),
    Yul("YUL"),
    Hyd("HYD"),
    Yny("YNY"),
    Tiw("TIW"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, Region> map;

    static {
        map = new java.util.HashMap<>();
        for (Region v : Region.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    Region(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static Region create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'Region', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
