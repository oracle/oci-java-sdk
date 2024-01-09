/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/** The language of the document, abbreviated according to ISO 639-2. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DocumentLanguage implements com.oracle.bmc.http.internal.BmcEnum {
    Eng("ENG"),
    Ces("CES"),
    Dan("DAN"),
    Nld("NLD"),
    Fin("FIN"),
    Fra("FRA"),
    Deu("DEU"),
    Ell("ELL"),
    Hun("HUN"),
    Ita("ITA"),
    Nor("NOR"),
    Pol("POL"),
    Por("POR"),
    Ron("RON"),
    Rus("RUS"),
    Slk("SLK"),
    Spa("SPA"),
    Swe("SWE"),
    Tur("TUR"),
    Ara("ARA"),
    ChiSim("CHI_SIM"),
    Hin("HIN"),
    Jpn("JPN"),
    Kor("KOR"),
    Others("OTHERS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DocumentLanguage.class);

    private final String value;
    private static java.util.Map<String, DocumentLanguage> map;

    static {
        map = new java.util.HashMap<>();
        for (DocumentLanguage v : DocumentLanguage.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DocumentLanguage(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DocumentLanguage create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DocumentLanguage', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
