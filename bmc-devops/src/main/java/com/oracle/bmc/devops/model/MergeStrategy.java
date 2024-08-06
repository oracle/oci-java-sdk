/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/** Merge strategies which can be enabled or disabled for a repository or project. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public enum MergeStrategy implements com.oracle.bmc.http.internal.BmcEnum {
    MergeCommit("MERGE_COMMIT"),
    FastForward("FAST_FORWARD"),
    FastForwardOnly("FAST_FORWARD_ONLY"),
    RebaseAndMerge("REBASE_AND_MERGE"),
    RebaseAndFastForward("REBASE_AND_FAST_FORWARD"),
    Squash("SQUASH"),
    SquashFastForwardOnly("SQUASH_FAST_FORWARD_ONLY"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MergeStrategy.class);

    private final String value;
    private static java.util.Map<String, MergeStrategy> map;

    static {
        map = new java.util.HashMap<>();
        for (MergeStrategy v : MergeStrategy.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    MergeStrategy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MergeStrategy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'MergeStrategy', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
