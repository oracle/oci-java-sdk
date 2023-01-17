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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ImportKeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ImportKeyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "keyShape",
        "wrappedImportKey",
        "protectionMode"
    })
    public ImportKeyDetails(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            KeyShape keyShape,
            WrappedImportKey wrappedImportKey,
            ProtectionMode protectionMode) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.keyShape = keyShape;
        this.wrappedImportKey = wrappedImportKey;
        this.protectionMode = protectionMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment that contains this key. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains this key.
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
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "foo-value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "foo-value"}}}
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
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyShape")
        private KeyShape keyShape;

        public Builder keyShape(KeyShape keyShape) {
            this.keyShape = keyShape;
            this.__explicitlySet__.add("keyShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("wrappedImportKey")
        private WrappedImportKey wrappedImportKey;

        public Builder wrappedImportKey(WrappedImportKey wrappedImportKey) {
            this.wrappedImportKey = wrappedImportKey;
            this.__explicitlySet__.add("wrappedImportKey");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportKeyDetails build() {
            ImportKeyDetails model =
                    new ImportKeyDetails(
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.keyShape,
                            this.wrappedImportKey,
                            this.protectionMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportKeyDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("keyShape")) {
                this.keyShape(model.getKeyShape());
            }
            if (model.wasPropertyExplicitlySet("wrappedImportKey")) {
                this.wrappedImportKey(model.getWrappedImportKey());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
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

    /** The OCID of the compartment that contains this key. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains this key.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "foo-value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "foo-value"}}}
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
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("keyShape")
    private final KeyShape keyShape;

    public KeyShape getKeyShape() {
        return keyShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("wrappedImportKey")
    private final WrappedImportKey wrappedImportKey;

    public WrappedImportKey getWrappedImportKey() {
        return wrappedImportKey;
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
        ;

        private final String value;
        private static java.util.Map<String, ProtectionMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ProtectionMode v : ProtectionMode.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ProtectionMode: " + key);
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
        sb.append("ImportKeyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", keyShape=").append(String.valueOf(this.keyShape));
        sb.append(", wrappedImportKey=").append(String.valueOf(this.wrappedImportKey));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportKeyDetails)) {
            return false;
        }

        ImportKeyDetails other = (ImportKeyDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.keyShape, other.keyShape)
                && java.util.Objects.equals(this.wrappedImportKey, other.wrappedImportKey)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.keyShape == null ? 43 : this.keyShape.hashCode());
        result =
                (result * PRIME)
                        + (this.wrappedImportKey == null ? 43 : this.wrappedImportKey.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
