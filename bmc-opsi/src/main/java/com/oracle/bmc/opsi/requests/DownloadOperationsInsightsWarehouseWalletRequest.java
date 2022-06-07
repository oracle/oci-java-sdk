/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DownloadOperationsInsightsWarehouseWalletExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use DownloadOperationsInsightsWarehouseWalletRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class DownloadOperationsInsightsWarehouseWalletRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.opsi.model.DownloadOperationsInsightsWarehouseWalletDetails> {

    /**
     * Unique Operations Insights Warehouse identifier
     */
    private String operationsInsightsWarehouseId;

    public String getOperationsInsightsWarehouseId() {
        return operationsInsightsWarehouseId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.opsi.model.DownloadOperationsInsightsWarehouseWalletDetails
            downloadOperationsInsightsWarehouseWalletDetails;

    public com.oracle.bmc.opsi.model.DownloadOperationsInsightsWarehouseWalletDetails
            getDownloadOperationsInsightsWarehouseWalletDetails() {
        return downloadOperationsInsightsWarehouseWalletDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request that can be retried in case of a timeout or
     * server error without risk of executing the same action again. Retry tokens expire after 24
     * hours.
     * <p>
     *Note:* Retry tokens can be invalidated before the 24 hour time limit due to conflicting
     * operations, such as a resource being deleted or purged from the system.
     *
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.opsi.model.DownloadOperationsInsightsWarehouseWalletDetails getBody$() {
        return downloadOperationsInsightsWarehouseWalletDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DownloadOperationsInsightsWarehouseWalletRequest,
                    com.oracle.bmc.opsi.model.DownloadOperationsInsightsWarehouseWalletDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String operationsInsightsWarehouseId = null;

        /**
         * Unique Operations Insights Warehouse identifier
         * @return this builder instance
         */
        public Builder operationsInsightsWarehouseId(String operationsInsightsWarehouseId) {
            this.operationsInsightsWarehouseId = operationsInsightsWarehouseId;
            return this;
        }

        private com.oracle.bmc.opsi.model.DownloadOperationsInsightsWarehouseWalletDetails
                downloadOperationsInsightsWarehouseWalletDetails = null;

        /**
         * The information to be updated.
         * @return this builder instance
         */
        public Builder downloadOperationsInsightsWarehouseWalletDetails(
                com.oracle.bmc.opsi.model.DownloadOperationsInsightsWarehouseWalletDetails
                        downloadOperationsInsightsWarehouseWalletDetails) {
            this.downloadOperationsInsightsWarehouseWalletDetails =
                    downloadOperationsInsightsWarehouseWalletDetails;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request that can be retried in case of a timeout or
         * server error without risk of executing the same action again. Retry tokens expire after 24
         * hours.
         * <p>
         *Note:* Retry tokens can be invalidated before the 24 hour time limit due to conflicting
         * operations, such as a resource being deleted or purged from the system.
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(DownloadOperationsInsightsWarehouseWalletRequest o) {
            operationsInsightsWarehouseId(o.getOperationsInsightsWarehouseId());
            downloadOperationsInsightsWarehouseWalletDetails(
                    o.getDownloadOperationsInsightsWarehouseWalletDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DownloadOperationsInsightsWarehouseWalletRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DownloadOperationsInsightsWarehouseWalletRequest
         */
        public DownloadOperationsInsightsWarehouseWalletRequest build() {
            DownloadOperationsInsightsWarehouseWalletRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.opsi.model.DownloadOperationsInsightsWarehouseWalletDetails body) {
            downloadOperationsInsightsWarehouseWalletDetails(body);
            return this;
        }

        /**
         * Build the instance of DownloadOperationsInsightsWarehouseWalletRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DownloadOperationsInsightsWarehouseWalletRequest
         */
        public DownloadOperationsInsightsWarehouseWalletRequest buildWithoutInvocationCallback() {
            DownloadOperationsInsightsWarehouseWalletRequest request =
                    new DownloadOperationsInsightsWarehouseWalletRequest();
            request.operationsInsightsWarehouseId = operationsInsightsWarehouseId;
            request.downloadOperationsInsightsWarehouseWalletDetails =
                    downloadOperationsInsightsWarehouseWalletDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new DownloadOperationsInsightsWarehouseWalletRequest(operationsInsightsWarehouseId, downloadOperationsInsightsWarehouseWalletDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .operationsInsightsWarehouseId(operationsInsightsWarehouseId)
                .downloadOperationsInsightsWarehouseWalletDetails(
                        downloadOperationsInsightsWarehouseWalletDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",operationsInsightsWarehouseId=")
                .append(String.valueOf(this.operationsInsightsWarehouseId));
        sb.append(",downloadOperationsInsightsWarehouseWalletDetails=")
                .append(String.valueOf(this.downloadOperationsInsightsWarehouseWalletDetails));
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
        if (!(o instanceof DownloadOperationsInsightsWarehouseWalletRequest)) {
            return false;
        }

        DownloadOperationsInsightsWarehouseWalletRequest other =
                (DownloadOperationsInsightsWarehouseWalletRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.operationsInsightsWarehouseId, other.operationsInsightsWarehouseId)
                && java.util.Objects.equals(
                        this.downloadOperationsInsightsWarehouseWalletDetails,
                        other.downloadOperationsInsightsWarehouseWalletDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.operationsInsightsWarehouseId == null
                                ? 43
                                : this.operationsInsightsWarehouseId.hashCode());
        result =
                (result * PRIME)
                        + (this.downloadOperationsInsightsWarehouseWalletDetails == null
                                ? 43
                                : this.downloadOperationsInsightsWarehouseWalletDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
