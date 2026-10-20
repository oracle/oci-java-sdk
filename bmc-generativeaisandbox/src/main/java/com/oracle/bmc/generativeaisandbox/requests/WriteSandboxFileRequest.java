/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.requests;

import com.oracle.bmc.generativeaisandbox.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/WriteSandboxFileExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use WriteSandboxFileRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
public class WriteSandboxFileRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

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
    /** Absolute path under /workspace where the file will be written. */
    private String filePath;

    /** Absolute path under /workspace where the file will be written. */
    public String getFilePath() {
        return filePath;
    }
    /** Raw file bytes to write. */
    private java.io.InputStream writeSandboxFileContentDetails;

    /** Raw file bytes to write. */
    public java.io.InputStream getWriteSandboxFileContentDetails() {
        return writeSandboxFileContentDetails;
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
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of running that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and removed from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of running that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and removed from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Optional base64-encoded SHA-256 checksum of the sandbox file content. When supported by the
     * sandbox runtime, the runtime validates the uploaded file content against this value and
     * rejects the request if the values do not match.
     */
    private String opcContentSha256;

    /**
     * Optional base64-encoded SHA-256 checksum of the sandbox file content. When supported by the
     * sandbox runtime, the runtime validates the uploaded file content against this value and
     * rejects the request if the values do not match.
     */
    public String getOpcContentSha256() {
        return opcContentSha256;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return writeSandboxFileContentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    WriteSandboxFileRequest, java.io.InputStream> {
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

        /** Absolute path under /workspace where the file will be written. */
        private String filePath = null;

        /**
         * Absolute path under /workspace where the file will be written.
         *
         * @param filePath the value to set
         * @return this builder instance
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        /** Raw file bytes to write. */
        private java.io.InputStream writeSandboxFileContentDetails = null;

        /**
         * Raw file bytes to write.
         *
         * @param writeSandboxFileContentDetails the value to set
         * @return this builder instance
         */
        public Builder writeSandboxFileContentDetails(
                java.io.InputStream writeSandboxFileContentDetails) {
            this.writeSandboxFileContentDetails = writeSandboxFileContentDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of running that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if
         * a resource has been deleted and removed from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of running that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if
         * a resource has been deleted and removed from the system, then a retry of the original
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
         * Optional base64-encoded SHA-256 checksum of the sandbox file content. When supported by
         * the sandbox runtime, the runtime validates the uploaded file content against this value
         * and rejects the request if the values do not match.
         */
        private String opcContentSha256 = null;

        /**
         * Optional base64-encoded SHA-256 checksum of the sandbox file content. When supported by
         * the sandbox runtime, the runtime validates the uploaded file content against this value
         * and rejects the request if the values do not match.
         *
         * @param opcContentSha256 the value to set
         * @return this builder instance
         */
        public Builder opcContentSha256(String opcContentSha256) {
            this.opcContentSha256 = opcContentSha256;
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
        public Builder copy(WriteSandboxFileRequest o) {
            sandboxId(o.getSandboxId());
            filePath(o.getFilePath());
            writeSandboxFileContentDetails(o.getWriteSandboxFileContentDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            opcContentSha256(o.getOpcContentSha256());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of WriteSandboxFileRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of WriteSandboxFileRequest
         */
        public WriteSandboxFileRequest build() {
            WriteSandboxFileRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(java.io.InputStream body) {
            writeSandboxFileContentDetails(body);
            return this;
        }

        /**
         * Build the instance of WriteSandboxFileRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of WriteSandboxFileRequest
         */
        public WriteSandboxFileRequest buildWithoutInvocationCallback() {
            WriteSandboxFileRequest request = new WriteSandboxFileRequest();
            request.sandboxId = sandboxId;
            request.filePath = filePath;
            request.writeSandboxFileContentDetails = writeSandboxFileContentDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.opcContentSha256 = opcContentSha256;
            return request;
            // new WriteSandboxFileRequest(sandboxId, filePath, writeSandboxFileContentDetails,
            // opcRequestId, opcRetryToken, opcContentSha256);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .sandboxId(sandboxId)
                .filePath(filePath)
                .writeSandboxFileContentDetails(writeSandboxFileContentDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .opcContentSha256(opcContentSha256);
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
        sb.append(",writeSandboxFileContentDetails=")
                .append(String.valueOf(this.writeSandboxFileContentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcContentSha256=").append(String.valueOf(this.opcContentSha256));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WriteSandboxFileRequest)) {
            return false;
        }

        WriteSandboxFileRequest other = (WriteSandboxFileRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.sandboxId, other.sandboxId)
                && java.util.Objects.equals(this.filePath, other.filePath)
                && java.util.Objects.equals(
                        this.writeSandboxFileContentDetails, other.writeSandboxFileContentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcContentSha256, other.opcContentSha256);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sandboxId == null ? 43 : this.sandboxId.hashCode());
        result = (result * PRIME) + (this.filePath == null ? 43 : this.filePath.hashCode());
        result =
                (result * PRIME)
                        + (this.writeSandboxFileContentDetails == null
                                ? 43
                                : this.writeSandboxFileContentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result =
                (result * PRIME)
                        + (this.opcContentSha256 == null ? 43 : this.opcContentSha256.hashCode());
        return result;
    }
}
