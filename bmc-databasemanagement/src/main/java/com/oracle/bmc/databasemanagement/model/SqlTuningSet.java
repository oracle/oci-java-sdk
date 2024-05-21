/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Details of the Sql tuning set.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlTuningSet.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlTuningSet extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "owner",
        "name",
        "statementCount",
        "timeCreated",
        "description",
        "timeLastModified",
        "status",
        "scheduledJobName",
        "errorMessage",
        "allSqlStatementsFetched",
        "sqlList"
    })
    public SqlTuningSet(
            Integer id,
            String owner,
            String name,
            Integer statementCount,
            java.util.Date timeCreated,
            String description,
            java.util.Date timeLastModified,
            SqlTuningSetStatusTypes status,
            String scheduledJobName,
            String errorMessage,
            AllSqlStatementsFetched allSqlStatementsFetched,
            java.util.List<SqlInSqlTuningSet> sqlList) {
        super();
        this.id = id;
        this.owner = owner;
        this.name = name;
        this.statementCount = statementCount;
        this.timeCreated = timeCreated;
        this.description = description;
        this.timeLastModified = timeLastModified;
        this.status = status;
        this.scheduledJobName = scheduledJobName;
        this.errorMessage = errorMessage;
        this.allSqlStatementsFetched = allSqlStatementsFetched;
        this.sqlList = sqlList;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique Sql tuning set identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Integer id;

        /**
         * The unique Sql tuning set identifier.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(Integer id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The owner of the Sql tuning set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * The owner of the Sql tuning set.
         * @param owner the value to set
         * @return this builder
         **/
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /**
         * The name of the Sql tuning set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the Sql tuning set.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Number of statements in the Sql tuning set
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statementCount")
        private Integer statementCount;

        /**
         * Number of statements in the Sql tuning set
         * @param statementCount the value to set
         * @return this builder
         **/
        public Builder statementCount(Integer statementCount) {
            this.statementCount = statementCount;
            this.__explicitlySet__.add("statementCount");
            return this;
        }
        /**
         * The created time of the Sql tuning set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The created time of the Sql tuning set.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The description of the Sql tuning set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the Sql tuning set.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Last modified time of the Sql tuning set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
        private java.util.Date timeLastModified;

        /**
         * Last modified time of the Sql tuning set.
         * @param timeLastModified the value to set
         * @return this builder
         **/
        public Builder timeLastModified(java.util.Date timeLastModified) {
            this.timeLastModified = timeLastModified;
            this.__explicitlySet__.add("timeLastModified");
            return this;
        }
        /**
         * Current status of the Sql tuning set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private SqlTuningSetStatusTypes status;

        /**
         * Current status of the Sql tuning set.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(SqlTuningSetStatusTypes status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Name of the Sql tuning set scheduler job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledJobName")
        private String scheduledJobName;

        /**
         * Name of the Sql tuning set scheduler job.
         * @param scheduledJobName the value to set
         * @return this builder
         **/
        public Builder scheduledJobName(String scheduledJobName) {
            this.scheduledJobName = scheduledJobName;
            this.__explicitlySet__.add("scheduledJobName");
            return this;
        }
        /**
         * Latest execution error of the plsql that was submitted as a scheduler job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * Latest execution error of the plsql that was submitted as a scheduler job.
         * @param errorMessage the value to set
         * @return this builder
         **/
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /**
         * In OCI database management, there is a limit to fetch only 2000 rows.
         * This flag indicates whether all Sql statements of this Sql tuning set matching the filter criteria are fetched or not.
         * Possible values are 'Yes' or 'No'
         *   - Yes - All Sql statements matching the filter criteria are fetched.
         *   - No  - There are more Sql statements matching the fitler criteria.
         *           User should fine tune the filter criteria to narrow down the result set.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allSqlStatementsFetched")
        private AllSqlStatementsFetched allSqlStatementsFetched;

        /**
         * In OCI database management, there is a limit to fetch only 2000 rows.
         * This flag indicates whether all Sql statements of this Sql tuning set matching the filter criteria are fetched or not.
         * Possible values are 'Yes' or 'No'
         *   - Yes - All Sql statements matching the filter criteria are fetched.
         *   - No  - There are more Sql statements matching the fitler criteria.
         *           User should fine tune the filter criteria to narrow down the result set.
         *
         * @param allSqlStatementsFetched the value to set
         * @return this builder
         **/
        public Builder allSqlStatementsFetched(AllSqlStatementsFetched allSqlStatementsFetched) {
            this.allSqlStatementsFetched = allSqlStatementsFetched;
            this.__explicitlySet__.add("allSqlStatementsFetched");
            return this;
        }
        /**
         * A list of the Sqls associated with the Sql tuning set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlList")
        private java.util.List<SqlInSqlTuningSet> sqlList;

        /**
         * A list of the Sqls associated with the Sql tuning set.
         * @param sqlList the value to set
         * @return this builder
         **/
        public Builder sqlList(java.util.List<SqlInSqlTuningSet> sqlList) {
            this.sqlList = sqlList;
            this.__explicitlySet__.add("sqlList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningSet build() {
            SqlTuningSet model =
                    new SqlTuningSet(
                            this.id,
                            this.owner,
                            this.name,
                            this.statementCount,
                            this.timeCreated,
                            this.description,
                            this.timeLastModified,
                            this.status,
                            this.scheduledJobName,
                            this.errorMessage,
                            this.allSqlStatementsFetched,
                            this.sqlList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningSet model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("statementCount")) {
                this.statementCount(model.getStatementCount());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeLastModified")) {
                this.timeLastModified(model.getTimeLastModified());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("scheduledJobName")) {
                this.scheduledJobName(model.getScheduledJobName());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("allSqlStatementsFetched")) {
                this.allSqlStatementsFetched(model.getAllSqlStatementsFetched());
            }
            if (model.wasPropertyExplicitlySet("sqlList")) {
                this.sqlList(model.getSqlList());
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
     * The unique Sql tuning set identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final Integer id;

    /**
     * The unique Sql tuning set identifier.
     * @return the value
     **/
    public Integer getId() {
        return id;
    }

    /**
     * The owner of the Sql tuning set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * The owner of the Sql tuning set.
     * @return the value
     **/
    public String getOwner() {
        return owner;
    }

    /**
     * The name of the Sql tuning set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the Sql tuning set.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Number of statements in the Sql tuning set
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statementCount")
    private final Integer statementCount;

    /**
     * Number of statements in the Sql tuning set
     * @return the value
     **/
    public Integer getStatementCount() {
        return statementCount;
    }

    /**
     * The created time of the Sql tuning set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The created time of the Sql tuning set.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The description of the Sql tuning set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the Sql tuning set.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Last modified time of the Sql tuning set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
    private final java.util.Date timeLastModified;

    /**
     * Last modified time of the Sql tuning set.
     * @return the value
     **/
    public java.util.Date getTimeLastModified() {
        return timeLastModified;
    }

    /**
     * Current status of the Sql tuning set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final SqlTuningSetStatusTypes status;

    /**
     * Current status of the Sql tuning set.
     * @return the value
     **/
    public SqlTuningSetStatusTypes getStatus() {
        return status;
    }

    /**
     * Name of the Sql tuning set scheduler job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledJobName")
    private final String scheduledJobName;

    /**
     * Name of the Sql tuning set scheduler job.
     * @return the value
     **/
    public String getScheduledJobName() {
        return scheduledJobName;
    }

    /**
     * Latest execution error of the plsql that was submitted as a scheduler job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * Latest execution error of the plsql that was submitted as a scheduler job.
     * @return the value
     **/
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * In OCI database management, there is a limit to fetch only 2000 rows.
     * This flag indicates whether all Sql statements of this Sql tuning set matching the filter criteria are fetched or not.
     * Possible values are 'Yes' or 'No'
     *   - Yes - All Sql statements matching the filter criteria are fetched.
     *   - No  - There are more Sql statements matching the fitler criteria.
     *           User should fine tune the filter criteria to narrow down the result set.
     *
     **/
    public enum AllSqlStatementsFetched {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AllSqlStatementsFetched.class);

        private final String value;
        private static java.util.Map<String, AllSqlStatementsFetched> map;

        static {
            map = new java.util.HashMap<>();
            for (AllSqlStatementsFetched v : AllSqlStatementsFetched.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AllSqlStatementsFetched(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AllSqlStatementsFetched create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AllSqlStatementsFetched', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * In OCI database management, there is a limit to fetch only 2000 rows.
     * This flag indicates whether all Sql statements of this Sql tuning set matching the filter criteria are fetched or not.
     * Possible values are 'Yes' or 'No'
     *   - Yes - All Sql statements matching the filter criteria are fetched.
     *   - No  - There are more Sql statements matching the fitler criteria.
     *           User should fine tune the filter criteria to narrow down the result set.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allSqlStatementsFetched")
    private final AllSqlStatementsFetched allSqlStatementsFetched;

    /**
     * In OCI database management, there is a limit to fetch only 2000 rows.
     * This flag indicates whether all Sql statements of this Sql tuning set matching the filter criteria are fetched or not.
     * Possible values are 'Yes' or 'No'
     *   - Yes - All Sql statements matching the filter criteria are fetched.
     *   - No  - There are more Sql statements matching the fitler criteria.
     *           User should fine tune the filter criteria to narrow down the result set.
     *
     * @return the value
     **/
    public AllSqlStatementsFetched getAllSqlStatementsFetched() {
        return allSqlStatementsFetched;
    }

    /**
     * A list of the Sqls associated with the Sql tuning set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlList")
    private final java.util.List<SqlInSqlTuningSet> sqlList;

    /**
     * A list of the Sqls associated with the Sql tuning set.
     * @return the value
     **/
    public java.util.List<SqlInSqlTuningSet> getSqlList() {
        return sqlList;
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
        sb.append("SqlTuningSet(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", statementCount=").append(String.valueOf(this.statementCount));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeLastModified=").append(String.valueOf(this.timeLastModified));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", scheduledJobName=").append(String.valueOf(this.scheduledJobName));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", allSqlStatementsFetched=")
                .append(String.valueOf(this.allSqlStatementsFetched));
        sb.append(", sqlList=").append(String.valueOf(this.sqlList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningSet)) {
            return false;
        }

        SqlTuningSet other = (SqlTuningSet) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.statementCount, other.statementCount)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeLastModified, other.timeLastModified)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.scheduledJobName, other.scheduledJobName)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(
                        this.allSqlStatementsFetched, other.allSqlStatementsFetched)
                && java.util.Objects.equals(this.sqlList, other.sqlList)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.statementCount == null ? 43 : this.statementCount.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastModified == null ? 43 : this.timeLastModified.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledJobName == null ? 43 : this.scheduledJobName.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.allSqlStatementsFetched == null
                                ? 43
                                : this.allSqlStatementsFetched.hashCode());
        result = (result * PRIME) + (this.sqlList == null ? 43 : this.sqlList.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
