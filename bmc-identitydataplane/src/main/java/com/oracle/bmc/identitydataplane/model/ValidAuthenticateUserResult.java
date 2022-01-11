/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ValidAuthenticateUserResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ValidAuthenticateUserResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tenantInput")
        private String tenantInput;

        public Builder tenantInput(String tenantInput) {
            this.tenantInput = tenantInput;
            this.__explicitlySet__.add("tenantInput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userInput")
        private String userInput;

        public Builder userInput(String userInput) {
            this.userInput = userInput;
            this.__explicitlySet__.add("userInput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resolvedPrincipal")
        private AuthenticationPrincipal resolvedPrincipal;

        public Builder resolvedPrincipal(AuthenticationPrincipal resolvedPrincipal) {
            this.resolvedPrincipal = resolvedPrincipal;
            this.__explicitlySet__.add("resolvedPrincipal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidAuthenticateUserResult build() {
            ValidAuthenticateUserResult __instance__ =
                    new ValidAuthenticateUserResult(tenantInput, userInput, resolvedPrincipal);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidAuthenticateUserResult o) {
            Builder copiedBuilder =
                    tenantInput(o.getTenantInput())
                            .userInput(o.getUserInput())
                            .resolvedPrincipal(o.getResolvedPrincipal());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The tenant name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantInput")
    String tenantInput;

    /**
     * The user name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userInput")
    String userInput;

    /**
     * The resolved principal.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resolvedPrincipal")
    AuthenticationPrincipal resolvedPrincipal;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
