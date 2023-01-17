/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for the database upgrade source.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "source",
    defaultImpl = DatabaseUpgradeSourceBase.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DatabaseUpgradeWithDbHomeDetails.class,
        name = "DB_HOME"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DatabaseUpgradeWithDatabaseSoftwareImageDetails.class,
        name = "DB_SOFTWARE_IMAGE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DatabaseUpgradeWithDbVersionDetails.class,
        name = "DB_VERSION"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DatabaseUpgradeSourceBase extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"options"})
    protected DatabaseUpgradeSourceBase(String options) {
        super();
        this.options = options;
    }

    /**
     * Additional upgrade options supported by DBUA(Database Upgrade Assistant).
     * Example: "-upgradeTimezone false -keepEvents"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final String options;

    /**
     * Additional upgrade options supported by DBUA(Database Upgrade Assistant).
     * Example: "-upgradeTimezone false -keepEvents"
     *
     * @return the value
     **/
    public String getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatabaseUpgradeSourceBase(");
        sb.append("super=").append(super.toString());
        sb.append("options=").append(String.valueOf(this.options));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseUpgradeSourceBase)) {
            return false;
        }

        DatabaseUpgradeSourceBase other = (DatabaseUpgradeSourceBase) o;
        return java.util.Objects.equals(this.options, other.options) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The source of the Oracle Database software to be used for the upgrade.
     *  - Use {@code DB_HOME} to specify an existing Database Home to upgrade the database. The database is moved to the target Database Home and makes use of the Oracle Database software version of the target Database Home.
     *  - Use {@code DB_VERSION} to specify a generally-available Oracle Database software version to upgrade the database.
     *  - Use {@code DB_SOFTWARE_IMAGE} to specify a [database software image](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/databasesoftwareimage.htm) to upgrade the database.
     *
     **/
    public enum Source {
        DbHome("DB_HOME"),
        DbVersion("DB_VERSION"),
        DbSoftwareImage("DB_SOFTWARE_IMAGE"),
        ;

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                map.put(v.getValue(), v);
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Source: " + key);
        }
    };
}
