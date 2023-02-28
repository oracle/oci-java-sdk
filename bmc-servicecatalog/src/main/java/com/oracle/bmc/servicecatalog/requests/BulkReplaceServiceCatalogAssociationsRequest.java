/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.requests;

import com.oracle.bmc.servicecatalog.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/servicecatalog/BulkReplaceServiceCatalogAssociationsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * BulkReplaceServiceCatalogAssociationsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
public class BulkReplaceServiceCatalogAssociationsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.servicecatalog.model.BulkReplaceServiceCatalogAssociationsDetails> {

    /** The unique identifier for the service catalog. */
    private String serviceCatalogId;

    /** The unique identifier for the service catalog. */
    public String getServiceCatalogId() {
        return serviceCatalogId;
    }
    /** Details of the service catalog update operation. */
    private com.oracle.bmc.servicecatalog.model.BulkReplaceServiceCatalogAssociationsDetails
            bulkReplaceServiceCatalogAssociationsDetails;

    /** Details of the service catalog update operation. */
    public com.oracle.bmc.servicecatalog.model.BulkReplaceServiceCatalogAssociationsDetails
            getBulkReplaceServiceCatalogAssociationsDetails() {
        return bulkReplaceServiceCatalogAssociationsDetails;
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
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
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
    public com.oracle.bmc.servicecatalog.model.BulkReplaceServiceCatalogAssociationsDetails
            getBody$() {
        return bulkReplaceServiceCatalogAssociationsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    BulkReplaceServiceCatalogAssociationsRequest,
                    com.oracle.bmc.servicecatalog.model
                            .BulkReplaceServiceCatalogAssociationsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique identifier for the service catalog. */
        private String serviceCatalogId = null;

        /**
         * The unique identifier for the service catalog.
         *
         * @param serviceCatalogId the value to set
         * @return this builder instance
         */
        public Builder serviceCatalogId(String serviceCatalogId) {
            this.serviceCatalogId = serviceCatalogId;
            return this;
        }

        /** Details of the service catalog update operation. */
        private com.oracle.bmc.servicecatalog.model.BulkReplaceServiceCatalogAssociationsDetails
                bulkReplaceServiceCatalogAssociationsDetails = null;

        /**
         * Details of the service catalog update operation.
         *
         * @param bulkReplaceServiceCatalogAssociationsDetails the value to set
         * @return this builder instance
         */
        public Builder bulkReplaceServiceCatalogAssociationsDetails(
                com.oracle.bmc.servicecatalog.model.BulkReplaceServiceCatalogAssociationsDetails
                        bulkReplaceServiceCatalogAssociationsDetails) {
            this.bulkReplaceServiceCatalogAssociationsDetails =
                    bulkReplaceServiceCatalogAssociationsDetails;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
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
        public Builder copy(BulkReplaceServiceCatalogAssociationsRequest o) {
            serviceCatalogId(o.getServiceCatalogId());
            bulkReplaceServiceCatalogAssociationsDetails(
                    o.getBulkReplaceServiceCatalogAssociationsDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of BulkReplaceServiceCatalogAssociationsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of BulkReplaceServiceCatalogAssociationsRequest
         */
        public BulkReplaceServiceCatalogAssociationsRequest build() {
            BulkReplaceServiceCatalogAssociationsRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.servicecatalog.model.BulkReplaceServiceCatalogAssociationsDetails
                        body) {
            bulkReplaceServiceCatalogAssociationsDetails(body);
            return this;
        }

        /**
         * Build the instance of BulkReplaceServiceCatalogAssociationsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of BulkReplaceServiceCatalogAssociationsRequest
         */
        public BulkReplaceServiceCatalogAssociationsRequest buildWithoutInvocationCallback() {
            BulkReplaceServiceCatalogAssociationsRequest request =
                    new BulkReplaceServiceCatalogAssociationsRequest();
            request.serviceCatalogId = serviceCatalogId;
            request.bulkReplaceServiceCatalogAssociationsDetails =
                    bulkReplaceServiceCatalogAssociationsDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new BulkReplaceServiceCatalogAssociationsRequest(serviceCatalogId,
            // bulkReplaceServiceCatalogAssociationsDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .serviceCatalogId(serviceCatalogId)
                .bulkReplaceServiceCatalogAssociationsDetails(
                        bulkReplaceServiceCatalogAssociationsDetails)
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
        sb.append(",serviceCatalogId=").append(String.valueOf(this.serviceCatalogId));
        sb.append(",bulkReplaceServiceCatalogAssociationsDetails=")
                .append(String.valueOf(this.bulkReplaceServiceCatalogAssociationsDetails));
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
        if (!(o instanceof BulkReplaceServiceCatalogAssociationsRequest)) {
            return false;
        }

        BulkReplaceServiceCatalogAssociationsRequest other =
                (BulkReplaceServiceCatalogAssociationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.serviceCatalogId, other.serviceCatalogId)
                && java.util.Objects.equals(
                        this.bulkReplaceServiceCatalogAssociationsDetails,
                        other.bulkReplaceServiceCatalogAssociationsDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.serviceCatalogId == null ? 43 : this.serviceCatalogId.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkReplaceServiceCatalogAssociationsDetails == null
                                ? 43
                                : this.bulkReplaceServiceCatalogAssociationsDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
