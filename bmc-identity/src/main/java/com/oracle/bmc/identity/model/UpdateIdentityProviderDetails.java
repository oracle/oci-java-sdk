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
    defaultImpl = UpdateIdentityProviderDetails.class
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = UpdateSaml2IdentityProviderDetails.class, name = "SAML2")
})
public class UpdateIdentityProviderDetails {

    /**
     * The description you assign to the `IdentityProvider`. Does not have to
     * be unique, and it's changeable.
     *
     **/
    @JsonProperty("description")
    @Size(min = 1, max = 400)
    String description;
}
