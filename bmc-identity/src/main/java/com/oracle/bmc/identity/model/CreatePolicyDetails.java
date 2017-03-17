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
@JsonDeserialize(builder = CreatePolicyDetails.Builder.class)
public class CreatePolicyDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("name")
        private String name;

        @JsonProperty("statements")
        private List<String> statements;

        @JsonProperty("description")
        private String description;

        @JsonProperty("versionDate")
        private Date versionDate;

        public CreatePolicyDetails build() {
            return new CreatePolicyDetails(
                    compartmentId, name, statements, description, versionDate);
        }

        @JsonIgnore
        public Builder copy(CreatePolicyDetails o) {
            return compartmentId(o.getCompartmentId())
                    .name(o.getName())
                    .statements(o.getStatements())
                    .description(o.getDescription())
                    .versionDate(o.getVersionDate());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the compartment containing the policy (either the tenancy or another compartment).
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    String compartmentId;

    /**
     * The name you assign to the policy during creation. The name must be unique across all policies
     * in the tenancy and cannot be changed.
     *
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    @Size(min = 1, max = 100)
    String name;

    /**
     * An array of policy statements written in the policy language. See
     * [How Policies Work](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policies.htm) and
     * [Common Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/commonpolicies.htm).
     *
     **/
    @JsonProperty("statements")
    @Valid
    @NotNull
    List<String> statements;

    /**
     * The description you assign to the policy during creation. Does not have to be unique, and it's changeable.
     *
     **/
    @JsonProperty("description")
    @Valid
    @NotNull
    @Size(min = 1, max = 400)
    String description;

    /**
     * The version of the policy. If null or set to an empty string, when a request comes in for authorization, the
     * policy will be evaluated according to the current behavior of the services at that moment. If set to a particular
     * date (YYYY-MM-DD), the policy will be evaluated according to the behavior of the services on that date.
     *
     **/
    @JsonProperty("versionDate")
    Date versionDate;
}
