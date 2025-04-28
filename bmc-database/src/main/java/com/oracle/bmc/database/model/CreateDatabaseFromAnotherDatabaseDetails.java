/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDatabaseFromAnotherDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDatabaseFromAnotherDatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "databaseId",
        "backupTDEPassword",
        "adminPassword",
        "dbUniqueName",
        "dbName",
        "timeStampForPointInTimeRecovery",
        "pluggableDatabases"
    })
    public CreateDatabaseFromAnotherDatabaseDetails(
            String databaseId,
            String backupTDEPassword,
            String adminPassword,
            String dbUniqueName,
            String dbName,
            java.util.Date timeStampForPointInTimeRecovery,
            java.util.List<String> pluggableDatabases) {
        super();
        this.databaseId = databaseId;
        this.backupTDEPassword = backupTDEPassword;
        this.adminPassword = adminPassword;
        this.dbUniqueName = dbUniqueName;
        this.dbName = dbName;
        this.timeStampForPointInTimeRecovery = timeStampForPointInTimeRecovery;
        this.pluggableDatabases = pluggableDatabases;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The database
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The database
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param databaseId the value to set
         * @return this builder
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /** The password to open the TDE wallet. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupTDEPassword")
        private String backupTDEPassword;

        /**
         * The password to open the TDE wallet.
         *
         * @param backupTDEPassword the value to set
         * @return this builder
         */
        public Builder backupTDEPassword(String backupTDEPassword) {
            this.backupTDEPassword = backupTDEPassword;
            this.__explicitlySet__.add("backupTDEPassword");
            return this;
        }
        /**
         * A strong password for SYS, SYSTEM, PDB Admin and TDE Wallet. The password must be at
         * least nine characters and contain at least two uppercase, two lowercase, two numbers, and
         * two special characters. The special characters must be _, \\#, or -.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        /**
         * A strong password for SYS, SYSTEM, PDB Admin and TDE Wallet. The password must be at
         * least nine characters and contain at least two uppercase, two lowercase, two numbers, and
         * two special characters. The special characters must be _, \\#, or -.
         *
         * @param adminPassword the value to set
         * @return this builder
         */
        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }
        /** The {@code DB_UNIQUE_NAME} of the Oracle Database being backed up. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        /**
         * The {@code DB_UNIQUE_NAME} of the Oracle Database being backed up.
         *
         * @param dbUniqueName the value to set
         * @return this builder
         */
        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
            return this;
        }
        /**
         * The display name of the database to be created from the backup. It must begin with an
         * alphabetic character and can contain a maximum of eight alphanumeric characters. Special
         * characters are not permitted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        /**
         * The display name of the database to be created from the backup. It must begin with an
         * alphabetic character and can contain a maximum of eight alphanumeric characters. Special
         * characters are not permitted.
         *
         * @param dbName the value to set
         * @return this builder
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }
        /**
         * The point in time of the original database from which the new database is created. If not
         * specifed, the latest backup is used to create the database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStampForPointInTimeRecovery")
        private java.util.Date timeStampForPointInTimeRecovery;

        /**
         * The point in time of the original database from which the new database is created. If not
         * specifed, the latest backup is used to create the database.
         *
         * @param timeStampForPointInTimeRecovery the value to set
         * @return this builder
         */
        public Builder timeStampForPointInTimeRecovery(
                java.util.Date timeStampForPointInTimeRecovery) {
            this.timeStampForPointInTimeRecovery = timeStampForPointInTimeRecovery;
            this.__explicitlySet__.add("timeStampForPointInTimeRecovery");
            return this;
        }
        /** The list of pluggable databases that needs to be restored into new database. */
        @com.fasterxml.jackson.annotation.JsonProperty("pluggableDatabases")
        private java.util.List<String> pluggableDatabases;

        /**
         * The list of pluggable databases that needs to be restored into new database.
         *
         * @param pluggableDatabases the value to set
         * @return this builder
         */
        public Builder pluggableDatabases(java.util.List<String> pluggableDatabases) {
            this.pluggableDatabases = pluggableDatabases;
            this.__explicitlySet__.add("pluggableDatabases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDatabaseFromAnotherDatabaseDetails build() {
            CreateDatabaseFromAnotherDatabaseDetails model =
                    new CreateDatabaseFromAnotherDatabaseDetails(
                            this.databaseId,
                            this.backupTDEPassword,
                            this.adminPassword,
                            this.dbUniqueName,
                            this.dbName,
                            this.timeStampForPointInTimeRecovery,
                            this.pluggableDatabases);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDatabaseFromAnotherDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("backupTDEPassword")) {
                this.backupTDEPassword(model.getBackupTDEPassword());
            }
            if (model.wasPropertyExplicitlySet("adminPassword")) {
                this.adminPassword(model.getAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("dbUniqueName")) {
                this.dbUniqueName(model.getDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("dbName")) {
                this.dbName(model.getDbName());
            }
            if (model.wasPropertyExplicitlySet("timeStampForPointInTimeRecovery")) {
                this.timeStampForPointInTimeRecovery(model.getTimeStampForPointInTimeRecovery());
            }
            if (model.wasPropertyExplicitlySet("pluggableDatabases")) {
                this.pluggableDatabases(model.getPluggableDatabases());
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
     * The database [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The database [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getDatabaseId() {
        return databaseId;
    }

    /** The password to open the TDE wallet. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupTDEPassword")
    private final String backupTDEPassword;

    /**
     * The password to open the TDE wallet.
     *
     * @return the value
     */
    public String getBackupTDEPassword() {
        return backupTDEPassword;
    }

    /**
     * A strong password for SYS, SYSTEM, PDB Admin and TDE Wallet. The password must be at least
     * nine characters and contain at least two uppercase, two lowercase, two numbers, and two
     * special characters. The special characters must be _, \\#, or -.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final String adminPassword;

    /**
     * A strong password for SYS, SYSTEM, PDB Admin and TDE Wallet. The password must be at least
     * nine characters and contain at least two uppercase, two lowercase, two numbers, and two
     * special characters. The special characters must be _, \\#, or -.
     *
     * @return the value
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /** The {@code DB_UNIQUE_NAME} of the Oracle Database being backed up. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    /**
     * The {@code DB_UNIQUE_NAME} of the Oracle Database being backed up.
     *
     * @return the value
     */
    public String getDbUniqueName() {
        return dbUniqueName;
    }

    /**
     * The display name of the database to be created from the backup. It must begin with an
     * alphabetic character and can contain a maximum of eight alphanumeric characters. Special
     * characters are not permitted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    /**
     * The display name of the database to be created from the backup. It must begin with an
     * alphabetic character and can contain a maximum of eight alphanumeric characters. Special
     * characters are not permitted.
     *
     * @return the value
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * The point in time of the original database from which the new database is created. If not
     * specifed, the latest backup is used to create the database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStampForPointInTimeRecovery")
    private final java.util.Date timeStampForPointInTimeRecovery;

    /**
     * The point in time of the original database from which the new database is created. If not
     * specifed, the latest backup is used to create the database.
     *
     * @return the value
     */
    public java.util.Date getTimeStampForPointInTimeRecovery() {
        return timeStampForPointInTimeRecovery;
    }

    /** The list of pluggable databases that needs to be restored into new database. */
    @com.fasterxml.jackson.annotation.JsonProperty("pluggableDatabases")
    private final java.util.List<String> pluggableDatabases;

    /**
     * The list of pluggable databases that needs to be restored into new database.
     *
     * @return the value
     */
    public java.util.List<String> getPluggableDatabases() {
        return pluggableDatabases;
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
        sb.append("CreateDatabaseFromAnotherDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", backupTDEPassword=").append(String.valueOf(this.backupTDEPassword));
        sb.append(", adminPassword=").append(String.valueOf(this.adminPassword));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", timeStampForPointInTimeRecovery=")
                .append(String.valueOf(this.timeStampForPointInTimeRecovery));
        sb.append(", pluggableDatabases=").append(String.valueOf(this.pluggableDatabases));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabaseFromAnotherDatabaseDetails)) {
            return false;
        }

        CreateDatabaseFromAnotherDatabaseDetails other =
                (CreateDatabaseFromAnotherDatabaseDetails) o;
        return java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.backupTDEPassword, other.backupTDEPassword)
                && java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(
                        this.timeStampForPointInTimeRecovery, other.timeStampForPointInTimeRecovery)
                && java.util.Objects.equals(this.pluggableDatabases, other.pluggableDatabases)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.backupTDEPassword == null ? 43 : this.backupTDEPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStampForPointInTimeRecovery == null
                                ? 43
                                : this.timeStampForPointInTimeRecovery.hashCode());
        result =
                (result * PRIME)
                        + (this.pluggableDatabases == null
                                ? 43
                                : this.pluggableDatabases.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
