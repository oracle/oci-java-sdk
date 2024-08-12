/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Source of the database entity. CRUD operations for Autonomous and MACS managed databases all route through DBaaS.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public enum DatabaseEntitySource {
    EmManagedExternalDatabase("EM_MANAGED_EXTERNAL_DATABASE"),
    PeComanagedDatabase("PE_COMANAGED_DATABASE"),
    MdsMysqlDatabaseSystem("MDS_MYSQL_DATABASE_SYSTEM"),
    ;

    private final String value;
    private static java.util.Map<String, DatabaseEntitySource> map;

    static {
        map = new java.util.HashMap<>();
        for (DatabaseEntitySource v : DatabaseEntitySource.values()) {
            map.put(v.getValue(), v);
        }
    }

    DatabaseEntitySource(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DatabaseEntitySource create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid DatabaseEntitySource: " + key);
    }
}
