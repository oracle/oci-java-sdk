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
@JsonDeserialize(builder = UpdateSaml2IdentityProviderDetails.Builder.class)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protocol")
public class UpdateSaml2IdentityProviderDetails extends UpdateIdentityProviderDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("description")
        private String description;

        @JsonProperty("metadataUrl")
        private String metadataUrl;

        @JsonProperty("metadata")
        private String metadata;

        public UpdateSaml2IdentityProviderDetails build() {
            return new UpdateSaml2IdentityProviderDetails(description, metadataUrl, metadata);
        }

        @JsonIgnore
        public Builder copy(UpdateSaml2IdentityProviderDetails o) {
            return description(o.getDescription())
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

    public UpdateSaml2IdentityProviderDetails(
            String description, String metadataUrl, String metadata) {
        super(description);
        this.metadataUrl = metadataUrl;
        this.metadata = metadata;
    }

    /**
     * The URL for retrieving the identity provider's metadata,
     * which contains information required for federating.
     *
     **/
    @JsonProperty("metadataUrl")
    @Size(min = 1, max = 512)
    String metadataUrl;

    /**
     * The XML that contains the information required for federating.
     *
     **/
    @JsonProperty("metadata")
    @Size(min = 1, max = 100000)
    String metadata;
}
