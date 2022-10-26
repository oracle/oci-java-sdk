/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Vault.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Vault extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "cryptoEndpoint",
        "definedTags",
        "displayName",
        "freeformTags",
        "id",
        "lifecycleState",
        "managementEndpoint",
        "timeCreated",
        "timeOfDeletion",
        "vaultType",
        "restoredFromVaultId",
        "wrappingkeyId",
        "replicaDetails",
        "isPrimary"
    })
    public Vault(
            String compartmentId,
            String cryptoEndpoint,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            LifecycleState lifecycleState,
            String managementEndpoint,
            java.util.Date timeCreated,
            java.util.Date timeOfDeletion,
            VaultType vaultType,
            String restoredFromVaultId,
            String wrappingkeyId,
            VaultReplicaDetails replicaDetails,
            Boolean isPrimary) {
        super();
        this.compartmentId = compartmentId;
        this.cryptoEndpoint = cryptoEndpoint;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.managementEndpoint = managementEndpoint;
        this.timeCreated = timeCreated;
        this.timeOfDeletion = timeOfDeletion;
        this.vaultType = vaultType;
        this.restoredFromVaultId = restoredFromVaultId;
        this.wrappingkeyId = wrappingkeyId;
        this.replicaDetails = replicaDetails;
        this.isPrimary = isPrimary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment that contains this vault. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains this vault.
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
         * The service endpoint to perform cryptographic operations against. Cryptographic
         * operations include
         * [Encrypt](https://docs.cloud.oracle.com/api/#/en/key/latest/EncryptedData/Encrypt),
         * [Decrypt](https://docs.cloud.oracle.com/api/#/en/key/latest/DecryptedData/Decrypt), and
         * [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey)
         * operations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cryptoEndpoint")
        private String cryptoEndpoint;

        /**
         * The service endpoint to perform cryptographic operations against. Cryptographic
         * operations include
         * [Encrypt](https://docs.cloud.oracle.com/api/#/en/key/latest/EncryptedData/Encrypt),
         * [Decrypt](https://docs.cloud.oracle.com/api/#/en/key/latest/DecryptedData/Decrypt), and
         * [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey)
         * operations.
         *
         * @param cryptoEndpoint the value to set
         * @return this builder
         */
        public Builder cryptoEndpoint(String cryptoEndpoint) {
            this.cryptoEndpoint = cryptoEndpoint;
            this.__explicitlySet__.add("cryptoEndpoint");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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
        /**
         * A user-friendly name for the vault. It does not have to be unique, and it is changeable.
         * Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the vault. It does not have to be unique, and it is changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /** The OCID of the vault. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the vault.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The vault's current lifecycle state.
         *
         * <p>Example: {@code DELETED}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The vault's current lifecycle state.
         *
         * <p>Example: {@code DELETED}
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
         * The service endpoint to perform management operations against. Management operations
         * include "Create," "Update," "List," "Get," and "Delete" operations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managementEndpoint")
        private String managementEndpoint;

        /**
         * The service endpoint to perform management operations against. Management operations
         * include "Create," "Update," "List," "Get," and "Delete" operations.
         *
         * @param managementEndpoint the value to set
         * @return this builder
         */
        public Builder managementEndpoint(String managementEndpoint) {
            this.managementEndpoint = managementEndpoint;
            this.__explicitlySet__.add("managementEndpoint");
            return this;
        }
        /**
         * The date and time this vault was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2018-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time this vault was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2018-04-03T21:10:29.600Z}
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
         * An optional property to indicate when to delete the vault, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2018-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        /**
         * An optional property to indicate when to delete the vault, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2018-04-03T21:10:29.600Z}
         *
         * @param timeOfDeletion the value to set
         * @return this builder
         */
        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }
        /**
         * The type of vault. Each type of vault stores the key with different degrees of isolation
         * and has different options and pricing.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultType")
        private VaultType vaultType;

        /**
         * The type of vault. Each type of vault stores the key with different degrees of isolation
         * and has different options and pricing.
         *
         * @param vaultType the value to set
         * @return this builder
         */
        public Builder vaultType(VaultType vaultType) {
            this.vaultType = vaultType;
            this.__explicitlySet__.add("vaultType");
            return this;
        }
        /**
         * The OCID of the vault from which this vault was restored, if it was restored from a
         * backup file. If you restore a vault to the same region, the vault retains the same OCID
         * that it had when you backed up the vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("restoredFromVaultId")
        private String restoredFromVaultId;

        /**
         * The OCID of the vault from which this vault was restored, if it was restored from a
         * backup file. If you restore a vault to the same region, the vault retains the same OCID
         * that it had when you backed up the vault.
         *
         * @param restoredFromVaultId the value to set
         * @return this builder
         */
        public Builder restoredFromVaultId(String restoredFromVaultId) {
            this.restoredFromVaultId = restoredFromVaultId;
            this.__explicitlySet__.add("restoredFromVaultId");
            return this;
        }
        /** The OCID of the vault's wrapping key. */
        @com.fasterxml.jackson.annotation.JsonProperty("wrappingkeyId")
        private String wrappingkeyId;

        /**
         * The OCID of the vault's wrapping key.
         *
         * @param wrappingkeyId the value to set
         * @return this builder
         */
        public Builder wrappingkeyId(String wrappingkeyId) {
            this.wrappingkeyId = wrappingkeyId;
            this.__explicitlySet__.add("wrappingkeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicaDetails")
        private VaultReplicaDetails replicaDetails;

        public Builder replicaDetails(VaultReplicaDetails replicaDetails) {
            this.replicaDetails = replicaDetails;
            this.__explicitlySet__.add("replicaDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
        private Boolean isPrimary;

        public Builder isPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            this.__explicitlySet__.add("isPrimary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Vault build() {
            Vault model =
                    new Vault(
                            this.compartmentId,
                            this.cryptoEndpoint,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.id,
                            this.lifecycleState,
                            this.managementEndpoint,
                            this.timeCreated,
                            this.timeOfDeletion,
                            this.vaultType,
                            this.restoredFromVaultId,
                            this.wrappingkeyId,
                            this.replicaDetails,
                            this.isPrimary);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Vault model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("cryptoEndpoint")) {
                this.cryptoEndpoint(model.getCryptoEndpoint());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("managementEndpoint")) {
                this.managementEndpoint(model.getManagementEndpoint());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeOfDeletion")) {
                this.timeOfDeletion(model.getTimeOfDeletion());
            }
            if (model.wasPropertyExplicitlySet("vaultType")) {
                this.vaultType(model.getVaultType());
            }
            if (model.wasPropertyExplicitlySet("restoredFromVaultId")) {
                this.restoredFromVaultId(model.getRestoredFromVaultId());
            }
            if (model.wasPropertyExplicitlySet("wrappingkeyId")) {
                this.wrappingkeyId(model.getWrappingkeyId());
            }
            if (model.wasPropertyExplicitlySet("replicaDetails")) {
                this.replicaDetails(model.getReplicaDetails());
            }
            if (model.wasPropertyExplicitlySet("isPrimary")) {
                this.isPrimary(model.getIsPrimary());
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

    /** The OCID of the compartment that contains this vault. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains this vault.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The service endpoint to perform cryptographic operations against. Cryptographic operations
     * include [Encrypt](https://docs.cloud.oracle.com/api/#/en/key/latest/EncryptedData/Encrypt),
     * [Decrypt](https://docs.cloud.oracle.com/api/#/en/key/latest/DecryptedData/Decrypt), and
     * [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey)
     * operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cryptoEndpoint")
    private final String cryptoEndpoint;

    /**
     * The service endpoint to perform cryptographic operations against. Cryptographic operations
     * include [Encrypt](https://docs.cloud.oracle.com/api/#/en/key/latest/EncryptedData/Encrypt),
     * [Decrypt](https://docs.cloud.oracle.com/api/#/en/key/latest/DecryptedData/Decrypt), and
     * [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey)
     * operations.
     *
     * @return the value
     */
    public String getCryptoEndpoint() {
        return cryptoEndpoint;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name for the vault. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the vault. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /** The OCID of the vault. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the vault.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The vault's current lifecycle state.
     *
     * <p>Example: {@code DELETED}
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        PendingDeletion("PENDING_DELETION"),
        SchedulingDeletion("SCHEDULING_DELETION"),
        CancellingDeletion("CANCELLING_DELETION"),
        Updating("UPDATING"),
        BackupInProgress("BACKUP_IN_PROGRESS"),
        Restoring("RESTORING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The vault's current lifecycle state.
     *
     * <p>Example: {@code DELETED}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The vault's current lifecycle state.
     *
     * <p>Example: {@code DELETED}
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The service endpoint to perform management operations against. Management operations include
     * "Create," "Update," "List," "Get," and "Delete" operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managementEndpoint")
    private final String managementEndpoint;

    /**
     * The service endpoint to perform management operations against. Management operations include
     * "Create," "Update," "List," "Get," and "Delete" operations.
     *
     * @return the value
     */
    public String getManagementEndpoint() {
        return managementEndpoint;
    }

    /**
     * The date and time this vault was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2018-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time this vault was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2018-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * An optional property to indicate when to delete the vault, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2018-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    private final java.util.Date timeOfDeletion;

    /**
     * An optional property to indicate when to delete the vault, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2018-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeOfDeletion() {
        return timeOfDeletion;
    }

    /**
     * The type of vault. Each type of vault stores the key with different degrees of isolation and
     * has different options and pricing.
     */
    public enum VaultType implements com.oracle.bmc.http.internal.BmcEnum {
        VirtualPrivate("VIRTUAL_PRIVATE"),
        Default("DEFAULT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(VaultType.class);

        private final String value;
        private static java.util.Map<String, VaultType> map;

        static {
            map = new java.util.HashMap<>();
            for (VaultType v : VaultType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        VaultType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VaultType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'VaultType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of vault. Each type of vault stores the key with different degrees of isolation and
     * has different options and pricing.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultType")
    private final VaultType vaultType;

    /**
     * The type of vault. Each type of vault stores the key with different degrees of isolation and
     * has different options and pricing.
     *
     * @return the value
     */
    public VaultType getVaultType() {
        return vaultType;
    }

    /**
     * The OCID of the vault from which this vault was restored, if it was restored from a backup
     * file. If you restore a vault to the same region, the vault retains the same OCID that it had
     * when you backed up the vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("restoredFromVaultId")
    private final String restoredFromVaultId;

    /**
     * The OCID of the vault from which this vault was restored, if it was restored from a backup
     * file. If you restore a vault to the same region, the vault retains the same OCID that it had
     * when you backed up the vault.
     *
     * @return the value
     */
    public String getRestoredFromVaultId() {
        return restoredFromVaultId;
    }

    /** The OCID of the vault's wrapping key. */
    @com.fasterxml.jackson.annotation.JsonProperty("wrappingkeyId")
    private final String wrappingkeyId;

    /**
     * The OCID of the vault's wrapping key.
     *
     * @return the value
     */
    public String getWrappingkeyId() {
        return wrappingkeyId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicaDetails")
    private final VaultReplicaDetails replicaDetails;

    public VaultReplicaDetails getReplicaDetails() {
        return replicaDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
    private final Boolean isPrimary;

    public Boolean getIsPrimary() {
        return isPrimary;
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
        sb.append("Vault(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", cryptoEndpoint=").append(String.valueOf(this.cryptoEndpoint));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", managementEndpoint=").append(String.valueOf(this.managementEndpoint));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
        sb.append(", vaultType=").append(String.valueOf(this.vaultType));
        sb.append(", restoredFromVaultId=").append(String.valueOf(this.restoredFromVaultId));
        sb.append(", wrappingkeyId=").append(String.valueOf(this.wrappingkeyId));
        sb.append(", replicaDetails=").append(String.valueOf(this.replicaDetails));
        sb.append(", isPrimary=").append(String.valueOf(this.isPrimary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Vault)) {
            return false;
        }

        Vault other = (Vault) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.cryptoEndpoint, other.cryptoEndpoint)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.managementEndpoint, other.managementEndpoint)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
                && java.util.Objects.equals(this.vaultType, other.vaultType)
                && java.util.Objects.equals(this.restoredFromVaultId, other.restoredFromVaultId)
                && java.util.Objects.equals(this.wrappingkeyId, other.wrappingkeyId)
                && java.util.Objects.equals(this.replicaDetails, other.replicaDetails)
                && java.util.Objects.equals(this.isPrimary, other.isPrimary)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.cryptoEndpoint == null ? 43 : this.cryptoEndpoint.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.managementEndpoint == null
                                ? 43
                                : this.managementEndpoint.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
        result = (result * PRIME) + (this.vaultType == null ? 43 : this.vaultType.hashCode());
        result =
                (result * PRIME)
                        + (this.restoredFromVaultId == null
                                ? 43
                                : this.restoredFromVaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.wrappingkeyId == null ? 43 : this.wrappingkeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.replicaDetails == null ? 43 : this.replicaDetails.hashCode());
        result = (result * PRIME) + (this.isPrimary == null ? 43 : this.isPrimary.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
