/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Invoice payment action response
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
    builder = PayInvoiceReceipt.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PayInvoiceReceipt {
    @Deprecated
    @java.beans.ConstructorProperties({"url", "headerId", "token"})
    public PayInvoiceReceipt(String url, String headerId, String token) {
        super();
        this.url = url;
        this.headerId = headerId;
        this.token = token;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Url of the Payment Service
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * Url of the Payment Service
         * @param url the value to set
         * @return this builder
         **/
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /**
         * Payment header id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("headerId")
        private String headerId;

        /**
         * Payment header id
         * @param headerId the value to set
         * @return this builder
         **/
        public Builder headerId(String headerId) {
            this.headerId = headerId;
            this.__explicitlySet__.add("headerId");
            return this;
        }
        /**
         * Token created for Payment Service
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("token")
        private String token;

        /**
         * Token created for Payment Service
         * @param token the value to set
         * @return this builder
         **/
        public Builder token(String token) {
            this.token = token;
            this.__explicitlySet__.add("token");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PayInvoiceReceipt build() {
            PayInvoiceReceipt __instance__ = new PayInvoiceReceipt(url, headerId, token);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PayInvoiceReceipt o) {
            Builder copiedBuilder = url(o.getUrl()).headerId(o.getHeaderId()).token(o.getToken());

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
     * Url of the Payment Service
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * Url of the Payment Service
     * @return the value
     **/
    public String getUrl() {
        return url;
    }

    /**
     * Payment header id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headerId")
    private final String headerId;

    /**
     * Payment header id
     * @return the value
     **/
    public String getHeaderId() {
        return headerId;
    }

    /**
     * Token created for Payment Service
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("token")
    private final String token;

    /**
     * Token created for Payment Service
     * @return the value
     **/
    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PayInvoiceReceipt(");
        sb.append("url=").append(String.valueOf(this.url));
        sb.append(", headerId=").append(String.valueOf(this.headerId));
        sb.append(", token=").append(String.valueOf(this.token));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PayInvoiceReceipt)) {
            return false;
        }

        PayInvoiceReceipt other = (PayInvoiceReceipt) o;
        return java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.headerId, other.headerId)
                && java.util.Objects.equals(this.token, other.token)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.headerId == null ? 43 : this.headerId.hashCode());
        result = (result * PRIME) + (this.token == null ? 43 : this.token.hashCode());
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
