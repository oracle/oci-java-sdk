/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Rule for routing incoming Virtual Service traffic with HTTP protocol <br>
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
        builder = HttpVirtualServiceTrafficRouteRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HttpVirtualServiceTrafficRouteRuleDetails
        extends VirtualServiceTrafficRouteRuleDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("destinations")
        private java.util.List<VirtualDeploymentTrafficRuleTargetDetails> destinations;

        public Builder destinations(
                java.util.List<VirtualDeploymentTrafficRuleTargetDetails> destinations) {
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
         * The maximum duration in milliseconds for the target service to respond to a request. If
         * provided, the timeout value overrides the default timeout of 15 seconds for the HTTP
         * based route rules, and disabled (no timeout) when 'isGrpc' is true. The value 0 (zero)
         * indicates that the timeout is disabled. For streaming responses from the target service,
         * consider either keeping the timeout disabled or set a sufficiently high value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requestTimeoutInMs")
        private Long requestTimeoutInMs;

        /**
         * The maximum duration in milliseconds for the target service to respond to a request. If
         * provided, the timeout value overrides the default timeout of 15 seconds for the HTTP
         * based route rules, and disabled (no timeout) when 'isGrpc' is true. The value 0 (zero)
         * indicates that the timeout is disabled. For streaming responses from the target service,
         * consider either keeping the timeout disabled or set a sufficiently high value.
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

        public HttpVirtualServiceTrafficRouteRuleDetails build() {
            HttpVirtualServiceTrafficRouteRuleDetails model =
                    new HttpVirtualServiceTrafficRouteRuleDetails(
                            this.destinations,
                            this.path,
                            this.pathType,
                            this.isGrpc,
                            this.requestTimeoutInMs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpVirtualServiceTrafficRouteRuleDetails model) {
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
    public HttpVirtualServiceTrafficRouteRuleDetails(
            java.util.List<VirtualDeploymentTrafficRuleTargetDetails> destinations,
            String path,
            PathType pathType,
            Boolean isGrpc,
            Long requestTimeoutInMs) {
        super(destinations);
        this.path = path;
        this.pathType = pathType;
        this.isGrpc = isGrpc;
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
        ;

        private final String value;
        private static java.util.Map<String, PathType> map;

        static {
            map = new java.util.HashMap<>();
            for (PathType v : PathType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid PathType: " + key);
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

    /**
     * The maximum duration in milliseconds for the target service to respond to a request. If
     * provided, the timeout value overrides the default timeout of 15 seconds for the HTTP based
     * route rules, and disabled (no timeout) when 'isGrpc' is true. The value 0 (zero) indicates
     * that the timeout is disabled. For streaming responses from the target service, consider
     * either keeping the timeout disabled or set a sufficiently high value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestTimeoutInMs")
    private final Long requestTimeoutInMs;

    /**
     * The maximum duration in milliseconds for the target service to respond to a request. If
     * provided, the timeout value overrides the default timeout of 15 seconds for the HTTP based
     * route rules, and disabled (no timeout) when 'isGrpc' is true. The value 0 (zero) indicates
     * that the timeout is disabled. For streaming responses from the target service, consider
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
        sb.append("HttpVirtualServiceTrafficRouteRuleDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", pathType=").append(String.valueOf(this.pathType));
        sb.append(", isGrpc=").append(String.valueOf(this.isGrpc));
        sb.append(", requestTimeoutInMs=").append(String.valueOf(this.requestTimeoutInMs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpVirtualServiceTrafficRouteRuleDetails)) {
            return false;
        }

        HttpVirtualServiceTrafficRouteRuleDetails other =
                (HttpVirtualServiceTrafficRouteRuleDetails) o;
        return java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.pathType, other.pathType)
                && java.util.Objects.equals(this.isGrpc, other.isGrpc)
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
                        + (this.requestTimeoutInMs == null
                                ? 43
                                : this.requestTimeoutInMs.hashCode());
        return result;
    }
}
