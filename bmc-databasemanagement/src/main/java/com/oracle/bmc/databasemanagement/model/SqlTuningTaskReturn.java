/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The returned object for starting or cloning a SQL tuning advisor task. <br>
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
        builder = SqlTuningTaskReturn.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlTuningTaskReturn
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sqlTuningTaskId"})
    public SqlTuningTaskReturn(Long sqlTuningTaskId) {
        super();
        this.sqlTuningTaskId = sqlTuningTaskId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The identifier of the task being started or cloned. This is not the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
         * retrieved from the following endpoint {@link
         * #listSqlTuningAdvisorTasks(ListSqlTuningAdvisorTasksRequest) listSqlTuningAdvisorTasks}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningTaskId")
        private Long sqlTuningTaskId;

        /**
         * The identifier of the task being started or cloned. This is not the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
         * retrieved from the following endpoint {@link
         * #listSqlTuningAdvisorTasks(ListSqlTuningAdvisorTasksRequest) listSqlTuningAdvisorTasks}.
         *
         * @param sqlTuningTaskId the value to set
         * @return this builder
         */
        public Builder sqlTuningTaskId(Long sqlTuningTaskId) {
            this.sqlTuningTaskId = sqlTuningTaskId;
            this.__explicitlySet__.add("sqlTuningTaskId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningTaskReturn build() {
            SqlTuningTaskReturn model = new SqlTuningTaskReturn(this.sqlTuningTaskId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningTaskReturn model) {
            if (model.wasPropertyExplicitlySet("sqlTuningTaskId")) {
                this.sqlTuningTaskId(model.getSqlTuningTaskId());
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
     * The identifier of the task being started or cloned. This is not the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
     * retrieved from the following endpoint {@link
     * #listSqlTuningAdvisorTasks(ListSqlTuningAdvisorTasksRequest) listSqlTuningAdvisorTasks}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningTaskId")
    private final Long sqlTuningTaskId;

    /**
     * The identifier of the task being started or cloned. This is not the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
     * retrieved from the following endpoint {@link
     * #listSqlTuningAdvisorTasks(ListSqlTuningAdvisorTasksRequest) listSqlTuningAdvisorTasks}.
     *
     * @return the value
     */
    public Long getSqlTuningTaskId() {
        return sqlTuningTaskId;
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
        sb.append("SqlTuningTaskReturn(");
        sb.append("super=").append(super.toString());
        sb.append("sqlTuningTaskId=").append(String.valueOf(this.sqlTuningTaskId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningTaskReturn)) {
            return false;
        }

        SqlTuningTaskReturn other = (SqlTuningTaskReturn) o;
        return java.util.Objects.equals(this.sqlTuningTaskId, other.sqlTuningTaskId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sqlTuningTaskId == null ? 43 : this.sqlTuningTaskId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
