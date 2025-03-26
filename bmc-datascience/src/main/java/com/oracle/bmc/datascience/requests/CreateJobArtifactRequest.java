/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/CreateJobArtifactExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateJobArtifactRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class CreateJobArtifactRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream>
        implements com.oracle.bmc.requests.HasContentLength {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     */
    private String jobId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     */
    public String getJobId() {
        return jobId;
    }
    /**
     * The content length of the body.
     */
    private Long contentLength;

    /**
     * The content length of the body.
     */
    public Long getContentLength() {
        return contentLength;
    }
    /**
     * The job artifact to upload.
     */
    private java.io.InputStream jobArtifact;

    /**
     * The job artifact to upload.
     */
    public java.io.InputStream getJobArtifact() {
        return jobArtifact;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and purged from the system, then a retry of the original creation request might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and purged from the system, then a retry of the original creation request might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * This header is for specifying a filename during upload. It is used to identify the file type and validate if the
     * file type is supported. Example: {@code --content-disposition "attachment; filename=hello-world.py"}
     *
     */
    private String contentDisposition;

    /**
     * This header is for specifying a filename during upload. It is used to identify the file type and validate if the
     * file type is supported. Example: {@code --content-disposition "attachment; filename=hello-world.py"}
     *
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return jobArtifact;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateJobArtifactRequest, java.io.InputStream> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
         */
        private String jobId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
         * @param jobId the value to set
         * @return this builder instance
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * The content length of the body.
         */
        private Long contentLength = null;

        /**
         * The content length of the body.
         * @param contentLength the value to set
         * @return this builder instance
         */
        public Builder contentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        /**
         * The job artifact to upload.
         */
        private java.io.InputStream jobArtifact = null;

        /**
         * The job artifact to upload.
         * @param jobArtifact the value to set
         * @return this builder instance
         */
        public Builder jobArtifact(java.io.InputStream jobArtifact) {
            this.jobArtifact = jobArtifact;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and purged from the system, then a retry of the original creation request might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations. For example, if a resource has been deleted and purged from the system, then a retry of the original creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * This header is for specifying a filename during upload. It is used to identify the file type and validate if the
         * file type is supported. Example: {@code --content-disposition "attachment; filename=hello-world.py"}
         *
         */
        private String contentDisposition = null;

        /**
         * This header is for specifying a filename during upload. It is used to identify the file type and validate if the
         * file type is supported. Example: {@code --content-disposition "attachment; filename=hello-world.py"}
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
        public Builder copy(CreateJobArtifactRequest o) {
            jobId(o.getJobId());
            contentLength(o.getContentLength());
            jobArtifact(o.getJobArtifact());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            contentDisposition(o.getContentDisposition());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateJobArtifactRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateJobArtifactRequest
         */
        public CreateJobArtifactRequest build() {
            CreateJobArtifactRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(java.io.InputStream body) {
            jobArtifact(body);
            return this;
        }

        /**
         * Build the instance of CreateJobArtifactRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateJobArtifactRequest
         */
        public CreateJobArtifactRequest buildWithoutInvocationCallback() {
            CreateJobArtifactRequest request = new CreateJobArtifactRequest();
            request.jobId = jobId;
            request.contentLength = contentLength;
            request.jobArtifact = jobArtifact;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.contentDisposition = contentDisposition;
            return request;
            // new CreateJobArtifactRequest(jobId, contentLength, jobArtifact, opcRequestId, opcRetryToken, contentDisposition);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .jobId(jobId)
                .contentLength(contentLength)
                .jobArtifact(jobArtifact)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .contentDisposition(contentDisposition);
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
        sb.append(",jobId=").append(String.valueOf(this.jobId));
        sb.append(",contentLength=").append(String.valueOf(this.contentLength));
        sb.append(",jobArtifact=").append(String.valueOf(this.jobArtifact));
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
        if (!(o instanceof CreateJobArtifactRequest)) {
            return false;
        }

        CreateJobArtifactRequest other = (CreateJobArtifactRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.jobId, other.jobId)
                && java.util.Objects.equals(this.contentLength, other.contentLength)
                && java.util.Objects.equals(this.jobArtifact, other.jobArtifact)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.contentDisposition, other.contentDisposition);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.jobId == null ? 43 : this.jobId.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLength == null ? 43 : this.contentLength.hashCode());
        result = (result * PRIME) + (this.jobArtifact == null ? 43 : this.jobArtifact.hashCode());
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
