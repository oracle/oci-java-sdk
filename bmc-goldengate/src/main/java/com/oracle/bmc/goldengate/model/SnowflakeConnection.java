/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Represents the metadata of a Snowflake Connection.
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
    builder = SnowflakeConnection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SnowflakeConnection extends Connection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        public Builder locks(java.util.List<ResourceLock> locks) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("ingressIps")
        private java.util.List<IngressIpDetails> ingressIps;

        public Builder ingressIps(java.util.List<IngressIpDetails> ingressIps) {
            this.ingressIps = ingressIps;
            this.__explicitlySet__.add("ingressIps");
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
         * The Snowflake technology type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private TechnologyType technologyType;

        /**
         * The Snowflake technology type.
         * @param technologyType the value to set
         * @return this builder
         **/
        public Builder technologyType(TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * JDBC connection URL.
         * e.g.: 'jdbc:snowflake://<account_name>.snowflakecomputing.com/?warehouse=<warehouse-name>&db=<db-name>'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionUrl")
        private String connectionUrl;

        /**
         * JDBC connection URL.
         * e.g.: 'jdbc:snowflake://<account_name>.snowflakecomputing.com/?warehouse=<warehouse-name>&db=<db-name>'
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
         * Used authentication mechanism to access Snowflake.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private AuthenticationType authenticationType;

        /**
         * Used authentication mechanism to access Snowflake.
         *
         * @param authenticationType the value to set
         * @return this builder
         **/
        public Builder authenticationType(AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }
        /**
         * The username Oracle GoldenGate uses to connect to Snowflake.
         * This username must already exist and be available by Snowflake platform to be connected to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username Oracle GoldenGate uses to connect to Snowflake.
         * This username must already exist and be available by Snowflake platform to be connected to.
         *
         * @param username the value to set
         * @return this builder
         **/
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored.
         * The password Oracle GoldenGate uses to connect the associated system of the given technology.
         * It must conform to the specific security requirements including length, case sensitivity, and so on.
         * If secretId is used plaintext field must not be provided.
         * Note: When provided, 'password' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored.
         * The password Oracle GoldenGate uses to connect the associated system of the given technology.
         * It must conform to the specific security requirements including length, case sensitivity, and so on.
         * If secretId is used plaintext field must not be provided.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret that stores the content of the private key file (PEM file) corresponding to the API key of the fingerprint.
         * See documentation: https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
         * Note: When provided, 'privateKeyFile' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFileSecretId")
        private String privateKeyFileSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret that stores the content of the private key file (PEM file) corresponding to the API key of the fingerprint.
         * See documentation: https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
         * Note: When provided, 'privateKeyFile' field must not be provided.
         *
         * @param privateKeyFileSecretId the value to set
         * @return this builder
         **/
        public Builder privateKeyFileSecretId(String privateKeyFileSecretId) {
            this.privateKeyFileSecretId = privateKeyFileSecretId;
            this.__explicitlySet__.add("privateKeyFileSecretId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret that stores the password for the private key file.
         * Note: When provided, 'privateKeyPassphrase' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphraseSecretId")
        private String privateKeyPassphraseSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret that stores the password for the private key file.
         * Note: When provided, 'privateKeyPassphrase' field must not be provided.
         *
         * @param privateKeyPassphraseSecretId the value to set
         * @return this builder
         **/
        public Builder privateKeyPassphraseSecretId(String privateKeyPassphraseSecretId) {
            this.privateKeyPassphraseSecretId = privateKeyPassphraseSecretId;
            this.__explicitlySet__.add("privateKeyPassphraseSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SnowflakeConnection build() {
            SnowflakeConnection model =
                    new SnowflakeConnection(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.locks,
                            this.vaultId,
                            this.keyId,
                            this.ingressIps,
                            this.nsgIds,
                            this.subnetId,
                            this.routingMethod,
                            this.doesUseSecretIds,
                            this.technologyType,
                            this.connectionUrl,
                            this.authenticationType,
                            this.username,
                            this.passwordSecretId,
                            this.privateKeyFileSecretId,
                            this.privateKeyPassphraseSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SnowflakeConnection model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
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
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
            if (model.wasPropertyExplicitlySet("ingressIps")) {
                this.ingressIps(model.getIngressIps());
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
            if (model.wasPropertyExplicitlySet("connectionUrl")) {
                this.connectionUrl(model.getConnectionUrl());
            }
            if (model.wasPropertyExplicitlySet("authenticationType")) {
                this.authenticationType(model.getAuthenticationType());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("privateKeyFileSecretId")) {
                this.privateKeyFileSecretId(model.getPrivateKeyFileSecretId());
            }
            if (model.wasPropertyExplicitlySet("privateKeyPassphraseSecretId")) {
                this.privateKeyPassphraseSecretId(model.getPrivateKeyPassphraseSecretId());
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
    public SnowflakeConnection(
            String id,
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.List<ResourceLock> locks,
            String vaultId,
            String keyId,
            java.util.List<IngressIpDetails> ingressIps,
            java.util.List<String> nsgIds,
            String subnetId,
            RoutingMethod routingMethod,
            Boolean doesUseSecretIds,
            TechnologyType technologyType,
            String connectionUrl,
            AuthenticationType authenticationType,
            String username,
            String passwordSecretId,
            String privateKeyFileSecretId,
            String privateKeyPassphraseSecretId) {
        super(
                id,
                displayName,
                description,
                compartmentId,
                freeformTags,
                definedTags,
                systemTags,
                lifecycleState,
                lifecycleDetails,
                timeCreated,
                timeUpdated,
                locks,
                vaultId,
                keyId,
                ingressIps,
                nsgIds,
                subnetId,
                routingMethod,
                doesUseSecretIds);
        this.technologyType = technologyType;
        this.connectionUrl = connectionUrl;
        this.authenticationType = authenticationType;
        this.username = username;
        this.passwordSecretId = passwordSecretId;
        this.privateKeyFileSecretId = privateKeyFileSecretId;
        this.privateKeyPassphraseSecretId = privateKeyPassphraseSecretId;
    }

    /**
     * The Snowflake technology type.
     **/
    public enum TechnologyType {
        Snowflake("SNOWFLAKE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TechnologyType.class);

        private final String value;
        private static java.util.Map<String, TechnologyType> map;

        static {
            map = new java.util.HashMap<>();
            for (TechnologyType v : TechnologyType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TechnologyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TechnologyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TechnologyType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Snowflake technology type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final TechnologyType technologyType;

    /**
     * The Snowflake technology type.
     * @return the value
     **/
    public TechnologyType getTechnologyType() {
        return technologyType;
    }

    /**
     * JDBC connection URL.
     * e.g.: 'jdbc:snowflake://<account_name>.snowflakecomputing.com/?warehouse=<warehouse-name>&db=<db-name>'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionUrl")
    private final String connectionUrl;

    /**
     * JDBC connection URL.
     * e.g.: 'jdbc:snowflake://<account_name>.snowflakecomputing.com/?warehouse=<warehouse-name>&db=<db-name>'
     *
     * @return the value
     **/
    public String getConnectionUrl() {
        return connectionUrl;
    }

    /**
     * Used authentication mechanism to access Snowflake.
     *
     **/
    public enum AuthenticationType {
        Basic("BASIC"),
        KeyPair("KEY_PAIR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AuthenticationType.class);

        private final String value;
        private static java.util.Map<String, AuthenticationType> map;

        static {
            map = new java.util.HashMap<>();
            for (AuthenticationType v : AuthenticationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AuthenticationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuthenticationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AuthenticationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Used authentication mechanism to access Snowflake.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final AuthenticationType authenticationType;

    /**
     * Used authentication mechanism to access Snowflake.
     *
     * @return the value
     **/
    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * The username Oracle GoldenGate uses to connect to Snowflake.
     * This username must already exist and be available by Snowflake platform to be connected to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username Oracle GoldenGate uses to connect to Snowflake.
     * This username must already exist and be available by Snowflake platform to be connected to.
     *
     * @return the value
     **/
    public String getUsername() {
        return username;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored.
     * The password Oracle GoldenGate uses to connect the associated system of the given technology.
     * It must conform to the specific security requirements including length, case sensitivity, and so on.
     * If secretId is used plaintext field must not be provided.
     * Note: When provided, 'password' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored.
     * The password Oracle GoldenGate uses to connect the associated system of the given technology.
     * It must conform to the specific security requirements including length, case sensitivity, and so on.
     * If secretId is used plaintext field must not be provided.
     * Note: When provided, 'password' field must not be provided.
     *
     * @return the value
     **/
    public String getPasswordSecretId() {
        return passwordSecretId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret that stores the content of the private key file (PEM file) corresponding to the API key of the fingerprint.
     * See documentation: https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
     * Note: When provided, 'privateKeyFile' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFileSecretId")
    private final String privateKeyFileSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret that stores the content of the private key file (PEM file) corresponding to the API key of the fingerprint.
     * See documentation: https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
     * Note: When provided, 'privateKeyFile' field must not be provided.
     *
     * @return the value
     **/
    public String getPrivateKeyFileSecretId() {
        return privateKeyFileSecretId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret that stores the password for the private key file.
     * Note: When provided, 'privateKeyPassphrase' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphraseSecretId")
    private final String privateKeyPassphraseSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret that stores the password for the private key file.
     * Note: When provided, 'privateKeyPassphrase' field must not be provided.
     *
     * @return the value
     **/
    public String getPrivateKeyPassphraseSecretId() {
        return privateKeyPassphraseSecretId;
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
        sb.append("SnowflakeConnection(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", connectionUrl=").append(String.valueOf(this.connectionUrl));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", privateKeyFileSecretId=").append(String.valueOf(this.privateKeyFileSecretId));
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
        if (!(o instanceof SnowflakeConnection)) {
            return false;
        }

        SnowflakeConnection other = (SnowflakeConnection) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.connectionUrl, other.connectionUrl)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(
                        this.privateKeyFileSecretId, other.privateKeyFileSecretId)
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
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyFileSecretId == null
                                ? 43
                                : this.privateKeyFileSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyPassphraseSecretId == null
                                ? 43
                                : this.privateKeyPassphraseSecretId.hashCode());
        return result;
    }
}
