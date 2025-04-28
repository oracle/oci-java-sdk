/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HttpRedirectTarget.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HttpRedirectTarget
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"protocol", "host", "port", "path", "query"})
    public HttpRedirectTarget(
            Protocol protocol, String host, Integer port, String path, String query) {
        super();
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.path = path;
        this.query = query;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The protocol used for the target, http or https. */
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        /**
         * The protocol used for the target, http or https.
         *
         * @param protocol the value to set
         * @return this builder
         */
        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /** The host portion of the redirect. */
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * The host portion of the redirect.
         *
         * @param host the value to set
         * @return this builder
         */
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /** Port number of the target destination of the redirect, default to match protocol */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Port number of the target destination of the redirect, default to match protocol
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * The path component of the target URL (e.g., "/path/to/resource" in
         * "https://target.example.com/path/to/resource?redirected"), which can be empty, static, or
         * request-copying, or request-prefixing. Use of \\ is not permitted except to escape a
         * following \\, {, or }. An empty value is treated the same as static "/". A static value
         * must begin with a leading "/", optionally followed by other path characters. A
         * request-copying value must exactly match "{path}", and will be replaced with the path
         * component of the request URL (including its initial "/"). A request-prefixing value must
         * start with "/" and end with a non-escaped "{path}", which will be replaced with the path
         * component of the request URL (including its initial "/"). Only one such replacement token
         * is allowed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * The path component of the target URL (e.g., "/path/to/resource" in
         * "https://target.example.com/path/to/resource?redirected"), which can be empty, static, or
         * request-copying, or request-prefixing. Use of \\ is not permitted except to escape a
         * following \\, {, or }. An empty value is treated the same as static "/". A static value
         * must begin with a leading "/", optionally followed by other path characters. A
         * request-copying value must exactly match "{path}", and will be replaced with the path
         * component of the request URL (including its initial "/"). A request-prefixing value must
         * start with "/" and end with a non-escaped "{path}", which will be replaced with the path
         * component of the request URL (including its initial "/"). Only one such replacement token
         * is allowed.
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * The query component of the target URL (e.g., "?redirected" in
         * "https://target.example.com/path/to/resource?redirected"), which can be empty, static, or
         * request-copying. Use of \\ is not permitted except to escape a following \\, {, or }. An
         * empty value results in a redirection target URL with no query component. A static value
         * must begin with a leading "?", optionally followed by other query characters. A
         * request-copying value must exactly match "{query}", and will be replaced with the query
         * component of the request URL (including a leading "?" if and only if the request URL
         * includes a query component).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * The query component of the target URL (e.g., "?redirected" in
         * "https://target.example.com/path/to/resource?redirected"), which can be empty, static, or
         * request-copying. Use of \\ is not permitted except to escape a following \\, {, or }. An
         * empty value results in a redirection target URL with no query component. A static value
         * must begin with a leading "?", optionally followed by other query characters. A
         * request-copying value must exactly match "{query}", and will be replaced with the query
         * component of the request URL (including a leading "?" if and only if the request URL
         * includes a query component).
         *
         * @param query the value to set
         * @return this builder
         */
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpRedirectTarget build() {
            HttpRedirectTarget model =
                    new HttpRedirectTarget(
                            this.protocol, this.host, this.port, this.path, this.query);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpRedirectTarget model) {
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
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

    /** The protocol used for the target, http or https. */
    public enum Protocol implements com.oracle.bmc.http.internal.BmcEnum {
        Http("HTTP"),
        Https("HTTPS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Protocol.class);

        private final String value;
        private static java.util.Map<String, Protocol> map;

        static {
            map = new java.util.HashMap<>();
            for (Protocol v : Protocol.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Protocol(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Protocol create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Protocol', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The protocol used for the target, http or https. */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final Protocol protocol;

    /**
     * The protocol used for the target, http or https.
     *
     * @return the value
     */
    public Protocol getProtocol() {
        return protocol;
    }

    /** The host portion of the redirect. */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * The host portion of the redirect.
     *
     * @return the value
     */
    public String getHost() {
        return host;
    }

    /** Port number of the target destination of the redirect, default to match protocol */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Port number of the target destination of the redirect, default to match protocol
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /**
     * The path component of the target URL (e.g., "/path/to/resource" in
     * "https://target.example.com/path/to/resource?redirected"), which can be empty, static, or
     * request-copying, or request-prefixing. Use of \\ is not permitted except to escape a
     * following \\, {, or }. An empty value is treated the same as static "/". A static value must
     * begin with a leading "/", optionally followed by other path characters. A request-copying
     * value must exactly match "{path}", and will be replaced with the path component of the
     * request URL (including its initial "/"). A request-prefixing value must start with "/" and
     * end with a non-escaped "{path}", which will be replaced with the path component of the
     * request URL (including its initial "/"). Only one such replacement token is allowed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * The path component of the target URL (e.g., "/path/to/resource" in
     * "https://target.example.com/path/to/resource?redirected"), which can be empty, static, or
     * request-copying, or request-prefixing. Use of \\ is not permitted except to escape a
     * following \\, {, or }. An empty value is treated the same as static "/". A static value must
     * begin with a leading "/", optionally followed by other path characters. A request-copying
     * value must exactly match "{path}", and will be replaced with the path component of the
     * request URL (including its initial "/"). A request-prefixing value must start with "/" and
     * end with a non-escaped "{path}", which will be replaced with the path component of the
     * request URL (including its initial "/"). Only one such replacement token is allowed.
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /**
     * The query component of the target URL (e.g., "?redirected" in
     * "https://target.example.com/path/to/resource?redirected"), which can be empty, static, or
     * request-copying. Use of \\ is not permitted except to escape a following \\, {, or }. An
     * empty value results in a redirection target URL with no query component. A static value must
     * begin with a leading "?", optionally followed by other query characters. A request-copying
     * value must exactly match "{query}", and will be replaced with the query component of the
     * request URL (including a leading "?" if and only if the request URL includes a query
     * component).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * The query component of the target URL (e.g., "?redirected" in
     * "https://target.example.com/path/to/resource?redirected"), which can be empty, static, or
     * request-copying. Use of \\ is not permitted except to escape a following \\, {, or }. An
     * empty value results in a redirection target URL with no query component. A static value must
     * begin with a leading "?", optionally followed by other query characters. A request-copying
     * value must exactly match "{query}", and will be replaced with the query component of the
     * request URL (including a leading "?" if and only if the request URL includes a query
     * component).
     *
     * @return the value
     */
    public String getQuery() {
        return query;
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
        sb.append("HttpRedirectTarget(");
        sb.append("super=").append(super.toString());
        sb.append("protocol=").append(String.valueOf(this.protocol));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpRedirectTarget)) {
            return false;
        }

        HttpRedirectTarget other = (HttpRedirectTarget) o;
        return java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.query, other.query)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
