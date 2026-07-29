/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about a new AI Model Connection.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateAiModelConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateAiModelConnectionDetails extends CreateConnectionDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
        private String clusterPlacementGroupId;

        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            this.__explicitlySet__.add("clusterPlacementGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }
        /**
         * The AI Model technology type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private AiModelConnection.TechnologyType technologyType;

        /**
         * The AI Model technology type.
         *
         * @param technologyType the value to set
         * @return this builder
         **/
        public Builder technologyType(AiModelConnection.TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * AI Provider type used by the AI Model Connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("providerType")
        private ProviderType providerType;

        /**
         * AI Provider type used by the AI Model Connection.
         *
         * @param providerType the value to set
         * @return this builder
         **/
        public Builder providerType(ProviderType providerType) {
            this.providerType = providerType;
            this.__explicitlySet__.add("providerType");
            return this;
        }
        /**
         * AI model identifier.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelKey")
        private String modelKey;

        /**
         * AI model identifier.
         *
         * @param modelKey the value to set
         * @return this builder
         **/
        public Builder modelKey(String modelKey) {
            this.modelKey = modelKey;
            this.__explicitlySet__.add("modelKey");
            return this;
        }
        /**
         * Maximum number of input characters supported by this AI model connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxInputChars")
        private Integer maxInputChars;

        /**
         * Maximum number of input characters supported by this AI model connection.
         *
         * @param maxInputChars the value to set
         * @return this builder
         **/
        public Builder maxInputChars(Integer maxInputChars) {
            this.maxInputChars = maxInputChars;
            this.__explicitlySet__.add("maxInputChars");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authDetails")
        private CreateAiModelAuthDetails authDetails;

        public Builder authDetails(CreateAiModelAuthDetails authDetails) {
            this.authDetails = authDetails;
            this.__explicitlySet__.add("authDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAiModelConnectionDetails build() {
            CreateAiModelConnectionDetails model =
                    new CreateAiModelConnectionDetails(
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
                            this.subscriptionId,
                            this.clusterPlacementGroupId,
                            this.securityAttributes,
                            this.technologyType,
                            this.providerType,
                            this.modelKey,
                            this.maxInputChars,
                            this.authDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAiModelConnectionDetails model) {
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
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("providerType")) {
                this.providerType(model.getProviderType());
            }
            if (model.wasPropertyExplicitlySet("modelKey")) {
                this.modelKey(model.getModelKey());
            }
            if (model.wasPropertyExplicitlySet("maxInputChars")) {
                this.maxInputChars(model.getMaxInputChars());
            }
            if (model.wasPropertyExplicitlySet("authDetails")) {
                this.authDetails(model.getAuthDetails());
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

    @Deprecated
    public CreateAiModelConnectionDetails(
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
            String subscriptionId,
            String clusterPlacementGroupId,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            AiModelConnection.TechnologyType technologyType,
            ProviderType providerType,
            String modelKey,
            Integer maxInputChars,
            CreateAiModelAuthDetails authDetails) {
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
                doesUseSecretIds,
                subscriptionId,
                clusterPlacementGroupId,
                securityAttributes);
        this.technologyType = technologyType;
        this.providerType = providerType;
        this.modelKey = modelKey;
        this.maxInputChars = maxInputChars;
        this.authDetails = authDetails;
    }

    /**
     * The AI Model technology type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final AiModelConnection.TechnologyType technologyType;

    /**
     * The AI Model technology type.
     *
     * @return the value
     **/
    public AiModelConnection.TechnologyType getTechnologyType() {
        return technologyType;
    }

    /**
     * AI Provider type used by the AI Model Connection.
     *
     **/
    public enum ProviderType {
        OciGenerativeAi("OCI_GENERATIVE_AI"),
        Gemini("GEMINI"),
        OpenAi("OPEN_AI"),
        VoyageAi("VOYAGE_AI"),
        ;

        private final String value;
        private static java.util.Map<String, ProviderType> map;

        static {
            map = new java.util.HashMap<>();
            for (ProviderType v : ProviderType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ProviderType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProviderType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ProviderType: " + key);
        }
    };
    /**
     * AI Provider type used by the AI Model Connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerType")
    private final ProviderType providerType;

    /**
     * AI Provider type used by the AI Model Connection.
     *
     * @return the value
     **/
    public ProviderType getProviderType() {
        return providerType;
    }

    /**
     * AI model identifier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelKey")
    private final String modelKey;

    /**
     * AI model identifier.
     *
     * @return the value
     **/
    public String getModelKey() {
        return modelKey;
    }

    /**
     * Maximum number of input characters supported by this AI model connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxInputChars")
    private final Integer maxInputChars;

    /**
     * Maximum number of input characters supported by this AI model connection.
     *
     * @return the value
     **/
    public Integer getMaxInputChars() {
        return maxInputChars;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("authDetails")
    private final CreateAiModelAuthDetails authDetails;

    public CreateAiModelAuthDetails getAuthDetails() {
        return authDetails;
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
        sb.append("CreateAiModelConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", providerType=").append(String.valueOf(this.providerType));
        sb.append(", modelKey=").append(String.valueOf(this.modelKey));
        sb.append(", maxInputChars=").append(String.valueOf(this.maxInputChars));
        sb.append(", authDetails=").append(String.valueOf(this.authDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAiModelConnectionDetails)) {
            return false;
        }

        CreateAiModelConnectionDetails other = (CreateAiModelConnectionDetails) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.providerType, other.providerType)
                && java.util.Objects.equals(this.modelKey, other.modelKey)
                && java.util.Objects.equals(this.maxInputChars, other.maxInputChars)
                && java.util.Objects.equals(this.authDetails, other.authDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result = (result * PRIME) + (this.providerType == null ? 43 : this.providerType.hashCode());
        result = (result * PRIME) + (this.modelKey == null ? 43 : this.modelKey.hashCode());
        result =
                (result * PRIME)
                        + (this.maxInputChars == null ? 43 : this.maxInputChars.hashCode());
        result = (result * PRIME) + (this.authDetails == null ? 43 : this.authDetails.hashCode());
        return result;
    }
}
