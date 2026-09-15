/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/** Oracle database object types used by Data Verification. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public enum OracleDatabaseObjectTypes implements com.oracle.bmc.http.internal.BmcEnum {
    Table("TABLE"),
    Index("INDEX"),
    View("VIEW"),
    Sequence("SEQUENCE"),
    Synonym("SYNONYM"),
    Cluster("CLUSTER"),
    Procedure("PROCEDURE"),
    Function("FUNCTION"),
    Package("PACKAGE"),
    PackageBody("PACKAGE_BODY"),
    Trigger("TRIGGER"),
    User("USER"),
    Role("ROLE"),
    Profile("PROFILE"),
    MaterializedView("MATERIALIZED_VIEW"),
    Type("TYPE"),
    TypeBody("TYPE_BODY"),
    Operator("OPERATOR"),
    Library("LIBRARY"),
    Directory("DIRECTORY"),
    Tablespace("TABLESPACE"),
    DatabaseLink("DATABASE_LINK"),
    Controlfile("CONTROLFILE"),
    Datafile("DATAFILE"),
    RedoLog("REDO_LOG"),
    JavaClass("JAVA_CLASS"),
    JavaSource("JAVA_SOURCE"),
    JavaResource("JAVA_RESOURCE"),
    XmlSchema("XML_SCHEMA"),
    Queue("QUEUE"),
    QueueTable("QUEUE_TABLE"),
    Dimension("DIMENSION"),
    Context("CONTEXT"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OracleDatabaseObjectTypes.class);

    private final String value;
    private static java.util.Map<String, OracleDatabaseObjectTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (OracleDatabaseObjectTypes v : OracleDatabaseObjectTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    OracleDatabaseObjectTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OracleDatabaseObjectTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'OracleDatabaseObjectTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
