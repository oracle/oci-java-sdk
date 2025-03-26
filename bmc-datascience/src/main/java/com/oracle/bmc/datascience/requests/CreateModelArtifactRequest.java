/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/CreateModelArtifactExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateModelArtifactRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class CreateModelArtifactRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream>
        implements com.oracle.bmc.requests.HasContentLength {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the model.
     */
    private String modelId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the model.
     */
    public String getModelId() {
        return modelId;
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
     * The model artifact to upload.
     */
    private java.io.InputStream modelArtifact;

    /**
     * The model artifact to upload.
     */
    public java.io.InputStream getModelArtifact() {
        return modelArtifact;
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
     * This header allows you to specify a filename during upload. This file name is used to dispose of the file contents
     * while downloading the file. If this optional field is not populated in the request, then the OCID of the model is used for the file
     * name when downloading.
     * Example: {@code {"Content-Disposition": "attachment"
     *            "filename"="model.tar.gz"
     *            "Content-Length": "2347"
     *            "Content-Type": "application/gzip"}}
     *
     */
    private String contentDisposition;

    /**
     * This header allows you to specify a filename during upload. This file name is used to dispose of the file contents
     * while downloading the file. If this optional field is not populated in the request, then the OCID of the model is used for the file
     * name when downloading.
     * Example: {@code {"Content-Disposition": "attachment"
     *            "filename"="model.tar.gz"
     *            "Content-Length": "2347"
     *            "Content-Type": "application/gzip"}}
     *
     */
    public String getContentDisposition() {
        return contentDisposition;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource is updated or deleted only if the {@code etag} you
     * provide matches the resource's current {@code etag} value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource is updated or deleted only if the {@code etag} you
     * provide matches the resource's current {@code etag} value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return modelArtifact;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateModelArtifactRequest, java.io.InputStream> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the model.
         */
        private String modelId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the model.
         * @param modelId the value to set
         * @return this builder instance
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
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
         * The model artifact to upload.
         */
        private java.io.InputStream modelArtifact = null;

        /**
         * The model artifact to upload.
         * @param modelArtifact the value to set
         * @return this builder instance
         */
        public Builder modelArtifact(java.io.InputStream modelArtifact) {
            this.modelArtifact = modelArtifact;
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
         * This header allows you to specify a filename during upload. This file name is used to dispose of the file contents
         * while downloading the file. If this optional field is not populated in the request, then the OCID of the model is used for the file
         * name when downloading.
         * Example: {@code {"Content-Disposition": "attachment"
         *            "filename"="model.tar.gz"
         *            "Content-Length": "2347"
         *            "Content-Type": "application/gzip"}}
         *
         */
        private String contentDisposition = null;

        /**
         * This header allows you to specify a filename during upload. This file name is used to dispose of the file contents
         * while downloading the file. If this optional field is not populated in the request, then the OCID of the model is used for the file
         * name when downloading.
         * Example: {@code {"Content-Disposition": "attachment"
         *            "filename"="model.tar.gz"
         *            "Content-Length": "2347"
         *            "Content-Type": "application/gzip"}}
         *
         * @param contentDisposition the value to set
         * @return this builder instance
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
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
        public Builder copy(CreateModelArtifactRequest o) {
            modelId(o.getModelId());
            contentLength(o.getContentLength());
            modelArtifact(o.getModelArtifact());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            contentDisposition(o.getContentDisposition());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateModelArtifactRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateModelArtifactRequest
         */
        public CreateModelArtifactRequest build() {
            CreateModelArtifactRequest request = buildWithoutInvocationCallback();
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
            modelArtifact(body);
            return this;
        }

        /**
         * Build the instance of CreateModelArtifactRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateModelArtifactRequest
         */
        public CreateModelArtifactRequest buildWithoutInvocationCallback() {
            CreateModelArtifactRequest request = new CreateModelArtifactRequest();
            request.modelId = modelId;
            request.contentLength = contentLength;
            request.modelArtifact = modelArtifact;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.contentDisposition = contentDisposition;
            request.ifMatch = ifMatch;
            return request;
            // new CreateModelArtifactRequest(modelId, contentLength, modelArtifact, opcRequestId, opcRetryToken, contentDisposition, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .modelId(modelId)
                .contentLength(contentLength)
                .modelArtifact(modelArtifact)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .contentDisposition(contentDisposition)
                .ifMatch(ifMatch);
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
        sb.append(",modelId=").append(String.valueOf(this.modelId));
        sb.append(",contentLength=").append(String.valueOf(this.contentLength));
        sb.append(",modelArtifact=").append(String.valueOf(this.modelArtifact));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",contentDisposition=").append(String.valueOf(this.contentDisposition));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateModelArtifactRequest)) {
            return false;
        }

        CreateModelArtifactRequest other = (CreateModelArtifactRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.contentLength, other.contentLength)
                && java.util.Objects.equals(this.modelArtifact, other.modelArtifact)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.contentDisposition, other.contentDisposition)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLength == null ? 43 : this.contentLength.hashCode());
        result =
                (result * PRIME)
                        + (this.modelArtifact == null ? 43 : this.modelArtifact.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDisposition == null
                                ? 43
                                : this.contentDisposition.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
