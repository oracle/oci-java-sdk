/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
        builder = CreateDatabaseFromSnapshotDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDatabaseFromSnapshotDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    public CreateDatabaseFromSnapshotDetails(
            String sourceSnapshotId,
            Boolean isThinClone,
            String sourceTdePassword,
            String sourceAdminPassword,
            EncryptionKeyLocationDetails sourceEncryptionKeyLocationDetails,
            String tdeWalletPassword,
            DbBackupConfig dbBackupConfig,
            String adminPassword,
            String dbUniqueName,
            String dbName,
            String characterSet,
            String ncharacterSet,
            String sidPrefix,
            String keyStoreId,
            EncryptionKeyLocationDetails encryptionKeyLocationDetails,
            DatabaseStorageSizeDetails storageSizeDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            DataSafeRegistrationRequestDetails dataSafeRegistrationDetails) {
        super();
        this.sourceSnapshotId = sourceSnapshotId;
        this.isThinClone = isThinClone;
        this.sourceTdePassword = sourceTdePassword != null ? sourceTdePassword.toCharArray() : null;
        this.sourceAdminPassword =
                sourceAdminPassword != null ? sourceAdminPassword.toCharArray() : null;
        this.sourceEncryptionKeyLocationDetails = sourceEncryptionKeyLocationDetails;
        this.tdeWalletPassword = tdeWalletPassword != null ? tdeWalletPassword.toCharArray() : null;
        this.dbBackupConfig = dbBackupConfig;
        this.adminPassword = adminPassword != null ? adminPassword.toCharArray() : null;
        this.dbUniqueName = dbUniqueName;
        this.dbName = dbName;
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.sidPrefix = sidPrefix;
        this.keyStoreId = keyStoreId;
        this.encryptionKeyLocationDetails = encryptionKeyLocationDetails;
        this.storageSizeDetails = storageSizeDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.dataSafeRegistrationDetails = dataSafeRegistrationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceSnapshotId",
        "isThinClone",
        "sourceTdePassword",
        "sourceAdminPassword",
        "sourceEncryptionKeyLocationDetails",
        "tdeWalletPassword",
        "dbBackupConfig",
        "adminPassword",
        "dbUniqueName",
        "dbName",
        "characterSet",
        "ncharacterSet",
        "sidPrefix",
        "keyStoreId",
        "encryptionKeyLocationDetails",
        "storageSizeDetails",
        "freeformTags",
        "definedTags",
        "dataSafeRegistrationDetails"
    })
    public CreateDatabaseFromSnapshotDetails(
            String sourceSnapshotId,
            Boolean isThinClone,
            char[] sourceTdePassword,
            char[] sourceAdminPassword,
            EncryptionKeyLocationDetails sourceEncryptionKeyLocationDetails,
            char[] tdeWalletPassword,
            DbBackupConfig dbBackupConfig,
            char[] adminPassword,
            String dbUniqueName,
            String dbName,
            String characterSet,
            String ncharacterSet,
            String sidPrefix,
            String keyStoreId,
            EncryptionKeyLocationDetails encryptionKeyLocationDetails,
            DatabaseStorageSizeDetails storageSizeDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            DataSafeRegistrationRequestDetails dataSafeRegistrationDetails) {
        super();
        this.sourceSnapshotId = sourceSnapshotId;
        this.isThinClone = isThinClone;
        this.sourceTdePassword = sourceTdePassword;
        this.sourceAdminPassword = sourceAdminPassword;
        this.sourceEncryptionKeyLocationDetails = sourceEncryptionKeyLocationDetails;
        this.tdeWalletPassword = tdeWalletPassword;
        this.dbBackupConfig = dbBackupConfig;
        this.adminPassword = adminPassword;
        this.dbUniqueName = dbUniqueName;
        this.dbName = dbName;
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.sidPrefix = sidPrefix;
        this.keyStoreId = keyStoreId;
        this.encryptionKeyLocationDetails = encryptionKeyLocationDetails;
        this.storageSizeDetails = storageSizeDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.dataSafeRegistrationDetails = dataSafeRegistrationDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The snapshot
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceSnapshotId")
        private String sourceSnapshotId;

        /**
         * The snapshot
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param sourceSnapshotId the value to set
         * @return this builder
         */
        public Builder sourceSnapshotId(String sourceSnapshotId) {
            this.sourceSnapshotId = sourceSnapshotId;
            this.__explicitlySet__.add("sourceSnapshotId");
            return this;
        }
        /** Specifies whether thick or thin database cloning is to be performed. */
        @com.fasterxml.jackson.annotation.JsonProperty("isThinClone")
        private Boolean isThinClone;

        /**
         * Specifies whether thick or thin database cloning is to be performed.
         *
         * @param isThinClone the value to set
         * @return this builder
         */
        public Builder isThinClone(Boolean isThinClone) {
            this.isThinClone = isThinClone;
            this.__explicitlySet__.add("isThinClone");
            return this;
        }
        /** The password to open the TDE wallet. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceTdePassword")
        private char[] sourceTdePassword;

        /**
         * The password to open the TDE wallet.
         *
         * @param sourceTdePassword the value to set
         * @return this builder
         */
        public Builder sourceTdePassword(char[] sourceTdePassword) {
            this.sourceTdePassword = sourceTdePassword;
            this.__explicitlySet__.add("sourceTdePassword");
            return this;
        }

        public Builder sourceTdePassword(String sourceTdePassword) {
            this.sourceTdePassword =
                    sourceTdePassword != null ? sourceTdePassword.toCharArray() : null;
            this.__explicitlySet__.add("sourceTdePassword");
            return this;
        }
        /** The source database's password for SYS, SYSTEM. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceAdminPassword")
        private char[] sourceAdminPassword;

        /**
         * The source database's password for SYS, SYSTEM.
         *
         * @param sourceAdminPassword the value to set
         * @return this builder
         */
        public Builder sourceAdminPassword(char[] sourceAdminPassword) {
            this.sourceAdminPassword = sourceAdminPassword;
            this.__explicitlySet__.add("sourceAdminPassword");
            return this;
        }

        public Builder sourceAdminPassword(String sourceAdminPassword) {
            this.sourceAdminPassword =
                    sourceAdminPassword != null ? sourceAdminPassword.toCharArray() : null;
            this.__explicitlySet__.add("sourceAdminPassword");
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
        /** The password for the target Database TDE wallet. */
        @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPassword")
        private char[] tdeWalletPassword;

        /**
         * The password for the target Database TDE wallet.
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

        @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
        private DbBackupConfig dbBackupConfig;

        public Builder dbBackupConfig(DbBackupConfig dbBackupConfig) {
            this.dbBackupConfig = dbBackupConfig;
            this.__explicitlySet__.add("dbBackupConfig");
            return this;
        }
        /**
         * A strong password for SYS, SYSTEM, PDB Admin and TDE Wallet. The password must be at
         * least nine characters and contain at least two uppercase, two lowercase, two numbers, and
         * two special characters. The special characters must be _, \\#, or -.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private char[] adminPassword;

        /**
         * A strong password for SYS, SYSTEM, PDB Admin and TDE Wallet. The password must be at
         * least nine characters and contain at least two uppercase, two lowercase, two numbers, and
         * two special characters. The special characters must be _, \\#, or -.
         *
         * @param adminPassword the value to set
         * @return this builder
         */
        public Builder adminPassword(char[] adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }

        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword != null ? adminPassword.toCharArray() : null;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }
        /** The {@code DB_UNIQUE_NAME} for the new Oracle Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        /**
         * The {@code DB_UNIQUE_NAME} for the new Oracle Database.
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
         * The display name of the database to be created from the snapshot/database. It must begin
         * with an alphabetic character and can contain a maximum of eight alphanumeric characters.
         * Special characters are not permitted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        /**
         * The display name of the database to be created from the snapshot/database. It must begin
         * with an alphabetic character and can contain a maximum of eight alphanumeric characters.
         * Special characters are not permitted.
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
         * The character set for the database. The default is AL32UTF8. Allowed values are:
         * AL32UTF8, AR8ADOS710, AR8ADOS720, AR8APTEC715, AR8ARABICMACS, AR8ASMO8X, AR8ISO8859P6,
         * AR8MSWIN1256, AR8MUSSAD768, AR8NAFITHA711, AR8NAFITHA721, AR8SAKHR706, AR8SAKHR707,
         * AZ8ISO8859P9E, BG8MSWIN, BG8PC437S, BLT8CP921, BLT8ISO8859P13, BLT8MSWIN1257, BLT8PC775,
         * BN8BSCII, CDN8PC863, CEL8ISO8859P14, CL8ISO8859P5, CL8ISOIR111, CL8KOI8R, CL8KOI8U,
         * CL8MACCYRILLICS, CL8MSWIN1251, EE8ISO8859P2, EE8MACCES, EE8MACCROATIANS, EE8MSWIN1250,
         * EE8PC852, EL8DEC, EL8ISO8859P7, EL8MACGREEKS, EL8MSWIN1253, EL8PC437S, EL8PC851,
         * EL8PC869, ET8MSWIN923, HU8ABMOD, HU8CWI2, IN8ISCII, IS8PC861, IW8ISO8859P8,
         * IW8MACHEBREWS, IW8MSWIN1255, IW8PC1507, JA16EUC, JA16EUCTILDE, JA16SJIS, JA16SJISTILDE,
         * JA16VMS, KO16KSC5601, KO16KSCCS, KO16MSWIN949, LA8ISO6937, LA8PASSPORT, LT8MSWIN921,
         * LT8PC772, LT8PC774, LV8PC1117, LV8PC8LR, LV8RST104090, N8PC865, NE8ISO8859P10,
         * NEE8ISO8859P4, RU8BESTA, RU8PC855, RU8PC866, SE8ISO8859P3, TH8MACTHAIS, TH8TISASCII,
         * TR8DEC, TR8MACTURKISHS, TR8MSWIN1254, TR8PC857, US7ASCII, US8PC437, UTF8, VN8MSWIN1258,
         * VN8VN3, WE8DEC, WE8DG, WE8ISO8859P1, WE8ISO8859P15, WE8ISO8859P9, WE8MACROMAN8S,
         * WE8MSWIN1252, WE8NCR4970, WE8NEXTSTEP, WE8PC850, WE8PC858, WE8PC860, WE8ROMAN8,
         * ZHS16CGB231280, ZHS16GBK, ZHT16BIG5, ZHT16CCDC, ZHT16DBT, ZHT16HKSCS, ZHT16MSWIN950,
         * ZHT32EUC, ZHT32SOPS, ZHT32TRIS
         */
        @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
        private String characterSet;

        /**
         * The character set for the database. The default is AL32UTF8. Allowed values are:
         * AL32UTF8, AR8ADOS710, AR8ADOS720, AR8APTEC715, AR8ARABICMACS, AR8ASMO8X, AR8ISO8859P6,
         * AR8MSWIN1256, AR8MUSSAD768, AR8NAFITHA711, AR8NAFITHA721, AR8SAKHR706, AR8SAKHR707,
         * AZ8ISO8859P9E, BG8MSWIN, BG8PC437S, BLT8CP921, BLT8ISO8859P13, BLT8MSWIN1257, BLT8PC775,
         * BN8BSCII, CDN8PC863, CEL8ISO8859P14, CL8ISO8859P5, CL8ISOIR111, CL8KOI8R, CL8KOI8U,
         * CL8MACCYRILLICS, CL8MSWIN1251, EE8ISO8859P2, EE8MACCES, EE8MACCROATIANS, EE8MSWIN1250,
         * EE8PC852, EL8DEC, EL8ISO8859P7, EL8MACGREEKS, EL8MSWIN1253, EL8PC437S, EL8PC851,
         * EL8PC869, ET8MSWIN923, HU8ABMOD, HU8CWI2, IN8ISCII, IS8PC861, IW8ISO8859P8,
         * IW8MACHEBREWS, IW8MSWIN1255, IW8PC1507, JA16EUC, JA16EUCTILDE, JA16SJIS, JA16SJISTILDE,
         * JA16VMS, KO16KSC5601, KO16KSCCS, KO16MSWIN949, LA8ISO6937, LA8PASSPORT, LT8MSWIN921,
         * LT8PC772, LT8PC774, LV8PC1117, LV8PC8LR, LV8RST104090, N8PC865, NE8ISO8859P10,
         * NEE8ISO8859P4, RU8BESTA, RU8PC855, RU8PC866, SE8ISO8859P3, TH8MACTHAIS, TH8TISASCII,
         * TR8DEC, TR8MACTURKISHS, TR8MSWIN1254, TR8PC857, US7ASCII, US8PC437, UTF8, VN8MSWIN1258,
         * VN8VN3, WE8DEC, WE8DG, WE8ISO8859P1, WE8ISO8859P15, WE8ISO8859P9, WE8MACROMAN8S,
         * WE8MSWIN1252, WE8NCR4970, WE8NEXTSTEP, WE8PC850, WE8PC858, WE8PC860, WE8ROMAN8,
         * ZHS16CGB231280, ZHS16GBK, ZHT16BIG5, ZHT16CCDC, ZHT16DBT, ZHT16HKSCS, ZHT16MSWIN950,
         * ZHT32EUC, ZHT32SOPS, ZHT32TRIS
         *
         * @param characterSet the value to set
         * @return this builder
         */
        public Builder characterSet(String characterSet) {
            this.characterSet = characterSet;
            this.__explicitlySet__.add("characterSet");
            return this;
        }
        /**
         * The national character set for the database. The default is AL16UTF16. Allowed values
         * are: AL16UTF16 or UTF8.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
        private String ncharacterSet;

        /**
         * The national character set for the database. The default is AL16UTF16. Allowed values
         * are: AL16UTF16 or UTF8.
         *
         * @param ncharacterSet the value to set
         * @return this builder
         */
        public Builder ncharacterSet(String ncharacterSet) {
            this.ncharacterSet = ncharacterSet;
            this.__explicitlySet__.add("ncharacterSet");
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

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionKeyLocationDetails")
        private EncryptionKeyLocationDetails encryptionKeyLocationDetails;

        public Builder encryptionKeyLocationDetails(
                EncryptionKeyLocationDetails encryptionKeyLocationDetails) {
            this.encryptionKeyLocationDetails = encryptionKeyLocationDetails;
            this.__explicitlySet__.add("encryptionKeyLocationDetails");
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataSafeRegistrationDetails")
        private DataSafeRegistrationRequestDetails dataSafeRegistrationDetails;

        public Builder dataSafeRegistrationDetails(
                DataSafeRegistrationRequestDetails dataSafeRegistrationDetails) {
            this.dataSafeRegistrationDetails = dataSafeRegistrationDetails;
            this.__explicitlySet__.add("dataSafeRegistrationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDatabaseFromSnapshotDetails build() {
            CreateDatabaseFromSnapshotDetails model =
                    new CreateDatabaseFromSnapshotDetails(
                            this.sourceSnapshotId,
                            this.isThinClone,
                            this.sourceTdePassword,
                            this.sourceAdminPassword,
                            this.sourceEncryptionKeyLocationDetails,
                            this.tdeWalletPassword,
                            this.dbBackupConfig,
                            this.adminPassword,
                            this.dbUniqueName,
                            this.dbName,
                            this.characterSet,
                            this.ncharacterSet,
                            this.sidPrefix,
                            this.keyStoreId,
                            this.encryptionKeyLocationDetails,
                            this.storageSizeDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.dataSafeRegistrationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDatabaseFromSnapshotDetails model) {
            if (model.wasPropertyExplicitlySet("sourceSnapshotId")) {
                this.sourceSnapshotId(model.getSourceSnapshotId());
            }
            if (model.wasPropertyExplicitlySet("isThinClone")) {
                this.isThinClone(model.getIsThinClone());
            }
            if (model.wasPropertyExplicitlySet("sourceTdePassword")) {
                this.sourceTdePassword(model.getSourceTdePassword());
            }
            if (model.wasPropertyExplicitlySet("sourceAdminPassword")) {
                this.sourceAdminPassword(model.getSourceAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("sourceEncryptionKeyLocationDetails")) {
                this.sourceEncryptionKeyLocationDetails(
                        model.getSourceEncryptionKeyLocationDetails());
            }
            if (model.wasPropertyExplicitlySet("tdeWalletPassword")) {
                this.tdeWalletPassword(model.getTdeWalletPassword());
            }
            if (model.wasPropertyExplicitlySet("dbBackupConfig")) {
                this.dbBackupConfig(model.getDbBackupConfig());
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
            if (model.wasPropertyExplicitlySet("characterSet")) {
                this.characterSet(model.getCharacterSet());
            }
            if (model.wasPropertyExplicitlySet("ncharacterSet")) {
                this.ncharacterSet(model.getNcharacterSet());
            }
            if (model.wasPropertyExplicitlySet("sidPrefix")) {
                this.sidPrefix(model.getSidPrefix());
            }
            if (model.wasPropertyExplicitlySet("keyStoreId")) {
                this.keyStoreId(model.getKeyStoreId());
            }
            if (model.wasPropertyExplicitlySet("encryptionKeyLocationDetails")) {
                this.encryptionKeyLocationDetails(model.getEncryptionKeyLocationDetails());
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
            if (model.wasPropertyExplicitlySet("dataSafeRegistrationDetails")) {
                this.dataSafeRegistrationDetails(model.getDataSafeRegistrationDetails());
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
     * The snapshot [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceSnapshotId")
    private final String sourceSnapshotId;

    /**
     * The snapshot [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getSourceSnapshotId() {
        return sourceSnapshotId;
    }

    /** Specifies whether thick or thin database cloning is to be performed. */
    @com.fasterxml.jackson.annotation.JsonProperty("isThinClone")
    private final Boolean isThinClone;

    /**
     * Specifies whether thick or thin database cloning is to be performed.
     *
     * @return the value
     */
    public Boolean getIsThinClone() {
        return isThinClone;
    }

    /** The password to open the TDE wallet. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceTdePassword")
    private final char[] sourceTdePassword;

    /**
     * The password to open the TDE wallet.
     *
     * @return the value
     * @deprecated Use getSourceTdePassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getSourceTdePassword() {
        return sourceTdePassword != null ? new String(sourceTdePassword) : null;
    }

    /**
     * The password to open the TDE wallet.
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceTdePassword")
    public char[] getSourceTdePassword__AsCharArray() {
        return sourceTdePassword;
    }

    /** The source database's password for SYS, SYSTEM. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceAdminPassword")
    private final char[] sourceAdminPassword;

    /**
     * The source database&#39;s password for SYS, SYSTEM.
     *
     * @return the value
     * @deprecated Use getSourceAdminPassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getSourceAdminPassword() {
        return sourceAdminPassword != null ? new String(sourceAdminPassword) : null;
    }

    /**
     * The source database's password for SYS, SYSTEM.
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceAdminPassword")
    public char[] getSourceAdminPassword__AsCharArray() {
        return sourceAdminPassword;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceEncryptionKeyLocationDetails")
    private final EncryptionKeyLocationDetails sourceEncryptionKeyLocationDetails;

    public EncryptionKeyLocationDetails getSourceEncryptionKeyLocationDetails() {
        return sourceEncryptionKeyLocationDetails;
    }

    /** The password for the target Database TDE wallet. */
    @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPassword")
    private final char[] tdeWalletPassword;

    /**
     * The password for the target Database TDE wallet.
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
     * The password for the target Database TDE wallet.
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPassword")
    public char[] getTdeWalletPassword__AsCharArray() {
        return tdeWalletPassword;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
    private final DbBackupConfig dbBackupConfig;

    public DbBackupConfig getDbBackupConfig() {
        return dbBackupConfig;
    }

    /**
     * A strong password for SYS, SYSTEM, PDB Admin and TDE Wallet. The password must be at least
     * nine characters and contain at least two uppercase, two lowercase, two numbers, and two
     * special characters. The special characters must be _, \\#, or -.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final char[] adminPassword;

    /**
     * A strong password for SYS, SYSTEM, PDB Admin and TDE Wallet. The password must be at least
     * nine characters and contain at least two uppercase, two lowercase, two numbers, and two
     * special characters. The special characters must be _, \\#, or -.
     *
     * @return the value
     * @deprecated Use getAdminPassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getAdminPassword() {
        return adminPassword != null ? new String(adminPassword) : null;
    }

    /**
     * A strong password for SYS, SYSTEM, PDB Admin and TDE Wallet. The password must be at least
     * nine characters and contain at least two uppercase, two lowercase, two numbers, and two
     * special characters. The special characters must be _, \\#, or -.
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    public char[] getAdminPassword__AsCharArray() {
        return adminPassword;
    }

    /** The {@code DB_UNIQUE_NAME} for the new Oracle Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    /**
     * The {@code DB_UNIQUE_NAME} for the new Oracle Database.
     *
     * @return the value
     */
    public String getDbUniqueName() {
        return dbUniqueName;
    }

    /**
     * The display name of the database to be created from the snapshot/database. It must begin with
     * an alphabetic character and can contain a maximum of eight alphanumeric characters. Special
     * characters are not permitted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    /**
     * The display name of the database to be created from the snapshot/database. It must begin with
     * an alphabetic character and can contain a maximum of eight alphanumeric characters. Special
     * characters are not permitted.
     *
     * @return the value
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * The character set for the database. The default is AL32UTF8. Allowed values are: AL32UTF8,
     * AR8ADOS710, AR8ADOS720, AR8APTEC715, AR8ARABICMACS, AR8ASMO8X, AR8ISO8859P6, AR8MSWIN1256,
     * AR8MUSSAD768, AR8NAFITHA711, AR8NAFITHA721, AR8SAKHR706, AR8SAKHR707, AZ8ISO8859P9E,
     * BG8MSWIN, BG8PC437S, BLT8CP921, BLT8ISO8859P13, BLT8MSWIN1257, BLT8PC775, BN8BSCII,
     * CDN8PC863, CEL8ISO8859P14, CL8ISO8859P5, CL8ISOIR111, CL8KOI8R, CL8KOI8U, CL8MACCYRILLICS,
     * CL8MSWIN1251, EE8ISO8859P2, EE8MACCES, EE8MACCROATIANS, EE8MSWIN1250, EE8PC852, EL8DEC,
     * EL8ISO8859P7, EL8MACGREEKS, EL8MSWIN1253, EL8PC437S, EL8PC851, EL8PC869, ET8MSWIN923,
     * HU8ABMOD, HU8CWI2, IN8ISCII, IS8PC861, IW8ISO8859P8, IW8MACHEBREWS, IW8MSWIN1255, IW8PC1507,
     * JA16EUC, JA16EUCTILDE, JA16SJIS, JA16SJISTILDE, JA16VMS, KO16KSC5601, KO16KSCCS,
     * KO16MSWIN949, LA8ISO6937, LA8PASSPORT, LT8MSWIN921, LT8PC772, LT8PC774, LV8PC1117, LV8PC8LR,
     * LV8RST104090, N8PC865, NE8ISO8859P10, NEE8ISO8859P4, RU8BESTA, RU8PC855, RU8PC866,
     * SE8ISO8859P3, TH8MACTHAIS, TH8TISASCII, TR8DEC, TR8MACTURKISHS, TR8MSWIN1254, TR8PC857,
     * US7ASCII, US8PC437, UTF8, VN8MSWIN1258, VN8VN3, WE8DEC, WE8DG, WE8ISO8859P1, WE8ISO8859P15,
     * WE8ISO8859P9, WE8MACROMAN8S, WE8MSWIN1252, WE8NCR4970, WE8NEXTSTEP, WE8PC850, WE8PC858,
     * WE8PC860, WE8ROMAN8, ZHS16CGB231280, ZHS16GBK, ZHT16BIG5, ZHT16CCDC, ZHT16DBT, ZHT16HKSCS,
     * ZHT16MSWIN950, ZHT32EUC, ZHT32SOPS, ZHT32TRIS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
    private final String characterSet;

    /**
     * The character set for the database. The default is AL32UTF8. Allowed values are: AL32UTF8,
     * AR8ADOS710, AR8ADOS720, AR8APTEC715, AR8ARABICMACS, AR8ASMO8X, AR8ISO8859P6, AR8MSWIN1256,
     * AR8MUSSAD768, AR8NAFITHA711, AR8NAFITHA721, AR8SAKHR706, AR8SAKHR707, AZ8ISO8859P9E,
     * BG8MSWIN, BG8PC437S, BLT8CP921, BLT8ISO8859P13, BLT8MSWIN1257, BLT8PC775, BN8BSCII,
     * CDN8PC863, CEL8ISO8859P14, CL8ISO8859P5, CL8ISOIR111, CL8KOI8R, CL8KOI8U, CL8MACCYRILLICS,
     * CL8MSWIN1251, EE8ISO8859P2, EE8MACCES, EE8MACCROATIANS, EE8MSWIN1250, EE8PC852, EL8DEC,
     * EL8ISO8859P7, EL8MACGREEKS, EL8MSWIN1253, EL8PC437S, EL8PC851, EL8PC869, ET8MSWIN923,
     * HU8ABMOD, HU8CWI2, IN8ISCII, IS8PC861, IW8ISO8859P8, IW8MACHEBREWS, IW8MSWIN1255, IW8PC1507,
     * JA16EUC, JA16EUCTILDE, JA16SJIS, JA16SJISTILDE, JA16VMS, KO16KSC5601, KO16KSCCS,
     * KO16MSWIN949, LA8ISO6937, LA8PASSPORT, LT8MSWIN921, LT8PC772, LT8PC774, LV8PC1117, LV8PC8LR,
     * LV8RST104090, N8PC865, NE8ISO8859P10, NEE8ISO8859P4, RU8BESTA, RU8PC855, RU8PC866,
     * SE8ISO8859P3, TH8MACTHAIS, TH8TISASCII, TR8DEC, TR8MACTURKISHS, TR8MSWIN1254, TR8PC857,
     * US7ASCII, US8PC437, UTF8, VN8MSWIN1258, VN8VN3, WE8DEC, WE8DG, WE8ISO8859P1, WE8ISO8859P15,
     * WE8ISO8859P9, WE8MACROMAN8S, WE8MSWIN1252, WE8NCR4970, WE8NEXTSTEP, WE8PC850, WE8PC858,
     * WE8PC860, WE8ROMAN8, ZHS16CGB231280, ZHS16GBK, ZHT16BIG5, ZHT16CCDC, ZHT16DBT, ZHT16HKSCS,
     * ZHT16MSWIN950, ZHT32EUC, ZHT32SOPS, ZHT32TRIS
     *
     * @return the value
     */
    public String getCharacterSet() {
        return characterSet;
    }

    /**
     * The national character set for the database. The default is AL16UTF16. Allowed values are:
     * AL16UTF16 or UTF8.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
    private final String ncharacterSet;

    /**
     * The national character set for the database. The default is AL16UTF16. Allowed values are:
     * AL16UTF16 or UTF8.
     *
     * @return the value
     */
    public String getNcharacterSet() {
        return ncharacterSet;
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

    @com.fasterxml.jackson.annotation.JsonProperty("encryptionKeyLocationDetails")
    private final EncryptionKeyLocationDetails encryptionKeyLocationDetails;

    public EncryptionKeyLocationDetails getEncryptionKeyLocationDetails() {
        return encryptionKeyLocationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storageSizeDetails")
    private final DatabaseStorageSizeDetails storageSizeDetails;

    public DatabaseStorageSizeDetails getStorageSizeDetails() {
        return storageSizeDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataSafeRegistrationDetails")
    private final DataSafeRegistrationRequestDetails dataSafeRegistrationDetails;

    public DataSafeRegistrationRequestDetails getDataSafeRegistrationDetails() {
        return dataSafeRegistrationDetails;
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
        sb.append("CreateDatabaseFromSnapshotDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceSnapshotId=").append(String.valueOf(this.sourceSnapshotId));
        sb.append(", isThinClone=").append(String.valueOf(this.isThinClone));
        sb.append(", sourceTdePassword=").append("<redacted>");
        sb.append(", sourceAdminPassword=").append("<redacted>");
        sb.append(", sourceEncryptionKeyLocationDetails=")
                .append(String.valueOf(this.sourceEncryptionKeyLocationDetails));
        sb.append(", tdeWalletPassword=").append("<redacted>");
        sb.append(", dbBackupConfig=").append(String.valueOf(this.dbBackupConfig));
        sb.append(", adminPassword=").append("<redacted>");
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", characterSet=").append(String.valueOf(this.characterSet));
        sb.append(", ncharacterSet=").append(String.valueOf(this.ncharacterSet));
        sb.append(", sidPrefix=").append(String.valueOf(this.sidPrefix));
        sb.append(", keyStoreId=").append(String.valueOf(this.keyStoreId));
        sb.append(", encryptionKeyLocationDetails=")
                .append(String.valueOf(this.encryptionKeyLocationDetails));
        sb.append(", storageSizeDetails=").append(String.valueOf(this.storageSizeDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", dataSafeRegistrationDetails=")
                .append(String.valueOf(this.dataSafeRegistrationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabaseFromSnapshotDetails)) {
            return false;
        }

        CreateDatabaseFromSnapshotDetails other = (CreateDatabaseFromSnapshotDetails) o;
        return java.util.Objects.equals(this.sourceSnapshotId, other.sourceSnapshotId)
                && java.util.Objects.equals(this.isThinClone, other.isThinClone)
                && java.util.Objects.equals(this.sourceTdePassword, other.sourceTdePassword)
                && java.util.Objects.equals(this.sourceAdminPassword, other.sourceAdminPassword)
                && java.util.Objects.equals(
                        this.sourceEncryptionKeyLocationDetails,
                        other.sourceEncryptionKeyLocationDetails)
                && java.util.Objects.equals(this.tdeWalletPassword, other.tdeWalletPassword)
                && java.util.Objects.equals(this.dbBackupConfig, other.dbBackupConfig)
                && java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.characterSet, other.characterSet)
                && java.util.Objects.equals(this.ncharacterSet, other.ncharacterSet)
                && java.util.Objects.equals(this.sidPrefix, other.sidPrefix)
                && java.util.Objects.equals(this.keyStoreId, other.keyStoreId)
                && java.util.Objects.equals(
                        this.encryptionKeyLocationDetails, other.encryptionKeyLocationDetails)
                && java.util.Objects.equals(this.storageSizeDetails, other.storageSizeDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(
                        this.dataSafeRegistrationDetails, other.dataSafeRegistrationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceSnapshotId == null ? 43 : this.sourceSnapshotId.hashCode());
        result = (result * PRIME) + (this.isThinClone == null ? 43 : this.isThinClone.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceTdePassword == null ? 43 : this.sourceTdePassword.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceAdminPassword == null
                                ? 43
                                : this.sourceAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceEncryptionKeyLocationDetails == null
                                ? 43
                                : this.sourceEncryptionKeyLocationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.tdeWalletPassword == null ? 43 : this.tdeWalletPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.dbBackupConfig == null ? 43 : this.dbBackupConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result = (result * PRIME) + (this.characterSet == null ? 43 : this.characterSet.hashCode());
        result =
                (result * PRIME)
                        + (this.ncharacterSet == null ? 43 : this.ncharacterSet.hashCode());
        result = (result * PRIME) + (this.sidPrefix == null ? 43 : this.sidPrefix.hashCode());
        result = (result * PRIME) + (this.keyStoreId == null ? 43 : this.keyStoreId.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionKeyLocationDetails == null
                                ? 43
                                : this.encryptionKeyLocationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.storageSizeDetails == null
                                ? 43
                                : this.storageSizeDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.dataSafeRegistrationDetails == null
                                ? 43
                                : this.dataSafeRegistrationDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
