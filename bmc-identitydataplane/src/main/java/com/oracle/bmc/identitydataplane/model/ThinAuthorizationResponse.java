/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
public final class ThinAuthorizationResponse
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        /**
         * The policy string related to the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authorizationRequest")
        private AuthorizationRequest authorizationRequest;

        /**
         * The policy string related to the request.
         * @param authorizationRequest the value to set
         * @return this builder
         **/
        public Builder authorizationRequest(AuthorizationRequest authorizationRequest) {
            this.authorizationRequest = authorizationRequest;
            this.__explicitlySet__.add("authorizationRequest");
            return this;
        }
        /**
         * The duration of how long this decision should be cached. Note that the type is of type java.time.Duration, not
         * string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("decisionCacheDuration")
        private String decisionCacheDuration;

        /**
         * The duration of how long this decision should be cached. Note that the type is of type java.time.Duration, not
         * string.
         *
         * @param decisionCacheDuration the value to set
         * @return this builder
         **/
        public Builder decisionCacheDuration(String decisionCacheDuration) {
            this.decisionCacheDuration = decisionCacheDuration;
            this.__explicitlySet__.add("decisionCacheDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ThinAuthorizationResponse build() {
            ThinAuthorizationResponse model =
                    new ThinAuthorizationResponse(
                            this.authorizationRequest, this.decisionCacheDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ThinAuthorizationResponse model) {
            if (model.wasPropertyExplicitlySet("authorizationRequest")) {
                this.authorizationRequest(model.getAuthorizationRequest());
            }
            if (model.wasPropertyExplicitlySet("decisionCacheDuration")) {
                this.decisionCacheDuration(model.getDecisionCacheDuration());
            }
            return this;
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

    /**
     * The policy string related to the request.
     * @return the value
     **/
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

    /**
     * The duration of how long this decision should be cached. Note that the type is of type java.time.Duration, not
     * string.
     *
     * @return the value
     **/
    public String getDecisionCacheDuration() {
        return decisionCacheDuration;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ThinAuthorizationResponse(");
        sb.append("super=").append(super.toString());
        sb.append("authorizationRequest=").append(String.valueOf(this.authorizationRequest));
        sb.append(", decisionCacheDuration=").append(String.valueOf(this.decisionCacheDuration));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
