/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * Type of the data source KUBERNETES_CLUSTER represents an Kubernetes cluster. PROMETHEUS_EMITTER
 * represents a Prometheus metric collector.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public enum DataSourceTypes implements com.oracle.bmc.http.internal.BmcEnum {
    KubernetesCluster("KUBERNETES_CLUSTER"),
    PrometheusEmitter("PROMETHEUS_EMITTER"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataSourceTypes.class);

    private final String value;
    private static java.util.Map<String, DataSourceTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (DataSourceTypes v : DataSourceTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DataSourceTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DataSourceTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DataSourceTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
