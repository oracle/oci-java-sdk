/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.requests;

import com.oracle.bmc.networkloadbalancer.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/networkloadbalancer/UpdateListenerExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateListenerRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class UpdateListenerRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.networkloadbalancer.model.UpdateListenerDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * network load balancer to update.
     */
    private String networkLoadBalancerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * network load balancer to update.
     */
    public String getNetworkLoadBalancerId() {
        return networkLoadBalancerId;
    }
    /** Details to update a listener. */
    private com.oracle.bmc.networkloadbalancer.model.UpdateListenerDetails updateListenerDetails;

    /** Details to update a listener. */
    public com.oracle.bmc.networkloadbalancer.model.UpdateListenerDetails
            getUpdateListenerDetails() {
        return updateListenerDetails;
    }
    /**
     * The name of the listener to update.
     *
     * <p>Example: {@code example_listener}
     */
    private String listenerName;

    /**
     * The name of the listener to update.
     *
     * <p>Example: {@code example_listener}
     */
    public String getListenerName() {
        return listenerName;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
     * particular request, then provide the request identifier.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
     * particular request, then provide the request identifier.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so that it can be retried in case of a timeout or
     * server error without risk of rerunning that same action. Retry tokens expire after 24 hours
     * but they can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so that it can be retried in case of a timeout or
     * server error without risk of rerunning that same action. Retry tokens expire after 24 hours
     * but they can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * current etag value of the resource.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * current etag value of the resource.
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.networkloadbalancer.model.UpdateListenerDetails getBody$() {
        return updateListenerDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateListenerRequest,
                    com.oracle.bmc.networkloadbalancer.model.UpdateListenerDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * network load balancer to update.
         */
        private String networkLoadBalancerId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * network load balancer to update.
         *
         * @param networkLoadBalancerId the value to set
         * @return this builder instance
         */
        public Builder networkLoadBalancerId(String networkLoadBalancerId) {
            this.networkLoadBalancerId = networkLoadBalancerId;
            return this;
        }

        /** Details to update a listener. */
        private com.oracle.bmc.networkloadbalancer.model.UpdateListenerDetails
                updateListenerDetails = null;

        /**
         * Details to update a listener.
         *
         * @param updateListenerDetails the value to set
         * @return this builder instance
         */
        public Builder updateListenerDetails(
                com.oracle.bmc.networkloadbalancer.model.UpdateListenerDetails
                        updateListenerDetails) {
            this.updateListenerDetails = updateListenerDetails;
            return this;
        }

        /**
         * The name of the listener to update.
         *
         * <p>Example: {@code example_listener}
         */
        private String listenerName = null;

        /**
         * The name of the listener to update.
         *
         * <p>Example: {@code example_listener}
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
         * A token that uniquely identifies a request so that it can be retried in case of a timeout
         * or server error without risk of rerunning that same action. Retry tokens expire after 24
         * hours but they can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so that it can be retried in case of a timeout
         * or server error without risk of rerunning that same action. Retry tokens expire after 24
         * hours but they can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the current etag value of the resource.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the current etag value of the resource.
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
        public Builder copy(UpdateListenerRequest o) {
            networkLoadBalancerId(o.getNetworkLoadBalancerId());
            updateListenerDetails(o.getUpdateListenerDetails());
            listenerName(o.getListenerName());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateListenerRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateListenerRequest
         */
        public UpdateListenerRequest build() {
            UpdateListenerRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.networkloadbalancer.model.UpdateListenerDetails body) {
            updateListenerDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateListenerRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateListenerRequest
         */
        public UpdateListenerRequest buildWithoutInvocationCallback() {
            UpdateListenerRequest request = new UpdateListenerRequest();
            request.networkLoadBalancerId = networkLoadBalancerId;
            request.updateListenerDetails = updateListenerDetails;
            request.listenerName = listenerName;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateListenerRequest(networkLoadBalancerId, updateListenerDetails, listenerName,
            // opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .networkLoadBalancerId(networkLoadBalancerId)
                .updateListenerDetails(updateListenerDetails)
                .listenerName(listenerName)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",networkLoadBalancerId=").append(String.valueOf(this.networkLoadBalancerId));
        sb.append(",updateListenerDetails=").append(String.valueOf(this.updateListenerDetails));
        sb.append(",listenerName=").append(String.valueOf(this.listenerName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateListenerRequest)) {
            return false;
        }

        UpdateListenerRequest other = (UpdateListenerRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.networkLoadBalancerId, other.networkLoadBalancerId)
                && java.util.Objects.equals(this.updateListenerDetails, other.updateListenerDetails)
                && java.util.Objects.equals(this.listenerName, other.listenerName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
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
        result =
                (result * PRIME)
                        + (this.updateListenerDetails == null
                                ? 43
                                : this.updateListenerDetails.hashCode());
        result = (result * PRIME) + (this.listenerName == null ? 43 : this.listenerName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
