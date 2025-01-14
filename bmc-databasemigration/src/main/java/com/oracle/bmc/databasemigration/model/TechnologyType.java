/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * The specific database technology for a type of database connection. Example:
 * OCI_AUTONOMOUS_DATABASE for an ORACLE connection type.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public enum TechnologyType implements com.oracle.bmc.http.internal.BmcEnum {
    OciAutonomousDatabase("OCI_AUTONOMOUS_DATABASE"),
    OciMysql("OCI_MYSQL"),
    OracleDatabase("ORACLE_DATABASE"),
    OracleExadata("ORACLE_EXADATA"),
    AmazonRdsOracle("AMAZON_RDS_ORACLE"),
    AmazonAuroraMysql("AMAZON_AURORA_MYSQL"),
    AmazonRdsMysql("AMAZON_RDS_MYSQL"),
    AzureMysql("AZURE_MYSQL"),
    GoogleCloudSqlMysql("GOOGLE_CLOUD_SQL_MYSQL"),
    MysqlServer("MYSQL_SERVER"),
    ;

    private final String value;
    private static java.util.Map<String, TechnologyType> map;

    static {
        map = new java.util.HashMap<>();
        for (TechnologyType v : TechnologyType.values()) {
            map.put(v.getValue(), v);
        }
    }

    TechnologyType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TechnologyType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid TechnologyType: " + key);
    }
}
