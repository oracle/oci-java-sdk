/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Configuration for creating a distributed database shard using a pre-existing Database Home.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDistributedDatabaseShardDatabaseWithDbHomeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "source"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDistributedDatabaseShardDatabaseWithDbHomeDetails
        extends CreateDistributedDatabaseShardDatabaseDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * The admin password for the shard associated with Globally distributed database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private char[] adminPassword;

        /**
         * The admin password for the shard associated with Globally distributed database.
         * @param adminPassword the value to set
         * @return this builder
         **/
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

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
         *
         * @param vaultId the value to set
         * @return this builder
         **/
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions.
         *
         * @param kmsKeyVersionId the value to set
         * @return this builder
         **/
        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }
        /**
         * The protection mode used for the Data Guard association.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private DistributedDbProtectionMode protectionMode;

        /**
         * The protection mode used for the Data Guard association.
         * @param protectionMode the value to set
         * @return this builder
         **/
        public Builder protectionMode(DistributedDbProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }
        /**
         * The transport type used for the Data Guard association.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("transportType")
        private DistributedDbTransportType transportType;

        /**
         * The transport type used for the Data Guard association.
         * @param transportType the value to set
         * @return this builder
         **/
        public Builder transportType(DistributedDbTransportType transportType) {
            this.transportType = transportType;
            this.__explicitlySet__.add("transportType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDistributedDatabaseShardDatabaseWithDbHomeDetails build() {
            CreateDistributedDatabaseShardDatabaseWithDbHomeDetails model =
                    new CreateDistributedDatabaseShardDatabaseWithDbHomeDetails(
                            this.dbHomeId,
                            this.adminPassword,
                            this.vaultId,
                            this.kmsKeyId,
                            this.kmsKeyVersionId,
                            this.protectionMode,
                            this.transportType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDistributedDatabaseShardDatabaseWithDbHomeDetails model) {
            if (model.wasPropertyExplicitlySet("dbHomeId")) {
                this.dbHomeId(model.getDbHomeId());
            }
            if (model.wasPropertyExplicitlySet("adminPassword")) {
                this.adminPassword(model.getAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyVersionId")) {
                this.kmsKeyVersionId(model.getKmsKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("transportType")) {
                this.transportType(model.getTransportType());
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

    @Deprecated
    public CreateDistributedDatabaseShardDatabaseWithDbHomeDetails(
            String dbHomeId,
            String adminPassword,
            String vaultId,
            String kmsKeyId,
            String kmsKeyVersionId,
            DistributedDbProtectionMode protectionMode,
            DistributedDbTransportType transportType) {
        super();
        this.dbHomeId = dbHomeId;
        this.adminPassword = adminPassword != null ? adminPassword.toCharArray() : null;
        this.vaultId = vaultId;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.protectionMode = protectionMode;
        this.transportType = transportType;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    public CreateDistributedDatabaseShardDatabaseWithDbHomeDetails(
            String dbHomeId,
            char[] adminPassword,
            String vaultId,
            String kmsKeyId,
            String kmsKeyVersionId,
            DistributedDbProtectionMode protectionMode,
            DistributedDbTransportType transportType) {
        super();
        this.dbHomeId = dbHomeId;
        this.adminPassword = adminPassword;
        this.vaultId = vaultId;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.protectionMode = protectionMode;
        this.transportType = transportType;
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
     * The admin password for the shard associated with Globally distributed database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final char[] adminPassword;

    /**
     * The admin password for the shard associated with Globally distributed database.
     * return the value
     * @Deprecated - Use getAdminPassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getAdminPassword() {
        return adminPassword != null ? new String(adminPassword) : null;
    }

    /**
     * The admin password for the shard associated with Globally distributed database.
     * @return the value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    public char[] getAdminPassword__AsCharArray() {
        return adminPassword;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
     *
     * @return the value
     **/
    public String getVaultId() {
        return vaultId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     *
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    private final String kmsKeyVersionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions.
     *
     * @return the value
     **/
    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
    }

    /**
     * The protection mode used for the Data Guard association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final DistributedDbProtectionMode protectionMode;

    /**
     * The protection mode used for the Data Guard association.
     * @return the value
     **/
    public DistributedDbProtectionMode getProtectionMode() {
        return protectionMode;
    }

    /**
     * The transport type used for the Data Guard association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transportType")
    private final DistributedDbTransportType transportType;

    /**
     * The transport type used for the Data Guard association.
     * @return the value
     **/
    public DistributedDbTransportType getTransportType() {
        return transportType;
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
        sb.append("CreateDistributedDatabaseShardDatabaseWithDbHomeDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dbHomeId=").append(String.valueOf(this.dbHomeId));
        sb.append(", adminPassword=").append("<redacted>");
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", transportType=").append(String.valueOf(this.transportType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDistributedDatabaseShardDatabaseWithDbHomeDetails)) {
            return false;
        }

        CreateDistributedDatabaseShardDatabaseWithDbHomeDetails other =
                (CreateDistributedDatabaseShardDatabaseWithDbHomeDetails) o;
        return java.util.Objects.equals(this.dbHomeId, other.dbHomeId)
                && java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(this.transportType, other.transportType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbHomeId == null ? 43 : this.dbHomeId.hashCode());
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.transportType == null ? 43 : this.transportType.hashCode());
        return result;
    }
}
