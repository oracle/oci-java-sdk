/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/SynchronousExportDataAssetExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SynchronousExportDataAssetRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class SynchronousExportDataAssetRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datacatalog.model.ExportDataAssetDetails> {

    /** Unique catalog identifier. */
    private String catalogId;

    /** Unique catalog identifier. */
    public String getCatalogId() {
        return catalogId;
    }
    /** Unique data asset key. */
    private String dataAssetKey;

    /** Unique data asset key. */
    public String getDataAssetKey() {
        return dataAssetKey;
    }
    /** The details of what needs to be exported. */
    private com.oracle.bmc.datacatalog.model.ExportDataAssetDetails
            synchronousExportDataAssetDetails;

    /** The details of what needs to be exported. */
    public com.oracle.bmc.datacatalog.model.ExportDataAssetDetails
            getSynchronousExportDataAssetDetails() {
        return synchronousExportDataAssetDetails;
    }
    /** Type of export. */
    private java.util.List<com.oracle.bmc.datacatalog.model.DataAssetImportExportTypeFilter>
            exportType;

    /** Type of export. */
    public java.util.List<com.oracle.bmc.datacatalog.model.DataAssetImportExportTypeFilter>
            getExportType() {
        return exportType;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
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
    public com.oracle.bmc.datacatalog.model.ExportDataAssetDetails getBody$() {
        return synchronousExportDataAssetDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SynchronousExportDataAssetRequest,
                    com.oracle.bmc.datacatalog.model.ExportDataAssetDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique catalog identifier. */
        private String catalogId = null;

        /**
         * Unique catalog identifier.
         *
         * @param catalogId the value to set
         * @return this builder instance
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /** Unique data asset key. */
        private String dataAssetKey = null;

        /**
         * Unique data asset key.
         *
         * @param dataAssetKey the value to set
         * @return this builder instance
         */
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            return this;
        }

        /** The details of what needs to be exported. */
        private com.oracle.bmc.datacatalog.model.ExportDataAssetDetails
                synchronousExportDataAssetDetails = null;

        /**
         * The details of what needs to be exported.
         *
         * @param synchronousExportDataAssetDetails the value to set
         * @return this builder instance
         */
        public Builder synchronousExportDataAssetDetails(
                com.oracle.bmc.datacatalog.model.ExportDataAssetDetails
                        synchronousExportDataAssetDetails) {
            this.synchronousExportDataAssetDetails = synchronousExportDataAssetDetails;
            return this;
        }

        /** Type of export. */
        private java.util.List<com.oracle.bmc.datacatalog.model.DataAssetImportExportTypeFilter>
                exportType = null;

        /**
         * Type of export.
         *
         * @param exportType the value to set
         * @return this builder instance
         */
        public Builder exportType(
                java.util.List<com.oracle.bmc.datacatalog.model.DataAssetImportExportTypeFilter>
                        exportType) {
            this.exportType = exportType;
            return this;
        }

        /**
         * Singular setter. Type of export.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder exportType(DataAssetImportExportTypeFilter singularValue) {
            return this.exportType(java.util.Arrays.asList(singularValue));
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
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
        public Builder copy(SynchronousExportDataAssetRequest o) {
            catalogId(o.getCatalogId());
            dataAssetKey(o.getDataAssetKey());
            synchronousExportDataAssetDetails(o.getSynchronousExportDataAssetDetails());
            exportType(o.getExportType());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SynchronousExportDataAssetRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SynchronousExportDataAssetRequest
         */
        public SynchronousExportDataAssetRequest build() {
            SynchronousExportDataAssetRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datacatalog.model.ExportDataAssetDetails body) {
            synchronousExportDataAssetDetails(body);
            return this;
        }

        /**
         * Build the instance of SynchronousExportDataAssetRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SynchronousExportDataAssetRequest
         */
        public SynchronousExportDataAssetRequest buildWithoutInvocationCallback() {
            SynchronousExportDataAssetRequest request = new SynchronousExportDataAssetRequest();
            request.catalogId = catalogId;
            request.dataAssetKey = dataAssetKey;
            request.synchronousExportDataAssetDetails = synchronousExportDataAssetDetails;
            request.exportType = exportType;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new SynchronousExportDataAssetRequest(catalogId, dataAssetKey,
            // synchronousExportDataAssetDetails, exportType, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogId(catalogId)
                .dataAssetKey(dataAssetKey)
                .synchronousExportDataAssetDetails(synchronousExportDataAssetDetails)
                .exportType(exportType)
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
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(",synchronousExportDataAssetDetails=")
                .append(String.valueOf(this.synchronousExportDataAssetDetails));
        sb.append(",exportType=").append(String.valueOf(this.exportType));
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
        if (!(o instanceof SynchronousExportDataAssetRequest)) {
            return false;
        }

        SynchronousExportDataAssetRequest other = (SynchronousExportDataAssetRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(
                        this.synchronousExportDataAssetDetails,
                        other.synchronousExportDataAssetDetails)
                && java.util.Objects.equals(this.exportType, other.exportType)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result =
                (result * PRIME)
                        + (this.synchronousExportDataAssetDetails == null
                                ? 43
                                : this.synchronousExportDataAssetDetails.hashCode());
        result = (result * PRIME) + (this.exportType == null ? 43 : this.exportType.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
