/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
        builder = CreateDatabaseFromBackupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDatabaseFromBackupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "backupId",
        "backupTDEPassword",
        "adminPassword",
        "dbUniqueName",
        "dbName",
        "sidPrefix",
        "pluggableDatabases"
    })
    public CreateDatabaseFromBackupDetails(
            String backupId,
            String backupTDEPassword,
            String adminPassword,
            String dbUniqueName,
            String dbName,
            String sidPrefix,
            java.util.List<String> pluggableDatabases) {
        super();
        this.backupId = backupId;
        this.backupTDEPassword = backupTDEPassword;
        this.adminPassword = adminPassword;
        this.dbUniqueName = dbUniqueName;
        this.dbName = dbName;
        this.sidPrefix = sidPrefix;
        this.pluggableDatabases = pluggableDatabases;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The backup
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupId")
        private String backupId;

        /**
         * The backup
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param backupId the value to set
         * @return this builder
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            this.__explicitlySet__.add("backupId");
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
        /** Specifies a prefix for the {@code Oracle SID} of the database to be created. */
        @com.fasterxml.jackson.annotation.JsonProperty("sidPrefix")
        private String sidPrefix;

        /**
         * Specifies a prefix for the {@code Oracle SID} of the database to be created.
         *
         * @param sidPrefix the value to set
         * @return this builder
         */
        public Builder sidPrefix(String sidPrefix) {
            this.sidPrefix = sidPrefix;
            this.__explicitlySet__.add("sidPrefix");
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

        public CreateDatabaseFromBackupDetails build() {
            CreateDatabaseFromBackupDetails model =
                    new CreateDatabaseFromBackupDetails(
                            this.backupId,
                            this.backupTDEPassword,
                            this.adminPassword,
                            this.dbUniqueName,
                            this.dbName,
                            this.sidPrefix,
                            this.pluggableDatabases);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDatabaseFromBackupDetails model) {
            if (model.wasPropertyExplicitlySet("backupId")) {
                this.backupId(model.getBackupId());
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
            if (model.wasPropertyExplicitlySet("sidPrefix")) {
                this.sidPrefix(model.getSidPrefix());
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
     * The backup [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupId")
    private final String backupId;

    /**
     * The backup [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getBackupId() {
        return backupId;
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

    /** Specifies a prefix for the {@code Oracle SID} of the database to be created. */
    @com.fasterxml.jackson.annotation.JsonProperty("sidPrefix")
    private final String sidPrefix;

    /**
     * Specifies a prefix for the {@code Oracle SID} of the database to be created.
     *
     * @return the value
     */
    public String getSidPrefix() {
        return sidPrefix;
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
        sb.append("CreateDatabaseFromBackupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("backupId=").append(String.valueOf(this.backupId));
        sb.append(", backupTDEPassword=").append(String.valueOf(this.backupTDEPassword));
        sb.append(", adminPassword=").append(String.valueOf(this.adminPassword));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", sidPrefix=").append(String.valueOf(this.sidPrefix));
        sb.append(", pluggableDatabases=").append(String.valueOf(this.pluggableDatabases));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabaseFromBackupDetails)) {
            return false;
        }

        CreateDatabaseFromBackupDetails other = (CreateDatabaseFromBackupDetails) o;
        return java.util.Objects.equals(this.backupId, other.backupId)
                && java.util.Objects.equals(this.backupTDEPassword, other.backupTDEPassword)
                && java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.sidPrefix, other.sidPrefix)
                && java.util.Objects.equals(this.pluggableDatabases, other.pluggableDatabases)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.backupId == null ? 43 : this.backupId.hashCode());
        result =
                (result * PRIME)
                        + (this.backupTDEPassword == null ? 43 : this.backupTDEPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result = (result * PRIME) + (this.sidPrefix == null ? 43 : this.sidPrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.pluggableDatabases == null
                                ? 43
                                : this.pluggableDatabases.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
