/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.requests;

import com.oracle.bmc.licensemanager.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/licensemanager/BulkUploadLicenseRecordsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use BulkUploadLicenseRecordsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
public class BulkUploadLicenseRecordsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.licensemanager.model.BulkUploadLicenseRecordsDetails> {

    /**
     * Details required for the bulk upload of product licenses and license records.
     */
    private com.oracle.bmc.licensemanager.model.BulkUploadLicenseRecordsDetails
            bulkUploadLicenseRecordsDetails;

    /**
     * Details required for the bulk upload of product licenses and license records.
     */
    public com.oracle.bmc.licensemanager.model.BulkUploadLicenseRecordsDetails
            getBulkUploadLicenseRecordsDetails() {
        return bulkUploadLicenseRecordsDetails;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
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
    public com.oracle.bmc.licensemanager.model.BulkUploadLicenseRecordsDetails getBody$() {
        return bulkUploadLicenseRecordsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    BulkUploadLicenseRecordsRequest,
                    com.oracle.bmc.licensemanager.model.BulkUploadLicenseRecordsDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Details required for the bulk upload of product licenses and license records.
         */
        private com.oracle.bmc.licensemanager.model.BulkUploadLicenseRecordsDetails
                bulkUploadLicenseRecordsDetails = null;

        /**
         * Details required for the bulk upload of product licenses and license records.
         * @param bulkUploadLicenseRecordsDetails the value to set
         * @return this builder instance
         */
        public Builder bulkUploadLicenseRecordsDetails(
                com.oracle.bmc.licensemanager.model.BulkUploadLicenseRecordsDetails
                        bulkUploadLicenseRecordsDetails) {
            this.bulkUploadLicenseRecordsDetails = bulkUploadLicenseRecordsDetails;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(BulkUploadLicenseRecordsRequest o) {
            bulkUploadLicenseRecordsDetails(o.getBulkUploadLicenseRecordsDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of BulkUploadLicenseRecordsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of BulkUploadLicenseRecordsRequest
         */
        public BulkUploadLicenseRecordsRequest build() {
            BulkUploadLicenseRecordsRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.licensemanager.model.BulkUploadLicenseRecordsDetails body) {
            bulkUploadLicenseRecordsDetails(body);
            return this;
        }

        /**
         * Build the instance of BulkUploadLicenseRecordsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of BulkUploadLicenseRecordsRequest
         */
        public BulkUploadLicenseRecordsRequest buildWithoutInvocationCallback() {
            BulkUploadLicenseRecordsRequest request = new BulkUploadLicenseRecordsRequest();
            request.bulkUploadLicenseRecordsDetails = bulkUploadLicenseRecordsDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new BulkUploadLicenseRecordsRequest(bulkUploadLicenseRecordsDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bulkUploadLicenseRecordsDetails(bulkUploadLicenseRecordsDetails)
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
        sb.append(",bulkUploadLicenseRecordsDetails=")
                .append(String.valueOf(this.bulkUploadLicenseRecordsDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkUploadLicenseRecordsRequest)) {
            return false;
        }

        BulkUploadLicenseRecordsRequest other = (BulkUploadLicenseRecordsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.bulkUploadLicenseRecordsDetails, other.bulkUploadLicenseRecordsDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bulkUploadLicenseRecordsDetails == null
                                ? 43
                                : this.bulkUploadLicenseRecordsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
