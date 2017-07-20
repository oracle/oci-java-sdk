/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateSaml2IdentityProviderDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "protocol"
)
public class UpdateSaml2IdentityProviderDetails extends UpdateIdentityProviderDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        @com.fasterxml.jackson.annotation.JsonProperty("metadataUrl")
        private String metadataUrl;

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private String metadata;

        public UpdateSaml2IdentityProviderDetails build() {
            return new UpdateSaml2IdentityProviderDetails(description, metadataUrl, metadata);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("metadataUrl")
    @javax.validation.constraints.Size(min = 1, max = 512)
    String metadataUrl;

    /**
     * The XML that contains the information required for federating.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @javax.validation.constraints.Size(min = 1, max = 100000)
    String metadata;
}
