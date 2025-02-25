/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadSensitiveTypesExportExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use DownloadSensitiveTypesExportRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class DownloadSensitiveTypesExportRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.DownloadSensitiveTypesExportDetails> {

    /**
     * The OCID of the sensitive types export.
     */
    private String sensitiveTypesExportId;

    /**
     * The OCID of the sensitive types export.
     */
    public String getSensitiveTypesExportId() {
        return sensitiveTypesExportId;
    }
    /**
     * Details to download a sensitive types export file.
     */
    private com.oracle.bmc.datasafe.model.DownloadSensitiveTypesExportDetails
            downloadSensitiveTypesExportDetails;

    /**
     * Details to download a sensitive types export file.
     */
    public com.oracle.bmc.datasafe.model.DownloadSensitiveTypesExportDetails
            getDownloadSensitiveTypesExportDetails() {
        return downloadSensitiveTypesExportDetails;
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
    public com.oracle.bmc.datasafe.model.DownloadSensitiveTypesExportDetails getBody$() {
        return downloadSensitiveTypesExportDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DownloadSensitiveTypesExportRequest,
                    com.oracle.bmc.datasafe.model.DownloadSensitiveTypesExportDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the sensitive types export.
         */
        private String sensitiveTypesExportId = null;

        /**
         * The OCID of the sensitive types export.
         * @param sensitiveTypesExportId the value to set
         * @return this builder instance
         */
        public Builder sensitiveTypesExportId(String sensitiveTypesExportId) {
            this.sensitiveTypesExportId = sensitiveTypesExportId;
            return this;
        }

        /**
         * Details to download a sensitive types export file.
         */
        private com.oracle.bmc.datasafe.model.DownloadSensitiveTypesExportDetails
                downloadSensitiveTypesExportDetails = null;

        /**
         * Details to download a sensitive types export file.
         * @param downloadSensitiveTypesExportDetails the value to set
         * @return this builder instance
         */
        public Builder downloadSensitiveTypesExportDetails(
                com.oracle.bmc.datasafe.model.DownloadSensitiveTypesExportDetails
                        downloadSensitiveTypesExportDetails) {
            this.downloadSensitiveTypesExportDetails = downloadSensitiveTypesExportDetails;
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
        public Builder copy(DownloadSensitiveTypesExportRequest o) {
            sensitiveTypesExportId(o.getSensitiveTypesExportId());
            downloadSensitiveTypesExportDetails(o.getDownloadSensitiveTypesExportDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DownloadSensitiveTypesExportRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DownloadSensitiveTypesExportRequest
         */
        public DownloadSensitiveTypesExportRequest build() {
            DownloadSensitiveTypesExportRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.datasafe.model.DownloadSensitiveTypesExportDetails body) {
            downloadSensitiveTypesExportDetails(body);
            return this;
        }

        /**
         * Build the instance of DownloadSensitiveTypesExportRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DownloadSensitiveTypesExportRequest
         */
        public DownloadSensitiveTypesExportRequest buildWithoutInvocationCallback() {
            DownloadSensitiveTypesExportRequest request = new DownloadSensitiveTypesExportRequest();
            request.sensitiveTypesExportId = sensitiveTypesExportId;
            request.downloadSensitiveTypesExportDetails = downloadSensitiveTypesExportDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new DownloadSensitiveTypesExportRequest(sensitiveTypesExportId, downloadSensitiveTypesExportDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .sensitiveTypesExportId(sensitiveTypesExportId)
                .downloadSensitiveTypesExportDetails(downloadSensitiveTypesExportDetails)
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
        sb.append(",sensitiveTypesExportId=").append(String.valueOf(this.sensitiveTypesExportId));
        sb.append(",downloadSensitiveTypesExportDetails=")
                .append(String.valueOf(this.downloadSensitiveTypesExportDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DownloadSensitiveTypesExportRequest)) {
            return false;
        }

        DownloadSensitiveTypesExportRequest other = (DownloadSensitiveTypesExportRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.sensitiveTypesExportId, other.sensitiveTypesExportId)
                && java.util.Objects.equals(
                        this.downloadSensitiveTypesExportDetails,
                        other.downloadSensitiveTypesExportDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sensitiveTypesExportId == null
                                ? 43
                                : this.sensitiveTypesExportId.hashCode());
        result =
                (result * PRIME)
                        + (this.downloadSensitiveTypesExportDetails == null
                                ? 43
                                : this.downloadSensitiveTypesExportDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
