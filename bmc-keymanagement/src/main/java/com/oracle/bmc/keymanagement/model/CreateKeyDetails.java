/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * The details of the key that you want to create. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateKeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateKeyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "keyShape",
        "protectionMode",
        "externalKeyReference"
    })
    public CreateKeyDetails(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            KeyShape keyShape,
            ProtectionMode protectionMode,
            ExternalKeyReference externalKeyReference) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.keyShape = keyShape;
        this.protectionMode = protectionMode;
        this.externalKeyReference = externalKeyReference;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment where you want to create the master encryption key. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where you want to create the master encryption key.
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
         * imported. A protection mode of {@code EXTERNAL} mean that the key persists on the
         * customer's external key manager which is hosted externally outside of oracle. Oracle only
         * hold a reference to that key. All cryptographic operations that use a key with a
         * protection mode of {@code EXTERNAL} are performed by external key manager.
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
         * imported. A protection mode of {@code EXTERNAL} mean that the key persists on the
         * customer's external key manager which is hosted externally outside of oracle. Oracle only
         * hold a reference to that key. All cryptographic operations that use a key with a
         * protection mode of {@code EXTERNAL} are performed by external key manager.
         *
         * @param protectionMode the value to set
         * @return this builder
         */
        public Builder protectionMode(ProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalKeyReference")
        private ExternalKeyReference externalKeyReference;

        public Builder externalKeyReference(ExternalKeyReference externalKeyReference) {
            this.externalKeyReference = externalKeyReference;
            this.__explicitlySet__.add("externalKeyReference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateKeyDetails build() {
            CreateKeyDetails model =
                    new CreateKeyDetails(
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.keyShape,
                            this.protectionMode,
                            this.externalKeyReference);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateKeyDetails model) {
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
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("externalKeyReference")) {
                this.externalKeyReference(model.getExternalKeyReference());
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

    /** The OCID of the compartment where you want to create the master encryption key. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where you want to create the master encryption key.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
     * protection mode after the key is created or imported. A protection mode of {@code EXTERNAL}
     * mean that the key persists on the customer's external key manager which is hosted externally
     * outside of oracle. Oracle only hold a reference to that key. All cryptographic operations
     * that use a key with a protection mode of {@code EXTERNAL} are performed by external key
     * manager.
     */
    public enum ProtectionMode implements com.oracle.bmc.http.internal.BmcEnum {
        Hsm("HSM"),
        Software("SOFTWARE"),
        External("EXTERNAL"),
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
     * protection mode after the key is created or imported. A protection mode of {@code EXTERNAL}
     * mean that the key persists on the customer's external key manager which is hosted externally
     * outside of oracle. Oracle only hold a reference to that key. All cryptographic operations
     * that use a key with a protection mode of {@code EXTERNAL} are performed by external key
     * manager.
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
     * protection mode after the key is created or imported. A protection mode of {@code EXTERNAL}
     * mean that the key persists on the customer's external key manager which is hosted externally
     * outside of oracle. Oracle only hold a reference to that key. All cryptographic operations
     * that use a key with a protection mode of {@code EXTERNAL} are performed by external key
     * manager.
     *
     * @return the value
     */
    public ProtectionMode getProtectionMode() {
        return protectionMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("externalKeyReference")
    private final ExternalKeyReference externalKeyReference;

    public ExternalKeyReference getExternalKeyReference() {
        return externalKeyReference;
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
        sb.append("CreateKeyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", keyShape=").append(String.valueOf(this.keyShape));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", externalKeyReference=").append(String.valueOf(this.externalKeyReference));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateKeyDetails)) {
            return false;
        }

        CreateKeyDetails other = (CreateKeyDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.keyShape, other.keyShape)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(this.externalKeyReference, other.externalKeyReference)
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
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.externalKeyReference == null
                                ? 43
                                : this.externalKeyReference.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
