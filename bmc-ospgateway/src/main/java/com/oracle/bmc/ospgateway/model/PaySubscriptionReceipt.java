/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Subscription payment action response <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PaySubscriptionReceipt.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class PaySubscriptionReceipt
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"headerId", "apiToken", "userToken"})
    public PaySubscriptionReceipt(String headerId, String apiToken, String userToken) {
        super();
        this.headerId = headerId;
        this.apiToken = apiToken;
        this.userToken = userToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Payment header id */
        @com.fasterxml.jackson.annotation.JsonProperty("headerId")
        private String headerId;

        /**
         * Payment header id
         *
         * @param headerId the value to set
         * @return this builder
         */
        public Builder headerId(String headerId) {
            this.headerId = headerId;
            this.__explicitlySet__.add("headerId");
            return this;
        }
        /** Parameters in a token for Payment Service */
        @com.fasterxml.jackson.annotation.JsonProperty("apiToken")
        private String apiToken;

        /**
         * Parameters in a token for Payment Service
         *
         * @param apiToken the value to set
         * @return this builder
         */
        public Builder apiToken(String apiToken) {
            this.apiToken = apiToken;
            this.__explicitlySet__.add("apiToken");
            return this;
        }
        /** Session token created for Payment Service */
        @com.fasterxml.jackson.annotation.JsonProperty("userToken")
        private String userToken;

        /**
         * Session token created for Payment Service
         *
         * @param userToken the value to set
         * @return this builder
         */
        public Builder userToken(String userToken) {
            this.userToken = userToken;
            this.__explicitlySet__.add("userToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PaySubscriptionReceipt build() {
            PaySubscriptionReceipt model =
                    new PaySubscriptionReceipt(this.headerId, this.apiToken, this.userToken);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PaySubscriptionReceipt model) {
            if (model.wasPropertyExplicitlySet("headerId")) {
                this.headerId(model.getHeaderId());
            }
            if (model.wasPropertyExplicitlySet("apiToken")) {
                this.apiToken(model.getApiToken());
            }
            if (model.wasPropertyExplicitlySet("userToken")) {
                this.userToken(model.getUserToken());
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

    /** Payment header id */
    @com.fasterxml.jackson.annotation.JsonProperty("headerId")
    private final String headerId;

    /**
     * Payment header id
     *
     * @return the value
     */
    public String getHeaderId() {
        return headerId;
    }

    /** Parameters in a token for Payment Service */
    @com.fasterxml.jackson.annotation.JsonProperty("apiToken")
    private final String apiToken;

    /**
     * Parameters in a token for Payment Service
     *
     * @return the value
     */
    public String getApiToken() {
        return apiToken;
    }

    /** Session token created for Payment Service */
    @com.fasterxml.jackson.annotation.JsonProperty("userToken")
    private final String userToken;

    /**
     * Session token created for Payment Service
     *
     * @return the value
     */
    public String getUserToken() {
        return userToken;
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
        sb.append("PaySubscriptionReceipt(");
        sb.append("super=").append(super.toString());
        sb.append("headerId=").append(String.valueOf(this.headerId));
        sb.append(", apiToken=").append(String.valueOf(this.apiToken));
        sb.append(", userToken=").append(String.valueOf(this.userToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PaySubscriptionReceipt)) {
            return false;
        }

        PaySubscriptionReceipt other = (PaySubscriptionReceipt) o;
        return java.util.Objects.equals(this.headerId, other.headerId)
                && java.util.Objects.equals(this.apiToken, other.apiToken)
                && java.util.Objects.equals(this.userToken, other.userToken)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.headerId == null ? 43 : this.headerId.hashCode());
        result = (result * PRIME) + (this.apiToken == null ? 43 : this.apiToken.hashCode());
        result = (result * PRIME) + (this.userToken == null ? 43 : this.userToken.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
