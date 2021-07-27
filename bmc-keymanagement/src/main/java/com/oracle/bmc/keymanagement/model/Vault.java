/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Vault.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Vault {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cryptoEndpoint")
        private String cryptoEndpoint;

        public Builder cryptoEndpoint(String cryptoEndpoint) {
            this.cryptoEndpoint = cryptoEndpoint;
            this.__explicitlySet__.add("cryptoEndpoint");
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managementEndpoint")
        private String managementEndpoint;

        public Builder managementEndpoint(String managementEndpoint) {
            this.managementEndpoint = managementEndpoint;
            this.__explicitlySet__.add("managementEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultType")
        private VaultType vaultType;

        public Builder vaultType(VaultType vaultType) {
            this.vaultType = vaultType;
            this.__explicitlySet__.add("vaultType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("restoredFromVaultId")
        private String restoredFromVaultId;

        public Builder restoredFromVaultId(String restoredFromVaultId) {
            this.restoredFromVaultId = restoredFromVaultId;
            this.__explicitlySet__.add("restoredFromVaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("wrappingkeyId")
        private String wrappingkeyId;

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
            Vault __instance__ =
                    new Vault(
                            compartmentId,
                            cryptoEndpoint,
                            definedTags,
                            displayName,
                            freeformTags,
                            id,
                            lifecycleState,
                            managementEndpoint,
                            timeCreated,
                            timeOfDeletion,
                            vaultType,
                            restoredFromVaultId,
                            wrappingkeyId,
                            replicaDetails,
                            isPrimary);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Vault o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .cryptoEndpoint(o.getCryptoEndpoint())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .managementEndpoint(o.getManagementEndpoint())
                            .timeCreated(o.getTimeCreated())
                            .timeOfDeletion(o.getTimeOfDeletion())
                            .vaultType(o.getVaultType())
                            .restoredFromVaultId(o.getRestoredFromVaultId())
                            .wrappingkeyId(o.getWrappingkeyId())
                            .replicaDetails(o.getReplicaDetails())
                            .isPrimary(o.getIsPrimary());

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

    /**
     * The OCID of the compartment that contains this vault.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The service endpoint to perform cryptographic operations against. Cryptographic operations include
     * [Encrypt](https://docs.cloud.oracle.com/api/#/en/key/latest/EncryptedData/Encrypt), [Decrypt](https://docs.cloud.oracle.com/api/#/en/key/latest/DecryptedData/Decrypt),
     * and [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey) operations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cryptoEndpoint")
    String cryptoEndpoint;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name for the vault. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The OCID of the vault.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * The vault's current lifecycle state.
     * <p>
     * Example: {@code DELETED}
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
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
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * <p>
     * Example: {@code DELETED}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The service endpoint to perform management operations against. Management operations include "Create," "Update," "List," "Get," and "Delete" operations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementEndpoint")
    String managementEndpoint;

    /**
     * The date and time this vault was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * <p>
     * Example: {@code 2018-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * An optional property to indicate when to delete the vault, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2018-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    java.util.Date timeOfDeletion;
    /**
     * The type of vault. Each type of vault stores the key with different
     * degrees of isolation and has different options and pricing.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum VaultType {
        VirtualPrivate("VIRTUAL_PRIVATE"),
        Default("DEFAULT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The type of vault. Each type of vault stores the key with different
     * degrees of isolation and has different options and pricing.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultType")
    VaultType vaultType;

    /**
     * The OCID of the vault from which this vault was restored, if it was restored from a backup file.
     * If you restore a vault to the same region, the vault retains the same OCID that it had when you
     * backed up the vault.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("restoredFromVaultId")
    String restoredFromVaultId;

    /**
     * The OCID of the vault's wrapping key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wrappingkeyId")
    String wrappingkeyId;

    @com.fasterxml.jackson.annotation.JsonProperty("replicaDetails")
    VaultReplicaDetails replicaDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
    Boolean isPrimary;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
