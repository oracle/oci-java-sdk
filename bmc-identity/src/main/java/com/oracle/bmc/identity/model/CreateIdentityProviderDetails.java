/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "protocol",
    defaultImpl = CreateIdentityProviderDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateSaml2IdentityProviderDetails.class,
        name = "SAML2"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateIdentityProviderDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "name",
        "description",
        "productType",
        "freeformTags",
        "definedTags"
    })
    protected CreateIdentityProviderDetails(
            String compartmentId,
            String name,
            String description,
            ProductType productType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.name = name;
        this.description = description;
        this.productType = productType;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    /**
     * The OCID of your tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of your tenancy.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name you assign to the {@code IdentityProvider} during creation.
     * The name must be unique across all {@code IdentityProvider} objects in the
     * tenancy and cannot be changed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name you assign to the {@code IdentityProvider} during creation.
     * The name must be unique across all {@code IdentityProvider} objects in the
     * tenancy and cannot be changed.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The description you assign to the {@code IdentityProvider} during creation.
     * Does not have to be unique, and it's changeable.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description you assign to the {@code IdentityProvider} during creation.
     * Does not have to be unique, and it's changeable.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The identity provider service or product.
     * Supported identity providers are Oracle Identity Cloud Service (IDCS) and Microsoft
     * Active Directory Federation Services (ADFS).
     * <p>
     * Example: {@code IDCS}
     *
     **/
    public enum ProductType {
        Idcs("IDCS"),
        Adfs("ADFS"),
        ;

        private final String value;
        private static java.util.Map<String, ProductType> map;

        static {
            map = new java.util.HashMap<>();
            for (ProductType v : ProductType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ProductType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProductType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ProductType: " + key);
        }
    };
    /**
     * The identity provider service or product.
     * Supported identity providers are Oracle Identity Cloud Service (IDCS) and Microsoft
     * Active Directory Federation Services (ADFS).
     * <p>
     * Example: {@code IDCS}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productType")
    private final ProductType productType;

    /**
     * The identity provider service or product.
     * Supported identity providers are Oracle Identity Cloud Service (IDCS) and Microsoft
     * Active Directory Federation Services (ADFS).
     * <p>
     * Example: {@code IDCS}
     *
     * @return the value
     **/
    public ProductType getProductType() {
        return productType;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateIdentityProviderDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", productType=").append(String.valueOf(this.productType));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateIdentityProviderDetails)) {
            return false;
        }

        CreateIdentityProviderDetails other = (CreateIdentityProviderDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.productType, other.productType)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.productType == null ? 43 : this.productType.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The protocol used for federation.
     * <p>
     * Example: {@code SAML2}
     *
     **/
    public enum Protocol {
        Saml2("SAML2"),
        Adfs("ADFS"),
        ;

        private final String value;
        private static java.util.Map<String, Protocol> map;

        static {
            map = new java.util.HashMap<>();
            for (Protocol v : Protocol.values()) {
                map.put(v.getValue(), v);
            }
        }

        Protocol(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Protocol create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Protocol: " + key);
        }
    };
}
