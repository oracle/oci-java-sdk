/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
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
@JsonDeserialize(builder = UpdatePolicyDetails.Builder.class)
public class UpdatePolicyDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("description")
        private String description;

        @JsonProperty("statements")
        private List<String> statements;

        @JsonProperty("versionDate")
        private Date versionDate;

        public UpdatePolicyDetails build() {
            return new UpdatePolicyDetails(description, statements, versionDate);
        }

        @JsonIgnore
        public Builder copy(UpdatePolicyDetails o) {
            return description(o.getDescription())
                    .statements(o.getStatements())
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
     * The description you assign to the policy. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("description")
    @Size(min = 1, max = 400)
    String description;

    /**
     * An array of policy statements written in the policy language. See
     * [How Policies Work](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policies.htm) and
     * [Common Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/commonpolicies.htm).
     *
     **/
    @JsonProperty("statements")
    List<String> statements;

    /**
     * The version of the policy. If null or set to an empty string, when a request comes in for authorization, the
     * policy will be evaluated according to the current behavior of the services at that moment. If set to a particular
     * date (YYYY-MM-DD), the policy will be evaluated according to the behavior of the services on that date.
     *
     **/
    @JsonProperty("versionDate")
    Date versionDate;
}
