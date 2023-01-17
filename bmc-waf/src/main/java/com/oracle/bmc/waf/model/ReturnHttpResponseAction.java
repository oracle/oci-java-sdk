/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * An object that represents an action which returns a defined HTTP response. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ReturnHttpResponseAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ReturnHttpResponseAction extends Action {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Response code.
         *
         * <p>The following response codes are valid values for this property:
         *
         * <p>2xx
         *
         * <p>200 OK 201 Created 202 Accepted 206 Partial Content
         *
         * <p>3xx
         *
         * <p>300 Multiple Choices 301 Moved Permanently 302 Found 303 See Other 307 Temporary
         * Redirect
         *
         * <p>4xx
         *
         * <p>400 Bad Request 401 Unauthorized 403 Forbidden 404 Not Found 405 Method Not Allowed
         * 408 Request Timeout 409 Conflict 411 Length Required 412 Precondition Failed 413 Payload
         * Too Large 414 URI Too Long 415 Unsupported Media Type 416 Range Not Satisfiable 422
         * Unprocessable Entity 429 Too Many Requests 494 Request Header Too Large 495 Cert Error
         * 496 No Cert 497 HTTP to HTTPS
         *
         * <p>5xx
         *
         * <p>500 Internal Server Error 501 Not Implemented 502 Bad Gateway 503 Service Unavailable
         * 504 Gateway Timeout 507 Insufficient Storage
         *
         * <p>Example: {@code 200}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private Integer code;

        /**
         * Response code.
         *
         * <p>The following response codes are valid values for this property:
         *
         * <p>2xx
         *
         * <p>200 OK 201 Created 202 Accepted 206 Partial Content
         *
         * <p>3xx
         *
         * <p>300 Multiple Choices 301 Moved Permanently 302 Found 303 See Other 307 Temporary
         * Redirect
         *
         * <p>4xx
         *
         * <p>400 Bad Request 401 Unauthorized 403 Forbidden 404 Not Found 405 Method Not Allowed
         * 408 Request Timeout 409 Conflict 411 Length Required 412 Precondition Failed 413 Payload
         * Too Large 414 URI Too Long 415 Unsupported Media Type 416 Range Not Satisfiable 422
         * Unprocessable Entity 429 Too Many Requests 494 Request Header Too Large 495 Cert Error
         * 496 No Cert 497 HTTP to HTTPS
         *
         * <p>5xx
         *
         * <p>500 Internal Server Error 501 Not Implemented 502 Bad Gateway 503 Service Unavailable
         * 504 Gateway Timeout 507 Insufficient Storage
         *
         * <p>Example: {@code 200}
         *
         * @param code the value to set
         * @return this builder
         */
        public Builder code(Integer code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /**
         * Adds headers defined in this array for HTTP response.
         *
         * <p>Hop-by-hop headers are not allowed to be set:
         *
         * <p>Connection * Keep-Alive * Proxy-Authenticate * Proxy-Authorization * TE * Trailer *
         * Transfer-Encoding * Upgrade
         */
        @com.fasterxml.jackson.annotation.JsonProperty("headers")
        private java.util.List<ResponseHeader> headers;

        /**
         * Adds headers defined in this array for HTTP response.
         *
         * <p>Hop-by-hop headers are not allowed to be set:
         *
         * <p>Connection * Keep-Alive * Proxy-Authenticate * Proxy-Authorization * TE * Trailer *
         * Transfer-Encoding * Upgrade
         *
         * @param headers the value to set
         * @return this builder
         */
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
            ReturnHttpResponseAction model =
                    new ReturnHttpResponseAction(this.name, this.code, this.headers, this.body);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReturnHttpResponseAction model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("headers")) {
                this.headers(model.getHeaders());
            }
            if (model.wasPropertyExplicitlySet("body")) {
                this.body(model.getBody());
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
     *
     * <p>The following response codes are valid values for this property:
     *
     * <p>2xx
     *
     * <p>200 OK 201 Created 202 Accepted 206 Partial Content
     *
     * <p>3xx
     *
     * <p>300 Multiple Choices 301 Moved Permanently 302 Found 303 See Other 307 Temporary Redirect
     *
     * <p>4xx
     *
     * <p>400 Bad Request 401 Unauthorized 403 Forbidden 404 Not Found 405 Method Not Allowed 408
     * Request Timeout 409 Conflict 411 Length Required 412 Precondition Failed 413 Payload Too
     * Large 414 URI Too Long 415 Unsupported Media Type 416 Range Not Satisfiable 422 Unprocessable
     * Entity 429 Too Many Requests 494 Request Header Too Large 495 Cert Error 496 No Cert 497 HTTP
     * to HTTPS
     *
     * <p>5xx
     *
     * <p>500 Internal Server Error 501 Not Implemented 502 Bad Gateway 503 Service Unavailable 504
     * Gateway Timeout 507 Insufficient Storage
     *
     * <p>Example: {@code 200}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final Integer code;

    /**
     * Response code.
     *
     * <p>The following response codes are valid values for this property:
     *
     * <p>2xx
     *
     * <p>200 OK 201 Created 202 Accepted 206 Partial Content
     *
     * <p>3xx
     *
     * <p>300 Multiple Choices 301 Moved Permanently 302 Found 303 See Other 307 Temporary Redirect
     *
     * <p>4xx
     *
     * <p>400 Bad Request 401 Unauthorized 403 Forbidden 404 Not Found 405 Method Not Allowed 408
     * Request Timeout 409 Conflict 411 Length Required 412 Precondition Failed 413 Payload Too
     * Large 414 URI Too Long 415 Unsupported Media Type 416 Range Not Satisfiable 422 Unprocessable
     * Entity 429 Too Many Requests 494 Request Header Too Large 495 Cert Error 496 No Cert 497 HTTP
     * to HTTPS
     *
     * <p>5xx
     *
     * <p>500 Internal Server Error 501 Not Implemented 502 Bad Gateway 503 Service Unavailable 504
     * Gateway Timeout 507 Insufficient Storage
     *
     * <p>Example: {@code 200}
     *
     * @return the value
     */
    public Integer getCode() {
        return code;
    }

    /**
     * Adds headers defined in this array for HTTP response.
     *
     * <p>Hop-by-hop headers are not allowed to be set:
     *
     * <p>Connection * Keep-Alive * Proxy-Authenticate * Proxy-Authorization * TE * Trailer *
     * Transfer-Encoding * Upgrade
     */
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    private final java.util.List<ResponseHeader> headers;

    /**
     * Adds headers defined in this array for HTTP response.
     *
     * <p>Hop-by-hop headers are not allowed to be set:
     *
     * <p>Connection * Keep-Alive * Proxy-Authenticate * Proxy-Authorization * TE * Trailer *
     * Transfer-Encoding * Upgrade
     *
     * @return the value
     */
    public java.util.List<ResponseHeader> getHeaders() {
        return headers;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("body")
    private final HttpResponseBody body;

    public HttpResponseBody getBody() {
        return body;
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
        sb.append("ReturnHttpResponseAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", code=").append(String.valueOf(this.code));
        sb.append(", headers=").append(String.valueOf(this.headers));
        sb.append(", body=").append(String.valueOf(this.body));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReturnHttpResponseAction)) {
            return false;
        }

        ReturnHttpResponseAction other = (ReturnHttpResponseAction) o;
        return java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.headers, other.headers)
                && java.util.Objects.equals(this.body, other.body)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.headers == null ? 43 : this.headers.hashCode());
        result = (result * PRIME) + (this.body == null ? 43 : this.body.hashCode());
        return result;
    }
}
