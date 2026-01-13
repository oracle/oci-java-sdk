/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The SQL CPU activity from the Exadata storage server. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlCpuActivity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlCpuActivity
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"databaseName", "sqlId", "cpuActivity"})
    public SqlCpuActivity(String databaseName, String sqlId, Float cpuActivity) {
        super();
        this.databaseName = databaseName;
        this.sqlId = sqlId;
        this.cpuActivity = cpuActivity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The database name. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * The database name.
         *
         * @param databaseName the value to set
         * @return this builder
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /** The SQL ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlId")
        private String sqlId;

        /**
         * The SQL ID.
         *
         * @param sqlId the value to set
         * @return this builder
         */
        public Builder sqlId(String sqlId) {
            this.sqlId = sqlId;
            this.__explicitlySet__.add("sqlId");
            return this;
        }
        /** The CPU activity percentage. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuActivity")
        private Float cpuActivity;

        /**
         * The CPU activity percentage.
         *
         * @param cpuActivity the value to set
         * @return this builder
         */
        public Builder cpuActivity(Float cpuActivity) {
            this.cpuActivity = cpuActivity;
            this.__explicitlySet__.add("cpuActivity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlCpuActivity build() {
            SqlCpuActivity model =
                    new SqlCpuActivity(this.databaseName, this.sqlId, this.cpuActivity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlCpuActivity model) {
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("sqlId")) {
                this.sqlId(model.getSqlId());
            }
            if (model.wasPropertyExplicitlySet("cpuActivity")) {
                this.cpuActivity(model.getCpuActivity());
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

    /** The database name. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * The database name.
     *
     * @return the value
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /** The SQL ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlId")
    private final String sqlId;

    /**
     * The SQL ID.
     *
     * @return the value
     */
    public String getSqlId() {
        return sqlId;
    }

    /** The CPU activity percentage. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuActivity")
    private final Float cpuActivity;

    /**
     * The CPU activity percentage.
     *
     * @return the value
     */
    public Float getCpuActivity() {
        return cpuActivity;
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
        sb.append("SqlCpuActivity(");
        sb.append("super=").append(super.toString());
        sb.append("databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", sqlId=").append(String.valueOf(this.sqlId));
        sb.append(", cpuActivity=").append(String.valueOf(this.cpuActivity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlCpuActivity)) {
            return false;
        }

        SqlCpuActivity other = (SqlCpuActivity) o;
        return java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.sqlId, other.sqlId)
                && java.util.Objects.equals(this.cpuActivity, other.cpuActivity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result = (result * PRIME) + (this.sqlId == null ? 43 : this.sqlId.hashCode());
        result = (result * PRIME) + (this.cpuActivity == null ? 43 : this.cpuActivity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
