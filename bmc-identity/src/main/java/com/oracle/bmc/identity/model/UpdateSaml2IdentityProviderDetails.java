/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateSaml2IdentityProviderDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "protocol")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSaml2IdentityProviderDetails extends UpdateIdentityProviderDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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
         * The URL for retrieving the identity provider's metadata, which contains information
         * required for federating.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metadataUrl")
        private String metadataUrl;

        /**
         * The URL for retrieving the identity provider's metadata, which contains information
         * required for federating.
         *
         * @param metadataUrl the value to set
         * @return this builder
         */
        public Builder metadataUrl(String metadataUrl) {
            this.metadataUrl = metadataUrl;
            this.__explicitlySet__.add("metadataUrl");
            return this;
        }
        /** The XML that contains the information required for federating. */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private String metadata;

        /**
         * The XML that contains the information required for federating.
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * Extra name value pairs associated with this identity provider. Example: {@code
         * {"clientId": "app_sf3kdjf3"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformAttributes")
        private java.util.Map<String, String> freeformAttributes;

        /**
         * Extra name value pairs associated with this identity provider. Example: {@code
         * {"clientId": "app_sf3kdjf3"}}
         *
         * @param freeformAttributes the value to set
         * @return this builder
         */
        public Builder freeformAttributes(java.util.Map<String, String> freeformAttributes) {
            this.freeformAttributes = freeformAttributes;
            this.__explicitlySet__.add("freeformAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSaml2IdentityProviderDetails build() {
            UpdateSaml2IdentityProviderDetails model =
                    new UpdateSaml2IdentityProviderDetails(
                            this.description,
                            this.freeformTags,
                            this.definedTags,
                            this.metadataUrl,
                            this.metadata,
                            this.freeformAttributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSaml2IdentityProviderDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
            if (model.wasPropertyExplicitlySet("freeformAttributes")) {
                this.freeformAttributes(model.getFreeformAttributes());
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
    public UpdateSaml2IdentityProviderDetails(
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String metadataUrl,
            String metadata,
            java.util.Map<String, String> freeformAttributes) {
        super(description, freeformTags, definedTags);
        this.metadataUrl = metadataUrl;
        this.metadata = metadata;
        this.freeformAttributes = freeformAttributes;
    }

    /**
     * The URL for retrieving the identity provider's metadata, which contains information required
     * for federating.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadataUrl")
    private final String metadataUrl;

    /**
     * The URL for retrieving the identity provider's metadata, which contains information required
     * for federating.
     *
     * @return the value
     */
    public String getMetadataUrl() {
        return metadataUrl;
    }

    /** The XML that contains the information required for federating. */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final String metadata;

    /**
     * The XML that contains the information required for federating.
     *
     * @return the value
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * Extra name value pairs associated with this identity provider. Example: {@code {"clientId":
     * "app_sf3kdjf3"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformAttributes")
    private final java.util.Map<String, String> freeformAttributes;

    /**
     * Extra name value pairs associated with this identity provider. Example: {@code {"clientId":
     * "app_sf3kdjf3"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformAttributes() {
        return freeformAttributes;
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
        sb.append("UpdateSaml2IdentityProviderDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", metadataUrl=").append(String.valueOf(this.metadataUrl));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", freeformAttributes=").append(String.valueOf(this.freeformAttributes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSaml2IdentityProviderDetails)) {
            return false;
        }

        UpdateSaml2IdentityProviderDetails other = (UpdateSaml2IdentityProviderDetails) o;
        return java.util.Objects.equals(this.metadataUrl, other.metadataUrl)
                && java.util.Objects.equals(this.metadata, other.metadata)
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
                        + (this.freeformAttributes == null
                                ? 43
                                : this.freeformAttributes.hashCode());
        return result;
    }
}
