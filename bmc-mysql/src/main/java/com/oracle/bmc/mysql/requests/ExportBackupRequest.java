/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.requests;

import com.oracle.bmc.mysql.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/ExportBackupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ExportBackupRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class ExportBackupRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.mysql.model.ExportBackupDetails> {

    /** The OCID of the Backup */
    private String backupId;

    /** The OCID of the Backup */
    public String getBackupId() {
        return backupId;
    }
    /** Details required to export a given DB system backup to an Object Storage bucket. */
    private com.oracle.bmc.mysql.model.ExportBackupDetails exportBackupDetails;

    /** Details required to export a given DB system backup to an Object Storage bucket. */
    public com.oracle.bmc.mysql.model.ExportBackupDetails getExportBackupDetails() {
        return exportBackupDetails;
    }
    /**
     * Customer-defined unique identifier for the request. If you need to contact Oracle about a
     * specific request, please provide the request ID that you supplied in this header with the
     * request.
     */
    private String opcRequestId;

    /**
     * Customer-defined unique identifier for the request. If you need to contact Oracle about a
     * specific request, please provide the request ID that you supplied in this header with the
     * request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.mysql.model.ExportBackupDetails getBody$() {
        return exportBackupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ExportBackupRequest, com.oracle.bmc.mysql.model.ExportBackupDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the Backup */
        private String backupId = null;

        /**
         * The OCID of the Backup
         *
         * @param backupId the value to set
         * @return this builder instance
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /** Details required to export a given DB system backup to an Object Storage bucket. */
        private com.oracle.bmc.mysql.model.ExportBackupDetails exportBackupDetails = null;

        /**
         * Details required to export a given DB system backup to an Object Storage bucket.
         *
         * @param exportBackupDetails the value to set
         * @return this builder instance
         */
        public Builder exportBackupDetails(
                com.oracle.bmc.mysql.model.ExportBackupDetails exportBackupDetails) {
            this.exportBackupDetails = exportBackupDetails;
            return this;
        }

        /**
         * Customer-defined unique identifier for the request. If you need to contact Oracle about a
         * specific request, please provide the request ID that you supplied in this header with the
         * request.
         */
        private String opcRequestId = null;

        /**
         * Customer-defined unique identifier for the request. If you need to contact Oracle about a
         * specific request, please provide the request ID that you supplied in this header with the
         * request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(ExportBackupRequest o) {
            backupId(o.getBackupId());
            exportBackupDetails(o.getExportBackupDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ExportBackupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ExportBackupRequest
         */
        public ExportBackupRequest build() {
            ExportBackupRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.mysql.model.ExportBackupDetails body) {
            exportBackupDetails(body);
            return this;
        }

        /**
         * Build the instance of ExportBackupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ExportBackupRequest
         */
        public ExportBackupRequest buildWithoutInvocationCallback() {
            ExportBackupRequest request = new ExportBackupRequest();
            request.backupId = backupId;
            request.exportBackupDetails = exportBackupDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ExportBackupRequest(backupId, exportBackupDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .backupId(backupId)
                .exportBackupDetails(exportBackupDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",backupId=").append(String.valueOf(this.backupId));
        sb.append(",exportBackupDetails=").append(String.valueOf(this.exportBackupDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportBackupRequest)) {
            return false;
        }

        ExportBackupRequest other = (ExportBackupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.backupId, other.backupId)
                && java.util.Objects.equals(this.exportBackupDetails, other.exportBackupDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.backupId == null ? 43 : this.backupId.hashCode());
        result =
                (result * PRIME)
                        + (this.exportBackupDetails == null
                                ? 43
                                : this.exportBackupDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
