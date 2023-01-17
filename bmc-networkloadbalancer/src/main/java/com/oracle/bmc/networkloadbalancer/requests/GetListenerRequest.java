/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.requests;

import com.oracle.bmc.networkloadbalancer.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/networkloadbalancer/GetListenerExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetListenerRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class GetListenerRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network load balancer to update.
     */
    private String networkLoadBalancerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network load balancer to update.
     */
    public String getNetworkLoadBalancerId() {
        return networkLoadBalancerId;
    }
    /**
     * The name of the listener to get.
     * <p>
     * Example: {@code example_listener}
     *
     */
    private String listenerName;

    /**
     * The name of the listener to get.
     * <p>
     * Example: {@code example_listener}
     *
     */
    public String getListenerName() {
        return listenerName;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
     * particular request, then provide the request identifier.
     *
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
     * particular request, then provide the request identifier.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The system returns the requested resource, with a 200 status, only if the resource has no etag
     * matching the one specified. If the condition fails for the GET and HEAD methods, then the system returns the
     * HTTP status code {@code 304 (Not Modified)}.
     * <p>
     * Example: {@code example-etag}
     *
     */
    private String ifNoneMatch;

    /**
     * The system returns the requested resource, with a 200 status, only if the resource has no etag
     * matching the one specified. If the condition fails for the GET and HEAD methods, then the system returns the
     * HTTP status code {@code 304 (Not Modified)}.
     * <p>
     * Example: {@code example-etag}
     *
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetListenerRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network load balancer to update.
         */
        private String networkLoadBalancerId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network load balancer to update.
         * @param networkLoadBalancerId the value to set
         * @return this builder instance
         */
        public Builder networkLoadBalancerId(String networkLoadBalancerId) {
            this.networkLoadBalancerId = networkLoadBalancerId;
            return this;
        }

        /**
         * The name of the listener to get.
         * <p>
         * Example: {@code example_listener}
         *
         */
        private String listenerName = null;

        /**
         * The name of the listener to get.
         * <p>
         * Example: {@code example_listener}
         *
         * @param listenerName the value to set
         * @return this builder instance
         */
        public Builder listenerName(String listenerName) {
            this.listenerName = listenerName;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
         * particular request, then provide the request identifier.
         *
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
         * particular request, then provide the request identifier.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The system returns the requested resource, with a 200 status, only if the resource has no etag
         * matching the one specified. If the condition fails for the GET and HEAD methods, then the system returns the
         * HTTP status code {@code 304 (Not Modified)}.
         * <p>
         * Example: {@code example-etag}
         *
         */
        private String ifNoneMatch = null;

        /**
         * The system returns the requested resource, with a 200 status, only if the resource has no etag
         * matching the one specified. If the condition fails for the GET and HEAD methods, then the system returns the
         * HTTP status code {@code 304 (Not Modified)}.
         * <p>
         * Example: {@code example-etag}
         *
         * @param ifNoneMatch the value to set
         * @return this builder instance
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
            return this;
        }

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
        public Builder copy(GetListenerRequest o) {
            networkLoadBalancerId(o.getNetworkLoadBalancerId());
            listenerName(o.getListenerName());
            opcRequestId(o.getOpcRequestId());
            ifNoneMatch(o.getIfNoneMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetListenerRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetListenerRequest
         */
        public GetListenerRequest build() {
            GetListenerRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetListenerRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetListenerRequest
         */
        public GetListenerRequest buildWithoutInvocationCallback() {
            GetListenerRequest request = new GetListenerRequest();
            request.networkLoadBalancerId = networkLoadBalancerId;
            request.listenerName = listenerName;
            request.opcRequestId = opcRequestId;
            request.ifNoneMatch = ifNoneMatch;
            return request;
            // new GetListenerRequest(networkLoadBalancerId, listenerName, opcRequestId, ifNoneMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .networkLoadBalancerId(networkLoadBalancerId)
                .listenerName(listenerName)
                .opcRequestId(opcRequestId)
                .ifNoneMatch(ifNoneMatch);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",networkLoadBalancerId=").append(String.valueOf(this.networkLoadBalancerId));
        sb.append(",listenerName=").append(String.valueOf(this.listenerName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetListenerRequest)) {
            return false;
        }

        GetListenerRequest other = (GetListenerRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.networkLoadBalancerId, other.networkLoadBalancerId)
                && java.util.Objects.equals(this.listenerName, other.listenerName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.networkLoadBalancerId == null
                                ? 43
                                : this.networkLoadBalancerId.hashCode());
        result = (result * PRIME) + (this.listenerName == null ? 43 : this.listenerName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        return result;
    }
}
