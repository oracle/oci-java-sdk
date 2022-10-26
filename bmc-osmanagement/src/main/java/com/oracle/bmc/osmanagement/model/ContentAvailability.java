/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Content Availability Status: * NOT_AVAILABLE - content is not available on the instance nor in
 * the service * AVAILABLE_ON_INSTANCE - content is only available on the instance *
 * AVAILABLE_ON_SERVICE - content is only available on the service *
 * AVAILABLE_ON_INSTANCE_AND_SERVICE - content is available both on the instance and the service *
 * AVAILABLE_ON_INSTANCE_UPLOAD_IN_PROGRESS - content is available on the instance and its upload is
 * in progress
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public enum ContentAvailability implements com.oracle.bmc.http.internal.BmcEnum {
    NotAvailable("NOT_AVAILABLE"),
    AvailableOnInstance("AVAILABLE_ON_INSTANCE"),
    AvailableOnService("AVAILABLE_ON_SERVICE"),
    AvailableOnInstanceAndService("AVAILABLE_ON_INSTANCE_AND_SERVICE"),
    AvailableOnInstanceUploadInProgress("AVAILABLE_ON_INSTANCE_UPLOAD_IN_PROGRESS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ContentAvailability.class);

    private final String value;
    private static java.util.Map<String, ContentAvailability> map;

    static {
        map = new java.util.HashMap<>();
        for (ContentAvailability v : ContentAvailability.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ContentAvailability(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ContentAvailability create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ContentAvailability', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
