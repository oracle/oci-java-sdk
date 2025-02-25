/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about a new Databricks Connection.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDatabricksConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDatabricksConnectionDetails extends CreateConnectionDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<AddResourceLockDetails> locks;

        public Builder locks(java.util.List<AddResourceLockDetails> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
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
         * The Databricks technology type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private DatabricksConnection.TechnologyType technologyType;

        /**
         * The Databricks technology type.
         * @param technologyType the value to set
         * @return this builder
         **/
        public Builder technologyType(DatabricksConnection.TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * Used authentication mechanism to access Databricks.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private DatabricksConnection.AuthenticationType authenticationType;

        /**
         * Used authentication mechanism to access Databricks.
         *
         * @param authenticationType the value to set
         * @return this builder
         **/
        public Builder authenticationType(
                DatabricksConnection.AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }
        /**
         * Connection URL.
         * e.g.: 'jdbc:databricks://adb-33934.4.azuredatabricks.net:443/default;transportMode=http;ssl=1;httpPath=sql/protocolv1/o/3393########44/0##3-7-hlrb'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionUrl")
        private String connectionUrl;

        /**
         * Connection URL.
         * e.g.: 'jdbc:databricks://adb-33934.4.azuredatabricks.net:443/default;transportMode=http;ssl=1;httpPath=sql/protocolv1/o/3393########44/0##3-7-hlrb'
         *
         * @param connectionUrl the value to set
         * @return this builder
         **/
        public Builder connectionUrl(String connectionUrl) {
            this.connectionUrl = connectionUrl;
            this.__explicitlySet__.add("connectionUrl");
            return this;
        }
        /**
         * The password used to connect to Databricks.
         * Only applicable for authenticationType == PERSONAL_ACCESS_TOKEN.
         * Deprecated: This field is deprecated and replaced by "passwordSecretId". This field will be removed after February 15 2026.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password used to connect to Databricks.
         * Only applicable for authenticationType == PERSONAL_ACCESS_TOKEN.
         * Deprecated: This field is deprecated and replaced by "passwordSecretId". This field will be removed after February 15 2026.
         *
         * @param password the value to set
         * @return this builder
         **/
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored.
         * Note: When provided, 'password' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored.
         * Note: When provided, 'password' field must not be provided.
         *
         * @param passwordSecretId the value to set
         * @return this builder
         **/
        public Builder passwordSecretId(String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            this.__explicitlySet__.add("passwordSecretId");
            return this;
        }
        /**
         * OAuth client id, only applicable for authenticationType == OAUTH_M2M
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * OAuth client id, only applicable for authenticationType == OAUTH_M2M
         *
         * @param clientId the value to set
         * @return this builder
         **/
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }
        /**
         * OAuth client secret, only applicable for authenticationType == OAUTH_M2M
         * Deprecated: This field is deprecated and replaced by "clientSecretSecretId". This field will be removed after February 15 2026.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
        private String clientSecret;

        /**
         * OAuth client secret, only applicable for authenticationType == OAUTH_M2M
         * Deprecated: This field is deprecated and replaced by "clientSecretSecretId". This field will be removed after February 15 2026.
         *
         * @param clientSecret the value to set
         * @return this builder
         **/
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            this.__explicitlySet__.add("clientSecret");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the client secret is stored.
         * Only applicable for authenticationType == OAUTH_M2M.
         * Note: When provided, 'clientSecret' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientSecretSecretId")
        private String clientSecretSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the client secret is stored.
         * Only applicable for authenticationType == OAUTH_M2M.
         * Note: When provided, 'clientSecret' field must not be provided.
         *
         * @param clientSecretSecretId the value to set
         * @return this builder
         **/
        public Builder clientSecretSecretId(String clientSecretSecretId) {
            this.clientSecretSecretId = clientSecretSecretId;
            this.__explicitlySet__.add("clientSecretSecretId");
            return this;
        }
        /**
         * Optional. External storage credential name to access files on object storage such as ADLS Gen2, S3 or GCS.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageCredentialName")
        private String storageCredentialName;

        /**
         * Optional. External storage credential name to access files on object storage such as ADLS Gen2, S3 or GCS.
         *
         * @param storageCredentialName the value to set
         * @return this builder
         **/
        public Builder storageCredentialName(String storageCredentialName) {
            this.storageCredentialName = storageCredentialName;
            this.__explicitlySet__.add("storageCredentialName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDatabricksConnectionDetails build() {
            CreateDatabricksConnectionDetails model =
                    new CreateDatabricksConnectionDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.locks,
                            this.vaultId,
                            this.keyId,
                            this.nsgIds,
                            this.subnetId,
                            this.routingMethod,
                            this.doesUseSecretIds,
                            this.technologyType,
                            this.authenticationType,
                            this.connectionUrl,
                            this.password,
                            this.passwordSecretId,
                            this.clientId,
                            this.clientSecret,
                            this.clientSecretSecretId,
                            this.storageCredentialName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDatabricksConnectionDetails model) {
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
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
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
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("authenticationType")) {
                this.authenticationType(model.getAuthenticationType());
            }
            if (model.wasPropertyExplicitlySet("connectionUrl")) {
                this.connectionUrl(model.getConnectionUrl());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("clientId")) {
                this.clientId(model.getClientId());
            }
            if (model.wasPropertyExplicitlySet("clientSecret")) {
                this.clientSecret(model.getClientSecret());
            }
            if (model.wasPropertyExplicitlySet("clientSecretSecretId")) {
                this.clientSecretSecretId(model.getClientSecretSecretId());
            }
            if (model.wasPropertyExplicitlySet("storageCredentialName")) {
                this.storageCredentialName(model.getStorageCredentialName());
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
    public CreateDatabricksConnectionDetails(
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<AddResourceLockDetails> locks,
            String vaultId,
            String keyId,
            java.util.List<String> nsgIds,
            String subnetId,
            RoutingMethod routingMethod,
            Boolean doesUseSecretIds,
            DatabricksConnection.TechnologyType technologyType,
            DatabricksConnection.AuthenticationType authenticationType,
            String connectionUrl,
            String password,
            String passwordSecretId,
            String clientId,
            String clientSecret,
            String clientSecretSecretId,
            String storageCredentialName) {
        super(
                displayName,
                description,
                compartmentId,
                freeformTags,
                definedTags,
                locks,
                vaultId,
                keyId,
                nsgIds,
                subnetId,
                routingMethod,
                doesUseSecretIds);
        this.technologyType = technologyType;
        this.authenticationType = authenticationType;
        this.connectionUrl = connectionUrl;
        this.password = password;
        this.passwordSecretId = passwordSecretId;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.clientSecretSecretId = clientSecretSecretId;
        this.storageCredentialName = storageCredentialName;
    }

    /**
     * The Databricks technology type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final DatabricksConnection.TechnologyType technologyType;

    /**
     * The Databricks technology type.
     * @return the value
     **/
    public DatabricksConnection.TechnologyType getTechnologyType() {
        return technologyType;
    }

    /**
     * Used authentication mechanism to access Databricks.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final DatabricksConnection.AuthenticationType authenticationType;

    /**
     * Used authentication mechanism to access Databricks.
     *
     * @return the value
     **/
    public DatabricksConnection.AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Connection URL.
     * e.g.: 'jdbc:databricks://adb-33934.4.azuredatabricks.net:443/default;transportMode=http;ssl=1;httpPath=sql/protocolv1/o/3393########44/0##3-7-hlrb'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionUrl")
    private final String connectionUrl;

    /**
     * Connection URL.
     * e.g.: 'jdbc:databricks://adb-33934.4.azuredatabricks.net:443/default;transportMode=http;ssl=1;httpPath=sql/protocolv1/o/3393########44/0##3-7-hlrb'
     *
     * @return the value
     **/
    public String getConnectionUrl() {
        return connectionUrl;
    }

    /**
     * The password used to connect to Databricks.
     * Only applicable for authenticationType == PERSONAL_ACCESS_TOKEN.
     * Deprecated: This field is deprecated and replaced by "passwordSecretId". This field will be removed after February 15 2026.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password used to connect to Databricks.
     * Only applicable for authenticationType == PERSONAL_ACCESS_TOKEN.
     * Deprecated: This field is deprecated and replaced by "passwordSecretId". This field will be removed after February 15 2026.
     *
     * @return the value
     **/
    public String getPassword() {
        return password;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored.
     * Note: When provided, 'password' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored.
     * Note: When provided, 'password' field must not be provided.
     *
     * @return the value
     **/
    public String getPasswordSecretId() {
        return passwordSecretId;
    }

    /**
     * OAuth client id, only applicable for authenticationType == OAUTH_M2M
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * OAuth client id, only applicable for authenticationType == OAUTH_M2M
     *
     * @return the value
     **/
    public String getClientId() {
        return clientId;
    }

    /**
     * OAuth client secret, only applicable for authenticationType == OAUTH_M2M
     * Deprecated: This field is deprecated and replaced by "clientSecretSecretId". This field will be removed after February 15 2026.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
    private final String clientSecret;

    /**
     * OAuth client secret, only applicable for authenticationType == OAUTH_M2M
     * Deprecated: This field is deprecated and replaced by "clientSecretSecretId". This field will be removed after February 15 2026.
     *
     * @return the value
     **/
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the client secret is stored.
     * Only applicable for authenticationType == OAUTH_M2M.
     * Note: When provided, 'clientSecret' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecretSecretId")
    private final String clientSecretSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the client secret is stored.
     * Only applicable for authenticationType == OAUTH_M2M.
     * Note: When provided, 'clientSecret' field must not be provided.
     *
     * @return the value
     **/
    public String getClientSecretSecretId() {
        return clientSecretSecretId;
    }

    /**
     * Optional. External storage credential name to access files on object storage such as ADLS Gen2, S3 or GCS.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageCredentialName")
    private final String storageCredentialName;

    /**
     * Optional. External storage credential name to access files on object storage such as ADLS Gen2, S3 or GCS.
     *
     * @return the value
     **/
    public String getStorageCredentialName() {
        return storageCredentialName;
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
        sb.append("CreateDatabricksConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(", connectionUrl=").append(String.valueOf(this.connectionUrl));
        sb.append(", password=").append("<redacted>");
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", clientSecret=").append("<redacted>");
        sb.append(", clientSecretSecretId=").append(String.valueOf(this.clientSecretSecretId));
        sb.append(", storageCredentialName=").append(String.valueOf(this.storageCredentialName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabricksConnectionDetails)) {
            return false;
        }

        CreateDatabricksConnectionDetails other = (CreateDatabricksConnectionDetails) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.connectionUrl, other.connectionUrl)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.clientSecret, other.clientSecret)
                && java.util.Objects.equals(this.clientSecretSecretId, other.clientSecretSecretId)
                && java.util.Objects.equals(this.storageCredentialName, other.storageCredentialName)
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
                        + (this.authenticationType == null
                                ? 43
                                : this.authenticationType.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionUrl == null ? 43 : this.connectionUrl.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result = (result * PRIME) + (this.clientSecret == null ? 43 : this.clientSecret.hashCode());
        result =
                (result * PRIME)
                        + (this.clientSecretSecretId == null
                                ? 43
                                : this.clientSecretSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.storageCredentialName == null
                                ? 43
                                : this.storageCredentialName.hashCode());
        return result;
    }
}
