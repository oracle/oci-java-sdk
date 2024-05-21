/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The resource represents the SQL violations collected from the target database by Oracle Data Safe.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlFirewallViolationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlFirewallViolationSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "dbUserName",
        "targetId",
        "targetName",
        "operationTime",
        "timeCollected",
        "clientOsUserName",
        "operation",
        "sqlText",
        "sqlAccessedObjects",
        "currentDbUserName",
        "sqlLevel",
        "clientIp",
        "clientProgram",
        "violationCause",
        "violationAction"
    })
    public SqlFirewallViolationSummary(
            String id,
            String compartmentId,
            String dbUserName,
            String targetId,
            String targetName,
            java.util.Date operationTime,
            java.util.Date timeCollected,
            String clientOsUserName,
            String operation,
            String sqlText,
            String sqlAccessedObjects,
            String currentDbUserName,
            SqlLevel sqlLevel,
            String clientIp,
            String clientProgram,
            String violationCause,
            ViolationAction violationAction) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.dbUserName = dbUserName;
        this.targetId = targetId;
        this.targetName = targetName;
        this.operationTime = operationTime;
        this.timeCollected = timeCollected;
        this.clientOsUserName = clientOsUserName;
        this.operation = operation;
        this.sqlText = sqlText;
        this.sqlAccessedObjects = sqlAccessedObjects;
        this.currentDbUserName = currentDbUserName;
        this.sqlLevel = sqlLevel;
        this.clientIp = clientIp;
        this.clientProgram = clientProgram;
        this.violationCause = violationCause;
        this.violationAction = violationAction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the SQL violation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the SQL violation.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment containing the SQL violation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the SQL violation.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The name of the database user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
        private String dbUserName;

        /**
         * The name of the database user.
         * @param dbUserName the value to set
         * @return this builder
         **/
        public Builder dbUserName(String dbUserName) {
            this.dbUserName = dbUserName;
            this.__explicitlySet__.add("dbUserName");
            return this;
        }
        /**
         * The OCID of the target database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database.
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * The name of the target database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetName")
        private String targetName;

        /**
         * The name of the target database.
         * @param targetName the value to set
         * @return this builder
         **/
        public Builder targetName(String targetName) {
            this.targetName = targetName;
            this.__explicitlySet__.add("targetName");
            return this;
        }
        /**
         * The time of the SQL violation occurrence in the target database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationTime")
        private java.util.Date operationTime;

        /**
         * The time of the SQL violation occurrence in the target database.
         * @param operationTime the value to set
         * @return this builder
         **/
        public Builder operationTime(java.util.Date operationTime) {
            this.operationTime = operationTime;
            this.__explicitlySet__.add("operationTime");
            return this;
        }
        /**
         * The timestamp when this SQL violation was collected from the target database by Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        /**
         * The timestamp when this SQL violation was collected from the target database by Data Safe.
         * @param timeCollected the value to set
         * @return this builder
         **/
        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /**
         * The name of the operating system user for the database session.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientOsUserName")
        private String clientOsUserName;

        /**
         * The name of the operating system user for the database session.
         * @param clientOsUserName the value to set
         * @return this builder
         **/
        public Builder clientOsUserName(String clientOsUserName) {
            this.clientOsUserName = clientOsUserName;
            this.__explicitlySet__.add("clientOsUserName");
            return this;
        }
        /**
         * The name of the action executed by the user on the target database. For example, ALTER, CREATE, DROP.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private String operation;

        /**
         * The name of the action executed by the user on the target database. For example, ALTER, CREATE, DROP.
         * @param operation the value to set
         * @return this builder
         **/
        public Builder operation(String operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }
        /**
         * The SQL text caught by the firewall.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
        private String sqlText;

        /**
         * The SQL text caught by the firewall.
         * @param sqlText the value to set
         * @return this builder
         **/
        public Builder sqlText(String sqlText) {
            this.sqlText = sqlText;
            this.__explicitlySet__.add("sqlText");
            return this;
        }
        /**
         * The objects accessed by the SQL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlAccessedObjects")
        private String sqlAccessedObjects;

        /**
         * The objects accessed by the SQL.
         * @param sqlAccessedObjects the value to set
         * @return this builder
         **/
        public Builder sqlAccessedObjects(String sqlAccessedObjects) {
            this.sqlAccessedObjects = sqlAccessedObjects;
            this.__explicitlySet__.add("sqlAccessedObjects");
            return this;
        }
        /**
         * The name of the user that SQL was executed as.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentDbUserName")
        private String currentDbUserName;

        /**
         * The name of the user that SQL was executed as.
         * @param currentDbUserName the value to set
         * @return this builder
         **/
        public Builder currentDbUserName(String currentDbUserName) {
            this.currentDbUserName = currentDbUserName;
            this.__explicitlySet__.add("currentDbUserName");
            return this;
        }
        /**
         * Specifies the level of SQL for this violation.
         * USER_ISSUED_SQL - User issued SQL statements only.
         * ALL_SQL - Includes all SQL statements including SQL statement issued inside PL/SQL units.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlLevel")
        private SqlLevel sqlLevel;

        /**
         * Specifies the level of SQL for this violation.
         * USER_ISSUED_SQL - User issued SQL statements only.
         * ALL_SQL - Includes all SQL statements including SQL statement issued inside PL/SQL units.
         *
         * @param sqlLevel the value to set
         * @return this builder
         **/
        public Builder sqlLevel(SqlLevel sqlLevel) {
            this.sqlLevel = sqlLevel;
            this.__explicitlySet__.add("sqlLevel");
            return this;
        }
        /**
         * The IP address of the host machine from which the session was generated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientIp")
        private String clientIp;

        /**
         * The IP address of the host machine from which the session was generated.
         * @param clientIp the value to set
         * @return this builder
         **/
        public Builder clientIp(String clientIp) {
            this.clientIp = clientIp;
            this.__explicitlySet__.add("clientIp");
            return this;
        }
        /**
         * The application from which the SQL violation was generated. Examples include SQL Plus or SQL Developer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientProgram")
        private String clientProgram;

        /**
         * The application from which the SQL violation was generated. Examples include SQL Plus or SQL Developer.
         * @param clientProgram the value to set
         * @return this builder
         **/
        public Builder clientProgram(String clientProgram) {
            this.clientProgram = clientProgram;
            this.__explicitlySet__.add("clientProgram");
            return this;
        }
        /**
         * Indicates whether SQL or context violation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("violationCause")
        private String violationCause;

        /**
         * Indicates whether SQL or context violation.
         * @param violationCause the value to set
         * @return this builder
         **/
        public Builder violationCause(String violationCause) {
            this.violationCause = violationCause;
            this.__explicitlySet__.add("violationCause");
            return this;
        }
        /**
         * The action taken for this SQL violation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("violationAction")
        private ViolationAction violationAction;

        /**
         * The action taken for this SQL violation.
         * @param violationAction the value to set
         * @return this builder
         **/
        public Builder violationAction(ViolationAction violationAction) {
            this.violationAction = violationAction;
            this.__explicitlySet__.add("violationAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlFirewallViolationSummary build() {
            SqlFirewallViolationSummary model =
                    new SqlFirewallViolationSummary(
                            this.id,
                            this.compartmentId,
                            this.dbUserName,
                            this.targetId,
                            this.targetName,
                            this.operationTime,
                            this.timeCollected,
                            this.clientOsUserName,
                            this.operation,
                            this.sqlText,
                            this.sqlAccessedObjects,
                            this.currentDbUserName,
                            this.sqlLevel,
                            this.clientIp,
                            this.clientProgram,
                            this.violationCause,
                            this.violationAction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlFirewallViolationSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dbUserName")) {
                this.dbUserName(model.getDbUserName());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("targetName")) {
                this.targetName(model.getTargetName());
            }
            if (model.wasPropertyExplicitlySet("operationTime")) {
                this.operationTime(model.getOperationTime());
            }
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("clientOsUserName")) {
                this.clientOsUserName(model.getClientOsUserName());
            }
            if (model.wasPropertyExplicitlySet("operation")) {
                this.operation(model.getOperation());
            }
            if (model.wasPropertyExplicitlySet("sqlText")) {
                this.sqlText(model.getSqlText());
            }
            if (model.wasPropertyExplicitlySet("sqlAccessedObjects")) {
                this.sqlAccessedObjects(model.getSqlAccessedObjects());
            }
            if (model.wasPropertyExplicitlySet("currentDbUserName")) {
                this.currentDbUserName(model.getCurrentDbUserName());
            }
            if (model.wasPropertyExplicitlySet("sqlLevel")) {
                this.sqlLevel(model.getSqlLevel());
            }
            if (model.wasPropertyExplicitlySet("clientIp")) {
                this.clientIp(model.getClientIp());
            }
            if (model.wasPropertyExplicitlySet("clientProgram")) {
                this.clientProgram(model.getClientProgram());
            }
            if (model.wasPropertyExplicitlySet("violationCause")) {
                this.violationCause(model.getViolationCause());
            }
            if (model.wasPropertyExplicitlySet("violationAction")) {
                this.violationAction(model.getViolationAction());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the SQL violation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the SQL violation.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment containing the SQL violation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the SQL violation.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the database user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
    private final String dbUserName;

    /**
     * The name of the database user.
     * @return the value
     **/
    public String getDbUserName() {
        return dbUserName;
    }

    /**
     * The OCID of the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database.
     * @return the value
     **/
    public String getTargetId() {
        return targetId;
    }

    /**
     * The name of the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetName")
    private final String targetName;

    /**
     * The name of the target database.
     * @return the value
     **/
    public String getTargetName() {
        return targetName;
    }

    /**
     * The time of the SQL violation occurrence in the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationTime")
    private final java.util.Date operationTime;

    /**
     * The time of the SQL violation occurrence in the target database.
     * @return the value
     **/
    public java.util.Date getOperationTime() {
        return operationTime;
    }

    /**
     * The timestamp when this SQL violation was collected from the target database by Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    private final java.util.Date timeCollected;

    /**
     * The timestamp when this SQL violation was collected from the target database by Data Safe.
     * @return the value
     **/
    public java.util.Date getTimeCollected() {
        return timeCollected;
    }

    /**
     * The name of the operating system user for the database session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientOsUserName")
    private final String clientOsUserName;

    /**
     * The name of the operating system user for the database session.
     * @return the value
     **/
    public String getClientOsUserName() {
        return clientOsUserName;
    }

    /**
     * The name of the action executed by the user on the target database. For example, ALTER, CREATE, DROP.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final String operation;

    /**
     * The name of the action executed by the user on the target database. For example, ALTER, CREATE, DROP.
     * @return the value
     **/
    public String getOperation() {
        return operation;
    }

    /**
     * The SQL text caught by the firewall.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
    private final String sqlText;

    /**
     * The SQL text caught by the firewall.
     * @return the value
     **/
    public String getSqlText() {
        return sqlText;
    }

    /**
     * The objects accessed by the SQL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlAccessedObjects")
    private final String sqlAccessedObjects;

    /**
     * The objects accessed by the SQL.
     * @return the value
     **/
    public String getSqlAccessedObjects() {
        return sqlAccessedObjects;
    }

    /**
     * The name of the user that SQL was executed as.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentDbUserName")
    private final String currentDbUserName;

    /**
     * The name of the user that SQL was executed as.
     * @return the value
     **/
    public String getCurrentDbUserName() {
        return currentDbUserName;
    }

    /**
     * Specifies the level of SQL for this violation.
     * USER_ISSUED_SQL - User issued SQL statements only.
     * ALL_SQL - Includes all SQL statements including SQL statement issued inside PL/SQL units.
     *
     **/
    public enum SqlLevel {
        UserIssuedSql("USER_ISSUED_SQL"),
        AllSql("ALL_SQL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * Specifies the level of SQL for this violation.
     * USER_ISSUED_SQL - User issued SQL statements only.
     * ALL_SQL - Includes all SQL statements including SQL statement issued inside PL/SQL units.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlLevel")
    private final SqlLevel sqlLevel;

    /**
     * Specifies the level of SQL for this violation.
     * USER_ISSUED_SQL - User issued SQL statements only.
     * ALL_SQL - Includes all SQL statements including SQL statement issued inside PL/SQL units.
     *
     * @return the value
     **/
    public SqlLevel getSqlLevel() {
        return sqlLevel;
    }

    /**
     * The IP address of the host machine from which the session was generated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientIp")
    private final String clientIp;

    /**
     * The IP address of the host machine from which the session was generated.
     * @return the value
     **/
    public String getClientIp() {
        return clientIp;
    }

    /**
     * The application from which the SQL violation was generated. Examples include SQL Plus or SQL Developer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientProgram")
    private final String clientProgram;

    /**
     * The application from which the SQL violation was generated. Examples include SQL Plus or SQL Developer.
     * @return the value
     **/
    public String getClientProgram() {
        return clientProgram;
    }

    /**
     * Indicates whether SQL or context violation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("violationCause")
    private final String violationCause;

    /**
     * Indicates whether SQL or context violation.
     * @return the value
     **/
    public String getViolationCause() {
        return violationCause;
    }

    /**
     * The action taken for this SQL violation.
     **/
    public enum ViolationAction {
        Blocked("BLOCKED"),
        Allowed("ALLOWED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ViolationAction.class);

        private final String value;
        private static java.util.Map<String, ViolationAction> map;

        static {
            map = new java.util.HashMap<>();
            for (ViolationAction v : ViolationAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ViolationAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ViolationAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ViolationAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The action taken for this SQL violation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("violationAction")
    private final ViolationAction violationAction;

    /**
     * The action taken for this SQL violation.
     * @return the value
     **/
    public ViolationAction getViolationAction() {
        return violationAction;
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
        sb.append("SqlFirewallViolationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dbUserName=").append(String.valueOf(this.dbUserName));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetName=").append(String.valueOf(this.targetName));
        sb.append(", operationTime=").append(String.valueOf(this.operationTime));
        sb.append(", timeCollected=").append(String.valueOf(this.timeCollected));
        sb.append(", clientOsUserName=").append(String.valueOf(this.clientOsUserName));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(", sqlText=").append(String.valueOf(this.sqlText));
        sb.append(", sqlAccessedObjects=").append(String.valueOf(this.sqlAccessedObjects));
        sb.append(", currentDbUserName=").append(String.valueOf(this.currentDbUserName));
        sb.append(", sqlLevel=").append(String.valueOf(this.sqlLevel));
        sb.append(", clientIp=").append(String.valueOf(this.clientIp));
        sb.append(", clientProgram=").append(String.valueOf(this.clientProgram));
        sb.append(", violationCause=").append(String.valueOf(this.violationCause));
        sb.append(", violationAction=").append(String.valueOf(this.violationAction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlFirewallViolationSummary)) {
            return false;
        }

        SqlFirewallViolationSummary other = (SqlFirewallViolationSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dbUserName, other.dbUserName)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetName, other.targetName)
                && java.util.Objects.equals(this.operationTime, other.operationTime)
                && java.util.Objects.equals(this.timeCollected, other.timeCollected)
                && java.util.Objects.equals(this.clientOsUserName, other.clientOsUserName)
                && java.util.Objects.equals(this.operation, other.operation)
                && java.util.Objects.equals(this.sqlText, other.sqlText)
                && java.util.Objects.equals(this.sqlAccessedObjects, other.sqlAccessedObjects)
                && java.util.Objects.equals(this.currentDbUserName, other.currentDbUserName)
                && java.util.Objects.equals(this.sqlLevel, other.sqlLevel)
                && java.util.Objects.equals(this.clientIp, other.clientIp)
                && java.util.Objects.equals(this.clientProgram, other.clientProgram)
                && java.util.Objects.equals(this.violationCause, other.violationCause)
                && java.util.Objects.equals(this.violationAction, other.violationAction)
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
        result = (result * PRIME) + (this.dbUserName == null ? 43 : this.dbUserName.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.targetName == null ? 43 : this.targetName.hashCode());
        result =
                (result * PRIME)
                        + (this.operationTime == null ? 43 : this.operationTime.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCollected == null ? 43 : this.timeCollected.hashCode());
        result =
                (result * PRIME)
                        + (this.clientOsUserName == null ? 43 : this.clientOsUserName.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result = (result * PRIME) + (this.sqlText == null ? 43 : this.sqlText.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlAccessedObjects == null
                                ? 43
                                : this.sqlAccessedObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.currentDbUserName == null ? 43 : this.currentDbUserName.hashCode());
        result = (result * PRIME) + (this.sqlLevel == null ? 43 : this.sqlLevel.hashCode());
        result = (result * PRIME) + (this.clientIp == null ? 43 : this.clientIp.hashCode());
        result =
                (result * PRIME)
                        + (this.clientProgram == null ? 43 : this.clientProgram.hashCode());
        result =
                (result * PRIME)
                        + (this.violationCause == null ? 43 : this.violationCause.hashCode());
        result =
                (result * PRIME)
                        + (this.violationAction == null ? 43 : this.violationAction.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
