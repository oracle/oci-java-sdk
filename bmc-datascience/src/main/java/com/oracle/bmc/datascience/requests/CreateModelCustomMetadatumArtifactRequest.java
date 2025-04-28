/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/CreateModelCustomMetadatumArtifactExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateModelCustomMetadatumArtifactRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class CreateModelCustomMetadatumArtifactRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream>
        implements com.oracle.bmc.requests.HasContentLength {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model.
     */
    private String modelId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model.
     */
    public String getModelId() {
        return modelId;
    }
    /** The name of the model metadatum in the metadata. */
    private String metadatumKeyName;

    /** The name of the model metadatum in the metadata. */
    public String getMetadatumKeyName() {
        return metadatumKeyName;
    }
    /** The content length of the body. */
    private Long contentLength;

    /** The content length of the body. */
    public Long getContentLength() {
        return contentLength;
    }
    /** The model custom metadata artifact to upload. */
    private java.io.InputStream modelCustomMetadatumArtifact;

    /** The model custom metadata artifact to upload. */
    public java.io.InputStream getModelCustomMetadatumArtifact() {
        return modelCustomMetadatumArtifact;
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
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
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
    public java.io.InputStream getBody$() {
        return modelCustomMetadatumArtifact;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateModelCustomMetadatumArtifactRequest, java.io.InputStream> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model.
         */
        private String modelId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model.
         *
         * @param modelId the value to set
         * @return this builder instance
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /** The name of the model metadatum in the metadata. */
        private String metadatumKeyName = null;

        /**
         * The name of the model metadatum in the metadata.
         *
         * @param metadatumKeyName the value to set
         * @return this builder instance
         */
        public Builder metadatumKeyName(String metadatumKeyName) {
            this.metadatumKeyName = metadatumKeyName;
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

        /** The model custom metadata artifact to upload. */
        private java.io.InputStream modelCustomMetadatumArtifact = null;

        /**
         * The model custom metadata artifact to upload.
         *
         * @param modelCustomMetadatumArtifact the value to set
         * @return this builder instance
         */
        public Builder modelCustomMetadatumArtifact(
                java.io.InputStream modelCustomMetadatumArtifact) {
            this.modelCustomMetadatumArtifact = modelCustomMetadatumArtifact;
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
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the {@code etag} you
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
        public Builder copy(CreateModelCustomMetadatumArtifactRequest o) {
            modelId(o.getModelId());
            metadatumKeyName(o.getMetadatumKeyName());
            contentLength(o.getContentLength());
            modelCustomMetadatumArtifact(o.getModelCustomMetadatumArtifact());
            opcRequestId(o.getOpcRequestId());
            contentDisposition(o.getContentDisposition());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateModelCustomMetadatumArtifactRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateModelCustomMetadatumArtifactRequest
         */
        public CreateModelCustomMetadatumArtifactRequest build() {
            CreateModelCustomMetadatumArtifactRequest request = buildWithoutInvocationCallback();
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
            modelCustomMetadatumArtifact(body);
            return this;
        }

        /**
         * Build the instance of CreateModelCustomMetadatumArtifactRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateModelCustomMetadatumArtifactRequest
         */
        public CreateModelCustomMetadatumArtifactRequest buildWithoutInvocationCallback() {
            CreateModelCustomMetadatumArtifactRequest request =
                    new CreateModelCustomMetadatumArtifactRequest();
            request.modelId = modelId;
            request.metadatumKeyName = metadatumKeyName;
            request.contentLength = contentLength;
            request.modelCustomMetadatumArtifact = modelCustomMetadatumArtifact;
            request.opcRequestId = opcRequestId;
            request.contentDisposition = contentDisposition;
            request.ifMatch = ifMatch;
            return request;
            // new CreateModelCustomMetadatumArtifactRequest(modelId, metadatumKeyName,
            // contentLength, modelCustomMetadatumArtifact, opcRequestId, contentDisposition,
            // ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .modelId(modelId)
                .metadatumKeyName(metadatumKeyName)
                .contentLength(contentLength)
                .modelCustomMetadatumArtifact(modelCustomMetadatumArtifact)
                .opcRequestId(opcRequestId)
                .contentDisposition(contentDisposition)
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
        sb.append(",modelId=").append(String.valueOf(this.modelId));
        sb.append(",metadatumKeyName=").append(String.valueOf(this.metadatumKeyName));
        sb.append(",contentLength=").append(String.valueOf(this.contentLength));
        sb.append(",modelCustomMetadatumArtifact=")
                .append(String.valueOf(this.modelCustomMetadatumArtifact));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
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
        if (!(o instanceof CreateModelCustomMetadatumArtifactRequest)) {
            return false;
        }

        CreateModelCustomMetadatumArtifactRequest other =
                (CreateModelCustomMetadatumArtifactRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.metadatumKeyName, other.metadatumKeyName)
                && java.util.Objects.equals(this.contentLength, other.contentLength)
                && java.util.Objects.equals(
                        this.modelCustomMetadatumArtifact, other.modelCustomMetadatumArtifact)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
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
                        + (this.metadatumKeyName == null ? 43 : this.metadatumKeyName.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLength == null ? 43 : this.contentLength.hashCode());
        result =
                (result * PRIME)
                        + (this.modelCustomMetadatumArtifact == null
                                ? 43
                                : this.modelCustomMetadatumArtifact.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDisposition == null
                                ? 43
                                : this.contentDisposition.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
