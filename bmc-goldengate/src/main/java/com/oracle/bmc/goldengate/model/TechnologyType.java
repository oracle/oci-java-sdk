/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/** The technology type. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public enum TechnologyType implements com.oracle.bmc.http.internal.BmcEnum {
    Goldengate("GOLDENGATE"),
    Generic("GENERIC"),
    OciAutonomousDatabase("OCI_AUTONOMOUS_DATABASE"),
    OciAutonomousJsonDatabase("OCI_AUTONOMOUS_JSON_DATABASE"),
    OciCacheWithRedis("OCI_CACHE_WITH_REDIS"),
    OciMysql("OCI_MYSQL"),
    OciObjectStorage("OCI_OBJECT_STORAGE"),
    OciPostgresql("OCI_POSTGRESQL"),
    OciStreaming("OCI_STREAMING"),
    OracleDatabase("ORACLE_DATABASE"),
    OracleExadata("ORACLE_EXADATA"),
    OracleExadataDatabaseAtAzure("ORACLE_EXADATA_DATABASE_AT_AZURE"),
    OracleAutonomousDatabaseAtAzure("ORACLE_AUTONOMOUS_DATABASE_AT_AZURE"),
    OracleJsonCollection("ORACLE_JSON_COLLECTION"),
    OracleExadataDatabaseAtGoogleCloud("ORACLE_EXADATA_DATABASE_AT_GOOGLE_CLOUD"),
    OracleAutonomousDatabaseAtGoogleCloud("ORACLE_AUTONOMOUS_DATABASE_AT_GOOGLE_CLOUD"),
    OracleExadataDatabaseAtAws("ORACLE_EXADATA_DATABASE_AT_AWS"),
    OracleAutonomousDatabaseAtAws("ORACLE_AUTONOMOUS_DATABASE_AT_AWS"),
    OracleNosql("ORACLE_NOSQL"),
    OracleWeblogicJms("ORACLE_WEBLOGIC_JMS"),
    AmazonRdsOracle("AMAZON_RDS_ORACLE"),
    AmazonRdsSqlserver("AMAZON_RDS_SQLSERVER"),
    AmazonS3("AMAZON_S3"),
    AmazonAuroraMysql("AMAZON_AURORA_MYSQL"),
    AmazonAuroraPostgresql("AMAZON_AURORA_POSTGRESQL"),
    AmazonDocumentDb("AMAZON_DOCUMENT_DB"),
    AmazonKinesis("AMAZON_KINESIS"),
    AmazonRedshift("AMAZON_REDSHIFT"),
    AmazonRdsMariadb("AMAZON_RDS_MARIADB"),
    AmazonRdsMysql("AMAZON_RDS_MYSQL"),
    AmazonRdsPostgresql("AMAZON_RDS_POSTGRESQL"),
    ApacheKafka("APACHE_KAFKA"),
    AzureCosmosDbForMongodb("AZURE_COSMOS_DB_FOR_MONGODB"),
    AzureCosmosDbForPostgresql("AZURE_COSMOS_DB_FOR_POSTGRESQL"),
    AzureDataLakeStorage("AZURE_DATA_LAKE_STORAGE"),
    AzureEventHubs("AZURE_EVENT_HUBS"),
    AzureMysql("AZURE_MYSQL"),
    AzurePostgresql("AZURE_POSTGRESQL"),
    AzureSqlserverManagedInstance("AZURE_SQLSERVER_MANAGED_INSTANCE"),
    AzureSqlserverNonManagedInstance("AZURE_SQLSERVER_NON_MANAGED_INSTANCE"),
    AzureSynapseAnalytics("AZURE_SYNAPSE_ANALYTICS"),
    ConfluentKafka("CONFLUENT_KAFKA"),
    ConfluentSchemaRegistry("CONFLUENT_SCHEMA_REGISTRY"),
    Databricks("DATABRICKS"),
    Db2Zos("DB2_ZOS"),
    Elasticsearch("ELASTICSEARCH"),
    GoogleAlloyDbForPostgresql("GOOGLE_ALLOY_DB_FOR_POSTGRESQL"),
    GoogleBigquery("GOOGLE_BIGQUERY"),
    GoogleCloudStorage("GOOGLE_CLOUD_STORAGE"),
    GoogleCloudSqlMysql("GOOGLE_CLOUD_SQL_MYSQL"),
    GoogleCloudSqlPostgresql("GOOGLE_CLOUD_SQL_POSTGRESQL"),
    GoogleCloudSqlSqlserver("GOOGLE_CLOUD_SQL_SQLSERVER"),
    GooglePubsub("GOOGLE_PUBSUB"),
    Hdfs("HDFS"),
    Mariadb("MARIADB"),
    MicrosoftSqlserver("MICROSOFT_SQLSERVER"),
    MicrosoftFabricLakehouse("MICROSOFT_FABRIC_LAKEHOUSE"),
    MicrosoftFabricMirror("MICROSOFT_FABRIC_MIRROR"),
    Mongodb("MONGODB"),
    MysqlServer("MYSQL_SERVER"),
    MysqlHeatwaveOnAzure("MYSQL_HEATWAVE_ON_AZURE"),
    MysqlHeatwaveOnAws("MYSQL_HEATWAVE_ON_AWS"),
    PostgresqlServer("POSTGRESQL_SERVER"),
    Redis("REDIS"),
    Singlestoredb("SINGLESTOREDB"),
    SinglestoredbCloud("SINGLESTOREDB_CLOUD"),
    Snowflake("SNOWFLAKE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TechnologyType.class);

    private final String value;
    private static java.util.Map<String, TechnologyType> map;

    static {
        map = new java.util.HashMap<>();
        for (TechnologyType v : TechnologyType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
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
        LOG.warn(
                "Received unknown value '{}' for enum 'TechnologyType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
