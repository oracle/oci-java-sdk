/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about a new Snowflake Connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateSnowflakeConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateSnowflakeConnectionDetails extends CreateConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /** The Snowflake technology type. */
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private SnowflakeConnection.TechnologyType technologyType;

        /**
         * The Snowflake technology type.
         *
         * @param technologyType the value to set
         * @return this builder
         */
        public Builder technologyType(SnowflakeConnection.TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * JDBC connection URL. e.g.:
         * 'jdbc:snowflake://<account_name>.snowflakecomputing.com/?warehouse=<warehouse-name>&db=<db-name>'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionUrl")
        private String connectionUrl;

        /**
         * JDBC connection URL. e.g.:
         * 'jdbc:snowflake://<account_name>.snowflakecomputing.com/?warehouse=<warehouse-name>&db=<db-name>'
         *
         * @param connectionUrl the value to set
         * @return this builder
         */
        public Builder connectionUrl(String connectionUrl) {
            this.connectionUrl = connectionUrl;
            this.__explicitlySet__.add("connectionUrl");
            return this;
        }
        /** Used authentication mechanism to access Snowflake. */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private SnowflakeConnection.AuthenticationType authenticationType;

        /**
         * Used authentication mechanism to access Snowflake.
         *
         * @param authenticationType the value to set
         * @return this builder
         */
        public Builder authenticationType(
                SnowflakeConnection.AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }
        /**
         * The username Oracle GoldenGate uses to connect to Snowflake. This username must already
         * exist and be available by Snowflake platform to be connected to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username Oracle GoldenGate uses to connect to Snowflake. This username must already
         * exist and be available by Snowflake platform to be connected to.
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /** The password Oracle GoldenGate uses to connect to Snowflake platform. */
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password Oracle GoldenGate uses to connect to Snowflake platform.
         *
         * @param password the value to set
         * @return this builder
         */
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }
        /** The base64 encoded content of private key file in PEM format. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFile")
        private String privateKeyFile;

        /**
         * The base64 encoded content of private key file in PEM format.
         *
         * @param privateKeyFile the value to set
         * @return this builder
         */
        public Builder privateKeyFile(String privateKeyFile) {
            this.privateKeyFile = privateKeyFile;
            this.__explicitlySet__.add("privateKeyFile");
            return this;
        }
        /** Password if the private key file is encrypted. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphrase")
        private String privateKeyPassphrase;

        /**
         * Password if the private key file is encrypted.
         *
         * @param privateKeyPassphrase the value to set
         * @return this builder
         */
        public Builder privateKeyPassphrase(String privateKeyPassphrase) {
            this.privateKeyPassphrase = privateKeyPassphrase;
            this.__explicitlySet__.add("privateKeyPassphrase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSnowflakeConnectionDetails build() {
            CreateSnowflakeConnectionDetails model =
                    new CreateSnowflakeConnectionDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.vaultId,
                            this.keyId,
                            this.subnetId,
                            this.nsgIds,
                            this.technologyType,
                            this.connectionUrl,
                            this.authenticationType,
                            this.username,
                            this.password,
                            this.privateKeyFile,
                            this.privateKeyPassphrase);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSnowflakeConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("connectionUrl")) {
                this.connectionUrl(model.getConnectionUrl());
            }
            if (model.wasPropertyExplicitlySet("authenticationType")) {
                this.authenticationType(model.getAuthenticationType());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("privateKeyFile")) {
                this.privateKeyFile(model.getPrivateKeyFile());
            }
            if (model.wasPropertyExplicitlySet("privateKeyPassphrase")) {
                this.privateKeyPassphrase(model.getPrivateKeyPassphrase());
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

    @Deprecated
    public CreateSnowflakeConnectionDetails(
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String vaultId,
            String keyId,
            String subnetId,
            java.util.List<String> nsgIds,
            SnowflakeConnection.TechnologyType technologyType,
            String connectionUrl,
            SnowflakeConnection.AuthenticationType authenticationType,
            String username,
            String password,
            String privateKeyFile,
            String privateKeyPassphrase) {
        super(
                displayName,
                description,
                compartmentId,
                freeformTags,
                definedTags,
                vaultId,
                keyId,
                subnetId,
                nsgIds);
        this.technologyType = technologyType;
        this.connectionUrl = connectionUrl;
        this.authenticationType = authenticationType;
        this.username = username;
        this.password = password;
        this.privateKeyFile = privateKeyFile;
        this.privateKeyPassphrase = privateKeyPassphrase;
    }

    /** The Snowflake technology type. */
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final SnowflakeConnection.TechnologyType technologyType;

    /**
     * The Snowflake technology type.
     *
     * @return the value
     */
    public SnowflakeConnection.TechnologyType getTechnologyType() {
        return technologyType;
    }

    /**
     * JDBC connection URL. e.g.:
     * 'jdbc:snowflake://<account_name>.snowflakecomputing.com/?warehouse=<warehouse-name>&db=<db-name>'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionUrl")
    private final String connectionUrl;

    /**
     * JDBC connection URL. e.g.:
     * 'jdbc:snowflake://<account_name>.snowflakecomputing.com/?warehouse=<warehouse-name>&db=<db-name>'
     *
     * @return the value
     */
    public String getConnectionUrl() {
        return connectionUrl;
    }

    /** Used authentication mechanism to access Snowflake. */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final SnowflakeConnection.AuthenticationType authenticationType;

    /**
     * Used authentication mechanism to access Snowflake.
     *
     * @return the value
     */
    public SnowflakeConnection.AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * The username Oracle GoldenGate uses to connect to Snowflake. This username must already exist
     * and be available by Snowflake platform to be connected to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username Oracle GoldenGate uses to connect to Snowflake. This username must already exist
     * and be available by Snowflake platform to be connected to.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /** The password Oracle GoldenGate uses to connect to Snowflake platform. */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password Oracle GoldenGate uses to connect to Snowflake platform.
     *
     * @return the value
     */
    public String getPassword() {
        return password;
    }

    /** The base64 encoded content of private key file in PEM format. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFile")
    private final String privateKeyFile;

    /**
     * The base64 encoded content of private key file in PEM format.
     *
     * @return the value
     */
    public String getPrivateKeyFile() {
        return privateKeyFile;
    }

    /** Password if the private key file is encrypted. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphrase")
    private final String privateKeyPassphrase;

    /**
     * Password if the private key file is encrypted.
     *
     * @return the value
     */
    public String getPrivateKeyPassphrase() {
        return privateKeyPassphrase;
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
        sb.append("CreateSnowflakeConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", connectionUrl=").append(String.valueOf(this.connectionUrl));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", password=").append("<redacted>");
        sb.append(", privateKeyFile=").append(String.valueOf(this.privateKeyFile));
        sb.append(", privateKeyPassphrase=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSnowflakeConnectionDetails)) {
            return false;
        }

        CreateSnowflakeConnectionDetails other = (CreateSnowflakeConnectionDetails) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.connectionUrl, other.connectionUrl)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.privateKeyFile, other.privateKeyFile)
                && java.util.Objects.equals(this.privateKeyPassphrase, other.privateKeyPassphrase)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionUrl == null ? 43 : this.connectionUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationType == null
                                ? 43
                                : this.authenticationType.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyFile == null ? 43 : this.privateKeyFile.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyPassphrase == null
                                ? 43
                                : this.privateKeyPassphrase.hashCode());
        return result;
    }
}
