/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The configuration details for the WAAS policy. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PolicyConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PolicyConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "certificateId",
        "isHttpsEnabled",
        "isHttpsForced",
        "tlsProtocols",
        "isOriginCompressionEnabled",
        "isBehindCdn",
        "clientAddressHeader",
        "isCacheControlRespected",
        "isResponseBufferingEnabled",
        "cipherGroup",
        "loadBalancingMethod",
        "websocketPathPrefixes",
        "isSniEnabled",
        "healthChecks"
    })
    public PolicyConfig(
            String certificateId,
            Boolean isHttpsEnabled,
            Boolean isHttpsForced,
            java.util.List<TlsProtocols> tlsProtocols,
            Boolean isOriginCompressionEnabled,
            Boolean isBehindCdn,
            ClientAddressHeader clientAddressHeader,
            Boolean isCacheControlRespected,
            Boolean isResponseBufferingEnabled,
            CipherGroup cipherGroup,
            LoadBalancingMethod loadBalancingMethod,
            java.util.List<String> websocketPathPrefixes,
            Boolean isSniEnabled,
            HealthCheck healthChecks) {
        super();
        this.certificateId = certificateId;
        this.isHttpsEnabled = isHttpsEnabled;
        this.isHttpsForced = isHttpsForced;
        this.tlsProtocols = tlsProtocols;
        this.isOriginCompressionEnabled = isOriginCompressionEnabled;
        this.isBehindCdn = isBehindCdn;
        this.clientAddressHeader = clientAddressHeader;
        this.isCacheControlRespected = isCacheControlRespected;
        this.isResponseBufferingEnabled = isResponseBufferingEnabled;
        this.cipherGroup = cipherGroup;
        this.loadBalancingMethod = loadBalancingMethod;
        this.websocketPathPrefixes = websocketPathPrefixes;
        this.isSniEnabled = isSniEnabled;
        this.healthChecks = healthChecks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the SSL certificate to use if HTTPS is supported. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        /**
         * The OCID of the SSL certificate to use if HTTPS is supported.
         *
         * @param certificateId the value to set
         * @return this builder
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }
        /**
         * Enable or disable HTTPS support. If true, a {@code certificateId} is required. If
         * unspecified, defaults to {@code false}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isHttpsEnabled")
        private Boolean isHttpsEnabled;

        /**
         * Enable or disable HTTPS support. If true, a {@code certificateId} is required. If
         * unspecified, defaults to {@code false}.
         *
         * @param isHttpsEnabled the value to set
         * @return this builder
         */
        public Builder isHttpsEnabled(Boolean isHttpsEnabled) {
            this.isHttpsEnabled = isHttpsEnabled;
            this.__explicitlySet__.add("isHttpsEnabled");
            return this;
        }
        /** Force HTTP to HTTPS redirection. If unspecified, defaults to {@code false}. */
        @com.fasterxml.jackson.annotation.JsonProperty("isHttpsForced")
        private Boolean isHttpsForced;

        /**
         * Force HTTP to HTTPS redirection. If unspecified, defaults to {@code false}.
         *
         * @param isHttpsForced the value to set
         * @return this builder
         */
        public Builder isHttpsForced(Boolean isHttpsForced) {
            this.isHttpsForced = isHttpsForced;
            this.__explicitlySet__.add("isHttpsForced");
            return this;
        }
        /**
         * A list of allowed TLS protocols. Only applicable when HTTPS support is enabled. The TLS
         * protocol is negotiated while the request is connecting and the most recent protocol
         * supported by both the edge node and client browser will be selected. If no such version
         * exists, the connection will be aborted. - **TLS_V1:** corresponds to TLS 1.0
         * specification.
         *
         * <p>- **TLS_V1_1:** corresponds to TLS 1.1 specification.
         *
         * <p>- **TLS_V1_2:** corresponds to TLS 1.2 specification.
         *
         * <p>- **TLS_V1_3:** corresponds to TLS 1.3 specification.
         *
         * <p>Enabled TLS protocols must go in a row. For example if {@code TLS_v1_1} and {@code
         * TLS_V1_3} are enabled, {@code TLS_V1_2} must be enabled too.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tlsProtocols")
        private java.util.List<TlsProtocols> tlsProtocols;

        /**
         * A list of allowed TLS protocols. Only applicable when HTTPS support is enabled. The TLS
         * protocol is negotiated while the request is connecting and the most recent protocol
         * supported by both the edge node and client browser will be selected. If no such version
         * exists, the connection will be aborted. - **TLS_V1:** corresponds to TLS 1.0
         * specification.
         *
         * <p>- **TLS_V1_1:** corresponds to TLS 1.1 specification.
         *
         * <p>- **TLS_V1_2:** corresponds to TLS 1.2 specification.
         *
         * <p>- **TLS_V1_3:** corresponds to TLS 1.3 specification.
         *
         * <p>Enabled TLS protocols must go in a row. For example if {@code TLS_v1_1} and {@code
         * TLS_V1_3} are enabled, {@code TLS_V1_2} must be enabled too.
         *
         * @param tlsProtocols the value to set
         * @return this builder
         */
        public Builder tlsProtocols(java.util.List<TlsProtocols> tlsProtocols) {
            this.tlsProtocols = tlsProtocols;
            this.__explicitlySet__.add("tlsProtocols");
            return this;
        }
        /**
         * Enable or disable GZIP compression of origin responses. If enabled, the header {@code
         * Accept-Encoding: gzip} is sent to origin, otherwise, the empty {@code Accept-Encoding:}
         * header is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOriginCompressionEnabled")
        private Boolean isOriginCompressionEnabled;

        /**
         * Enable or disable GZIP compression of origin responses. If enabled, the header {@code
         * Accept-Encoding: gzip} is sent to origin, otherwise, the empty {@code Accept-Encoding:}
         * header is used.
         *
         * @param isOriginCompressionEnabled the value to set
         * @return this builder
         */
        public Builder isOriginCompressionEnabled(Boolean isOriginCompressionEnabled) {
            this.isOriginCompressionEnabled = isOriginCompressionEnabled;
            this.__explicitlySet__.add("isOriginCompressionEnabled");
            return this;
        }
        /**
         * Enabling {@code isBehindCdn} allows for the collection of IP addresses from client
         * requests if the WAF is connected to a CDN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isBehindCdn")
        private Boolean isBehindCdn;

        /**
         * Enabling {@code isBehindCdn} allows for the collection of IP addresses from client
         * requests if the WAF is connected to a CDN.
         *
         * @param isBehindCdn the value to set
         * @return this builder
         */
        public Builder isBehindCdn(Boolean isBehindCdn) {
            this.isBehindCdn = isBehindCdn;
            this.__explicitlySet__.add("isBehindCdn");
            return this;
        }
        /**
         * Specifies an HTTP header name which is treated as the connecting client's IP address.
         * Applicable only if {@code isBehindCdn} is enabled.
         *
         * <p>The edge node reads this header and its value and sets the client IP address as
         * specified. It does not create the header if the header is not present in the request. If
         * the header is not present, the connecting IP address will be used as the client's true IP
         * address. It uses the last IP address in the header's value as the true IP address.
         *
         * <p>Example: {@code X-Client-Ip: 11.1.1.1, 13.3.3.3}
         *
         * <p>In the case of multiple headers with the same name, only the first header will be
         * used. It is assumed that CDN sets the correct client IP address to prevent spoofing.
         *
         * <p>- **X_FORWARDED_FOR:** Corresponds to {@code X-Forwarded-For} header name.
         *
         * <p>- **X_CLIENT_IP:** Corresponds to {@code X-Client-Ip} header name.
         *
         * <p>- **X_REAL_IP:** Corresponds to {@code X-Real-Ip} header name.
         *
         * <p>- **CLIENT_IP:** Corresponds to {@code Client-Ip} header name.
         *
         * <p>- **TRUE_CLIENT_IP:** Corresponds to {@code True-Client-Ip} header name.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientAddressHeader")
        private ClientAddressHeader clientAddressHeader;

        /**
         * Specifies an HTTP header name which is treated as the connecting client's IP address.
         * Applicable only if {@code isBehindCdn} is enabled.
         *
         * <p>The edge node reads this header and its value and sets the client IP address as
         * specified. It does not create the header if the header is not present in the request. If
         * the header is not present, the connecting IP address will be used as the client's true IP
         * address. It uses the last IP address in the header's value as the true IP address.
         *
         * <p>Example: {@code X-Client-Ip: 11.1.1.1, 13.3.3.3}
         *
         * <p>In the case of multiple headers with the same name, only the first header will be
         * used. It is assumed that CDN sets the correct client IP address to prevent spoofing.
         *
         * <p>- **X_FORWARDED_FOR:** Corresponds to {@code X-Forwarded-For} header name.
         *
         * <p>- **X_CLIENT_IP:** Corresponds to {@code X-Client-Ip} header name.
         *
         * <p>- **X_REAL_IP:** Corresponds to {@code X-Real-Ip} header name.
         *
         * <p>- **CLIENT_IP:** Corresponds to {@code Client-Ip} header name.
         *
         * <p>- **TRUE_CLIENT_IP:** Corresponds to {@code True-Client-Ip} header name.
         *
         * @param clientAddressHeader the value to set
         * @return this builder
         */
        public Builder clientAddressHeader(ClientAddressHeader clientAddressHeader) {
            this.clientAddressHeader = clientAddressHeader;
            this.__explicitlySet__.add("clientAddressHeader");
            return this;
        }
        /**
         * Enable or disable automatic content caching based on the response {@code cache-control}
         * header. This feature enables the origin to act as a proxy cache. Caching is usually
         * defined using {@code cache-control} header. For example {@code cache-control:
         * max-age=120} means that the returned resource is valid for 120 seconds. Caching rules
         * will overwrite this setting.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCacheControlRespected")
        private Boolean isCacheControlRespected;

        /**
         * Enable or disable automatic content caching based on the response {@code cache-control}
         * header. This feature enables the origin to act as a proxy cache. Caching is usually
         * defined using {@code cache-control} header. For example {@code cache-control:
         * max-age=120} means that the returned resource is valid for 120 seconds. Caching rules
         * will overwrite this setting.
         *
         * @param isCacheControlRespected the value to set
         * @return this builder
         */
        public Builder isCacheControlRespected(Boolean isCacheControlRespected) {
            this.isCacheControlRespected = isCacheControlRespected;
            this.__explicitlySet__.add("isCacheControlRespected");
            return this;
        }
        /**
         * Enable or disable buffering of responses from the origin. Buffering improves overall
         * stability in case of network issues, but slightly increases Time To First Byte.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isResponseBufferingEnabled")
        private Boolean isResponseBufferingEnabled;

        /**
         * Enable or disable buffering of responses from the origin. Buffering improves overall
         * stability in case of network issues, but slightly increases Time To First Byte.
         *
         * @param isResponseBufferingEnabled the value to set
         * @return this builder
         */
        public Builder isResponseBufferingEnabled(Boolean isResponseBufferingEnabled) {
            this.isResponseBufferingEnabled = isResponseBufferingEnabled;
            this.__explicitlySet__.add("isResponseBufferingEnabled");
            return this;
        }
        /**
         * The set cipher group for the configured TLS protocol. This sets the configuration for the
         * TLS connections between clients and edge nodes only. - **DEFAULT:** Cipher group supports
         * TLS 1.0, TLS 1.1, TLS 1.2, TLS 1.3 protocols. It has the following ciphers enabled:
         * {@code
         * ECDHE-RSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-ECDSA-AES256-GCM-SHA384:DHE-RSA-AES128-GCM-SHA256:DHE-DSS-AES128-GCM-SHA256:kEDH+AESGCM:ECDHE-RSA-AES128-SHA256:ECDHE-ECDSA-AES128-SHA256:ECDHE-RSA-AES128-SHA:ECDHE-ECDSA-AES128-SHA:ECDHE-RSA-AES256-SHA384:ECDHE-ECDSA-AES256-SHA384:ECDHE-RSA-AES256-SHA:ECDHE-ECDSA-AES256-SHA:DHE-RSA-AES128-SHA256:DHE-RSA-AES128-SHA:DHE-DSS-AES128-SHA256:DHE-RSA-AES256-SHA256:DHE-DSS-AES256-SHA:DHE-RSA-AES256-SHA:AES128-GCM-SHA256:AES256-GCM-SHA384:AES128-SHA256:AES256-SHA256:AES128-SHA:AES256-SHA:AES:CAMELLIA:!DES-CBC3-SHA:!aNULL:!eNULL:!EXPORT:!DES:!RC4:!MD5:!PSK:!aECDH:!EDH-DSS-DES-CBC3-SHA:!EDH-RSA-DES-CBC3-SHA:!KRB5-DES-CBC3-SHA}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cipherGroup")
        private CipherGroup cipherGroup;

        /**
         * The set cipher group for the configured TLS protocol. This sets the configuration for the
         * TLS connections between clients and edge nodes only. - **DEFAULT:** Cipher group supports
         * TLS 1.0, TLS 1.1, TLS 1.2, TLS 1.3 protocols. It has the following ciphers enabled:
         * {@code
         * ECDHE-RSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-ECDSA-AES256-GCM-SHA384:DHE-RSA-AES128-GCM-SHA256:DHE-DSS-AES128-GCM-SHA256:kEDH+AESGCM:ECDHE-RSA-AES128-SHA256:ECDHE-ECDSA-AES128-SHA256:ECDHE-RSA-AES128-SHA:ECDHE-ECDSA-AES128-SHA:ECDHE-RSA-AES256-SHA384:ECDHE-ECDSA-AES256-SHA384:ECDHE-RSA-AES256-SHA:ECDHE-ECDSA-AES256-SHA:DHE-RSA-AES128-SHA256:DHE-RSA-AES128-SHA:DHE-DSS-AES128-SHA256:DHE-RSA-AES256-SHA256:DHE-DSS-AES256-SHA:DHE-RSA-AES256-SHA:AES128-GCM-SHA256:AES256-GCM-SHA384:AES128-SHA256:AES256-SHA256:AES128-SHA:AES256-SHA:AES:CAMELLIA:!DES-CBC3-SHA:!aNULL:!eNULL:!EXPORT:!DES:!RC4:!MD5:!PSK:!aECDH:!EDH-DSS-DES-CBC3-SHA:!EDH-RSA-DES-CBC3-SHA:!KRB5-DES-CBC3-SHA}
         *
         * @param cipherGroup the value to set
         * @return this builder
         */
        public Builder cipherGroup(CipherGroup cipherGroup) {
            this.cipherGroup = cipherGroup;
            this.__explicitlySet__.add("cipherGroup");
            return this;
        }
        /** An object that represents a load balancing method and its properties. */
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancingMethod")
        private LoadBalancingMethod loadBalancingMethod;

        /**
         * An object that represents a load balancing method and its properties.
         *
         * @param loadBalancingMethod the value to set
         * @return this builder
         */
        public Builder loadBalancingMethod(LoadBalancingMethod loadBalancingMethod) {
            this.loadBalancingMethod = loadBalancingMethod;
            this.__explicitlySet__.add("loadBalancingMethod");
            return this;
        }
        /**
         * ModSecurity is not capable to inspect WebSockets. Therefore paths specified here have WAF
         * disabled if Connection request header from the client has the value Upgrade (case
         * insensitive matching) and Upgrade request header has the value websocket (case
         * insensitive matching). Paths matches if the concatenation of request URL path and query
         * starts with the contents of the one of {@code websocketPathPrefixes} array value. In All
         * other cases challenges, like JSC, HIC and etc., remain active.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("websocketPathPrefixes")
        private java.util.List<String> websocketPathPrefixes;

        /**
         * ModSecurity is not capable to inspect WebSockets. Therefore paths specified here have WAF
         * disabled if Connection request header from the client has the value Upgrade (case
         * insensitive matching) and Upgrade request header has the value websocket (case
         * insensitive matching). Paths matches if the concatenation of request URL path and query
         * starts with the contents of the one of {@code websocketPathPrefixes} array value. In All
         * other cases challenges, like JSC, HIC and etc., remain active.
         *
         * @param websocketPathPrefixes the value to set
         * @return this builder
         */
        public Builder websocketPathPrefixes(java.util.List<String> websocketPathPrefixes) {
            this.websocketPathPrefixes = websocketPathPrefixes;
            this.__explicitlySet__.add("websocketPathPrefixes");
            return this;
        }
        /**
         * SNI stands for Server Name Indication and is an extension of the TLS protocol. It
         * indicates which hostname is being contacted by the browser at the beginning of the
         * 'handshake'-process. This allows a server to connect multiple SSL Certificates to one IP
         * address and port.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSniEnabled")
        private Boolean isSniEnabled;

        /**
         * SNI stands for Server Name Indication and is an extension of the TLS protocol. It
         * indicates which hostname is being contacted by the browser at the beginning of the
         * 'handshake'-process. This allows a server to connect multiple SSL Certificates to one IP
         * address and port.
         *
         * @param isSniEnabled the value to set
         * @return this builder
         */
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
            PolicyConfig model =
                    new PolicyConfig(
                            this.certificateId,
                            this.isHttpsEnabled,
                            this.isHttpsForced,
                            this.tlsProtocols,
                            this.isOriginCompressionEnabled,
                            this.isBehindCdn,
                            this.clientAddressHeader,
                            this.isCacheControlRespected,
                            this.isResponseBufferingEnabled,
                            this.cipherGroup,
                            this.loadBalancingMethod,
                            this.websocketPathPrefixes,
                            this.isSniEnabled,
                            this.healthChecks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PolicyConfig model) {
            if (model.wasPropertyExplicitlySet("certificateId")) {
                this.certificateId(model.getCertificateId());
            }
            if (model.wasPropertyExplicitlySet("isHttpsEnabled")) {
                this.isHttpsEnabled(model.getIsHttpsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isHttpsForced")) {
                this.isHttpsForced(model.getIsHttpsForced());
            }
            if (model.wasPropertyExplicitlySet("tlsProtocols")) {
                this.tlsProtocols(model.getTlsProtocols());
            }
            if (model.wasPropertyExplicitlySet("isOriginCompressionEnabled")) {
                this.isOriginCompressionEnabled(model.getIsOriginCompressionEnabled());
            }
            if (model.wasPropertyExplicitlySet("isBehindCdn")) {
                this.isBehindCdn(model.getIsBehindCdn());
            }
            if (model.wasPropertyExplicitlySet("clientAddressHeader")) {
                this.clientAddressHeader(model.getClientAddressHeader());
            }
            if (model.wasPropertyExplicitlySet("isCacheControlRespected")) {
                this.isCacheControlRespected(model.getIsCacheControlRespected());
            }
            if (model.wasPropertyExplicitlySet("isResponseBufferingEnabled")) {
                this.isResponseBufferingEnabled(model.getIsResponseBufferingEnabled());
            }
            if (model.wasPropertyExplicitlySet("cipherGroup")) {
                this.cipherGroup(model.getCipherGroup());
            }
            if (model.wasPropertyExplicitlySet("loadBalancingMethod")) {
                this.loadBalancingMethod(model.getLoadBalancingMethod());
            }
            if (model.wasPropertyExplicitlySet("websocketPathPrefixes")) {
                this.websocketPathPrefixes(model.getWebsocketPathPrefixes());
            }
            if (model.wasPropertyExplicitlySet("isSniEnabled")) {
                this.isSniEnabled(model.getIsSniEnabled());
            }
            if (model.wasPropertyExplicitlySet("healthChecks")) {
                this.healthChecks(model.getHealthChecks());
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

    /** The OCID of the SSL certificate to use if HTTPS is supported. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    private final String certificateId;

    /**
     * The OCID of the SSL certificate to use if HTTPS is supported.
     *
     * @return the value
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * Enable or disable HTTPS support. If true, a {@code certificateId} is required. If
     * unspecified, defaults to {@code false}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isHttpsEnabled")
    private final Boolean isHttpsEnabled;

    /**
     * Enable or disable HTTPS support. If true, a {@code certificateId} is required. If
     * unspecified, defaults to {@code false}.
     *
     * @return the value
     */
    public Boolean getIsHttpsEnabled() {
        return isHttpsEnabled;
    }

    /** Force HTTP to HTTPS redirection. If unspecified, defaults to {@code false}. */
    @com.fasterxml.jackson.annotation.JsonProperty("isHttpsForced")
    private final Boolean isHttpsForced;

    /**
     * Force HTTP to HTTPS redirection. If unspecified, defaults to {@code false}.
     *
     * @return the value
     */
    public Boolean getIsHttpsForced() {
        return isHttpsForced;
    }

    /** */
    public enum TlsProtocols implements com.oracle.bmc.http.internal.BmcEnum {
        TlsV1("TLS_V1"),
        TlsV11("TLS_V1_1"),
        TlsV12("TLS_V1_2"),
        TlsV13("TLS_V1_3"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TlsProtocols.class);

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
     * A list of allowed TLS protocols. Only applicable when HTTPS support is enabled. The TLS
     * protocol is negotiated while the request is connecting and the most recent protocol supported
     * by both the edge node and client browser will be selected. If no such version exists, the
     * connection will be aborted. - **TLS_V1:** corresponds to TLS 1.0 specification.
     *
     * <p>- **TLS_V1_1:** corresponds to TLS 1.1 specification.
     *
     * <p>- **TLS_V1_2:** corresponds to TLS 1.2 specification.
     *
     * <p>- **TLS_V1_3:** corresponds to TLS 1.3 specification.
     *
     * <p>Enabled TLS protocols must go in a row. For example if {@code TLS_v1_1} and {@code
     * TLS_V1_3} are enabled, {@code TLS_V1_2} must be enabled too.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsProtocols")
    private final java.util.List<TlsProtocols> tlsProtocols;

    /**
     * A list of allowed TLS protocols. Only applicable when HTTPS support is enabled. The TLS
     * protocol is negotiated while the request is connecting and the most recent protocol supported
     * by both the edge node and client browser will be selected. If no such version exists, the
     * connection will be aborted. - **TLS_V1:** corresponds to TLS 1.0 specification.
     *
     * <p>- **TLS_V1_1:** corresponds to TLS 1.1 specification.
     *
     * <p>- **TLS_V1_2:** corresponds to TLS 1.2 specification.
     *
     * <p>- **TLS_V1_3:** corresponds to TLS 1.3 specification.
     *
     * <p>Enabled TLS protocols must go in a row. For example if {@code TLS_v1_1} and {@code
     * TLS_V1_3} are enabled, {@code TLS_V1_2} must be enabled too.
     *
     * @return the value
     */
    public java.util.List<TlsProtocols> getTlsProtocols() {
        return tlsProtocols;
    }

    /**
     * Enable or disable GZIP compression of origin responses. If enabled, the header {@code
     * Accept-Encoding: gzip} is sent to origin, otherwise, the empty {@code Accept-Encoding:}
     * header is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOriginCompressionEnabled")
    private final Boolean isOriginCompressionEnabled;

    /**
     * Enable or disable GZIP compression of origin responses. If enabled, the header {@code
     * Accept-Encoding: gzip} is sent to origin, otherwise, the empty {@code Accept-Encoding:}
     * header is used.
     *
     * @return the value
     */
    public Boolean getIsOriginCompressionEnabled() {
        return isOriginCompressionEnabled;
    }

    /**
     * Enabling {@code isBehindCdn} allows for the collection of IP addresses from client requests
     * if the WAF is connected to a CDN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isBehindCdn")
    private final Boolean isBehindCdn;

    /**
     * Enabling {@code isBehindCdn} allows for the collection of IP addresses from client requests
     * if the WAF is connected to a CDN.
     *
     * @return the value
     */
    public Boolean getIsBehindCdn() {
        return isBehindCdn;
    }

    /**
     * Specifies an HTTP header name which is treated as the connecting client's IP address.
     * Applicable only if {@code isBehindCdn} is enabled.
     *
     * <p>The edge node reads this header and its value and sets the client IP address as specified.
     * It does not create the header if the header is not present in the request. If the header is
     * not present, the connecting IP address will be used as the client's true IP address. It uses
     * the last IP address in the header's value as the true IP address.
     *
     * <p>Example: {@code X-Client-Ip: 11.1.1.1, 13.3.3.3}
     *
     * <p>In the case of multiple headers with the same name, only the first header will be used. It
     * is assumed that CDN sets the correct client IP address to prevent spoofing.
     *
     * <p>- **X_FORWARDED_FOR:** Corresponds to {@code X-Forwarded-For} header name.
     *
     * <p>- **X_CLIENT_IP:** Corresponds to {@code X-Client-Ip} header name.
     *
     * <p>- **X_REAL_IP:** Corresponds to {@code X-Real-Ip} header name.
     *
     * <p>- **CLIENT_IP:** Corresponds to {@code Client-Ip} header name.
     *
     * <p>- **TRUE_CLIENT_IP:** Corresponds to {@code True-Client-Ip} header name.
     */
    public enum ClientAddressHeader implements com.oracle.bmc.http.internal.BmcEnum {
        XForwardedFor("X_FORWARDED_FOR"),
        XClientIp("X_CLIENT_IP"),
        XRealIp("X_REAL_IP"),
        ClientIp("CLIENT_IP"),
        TrueClientIp("TRUE_CLIENT_IP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ClientAddressHeader.class);

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
     * Specifies an HTTP header name which is treated as the connecting client's IP address.
     * Applicable only if {@code isBehindCdn} is enabled.
     *
     * <p>The edge node reads this header and its value and sets the client IP address as specified.
     * It does not create the header if the header is not present in the request. If the header is
     * not present, the connecting IP address will be used as the client's true IP address. It uses
     * the last IP address in the header's value as the true IP address.
     *
     * <p>Example: {@code X-Client-Ip: 11.1.1.1, 13.3.3.3}
     *
     * <p>In the case of multiple headers with the same name, only the first header will be used. It
     * is assumed that CDN sets the correct client IP address to prevent spoofing.
     *
     * <p>- **X_FORWARDED_FOR:** Corresponds to {@code X-Forwarded-For} header name.
     *
     * <p>- **X_CLIENT_IP:** Corresponds to {@code X-Client-Ip} header name.
     *
     * <p>- **X_REAL_IP:** Corresponds to {@code X-Real-Ip} header name.
     *
     * <p>- **CLIENT_IP:** Corresponds to {@code Client-Ip} header name.
     *
     * <p>- **TRUE_CLIENT_IP:** Corresponds to {@code True-Client-Ip} header name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientAddressHeader")
    private final ClientAddressHeader clientAddressHeader;

    /**
     * Specifies an HTTP header name which is treated as the connecting client's IP address.
     * Applicable only if {@code isBehindCdn} is enabled.
     *
     * <p>The edge node reads this header and its value and sets the client IP address as specified.
     * It does not create the header if the header is not present in the request. If the header is
     * not present, the connecting IP address will be used as the client's true IP address. It uses
     * the last IP address in the header's value as the true IP address.
     *
     * <p>Example: {@code X-Client-Ip: 11.1.1.1, 13.3.3.3}
     *
     * <p>In the case of multiple headers with the same name, only the first header will be used. It
     * is assumed that CDN sets the correct client IP address to prevent spoofing.
     *
     * <p>- **X_FORWARDED_FOR:** Corresponds to {@code X-Forwarded-For} header name.
     *
     * <p>- **X_CLIENT_IP:** Corresponds to {@code X-Client-Ip} header name.
     *
     * <p>- **X_REAL_IP:** Corresponds to {@code X-Real-Ip} header name.
     *
     * <p>- **CLIENT_IP:** Corresponds to {@code Client-Ip} header name.
     *
     * <p>- **TRUE_CLIENT_IP:** Corresponds to {@code True-Client-Ip} header name.
     *
     * @return the value
     */
    public ClientAddressHeader getClientAddressHeader() {
        return clientAddressHeader;
    }

    /**
     * Enable or disable automatic content caching based on the response {@code cache-control}
     * header. This feature enables the origin to act as a proxy cache. Caching is usually defined
     * using {@code cache-control} header. For example {@code cache-control: max-age=120} means that
     * the returned resource is valid for 120 seconds. Caching rules will overwrite this setting.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCacheControlRespected")
    private final Boolean isCacheControlRespected;

    /**
     * Enable or disable automatic content caching based on the response {@code cache-control}
     * header. This feature enables the origin to act as a proxy cache. Caching is usually defined
     * using {@code cache-control} header. For example {@code cache-control: max-age=120} means that
     * the returned resource is valid for 120 seconds. Caching rules will overwrite this setting.
     *
     * @return the value
     */
    public Boolean getIsCacheControlRespected() {
        return isCacheControlRespected;
    }

    /**
     * Enable or disable buffering of responses from the origin. Buffering improves overall
     * stability in case of network issues, but slightly increases Time To First Byte.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isResponseBufferingEnabled")
    private final Boolean isResponseBufferingEnabled;

    /**
     * Enable or disable buffering of responses from the origin. Buffering improves overall
     * stability in case of network issues, but slightly increases Time To First Byte.
     *
     * @return the value
     */
    public Boolean getIsResponseBufferingEnabled() {
        return isResponseBufferingEnabled;
    }

    /**
     * The set cipher group for the configured TLS protocol. This sets the configuration for the TLS
     * connections between clients and edge nodes only. - **DEFAULT:** Cipher group supports TLS
     * 1.0, TLS 1.1, TLS 1.2, TLS 1.3 protocols. It has the following ciphers enabled: {@code
     * ECDHE-RSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-ECDSA-AES256-GCM-SHA384:DHE-RSA-AES128-GCM-SHA256:DHE-DSS-AES128-GCM-SHA256:kEDH+AESGCM:ECDHE-RSA-AES128-SHA256:ECDHE-ECDSA-AES128-SHA256:ECDHE-RSA-AES128-SHA:ECDHE-ECDSA-AES128-SHA:ECDHE-RSA-AES256-SHA384:ECDHE-ECDSA-AES256-SHA384:ECDHE-RSA-AES256-SHA:ECDHE-ECDSA-AES256-SHA:DHE-RSA-AES128-SHA256:DHE-RSA-AES128-SHA:DHE-DSS-AES128-SHA256:DHE-RSA-AES256-SHA256:DHE-DSS-AES256-SHA:DHE-RSA-AES256-SHA:AES128-GCM-SHA256:AES256-GCM-SHA384:AES128-SHA256:AES256-SHA256:AES128-SHA:AES256-SHA:AES:CAMELLIA:!DES-CBC3-SHA:!aNULL:!eNULL:!EXPORT:!DES:!RC4:!MD5:!PSK:!aECDH:!EDH-DSS-DES-CBC3-SHA:!EDH-RSA-DES-CBC3-SHA:!KRB5-DES-CBC3-SHA}
     */
    public enum CipherGroup implements com.oracle.bmc.http.internal.BmcEnum {
        Default("DEFAULT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CipherGroup.class);

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
     * The set cipher group for the configured TLS protocol. This sets the configuration for the TLS
     * connections between clients and edge nodes only. - **DEFAULT:** Cipher group supports TLS
     * 1.0, TLS 1.1, TLS 1.2, TLS 1.3 protocols. It has the following ciphers enabled: {@code
     * ECDHE-RSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-ECDSA-AES256-GCM-SHA384:DHE-RSA-AES128-GCM-SHA256:DHE-DSS-AES128-GCM-SHA256:kEDH+AESGCM:ECDHE-RSA-AES128-SHA256:ECDHE-ECDSA-AES128-SHA256:ECDHE-RSA-AES128-SHA:ECDHE-ECDSA-AES128-SHA:ECDHE-RSA-AES256-SHA384:ECDHE-ECDSA-AES256-SHA384:ECDHE-RSA-AES256-SHA:ECDHE-ECDSA-AES256-SHA:DHE-RSA-AES128-SHA256:DHE-RSA-AES128-SHA:DHE-DSS-AES128-SHA256:DHE-RSA-AES256-SHA256:DHE-DSS-AES256-SHA:DHE-RSA-AES256-SHA:AES128-GCM-SHA256:AES256-GCM-SHA384:AES128-SHA256:AES256-SHA256:AES128-SHA:AES256-SHA:AES:CAMELLIA:!DES-CBC3-SHA:!aNULL:!eNULL:!EXPORT:!DES:!RC4:!MD5:!PSK:!aECDH:!EDH-DSS-DES-CBC3-SHA:!EDH-RSA-DES-CBC3-SHA:!KRB5-DES-CBC3-SHA}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cipherGroup")
    private final CipherGroup cipherGroup;

    /**
     * The set cipher group for the configured TLS protocol. This sets the configuration for the TLS
     * connections between clients and edge nodes only. - **DEFAULT:** Cipher group supports TLS
     * 1.0, TLS 1.1, TLS 1.2, TLS 1.3 protocols. It has the following ciphers enabled: {@code
     * ECDHE-RSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-ECDSA-AES256-GCM-SHA384:DHE-RSA-AES128-GCM-SHA256:DHE-DSS-AES128-GCM-SHA256:kEDH+AESGCM:ECDHE-RSA-AES128-SHA256:ECDHE-ECDSA-AES128-SHA256:ECDHE-RSA-AES128-SHA:ECDHE-ECDSA-AES128-SHA:ECDHE-RSA-AES256-SHA384:ECDHE-ECDSA-AES256-SHA384:ECDHE-RSA-AES256-SHA:ECDHE-ECDSA-AES256-SHA:DHE-RSA-AES128-SHA256:DHE-RSA-AES128-SHA:DHE-DSS-AES128-SHA256:DHE-RSA-AES256-SHA256:DHE-DSS-AES256-SHA:DHE-RSA-AES256-SHA:AES128-GCM-SHA256:AES256-GCM-SHA384:AES128-SHA256:AES256-SHA256:AES128-SHA:AES256-SHA:AES:CAMELLIA:!DES-CBC3-SHA:!aNULL:!eNULL:!EXPORT:!DES:!RC4:!MD5:!PSK:!aECDH:!EDH-DSS-DES-CBC3-SHA:!EDH-RSA-DES-CBC3-SHA:!KRB5-DES-CBC3-SHA}
     *
     * @return the value
     */
    public CipherGroup getCipherGroup() {
        return cipherGroup;
    }

    /** An object that represents a load balancing method and its properties. */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancingMethod")
    private final LoadBalancingMethod loadBalancingMethod;

    /**
     * An object that represents a load balancing method and its properties.
     *
     * @return the value
     */
    public LoadBalancingMethod getLoadBalancingMethod() {
        return loadBalancingMethod;
    }

    /**
     * ModSecurity is not capable to inspect WebSockets. Therefore paths specified here have WAF
     * disabled if Connection request header from the client has the value Upgrade (case insensitive
     * matching) and Upgrade request header has the value websocket (case insensitive matching).
     * Paths matches if the concatenation of request URL path and query starts with the contents of
     * the one of {@code websocketPathPrefixes} array value. In All other cases challenges, like
     * JSC, HIC and etc., remain active.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("websocketPathPrefixes")
    private final java.util.List<String> websocketPathPrefixes;

    /**
     * ModSecurity is not capable to inspect WebSockets. Therefore paths specified here have WAF
     * disabled if Connection request header from the client has the value Upgrade (case insensitive
     * matching) and Upgrade request header has the value websocket (case insensitive matching).
     * Paths matches if the concatenation of request URL path and query starts with the contents of
     * the one of {@code websocketPathPrefixes} array value. In All other cases challenges, like
     * JSC, HIC and etc., remain active.
     *
     * @return the value
     */
    public java.util.List<String> getWebsocketPathPrefixes() {
        return websocketPathPrefixes;
    }

    /**
     * SNI stands for Server Name Indication and is an extension of the TLS protocol. It indicates
     * which hostname is being contacted by the browser at the beginning of the 'handshake'-process.
     * This allows a server to connect multiple SSL Certificates to one IP address and port.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSniEnabled")
    private final Boolean isSniEnabled;

    /**
     * SNI stands for Server Name Indication and is an extension of the TLS protocol. It indicates
     * which hostname is being contacted by the browser at the beginning of the 'handshake'-process.
     * This allows a server to connect multiple SSL Certificates to one IP address and port.
     *
     * @return the value
     */
    public Boolean getIsSniEnabled() {
        return isSniEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("healthChecks")
    private final HealthCheck healthChecks;

    public HealthCheck getHealthChecks() {
        return healthChecks;
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
        sb.append("PolicyConfig(");
        sb.append("super=").append(super.toString());
        sb.append("certificateId=").append(String.valueOf(this.certificateId));
        sb.append(", isHttpsEnabled=").append(String.valueOf(this.isHttpsEnabled));
        sb.append(", isHttpsForced=").append(String.valueOf(this.isHttpsForced));
        sb.append(", tlsProtocols=").append(String.valueOf(this.tlsProtocols));
        sb.append(", isOriginCompressionEnabled=")
                .append(String.valueOf(this.isOriginCompressionEnabled));
        sb.append(", isBehindCdn=").append(String.valueOf(this.isBehindCdn));
        sb.append(", clientAddressHeader=").append(String.valueOf(this.clientAddressHeader));
        sb.append(", isCacheControlRespected=")
                .append(String.valueOf(this.isCacheControlRespected));
        sb.append(", isResponseBufferingEnabled=")
                .append(String.valueOf(this.isResponseBufferingEnabled));
        sb.append(", cipherGroup=").append(String.valueOf(this.cipherGroup));
        sb.append(", loadBalancingMethod=").append(String.valueOf(this.loadBalancingMethod));
        sb.append(", websocketPathPrefixes=").append(String.valueOf(this.websocketPathPrefixes));
        sb.append(", isSniEnabled=").append(String.valueOf(this.isSniEnabled));
        sb.append(", healthChecks=").append(String.valueOf(this.healthChecks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PolicyConfig)) {
            return false;
        }

        PolicyConfig other = (PolicyConfig) o;
        return java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(this.isHttpsEnabled, other.isHttpsEnabled)
                && java.util.Objects.equals(this.isHttpsForced, other.isHttpsForced)
                && java.util.Objects.equals(this.tlsProtocols, other.tlsProtocols)
                && java.util.Objects.equals(
                        this.isOriginCompressionEnabled, other.isOriginCompressionEnabled)
                && java.util.Objects.equals(this.isBehindCdn, other.isBehindCdn)
                && java.util.Objects.equals(this.clientAddressHeader, other.clientAddressHeader)
                && java.util.Objects.equals(
                        this.isCacheControlRespected, other.isCacheControlRespected)
                && java.util.Objects.equals(
                        this.isResponseBufferingEnabled, other.isResponseBufferingEnabled)
                && java.util.Objects.equals(this.cipherGroup, other.cipherGroup)
                && java.util.Objects.equals(this.loadBalancingMethod, other.loadBalancingMethod)
                && java.util.Objects.equals(this.websocketPathPrefixes, other.websocketPathPrefixes)
                && java.util.Objects.equals(this.isSniEnabled, other.isSniEnabled)
                && java.util.Objects.equals(this.healthChecks, other.healthChecks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.certificateId == null ? 43 : this.certificateId.hashCode());
        result =
                (result * PRIME)
                        + (this.isHttpsEnabled == null ? 43 : this.isHttpsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isHttpsForced == null ? 43 : this.isHttpsForced.hashCode());
        result = (result * PRIME) + (this.tlsProtocols == null ? 43 : this.tlsProtocols.hashCode());
        result =
                (result * PRIME)
                        + (this.isOriginCompressionEnabled == null
                                ? 43
                                : this.isOriginCompressionEnabled.hashCode());
        result = (result * PRIME) + (this.isBehindCdn == null ? 43 : this.isBehindCdn.hashCode());
        result =
                (result * PRIME)
                        + (this.clientAddressHeader == null
                                ? 43
                                : this.clientAddressHeader.hashCode());
        result =
                (result * PRIME)
                        + (this.isCacheControlRespected == null
                                ? 43
                                : this.isCacheControlRespected.hashCode());
        result =
                (result * PRIME)
                        + (this.isResponseBufferingEnabled == null
                                ? 43
                                : this.isResponseBufferingEnabled.hashCode());
        result = (result * PRIME) + (this.cipherGroup == null ? 43 : this.cipherGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancingMethod == null
                                ? 43
                                : this.loadBalancingMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.websocketPathPrefixes == null
                                ? 43
                                : this.websocketPathPrefixes.hashCode());
        result = (result * PRIME) + (this.isSniEnabled == null ? 43 : this.isSniEnabled.hashCode());
        result = (result * PRIME) + (this.healthChecks == null ? 43 : this.healthChecks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
