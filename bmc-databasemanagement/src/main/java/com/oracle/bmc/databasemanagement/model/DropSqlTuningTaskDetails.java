/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The request to drop a SQL tuning task. It takes either credentialDetails or databaseCredential.
 * It's recommended to provide databaseCredential <br>
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
        builder = DropSqlTuningTaskDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DropSqlTuningTaskDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"taskId", "credentialDetails", "databaseCredential"})
    public DropSqlTuningTaskDetails(
            Long taskId,
            SqlTuningTaskCredentialDetails credentialDetails,
            DatabaseCredentialDetails databaseCredential) {
        super();
        this.taskId = taskId;
        this.credentialDetails = credentialDetails;
        this.databaseCredential = databaseCredential;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The identifier of the SQL tuning task being dropped. This is not the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
         * retrieved from the following endpoint {@link
         * #listSqlTuningAdvisorTasks(ListSqlTuningAdvisorTasksRequest) listSqlTuningAdvisorTasks}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("taskId")
        private Long taskId;

        /**
         * The identifier of the SQL tuning task being dropped. This is not the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
         * retrieved from the following endpoint {@link
         * #listSqlTuningAdvisorTasks(ListSqlTuningAdvisorTasksRequest) listSqlTuningAdvisorTasks}.
         *
         * @param taskId the value to set
         * @return this builder
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            this.__explicitlySet__.add("taskId");
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

        public DropSqlTuningTaskDetails build() {
            DropSqlTuningTaskDetails model =
                    new DropSqlTuningTaskDetails(
                            this.taskId, this.credentialDetails, this.databaseCredential);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DropSqlTuningTaskDetails model) {
            if (model.wasPropertyExplicitlySet("taskId")) {
                this.taskId(model.getTaskId());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The identifier of the SQL tuning task being dropped. This is not the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
     * retrieved from the following endpoint {@link
     * #listSqlTuningAdvisorTasks(ListSqlTuningAdvisorTasksRequest) listSqlTuningAdvisorTasks}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("taskId")
    private final Long taskId;

    /**
     * The identifier of the SQL tuning task being dropped. This is not the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
     * retrieved from the following endpoint {@link
     * #listSqlTuningAdvisorTasks(ListSqlTuningAdvisorTasksRequest) listSqlTuningAdvisorTasks}.
     *
     * @return the value
     */
    public Long getTaskId() {
        return taskId;
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
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DropSqlTuningTaskDetails(");
        sb.append("super=").append(super.toString());
        sb.append("taskId=").append(String.valueOf(this.taskId));
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
        if (!(o instanceof DropSqlTuningTaskDetails)) {
            return false;
        }

        DropSqlTuningTaskDetails other = (DropSqlTuningTaskDetails) o;
        return java.util.Objects.equals(this.taskId, other.taskId)
                && java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.databaseCredential, other.databaseCredential)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.taskId == null ? 43 : this.taskId.hashCode());
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
