/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The resource represents a SQL Firewall allowed SQL in Data Safe. <br>
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
        builder = SqlFirewallAllowedSqlSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlFirewallAllowedSqlSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "sqlFirewallPolicyId",
        "currentUser",
        "dbUserName",
        "sqlText",
        "sqlLevel",
        "sqlAccessedObjects",
        "version",
        "timeCollected",
        "timeUpdated",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public SqlFirewallAllowedSqlSummary(
            String id,
            String compartmentId,
            String displayName,
            String description,
            String sqlFirewallPolicyId,
            String currentUser,
            String dbUserName,
            String sqlText,
            SqlLevel sqlLevel,
            java.util.List<String> sqlAccessedObjects,
            Float version,
            java.util.Date timeCollected,
            java.util.Date timeUpdated,
            SqlFirewallAllowedSqlLifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.sqlFirewallPolicyId = sqlFirewallPolicyId;
        this.currentUser = currentUser;
        this.dbUserName = dbUserName;
        this.sqlText = sqlText;
        this.sqlLevel = sqlLevel;
        this.sqlAccessedObjects = sqlAccessedObjects;
        this.version = version;
        this.timeCollected = timeCollected;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the SQL Firewall allowed SQL. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the SQL Firewall allowed SQL.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment containing the SQL Firewall allowed SQL. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the SQL Firewall allowed SQL.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The display name of the SQL Firewall allowed SQL. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the SQL Firewall allowed SQL.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The description of the SQL Firewall allowed SQL. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the SQL Firewall allowed SQL.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
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
        /** The name of the user that SQL was executed as. */
        @com.fasterxml.jackson.annotation.JsonProperty("currentUser")
        private String currentUser;

        /**
         * The name of the user that SQL was executed as.
         *
         * @param currentUser the value to set
         * @return this builder
         */
        public Builder currentUser(String currentUser) {
            this.currentUser = currentUser;
            this.__explicitlySet__.add("currentUser");
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
        /** The SQL text of the SQL Firewall allowed SQL. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
        private String sqlText;

        /**
         * The SQL text of the SQL Firewall allowed SQL.
         *
         * @param sqlText the value to set
         * @return this builder
         */
        public Builder sqlText(String sqlText) {
            this.sqlText = sqlText;
            this.__explicitlySet__.add("sqlText");
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
        /** The objects accessed by the SQL. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlAccessedObjects")
        private java.util.List<String> sqlAccessedObjects;

        /**
         * The objects accessed by the SQL.
         *
         * @param sqlAccessedObjects the value to set
         * @return this builder
         */
        public Builder sqlAccessedObjects(java.util.List<String> sqlAccessedObjects) {
            this.sqlAccessedObjects = sqlAccessedObjects;
            this.__explicitlySet__.add("sqlAccessedObjects");
            return this;
        }
        /**
         * Version of the associated SQL Firewall policy. This identifies whether the allowed SQLs
         * were added in the same batch or not.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Float version;

        /**
         * Version of the associated SQL Firewall policy. This identifies whether the allowed SQLs
         * were added in the same batch or not.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(Float version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The time the the SQL Firewall allowed SQL was collected from the target database, in the
         * format defined by RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        /**
         * The time the the SQL Firewall allowed SQL was collected from the target database, in the
         * format defined by RFC3339.
         *
         * @param timeCollected the value to set
         * @return this builder
         */
        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /**
         * The last date and time the SQL Firewall allowed SQL was updated, in the format defined by
         * RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last date and time the SQL Firewall allowed SQL was updated, in the format defined by
         * RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
         * "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
         * "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlFirewallAllowedSqlSummary build() {
            SqlFirewallAllowedSqlSummary model =
                    new SqlFirewallAllowedSqlSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.sqlFirewallPolicyId,
                            this.currentUser,
                            this.dbUserName,
                            this.sqlText,
                            this.sqlLevel,
                            this.sqlAccessedObjects,
                            this.version,
                            this.timeCollected,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlFirewallAllowedSqlSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("sqlFirewallPolicyId")) {
                this.sqlFirewallPolicyId(model.getSqlFirewallPolicyId());
            }
            if (model.wasPropertyExplicitlySet("currentUser")) {
                this.currentUser(model.getCurrentUser());
            }
            if (model.wasPropertyExplicitlySet("dbUserName")) {
                this.dbUserName(model.getDbUserName());
            }
            if (model.wasPropertyExplicitlySet("sqlText")) {
                this.sqlText(model.getSqlText());
            }
            if (model.wasPropertyExplicitlySet("sqlLevel")) {
                this.sqlLevel(model.getSqlLevel());
            }
            if (model.wasPropertyExplicitlySet("sqlAccessedObjects")) {
                this.sqlAccessedObjects(model.getSqlAccessedObjects());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** The OCID of the SQL Firewall allowed SQL. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the SQL Firewall allowed SQL.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment containing the SQL Firewall allowed SQL. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the SQL Firewall allowed SQL.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The display name of the SQL Firewall allowed SQL. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the SQL Firewall allowed SQL.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The description of the SQL Firewall allowed SQL. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the SQL Firewall allowed SQL.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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

    /** The name of the user that SQL was executed as. */
    @com.fasterxml.jackson.annotation.JsonProperty("currentUser")
    private final String currentUser;

    /**
     * The name of the user that SQL was executed as.
     *
     * @return the value
     */
    public String getCurrentUser() {
        return currentUser;
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

    /** The SQL text of the SQL Firewall allowed SQL. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
    private final String sqlText;

    /**
     * The SQL text of the SQL Firewall allowed SQL.
     *
     * @return the value
     */
    public String getSqlText() {
        return sqlText;
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

    /** The objects accessed by the SQL. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlAccessedObjects")
    private final java.util.List<String> sqlAccessedObjects;

    /**
     * The objects accessed by the SQL.
     *
     * @return the value
     */
    public java.util.List<String> getSqlAccessedObjects() {
        return sqlAccessedObjects;
    }

    /**
     * Version of the associated SQL Firewall policy. This identifies whether the allowed SQLs were
     * added in the same batch or not.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Float version;

    /**
     * Version of the associated SQL Firewall policy. This identifies whether the allowed SQLs were
     * added in the same batch or not.
     *
     * @return the value
     */
    public Float getVersion() {
        return version;
    }

    /**
     * The time the the SQL Firewall allowed SQL was collected from the target database, in the
     * format defined by RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    private final java.util.Date timeCollected;

    /**
     * The time the the SQL Firewall allowed SQL was collected from the target database, in the
     * format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCollected() {
        return timeCollected;
    }

    /**
     * The last date and time the SQL Firewall allowed SQL was updated, in the format defined by
     * RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last date and time the SQL Firewall allowed SQL was updated, in the format defined by
     * RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
     * "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
     * "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("SqlFirewallAllowedSqlSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", sqlFirewallPolicyId=").append(String.valueOf(this.sqlFirewallPolicyId));
        sb.append(", currentUser=").append(String.valueOf(this.currentUser));
        sb.append(", dbUserName=").append(String.valueOf(this.dbUserName));
        sb.append(", sqlText=").append(String.valueOf(this.sqlText));
        sb.append(", sqlLevel=").append(String.valueOf(this.sqlLevel));
        sb.append(", sqlAccessedObjects=").append(String.valueOf(this.sqlAccessedObjects));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", timeCollected=").append(String.valueOf(this.timeCollected));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlFirewallAllowedSqlSummary)) {
            return false;
        }

        SqlFirewallAllowedSqlSummary other = (SqlFirewallAllowedSqlSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.sqlFirewallPolicyId, other.sqlFirewallPolicyId)
                && java.util.Objects.equals(this.currentUser, other.currentUser)
                && java.util.Objects.equals(this.dbUserName, other.dbUserName)
                && java.util.Objects.equals(this.sqlText, other.sqlText)
                && java.util.Objects.equals(this.sqlLevel, other.sqlLevel)
                && java.util.Objects.equals(this.sqlAccessedObjects, other.sqlAccessedObjects)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.timeCollected, other.timeCollected)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlFirewallPolicyId == null
                                ? 43
                                : this.sqlFirewallPolicyId.hashCode());
        result = (result * PRIME) + (this.currentUser == null ? 43 : this.currentUser.hashCode());
        result = (result * PRIME) + (this.dbUserName == null ? 43 : this.dbUserName.hashCode());
        result = (result * PRIME) + (this.sqlText == null ? 43 : this.sqlText.hashCode());
        result = (result * PRIME) + (this.sqlLevel == null ? 43 : this.sqlLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlAccessedObjects == null
                                ? 43
                                : this.sqlAccessedObjects.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCollected == null ? 43 : this.timeCollected.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
