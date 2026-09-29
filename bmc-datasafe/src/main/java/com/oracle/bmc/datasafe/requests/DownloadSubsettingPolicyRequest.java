/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadSubsettingPolicyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * DownloadSubsettingPolicyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class DownloadSubsettingPolicyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.DownloadSubsettingPolicyDetails> {

    /** The OCID of the subsetting policy. */
    private String subsettingPolicyId;

    /** The OCID of the subsetting policy. */
    public String getSubsettingPolicyId() {
        return subsettingPolicyId;
    }
    /** Details to download a subsetting policy file. */
    private com.oracle.bmc.datasafe.model.DownloadSubsettingPolicyDetails
            downloadSubsettingPolicyDetails;

    /** Details to download a subsetting policy file. */
    public com.oracle.bmc.datasafe.model.DownloadSubsettingPolicyDetails
            getDownloadSubsettingPolicyDetails() {
        return downloadSubsettingPolicyDetails;
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
    public com.oracle.bmc.datasafe.model.DownloadSubsettingPolicyDetails getBody$() {
        return downloadSubsettingPolicyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DownloadSubsettingPolicyRequest,
                    com.oracle.bmc.datasafe.model.DownloadSubsettingPolicyDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the subsetting policy. */
        private String subsettingPolicyId = null;

        /**
         * The OCID of the subsetting policy.
         *
         * @param subsettingPolicyId the value to set
         * @return this builder instance
         */
        public Builder subsettingPolicyId(String subsettingPolicyId) {
            this.subsettingPolicyId = subsettingPolicyId;
            return this;
        }

        /** Details to download a subsetting policy file. */
        private com.oracle.bmc.datasafe.model.DownloadSubsettingPolicyDetails
                downloadSubsettingPolicyDetails = null;

        /**
         * Details to download a subsetting policy file.
         *
         * @param downloadSubsettingPolicyDetails the value to set
         * @return this builder instance
         */
        public Builder downloadSubsettingPolicyDetails(
                com.oracle.bmc.datasafe.model.DownloadSubsettingPolicyDetails
                        downloadSubsettingPolicyDetails) {
            this.downloadSubsettingPolicyDetails = downloadSubsettingPolicyDetails;
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
        public Builder copy(DownloadSubsettingPolicyRequest o) {
            subsettingPolicyId(o.getSubsettingPolicyId());
            downloadSubsettingPolicyDetails(o.getDownloadSubsettingPolicyDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DownloadSubsettingPolicyRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DownloadSubsettingPolicyRequest
         */
        public DownloadSubsettingPolicyRequest build() {
            DownloadSubsettingPolicyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.DownloadSubsettingPolicyDetails body) {
            downloadSubsettingPolicyDetails(body);
            return this;
        }

        /**
         * Build the instance of DownloadSubsettingPolicyRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DownloadSubsettingPolicyRequest
         */
        public DownloadSubsettingPolicyRequest buildWithoutInvocationCallback() {
            DownloadSubsettingPolicyRequest request = new DownloadSubsettingPolicyRequest();
            request.subsettingPolicyId = subsettingPolicyId;
            request.downloadSubsettingPolicyDetails = downloadSubsettingPolicyDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new DownloadSubsettingPolicyRequest(subsettingPolicyId,
            // downloadSubsettingPolicyDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .subsettingPolicyId(subsettingPolicyId)
                .downloadSubsettingPolicyDetails(downloadSubsettingPolicyDetails)
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
        sb.append(",subsettingPolicyId=").append(String.valueOf(this.subsettingPolicyId));
        sb.append(",downloadSubsettingPolicyDetails=")
                .append(String.valueOf(this.downloadSubsettingPolicyDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DownloadSubsettingPolicyRequest)) {
            return false;
        }

        DownloadSubsettingPolicyRequest other = (DownloadSubsettingPolicyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.subsettingPolicyId, other.subsettingPolicyId)
                && java.util.Objects.equals(
                        this.downloadSubsettingPolicyDetails, other.downloadSubsettingPolicyDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.subsettingPolicyId == null
                                ? 43
                                : this.subsettingPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.downloadSubsettingPolicyDetails == null
                                ? 43
                                : this.downloadSubsettingPolicyDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
