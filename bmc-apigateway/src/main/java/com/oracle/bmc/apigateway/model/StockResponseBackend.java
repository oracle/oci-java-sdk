/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
            StockResponseBackend model =
                    new StockResponseBackend(this.body, this.status, this.headers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StockResponseBackend model) {
            if (model.wasPropertyExplicitlySet("body")) {
                this.body(model.getBody());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("headers")) {
                this.headers(model.getHeaders());
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
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StockResponseBackend(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", body=").append(String.valueOf(this.body));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", headers=").append(String.valueOf(this.headers));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.body == null ? 43 : this.body.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.headers == null ? 43 : this.headers.hashCode());
        return result;
    }
}
