/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * The payload version defines the expected structure of the payloads sent and received by the
 * Webhook channel.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public enum WebhookPayloadVersion implements com.oracle.bmc.http.internal.BmcEnum {
    _10("1.0"),
    _11("1.1"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(WebhookPayloadVersion.class);

    private final String value;
    private static java.util.Map<String, WebhookPayloadVersion> map;

    static {
        map = new java.util.HashMap<>();
        for (WebhookPayloadVersion v : WebhookPayloadVersion.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    WebhookPayloadVersion(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static WebhookPayloadVersion create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'WebhookPayloadVersion', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
