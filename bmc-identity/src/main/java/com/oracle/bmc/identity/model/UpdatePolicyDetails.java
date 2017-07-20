/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdatePolicyDetails.Builder.class
)
public class UpdatePolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        @com.fasterxml.jackson.annotation.JsonProperty("statements")
        private java.util.List<String> statements;

        @com.fasterxml.jackson.annotation.JsonProperty("versionDate")
        private java.util.Date versionDate;

        public UpdatePolicyDetails build() {
            return new UpdatePolicyDetails(description, statements, versionDate);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    @javax.validation.constraints.Size(min = 1, max = 400)
    String description;

    /**
     * An array of policy statements written in the policy language. See
     * [How Policies Work](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policies.htm) and
     * [Common Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/commonpolicies.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statements")
    java.util.List<String> statements;

    /**
     * The version of the policy. If null or set to an empty string, when a request comes in for authorization, the
     * policy will be evaluated according to the current behavior of the services at that moment. If set to a particular
     * date (YYYY-MM-DD), the policy will be evaluated according to the behavior of the services on that date.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionDate")
    java.util.Date versionDate;
}
