/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdateExportRequestExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateExportRequestRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class UpdateExportRequestRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataintegration.model.UpdateExportRequestDetails> {

    /** The workspace ID. */
    private String workspaceId;

    /** The workspace ID. */
    public String getWorkspaceId() {
        return workspaceId;
    }
    /** The key of the object export object request */
    private String exportRequestKey;

    /** The key of the object export object request */
    public String getExportRequestKey() {
        return exportRequestKey;
    }
    /** The details needed to update the status of a export object request. */
    private com.oracle.bmc.dataintegration.model.UpdateExportRequestDetails
            updateExportRequestDetails;

    /** The details needed to update the status of a export object request. */
    public com.oracle.bmc.dataintegration.model.UpdateExportRequestDetails
            getUpdateExportRequestDetails() {
        return updateExportRequestDetails;
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
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the {@code etag} from a previous GET or POST response for
     * that resource. The resource will be updated or deleted only if the {@code etag} you provide
     * matches the resource's current {@code etag} value. When 'if-match' is provided and its value
     * does not exactly match the 'etag' of the resource on the server, the request fails with the
     * 412 response code.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the {@code etag} from a previous GET or POST response for
     * that resource. The resource will be updated or deleted only if the {@code etag} you provide
     * matches the resource's current {@code etag} value. When 'if-match' is provided and its value
     * does not exactly match the 'etag' of the resource on the server, the request fails with the
     * 412 response code.
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dataintegration.model.UpdateExportRequestDetails getBody$() {
        return updateExportRequestDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateExportRequestRequest,
                    com.oracle.bmc.dataintegration.model.UpdateExportRequestDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The workspace ID. */
        private String workspaceId = null;

        /**
         * The workspace ID.
         *
         * @param workspaceId the value to set
         * @return this builder instance
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /** The key of the object export object request */
        private String exportRequestKey = null;

        /**
         * The key of the object export object request
         *
         * @param exportRequestKey the value to set
         * @return this builder instance
         */
        public Builder exportRequestKey(String exportRequestKey) {
            this.exportRequestKey = exportRequestKey;
            return this;
        }

        /** The details needed to update the status of a export object request. */
        private com.oracle.bmc.dataintegration.model.UpdateExportRequestDetails
                updateExportRequestDetails = null;

        /**
         * The details needed to update the status of a export object request.
         *
         * @param updateExportRequestDetails the value to set
         * @return this builder instance
         */
        public Builder updateExportRequestDetails(
                com.oracle.bmc.dataintegration.model.UpdateExportRequestDetails
                        updateExportRequestDetails) {
            this.updateExportRequestDetails = updateExportRequestDetails;
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
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST
         * response for that resource. The resource will be updated or deleted only if the {@code
         * etag} you provide matches the resource's current {@code etag} value. When 'if-match' is
         * provided and its value does not exactly match the 'etag' of the resource on the server,
         * the request fails with the 412 response code.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST
         * response for that resource. The resource will be updated or deleted only if the {@code
         * etag} you provide matches the resource's current {@code etag} value. When 'if-match' is
         * provided and its value does not exactly match the 'etag' of the resource on the server,
         * the request fails with the 412 response code.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateExportRequestRequest o) {
            workspaceId(o.getWorkspaceId());
            exportRequestKey(o.getExportRequestKey());
            updateExportRequestDetails(o.getUpdateExportRequestDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateExportRequestRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateExportRequestRequest
         */
        public UpdateExportRequestRequest build() {
            UpdateExportRequestRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dataintegration.model.UpdateExportRequestDetails body) {
            updateExportRequestDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateExportRequestRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateExportRequestRequest
         */
        public UpdateExportRequestRequest buildWithoutInvocationCallback() {
            UpdateExportRequestRequest request = new UpdateExportRequestRequest();
            request.workspaceId = workspaceId;
            request.exportRequestKey = exportRequestKey;
            request.updateExportRequestDetails = updateExportRequestDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateExportRequestRequest(workspaceId, exportRequestKey,
            // updateExportRequestDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .workspaceId(workspaceId)
                .exportRequestKey(exportRequestKey)
                .updateExportRequestDetails(updateExportRequestDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(",exportRequestKey=").append(String.valueOf(this.exportRequestKey));
        sb.append(",updateExportRequestDetails=")
                .append(String.valueOf(this.updateExportRequestDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateExportRequestRequest)) {
            return false;
        }

        UpdateExportRequestRequest other = (UpdateExportRequestRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.exportRequestKey, other.exportRequestKey)
                && java.util.Objects.equals(
                        this.updateExportRequestDetails, other.updateExportRequestDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.exportRequestKey == null ? 43 : this.exportRequestKey.hashCode());
        result =
                (result * PRIME)
                        + (this.updateExportRequestDetails == null
                                ? 43
                                : this.updateExportRequestDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
