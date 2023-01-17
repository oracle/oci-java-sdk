/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.model;

/** Determines how the saved search is displayed in a dashboard. */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
public enum SavedSearchTypes implements com.oracle.bmc.http.internal.BmcEnum {
    SearchShowInDashboard("SEARCH_SHOW_IN_DASHBOARD"),
    SearchDontShowInDashboard("SEARCH_DONT_SHOW_IN_DASHBOARD"),
    WidgetShowInDashboard("WIDGET_SHOW_IN_DASHBOARD"),
    WidgetDontShowInDashboard("WIDGET_DONT_SHOW_IN_DASHBOARD"),
    FilterShowInDashboard("FILTER_SHOW_IN_DASHBOARD"),
    FilterDontShowInDashboard("FILTER_DONT_SHOW_IN_DASHBOARD"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SavedSearchTypes.class);

    private final String value;
    private static java.util.Map<String, SavedSearchTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (SavedSearchTypes v : SavedSearchTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SavedSearchTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SavedSearchTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'SavedSearchTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
