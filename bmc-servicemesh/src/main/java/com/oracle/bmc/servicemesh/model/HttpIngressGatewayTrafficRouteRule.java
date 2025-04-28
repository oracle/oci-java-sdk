/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Rule for routing incoming ingress gateway traffic with HTTP protocol <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HttpIngressGatewayTrafficRouteRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HttpIngressGatewayTrafficRouteRule extends IngressGatewayTrafficRouteRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("ingressGatewayHost")
        private IngressGatewayHostRef ingressGatewayHost;

        public Builder ingressGatewayHost(IngressGatewayHostRef ingressGatewayHost) {
            this.ingressGatewayHost = ingressGatewayHost;
            this.__explicitlySet__.add("ingressGatewayHost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinations")
        private java.util.List<VirtualServiceTrafficRuleTarget> destinations;

        public Builder destinations(java.util.List<VirtualServiceTrafficRuleTarget> destinations) {
            this.destinations = destinations;
            this.__explicitlySet__.add("destinations");
            return this;
        }
        /** Route to match */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Route to match
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /** Match type for the route */
        @com.fasterxml.jackson.annotation.JsonProperty("pathType")
        private PathType pathType;

        /**
         * Match type for the route
         *
         * @param pathType the value to set
         * @return this builder
         */
        public Builder pathType(PathType pathType) {
            this.pathType = pathType;
            this.__explicitlySet__.add("pathType");
            return this;
        }
        /**
         * If true, the rule will check that the content-type header has a application/grpc or one
         * of the various application/grpc+ values.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isGrpc")
        private Boolean isGrpc;

        /**
         * If true, the rule will check that the content-type header has a application/grpc or one
         * of the various application/grpc+ values.
         *
         * @param isGrpc the value to set
         * @return this builder
         */
        public Builder isGrpc(Boolean isGrpc) {
            this.isGrpc = isGrpc;
            this.__explicitlySet__.add("isGrpc");
            return this;
        }
        /**
         * If true, the hostname will be rewritten to the target virtual deployment's DNS hostname.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isHostRewriteEnabled")
        private Boolean isHostRewriteEnabled;

        /**
         * If true, the hostname will be rewritten to the target virtual deployment's DNS hostname.
         *
         * @param isHostRewriteEnabled the value to set
         * @return this builder
         */
        public Builder isHostRewriteEnabled(Boolean isHostRewriteEnabled) {
            this.isHostRewriteEnabled = isHostRewriteEnabled;
            this.__explicitlySet__.add("isHostRewriteEnabled");
            return this;
        }
        /**
         * If true, the matched path prefix will be rewritten to '/' before being directed to the
         * target virtual deployment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPathRewriteEnabled")
        private Boolean isPathRewriteEnabled;

        /**
         * If true, the matched path prefix will be rewritten to '/' before being directed to the
         * target virtual deployment.
         *
         * @param isPathRewriteEnabled the value to set
         * @return this builder
         */
        public Builder isPathRewriteEnabled(Boolean isPathRewriteEnabled) {
            this.isPathRewriteEnabled = isPathRewriteEnabled;
            this.__explicitlySet__.add("isPathRewriteEnabled");
            return this;
        }
        /**
         * The maximum duration in milliseconds for the upstream service to respond to a request. If
         * provided, the timeout value overrides the default timeout of 15 seconds for the HTTP
         * based route rules, and disabled (no timeout) when 'isGrpc' is true. The value 0 (zero)
         * indicates that the timeout is disabled. For streaming responses from the upstream
         * service, consider either keeping the timeout disabled or set a sufficiently high value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requestTimeoutInMs")
        private Long requestTimeoutInMs;

        /**
         * The maximum duration in milliseconds for the upstream service to respond to a request. If
         * provided, the timeout value overrides the default timeout of 15 seconds for the HTTP
         * based route rules, and disabled (no timeout) when 'isGrpc' is true. The value 0 (zero)
         * indicates that the timeout is disabled. For streaming responses from the upstream
         * service, consider either keeping the timeout disabled or set a sufficiently high value.
         *
         * @param requestTimeoutInMs the value to set
         * @return this builder
         */
        public Builder requestTimeoutInMs(Long requestTimeoutInMs) {
            this.requestTimeoutInMs = requestTimeoutInMs;
            this.__explicitlySet__.add("requestTimeoutInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpIngressGatewayTrafficRouteRule build() {
            HttpIngressGatewayTrafficRouteRule model =
                    new HttpIngressGatewayTrafficRouteRule(
                            this.ingressGatewayHost,
                            this.destinations,
                            this.path,
                            this.pathType,
                            this.isGrpc,
                            this.isHostRewriteEnabled,
                            this.isPathRewriteEnabled,
                            this.requestTimeoutInMs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpIngressGatewayTrafficRouteRule model) {
            if (model.wasPropertyExplicitlySet("ingressGatewayHost")) {
                this.ingressGatewayHost(model.getIngressGatewayHost());
            }
            if (model.wasPropertyExplicitlySet("destinations")) {
                this.destinations(model.getDestinations());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("pathType")) {
                this.pathType(model.getPathType());
            }
            if (model.wasPropertyExplicitlySet("isGrpc")) {
                this.isGrpc(model.getIsGrpc());
            }
            if (model.wasPropertyExplicitlySet("isHostRewriteEnabled")) {
                this.isHostRewriteEnabled(model.getIsHostRewriteEnabled());
            }
            if (model.wasPropertyExplicitlySet("isPathRewriteEnabled")) {
                this.isPathRewriteEnabled(model.getIsPathRewriteEnabled());
            }
            if (model.wasPropertyExplicitlySet("requestTimeoutInMs")) {
                this.requestTimeoutInMs(model.getRequestTimeoutInMs());
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
    public HttpIngressGatewayTrafficRouteRule(
            IngressGatewayHostRef ingressGatewayHost,
            java.util.List<VirtualServiceTrafficRuleTarget> destinations,
            String path,
            PathType pathType,
            Boolean isGrpc,
            Boolean isHostRewriteEnabled,
            Boolean isPathRewriteEnabled,
            Long requestTimeoutInMs) {
        super(ingressGatewayHost, destinations);
        this.path = path;
        this.pathType = pathType;
        this.isGrpc = isGrpc;
        this.isHostRewriteEnabled = isHostRewriteEnabled;
        this.isPathRewriteEnabled = isPathRewriteEnabled;
        this.requestTimeoutInMs = requestTimeoutInMs;
    }

    /** Route to match */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Route to match
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /** Match type for the route */
    public enum PathType implements com.oracle.bmc.http.internal.BmcEnum {
        Prefix("PREFIX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PathType.class);

        private final String value;
        private static java.util.Map<String, PathType> map;

        static {
            map = new java.util.HashMap<>();
            for (PathType v : PathType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PathType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PathType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PathType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Match type for the route */
    @com.fasterxml.jackson.annotation.JsonProperty("pathType")
    private final PathType pathType;

    /**
     * Match type for the route
     *
     * @return the value
     */
    public PathType getPathType() {
        return pathType;
    }

    /**
     * If true, the rule will check that the content-type header has a application/grpc or one of
     * the various application/grpc+ values.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isGrpc")
    private final Boolean isGrpc;

    /**
     * If true, the rule will check that the content-type header has a application/grpc or one of
     * the various application/grpc+ values.
     *
     * @return the value
     */
    public Boolean getIsGrpc() {
        return isGrpc;
    }

    /** If true, the hostname will be rewritten to the target virtual deployment's DNS hostname. */
    @com.fasterxml.jackson.annotation.JsonProperty("isHostRewriteEnabled")
    private final Boolean isHostRewriteEnabled;

    /**
     * If true, the hostname will be rewritten to the target virtual deployment's DNS hostname.
     *
     * @return the value
     */
    public Boolean getIsHostRewriteEnabled() {
        return isHostRewriteEnabled;
    }

    /**
     * If true, the matched path prefix will be rewritten to '/' before being directed to the target
     * virtual deployment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPathRewriteEnabled")
    private final Boolean isPathRewriteEnabled;

    /**
     * If true, the matched path prefix will be rewritten to '/' before being directed to the target
     * virtual deployment.
     *
     * @return the value
     */
    public Boolean getIsPathRewriteEnabled() {
        return isPathRewriteEnabled;
    }

    /**
     * The maximum duration in milliseconds for the upstream service to respond to a request. If
     * provided, the timeout value overrides the default timeout of 15 seconds for the HTTP based
     * route rules, and disabled (no timeout) when 'isGrpc' is true. The value 0 (zero) indicates
     * that the timeout is disabled. For streaming responses from the upstream service, consider
     * either keeping the timeout disabled or set a sufficiently high value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestTimeoutInMs")
    private final Long requestTimeoutInMs;

    /**
     * The maximum duration in milliseconds for the upstream service to respond to a request. If
     * provided, the timeout value overrides the default timeout of 15 seconds for the HTTP based
     * route rules, and disabled (no timeout) when 'isGrpc' is true. The value 0 (zero) indicates
     * that the timeout is disabled. For streaming responses from the upstream service, consider
     * either keeping the timeout disabled or set a sufficiently high value.
     *
     * @return the value
     */
    public Long getRequestTimeoutInMs() {
        return requestTimeoutInMs;
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
        sb.append("HttpIngressGatewayTrafficRouteRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", pathType=").append(String.valueOf(this.pathType));
        sb.append(", isGrpc=").append(String.valueOf(this.isGrpc));
        sb.append(", isHostRewriteEnabled=").append(String.valueOf(this.isHostRewriteEnabled));
        sb.append(", isPathRewriteEnabled=").append(String.valueOf(this.isPathRewriteEnabled));
        sb.append(", requestTimeoutInMs=").append(String.valueOf(this.requestTimeoutInMs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpIngressGatewayTrafficRouteRule)) {
            return false;
        }

        HttpIngressGatewayTrafficRouteRule other = (HttpIngressGatewayTrafficRouteRule) o;
        return java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.pathType, other.pathType)
                && java.util.Objects.equals(this.isGrpc, other.isGrpc)
                && java.util.Objects.equals(this.isHostRewriteEnabled, other.isHostRewriteEnabled)
                && java.util.Objects.equals(this.isPathRewriteEnabled, other.isPathRewriteEnabled)
                && java.util.Objects.equals(this.requestTimeoutInMs, other.requestTimeoutInMs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.pathType == null ? 43 : this.pathType.hashCode());
        result = (result * PRIME) + (this.isGrpc == null ? 43 : this.isGrpc.hashCode());
        result =
                (result * PRIME)
                        + (this.isHostRewriteEnabled == null
                                ? 43
                                : this.isHostRewriteEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isPathRewriteEnabled == null
                                ? 43
                                : this.isPathRewriteEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.requestTimeoutInMs == null
                                ? 43
                                : this.requestTimeoutInMs.hashCode());
        return result;
    }
}
