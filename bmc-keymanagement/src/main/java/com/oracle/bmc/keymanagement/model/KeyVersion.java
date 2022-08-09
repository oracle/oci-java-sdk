/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KeyVersion.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class KeyVersion extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "id",
        "keyId",
        "publicKey",
        "lifecycleState",
        "origin",
        "timeCreated",
        "timeOfDeletion",
        "vaultId",
        "restoredFromKeyVersionId",
        "replicaDetails",
        "isPrimary"
    })
    public KeyVersion(
            String compartmentId,
            String id,
            String keyId,
            String publicKey,
            LifecycleState lifecycleState,
            Origin origin,
            java.util.Date timeCreated,
            java.util.Date timeOfDeletion,
            String vaultId,
            String restoredFromKeyVersionId,
            KeyVersionReplicaDetails replicaDetails,
            Boolean isPrimary) {
        super();
        this.compartmentId = compartmentId;
        this.id = id;
        this.keyId = keyId;
        this.publicKey = publicKey;
        this.lifecycleState = lifecycleState;
        this.origin = origin;
        this.timeCreated = timeCreated;
        this.timeOfDeletion = timeOfDeletion;
        this.vaultId = vaultId;
        this.restoredFromKeyVersionId = restoredFromKeyVersionId;
        this.replicaDetails = replicaDetails;
        this.isPrimary = isPrimary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment that contains this key version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains this key version.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCID of the key version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the key version.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the key associated with this key version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * The OCID of the key associated with this key version.
         * @param keyId the value to set
         * @return this builder
         **/
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /**
         * The public key in PEM format. (This value pertains only to RSA and ECDSA keys.)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
        private String publicKey;

        /**
         * The public key in PEM format. (This value pertains only to RSA and ECDSA keys.)
         *
         * @param publicKey the value to set
         * @return this builder
         **/
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            this.__explicitlySet__.add("publicKey");
            return this;
        }
        /**
         * The key version's current lifecycle state.
         * <p>
         * Example: {@code ENABLED}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The key version's current lifecycle state.
         * <p>
         * Example: {@code ENABLED}
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The source of the key material. When this value is {@code INTERNAL}, Key Management
         * created the key material. When this value is {@code EXTERNAL}, the key material
         * was imported from an external source.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("origin")
        private Origin origin;

        /**
         * The source of the key material. When this value is {@code INTERNAL}, Key Management
         * created the key material. When this value is {@code EXTERNAL}, the key material
         * was imported from an external source.
         *
         * @param origin the value to set
         * @return this builder
         **/
        public Builder origin(Origin origin) {
            this.origin = origin;
            this.__explicitlySet__.add("origin");
            return this;
        }
        /**
         * The date and time this key version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * <p>
         * Example: "2018-04-03T21:10:29.600Z"
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time this key version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * <p>
         * Example: "2018-04-03T21:10:29.600Z"
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * An optional property indicating when to delete the key version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2019-04-03T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        /**
         * An optional property indicating when to delete the key version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2019-04-03T21:10:29.600Z}
         *
         * @param timeOfDeletion the value to set
         * @return this builder
         **/
        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }
        /**
         * The OCID of the vault that contains this key version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The OCID of the vault that contains this key version.
         * @param vaultId the value to set
         * @return this builder
         **/
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * The OCID of the key version from which this key version was restored.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("restoredFromKeyVersionId")
        private String restoredFromKeyVersionId;

        /**
         * The OCID of the key version from which this key version was restored.
         * @param restoredFromKeyVersionId the value to set
         * @return this builder
         **/
        public Builder restoredFromKeyVersionId(String restoredFromKeyVersionId) {
            this.restoredFromKeyVersionId = restoredFromKeyVersionId;
            this.__explicitlySet__.add("restoredFromKeyVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicaDetails")
        private KeyVersionReplicaDetails replicaDetails;

        public Builder replicaDetails(KeyVersionReplicaDetails replicaDetails) {
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

        public KeyVersion build() {
            KeyVersion model =
                    new KeyVersion(
                            this.compartmentId,
                            this.id,
                            this.keyId,
                            this.publicKey,
                            this.lifecycleState,
                            this.origin,
                            this.timeCreated,
                            this.timeOfDeletion,
                            this.vaultId,
                            this.restoredFromKeyVersionId,
                            this.replicaDetails,
                            this.isPrimary);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyVersion model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("publicKey")) {
                this.publicKey(model.getPublicKey());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("origin")) {
                this.origin(model.getOrigin());
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
            if (model.wasPropertyExplicitlySet("restoredFromKeyVersionId")) {
                this.restoredFromKeyVersionId(model.getRestoredFromKeyVersionId());
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
     * The OCID of the compartment that contains this key version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains this key version.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the key version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the key version.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the key associated with this key version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * The OCID of the key associated with this key version.
     * @return the value
     **/
    public String getKeyId() {
        return keyId;
    }

    /**
     * The public key in PEM format. (This value pertains only to RSA and ECDSA keys.)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
    private final String publicKey;

    /**
     * The public key in PEM format. (This value pertains only to RSA and ECDSA keys.)
     *
     * @return the value
     **/
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * The key version's current lifecycle state.
     * <p>
     * Example: {@code ENABLED}
     *
     **/
    public enum LifecycleState {
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

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * The key version's current lifecycle state.
     * <p>
     * Example: {@code ENABLED}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The key version's current lifecycle state.
     * <p>
     * Example: {@code ENABLED}
     *
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The source of the key material. When this value is {@code INTERNAL}, Key Management
     * created the key material. When this value is {@code EXTERNAL}, the key material
     * was imported from an external source.
     *
     **/
    public enum Origin {
        Internal("INTERNAL"),
        External("EXTERNAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Origin.class);

        private final String value;
        private static java.util.Map<String, Origin> map;

        static {
            map = new java.util.HashMap<>();
            for (Origin v : Origin.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Origin(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Origin create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Origin', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The source of the key material. When this value is {@code INTERNAL}, Key Management
     * created the key material. When this value is {@code EXTERNAL}, the key material
     * was imported from an external source.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("origin")
    private final Origin origin;

    /**
     * The source of the key material. When this value is {@code INTERNAL}, Key Management
     * created the key material. When this value is {@code EXTERNAL}, the key material
     * was imported from an external source.
     *
     * @return the value
     **/
    public Origin getOrigin() {
        return origin;
    }

    /**
     * The date and time this key version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * <p>
     * Example: "2018-04-03T21:10:29.600Z"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time this key version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * <p>
     * Example: "2018-04-03T21:10:29.600Z"
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * An optional property indicating when to delete the key version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    private final java.util.Date timeOfDeletion;

    /**
     * An optional property indicating when to delete the key version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeOfDeletion() {
        return timeOfDeletion;
    }

    /**
     * The OCID of the vault that contains this key version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The OCID of the vault that contains this key version.
     * @return the value
     **/
    public String getVaultId() {
        return vaultId;
    }

    /**
     * The OCID of the key version from which this key version was restored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("restoredFromKeyVersionId")
    private final String restoredFromKeyVersionId;

    /**
     * The OCID of the key version from which this key version was restored.
     * @return the value
     **/
    public String getRestoredFromKeyVersionId() {
        return restoredFromKeyVersionId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicaDetails")
    private final KeyVersionReplicaDetails replicaDetails;

    public KeyVersionReplicaDetails getReplicaDetails() {
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
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("KeyVersion(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", publicKey=").append(String.valueOf(this.publicKey));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", origin=").append(String.valueOf(this.origin));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", restoredFromKeyVersionId=")
                .append(String.valueOf(this.restoredFromKeyVersionId));
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
        if (!(o instanceof KeyVersion)) {
            return false;
        }

        KeyVersion other = (KeyVersion) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.publicKey, other.publicKey)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.origin, other.origin)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(
                        this.restoredFromKeyVersionId, other.restoredFromKeyVersionId)
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
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.publicKey == null ? 43 : this.publicKey.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.origin == null ? 43 : this.origin.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.restoredFromKeyVersionId == null
                                ? 43
                                : this.restoredFromKeyVersionId.hashCode());
        result =
                (result * PRIME)
                        + (this.replicaDetails == null ? 43 : this.replicaDetails.hashCode());
        result = (result * PRIME) + (this.isPrimary == null ? 43 : this.isPrimary.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
