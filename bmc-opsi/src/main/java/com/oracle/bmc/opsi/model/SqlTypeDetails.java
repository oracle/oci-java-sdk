/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * SQL details <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlTypeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlTypeDetails extends RelatedObjectTypeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** SQL identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlId")
        private String sqlId;

        /**
         * SQL identifier
         *
         * @param sqlId the value to set
         * @return this builder
         */
        public Builder sqlId(String sqlId) {
            this.sqlId = sqlId;
            this.__explicitlySet__.add("sqlId");
            return this;
        }
        /** First 3800 characters of the SQL text */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
        private String sqlText;

        /**
         * First 3800 characters of the SQL text
         *
         * @param sqlText the value to set
         * @return this builder
         */
        public Builder sqlText(String sqlText) {
            this.sqlText = sqlText;
            this.__explicitlySet__.add("sqlText");
            return this;
        }
        /** SQL identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("isSqlTextTruncated")
        private Boolean isSqlTextTruncated;

        /**
         * SQL identifier
         *
         * @param isSqlTextTruncated the value to set
         * @return this builder
         */
        public Builder isSqlTextTruncated(Boolean isSqlTextTruncated) {
            this.isSqlTextTruncated = isSqlTextTruncated;
            this.__explicitlySet__.add("isSqlTextTruncated");
            return this;
        }
        /** SQL command name (such as SELECT, INSERT) */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlCommand")
        private String sqlCommand;

        /**
         * SQL command name (such as SELECT, INSERT)
         *
         * @param sqlCommand the value to set
         * @return this builder
         */
        public Builder sqlCommand(String sqlCommand) {
            this.sqlCommand = sqlCommand;
            this.__explicitlySet__.add("sqlCommand");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTypeDetails build() {
            SqlTypeDetails model =
                    new SqlTypeDetails(
                            this.sqlId, this.sqlText, this.isSqlTextTruncated, this.sqlCommand);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTypeDetails model) {
            if (model.wasPropertyExplicitlySet("sqlId")) {
                this.sqlId(model.getSqlId());
            }
            if (model.wasPropertyExplicitlySet("sqlText")) {
                this.sqlText(model.getSqlText());
            }
            if (model.wasPropertyExplicitlySet("isSqlTextTruncated")) {
                this.isSqlTextTruncated(model.getIsSqlTextTruncated());
            }
            if (model.wasPropertyExplicitlySet("sqlCommand")) {
                this.sqlCommand(model.getSqlCommand());
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
    public SqlTypeDetails(
            String sqlId, String sqlText, Boolean isSqlTextTruncated, String sqlCommand) {
        super();
        this.sqlId = sqlId;
        this.sqlText = sqlText;
        this.isSqlTextTruncated = isSqlTextTruncated;
        this.sqlCommand = sqlCommand;
    }

    /** SQL identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlId")
    private final String sqlId;

    /**
     * SQL identifier
     *
     * @return the value
     */
    public String getSqlId() {
        return sqlId;
    }

    /** First 3800 characters of the SQL text */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
    private final String sqlText;

    /**
     * First 3800 characters of the SQL text
     *
     * @return the value
     */
    public String getSqlText() {
        return sqlText;
    }

    /** SQL identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("isSqlTextTruncated")
    private final Boolean isSqlTextTruncated;

    /**
     * SQL identifier
     *
     * @return the value
     */
    public Boolean getIsSqlTextTruncated() {
        return isSqlTextTruncated;
    }

    /** SQL command name (such as SELECT, INSERT) */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlCommand")
    private final String sqlCommand;

    /**
     * SQL command name (such as SELECT, INSERT)
     *
     * @return the value
     */
    public String getSqlCommand() {
        return sqlCommand;
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
        sb.append("SqlTypeDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sqlId=").append(String.valueOf(this.sqlId));
        sb.append(", sqlText=").append(String.valueOf(this.sqlText));
        sb.append(", isSqlTextTruncated=").append(String.valueOf(this.isSqlTextTruncated));
        sb.append(", sqlCommand=").append(String.valueOf(this.sqlCommand));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTypeDetails)) {
            return false;
        }

        SqlTypeDetails other = (SqlTypeDetails) o;
        return java.util.Objects.equals(this.sqlId, other.sqlId)
                && java.util.Objects.equals(this.sqlText, other.sqlText)
                && java.util.Objects.equals(this.isSqlTextTruncated, other.isSqlTextTruncated)
                && java.util.Objects.equals(this.sqlCommand, other.sqlCommand)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sqlId == null ? 43 : this.sqlId.hashCode());
        result = (result * PRIME) + (this.sqlText == null ? 43 : this.sqlText.hashCode());
        result =
                (result * PRIME)
                        + (this.isSqlTextTruncated == null
                                ? 43
                                : this.isSqlTextTruncated.hashCode());
        result = (result * PRIME) + (this.sqlCommand == null ? 43 : this.sqlCommand.hashCode());
        return result;
    }
}
