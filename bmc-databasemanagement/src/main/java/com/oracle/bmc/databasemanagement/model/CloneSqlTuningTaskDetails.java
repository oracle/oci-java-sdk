/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The request to clone and run a SQL tuning task. The new task uses the same inputs as the one being cloned.
 * It takes either credentialDetails or databaseCredential. It's recommended to provide databaseCredential
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
    builder = CloneSqlTuningTaskDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CloneSqlTuningTaskDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "taskName",
        "originalTaskId",
        "taskDescription",
        "credentialDetails",
        "databaseCredential"
    })
    public CloneSqlTuningTaskDetails(
            String taskName,
            Long originalTaskId,
            String taskDescription,
            SqlTuningTaskCredentialDetails credentialDetails,
            DatabaseCredentialDetails databaseCredential) {
        super();
        this.taskName = taskName;
        this.originalTaskId = originalTaskId;
        this.taskDescription = taskDescription;
        this.credentialDetails = credentialDetails;
        this.databaseCredential = databaseCredential;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the SQL tuning task. The name is unique per user in a database, and it is case-sensitive.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("taskName")
        private String taskName;

        /**
         * The name of the SQL tuning task. The name is unique per user in a database, and it is case-sensitive.
         * @param taskName the value to set
         * @return this builder
         **/
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            this.__explicitlySet__.add("taskName");
            return this;
        }
        /**
         * The identifier of the SQL tuning task being cloned. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * It can be retrieved from the following endpoint
         * {@link #listSqlTuningAdvisorTasks(ListSqlTuningAdvisorTasksRequest) listSqlTuningAdvisorTasks}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("originalTaskId")
        private Long originalTaskId;

        /**
         * The identifier of the SQL tuning task being cloned. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * It can be retrieved from the following endpoint
         * {@link #listSqlTuningAdvisorTasks(ListSqlTuningAdvisorTasksRequest) listSqlTuningAdvisorTasks}.
         *
         * @param originalTaskId the value to set
         * @return this builder
         **/
        public Builder originalTaskId(Long originalTaskId) {
            this.originalTaskId = originalTaskId;
            this.__explicitlySet__.add("originalTaskId");
            return this;
        }
        /**
         * The description of the SQL tuning task.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("taskDescription")
        private String taskDescription;

        /**
         * The description of the SQL tuning task.
         * @param taskDescription the value to set
         * @return this builder
         **/
        public Builder taskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            this.__explicitlySet__.add("taskDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private SqlTuningTaskCredentialDetails credentialDetails;

        public Builder credentialDetails(SqlTuningTaskCredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
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

        public CloneSqlTuningTaskDetails build() {
            CloneSqlTuningTaskDetails model =
                    new CloneSqlTuningTaskDetails(
                            this.taskName,
                            this.originalTaskId,
                            this.taskDescription,
                            this.credentialDetails,
                            this.databaseCredential);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloneSqlTuningTaskDetails model) {
            if (model.wasPropertyExplicitlySet("taskName")) {
                this.taskName(model.getTaskName());
            }
            if (model.wasPropertyExplicitlySet("originalTaskId")) {
                this.originalTaskId(model.getOriginalTaskId());
            }
            if (model.wasPropertyExplicitlySet("taskDescription")) {
                this.taskDescription(model.getTaskDescription());
            }
            if (model.wasPropertyExplicitlySet("credentialDetails")) {
                this.credentialDetails(model.getCredentialDetails());
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
     * The name of the SQL tuning task. The name is unique per user in a database, and it is case-sensitive.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskName")
    private final String taskName;

    /**
     * The name of the SQL tuning task. The name is unique per user in a database, and it is case-sensitive.
     * @return the value
     **/
    public String getTaskName() {
        return taskName;
    }

    /**
     * The identifier of the SQL tuning task being cloned. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint
     * {@link #listSqlTuningAdvisorTasks(ListSqlTuningAdvisorTasksRequest) listSqlTuningAdvisorTasks}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originalTaskId")
    private final Long originalTaskId;

    /**
     * The identifier of the SQL tuning task being cloned. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint
     * {@link #listSqlTuningAdvisorTasks(ListSqlTuningAdvisorTasksRequest) listSqlTuningAdvisorTasks}.
     *
     * @return the value
     **/
    public Long getOriginalTaskId() {
        return originalTaskId;
    }

    /**
     * The description of the SQL tuning task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskDescription")
    private final String taskDescription;

    /**
     * The description of the SQL tuning task.
     * @return the value
     **/
    public String getTaskDescription() {
        return taskDescription;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final SqlTuningTaskCredentialDetails credentialDetails;

    public SqlTuningTaskCredentialDetails getCredentialDetails() {
        return credentialDetails;
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
        sb.append("CloneSqlTuningTaskDetails(");
        sb.append("super=").append(super.toString());
        sb.append("taskName=").append(String.valueOf(this.taskName));
        sb.append(", originalTaskId=").append(String.valueOf(this.originalTaskId));
        sb.append(", taskDescription=").append(String.valueOf(this.taskDescription));
        sb.append(", credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", databaseCredential=").append(String.valueOf(this.databaseCredential));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloneSqlTuningTaskDetails)) {
            return false;
        }

        CloneSqlTuningTaskDetails other = (CloneSqlTuningTaskDetails) o;
        return java.util.Objects.equals(this.taskName, other.taskName)
                && java.util.Objects.equals(this.originalTaskId, other.originalTaskId)
                && java.util.Objects.equals(this.taskDescription, other.taskDescription)
                && java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.databaseCredential, other.databaseCredential)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.taskName == null ? 43 : this.taskName.hashCode());
        result =
                (result * PRIME)
                        + (this.originalTaskId == null ? 43 : this.originalTaskId.hashCode());
        result =
                (result * PRIME)
                        + (this.taskDescription == null ? 43 : this.taskDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseCredential == null
                                ? 43
                                : this.databaseCredential.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
