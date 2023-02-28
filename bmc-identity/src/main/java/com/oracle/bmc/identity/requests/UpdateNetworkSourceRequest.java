/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateNetworkSourceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateNetworkSourceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateNetworkSourceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identity.model.UpdateNetworkSourceDetails> {

    /** The OCID of the network source. */
    private String networkSourceId;

    /** The OCID of the network source. */
    public String getNetworkSourceId() {
        return networkSourceId;
    }
    /** Request object for updating a network source. */
    private com.oracle.bmc.identity.model.UpdateNetworkSourceDetails updateNetworkSourceDetails;

    /** Request object for updating a network source. */
    public com.oracle.bmc.identity.model.UpdateNetworkSourceDetails
            getUpdateNetworkSourceDetails() {
        return updateNetworkSourceDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
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
    public com.oracle.bmc.identity.model.UpdateNetworkSourceDetails getBody$() {
        return updateNetworkSourceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateNetworkSourceRequest,
                    com.oracle.bmc.identity.model.UpdateNetworkSourceDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the network source. */
        private String networkSourceId = null;

        /**
         * The OCID of the network source.
         *
         * @param networkSourceId the value to set
         * @return this builder instance
         */
        public Builder networkSourceId(String networkSourceId) {
            this.networkSourceId = networkSourceId;
            return this;
        }

        /** Request object for updating a network source. */
        private com.oracle.bmc.identity.model.UpdateNetworkSourceDetails
                updateNetworkSourceDetails = null;

        /**
         * Request object for updating a network source.
         *
         * @param updateNetworkSourceDetails the value to set
         * @return this builder instance
         */
        public Builder updateNetworkSourceDetails(
                com.oracle.bmc.identity.model.UpdateNetworkSourceDetails
                        updateNetworkSourceDetails) {
            this.updateNetworkSourceDetails = updateNetworkSourceDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
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
        public Builder copy(UpdateNetworkSourceRequest o) {
            networkSourceId(o.getNetworkSourceId());
            updateNetworkSourceDetails(o.getUpdateNetworkSourceDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateNetworkSourceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateNetworkSourceRequest
         */
        public UpdateNetworkSourceRequest build() {
            UpdateNetworkSourceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.identity.model.UpdateNetworkSourceDetails body) {
            updateNetworkSourceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateNetworkSourceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateNetworkSourceRequest
         */
        public UpdateNetworkSourceRequest buildWithoutInvocationCallback() {
            UpdateNetworkSourceRequest request = new UpdateNetworkSourceRequest();
            request.networkSourceId = networkSourceId;
            request.updateNetworkSourceDetails = updateNetworkSourceDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateNetworkSourceRequest(networkSourceId, updateNetworkSourceDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .networkSourceId(networkSourceId)
                .updateNetworkSourceDetails(updateNetworkSourceDetails)
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
        sb.append(",networkSourceId=").append(String.valueOf(this.networkSourceId));
        sb.append(",updateNetworkSourceDetails=")
                .append(String.valueOf(this.updateNetworkSourceDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateNetworkSourceRequest)) {
            return false;
        }

        UpdateNetworkSourceRequest other = (UpdateNetworkSourceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.networkSourceId, other.networkSourceId)
                && java.util.Objects.equals(
                        this.updateNetworkSourceDetails, other.updateNetworkSourceDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.networkSourceId == null ? 43 : this.networkSourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateNetworkSourceDetails == null
                                ? 43
                                : this.updateNetworkSourceDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
