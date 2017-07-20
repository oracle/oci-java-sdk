/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * The credentials for a particular instance.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceCredentials.Builder.class
)
public class InstanceCredentials {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        public InstanceCredentials build() {
            return new InstanceCredentials(password, username);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceCredentials o) {
            return password(o.getPassword()).username(o.getUsername());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The password for the username.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String password;

    /**
     * The username.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String username;
}
