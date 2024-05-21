/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Clients MAY execute queries without passing parameters on the URL by using the HTTP POST verb combined with the **.search** path extension. The inclusion of **.search** on the end of a valid SCIM endpoint SHALL be used to indicate the HTTP POST verb is intended to be a query operation. To create a new query result set, a SCIM client sends an HTTP POST request to the desired SCIM resource endpoint (ending in **.search**). The body of the POST request MAY include any of the parameters.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UserAttributesSettingsSearchRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UserAttributesSettingsSearchRequest
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"schemas", "attributes", "attributeSets"})
    public UserAttributesSettingsSearchRequest(
            java.util.List<String> schemas,
            java.util.List<String> attributes,
            java.util.List<AttributeSets> attributeSets) {
        super();
        this.schemas = schemas;
        this.attributes = attributes;
        this.attributeSets = attributeSets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The schemas attribute is an array of Strings which allows introspection of the supported schema version for a SCIM representation as well any schema extensions supported by that representation. Each String value must be a unique URI. Query requests MUST be identified using the following URI: "urn:ietf:params:scim:api:messages:2.0:SearchRequest" REQUIRED.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schemas")
        private java.util.List<String> schemas;

        /**
         * The schemas attribute is an array of Strings which allows introspection of the supported schema version for a SCIM representation as well any schema extensions supported by that representation. Each String value must be a unique URI. Query requests MUST be identified using the following URI: "urn:ietf:params:scim:api:messages:2.0:SearchRequest" REQUIRED.
         * @param schemas the value to set
         * @return this builder
         **/
        public Builder schemas(java.util.List<String> schemas) {
            this.schemas = schemas;
            this.__explicitlySet__.add("schemas");
            return this;
        }
        /**
         * A multi-valued list of strings indicating the names of resource attributes to return in the response overriding the set of attributes that would be returned by default. Attribute names MUST be in standard attribute notation ([Section 3.10](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.10)) form. See ([additional retrieval query parameters](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.9)). OPTIONAL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private java.util.List<String> attributes;

        /**
         * A multi-valued list of strings indicating the names of resource attributes to return in the response overriding the set of attributes that would be returned by default. Attribute names MUST be in standard attribute notation ([Section 3.10](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.10)) form. See ([additional retrieval query parameters](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.9)). OPTIONAL.
         * @param attributes the value to set
         * @return this builder
         **/
        public Builder attributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            this.__explicitlySet__.add("attributes");
            return this;
        }
        /**
         * A multi-valued list of strings indicating the return type of attribute definition. The specified set of attributes can be fetched by the return type of the attribute. One or more values can be given together to fetch more than one group of attributes. If "attributes" query parameter is also available, union of the two is fetched. Valid values : all, always, never, request, default. Values are case-insensitive. OPTIONAL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributeSets")
        private java.util.List<AttributeSets> attributeSets;

        /**
         * A multi-valued list of strings indicating the return type of attribute definition. The specified set of attributes can be fetched by the return type of the attribute. One or more values can be given together to fetch more than one group of attributes. If "attributes" query parameter is also available, union of the two is fetched. Valid values : all, always, never, request, default. Values are case-insensitive. OPTIONAL.
         * @param attributeSets the value to set
         * @return this builder
         **/
        public Builder attributeSets(java.util.List<AttributeSets> attributeSets) {
            this.attributeSets = attributeSets;
            this.__explicitlySet__.add("attributeSets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserAttributesSettingsSearchRequest build() {
            UserAttributesSettingsSearchRequest model =
                    new UserAttributesSettingsSearchRequest(
                            this.schemas, this.attributes, this.attributeSets);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserAttributesSettingsSearchRequest model) {
            if (model.wasPropertyExplicitlySet("schemas")) {
                this.schemas(model.getSchemas());
            }
            if (model.wasPropertyExplicitlySet("attributes")) {
                this.attributes(model.getAttributes());
            }
            if (model.wasPropertyExplicitlySet("attributeSets")) {
                this.attributeSets(model.getAttributeSets());
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

    /**
     * The schemas attribute is an array of Strings which allows introspection of the supported schema version for a SCIM representation as well any schema extensions supported by that representation. Each String value must be a unique URI. Query requests MUST be identified using the following URI: "urn:ietf:params:scim:api:messages:2.0:SearchRequest" REQUIRED.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemas")
    private final java.util.List<String> schemas;

    /**
     * The schemas attribute is an array of Strings which allows introspection of the supported schema version for a SCIM representation as well any schema extensions supported by that representation. Each String value must be a unique URI. Query requests MUST be identified using the following URI: "urn:ietf:params:scim:api:messages:2.0:SearchRequest" REQUIRED.
     * @return the value
     **/
    public java.util.List<String> getSchemas() {
        return schemas;
    }

    /**
     * A multi-valued list of strings indicating the names of resource attributes to return in the response overriding the set of attributes that would be returned by default. Attribute names MUST be in standard attribute notation ([Section 3.10](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.10)) form. See ([additional retrieval query parameters](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.9)). OPTIONAL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    private final java.util.List<String> attributes;

    /**
     * A multi-valued list of strings indicating the names of resource attributes to return in the response overriding the set of attributes that would be returned by default. Attribute names MUST be in standard attribute notation ([Section 3.10](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.10)) form. See ([additional retrieval query parameters](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.9)). OPTIONAL.
     * @return the value
     **/
    public java.util.List<String> getAttributes() {
        return attributes;
    }

    /**
     * A multi-valued list of strings indicating the return type of attribute definition. The specified set of attributes can be fetched by the return type of the attribute. One or more values can be given together to fetch more than one group of attributes. If "attributes" query parameter is also available, union of the two is fetched. Valid values : all, always, never, request, default. Values are case-insensitive. OPTIONAL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeSets")
    private final java.util.List<AttributeSets> attributeSets;

    /**
     * A multi-valued list of strings indicating the return type of attribute definition. The specified set of attributes can be fetched by the return type of the attribute. One or more values can be given together to fetch more than one group of attributes. If "attributes" query parameter is also available, union of the two is fetched. Valid values : all, always, never, request, default. Values are case-insensitive. OPTIONAL.
     * @return the value
     **/
    public java.util.List<AttributeSets> getAttributeSets() {
        return attributeSets;
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
        sb.append("UserAttributesSettingsSearchRequest(");
        sb.append("super=").append(super.toString());
        sb.append("schemas=").append(String.valueOf(this.schemas));
        sb.append(", attributes=").append(String.valueOf(this.attributes));
        sb.append(", attributeSets=").append(String.valueOf(this.attributeSets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserAttributesSettingsSearchRequest)) {
            return false;
        }

        UserAttributesSettingsSearchRequest other = (UserAttributesSettingsSearchRequest) o;
        return java.util.Objects.equals(this.schemas, other.schemas)
                && java.util.Objects.equals(this.attributes, other.attributes)
                && java.util.Objects.equals(this.attributeSets, other.attributeSets)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schemas == null ? 43 : this.schemas.hashCode());
        result = (result * PRIME) + (this.attributes == null ? 43 : this.attributes.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeSets == null ? 43 : this.attributeSets.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
