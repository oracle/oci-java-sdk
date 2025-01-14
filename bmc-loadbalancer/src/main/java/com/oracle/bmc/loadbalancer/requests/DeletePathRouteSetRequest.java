/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.requests;

import com.oracle.bmc.loadbalancer.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/DeletePathRouteSetExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DeletePathRouteSetRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public class DeletePathRouteSetRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * load balancer associated with the path route set to delete.
     */
    private String loadBalancerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * load balancer associated with the path route set to delete.
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }
    /**
     * The name of the path route set to delete.
     *
     * <p>Example: {@code example_path_route_set}
     */
    private String pathRouteSetName;

    /**
     * The name of the path route set to delete.
     *
     * <p>Example: {@code example_path_route_set}
     */
    public String getPathRouteSetName() {
        return pathRouteSetName;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the ETag for the load balancer. This value can be obtained
     * from a GET or POST response for any resource of that load balancer.
     *
     * <p>For example, the eTag returned by getListener can be specified as the ifMatch for
     * updateRuleSets.
     *
     * <p>The resource is updated or deleted only if the ETag you provide matches the resource's
     * current ETag value.
     *
     * <p>Example: {@code example-etag}
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the ETag for the load balancer. This value can be obtained
     * from a GET or POST response for any resource of that load balancer.
     *
     * <p>For example, the eTag returned by getListener can be specified as the ifMatch for
     * updateRuleSets.
     *
     * <p>The resource is updated or deleted only if the ETag you provide matches the resource's
     * current ETag value.
     *
     * <p>Example: {@code example-etag}
     */
    public String getIfMatch() {
        return ifMatch;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeletePathRouteSetRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * load balancer associated with the path route set to delete.
         */
        private String loadBalancerId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * load balancer associated with the path route set to delete.
         *
         * @param loadBalancerId the value to set
         * @return this builder instance
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * The name of the path route set to delete.
         *
         * <p>Example: {@code example_path_route_set}
         */
        private String pathRouteSetName = null;

        /**
         * The name of the path route set to delete.
         *
         * <p>Example: {@code example_path_route_set}
         *
         * @param pathRouteSetName the value to set
         * @return this builder instance
         */
        public Builder pathRouteSetName(String pathRouteSetName) {
            this.pathRouteSetName = pathRouteSetName;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the ETag for the load balancer. This value can be
         * obtained from a GET or POST response for any resource of that load balancer.
         *
         * <p>For example, the eTag returned by getListener can be specified as the ifMatch for
         * updateRuleSets.
         *
         * <p>The resource is updated or deleted only if the ETag you provide matches the resource's
         * current ETag value.
         *
         * <p>Example: {@code example-etag}
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the ETag for the load balancer. This value can be
         * obtained from a GET or POST response for any resource of that load balancer.
         *
         * <p>For example, the eTag returned by getListener can be specified as the ifMatch for
         * updateRuleSets.
         *
         * <p>The resource is updated or deleted only if the ETag you provide matches the resource's
         * current ETag value.
         *
         * <p>Example: {@code example-etag}
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
         * @return this builder instance
         */
        public Builder copy(DeletePathRouteSetRequest o) {
            loadBalancerId(o.getLoadBalancerId());
            pathRouteSetName(o.getPathRouteSetName());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeletePathRouteSetRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeletePathRouteSetRequest
         */
        public DeletePathRouteSetRequest build() {
            DeletePathRouteSetRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeletePathRouteSetRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeletePathRouteSetRequest
         */
        public DeletePathRouteSetRequest buildWithoutInvocationCallback() {
            DeletePathRouteSetRequest request = new DeletePathRouteSetRequest();
            request.loadBalancerId = loadBalancerId;
            request.pathRouteSetName = pathRouteSetName;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new DeletePathRouteSetRequest(loadBalancerId, pathRouteSetName, opcRequestId,
            // ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .loadBalancerId(loadBalancerId)
                .pathRouteSetName(pathRouteSetName)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
    }

    /**
     * Return a new builder for this request object.
     *
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
        sb.append(",loadBalancerId=").append(String.valueOf(this.loadBalancerId));
        sb.append(",pathRouteSetName=").append(String.valueOf(this.pathRouteSetName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeletePathRouteSetRequest)) {
            return false;
        }

        DeletePathRouteSetRequest other = (DeletePathRouteSetRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.loadBalancerId, other.loadBalancerId)
                && java.util.Objects.equals(this.pathRouteSetName, other.pathRouteSetName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.loadBalancerId == null ? 43 : this.loadBalancerId.hashCode());
        result =
                (result * PRIME)
                        + (this.pathRouteSetName == null ? 43 : this.pathRouteSetName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
