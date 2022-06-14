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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourcePrincipalSessionTokenRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourcePrincipalSessionTokenRequest {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourcePrincipalToken",
        "servicePrincipalSessionToken",
        "sessionPublicKey"
    })
    public ResourcePrincipalSessionTokenRequest(
            String resourcePrincipalToken,
            String servicePrincipalSessionToken,
            String sessionPublicKey) {
        super();
        this.resourcePrincipalToken = resourcePrincipalToken;
        this.servicePrincipalSessionToken = servicePrincipalSessionToken;
        this.sessionPublicKey = sessionPublicKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The resource principal token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourcePrincipalToken")
        private String resourcePrincipalToken;

        /**
         * The resource principal token.
         * @param resourcePrincipalToken the value to set
         * @return this builder
         **/
        public Builder resourcePrincipalToken(String resourcePrincipalToken) {
            this.resourcePrincipalToken = resourcePrincipalToken;
            this.__explicitlySet__.add("resourcePrincipalToken");
            return this;
        }
        /**
         * The service principal session token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("servicePrincipalSessionToken")
        private String servicePrincipalSessionToken;

        /**
         * The service principal session token.
         * @param servicePrincipalSessionToken the value to set
         * @return this builder
         **/
        public Builder servicePrincipalSessionToken(String servicePrincipalSessionToken) {
            this.servicePrincipalSessionToken = servicePrincipalSessionToken;
            this.__explicitlySet__.add("servicePrincipalSessionToken");
            return this;
        }
        /**
         * The session public key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sessionPublicKey")
        private String sessionPublicKey;

        /**
         * The session public key.
         * @param sessionPublicKey the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The resource principal token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourcePrincipalToken")
    private final String resourcePrincipalToken;

    /**
     * The resource principal token.
     * @return the value
     **/
    public String getResourcePrincipalToken() {
        return resourcePrincipalToken;
    }

    /**
     * The service principal session token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("servicePrincipalSessionToken")
    private final String servicePrincipalSessionToken;

    /**
     * The service principal session token.
     * @return the value
     **/
    public String getServicePrincipalSessionToken() {
        return servicePrincipalSessionToken;
    }

    /**
     * The session public key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sessionPublicKey")
    private final String sessionPublicKey;

    /**
     * The session public key.
     * @return the value
     **/
    public String getSessionPublicKey() {
        return sessionPublicKey;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResourcePrincipalSessionTokenRequest(");
        sb.append("resourcePrincipalToken=").append(String.valueOf(this.resourcePrincipalToken));
        sb.append(", servicePrincipalSessionToken=")
                .append(String.valueOf(this.servicePrincipalSessionToken));
        sb.append(", sessionPublicKey=").append(String.valueOf(this.sessionPublicKey));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourcePrincipalSessionTokenRequest)) {
            return false;
        }

        ResourcePrincipalSessionTokenRequest other = (ResourcePrincipalSessionTokenRequest) o;
        return java.util.Objects.equals(this.resourcePrincipalToken, other.resourcePrincipalToken)
                && java.util.Objects.equals(
                        this.servicePrincipalSessionToken, other.servicePrincipalSessionToken)
                && java.util.Objects.equals(this.sessionPublicKey, other.sessionPublicKey)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.resourcePrincipalToken == null
                                ? 43
                                : this.resourcePrincipalToken.hashCode());
        result =
                (result * PRIME)
                        + (this.servicePrincipalSessionToken == null
                                ? 43
                                : this.servicePrincipalSessionToken.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionPublicKey == null ? 43 : this.sessionPublicKey.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
