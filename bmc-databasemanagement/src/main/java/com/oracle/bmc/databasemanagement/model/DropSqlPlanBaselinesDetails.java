/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to drop SQL plan baselines. <br>
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
        builder = DropSqlPlanBaselinesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DropSqlPlanBaselinesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sqlHandle", "planName", "credentials"})
    public DropSqlPlanBaselinesDetails(
            String sqlHandle, String planName, ManagedDatabaseCredential credentials) {
        super();
        this.sqlHandle = sqlHandle;
        this.planName = planName;
        this.credentials = credentials;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The SQL statement handle. It identifies plans associated with a SQL statement that are to
         * be dropped. If {@code null} then {@code planName} must be specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlHandle")
        private String sqlHandle;

        /**
         * The SQL statement handle. It identifies plans associated with a SQL statement that are to
         * be dropped. If {@code null} then {@code planName} must be specified.
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
         * The plan name. It identifies a specific plan. If {@code null' then all plans associated
         * with the SQL statement identified by }sqlHandle' are dropped.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("planName")
        private String planName;

        /**
         * The plan name. It identifies a specific plan. If {@code null' then all plans associated
         * with the SQL statement identified by }sqlHandle' are dropped.
         *
         * @param planName the value to set
         * @return this builder
         */
        public Builder planName(String planName) {
            this.planName = planName;
            this.__explicitlySet__.add("planName");
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

        public DropSqlPlanBaselinesDetails build() {
            DropSqlPlanBaselinesDetails model =
                    new DropSqlPlanBaselinesDetails(
                            this.sqlHandle, this.planName, this.credentials);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DropSqlPlanBaselinesDetails model) {
            if (model.wasPropertyExplicitlySet("sqlHandle")) {
                this.sqlHandle(model.getSqlHandle());
            }
            if (model.wasPropertyExplicitlySet("planName")) {
                this.planName(model.getPlanName());
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

    /**
     * The SQL statement handle. It identifies plans associated with a SQL statement that are to be
     * dropped. If {@code null} then {@code planName} must be specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlHandle")
    private final String sqlHandle;

    /**
     * The SQL statement handle. It identifies plans associated with a SQL statement that are to be
     * dropped. If {@code null} then {@code planName} must be specified.
     *
     * @return the value
     */
    public String getSqlHandle() {
        return sqlHandle;
    }

    /**
     * The plan name. It identifies a specific plan. If {@code null' then all plans associated with
     * the SQL statement identified by }sqlHandle' are dropped.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("planName")
    private final String planName;

    /**
     * The plan name. It identifies a specific plan. If {@code null' then all plans associated with
     * the SQL statement identified by }sqlHandle' are dropped.
     *
     * @return the value
     */
    public String getPlanName() {
        return planName;
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
        sb.append("DropSqlPlanBaselinesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sqlHandle=").append(String.valueOf(this.sqlHandle));
        sb.append(", planName=").append(String.valueOf(this.planName));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DropSqlPlanBaselinesDetails)) {
            return false;
        }

        DropSqlPlanBaselinesDetails other = (DropSqlPlanBaselinesDetails) o;
        return java.util.Objects.equals(this.sqlHandle, other.sqlHandle)
                && java.util.Objects.equals(this.planName, other.planName)
                && java.util.Objects.equals(this.credentials, other.credentials)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sqlHandle == null ? 43 : this.sqlHandle.hashCode());
        result = (result * PRIME) + (this.planName == null ? 43 : this.planName.hashCode());
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
