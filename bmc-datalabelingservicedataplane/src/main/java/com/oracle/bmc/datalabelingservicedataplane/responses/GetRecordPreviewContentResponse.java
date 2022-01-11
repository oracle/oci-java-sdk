/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.responses;

import com.oracle.bmc.datalabelingservicedataplane.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetRecordPreviewContentResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The content size of the body in bytes.
     */
    private Long contentLength;

    /**
     * The content disposition of the body, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 19.5.1.
     */
    private String contentDisposition;

    /**
     * The content type as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.17.
     */
    private String contentType;

    /**
     * Cache-control allows us to tell browsers to cache assets, how long to store them, and whether to validate them.
     *
     */
    private String cacheControl;

    /**
     * The returned java.io.InputStream instance, or null if {@link #isNotModified()} is true.
     */
    private java.io.InputStream inputStream;

    /**
     * Flag to indicate whether or not the object was modified.  If this is true,
     * the getter for the object itself will return null.  Callers should check this
     * if they specified one of the request params that might result in a conditional
     * response (like 'if-match'/'if-none-match').
     */
    private boolean isNotModified;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "contentLength",
        "contentDisposition",
        "contentType",
        "cacheControl",
        "inputStream",
        "isNotModified"
    })
    private GetRecordPreviewContentResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            Long contentLength,
            String contentDisposition,
            String contentType,
            String cacheControl,
            java.io.InputStream inputStream,
            boolean isNotModified) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.contentLength = contentLength;
        this.contentDisposition = contentDisposition;
        this.contentType = contentType;
        this.cacheControl = cacheControl;
        this.inputStream = inputStream;
        this.isNotModified = isNotModified;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetRecordPreviewContentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            contentLength(o.getContentLength());
            contentDisposition(o.getContentDisposition());
            contentType(o.getContentType());
            cacheControl(o.getCacheControl());
            inputStream(o.getInputStream());
            isNotModified(o.isNotModified());
            return this;
        }

        public GetRecordPreviewContentResponse build() {
            return new GetRecordPreviewContentResponse(
                    __httpStatusCode__,
                    etag,
                    opcRequestId,
                    contentLength,
                    contentDisposition,
                    contentType,
                    cacheControl,
                    inputStream,
                    isNotModified);
        }
    }
}
