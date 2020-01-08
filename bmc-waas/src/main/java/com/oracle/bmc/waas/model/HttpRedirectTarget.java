/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HttpRedirectTarget.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class HttpRedirectTarget {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        public Builder protocol(Protocol protocol) {
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

        public HttpRedirectTarget build() {
            HttpRedirectTarget __instance__ =
                    new HttpRedirectTarget(protocol, host, port, path, query);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpRedirectTarget o) {
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
     * The protocol used for the target, http or https.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Protocol {
        Http("HTTP"),
        Https("HTTPS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The protocol used for the target, http or https.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    Protocol protocol;

    /**
     * The host portion of the redirect.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    String host;

    /**
     * Port number of the target destination of the redirect, default to match protocol
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    /**
     * The path component of the target URL (e.g., \"/path/to/resource\" in  \"https://target.example.com/path/to/resource?redirected\"), which can be empty, static, or request-copying, or request-prefixing. Use of \\ is not permitted except to escape a following \\, {, or }. An empty value is treated the same as static \"/\". A static value must begin with a leading \"/\", optionally followed by other path characters. A request-copying value must exactly match \"{path}\", and will be replaced with the path component  of the request URL (including its initial \"/\"). A request-prefixing value must start with \"/\" and end with a non-escaped \"{path}\",  which will be replaced with the path component of the request URL (including its initial \"/\"). Only one such replacement token is allowed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    /**
     * The query component of the target URL (e.g., \"?redirected\" in \"https://target.example.com/path/to/resource?redirected\"),  which can be empty, static, or request-copying. Use of \\ is not permitted except to escape a following \\, {, or }. An empty value results in a redirection target URL with no query component. A static value must begin with a leading \"?\", optionally followed by other query characters. A request-copying value must exactly match \"{query}\", and will be replaced with the  query component of the request URL (including a leading \"?\" if and only if the request  URL includes a query component).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    String query;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
