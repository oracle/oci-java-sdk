/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to update a Snowflake Connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateSnowflakeConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSnowflakeConnectionDetails extends UpdateConnectionDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routingMethod")
        private RoutingMethod routingMethod;

        public Builder routingMethod(RoutingMethod routingMethod) {
            this.routingMethod = routingMethod;
            this.__explicitlySet__.add("routingMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("doesUseSecretIds")
        private Boolean doesUseSecretIds;

        public Builder doesUseSecretIds(Boolean doesUseSecretIds) {
            this.doesUseSecretIds = doesUseSecretIds;
            this.__explicitlySet__.add("doesUseSecretIds");
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
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the password Oracle GoldenGate uses to connect to Snowflake platform.
         * Note: When provided, 'password' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the password Oracle GoldenGate uses to connect to Snowflake platform.
         * Note: When provided, 'password' field must not be provided.
         *
         * @param passwordSecretId the value to set
         * @return this builder
         */
        public Builder passwordSecretId(String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            this.__explicitlySet__.add("passwordSecretId");
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
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the content of the private key file (PEM file) corresponding to the
         * API key of the fingerprint. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Note:
         * When provided, 'privateKeyFile' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFileSecretId")
        private String privateKeyFileSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the content of the private key file (PEM file) corresponding to the
         * API key of the fingerprint. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Note:
         * When provided, 'privateKeyFile' field must not be provided.
         *
         * @param privateKeyFileSecretId the value to set
         * @return this builder
         */
        public Builder privateKeyFileSecretId(String privateKeyFileSecretId) {
            this.privateKeyFileSecretId = privateKeyFileSecretId;
            this.__explicitlySet__.add("privateKeyFileSecretId");
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
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the password for the private key file. Note: When provided,
         * 'privateKeyPassphrase' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphraseSecretId")
        private String privateKeyPassphraseSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the password for the private key file. Note: When provided,
         * 'privateKeyPassphrase' field must not be provided.
         *
         * @param privateKeyPassphraseSecretId the value to set
         * @return this builder
         */
        public Builder privateKeyPassphraseSecretId(String privateKeyPassphraseSecretId) {
            this.privateKeyPassphraseSecretId = privateKeyPassphraseSecretId;
            this.__explicitlySet__.add("privateKeyPassphraseSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSnowflakeConnectionDetails build() {
            UpdateSnowflakeConnectionDetails model =
                    new UpdateSnowflakeConnectionDetails(
                            this.displayName,
                            this.description,
                            this.freeformTags,
                            this.definedTags,
                            this.vaultId,
                            this.keyId,
                            this.nsgIds,
                            this.subnetId,
                            this.routingMethod,
                            this.doesUseSecretIds,
                            this.connectionUrl,
                            this.authenticationType,
                            this.username,
                            this.password,
                            this.passwordSecretId,
                            this.privateKeyFile,
                            this.privateKeyFileSecretId,
                            this.privateKeyPassphrase,
                            this.privateKeyPassphraseSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSnowflakeConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("routingMethod")) {
                this.routingMethod(model.getRoutingMethod());
            }
            if (model.wasPropertyExplicitlySet("doesUseSecretIds")) {
                this.doesUseSecretIds(model.getDoesUseSecretIds());
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
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("privateKeyFile")) {
                this.privateKeyFile(model.getPrivateKeyFile());
            }
            if (model.wasPropertyExplicitlySet("privateKeyFileSecretId")) {
                this.privateKeyFileSecretId(model.getPrivateKeyFileSecretId());
            }
            if (model.wasPropertyExplicitlySet("privateKeyPassphrase")) {
                this.privateKeyPassphrase(model.getPrivateKeyPassphrase());
            }
            if (model.wasPropertyExplicitlySet("privateKeyPassphraseSecretId")) {
                this.privateKeyPassphraseSecretId(model.getPrivateKeyPassphraseSecretId());
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
    public UpdateSnowflakeConnectionDetails(
            String displayName,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String vaultId,
            String keyId,
            java.util.List<String> nsgIds,
            String subnetId,
            RoutingMethod routingMethod,
            Boolean doesUseSecretIds,
            String connectionUrl,
            SnowflakeConnection.AuthenticationType authenticationType,
            String username,
            String password,
            String passwordSecretId,
            String privateKeyFile,
            String privateKeyFileSecretId,
            String privateKeyPassphrase,
            String privateKeyPassphraseSecretId) {
        super(
                displayName,
                description,
                freeformTags,
                definedTags,
                vaultId,
                keyId,
                nsgIds,
                subnetId,
                routingMethod,
                doesUseSecretIds);
        this.connectionUrl = connectionUrl;
        this.authenticationType = authenticationType;
        this.username = username;
        this.password = password;
        this.passwordSecretId = passwordSecretId;
        this.privateKeyFile = privateKeyFile;
        this.privateKeyFileSecretId = privateKeyFileSecretId;
        this.privateKeyPassphrase = privateKeyPassphrase;
        this.privateKeyPassphraseSecretId = privateKeyPassphraseSecretId;
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the password Oracle GoldenGate uses to connect to Snowflake platform.
     * Note: When provided, 'password' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the password Oracle GoldenGate uses to connect to Snowflake platform.
     * Note: When provided, 'password' field must not be provided.
     *
     * @return the value
     */
    public String getPasswordSecretId() {
        return passwordSecretId;
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the content of the private key file (PEM file) corresponding to the API
     * key of the fingerprint. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Note: When
     * provided, 'privateKeyFile' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFileSecretId")
    private final String privateKeyFileSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the content of the private key file (PEM file) corresponding to the API
     * key of the fingerprint. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Note: When
     * provided, 'privateKeyFile' field must not be provided.
     *
     * @return the value
     */
    public String getPrivateKeyFileSecretId() {
        return privateKeyFileSecretId;
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the password for the private key file. Note: When provided,
     * 'privateKeyPassphrase' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphraseSecretId")
    private final String privateKeyPassphraseSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the password for the private key file. Note: When provided,
     * 'privateKeyPassphrase' field must not be provided.
     *
     * @return the value
     */
    public String getPrivateKeyPassphraseSecretId() {
        return privateKeyPassphraseSecretId;
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
        sb.append("UpdateSnowflakeConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", connectionUrl=").append(String.valueOf(this.connectionUrl));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", password=").append("<redacted>");
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", privateKeyFile=").append(String.valueOf(this.privateKeyFile));
        sb.append(", privateKeyFileSecretId=").append(String.valueOf(this.privateKeyFileSecretId));
        sb.append(", privateKeyPassphrase=").append("<redacted>");
        sb.append(", privateKeyPassphraseSecretId=")
                .append(String.valueOf(this.privateKeyPassphraseSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSnowflakeConnectionDetails)) {
            return false;
        }

        UpdateSnowflakeConnectionDetails other = (UpdateSnowflakeConnectionDetails) o;
        return java.util.Objects.equals(this.connectionUrl, other.connectionUrl)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.privateKeyFile, other.privateKeyFile)
                && java.util.Objects.equals(
                        this.privateKeyFileSecretId, other.privateKeyFileSecretId)
                && java.util.Objects.equals(this.privateKeyPassphrase, other.privateKeyPassphrase)
                && java.util.Objects.equals(
                        this.privateKeyPassphraseSecretId, other.privateKeyPassphraseSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
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
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyFile == null ? 43 : this.privateKeyFile.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyFileSecretId == null
                                ? 43
                                : this.privateKeyFileSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyPassphrase == null
                                ? 43
                                : this.privateKeyPassphrase.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyPassphraseSecretId == null
                                ? 43
                                : this.privateKeyPassphraseSecretId.hashCode());
        return result;
    }
}
