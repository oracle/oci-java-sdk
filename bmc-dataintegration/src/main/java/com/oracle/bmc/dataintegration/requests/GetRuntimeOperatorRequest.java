/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetRuntimeOperatorExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetRuntimeOperatorRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class GetRuntimeOperatorRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The workspace ID.
     */
    private String workspaceId;

    /**
     * The workspace ID.
     */
    public String getWorkspaceId() {
        return workspaceId;
    }
    /**
     * The application key.
     */
    private String applicationKey;

    /**
     * The application key.
     */
    public String getApplicationKey() {
        return applicationKey;
    }
    /**
     * Runtime Pipeline Key
     */
    private String runtimePipelineKey;

    /**
     * Runtime Pipeline Key
     */
    public String getRuntimePipelineKey() {
        return runtimePipelineKey;
    }
    /**
     * Runtime Operator Key
     */
    private String runtimeOperatorKey;

    /**
     * Runtime Operator Key
     */
    public String getRuntimeOperatorKey() {
        return runtimeOperatorKey;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetRuntimeOperatorRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The workspace ID.
         */
        private String workspaceId = null;

        /**
         * The workspace ID.
         * @param workspaceId the value to set
         * @return this builder instance
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * The application key.
         */
        private String applicationKey = null;

        /**
         * The application key.
         * @param applicationKey the value to set
         * @return this builder instance
         */
        public Builder applicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            return this;
        }

        /**
         * Runtime Pipeline Key
         */
        private String runtimePipelineKey = null;

        /**
         * Runtime Pipeline Key
         * @param runtimePipelineKey the value to set
         * @return this builder instance
         */
        public Builder runtimePipelineKey(String runtimePipelineKey) {
            this.runtimePipelineKey = runtimePipelineKey;
            return this;
        }

        /**
         * Runtime Operator Key
         */
        private String runtimeOperatorKey = null;

        /**
         * Runtime Operator Key
         * @param runtimeOperatorKey the value to set
         * @return this builder instance
         */
        public Builder runtimeOperatorKey(String runtimeOperatorKey) {
            this.runtimeOperatorKey = runtimeOperatorKey;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
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
        public Builder copy(GetRuntimeOperatorRequest o) {
            workspaceId(o.getWorkspaceId());
            applicationKey(o.getApplicationKey());
            runtimePipelineKey(o.getRuntimePipelineKey());
            runtimeOperatorKey(o.getRuntimeOperatorKey());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetRuntimeOperatorRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetRuntimeOperatorRequest
         */
        public GetRuntimeOperatorRequest build() {
            GetRuntimeOperatorRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetRuntimeOperatorRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetRuntimeOperatorRequest
         */
        public GetRuntimeOperatorRequest buildWithoutInvocationCallback() {
            GetRuntimeOperatorRequest request = new GetRuntimeOperatorRequest();
            request.workspaceId = workspaceId;
            request.applicationKey = applicationKey;
            request.runtimePipelineKey = runtimePipelineKey;
            request.runtimeOperatorKey = runtimeOperatorKey;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetRuntimeOperatorRequest(workspaceId, applicationKey, runtimePipelineKey, runtimeOperatorKey, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .workspaceId(workspaceId)
                .applicationKey(applicationKey)
                .runtimePipelineKey(runtimePipelineKey)
                .runtimeOperatorKey(runtimeOperatorKey)
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
        sb.append(",workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(",applicationKey=").append(String.valueOf(this.applicationKey));
        sb.append(",runtimePipelineKey=").append(String.valueOf(this.runtimePipelineKey));
        sb.append(",runtimeOperatorKey=").append(String.valueOf(this.runtimeOperatorKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetRuntimeOperatorRequest)) {
            return false;
        }

        GetRuntimeOperatorRequest other = (GetRuntimeOperatorRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.applicationKey, other.applicationKey)
                && java.util.Objects.equals(this.runtimePipelineKey, other.runtimePipelineKey)
                && java.util.Objects.equals(this.runtimeOperatorKey, other.runtimeOperatorKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationKey == null ? 43 : this.applicationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.runtimePipelineKey == null
                                ? 43
                                : this.runtimePipelineKey.hashCode());
        result =
                (result * PRIME)
                        + (this.runtimeOperatorKey == null
                                ? 43
                                : this.runtimeOperatorKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
