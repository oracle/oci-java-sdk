/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that defines the redirect URI applied to the original request. The object property values compose the
 * redirect URI.
 * <p>
 **NOTE:** The Load Balancing service cannot automatically detect or avoid infinite redirects. Be sure to provide
 * meaningful, complete, and correct field values. If any component field of this object has no value, the system
 * retains the value from the incoming HTTP request URI.
 * <p>
 * For example, if you specify only the protocol field `https`, and the incoming request URI is
 * `http://example.com:8080`, the resulting runtime redirect URI is `https://example.com:8080`. The system retains
 * the host and port from the incoming URI and does not automatically change the port setting from `8080` to `443`.
 * <p>
 * Be sure to configure valid percent-encoding (URL encoding) when needed.
 * <p>
 * In addition to static string values, you can use the following tokens to construct the redirect URI. These tokens
 * extract values from the incoming HTTP request URI.
 * <p>
 *  {protocol} : The protocol from the incoming HTTP request URI.
 * *  {host}     : The domain name from the incoming HTTP request URI.
 * *  {port}     : The port from the incoming HTTP request URI.
 * *  {path}     : The path from the incoming HTTP request URI.
 * *  {query}    : The query string from the incoming HTTP request URI.
 * <p>
 * The tokens are case sensitive. For example, `{host}` is a valid token, but `{HOST}` is not.
 * <p>
 * You can retain the literal characters of a token when you specify values for the path and query properties of the
 * redirect URI. Use a backslash (\\\\) as the escape character for the \\\\, {, and } characters. For example, if the
 * incoming HTTP request URI is `/video`, the path property value:
 * <p>
 * `/example{path}123\\{path\\}`
 * <p>
 * appears in the constructed redirect URI as:
 * <p>
 * `/example/video123{path}`
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RedirectUri.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class RedirectUri {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RedirectUri build() {
            RedirectUri __instance__ = new RedirectUri(protocol, host, port, path, query);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RedirectUri o) {
            Builder copiedBuilder =
                    protocol(o.getProtocol())
                            .host(o.getHost())
                            .port(o.getPort())
                            .path(o.getPath())
                            .query(o.getQuery());

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

    /**
     * The HTTP protocol to use in the redirect URI.
     * <p>
     * When this value is null, not set, or set to `{protocol}`, the service preserves the original protocol from the
     * incoming HTTP request URI. Allowed values are:
     * <p>
     *  HTTP
     * *  HTTPS
     * *  {protocol}
     * <p>
     * `{protocol}` is the only valid token for this property. It can appear only once in the value string.
     * <p>
     * Example: `HTTPS`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    String protocol;

    /**
     * The valid domain name (hostname) or IP address to use in the redirect URI.
     * <p>
     * When this value is null, not set, or set to `{host}`, the service preserves the original domain name from the
     * incoming HTTP request URI.
     * <p>
     * All RedirectUri tokens are valid for this property. You can use any token more than once.
     * <p>
     * Curly braces are valid in this property only to surround tokens, such as `{host}`
     * <p>
     * Examples:
     * <p>
     *  **example.com** appears as `example.com` in the redirect URI.
     * <p>
     *  **in{host}** appears as `inexample.com` in the redirect URI if `example.com` is the hostname in the
     *    incoming HTTP request URI.
     * <p>
     *  **{port}{host}** appears as `8081example.com` in the redirect URI if `example.com` is the hostname and
     *    the port is `8081` in the incoming HTTP request URI.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    String host;

    /**
     * The communication port to use in the redirect URI.
     * <p>
     * Valid values include integers from 1 to 65535.
     * <p>
     * When this value is null, the service preserves the original port from the incoming HTTP request URI.
     * <p>
     * Example: `8081`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    /**
     * The HTTP URI path to use in the redirect URI.
     * <p>
     * When this value is null, not set, or set to `{path}`, the service preserves the original path from the
     * incoming HTTP request URI. To omit the path from the redirect URI, set this value to an empty string, \"\".
     * <p>
     * All RedirectUri tokens are valid for this property. You can use any token more than once.
     * <p>
     * The path string must begin with `/` if it does not begin with the `{path}` token.
     * <p>
     * Examples:
     * <p>
     *  __/example/video/123__ appears as `/example/video/123` in the redirect URI.
     * <p>
     *  __/example{path}__ appears as `/example/video/123` in the redirect URI if `/video/123` is the path in the
     *    incoming HTTP request URI.
     * <p>
     *  __{path}/123__ appears as `/example/video/123` in the redirect URI if `/example/video` is the path in the
     *    incoming HTTP request URI.
     * <p>
     *  __{path}123__ appears as `/example/video123` in the redirect URI if `/example/video` is the path in the
     *    incoming HTTP request URI.
     * <p>
     *  __/{host}/123__ appears as `/example.com/123` in the redirect URI if `example.com` is the hostname
     *    in the incoming HTTP request URI.
     * <p>
     *  __/{host}/{port}__ appears as `/example.com/123` in the redirect URI if `example.com` is the hostname and
     *    `123` is the port in the incoming HTTP request URI.
     * <p>
     *  __/{query}__ appears as `/lang=en` in the redirect URI if the query is `lang=en` in the incoming HTTP
     *    request URI.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    /**
     * The query string to use in the redirect URI.
     * <p>
     * When this value is null, not set, or set to `{query}`, the service preserves the original query parameters
     * from the incoming HTTP request URI.
     * <p>
     * All `RedirectUri` tokens are valid for this property. You can use any token more than once.
     * <p>
     * If the query string does not begin with the `{query}` token, it must begin with the question mark (?) character.
     * <p>
     * You can specify multiple query parameters as a single string. Separate each query parameter with an ampersand
     * (&) character. To omit all incoming query parameters from the redirect URI, set this value to an empty
     * string, \"\".
     * <p>
     * If the specified query string results in a redirect URI ending with `?` or `&`, the last character is truncated.
     * For example, if the incoming URI is `http://host.com:8080/documents` and the query property value is
     * `?lang=en&{query}`, the redirect URI is `http://host.com:8080/documents?lang=en`. The system
     * truncates the final ampersand (&) because the incoming URI included no value to replace the {query} token.
     * <p>
     * Examples:
     * * **lang=en&time_zone=PST** appears as `lang=en&time_zone=PST` in the redirect URI.
     * <p>
     * **{query}** appears as `lang=en&time_zone=PST` in the redirect URI if `lang=en&time_zone=PST` is the query
     *   string in the incoming HTTP request. If the incoming HTTP request has no query parameters, the `{query}`
     *   token renders as an empty string.
     * <p>
     * **lang=en&{query}&time_zone=PST** appears as `lang=en&country=us&time_zone=PST` in the redirect URI if
     *   `country=us` is the query string in the incoming HTTP request. If the incoming HTTP request has no query
     *   parameters, this value renders as `lang=en&time_zone=PST`.
     * <p>
     *  **protocol={protocol}&hostname={host}** appears as `protocol=http&hostname=example.com` in the redirect
     *    URI if the protocol is `HTTP` and the hostname is `example.com` in the incoming HTTP request.
     * <p>
     *  **port={port}&hostname={host}** appears as `port=8080&hostname=example.com` in the redirect URI if the
     *    port is `8080` and the hostname is `example.com` in the incoming HTTP request URI.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    String query;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
