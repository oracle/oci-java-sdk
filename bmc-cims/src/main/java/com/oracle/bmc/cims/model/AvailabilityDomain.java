/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * The list of availability domains supported by the Support Management API.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@lombok.extern.slf4j.Slf4j
public enum AvailabilityDomain {
    Dev1("DEV_1"),
    Dev2("DEV_2"),
    Dev3("DEV_3"),
    IntegNext1("INTEG_NEXT_1"),
    IntegStable1("INTEG_STABLE_1"),
    SeaAd1("SEA_AD_1"),
    SeaAd2("SEA_AD_2"),
    SeaAd3("SEA_AD_3"),
    PhxAd1("PHX_AD_1"),
    PhxAd2("PHX_AD_2"),
    PhxAd3("PHX_AD_3"),
    UsAshburnAd1("US_ASHBURN_AD_1"),
    UsAshburnAd2("US_ASHBURN_AD_2"),
    UsAshburnAd3("US_ASHBURN_AD_3"),
    UsAshburnAd4("US_ASHBURN_AD_4"),
    EuFrankfurt1Ad1("EU_FRANKFURT_1_AD_1"),
    EuFrankfurt1Ad2("EU_FRANKFURT_1_AD_2"),
    EuFrankfurt1Ad3("EU_FRANKFURT_1_AD_3"),
    UkLondon1Ad1("UK_LONDON_1_AD_1"),
    UkLondon1Ad2("UK_LONDON_1_AD_2"),
    UkLondon1Ad3("UK_LONDON_1_AD_3"),
    CaToronto1Ad1("CA_TORONTO_1_AD_1"),
    ApTokyo1Ad1("AP_TOKYO_1_AD_1"),
    ApSeoul1Ad1("AP_SEOUL_1_AD_1"),
    ApMumbai1Ad1("AP_MUMBAI_1_AD_1"),
    SaSaopaulo1Ad1("SA_SAOPAULO_1_AD_1"),
    MeJeddah1Ad1("ME_JEDDAH_1_AD_1"),
    ApOsaka1Ad1("AP_OSAKA_1_AD_1"),
    ApSydney1Ad1("AP_SYDNEY_1_AD_1"),
    EuZurich1Ad1("EU_ZURICH_1_AD_1"),
    EuAmsterdam1Ad1("EU_AMSTERDAM_1_AD_1"),
    ApMelbourne1Ad1("AP_MELBOURNE_1_AD_1"),
    CaMontreal1Ad1("CA_MONTREAL_1_AD_1"),
    ApHyderabad1Ad1("AP_HYDERABAD_1_AD_1"),
    ApChuncheon1Ad1("AP_CHUNCHEON_1_AD_1"),
    NoAd("NO_AD"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, AvailabilityDomain> map;

    static {
        map = new java.util.HashMap<>();
        for (AvailabilityDomain v : AvailabilityDomain.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AvailabilityDomain(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AvailabilityDomain create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AvailabilityDomain', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
