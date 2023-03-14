/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The types of work request operations.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
public enum WorkRequestOperationType {
    ClusterCreate("CLUSTER_CREATE"),
    ClusterUpdate("CLUSTER_UPDATE"),
    ClusterDelete("CLUSTER_DELETE"),
    NodepoolCreate("NODEPOOL_CREATE"),
    NodepoolUpdate("NODEPOOL_UPDATE"),
    NodepoolDelete("NODEPOOL_DELETE"),
    NodepoolReconcile("NODEPOOL_RECONCILE"),
    WorkrequestCancel("WORKREQUEST_CANCEL"),
    VirtualnodepoolCreate("VIRTUALNODEPOOL_CREATE"),
    VirtualnodepoolUpdate("VIRTUALNODEPOOL_UPDATE"),
    VirtualnodepoolDelete("VIRTUALNODEPOOL_DELETE"),
    VirtualnodeDelete("VIRTUALNODE_DELETE"),
    EnableAddon("ENABLE_ADDON"),
    UpdateAddon("UPDATE_ADDON"),
    DisableAddon("DISABLE_ADDON"),
    ReconcileAddon("RECONCILE_ADDON"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(WorkRequestOperationType.class);

    private final String value;
    private static java.util.Map<String, WorkRequestOperationType> map;

    static {
        map = new java.util.HashMap<>();
        for (WorkRequestOperationType v : WorkRequestOperationType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    WorkRequestOperationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static WorkRequestOperationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'WorkRequestOperationType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
