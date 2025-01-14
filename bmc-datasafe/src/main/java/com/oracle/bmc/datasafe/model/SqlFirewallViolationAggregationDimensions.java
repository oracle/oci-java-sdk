/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details of the aggregation dimensions used for summarizing SQL violations. <br>
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
        builder = SqlFirewallViolationAggregationDimensions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlFirewallViolationAggregationDimensions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationTime",
        "dbUserName",
        "targetId",
        "targetName",
        "clientProgram",
        "operation",
        "clientOsUserName",
        "violationCause",
        "clientIp",
        "violationAction",
        "sqlLevel"
    })
    public SqlFirewallViolationAggregationDimensions(
            java.util.List<java.util.Date> operationTime,
            java.util.List<String> dbUserName,
            java.util.List<String> targetId,
            java.util.List<String> targetName,
            java.util.List<String> clientProgram,
            java.util.List<String> operation,
            java.util.List<String> clientOsUserName,
            java.util.List<String> violationCause,
            java.util.List<String> clientIp,
            java.util.List<String> violationAction,
            java.util.List<SqlLevel> sqlLevel) {
        super();
        this.operationTime = operationTime;
        this.dbUserName = dbUserName;
        this.targetId = targetId;
        this.targetName = targetName;
        this.clientProgram = clientProgram;
        this.operation = operation;
        this.clientOsUserName = clientOsUserName;
        this.violationCause = violationCause;
        this.clientIp = clientIp;
        this.violationAction = violationAction;
        this.sqlLevel = sqlLevel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The time of the SQL violation occurrence in the target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationTime")
        private java.util.List<java.util.Date> operationTime;

        /**
         * The time of the SQL violation occurrence in the target database.
         *
         * @param operationTime the value to set
         * @return this builder
         */
        public Builder operationTime(java.util.List<java.util.Date> operationTime) {
            this.operationTime = operationTime;
            this.__explicitlySet__.add("operationTime");
            return this;
        }
        /** The name of the database user. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
        private java.util.List<String> dbUserName;

        /**
         * The name of the database user.
         *
         * @param dbUserName the value to set
         * @return this builder
         */
        public Builder dbUserName(java.util.List<String> dbUserName) {
            this.dbUserName = dbUserName;
            this.__explicitlySet__.add("dbUserName");
            return this;
        }
        /** The OCID of the target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private java.util.List<String> targetId;

        /**
         * The OCID of the target database.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(java.util.List<String> targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The name of the target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetName")
        private java.util.List<String> targetName;

        /**
         * The name of the target database.
         *
         * @param targetName the value to set
         * @return this builder
         */
        public Builder targetName(java.util.List<String> targetName) {
            this.targetName = targetName;
            this.__explicitlySet__.add("targetName");
            return this;
        }
        /**
         * The application from which the SQL violation was generated. Examples SQL Plus or SQL
         * Developer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientProgram")
        private java.util.List<String> clientProgram;

        /**
         * The application from which the SQL violation was generated. Examples SQL Plus or SQL
         * Developer.
         *
         * @param clientProgram the value to set
         * @return this builder
         */
        public Builder clientProgram(java.util.List<String> clientProgram) {
            this.clientProgram = clientProgram;
            this.__explicitlySet__.add("clientProgram");
            return this;
        }
        /**
         * The name of the action executed by the user on the target database, for example, ALTER,
         * CREATE, DROP.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private java.util.List<String> operation;

        /**
         * The name of the action executed by the user on the target database, for example, ALTER,
         * CREATE, DROP.
         *
         * @param operation the value to set
         * @return this builder
         */
        public Builder operation(java.util.List<String> operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }
        /** The name of the operating system user for the database session. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientOsUserName")
        private java.util.List<String> clientOsUserName;

        /**
         * The name of the operating system user for the database session.
         *
         * @param clientOsUserName the value to set
         * @return this builder
         */
        public Builder clientOsUserName(java.util.List<String> clientOsUserName) {
            this.clientOsUserName = clientOsUserName;
            this.__explicitlySet__.add("clientOsUserName");
            return this;
        }
        /** Indicates whether SQL or context violation. */
        @com.fasterxml.jackson.annotation.JsonProperty("violationCause")
        private java.util.List<String> violationCause;

        /**
         * Indicates whether SQL or context violation.
         *
         * @param violationCause the value to set
         * @return this builder
         */
        public Builder violationCause(java.util.List<String> violationCause) {
            this.violationCause = violationCause;
            this.__explicitlySet__.add("violationCause");
            return this;
        }
        /** The IP address of the host from which the session was spawned. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientIp")
        private java.util.List<String> clientIp;

        /**
         * The IP address of the host from which the session was spawned.
         *
         * @param clientIp the value to set
         * @return this builder
         */
        public Builder clientIp(java.util.List<String> clientIp) {
            this.clientIp = clientIp;
            this.__explicitlySet__.add("clientIp");
            return this;
        }
        /** The action taken for this SQL violation. */
        @com.fasterxml.jackson.annotation.JsonProperty("violationAction")
        private java.util.List<String> violationAction;

        /**
         * The action taken for this SQL violation.
         *
         * @param violationAction the value to set
         * @return this builder
         */
        public Builder violationAction(java.util.List<String> violationAction) {
            this.violationAction = violationAction;
            this.__explicitlySet__.add("violationAction");
            return this;
        }
        /**
         * Specifies the level of SQL included for this SQL Firewall policy. USER_ISSUED_SQL - User
         * issued SQL statements only. ALL_SQL - Includes all SQL statements including SQL statement
         * issued inside PL/SQL units.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlLevel")
        private java.util.List<SqlLevel> sqlLevel;

        /**
         * Specifies the level of SQL included for this SQL Firewall policy. USER_ISSUED_SQL - User
         * issued SQL statements only. ALL_SQL - Includes all SQL statements including SQL statement
         * issued inside PL/SQL units.
         *
         * @param sqlLevel the value to set
         * @return this builder
         */
        public Builder sqlLevel(java.util.List<SqlLevel> sqlLevel) {
            this.sqlLevel = sqlLevel;
            this.__explicitlySet__.add("sqlLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlFirewallViolationAggregationDimensions build() {
            SqlFirewallViolationAggregationDimensions model =
                    new SqlFirewallViolationAggregationDimensions(
                            this.operationTime,
                            this.dbUserName,
                            this.targetId,
                            this.targetName,
                            this.clientProgram,
                            this.operation,
                            this.clientOsUserName,
                            this.violationCause,
                            this.clientIp,
                            this.violationAction,
                            this.sqlLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlFirewallViolationAggregationDimensions model) {
            if (model.wasPropertyExplicitlySet("operationTime")) {
                this.operationTime(model.getOperationTime());
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
            if (model.wasPropertyExplicitlySet("clientProgram")) {
                this.clientProgram(model.getClientProgram());
            }
            if (model.wasPropertyExplicitlySet("operation")) {
                this.operation(model.getOperation());
            }
            if (model.wasPropertyExplicitlySet("clientOsUserName")) {
                this.clientOsUserName(model.getClientOsUserName());
            }
            if (model.wasPropertyExplicitlySet("violationCause")) {
                this.violationCause(model.getViolationCause());
            }
            if (model.wasPropertyExplicitlySet("clientIp")) {
                this.clientIp(model.getClientIp());
            }
            if (model.wasPropertyExplicitlySet("violationAction")) {
                this.violationAction(model.getViolationAction());
            }
            if (model.wasPropertyExplicitlySet("sqlLevel")) {
                this.sqlLevel(model.getSqlLevel());
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

    /** The time of the SQL violation occurrence in the target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationTime")
    private final java.util.List<java.util.Date> operationTime;

    /**
     * The time of the SQL violation occurrence in the target database.
     *
     * @return the value
     */
    public java.util.List<java.util.Date> getOperationTime() {
        return operationTime;
    }

    /** The name of the database user. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
    private final java.util.List<String> dbUserName;

    /**
     * The name of the database user.
     *
     * @return the value
     */
    public java.util.List<String> getDbUserName() {
        return dbUserName;
    }

    /** The OCID of the target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final java.util.List<String> targetId;

    /**
     * The OCID of the target database.
     *
     * @return the value
     */
    public java.util.List<String> getTargetId() {
        return targetId;
    }

    /** The name of the target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetName")
    private final java.util.List<String> targetName;

    /**
     * The name of the target database.
     *
     * @return the value
     */
    public java.util.List<String> getTargetName() {
        return targetName;
    }

    /**
     * The application from which the SQL violation was generated. Examples SQL Plus or SQL
     * Developer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientProgram")
    private final java.util.List<String> clientProgram;

    /**
     * The application from which the SQL violation was generated. Examples SQL Plus or SQL
     * Developer.
     *
     * @return the value
     */
    public java.util.List<String> getClientProgram() {
        return clientProgram;
    }

    /**
     * The name of the action executed by the user on the target database, for example, ALTER,
     * CREATE, DROP.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final java.util.List<String> operation;

    /**
     * The name of the action executed by the user on the target database, for example, ALTER,
     * CREATE, DROP.
     *
     * @return the value
     */
    public java.util.List<String> getOperation() {
        return operation;
    }

    /** The name of the operating system user for the database session. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientOsUserName")
    private final java.util.List<String> clientOsUserName;

    /**
     * The name of the operating system user for the database session.
     *
     * @return the value
     */
    public java.util.List<String> getClientOsUserName() {
        return clientOsUserName;
    }

    /** Indicates whether SQL or context violation. */
    @com.fasterxml.jackson.annotation.JsonProperty("violationCause")
    private final java.util.List<String> violationCause;

    /**
     * Indicates whether SQL or context violation.
     *
     * @return the value
     */
    public java.util.List<String> getViolationCause() {
        return violationCause;
    }

    /** The IP address of the host from which the session was spawned. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientIp")
    private final java.util.List<String> clientIp;

    /**
     * The IP address of the host from which the session was spawned.
     *
     * @return the value
     */
    public java.util.List<String> getClientIp() {
        return clientIp;
    }

    /** The action taken for this SQL violation. */
    @com.fasterxml.jackson.annotation.JsonProperty("violationAction")
    private final java.util.List<String> violationAction;

    /**
     * The action taken for this SQL violation.
     *
     * @return the value
     */
    public java.util.List<String> getViolationAction() {
        return violationAction;
    }

    /** */
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
    private final java.util.List<SqlLevel> sqlLevel;

    /**
     * Specifies the level of SQL included for this SQL Firewall policy. USER_ISSUED_SQL - User
     * issued SQL statements only. ALL_SQL - Includes all SQL statements including SQL statement
     * issued inside PL/SQL units.
     *
     * @return the value
     */
    public java.util.List<SqlLevel> getSqlLevel() {
        return sqlLevel;
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
        sb.append("SqlFirewallViolationAggregationDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("operationTime=").append(String.valueOf(this.operationTime));
        sb.append(", dbUserName=").append(String.valueOf(this.dbUserName));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetName=").append(String.valueOf(this.targetName));
        sb.append(", clientProgram=").append(String.valueOf(this.clientProgram));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(", clientOsUserName=").append(String.valueOf(this.clientOsUserName));
        sb.append(", violationCause=").append(String.valueOf(this.violationCause));
        sb.append(", clientIp=").append(String.valueOf(this.clientIp));
        sb.append(", violationAction=").append(String.valueOf(this.violationAction));
        sb.append(", sqlLevel=").append(String.valueOf(this.sqlLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlFirewallViolationAggregationDimensions)) {
            return false;
        }

        SqlFirewallViolationAggregationDimensions other =
                (SqlFirewallViolationAggregationDimensions) o;
        return java.util.Objects.equals(this.operationTime, other.operationTime)
                && java.util.Objects.equals(this.dbUserName, other.dbUserName)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetName, other.targetName)
                && java.util.Objects.equals(this.clientProgram, other.clientProgram)
                && java.util.Objects.equals(this.operation, other.operation)
                && java.util.Objects.equals(this.clientOsUserName, other.clientOsUserName)
                && java.util.Objects.equals(this.violationCause, other.violationCause)
                && java.util.Objects.equals(this.clientIp, other.clientIp)
                && java.util.Objects.equals(this.violationAction, other.violationAction)
                && java.util.Objects.equals(this.sqlLevel, other.sqlLevel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationTime == null ? 43 : this.operationTime.hashCode());
        result = (result * PRIME) + (this.dbUserName == null ? 43 : this.dbUserName.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.targetName == null ? 43 : this.targetName.hashCode());
        result =
                (result * PRIME)
                        + (this.clientProgram == null ? 43 : this.clientProgram.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result =
                (result * PRIME)
                        + (this.clientOsUserName == null ? 43 : this.clientOsUserName.hashCode());
        result =
                (result * PRIME)
                        + (this.violationCause == null ? 43 : this.violationCause.hashCode());
        result = (result * PRIME) + (this.clientIp == null ? 43 : this.clientIp.hashCode());
        result =
                (result * PRIME)
                        + (this.violationAction == null ? 43 : this.violationAction.hashCode());
        result = (result * PRIME) + (this.sqlLevel == null ? 43 : this.sqlLevel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
