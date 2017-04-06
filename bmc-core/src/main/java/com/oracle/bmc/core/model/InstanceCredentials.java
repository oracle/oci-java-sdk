/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * The credentials for a particular instance.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = InstanceCredentials.Builder.class)
public class InstanceCredentials {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("password")
        private String password;

        @JsonProperty("username")
        private String username;

        public InstanceCredentials build() {
            return new InstanceCredentials(password, username);
        }

        @JsonIgnore
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
    @JsonProperty("password")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String password;

    /**
     * The username.
     **/
    @JsonProperty("username")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String username;
}
