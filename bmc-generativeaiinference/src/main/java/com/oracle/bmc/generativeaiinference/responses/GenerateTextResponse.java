/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.responses;

import com.oracle.bmc.generativeaiinference.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class GenerateTextResponse extends com.oracle.bmc.responses.BmcResponse {
    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** Provides deprecation details for models, included only when a model is deprecated. */
    private String modelDeprecationInfo;

    /**
     * Provides deprecation details for models, included only when a model is deprecated.
     *
     * @return the value
     */
    public String getModelDeprecationInfo() {
        return modelDeprecationInfo;
    }

    /** The returned {@code GenerateTextResult} instance. */
    private com.oracle.bmc.generativeaiinference.model.GenerateTextResult generateTextResult;

    /**
     * The returned {@code GenerateTextResult} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.generativeaiinference.model.GenerateTextResult getGenerateTextResult() {
        return generateTextResult;
    }
    /**
     * Returns the event-stream for operations that support 'text/event-stream' media type. The
     * value can be null in-case a non-streamed response is returned by the server. NOTE : Use
     * try-with-resources or explicitly call eventStream.close() to close the stream. This is
     * important to avoid the issue mentioned in the link below
     * https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdktroubleshooting.htm#javasdktroubleshooting_topic_program_hangs_for_an_indefinite_time
     *
     * @return the event-stream
     */
    private java.io.InputStream eventStream;

    /**
     * Returns the event-stream for operations that support 'text/event-stream' media type. The
     * value can be null in-case a non-streamed response is returned by the server. NOTE : Use
     * try-with-resources or explicitly call getEventStream().close() to close the stream. This is
     * important to avoid the issue mentioned in the link below
     * https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdktroubleshooting.htm#javasdktroubleshooting_topic_program_hangs_for_an_indefinite_time
     *
     * @return the event-stream
     */
    public java.io.InputStream getEventStream() {
        return eventStream;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "modelDeprecationInfo",
        "generateTextResult",
        "eventStream"
    })
    private GenerateTextResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            String modelDeprecationInfo,
            com.oracle.bmc.generativeaiinference.model.GenerateTextResult generateTextResult,
            java.io.InputStream eventStream) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.modelDeprecationInfo = modelDeprecationInfo;
        this.generateTextResult = generateTextResult;

        this.eventStream = eventStream;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GenerateTextResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** Provides deprecation details for models, included only when a model is deprecated. */
        private String modelDeprecationInfo;

        /**
         * Provides deprecation details for models, included only when a model is deprecated.
         *
         * @param modelDeprecationInfo the value to set
         * @return this builder
         */
        public Builder modelDeprecationInfo(String modelDeprecationInfo) {
            this.modelDeprecationInfo = modelDeprecationInfo;
            return this;
        }

        /** The returned {@code GenerateTextResult} instance. */
        private com.oracle.bmc.generativeaiinference.model.GenerateTextResult generateTextResult;

        /**
         * The returned {@code GenerateTextResult} instance.
         *
         * @param generateTextResult the value to set
         * @return this builder
         */
        public Builder generateTextResult(
                com.oracle.bmc.generativeaiinference.model.GenerateTextResult generateTextResult) {
            this.generateTextResult = generateTextResult;
            return this;
        }

        /**
         * The event-stream for operations that support 'text/event-stream' media type. The value
         * can be null in-case a non-streamed response is returned by the server. NOTE : Use
         * try-with-resources or explicitly call eventStream.close() to close the stream. This is
         * important to avoid the issue mentioned in the link below
         * https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdktroubleshooting.htm#javasdktroubleshooting_topic_program_hangs_for_an_indefinite_time
         *
         * @return the event-stream
         */
        private java.io.InputStream eventStream;

        /**
         * Returns the event-stream for operations that support 'text/event-stream' media type. The
         * value can be null in-case a non-streamed response is returned by the server. NOTE : Use
         * try-with-resources or explicitly call eventStream.close() to close the stream. This is
         * important to avoid the issue mentioned in the link below
         * https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdktroubleshooting.htm#javasdktroubleshooting_topic_program_hangs_for_an_indefinite_time
         *
         * @return the event-stream
         */
        public Builder eventStream(java.io.InputStream eventStream) {
            this.eventStream = eventStream;
            return this;
        }
        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GenerateTextResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            modelDeprecationInfo(o.getModelDeprecationInfo());
            generateTextResult(o.getGenerateTextResult());

            eventStream(o.getEventStream());
            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GenerateTextResponse build() {
            return new GenerateTextResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcRequestId,
                    modelDeprecationInfo,
                    generateTextResult,
                    eventStream);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",modelDeprecationInfo=").append(String.valueOf(modelDeprecationInfo));
        sb.append(",generateTextResult=").append(String.valueOf(generateTextResult));
        sb.append(",eventStream=").append(String.valueOf(eventStream));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateTextResponse)) {
            return false;
        }

        GenerateTextResponse other = (GenerateTextResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.modelDeprecationInfo, other.modelDeprecationInfo)
                && java.util.Objects.equals(this.generateTextResult, other.generateTextResult)
                && java.util.Objects.equals(this.eventStream, other.eventStream);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.modelDeprecationInfo == null
                                ? 43
                                : this.modelDeprecationInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.generateTextResult == null
                                ? 43
                                : this.generateTextResult.hashCode());
        result = (result * PRIME) + (this.eventStream == null ? 43 : this.eventStream.hashCode());
        return result;
    }
}
