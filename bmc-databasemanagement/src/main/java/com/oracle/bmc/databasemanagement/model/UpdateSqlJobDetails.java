/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details specific to the SQL job request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateSqlJobDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "jobType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateSqlJobDetails extends UpdateJobDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeout")
        private String timeout;

        public Builder timeout(String timeout) {
            this.timeout = timeout;
            this.__explicitlySet__.add("timeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resultLocation")
        private JobExecutionResultLocation resultLocation;

        public Builder resultLocation(JobExecutionResultLocation resultLocation) {
            this.resultLocation = resultLocation;
            this.__explicitlySet__.add("resultLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleDetails")
        private JobScheduleDetails scheduleDetails;

        public Builder scheduleDetails(JobScheduleDetails scheduleDetails) {
            this.scheduleDetails = scheduleDetails;
            this.__explicitlySet__.add("scheduleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
        private String sqlText;

        public Builder sqlText(String sqlText) {
            this.sqlText = sqlText;
            this.__explicitlySet__.add("sqlText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlType")
        private SqlJob.SqlType sqlType;

        public Builder sqlType(SqlJob.SqlType sqlType) {
            this.sqlType = sqlType;
            this.__explicitlySet__.add("sqlType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private SqlJob.Role role;

        public Builder role(SqlJob.Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSqlJobDetails build() {
            UpdateSqlJobDetails __instance__ =
                    new UpdateSqlJobDetails(
                            description,
                            timeout,
                            resultLocation,
                            scheduleDetails,
                            sqlText,
                            sqlType,
                            userName,
                            password,
                            secretId,
                            role);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSqlJobDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .timeout(o.getTimeout())
                            .resultLocation(o.getResultLocation())
                            .scheduleDetails(o.getScheduleDetails())
                            .sqlText(o.getSqlText())
                            .sqlType(o.getSqlType())
                            .userName(o.getUserName())
                            .password(o.getPassword())
                            .secretId(o.getSecretId())
                            .role(o.getRole());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public UpdateSqlJobDetails(
            String description,
            String timeout,
            JobExecutionResultLocation resultLocation,
            JobScheduleDetails scheduleDetails,
            String sqlText,
            SqlJob.SqlType sqlType,
            String userName,
            String password,
            String secretId,
            SqlJob.Role role) {
        super(description, timeout, resultLocation, scheduleDetails);
        this.sqlText = sqlText;
        this.sqlType = sqlType;
        this.userName = userName;
        this.password = password;
        this.secretId = secretId;
        this.role = role;
    }

    /**
     * The SQL text to be executed as part of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
    String sqlText;

    @com.fasterxml.jackson.annotation.JsonProperty("sqlType")
    SqlJob.SqlType sqlType;

    /**
     * The database user name used to execute the SQL job. If the job is being executed on a
     * Managed Database Group, then the user name should exist on all the databases in the
     * group with the same password.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    String userName;

    /**
     * The password for the database user name used to execute the SQL job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    String password;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the secret containing the user password.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    String secretId;

    /**
     * The role of the database user. Indicates whether the database user is a normal user or sysdba.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    SqlJob.Role role;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
