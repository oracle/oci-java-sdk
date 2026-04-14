/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for creating a database for a standby db system with dataguard.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
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
        builder = CreateDatabaseForStandbyDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDatabaseForStandbyDbSystemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    public CreateDatabaseForStandbyDbSystemDetails(
            String adminPassword,
            String tdeWalletPassword,
            String databaseSoftwareImageId,
            Boolean isActiveDataGuardEnabled,
            String dbDomain,
            String sidPrefix,
            String dbUniqueName,
            ProtectionMode protectionMode,
            EncryptionKeyLocationDetails sourceEncryptionKeyLocationDetails,
            TransportType transportType,
            DbBackupConfig dbBackupConfig,
            java.util.Map<String, String> databaseFreeformTags,
            java.util.Map<String, java.util.Map<String, Object>> databaseDefinedTags) {
        super();
        this.adminPassword = adminPassword;
        this.tdeWalletPassword = tdeWalletPassword != null ? tdeWalletPassword.toCharArray() : null;
        this.databaseSoftwareImageId = databaseSoftwareImageId;
        this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
        this.dbDomain = dbDomain;
        this.sidPrefix = sidPrefix;
        this.dbUniqueName = dbUniqueName;
        this.protectionMode = protectionMode;
        this.sourceEncryptionKeyLocationDetails = sourceEncryptionKeyLocationDetails;
        this.transportType = transportType;
        this.dbBackupConfig = dbBackupConfig;
        this.databaseFreeformTags = databaseFreeformTags;
        this.databaseDefinedTags = databaseDefinedTags;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    @java.beans.ConstructorProperties({
        "adminPassword",
        "tdeWalletPassword",
        "databaseSoftwareImageId",
        "isActiveDataGuardEnabled",
        "dbDomain",
        "sidPrefix",
        "dbUniqueName",
        "protectionMode",
        "sourceEncryptionKeyLocationDetails",
        "transportType",
        "dbBackupConfig",
        "databaseFreeformTags",
        "databaseDefinedTags"
    })
    public CreateDatabaseForStandbyDbSystemDetails(
            String adminPassword,
            char[] tdeWalletPassword,
            String databaseSoftwareImageId,
            Boolean isActiveDataGuardEnabled,
            String dbDomain,
            String sidPrefix,
            String dbUniqueName,
            ProtectionMode protectionMode,
            EncryptionKeyLocationDetails sourceEncryptionKeyLocationDetails,
            TransportType transportType,
            DbBackupConfig dbBackupConfig,
            java.util.Map<String, String> databaseFreeformTags,
            java.util.Map<String, java.util.Map<String, Object>> databaseDefinedTags) {
        super();
        this.adminPassword = adminPassword;
        this.tdeWalletPassword = tdeWalletPassword;
        this.databaseSoftwareImageId = databaseSoftwareImageId;
        this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
        this.dbDomain = dbDomain;
        this.sidPrefix = sidPrefix;
        this.dbUniqueName = dbUniqueName;
        this.protectionMode = protectionMode;
        this.sourceEncryptionKeyLocationDetails = sourceEncryptionKeyLocationDetails;
        this.transportType = transportType;
        this.dbBackupConfig = dbBackupConfig;
        this.databaseFreeformTags = databaseFreeformTags;
        this.databaseDefinedTags = databaseDefinedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * For SYS, SYSTEM, and PDB Admin, enter the same password as the primary admin password.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        /**
         * For SYS, SYSTEM, and PDB Admin, enter the same password as the primary admin password.
         *
         * @param adminPassword the value to set
         * @return this builder
         */
        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }
        /** For TDE Wallet, enter the same password as the primary wallet password. */
        @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPassword")
        private char[] tdeWalletPassword;

        /**
         * For TDE Wallet, enter the same password as the primary wallet password.
         *
         * @param tdeWalletPassword the value to set
         * @return this builder
         */
        public Builder tdeWalletPassword(char[] tdeWalletPassword) {
            this.tdeWalletPassword = tdeWalletPassword;
            this.__explicitlySet__.add("tdeWalletPassword");
            return this;
        }

        public Builder tdeWalletPassword(String tdeWalletPassword) {
            this.tdeWalletPassword =
                    tdeWalletPassword != null ? tdeWalletPassword.toCharArray() : null;
            this.__explicitlySet__.add("tdeWalletPassword");
            return this;
        }
        /**
         * The database software image
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
        private String databaseSoftwareImageId;

        /**
         * The database software image
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         *
         * @param databaseSoftwareImageId the value to set
         * @return this builder
         */
        public Builder databaseSoftwareImageId(String databaseSoftwareImageId) {
            this.databaseSoftwareImageId = databaseSoftwareImageId;
            this.__explicitlySet__.add("databaseSoftwareImageId");
            return this;
        }
        /** True if active Data Guard is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isActiveDataGuardEnabled")
        private Boolean isActiveDataGuardEnabled;

        /**
         * True if active Data Guard is enabled.
         *
         * @param isActiveDataGuardEnabled the value to set
         * @return this builder
         */
        public Builder isActiveDataGuardEnabled(Boolean isActiveDataGuardEnabled) {
            this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
            this.__explicitlySet__.add("isActiveDataGuardEnabled");
            return this;
        }
        /**
         * The database domain. In a distributed database system, DB_DOMAIN specifies the logical
         * location of the database within the network structure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbDomain")
        private String dbDomain;

        /**
         * The database domain. In a distributed database system, DB_DOMAIN specifies the logical
         * location of the database within the network structure.
         *
         * @param dbDomain the value to set
         * @return this builder
         */
        public Builder dbDomain(String dbDomain) {
            this.dbDomain = dbDomain;
            this.__explicitlySet__.add("dbDomain");
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
        /** The {@code DB_UNIQUE_NAME} of the Oracle Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        /**
         * The {@code DB_UNIQUE_NAME} of the Oracle Database.
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
         * The protection mode of this Data Guard association. For more information, see [Oracle
         * Data Guard Protection
         * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private ProtectionMode protectionMode;

        /**
         * The protection mode of this Data Guard association. For more information, see [Oracle
         * Data Guard Protection
         * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         *
         * @param protectionMode the value to set
         * @return this builder
         */
        public Builder protectionMode(ProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceEncryptionKeyLocationDetails")
        private EncryptionKeyLocationDetails sourceEncryptionKeyLocationDetails;

        public Builder sourceEncryptionKeyLocationDetails(
                EncryptionKeyLocationDetails sourceEncryptionKeyLocationDetails) {
            this.sourceEncryptionKeyLocationDetails = sourceEncryptionKeyLocationDetails;
            this.__explicitlySet__.add("sourceEncryptionKeyLocationDetails");
            return this;
        }
        /**
         * The redo transport type to use for this Data Guard association. Valid values depend on
         * the specified {@code protectionMode}:
         *
         * <p>MAXIMUM_AVAILABILITY - SYNC or FASTSYNC * MAXIMUM_PERFORMANCE - ASYNC *
         * MAXIMUM_PROTECTION - SYNC
         *
         * <p>For more information, see [Redo Transport
         * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
         * in the Oracle Data Guard documentation.
         *
         * <p>*IMPORTANT** - The only transport type currently supported by the Database service is
         * ASYNC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("transportType")
        private TransportType transportType;

        /**
         * The redo transport type to use for this Data Guard association. Valid values depend on
         * the specified {@code protectionMode}:
         *
         * <p>MAXIMUM_AVAILABILITY - SYNC or FASTSYNC * MAXIMUM_PERFORMANCE - ASYNC *
         * MAXIMUM_PROTECTION - SYNC
         *
         * <p>For more information, see [Redo Transport
         * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
         * in the Oracle Data Guard documentation.
         *
         * <p>*IMPORTANT** - The only transport type currently supported by the Database service is
         * ASYNC.
         *
         * @param transportType the value to set
         * @return this builder
         */
        public Builder transportType(TransportType transportType) {
            this.transportType = transportType;
            this.__explicitlySet__.add("transportType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
        private DbBackupConfig dbBackupConfig;

        public Builder dbBackupConfig(DbBackupConfig dbBackupConfig) {
            this.dbBackupConfig = dbBackupConfig;
            this.__explicitlySet__.add("dbBackupConfig");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseFreeformTags")
        private java.util.Map<String, String> databaseFreeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param databaseFreeformTags the value to set
         * @return this builder
         */
        public Builder databaseFreeformTags(java.util.Map<String, String> databaseFreeformTags) {
            this.databaseFreeformTags = databaseFreeformTags;
            this.__explicitlySet__.add("databaseFreeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseDefinedTags")
        private java.util.Map<String, java.util.Map<String, Object>> databaseDefinedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param databaseDefinedTags the value to set
         * @return this builder
         */
        public Builder databaseDefinedTags(
                java.util.Map<String, java.util.Map<String, Object>> databaseDefinedTags) {
            this.databaseDefinedTags = databaseDefinedTags;
            this.__explicitlySet__.add("databaseDefinedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDatabaseForStandbyDbSystemDetails build() {
            CreateDatabaseForStandbyDbSystemDetails model =
                    new CreateDatabaseForStandbyDbSystemDetails(
                            this.adminPassword,
                            this.tdeWalletPassword,
                            this.databaseSoftwareImageId,
                            this.isActiveDataGuardEnabled,
                            this.dbDomain,
                            this.sidPrefix,
                            this.dbUniqueName,
                            this.protectionMode,
                            this.sourceEncryptionKeyLocationDetails,
                            this.transportType,
                            this.dbBackupConfig,
                            this.databaseFreeformTags,
                            this.databaseDefinedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDatabaseForStandbyDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("adminPassword")) {
                this.adminPassword(model.getAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("tdeWalletPassword")) {
                this.tdeWalletPassword(model.getTdeWalletPassword());
            }
            if (model.wasPropertyExplicitlySet("databaseSoftwareImageId")) {
                this.databaseSoftwareImageId(model.getDatabaseSoftwareImageId());
            }
            if (model.wasPropertyExplicitlySet("isActiveDataGuardEnabled")) {
                this.isActiveDataGuardEnabled(model.getIsActiveDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("dbDomain")) {
                this.dbDomain(model.getDbDomain());
            }
            if (model.wasPropertyExplicitlySet("sidPrefix")) {
                this.sidPrefix(model.getSidPrefix());
            }
            if (model.wasPropertyExplicitlySet("dbUniqueName")) {
                this.dbUniqueName(model.getDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("sourceEncryptionKeyLocationDetails")) {
                this.sourceEncryptionKeyLocationDetails(
                        model.getSourceEncryptionKeyLocationDetails());
            }
            if (model.wasPropertyExplicitlySet("transportType")) {
                this.transportType(model.getTransportType());
            }
            if (model.wasPropertyExplicitlySet("dbBackupConfig")) {
                this.dbBackupConfig(model.getDbBackupConfig());
            }
            if (model.wasPropertyExplicitlySet("databaseFreeformTags")) {
                this.databaseFreeformTags(model.getDatabaseFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("databaseDefinedTags")) {
                this.databaseDefinedTags(model.getDatabaseDefinedTags());
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

    /** For SYS, SYSTEM, and PDB Admin, enter the same password as the primary admin password. */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final String adminPassword;

    /**
     * For SYS, SYSTEM, and PDB Admin, enter the same password as the primary admin password.
     *
     * @return the value
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /** For TDE Wallet, enter the same password as the primary wallet password. */
    @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPassword")
    private final char[] tdeWalletPassword;

    /**
     * For TDE Wallet, enter the same password as the primary wallet password.
     *
     * @return the value
     * @deprecated Use getTdeWalletPassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getTdeWalletPassword() {
        return tdeWalletPassword != null ? new String(tdeWalletPassword) : null;
    }

    /**
     * For TDE Wallet, enter the same password as the primary wallet password.
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPassword")
    public char[] getTdeWalletPassword__AsCharArray() {
        return tdeWalletPassword;
    }

    /**
     * The database software image
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
    private final String databaseSoftwareImageId;

    /**
     * The database software image
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     *
     * @return the value
     */
    public String getDatabaseSoftwareImageId() {
        return databaseSoftwareImageId;
    }

    /** True if active Data Guard is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isActiveDataGuardEnabled")
    private final Boolean isActiveDataGuardEnabled;

    /**
     * True if active Data Guard is enabled.
     *
     * @return the value
     */
    public Boolean getIsActiveDataGuardEnabled() {
        return isActiveDataGuardEnabled;
    }

    /**
     * The database domain. In a distributed database system, DB_DOMAIN specifies the logical
     * location of the database within the network structure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbDomain")
    private final String dbDomain;

    /**
     * The database domain. In a distributed database system, DB_DOMAIN specifies the logical
     * location of the database within the network structure.
     *
     * @return the value
     */
    public String getDbDomain() {
        return dbDomain;
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

    /** The {@code DB_UNIQUE_NAME} of the Oracle Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    /**
     * The {@code DB_UNIQUE_NAME} of the Oracle Database.
     *
     * @return the value
     */
    public String getDbUniqueName() {
        return dbUniqueName;
    }

    /**
     * The protection mode of this Data Guard association. For more information, see [Oracle Data
     * Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     */
    public enum ProtectionMode implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The protection mode of this Data Guard association. For more information, see [Oracle Data
     * Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final ProtectionMode protectionMode;

    /**
     * The protection mode of this Data Guard association. For more information, see [Oracle Data
     * Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     * @return the value
     */
    public ProtectionMode getProtectionMode() {
        return protectionMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceEncryptionKeyLocationDetails")
    private final EncryptionKeyLocationDetails sourceEncryptionKeyLocationDetails;

    public EncryptionKeyLocationDetails getSourceEncryptionKeyLocationDetails() {
        return sourceEncryptionKeyLocationDetails;
    }

    /**
     * The redo transport type to use for this Data Guard association. Valid values depend on the
     * specified {@code protectionMode}:
     *
     * <p>MAXIMUM_AVAILABILITY - SYNC or FASTSYNC * MAXIMUM_PERFORMANCE - ASYNC * MAXIMUM_PROTECTION
     * - SYNC
     *
     * <p>For more information, see [Redo Transport
     * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     *
     * <p>*IMPORTANT** - The only transport type currently supported by the Database service is
     * ASYNC.
     */
    public enum TransportType implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The redo transport type to use for this Data Guard association. Valid values depend on the
     * specified {@code protectionMode}:
     *
     * <p>MAXIMUM_AVAILABILITY - SYNC or FASTSYNC * MAXIMUM_PERFORMANCE - ASYNC * MAXIMUM_PROTECTION
     * - SYNC
     *
     * <p>For more information, see [Redo Transport
     * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     *
     * <p>*IMPORTANT** - The only transport type currently supported by the Database service is
     * ASYNC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transportType")
    private final TransportType transportType;

    /**
     * The redo transport type to use for this Data Guard association. Valid values depend on the
     * specified {@code protectionMode}:
     *
     * <p>MAXIMUM_AVAILABILITY - SYNC or FASTSYNC * MAXIMUM_PERFORMANCE - ASYNC * MAXIMUM_PROTECTION
     * - SYNC
     *
     * <p>For more information, see [Redo Transport
     * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     *
     * <p>*IMPORTANT** - The only transport type currently supported by the Database service is
     * ASYNC.
     *
     * @return the value
     */
    public TransportType getTransportType() {
        return transportType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
    private final DbBackupConfig dbBackupConfig;

    public DbBackupConfig getDbBackupConfig() {
        return dbBackupConfig;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseFreeformTags")
    private final java.util.Map<String, String> databaseFreeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getDatabaseFreeformTags() {
        return databaseFreeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseDefinedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> databaseDefinedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDatabaseDefinedTags() {
        return databaseDefinedTags;
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
        sb.append("CreateDatabaseForStandbyDbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("adminPassword=").append(String.valueOf(this.adminPassword));
        sb.append(", tdeWalletPassword=").append("<redacted>");
        sb.append(", databaseSoftwareImageId=")
                .append(String.valueOf(this.databaseSoftwareImageId));
        sb.append(", isActiveDataGuardEnabled=")
                .append(String.valueOf(this.isActiveDataGuardEnabled));
        sb.append(", dbDomain=").append(String.valueOf(this.dbDomain));
        sb.append(", sidPrefix=").append(String.valueOf(this.sidPrefix));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", sourceEncryptionKeyLocationDetails=")
                .append(String.valueOf(this.sourceEncryptionKeyLocationDetails));
        sb.append(", transportType=").append(String.valueOf(this.transportType));
        sb.append(", dbBackupConfig=").append(String.valueOf(this.dbBackupConfig));
        sb.append(", databaseFreeformTags=").append(String.valueOf(this.databaseFreeformTags));
        sb.append(", databaseDefinedTags=").append(String.valueOf(this.databaseDefinedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabaseForStandbyDbSystemDetails)) {
            return false;
        }

        CreateDatabaseForStandbyDbSystemDetails other = (CreateDatabaseForStandbyDbSystemDetails) o;
        return java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && java.util.Objects.equals(this.tdeWalletPassword, other.tdeWalletPassword)
                && java.util.Objects.equals(
                        this.databaseSoftwareImageId, other.databaseSoftwareImageId)
                && java.util.Objects.equals(
                        this.isActiveDataGuardEnabled, other.isActiveDataGuardEnabled)
                && java.util.Objects.equals(this.dbDomain, other.dbDomain)
                && java.util.Objects.equals(this.sidPrefix, other.sidPrefix)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(
                        this.sourceEncryptionKeyLocationDetails,
                        other.sourceEncryptionKeyLocationDetails)
                && java.util.Objects.equals(this.transportType, other.transportType)
                && java.util.Objects.equals(this.dbBackupConfig, other.dbBackupConfig)
                && java.util.Objects.equals(this.databaseFreeformTags, other.databaseFreeformTags)
                && java.util.Objects.equals(this.databaseDefinedTags, other.databaseDefinedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.tdeWalletPassword == null ? 43 : this.tdeWalletPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSoftwareImageId == null
                                ? 43
                                : this.databaseSoftwareImageId.hashCode());
        result =
                (result * PRIME)
                        + (this.isActiveDataGuardEnabled == null
                                ? 43
                                : this.isActiveDataGuardEnabled.hashCode());
        result = (result * PRIME) + (this.dbDomain == null ? 43 : this.dbDomain.hashCode());
        result = (result * PRIME) + (this.sidPrefix == null ? 43 : this.sidPrefix.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceEncryptionKeyLocationDetails == null
                                ? 43
                                : this.sourceEncryptionKeyLocationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.transportType == null ? 43 : this.transportType.hashCode());
        result =
                (result * PRIME)
                        + (this.dbBackupConfig == null ? 43 : this.dbBackupConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseFreeformTags == null
                                ? 43
                                : this.databaseFreeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseDefinedTags == null
                                ? 43
                                : this.databaseDefinedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
