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
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateSaml2IdentityProviderDetails extends UpdateIdentityProviderDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadataUrl")
        private String metadataUrl;

        public Builder metadataUrl(String metadataUrl) {
            this.metadataUrl = metadataUrl;
            this.__explicitlySet__.add("metadataUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private String metadata;

        public Builder metadata(String metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSaml2IdentityProviderDetails build() {
            UpdateSaml2IdentityProviderDetails __instance__ =
                    new UpdateSaml2IdentityProviderDetails(description, metadataUrl, metadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
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
    String metadataUrl;

    /**
     * The XML that contains the information required for federating.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    String metadata;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
