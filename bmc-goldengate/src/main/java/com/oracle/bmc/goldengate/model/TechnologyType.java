/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/** The technology type. */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public enum TechnologyType implements com.oracle.bmc.http.internal.BmcEnum {
    Goldengate("GOLDENGATE"),
    OciAutonomousDatabase("OCI_AUTONOMOUS_DATABASE"),
    OciMysql("OCI_MYSQL"),
    OciObjectStorage("OCI_OBJECT_STORAGE"),
    OciStreaming("OCI_STREAMING"),
    OracleDatabase("ORACLE_DATABASE"),
    OracleExadata("ORACLE_EXADATA"),
    AmazonRdsOracle("AMAZON_RDS_ORACLE"),
    AmazonAuroraMysql("AMAZON_AURORA_MYSQL"),
    AmazonAuroraPostgresql("AMAZON_AURORA_POSTGRESQL"),
    AmazonRdsMariadb("AMAZON_RDS_MARIADB"),
    AmazonRdsMysql("AMAZON_RDS_MYSQL"),
    AmazonRdsPostgresql("AMAZON_RDS_POSTGRESQL"),
    ApacheKafka("APACHE_KAFKA"),
    AzureDataLakeStorage("AZURE_DATA_LAKE_STORAGE"),
    AzureEventHubs("AZURE_EVENT_HUBS"),
    AzureMysql("AZURE_MYSQL"),
    AzurePostgresql("AZURE_POSTGRESQL"),
    AzureSynapseAnalytics("AZURE_SYNAPSE_ANALYTICS"),
    ConfluentKafka("CONFLUENT_KAFKA"),
    ConfluentSchemaRegistry("CONFLUENT_SCHEMA_REGISTRY"),
    GoogleCloudSqlMysql("GOOGLE_CLOUD_SQL_MYSQL"),
    GoogleCloudSqlPostgresql("GOOGLE_CLOUD_SQL_POSTGRESQL"),
    Mariadb("MARIADB"),
    MysqlServer("MYSQL_SERVER"),
    PostgresqlServer("POSTGRESQL_SERVER"),
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
