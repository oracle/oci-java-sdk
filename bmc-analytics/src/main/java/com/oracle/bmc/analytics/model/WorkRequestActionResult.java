/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/** The way in which a resource was affected by a work request. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public enum WorkRequestActionResult implements com.oracle.bmc.http.internal.BmcEnum {
    CompartmentChanged("COMPARTMENT_CHANGED"),
    Created("CREATED"),
    Deleted("DELETED"),
    Started("STARTED"),
    Stopped("STOPPED"),
    Scaled("SCALED"),
    NetworkEndpointChanged("NETWORK_ENDPOINT_CHANGED"),
    VanityUrlCreated("VANITY_URL_CREATED"),
    VanityUrlUpdated("VANITY_URL_UPDATED"),
    VanityUrlDeleted("VANITY_URL_DELETED"),
    PrivateAccessChannelCreated("PRIVATE_ACCESS_CHANNEL_CREATED"),
    PrivateAccessChannelUpdated("PRIVATE_ACCESS_CHANNEL_UPDATED"),
    PrivateAccessChannelDeleted("PRIVATE_ACCESS_CHANNEL_DELETED"),
    None("NONE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(WorkRequestActionResult.class);

    private final String value;
    private static java.util.Map<String, WorkRequestActionResult> map;

    static {
        map = new java.util.HashMap<>();
        for (WorkRequestActionResult v : WorkRequestActionResult.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    WorkRequestActionResult(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static WorkRequestActionResult create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'WorkRequestActionResult', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
