/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.requests;

import com.oracle.bmc.waas.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waas/UpdateCertificateExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateCertificateRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class UpdateCertificateRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.waas.model.UpdateCertificateDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the SSL
     * certificate used in the WAAS policy. This number is generated when the certificate is added
     * to the policy.
     */
    private String certificateId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the SSL
     * certificate used in the WAAS policy. This number is generated when the certificate is added
     * to the policy.
     */
    public String getCertificateId() {
        return certificateId;
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
     * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous {@code GET} or
     * {@code POST} response for that resource. The resource will be updated or deleted only if the
     * etag provided matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous {@code GET} or
     * {@code POST} response for that resource. The resource will be updated or deleted only if the
     * etag provided matches the resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The new display name, freeform tags, and defined tags to apply to a certificate. */
    private com.oracle.bmc.waas.model.UpdateCertificateDetails updateCertificateDetails;

    /** The new display name, freeform tags, and defined tags to apply to a certificate. */
    public com.oracle.bmc.waas.model.UpdateCertificateDetails getUpdateCertificateDetails() {
        return updateCertificateDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.waas.model.UpdateCertificateDetails getBody$() {
        return updateCertificateDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateCertificateRequest, com.oracle.bmc.waas.model.UpdateCertificateDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * SSL certificate used in the WAAS policy. This number is generated when the certificate is
         * added to the policy.
         */
        private String certificateId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * SSL certificate used in the WAAS policy. This number is generated when the certificate is
         * added to the policy.
         *
         * @param certificateId the value to set
         * @return this builder instance
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
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
         * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a previous
         * {@code GET} or {@code POST} response for that resource. The resource will be updated or
         * deleted only if the etag provided matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a previous
         * {@code GET} or {@code POST} response for that resource. The resource will be updated or
         * deleted only if the etag provided matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** The new display name, freeform tags, and defined tags to apply to a certificate. */
        private com.oracle.bmc.waas.model.UpdateCertificateDetails updateCertificateDetails = null;

        /**
         * The new display name, freeform tags, and defined tags to apply to a certificate.
         *
         * @param updateCertificateDetails the value to set
         * @return this builder instance
         */
        public Builder updateCertificateDetails(
                com.oracle.bmc.waas.model.UpdateCertificateDetails updateCertificateDetails) {
            this.updateCertificateDetails = updateCertificateDetails;
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
        public Builder copy(UpdateCertificateRequest o) {
            certificateId(o.getCertificateId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            updateCertificateDetails(o.getUpdateCertificateDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateCertificateRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateCertificateRequest
         */
        public UpdateCertificateRequest build() {
            UpdateCertificateRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.waas.model.UpdateCertificateDetails body) {
            updateCertificateDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateCertificateRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateCertificateRequest
         */
        public UpdateCertificateRequest buildWithoutInvocationCallback() {
            UpdateCertificateRequest request = new UpdateCertificateRequest();
            request.certificateId = certificateId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.updateCertificateDetails = updateCertificateDetails;
            return request;
            // new UpdateCertificateRequest(certificateId, opcRequestId, ifMatch,
            // updateCertificateDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .certificateId(certificateId)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .updateCertificateDetails(updateCertificateDetails);
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
        sb.append(",certificateId=").append(String.valueOf(this.certificateId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",updateCertificateDetails=")
                .append(String.valueOf(this.updateCertificateDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCertificateRequest)) {
            return false;
        }

        UpdateCertificateRequest other = (UpdateCertificateRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(
                        this.updateCertificateDetails, other.updateCertificateDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.certificateId == null ? 43 : this.certificateId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.updateCertificateDetails == null
                                ? 43
                                : this.updateCertificateDetails.hashCode());
        return result;
    }
}
