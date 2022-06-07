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
    builder = ThinAuthorizationResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ThinAuthorizationResponse {
    @Deprecated
    @java.beans.ConstructorProperties({"authorizationRequest", "decisionCacheDuration"})
    public ThinAuthorizationResponse(
            AuthorizationRequest authorizationRequest, String decisionCacheDuration) {
        super();
        this.authorizationRequest = authorizationRequest;
        this.decisionCacheDuration = decisionCacheDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("authorizationRequest")
        private AuthorizationRequest authorizationRequest;

        public Builder authorizationRequest(AuthorizationRequest authorizationRequest) {
            this.authorizationRequest = authorizationRequest;
            this.__explicitlySet__.add("authorizationRequest");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("decisionCacheDuration")
        private String decisionCacheDuration;

        public Builder decisionCacheDuration(String decisionCacheDuration) {
            this.decisionCacheDuration = decisionCacheDuration;
            this.__explicitlySet__.add("decisionCacheDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ThinAuthorizationResponse build() {
            ThinAuthorizationResponse __instance__ =
                    new ThinAuthorizationResponse(authorizationRequest, decisionCacheDuration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ThinAuthorizationResponse o) {
            Builder copiedBuilder =
                    authorizationRequest(o.getAuthorizationRequest())
                            .decisionCacheDuration(o.getDecisionCacheDuration());

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
     * The policy string related to the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationRequest")
    private final AuthorizationRequest authorizationRequest;

    public AuthorizationRequest getAuthorizationRequest() {
        return authorizationRequest;
    }

    /**
     * The duration of how long this decision should be cached. Note that the type is of type java.time.Duration, not
     * string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("decisionCacheDuration")
    private final String decisionCacheDuration;

    public String getDecisionCacheDuration() {
        return decisionCacheDuration;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ThinAuthorizationResponse(");
        sb.append("authorizationRequest=").append(String.valueOf(this.authorizationRequest));
        sb.append(", decisionCacheDuration=").append(String.valueOf(this.decisionCacheDuration));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ThinAuthorizationResponse)) {
            return false;
        }

        ThinAuthorizationResponse other = (ThinAuthorizationResponse) o;
        return java.util.Objects.equals(this.authorizationRequest, other.authorizationRequest)
                && java.util.Objects.equals(this.decisionCacheDuration, other.decisionCacheDuration)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.authorizationRequest == null
                                ? 43
                                : this.authorizationRequest.hashCode());
        result =
                (result * PRIME)
                        + (this.decisionCacheDuration == null
                                ? 43
                                : this.decisionCacheDuration.hashCode());
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
