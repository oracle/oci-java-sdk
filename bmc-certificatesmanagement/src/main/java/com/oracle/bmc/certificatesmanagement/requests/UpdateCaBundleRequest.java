/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.requests;

import com.oracle.bmc.certificatesmanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/certificatesmanagement/UpdateCaBundleExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateCaBundleRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class UpdateCaBundleRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.certificatesmanagement.model.UpdateCaBundleDetails> {

    /**
     * The OCID of the CA bundle.
     */
    private String caBundleId;

    /**
     * The OCID of the CA bundle.
     */
    public String getCaBundleId() {
        return caBundleId;
    }
    /**
     * The details of the request to update a CA bundle.
     */
    private com.oracle.bmc.certificatesmanagement.model.UpdateCaBundleDetails updateCaBundleDetails;

    /**
     * The details of the request to update a CA bundle.
     */
    public com.oracle.bmc.certificatesmanagement.model.UpdateCaBundleDetails
            getUpdateCaBundleDetails() {
        return updateCaBundleDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If provided, the returned request ID
     * will include this value. Otherwise, a random request ID will be
     * generated by the service.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If provided, the returned request ID
     * will include this value. Otherwise, a random request ID will be
     * generated by the service.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code if-match} parameter to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code if-match} parameter to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.certificatesmanagement.model.UpdateCaBundleDetails getBody$() {
        return updateCaBundleDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateCaBundleRequest,
                    com.oracle.bmc.certificatesmanagement.model.UpdateCaBundleDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the CA bundle.
         */
        private String caBundleId = null;

        /**
         * The OCID of the CA bundle.
         * @param caBundleId the value to set
         * @return this builder instance
         */
        public Builder caBundleId(String caBundleId) {
            this.caBundleId = caBundleId;
            return this;
        }

        /**
         * The details of the request to update a CA bundle.
         */
        private com.oracle.bmc.certificatesmanagement.model.UpdateCaBundleDetails
                updateCaBundleDetails = null;

        /**
         * The details of the request to update a CA bundle.
         * @param updateCaBundleDetails the value to set
         * @return this builder instance
         */
        public Builder updateCaBundleDetails(
                com.oracle.bmc.certificatesmanagement.model.UpdateCaBundleDetails
                        updateCaBundleDetails) {
            this.updateCaBundleDetails = updateCaBundleDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be
         * generated by the service.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be
         * generated by the service.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
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
        public Builder copy(UpdateCaBundleRequest o) {
            caBundleId(o.getCaBundleId());
            updateCaBundleDetails(o.getUpdateCaBundleDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateCaBundleRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateCaBundleRequest
         */
        public UpdateCaBundleRequest build() {
            UpdateCaBundleRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.certificatesmanagement.model.UpdateCaBundleDetails body) {
            updateCaBundleDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateCaBundleRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateCaBundleRequest
         */
        public UpdateCaBundleRequest buildWithoutInvocationCallback() {
            UpdateCaBundleRequest request = new UpdateCaBundleRequest();
            request.caBundleId = caBundleId;
            request.updateCaBundleDetails = updateCaBundleDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateCaBundleRequest(caBundleId, updateCaBundleDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .caBundleId(caBundleId)
                .updateCaBundleDetails(updateCaBundleDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",caBundleId=").append(String.valueOf(this.caBundleId));
        sb.append(",updateCaBundleDetails=").append(String.valueOf(this.updateCaBundleDetails));
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
        if (!(o instanceof UpdateCaBundleRequest)) {
            return false;
        }

        UpdateCaBundleRequest other = (UpdateCaBundleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.caBundleId, other.caBundleId)
                && java.util.Objects.equals(this.updateCaBundleDetails, other.updateCaBundleDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.caBundleId == null ? 43 : this.caBundleId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateCaBundleDetails == null
                                ? 43
                                : this.updateCaBundleDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
