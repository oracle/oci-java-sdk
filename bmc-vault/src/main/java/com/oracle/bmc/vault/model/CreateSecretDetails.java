/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * The details of the secret that you want to create. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateSecretDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSecretDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "description",
        "freeformTags",
        "keyId",
        "metadata",
        "secretContent",
        "secretName",
        "secretRules",
        "vaultId"
    })
    public CreateSecretDetails(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String description,
            java.util.Map<String, String> freeformTags,
            String keyId,
            java.util.Map<String, Object> metadata,
            SecretContentDetails secretContent,
            String secretName,
            java.util.List<SecretRule> secretRules,
            String vaultId) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.description = description;
        this.freeformTags = freeformTags;
        this.keyId = keyId;
        this.metadata = metadata;
        this.secretContent = secretContent;
        this.secretName = secretName;
        this.secretRules = secretRules;
        this.vaultId = vaultId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment where you want to create the secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where you want to create the secret.
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
        /** A brief description of the secret. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A brief description of the secret. Avoid entering confidential information.
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
        /**
         * The OCID of the master encryption key that is used to encrypt the secret. You must
         * specify a symmetric key to encrypt the secret during import to the vault. You cannot
         * encrypt secrets with asymmetric keys. Furthermore, the key must exist in the vault that
         * you specify.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * The OCID of the master encryption key that is used to encrypt the secret. You must
         * specify a symmetric key to encrypt the secret during import to the vault. You cannot
         * encrypt secrets with asymmetric keys. Furthermore, the key must exist in the vault that
         * you specify.
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
         * Additional metadata that you can use to provide context about how to use the secret
         * during rotation or other administrative tasks. For example, for a secret that you use to
         * connect to a database, the additional metadata might specify the connection endpoint and
         * the connection string. Provide additional metadata as key-value pairs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, Object> metadata;

        /**
         * Additional metadata that you can use to provide context about how to use the secret
         * during rotation or other administrative tasks. For example, for a secret that you use to
         * connect to a database, the additional metadata might specify the connection endpoint and
         * the connection string. Provide additional metadata as key-value pairs.
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.Map<String, Object> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secretContent")
        private SecretContentDetails secretContent;

        public Builder secretContent(SecretContentDetails secretContent) {
            this.secretContent = secretContent;
            this.__explicitlySet__.add("secretContent");
            return this;
        }
        /**
         * A user-friendly name for the secret. Secret names should be unique within a vault. Avoid
         * entering confidential information. Valid characters are uppercase or lowercase letters,
         * numbers, hyphens, underscores, and periods.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretName")
        private String secretName;

        /**
         * A user-friendly name for the secret. Secret names should be unique within a vault. Avoid
         * entering confidential information. Valid characters are uppercase or lowercase letters,
         * numbers, hyphens, underscores, and periods.
         *
         * @param secretName the value to set
         * @return this builder
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            this.__explicitlySet__.add("secretName");
            return this;
        }
        /** A list of rules to control how the secret is used and managed. */
        @com.fasterxml.jackson.annotation.JsonProperty("secretRules")
        private java.util.List<SecretRule> secretRules;

        /**
         * A list of rules to control how the secret is used and managed.
         *
         * @param secretRules the value to set
         * @return this builder
         */
        public Builder secretRules(java.util.List<SecretRule> secretRules) {
            this.secretRules = secretRules;
            this.__explicitlySet__.add("secretRules");
            return this;
        }
        /** The OCID of the vault where you want to create the secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The OCID of the vault where you want to create the secret.
         *
         * @param vaultId the value to set
         * @return this builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSecretDetails build() {
            CreateSecretDetails model =
                    new CreateSecretDetails(
                            this.compartmentId,
                            this.definedTags,
                            this.description,
                            this.freeformTags,
                            this.keyId,
                            this.metadata,
                            this.secretContent,
                            this.secretName,
                            this.secretRules,
                            this.vaultId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSecretDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("secretContent")) {
                this.secretContent(model.getSecretContent());
            }
            if (model.wasPropertyExplicitlySet("secretName")) {
                this.secretName(model.getSecretName());
            }
            if (model.wasPropertyExplicitlySet("secretRules")) {
                this.secretRules(model.getSecretRules());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
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

    /** The OCID of the compartment where you want to create the secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where you want to create the secret.
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

    /** A brief description of the secret. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A brief description of the secret. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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

    /**
     * The OCID of the master encryption key that is used to encrypt the secret. You must specify a
     * symmetric key to encrypt the secret during import to the vault. You cannot encrypt secrets
     * with asymmetric keys. Furthermore, the key must exist in the vault that you specify.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * The OCID of the master encryption key that is used to encrypt the secret. You must specify a
     * symmetric key to encrypt the secret during import to the vault. You cannot encrypt secrets
     * with asymmetric keys. Furthermore, the key must exist in the vault that you specify.
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Additional metadata that you can use to provide context about how to use the secret during
     * rotation or other administrative tasks. For example, for a secret that you use to connect to
     * a database, the additional metadata might specify the connection endpoint and the connection
     * string. Provide additional metadata as key-value pairs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, Object> metadata;

    /**
     * Additional metadata that you can use to provide context about how to use the secret during
     * rotation or other administrative tasks. For example, for a secret that you use to connect to
     * a database, the additional metadata might specify the connection endpoint and the connection
     * string. Provide additional metadata as key-value pairs.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getMetadata() {
        return metadata;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("secretContent")
    private final SecretContentDetails secretContent;

    public SecretContentDetails getSecretContent() {
        return secretContent;
    }

    /**
     * A user-friendly name for the secret. Secret names should be unique within a vault. Avoid
     * entering confidential information. Valid characters are uppercase or lowercase letters,
     * numbers, hyphens, underscores, and periods.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretName")
    private final String secretName;

    /**
     * A user-friendly name for the secret. Secret names should be unique within a vault. Avoid
     * entering confidential information. Valid characters are uppercase or lowercase letters,
     * numbers, hyphens, underscores, and periods.
     *
     * @return the value
     */
    public String getSecretName() {
        return secretName;
    }

    /** A list of rules to control how the secret is used and managed. */
    @com.fasterxml.jackson.annotation.JsonProperty("secretRules")
    private final java.util.List<SecretRule> secretRules;

    /**
     * A list of rules to control how the secret is used and managed.
     *
     * @return the value
     */
    public java.util.List<SecretRule> getSecretRules() {
        return secretRules;
    }

    /** The OCID of the vault where you want to create the secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The OCID of the vault where you want to create the secret.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
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
        sb.append("CreateSecretDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", secretContent=").append(String.valueOf(this.secretContent));
        sb.append(", secretName=").append(String.valueOf(this.secretName));
        sb.append(", secretRules=").append(String.valueOf(this.secretRules));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSecretDetails)) {
            return false;
        }

        CreateSecretDetails other = (CreateSecretDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.secretContent, other.secretContent)
                && java.util.Objects.equals(this.secretName, other.secretName)
                && java.util.Objects.equals(this.secretRules, other.secretRules)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.secretContent == null ? 43 : this.secretContent.hashCode());
        result = (result * PRIME) + (this.secretName == null ? 43 : this.secretName.hashCode());
        result = (result * PRIME) + (this.secretRules == null ? 43 : this.secretRules.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
