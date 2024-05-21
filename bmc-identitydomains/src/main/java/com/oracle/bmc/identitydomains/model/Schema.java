/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * SCIM schema
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Schema.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Schema extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "schemas",
        "idcsMapsToSameTargetAttributeNameAs",
        "externalId",
        "name",
        "idcsResourceTypes",
        "description",
        "idcsMappable",
        "idcsAttributeCacheable",
        "idcsOverrideCommonAttribute",
        "attributes"
    })
    public Schema(
            java.util.List<String> schemas,
            String idcsMapsToSameTargetAttributeNameAs,
            String externalId,
            String name,
            java.util.List<String> idcsResourceTypes,
            String description,
            Boolean idcsMappable,
            Boolean idcsAttributeCacheable,
            Boolean idcsOverrideCommonAttribute,
            java.util.List<SchemaAttributes> attributes) {
        super();
        this.schemas = schemas;
        this.idcsMapsToSameTargetAttributeNameAs = idcsMapsToSameTargetAttributeNameAs;
        this.externalId = externalId;
        this.name = name;
        this.idcsResourceTypes = idcsResourceTypes;
        this.description = description;
        this.idcsMappable = idcsMappable;
        this.idcsAttributeCacheable = idcsAttributeCacheable;
        this.idcsOverrideCommonAttribute = idcsOverrideCommonAttribute;
        this.attributes = attributes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the supported schema version for a SCIM representation as well any schema extensions supported by that representation. Each String value must be a unique URI. This specification defines URIs for User, Group, and a standard \\"enterprise\\" extension. All representations of SCIM schema MUST include a non-zero value array with value(s) of the URIs supported by that representation. Duplicate values MUST NOT be included. Value order is not specified and MUST not impact behavior.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schemas")
        private java.util.List<String> schemas;

        /**
         * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the supported schema version for a SCIM representation as well any schema extensions supported by that representation. Each String value must be a unique URI. This specification defines URIs for User, Group, and a standard \\"enterprise\\" extension. All representations of SCIM schema MUST include a non-zero value array with value(s) of the URIs supported by that representation. Duplicate values MUST NOT be included. Value order is not specified and MUST not impact behavior.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param schemas the value to set
         * @return this builder
         **/
        public Builder schemas(java.util.List<String> schemas) {
            this.schemas = schemas;
            this.__explicitlySet__.add("schemas");
            return this;
        }
        /**
         * Contains the canonical name of the other attribute sharing the same idcsTargetAttributeName
         * <p>
         **Added In:** 2209122038
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMapsToSameTargetAttributeNameAs")
        private String idcsMapsToSameTargetAttributeNameAs;

        /**
         * Contains the canonical name of the other attribute sharing the same idcsTargetAttributeName
         * <p>
         **Added In:** 2209122038
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         * @param idcsMapsToSameTargetAttributeNameAs the value to set
         * @return this builder
         **/
        public Builder idcsMapsToSameTargetAttributeNameAs(
                String idcsMapsToSameTargetAttributeNameAs) {
            this.idcsMapsToSameTargetAttributeNameAs = idcsMapsToSameTargetAttributeNameAs;
            this.__explicitlySet__.add("idcsMapsToSameTargetAttributeNameAs");
            return this;
        }
        /**
         * An identifier for the Resource as defined by the Service Consumer. The externalId may simplify identification of the Resource between Service Consumer and Service Provider by allowing the Consumer to refer to the Resource with its own identifier, obviating the need to store a local mapping between the local identifier of the Resource and the identifier used by the Service Provider. Each Resource MAY include a non-empty externalId value. The value of the externalId attribute is always issued by the Service Consumer and can never be specified by the Service Provider. The Service Provider MUST always interpret the externalId as scoped to the Service Consumer's tenant.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalId")
        private String externalId;

        /**
         * An identifier for the Resource as defined by the Service Consumer. The externalId may simplify identification of the Resource between Service Consumer and Service Provider by allowing the Consumer to refer to the Resource with its own identifier, obviating the need to store a local mapping between the local identifier of the Resource and the identifier used by the Service Provider. Each Resource MAY include a non-empty externalId value. The value of the externalId attribute is always issued by the Service Consumer and can never be specified by the Service Provider. The Service Provider MUST always interpret the externalId as scoped to the Service Consumer's tenant.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param externalId the value to set
         * @return this builder
         **/
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            this.__explicitlySet__.add("externalId");
            return this;
        }
        /**
         * Schema's human-readable name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Schema's human-readable name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Resource types defs this resource refers to
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsResourceTypes")
        private java.util.List<String> idcsResourceTypes;

        /**
         * Resource types defs this resource refers to
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsResourceTypes the value to set
         * @return this builder
         **/
        public Builder idcsResourceTypes(java.util.List<String> idcsResourceTypes) {
            this.idcsResourceTypes = idcsResourceTypes;
            this.__explicitlySet__.add("idcsResourceTypes");
            return this;
        }
        /**
         * Schema's human-readable description
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Schema's human-readable description
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Specifies if the attributes in this schema can be used for mapping with external identity sources such as AD or LDAP
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMappable")
        private Boolean idcsMappable;

        /**
         * Specifies if the attributes in this schema can be used for mapping with external identity sources such as AD or LDAP
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param idcsMappable the value to set
         * @return this builder
         **/
        public Builder idcsMappable(Boolean idcsMappable) {
            this.idcsMappable = idcsMappable;
            this.__explicitlySet__.add("idcsMappable");
            return this;
        }
        /**
         * Specifies whether the attribute is cacheable. True by default for all attributes. If attribute with idcsAttributeCachable = false, is present \\"attributesToGet\\" while executing GET/SEARCH on cacheable resource, Cache is missed and data is fetched from Data Provider.
         * <p>
         **Added In:** 17.3.4
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAttributeCacheable")
        private Boolean idcsAttributeCacheable;

        /**
         * Specifies whether the attribute is cacheable. True by default for all attributes. If attribute with idcsAttributeCachable = false, is present \\"attributesToGet\\" while executing GET/SEARCH on cacheable resource, Cache is missed and data is fetched from Data Provider.
         * <p>
         **Added In:** 17.3.4
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsAttributeCacheable the value to set
         * @return this builder
         **/
        public Builder idcsAttributeCacheable(Boolean idcsAttributeCacheable) {
            this.idcsAttributeCacheable = idcsAttributeCacheable;
            this.__explicitlySet__.add("idcsAttributeCacheable");
            return this;
        }
        /**
         * Specifies whether the dataprovider mapping from resource schema should override from common schema with the same name.
         * <p>
         **Added In:** 2102181953
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsOverrideCommonAttribute")
        private Boolean idcsOverrideCommonAttribute;

        /**
         * Specifies whether the dataprovider mapping from resource schema should override from common schema with the same name.
         * <p>
         **Added In:** 2102181953
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsOverrideCommonAttribute the value to set
         * @return this builder
         **/
        public Builder idcsOverrideCommonAttribute(Boolean idcsOverrideCommonAttribute) {
            this.idcsOverrideCommonAttribute = idcsOverrideCommonAttribute;
            this.__explicitlySet__.add("idcsOverrideCommonAttribute");
            return this;
        }
        /**
         * A complex type that specifies the set of Resource attributes
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: []
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private java.util.List<SchemaAttributes> attributes;

        /**
         * A complex type that specifies the set of Resource attributes
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: []
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         * @param attributes the value to set
         * @return this builder
         **/
        public Builder attributes(java.util.List<SchemaAttributes> attributes) {
            this.attributes = attributes;
            this.__explicitlySet__.add("attributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Schema build() {
            Schema model =
                    new Schema(
                            this.schemas,
                            this.idcsMapsToSameTargetAttributeNameAs,
                            this.externalId,
                            this.name,
                            this.idcsResourceTypes,
                            this.description,
                            this.idcsMappable,
                            this.idcsAttributeCacheable,
                            this.idcsOverrideCommonAttribute,
                            this.attributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Schema model) {
            if (model.wasPropertyExplicitlySet("schemas")) {
                this.schemas(model.getSchemas());
            }
            if (model.wasPropertyExplicitlySet("idcsMapsToSameTargetAttributeNameAs")) {
                this.idcsMapsToSameTargetAttributeNameAs(
                        model.getIdcsMapsToSameTargetAttributeNameAs());
            }
            if (model.wasPropertyExplicitlySet("externalId")) {
                this.externalId(model.getExternalId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("idcsResourceTypes")) {
                this.idcsResourceTypes(model.getIdcsResourceTypes());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("idcsMappable")) {
                this.idcsMappable(model.getIdcsMappable());
            }
            if (model.wasPropertyExplicitlySet("idcsAttributeCacheable")) {
                this.idcsAttributeCacheable(model.getIdcsAttributeCacheable());
            }
            if (model.wasPropertyExplicitlySet("idcsOverrideCommonAttribute")) {
                this.idcsOverrideCommonAttribute(model.getIdcsOverrideCommonAttribute());
            }
            if (model.wasPropertyExplicitlySet("attributes")) {
                this.attributes(model.getAttributes());
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
     * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the supported schema version for a SCIM representation as well any schema extensions supported by that representation. Each String value must be a unique URI. This specification defines URIs for User, Group, and a standard \\"enterprise\\" extension. All representations of SCIM schema MUST include a non-zero value array with value(s) of the URIs supported by that representation. Duplicate values MUST NOT be included. Value order is not specified and MUST not impact behavior.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemas")
    private final java.util.List<String> schemas;

    /**
     * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the supported schema version for a SCIM representation as well any schema extensions supported by that representation. Each String value must be a unique URI. This specification defines URIs for User, Group, and a standard \\"enterprise\\" extension. All representations of SCIM schema MUST include a non-zero value array with value(s) of the URIs supported by that representation. Duplicate values MUST NOT be included. Value order is not specified and MUST not impact behavior.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<String> getSchemas() {
        return schemas;
    }

    /**
     * Contains the canonical name of the other attribute sharing the same idcsTargetAttributeName
     * <p>
     **Added In:** 2209122038
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMapsToSameTargetAttributeNameAs")
    private final String idcsMapsToSameTargetAttributeNameAs;

    /**
     * Contains the canonical name of the other attribute sharing the same idcsTargetAttributeName
     * <p>
     **Added In:** 2209122038
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsMapsToSameTargetAttributeNameAs() {
        return idcsMapsToSameTargetAttributeNameAs;
    }

    /**
     * An identifier for the Resource as defined by the Service Consumer. The externalId may simplify identification of the Resource between Service Consumer and Service Provider by allowing the Consumer to refer to the Resource with its own identifier, obviating the need to store a local mapping between the local identifier of the Resource and the identifier used by the Service Provider. Each Resource MAY include a non-empty externalId value. The value of the externalId attribute is always issued by the Service Consumer and can never be specified by the Service Provider. The Service Provider MUST always interpret the externalId as scoped to the Service Consumer's tenant.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalId")
    private final String externalId;

    /**
     * An identifier for the Resource as defined by the Service Consumer. The externalId may simplify identification of the Resource between Service Consumer and Service Provider by allowing the Consumer to refer to the Resource with its own identifier, obviating the need to store a local mapping between the local identifier of the Resource and the identifier used by the Service Provider. Each Resource MAY include a non-empty externalId value. The value of the externalId attribute is always issued by the Service Consumer and can never be specified by the Service Provider. The Service Provider MUST always interpret the externalId as scoped to the Service Consumer's tenant.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getExternalId() {
        return externalId;
    }

    /**
     * Schema's human-readable name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Schema's human-readable name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Resource types defs this resource refers to
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsResourceTypes")
    private final java.util.List<String> idcsResourceTypes;

    /**
     * Resource types defs this resource refers to
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<String> getIdcsResourceTypes() {
        return idcsResourceTypes;
    }

    /**
     * Schema's human-readable description
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Schema's human-readable description
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Specifies if the attributes in this schema can be used for mapping with external identity sources such as AD or LDAP
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMappable")
    private final Boolean idcsMappable;

    /**
     * Specifies if the attributes in this schema can be used for mapping with external identity sources such as AD or LDAP
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIdcsMappable() {
        return idcsMappable;
    }

    /**
     * Specifies whether the attribute is cacheable. True by default for all attributes. If attribute with idcsAttributeCachable = false, is present \\"attributesToGet\\" while executing GET/SEARCH on cacheable resource, Cache is missed and data is fetched from Data Provider.
     * <p>
     **Added In:** 17.3.4
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAttributeCacheable")
    private final Boolean idcsAttributeCacheable;

    /**
     * Specifies whether the attribute is cacheable. True by default for all attributes. If attribute with idcsAttributeCachable = false, is present \\"attributesToGet\\" while executing GET/SEARCH on cacheable resource, Cache is missed and data is fetched from Data Provider.
     * <p>
     **Added In:** 17.3.4
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsAttributeCacheable() {
        return idcsAttributeCacheable;
    }

    /**
     * Specifies whether the dataprovider mapping from resource schema should override from common schema with the same name.
     * <p>
     **Added In:** 2102181953
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsOverrideCommonAttribute")
    private final Boolean idcsOverrideCommonAttribute;

    /**
     * Specifies whether the dataprovider mapping from resource schema should override from common schema with the same name.
     * <p>
     **Added In:** 2102181953
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsOverrideCommonAttribute() {
        return idcsOverrideCommonAttribute;
    }

    /**
     * A complex type that specifies the set of Resource attributes
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: []
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    private final java.util.List<SchemaAttributes> attributes;

    /**
     * A complex type that specifies the set of Resource attributes
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: []
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     * @return the value
     **/
    public java.util.List<SchemaAttributes> getAttributes() {
        return attributes;
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
        sb.append("Schema(");
        sb.append("super=").append(super.toString());
        sb.append("schemas=").append(String.valueOf(this.schemas));
        sb.append(", idcsMapsToSameTargetAttributeNameAs=")
                .append(String.valueOf(this.idcsMapsToSameTargetAttributeNameAs));
        sb.append(", externalId=").append(String.valueOf(this.externalId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", idcsResourceTypes=").append(String.valueOf(this.idcsResourceTypes));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", idcsMappable=").append(String.valueOf(this.idcsMappable));
        sb.append(", idcsAttributeCacheable=").append(String.valueOf(this.idcsAttributeCacheable));
        sb.append(", idcsOverrideCommonAttribute=")
                .append(String.valueOf(this.idcsOverrideCommonAttribute));
        sb.append(", attributes=").append(String.valueOf(this.attributes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Schema)) {
            return false;
        }

        Schema other = (Schema) o;
        return java.util.Objects.equals(this.schemas, other.schemas)
                && java.util.Objects.equals(
                        this.idcsMapsToSameTargetAttributeNameAs,
                        other.idcsMapsToSameTargetAttributeNameAs)
                && java.util.Objects.equals(this.externalId, other.externalId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.idcsResourceTypes, other.idcsResourceTypes)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.idcsMappable, other.idcsMappable)
                && java.util.Objects.equals(
                        this.idcsAttributeCacheable, other.idcsAttributeCacheable)
                && java.util.Objects.equals(
                        this.idcsOverrideCommonAttribute, other.idcsOverrideCommonAttribute)
                && java.util.Objects.equals(this.attributes, other.attributes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schemas == null ? 43 : this.schemas.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsMapsToSameTargetAttributeNameAs == null
                                ? 43
                                : this.idcsMapsToSameTargetAttributeNameAs.hashCode());
        result = (result * PRIME) + (this.externalId == null ? 43 : this.externalId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsResourceTypes == null ? 43 : this.idcsResourceTypes.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.idcsMappable == null ? 43 : this.idcsMappable.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsAttributeCacheable == null
                                ? 43
                                : this.idcsAttributeCacheable.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsOverrideCommonAttribute == null
                                ? 43
                                : this.idcsOverrideCommonAttribute.hashCode());
        result = (result * PRIME) + (this.attributes == null ? 43 : this.attributes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
