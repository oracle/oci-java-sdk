/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * A special type of {@link IdentityProvider} that
 * supports the SAML 2.0 protocol. For more information, see
 * [Identity Providers and Federation](https://docs.cloud.oracle.com/Content/Identity/Concepts/federation.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = Saml2IdentityProvider.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "protocol"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Saml2IdentityProvider extends IdentityProvider {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("productType")
        private String productType;

        public Builder productType(String productType) {
            this.productType = productType;
            this.__explicitlySet__.add("productType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
        private Long inactiveStatus;

        public Builder inactiveStatus(Long inactiveStatus) {
            this.inactiveStatus = inactiveStatus;
            this.__explicitlySet__.add("inactiveStatus");
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
        /**
         * The URL for retrieving the identity provider's metadata, which
         * contains information required for federating.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadataUrl")
        private String metadataUrl;

        /**
         * The URL for retrieving the identity provider's metadata, which
         * contains information required for federating.
         *
         * @param metadataUrl the value to set
         * @return this builder
         **/
        public Builder metadataUrl(String metadataUrl) {
            this.metadataUrl = metadataUrl;
            this.__explicitlySet__.add("metadataUrl");
            return this;
        }
        /**
         * The XML that contains the information required for federating Identity with SAML2 Identity Provider.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private String metadata;

        /**
         * The XML that contains the information required for federating Identity with SAML2 Identity Provider.
         *
         * @param metadata the value to set
         * @return this builder
         **/
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The identity provider's signing certificate used by the IAM Service
         * to validate the SAML2 token.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("signingCertificate")
        private String signingCertificate;

        /**
         * The identity provider's signing certificate used by the IAM Service
         * to validate the SAML2 token.
         *
         * @param signingCertificate the value to set
         * @return this builder
         **/
        public Builder signingCertificate(String signingCertificate) {
            this.signingCertificate = signingCertificate;
            this.__explicitlySet__.add("signingCertificate");
            return this;
        }
        /**
         * The URL to redirect federated users to for authentication with the
         * identity provider.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
        private String redirectUrl;

        /**
         * The URL to redirect federated users to for authentication with the
         * identity provider.
         *
         * @param redirectUrl the value to set
         * @return this builder
         **/
        public Builder redirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            this.__explicitlySet__.add("redirectUrl");
            return this;
        }
        /**
         * Extra name value pairs associated with this identity provider.
         * Example: {@code {"clientId": "app_sf3kdjf3"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformAttributes")
        private java.util.Map<String, String> freeformAttributes;

        /**
         * Extra name value pairs associated with this identity provider.
         * Example: {@code {"clientId": "app_sf3kdjf3"}}
         *
         * @param freeformAttributes the value to set
         * @return this builder
         **/
        public Builder freeformAttributes(java.util.Map<String, String> freeformAttributes) {
            this.freeformAttributes = freeformAttributes;
            this.__explicitlySet__.add("freeformAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Saml2IdentityProvider build() {
            Saml2IdentityProvider model =
                    new Saml2IdentityProvider(
                            this.id,
                            this.compartmentId,
                            this.name,
                            this.description,
                            this.productType,
                            this.timeCreated,
                            this.lifecycleState,
                            this.inactiveStatus,
                            this.freeformTags,
                            this.definedTags,
                            this.metadataUrl,
                            this.metadata,
                            this.signingCertificate,
                            this.redirectUrl,
                            this.freeformAttributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Saml2IdentityProvider model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("productType")) {
                this.productType(model.getProductType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("inactiveStatus")) {
                this.inactiveStatus(model.getInactiveStatus());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("metadataUrl")) {
                this.metadataUrl(model.getMetadataUrl());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("signingCertificate")) {
                this.signingCertificate(model.getSigningCertificate());
            }
            if (model.wasPropertyExplicitlySet("redirectUrl")) {
                this.redirectUrl(model.getRedirectUrl());
            }
            if (model.wasPropertyExplicitlySet("freeformAttributes")) {
                this.freeformAttributes(model.getFreeformAttributes());
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
    public Saml2IdentityProvider(
            String id,
            String compartmentId,
            String name,
            String description,
            String productType,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            Long inactiveStatus,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String metadataUrl,
            String metadata,
            String signingCertificate,
            String redirectUrl,
            java.util.Map<String, String> freeformAttributes) {
        super(
                id,
                compartmentId,
                name,
                description,
                productType,
                timeCreated,
                lifecycleState,
                inactiveStatus,
                freeformTags,
                definedTags);
        this.metadataUrl = metadataUrl;
        this.metadata = metadata;
        this.signingCertificate = signingCertificate;
        this.redirectUrl = redirectUrl;
        this.freeformAttributes = freeformAttributes;
    }

    /**
     * The URL for retrieving the identity provider's metadata, which
     * contains information required for federating.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataUrl")
    private final String metadataUrl;

    /**
     * The URL for retrieving the identity provider's metadata, which
     * contains information required for federating.
     *
     * @return the value
     **/
    public String getMetadataUrl() {
        return metadataUrl;
    }

    /**
     * The XML that contains the information required for federating Identity with SAML2 Identity Provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final String metadata;

    /**
     * The XML that contains the information required for federating Identity with SAML2 Identity Provider.
     *
     * @return the value
     **/
    public String getMetadata() {
        return metadata;
    }

    /**
     * The identity provider's signing certificate used by the IAM Service
     * to validate the SAML2 token.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signingCertificate")
    private final String signingCertificate;

    /**
     * The identity provider's signing certificate used by the IAM Service
     * to validate the SAML2 token.
     *
     * @return the value
     **/
    public String getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * The URL to redirect federated users to for authentication with the
     * identity provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
    private final String redirectUrl;

    /**
     * The URL to redirect federated users to for authentication with the
     * identity provider.
     *
     * @return the value
     **/
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Extra name value pairs associated with this identity provider.
     * Example: {@code {"clientId": "app_sf3kdjf3"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformAttributes")
    private final java.util.Map<String, String> freeformAttributes;

    /**
     * Extra name value pairs associated with this identity provider.
     * Example: {@code {"clientId": "app_sf3kdjf3"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformAttributes() {
        return freeformAttributes;
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
        sb.append("Saml2IdentityProvider(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", metadataUrl=").append(String.valueOf(this.metadataUrl));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", signingCertificate=").append(String.valueOf(this.signingCertificate));
        sb.append(", redirectUrl=").append(String.valueOf(this.redirectUrl));
        sb.append(", freeformAttributes=").append(String.valueOf(this.freeformAttributes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Saml2IdentityProvider)) {
            return false;
        }

        Saml2IdentityProvider other = (Saml2IdentityProvider) o;
        return java.util.Objects.equals(this.metadataUrl, other.metadataUrl)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.signingCertificate, other.signingCertificate)
                && java.util.Objects.equals(this.redirectUrl, other.redirectUrl)
                && java.util.Objects.equals(this.freeformAttributes, other.freeformAttributes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.metadataUrl == null ? 43 : this.metadataUrl.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.signingCertificate == null
                                ? 43
                                : this.signingCertificate.hashCode());
        result = (result * PRIME) + (this.redirectUrl == null ? 43 : this.redirectUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.freeformAttributes == null
                                ? 43
                                : this.freeformAttributes.hashCode());
        return result;
    }
}
