/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Connection validaton result for the Oracle Database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ValidateDatabaseToolsConnectionOracleDatabaseResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ValidateDatabaseToolsConnectionOracleDatabaseResult
        extends ValidateDatabaseToolsConnectionResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private String code;

        public Builder code(String code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cause")
        private String cause;

        public Builder cause(String cause) {
            this.cause = cause;
            this.__explicitlySet__.add("cause");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
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
        /** The database version. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * The database version.
         *
         * @param databaseVersion the value to set
         * @return this builder
         */
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /** The DBMS_CLOUD package installation status. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbmsCloudStatus")
        private DbmsCloudStatus dbmsCloudStatus;

        /**
         * The DBMS_CLOUD package installation status.
         *
         * @param dbmsCloudStatus the value to set
         * @return this builder
         */
        public Builder dbmsCloudStatus(DbmsCloudStatus dbmsCloudStatus) {
            this.dbmsCloudStatus = dbmsCloudStatus;
            this.__explicitlySet__.add("dbmsCloudStatus");
            return this;
        }
        /** Displays the CLOUD_SERVICE value within the USERENV context */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudService")
        private String cloudService;

        /**
         * Displays the CLOUD_SERVICE value within the USERENV context
         *
         * @param cloudService the value to set
         * @return this builder
         */
        public Builder cloudService(String cloudService) {
            this.cloudService = cloudService;
            this.__explicitlySet__.add("cloudService");
            return this;
        }
        /**
         * Status on whether a Database Tools identity type can be used with this connection or not.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseToolsIdentityStatuses")
        private java.util.List<ValidationIdentityStatus> databaseToolsIdentityStatuses;

        /**
         * Status on whether a Database Tools identity type can be used with this connection or not.
         *
         * @param databaseToolsIdentityStatuses the value to set
         * @return this builder
         */
        public Builder databaseToolsIdentityStatuses(
                java.util.List<ValidationIdentityStatus> databaseToolsIdentityStatuses) {
            this.databaseToolsIdentityStatuses = databaseToolsIdentityStatuses;
            this.__explicitlySet__.add("databaseToolsIdentityStatuses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidateDatabaseToolsConnectionOracleDatabaseResult build() {
            ValidateDatabaseToolsConnectionOracleDatabaseResult model =
                    new ValidateDatabaseToolsConnectionOracleDatabaseResult(
                            this.code,
                            this.message,
                            this.cause,
                            this.action,
                            this.databaseName,
                            this.databaseVersion,
                            this.dbmsCloudStatus,
                            this.cloudService,
                            this.databaseToolsIdentityStatuses);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidateDatabaseToolsConnectionOracleDatabaseResult model) {
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("cause")) {
                this.cause(model.getCause());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("dbmsCloudStatus")) {
                this.dbmsCloudStatus(model.getDbmsCloudStatus());
            }
            if (model.wasPropertyExplicitlySet("cloudService")) {
                this.cloudService(model.getCloudService());
            }
            if (model.wasPropertyExplicitlySet("databaseToolsIdentityStatuses")) {
                this.databaseToolsIdentityStatuses(model.getDatabaseToolsIdentityStatuses());
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
    public ValidateDatabaseToolsConnectionOracleDatabaseResult(
            String code,
            String message,
            String cause,
            String action,
            String databaseName,
            String databaseVersion,
            DbmsCloudStatus dbmsCloudStatus,
            String cloudService,
            java.util.List<ValidationIdentityStatus> databaseToolsIdentityStatuses) {
        super(code, message, cause, action);
        this.databaseName = databaseName;
        this.databaseVersion = databaseVersion;
        this.dbmsCloudStatus = dbmsCloudStatus;
        this.cloudService = cloudService;
        this.databaseToolsIdentityStatuses = databaseToolsIdentityStatuses;
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

    /** The database version. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * The database version.
     *
     * @return the value
     */
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /** The DBMS_CLOUD package installation status. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbmsCloudStatus")
    private final DbmsCloudStatus dbmsCloudStatus;

    /**
     * The DBMS_CLOUD package installation status.
     *
     * @return the value
     */
    public DbmsCloudStatus getDbmsCloudStatus() {
        return dbmsCloudStatus;
    }

    /** Displays the CLOUD_SERVICE value within the USERENV context */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudService")
    private final String cloudService;

    /**
     * Displays the CLOUD_SERVICE value within the USERENV context
     *
     * @return the value
     */
    public String getCloudService() {
        return cloudService;
    }

    /** Status on whether a Database Tools identity type can be used with this connection or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseToolsIdentityStatuses")
    private final java.util.List<ValidationIdentityStatus> databaseToolsIdentityStatuses;

    /**
     * Status on whether a Database Tools identity type can be used with this connection or not.
     *
     * @return the value
     */
    public java.util.List<ValidationIdentityStatus> getDatabaseToolsIdentityStatuses() {
        return databaseToolsIdentityStatuses;
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
        sb.append("ValidateDatabaseToolsConnectionOracleDatabaseResult(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", dbmsCloudStatus=").append(String.valueOf(this.dbmsCloudStatus));
        sb.append(", cloudService=").append(String.valueOf(this.cloudService));
        sb.append(", databaseToolsIdentityStatuses=")
                .append(String.valueOf(this.databaseToolsIdentityStatuses));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateDatabaseToolsConnectionOracleDatabaseResult)) {
            return false;
        }

        ValidateDatabaseToolsConnectionOracleDatabaseResult other =
                (ValidateDatabaseToolsConnectionOracleDatabaseResult) o;
        return java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.dbmsCloudStatus, other.dbmsCloudStatus)
                && java.util.Objects.equals(this.cloudService, other.cloudService)
                && java.util.Objects.equals(
                        this.databaseToolsIdentityStatuses, other.databaseToolsIdentityStatuses)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.dbmsCloudStatus == null ? 43 : this.dbmsCloudStatus.hashCode());
        result = (result * PRIME) + (this.cloudService == null ? 43 : this.cloudService.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseToolsIdentityStatuses == null
                                ? 43
                                : this.databaseToolsIdentityStatuses.hashCode());
        return result;
    }
}
