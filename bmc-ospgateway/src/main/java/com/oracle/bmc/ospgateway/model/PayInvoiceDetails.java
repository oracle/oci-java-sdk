/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Request object for invoice payment <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PayInvoiceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PayInvoiceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Language code */
        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private String languageCode;

        /**
         * Language code
         *
         * @param languageCode the value to set
         * @return this builder
         */
        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }
        /** Callback URL */
        @com.fasterxml.jackson.annotation.JsonProperty("returnUrl")
        private String returnUrl;

        /**
         * Callback URL
         *
         * @param returnUrl the value to set
         * @return this builder
         */
        public Builder returnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            this.__explicitlySet__.add("returnUrl");
            return this;
        }
        /** User email */
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        /**
         * User email
         *
         * @param email the value to set
         * @return this builder
         */
        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PayInvoiceDetails build() {
            PayInvoiceDetails model =
                    new PayInvoiceDetails(this.languageCode, this.returnUrl, this.email);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PayInvoiceDetails model) {
            if (model.wasPropertyExplicitlySet("languageCode")) {
                this.languageCode(model.getLanguageCode());
            }
            if (model.wasPropertyExplicitlySet("returnUrl")) {
                this.returnUrl(model.getReturnUrl());
            }
            if (model.wasPropertyExplicitlySet("email")) {
                this.email(model.getEmail());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Language code */
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final String languageCode;

    /**
     * Language code
     *
     * @return the value
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /** Callback URL */
    @com.fasterxml.jackson.annotation.JsonProperty("returnUrl")
    private final String returnUrl;

    /**
     * Callback URL
     *
     * @return the value
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /** User email */
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private final String email;

    /**
     * User email
     *
     * @return the value
     */
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PayInvoiceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("languageCode=").append(String.valueOf(this.languageCode));
        sb.append(", returnUrl=").append(String.valueOf(this.returnUrl));
        sb.append(", email=").append(String.valueOf(this.email));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
        result = (result * PRIME) + (this.returnUrl == null ? 43 : this.returnUrl.hashCode());
        result = (result * PRIME) + (this.email == null ? 43 : this.email.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
