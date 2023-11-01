/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Query Properties applicable to SQL type of collection method <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SqlUpdateQueryProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "collectionMethod")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlUpdateQueryProperties extends MetricExtensionUpdateQueryProperties {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of SQL data collection method i.e. either a Statement or SQL Script File */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlType")
        private SqlQueryTypes sqlType;

        /**
         * Type of SQL data collection method i.e. either a Statement or SQL Script File
         *
         * @param sqlType the value to set
         * @return this builder
         */
        public Builder sqlType(SqlQueryTypes sqlType) {
            this.sqlType = sqlType;
            this.__explicitlySet__.add("sqlType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlDetails")
        private SqlDetails sqlDetails;

        public Builder sqlDetails(SqlDetails sqlDetails) {
            this.sqlDetails = sqlDetails;
            this.__explicitlySet__.add("sqlDetails");
            return this;
        }
        /** List of values and position of PL/SQL procedure IN parameters */
        @com.fasterxml.jackson.annotation.JsonProperty("inParamDetails")
        private java.util.List<SqlInParamDetails> inParamDetails;

        /**
         * List of values and position of PL/SQL procedure IN parameters
         *
         * @param inParamDetails the value to set
         * @return this builder
         */
        public Builder inParamDetails(java.util.List<SqlInParamDetails> inParamDetails) {
            this.inParamDetails = inParamDetails;
            this.__explicitlySet__.add("inParamDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outParamDetails")
        private SqlOutParamDetails outParamDetails;

        public Builder outParamDetails(SqlOutParamDetails outParamDetails) {
            this.outParamDetails = outParamDetails;
            this.__explicitlySet__.add("outParamDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlUpdateQueryProperties build() {
            SqlUpdateQueryProperties model =
                    new SqlUpdateQueryProperties(
                            this.sqlType,
                            this.sqlDetails,
                            this.inParamDetails,
                            this.outParamDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlUpdateQueryProperties model) {
            if (model.wasPropertyExplicitlySet("sqlType")) {
                this.sqlType(model.getSqlType());
            }
            if (model.wasPropertyExplicitlySet("sqlDetails")) {
                this.sqlDetails(model.getSqlDetails());
            }
            if (model.wasPropertyExplicitlySet("inParamDetails")) {
                this.inParamDetails(model.getInParamDetails());
            }
            if (model.wasPropertyExplicitlySet("outParamDetails")) {
                this.outParamDetails(model.getOutParamDetails());
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
    public SqlUpdateQueryProperties(
            SqlQueryTypes sqlType,
            SqlDetails sqlDetails,
            java.util.List<SqlInParamDetails> inParamDetails,
            SqlOutParamDetails outParamDetails) {
        super();
        this.sqlType = sqlType;
        this.sqlDetails = sqlDetails;
        this.inParamDetails = inParamDetails;
        this.outParamDetails = outParamDetails;
    }

    /** Type of SQL data collection method i.e. either a Statement or SQL Script File */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlType")
    private final SqlQueryTypes sqlType;

    /**
     * Type of SQL data collection method i.e. either a Statement or SQL Script File
     *
     * @return the value
     */
    public SqlQueryTypes getSqlType() {
        return sqlType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sqlDetails")
    private final SqlDetails sqlDetails;

    public SqlDetails getSqlDetails() {
        return sqlDetails;
    }

    /** List of values and position of PL/SQL procedure IN parameters */
    @com.fasterxml.jackson.annotation.JsonProperty("inParamDetails")
    private final java.util.List<SqlInParamDetails> inParamDetails;

    /**
     * List of values and position of PL/SQL procedure IN parameters
     *
     * @return the value
     */
    public java.util.List<SqlInParamDetails> getInParamDetails() {
        return inParamDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outParamDetails")
    private final SqlOutParamDetails outParamDetails;

    public SqlOutParamDetails getOutParamDetails() {
        return outParamDetails;
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
        sb.append("SqlUpdateQueryProperties(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sqlType=").append(String.valueOf(this.sqlType));
        sb.append(", sqlDetails=").append(String.valueOf(this.sqlDetails));
        sb.append(", inParamDetails=").append(String.valueOf(this.inParamDetails));
        sb.append(", outParamDetails=").append(String.valueOf(this.outParamDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlUpdateQueryProperties)) {
            return false;
        }

        SqlUpdateQueryProperties other = (SqlUpdateQueryProperties) o;
        return java.util.Objects.equals(this.sqlType, other.sqlType)
                && java.util.Objects.equals(this.sqlDetails, other.sqlDetails)
                && java.util.Objects.equals(this.inParamDetails, other.inParamDetails)
                && java.util.Objects.equals(this.outParamDetails, other.outParamDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sqlType == null ? 43 : this.sqlType.hashCode());
        result = (result * PRIME) + (this.sqlDetails == null ? 43 : this.sqlDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.inParamDetails == null ? 43 : this.inParamDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.outParamDetails == null ? 43 : this.outParamDetails.hashCode());
        return result;
    }
}
