/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.responses;

import com.oracle.bmc.aidocument.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
public class AnalyzeDocumentResponse extends com.oracle.bmc.responses.BmcResponse {
    /** The full URI of the resource related to the request */
    private String contentLocation;

    /**
     * The full URI of the resource related to the request
     *
     * @return the value
     */
    public String getContentLocation() {
        return contentLocation;
    }

    /** The full URI of the resource related to the request */
    private String location;

    /**
     * The full URI of the resource related to the request
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

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
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The returned {@code AnalyzeDocumentResult} instance. */
    private com.oracle.bmc.aidocument.model.AnalyzeDocumentResult analyzeDocumentResult;

    /**
     * The returned {@code AnalyzeDocumentResult} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.aidocument.model.AnalyzeDocumentResult getAnalyzeDocumentResult() {
        return analyzeDocumentResult;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "contentLocation",
        "location",
        "etag",
        "opcRequestId",
        "analyzeDocumentResult"
    })
    private AnalyzeDocumentResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String contentLocation,
            String location,
            String etag,
            String opcRequestId,
            com.oracle.bmc.aidocument.model.AnalyzeDocumentResult analyzeDocumentResult) {
        super(__httpStatusCode__, headers);
        this.contentLocation = contentLocation;
        this.location = location;
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.analyzeDocumentResult = analyzeDocumentResult;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<AnalyzeDocumentResponse> {
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

        /** The full URI of the resource related to the request */
        private String contentLocation;

        /**
         * The full URI of the resource related to the request
         *
         * @param contentLocation the value to set
         * @return this builder
         */
        public Builder contentLocation(String contentLocation) {
            this.contentLocation = contentLocation;
            return this;
        }

        /** The full URI of the resource related to the request */
        private String location;

        /**
         * The full URI of the resource related to the request
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
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
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The returned {@code AnalyzeDocumentResult} instance. */
        private com.oracle.bmc.aidocument.model.AnalyzeDocumentResult analyzeDocumentResult;

        /**
         * The returned {@code AnalyzeDocumentResult} instance.
         *
         * @param analyzeDocumentResult the value to set
         * @return this builder
         */
        public Builder analyzeDocumentResult(
                com.oracle.bmc.aidocument.model.AnalyzeDocumentResult analyzeDocumentResult) {
            this.analyzeDocumentResult = analyzeDocumentResult;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(AnalyzeDocumentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            contentLocation(o.getContentLocation());
            location(o.getLocation());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            analyzeDocumentResult(o.getAnalyzeDocumentResult());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public AnalyzeDocumentResponse build() {
            return new AnalyzeDocumentResponse(
                    __httpStatusCode__,
                    headers,
                    contentLocation,
                    location,
                    etag,
                    opcRequestId,
                    analyzeDocumentResult);
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
        sb.append(",contentLocation=").append(String.valueOf(contentLocation));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",analyzeDocumentResult=").append(String.valueOf(analyzeDocumentResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyzeDocumentResponse)) {
            return false;
        }

        AnalyzeDocumentResponse other = (AnalyzeDocumentResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.contentLocation, other.contentLocation)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.analyzeDocumentResult, other.analyzeDocumentResult);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.analyzeDocumentResult == null
                                ? 43
                                : this.analyzeDocumentResult.hashCode());
        return result;
    }
}
