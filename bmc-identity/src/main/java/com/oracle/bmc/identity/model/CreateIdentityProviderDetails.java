/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@lombok.experimental.NonFinal
@lombok.AllArgsConstructor(access = lombok.AccessLevel.PROTECTED)
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
public class CreateIdentityProviderDetails {

    /**
     * The OCID of your tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String compartmentId;

    /**
     * The name you assign to the `IdentityProvider` during creation.
     * The name must be unique across all `IdentityProvider` objects in the
     * tenancy and cannot be changed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 100)
    String name;

    /**
     * The description you assign to the `IdentityProvider` during creation.
     * Does not have to be unique, and it's changeable.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 400)
    String description;
    /**
     * The identity provider service or product (e.g., Oracle Identity Cloud Service).
     * <p>
     * Example: `IDCS`
     *
     **/
    public enum ProductType {
        Idcs("IDCS"),
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
            throw new RuntimeException("Invalid ProductType: " + key);
        }
    };
    /**
     * The identity provider service or product (e.g., Oracle Identity Cloud Service).
     * <p>
     * Example: `IDCS`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productType")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    ProductType productType;
}
