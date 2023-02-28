/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdateFunctionLibraryExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateFunctionLibraryRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class UpdateFunctionLibraryRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataintegration.model.UpdateFunctionLibraryDetails> {

    /** The workspace ID. */
    private String workspaceId;

    /** The workspace ID. */
    public String getWorkspaceId() {
        return workspaceId;
    }
    /** The functionLibrary key. */
    private String functionLibraryKey;

    /** The functionLibrary key. */
    public String getFunctionLibraryKey() {
        return functionLibraryKey;
    }
    /** The details needed to update a FunctionL ibrary. */
    private com.oracle.bmc.dataintegration.model.UpdateFunctionLibraryDetails
            updateFunctionLibraryDetails;

    /** The details needed to update a FunctionL ibrary. */
    public com.oracle.bmc.dataintegration.model.UpdateFunctionLibraryDetails
            getUpdateFunctionLibraryDetails() {
        return updateFunctionLibraryDetails;
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
    public com.oracle.bmc.dataintegration.model.UpdateFunctionLibraryDetails getBody$() {
        return updateFunctionLibraryDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateFunctionLibraryRequest,
                    com.oracle.bmc.dataintegration.model.UpdateFunctionLibraryDetails> {
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

        /** The functionLibrary key. */
        private String functionLibraryKey = null;

        /**
         * The functionLibrary key.
         *
         * @param functionLibraryKey the value to set
         * @return this builder instance
         */
        public Builder functionLibraryKey(String functionLibraryKey) {
            this.functionLibraryKey = functionLibraryKey;
            return this;
        }

        /** The details needed to update a FunctionL ibrary. */
        private com.oracle.bmc.dataintegration.model.UpdateFunctionLibraryDetails
                updateFunctionLibraryDetails = null;

        /**
         * The details needed to update a FunctionL ibrary.
         *
         * @param updateFunctionLibraryDetails the value to set
         * @return this builder instance
         */
        public Builder updateFunctionLibraryDetails(
                com.oracle.bmc.dataintegration.model.UpdateFunctionLibraryDetails
                        updateFunctionLibraryDetails) {
            this.updateFunctionLibraryDetails = updateFunctionLibraryDetails;
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
        public Builder copy(UpdateFunctionLibraryRequest o) {
            workspaceId(o.getWorkspaceId());
            functionLibraryKey(o.getFunctionLibraryKey());
            updateFunctionLibraryDetails(o.getUpdateFunctionLibraryDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateFunctionLibraryRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateFunctionLibraryRequest
         */
        public UpdateFunctionLibraryRequest build() {
            UpdateFunctionLibraryRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.dataintegration.model.UpdateFunctionLibraryDetails body) {
            updateFunctionLibraryDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateFunctionLibraryRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateFunctionLibraryRequest
         */
        public UpdateFunctionLibraryRequest buildWithoutInvocationCallback() {
            UpdateFunctionLibraryRequest request = new UpdateFunctionLibraryRequest();
            request.workspaceId = workspaceId;
            request.functionLibraryKey = functionLibraryKey;
            request.updateFunctionLibraryDetails = updateFunctionLibraryDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateFunctionLibraryRequest(workspaceId, functionLibraryKey,
            // updateFunctionLibraryDetails, opcRequestId, ifMatch);
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
                .functionLibraryKey(functionLibraryKey)
                .updateFunctionLibraryDetails(updateFunctionLibraryDetails)
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
        sb.append(",functionLibraryKey=").append(String.valueOf(this.functionLibraryKey));
        sb.append(",updateFunctionLibraryDetails=")
                .append(String.valueOf(this.updateFunctionLibraryDetails));
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
        if (!(o instanceof UpdateFunctionLibraryRequest)) {
            return false;
        }

        UpdateFunctionLibraryRequest other = (UpdateFunctionLibraryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.functionLibraryKey, other.functionLibraryKey)
                && java.util.Objects.equals(
                        this.updateFunctionLibraryDetails, other.updateFunctionLibraryDetails)
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
                        + (this.functionLibraryKey == null
                                ? 43
                                : this.functionLibraryKey.hashCode());
        result =
                (result * PRIME)
                        + (this.updateFunctionLibraryDetails == null
                                ? 43
                                : this.updateFunctionLibraryDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
