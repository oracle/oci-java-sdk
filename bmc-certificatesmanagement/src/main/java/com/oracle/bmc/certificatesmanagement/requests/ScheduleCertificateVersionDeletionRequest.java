/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.requests;

import com.oracle.bmc.certificatesmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/certificatesmanagement/ScheduleCertificateVersionDeletionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ScheduleCertificateVersionDeletionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class ScheduleCertificateVersionDeletionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.certificatesmanagement.model
                        .ScheduleCertificateVersionDeletionDetails> {

    /** The OCID of the certificate. */
    private String certificateId;

    /** The OCID of the certificate. */
    public String getCertificateId() {
        return certificateId;
    }
    /** The version number of the certificate. */
    private Long certificateVersionNumber;

    /** The version number of the certificate. */
    public Long getCertificateVersionNumber() {
        return certificateVersionNumber;
    }
    /** The details of the request to delete a certificate version. */
    private com.oracle.bmc.certificatesmanagement.model.ScheduleCertificateVersionDeletionDetails
            scheduleCertificateVersionDeletionDetails;

    /** The details of the request to delete a certificate version. */
    public com.oracle.bmc.certificatesmanagement.model.ScheduleCertificateVersionDeletionDetails
            getScheduleCertificateVersionDeletionDetails() {
        return scheduleCertificateVersionDeletionDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If provided, the returned request ID will
     * include this value. Otherwise, a random request ID will be generated by the service.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If provided, the returned request ID will
     * include this value. Otherwise, a random request ID will be generated by the service.
     */
    public String getOpcRequestId() {
        return opcRequestId;
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
    public com.oracle.bmc.certificatesmanagement.model.ScheduleCertificateVersionDeletionDetails
            getBody$() {
        return scheduleCertificateVersionDeletionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ScheduleCertificateVersionDeletionRequest,
                    com.oracle.bmc.certificatesmanagement.model
                            .ScheduleCertificateVersionDeletionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the certificate. */
        private String certificateId = null;

        /**
         * The OCID of the certificate.
         *
         * @param certificateId the value to set
         * @return this builder instance
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /** The version number of the certificate. */
        private Long certificateVersionNumber = null;

        /**
         * The version number of the certificate.
         *
         * @param certificateVersionNumber the value to set
         * @return this builder instance
         */
        public Builder certificateVersionNumber(Long certificateVersionNumber) {
            this.certificateVersionNumber = certificateVersionNumber;
            return this;
        }

        /** The details of the request to delete a certificate version. */
        private com.oracle.bmc.certificatesmanagement.model
                        .ScheduleCertificateVersionDeletionDetails
                scheduleCertificateVersionDeletionDetails = null;

        /**
         * The details of the request to delete a certificate version.
         *
         * @param scheduleCertificateVersionDeletionDetails the value to set
         * @return this builder instance
         */
        public Builder scheduleCertificateVersionDeletionDetails(
                com.oracle.bmc.certificatesmanagement.model
                                .ScheduleCertificateVersionDeletionDetails
                        scheduleCertificateVersionDeletionDetails) {
            this.scheduleCertificateVersionDeletionDetails =
                    scheduleCertificateVersionDeletionDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be generated by the service.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be generated by the service.
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
        public Builder copy(ScheduleCertificateVersionDeletionRequest o) {
            certificateId(o.getCertificateId());
            certificateVersionNumber(o.getCertificateVersionNumber());
            scheduleCertificateVersionDeletionDetails(
                    o.getScheduleCertificateVersionDeletionDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ScheduleCertificateVersionDeletionRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ScheduleCertificateVersionDeletionRequest
         */
        public ScheduleCertificateVersionDeletionRequest build() {
            ScheduleCertificateVersionDeletionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.certificatesmanagement.model
                                .ScheduleCertificateVersionDeletionDetails
                        body) {
            scheduleCertificateVersionDeletionDetails(body);
            return this;
        }

        /**
         * Build the instance of ScheduleCertificateVersionDeletionRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ScheduleCertificateVersionDeletionRequest
         */
        public ScheduleCertificateVersionDeletionRequest buildWithoutInvocationCallback() {
            ScheduleCertificateVersionDeletionRequest request =
                    new ScheduleCertificateVersionDeletionRequest();
            request.certificateId = certificateId;
            request.certificateVersionNumber = certificateVersionNumber;
            request.scheduleCertificateVersionDeletionDetails =
                    scheduleCertificateVersionDeletionDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new ScheduleCertificateVersionDeletionRequest(certificateId,
            // certificateVersionNumber, scheduleCertificateVersionDeletionDetails, opcRequestId,
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
                .certificateId(certificateId)
                .certificateVersionNumber(certificateVersionNumber)
                .scheduleCertificateVersionDeletionDetails(
                        scheduleCertificateVersionDeletionDetails)
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
        sb.append(",certificateId=").append(String.valueOf(this.certificateId));
        sb.append(",certificateVersionNumber=")
                .append(String.valueOf(this.certificateVersionNumber));
        sb.append(",scheduleCertificateVersionDeletionDetails=")
                .append(String.valueOf(this.scheduleCertificateVersionDeletionDetails));
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
        if (!(o instanceof ScheduleCertificateVersionDeletionRequest)) {
            return false;
        }

        ScheduleCertificateVersionDeletionRequest other =
                (ScheduleCertificateVersionDeletionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(
                        this.certificateVersionNumber, other.certificateVersionNumber)
                && java.util.Objects.equals(
                        this.scheduleCertificateVersionDeletionDetails,
                        other.scheduleCertificateVersionDeletionDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.certificateId == null ? 43 : this.certificateId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateVersionNumber == null
                                ? 43
                                : this.certificateVersionNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleCertificateVersionDeletionDetails == null
                                ? 43
                                : this.scheduleCertificateVersionDeletionDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
