/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to load plans from Automatic Workload Repository (AWR).
 * It takes either credentials or databaseCredential. It's recommended to provide databaseCredential
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LoadSqlPlanBaselinesFromAwrDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LoadSqlPlanBaselinesFromAwrDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "jobName",
        "jobDescription",
        "beginSnapshot",
        "endSnapshot",
        "sqlTextFilter",
        "isFixed",
        "isEnabled",
        "credentials",
        "databaseCredential"
    })
    public LoadSqlPlanBaselinesFromAwrDetails(
            String jobName,
            String jobDescription,
            Integer beginSnapshot,
            Integer endSnapshot,
            String sqlTextFilter,
            Boolean isFixed,
            Boolean isEnabled,
            ManagedDatabaseCredential credentials,
            DatabaseCredentialDetails databaseCredential) {
        super();
        this.jobName = jobName;
        this.jobDescription = jobDescription;
        this.beginSnapshot = beginSnapshot;
        this.endSnapshot = endSnapshot;
        this.sqlTextFilter = sqlTextFilter;
        this.isFixed = isFixed;
        this.isEnabled = isEnabled;
        this.credentials = credentials;
        this.databaseCredential = databaseCredential;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the database job used for loading SQL plan baselines.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobName")
        private String jobName;

        /**
         * The name of the database job used for loading SQL plan baselines.
         * @param jobName the value to set
         * @return this builder
         **/
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            this.__explicitlySet__.add("jobName");
            return this;
        }
        /**
         * The description of the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobDescription")
        private String jobDescription;

        /**
         * The description of the job.
         * @param jobDescription the value to set
         * @return this builder
         **/
        public Builder jobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            this.__explicitlySet__.add("jobDescription");
            return this;
        }
        /**
         * The begin snapshot.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("beginSnapshot")
        private Integer beginSnapshot;

        /**
         * The begin snapshot.
         * @param beginSnapshot the value to set
         * @return this builder
         **/
        public Builder beginSnapshot(Integer beginSnapshot) {
            this.beginSnapshot = beginSnapshot;
            this.__explicitlySet__.add("beginSnapshot");
            return this;
        }
        /**
         * The end snapshot.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endSnapshot")
        private Integer endSnapshot;

        /**
         * The end snapshot.
         * @param endSnapshot the value to set
         * @return this builder
         **/
        public Builder endSnapshot(Integer endSnapshot) {
            this.endSnapshot = endSnapshot;
            this.__explicitlySet__.add("endSnapshot");
            return this;
        }
        /**
         * A filter applied to AWR to select only qualifying plans to be loaded.
         * By default all plans in AWR are selected. The filter can take the form of
         * any {@code WHERE} clause predicate that can be specified against the column
         * {@code DBA_HIST_SQLTEXT.SQL_TEXT}. An example is {@code sql_text like 'SELECT %'}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlTextFilter")
        private String sqlTextFilter;

        /**
         * A filter applied to AWR to select only qualifying plans to be loaded.
         * By default all plans in AWR are selected. The filter can take the form of
         * any {@code WHERE} clause predicate that can be specified against the column
         * {@code DBA_HIST_SQLTEXT.SQL_TEXT}. An example is {@code sql_text like 'SELECT %'}.
         *
         * @param sqlTextFilter the value to set
         * @return this builder
         **/
        public Builder sqlTextFilter(String sqlTextFilter) {
            this.sqlTextFilter = sqlTextFilter;
            this.__explicitlySet__.add("sqlTextFilter");
            return this;
        }
        /**
         * Indicates whether the plans are loaded as fixed plans ({@code true}) or non-fixed plans ({@code false}).
         * By default, they are loaded as non-fixed plans.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFixed")
        private Boolean isFixed;

        /**
         * Indicates whether the plans are loaded as fixed plans ({@code true}) or non-fixed plans ({@code false}).
         * By default, they are loaded as non-fixed plans.
         *
         * @param isFixed the value to set
         * @return this builder
         **/
        public Builder isFixed(Boolean isFixed) {
            this.isFixed = isFixed;
            this.__explicitlySet__.add("isFixed");
            return this;
        }
        /**
         * Indicates whether the loaded plans are enabled ({@code true}) or not ({@code false}).
         * By default, they are enabled.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Indicates whether the loaded plans are enabled ({@code true}) or not ({@code false}).
         * By default, they are enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         **/
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

        @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
        private DatabaseCredentialDetails databaseCredential;

        public Builder databaseCredential(DatabaseCredentialDetails databaseCredential) {
            this.databaseCredential = databaseCredential;
            this.__explicitlySet__.add("databaseCredential");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoadSqlPlanBaselinesFromAwrDetails build() {
            LoadSqlPlanBaselinesFromAwrDetails model =
                    new LoadSqlPlanBaselinesFromAwrDetails(
                            this.jobName,
                            this.jobDescription,
                            this.beginSnapshot,
                            this.endSnapshot,
                            this.sqlTextFilter,
                            this.isFixed,
                            this.isEnabled,
                            this.credentials,
                            this.databaseCredential);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoadSqlPlanBaselinesFromAwrDetails model) {
            if (model.wasPropertyExplicitlySet("jobName")) {
                this.jobName(model.getJobName());
            }
            if (model.wasPropertyExplicitlySet("jobDescription")) {
                this.jobDescription(model.getJobDescription());
            }
            if (model.wasPropertyExplicitlySet("beginSnapshot")) {
                this.beginSnapshot(model.getBeginSnapshot());
            }
            if (model.wasPropertyExplicitlySet("endSnapshot")) {
                this.endSnapshot(model.getEndSnapshot());
            }
            if (model.wasPropertyExplicitlySet("sqlTextFilter")) {
                this.sqlTextFilter(model.getSqlTextFilter());
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
            if (model.wasPropertyExplicitlySet("databaseCredential")) {
                this.databaseCredential(model.getDatabaseCredential());
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
     * The name of the database job used for loading SQL plan baselines.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobName")
    private final String jobName;

    /**
     * The name of the database job used for loading SQL plan baselines.
     * @return the value
     **/
    public String getJobName() {
        return jobName;
    }

    /**
     * The description of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobDescription")
    private final String jobDescription;

    /**
     * The description of the job.
     * @return the value
     **/
    public String getJobDescription() {
        return jobDescription;
    }

    /**
     * The begin snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("beginSnapshot")
    private final Integer beginSnapshot;

    /**
     * The begin snapshot.
     * @return the value
     **/
    public Integer getBeginSnapshot() {
        return beginSnapshot;
    }

    /**
     * The end snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endSnapshot")
    private final Integer endSnapshot;

    /**
     * The end snapshot.
     * @return the value
     **/
    public Integer getEndSnapshot() {
        return endSnapshot;
    }

    /**
     * A filter applied to AWR to select only qualifying plans to be loaded.
     * By default all plans in AWR are selected. The filter can take the form of
     * any {@code WHERE} clause predicate that can be specified against the column
     * {@code DBA_HIST_SQLTEXT.SQL_TEXT}. An example is {@code sql_text like 'SELECT %'}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlTextFilter")
    private final String sqlTextFilter;

    /**
     * A filter applied to AWR to select only qualifying plans to be loaded.
     * By default all plans in AWR are selected. The filter can take the form of
     * any {@code WHERE} clause predicate that can be specified against the column
     * {@code DBA_HIST_SQLTEXT.SQL_TEXT}. An example is {@code sql_text like 'SELECT %'}.
     *
     * @return the value
     **/
    public String getSqlTextFilter() {
        return sqlTextFilter;
    }

    /**
     * Indicates whether the plans are loaded as fixed plans ({@code true}) or non-fixed plans ({@code false}).
     * By default, they are loaded as non-fixed plans.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFixed")
    private final Boolean isFixed;

    /**
     * Indicates whether the plans are loaded as fixed plans ({@code true}) or non-fixed plans ({@code false}).
     * By default, they are loaded as non-fixed plans.
     *
     * @return the value
     **/
    public Boolean getIsFixed() {
        return isFixed;
    }

    /**
     * Indicates whether the loaded plans are enabled ({@code true}) or not ({@code false}).
     * By default, they are enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Indicates whether the loaded plans are enabled ({@code true}) or not ({@code false}).
     * By default, they are enabled.
     *
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    private final ManagedDatabaseCredential credentials;

    public ManagedDatabaseCredential getCredentials() {
        return credentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
    private final DatabaseCredentialDetails databaseCredential;

    public DatabaseCredentialDetails getDatabaseCredential() {
        return databaseCredential;
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
        sb.append("LoadSqlPlanBaselinesFromAwrDetails(");
        sb.append("super=").append(super.toString());
        sb.append("jobName=").append(String.valueOf(this.jobName));
        sb.append(", jobDescription=").append(String.valueOf(this.jobDescription));
        sb.append(", beginSnapshot=").append(String.valueOf(this.beginSnapshot));
        sb.append(", endSnapshot=").append(String.valueOf(this.endSnapshot));
        sb.append(", sqlTextFilter=").append(String.valueOf(this.sqlTextFilter));
        sb.append(", isFixed=").append(String.valueOf(this.isFixed));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(", databaseCredential=").append(String.valueOf(this.databaseCredential));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoadSqlPlanBaselinesFromAwrDetails)) {
            return false;
        }

        LoadSqlPlanBaselinesFromAwrDetails other = (LoadSqlPlanBaselinesFromAwrDetails) o;
        return java.util.Objects.equals(this.jobName, other.jobName)
                && java.util.Objects.equals(this.jobDescription, other.jobDescription)
                && java.util.Objects.equals(this.beginSnapshot, other.beginSnapshot)
                && java.util.Objects.equals(this.endSnapshot, other.endSnapshot)
                && java.util.Objects.equals(this.sqlTextFilter, other.sqlTextFilter)
                && java.util.Objects.equals(this.isFixed, other.isFixed)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.credentials, other.credentials)
                && java.util.Objects.equals(this.databaseCredential, other.databaseCredential)
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
        result =
                (result * PRIME)
                        + (this.beginSnapshot == null ? 43 : this.beginSnapshot.hashCode());
        result = (result * PRIME) + (this.endSnapshot == null ? 43 : this.endSnapshot.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlTextFilter == null ? 43 : this.sqlTextFilter.hashCode());
        result = (result * PRIME) + (this.isFixed == null ? 43 : this.isFixed.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseCredential == null
                                ? 43
                                : this.databaseCredential.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
