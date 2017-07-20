/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

/**
 * A special type of {@link IdentityProvider} that
 * supports the SAML 2.0 protocol. For more information, see
 * [Identity Providers and Federation](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/federation.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = Saml2IdentityProvider.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "protocol"
)
public class Saml2IdentityProvider extends IdentityProvider {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        @com.fasterxml.jackson.annotation.JsonProperty("productType")
        private String productType;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
        private Long inactiveStatus;

        @com.fasterxml.jackson.annotation.JsonProperty("metadataUrl")
        private String metadataUrl;

        @com.fasterxml.jackson.annotation.JsonProperty("signingCertificate")
        private String signingCertificate;

        @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
        private String redirectUrl;

        public Saml2IdentityProvider build() {
            return new Saml2IdentityProvider(
                    id,
                    compartmentId,
                    name,
                    description,
                    productType,
                    timeCreated,
                    lifecycleState,
                    inactiveStatus,
                    metadataUrl,
                    signingCertificate,
                    redirectUrl);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Saml2IdentityProvider o) {
            return id(o.getId())
                    .compartmentId(o.getCompartmentId())
                    .name(o.getName())
                    .description(o.getDescription())
                    .productType(o.getProductType())
                    .timeCreated(o.getTimeCreated())
                    .lifecycleState(o.getLifecycleState())
                    .inactiveStatus(o.getInactiveStatus())
                    .metadataUrl(o.getMetadataUrl())
                    .signingCertificate(o.getSigningCertificate())
                    .redirectUrl(o.getRedirectUrl());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Saml2IdentityProvider(
            String id,
            String compartmentId,
            String name,
            String description,
            String productType,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            Long inactiveStatus,
            String metadataUrl,
            String signingCertificate,
            String redirectUrl) {
        super(
                id,
                compartmentId,
                name,
                description,
                productType,
                timeCreated,
                lifecycleState,
                inactiveStatus);
        this.metadataUrl = metadataUrl;
        this.signingCertificate = signingCertificate;
        this.redirectUrl = redirectUrl;
    }

    /**
     * The URL for retrieving the identity provider's metadata, which
     * contains information required for federating.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataUrl")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 512)
    String metadataUrl;

    /**
     * The identity provider's signing certificate used by the IAM Service
     * to validate the SAML2 token.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signingCertificate")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 10000)
    String signingCertificate;

    /**
     * The URL to redirect federated users to for authentication with the
     * identity provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 512)
    String redirectUrl;
}
