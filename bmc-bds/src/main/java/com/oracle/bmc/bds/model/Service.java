/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/** The type of service. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public enum Service implements com.oracle.bmc.http.internal.BmcEnum {
    Zookeeper("ZOOKEEPER"),
    Ams("AMS"),
    Hdfs("HDFS"),
    Yarn("YARN"),
    Mapreduce("MAPREDUCE"),
    Oozie("OOZIE"),
    Hbase("HBASE"),
    Spark("SPARK"),
    Hive("HIVE"),
    Kafka("KAFKA"),
    Flink("FLINK"),
    Registry("REGISTRY"),
    ;

    private final String value;
    private static java.util.Map<String, Service> map;

    static {
        map = new java.util.HashMap<>();
        for (Service v : Service.values()) {
            map.put(v.getValue(), v);
        }
    }

    Service(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static Service create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid Service: " + key);
    }
}
