/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/CreateStepArtifactExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateStepArtifactRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class CreateStepArtifactRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream>
        implements com.oracle.bmc.requests.HasContentLength {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the pipeline.
     */
    private String pipelineId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the pipeline.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    /** Unique Step identifier in a pipeline. */
    private String stepName;

    /** Unique Step identifier in a pipeline. */
    public String getStepName() {
        return stepName;
    }
    /** The content length of the body. */
    private Long contentLength;

    /** The content length of the body. */
    public Long getContentLength() {
        return contentLength;
    }
    /** The step artifact to upload. */
    private java.io.InputStream stepArtifact;

    /** The step artifact to upload. */
    public java.io.InputStream getStepArtifact() {
        return stepArtifact;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
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
     * This header allows you to specify a filename during upload. This file name is used to dispose
     * of the file contents while downloading the file. If this optional field is not populated in
     * the request, then the OCID of the model is used for the file name when downloading. Example:
     * {@code {"Content-Disposition": "attachment" "filename"="model.tar.gz" "Content-Length":
     * "2347" "Content-Type": "application/gzip"}}
     */
    private String contentDisposition;

    /**
     * This header allows you to specify a filename during upload. This file name is used to dispose
     * of the file contents while downloading the file. If this optional field is not populated in
     * the request, then the OCID of the model is used for the file name when downloading. Example:
     * {@code {"Content-Disposition": "attachment" "filename"="model.tar.gz" "Content-Length":
     * "2347" "Content-Type": "application/gzip"}}
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return stepArtifact;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateStepArtifactRequest, java.io.InputStream> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the pipeline.
         */
        private String pipelineId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the pipeline.
         *
         * @param pipelineId the value to set
         * @return this builder instance
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /** Unique Step identifier in a pipeline. */
        private String stepName = null;

        /**
         * Unique Step identifier in a pipeline.
         *
         * @param stepName the value to set
         * @return this builder instance
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        /** The content length of the body. */
        private Long contentLength = null;

        /**
         * The content length of the body.
         *
         * @param contentLength the value to set
         * @return this builder instance
         */
        public Builder contentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        /** The step artifact to upload. */
        private java.io.InputStream stepArtifact = null;

        /**
         * The step artifact to upload.
         *
         * @param stepArtifact the value to set
         * @return this builder instance
         */
        public Builder stepArtifact(java.io.InputStream stepArtifact) {
            this.stepArtifact = stepArtifact;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
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
         * This header allows you to specify a filename during upload. This file name is used to
         * dispose of the file contents while downloading the file. If this optional field is not
         * populated in the request, then the OCID of the model is used for the file name when
         * downloading. Example: {@code {"Content-Disposition": "attachment"
         * "filename"="model.tar.gz" "Content-Length": "2347" "Content-Type": "application/gzip"}}
         */
        private String contentDisposition = null;

        /**
         * This header allows you to specify a filename during upload. This file name is used to
         * dispose of the file contents while downloading the file. If this optional field is not
         * populated in the request, then the OCID of the model is used for the file name when
         * downloading. Example: {@code {"Content-Disposition": "attachment"
         * "filename"="model.tar.gz" "Content-Length": "2347" "Content-Type": "application/gzip"}}
         *
         * @param contentDisposition the value to set
         * @return this builder instance
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
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
        public Builder copy(CreateStepArtifactRequest o) {
            pipelineId(o.getPipelineId());
            stepName(o.getStepName());
            contentLength(o.getContentLength());
            stepArtifact(o.getStepArtifact());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            contentDisposition(o.getContentDisposition());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateStepArtifactRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateStepArtifactRequest
         */
        public CreateStepArtifactRequest build() {
            CreateStepArtifactRequest request = buildWithoutInvocationCallback();
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
            stepArtifact(body);
            return this;
        }

        /**
         * Build the instance of CreateStepArtifactRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateStepArtifactRequest
         */
        public CreateStepArtifactRequest buildWithoutInvocationCallback() {
            CreateStepArtifactRequest request = new CreateStepArtifactRequest();
            request.pipelineId = pipelineId;
            request.stepName = stepName;
            request.contentLength = contentLength;
            request.stepArtifact = stepArtifact;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.contentDisposition = contentDisposition;
            return request;
            // new CreateStepArtifactRequest(pipelineId, stepName, contentLength, stepArtifact,
            // opcRequestId, opcRetryToken, contentDisposition);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .pipelineId(pipelineId)
                .stepName(stepName)
                .contentLength(contentLength)
                .stepArtifact(stepArtifact)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .contentDisposition(contentDisposition);
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
        sb.append(",pipelineId=").append(String.valueOf(this.pipelineId));
        sb.append(",stepName=").append(String.valueOf(this.stepName));
        sb.append(",contentLength=").append(String.valueOf(this.contentLength));
        sb.append(",stepArtifact=").append(String.valueOf(this.stepArtifact));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",contentDisposition=").append(String.valueOf(this.contentDisposition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateStepArtifactRequest)) {
            return false;
        }

        CreateStepArtifactRequest other = (CreateStepArtifactRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.pipelineId, other.pipelineId)
                && java.util.Objects.equals(this.stepName, other.stepName)
                && java.util.Objects.equals(this.contentLength, other.contentLength)
                && java.util.Objects.equals(this.stepArtifact, other.stepArtifact)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.contentDisposition, other.contentDisposition);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.pipelineId == null ? 43 : this.pipelineId.hashCode());
        result = (result * PRIME) + (this.stepName == null ? 43 : this.stepName.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLength == null ? 43 : this.contentLength.hashCode());
        result = (result * PRIME) + (this.stepArtifact == null ? 43 : this.stepArtifact.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDisposition == null
                                ? 43
                                : this.contentDisposition.hashCode());
        return result;
    }
}
