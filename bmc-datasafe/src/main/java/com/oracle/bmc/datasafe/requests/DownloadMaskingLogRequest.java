/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadMaskingLogExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DownloadMaskingLogRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class DownloadMaskingLogRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.DownloadMaskingLogDetails> {

    /** The OCID of the masking policy. */
    private String maskingPolicyId;

    /** The OCID of the masking policy. */
    public String getMaskingPolicyId() {
        return maskingPolicyId;
    }
    /** Details to download masking log. */
    private com.oracle.bmc.datasafe.model.DownloadMaskingLogDetails downloadMaskingLogDetails;

    /** Details to download masking log. */
    public com.oracle.bmc.datasafe.model.DownloadMaskingLogDetails getDownloadMaskingLogDetails() {
        return downloadMaskingLogDetails;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
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
    public com.oracle.bmc.datasafe.model.DownloadMaskingLogDetails getBody$() {
        return downloadMaskingLogDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DownloadMaskingLogRequest,
                    com.oracle.bmc.datasafe.model.DownloadMaskingLogDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the masking policy. */
        private String maskingPolicyId = null;

        /**
         * The OCID of the masking policy.
         *
         * @param maskingPolicyId the value to set
         * @return this builder instance
         */
        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = maskingPolicyId;
            return this;
        }

        /** Details to download masking log. */
        private com.oracle.bmc.datasafe.model.DownloadMaskingLogDetails downloadMaskingLogDetails =
                null;

        /**
         * Details to download masking log.
         *
         * @param downloadMaskingLogDetails the value to set
         * @return this builder instance
         */
        public Builder downloadMaskingLogDetails(
                com.oracle.bmc.datasafe.model.DownloadMaskingLogDetails downloadMaskingLogDetails) {
            this.downloadMaskingLogDetails = downloadMaskingLogDetails;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(DownloadMaskingLogRequest o) {
            maskingPolicyId(o.getMaskingPolicyId());
            downloadMaskingLogDetails(o.getDownloadMaskingLogDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DownloadMaskingLogRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DownloadMaskingLogRequest
         */
        public DownloadMaskingLogRequest build() {
            DownloadMaskingLogRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.DownloadMaskingLogDetails body) {
            downloadMaskingLogDetails(body);
            return this;
        }

        /**
         * Build the instance of DownloadMaskingLogRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DownloadMaskingLogRequest
         */
        public DownloadMaskingLogRequest buildWithoutInvocationCallback() {
            DownloadMaskingLogRequest request = new DownloadMaskingLogRequest();
            request.maskingPolicyId = maskingPolicyId;
            request.downloadMaskingLogDetails = downloadMaskingLogDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new DownloadMaskingLogRequest(maskingPolicyId, downloadMaskingLogDetails,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .maskingPolicyId(maskingPolicyId)
                .downloadMaskingLogDetails(downloadMaskingLogDetails)
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
        sb.append(",maskingPolicyId=").append(String.valueOf(this.maskingPolicyId));
        sb.append(",downloadMaskingLogDetails=")
                .append(String.valueOf(this.downloadMaskingLogDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DownloadMaskingLogRequest)) {
            return false;
        }

        DownloadMaskingLogRequest other = (DownloadMaskingLogRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.maskingPolicyId, other.maskingPolicyId)
                && java.util.Objects.equals(
                        this.downloadMaskingLogDetails, other.downloadMaskingLogDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.maskingPolicyId == null ? 43 : this.maskingPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.downloadMaskingLogDetails == null
                                ? 43
                                : this.downloadMaskingLogDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
