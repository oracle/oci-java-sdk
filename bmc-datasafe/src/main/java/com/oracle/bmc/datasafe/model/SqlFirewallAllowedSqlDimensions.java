/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The dimensions available for SQL Firewall allow SQL analytics. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SqlFirewallAllowedSqlDimensions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlFirewallAllowedSqlDimensions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sqlFirewallPolicyId",
        "sqlLevel",
        "dbUserName",
        "lifecycleState"
    })
    public SqlFirewallAllowedSqlDimensions(
            String sqlFirewallPolicyId,
            SqlLevel sqlLevel,
            String dbUserName,
            SqlFirewallAllowedSqlLifecycleState lifecycleState) {
        super();
        this.sqlFirewallPolicyId = sqlFirewallPolicyId;
        this.sqlLevel = sqlLevel;
        this.dbUserName = dbUserName;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the SQL Firewall policy corresponding to the SQL Firewall allowed SQL. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlFirewallPolicyId")
        private String sqlFirewallPolicyId;

        /**
         * The OCID of the SQL Firewall policy corresponding to the SQL Firewall allowed SQL.
         *
         * @param sqlFirewallPolicyId the value to set
         * @return this builder
         */
        public Builder sqlFirewallPolicyId(String sqlFirewallPolicyId) {
            this.sqlFirewallPolicyId = sqlFirewallPolicyId;
            this.__explicitlySet__.add("sqlFirewallPolicyId");
            return this;
        }
        /**
         * Specifies the level of SQL included for this SQL Firewall policy. USER_ISSUED_SQL - User
         * issued SQL statements only. ALL_SQL - Includes all SQL statements including SQL statement
         * issued inside PL/SQL units.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlLevel")
        private SqlLevel sqlLevel;

        /**
         * Specifies the level of SQL included for this SQL Firewall policy. USER_ISSUED_SQL - User
         * issued SQL statements only. ALL_SQL - Includes all SQL statements including SQL statement
         * issued inside PL/SQL units.
         *
         * @param sqlLevel the value to set
         * @return this builder
         */
        public Builder sqlLevel(SqlLevel sqlLevel) {
            this.sqlLevel = sqlLevel;
            this.__explicitlySet__.add("sqlLevel");
            return this;
        }
        /** The database user name. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
        private String dbUserName;

        /**
         * The database user name.
         *
         * @param dbUserName the value to set
         * @return this builder
         */
        public Builder dbUserName(String dbUserName) {
            this.dbUserName = dbUserName;
            this.__explicitlySet__.add("dbUserName");
            return this;
        }
        /** The current state of the SQL Firewall allowed SQL. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SqlFirewallAllowedSqlLifecycleState lifecycleState;

        /**
         * The current state of the SQL Firewall allowed SQL.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(SqlFirewallAllowedSqlLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlFirewallAllowedSqlDimensions build() {
            SqlFirewallAllowedSqlDimensions model =
                    new SqlFirewallAllowedSqlDimensions(
                            this.sqlFirewallPolicyId,
                            this.sqlLevel,
                            this.dbUserName,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlFirewallAllowedSqlDimensions model) {
            if (model.wasPropertyExplicitlySet("sqlFirewallPolicyId")) {
                this.sqlFirewallPolicyId(model.getSqlFirewallPolicyId());
            }
            if (model.wasPropertyExplicitlySet("sqlLevel")) {
                this.sqlLevel(model.getSqlLevel());
            }
            if (model.wasPropertyExplicitlySet("dbUserName")) {
                this.dbUserName(model.getDbUserName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The OCID of the SQL Firewall policy corresponding to the SQL Firewall allowed SQL. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlFirewallPolicyId")
    private final String sqlFirewallPolicyId;

    /**
     * The OCID of the SQL Firewall policy corresponding to the SQL Firewall allowed SQL.
     *
     * @return the value
     */
    public String getSqlFirewallPolicyId() {
        return sqlFirewallPolicyId;
    }

    /**
     * Specifies the level of SQL included for this SQL Firewall policy. USER_ISSUED_SQL - User
     * issued SQL statements only. ALL_SQL - Includes all SQL statements including SQL statement
     * issued inside PL/SQL units.
     */
    public enum SqlLevel implements com.oracle.bmc.http.internal.BmcEnum {
        UserIssuedSql("USER_ISSUED_SQL"),
        AllSql("ALL_SQL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SqlLevel.class);

        private final String value;
        private static java.util.Map<String, SqlLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (SqlLevel v : SqlLevel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SqlLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SqlLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SqlLevel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the level of SQL included for this SQL Firewall policy. USER_ISSUED_SQL - User
     * issued SQL statements only. ALL_SQL - Includes all SQL statements including SQL statement
     * issued inside PL/SQL units.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlLevel")
    private final SqlLevel sqlLevel;

    /**
     * Specifies the level of SQL included for this SQL Firewall policy. USER_ISSUED_SQL - User
     * issued SQL statements only. ALL_SQL - Includes all SQL statements including SQL statement
     * issued inside PL/SQL units.
     *
     * @return the value
     */
    public SqlLevel getSqlLevel() {
        return sqlLevel;
    }

    /** The database user name. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
    private final String dbUserName;

    /**
     * The database user name.
     *
     * @return the value
     */
    public String getDbUserName() {
        return dbUserName;
    }

    /** The current state of the SQL Firewall allowed SQL. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SqlFirewallAllowedSqlLifecycleState lifecycleState;

    /**
     * The current state of the SQL Firewall allowed SQL.
     *
     * @return the value
     */
    public SqlFirewallAllowedSqlLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlFirewallAllowedSqlDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("sqlFirewallPolicyId=").append(String.valueOf(this.sqlFirewallPolicyId));
        sb.append(", sqlLevel=").append(String.valueOf(this.sqlLevel));
        sb.append(", dbUserName=").append(String.valueOf(this.dbUserName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlFirewallAllowedSqlDimensions)) {
            return false;
        }

        SqlFirewallAllowedSqlDimensions other = (SqlFirewallAllowedSqlDimensions) o;
        return java.util.Objects.equals(this.sqlFirewallPolicyId, other.sqlFirewallPolicyId)
                && java.util.Objects.equals(this.sqlLevel, other.sqlLevel)
                && java.util.Objects.equals(this.dbUserName, other.dbUserName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sqlFirewallPolicyId == null
                                ? 43
                                : this.sqlFirewallPolicyId.hashCode());
        result = (result * PRIME) + (this.sqlLevel == null ? 43 : this.sqlLevel.hashCode());
        result = (result * PRIME) + (this.dbUserName == null ? 43 : this.dbUserName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
