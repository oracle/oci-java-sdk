/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of SQL statements and plans to be loaded from cursor cache. You can specify the plans
 * to load using SQL ID, plan identifier, or filterName and filterValue pair. You can also control
 * the SQL plan baseline into which the plans are loaded using either SQL text or SQL handle. <br>
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
        builder = LoadSqlPlanBaselinesFromCursorCacheDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LoadSqlPlanBaselinesFromCursorCacheDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "jobName",
        "jobDescription",
        "sqlId",
        "planHash",
        "sqlText",
        "sqlHandle",
        "filterName",
        "filterValue",
        "isFixed",
        "isEnabled",
        "credentials"
    })
    public LoadSqlPlanBaselinesFromCursorCacheDetails(
            String jobName,
            String jobDescription,
            String sqlId,
            java.math.BigDecimal planHash,
            String sqlText,
            String sqlHandle,
            FilterName filterName,
            String filterValue,
            Boolean isFixed,
            Boolean isEnabled,
            ManagedDatabaseCredential credentials) {
        super();
        this.jobName = jobName;
        this.jobDescription = jobDescription;
        this.sqlId = sqlId;
        this.planHash = planHash;
        this.sqlText = sqlText;
        this.sqlHandle = sqlHandle;
        this.filterName = filterName;
        this.filterValue = filterValue;
        this.isFixed = isFixed;
        this.isEnabled = isEnabled;
        this.credentials = credentials;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the database job used for loading SQL plan baselines. */
        @com.fasterxml.jackson.annotation.JsonProperty("jobName")
        private String jobName;

        /**
         * The name of the database job used for loading SQL plan baselines.
         *
         * @param jobName the value to set
         * @return this builder
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            this.__explicitlySet__.add("jobName");
            return this;
        }
        /** The description of the job. */
        @com.fasterxml.jackson.annotation.JsonProperty("jobDescription")
        private String jobDescription;

        /**
         * The description of the job.
         *
         * @param jobDescription the value to set
         * @return this builder
         */
        public Builder jobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            this.__explicitlySet__.add("jobDescription");
            return this;
        }
        /** The SQL statement identifier. Identifies a SQL statement in the cursor cache. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlId")
        private String sqlId;

        /**
         * The SQL statement identifier. Identifies a SQL statement in the cursor cache.
         *
         * @param sqlId the value to set
         * @return this builder
         */
        public Builder sqlId(String sqlId) {
            this.sqlId = sqlId;
            this.__explicitlySet__.add("sqlId");
            return this;
        }
        /**
         * The plan identifier. By default, all plans present in the cursor cache for the SQL
         * statement identified by {@code sqlId} are captured.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("planHash")
        private java.math.BigDecimal planHash;

        /**
         * The plan identifier. By default, all plans present in the cursor cache for the SQL
         * statement identified by {@code sqlId} are captured.
         *
         * @param planHash the value to set
         * @return this builder
         */
        public Builder planHash(java.math.BigDecimal planHash) {
            this.planHash = planHash;
            this.__explicitlySet__.add("planHash");
            return this;
        }
        /**
         * The SQL text to use in identifying the SQL plan baseline into which the plans are loaded.
         * If the SQL plan baseline does not exist, it is created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
        private String sqlText;

        /**
         * The SQL text to use in identifying the SQL plan baseline into which the plans are loaded.
         * If the SQL plan baseline does not exist, it is created.
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
         * The SQL handle to use in identifying the SQL plan baseline into which the plans are
         * loaded.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlHandle")
        private String sqlHandle;

        /**
         * The SQL handle to use in identifying the SQL plan baseline into which the plans are
         * loaded.
         *
         * @param sqlHandle the value to set
         * @return this builder
         */
        public Builder sqlHandle(String sqlHandle) {
            this.sqlHandle = sqlHandle;
            this.__explicitlySet__.add("sqlHandle");
            return this;
        }
        /**
         * The name of the filter.
         *
         * <p>- SQL_TEXT: Search pattern to apply to SQL text. - PARSING_SCHEMA_NAME: Name of the
         * parsing schema. - MODULE: Name of the module. - ACTION: Name of the action.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("filterName")
        private FilterName filterName;

        /**
         * The name of the filter.
         *
         * <p>- SQL_TEXT: Search pattern to apply to SQL text. - PARSING_SCHEMA_NAME: Name of the
         * parsing schema. - MODULE: Name of the module. - ACTION: Name of the action.
         *
         * @param filterName the value to set
         * @return this builder
         */
        public Builder filterName(FilterName filterName) {
            this.filterName = filterName;
            this.__explicitlySet__.add("filterName");
            return this;
        }
        /**
         * The filter value. It is upper-cased except when it is enclosed in double quotes or filter
         * name is {@code SQL_TEXT}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("filterValue")
        private String filterValue;

        /**
         * The filter value. It is upper-cased except when it is enclosed in double quotes or filter
         * name is {@code SQL_TEXT}.
         *
         * @param filterValue the value to set
         * @return this builder
         */
        public Builder filterValue(String filterValue) {
            this.filterValue = filterValue;
            this.__explicitlySet__.add("filterValue");
            return this;
        }
        /**
         * Indicates whether the plans are loaded as fixed plans ({@code true}) or non-fixed plans
         * ({@code false}). By default, they are loaded as non-fixed plans.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isFixed")
        private Boolean isFixed;

        /**
         * Indicates whether the plans are loaded as fixed plans ({@code true}) or non-fixed plans
         * ({@code false}). By default, they are loaded as non-fixed plans.
         *
         * @param isFixed the value to set
         * @return this builder
         */
        public Builder isFixed(Boolean isFixed) {
            this.isFixed = isFixed;
            this.__explicitlySet__.add("isFixed");
            return this;
        }
        /**
         * Indicates whether the loaded plans are enabled ({@code true}) or not ({@code false}). By
         * default, they are enabled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Indicates whether the loaded plans are enabled ({@code true}) or not ({@code false}). By
         * default, they are enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentials")
        private ManagedDatabaseCredential credentials;

        public Builder credentials(ManagedDatabaseCredential credentials) {
            this.credentials = credentials;
            this.__explicitlySet__.add("credentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoadSqlPlanBaselinesFromCursorCacheDetails build() {
            LoadSqlPlanBaselinesFromCursorCacheDetails model =
                    new LoadSqlPlanBaselinesFromCursorCacheDetails(
                            this.jobName,
                            this.jobDescription,
                            this.sqlId,
                            this.planHash,
                            this.sqlText,
                            this.sqlHandle,
                            this.filterName,
                            this.filterValue,
                            this.isFixed,
                            this.isEnabled,
                            this.credentials);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoadSqlPlanBaselinesFromCursorCacheDetails model) {
            if (model.wasPropertyExplicitlySet("jobName")) {
                this.jobName(model.getJobName());
            }
            if (model.wasPropertyExplicitlySet("jobDescription")) {
                this.jobDescription(model.getJobDescription());
            }
            if (model.wasPropertyExplicitlySet("sqlId")) {
                this.sqlId(model.getSqlId());
            }
            if (model.wasPropertyExplicitlySet("planHash")) {
                this.planHash(model.getPlanHash());
            }
            if (model.wasPropertyExplicitlySet("sqlText")) {
                this.sqlText(model.getSqlText());
            }
            if (model.wasPropertyExplicitlySet("sqlHandle")) {
                this.sqlHandle(model.getSqlHandle());
            }
            if (model.wasPropertyExplicitlySet("filterName")) {
                this.filterName(model.getFilterName());
            }
            if (model.wasPropertyExplicitlySet("filterValue")) {
                this.filterValue(model.getFilterValue());
            }
            if (model.wasPropertyExplicitlySet("isFixed")) {
                this.isFixed(model.getIsFixed());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("credentials")) {
                this.credentials(model.getCredentials());
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

    /** The name of the database job used for loading SQL plan baselines. */
    @com.fasterxml.jackson.annotation.JsonProperty("jobName")
    private final String jobName;

    /**
     * The name of the database job used for loading SQL plan baselines.
     *
     * @return the value
     */
    public String getJobName() {
        return jobName;
    }

    /** The description of the job. */
    @com.fasterxml.jackson.annotation.JsonProperty("jobDescription")
    private final String jobDescription;

    /**
     * The description of the job.
     *
     * @return the value
     */
    public String getJobDescription() {
        return jobDescription;
    }

    /** The SQL statement identifier. Identifies a SQL statement in the cursor cache. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlId")
    private final String sqlId;

    /**
     * The SQL statement identifier. Identifies a SQL statement in the cursor cache.
     *
     * @return the value
     */
    public String getSqlId() {
        return sqlId;
    }

    /**
     * The plan identifier. By default, all plans present in the cursor cache for the SQL statement
     * identified by {@code sqlId} are captured.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("planHash")
    private final java.math.BigDecimal planHash;

    /**
     * The plan identifier. By default, all plans present in the cursor cache for the SQL statement
     * identified by {@code sqlId} are captured.
     *
     * @return the value
     */
    public java.math.BigDecimal getPlanHash() {
        return planHash;
    }

    /**
     * The SQL text to use in identifying the SQL plan baseline into which the plans are loaded. If
     * the SQL plan baseline does not exist, it is created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
    private final String sqlText;

    /**
     * The SQL text to use in identifying the SQL plan baseline into which the plans are loaded. If
     * the SQL plan baseline does not exist, it is created.
     *
     * @return the value
     */
    public String getSqlText() {
        return sqlText;
    }

    /**
     * The SQL handle to use in identifying the SQL plan baseline into which the plans are loaded.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlHandle")
    private final String sqlHandle;

    /**
     * The SQL handle to use in identifying the SQL plan baseline into which the plans are loaded.
     *
     * @return the value
     */
    public String getSqlHandle() {
        return sqlHandle;
    }

    /**
     * The name of the filter.
     *
     * <p>- SQL_TEXT: Search pattern to apply to SQL text. - PARSING_SCHEMA_NAME: Name of the
     * parsing schema. - MODULE: Name of the module. - ACTION: Name of the action.
     */
    public enum FilterName implements com.oracle.bmc.http.internal.BmcEnum {
        SqlText("SQL_TEXT"),
        ParsingSchemaName("PARSING_SCHEMA_NAME"),
        Module("MODULE"),
        Action("ACTION"),
        ;

        private final String value;
        private static java.util.Map<String, FilterName> map;

        static {
            map = new java.util.HashMap<>();
            for (FilterName v : FilterName.values()) {
                map.put(v.getValue(), v);
            }
        }

        FilterName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FilterName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid FilterName: " + key);
        }
    };
    /**
     * The name of the filter.
     *
     * <p>- SQL_TEXT: Search pattern to apply to SQL text. - PARSING_SCHEMA_NAME: Name of the
     * parsing schema. - MODULE: Name of the module. - ACTION: Name of the action.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filterName")
    private final FilterName filterName;

    /**
     * The name of the filter.
     *
     * <p>- SQL_TEXT: Search pattern to apply to SQL text. - PARSING_SCHEMA_NAME: Name of the
     * parsing schema. - MODULE: Name of the module. - ACTION: Name of the action.
     *
     * @return the value
     */
    public FilterName getFilterName() {
        return filterName;
    }

    /**
     * The filter value. It is upper-cased except when it is enclosed in double quotes or filter
     * name is {@code SQL_TEXT}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filterValue")
    private final String filterValue;

    /**
     * The filter value. It is upper-cased except when it is enclosed in double quotes or filter
     * name is {@code SQL_TEXT}.
     *
     * @return the value
     */
    public String getFilterValue() {
        return filterValue;
    }

    /**
     * Indicates whether the plans are loaded as fixed plans ({@code true}) or non-fixed plans
     * ({@code false}). By default, they are loaded as non-fixed plans.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isFixed")
    private final Boolean isFixed;

    /**
     * Indicates whether the plans are loaded as fixed plans ({@code true}) or non-fixed plans
     * ({@code false}). By default, they are loaded as non-fixed plans.
     *
     * @return the value
     */
    public Boolean getIsFixed() {
        return isFixed;
    }

    /**
     * Indicates whether the loaded plans are enabled ({@code true}) or not ({@code false}). By
     * default, they are enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Indicates whether the loaded plans are enabled ({@code true}) or not ({@code false}). By
     * default, they are enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    private final ManagedDatabaseCredential credentials;

    public ManagedDatabaseCredential getCredentials() {
        return credentials;
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
        sb.append("LoadSqlPlanBaselinesFromCursorCacheDetails(");
        sb.append("super=").append(super.toString());
        sb.append("jobName=").append(String.valueOf(this.jobName));
        sb.append(", jobDescription=").append(String.valueOf(this.jobDescription));
        sb.append(", sqlId=").append(String.valueOf(this.sqlId));
        sb.append(", planHash=").append(String.valueOf(this.planHash));
        sb.append(", sqlText=").append(String.valueOf(this.sqlText));
        sb.append(", sqlHandle=").append(String.valueOf(this.sqlHandle));
        sb.append(", filterName=").append(String.valueOf(this.filterName));
        sb.append(", filterValue=").append(String.valueOf(this.filterValue));
        sb.append(", isFixed=").append(String.valueOf(this.isFixed));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoadSqlPlanBaselinesFromCursorCacheDetails)) {
            return false;
        }

        LoadSqlPlanBaselinesFromCursorCacheDetails other =
                (LoadSqlPlanBaselinesFromCursorCacheDetails) o;
        return java.util.Objects.equals(this.jobName, other.jobName)
                && java.util.Objects.equals(this.jobDescription, other.jobDescription)
                && java.util.Objects.equals(this.sqlId, other.sqlId)
                && java.util.Objects.equals(this.planHash, other.planHash)
                && java.util.Objects.equals(this.sqlText, other.sqlText)
                && java.util.Objects.equals(this.sqlHandle, other.sqlHandle)
                && java.util.Objects.equals(this.filterName, other.filterName)
                && java.util.Objects.equals(this.filterValue, other.filterValue)
                && java.util.Objects.equals(this.isFixed, other.isFixed)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.credentials, other.credentials)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.jobName == null ? 43 : this.jobName.hashCode());
        result =
                (result * PRIME)
                        + (this.jobDescription == null ? 43 : this.jobDescription.hashCode());
        result = (result * PRIME) + (this.sqlId == null ? 43 : this.sqlId.hashCode());
        result = (result * PRIME) + (this.planHash == null ? 43 : this.planHash.hashCode());
        result = (result * PRIME) + (this.sqlText == null ? 43 : this.sqlText.hashCode());
        result = (result * PRIME) + (this.sqlHandle == null ? 43 : this.sqlHandle.hashCode());
        result = (result * PRIME) + (this.filterName == null ? 43 : this.filterName.hashCode());
        result = (result * PRIME) + (this.filterValue == null ? 43 : this.filterValue.hashCode());
        result = (result * PRIME) + (this.isFixed == null ? 43 : this.isFixed.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
