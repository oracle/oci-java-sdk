/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * The set of supported Channel types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public enum ChannelType {
    Android("ANDROID"),
    Appevent("APPEVENT"),
    Application("APPLICATION"),
    Cortana("CORTANA"),
    Facebook("FACEBOOK"),
    Ios("IOS"),
    Msteams("MSTEAMS"),
    Oss("OSS"),
    Osvc("OSVC"),
    Servicecloud("SERVICECLOUD"),
    Slack("SLACK"),
    Test("TEST"),
    Twilio("TWILIO"),
    Web("WEB"),
    Webhook("WEBHOOK"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ChannelType.class);

    private final String value;
    private static java.util.Map<String, ChannelType> map;

    static {
        map = new java.util.HashMap<>();
        for (ChannelType v : ChannelType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ChannelType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ChannelType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ChannelType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
