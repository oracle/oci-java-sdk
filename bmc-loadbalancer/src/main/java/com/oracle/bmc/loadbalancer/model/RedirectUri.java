/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that defines the redirect URI applied to the original request. The object property
 * values compose the redirect URI.
 *
 * <p>*NOTE:** The Load Balancing service cannot automatically detect or avoid infinite redirects.
 * Be sure to provide meaningful, complete, and correct field values. If any component field of this
 * object has no value, the system retains the value from the incoming HTTP request URI.
 *
 * <p>For example, if you specify only the protocol field {@code https}, and the incoming request
 * URI is {@code http://example.com:8080}, the resulting runtime redirect URI is {@code
 * https://example.com:8080}. The system retains the host and port from the incoming URI and does
 * not automatically change the port setting from {@code 8080} to {@code 443}.
 *
 * <p>Be sure to configure valid percent-encoding (URL encoding) when needed.
 *
 * <p>In addition to static string values, you can use the following tokens to construct the
 * redirect URI. These tokens extract values from the incoming HTTP request URI.
 *
 * <p>{protocol} : The protocol from the incoming HTTP request URI. * {host} : The domain name from
 * the incoming HTTP request URI. * {port} : The port from the incoming HTTP request URI. * {path} :
 * The path from the incoming HTTP request URI. * {query} : The query string from the incoming HTTP
 * request URI.
 *
 * <p>The tokens are case sensitive. For example, {@code {host}} is a valid token, but {@code
 * {HOST}} is not.
 *
 * <p>You can retain the literal characters of a token when you specify values for the path and
 * query properties of the redirect URI. Use a backslash (\\\\) as the escape character for the
 * \\\\, {, and } characters. For example, if the incoming HTTP request URI is {@code /video}, the
 * path property value:
 *
 * <p>{@code /example{path}123\\{path\\}}
 *
 * <p>appears in the constructed redirect URI as:
 *
 * <p>{@code /example/video123{path}} <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RedirectUri.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class RedirectUri extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"protocol", "host", "port", "path", "query"})
    public RedirectUri(String protocol, String host, Integer port, String path, String query) {
        super();
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.path = path;
        this.query = query;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The HTTP protocol to use in the redirect URI.
         *
         * <p>When this value is null, not set, or set to {@code {protocol}}, the service preserves
         * the original protocol from the incoming HTTP request URI. Allowed values are:
         *
         * <p>HTTP * HTTPS * {protocol}
         *
         * <p>{@code {protocol}} is the only valid token for this property. It can appear only once
         * in the value string.
         *
         * <p>Example: {@code HTTPS}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        /**
         * The HTTP protocol to use in the redirect URI.
         *
         * <p>When this value is null, not set, or set to {@code {protocol}}, the service preserves
         * the original protocol from the incoming HTTP request URI. Allowed values are:
         *
         * <p>HTTP * HTTPS * {protocol}
         *
         * <p>{@code {protocol}} is the only valid token for this property. It can appear only once
         * in the value string.
         *
         * <p>Example: {@code HTTPS}
         *
         * @param protocol the value to set
         * @return this builder
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /**
         * The valid domain name (hostname) or IP address to use in the redirect URI.
         *
         * <p>When this value is null, not set, or set to {@code {host}}, the service preserves the
         * original domain name from the incoming HTTP request URI.
         *
         * <p>All RedirectUri tokens are valid for this property. You can use any token more than
         * once.
         *
         * <p>Curly braces are valid in this property only to surround tokens, such as {@code
         * {host}}
         *
         * <p>Examples:
         *
         * <p>**example.com** appears as {@code example.com} in the redirect URI.
         *
         * <p>**in{host}** appears as {@code inexample.com} in the redirect URI if {@code
         * example.com} is the hostname in the incoming HTTP request URI.
         *
         * <p>**{port}{host}** appears as {@code 8081example.com} in the redirect URI if {@code
         * example.com} is the hostname and the port is {@code 8081} in the incoming HTTP request
         * URI.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * The valid domain name (hostname) or IP address to use in the redirect URI.
         *
         * <p>When this value is null, not set, or set to {@code {host}}, the service preserves the
         * original domain name from the incoming HTTP request URI.
         *
         * <p>All RedirectUri tokens are valid for this property. You can use any token more than
         * once.
         *
         * <p>Curly braces are valid in this property only to surround tokens, such as {@code
         * {host}}
         *
         * <p>Examples:
         *
         * <p>**example.com** appears as {@code example.com} in the redirect URI.
         *
         * <p>**in{host}** appears as {@code inexample.com} in the redirect URI if {@code
         * example.com} is the hostname in the incoming HTTP request URI.
         *
         * <p>**{port}{host}** appears as {@code 8081example.com} in the redirect URI if {@code
         * example.com} is the hostname and the port is {@code 8081} in the incoming HTTP request
         * URI.
         *
         * @param host the value to set
         * @return this builder
         */
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /**
         * The communication port to use in the redirect URI.
         *
         * <p>Valid values include integers from 1 to 65535.
         *
         * <p>When this value is null, the service preserves the original port from the incoming
         * HTTP request URI.
         *
         * <p>Example: {@code 8081}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The communication port to use in the redirect URI.
         *
         * <p>Valid values include integers from 1 to 65535.
         *
         * <p>When this value is null, the service preserves the original port from the incoming
         * HTTP request URI.
         *
         * <p>Example: {@code 8081}
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
         * The HTTP URI path to use in the redirect URI.
         *
         * <p>When this value is null, not set, or set to {@code {path}}, the service preserves the
         * original path from the incoming HTTP request URI. To omit the path from the redirect URI,
         * set this value to an empty string, "".
         *
         * <p>All RedirectUri tokens are valid for this property. You can use any token more than
         * once.
         *
         * <p>The path string must begin with {@code /} if it does not begin with the {@code {path}}
         * token.
         *
         * <p>Examples:
         *
         * <p>__/example/video/123__ appears as {@code /example/video/123} in the redirect URI.
         *
         * <p>__/example{path}__ appears as {@code /example/video/123} in the redirect URI if {@code
         * /video/123} is the path in the incoming HTTP request URI.
         *
         * <p>__{path}/123__ appears as {@code /example/video/123} in the redirect URI if {@code
         * /example/video} is the path in the incoming HTTP request URI.
         *
         * <p>__{path}123__ appears as {@code /example/video123} in the redirect URI if {@code
         * /example/video} is the path in the incoming HTTP request URI.
         *
         * <p>__/{host}/123__ appears as {@code /example.com/123} in the redirect URI if {@code
         * example.com} is the hostname in the incoming HTTP request URI.
         *
         * <p>__/{host}/{port}__ appears as {@code /example.com/123} in the redirect URI if {@code
         * example.com} is the hostname and {@code 123} is the port in the incoming HTTP request
         * URI.
         *
         * <p>__/{query}__ appears as {@code /lang=en} in the redirect URI if the query is {@code
         * lang=en} in the incoming HTTP request URI.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * The HTTP URI path to use in the redirect URI.
         *
         * <p>When this value is null, not set, or set to {@code {path}}, the service preserves the
         * original path from the incoming HTTP request URI. To omit the path from the redirect URI,
         * set this value to an empty string, "".
         *
         * <p>All RedirectUri tokens are valid for this property. You can use any token more than
         * once.
         *
         * <p>The path string must begin with {@code /} if it does not begin with the {@code {path}}
         * token.
         *
         * <p>Examples:
         *
         * <p>__/example/video/123__ appears as {@code /example/video/123} in the redirect URI.
         *
         * <p>__/example{path}__ appears as {@code /example/video/123} in the redirect URI if {@code
         * /video/123} is the path in the incoming HTTP request URI.
         *
         * <p>__{path}/123__ appears as {@code /example/video/123} in the redirect URI if {@code
         * /example/video} is the path in the incoming HTTP request URI.
         *
         * <p>__{path}123__ appears as {@code /example/video123} in the redirect URI if {@code
         * /example/video} is the path in the incoming HTTP request URI.
         *
         * <p>__/{host}/123__ appears as {@code /example.com/123} in the redirect URI if {@code
         * example.com} is the hostname in the incoming HTTP request URI.
         *
         * <p>__/{host}/{port}__ appears as {@code /example.com/123} in the redirect URI if {@code
         * example.com} is the hostname and {@code 123} is the port in the incoming HTTP request
         * URI.
         *
         * <p>__/{query}__ appears as {@code /lang=en} in the redirect URI if the query is {@code
         * lang=en} in the incoming HTTP request URI.
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
         * The query string to use in the redirect URI.
         *
         * <p>When this value is null, not set, or set to {@code {query}}, the service preserves the
         * original query parameters from the incoming HTTP request URI.
         *
         * <p>All {@code RedirectUri} tokens are valid for this property. You can use any token more
         * than once.
         *
         * <p>If the query string does not begin with the {@code {query}} token, it must begin with
         * the question mark (?) character.
         *
         * <p>You can specify multiple query parameters as a single string. Separate each query
         * parameter with an ampersand (&) character. To omit all incoming query parameters from the
         * redirect URI, set this value to an empty string, "".
         *
         * <p>If the specified query string results in a redirect URI ending with {@code ?} or
         * {@code &}, the last character is truncated. For example, if the incoming URI is {@code
         * http://host.com:8080/documents} and the query property value is {@code ?lang=en&{query}},
         * the redirect URI is {@code http://host.com:8080/documents?lang=en}. The system truncates
         * the final ampersand (&) because the incoming URI included no value to replace the {query}
         * token.
         *
         * <p>Examples: * **lang=en&time_zone=PST** appears as {@code lang=en&time_zone=PST} in the
         * redirect URI.
         *
         * <p>**{query}** appears as {@code lang=en&time_zone=PST} in the redirect URI if {@code
         * lang=en&time_zone=PST} is the query string in the incoming HTTP request. If the incoming
         * HTTP request has no query parameters, the {@code {query}} token renders as an empty
         * string.
         *
         * <p>**lang=en&{query}&time_zone=PST** appears as {@code lang=en&country=us&time_zone=PST}
         * in the redirect URI if {@code country=us} is the query string in the incoming HTTP
         * request. If the incoming HTTP request has no query parameters, this value renders as
         * {@code lang=en&time_zone=PST}.
         *
         * <p>**protocol={protocol}&hostname={host}** appears as {@code
         * protocol=http&hostname=example.com} in the redirect URI if the protocol is {@code HTTP}
         * and the hostname is {@code example.com} in the incoming HTTP request.
         *
         * <p>**port={port}&hostname={host}** appears as {@code port=8080&hostname=example.com} in
         * the redirect URI if the port is {@code 8080} and the hostname is {@code example.com} in
         * the incoming HTTP request URI.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * The query string to use in the redirect URI.
         *
         * <p>When this value is null, not set, or set to {@code {query}}, the service preserves the
         * original query parameters from the incoming HTTP request URI.
         *
         * <p>All {@code RedirectUri} tokens are valid for this property. You can use any token more
         * than once.
         *
         * <p>If the query string does not begin with the {@code {query}} token, it must begin with
         * the question mark (?) character.
         *
         * <p>You can specify multiple query parameters as a single string. Separate each query
         * parameter with an ampersand (&) character. To omit all incoming query parameters from the
         * redirect URI, set this value to an empty string, "".
         *
         * <p>If the specified query string results in a redirect URI ending with {@code ?} or
         * {@code &}, the last character is truncated. For example, if the incoming URI is {@code
         * http://host.com:8080/documents} and the query property value is {@code ?lang=en&{query}},
         * the redirect URI is {@code http://host.com:8080/documents?lang=en}. The system truncates
         * the final ampersand (&) because the incoming URI included no value to replace the {query}
         * token.
         *
         * <p>Examples: * **lang=en&time_zone=PST** appears as {@code lang=en&time_zone=PST} in the
         * redirect URI.
         *
         * <p>**{query}** appears as {@code lang=en&time_zone=PST} in the redirect URI if {@code
         * lang=en&time_zone=PST} is the query string in the incoming HTTP request. If the incoming
         * HTTP request has no query parameters, the {@code {query}} token renders as an empty
         * string.
         *
         * <p>**lang=en&{query}&time_zone=PST** appears as {@code lang=en&country=us&time_zone=PST}
         * in the redirect URI if {@code country=us} is the query string in the incoming HTTP
         * request. If the incoming HTTP request has no query parameters, this value renders as
         * {@code lang=en&time_zone=PST}.
         *
         * <p>**protocol={protocol}&hostname={host}** appears as {@code
         * protocol=http&hostname=example.com} in the redirect URI if the protocol is {@code HTTP}
         * and the hostname is {@code example.com} in the incoming HTTP request.
         *
         * <p>**port={port}&hostname={host}** appears as {@code port=8080&hostname=example.com} in
         * the redirect URI if the port is {@code 8080} and the hostname is {@code example.com} in
         * the incoming HTTP request URI.
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

        public RedirectUri build() {
            RedirectUri model =
                    new RedirectUri(this.protocol, this.host, this.port, this.path, this.query);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RedirectUri model) {
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

    /**
     * The HTTP protocol to use in the redirect URI.
     *
     * <p>When this value is null, not set, or set to {@code {protocol}}, the service preserves the
     * original protocol from the incoming HTTP request URI. Allowed values are:
     *
     * <p>HTTP * HTTPS * {protocol}
     *
     * <p>{@code {protocol}} is the only valid token for this property. It can appear only once in
     * the value string.
     *
     * <p>Example: {@code HTTPS}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final String protocol;

    /**
     * The HTTP protocol to use in the redirect URI.
     *
     * <p>When this value is null, not set, or set to {@code {protocol}}, the service preserves the
     * original protocol from the incoming HTTP request URI. Allowed values are:
     *
     * <p>HTTP * HTTPS * {protocol}
     *
     * <p>{@code {protocol}} is the only valid token for this property. It can appear only once in
     * the value string.
     *
     * <p>Example: {@code HTTPS}
     *
     * @return the value
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * The valid domain name (hostname) or IP address to use in the redirect URI.
     *
     * <p>When this value is null, not set, or set to {@code {host}}, the service preserves the
     * original domain name from the incoming HTTP request URI.
     *
     * <p>All RedirectUri tokens are valid for this property. You can use any token more than once.
     *
     * <p>Curly braces are valid in this property only to surround tokens, such as {@code {host}}
     *
     * <p>Examples:
     *
     * <p>**example.com** appears as {@code example.com} in the redirect URI.
     *
     * <p>**in{host}** appears as {@code inexample.com} in the redirect URI if {@code example.com}
     * is the hostname in the incoming HTTP request URI.
     *
     * <p>**{port}{host}** appears as {@code 8081example.com} in the redirect URI if {@code
     * example.com} is the hostname and the port is {@code 8081} in the incoming HTTP request URI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * The valid domain name (hostname) or IP address to use in the redirect URI.
     *
     * <p>When this value is null, not set, or set to {@code {host}}, the service preserves the
     * original domain name from the incoming HTTP request URI.
     *
     * <p>All RedirectUri tokens are valid for this property. You can use any token more than once.
     *
     * <p>Curly braces are valid in this property only to surround tokens, such as {@code {host}}
     *
     * <p>Examples:
     *
     * <p>**example.com** appears as {@code example.com} in the redirect URI.
     *
     * <p>**in{host}** appears as {@code inexample.com} in the redirect URI if {@code example.com}
     * is the hostname in the incoming HTTP request URI.
     *
     * <p>**{port}{host}** appears as {@code 8081example.com} in the redirect URI if {@code
     * example.com} is the hostname and the port is {@code 8081} in the incoming HTTP request URI.
     *
     * @return the value
     */
    public String getHost() {
        return host;
    }

    /**
     * The communication port to use in the redirect URI.
     *
     * <p>Valid values include integers from 1 to 65535.
     *
     * <p>When this value is null, the service preserves the original port from the incoming HTTP
     * request URI.
     *
     * <p>Example: {@code 8081}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The communication port to use in the redirect URI.
     *
     * <p>Valid values include integers from 1 to 65535.
     *
     * <p>When this value is null, the service preserves the original port from the incoming HTTP
     * request URI.
     *
     * <p>Example: {@code 8081}
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /**
     * The HTTP URI path to use in the redirect URI.
     *
     * <p>When this value is null, not set, or set to {@code {path}}, the service preserves the
     * original path from the incoming HTTP request URI. To omit the path from the redirect URI, set
     * this value to an empty string, "".
     *
     * <p>All RedirectUri tokens are valid for this property. You can use any token more than once.
     *
     * <p>The path string must begin with {@code /} if it does not begin with the {@code {path}}
     * token.
     *
     * <p>Examples:
     *
     * <p>__/example/video/123__ appears as {@code /example/video/123} in the redirect URI.
     *
     * <p>__/example{path}__ appears as {@code /example/video/123} in the redirect URI if {@code
     * /video/123} is the path in the incoming HTTP request URI.
     *
     * <p>__{path}/123__ appears as {@code /example/video/123} in the redirect URI if {@code
     * /example/video} is the path in the incoming HTTP request URI.
     *
     * <p>__{path}123__ appears as {@code /example/video123} in the redirect URI if {@code
     * /example/video} is the path in the incoming HTTP request URI.
     *
     * <p>__/{host}/123__ appears as {@code /example.com/123} in the redirect URI if {@code
     * example.com} is the hostname in the incoming HTTP request URI.
     *
     * <p>__/{host}/{port}__ appears as {@code /example.com/123} in the redirect URI if {@code
     * example.com} is the hostname and {@code 123} is the port in the incoming HTTP request URI.
     *
     * <p>__/{query}__ appears as {@code /lang=en} in the redirect URI if the query is {@code
     * lang=en} in the incoming HTTP request URI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * The HTTP URI path to use in the redirect URI.
     *
     * <p>When this value is null, not set, or set to {@code {path}}, the service preserves the
     * original path from the incoming HTTP request URI. To omit the path from the redirect URI, set
     * this value to an empty string, "".
     *
     * <p>All RedirectUri tokens are valid for this property. You can use any token more than once.
     *
     * <p>The path string must begin with {@code /} if it does not begin with the {@code {path}}
     * token.
     *
     * <p>Examples:
     *
     * <p>__/example/video/123__ appears as {@code /example/video/123} in the redirect URI.
     *
     * <p>__/example{path}__ appears as {@code /example/video/123} in the redirect URI if {@code
     * /video/123} is the path in the incoming HTTP request URI.
     *
     * <p>__{path}/123__ appears as {@code /example/video/123} in the redirect URI if {@code
     * /example/video} is the path in the incoming HTTP request URI.
     *
     * <p>__{path}123__ appears as {@code /example/video123} in the redirect URI if {@code
     * /example/video} is the path in the incoming HTTP request URI.
     *
     * <p>__/{host}/123__ appears as {@code /example.com/123} in the redirect URI if {@code
     * example.com} is the hostname in the incoming HTTP request URI.
     *
     * <p>__/{host}/{port}__ appears as {@code /example.com/123} in the redirect URI if {@code
     * example.com} is the hostname and {@code 123} is the port in the incoming HTTP request URI.
     *
     * <p>__/{query}__ appears as {@code /lang=en} in the redirect URI if the query is {@code
     * lang=en} in the incoming HTTP request URI.
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /**
     * The query string to use in the redirect URI.
     *
     * <p>When this value is null, not set, or set to {@code {query}}, the service preserves the
     * original query parameters from the incoming HTTP request URI.
     *
     * <p>All {@code RedirectUri} tokens are valid for this property. You can use any token more
     * than once.
     *
     * <p>If the query string does not begin with the {@code {query}} token, it must begin with the
     * question mark (?) character.
     *
     * <p>You can specify multiple query parameters as a single string. Separate each query
     * parameter with an ampersand (&) character. To omit all incoming query parameters from the
     * redirect URI, set this value to an empty string, "".
     *
     * <p>If the specified query string results in a redirect URI ending with {@code ?} or {@code
     * &}, the last character is truncated. For example, if the incoming URI is {@code
     * http://host.com:8080/documents} and the query property value is {@code ?lang=en&{query}}, the
     * redirect URI is {@code http://host.com:8080/documents?lang=en}. The system truncates the
     * final ampersand (&) because the incoming URI included no value to replace the {query} token.
     *
     * <p>Examples: * **lang=en&time_zone=PST** appears as {@code lang=en&time_zone=PST} in the
     * redirect URI.
     *
     * <p>**{query}** appears as {@code lang=en&time_zone=PST} in the redirect URI if {@code
     * lang=en&time_zone=PST} is the query string in the incoming HTTP request. If the incoming HTTP
     * request has no query parameters, the {@code {query}} token renders as an empty string.
     *
     * <p>**lang=en&{query}&time_zone=PST** appears as {@code lang=en&country=us&time_zone=PST} in
     * the redirect URI if {@code country=us} is the query string in the incoming HTTP request. If
     * the incoming HTTP request has no query parameters, this value renders as {@code
     * lang=en&time_zone=PST}.
     *
     * <p>**protocol={protocol}&hostname={host}** appears as {@code
     * protocol=http&hostname=example.com} in the redirect URI if the protocol is {@code HTTP} and
     * the hostname is {@code example.com} in the incoming HTTP request.
     *
     * <p>**port={port}&hostname={host}** appears as {@code port=8080&hostname=example.com} in the
     * redirect URI if the port is {@code 8080} and the hostname is {@code example.com} in the
     * incoming HTTP request URI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * The query string to use in the redirect URI.
     *
     * <p>When this value is null, not set, or set to {@code {query}}, the service preserves the
     * original query parameters from the incoming HTTP request URI.
     *
     * <p>All {@code RedirectUri} tokens are valid for this property. You can use any token more
     * than once.
     *
     * <p>If the query string does not begin with the {@code {query}} token, it must begin with the
     * question mark (?) character.
     *
     * <p>You can specify multiple query parameters as a single string. Separate each query
     * parameter with an ampersand (&) character. To omit all incoming query parameters from the
     * redirect URI, set this value to an empty string, "".
     *
     * <p>If the specified query string results in a redirect URI ending with {@code ?} or {@code
     * &}, the last character is truncated. For example, if the incoming URI is {@code
     * http://host.com:8080/documents} and the query property value is {@code ?lang=en&{query}}, the
     * redirect URI is {@code http://host.com:8080/documents?lang=en}. The system truncates the
     * final ampersand (&) because the incoming URI included no value to replace the {query} token.
     *
     * <p>Examples: * **lang=en&time_zone=PST** appears as {@code lang=en&time_zone=PST} in the
     * redirect URI.
     *
     * <p>**{query}** appears as {@code lang=en&time_zone=PST} in the redirect URI if {@code
     * lang=en&time_zone=PST} is the query string in the incoming HTTP request. If the incoming HTTP
     * request has no query parameters, the {@code {query}} token renders as an empty string.
     *
     * <p>**lang=en&{query}&time_zone=PST** appears as {@code lang=en&country=us&time_zone=PST} in
     * the redirect URI if {@code country=us} is the query string in the incoming HTTP request. If
     * the incoming HTTP request has no query parameters, this value renders as {@code
     * lang=en&time_zone=PST}.
     *
     * <p>**protocol={protocol}&hostname={host}** appears as {@code
     * protocol=http&hostname=example.com} in the redirect URI if the protocol is {@code HTTP} and
     * the hostname is {@code example.com} in the incoming HTTP request.
     *
     * <p>**port={port}&hostname={host}** appears as {@code port=8080&hostname=example.com} in the
     * redirect URI if the port is {@code 8080} and the hostname is {@code example.com} in the
     * incoming HTTP request URI.
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
        sb.append("RedirectUri(");
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
        if (!(o instanceof RedirectUri)) {
            return false;
        }

        RedirectUri other = (RedirectUri) o;
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
