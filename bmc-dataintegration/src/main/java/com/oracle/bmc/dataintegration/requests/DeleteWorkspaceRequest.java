/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeleteWorkspaceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteWorkspaceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class DeleteWorkspaceRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The workspace ID. */
    private String workspaceId;

    /** The workspace ID. */
    public String getWorkspaceId() {
        return workspaceId;
    }
    /**
     * Used to set the timeout for Data Integration to gracefully close down any running jobs before
     * stopping the workspace.
     */
    private Long quiesceTimeout;

    /**
     * Used to set the timeout for Data Integration to gracefully close down any running jobs before
     * stopping the workspace.
     */
    public Long getQuiesceTimeout() {
        return quiesceTimeout;
    }
    /** Used to force close down the workspace. */
    private Boolean isForceOperation;

    /** Used to force close down the workspace. */
    public Boolean getIsForceOperation() {
        return isForceOperation;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteWorkspaceRequest, java.lang.Void> {
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

        /**
         * Used to set the timeout for Data Integration to gracefully close down any running jobs
         * before stopping the workspace.
         */
        private Long quiesceTimeout = null;

        /**
         * Used to set the timeout for Data Integration to gracefully close down any running jobs
         * before stopping the workspace.
         *
         * @param quiesceTimeout the value to set
         * @return this builder instance
         */
        public Builder quiesceTimeout(Long quiesceTimeout) {
            this.quiesceTimeout = quiesceTimeout;
            return this;
        }

        /** Used to force close down the workspace. */
        private Boolean isForceOperation = null;

        /**
         * Used to force close down the workspace.
         *
         * @param isForceOperation the value to set
         * @return this builder instance
         */
        public Builder isForceOperation(Boolean isForceOperation) {
            this.isForceOperation = isForceOperation;
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
        public Builder copy(DeleteWorkspaceRequest o) {
            workspaceId(o.getWorkspaceId());
            quiesceTimeout(o.getQuiesceTimeout());
            isForceOperation(o.getIsForceOperation());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteWorkspaceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteWorkspaceRequest
         */
        public DeleteWorkspaceRequest build() {
            DeleteWorkspaceRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteWorkspaceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteWorkspaceRequest
         */
        public DeleteWorkspaceRequest buildWithoutInvocationCallback() {
            DeleteWorkspaceRequest request = new DeleteWorkspaceRequest();
            request.workspaceId = workspaceId;
            request.quiesceTimeout = quiesceTimeout;
            request.isForceOperation = isForceOperation;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new DeleteWorkspaceRequest(workspaceId, quiesceTimeout, isForceOperation, ifMatch,
            // opcRequestId);
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
                .quiesceTimeout(quiesceTimeout)
                .isForceOperation(isForceOperation)
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
        sb.append(",workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(",quiesceTimeout=").append(String.valueOf(this.quiesceTimeout));
        sb.append(",isForceOperation=").append(String.valueOf(this.isForceOperation));
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
        if (!(o instanceof DeleteWorkspaceRequest)) {
            return false;
        }

        DeleteWorkspaceRequest other = (DeleteWorkspaceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.quiesceTimeout, other.quiesceTimeout)
                && java.util.Objects.equals(this.isForceOperation, other.isForceOperation)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.quiesceTimeout == null ? 43 : this.quiesceTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.isForceOperation == null ? 43 : this.isForceOperation.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
