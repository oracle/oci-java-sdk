/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.modeldeployment.responses;

import com.oracle.bmc.modeldeployment.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240424")
public class PredictWithResponseStreamResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code java.io.InputStream} instance. */
    private java.io.InputStream inputStream;

    /**
     * The returned {@code java.io.InputStream} instance.
     *
     * @return the value
     */
    public java.io.InputStream getInputStream() {
        return inputStream;
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
        "opcRequestId",
        "inputStream",
        "eventStream"
    })
    private PredictWithResponseStreamResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            java.io.InputStream inputStream,
            java.io.InputStream eventStream) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.inputStream = inputStream;

        this.eventStream = eventStream;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    PredictWithResponseStreamResponse> {
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

        /** The returned {@code java.io.InputStream} instance. */
        private java.io.InputStream inputStream;

        /**
         * The returned {@code java.io.InputStream} instance.
         *
         * @param inputStream the value to set
         * @return this builder
         */
        public Builder inputStream(java.io.InputStream inputStream) {
            this.inputStream = inputStream;
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
        public Builder copy(PredictWithResponseStreamResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            inputStream(o.getInputStream());

            eventStream(o.getEventStream());
            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public PredictWithResponseStreamResponse build() {
            return new PredictWithResponseStreamResponse(
                    __httpStatusCode__, headers, opcRequestId, inputStream, eventStream);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",inputStream=").append(String.valueOf(inputStream));
        sb.append(",eventStream=").append(String.valueOf(eventStream));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PredictWithResponseStreamResponse)) {
            return false;
        }

        PredictWithResponseStreamResponse other = (PredictWithResponseStreamResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.inputStream, other.inputStream)
                && java.util.Objects.equals(this.eventStream, other.eventStream);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.inputStream == null ? 43 : this.inputStream.hashCode());
        result = (result * PRIME) + (this.eventStream == null ? 43 : this.eventStream.hashCode());
        return result;
    }
}
