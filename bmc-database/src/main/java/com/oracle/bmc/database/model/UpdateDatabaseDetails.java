/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to update a database.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateDatabaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateDatabaseDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    public UpdateDatabaseDetails(
            DbBackupConfig dbBackupConfig,
            String dbHomeId,
            String newAdminPassword,
            String oldTdeWalletPassword,
            String newTdeWalletPassword,
            DatabaseStorageSizeDetails storageSizeDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            ManagedSoftwareUpdateInputDetails managedSoftwareUpdateDetails,
            PatchOptions patchOptions,
            String databaseAdminPassword,
            ProtectionMode protectionMode,
            TransportType transportType,
            Boolean isActiveDataGuardEnabled,
            AutoFailoverConfiguration autoFailoverConfiguration) {
        super();
        this.dbBackupConfig = dbBackupConfig;
        this.dbHomeId = dbHomeId;
        this.newAdminPassword = newAdminPassword != null ? newAdminPassword.toCharArray() : null;
        this.oldTdeWalletPassword =
                oldTdeWalletPassword != null ? oldTdeWalletPassword.toCharArray() : null;
        this.newTdeWalletPassword =
                newTdeWalletPassword != null ? newTdeWalletPassword.toCharArray() : null;
        this.storageSizeDetails = storageSizeDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.managedSoftwareUpdateDetails = managedSoftwareUpdateDetails;
        this.patchOptions = patchOptions;
        this.databaseAdminPassword =
                databaseAdminPassword != null ? databaseAdminPassword.toCharArray() : null;
        this.protectionMode = protectionMode;
        this.transportType = transportType;
        this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
        this.autoFailoverConfiguration = autoFailoverConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    @java.beans.ConstructorProperties({
        "dbBackupConfig",
        "dbHomeId",
        "newAdminPassword",
        "oldTdeWalletPassword",
        "newTdeWalletPassword",
        "storageSizeDetails",
        "freeformTags",
        "definedTags",
        "managedSoftwareUpdateDetails",
        "patchOptions",
        "databaseAdminPassword",
        "protectionMode",
        "transportType",
        "isActiveDataGuardEnabled",
        "autoFailoverConfiguration"
    })
    public UpdateDatabaseDetails(
            DbBackupConfig dbBackupConfig,
            String dbHomeId,
            char[] newAdminPassword,
            char[] oldTdeWalletPassword,
            char[] newTdeWalletPassword,
            DatabaseStorageSizeDetails storageSizeDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            ManagedSoftwareUpdateInputDetails managedSoftwareUpdateDetails,
            PatchOptions patchOptions,
            char[] databaseAdminPassword,
            ProtectionMode protectionMode,
            TransportType transportType,
            Boolean isActiveDataGuardEnabled,
            AutoFailoverConfiguration autoFailoverConfiguration) {
        super();
        this.dbBackupConfig = dbBackupConfig;
        this.dbHomeId = dbHomeId;
        this.newAdminPassword = newAdminPassword;
        this.oldTdeWalletPassword = oldTdeWalletPassword;
        this.newTdeWalletPassword = newTdeWalletPassword;
        this.storageSizeDetails = storageSizeDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.managedSoftwareUpdateDetails = managedSoftwareUpdateDetails;
        this.patchOptions = patchOptions;
        this.databaseAdminPassword = databaseAdminPassword;
        this.protectionMode = protectionMode;
        this.transportType = transportType;
        this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
        this.autoFailoverConfiguration = autoFailoverConfiguration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
        private DbBackupConfig dbBackupConfig;

        public Builder dbBackupConfig(DbBackupConfig dbBackupConfig) {
            this.dbBackupConfig = dbBackupConfig;
            this.__explicitlySet__.add("dbBackupConfig");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database Home.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbHomeId")
        private String dbHomeId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database Home.
         * @param dbHomeId the value to set
         * @return this builder
         **/
        public Builder dbHomeId(String dbHomeId) {
            this.dbHomeId = dbHomeId;
            this.__explicitlySet__.add("dbHomeId");
            return this;
        }
        /**
         * A new strong password for SYS, SYSTEM, and the plugbable database ADMIN user. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numeric, and two special characters. The special characters must be _, \\#, or -.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("newAdminPassword")
        private char[] newAdminPassword;

        /**
         * A new strong password for SYS, SYSTEM, and the plugbable database ADMIN user. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numeric, and two special characters. The special characters must be _, \\#, or -.
         * @param newAdminPassword the value to set
         * @return this builder
         **/
        public Builder newAdminPassword(char[] newAdminPassword) {
            this.newAdminPassword = newAdminPassword;
            this.__explicitlySet__.add("newAdminPassword");
            return this;
        }

        public Builder newAdminPassword(String newAdminPassword) {
            this.newAdminPassword =
                    newAdminPassword != null ? newAdminPassword.toCharArray() : null;
            this.__explicitlySet__.add("newAdminPassword");
            return this;
        }

        /**
         * The existing TDE wallet password. You must provide the existing password in order to set a new TDE wallet password.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("oldTdeWalletPassword")
        private char[] oldTdeWalletPassword;

        /**
         * The existing TDE wallet password. You must provide the existing password in order to set a new TDE wallet password.
         * @param oldTdeWalletPassword the value to set
         * @return this builder
         **/
        public Builder oldTdeWalletPassword(char[] oldTdeWalletPassword) {
            this.oldTdeWalletPassword = oldTdeWalletPassword;
            this.__explicitlySet__.add("oldTdeWalletPassword");
            return this;
        }

        public Builder oldTdeWalletPassword(String oldTdeWalletPassword) {
            this.oldTdeWalletPassword =
                    oldTdeWalletPassword != null ? oldTdeWalletPassword.toCharArray() : null;
            this.__explicitlySet__.add("oldTdeWalletPassword");
            return this;
        }

        /**
         * The new password to open the TDE wallet. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numeric, and two special characters. The special characters must be _, \\#, or -.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("newTdeWalletPassword")
        private char[] newTdeWalletPassword;

        /**
         * The new password to open the TDE wallet. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numeric, and two special characters. The special characters must be _, \\#, or -.
         * @param newTdeWalletPassword the value to set
         * @return this builder
         **/
        public Builder newTdeWalletPassword(char[] newTdeWalletPassword) {
            this.newTdeWalletPassword = newTdeWalletPassword;
            this.__explicitlySet__.add("newTdeWalletPassword");
            return this;
        }

        public Builder newTdeWalletPassword(String newTdeWalletPassword) {
            this.newTdeWalletPassword =
                    newTdeWalletPassword != null ? newTdeWalletPassword.toCharArray() : null;
            this.__explicitlySet__.add("newTdeWalletPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageSizeDetails")
        private DatabaseStorageSizeDetails storageSizeDetails;

        public Builder storageSizeDetails(DatabaseStorageSizeDetails storageSizeDetails) {
            this.storageSizeDetails = storageSizeDetails;
            this.__explicitlySet__.add("storageSizeDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedSoftwareUpdateDetails")
        private ManagedSoftwareUpdateInputDetails managedSoftwareUpdateDetails;

        public Builder managedSoftwareUpdateDetails(
                ManagedSoftwareUpdateInputDetails managedSoftwareUpdateDetails) {
            this.managedSoftwareUpdateDetails = managedSoftwareUpdateDetails;
            this.__explicitlySet__.add("managedSoftwareUpdateDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchOptions")
        private PatchOptions patchOptions;

        public Builder patchOptions(PatchOptions patchOptions) {
            this.patchOptions = patchOptions;
            this.__explicitlySet__.add("patchOptions");
            return this;
        }
        /**
         * The administrator password of the primary database in this Data Guard association.
         * <p>
         **The password MUST be the same as the primary admin password.**
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
        private char[] databaseAdminPassword;

        /**
         * The administrator password of the primary database in this Data Guard association.
         * <p>
         **The password MUST be the same as the primary admin password.**
         *
         * @param databaseAdminPassword the value to set
         * @return this builder
         **/
        public Builder databaseAdminPassword(char[] databaseAdminPassword) {
            this.databaseAdminPassword = databaseAdminPassword;
            this.__explicitlySet__.add("databaseAdminPassword");
            return this;
        }

        public Builder databaseAdminPassword(String databaseAdminPassword) {
            this.databaseAdminPassword =
                    databaseAdminPassword != null ? databaseAdminPassword.toCharArray() : null;
            this.__explicitlySet__.add("databaseAdminPassword");
            return this;
        }

        /**
         * The protection mode of this Data Guard. For more information, see
         * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private ProtectionMode protectionMode;

        /**
         * The protection mode of this Data Guard. For more information, see
         * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         *
         * @param protectionMode the value to set
         * @return this builder
         **/
        public Builder protectionMode(ProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }
        /**
         * The redo transport type to use for this Data Guard association.  Valid values depend on the specified {@code protectionMode}:
         * <p>
         * MAXIMUM_AVAILABILITY - SYNC or FASTSYNC
         * * MAXIMUM_PERFORMANCE - ASYNC
         * * MAXIMUM_PROTECTION - SYNC
         * <p>
         * For more information, see
         * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
         * in the Oracle Data Guard documentation.
         * <p>
         **IMPORTANT** - The only transport type currently supported by the Database service is ASYNC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("transportType")
        private TransportType transportType;

        /**
         * The redo transport type to use for this Data Guard association.  Valid values depend on the specified {@code protectionMode}:
         * <p>
         * MAXIMUM_AVAILABILITY - SYNC or FASTSYNC
         * * MAXIMUM_PERFORMANCE - ASYNC
         * * MAXIMUM_PROTECTION - SYNC
         * <p>
         * For more information, see
         * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
         * in the Oracle Data Guard documentation.
         * <p>
         **IMPORTANT** - The only transport type currently supported by the Database service is ASYNC.
         *
         * @param transportType the value to set
         * @return this builder
         **/
        public Builder transportType(TransportType transportType) {
            this.transportType = transportType;
            this.__explicitlySet__.add("transportType");
            return this;
        }
        /**
         * True if active Data Guard is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isActiveDataGuardEnabled")
        private Boolean isActiveDataGuardEnabled;

        /**
         * True if active Data Guard is enabled.
         * @param isActiveDataGuardEnabled the value to set
         * @return this builder
         **/
        public Builder isActiveDataGuardEnabled(Boolean isActiveDataGuardEnabled) {
            this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
            this.__explicitlySet__.add("isActiveDataGuardEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autoFailoverConfiguration")
        private AutoFailoverConfiguration autoFailoverConfiguration;

        public Builder autoFailoverConfiguration(
                AutoFailoverConfiguration autoFailoverConfiguration) {
            this.autoFailoverConfiguration = autoFailoverConfiguration;
            this.__explicitlySet__.add("autoFailoverConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDatabaseDetails build() {
            UpdateDatabaseDetails model =
                    new UpdateDatabaseDetails(
                            this.dbBackupConfig,
                            this.dbHomeId,
                            this.newAdminPassword,
                            this.oldTdeWalletPassword,
                            this.newTdeWalletPassword,
                            this.storageSizeDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.managedSoftwareUpdateDetails,
                            this.patchOptions,
                            this.databaseAdminPassword,
                            this.protectionMode,
                            this.transportType,
                            this.isActiveDataGuardEnabled,
                            this.autoFailoverConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("dbBackupConfig")) {
                this.dbBackupConfig(model.getDbBackupConfig());
            }
            if (model.wasPropertyExplicitlySet("dbHomeId")) {
                this.dbHomeId(model.getDbHomeId());
            }
            if (model.wasPropertyExplicitlySet("newAdminPassword")) {
                this.newAdminPassword(model.getNewAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("oldTdeWalletPassword")) {
                this.oldTdeWalletPassword(model.getOldTdeWalletPassword());
            }
            if (model.wasPropertyExplicitlySet("newTdeWalletPassword")) {
                this.newTdeWalletPassword(model.getNewTdeWalletPassword());
            }
            if (model.wasPropertyExplicitlySet("storageSizeDetails")) {
                this.storageSizeDetails(model.getStorageSizeDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("managedSoftwareUpdateDetails")) {
                this.managedSoftwareUpdateDetails(model.getManagedSoftwareUpdateDetails());
            }
            if (model.wasPropertyExplicitlySet("patchOptions")) {
                this.patchOptions(model.getPatchOptions());
            }
            if (model.wasPropertyExplicitlySet("databaseAdminPassword")) {
                this.databaseAdminPassword(model.getDatabaseAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("transportType")) {
                this.transportType(model.getTransportType());
            }
            if (model.wasPropertyExplicitlySet("isActiveDataGuardEnabled")) {
                this.isActiveDataGuardEnabled(model.getIsActiveDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("autoFailoverConfiguration")) {
                this.autoFailoverConfiguration(model.getAutoFailoverConfiguration());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
    private final DbBackupConfig dbBackupConfig;

    public DbBackupConfig getDbBackupConfig() {
        return dbBackupConfig;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database Home.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbHomeId")
    private final String dbHomeId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database Home.
     * @return the value
     **/
    public String getDbHomeId() {
        return dbHomeId;
    }

    /**
     * A new strong password for SYS, SYSTEM, and the plugbable database ADMIN user. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numeric, and two special characters. The special characters must be _, \\#, or -.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newAdminPassword")
    private final char[] newAdminPassword;

    /**
     * A new strong password for SYS, SYSTEM, and the plugbable database ADMIN user. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numeric, and two special characters. The special characters must be _, \\#, or -.
     * return the value
     * @Deprecated - Use getNewAdminPassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getNewAdminPassword() {
        return newAdminPassword != null ? new String(newAdminPassword) : null;
    }

    /**
     * A new strong password for SYS, SYSTEM, and the plugbable database ADMIN user. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numeric, and two special characters. The special characters must be _, \\#, or -.
     * @return the value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newAdminPassword")
    public char[] getNewAdminPassword__AsCharArray() {
        return newAdminPassword;
    }

    /**
     * The existing TDE wallet password. You must provide the existing password in order to set a new TDE wallet password.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oldTdeWalletPassword")
    private final char[] oldTdeWalletPassword;

    /**
     * The existing TDE wallet password. You must provide the existing password in order to set a new TDE wallet password.
     * return the value
     * @Deprecated - Use getOldTdeWalletPassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getOldTdeWalletPassword() {
        return oldTdeWalletPassword != null ? new String(oldTdeWalletPassword) : null;
    }

    /**
     * The existing TDE wallet password. You must provide the existing password in order to set a new TDE wallet password.
     * @return the value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oldTdeWalletPassword")
    public char[] getOldTdeWalletPassword__AsCharArray() {
        return oldTdeWalletPassword;
    }

    /**
     * The new password to open the TDE wallet. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numeric, and two special characters. The special characters must be _, \\#, or -.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newTdeWalletPassword")
    private final char[] newTdeWalletPassword;

    /**
     * The new password to open the TDE wallet. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numeric, and two special characters. The special characters must be _, \\#, or -.
     * return the value
     * @Deprecated - Use getNewTdeWalletPassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getNewTdeWalletPassword() {
        return newTdeWalletPassword != null ? new String(newTdeWalletPassword) : null;
    }

    /**
     * The new password to open the TDE wallet. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numeric, and two special characters. The special characters must be _, \\#, or -.
     * @return the value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newTdeWalletPassword")
    public char[] getNewTdeWalletPassword__AsCharArray() {
        return newTdeWalletPassword;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storageSizeDetails")
    private final DatabaseStorageSizeDetails storageSizeDetails;

    public DatabaseStorageSizeDetails getStorageSizeDetails() {
        return storageSizeDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("managedSoftwareUpdateDetails")
    private final ManagedSoftwareUpdateInputDetails managedSoftwareUpdateDetails;

    public ManagedSoftwareUpdateInputDetails getManagedSoftwareUpdateDetails() {
        return managedSoftwareUpdateDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("patchOptions")
    private final PatchOptions patchOptions;

    public PatchOptions getPatchOptions() {
        return patchOptions;
    }

    /**
     * The administrator password of the primary database in this Data Guard association.
     * <p>
     **The password MUST be the same as the primary admin password.**
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
    private final char[] databaseAdminPassword;

    /**
     * The administrator password of the primary database in this Data Guard association.
     * &lt;p&gt;
     **The password MUST be the same as the primary admin password.**
     *
     * return the value
     * @Deprecated - Use getDatabaseAdminPassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getDatabaseAdminPassword() {
        return databaseAdminPassword != null ? new String(databaseAdminPassword) : null;
    }

    /**
     * The administrator password of the primary database in this Data Guard association.
     * <p>
     **The password MUST be the same as the primary admin password.**
     *
     * @return the value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
    public char[] getDatabaseAdminPassword__AsCharArray() {
        return databaseAdminPassword;
    }
    /**
     * The protection mode of this Data Guard. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     **/
    public enum ProtectionMode {
        MaximumAvailability("MAXIMUM_AVAILABILITY"),
        MaximumPerformance("MAXIMUM_PERFORMANCE"),
        MaximumProtection("MAXIMUM_PROTECTION"),
        ;

        private final String value;
        private static java.util.Map<String, ProtectionMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ProtectionMode v : ProtectionMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        ProtectionMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProtectionMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ProtectionMode: " + key);
        }
    };
    /**
     * The protection mode of this Data Guard. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final ProtectionMode protectionMode;

    /**
     * The protection mode of this Data Guard. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     * @return the value
     **/
    public ProtectionMode getProtectionMode() {
        return protectionMode;
    }

    /**
     * The redo transport type to use for this Data Guard association.  Valid values depend on the specified {@code protectionMode}:
     * <p>
     * MAXIMUM_AVAILABILITY - SYNC or FASTSYNC
     * * MAXIMUM_PERFORMANCE - ASYNC
     * * MAXIMUM_PROTECTION - SYNC
     * <p>
     * For more information, see
     * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     * <p>
     **IMPORTANT** - The only transport type currently supported by the Database service is ASYNC.
     *
     **/
    public enum TransportType {
        Sync("SYNC"),
        Async("ASYNC"),
        Fastsync("FASTSYNC"),
        ;

        private final String value;
        private static java.util.Map<String, TransportType> map;

        static {
            map = new java.util.HashMap<>();
            for (TransportType v : TransportType.values()) {
                map.put(v.getValue(), v);
            }
        }

        TransportType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TransportType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TransportType: " + key);
        }
    };
    /**
     * The redo transport type to use for this Data Guard association.  Valid values depend on the specified {@code protectionMode}:
     * <p>
     * MAXIMUM_AVAILABILITY - SYNC or FASTSYNC
     * * MAXIMUM_PERFORMANCE - ASYNC
     * * MAXIMUM_PROTECTION - SYNC
     * <p>
     * For more information, see
     * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     * <p>
     **IMPORTANT** - The only transport type currently supported by the Database service is ASYNC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transportType")
    private final TransportType transportType;

    /**
     * The redo transport type to use for this Data Guard association.  Valid values depend on the specified {@code protectionMode}:
     * <p>
     * MAXIMUM_AVAILABILITY - SYNC or FASTSYNC
     * * MAXIMUM_PERFORMANCE - ASYNC
     * * MAXIMUM_PROTECTION - SYNC
     * <p>
     * For more information, see
     * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     * <p>
     **IMPORTANT** - The only transport type currently supported by the Database service is ASYNC.
     *
     * @return the value
     **/
    public TransportType getTransportType() {
        return transportType;
    }

    /**
     * True if active Data Guard is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isActiveDataGuardEnabled")
    private final Boolean isActiveDataGuardEnabled;

    /**
     * True if active Data Guard is enabled.
     * @return the value
     **/
    public Boolean getIsActiveDataGuardEnabled() {
        return isActiveDataGuardEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("autoFailoverConfiguration")
    private final AutoFailoverConfiguration autoFailoverConfiguration;

    public AutoFailoverConfiguration getAutoFailoverConfiguration() {
        return autoFailoverConfiguration;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dbBackupConfig=").append(String.valueOf(this.dbBackupConfig));
        sb.append(", dbHomeId=").append(String.valueOf(this.dbHomeId));
        sb.append(", newAdminPassword=").append("<redacted>");
        sb.append(", oldTdeWalletPassword=").append("<redacted>");
        sb.append(", newTdeWalletPassword=").append("<redacted>");
        sb.append(", storageSizeDetails=").append(String.valueOf(this.storageSizeDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", managedSoftwareUpdateDetails=")
                .append(String.valueOf(this.managedSoftwareUpdateDetails));
        sb.append(", patchOptions=").append(String.valueOf(this.patchOptions));
        sb.append(", databaseAdminPassword=").append("<redacted>");
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", transportType=").append(String.valueOf(this.transportType));
        sb.append(", isActiveDataGuardEnabled=")
                .append(String.valueOf(this.isActiveDataGuardEnabled));
        sb.append(", autoFailoverConfiguration=")
                .append(String.valueOf(this.autoFailoverConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDatabaseDetails)) {
            return false;
        }

        UpdateDatabaseDetails other = (UpdateDatabaseDetails) o;
        return java.util.Objects.equals(this.dbBackupConfig, other.dbBackupConfig)
                && java.util.Objects.equals(this.dbHomeId, other.dbHomeId)
                && java.util.Objects.equals(this.newAdminPassword, other.newAdminPassword)
                && java.util.Objects.equals(this.oldTdeWalletPassword, other.oldTdeWalletPassword)
                && java.util.Objects.equals(this.newTdeWalletPassword, other.newTdeWalletPassword)
                && java.util.Objects.equals(this.storageSizeDetails, other.storageSizeDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(
                        this.managedSoftwareUpdateDetails, other.managedSoftwareUpdateDetails)
                && java.util.Objects.equals(this.patchOptions, other.patchOptions)
                && java.util.Objects.equals(this.databaseAdminPassword, other.databaseAdminPassword)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(this.transportType, other.transportType)
                && java.util.Objects.equals(
                        this.isActiveDataGuardEnabled, other.isActiveDataGuardEnabled)
                && java.util.Objects.equals(
                        this.autoFailoverConfiguration, other.autoFailoverConfiguration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dbBackupConfig == null ? 43 : this.dbBackupConfig.hashCode());
        result = (result * PRIME) + (this.dbHomeId == null ? 43 : this.dbHomeId.hashCode());
        result =
                (result * PRIME)
                        + (this.newAdminPassword == null ? 43 : this.newAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.oldTdeWalletPassword == null
                                ? 43
                                : this.oldTdeWalletPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.newTdeWalletPassword == null
                                ? 43
                                : this.newTdeWalletPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.storageSizeDetails == null
                                ? 43
                                : this.storageSizeDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.managedSoftwareUpdateDetails == null
                                ? 43
                                : this.managedSoftwareUpdateDetails.hashCode());
        result = (result * PRIME) + (this.patchOptions == null ? 43 : this.patchOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseAdminPassword == null
                                ? 43
                                : this.databaseAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.transportType == null ? 43 : this.transportType.hashCode());
        result =
                (result * PRIME)
                        + (this.isActiveDataGuardEnabled == null
                                ? 43
                                : this.isActiveDataGuardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.autoFailoverConfiguration == null
                                ? 43
                                : this.autoFailoverConfiguration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
