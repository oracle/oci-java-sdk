/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/** Possible operation types. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public enum OperationTypes implements com.oracle.bmc.http.internal.BmcEnum {
    DeployPlugin("DEPLOY_PLUGIN"),
    UpgradePlugin("UPGRADE_PLUGIN"),
    CreatePlugin("CREATE_PLUGIN"),
    CreateUpgradePlugins("CREATE_UPGRADE_PLUGINS"),
    AgentimageUpgrade("AGENTIMAGE_UPGRADE"),
    CreateDataSource("CREATE_DATA_SOURCE"),
    UpdateDataSource("UPDATE_DATA_SOURCE"),
    DeleteDataSource("DELETE_DATA_SOURCE"),
    CreateNamedcredentials("CREATE_NAMEDCREDENTIALS"),
    UpdateNamedcredentials("UPDATE_NAMEDCREDENTIALS"),
    DeleteNamedcredentials("DELETE_NAMEDCREDENTIALS"),
    AgentUpgrade("AGENT_UPGRADE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperationTypes.class);

    private final String value;
    private static java.util.Map<String, OperationTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (OperationTypes v : OperationTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    OperationTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OperationTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'OperationTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
