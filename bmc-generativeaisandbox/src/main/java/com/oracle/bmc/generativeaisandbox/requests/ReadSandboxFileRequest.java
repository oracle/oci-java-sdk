/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.requests;

import com.oracle.bmc.generativeaisandbox.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/ReadSandboxFileExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ReadSandboxFileRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
public class ReadSandboxFileRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Sandbox identifier. Newly generated Sandbox IDs use {@code sbx-} followed by 16 lowercase
     * base32 characters ({@code a-z2-7}); existing legacy IDs remain accepted.
     */
    private String sandboxId;

    /**
     * Sandbox identifier. Newly generated Sandbox IDs use {@code sbx-} followed by 16 lowercase
     * base32 characters ({@code a-z2-7}); existing legacy IDs remain accepted.
     */
    public String getSandboxId() {
        return sandboxId;
    }
    /** Absolute path under /workspace of the file to read. */
    private String filePath;

    /** Absolute path under /workspace of the file to read. */
    public String getFilePath() {
        return filePath;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ReadSandboxFileRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Sandbox identifier. Newly generated Sandbox IDs use {@code sbx-} followed by 16 lowercase
         * base32 characters ({@code a-z2-7}); existing legacy IDs remain accepted.
         */
        private String sandboxId = null;

        /**
         * Sandbox identifier. Newly generated Sandbox IDs use {@code sbx-} followed by 16 lowercase
         * base32 characters ({@code a-z2-7}); existing legacy IDs remain accepted.
         *
         * @param sandboxId the value to set
         * @return this builder instance
         */
        public Builder sandboxId(String sandboxId) {
            this.sandboxId = sandboxId;
            return this;
        }

        /** Absolute path under /workspace of the file to read. */
        private String filePath = null;

        /**
         * Absolute path under /workspace of the file to read.
         *
         * @param filePath the value to set
         * @return this builder instance
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
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
        public Builder copy(ReadSandboxFileRequest o) {
            sandboxId(o.getSandboxId());
            filePath(o.getFilePath());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ReadSandboxFileRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ReadSandboxFileRequest
         */
        public ReadSandboxFileRequest build() {
            ReadSandboxFileRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ReadSandboxFileRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ReadSandboxFileRequest
         */
        public ReadSandboxFileRequest buildWithoutInvocationCallback() {
            ReadSandboxFileRequest request = new ReadSandboxFileRequest();
            request.sandboxId = sandboxId;
            request.filePath = filePath;
            request.opcRequestId = opcRequestId;
            return request;
            // new ReadSandboxFileRequest(sandboxId, filePath, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().sandboxId(sandboxId).filePath(filePath).opcRequestId(opcRequestId);
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
        sb.append(",sandboxId=").append(String.valueOf(this.sandboxId));
        sb.append(",filePath=").append(String.valueOf(this.filePath));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReadSandboxFileRequest)) {
            return false;
        }

        ReadSandboxFileRequest other = (ReadSandboxFileRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.sandboxId, other.sandboxId)
                && java.util.Objects.equals(this.filePath, other.filePath)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sandboxId == null ? 43 : this.sandboxId.hashCode());
        result = (result * PRIME) + (this.filePath == null ? 43 : this.filePath.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
