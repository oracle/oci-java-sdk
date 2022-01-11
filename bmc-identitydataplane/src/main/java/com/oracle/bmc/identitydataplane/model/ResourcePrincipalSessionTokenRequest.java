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
    builder = ResourcePrincipalSessionTokenRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ResourcePrincipalSessionTokenRequest {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("resourcePrincipalToken")
        private String resourcePrincipalToken;

        public Builder resourcePrincipalToken(String resourcePrincipalToken) {
            this.resourcePrincipalToken = resourcePrincipalToken;
            this.__explicitlySet__.add("resourcePrincipalToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("servicePrincipalSessionToken")
        private String servicePrincipalSessionToken;

        public Builder servicePrincipalSessionToken(String servicePrincipalSessionToken) {
            this.servicePrincipalSessionToken = servicePrincipalSessionToken;
            this.__explicitlySet__.add("servicePrincipalSessionToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sessionPublicKey")
        private String sessionPublicKey;

        public Builder sessionPublicKey(String sessionPublicKey) {
            this.sessionPublicKey = sessionPublicKey;
            this.__explicitlySet__.add("sessionPublicKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourcePrincipalSessionTokenRequest build() {
            ResourcePrincipalSessionTokenRequest __instance__ =
                    new ResourcePrincipalSessionTokenRequest(
                            resourcePrincipalToken, servicePrincipalSessionToken, sessionPublicKey);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourcePrincipalSessionTokenRequest o) {
            Builder copiedBuilder =
                    resourcePrincipalToken(o.getResourcePrincipalToken())
                            .servicePrincipalSessionToken(o.getServicePrincipalSessionToken())
                            .sessionPublicKey(o.getSessionPublicKey());

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
     * The resource principal token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourcePrincipalToken")
    String resourcePrincipalToken;

    /**
     * The service principal session token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("servicePrincipalSessionToken")
    String servicePrincipalSessionToken;

    /**
     * The session public key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sessionPublicKey")
    String sessionPublicKey;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
