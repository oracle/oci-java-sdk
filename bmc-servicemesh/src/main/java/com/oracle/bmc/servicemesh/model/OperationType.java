/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Possible operation types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
public enum OperationType {
    CreateMesh("CREATE_MESH"),
    UpdateMesh("UPDATE_MESH"),
    DeleteMesh("DELETE_MESH"),
    MoveMesh("MOVE_MESH"),
    CreateAccessPolicy("CREATE_ACCESS_POLICY"),
    UpdateAccessPolicy("UPDATE_ACCESS_POLICY"),
    DeleteAccessPolicy("DELETE_ACCESS_POLICY"),
    MoveAccessPolicy("MOVE_ACCESS_POLICY"),
    CreateVirtualService("CREATE_VIRTUAL_SERVICE"),
    UpdateVirtualService("UPDATE_VIRTUAL_SERVICE"),
    DeleteVirtualService("DELETE_VIRTUAL_SERVICE"),
    MoveVirtualService("MOVE_VIRTUAL_SERVICE"),
    CreateVirtualServiceRouteTable("CREATE_VIRTUAL_SERVICE_ROUTE_TABLE"),
    UpdateVirtualServiceRouteTable("UPDATE_VIRTUAL_SERVICE_ROUTE_TABLE"),
    DeleteVirtualServiceRouteTable("DELETE_VIRTUAL_SERVICE_ROUTE_TABLE"),
    MoveVirtualServiceRouteTable("MOVE_VIRTUAL_SERVICE_ROUTE_TABLE"),
    CreateVirtualDeployment("CREATE_VIRTUAL_DEPLOYMENT"),
    UpdateVirtualDeployment("UPDATE_VIRTUAL_DEPLOYMENT"),
    DeleteVirtualDeployment("DELETE_VIRTUAL_DEPLOYMENT"),
    MoveVirtualDeployment("MOVE_VIRTUAL_DEPLOYMENT"),
    CreateIngressGateway("CREATE_INGRESS_GATEWAY"),
    UpdateIngressGateway("UPDATE_INGRESS_GATEWAY"),
    DeleteIngressGateway("DELETE_INGRESS_GATEWAY"),
    MoveIngressGateway("MOVE_INGRESS_GATEWAY"),
    CreateIngressGatewayRouteTable("CREATE_INGRESS_GATEWAY_ROUTE_TABLE"),
    UpdateIngressGatewayRouteTable("UPDATE_INGRESS_GATEWAY_ROUTE_TABLE"),
    DeleteIngressGatewayRouteTable("DELETE_INGRESS_GATEWAY_ROUTE_TABLE"),
    MoveIngressGatewayRouteTable("MOVE_INGRESS_GATEWAY_ROUTE_TABLE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperationType.class);

    private final String value;
    private static java.util.Map<String, OperationType> map;

    static {
        map = new java.util.HashMap<>();
        for (OperationType v : OperationType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    OperationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OperationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'OperationType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
