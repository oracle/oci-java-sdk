/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The configuration details for the WAAS policy.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PolicyConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PolicyConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHttpsEnabled")
        private Boolean isHttpsEnabled;

        public Builder isHttpsEnabled(Boolean isHttpsEnabled) {
            this.isHttpsEnabled = isHttpsEnabled;
            this.__explicitlySet__.add("isHttpsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHttpsForced")
        private Boolean isHttpsForced;

        public Builder isHttpsForced(Boolean isHttpsForced) {
            this.isHttpsForced = isHttpsForced;
            this.__explicitlySet__.add("isHttpsForced");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tlsProtocols")
        private java.util.List<TlsProtocols> tlsProtocols;

        public Builder tlsProtocols(java.util.List<TlsProtocols> tlsProtocols) {
            this.tlsProtocols = tlsProtocols;
            this.__explicitlySet__.add("tlsProtocols");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOriginCompressionEnabled")
        private Boolean isOriginCompressionEnabled;

        public Builder isOriginCompressionEnabled(Boolean isOriginCompressionEnabled) {
            this.isOriginCompressionEnabled = isOriginCompressionEnabled;
            this.__explicitlySet__.add("isOriginCompressionEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBehindCdn")
        private Boolean isBehindCdn;

        public Builder isBehindCdn(Boolean isBehindCdn) {
            this.isBehindCdn = isBehindCdn;
            this.__explicitlySet__.add("isBehindCdn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientAddressHeader")
        private ClientAddressHeader clientAddressHeader;

        public Builder clientAddressHeader(ClientAddressHeader clientAddressHeader) {
            this.clientAddressHeader = clientAddressHeader;
            this.__explicitlySet__.add("clientAddressHeader");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCacheControlRespected")
        private Boolean isCacheControlRespected;

        public Builder isCacheControlRespected(Boolean isCacheControlRespected) {
            this.isCacheControlRespected = isCacheControlRespected;
            this.__explicitlySet__.add("isCacheControlRespected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isResponseBufferingEnabled")
        private Boolean isResponseBufferingEnabled;

        public Builder isResponseBufferingEnabled(Boolean isResponseBufferingEnabled) {
            this.isResponseBufferingEnabled = isResponseBufferingEnabled;
            this.__explicitlySet__.add("isResponseBufferingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cipherGroup")
        private CipherGroup cipherGroup;

        public Builder cipherGroup(CipherGroup cipherGroup) {
            this.cipherGroup = cipherGroup;
            this.__explicitlySet__.add("cipherGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancingMethod")
        private LoadBalancingMethod loadBalancingMethod;

        public Builder loadBalancingMethod(LoadBalancingMethod loadBalancingMethod) {
            this.loadBalancingMethod = loadBalancingMethod;
            this.__explicitlySet__.add("loadBalancingMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("websocketPathPrefixes")
        private java.util.List<String> websocketPathPrefixes;

        public Builder websocketPathPrefixes(java.util.List<String> websocketPathPrefixes) {
            this.websocketPathPrefixes = websocketPathPrefixes;
            this.__explicitlySet__.add("websocketPathPrefixes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSniEnabled")
        private Boolean isSniEnabled;

        public Builder isSniEnabled(Boolean isSniEnabled) {
            this.isSniEnabled = isSniEnabled;
            this.__explicitlySet__.add("isSniEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("healthChecks")
        private HealthCheck healthChecks;

        public Builder healthChecks(HealthCheck healthChecks) {
            this.healthChecks = healthChecks;
            this.__explicitlySet__.add("healthChecks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PolicyConfig build() {
            PolicyConfig __instance__ =
                    new PolicyConfig(
                            certificateId,
                            isHttpsEnabled,
                            isHttpsForced,
                            tlsProtocols,
                            isOriginCompressionEnabled,
                            isBehindCdn,
                            clientAddressHeader,
                            isCacheControlRespected,
                            isResponseBufferingEnabled,
                            cipherGroup,
                            loadBalancingMethod,
                            websocketPathPrefixes,
                            isSniEnabled,
                            healthChecks);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PolicyConfig o) {
            Builder copiedBuilder =
                    certificateId(o.getCertificateId())
                            .isHttpsEnabled(o.getIsHttpsEnabled())
                            .isHttpsForced(o.getIsHttpsForced())
                            .tlsProtocols(o.getTlsProtocols())
                            .isOriginCompressionEnabled(o.getIsOriginCompressionEnabled())
                            .isBehindCdn(o.getIsBehindCdn())
                            .clientAddressHeader(o.getClientAddressHeader())
                            .isCacheControlRespected(o.getIsCacheControlRespected())
                            .isResponseBufferingEnabled(o.getIsResponseBufferingEnabled())
                            .cipherGroup(o.getCipherGroup())
                            .loadBalancingMethod(o.getLoadBalancingMethod())
                            .websocketPathPrefixes(o.getWebsocketPathPrefixes())
                            .isSniEnabled(o.getIsSniEnabled())
                            .healthChecks(o.getHealthChecks());

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
     * The OCID of the SSL certificate to use if HTTPS is supported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    String certificateId;

    /**
     * Enable or disable HTTPS support. If true, a `certificateId` is required. If unspecified, defaults to `false`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHttpsEnabled")
    Boolean isHttpsEnabled;

    /**
     * Force HTTP to HTTPS redirection. If unspecified, defaults to `false`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHttpsForced")
    Boolean isHttpsForced;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TlsProtocols {
        TlsV1("TLS_V1"),
        TlsV11("TLS_V1_1"),
        TlsV12("TLS_V1_2"),
        TlsV13("TLS_V1_3"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, TlsProtocols> map;

        static {
            map = new java.util.HashMap<>();
            for (TlsProtocols v : TlsProtocols.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TlsProtocols(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TlsProtocols create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TlsProtocols', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * A list of allowed TLS protocols. Only applicable when HTTPS support is enabled.
     * The TLS protocol is negotiated while the request is connecting and the most recent protocol supported by both the edge node and client browser will be selected. If no such version exists, the connection will be aborted.
     * - **TLS_V1:** corresponds to TLS 1.0 specification.
     * <p>
     * - **TLS_V1_1:** corresponds to TLS 1.1 specification.
     * <p>
     * - **TLS_V1_2:** corresponds to TLS 1.2 specification.
     * <p>
     * - **TLS_V1_3:** corresponds to TLS 1.3 specification.
     * <p>
     * Enabled TLS protocols must go in a row. For example if `TLS_v1_1` and `TLS_V1_3` are enabled, `TLS_V1_2` must be enabled too.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tlsProtocols")
    java.util.List<TlsProtocols> tlsProtocols;

    /**
     * Enable or disable GZIP compression of origin responses. If enabled, the header `Accept-Encoding: gzip` is sent to origin, otherwise, the empty `Accept-Encoding:` header is used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOriginCompressionEnabled")
    Boolean isOriginCompressionEnabled;

    /**
     * Enabling `isBehindCdn` allows for the collection of IP addresses from client requests if the WAF is connected to a CDN.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBehindCdn")
    Boolean isBehindCdn;
    /**
     * Specifies an HTTP header name which is treated as the connecting client's IP address. Applicable only if `isBehindCdn` is enabled.
     * <p>
     * The edge node reads this header and its value and sets the client IP address as specified. It does not create the header if the header is not present in the request. If the header is not present, the connecting IP address will be used as the client's true IP address. It uses the last IP address in the header's value as the true IP address.
     * <p>
     * Example: `X-Client-Ip: 11.1.1.1, 13.3.3.3`
     * <p>
     * In the case of multiple headers with the same name, only the first header will be used. It is assumed that CDN sets the correct client IP address to prevent spoofing.
     * <p>
     * - **X_FORWARDED_FOR:** Corresponds to `X-Forwarded-For` header name.
     * <p>
     * - **X_CLIENT_IP:** Corresponds to `X-Client-Ip` header name.
     * <p>
     * - **X_REAL_IP:** Corresponds to `X-Real-Ip` header name.
     * <p>
     * - **CLIENT_IP:** Corresponds to `Client-Ip` header name.
     * <p>
     * - **TRUE_CLIENT_IP:** Corresponds to `True-Client-Ip` header name.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ClientAddressHeader {
        XForwardedFor("X_FORWARDED_FOR"),
        XClientIp("X_CLIENT_IP"),
        XRealIp("X_REAL_IP"),
        ClientIp("CLIENT_IP"),
        TrueClientIp("TRUE_CLIENT_IP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ClientAddressHeader> map;

        static {
            map = new java.util.HashMap<>();
            for (ClientAddressHeader v : ClientAddressHeader.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ClientAddressHeader(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ClientAddressHeader create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ClientAddressHeader', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies an HTTP header name which is treated as the connecting client's IP address. Applicable only if `isBehindCdn` is enabled.
     * <p>
     * The edge node reads this header and its value and sets the client IP address as specified. It does not create the header if the header is not present in the request. If the header is not present, the connecting IP address will be used as the client's true IP address. It uses the last IP address in the header's value as the true IP address.
     * <p>
     * Example: `X-Client-Ip: 11.1.1.1, 13.3.3.3`
     * <p>
     * In the case of multiple headers with the same name, only the first header will be used. It is assumed that CDN sets the correct client IP address to prevent spoofing.
     * <p>
     * - **X_FORWARDED_FOR:** Corresponds to `X-Forwarded-For` header name.
     * <p>
     * - **X_CLIENT_IP:** Corresponds to `X-Client-Ip` header name.
     * <p>
     * - **X_REAL_IP:** Corresponds to `X-Real-Ip` header name.
     * <p>
     * - **CLIENT_IP:** Corresponds to `Client-Ip` header name.
     * <p>
     * - **TRUE_CLIENT_IP:** Corresponds to `True-Client-Ip` header name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientAddressHeader")
    ClientAddressHeader clientAddressHeader;

    /**
     * Enable or disable automatic content caching based on the response `cache-control` header. This feature enables the origin to act as a proxy cache. Caching is usually defined using `cache-control` header. For example `cache-control: max-age=120` means that the returned resource is valid for 120 seconds. Caching rules will overwrite this setting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCacheControlRespected")
    Boolean isCacheControlRespected;

    /**
     * Enable or disable buffering of responses from the origin. Buffering improves overall stability in case of network issues, but slightly increases Time To First Byte.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isResponseBufferingEnabled")
    Boolean isResponseBufferingEnabled;
    /**
     * The set cipher group for the configured TLS protocol. This sets the configuration for the TLS connections between clients and edge nodes only.
     * - **DEFAULT:** Cipher group supports TLS 1.0, TLS 1.1, TLS 1.2, TLS 1.3 protocols. It has the following ciphers enabled: `ECDHE-RSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-ECDSA-AES256-GCM-SHA384:DHE-RSA-AES128-GCM-SHA256:DHE-DSS-AES128-GCM-SHA256:kEDH+AESGCM:ECDHE-RSA-AES128-SHA256:ECDHE-ECDSA-AES128-SHA256:ECDHE-RSA-AES128-SHA:ECDHE-ECDSA-AES128-SHA:ECDHE-RSA-AES256-SHA384:ECDHE-ECDSA-AES256-SHA384:ECDHE-RSA-AES256-SHA:ECDHE-ECDSA-AES256-SHA:DHE-RSA-AES128-SHA256:DHE-RSA-AES128-SHA:DHE-DSS-AES128-SHA256:DHE-RSA-AES256-SHA256:DHE-DSS-AES256-SHA:DHE-RSA-AES256-SHA:AES128-GCM-SHA256:AES256-GCM-SHA384:AES128-SHA256:AES256-SHA256:AES128-SHA:AES256-SHA:AES:CAMELLIA:!DES-CBC3-SHA:!aNULL:!eNULL:!EXPORT:!DES:!RC4:!MD5:!PSK:!aECDH:!EDH-DSS-DES-CBC3-SHA:!EDH-RSA-DES-CBC3-SHA:!KRB5-DES-CBC3-SHA`
     **/
    @lombok.extern.slf4j.Slf4j
    public enum CipherGroup {
        Default("DEFAULT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, CipherGroup> map;

        static {
            map = new java.util.HashMap<>();
            for (CipherGroup v : CipherGroup.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CipherGroup(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CipherGroup create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CipherGroup', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The set cipher group for the configured TLS protocol. This sets the configuration for the TLS connections between clients and edge nodes only.
     * - **DEFAULT:** Cipher group supports TLS 1.0, TLS 1.1, TLS 1.2, TLS 1.3 protocols. It has the following ciphers enabled: `ECDHE-RSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-ECDSA-AES256-GCM-SHA384:DHE-RSA-AES128-GCM-SHA256:DHE-DSS-AES128-GCM-SHA256:kEDH+AESGCM:ECDHE-RSA-AES128-SHA256:ECDHE-ECDSA-AES128-SHA256:ECDHE-RSA-AES128-SHA:ECDHE-ECDSA-AES128-SHA:ECDHE-RSA-AES256-SHA384:ECDHE-ECDSA-AES256-SHA384:ECDHE-RSA-AES256-SHA:ECDHE-ECDSA-AES256-SHA:DHE-RSA-AES128-SHA256:DHE-RSA-AES128-SHA:DHE-DSS-AES128-SHA256:DHE-RSA-AES256-SHA256:DHE-DSS-AES256-SHA:DHE-RSA-AES256-SHA:AES128-GCM-SHA256:AES256-GCM-SHA384:AES128-SHA256:AES256-SHA256:AES128-SHA:AES256-SHA:AES:CAMELLIA:!DES-CBC3-SHA:!aNULL:!eNULL:!EXPORT:!DES:!RC4:!MD5:!PSK:!aECDH:!EDH-DSS-DES-CBC3-SHA:!EDH-RSA-DES-CBC3-SHA:!KRB5-DES-CBC3-SHA`
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cipherGroup")
    CipherGroup cipherGroup;

    /**
     * An object that represents a load balancing method and its properties.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancingMethod")
    LoadBalancingMethod loadBalancingMethod;

    /**
     * ModSecurity is not capable to inspect WebSockets. Therefore paths specified here have WAF disabled if Connection request header from the client has the value Upgrade (case insensitive matching) and Upgrade request header has the value websocket (case insensitive matching). Paths matches if the concatenation of request URL path and query starts with the contents of the one of `websocketPathPrefixes` array value. In All other cases challenges, like JSC, HIC and etc., remain active.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("websocketPathPrefixes")
    java.util.List<String> websocketPathPrefixes;

    /**
     * SNI stands for Server Name Indication and is an extension of the TLS protocol. It indicates which hostname is being contacted by the browser at the beginning of the 'handshake'-process. This allows a server to connect multiple SSL Certificates to one IP address and port.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSniEnabled")
    Boolean isSniEnabled;

    @com.fasterxml.jackson.annotation.JsonProperty("healthChecks")
    HealthCheck healthChecks;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
