/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Key.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Key extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "currentKeyVersion",
        "definedTags",
        "displayName",
        "freeformTags",
        "id",
        "keyShape",
        "protectionMode",
        "lifecycleState",
        "timeCreated",
        "timeOfDeletion",
        "vaultId",
        "restoredFromKeyId",
        "replicaDetails",
        "isPrimary"
    })
    public Key(
            String compartmentId,
            String currentKeyVersion,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            KeyShape keyShape,
            ProtectionMode protectionMode,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeOfDeletion,
            String vaultId,
            String restoredFromKeyId,
            KeyReplicaDetails replicaDetails,
            Boolean isPrimary) {
        super();
        this.compartmentId = compartmentId;
        this.currentKeyVersion = currentKeyVersion;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.keyShape = keyShape;
        this.protectionMode = protectionMode;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeOfDeletion = timeOfDeletion;
        this.vaultId = vaultId;
        this.restoredFromKeyId = restoredFromKeyId;
        this.replicaDetails = replicaDetails;
        this.isPrimary = isPrimary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment that contains this master encryption key. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains this master encryption key.
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
         * The OCID of the key version used in cryptographic operations. During key rotation, the
         * service might be in a transitional state where this or a newer key version are used
         * intermittently. The {@code currentKeyVersion} property is updated when the service is
         * guaranteed to use the new key version for all subsequent encryption operations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("currentKeyVersion")
        private String currentKeyVersion;

        /**
         * The OCID of the key version used in cryptographic operations. During key rotation, the
         * service might be in a transitional state where this or a newer key version are used
         * intermittently. The {@code currentKeyVersion} property is updated when the service is
         * guaranteed to use the new key version for all subsequent encryption operations.
         *
         * @param currentKeyVersion the value to set
         * @return this builder
         */
        public Builder currentKeyVersion(String currentKeyVersion) {
            this.currentKeyVersion = currentKeyVersion;
            this.__explicitlySet__.add("currentKeyVersion");
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
         * A user-friendly name for the key. It does not have to be unique, and it is changeable.
         * Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the key. It does not have to be unique, and it is changeable.
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
        /** The OCID of the key. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the key.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyShape")
        private KeyShape keyShape;

        public Builder keyShape(KeyShape keyShape) {
            this.keyShape = keyShape;
            this.__explicitlySet__.add("keyShape");
            return this;
        }
        /**
         * The key's protection mode indicates how the key persists and where cryptographic
         * operations that use the key are performed. A protection mode of {@code HSM} means that
         * the key persists on a hardware security module (HSM) and all cryptographic operations are
         * performed inside the HSM. A protection mode of {@code SOFTWARE} means that the key
         * persists on the server, protected by the vault's RSA wrapping key which persists on the
         * HSM. All cryptographic operations that use a key with a protection mode of {@code
         * SOFTWARE} are performed on the server. By default, a key's protection mode is set to
         * {@code HSM}. You can't change a key's protection mode after the key is created or
         * imported.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private ProtectionMode protectionMode;

        /**
         * The key's protection mode indicates how the key persists and where cryptographic
         * operations that use the key are performed. A protection mode of {@code HSM} means that
         * the key persists on a hardware security module (HSM) and all cryptographic operations are
         * performed inside the HSM. A protection mode of {@code SOFTWARE} means that the key
         * persists on the server, protected by the vault's RSA wrapping key which persists on the
         * HSM. All cryptographic operations that use a key with a protection mode of {@code
         * SOFTWARE} are performed on the server. By default, a key's protection mode is set to
         * {@code HSM}. You can't change a key's protection mode after the key is created or
         * imported.
         *
         * @param protectionMode the value to set
         * @return this builder
         */
        public Builder protectionMode(ProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }
        /**
         * The key's current lifecycle state.
         *
         * <p>Example: {@code ENABLED}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The key's current lifecycle state.
         *
         * <p>Example: {@code ENABLED}
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
         * The date and time the key was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2018-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the key was created, expressed in [RFC
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
         * An optional property indicating when to delete the key, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        /**
         * An optional property indicating when to delete the key, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         *
         * @param timeOfDeletion the value to set
         * @return this builder
         */
        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }
        /** The OCID of the vault that contains this key. */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The OCID of the vault that contains this key.
         *
         * @param vaultId the value to set
         * @return this builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /** The OCID of the key from which this key was restored. */
        @com.fasterxml.jackson.annotation.JsonProperty("restoredFromKeyId")
        private String restoredFromKeyId;

        /**
         * The OCID of the key from which this key was restored.
         *
         * @param restoredFromKeyId the value to set
         * @return this builder
         */
        public Builder restoredFromKeyId(String restoredFromKeyId) {
            this.restoredFromKeyId = restoredFromKeyId;
            this.__explicitlySet__.add("restoredFromKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicaDetails")
        private KeyReplicaDetails replicaDetails;

        public Builder replicaDetails(KeyReplicaDetails replicaDetails) {
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

        public Key build() {
            Key model =
                    new Key(
                            this.compartmentId,
                            this.currentKeyVersion,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.id,
                            this.keyShape,
                            this.protectionMode,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeOfDeletion,
                            this.vaultId,
                            this.restoredFromKeyId,
                            this.replicaDetails,
                            this.isPrimary);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Key model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("currentKeyVersion")) {
                this.currentKeyVersion(model.getCurrentKeyVersion());
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
            if (model.wasPropertyExplicitlySet("keyShape")) {
                this.keyShape(model.getKeyShape());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeOfDeletion")) {
                this.timeOfDeletion(model.getTimeOfDeletion());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("restoredFromKeyId")) {
                this.restoredFromKeyId(model.getRestoredFromKeyId());
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

    /** The OCID of the compartment that contains this master encryption key. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains this master encryption key.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the key version used in cryptographic operations. During key rotation, the
     * service might be in a transitional state where this or a newer key version are used
     * intermittently. The {@code currentKeyVersion} property is updated when the service is
     * guaranteed to use the new key version for all subsequent encryption operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentKeyVersion")
    private final String currentKeyVersion;

    /**
     * The OCID of the key version used in cryptographic operations. During key rotation, the
     * service might be in a transitional state where this or a newer key version are used
     * intermittently. The {@code currentKeyVersion} property is updated when the service is
     * guaranteed to use the new key version for all subsequent encryption operations.
     *
     * @return the value
     */
    public String getCurrentKeyVersion() {
        return currentKeyVersion;
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
     * A user-friendly name for the key. It does not have to be unique, and it is changeable. Avoid
     * entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the key. It does not have to be unique, and it is changeable. Avoid
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

    /** The OCID of the key. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the key.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("keyShape")
    private final KeyShape keyShape;

    public KeyShape getKeyShape() {
        return keyShape;
    }

    /**
     * The key's protection mode indicates how the key persists and where cryptographic operations
     * that use the key are performed. A protection mode of {@code HSM} means that the key persists
     * on a hardware security module (HSM) and all cryptographic operations are performed inside the
     * HSM. A protection mode of {@code SOFTWARE} means that the key persists on the server,
     * protected by the vault's RSA wrapping key which persists on the HSM. All cryptographic
     * operations that use a key with a protection mode of {@code SOFTWARE} are performed on the
     * server. By default, a key's protection mode is set to {@code HSM}. You can't change a key's
     * protection mode after the key is created or imported.
     */
    public enum ProtectionMode implements com.oracle.bmc.http.internal.BmcEnum {
        Hsm("HSM"),
        Software("SOFTWARE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ProtectionMode.class);

        private final String value;
        private static java.util.Map<String, ProtectionMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ProtectionMode v : ProtectionMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ProtectionMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProtectionMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ProtectionMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The key's protection mode indicates how the key persists and where cryptographic operations
     * that use the key are performed. A protection mode of {@code HSM} means that the key persists
     * on a hardware security module (HSM) and all cryptographic operations are performed inside the
     * HSM. A protection mode of {@code SOFTWARE} means that the key persists on the server,
     * protected by the vault's RSA wrapping key which persists on the HSM. All cryptographic
     * operations that use a key with a protection mode of {@code SOFTWARE} are performed on the
     * server. By default, a key's protection mode is set to {@code HSM}. You can't change a key's
     * protection mode after the key is created or imported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final ProtectionMode protectionMode;

    /**
     * The key's protection mode indicates how the key persists and where cryptographic operations
     * that use the key are performed. A protection mode of {@code HSM} means that the key persists
     * on a hardware security module (HSM) and all cryptographic operations are performed inside the
     * HSM. A protection mode of {@code SOFTWARE} means that the key persists on the server,
     * protected by the vault's RSA wrapping key which persists on the HSM. All cryptographic
     * operations that use a key with a protection mode of {@code SOFTWARE} are performed on the
     * server. By default, a key's protection mode is set to {@code HSM}. You can't change a key's
     * protection mode after the key is created or imported.
     *
     * @return the value
     */
    public ProtectionMode getProtectionMode() {
        return protectionMode;
    }

    /**
     * The key's current lifecycle state.
     *
     * <p>Example: {@code ENABLED}
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Enabling("ENABLING"),
        Enabled("ENABLED"),
        Disabling("DISABLING"),
        Disabled("DISABLED"),
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
     * The key's current lifecycle state.
     *
     * <p>Example: {@code ENABLED}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The key's current lifecycle state.
     *
     * <p>Example: {@code ENABLED}
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the key was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2018-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the key was created, expressed in [RFC
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
     * An optional property indicating when to delete the key, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    private final java.util.Date timeOfDeletion;

    /**
     * An optional property indicating when to delete the key, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeOfDeletion() {
        return timeOfDeletion;
    }

    /** The OCID of the vault that contains this key. */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The OCID of the vault that contains this key.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /** The OCID of the key from which this key was restored. */
    @com.fasterxml.jackson.annotation.JsonProperty("restoredFromKeyId")
    private final String restoredFromKeyId;

    /**
     * The OCID of the key from which this key was restored.
     *
     * @return the value
     */
    public String getRestoredFromKeyId() {
        return restoredFromKeyId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicaDetails")
    private final KeyReplicaDetails replicaDetails;

    public KeyReplicaDetails getReplicaDetails() {
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
        sb.append("Key(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", currentKeyVersion=").append(String.valueOf(this.currentKeyVersion));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", keyShape=").append(String.valueOf(this.keyShape));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", restoredFromKeyId=").append(String.valueOf(this.restoredFromKeyId));
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
        if (!(o instanceof Key)) {
            return false;
        }

        Key other = (Key) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.currentKeyVersion, other.currentKeyVersion)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.keyShape, other.keyShape)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.restoredFromKeyId, other.restoredFromKeyId)
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
                        + (this.currentKeyVersion == null ? 43 : this.currentKeyVersion.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.keyShape == null ? 43 : this.keyShape.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.restoredFromKeyId == null ? 43 : this.restoredFromKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.replicaDetails == null ? 43 : this.replicaDetails.hashCode());
        result = (result * PRIME) + (this.isPrimary == null ? 43 : this.isPrimary.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
