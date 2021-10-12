/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * An object that represents an action which returns a defined HTTP response.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ReturnHttpResponseAction.Builder.class
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
public class ReturnHttpResponseAction extends Action {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private Integer code;

        public Builder code(Integer code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headers")
        private java.util.List<ResponseHeader> headers;

        public Builder headers(java.util.List<ResponseHeader> headers) {
            this.headers = headers;
            this.__explicitlySet__.add("headers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("body")
        private HttpResponseBody body;

        public Builder body(HttpResponseBody body) {
            this.body = body;
            this.__explicitlySet__.add("body");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReturnHttpResponseAction build() {
            ReturnHttpResponseAction __instance__ =
                    new ReturnHttpResponseAction(name, code, headers, body);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReturnHttpResponseAction o) {
            Builder copiedBuilder =
                    name(o.getName()).code(o.getCode()).headers(o.getHeaders()).body(o.getBody());

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
    public ReturnHttpResponseAction(
            String name,
            Integer code,
            java.util.List<ResponseHeader> headers,
            HttpResponseBody body) {
        super(name);
        this.code = code;
        this.headers = headers;
        this.body = body;
    }

    /**
     * Response code.
     * <p>
     * The following response codes are valid values for this property:
     * <p>
     * 2xx
     * <p>
     * 200 OK
     *   201 Created
     *   202 Accepted
     *   206 Partial Content
     * <p>
     * 3xx
     * <p>
     * 300 Multiple Choices
     *   301 Moved Permanently
     *   302 Found
     *   303 See Other
     *   307 Temporary Redirect
     * <p>
     * 4xx
     * <p>
     * 400 Bad Request
     *   401 Unauthorized
     *   403 Forbidden
     *   404 Not Found
     *   405 Method Not Allowed
     *   408 Request Timeout
     *   409 Conflict
     *   411 Length Required
     *   412 Precondition Failed
     *   413 Payload Too Large
     *   414 URI Too Long
     *   415 Unsupported Media Type
     *   416 Range Not Satisfiable
     *   422 Unprocessable Entity
     *   494 Request Header Too Large
     *   495 Cert Error
     *   496 No Cert
     *   497 HTTP to HTTPS
     * <p>
     * 5xx
     * <p>
     * 500 Internal Server Error
     *   501 Not Implemented
     *   502 Bad Gateway
     *   503 Service Unavailable
     *   504 Gateway Timeout
     *   507 Insufficient Storage
     * <p>
     * Example: {@code 200}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    Integer code;

    /**
     * Adds headers defined in this array for HTTP response.
     * <p>
     * Hop-by-hop headers are not allowed to be set:
     * <p>
     * Connection
     * * Keep-Alive
     * * Proxy-Authenticate
     * * Proxy-Authorization
     * * TE
     * * Trailer
     * * Transfer-Encoding
     * * Upgrade
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    java.util.List<ResponseHeader> headers;

    @com.fasterxml.jackson.annotation.JsonProperty("body")
    HttpResponseBody body;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
