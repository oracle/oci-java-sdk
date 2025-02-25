/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * The list of timezones supported by the Support Management API.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
public enum TimeZone {
    GreenwichMeanTime("GREENWICH_MEAN_TIME"),
    EuropeanCentralTime("EUROPEAN_CENTRAL_TIME"),
    EasternEuropeanTime("EASTERN_EUROPEAN_TIME"),
    EasternAfricanTime("EASTERN_AFRICAN_TIME"),
    MiddleEastTime("MIDDLE_EAST_TIME"),
    NearEastTime("NEAR_EAST_TIME"),
    PakistanLahoreTime("PAKISTAN_LAHORE_TIME"),
    IndiaStandardTime("INDIA_STANDARD_TIME"),
    BangladeshStandardTime("BANGLADESH_STANDARD_TIME"),
    VietnamStandardTime("VIETNAM_STANDARD_TIME"),
    ChinaTaiwanTime("CHINA_TAIWAN_TIME"),
    JapanStandardTime("JAPAN_STANDARD_TIME"),
    AustraliaCentralTime("AUSTRALIA_CENTRAL_TIME"),
    AustraliaEasternTime("AUSTRALIA_EASTERN_TIME"),
    SolomonStandardTime("SOLOMON_STANDARD_TIME"),
    NewZealandStandardTime("NEW_ZEALAND_STANDARD_TIME"),
    MidwayIslandsTime("MIDWAY_ISLANDS_TIME"),
    HawaiiStandardTime("HAWAII_STANDARD_TIME"),
    AlaskaStandardTime("ALASKA_STANDARD_TIME"),
    PacificStandardTime("PACIFIC_STANDARD_TIME"),
    MountainStandardTime("MOUNTAIN_STANDARD_TIME"),
    CentralStandardTime("CENTRAL_STANDARD_TIME"),
    EasternStandardTime("EASTERN_STANDARD_TIME"),
    PuertoRicoAndUsVirginIslandsTime("PUERTO_RICO_AND_US_VIRGIN_ISLANDS_TIME"),
    CanadaNewfoundlandTime("CANADA_NEWFOUNDLAND_TIME"),
    ArgentinaStandardTime("ARGENTINA_STANDARD_TIME"),
    MidAtlanticTime("MID_ATLANTIC_TIME"),
    CentralAfricanTime("CENTRAL_AFRICAN_TIME"),
    ;

    private final String value;
    private static java.util.Map<String, TimeZone> map;

    static {
        map = new java.util.HashMap<>();
        for (TimeZone v : TimeZone.values()) {
            map.put(v.getValue(), v);
        }
    }

    TimeZone(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TimeZone create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid TimeZone: " + key);
    }
}
