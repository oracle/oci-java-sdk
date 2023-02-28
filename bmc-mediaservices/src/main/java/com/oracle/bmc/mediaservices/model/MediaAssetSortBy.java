/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/** The field to sort by. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public enum MediaAssetSortBy implements com.oracle.bmc.http.internal.BmcEnum {
    CompartmentId("compartmentId"),
    Type("type"),
    LifecycleState("lifecycleState"),
    ParentMediaAssetId("parentMediaAssetId"),
    MasterMediaAssetId("masterMediaAssetId"),
    DisplayName("displayName"),
    TimeCreated("timeCreated"),
    TimeUpdated("timeUpdated"),
    ;

    private final String value;
    private static java.util.Map<String, MediaAssetSortBy> map;

    static {
        map = new java.util.HashMap<>();
        for (MediaAssetSortBy v : MediaAssetSortBy.values()) {
            map.put(v.getValue(), v);
        }
    }

    MediaAssetSortBy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MediaAssetSortBy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid MediaAssetSortBy: " + key);
    }
}
