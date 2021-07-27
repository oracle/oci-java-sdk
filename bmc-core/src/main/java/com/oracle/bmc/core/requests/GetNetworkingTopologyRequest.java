/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetNetworkingTopologyExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetNetworkingTopologyRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetNetworkingTopologyRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * Valid values are {@code ANY} and {@code ACCESSIBLE}. The default is {@code ANY}.
     * Setting this to {@code ACCESSIBLE} returns only compartments for which a
     * user has INSPECT permissions, either directly or indirectly (permissions can be on a
     * resource in a subcompartment). A restricted set of fields is returned for compartments in which a user has
     * indirect INSPECT permissions.
     * <p>
     * When set to {@code ANY} permissions are not checked.
     *
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are {@code ANY} and {@code ACCESSIBLE}. The default is {@code ANY}.
     * Setting this to {@code ACCESSIBLE} returns only compartments for which a
     * user has INSPECT permissions, either directly or indirectly (permissions can be on a
     * resource in a subcompartment). A restricted set of fields is returned for compartments in which a user has
     * indirect INSPECT permissions.
     * <p>
     * When set to {@code ANY} permissions are not checked.
     *
     **/
    public enum AccessLevel {
        Any("ANY"),
        Accessible("ACCESSIBLE"),
        ;

        private final String value;
        private static java.util.Map<String, AccessLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessLevel v : AccessLevel.values()) {
                map.put(v.getValue(), v);
            }
        }

        AccessLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AccessLevel: " + key);
        }
    };
    /**
     * When set to true, the hierarchy of compartments is traversed
     * and the specified compartment and its subcompartments are
     * inspected depending on the the setting of {@code accessLevel}.
     * Default is false.
     *
     */
    private Boolean queryCompartmentSubtree;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For querying if there is a cached value on the server. The If-None-Match HTTP request header
     * makes the request conditional. For GET and HEAD methods, the server will send back the requested
     * resource, with a 200 status, only if it doesn't have an ETag matching the given ones.
     * For other methods, the request will be processed only if the eventually existing resource's
     * ETag doesn't match any of the values listed.
     *
     */
    private String ifNoneMatch;

    /**
     * The Cache-Control HTTP header holds directives (instructions)
     * for caching in both requests and responses.
     *
     */
    private String cacheControl;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetNetworkingTopologyRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetNetworkingTopologyRequest o) {
            compartmentId(o.getCompartmentId());
            accessLevel(o.getAccessLevel());
            queryCompartmentSubtree(o.getQueryCompartmentSubtree());
            opcRequestId(o.getOpcRequestId());
            ifNoneMatch(o.getIfNoneMatch());
            cacheControl(o.getCacheControl());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetNetworkingTopologyRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetNetworkingTopologyRequest
         */
        public GetNetworkingTopologyRequest build() {
            GetNetworkingTopologyRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
