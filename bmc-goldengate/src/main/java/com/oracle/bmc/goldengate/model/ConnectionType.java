/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The connection type.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public enum ConnectionType {
    Goldengate("GOLDENGATE"),
    Kafka("KAFKA"),
    KafkaSchemaRegistry("KAFKA_SCHEMA_REGISTRY"),
    Mysql("MYSQL"),
    JavaMessageService("JAVA_MESSAGE_SERVICE"),
    MicrosoftSqlserver("MICROSOFT_SQLSERVER"),
    OciObjectStorage("OCI_OBJECT_STORAGE"),
    Oracle("ORACLE"),
    AzureDataLakeStorage("AZURE_DATA_LAKE_STORAGE"),
    Postgresql("POSTGRESQL"),
    AzureSynapseAnalytics("AZURE_SYNAPSE_ANALYTICS"),
    Snowflake("SNOWFLAKE"),
    AmazonS3("AMAZON_S3"),
    Hdfs("HDFS"),
    OracleNosql("ORACLE_NOSQL"),
    Mongodb("MONGODB"),
    AmazonKinesis("AMAZON_KINESIS"),
    AmazonRedshift("AMAZON_REDSHIFT"),
    Db2("DB2"),
    Redis("REDIS"),
    Elasticsearch("ELASTICSEARCH"),
    Generic("GENERIC"),
    GoogleCloudStorage("GOOGLE_CLOUD_STORAGE"),
    GoogleBigquery("GOOGLE_BIGQUERY"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ConnectionType.class);

    private final String value;
    private static java.util.Map<String, ConnectionType> map;

    static {
        map = new java.util.HashMap<>();
        for (ConnectionType v : ConnectionType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ConnectionType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ConnectionType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ConnectionType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
