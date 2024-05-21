/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
        /**
         * wallet password Secret ID in String format
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("walletPasswordSecretId")
        private String walletPasswordSecretId;

        /**
         * wallet password Secret ID in String format
         * @param walletPasswordSecretId the value to set
         * @return this builder
         **/
        public Builder walletPasswordSecretId(String walletPasswordSecretId) {
            this.walletPasswordSecretId = walletPasswordSecretId;
            this.__explicitlySet__.add("walletPasswordSecretId");
            return this;
        }
        /**
         * atp db user name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("atpUserName")
        private String atpUserName;

        /**
         * atp db user name
         * @param atpUserName the value to set
         * @return this builder
         **/
        public Builder atpUserName(String atpUserName) {
            this.atpUserName = atpUserName;
            this.__explicitlySet__.add("atpUserName");
            return this;
        }
        /**
         * atp db password Secret Id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("atpPasswordSecretId")
        private String atpPasswordSecretId;

        /**
         * atp db password Secret Id
         * @param atpPasswordSecretId the value to set
         * @return this builder
         **/
        public Builder atpPasswordSecretId(String atpPasswordSecretId) {
            this.atpPasswordSecretId = atpPasswordSecretId;
            this.__explicitlySet__.add("atpPasswordSecretId");
            return this;
        }
        /**
         * OCID of the secret containing the containers certificates of ATP wallet
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cwalletFileSecretId")
        private String cwalletFileSecretId;

        /**
         * OCID of the secret containing the containers certificates of ATP wallet
         * @param cwalletFileSecretId the value to set
         * @return this builder
         **/
        public Builder cwalletFileSecretId(String cwalletFileSecretId) {
            this.cwalletFileSecretId = cwalletFileSecretId;
            this.__explicitlySet__.add("cwalletFileSecretId");
            return this;
        }
        /**
         * OCID of the secret containing the PDB'S certificates of ATP wallet
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ewalletFileSecretId")
        private String ewalletFileSecretId;

        /**
         * OCID of the secret containing the PDB'S certificates of ATP wallet
         * @param ewalletFileSecretId the value to set
         * @return this builder
         **/
        public Builder ewalletFileSecretId(String ewalletFileSecretId) {
            this.ewalletFileSecretId = ewalletFileSecretId;
            this.__explicitlySet__.add("ewalletFileSecretId");
            return this;
        }
        /**
         * OCID of the secret containing Keystore.jks file of the ATP wallet
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreFileSecretId")
        private String keyStoreFileSecretId;

        /**
         * OCID of the secret containing Keystore.jks file of the ATP wallet
         * @param keyStoreFileSecretId the value to set
         * @return this builder
         **/
        public Builder keyStoreFileSecretId(String keyStoreFileSecretId) {
            this.keyStoreFileSecretId = keyStoreFileSecretId;
            this.__explicitlySet__.add("keyStoreFileSecretId");
            return this;
        }
        /**
         * OCID of the secret that contains jdbc properties file of ATP wallet
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ojdbcFileSecretId")
        private String ojdbcFileSecretId;

        /**
         * OCID of the secret that contains jdbc properties file of ATP wallet
         * @param ojdbcFileSecretId the value to set
         * @return this builder
         **/
        public Builder ojdbcFileSecretId(String ojdbcFileSecretId) {
            this.ojdbcFileSecretId = ojdbcFileSecretId;
            this.__explicitlySet__.add("ojdbcFileSecretId");
            return this;
        }
        /**
         * OCID of the secret that contains the tnsnames file of ATP wallet
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tnsnamesFileSecretId")
        private String tnsnamesFileSecretId;

        /**
         * OCID of the secret that contains the tnsnames file of ATP wallet
         * @param tnsnamesFileSecretId the value to set
         * @return this builder
         **/
        public Builder tnsnamesFileSecretId(String tnsnamesFileSecretId) {
            this.tnsnamesFileSecretId = tnsnamesFileSecretId;
            this.__explicitlySet__.add("tnsnamesFileSecretId");
            return this;
        }
        /**
         * OCID of the secret containing truststore.jks file of the ATP wallet
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("truststoreFileSecretId")
        private String truststoreFileSecretId;

        /**
         * OCID of the secret containing truststore.jks file of the ATP wallet
         * @param truststoreFileSecretId the value to set
         * @return this builder
         **/
        public Builder truststoreFileSecretId(String truststoreFileSecretId) {
            this.truststoreFileSecretId = truststoreFileSecretId;
            this.__explicitlySet__.add("truststoreFileSecretId");
            return this;
        }
        /**
         * atp database name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * atp database name
         * @param databaseName the value to set
         * @return this builder
         **/
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /**
         * atp database table name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tableName")
        private String tableName;

        /**
         * atp database table name
         * @param tableName the value to set
         * @return this builder
         **/
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            this.__explicitlySet__.add("tableName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataSourceDetailsATP build() {
            DataSourceDetailsATP model =
                    new DataSourceDetailsATP(
                            this.walletPasswordSecretId,
                            this.atpUserName,
                            this.atpPasswordSecretId,
                            this.cwalletFileSecretId,
                            this.ewalletFileSecretId,
                            this.keyStoreFileSecretId,
                            this.ojdbcFileSecretId,
                            this.tnsnamesFileSecretId,
                            this.truststoreFileSecretId,
                            this.databaseName,
                            this.tableName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataSourceDetailsATP model) {
            if (model.wasPropertyExplicitlySet("walletPasswordSecretId")) {
                this.walletPasswordSecretId(model.getWalletPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("atpUserName")) {
                this.atpUserName(model.getAtpUserName());
            }
            if (model.wasPropertyExplicitlySet("atpPasswordSecretId")) {
                this.atpPasswordSecretId(model.getAtpPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("cwalletFileSecretId")) {
                this.cwalletFileSecretId(model.getCwalletFileSecretId());
            }
            if (model.wasPropertyExplicitlySet("ewalletFileSecretId")) {
                this.ewalletFileSecretId(model.getEwalletFileSecretId());
            }
            if (model.wasPropertyExplicitlySet("keyStoreFileSecretId")) {
                this.keyStoreFileSecretId(model.getKeyStoreFileSecretId());
            }
            if (model.wasPropertyExplicitlySet("ojdbcFileSecretId")) {
                this.ojdbcFileSecretId(model.getOjdbcFileSecretId());
            }
            if (model.wasPropertyExplicitlySet("tnsnamesFileSecretId")) {
                this.tnsnamesFileSecretId(model.getTnsnamesFileSecretId());
            }
            if (model.wasPropertyExplicitlySet("truststoreFileSecretId")) {
                this.truststoreFileSecretId(model.getTruststoreFileSecretId());
            }
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("tableName")) {
                this.tableName(model.getTableName());
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

    /**
     * wallet password Secret ID in String format
     * @return the value
     **/
    public String getWalletPasswordSecretId() {
        return walletPasswordSecretId;
    }

    /**
     * atp db user name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("atpUserName")
    private final String atpUserName;

    /**
     * atp db user name
     * @return the value
     **/
    public String getAtpUserName() {
        return atpUserName;
    }

    /**
     * atp db password Secret Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("atpPasswordSecretId")
    private final String atpPasswordSecretId;

    /**
     * atp db password Secret Id
     * @return the value
     **/
    public String getAtpPasswordSecretId() {
        return atpPasswordSecretId;
    }

    /**
     * OCID of the secret containing the containers certificates of ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cwalletFileSecretId")
    private final String cwalletFileSecretId;

    /**
     * OCID of the secret containing the containers certificates of ATP wallet
     * @return the value
     **/
    public String getCwalletFileSecretId() {
        return cwalletFileSecretId;
    }

    /**
     * OCID of the secret containing the PDB'S certificates of ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ewalletFileSecretId")
    private final String ewalletFileSecretId;

    /**
     * OCID of the secret containing the PDB'S certificates of ATP wallet
     * @return the value
     **/
    public String getEwalletFileSecretId() {
        return ewalletFileSecretId;
    }

    /**
     * OCID of the secret containing Keystore.jks file of the ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreFileSecretId")
    private final String keyStoreFileSecretId;

    /**
     * OCID of the secret containing Keystore.jks file of the ATP wallet
     * @return the value
     **/
    public String getKeyStoreFileSecretId() {
        return keyStoreFileSecretId;
    }

    /**
     * OCID of the secret that contains jdbc properties file of ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ojdbcFileSecretId")
    private final String ojdbcFileSecretId;

    /**
     * OCID of the secret that contains jdbc properties file of ATP wallet
     * @return the value
     **/
    public String getOjdbcFileSecretId() {
        return ojdbcFileSecretId;
    }

    /**
     * OCID of the secret that contains the tnsnames file of ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tnsnamesFileSecretId")
    private final String tnsnamesFileSecretId;

    /**
     * OCID of the secret that contains the tnsnames file of ATP wallet
     * @return the value
     **/
    public String getTnsnamesFileSecretId() {
        return tnsnamesFileSecretId;
    }

    /**
     * OCID of the secret containing truststore.jks file of the ATP wallet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("truststoreFileSecretId")
    private final String truststoreFileSecretId;

    /**
     * OCID of the secret containing truststore.jks file of the ATP wallet
     * @return the value
     **/
    public String getTruststoreFileSecretId() {
        return truststoreFileSecretId;
    }

    /**
     * atp database name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * atp database name
     * @return the value
     **/
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * atp database table name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    private final String tableName;

    /**
     * atp database table name
     * @return the value
     **/
    public String getTableName() {
        return tableName;
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
        sb.append("DataSourceDetailsATP(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
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
                && super.equals(other);
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
        return result;
    }
}
