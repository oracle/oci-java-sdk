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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Backup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Backup extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "databaseId",
        "displayName",
        "type",
        "timeStarted",
        "timeEnded",
        "lifecycleDetails",
        "availabilityDomain",
        "lifecycleState",
        "databaseEdition",
        "databaseSizeInGBs",
        "shape",
        "version",
        "kmsKeyId",
        "kmsKeyVersionId",
        "vaultId",
        "keyStoreId",
        "keyStoreWalletName",
        "secondaryKmsKeyIds",
        "retentionPeriodInDays",
        "retentionPeriodInYears",
        "timeExpiryScheduled",
        "isUsingOracleManagedKeys",
        "backupDestinationType",
        "encryptionKeyLocationDetails"
    })
    public Backup(
            String id,
            String compartmentId,
            String databaseId,
            String displayName,
            Type type,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            String lifecycleDetails,
            String availabilityDomain,
            LifecycleState lifecycleState,
            DatabaseEdition databaseEdition,
            Double databaseSizeInGBs,
            String shape,
            String version,
            String kmsKeyId,
            String kmsKeyVersionId,
            String vaultId,
            String keyStoreId,
            String keyStoreWalletName,
            java.util.List<String> secondaryKmsKeyIds,
            Integer retentionPeriodInDays,
            Integer retentionPeriodInYears,
            java.util.Date timeExpiryScheduled,
            Boolean isUsingOracleManagedKeys,
            BackupDestinationType backupDestinationType,
            EncryptionKeyLocationDetails encryptionKeyLocationDetails) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.databaseId = databaseId;
        this.displayName = displayName;
        this.type = type;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.lifecycleDetails = lifecycleDetails;
        this.availabilityDomain = availabilityDomain;
        this.lifecycleState = lifecycleState;
        this.databaseEdition = databaseEdition;
        this.databaseSizeInGBs = databaseSizeInGBs;
        this.shape = shape;
        this.version = version;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.vaultId = vaultId;
        this.keyStoreId = keyStoreId;
        this.keyStoreWalletName = keyStoreWalletName;
        this.secondaryKmsKeyIds = secondaryKmsKeyIds;
        this.retentionPeriodInDays = retentionPeriodInDays;
        this.retentionPeriodInYears = retentionPeriodInYears;
        this.timeExpiryScheduled = timeExpiryScheduled;
        this.isUsingOracleManagedKeys = isUsingOracleManagedKeys;
        this.backupDestinationType = backupDestinationType;
        this.encryptionKeyLocationDetails = encryptionKeyLocationDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * backup.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * backup.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * database.
         *
         * @param databaseId the value to set
         * @return this builder
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /** The user-friendly name for the backup. The name does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the backup. The name does not have to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The type of backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of backup.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The date and time the backup started. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the backup started.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** The date and time the backup was completed. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The date and time the backup was completed.
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /** Additional information about the current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The name of the availability domain where the database backup is stored. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain where the database backup is stored.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /** The current state of the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the backup.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The Oracle Database Edition that applies to all the databases on the DB system. Exadata
         * DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private DatabaseEdition databaseEdition;

        /**
         * The Oracle Database Edition that applies to all the databases on the DB system. Exadata
         * DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
         *
         * @param databaseEdition the value to set
         * @return this builder
         */
        public Builder databaseEdition(DatabaseEdition databaseEdition) {
            this.databaseEdition = databaseEdition;
            this.__explicitlySet__.add("databaseEdition");
            return this;
        }
        /** The size of the database in gigabytes at the time the backup was taken. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSizeInGBs")
        private Double databaseSizeInGBs;

        /**
         * The size of the database in gigabytes at the time the backup was taken.
         *
         * @param databaseSizeInGBs the value to set
         * @return this builder
         */
        public Builder databaseSizeInGBs(Double databaseSizeInGBs) {
            this.databaseSizeInGBs = databaseSizeInGBs;
            this.__explicitlySet__.add("databaseSizeInGBs");
            return this;
        }
        /** Shape of the backup's source database. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * Shape of the backup's source database.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** Version of the backup's source database */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Version of the backup's source database
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The OCID of the key container that is used as the master encryption key in database
         * transparent data encryption (TDE) operations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the key container that is used as the master encryption key in database
         * transparent data encryption (TDE) operations.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * The OCID of the key container version that is used in database transparent data
         * encryption (TDE) operations KMS Key can have multiple key versions. If none is specified,
         * the current key version (latest) of the Key Id is used for the operation. Autonomous AI
         * Database Serverless does not use key versions, hence is not applicable for Autonomous AI
         * Database Serverless instances.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        /**
         * The OCID of the key container version that is used in database transparent data
         * encryption (TDE) operations KMS Key can have multiple key versions. If none is specified,
         * the current key version (latest) of the Key Id is used for the operation. Autonomous AI
         * Database Serverless does not use key versions, hence is not applicable for Autonomous AI
         * Database Serverless instances.
         *
         * @param kmsKeyVersionId the value to set
         * @return this builder
         */
        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure
         * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * This parameter and {@code secretId} are required for Customer Managed Keys.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure
         * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * This parameter and {@code secretId} are required for Customer Managed Keys.
         *
         * @param vaultId the value to set
         * @return this builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * key store of Oracle Vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
        private String keyStoreId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * key store of Oracle Vault.
         *
         * @param keyStoreId the value to set
         * @return this builder
         */
        public Builder keyStoreId(String keyStoreId) {
            this.keyStoreId = keyStoreId;
            this.__explicitlySet__.add("keyStoreId");
            return this;
        }
        /** The wallet name for Oracle Key Vault. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreWalletName")
        private String keyStoreWalletName;

        /**
         * The wallet name for Oracle Key Vault.
         *
         * @param keyStoreWalletName the value to set
         * @return this builder
         */
        public Builder keyStoreWalletName(String keyStoreWalletName) {
            this.keyStoreWalletName = keyStoreWalletName;
            this.__explicitlySet__.add("keyStoreWalletName");
            return this;
        }
        /**
         * List of OCIDs of the key containers used as the secondary encryption key in database
         * transparent data encryption (TDE) operations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secondaryKmsKeyIds")
        private java.util.List<String> secondaryKmsKeyIds;

        /**
         * List of OCIDs of the key containers used as the secondary encryption key in database
         * transparent data encryption (TDE) operations.
         *
         * @param secondaryKmsKeyIds the value to set
         * @return this builder
         */
        public Builder secondaryKmsKeyIds(java.util.List<String> secondaryKmsKeyIds) {
            this.secondaryKmsKeyIds = secondaryKmsKeyIds;
            this.__explicitlySet__.add("secondaryKmsKeyIds");
            return this;
        }
        /** The retention period of the long term backup in days. */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
        private Integer retentionPeriodInDays;

        /**
         * The retention period of the long term backup in days.
         *
         * @param retentionPeriodInDays the value to set
         * @return this builder
         */
        public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = retentionPeriodInDays;
            this.__explicitlySet__.add("retentionPeriodInDays");
            return this;
        }
        /** The retention period of the long term backup in years. */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInYears")
        private Integer retentionPeriodInYears;

        /**
         * The retention period of the long term backup in years.
         *
         * @param retentionPeriodInYears the value to set
         * @return this builder
         */
        public Builder retentionPeriodInYears(Integer retentionPeriodInYears) {
            this.retentionPeriodInYears = retentionPeriodInYears;
            this.__explicitlySet__.add("retentionPeriodInYears");
            return this;
        }
        /** Expiration time of the long term database backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpiryScheduled")
        private java.util.Date timeExpiryScheduled;

        /**
         * Expiration time of the long term database backup.
         *
         * @param timeExpiryScheduled the value to set
         * @return this builder
         */
        public Builder timeExpiryScheduled(java.util.Date timeExpiryScheduled) {
            this.timeExpiryScheduled = timeExpiryScheduled;
            this.__explicitlySet__.add("timeExpiryScheduled");
            return this;
        }
        /** True if Oracle Managed Keys is required for restore of the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUsingOracleManagedKeys")
        private Boolean isUsingOracleManagedKeys;

        /**
         * True if Oracle Managed Keys is required for restore of the backup.
         *
         * @param isUsingOracleManagedKeys the value to set
         * @return this builder
         */
        public Builder isUsingOracleManagedKeys(Boolean isUsingOracleManagedKeys) {
            this.isUsingOracleManagedKeys = isUsingOracleManagedKeys;
            this.__explicitlySet__.add("isUsingOracleManagedKeys");
            return this;
        }
        /** Type of the backup destination. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationType")
        private BackupDestinationType backupDestinationType;

        /**
         * Type of the backup destination.
         *
         * @param backupDestinationType the value to set
         * @return this builder
         */
        public Builder backupDestinationType(BackupDestinationType backupDestinationType) {
            this.backupDestinationType = backupDestinationType;
            this.__explicitlySet__.add("backupDestinationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionKeyLocationDetails")
        private EncryptionKeyLocationDetails encryptionKeyLocationDetails;

        public Builder encryptionKeyLocationDetails(
                EncryptionKeyLocationDetails encryptionKeyLocationDetails) {
            this.encryptionKeyLocationDetails = encryptionKeyLocationDetails;
            this.__explicitlySet__.add("encryptionKeyLocationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Backup build() {
            Backup model =
                    new Backup(
                            this.id,
                            this.compartmentId,
                            this.databaseId,
                            this.displayName,
                            this.type,
                            this.timeStarted,
                            this.timeEnded,
                            this.lifecycleDetails,
                            this.availabilityDomain,
                            this.lifecycleState,
                            this.databaseEdition,
                            this.databaseSizeInGBs,
                            this.shape,
                            this.version,
                            this.kmsKeyId,
                            this.kmsKeyVersionId,
                            this.vaultId,
                            this.keyStoreId,
                            this.keyStoreWalletName,
                            this.secondaryKmsKeyIds,
                            this.retentionPeriodInDays,
                            this.retentionPeriodInYears,
                            this.timeExpiryScheduled,
                            this.isUsingOracleManagedKeys,
                            this.backupDestinationType,
                            this.encryptionKeyLocationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Backup model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("databaseEdition")) {
                this.databaseEdition(model.getDatabaseEdition());
            }
            if (model.wasPropertyExplicitlySet("databaseSizeInGBs")) {
                this.databaseSizeInGBs(model.getDatabaseSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyVersionId")) {
                this.kmsKeyVersionId(model.getKmsKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyStoreId")) {
                this.keyStoreId(model.getKeyStoreId());
            }
            if (model.wasPropertyExplicitlySet("keyStoreWalletName")) {
                this.keyStoreWalletName(model.getKeyStoreWalletName());
            }
            if (model.wasPropertyExplicitlySet("secondaryKmsKeyIds")) {
                this.secondaryKmsKeyIds(model.getSecondaryKmsKeyIds());
            }
            if (model.wasPropertyExplicitlySet("retentionPeriodInDays")) {
                this.retentionPeriodInDays(model.getRetentionPeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("retentionPeriodInYears")) {
                this.retentionPeriodInYears(model.getRetentionPeriodInYears());
            }
            if (model.wasPropertyExplicitlySet("timeExpiryScheduled")) {
                this.timeExpiryScheduled(model.getTimeExpiryScheduled());
            }
            if (model.wasPropertyExplicitlySet("isUsingOracleManagedKeys")) {
                this.isUsingOracleManagedKeys(model.getIsUsingOracleManagedKeys());
            }
            if (model.wasPropertyExplicitlySet("backupDestinationType")) {
                this.backupDestinationType(model.getBackupDestinationType());
            }
            if (model.wasPropertyExplicitlySet("encryptionKeyLocationDetails")) {
                this.encryptionKeyLocationDetails(model.getEncryptionKeyLocationDetails());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * backup.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * database.
     *
     * @return the value
     */
    public String getDatabaseId() {
        return databaseId;
    }

    /** The user-friendly name for the backup. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the backup. The name does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The type of backup. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Incremental("INCREMENTAL"),
        Full("FULL"),
        VirtualFull("VIRTUAL_FULL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** The type of backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of backup.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** The date and time the backup started. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the backup started.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The date and time the backup was completed. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The date and time the backup was completed.
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /** Additional information about the current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The name of the availability domain where the database backup is stored. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain where the database backup is stored.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** The current state of the backup. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        Restoring("RESTORING"),
        Updating("UPDATING"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the backup.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The Oracle Database Edition that applies to all the databases on the DB system. Exadata DB
     * systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     */
    public enum DatabaseEdition implements com.oracle.bmc.http.internal.BmcEnum {
        StandardEdition("STANDARD_EDITION"),
        EnterpriseEdition("ENTERPRISE_EDITION"),
        EnterpriseEditionHighPerformance("ENTERPRISE_EDITION_HIGH_PERFORMANCE"),
        EnterpriseEditionExtremePerformance("ENTERPRISE_EDITION_EXTREME_PERFORMANCE"),
        EnterpriseEditionDeveloper("ENTERPRISE_EDITION_DEVELOPER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DatabaseEdition.class);

        private final String value;
        private static java.util.Map<String, DatabaseEdition> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseEdition v : DatabaseEdition.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseEdition(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseEdition create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseEdition', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Oracle Database Edition that applies to all the databases on the DB system. Exadata DB
     * systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    private final DatabaseEdition databaseEdition;

    /**
     * The Oracle Database Edition that applies to all the databases on the DB system. Exadata DB
     * systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     *
     * @return the value
     */
    public DatabaseEdition getDatabaseEdition() {
        return databaseEdition;
    }

    /** The size of the database in gigabytes at the time the backup was taken. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSizeInGBs")
    private final Double databaseSizeInGBs;

    /**
     * The size of the database in gigabytes at the time the backup was taken.
     *
     * @return the value
     */
    public Double getDatabaseSizeInGBs() {
        return databaseSizeInGBs;
    }

    /** Shape of the backup's source database. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * Shape of the backup's source database.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** Version of the backup's source database */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Version of the backup's source database
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /**
     * The OCID of the key container that is used as the master encryption key in database
     * transparent data encryption (TDE) operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the key container that is used as the master encryption key in database
     * transparent data encryption (TDE) operations.
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The OCID of the key container version that is used in database transparent data encryption
     * (TDE) operations KMS Key can have multiple key versions. If none is specified, the current
     * key version (latest) of the Key Id is used for the operation. Autonomous AI Database
     * Serverless does not use key versions, hence is not applicable for Autonomous AI Database
     * Serverless instances.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    private final String kmsKeyVersionId;

    /**
     * The OCID of the key container version that is used in database transparent data encryption
     * (TDE) operations KMS Key can have multiple key versions. If none is specified, the current
     * key version (latest) of the Key Id is used for the operation. Autonomous AI Database
     * Serverless does not use key versions, hence is not applicable for Autonomous AI Database
     * Serverless instances.
     *
     * @return the value
     */
    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * This parameter and {@code secretId} are required for Customer Managed Keys.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * This parameter and {@code secretId} are required for Customer Managed Keys.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key
     * store of Oracle Vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
    private final String keyStoreId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key
     * store of Oracle Vault.
     *
     * @return the value
     */
    public String getKeyStoreId() {
        return keyStoreId;
    }

    /** The wallet name for Oracle Key Vault. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreWalletName")
    private final String keyStoreWalletName;

    /**
     * The wallet name for Oracle Key Vault.
     *
     * @return the value
     */
    public String getKeyStoreWalletName() {
        return keyStoreWalletName;
    }

    /**
     * List of OCIDs of the key containers used as the secondary encryption key in database
     * transparent data encryption (TDE) operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secondaryKmsKeyIds")
    private final java.util.List<String> secondaryKmsKeyIds;

    /**
     * List of OCIDs of the key containers used as the secondary encryption key in database
     * transparent data encryption (TDE) operations.
     *
     * @return the value
     */
    public java.util.List<String> getSecondaryKmsKeyIds() {
        return secondaryKmsKeyIds;
    }

    /** The retention period of the long term backup in days. */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
    private final Integer retentionPeriodInDays;

    /**
     * The retention period of the long term backup in days.
     *
     * @return the value
     */
    public Integer getRetentionPeriodInDays() {
        return retentionPeriodInDays;
    }

    /** The retention period of the long term backup in years. */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInYears")
    private final Integer retentionPeriodInYears;

    /**
     * The retention period of the long term backup in years.
     *
     * @return the value
     */
    public Integer getRetentionPeriodInYears() {
        return retentionPeriodInYears;
    }

    /** Expiration time of the long term database backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpiryScheduled")
    private final java.util.Date timeExpiryScheduled;

    /**
     * Expiration time of the long term database backup.
     *
     * @return the value
     */
    public java.util.Date getTimeExpiryScheduled() {
        return timeExpiryScheduled;
    }

    /** True if Oracle Managed Keys is required for restore of the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUsingOracleManagedKeys")
    private final Boolean isUsingOracleManagedKeys;

    /**
     * True if Oracle Managed Keys is required for restore of the backup.
     *
     * @return the value
     */
    public Boolean getIsUsingOracleManagedKeys() {
        return isUsingOracleManagedKeys;
    }

    /** Type of the backup destination. */
    public enum BackupDestinationType implements com.oracle.bmc.http.internal.BmcEnum {
        ObjectStore("OBJECT_STORE"),
        Dbrs("DBRS"),
        AwsS3("AWS_S3"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackupDestinationType.class);

        private final String value;
        private static java.util.Map<String, BackupDestinationType> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupDestinationType v : BackupDestinationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupDestinationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupDestinationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupDestinationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type of the backup destination. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationType")
    private final BackupDestinationType backupDestinationType;

    /**
     * Type of the backup destination.
     *
     * @return the value
     */
    public BackupDestinationType getBackupDestinationType() {
        return backupDestinationType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("encryptionKeyLocationDetails")
    private final EncryptionKeyLocationDetails encryptionKeyLocationDetails;

    public EncryptionKeyLocationDetails getEncryptionKeyLocationDetails() {
        return encryptionKeyLocationDetails;
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
        sb.append("Backup(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", databaseEdition=").append(String.valueOf(this.databaseEdition));
        sb.append(", databaseSizeInGBs=").append(String.valueOf(this.databaseSizeInGBs));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", keyStoreId=").append(String.valueOf(this.keyStoreId));
        sb.append(", keyStoreWalletName=").append(String.valueOf(this.keyStoreWalletName));
        sb.append(", secondaryKmsKeyIds=").append(String.valueOf(this.secondaryKmsKeyIds));
        sb.append(", retentionPeriodInDays=").append(String.valueOf(this.retentionPeriodInDays));
        sb.append(", retentionPeriodInYears=").append(String.valueOf(this.retentionPeriodInYears));
        sb.append(", timeExpiryScheduled=").append(String.valueOf(this.timeExpiryScheduled));
        sb.append(", isUsingOracleManagedKeys=")
                .append(String.valueOf(this.isUsingOracleManagedKeys));
        sb.append(", backupDestinationType=").append(String.valueOf(this.backupDestinationType));
        sb.append(", encryptionKeyLocationDetails=")
                .append(String.valueOf(this.encryptionKeyLocationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Backup)) {
            return false;
        }

        Backup other = (Backup) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.databaseEdition, other.databaseEdition)
                && java.util.Objects.equals(this.databaseSizeInGBs, other.databaseSizeInGBs)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.keyStoreId, other.keyStoreId)
                && java.util.Objects.equals(this.keyStoreWalletName, other.keyStoreWalletName)
                && java.util.Objects.equals(this.secondaryKmsKeyIds, other.secondaryKmsKeyIds)
                && java.util.Objects.equals(this.retentionPeriodInDays, other.retentionPeriodInDays)
                && java.util.Objects.equals(
                        this.retentionPeriodInYears, other.retentionPeriodInYears)
                && java.util.Objects.equals(this.timeExpiryScheduled, other.timeExpiryScheduled)
                && java.util.Objects.equals(
                        this.isUsingOracleManagedKeys, other.isUsingOracleManagedKeys)
                && java.util.Objects.equals(this.backupDestinationType, other.backupDestinationType)
                && java.util.Objects.equals(
                        this.encryptionKeyLocationDetails, other.encryptionKeyLocationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseEdition == null ? 43 : this.databaseEdition.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSizeInGBs == null ? 43 : this.databaseSizeInGBs.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.keyStoreId == null ? 43 : this.keyStoreId.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStoreWalletName == null
                                ? 43
                                : this.keyStoreWalletName.hashCode());
        result =
                (result * PRIME)
                        + (this.secondaryKmsKeyIds == null
                                ? 43
                                : this.secondaryKmsKeyIds.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPeriodInDays == null
                                ? 43
                                : this.retentionPeriodInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPeriodInYears == null
                                ? 43
                                : this.retentionPeriodInYears.hashCode());
        result =
                (result * PRIME)
                        + (this.timeExpiryScheduled == null
                                ? 43
                                : this.timeExpiryScheduled.hashCode());
        result =
                (result * PRIME)
                        + (this.isUsingOracleManagedKeys == null
                                ? 43
                                : this.isUsingOracleManagedKeys.hashCode());
        result =
                (result * PRIME)
                        + (this.backupDestinationType == null
                                ? 43
                                : this.backupDestinationType.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionKeyLocationDetails == null
                                ? 43
                                : this.encryptionKeyLocationDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
