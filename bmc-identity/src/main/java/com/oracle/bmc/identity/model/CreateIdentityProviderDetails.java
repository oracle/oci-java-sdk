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
@NonFinal
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "protocol",
    defaultImpl = CreateIdentityProviderDetails.class
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CreateSaml2IdentityProviderDetails.class, name = "SAML2")
})
public class CreateIdentityProviderDetails {

    /**
     * The OCID of your tenancy.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    String compartmentId;

    /**
     * The name you assign to the `IdentityProvider` during creation.
     * The name must be unique across all `IdentityProvider` objects in the
     * tenancy and cannot be changed.
     *
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    @Size(min = 1, max = 100)
    String name;

    /**
     * The description you assign to the `IdentityProvider` during creation.
     * Does not have to be unique, and it's changeable.
     *
     **/
    @JsonProperty("description")
    @Valid
    @NotNull
    @Size(min = 1, max = 400)
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
        private static Map<String, ProductType> map;

        static {
            map = new HashMap<>();
            for (ProductType v : ProductType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ProductType(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
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
    @JsonProperty("productType")
    @Valid
    @NotNull
    ProductType productType;
}
