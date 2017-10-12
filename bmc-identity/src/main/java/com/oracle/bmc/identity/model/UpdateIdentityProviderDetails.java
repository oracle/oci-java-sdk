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
    defaultImpl = UpdateIdentityProviderDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateSaml2IdentityProviderDetails.class,
        name = "SAML2"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateIdentityProviderDetails {

    /**
     * The description you assign to the `IdentityProvider`. Does not have to
     * be unique, and it's changeable.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;
}
