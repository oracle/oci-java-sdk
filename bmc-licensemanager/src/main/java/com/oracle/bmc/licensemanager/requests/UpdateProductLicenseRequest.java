/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.requests;

import com.oracle.bmc.licensemanager.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/licensemanager/UpdateProductLicenseExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateProductLicenseRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
public class UpdateProductLicenseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.licensemanager.model.UpdateProductLicenseDetails> {

    /** Unique product license identifier. */
    private String productLicenseId;

    /** Unique product license identifier. */
    public String getProductLicenseId() {
        return productLicenseId;
    }
    /** The list of images that needs to be updated. */
    private com.oracle.bmc.licensemanager.model.UpdateProductLicenseDetails
            updateProductLicenseDetails;

    /** The list of images that needs to be updated. */
    public com.oracle.bmc.licensemanager.model.UpdateProductLicenseDetails
            getUpdateProductLicenseDetails() {
        return updateProductLicenseDetails;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.licensemanager.model.UpdateProductLicenseDetails getBody$() {
        return updateProductLicenseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateProductLicenseRequest,
                    com.oracle.bmc.licensemanager.model.UpdateProductLicenseDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique product license identifier. */
        private String productLicenseId = null;

        /**
         * Unique product license identifier.
         *
         * @param productLicenseId the value to set
         * @return this builder instance
         */
        public Builder productLicenseId(String productLicenseId) {
            this.productLicenseId = productLicenseId;
            return this;
        }

        /** The list of images that needs to be updated. */
        private com.oracle.bmc.licensemanager.model.UpdateProductLicenseDetails
                updateProductLicenseDetails = null;

        /**
         * The list of images that needs to be updated.
         *
         * @param updateProductLicenseDetails the value to set
         * @return this builder instance
         */
        public Builder updateProductLicenseDetails(
                com.oracle.bmc.licensemanager.model.UpdateProductLicenseDetails
                        updateProductLicenseDetails) {
            this.updateProductLicenseDetails = updateProductLicenseDetails;
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
        public Builder copy(UpdateProductLicenseRequest o) {
            productLicenseId(o.getProductLicenseId());
            updateProductLicenseDetails(o.getUpdateProductLicenseDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateProductLicenseRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateProductLicenseRequest
         */
        public UpdateProductLicenseRequest build() {
            UpdateProductLicenseRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.licensemanager.model.UpdateProductLicenseDetails body) {
            updateProductLicenseDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateProductLicenseRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateProductLicenseRequest
         */
        public UpdateProductLicenseRequest buildWithoutInvocationCallback() {
            UpdateProductLicenseRequest request = new UpdateProductLicenseRequest();
            request.productLicenseId = productLicenseId;
            request.updateProductLicenseDetails = updateProductLicenseDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateProductLicenseRequest(productLicenseId, updateProductLicenseDetails,
            // ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .productLicenseId(productLicenseId)
                .updateProductLicenseDetails(updateProductLicenseDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",productLicenseId=").append(String.valueOf(this.productLicenseId));
        sb.append(",updateProductLicenseDetails=")
                .append(String.valueOf(this.updateProductLicenseDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateProductLicenseRequest)) {
            return false;
        }

        UpdateProductLicenseRequest other = (UpdateProductLicenseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.productLicenseId, other.productLicenseId)
                && java.util.Objects.equals(
                        this.updateProductLicenseDetails, other.updateProductLicenseDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.productLicenseId == null ? 43 : this.productLicenseId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateProductLicenseDetails == null
                                ? 43
                                : this.updateProductLicenseDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
