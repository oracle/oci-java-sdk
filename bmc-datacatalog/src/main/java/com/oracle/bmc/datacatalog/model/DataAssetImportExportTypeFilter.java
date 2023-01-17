/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Type of Data Asset import and export as described below.
 * ALL - Includes all supported elements of the data asset enumerated by the other type filters.
 * CUSTOM_PROPERTY_VALUES - Includes custom property values set on the objects within the export scope.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum DataAssetImportExportTypeFilter {
    CustomPropertyValues("CUSTOM_PROPERTY_VALUES"),
    All("ALL"),
    ;

    private final String value;
    private static java.util.Map<String, DataAssetImportExportTypeFilter> map;

    static {
        map = new java.util.HashMap<>();
        for (DataAssetImportExportTypeFilter v : DataAssetImportExportTypeFilter.values()) {
            map.put(v.getValue(), v);
        }
    }

    DataAssetImportExportTypeFilter(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DataAssetImportExportTypeFilter create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid DataAssetImportExportTypeFilter: " + key);
    }
}
