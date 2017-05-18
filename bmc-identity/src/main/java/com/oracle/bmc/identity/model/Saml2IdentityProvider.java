/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * A special type of {@link IdentityProvider} that
 * supports the SAML 2.0 protocol. For more information, see
 * [Identity Providers and Federation](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/federation.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = Saml2IdentityProvider.Builder.class)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protocol")
public class Saml2IdentityProvider extends IdentityProvider {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("id")
        private String id;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("name")
        private String name;

        @JsonProperty("description")
        private String description;

        @JsonProperty("productType")
        private String productType;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("inactiveStatus")
        private Long inactiveStatus;

        @JsonProperty("metadataUrl")
        private String metadataUrl;

        @JsonProperty("signingCertificate")
        private String signingCertificate;

        @JsonProperty("redirectUrl")
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

        @JsonIgnore
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
            Date timeCreated,
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
    @JsonProperty("metadataUrl")
    @Valid
    @NotNull
    @Size(min = 1, max = 512)
    String metadataUrl;

    /**
     * The identity provider's signing certificate used by the IAM Service
     * to validate the SAML2 token.
     *
     **/
    @JsonProperty("signingCertificate")
    @Valid
    @NotNull
    @Size(min = 1, max = 10000)
    String signingCertificate;

    /**
     * The URL to redirect federated users to for authentication with the
     * identity provider.
     *
     **/
    @JsonProperty("redirectUrl")
    @Valid
    @NotNull
    @Size(min = 1, max = 512)
    String redirectUrl;
}
