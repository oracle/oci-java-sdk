/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadDiscoveryReportExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use DownloadDiscoveryReportRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class DownloadDiscoveryReportRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.DownloadDiscoveryReportDetails> {

    /**
     * The OCID of the sensitive data model.
     */
    private String sensitiveDataModelId;

    /**
     * The OCID of the sensitive data model.
     */
    public String getSensitiveDataModelId() {
        return sensitiveDataModelId;
    }
    /**
     * Details to download a discovery report.
     */
    private com.oracle.bmc.datasafe.model.DownloadDiscoveryReportDetails
            downloadDiscoveryReportDetails;

    /**
     * Details to download a discovery report.
     */
    public com.oracle.bmc.datasafe.model.DownloadDiscoveryReportDetails
            getDownloadDiscoveryReportDetails() {
        return downloadDiscoveryReportDetails;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datasafe.model.DownloadDiscoveryReportDetails getBody$() {
        return downloadDiscoveryReportDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DownloadDiscoveryReportRequest,
                    com.oracle.bmc.datasafe.model.DownloadDiscoveryReportDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the sensitive data model.
         */
        private String sensitiveDataModelId = null;

        /**
         * The OCID of the sensitive data model.
         * @param sensitiveDataModelId the value to set
         * @return this builder instance
         */
        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            this.sensitiveDataModelId = sensitiveDataModelId;
            return this;
        }

        /**
         * Details to download a discovery report.
         */
        private com.oracle.bmc.datasafe.model.DownloadDiscoveryReportDetails
                downloadDiscoveryReportDetails = null;

        /**
         * Details to download a discovery report.
         * @param downloadDiscoveryReportDetails the value to set
         * @return this builder instance
         */
        public Builder downloadDiscoveryReportDetails(
                com.oracle.bmc.datasafe.model.DownloadDiscoveryReportDetails
                        downloadDiscoveryReportDetails) {
            this.downloadDiscoveryReportDetails = downloadDiscoveryReportDetails;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(DownloadDiscoveryReportRequest o) {
            sensitiveDataModelId(o.getSensitiveDataModelId());
            downloadDiscoveryReportDetails(o.getDownloadDiscoveryReportDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DownloadDiscoveryReportRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DownloadDiscoveryReportRequest
         */
        public DownloadDiscoveryReportRequest build() {
            DownloadDiscoveryReportRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.DownloadDiscoveryReportDetails body) {
            downloadDiscoveryReportDetails(body);
            return this;
        }

        /**
         * Build the instance of DownloadDiscoveryReportRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DownloadDiscoveryReportRequest
         */
        public DownloadDiscoveryReportRequest buildWithoutInvocationCallback() {
            DownloadDiscoveryReportRequest request = new DownloadDiscoveryReportRequest();
            request.sensitiveDataModelId = sensitiveDataModelId;
            request.downloadDiscoveryReportDetails = downloadDiscoveryReportDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new DownloadDiscoveryReportRequest(sensitiveDataModelId, downloadDiscoveryReportDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .sensitiveDataModelId(sensitiveDataModelId)
                .downloadDiscoveryReportDetails(downloadDiscoveryReportDetails)
                .opcRequestId(opcRequestId);
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
        sb.append(",sensitiveDataModelId=").append(String.valueOf(this.sensitiveDataModelId));
        sb.append(",downloadDiscoveryReportDetails=")
                .append(String.valueOf(this.downloadDiscoveryReportDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DownloadDiscoveryReportRequest)) {
            return false;
        }

        DownloadDiscoveryReportRequest other = (DownloadDiscoveryReportRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.sensitiveDataModelId, other.sensitiveDataModelId)
                && java.util.Objects.equals(
                        this.downloadDiscoveryReportDetails, other.downloadDiscoveryReportDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sensitiveDataModelId == null
                                ? 43
                                : this.sensitiveDataModelId.hashCode());
        result =
                (result * PRIME)
                        + (this.downloadDiscoveryReportDetails == null
                                ? 43
                                : this.downloadDiscoveryReportDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
