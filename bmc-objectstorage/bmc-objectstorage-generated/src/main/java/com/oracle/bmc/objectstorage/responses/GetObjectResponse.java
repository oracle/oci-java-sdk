/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetObjectResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * The entity tag (ETag) for the object.
     */
    private String eTag;

    /**
     * The user-defined metadata for the object.
     */
    private java.util.Map<String, String> opcMeta;

    /**
     * The object size in bytes.
     */
    private Long contentLength;

    /**
     * Content-Range header for range requests, per [RFC 7233](https://tools.ietf.org/html/rfc7233#section-4.2).
     */
    private com.oracle.bmc.model.Range contentRange;

    /**
     * Content-MD5 header, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.15).
     * Unavailable for objects uploaded using multipart upload.
     *
     */
    private String contentMd5;

    /**
     * Only applicable to objects uploaded using multipart upload.
     * Base-64 representation of the multipart object hash.
     * The multipart object hash is calculated by taking the MD5 hashes of the parts,
     * concatenating the binary representation of those hashes in order of their part numbers,
     * and then calculating the MD5 hash of the concatenated values.
     *
     */
    private String opcMultipartMd5;

    /**
     * Content-Type header, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.17).
     */
    private String contentType;

    /**
     * Content-Language header, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.12).
     */
    private String contentLanguage;

    /**
     * Content-Encoding header, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.11).
     */
    private String contentEncoding;

    /**
     * Cache-Control header, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.9).
     */
    private String cacheControl;

    /**
     * Content-Disposition header, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-19.5.1).
     */
    private String contentDisposition;

    /**
     * The object modification time, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     */
    private java.util.Date lastModified;

    /**
     * The storage tier that the object is stored in.
     */
    private StorageTier storageTier;

    /**
     * Archival state of an object. This field is set only for objects in Archive tier.
     */
    private ArchivalState archivalState;

    /**
     * Time that the object is returned to the archived state. This field is only present for restored objects.
     */
    private java.util.Date timeOfArchival;

    /**
     * VersionId of the object requested
     */
    private String versionId;

    /**
     * The date and time after which the object is no longer cached by a browser, proxy, or other caching entity. See
     * [RFC 2616](https://tools.ietf.org/rfc/rfc2616#section-14.21).
     *
     */
    private java.util.Date expires;

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
        "opcClientRequestId",
        "opcRequestId",
        "eTag",
        "opcMeta",
        "contentLength",
        "contentRange",
        "contentMd5",
        "opcMultipartMd5",
        "contentType",
        "contentLanguage",
        "contentEncoding",
        "cacheControl",
        "contentDisposition",
        "lastModified",
        "storageTier",
        "archivalState",
        "timeOfArchival",
        "versionId",
        "expires",
        "inputStream",
        "isNotModified"
    })
    private GetObjectResponse(
            int __httpStatusCode__,
            String opcClientRequestId,
            String opcRequestId,
            String eTag,
            java.util.Map<String, String> opcMeta,
            Long contentLength,
            com.oracle.bmc.model.Range contentRange,
            String contentMd5,
            String opcMultipartMd5,
            String contentType,
            String contentLanguage,
            String contentEncoding,
            String cacheControl,
            String contentDisposition,
            java.util.Date lastModified,
            StorageTier storageTier,
            ArchivalState archivalState,
            java.util.Date timeOfArchival,
            String versionId,
            java.util.Date expires,
            java.io.InputStream inputStream,
            boolean isNotModified) {
        super(__httpStatusCode__);
        this.opcClientRequestId = opcClientRequestId;
        this.opcRequestId = opcRequestId;
        this.eTag = eTag;
        this.opcMeta = opcMeta;
        this.contentLength = contentLength;
        this.contentRange = contentRange;
        this.contentMd5 = contentMd5;
        this.opcMultipartMd5 = opcMultipartMd5;
        this.contentType = contentType;
        this.contentLanguage = contentLanguage;
        this.contentEncoding = contentEncoding;
        this.cacheControl = cacheControl;
        this.contentDisposition = contentDisposition;
        this.lastModified = lastModified;
        this.storageTier = storageTier;
        this.archivalState = archivalState;
        this.timeOfArchival = timeOfArchival;
        this.versionId = versionId;
        this.expires = expires;
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
        public Builder copy(GetObjectResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            eTag(o.getETag());
            opcMeta(o.getOpcMeta());
            contentLength(o.getContentLength());
            contentRange(o.getContentRange());
            contentMd5(o.getContentMd5());
            opcMultipartMd5(o.getOpcMultipartMd5());
            contentType(o.getContentType());
            contentLanguage(o.getContentLanguage());
            contentEncoding(o.getContentEncoding());
            cacheControl(o.getCacheControl());
            contentDisposition(o.getContentDisposition());
            lastModified(o.getLastModified());
            storageTier(o.getStorageTier());
            archivalState(o.getArchivalState());
            timeOfArchival(o.getTimeOfArchival());
            versionId(o.getVersionId());
            expires(o.getExpires());
            inputStream(o.getInputStream());
            isNotModified(o.isNotModified());
            return this;
        }

        public GetObjectResponse build() {
            return new GetObjectResponse(
                    __httpStatusCode__,
                    opcClientRequestId,
                    opcRequestId,
                    eTag,
                    opcMeta,
                    contentLength,
                    contentRange,
                    contentMd5,
                    opcMultipartMd5,
                    contentType,
                    contentLanguage,
                    contentEncoding,
                    cacheControl,
                    contentDisposition,
                    lastModified,
                    storageTier,
                    archivalState,
                    timeOfArchival,
                    versionId,
                    expires,
                    inputStream,
                    isNotModified);
        }
    }
}
