/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about a new DatabaseRegistration.
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
    builder = CreateDatabaseRegistrationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDatabaseRegistrationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "compartmentId",
        "freeformTags",
        "definedTags",
        "fqdn",
        "ipAddress",
        "subnetId",
        "databaseId",
        "username",
        "password",
        "connectionString",
        "sessionMode",
        "wallet",
        "aliasName",
        "vaultId",
        "keyId",
        "secretCompartmentId"
    })
    public CreateDatabaseRegistrationDetails(
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String fqdn,
            String ipAddress,
            String subnetId,
            String databaseId,
            String username,
            String password,
            String connectionString,
            SessionMode sessionMode,
            String wallet,
            String aliasName,
            String vaultId,
            String keyId,
            String secretCompartmentId) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.fqdn = fqdn;
        this.ipAddress = ipAddress;
        this.subnetId = subnetId;
        this.databaseId = databaseId;
        this.username = username;
        this.password = password;
        this.connectionString = connectionString;
        this.sessionMode = sessionMode;
        this.wallet = wallet;
        this.aliasName = aliasName;
        this.vaultId = vaultId;
        this.keyId = keyId;
        this.secretCompartmentId = secretCompartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An object's Display Name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An object's Display Name.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Metadata about this specific object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Metadata about this specific object.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
         * for cross-compatibility only.
         * <p>
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
         * for cross-compatibility only.
         * <p>
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Tags defined for this resource. Each key is predefined and scoped to a namespace.
         * <p>
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Tags defined for this resource. Each key is predefined and scoped to a namespace.
         * <p>
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * A three-label Fully Qualified Domain Name (FQDN) for a resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
        private String fqdn;

        /**
         * A three-label Fully Qualified Domain Name (FQDN) for a resource.
         *
         * @param fqdn the value to set
         * @return this builder
         **/
        public Builder fqdn(String fqdn) {
            this.fqdn = fqdn;
            this.__explicitlySet__.add("fqdn");
            return this;
        }
        /**
         * The private IP address in the customer's VCN of the customer's endpoint, typically a
         * database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The private IP address in the customer's VCN of the customer's endpoint, typically a
         * database.
         *
         * @param ipAddress the value to set
         * @return this builder
         **/
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the target subnet of the dedicated connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the target subnet of the dedicated connection.
         *
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database being referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database being referenced.
         *
         * @param databaseId the value to set
         * @return this builder
         **/
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /**
         * The username Oracle GoldenGate uses to connect the associated system of the given technology.
         * This username must already exist and be available by the system/application to be connected to
         * and must conform to the case sensitivty requirments defined in it.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username Oracle GoldenGate uses to connect the associated system of the given technology.
         * This username must already exist and be available by the system/application to be connected to
         * and must conform to the case sensitivty requirments defined in it.
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
         * The password Oracle GoldenGate uses to connect the associated system of the given technology.
         * It must conform to the specific security requirements including length, case sensitivity, and so on.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password Oracle GoldenGate uses to connect the associated system of the given technology.
         * It must conform to the specific security requirements including length, case sensitivity, and so on.
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
         * Connect descriptor or Easy Connect Naming method used to connect to a database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
        private String connectionString;

        /**
         * Connect descriptor or Easy Connect Naming method used to connect to a database.
         *
         * @param connectionString the value to set
         * @return this builder
         **/
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            this.__explicitlySet__.add("connectionString");
            return this;
        }
        /**
         * The mode of the database connection session to be established by the data client.
         * 'REDIRECT' - for a RAC database, 'DIRECT' - for a non-RAC database.
         * Connection to a RAC database involves a redirection received from the SCAN listeners
         * to the database node to connect to. By default the mode would be DIRECT.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sessionMode")
        private SessionMode sessionMode;

        /**
         * The mode of the database connection session to be established by the data client.
         * 'REDIRECT' - for a RAC database, 'DIRECT' - for a non-RAC database.
         * Connection to a RAC database involves a redirection received from the SCAN listeners
         * to the database node to connect to. By default the mode would be DIRECT.
         *
         * @param sessionMode the value to set
         * @return this builder
         **/
        public Builder sessionMode(SessionMode sessionMode) {
            this.sessionMode = sessionMode;
            this.__explicitlySet__.add("sessionMode");
            return this;
        }
        /**
         * The wallet contents Oracle GoldenGate uses to make connections to a database.  This
         * attribute is expected to be base64 encoded.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("wallet")
        private String wallet;

        /**
         * The wallet contents Oracle GoldenGate uses to make connections to a database.  This
         * attribute is expected to be base64 encoded.
         *
         * @param wallet the value to set
         * @return this builder
         **/
        public Builder wallet(String wallet) {
            this.wallet = wallet;
            this.__explicitlySet__.add("wallet");
            return this;
        }
        /**
         * Credential store alias.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("aliasName")
        private String aliasName;

        /**
         * Credential store alias.
         *
         * @param aliasName the value to set
         * @return this builder
         **/
        public Builder aliasName(String aliasName) {
            this.aliasName = aliasName;
            this.__explicitlySet__.add("aliasName");
            return this;
        }
        /**
         * Refers to the customer's vault OCID.
         * If provided, it references a vault where GoldenGate can manage secrets. Customers must add policies to permit GoldenGate
         * to manage secrets contained within this vault.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * Refers to the customer's vault OCID.
         * If provided, it references a vault where GoldenGate can manage secrets. Customers must add policies to permit GoldenGate
         * to manage secrets contained within this vault.
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
         * Refers to the customer's master key OCID.
         * If provided, it references a key to manage secrets. Customers must add policies to permit GoldenGate to use this key.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * Refers to the customer's master key OCID.
         * If provided, it references a key to manage secrets. Customers must add policies to permit GoldenGate to use this key.
         *
         * @param keyId the value to set
         * @return this builder
         **/
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /**
         * The OCID of the compartment where the GoldenGate Secret will be created.
         * If provided, it references a key to manage secrets. Customers must add policies to permit GoldenGate to use this key.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secretCompartmentId")
        private String secretCompartmentId;

        /**
         * The OCID of the compartment where the GoldenGate Secret will be created.
         * If provided, it references a key to manage secrets. Customers must add policies to permit GoldenGate to use this key.
         *
         * @param secretCompartmentId the value to set
         * @return this builder
         **/
        public Builder secretCompartmentId(String secretCompartmentId) {
            this.secretCompartmentId = secretCompartmentId;
            this.__explicitlySet__.add("secretCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDatabaseRegistrationDetails build() {
            CreateDatabaseRegistrationDetails model =
                    new CreateDatabaseRegistrationDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.fqdn,
                            this.ipAddress,
                            this.subnetId,
                            this.databaseId,
                            this.username,
                            this.password,
                            this.connectionString,
                            this.sessionMode,
                            this.wallet,
                            this.aliasName,
                            this.vaultId,
                            this.keyId,
                            this.secretCompartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDatabaseRegistrationDetails model) {
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
            if (model.wasPropertyExplicitlySet("fqdn")) {
                this.fqdn(model.getFqdn());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("connectionString")) {
                this.connectionString(model.getConnectionString());
            }
            if (model.wasPropertyExplicitlySet("sessionMode")) {
                this.sessionMode(model.getSessionMode());
            }
            if (model.wasPropertyExplicitlySet("wallet")) {
                this.wallet(model.getWallet());
            }
            if (model.wasPropertyExplicitlySet("aliasName")) {
                this.aliasName(model.getAliasName());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("secretCompartmentId")) {
                this.secretCompartmentId(model.getSecretCompartmentId());
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

    /**
     * An object's Display Name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Metadata about this specific object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Metadata about this specific object.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
     * for cross-compatibility only.
     * <p>
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
     * for cross-compatibility only.
     * <p>
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     * <p>
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     * <p>
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A three-label Fully Qualified Domain Name (FQDN) for a resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
    private final String fqdn;

    /**
     * A three-label Fully Qualified Domain Name (FQDN) for a resource.
     *
     * @return the value
     **/
    public String getFqdn() {
        return fqdn;
    }

    /**
     * The private IP address in the customer's VCN of the customer's endpoint, typically a
     * database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The private IP address in the customer's VCN of the customer's endpoint, typically a
     * database.
     *
     * @return the value
     **/
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the target subnet of the dedicated connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the target subnet of the dedicated connection.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database being referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database being referenced.
     *
     * @return the value
     **/
    public String getDatabaseId() {
        return databaseId;
    }

    /**
     * The username Oracle GoldenGate uses to connect the associated system of the given technology.
     * This username must already exist and be available by the system/application to be connected to
     * and must conform to the case sensitivty requirments defined in it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username Oracle GoldenGate uses to connect the associated system of the given technology.
     * This username must already exist and be available by the system/application to be connected to
     * and must conform to the case sensitivty requirments defined in it.
     *
     * @return the value
     **/
    public String getUsername() {
        return username;
    }

    /**
     * The password Oracle GoldenGate uses to connect the associated system of the given technology.
     * It must conform to the specific security requirements including length, case sensitivity, and so on.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password Oracle GoldenGate uses to connect the associated system of the given technology.
     * It must conform to the specific security requirements including length, case sensitivity, and so on.
     *
     * @return the value
     **/
    public String getPassword() {
        return password;
    }

    /**
     * Connect descriptor or Easy Connect Naming method used to connect to a database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
    private final String connectionString;

    /**
     * Connect descriptor or Easy Connect Naming method used to connect to a database.
     *
     * @return the value
     **/
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * The mode of the database connection session to be established by the data client.
     * 'REDIRECT' - for a RAC database, 'DIRECT' - for a non-RAC database.
     * Connection to a RAC database involves a redirection received from the SCAN listeners
     * to the database node to connect to. By default the mode would be DIRECT.
     *
     **/
    public enum SessionMode {
        Direct("DIRECT"),
        Redirect("REDIRECT"),
        ;

        private final String value;
        private static java.util.Map<String, SessionMode> map;

        static {
            map = new java.util.HashMap<>();
            for (SessionMode v : SessionMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        SessionMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SessionMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SessionMode: " + key);
        }
    };
    /**
     * The mode of the database connection session to be established by the data client.
     * 'REDIRECT' - for a RAC database, 'DIRECT' - for a non-RAC database.
     * Connection to a RAC database involves a redirection received from the SCAN listeners
     * to the database node to connect to. By default the mode would be DIRECT.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sessionMode")
    private final SessionMode sessionMode;

    /**
     * The mode of the database connection session to be established by the data client.
     * 'REDIRECT' - for a RAC database, 'DIRECT' - for a non-RAC database.
     * Connection to a RAC database involves a redirection received from the SCAN listeners
     * to the database node to connect to. By default the mode would be DIRECT.
     *
     * @return the value
     **/
    public SessionMode getSessionMode() {
        return sessionMode;
    }

    /**
     * The wallet contents Oracle GoldenGate uses to make connections to a database.  This
     * attribute is expected to be base64 encoded.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wallet")
    private final String wallet;

    /**
     * The wallet contents Oracle GoldenGate uses to make connections to a database.  This
     * attribute is expected to be base64 encoded.
     *
     * @return the value
     **/
    public String getWallet() {
        return wallet;
    }

    /**
     * Credential store alias.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aliasName")
    private final String aliasName;

    /**
     * Credential store alias.
     *
     * @return the value
     **/
    public String getAliasName() {
        return aliasName;
    }

    /**
     * Refers to the customer's vault OCID.
     * If provided, it references a vault where GoldenGate can manage secrets. Customers must add policies to permit GoldenGate
     * to manage secrets contained within this vault.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * Refers to the customer's vault OCID.
     * If provided, it references a vault where GoldenGate can manage secrets. Customers must add policies to permit GoldenGate
     * to manage secrets contained within this vault.
     *
     * @return the value
     **/
    public String getVaultId() {
        return vaultId;
    }

    /**
     * Refers to the customer's master key OCID.
     * If provided, it references a key to manage secrets. Customers must add policies to permit GoldenGate to use this key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * Refers to the customer's master key OCID.
     * If provided, it references a key to manage secrets. Customers must add policies to permit GoldenGate to use this key.
     *
     * @return the value
     **/
    public String getKeyId() {
        return keyId;
    }

    /**
     * The OCID of the compartment where the GoldenGate Secret will be created.
     * If provided, it references a key to manage secrets. Customers must add policies to permit GoldenGate to use this key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretCompartmentId")
    private final String secretCompartmentId;

    /**
     * The OCID of the compartment where the GoldenGate Secret will be created.
     * If provided, it references a key to manage secrets. Customers must add policies to permit GoldenGate to use this key.
     *
     * @return the value
     **/
    public String getSecretCompartmentId() {
        return secretCompartmentId;
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
        sb.append("CreateDatabaseRegistrationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", fqdn=").append(String.valueOf(this.fqdn));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", password=").append("<redacted>");
        sb.append(", connectionString=").append(String.valueOf(this.connectionString));
        sb.append(", sessionMode=").append(String.valueOf(this.sessionMode));
        sb.append(", wallet=").append(String.valueOf(this.wallet));
        sb.append(", aliasName=").append(String.valueOf(this.aliasName));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", secretCompartmentId=").append(String.valueOf(this.secretCompartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabaseRegistrationDetails)) {
            return false;
        }

        CreateDatabaseRegistrationDetails other = (CreateDatabaseRegistrationDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.fqdn, other.fqdn)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.connectionString, other.connectionString)
                && java.util.Objects.equals(this.sessionMode, other.sessionMode)
                && java.util.Objects.equals(this.wallet, other.wallet)
                && java.util.Objects.equals(this.aliasName, other.aliasName)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.secretCompartmentId, other.secretCompartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.fqdn == null ? 43 : this.fqdn.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionString == null ? 43 : this.connectionString.hashCode());
        result = (result * PRIME) + (this.sessionMode == null ? 43 : this.sessionMode.hashCode());
        result = (result * PRIME) + (this.wallet == null ? 43 : this.wallet.hashCode());
        result = (result * PRIME) + (this.aliasName == null ? 43 : this.aliasName.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretCompartmentId == null
                                ? 43
                                : this.secretCompartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
