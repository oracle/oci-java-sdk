/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.requests;

import com.oracle.bmc.filestorage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/UpdateExportSetExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateExportSetRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public class UpdateExportSetRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.filestorage.model.UpdateExportSetDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the export set.
     */
    private String exportSetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the export set.
     */
    public String getExportSetId() {
        return exportSetId;
    }
    /**
     * Details object for updating an export set.
     */
    private com.oracle.bmc.filestorage.model.UpdateExportSetDetails updateExportSetDetails;

    /**
     * Details object for updating an export set.
     */
    public com.oracle.bmc.filestorage.model.UpdateExportSetDetails getUpdateExportSetDetails() {
        return updateExportSetDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
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
    public com.oracle.bmc.filestorage.model.UpdateExportSetDetails getBody$() {
        return updateExportSetDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateExportSetRequest,
                    com.oracle.bmc.filestorage.model.UpdateExportSetDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the export set.
         */
        private String exportSetId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the export set.
         * @param exportSetId the value to set
         * @return this builder instance
         */
        public Builder exportSetId(String exportSetId) {
            this.exportSetId = exportSetId;
            return this;
        }

        /**
         * Details object for updating an export set.
         */
        private com.oracle.bmc.filestorage.model.UpdateExportSetDetails updateExportSetDetails =
                null;

        /**
         * Details object for updating an export set.
         * @param updateExportSetDetails the value to set
         * @return this builder instance
         */
        public Builder updateExportSetDetails(
                com.oracle.bmc.filestorage.model.UpdateExportSetDetails updateExportSetDetails) {
            this.updateExportSetDetails = updateExportSetDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
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
        public Builder copy(UpdateExportSetRequest o) {
            exportSetId(o.getExportSetId());
            updateExportSetDetails(o.getUpdateExportSetDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateExportSetRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateExportSetRequest
         */
        public UpdateExportSetRequest build() {
            UpdateExportSetRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.filestorage.model.UpdateExportSetDetails body) {
            updateExportSetDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateExportSetRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateExportSetRequest
         */
        public UpdateExportSetRequest buildWithoutInvocationCallback() {
            UpdateExportSetRequest request = new UpdateExportSetRequest();
            request.exportSetId = exportSetId;
            request.updateExportSetDetails = updateExportSetDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateExportSetRequest(exportSetId, updateExportSetDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .exportSetId(exportSetId)
                .updateExportSetDetails(updateExportSetDetails)
                .ifMatch(ifMatch)
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
        sb.append(",exportSetId=").append(String.valueOf(this.exportSetId));
        sb.append(",updateExportSetDetails=").append(String.valueOf(this.updateExportSetDetails));
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
        if (!(o instanceof UpdateExportSetRequest)) {
            return false;
        }

        UpdateExportSetRequest other = (UpdateExportSetRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.exportSetId, other.exportSetId)
                && java.util.Objects.equals(
                        this.updateExportSetDetails, other.updateExportSetDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.exportSetId == null ? 43 : this.exportSetId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateExportSetDetails == null
                                ? 43
                                : this.updateExportSetDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
