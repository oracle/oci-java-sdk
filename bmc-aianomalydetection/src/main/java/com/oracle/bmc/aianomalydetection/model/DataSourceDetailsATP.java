/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Data Source details for ATP
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DataSourceDetailsATP.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "dataSourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataSourceDetailsATP extends DataSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("walletPasswordSecretId")
        private String walletPasswordSecretId;

        public Builder walletPasswordSecretId(String walletPasswordSecretId) {
            this.walletPasswordSecretId = walletPasswordSecretId;
            this.__explicitlySet__.add("walletPasswordSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("atpUserName")
        private String atpUserName;

        public Builder atpUserName(String atpUserName) {
            this.atpUserName = atpUserName;
            this.__explicitlySet__.add("atpUserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("atpPasswordSecretId")
        private String atpPasswordSecretId;

        public Builder atpPasswordSecretId(String atpPasswordSecretId) {
            this.atpPasswordSecretId = atpPasswordSecretId;
            this.__explicitlySet__.add("atpPasswordSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cwalletFileSecretId")
        private String cwalletFileSecretId;

        public Builder cwalletFileSecretId(String cwalletFileSecretId) {
            this.cwalletFileSecretId = cwalletFileSecretId;
            this.__explicitlySet__.add("cwalletFileSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ewalletFileSecretId")
        private String ewalletFileSecretId;

        public Builder ewalletFileSecretId(String ewalletFileSecretId) {
            this.ewalletFileSecretId = ewalletFileSecretId;
            this.__explicitlySet__.add("ewalletFileSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreFileSecretId")
        private String keyStoreFileSecretId;

        public Builder keyStoreFileSecretId(String keyStoreFileSecretId) {
            this.keyStoreFileSecretId = keyStoreFileSecretId;
            this.__explicitlySet__.add("keyStoreFileSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ojdbcFileSecretId")
        private String ojdbcFileSecretId;

        public Builder ojdbcFileSecretId(String ojdbcFileSecretId) {
            this.ojdbcFileSecretId = ojdbcFileSecretId;
            this.__explicitlySet__.add("ojdbcFileSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tnsnamesFileSecretId")
        private String tnsnamesFileSecretId;

        public Builder tnsnamesFileSecretId(String tnsnamesFileSecretId) {
            this.tnsnamesFileSecretId = tnsnamesFileSecretId;
            this.__explicitlySet__.add("tnsnamesFileSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("truststoreFileSecretId")
        private String truststoreFileSecretId;

        public Builder truststoreFileSecretId(String truststoreFileSecretId) {
            this.truststoreFileSecretId = truststoreFileSecretId;
            this.__explicitlySet__.add("truststoreFileSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tableName")
        private String tableName;

        public Builder tableName(String tableName) {
            this.tableName = tableName;
            this.__explicitlySet__.add("tableName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataSourceDetailsATP build() {
            DataSourceDetailsATP __instance__ =
                    new DataSourceDetailsATP(
                            walletPasswordSecretId,
                            atpUserName,
                            atpPasswordSecretId,
                            cwalletFileSecretId,
                            ewalletFileSecretId,
                            keyStoreFileSecretId,
                            ojdbcFileSecretId,
                            tnsnamesFileSecretId,
                            truststoreFileSecretId,
                            databaseName,
                            tableName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataSourceDetailsATP o) {
            Builder copiedBuilder =
                    walletPasswordSecretId(o.getWalletPasswordSecretId())
                            .atpUserName(o.getAtpUserName())
                            .atpPasswordSecretId(o.getAtpPasswordSecretId())
                            .cwalletFileSecretId(o.getCwalletFileSecretId())
                            .ewalletFileSecretId(o.getEwalletFileSecretId())
                            .keyStoreFileSecretId(o.getKeyStoreFileSecretId())
                            .ojdbcFileSecretId(o.getOjdbcFileSecretId())
                            .tnsnamesFileSecretId(o.getTnsnamesFileSecretId())
                            .truststoreFileSecretId(o.getTruststoreFileSecretId())
                            .databaseName(o.getDatabaseName())
                            .tableName(o.getTableName());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
    public DataSourceDetailsATP(
            String walletPasswordSecretId,
            String atpUserName,
            String atpPasswordSecretId,
            String cwalletFileSecretId,
            String ewalletFileSecretId,
            String keyStoreFileSecretId,
            String ojdbcFileSecretId,
            String tnsnamesFileSecretId,
            String truststoreFileSecretId,
            String databaseName,
            String tableName) {
        super();
        this.walletPasswordSecretId = walletPasswordSecretId;
        this.atpUserName = atpUserName;
        this.atpPasswordSecretId = atpPasswordSecretId;
        this.cwalletFileSecretId = cwalletFileSecretId;
        this.ewalletFileSecretId = ewalletFileSecretId;
        this.keyStoreFileSecretId = keyStoreFileSecretId;
        this.ojdbcFileSecretId = ojdbcFileSecretId;
        this.tnsnamesFileSecretId = tnsnamesFileSecretId;
        this.truststoreFileSecretId = truststoreFileSecretId;
        this.databaseName = databaseName;
        this.tableName = tableName;
    }

    /**
     * wallet password Secret ID in String format
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("walletPasswordSecretId")
    private final String walletPasswordSecretId;

    public String getWalletPasswordSecretId() {
        return walletPasswordSecretId;
    }

    /**
     * atp db user name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("atpUserName")
    private final String atpUserName;

    public String getAtpUserName() {
        return atpUserName;
    }

    /**
     * atp db password Secret Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("atpPasswordSecretId")
    private final String atpPasswordSecretId;

    public String getAtpPasswordSecretId() {
        return atpPasswordSecretId;
    }

    /**
     * OCID of the secret containing the containers certificates of ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cwalletFileSecretId")
    private final String cwalletFileSecretId;

    public String getCwalletFileSecretId() {
        return cwalletFileSecretId;
    }

    /**
     * OCID of the secret containing the PDB'S certificates of ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ewalletFileSecretId")
    private final String ewalletFileSecretId;

    public String getEwalletFileSecretId() {
        return ewalletFileSecretId;
    }

    /**
     * OCID of the secret containing Keystore.jks file of the ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreFileSecretId")
    private final String keyStoreFileSecretId;

    public String getKeyStoreFileSecretId() {
        return keyStoreFileSecretId;
    }

    /**
     * OCID of the secret that contains jdbc properties file of ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ojdbcFileSecretId")
    private final String ojdbcFileSecretId;

    public String getOjdbcFileSecretId() {
        return ojdbcFileSecretId;
    }

    /**
     * OCID of the secret that contains the tnsnames file of ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tnsnamesFileSecretId")
    private final String tnsnamesFileSecretId;

    public String getTnsnamesFileSecretId() {
        return tnsnamesFileSecretId;
    }

    /**
     * OCID of the secret containing truststore.jks file of the ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("truststoreFileSecretId")
    private final String truststoreFileSecretId;

    public String getTruststoreFileSecretId() {
        return truststoreFileSecretId;
    }

    /**
     * atp database name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * atp database table name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    private final String tableName;

    public String getTableName() {
        return tableName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DataSourceDetailsATP(");
        sb.append("super=").append(super.toString());
        sb.append(", walletPasswordSecretId=").append(String.valueOf(this.walletPasswordSecretId));
        sb.append(", atpUserName=").append(String.valueOf(this.atpUserName));
        sb.append(", atpPasswordSecretId=").append(String.valueOf(this.atpPasswordSecretId));
        sb.append(", cwalletFileSecretId=").append(String.valueOf(this.cwalletFileSecretId));
        sb.append(", ewalletFileSecretId=").append(String.valueOf(this.ewalletFileSecretId));
        sb.append(", keyStoreFileSecretId=").append(String.valueOf(this.keyStoreFileSecretId));
        sb.append(", ojdbcFileSecretId=").append(String.valueOf(this.ojdbcFileSecretId));
        sb.append(", tnsnamesFileSecretId=").append(String.valueOf(this.tnsnamesFileSecretId));
        sb.append(", truststoreFileSecretId=").append(String.valueOf(this.truststoreFileSecretId));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", tableName=").append(String.valueOf(this.tableName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataSourceDetailsATP)) {
            return false;
        }

        DataSourceDetailsATP other = (DataSourceDetailsATP) o;
        return java.util.Objects.equals(this.walletPasswordSecretId, other.walletPasswordSecretId)
                && java.util.Objects.equals(this.atpUserName, other.atpUserName)
                && java.util.Objects.equals(this.atpPasswordSecretId, other.atpPasswordSecretId)
                && java.util.Objects.equals(this.cwalletFileSecretId, other.cwalletFileSecretId)
                && java.util.Objects.equals(this.ewalletFileSecretId, other.ewalletFileSecretId)
                && java.util.Objects.equals(this.keyStoreFileSecretId, other.keyStoreFileSecretId)
                && java.util.Objects.equals(this.ojdbcFileSecretId, other.ojdbcFileSecretId)
                && java.util.Objects.equals(this.tnsnamesFileSecretId, other.tnsnamesFileSecretId)
                && java.util.Objects.equals(
                        this.truststoreFileSecretId, other.truststoreFileSecretId)
                && java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.tableName, other.tableName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.walletPasswordSecretId == null
                                ? 43
                                : this.walletPasswordSecretId.hashCode());
        result = (result * PRIME) + (this.atpUserName == null ? 43 : this.atpUserName.hashCode());
        result =
                (result * PRIME)
                        + (this.atpPasswordSecretId == null
                                ? 43
                                : this.atpPasswordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.cwalletFileSecretId == null
                                ? 43
                                : this.cwalletFileSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.ewalletFileSecretId == null
                                ? 43
                                : this.ewalletFileSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStoreFileSecretId == null
                                ? 43
                                : this.keyStoreFileSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.ojdbcFileSecretId == null ? 43 : this.ojdbcFileSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.tnsnamesFileSecretId == null
                                ? 43
                                : this.tnsnamesFileSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.truststoreFileSecretId == null
                                ? 43
                                : this.truststoreFileSecretId.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result = (result * PRIME) + (this.tableName == null ? 43 : this.tableName.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
