/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details specific to the SQL job request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateSqlJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "jobType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSqlJobDetails extends UpdateJobDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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
        /** The SQL text to be executed as part of the job. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
        private String sqlText;

        /**
         * The SQL text to be executed as part of the job.
         *
         * @param sqlText the value to set
         * @return this builder
         */
        public Builder sqlText(String sqlText) {
            this.sqlText = sqlText;
            this.__explicitlySet__.add("sqlText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inBinds")
        private JobInBindsDetails inBinds;

        public Builder inBinds(JobInBindsDetails inBinds) {
            this.inBinds = inBinds;
            this.__explicitlySet__.add("inBinds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outBinds")
        private JobOutBindsDetails outBinds;

        public Builder outBinds(JobOutBindsDetails outBinds) {
            this.outBinds = outBinds;
            this.__explicitlySet__.add("outBinds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlType")
        private SqlJob.SqlType sqlType;

        public Builder sqlType(SqlJob.SqlType sqlType) {
            this.sqlType = sqlType;
            this.__explicitlySet__.add("sqlType");
            return this;
        }
        /**
         * The database user name used to execute the SQL job. If the job is being executed on a
         * Managed Database Group, then the user name should exist on all the databases in the group
         * with the same password.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The database user name used to execute the SQL job. If the job is being executed on a
         * Managed Database Group, then the user name should exist on all the databases in the group
         * with the same password.
         *
         * @param userName the value to set
         * @return this builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /** The password for the database user name used to execute the SQL job. */
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password for the database user name used to execute the SQL job.
         *
         * @param password the value to set
         * @return this builder
         */
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * secret containing the user password.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * secret containing the user password.
         *
         * @param secretId the value to set
         * @return this builder
         */
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Named Credentials containing password secret.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namedCredentialId")
        private String namedCredentialId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Named Credentials containing password secret.
         *
         * @param namedCredentialId the value to set
         * @return this builder
         */
        public Builder namedCredentialId(String namedCredentialId) {
            this.namedCredentialId = namedCredentialId;
            this.__explicitlySet__.add("namedCredentialId");
            return this;
        }
        /**
         * The role of the database user. Indicates whether the database user is a normal user or
         * sysdba.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private SqlJob.Role role;

        /**
         * The role of the database user. Indicates whether the database user is a normal user or
         * sysdba.
         *
         * @param role the value to set
         * @return this builder
         */
        public Builder role(SqlJob.Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSqlJobDetails build() {
            UpdateSqlJobDetails model =
                    new UpdateSqlJobDetails(
                            this.description,
                            this.timeout,
                            this.resultLocation,
                            this.scheduleDetails,
                            this.sqlText,
                            this.inBinds,
                            this.outBinds,
                            this.sqlType,
                            this.userName,
                            this.password,
                            this.secretId,
                            this.namedCredentialId,
                            this.role,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSqlJobDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeout")) {
                this.timeout(model.getTimeout());
            }
            if (model.wasPropertyExplicitlySet("resultLocation")) {
                this.resultLocation(model.getResultLocation());
            }
            if (model.wasPropertyExplicitlySet("scheduleDetails")) {
                this.scheduleDetails(model.getScheduleDetails());
            }
            if (model.wasPropertyExplicitlySet("sqlText")) {
                this.sqlText(model.getSqlText());
            }
            if (model.wasPropertyExplicitlySet("inBinds")) {
                this.inBinds(model.getInBinds());
            }
            if (model.wasPropertyExplicitlySet("outBinds")) {
                this.outBinds(model.getOutBinds());
            }
            if (model.wasPropertyExplicitlySet("sqlType")) {
                this.sqlType(model.getSqlType());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("namedCredentialId")) {
                this.namedCredentialId(model.getNamedCredentialId());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    @Deprecated
    public UpdateSqlJobDetails(
            String description,
            String timeout,
            JobExecutionResultLocation resultLocation,
            JobScheduleDetails scheduleDetails,
            String sqlText,
            JobInBindsDetails inBinds,
            JobOutBindsDetails outBinds,
            SqlJob.SqlType sqlType,
            String userName,
            String password,
            String secretId,
            String namedCredentialId,
            SqlJob.Role role,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super(description, timeout, resultLocation, scheduleDetails);
        this.sqlText = sqlText;
        this.inBinds = inBinds;
        this.outBinds = outBinds;
        this.sqlType = sqlType;
        this.userName = userName;
        this.password = password;
        this.secretId = secretId;
        this.namedCredentialId = namedCredentialId;
        this.role = role;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    /** The SQL text to be executed as part of the job. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
    private final String sqlText;

    /**
     * The SQL text to be executed as part of the job.
     *
     * @return the value
     */
    public String getSqlText() {
        return sqlText;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inBinds")
    private final JobInBindsDetails inBinds;

    public JobInBindsDetails getInBinds() {
        return inBinds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outBinds")
    private final JobOutBindsDetails outBinds;

    public JobOutBindsDetails getOutBinds() {
        return outBinds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sqlType")
    private final SqlJob.SqlType sqlType;

    public SqlJob.SqlType getSqlType() {
        return sqlType;
    }

    /**
     * The database user name used to execute the SQL job. If the job is being executed on a Managed
     * Database Group, then the user name should exist on all the databases in the group with the
     * same password.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The database user name used to execute the SQL job. If the job is being executed on a Managed
     * Database Group, then the user name should exist on all the databases in the group with the
     * same password.
     *
     * @return the value
     */
    public String getUserName() {
        return userName;
    }

    /** The password for the database user name used to execute the SQL job. */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password for the database user name used to execute the SQL job.
     *
     * @return the value
     */
    public String getPassword() {
        return password;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * secret containing the user password.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * secret containing the user password.
     *
     * @return the value
     */
    public String getSecretId() {
        return secretId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Named Credentials containing password secret.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namedCredentialId")
    private final String namedCredentialId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Named Credentials containing password secret.
     *
     * @return the value
     */
    public String getNamedCredentialId() {
        return namedCredentialId;
    }

    /**
     * The role of the database user. Indicates whether the database user is a normal user or
     * sysdba.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final SqlJob.Role role;

    /**
     * The role of the database user. Indicates whether the database user is a normal user or
     * sysdba.
     *
     * @return the value
     */
    public SqlJob.Role getRole() {
        return role;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateSqlJobDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sqlText=").append(String.valueOf(this.sqlText));
        sb.append(", inBinds=").append(String.valueOf(this.inBinds));
        sb.append(", outBinds=").append(String.valueOf(this.outBinds));
        sb.append(", sqlType=").append(String.valueOf(this.sqlType));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", password=").append(String.valueOf(this.password));
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(", namedCredentialId=").append(String.valueOf(this.namedCredentialId));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSqlJobDetails)) {
            return false;
        }

        UpdateSqlJobDetails other = (UpdateSqlJobDetails) o;
        return java.util.Objects.equals(this.sqlText, other.sqlText)
                && java.util.Objects.equals(this.inBinds, other.inBinds)
                && java.util.Objects.equals(this.outBinds, other.outBinds)
                && java.util.Objects.equals(this.sqlType, other.sqlType)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.namedCredentialId, other.namedCredentialId)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sqlText == null ? 43 : this.sqlText.hashCode());
        result = (result * PRIME) + (this.inBinds == null ? 43 : this.inBinds.hashCode());
        result = (result * PRIME) + (this.outBinds == null ? 43 : this.outBinds.hashCode());
        result = (result * PRIME) + (this.sqlType == null ? 43 : this.sqlType.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result =
                (result * PRIME)
                        + (this.namedCredentialId == null ? 43 : this.namedCredentialId.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        return result;
    }
}
