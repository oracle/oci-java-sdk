/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/** This Enum is used for specifying listing parameters. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public enum CatalogListingVersionCriteriaEnum implements com.oracle.bmc.http.internal.BmcEnum {
    ListAllVersions("LIST_ALL_VERSIONS"),
    ListEarliestVersionOnly("LIST_EARLIEST_VERSION_ONLY"),
    ListLatestVersionOnly("LIST_LATEST_VERSION_ONLY"),
    ;

    private final String value;
    private static java.util.Map<String, CatalogListingVersionCriteriaEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (CatalogListingVersionCriteriaEnum v : CatalogListingVersionCriteriaEnum.values()) {
            map.put(v.getValue(), v);
        }
    }

    CatalogListingVersionCriteriaEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CatalogListingVersionCriteriaEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid CatalogListingVersionCriteriaEnum: " + key);
    }
}
