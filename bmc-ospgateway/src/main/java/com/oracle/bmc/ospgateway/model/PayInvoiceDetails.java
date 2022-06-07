/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Request object for invoice payment
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
    builder = PayInvoiceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PayInvoiceDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"languageCode", "returnUrl", "email"})
    public PayInvoiceDetails(String languageCode, String returnUrl, String email) {
        super();
        this.languageCode = languageCode;
        this.returnUrl = returnUrl;
        this.email = email;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private String languageCode;

        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("returnUrl")
        private String returnUrl;

        public Builder returnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            this.__explicitlySet__.add("returnUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PayInvoiceDetails build() {
            PayInvoiceDetails __instance__ = new PayInvoiceDetails(languageCode, returnUrl, email);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PayInvoiceDetails o) {
            Builder copiedBuilder =
                    languageCode(o.getLanguageCode())
                            .returnUrl(o.getReturnUrl())
                            .email(o.getEmail());

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
     * Language code
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final String languageCode;

    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Callback URL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("returnUrl")
    private final String returnUrl;

    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * User email
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private final String email;

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PayInvoiceDetails(");
        sb.append("languageCode=").append(String.valueOf(this.languageCode));
        sb.append(", returnUrl=").append(String.valueOf(this.returnUrl));
        sb.append(", email=").append(String.valueOf(this.email));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PayInvoiceDetails)) {
            return false;
        }

        PayInvoiceDetails other = (PayInvoiceDetails) o;
        return java.util.Objects.equals(this.languageCode, other.languageCode)
                && java.util.Objects.equals(this.returnUrl, other.returnUrl)
                && java.util.Objects.equals(this.email, other.email)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
        result = (result * PRIME) + (this.returnUrl == null ? 43 : this.returnUrl.hashCode());
        result = (result * PRIME) + (this.email == null ? 43 : this.email.hashCode());
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
