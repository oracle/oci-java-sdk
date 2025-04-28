/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The status of a Sql tuning set admin action. <br>
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
        builder = SqlTuningSetAdminActionStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlTuningSetAdminActionStatus
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "status",
        "successMessage",
        "errorCode",
        "errorMessage",
        "showSqlOnly",
        "sqlStatement"
    })
    public SqlTuningSetAdminActionStatus(
            Status status,
            String successMessage,
            Integer errorCode,
            String errorMessage,
            Integer showSqlOnly,
            String sqlStatement) {
        super();
        this.status = status;
        this.successMessage = successMessage;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.showSqlOnly = showSqlOnly;
        this.sqlStatement = sqlStatement;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The status of a Sql tuning set admin action. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of a Sql tuning set admin action.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The success message of the Sql tuning set admin action. The success message is "null" if
         * the admin action is non successful.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("successMessage")
        private String successMessage;

        /**
         * The success message of the Sql tuning set admin action. The success message is "null" if
         * the admin action is non successful.
         *
         * @param successMessage the value to set
         * @return this builder
         */
        public Builder successMessage(String successMessage) {
            this.successMessage = successMessage;
            this.__explicitlySet__.add("successMessage");
            return this;
        }
        /**
         * The error code that denotes failure if the Sql tuning set admin action is not successful.
         * The error code is "null" if the admin action is successful.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
        private Integer errorCode;

        /**
         * The error code that denotes failure if the Sql tuning set admin action is not successful.
         * The error code is "null" if the admin action is successful.
         *
         * @param errorCode the value to set
         * @return this builder
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            this.__explicitlySet__.add("errorCode");
            return this;
        }
        /**
         * The error message that indicates the reason for failure if the Sql tuning set admin
         * action is not successful. The error message is "null" if the admin action is successful.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * The error message that indicates the reason for failure if the Sql tuning set admin
         * action is not successful. The error message is "null" if the admin action is successful.
         *
         * @param errorMessage the value to set
         * @return this builder
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /**
         * Flag to indicate whether to create the Sql tuning set or just display the plsql used for
         * the selected user action.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("showSqlOnly")
        private Integer showSqlOnly;

        /**
         * Flag to indicate whether to create the Sql tuning set or just display the plsql used for
         * the selected user action.
         *
         * @param showSqlOnly the value to set
         * @return this builder
         */
        public Builder showSqlOnly(Integer showSqlOnly) {
            this.showSqlOnly = showSqlOnly;
            this.__explicitlySet__.add("showSqlOnly");
            return this;
        }
        /**
         * When showSqlOnly is set to 1, this attribute displays the plsql generated for the
         * selected user action. When showSqlOnly is set to 0, this attribute will not be returned.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlStatement")
        private String sqlStatement;

        /**
         * When showSqlOnly is set to 1, this attribute displays the plsql generated for the
         * selected user action. When showSqlOnly is set to 0, this attribute will not be returned.
         *
         * @param sqlStatement the value to set
         * @return this builder
         */
        public Builder sqlStatement(String sqlStatement) {
            this.sqlStatement = sqlStatement;
            this.__explicitlySet__.add("sqlStatement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningSetAdminActionStatus build() {
            SqlTuningSetAdminActionStatus model =
                    new SqlTuningSetAdminActionStatus(
                            this.status,
                            this.successMessage,
                            this.errorCode,
                            this.errorMessage,
                            this.showSqlOnly,
                            this.sqlStatement);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningSetAdminActionStatus model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("successMessage")) {
                this.successMessage(model.getSuccessMessage());
            }
            if (model.wasPropertyExplicitlySet("errorCode")) {
                this.errorCode(model.getErrorCode());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("showSqlOnly")) {
                this.showSqlOnly(model.getShowSqlOnly());
            }
            if (model.wasPropertyExplicitlySet("sqlStatement")) {
                this.sqlStatement(model.getSqlStatement());
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

    /** The status of a Sql tuning set admin action. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The status of a Sql tuning set admin action. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of a Sql tuning set admin action.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * The success message of the Sql tuning set admin action. The success message is "null" if the
     * admin action is non successful.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("successMessage")
    private final String successMessage;

    /**
     * The success message of the Sql tuning set admin action. The success message is "null" if the
     * admin action is non successful.
     *
     * @return the value
     */
    public String getSuccessMessage() {
        return successMessage;
    }

    /**
     * The error code that denotes failure if the Sql tuning set admin action is not successful. The
     * error code is "null" if the admin action is successful.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private final Integer errorCode;

    /**
     * The error code that denotes failure if the Sql tuning set admin action is not successful. The
     * error code is "null" if the admin action is successful.
     *
     * @return the value
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * The error message that indicates the reason for failure if the Sql tuning set admin action is
     * not successful. The error message is "null" if the admin action is successful.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * The error message that indicates the reason for failure if the Sql tuning set admin action is
     * not successful. The error message is "null" if the admin action is successful.
     *
     * @return the value
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Flag to indicate whether to create the Sql tuning set or just display the plsql used for the
     * selected user action.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("showSqlOnly")
    private final Integer showSqlOnly;

    /**
     * Flag to indicate whether to create the Sql tuning set or just display the plsql used for the
     * selected user action.
     *
     * @return the value
     */
    public Integer getShowSqlOnly() {
        return showSqlOnly;
    }

    /**
     * When showSqlOnly is set to 1, this attribute displays the plsql generated for the selected
     * user action. When showSqlOnly is set to 0, this attribute will not be returned.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlStatement")
    private final String sqlStatement;

    /**
     * When showSqlOnly is set to 1, this attribute displays the plsql generated for the selected
     * user action. When showSqlOnly is set to 0, this attribute will not be returned.
     *
     * @return the value
     */
    public String getSqlStatement() {
        return sqlStatement;
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
        sb.append("SqlTuningSetAdminActionStatus(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", successMessage=").append(String.valueOf(this.successMessage));
        sb.append(", errorCode=").append(String.valueOf(this.errorCode));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", showSqlOnly=").append(String.valueOf(this.showSqlOnly));
        sb.append(", sqlStatement=").append(String.valueOf(this.sqlStatement));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningSetAdminActionStatus)) {
            return false;
        }

        SqlTuningSetAdminActionStatus other = (SqlTuningSetAdminActionStatus) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.successMessage, other.successMessage)
                && java.util.Objects.equals(this.errorCode, other.errorCode)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.showSqlOnly, other.showSqlOnly)
                && java.util.Objects.equals(this.sqlStatement, other.sqlStatement)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.successMessage == null ? 43 : this.successMessage.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.showSqlOnly == null ? 43 : this.showSqlOnly.hashCode());
        result = (result * PRIME) + (this.sqlStatement == null ? 43 : this.sqlStatement.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
