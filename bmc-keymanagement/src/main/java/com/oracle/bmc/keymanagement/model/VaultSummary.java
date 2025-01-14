/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * The details of the Vault. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VaultSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VaultSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        "vaultType",
        "externalKeyManagerMetadataSummary"
    })
    public VaultSummary(
            String compartmentId,
            String cryptoEndpoint,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            LifecycleState lifecycleState,
            String managementEndpoint,
            java.util.Date timeCreated,
            VaultType vaultType,
            ExternalKeyManagerMetadataSummary externalKeyManagerMetadataSummary) {
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
        this.vaultType = vaultType;
        this.externalKeyManagerMetadataSummary = externalKeyManagerMetadataSummary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment that contains a particular vault. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains a particular vault.
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
         * A user-friendly name for a vault. It does not have to be unique, and it is changeable.
         * Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for a vault. It does not have to be unique, and it is changeable.
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
        /** The OCID of a vault. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of a vault.
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
         * A vault's current lifecycle state.
         *
         * <p>Example: {@code ACTIVE}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * A vault's current lifecycle state.
         *
         * <p>Example: {@code ACTIVE}
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
         * The date and time a vault was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2018-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time a vault was created, expressed in [RFC
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
         * The type of vault. Each type of vault stores keys with different degrees of isolation and
         * has different options and pricing.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultType")
        private VaultType vaultType;

        /**
         * The type of vault. Each type of vault stores keys with different degrees of isolation and
         * has different options and pricing.
         *
         * @param vaultType the value to set
         * @return this builder
         */
        public Builder vaultType(VaultType vaultType) {
            this.vaultType = vaultType;
            this.__explicitlySet__.add("vaultType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalKeyManagerMetadataSummary")
        private ExternalKeyManagerMetadataSummary externalKeyManagerMetadataSummary;

        public Builder externalKeyManagerMetadataSummary(
                ExternalKeyManagerMetadataSummary externalKeyManagerMetadataSummary) {
            this.externalKeyManagerMetadataSummary = externalKeyManagerMetadataSummary;
            this.__explicitlySet__.add("externalKeyManagerMetadataSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VaultSummary build() {
            VaultSummary model =
                    new VaultSummary(
                            this.compartmentId,
                            this.cryptoEndpoint,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.id,
                            this.lifecycleState,
                            this.managementEndpoint,
                            this.timeCreated,
                            this.vaultType,
                            this.externalKeyManagerMetadataSummary);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VaultSummary model) {
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
            if (model.wasPropertyExplicitlySet("vaultType")) {
                this.vaultType(model.getVaultType());
            }
            if (model.wasPropertyExplicitlySet("externalKeyManagerMetadataSummary")) {
                this.externalKeyManagerMetadataSummary(
                        model.getExternalKeyManagerMetadataSummary());
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

    /** The OCID of the compartment that contains a particular vault. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains a particular vault.
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
     * A user-friendly name for a vault. It does not have to be unique, and it is changeable. Avoid
     * entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for a vault. It does not have to be unique, and it is changeable. Avoid
     * entering confidential information.
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

    /** The OCID of a vault. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of a vault.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * A vault's current lifecycle state.
     *
     * <p>Example: {@code ACTIVE}
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
     * A vault's current lifecycle state.
     *
     * <p>Example: {@code ACTIVE}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * A vault's current lifecycle state.
     *
     * <p>Example: {@code ACTIVE}
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
     * The date and time a vault was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2018-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time a vault was created, expressed in [RFC
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
     * The type of vault. Each type of vault stores keys with different degrees of isolation and has
     * different options and pricing.
     */
    public enum VaultType implements com.oracle.bmc.http.internal.BmcEnum {
        VirtualPrivate("VIRTUAL_PRIVATE"),
        External("EXTERNAL"),
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
     * The type of vault. Each type of vault stores keys with different degrees of isolation and has
     * different options and pricing.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultType")
    private final VaultType vaultType;

    /**
     * The type of vault. Each type of vault stores keys with different degrees of isolation and has
     * different options and pricing.
     *
     * @return the value
     */
    public VaultType getVaultType() {
        return vaultType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("externalKeyManagerMetadataSummary")
    private final ExternalKeyManagerMetadataSummary externalKeyManagerMetadataSummary;

    public ExternalKeyManagerMetadataSummary getExternalKeyManagerMetadataSummary() {
        return externalKeyManagerMetadataSummary;
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
        sb.append("VaultSummary(");
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
        sb.append(", vaultType=").append(String.valueOf(this.vaultType));
        sb.append(", externalKeyManagerMetadataSummary=")
                .append(String.valueOf(this.externalKeyManagerMetadataSummary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VaultSummary)) {
            return false;
        }

        VaultSummary other = (VaultSummary) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.cryptoEndpoint, other.cryptoEndpoint)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.managementEndpoint, other.managementEndpoint)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.vaultType, other.vaultType)
                && java.util.Objects.equals(
                        this.externalKeyManagerMetadataSummary,
                        other.externalKeyManagerMetadataSummary)
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
        result = (result * PRIME) + (this.vaultType == null ? 43 : this.vaultType.hashCode());
        result =
                (result * PRIME)
                        + (this.externalKeyManagerMetadataSummary == null
                                ? 43
                                : this.externalKeyManagerMetadataSummary.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
