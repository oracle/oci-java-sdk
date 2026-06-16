/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.requests;

import com.oracle.bmc.apmconfig.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmconfig/PutDataFileExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use PutDataFileRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class PutDataFileRequest extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /** The data file to be uploaded. */
    private java.io.InputStream putDataFileBody;

    /** The data file to be uploaded. */
    public java.io.InputStream getPutDataFileBody() {
        return putDataFileBody;
    }
    /** The name of the data file. */
    private String dataFileName;

    /** The name of the data file. */
    public String getDataFileName() {
        return dataFileName;
    }
    /** The APM Domain ID the request is intended for. */
    private String apmDomainId;

    /** The APM Domain ID the request is intended for. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /** The type of the data file. */
    private String apmType;

    /** The type of the data file. */
    public String getApmType() {
        return apmType;
    }
    /**
     * Optional base64-encoded MD5 hash of the request body. If provided, the server will perform a
     * data integrity check by computing the MD5 of the received content and comparing it to the
     * supplied value.
     *
     * <p>If the values do not match, the request will be rejected with an HTTP 400 error and a
     * message such as:
     *
     * <p>"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5 header
     * (HEADER_MD5)"
     */
    private String contentMD5;

    /**
     * Optional base64-encoded MD5 hash of the request body. If provided, the server will perform a
     * data integrity check by computing the MD5 of the received content and comparing it to the
     * supplied value.
     *
     * <p>If the values do not match, the request will be rejected with an HTTP 400 error and a
     * message such as:
     *
     * <p>"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5 header
     * (HEADER_MD5)"
     */
    public String getContentMD5() {
        return contentMD5;
    }
    /**
     * Optional parameter specifying the media type (MIME type) of the request or response body. If
     * not specified, the default is {@code application/octet-stream}.
     *
     * <p>This value can be used by recipients to determine how to interpret or render the content.
     */
    private String contentType;

    /**
     * Optional parameter specifying the media type (MIME type) of the request or response body. If
     * not specified, the default is {@code application/octet-stream}.
     *
     * <p>This value can be used by recipients to determine how to interpret or render the content.
     */
    public String getContentType() {
        return contentType;
    }
    /**
     * Optional parameter that indicates the natural language of the content. This value can be used
     * by clients or intermediaries to select or display content based on language preferences.
     */
    private String contentLanguage;

    /**
     * Optional parameter that indicates the natural language of the content. This value can be used
     * by clients or intermediaries to select or display content based on language preferences.
     */
    public String getContentLanguage() {
        return contentLanguage;
    }
    /**
     * Optional parameter indicating the content encodings applied to the request body (e.g., gzip,
     * deflate). This value can be used by recipients to determine how to decode the content.
     */
    private String contentEncoding;

    /**
     * Optional parameter indicating the content encodings applied to the request body (e.g., gzip,
     * deflate). This value can be used by recipients to determine how to decode the content.
     */
    public String getContentEncoding() {
        return contentEncoding;
    }
    /**
     * Optional parameter that provides presentation information for how the content should be
     * displayed or handled by the recipient.
     *
     * <p>For example, to prompt a file download with a custom filename: {@code attachment;
     * filename="example.txt"}
     */
    private String contentDisposition;

    /**
     * Optional parameter that provides presentation information for how the content should be
     * displayed or handled by the recipient.
     *
     * <p>For example, to prompt a file download with a custom filename: {@code attachment;
     * filename="example.txt"}
     */
    public String getContentDisposition() {
        return contentDisposition;
    }
    /**
     * A string containing a JSON-encoded object with metadata related to the uploaded file or
     * resource. Example: {"fileName":"report.pdf","uploader":"jane.doe","category":"financial"}
     */
    private String metadata;

    /**
     * A string containing a JSON-encoded object with metadata related to the uploaded file or
     * resource. Example: {"fileName":"report.pdf","uploader":"jane.doe","category":"financial"}
     */
    public String getMetadata() {
        return metadata;
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
    /** The client request ID for tracing. */
    private String opcClientRequestId;

    /** The client request ID for tracing. */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return putDataFileBody;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PutDataFileRequest, java.io.InputStream> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The data file to be uploaded. */
        private java.io.InputStream putDataFileBody = null;

        /**
         * The data file to be uploaded.
         *
         * @param putDataFileBody the value to set
         * @return this builder instance
         */
        public Builder putDataFileBody(java.io.InputStream putDataFileBody) {
            this.putDataFileBody = putDataFileBody;
            return this;
        }

        /** The name of the data file. */
        private String dataFileName = null;

        /**
         * The name of the data file.
         *
         * @param dataFileName the value to set
         * @return this builder instance
         */
        public Builder dataFileName(String dataFileName) {
            this.dataFileName = dataFileName;
            return this;
        }

        /** The APM Domain ID the request is intended for. */
        private String apmDomainId = null;

        /**
         * The APM Domain ID the request is intended for.
         *
         * @param apmDomainId the value to set
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        /** The type of the data file. */
        private String apmType = null;

        /**
         * The type of the data file.
         *
         * @param apmType the value to set
         * @return this builder instance
         */
        public Builder apmType(String apmType) {
            this.apmType = apmType;
            return this;
        }

        /**
         * Optional base64-encoded MD5 hash of the request body. If provided, the server will
         * perform a data integrity check by computing the MD5 of the received content and comparing
         * it to the supplied value.
         *
         * <p>If the values do not match, the request will be rejected with an HTTP 400 error and a
         * message such as:
         *
         * <p>"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5
         * header (HEADER_MD5)"
         */
        private String contentMD5 = null;

        /**
         * Optional base64-encoded MD5 hash of the request body. If provided, the server will
         * perform a data integrity check by computing the MD5 of the received content and comparing
         * it to the supplied value.
         *
         * <p>If the values do not match, the request will be rejected with an HTTP 400 error and a
         * message such as:
         *
         * <p>"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5
         * header (HEADER_MD5)"
         *
         * @param contentMD5 the value to set
         * @return this builder instance
         */
        public Builder contentMD5(String contentMD5) {
            this.contentMD5 = contentMD5;
            return this;
        }

        /**
         * Optional parameter specifying the media type (MIME type) of the request or response body.
         * If not specified, the default is {@code application/octet-stream}.
         *
         * <p>This value can be used by recipients to determine how to interpret or render the
         * content.
         */
        private String contentType = null;

        /**
         * Optional parameter specifying the media type (MIME type) of the request or response body.
         * If not specified, the default is {@code application/octet-stream}.
         *
         * <p>This value can be used by recipients to determine how to interpret or render the
         * content.
         *
         * @param contentType the value to set
         * @return this builder instance
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Optional parameter that indicates the natural language of the content. This value can be
         * used by clients or intermediaries to select or display content based on language
         * preferences.
         */
        private String contentLanguage = null;

        /**
         * Optional parameter that indicates the natural language of the content. This value can be
         * used by clients or intermediaries to select or display content based on language
         * preferences.
         *
         * @param contentLanguage the value to set
         * @return this builder instance
         */
        public Builder contentLanguage(String contentLanguage) {
            this.contentLanguage = contentLanguage;
            return this;
        }

        /**
         * Optional parameter indicating the content encodings applied to the request body (e.g.,
         * gzip, deflate). This value can be used by recipients to determine how to decode the
         * content.
         */
        private String contentEncoding = null;

        /**
         * Optional parameter indicating the content encodings applied to the request body (e.g.,
         * gzip, deflate). This value can be used by recipients to determine how to decode the
         * content.
         *
         * @param contentEncoding the value to set
         * @return this builder instance
         */
        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * Optional parameter that provides presentation information for how the content should be
         * displayed or handled by the recipient.
         *
         * <p>For example, to prompt a file download with a custom filename: {@code attachment;
         * filename="example.txt"}
         */
        private String contentDisposition = null;

        /**
         * Optional parameter that provides presentation information for how the content should be
         * displayed or handled by the recipient.
         *
         * <p>For example, to prompt a file download with a custom filename: {@code attachment;
         * filename="example.txt"}
         *
         * @param contentDisposition the value to set
         * @return this builder instance
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * A string containing a JSON-encoded object with metadata related to the uploaded file or
         * resource. Example: {"fileName":"report.pdf","uploader":"jane.doe","category":"financial"}
         */
        private String metadata = null;

        /**
         * A string containing a JSON-encoded object with metadata related to the uploaded file or
         * resource. Example: {"fileName":"report.pdf","uploader":"jane.doe","category":"financial"}
         *
         * @param metadata the value to set
         * @return this builder instance
         */
        public Builder metadata(String metadata) {
            this.metadata = metadata;
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

        /** The client request ID for tracing. */
        private String opcClientRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcClientRequestId the value to set
         * @return this builder instance
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
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
        public Builder copy(PutDataFileRequest o) {
            putDataFileBody(o.getPutDataFileBody());
            dataFileName(o.getDataFileName());
            apmDomainId(o.getApmDomainId());
            apmType(o.getApmType());
            contentMD5(o.getContentMD5());
            contentType(o.getContentType());
            contentLanguage(o.getContentLanguage());
            contentEncoding(o.getContentEncoding());
            contentDisposition(o.getContentDisposition());
            metadata(o.getMetadata());
            opcRetryToken(o.getOpcRetryToken());
            opcClientRequestId(o.getOpcClientRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PutDataFileRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of PutDataFileRequest
         */
        public PutDataFileRequest build() {
            PutDataFileRequest request = buildWithoutInvocationCallback();
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
            putDataFileBody(body);
            return this;
        }

        /**
         * Build the instance of PutDataFileRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PutDataFileRequest
         */
        public PutDataFileRequest buildWithoutInvocationCallback() {
            PutDataFileRequest request = new PutDataFileRequest();
            request.putDataFileBody = putDataFileBody;
            request.dataFileName = dataFileName;
            request.apmDomainId = apmDomainId;
            request.apmType = apmType;
            request.contentMD5 = contentMD5;
            request.contentType = contentType;
            request.contentLanguage = contentLanguage;
            request.contentEncoding = contentEncoding;
            request.contentDisposition = contentDisposition;
            request.metadata = metadata;
            request.opcRetryToken = opcRetryToken;
            request.opcClientRequestId = opcClientRequestId;
            return request;
            // new PutDataFileRequest(putDataFileBody, dataFileName, apmDomainId, apmType,
            // contentMD5, contentType, contentLanguage, contentEncoding, contentDisposition,
            // metadata, opcRetryToken, opcClientRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .putDataFileBody(putDataFileBody)
                .dataFileName(dataFileName)
                .apmDomainId(apmDomainId)
                .apmType(apmType)
                .contentMD5(contentMD5)
                .contentType(contentType)
                .contentLanguage(contentLanguage)
                .contentEncoding(contentEncoding)
                .contentDisposition(contentDisposition)
                .metadata(metadata)
                .opcRetryToken(opcRetryToken)
                .opcClientRequestId(opcClientRequestId);
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
        sb.append(",putDataFileBody=").append(String.valueOf(this.putDataFileBody));
        sb.append(",dataFileName=").append(String.valueOf(this.dataFileName));
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",apmType=").append(String.valueOf(this.apmType));
        sb.append(",contentMD5=").append(String.valueOf(this.contentMD5));
        sb.append(",contentType=").append(String.valueOf(this.contentType));
        sb.append(",contentLanguage=").append(String.valueOf(this.contentLanguage));
        sb.append(",contentEncoding=").append(String.valueOf(this.contentEncoding));
        sb.append(",contentDisposition=").append(String.valueOf(this.contentDisposition));
        sb.append(",metadata=").append(String.valueOf(this.metadata));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutDataFileRequest)) {
            return false;
        }

        PutDataFileRequest other = (PutDataFileRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.putDataFileBody, other.putDataFileBody)
                && java.util.Objects.equals(this.dataFileName, other.dataFileName)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(this.apmType, other.apmType)
                && java.util.Objects.equals(this.contentMD5, other.contentMD5)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.contentLanguage, other.contentLanguage)
                && java.util.Objects.equals(this.contentEncoding, other.contentEncoding)
                && java.util.Objects.equals(this.contentDisposition, other.contentDisposition)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.putDataFileBody == null ? 43 : this.putDataFileBody.hashCode());
        result = (result * PRIME) + (this.dataFileName == null ? 43 : this.dataFileName.hashCode());
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result = (result * PRIME) + (this.apmType == null ? 43 : this.apmType.hashCode());
        result = (result * PRIME) + (this.contentMD5 == null ? 43 : this.contentMD5.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLanguage == null ? 43 : this.contentLanguage.hashCode());
        result =
                (result * PRIME)
                        + (this.contentEncoding == null ? 43 : this.contentEncoding.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDisposition == null
                                ? 43
                                : this.contentDisposition.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        return result;
    }
}
