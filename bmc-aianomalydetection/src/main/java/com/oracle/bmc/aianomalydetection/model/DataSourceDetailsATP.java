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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DataSourceDetailsATP.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "dataSourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DataSourceDetailsATP extends DataSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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
    String walletPasswordSecretId;

    /**
     * atp db user name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("atpUserName")
    String atpUserName;

    /**
     * atp db password Secret Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("atpPasswordSecretId")
    String atpPasswordSecretId;

    /**
     * OCID of the secret containing the containers certificates of ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cwalletFileSecretId")
    String cwalletFileSecretId;

    /**
     * OCID of the secret containing the PDB'S certificates of ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ewalletFileSecretId")
    String ewalletFileSecretId;

    /**
     * OCID of the secret containing Keystore.jks file of the ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreFileSecretId")
    String keyStoreFileSecretId;

    /**
     * OCID of the secret that contains jdbc properties file of ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ojdbcFileSecretId")
    String ojdbcFileSecretId;

    /**
     * OCID of the secret that contains the tnsnames file of ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tnsnamesFileSecretId")
    String tnsnamesFileSecretId;

    /**
     * OCID of the secret containing truststore.jks file of the ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("truststoreFileSecretId")
    String truststoreFileSecretId;

    /**
     * atp database name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    String databaseName;

    /**
     * atp database table name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    String tableName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
