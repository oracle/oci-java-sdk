/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Standby Creation Details. <br>
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
        builder = CreateStandbyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateStandbyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceDatabaseId",
        "databaseAdminPassword",
        "sourceTdeWalletPassword",
        "sourceEncryptionKeyLocationDetails",
        "isActiveDataGuardEnabled",
        "dbUniqueName",
        "sidPrefix",
        "protectionMode",
        "transportType",
        "storageSizeDetails",
        "freeformTags",
        "definedTags"
    })
    public CreateStandbyDetails(
            String sourceDatabaseId,
            String databaseAdminPassword,
            String sourceTdeWalletPassword,
            EncryptionKeyLocationDetails sourceEncryptionKeyLocationDetails,
            Boolean isActiveDataGuardEnabled,
            String dbUniqueName,
            String sidPrefix,
            ProtectionMode protectionMode,
            TransportType transportType,
            DatabaseStorageSizeDetails storageSizeDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.sourceDatabaseId = sourceDatabaseId;
        this.databaseAdminPassword = databaseAdminPassword;
        this.sourceTdeWalletPassword = sourceTdeWalletPassword;
        this.sourceEncryptionKeyLocationDetails = sourceEncryptionKeyLocationDetails;
        this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
        this.dbUniqueName = dbUniqueName;
        this.sidPrefix = sidPrefix;
        this.protectionMode = protectionMode;
        this.transportType = transportType;
        this.storageSizeDetails = storageSizeDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * source database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseId")
        private String sourceDatabaseId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * source database.
         *
         * @param sourceDatabaseId the value to set
         * @return this builder
         */
        public Builder sourceDatabaseId(String sourceDatabaseId) {
            this.sourceDatabaseId = sourceDatabaseId;
            this.__explicitlySet__.add("sourceDatabaseId");
            return this;
        }
        /**
         * The administrator password of the primary database in this Data Guard association.
         *
         * <p>*The password MUST be the same as the primary admin password.**
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
        private String databaseAdminPassword;

        /**
         * The administrator password of the primary database in this Data Guard association.
         *
         * <p>*The password MUST be the same as the primary admin password.**
         *
         * @param databaseAdminPassword the value to set
         * @return this builder
         */
        public Builder databaseAdminPassword(String databaseAdminPassword) {
            this.databaseAdminPassword = databaseAdminPassword;
            this.__explicitlySet__.add("databaseAdminPassword");
            return this;
        }
        /** The TDE wallet password of the source database specified by 'sourceDatabaseId'. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceTdeWalletPassword")
        private String sourceTdeWalletPassword;

        /**
         * The TDE wallet password of the source database specified by 'sourceDatabaseId'.
         *
         * @param sourceTdeWalletPassword the value to set
         * @return this builder
         */
        public Builder sourceTdeWalletPassword(String sourceTdeWalletPassword) {
            this.sourceTdeWalletPassword = sourceTdeWalletPassword;
            this.__explicitlySet__.add("sourceTdeWalletPassword");
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
        /** Specifies the {@code DB_UNIQUE_NAME} of the peer database to be created. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        /**
         * Specifies the {@code DB_UNIQUE_NAME} of the peer database to be created.
         *
         * @param dbUniqueName the value to set
         * @return this builder
         */
        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
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
         * The protection mode of this Data Guard. For more information, see [Oracle Data Guard
         * Protection
         * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private ProtectionMode protectionMode;

        /**
         * The protection mode of this Data Guard. For more information, see [Oracle Data Guard
         * Protection
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateStandbyDetails build() {
            CreateStandbyDetails model =
                    new CreateStandbyDetails(
                            this.sourceDatabaseId,
                            this.databaseAdminPassword,
                            this.sourceTdeWalletPassword,
                            this.sourceEncryptionKeyLocationDetails,
                            this.isActiveDataGuardEnabled,
                            this.dbUniqueName,
                            this.sidPrefix,
                            this.protectionMode,
                            this.transportType,
                            this.storageSizeDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateStandbyDetails model) {
            if (model.wasPropertyExplicitlySet("sourceDatabaseId")) {
                this.sourceDatabaseId(model.getSourceDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("databaseAdminPassword")) {
                this.databaseAdminPassword(model.getDatabaseAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("sourceTdeWalletPassword")) {
                this.sourceTdeWalletPassword(model.getSourceTdeWalletPassword());
            }
            if (model.wasPropertyExplicitlySet("sourceEncryptionKeyLocationDetails")) {
                this.sourceEncryptionKeyLocationDetails(
                        model.getSourceEncryptionKeyLocationDetails());
            }
            if (model.wasPropertyExplicitlySet("isActiveDataGuardEnabled")) {
                this.isActiveDataGuardEnabled(model.getIsActiveDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("dbUniqueName")) {
                this.dbUniqueName(model.getDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("sidPrefix")) {
                this.sidPrefix(model.getSidPrefix());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("transportType")) {
                this.transportType(model.getTransportType());
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
     * source database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseId")
    private final String sourceDatabaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * source database.
     *
     * @return the value
     */
    public String getSourceDatabaseId() {
        return sourceDatabaseId;
    }

    /**
     * The administrator password of the primary database in this Data Guard association.
     *
     * <p>*The password MUST be the same as the primary admin password.**
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
    private final String databaseAdminPassword;

    /**
     * The administrator password of the primary database in this Data Guard association.
     *
     * <p>*The password MUST be the same as the primary admin password.**
     *
     * @return the value
     */
    public String getDatabaseAdminPassword() {
        return databaseAdminPassword;
    }

    /** The TDE wallet password of the source database specified by 'sourceDatabaseId'. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceTdeWalletPassword")
    private final String sourceTdeWalletPassword;

    /**
     * The TDE wallet password of the source database specified by 'sourceDatabaseId'.
     *
     * @return the value
     */
    public String getSourceTdeWalletPassword() {
        return sourceTdeWalletPassword;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceEncryptionKeyLocationDetails")
    private final EncryptionKeyLocationDetails sourceEncryptionKeyLocationDetails;

    public EncryptionKeyLocationDetails getSourceEncryptionKeyLocationDetails() {
        return sourceEncryptionKeyLocationDetails;
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

    /** Specifies the {@code DB_UNIQUE_NAME} of the peer database to be created. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    /**
     * Specifies the {@code DB_UNIQUE_NAME} of the peer database to be created.
     *
     * @return the value
     */
    public String getDbUniqueName() {
        return dbUniqueName;
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
     * The protection mode of this Data Guard. For more information, see [Oracle Data Guard
     * Protection
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
     * The protection mode of this Data Guard. For more information, see [Oracle Data Guard
     * Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final ProtectionMode protectionMode;

    /**
     * The protection mode of this Data Guard. For more information, see [Oracle Data Guard
     * Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     * @return the value
     */
    public ProtectionMode getProtectionMode() {
        return protectionMode;
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
        sb.append("CreateStandbyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceDatabaseId=").append(String.valueOf(this.sourceDatabaseId));
        sb.append(", databaseAdminPassword=").append("<redacted>");
        sb.append(", sourceTdeWalletPassword=").append("<redacted>");
        sb.append(", sourceEncryptionKeyLocationDetails=")
                .append(String.valueOf(this.sourceEncryptionKeyLocationDetails));
        sb.append(", isActiveDataGuardEnabled=")
                .append(String.valueOf(this.isActiveDataGuardEnabled));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", sidPrefix=").append(String.valueOf(this.sidPrefix));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", transportType=").append(String.valueOf(this.transportType));
        sb.append(", storageSizeDetails=").append(String.valueOf(this.storageSizeDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateStandbyDetails)) {
            return false;
        }

        CreateStandbyDetails other = (CreateStandbyDetails) o;
        return java.util.Objects.equals(this.sourceDatabaseId, other.sourceDatabaseId)
                && java.util.Objects.equals(this.databaseAdminPassword, other.databaseAdminPassword)
                && java.util.Objects.equals(
                        this.sourceTdeWalletPassword, other.sourceTdeWalletPassword)
                && java.util.Objects.equals(
                        this.sourceEncryptionKeyLocationDetails,
                        other.sourceEncryptionKeyLocationDetails)
                && java.util.Objects.equals(
                        this.isActiveDataGuardEnabled, other.isActiveDataGuardEnabled)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.sidPrefix, other.sidPrefix)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(this.transportType, other.transportType)
                && java.util.Objects.equals(this.storageSizeDetails, other.storageSizeDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceDatabaseId == null ? 43 : this.sourceDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseAdminPassword == null
                                ? 43
                                : this.databaseAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceTdeWalletPassword == null
                                ? 43
                                : this.sourceTdeWalletPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceEncryptionKeyLocationDetails == null
                                ? 43
                                : this.sourceEncryptionKeyLocationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isActiveDataGuardEnabled == null
                                ? 43
                                : this.isActiveDataGuardEnabled.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result = (result * PRIME) + (this.sidPrefix == null ? 43 : this.sidPrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.transportType == null ? 43 : this.transportType.hashCode());
        result =
                (result * PRIME)
                        + (this.storageSizeDetails == null
                                ? 43
                                : this.storageSizeDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
