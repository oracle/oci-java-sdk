/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Represents the metadata description of a database used by deployments in the same compartment.
 * <br>
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
        builder = DatabaseRegistration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DatabaseRegistration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "fqdn",
        "ipAddress",
        "subnetId",
        "databaseId",
        "rcePrivateIp",
        "systemTags",
        "username",
        "connectionString",
        "sessionMode",
        "aliasName",
        "vaultId",
        "keyId",
        "secretCompartmentId",
        "secretId"
    })
    public DatabaseRegistration(
            String id,
            String displayName,
            String description,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String fqdn,
            String ipAddress,
            String subnetId,
            String databaseId,
            String rcePrivateIp,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String username,
            String connectionString,
            SessionMode sessionMode,
            String aliasName,
            String vaultId,
            String keyId,
            String secretCompartmentId,
            String secretId) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.fqdn = fqdn;
        this.ipAddress = ipAddress;
        this.subnetId = subnetId;
        this.databaseId = databaseId;
        this.rcePrivateIp = rcePrivateIp;
        this.systemTags = systemTags;
        this.username = username;
        this.connectionString = connectionString;
        this.sessionMode = sessionMode;
        this.aliasName = aliasName;
        this.vaultId = vaultId;
        this.keyId = keyId;
        this.secretCompartmentId = secretCompartmentId;
        this.secretId = secretId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * databaseRegistration being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * databaseRegistration being referenced.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** An object's Display Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An object's Display Name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Metadata about this specific object. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Metadata about this specific object.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment being referenced.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The time the resource was created. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the resource was created. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the resource was last updated. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the resource was last updated. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Possible lifecycle states. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Possible lifecycle states.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Describes the object's current state in detail. For example, it can be used to provide
         * actionable information for a resource in a Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Describes the object's current state in detail. For example, it can be used to provide
         * actionable information for a resource in a Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope.
         * Exists for cross-compatibility only.
         *
         * <p>Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope.
         * Exists for cross-compatibility only.
         *
         * <p>Example: {@code {"bar-key": "value"}}
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
         * Tags defined for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Tags defined for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /** A three-label Fully Qualified Domain Name (FQDN) for a resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
        private String fqdn;

        /**
         * A three-label Fully Qualified Domain Name (FQDN) for a resource.
         *
         * @param fqdn the value to set
         * @return this builder
         */
        public Builder fqdn(String fqdn) {
            this.fqdn = fqdn;
            this.__explicitlySet__.add("fqdn");
            return this;
        }
        /**
         * The private IP address in the customer's VCN of the customer's endpoint, typically a
         * database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The private IP address in the customer's VCN of the customer's endpoint, typically a
         * database.
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * subnet being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * subnet being referenced.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * database being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * database being referenced.
         *
         * @param databaseId the value to set
         * @return this builder
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /**
         * A Private Endpoint IP address created in the customer's subnet. A customer database can
         * expect network traffic initiated by GoldenGate Service from this IP address. It can also
         * send network traffic to this IP address, typically in response to requests from
         * GoldenGate Service. The customer may use this IP address in Security Lists or Network
         * Security Groups (NSG) as needed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rcePrivateIp")
        private String rcePrivateIp;

        /**
         * A Private Endpoint IP address created in the customer's subnet. A customer database can
         * expect network traffic initiated by GoldenGate Service from this IP address. It can also
         * send network traffic to this IP address, typically in response to requests from
         * GoldenGate Service. The customer may use this IP address in Security Lists or Network
         * Security Groups (NSG) as needed.
         *
         * @param rcePrivateIp the value to set
         * @return this builder
         */
        public Builder rcePrivateIp(String rcePrivateIp) {
            this.rcePrivateIp = rcePrivateIp;
            this.__explicitlySet__.add("rcePrivateIp");
            return this;
        }
        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The username Oracle GoldenGate uses to connect the associated system of the given
         * technology. This username must already exist and be available by the system/application
         * to be connected to and must conform to the case sensitivty requirments defined in it.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username Oracle GoldenGate uses to connect the associated system of the given
         * technology. This username must already exist and be available by the system/application
         * to be connected to and must conform to the case sensitivty requirments defined in it.
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /** Connect descriptor or Easy Connect Naming method used to connect to a database. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
        private String connectionString;

        /**
         * Connect descriptor or Easy Connect Naming method used to connect to a database.
         *
         * @param connectionString the value to set
         * @return this builder
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            this.__explicitlySet__.add("connectionString");
            return this;
        }
        /**
         * The mode of the database connection session to be established by the data client.
         * 'REDIRECT' - for a RAC database, 'DIRECT' - for a non-RAC database. Connection to a RAC
         * database involves a redirection received from the SCAN listeners to the database node to
         * connect to. By default the mode would be DIRECT.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sessionMode")
        private SessionMode sessionMode;

        /**
         * The mode of the database connection session to be established by the data client.
         * 'REDIRECT' - for a RAC database, 'DIRECT' - for a non-RAC database. Connection to a RAC
         * database involves a redirection received from the SCAN listeners to the database node to
         * connect to. By default the mode would be DIRECT.
         *
         * @param sessionMode the value to set
         * @return this builder
         */
        public Builder sessionMode(SessionMode sessionMode) {
            this.sessionMode = sessionMode;
            this.__explicitlySet__.add("sessionMode");
            return this;
        }
        /** Credential store alias. */
        @com.fasterxml.jackson.annotation.JsonProperty("aliasName")
        private String aliasName;

        /**
         * Credential store alias.
         *
         * @param aliasName the value to set
         * @return this builder
         */
        public Builder aliasName(String aliasName) {
            this.aliasName = aliasName;
            this.__explicitlySet__.add("aliasName");
            return this;
        }
        /**
         * Refers to the customer's vault OCID. If provided, it references a vault where GoldenGate
         * can manage secrets. Customers must add policies to permit GoldenGate to manage secrets
         * contained within this vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * Refers to the customer's vault OCID. If provided, it references a vault where GoldenGate
         * can manage secrets. Customers must add policies to permit GoldenGate to manage secrets
         * contained within this vault.
         *
         * @param vaultId the value to set
         * @return this builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * Refers to the customer's master key OCID. If provided, it references a key to manage
         * secrets. Customers must add policies to permit GoldenGate to use this key.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * Refers to the customer's master key OCID. If provided, it references a key to manage
         * secrets. Customers must add policies to permit GoldenGate to use this key.
         *
         * @param keyId the value to set
         * @return this builder
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /**
         * The OCID of the compartment where the GoldenGate Secret will be created. If provided, it
         * references a key to manage secrets. Customers must add policies to permit GoldenGate to
         * use this key.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretCompartmentId")
        private String secretCompartmentId;

        /**
         * The OCID of the compartment where the GoldenGate Secret will be created. If provided, it
         * references a key to manage secrets. Customers must add policies to permit GoldenGate to
         * use this key.
         *
         * @param secretCompartmentId the value to set
         * @return this builder
         */
        public Builder secretCompartmentId(String secretCompartmentId) {
            this.secretCompartmentId = secretCompartmentId;
            this.__explicitlySet__.add("secretCompartmentId");
            return this;
        }
        /**
         * The OCID of the customer's GoldenGate Service Secret. If provided, it references a key
         * that customers will be required to ensure the policies are established to permit
         * GoldenGate to use this Secret.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * The OCID of the customer's GoldenGate Service Secret. If provided, it references a key
         * that customers will be required to ensure the policies are established to permit
         * GoldenGate to use this Secret.
         *
         * @param secretId the value to set
         * @return this builder
         */
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseRegistration build() {
            DatabaseRegistration model =
                    new DatabaseRegistration(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.fqdn,
                            this.ipAddress,
                            this.subnetId,
                            this.databaseId,
                            this.rcePrivateIp,
                            this.systemTags,
                            this.username,
                            this.connectionString,
                            this.sessionMode,
                            this.aliasName,
                            this.vaultId,
                            this.keyId,
                            this.secretCompartmentId,
                            this.secretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseRegistration model) {
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
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
            if (model.wasPropertyExplicitlySet("rcePrivateIp")) {
                this.rcePrivateIp(model.getRcePrivateIp());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("connectionString")) {
                this.connectionString(model.getConnectionString());
            }
            if (model.wasPropertyExplicitlySet("sessionMode")) {
                this.sessionMode(model.getSessionMode());
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
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * databaseRegistration being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * databaseRegistration being referenced.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** An object's Display Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Metadata about this specific object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Metadata about this specific object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment being referenced.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The time the resource was created. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the resource was created. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the resource was last updated. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the resource was last updated. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Possible lifecycle states. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Possible lifecycle states.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Describes the object's current state in detail. For example, it can be used to provide
     * actionable information for a resource in a Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Describes the object's current state in detail. For example, it can be used to provide
     * actionable information for a resource in a Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
     * for cross-compatibility only.
     *
     * <p>Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
     * for cross-compatibility only.
     *
     * <p>Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** A three-label Fully Qualified Domain Name (FQDN) for a resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
    private final String fqdn;

    /**
     * A three-label Fully Qualified Domain Name (FQDN) for a resource.
     *
     * @return the value
     */
    public String getFqdn() {
        return fqdn;
    }

    /**
     * The private IP address in the customer's VCN of the customer's endpoint, typically a
     * database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The private IP address in the customer's VCN of the customer's endpoint, typically a
     * database.
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * subnet being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * subnet being referenced.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * database being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * database being referenced.
     *
     * @return the value
     */
    public String getDatabaseId() {
        return databaseId;
    }

    /**
     * A Private Endpoint IP address created in the customer's subnet. A customer database can
     * expect network traffic initiated by GoldenGate Service from this IP address. It can also send
     * network traffic to this IP address, typically in response to requests from GoldenGate
     * Service. The customer may use this IP address in Security Lists or Network Security Groups
     * (NSG) as needed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rcePrivateIp")
    private final String rcePrivateIp;

    /**
     * A Private Endpoint IP address created in the customer's subnet. A customer database can
     * expect network traffic initiated by GoldenGate Service from this IP address. It can also send
     * network traffic to this IP address, typically in response to requests from GoldenGate
     * Service. The customer may use this IP address in Security Lists or Network Security Groups
     * (NSG) as needed.
     *
     * @return the value
     */
    public String getRcePrivateIp() {
        return rcePrivateIp;
    }

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * The username Oracle GoldenGate uses to connect the associated system of the given technology.
     * This username must already exist and be available by the system/application to be connected
     * to and must conform to the case sensitivty requirments defined in it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username Oracle GoldenGate uses to connect the associated system of the given technology.
     * This username must already exist and be available by the system/application to be connected
     * to and must conform to the case sensitivty requirments defined in it.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /** Connect descriptor or Easy Connect Naming method used to connect to a database. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
    private final String connectionString;

    /**
     * Connect descriptor or Easy Connect Naming method used to connect to a database.
     *
     * @return the value
     */
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * The mode of the database connection session to be established by the data client. 'REDIRECT'
     * - for a RAC database, 'DIRECT' - for a non-RAC database. Connection to a RAC database
     * involves a redirection received from the SCAN listeners to the database node to connect to.
     * By default the mode would be DIRECT.
     */
    public enum SessionMode implements com.oracle.bmc.http.internal.BmcEnum {
        Direct("DIRECT"),
        Redirect("REDIRECT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SessionMode.class);

        private final String value;
        private static java.util.Map<String, SessionMode> map;

        static {
            map = new java.util.HashMap<>();
            for (SessionMode v : SessionMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'SessionMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The mode of the database connection session to be established by the data client. 'REDIRECT'
     * - for a RAC database, 'DIRECT' - for a non-RAC database. Connection to a RAC database
     * involves a redirection received from the SCAN listeners to the database node to connect to.
     * By default the mode would be DIRECT.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sessionMode")
    private final SessionMode sessionMode;

    /**
     * The mode of the database connection session to be established by the data client. 'REDIRECT'
     * - for a RAC database, 'DIRECT' - for a non-RAC database. Connection to a RAC database
     * involves a redirection received from the SCAN listeners to the database node to connect to.
     * By default the mode would be DIRECT.
     *
     * @return the value
     */
    public SessionMode getSessionMode() {
        return sessionMode;
    }

    /** Credential store alias. */
    @com.fasterxml.jackson.annotation.JsonProperty("aliasName")
    private final String aliasName;

    /**
     * Credential store alias.
     *
     * @return the value
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * Refers to the customer's vault OCID. If provided, it references a vault where GoldenGate can
     * manage secrets. Customers must add policies to permit GoldenGate to manage secrets contained
     * within this vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * Refers to the customer's vault OCID. If provided, it references a vault where GoldenGate can
     * manage secrets. Customers must add policies to permit GoldenGate to manage secrets contained
     * within this vault.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /**
     * Refers to the customer's master key OCID. If provided, it references a key to manage secrets.
     * Customers must add policies to permit GoldenGate to use this key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * Refers to the customer's master key OCID. If provided, it references a key to manage secrets.
     * Customers must add policies to permit GoldenGate to use this key.
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * The OCID of the compartment where the GoldenGate Secret will be created. If provided, it
     * references a key to manage secrets. Customers must add policies to permit GoldenGate to use
     * this key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretCompartmentId")
    private final String secretCompartmentId;

    /**
     * The OCID of the compartment where the GoldenGate Secret will be created. If provided, it
     * references a key to manage secrets. Customers must add policies to permit GoldenGate to use
     * this key.
     *
     * @return the value
     */
    public String getSecretCompartmentId() {
        return secretCompartmentId;
    }

    /**
     * The OCID of the customer's GoldenGate Service Secret. If provided, it references a key that
     * customers will be required to ensure the policies are established to permit GoldenGate to use
     * this Secret.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * The OCID of the customer's GoldenGate Service Secret. If provided, it references a key that
     * customers will be required to ensure the policies are established to permit GoldenGate to use
     * this Secret.
     *
     * @return the value
     */
    public String getSecretId() {
        return secretId;
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
        sb.append("DatabaseRegistration(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", fqdn=").append(String.valueOf(this.fqdn));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", rcePrivateIp=").append(String.valueOf(this.rcePrivateIp));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", connectionString=").append(String.valueOf(this.connectionString));
        sb.append(", sessionMode=").append(String.valueOf(this.sessionMode));
        sb.append(", aliasName=").append(String.valueOf(this.aliasName));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", secretCompartmentId=").append(String.valueOf(this.secretCompartmentId));
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseRegistration)) {
            return false;
        }

        DatabaseRegistration other = (DatabaseRegistration) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.fqdn, other.fqdn)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.rcePrivateIp, other.rcePrivateIp)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.connectionString, other.connectionString)
                && java.util.Objects.equals(this.sessionMode, other.sessionMode)
                && java.util.Objects.equals(this.aliasName, other.aliasName)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.secretCompartmentId, other.secretCompartmentId)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.fqdn == null ? 43 : this.fqdn.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.rcePrivateIp == null ? 43 : this.rcePrivateIp.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionString == null ? 43 : this.connectionString.hashCode());
        result = (result * PRIME) + (this.sessionMode == null ? 43 : this.sessionMode.hashCode());
        result = (result * PRIME) + (this.aliasName == null ? 43 : this.aliasName.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretCompartmentId == null
                                ? 43
                                : this.secretCompartmentId.hashCode());
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
