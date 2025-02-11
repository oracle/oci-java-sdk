/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about a new Oracle NoSQL Connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateOracleNosqlConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOracleNosqlConnectionDetails extends CreateConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
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

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<AddResourceLockDetails> locks;

        public Builder locks(java.util.List<AddResourceLockDetails> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routingMethod")
        private RoutingMethod routingMethod;

        public Builder routingMethod(RoutingMethod routingMethod) {
            this.routingMethod = routingMethod;
            this.__explicitlySet__.add("routingMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("doesUseSecretIds")
        private Boolean doesUseSecretIds;

        public Builder doesUseSecretIds(Boolean doesUseSecretIds) {
            this.doesUseSecretIds = doesUseSecretIds;
            this.__explicitlySet__.add("doesUseSecretIds");
            return this;
        }
        /** The Oracle NoSQL technology type. */
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private OracleNosqlConnection.TechnologyType technologyType;

        /**
         * The Oracle NoSQL technology type.
         *
         * @param technologyType the value to set
         * @return this builder
         */
        public Builder technologyType(OracleNosqlConnection.TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * related OCI tenancy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * related OCI tenancy.
         *
         * @param tenancyId the value to set
         * @return this builder
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /**
         * The name of the region. e.g.: us-ashburn-1 If the region is not provided, backend will
         * default to the default region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The name of the region. e.g.: us-ashburn-1 If the region is not provided, backend will
         * default to the default region.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * OCI user who will access the Oracle NoSQL database. The user must have write access to
         * the table they want to connect to. If the user is not provided, backend will default to
         * the user who is calling the API endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * OCI user who will access the Oracle NoSQL database. The user must have write access to
         * the table they want to connect to. If the user is not provided, backend will default to
         * the user who is calling the API endpoint.
         *
         * @param userId the value to set
         * @return this builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /**
         * The base64 encoded content of the private key file (PEM file) corresponding to the API
         * key of the fingerprint. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
         * Deprecated: This field is deprecated and replaced by "privateKeyFileSecretId". This field
         * will be removed after February 15 2026.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFile")
        private String privateKeyFile;

        /**
         * The base64 encoded content of the private key file (PEM file) corresponding to the API
         * key of the fingerprint. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
         * Deprecated: This field is deprecated and replaced by "privateKeyFileSecretId". This field
         * will be removed after February 15 2026.
         *
         * @param privateKeyFile the value to set
         * @return this builder
         */
        public Builder privateKeyFile(String privateKeyFile) {
            this.privateKeyFile = privateKeyFile;
            this.__explicitlySet__.add("privateKeyFile");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the content of the private key file (PEM file) corresponding to the
         * API key of the fingerprint. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Note:
         * When provided, 'privateKeyFile' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFileSecretId")
        private String privateKeyFileSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the content of the private key file (PEM file) corresponding to the
         * API key of the fingerprint. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Note:
         * When provided, 'privateKeyFile' field must not be provided.
         *
         * @param privateKeyFileSecretId the value to set
         * @return this builder
         */
        public Builder privateKeyFileSecretId(String privateKeyFileSecretId) {
            this.privateKeyFileSecretId = privateKeyFileSecretId;
            this.__explicitlySet__.add("privateKeyFileSecretId");
            return this;
        }
        /**
         * The passphrase of the private key. Deprecated: This field is deprecated and replaced by
         * "privateKeyPassphraseSecretId". This field will be removed after February 15 2026.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphrase")
        private String privateKeyPassphrase;

        /**
         * The passphrase of the private key. Deprecated: This field is deprecated and replaced by
         * "privateKeyPassphraseSecretId". This field will be removed after February 15 2026.
         *
         * @param privateKeyPassphrase the value to set
         * @return this builder
         */
        public Builder privateKeyPassphrase(String privateKeyPassphrase) {
            this.privateKeyPassphrase = privateKeyPassphrase;
            this.__explicitlySet__.add("privateKeyPassphrase");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the passphrase of the private key. Note: When provided,
         * 'privateKeyPassphrase' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphraseSecretId")
        private String privateKeyPassphraseSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the passphrase of the private key. Note: When provided,
         * 'privateKeyPassphrase' field must not be provided.
         *
         * @param privateKeyPassphraseSecretId the value to set
         * @return this builder
         */
        public Builder privateKeyPassphraseSecretId(String privateKeyPassphraseSecretId) {
            this.privateKeyPassphraseSecretId = privateKeyPassphraseSecretId;
            this.__explicitlySet__.add("privateKeyPassphraseSecretId");
            return this;
        }
        /**
         * The fingerprint of the API Key of the user specified by the userId. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
         */
        @com.fasterxml.jackson.annotation.JsonProperty("publicKeyFingerprint")
        private String publicKeyFingerprint;

        /**
         * The fingerprint of the API Key of the user specified by the userId. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
         *
         * @param publicKeyFingerprint the value to set
         * @return this builder
         */
        public Builder publicKeyFingerprint(String publicKeyFingerprint) {
            this.publicKeyFingerprint = publicKeyFingerprint;
            this.__explicitlySet__.add("publicKeyFingerprint");
            return this;
        }
        /**
         * Indicates that the user intents to connect to the instance through resource principal.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldUseResourcePrincipal")
        private Boolean shouldUseResourcePrincipal;

        /**
         * Indicates that the user intents to connect to the instance through resource principal.
         *
         * @param shouldUseResourcePrincipal the value to set
         * @return this builder
         */
        public Builder shouldUseResourcePrincipal(Boolean shouldUseResourcePrincipal) {
            this.shouldUseResourcePrincipal = shouldUseResourcePrincipal;
            this.__explicitlySet__.add("shouldUseResourcePrincipal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOracleNosqlConnectionDetails build() {
            CreateOracleNosqlConnectionDetails model =
                    new CreateOracleNosqlConnectionDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.locks,
                            this.vaultId,
                            this.keyId,
                            this.nsgIds,
                            this.subnetId,
                            this.routingMethod,
                            this.doesUseSecretIds,
                            this.technologyType,
                            this.tenancyId,
                            this.region,
                            this.userId,
                            this.privateKeyFile,
                            this.privateKeyFileSecretId,
                            this.privateKeyPassphrase,
                            this.privateKeyPassphraseSecretId,
                            this.publicKeyFingerprint,
                            this.shouldUseResourcePrincipal);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOracleNosqlConnectionDetails model) {
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
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("routingMethod")) {
                this.routingMethod(model.getRoutingMethod());
            }
            if (model.wasPropertyExplicitlySet("doesUseSecretIds")) {
                this.doesUseSecretIds(model.getDoesUseSecretIds());
            }
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("privateKeyFile")) {
                this.privateKeyFile(model.getPrivateKeyFile());
            }
            if (model.wasPropertyExplicitlySet("privateKeyFileSecretId")) {
                this.privateKeyFileSecretId(model.getPrivateKeyFileSecretId());
            }
            if (model.wasPropertyExplicitlySet("privateKeyPassphrase")) {
                this.privateKeyPassphrase(model.getPrivateKeyPassphrase());
            }
            if (model.wasPropertyExplicitlySet("privateKeyPassphraseSecretId")) {
                this.privateKeyPassphraseSecretId(model.getPrivateKeyPassphraseSecretId());
            }
            if (model.wasPropertyExplicitlySet("publicKeyFingerprint")) {
                this.publicKeyFingerprint(model.getPublicKeyFingerprint());
            }
            if (model.wasPropertyExplicitlySet("shouldUseResourcePrincipal")) {
                this.shouldUseResourcePrincipal(model.getShouldUseResourcePrincipal());
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

    @Deprecated
    public CreateOracleNosqlConnectionDetails(
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<AddResourceLockDetails> locks,
            String vaultId,
            String keyId,
            java.util.List<String> nsgIds,
            String subnetId,
            RoutingMethod routingMethod,
            Boolean doesUseSecretIds,
            OracleNosqlConnection.TechnologyType technologyType,
            String tenancyId,
            String region,
            String userId,
            String privateKeyFile,
            String privateKeyFileSecretId,
            String privateKeyPassphrase,
            String privateKeyPassphraseSecretId,
            String publicKeyFingerprint,
            Boolean shouldUseResourcePrincipal) {
        super(
                displayName,
                description,
                compartmentId,
                freeformTags,
                definedTags,
                locks,
                vaultId,
                keyId,
                nsgIds,
                subnetId,
                routingMethod,
                doesUseSecretIds);
        this.technologyType = technologyType;
        this.tenancyId = tenancyId;
        this.region = region;
        this.userId = userId;
        this.privateKeyFile = privateKeyFile;
        this.privateKeyFileSecretId = privateKeyFileSecretId;
        this.privateKeyPassphrase = privateKeyPassphrase;
        this.privateKeyPassphraseSecretId = privateKeyPassphraseSecretId;
        this.publicKeyFingerprint = publicKeyFingerprint;
        this.shouldUseResourcePrincipal = shouldUseResourcePrincipal;
    }

    /** The Oracle NoSQL technology type. */
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final OracleNosqlConnection.TechnologyType technologyType;

    /**
     * The Oracle NoSQL technology type.
     *
     * @return the value
     */
    public OracleNosqlConnection.TechnologyType getTechnologyType() {
        return technologyType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * related OCI tenancy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * related OCI tenancy.
     *
     * @return the value
     */
    public String getTenancyId() {
        return tenancyId;
    }

    /**
     * The name of the region. e.g.: us-ashburn-1 If the region is not provided, backend will
     * default to the default region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The name of the region. e.g.: us-ashburn-1 If the region is not provided, backend will
     * default to the default region.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the OCI
     * user who will access the Oracle NoSQL database. The user must have write access to the table
     * they want to connect to. If the user is not provided, backend will default to the user who is
     * calling the API endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the OCI
     * user who will access the Oracle NoSQL database. The user must have write access to the table
     * they want to connect to. If the user is not provided, backend will default to the user who is
     * calling the API endpoint.
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
    }

    /**
     * The base64 encoded content of the private key file (PEM file) corresponding to the API key of
     * the fingerprint. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Deprecated:
     * This field is deprecated and replaced by "privateKeyFileSecretId". This field will be removed
     * after February 15 2026.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFile")
    private final String privateKeyFile;

    /**
     * The base64 encoded content of the private key file (PEM file) corresponding to the API key of
     * the fingerprint. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Deprecated:
     * This field is deprecated and replaced by "privateKeyFileSecretId". This field will be removed
     * after February 15 2026.
     *
     * @return the value
     */
    public String getPrivateKeyFile() {
        return privateKeyFile;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the content of the private key file (PEM file) corresponding to the API
     * key of the fingerprint. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Note: When
     * provided, 'privateKeyFile' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFileSecretId")
    private final String privateKeyFileSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the content of the private key file (PEM file) corresponding to the API
     * key of the fingerprint. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Note: When
     * provided, 'privateKeyFile' field must not be provided.
     *
     * @return the value
     */
    public String getPrivateKeyFileSecretId() {
        return privateKeyFileSecretId;
    }

    /**
     * The passphrase of the private key. Deprecated: This field is deprecated and replaced by
     * "privateKeyPassphraseSecretId". This field will be removed after February 15 2026.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphrase")
    private final String privateKeyPassphrase;

    /**
     * The passphrase of the private key. Deprecated: This field is deprecated and replaced by
     * "privateKeyPassphraseSecretId". This field will be removed after February 15 2026.
     *
     * @return the value
     */
    public String getPrivateKeyPassphrase() {
        return privateKeyPassphrase;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the passphrase of the private key. Note: When provided,
     * 'privateKeyPassphrase' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphraseSecretId")
    private final String privateKeyPassphraseSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the passphrase of the private key. Note: When provided,
     * 'privateKeyPassphrase' field must not be provided.
     *
     * @return the value
     */
    public String getPrivateKeyPassphraseSecretId() {
        return privateKeyPassphraseSecretId;
    }

    /**
     * The fingerprint of the API Key of the user specified by the userId. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publicKeyFingerprint")
    private final String publicKeyFingerprint;

    /**
     * The fingerprint of the API Key of the user specified by the userId. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
     *
     * @return the value
     */
    public String getPublicKeyFingerprint() {
        return publicKeyFingerprint;
    }

    /** Indicates that the user intents to connect to the instance through resource principal. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldUseResourcePrincipal")
    private final Boolean shouldUseResourcePrincipal;

    /**
     * Indicates that the user intents to connect to the instance through resource principal.
     *
     * @return the value
     */
    public Boolean getShouldUseResourcePrincipal() {
        return shouldUseResourcePrincipal;
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
        sb.append("CreateOracleNosqlConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", privateKeyFile=").append(String.valueOf(this.privateKeyFile));
        sb.append(", privateKeyFileSecretId=").append(String.valueOf(this.privateKeyFileSecretId));
        sb.append(", privateKeyPassphrase=").append("<redacted>");
        sb.append(", privateKeyPassphraseSecretId=")
                .append(String.valueOf(this.privateKeyPassphraseSecretId));
        sb.append(", publicKeyFingerprint=").append(String.valueOf(this.publicKeyFingerprint));
        sb.append(", shouldUseResourcePrincipal=")
                .append(String.valueOf(this.shouldUseResourcePrincipal));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOracleNosqlConnectionDetails)) {
            return false;
        }

        CreateOracleNosqlConnectionDetails other = (CreateOracleNosqlConnectionDetails) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.privateKeyFile, other.privateKeyFile)
                && java.util.Objects.equals(
                        this.privateKeyFileSecretId, other.privateKeyFileSecretId)
                && java.util.Objects.equals(this.privateKeyPassphrase, other.privateKeyPassphrase)
                && java.util.Objects.equals(
                        this.privateKeyPassphraseSecretId, other.privateKeyPassphraseSecretId)
                && java.util.Objects.equals(this.publicKeyFingerprint, other.publicKeyFingerprint)
                && java.util.Objects.equals(
                        this.shouldUseResourcePrincipal, other.shouldUseResourcePrincipal)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyFile == null ? 43 : this.privateKeyFile.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyFileSecretId == null
                                ? 43
                                : this.privateKeyFileSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyPassphrase == null
                                ? 43
                                : this.privateKeyPassphrase.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyPassphraseSecretId == null
                                ? 43
                                : this.privateKeyPassphraseSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.publicKeyFingerprint == null
                                ? 43
                                : this.publicKeyFingerprint.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldUseResourcePrincipal == null
                                ? 43
                                : this.shouldUseResourcePrincipal.hashCode());
        return result;
    }
}
