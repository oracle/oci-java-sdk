/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * SQL Text type object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlText.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlText extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "version",
        "sqlIdentifier",
        "timeCollected",
        "sqlCommand",
        "exactMatchingSignature",
        "forceMatchingSignature",
        "sqlFullText"
    })
    public SqlText(
            Float version,
            String sqlIdentifier,
            java.util.Date timeCollected,
            String sqlCommand,
            String exactMatchingSignature,
            String forceMatchingSignature,
            String sqlFullText) {
        super();
        this.version = version;
        this.sqlIdentifier = sqlIdentifier;
        this.timeCollected = timeCollected;
        this.sqlCommand = sqlCommand;
        this.exactMatchingSignature = exactMatchingSignature;
        this.forceMatchingSignature = forceMatchingSignature;
        this.sqlFullText = sqlFullText;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Version Example: {@code 1} */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Float version;

        /**
         * Version Example: {@code 1}
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(Float version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** Unique SQL_ID for a SQL Statement. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
        private String sqlIdentifier;

        /**
         * Unique SQL_ID for a SQL Statement.
         *
         * @param sqlIdentifier the value to set
         * @return this builder
         */
        public Builder sqlIdentifier(String sqlIdentifier) {
            this.sqlIdentifier = sqlIdentifier;
            this.__explicitlySet__.add("sqlIdentifier");
            return this;
        }
        /** Collection timestamp Example: {@code "2020-05-06T00:00:00.000Z"} */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        /**
         * Collection timestamp Example: {@code "2020-05-06T00:00:00.000Z"}
         *
         * @param timeCollected the value to set
         * @return this builder
         */
        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /** SQL command Example: {@code "SELECT"} */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlCommand")
        private String sqlCommand;

        /**
         * SQL command Example: {@code "SELECT"}
         *
         * @param sqlCommand the value to set
         * @return this builder
         */
        public Builder sqlCommand(String sqlCommand) {
            this.sqlCommand = sqlCommand;
            this.__explicitlySet__.add("sqlCommand");
            return this;
        }
        /** Exact matching signature Example: {@code "18067345456756876713"} */
        @com.fasterxml.jackson.annotation.JsonProperty("exactMatchingSignature")
        private String exactMatchingSignature;

        /**
         * Exact matching signature Example: {@code "18067345456756876713"}
         *
         * @param exactMatchingSignature the value to set
         * @return this builder
         */
        public Builder exactMatchingSignature(String exactMatchingSignature) {
            this.exactMatchingSignature = exactMatchingSignature;
            this.__explicitlySet__.add("exactMatchingSignature");
            return this;
        }
        /** Force matching signature Example: {@code "18067345456756876713"} */
        @com.fasterxml.jackson.annotation.JsonProperty("forceMatchingSignature")
        private String forceMatchingSignature;

        /**
         * Force matching signature Example: {@code "18067345456756876713"}
         *
         * @param forceMatchingSignature the value to set
         * @return this builder
         */
        public Builder forceMatchingSignature(String forceMatchingSignature) {
            this.forceMatchingSignature = forceMatchingSignature;
            this.__explicitlySet__.add("forceMatchingSignature");
            return this;
        }
        /**
         * Full SQL Text Example: {@code "SELECT
         * username,profile,default_tablespace,temporary_tablespace FROM dba_users"} Disclaimer: SQL
         * text being uploaded explicitly via APIs is not masked. Any sensitive literals contained
         * in the sqlFullText column should be masked prior to ingestion.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlFullText")
        private String sqlFullText;

        /**
         * Full SQL Text Example: {@code "SELECT
         * username,profile,default_tablespace,temporary_tablespace FROM dba_users"} Disclaimer: SQL
         * text being uploaded explicitly via APIs is not masked. Any sensitive literals contained
         * in the sqlFullText column should be masked prior to ingestion.
         *
         * @param sqlFullText the value to set
         * @return this builder
         */
        public Builder sqlFullText(String sqlFullText) {
            this.sqlFullText = sqlFullText;
            this.__explicitlySet__.add("sqlFullText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlText build() {
            SqlText model =
                    new SqlText(
                            this.version,
                            this.sqlIdentifier,
                            this.timeCollected,
                            this.sqlCommand,
                            this.exactMatchingSignature,
                            this.forceMatchingSignature,
                            this.sqlFullText);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlText model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("sqlIdentifier")) {
                this.sqlIdentifier(model.getSqlIdentifier());
            }
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("sqlCommand")) {
                this.sqlCommand(model.getSqlCommand());
            }
            if (model.wasPropertyExplicitlySet("exactMatchingSignature")) {
                this.exactMatchingSignature(model.getExactMatchingSignature());
            }
            if (model.wasPropertyExplicitlySet("forceMatchingSignature")) {
                this.forceMatchingSignature(model.getForceMatchingSignature());
            }
            if (model.wasPropertyExplicitlySet("sqlFullText")) {
                this.sqlFullText(model.getSqlFullText());
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

    /** Version Example: {@code 1} */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Float version;

    /**
     * Version Example: {@code 1}
     *
     * @return the value
     */
    public Float getVersion() {
        return version;
    }

    /** Unique SQL_ID for a SQL Statement. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
    private final String sqlIdentifier;

    /**
     * Unique SQL_ID for a SQL Statement.
     *
     * @return the value
     */
    public String getSqlIdentifier() {
        return sqlIdentifier;
    }

    /** Collection timestamp Example: {@code "2020-05-06T00:00:00.000Z"} */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    private final java.util.Date timeCollected;

    /**
     * Collection timestamp Example: {@code "2020-05-06T00:00:00.000Z"}
     *
     * @return the value
     */
    public java.util.Date getTimeCollected() {
        return timeCollected;
    }

    /** SQL command Example: {@code "SELECT"} */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlCommand")
    private final String sqlCommand;

    /**
     * SQL command Example: {@code "SELECT"}
     *
     * @return the value
     */
    public String getSqlCommand() {
        return sqlCommand;
    }

    /** Exact matching signature Example: {@code "18067345456756876713"} */
    @com.fasterxml.jackson.annotation.JsonProperty("exactMatchingSignature")
    private final String exactMatchingSignature;

    /**
     * Exact matching signature Example: {@code "18067345456756876713"}
     *
     * @return the value
     */
    public String getExactMatchingSignature() {
        return exactMatchingSignature;
    }

    /** Force matching signature Example: {@code "18067345456756876713"} */
    @com.fasterxml.jackson.annotation.JsonProperty("forceMatchingSignature")
    private final String forceMatchingSignature;

    /**
     * Force matching signature Example: {@code "18067345456756876713"}
     *
     * @return the value
     */
    public String getForceMatchingSignature() {
        return forceMatchingSignature;
    }

    /**
     * Full SQL Text Example: {@code "SELECT
     * username,profile,default_tablespace,temporary_tablespace FROM dba_users"} Disclaimer: SQL
     * text being uploaded explicitly via APIs is not masked. Any sensitive literals contained in
     * the sqlFullText column should be masked prior to ingestion.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlFullText")
    private final String sqlFullText;

    /**
     * Full SQL Text Example: {@code "SELECT
     * username,profile,default_tablespace,temporary_tablespace FROM dba_users"} Disclaimer: SQL
     * text being uploaded explicitly via APIs is not masked. Any sensitive literals contained in
     * the sqlFullText column should be masked prior to ingestion.
     *
     * @return the value
     */
    public String getSqlFullText() {
        return sqlFullText;
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
        sb.append("SqlText(");
        sb.append("super=").append(super.toString());
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", sqlIdentifier=").append(String.valueOf(this.sqlIdentifier));
        sb.append(", timeCollected=").append(String.valueOf(this.timeCollected));
        sb.append(", sqlCommand=").append(String.valueOf(this.sqlCommand));
        sb.append(", exactMatchingSignature=").append(String.valueOf(this.exactMatchingSignature));
        sb.append(", forceMatchingSignature=").append(String.valueOf(this.forceMatchingSignature));
        sb.append(", sqlFullText=").append(String.valueOf(this.sqlFullText));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlText)) {
            return false;
        }

        SqlText other = (SqlText) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.sqlIdentifier, other.sqlIdentifier)
                && java.util.Objects.equals(this.timeCollected, other.timeCollected)
                && java.util.Objects.equals(this.sqlCommand, other.sqlCommand)
                && java.util.Objects.equals(
                        this.exactMatchingSignature, other.exactMatchingSignature)
                && java.util.Objects.equals(
                        this.forceMatchingSignature, other.forceMatchingSignature)
                && java.util.Objects.equals(this.sqlFullText, other.sqlFullText)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlIdentifier == null ? 43 : this.sqlIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCollected == null ? 43 : this.timeCollected.hashCode());
        result = (result * PRIME) + (this.sqlCommand == null ? 43 : this.sqlCommand.hashCode());
        result =
                (result * PRIME)
                        + (this.exactMatchingSignature == null
                                ? 43
                                : this.exactMatchingSignature.hashCode());
        result =
                (result * PRIME)
                        + (this.forceMatchingSignature == null
                                ? 43
                                : this.forceMatchingSignature.hashCode());
        result = (result * PRIME) + (this.sqlFullText == null ? 43 : this.sqlFullText.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
