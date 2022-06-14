/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Send the request to a mock backend.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StockResponseBackend.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StockResponseBackend extends ApiSpecificationRouteBackend {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The body of the stock response from the mock backend.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("body")
        private String body;

        /**
         * The body of the stock response from the mock backend.
         * @param body the value to set
         * @return this builder
         **/
        public Builder body(String body) {
            this.body = body;
            this.__explicitlySet__.add("body");
            return this;
        }
        /**
         * The status code of the stock response from the mock backend.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Integer status;

        /**
         * The status code of the stock response from the mock backend.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Integer status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The headers of the stock response from the mock backend.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("headers")
        private java.util.List<HeaderFieldSpecification> headers;

        /**
         * The headers of the stock response from the mock backend.
         * @param headers the value to set
         * @return this builder
         **/
        public Builder headers(java.util.List<HeaderFieldSpecification> headers) {
            this.headers = headers;
            this.__explicitlySet__.add("headers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StockResponseBackend build() {
            StockResponseBackend __instance__ = new StockResponseBackend(body, status, headers);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StockResponseBackend o) {
            Builder copiedBuilder = body(o.getBody()).status(o.getStatus()).headers(o.getHeaders());

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

    @Deprecated
    public StockResponseBackend(
            String body, Integer status, java.util.List<HeaderFieldSpecification> headers) {
        super();
        this.body = body;
        this.status = status;
        this.headers = headers;
    }

    /**
     * The body of the stock response from the mock backend.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("body")
    private final String body;

    /**
     * The body of the stock response from the mock backend.
     * @return the value
     **/
    public String getBody() {
        return body;
    }

    /**
     * The status code of the stock response from the mock backend.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Integer status;

    /**
     * The status code of the stock response from the mock backend.
     * @return the value
     **/
    public Integer getStatus() {
        return status;
    }

    /**
     * The headers of the stock response from the mock backend.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    private final java.util.List<HeaderFieldSpecification> headers;

    /**
     * The headers of the stock response from the mock backend.
     * @return the value
     **/
    public java.util.List<HeaderFieldSpecification> getHeaders() {
        return headers;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StockResponseBackend(");
        sb.append("super=").append(super.toString());
        sb.append(", body=").append(String.valueOf(this.body));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", headers=").append(String.valueOf(this.headers));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StockResponseBackend)) {
            return false;
        }

        StockResponseBackend other = (StockResponseBackend) o;
        return java.util.Objects.equals(this.body, other.body)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.headers, other.headers)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.body == null ? 43 : this.body.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.headers == null ? 43 : this.headers.hashCode());
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
