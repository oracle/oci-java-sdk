/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * Specifies the output format for SQL tools, including the generated SQL statement and an optional
 * preview of the query result. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlToolOutput.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "toolOutputType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlToolOutput extends ToolOutput {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("toolId")
        private String toolId;

        public Builder toolId(String toolId) {
            this.toolId = toolId;
            this.__explicitlySet__.add("toolId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("toolName")
        private String toolName;

        public Builder toolName(String toolName) {
            this.toolName = toolName;
            this.__explicitlySet__.add("toolName");
            return this;
        }
        /** Specifies the generated SQL query. */
        @com.fasterxml.jackson.annotation.JsonProperty("generatedSql")
        private String generatedSql;

        /**
         * Specifies the generated SQL query.
         *
         * @param generatedSql the value to set
         * @return this builder
         */
        public Builder generatedSql(String generatedSql) {
            this.generatedSql = generatedSql;
            this.__explicitlySet__.add("generatedSql");
            return this;
        }
        /** Represents preview rows from the SQL query. */
        @com.fasterxml.jackson.annotation.JsonProperty("result")
        private java.util.List<Object> result;

        /**
         * Represents preview rows from the SQL query.
         *
         * @param result the value to set
         * @return this builder
         */
        public Builder result(java.util.List<Object> result) {
            this.result = result;
            this.__explicitlySet__.add("result");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resultFiles")
        private SqlResultFiles resultFiles;

        public Builder resultFiles(SqlResultFiles resultFiles) {
            this.resultFiles = resultFiles;
            this.__explicitlySet__.add("resultFiles");
            return this;
        }
        /** Specifies optional metadata content. */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalInfo")
        private String additionalInfo;

        /**
         * Specifies optional metadata content.
         *
         * @param additionalInfo the value to set
         * @return this builder
         */
        public Builder additionalInfo(String additionalInfo) {
            this.additionalInfo = additionalInfo;
            this.__explicitlySet__.add("additionalInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlToolOutput build() {
            SqlToolOutput model =
                    new SqlToolOutput(
                            this.toolId,
                            this.toolName,
                            this.generatedSql,
                            this.result,
                            this.resultFiles,
                            this.additionalInfo);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlToolOutput model) {
            if (model.wasPropertyExplicitlySet("toolId")) {
                this.toolId(model.getToolId());
            }
            if (model.wasPropertyExplicitlySet("toolName")) {
                this.toolName(model.getToolName());
            }
            if (model.wasPropertyExplicitlySet("generatedSql")) {
                this.generatedSql(model.getGeneratedSql());
            }
            if (model.wasPropertyExplicitlySet("result")) {
                this.result(model.getResult());
            }
            if (model.wasPropertyExplicitlySet("resultFiles")) {
                this.resultFiles(model.getResultFiles());
            }
            if (model.wasPropertyExplicitlySet("additionalInfo")) {
                this.additionalInfo(model.getAdditionalInfo());
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
    public SqlToolOutput(
            String toolId,
            String toolName,
            String generatedSql,
            java.util.List<Object> result,
            SqlResultFiles resultFiles,
            String additionalInfo) {
        super(toolId, toolName);
        this.generatedSql = generatedSql;
        this.result = result;
        this.resultFiles = resultFiles;
        this.additionalInfo = additionalInfo;
    }

    /** Specifies the generated SQL query. */
    @com.fasterxml.jackson.annotation.JsonProperty("generatedSql")
    private final String generatedSql;

    /**
     * Specifies the generated SQL query.
     *
     * @return the value
     */
    public String getGeneratedSql() {
        return generatedSql;
    }

    /** Represents preview rows from the SQL query. */
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    private final java.util.List<Object> result;

    /**
     * Represents preview rows from the SQL query.
     *
     * @return the value
     */
    public java.util.List<Object> getResult() {
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resultFiles")
    private final SqlResultFiles resultFiles;

    public SqlResultFiles getResultFiles() {
        return resultFiles;
    }

    /** Specifies optional metadata content. */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalInfo")
    private final String additionalInfo;

    /**
     * Specifies optional metadata content.
     *
     * @return the value
     */
    public String getAdditionalInfo() {
        return additionalInfo;
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
        sb.append("SqlToolOutput(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", generatedSql=").append(String.valueOf(this.generatedSql));
        sb.append(", result=").append(String.valueOf(this.result));
        sb.append(", resultFiles=").append(String.valueOf(this.resultFiles));
        sb.append(", additionalInfo=").append(String.valueOf(this.additionalInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlToolOutput)) {
            return false;
        }

        SqlToolOutput other = (SqlToolOutput) o;
        return java.util.Objects.equals(this.generatedSql, other.generatedSql)
                && java.util.Objects.equals(this.result, other.result)
                && java.util.Objects.equals(this.resultFiles, other.resultFiles)
                && java.util.Objects.equals(this.additionalInfo, other.additionalInfo)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.generatedSql == null ? 43 : this.generatedSql.hashCode());
        result = (result * PRIME) + (this.result == null ? 43 : this.result.hashCode());
        result = (result * PRIME) + (this.resultFiles == null ? 43 : this.resultFiles.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalInfo == null ? 43 : this.additionalInfo.hashCode());
        return result;
    }
}
