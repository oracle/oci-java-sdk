/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Subscription payment authorization response
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AuthorizeSubscriptionPaymentReceipt.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AuthorizeSubscriptionPaymentReceipt {
    @Deprecated
    @java.beans.ConstructorProperties({"headerId", "apiToken", "userToken"})
    public AuthorizeSubscriptionPaymentReceipt(String headerId, String apiToken, String userToken) {
        super();
        this.headerId = headerId;
        this.apiToken = apiToken;
        this.userToken = userToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("headerId")
        private String headerId;

        public Builder headerId(String headerId) {
            this.headerId = headerId;
            this.__explicitlySet__.add("headerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("apiToken")
        private String apiToken;

        public Builder apiToken(String apiToken) {
            this.apiToken = apiToken;
            this.__explicitlySet__.add("apiToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userToken")
        private String userToken;

        public Builder userToken(String userToken) {
            this.userToken = userToken;
            this.__explicitlySet__.add("userToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthorizeSubscriptionPaymentReceipt build() {
            AuthorizeSubscriptionPaymentReceipt __instance__ =
                    new AuthorizeSubscriptionPaymentReceipt(headerId, apiToken, userToken);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthorizeSubscriptionPaymentReceipt o) {
            Builder copiedBuilder =
                    headerId(o.getHeaderId()).apiToken(o.getApiToken()).userToken(o.getUserToken());

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
     * Payment header id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headerId")
    private final String headerId;

    public String getHeaderId() {
        return headerId;
    }

    /**
     * Parameters in a token for Payment Service
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("apiToken")
    private final String apiToken;

    public String getApiToken() {
        return apiToken;
    }

    /**
     * Session token created for Payment Service
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userToken")
    private final String userToken;

    public String getUserToken() {
        return userToken;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AuthorizeSubscriptionPaymentReceipt(");
        sb.append("headerId=").append(String.valueOf(this.headerId));
        sb.append(", apiToken=").append(String.valueOf(this.apiToken));
        sb.append(", userToken=").append(String.valueOf(this.userToken));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthorizeSubscriptionPaymentReceipt)) {
            return false;
        }

        AuthorizeSubscriptionPaymentReceipt other = (AuthorizeSubscriptionPaymentReceipt) o;
        return java.util.Objects.equals(this.headerId, other.headerId)
                && java.util.Objects.equals(this.apiToken, other.apiToken)
                && java.util.Objects.equals(this.userToken, other.userToken)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.headerId == null ? 43 : this.headerId.hashCode());
        result = (result * PRIME) + (this.apiToken == null ? 43 : this.apiToken.hashCode());
        result = (result * PRIME) + (this.userToken == null ? 43 : this.userToken.hashCode());
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
