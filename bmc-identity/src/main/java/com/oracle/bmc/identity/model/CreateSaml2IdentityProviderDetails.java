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

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CreateSaml2IdentityProviderDetails.Builder.class)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protocol")
public class CreateSaml2IdentityProviderDetails extends CreateIdentityProviderDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("name")
        private String name;

        @JsonProperty("description")
        private String description;

        @JsonProperty("productType")
        private ProductType productType;

        @JsonProperty("metadataUrl")
        private String metadataUrl;

        @JsonProperty("metadata")
        private String metadata;

        public CreateSaml2IdentityProviderDetails build() {
            return new CreateSaml2IdentityProviderDetails(
                    compartmentId, name, description, productType, metadataUrl, metadata);
        }

        @JsonIgnore
        public Builder copy(CreateSaml2IdentityProviderDetails o) {
            return compartmentId(o.getCompartmentId())
                    .name(o.getName())
                    .description(o.getDescription())
                    .productType(o.getProductType())
                    .metadataUrl(o.getMetadataUrl())
                    .metadata(o.getMetadata());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public CreateSaml2IdentityProviderDetails(
            String compartmentId,
            String name,
            String description,
            ProductType productType,
            String metadataUrl,
            String metadata) {
        super(compartmentId, name, description, productType);
        this.metadataUrl = metadataUrl;
        this.metadata = metadata;
    }

    /**
     * The URL for retrieving the identity provider's metadata,
     * which contains information required for federating.
     *
     **/
    @JsonProperty("metadataUrl")
    @Valid
    @NotNull
    @Size(min = 1, max = 512)
    String metadataUrl;

    /**
     * The XML that contains the information required for federating.
     *
     **/
    @JsonProperty("metadata")
    @Valid
    @NotNull
    @Size(min = 1, max = 100000)
    String metadata;
}
