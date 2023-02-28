/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdatePublicIpExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdatePublicIpRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdatePublicIpRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdatePublicIpDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the public IP.
     */
    private String publicIpId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the public IP.
     */
    public String getPublicIpId() {
        return publicIpId;
    }
    /** Public IP details. */
    private com.oracle.bmc.core.model.UpdatePublicIpDetails updatePublicIpDetails;

    /** Public IP details. */
    public com.oracle.bmc.core.model.UpdatePublicIpDetails getUpdatePublicIpDetails() {
        return updatePublicIpDetails;
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
    public com.oracle.bmc.core.model.UpdatePublicIpDetails getBody$() {
        return updatePublicIpDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePublicIpRequest, com.oracle.bmc.core.model.UpdatePublicIpDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the public IP.
         */
        private String publicIpId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the public IP.
         *
         * @param publicIpId the value to set
         * @return this builder instance
         */
        public Builder publicIpId(String publicIpId) {
            this.publicIpId = publicIpId;
            return this;
        }

        /** Public IP details. */
        private com.oracle.bmc.core.model.UpdatePublicIpDetails updatePublicIpDetails = null;

        /**
         * Public IP details.
         *
         * @param updatePublicIpDetails the value to set
         * @return this builder instance
         */
        public Builder updatePublicIpDetails(
                com.oracle.bmc.core.model.UpdatePublicIpDetails updatePublicIpDetails) {
            this.updatePublicIpDetails = updatePublicIpDetails;
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
        public Builder copy(UpdatePublicIpRequest o) {
            publicIpId(o.getPublicIpId());
            updatePublicIpDetails(o.getUpdatePublicIpDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePublicIpRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdatePublicIpRequest
         */
        public UpdatePublicIpRequest build() {
            UpdatePublicIpRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdatePublicIpDetails body) {
            updatePublicIpDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePublicIpRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePublicIpRequest
         */
        public UpdatePublicIpRequest buildWithoutInvocationCallback() {
            UpdatePublicIpRequest request = new UpdatePublicIpRequest();
            request.publicIpId = publicIpId;
            request.updatePublicIpDetails = updatePublicIpDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdatePublicIpRequest(publicIpId, updatePublicIpDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .publicIpId(publicIpId)
                .updatePublicIpDetails(updatePublicIpDetails)
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
        sb.append(",publicIpId=").append(String.valueOf(this.publicIpId));
        sb.append(",updatePublicIpDetails=").append(String.valueOf(this.updatePublicIpDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePublicIpRequest)) {
            return false;
        }

        UpdatePublicIpRequest other = (UpdatePublicIpRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.publicIpId, other.publicIpId)
                && java.util.Objects.equals(this.updatePublicIpDetails, other.updatePublicIpDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.publicIpId == null ? 43 : this.publicIpId.hashCode());
        result =
                (result * PRIME)
                        + (this.updatePublicIpDetails == null
                                ? 43
                                : this.updatePublicIpDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
