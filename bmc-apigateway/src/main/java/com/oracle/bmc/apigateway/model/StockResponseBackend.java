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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StockResponseBackend.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class StockResponseBackend extends ApiSpecificationRouteBackend {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("body")
        private String body;

        public Builder body(String body) {
            this.body = body;
            this.__explicitlySet__.add("body");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Integer status;

        public Builder status(Integer status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headers")
        private java.util.List<HeaderFieldSpecification> headers;

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
    String body;

    /**
     * The status code of the stock response from the mock backend.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Integer status;

    /**
     * The headers of the stock response from the mock backend.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    java.util.List<HeaderFieldSpecification> headers;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
