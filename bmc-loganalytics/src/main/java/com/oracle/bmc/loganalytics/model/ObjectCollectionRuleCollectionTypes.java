/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The type of Object Collection Rule that needs to be performed with the rule being created. LIVE :
 * Using this type will prompt the process to collect all the logs that gets uploaded to the object
 * store bucket from the time the rule gets registered HISTORIC: This specifies that it is a one off
 * collection request from one time (pollSince) to a second time period (pollTill). In this
 * colletion the pollTill >pollSince HISTORIC_LIVE: This specifies that the collection of objects
 * from the object store bucket needs to be started from a specific time stamp (pollSince) and
 * should collect all the objects that ever gets into this bucket till this rule is configured and
 * active.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public enum ObjectCollectionRuleCollectionTypes implements com.oracle.bmc.http.internal.BmcEnum {
    Live("LIVE"),
    Historic("HISTORIC"),
    HistoricLive("HISTORIC_LIVE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ObjectCollectionRuleCollectionTypes.class);

    private final String value;
    private static java.util.Map<String, ObjectCollectionRuleCollectionTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (ObjectCollectionRuleCollectionTypes v : ObjectCollectionRuleCollectionTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ObjectCollectionRuleCollectionTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ObjectCollectionRuleCollectionTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ObjectCollectionRuleCollectionTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
