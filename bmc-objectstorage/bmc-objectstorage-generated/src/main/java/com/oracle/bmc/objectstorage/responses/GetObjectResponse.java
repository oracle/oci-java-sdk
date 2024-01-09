/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetObjectResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when
     * debugging.
     */
    private String opcClientRequestId;

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when
     * debugging.
     *
     * @return the value
     */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide this request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide this request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The entity tag (ETag) for the object. */
    private String eTag;

    /**
     * The entity tag (ETag) for the object.
     *
     * @return the value
     */
    public String getETag() {
        return eTag;
    }

    /** The user-defined metadata for the object. */
    private java.util.Map<String, String> opcMeta;

    /**
     * The user-defined metadata for the object.
     *
     * @return the value
     */
    public java.util.Map<String, String> getOpcMeta() {
        return opcMeta;
    }

    /** The object size in bytes. */
    private Long contentLength;

    /**
     * The object size in bytes.
     *
     * @return the value
     */
    public Long getContentLength() {
        return contentLength;
    }

    /**
     * Content-Range header for range requests, per [RFC
     * 7233](https://tools.ietf.org/html/rfc7233#section-4.2).
     */
    private com.oracle.bmc.model.Range contentRange;

    /**
     * Content-Range header for range requests, per [RFC
     * 7233](https://tools.ietf.org/html/rfc7233#section-4.2).
     *
     * @return the value
     */
    public com.oracle.bmc.model.Range getContentRange() {
        return contentRange;
    }

    /**
     * Content-MD5 header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.15). Unavailable for objects uploaded
     * using multipart upload.
     */
    private String contentMd5;

    /**
     * Content-MD5 header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.15). Unavailable for objects uploaded
     * using multipart upload.
     *
     * @return the value
     */
    public String getContentMd5() {
        return contentMd5;
    }

    /**
     * Only applicable to objects uploaded using multipart upload. Base-64 representation of the
     * multipart object hash. The multipart object hash is calculated by taking the MD5 hashes of
     * the parts, concatenating the binary representation of those hashes in order of their part
     * numbers, and then calculating the MD5 hash of the concatenated values.
     */
    private String opcMultipartMd5;

    /**
     * Only applicable to objects uploaded using multipart upload. Base-64 representation of the
     * multipart object hash. The multipart object hash is calculated by taking the MD5 hashes of
     * the parts, concatenating the binary representation of those hashes in order of their part
     * numbers, and then calculating the MD5 hash of the concatenated values.
     *
     * @return the value
     */
    public String getOpcMultipartMd5() {
        return opcMultipartMd5;
    }

    /**
     * Content-Type header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.17).
     */
    private String contentType;

    /**
     * Content-Type header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.17).
     *
     * @return the value
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Content-Language header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.12).
     */
    private String contentLanguage;

    /**
     * Content-Language header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.12).
     *
     * @return the value
     */
    public String getContentLanguage() {
        return contentLanguage;
    }

    /**
     * Content-Encoding header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.11).
     */
    private String contentEncoding;

    /**
     * Content-Encoding header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.11).
     *
     * @return the value
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * Cache-Control header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.9).
     */
    private String cacheControl;

    /**
     * Cache-Control header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.9).
     *
     * @return the value
     */
    public String getCacheControl() {
        return cacheControl;
    }

    /**
     * Content-Disposition header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-19.5.1).
     */
    private String contentDisposition;

    /**
     * Content-Disposition header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-19.5.1).
     *
     * @return the value
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * The object modification time, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     */
    private java.util.Date lastModified;

    /**
     * The object modification time, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     *
     * @return the value
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /** The storage tier that the object is stored in. */
    private StorageTier storageTier;

    /**
     * The storage tier that the object is stored in.
     *
     * @return the value
     */
    public StorageTier getStorageTier() {
        return storageTier;
    }

    /** Archival state of an object. This field is set only for objects in Archive tier. */
    private ArchivalState archivalState;

    /**
     * Archival state of an object. This field is set only for objects in Archive tier.
     *
     * @return the value
     */
    public ArchivalState getArchivalState() {
        return archivalState;
    }

    /**
     * Time that the object is returned to the archived state. This field is only present for
     * restored objects.
     */
    private java.util.Date timeOfArchival;

    /**
     * Time that the object is returned to the archived state. This field is only present for
     * restored objects.
     *
     * @return the value
     */
    public java.util.Date getTimeOfArchival() {
        return timeOfArchival;
    }

    /** VersionId of the object */
    private String versionId;

    /**
     * VersionId of the object
     *
     * @return the value
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * The date and time after which the object is no longer cached by a browser, proxy, or other
     * caching entity. See [RFC 2616](https://tools.ietf.org/rfc/rfc2616#section-14.21).
     */
    private java.util.Date expires;

    /**
     * The date and time after which the object is no longer cached by a browser, proxy, or other
     * caching entity. See [RFC 2616](https://tools.ietf.org/rfc/rfc2616#section-14.21).
     *
     * @return the value
     */
    public java.util.Date getExpires() {
        return expires;
    }

    /** The returned java.io.InputStream instance, or null if {@link #isNotModified()} is true. */
    private java.io.InputStream inputStream;

    /**
     * The returned java.io.InputStream instance, or null if {@link #isNotModified()} is true.
     *
     * @return the value
     */
    public java.io.InputStream getInputStream() {
        return inputStream;
    }

    /**
     * Flag to indicate whether or not the object was modified. If this is true, the getter for the
     * object itself will return null. Callers should check this if they specified one of the
     * request params that might result in a conditional response (like 'if-match'/'if-none-match').
     */
    private boolean isNotModified;

    /**
     * Flag to indicate whether or not the object was modified. If this is true, the getter for the
     * object itself will return null. Callers should check this if they specified one of the
     * request params that might result in a conditional response (like 'if-match'/'if-none-match').
     *
     * @param true if the object was not modified
     */
    public boolean isNotModified() {
        return isNotModified;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
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
            java.util.Map<String, java.util.List<String>> headers,
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
        super(__httpStatusCode__, headers);
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

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetObjectResponse> {
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
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when
         * debugging.
         */
        private String opcClientRequestId;

        /**
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when
         * debugging.
         *
         * @param opcClientRequestId the value to set
         * @return this builder
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide this request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide this request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The entity tag (ETag) for the object. */
        private String eTag;

        /**
         * The entity tag (ETag) for the object.
         *
         * @param eTag the value to set
         * @return this builder
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        /** The user-defined metadata for the object. */
        private java.util.Map<String, String> opcMeta;

        /**
         * The user-defined metadata for the object.
         *
         * @param opcMeta the value to set
         * @return this builder
         */
        public Builder opcMeta(java.util.Map<String, String> opcMeta) {
            this.opcMeta = opcMeta;
            return this;
        }

        /** The object size in bytes. */
        private Long contentLength;

        /**
         * The object size in bytes.
         *
         * @param contentLength the value to set
         * @return this builder
         */
        public Builder contentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        /**
         * Content-Range header for range requests, per [RFC
         * 7233](https://tools.ietf.org/html/rfc7233#section-4.2).
         */
        private com.oracle.bmc.model.Range contentRange;

        /**
         * Content-Range header for range requests, per [RFC
         * 7233](https://tools.ietf.org/html/rfc7233#section-4.2).
         *
         * @param contentRange the value to set
         * @return this builder
         */
        public Builder contentRange(com.oracle.bmc.model.Range contentRange) {
            this.contentRange = contentRange;
            return this;
        }

        /**
         * Content-MD5 header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.15). Unavailable for objects
         * uploaded using multipart upload.
         */
        private String contentMd5;

        /**
         * Content-MD5 header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.15). Unavailable for objects
         * uploaded using multipart upload.
         *
         * @param contentMd5 the value to set
         * @return this builder
         */
        public Builder contentMd5(String contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }

        /**
         * Only applicable to objects uploaded using multipart upload. Base-64 representation of the
         * multipart object hash. The multipart object hash is calculated by taking the MD5 hashes
         * of the parts, concatenating the binary representation of those hashes in order of their
         * part numbers, and then calculating the MD5 hash of the concatenated values.
         */
        private String opcMultipartMd5;

        /**
         * Only applicable to objects uploaded using multipart upload. Base-64 representation of the
         * multipart object hash. The multipart object hash is calculated by taking the MD5 hashes
         * of the parts, concatenating the binary representation of those hashes in order of their
         * part numbers, and then calculating the MD5 hash of the concatenated values.
         *
         * @param opcMultipartMd5 the value to set
         * @return this builder
         */
        public Builder opcMultipartMd5(String opcMultipartMd5) {
            this.opcMultipartMd5 = opcMultipartMd5;
            return this;
        }

        /**
         * Content-Type header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.17).
         */
        private String contentType;

        /**
         * Content-Type header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.17).
         *
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Content-Language header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.12).
         */
        private String contentLanguage;

        /**
         * Content-Language header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.12).
         *
         * @param contentLanguage the value to set
         * @return this builder
         */
        public Builder contentLanguage(String contentLanguage) {
            this.contentLanguage = contentLanguage;
            return this;
        }

        /**
         * Content-Encoding header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.11).
         */
        private String contentEncoding;

        /**
         * Content-Encoding header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.11).
         *
         * @param contentEncoding the value to set
         * @return this builder
         */
        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * Cache-Control header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.9).
         */
        private String cacheControl;

        /**
         * Cache-Control header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.9).
         *
         * @param cacheControl the value to set
         * @return this builder
         */
        public Builder cacheControl(String cacheControl) {
            this.cacheControl = cacheControl;
            return this;
        }

        /**
         * Content-Disposition header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-19.5.1).
         */
        private String contentDisposition;

        /**
         * Content-Disposition header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-19.5.1).
         *
         * @param contentDisposition the value to set
         * @return this builder
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * The object modification time, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         */
        private java.util.Date lastModified;

        /**
         * The object modification time, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         *
         * @param lastModified the value to set
         * @return this builder
         */
        public Builder lastModified(java.util.Date lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /** The storage tier that the object is stored in. */
        private StorageTier storageTier;

        /**
         * The storage tier that the object is stored in.
         *
         * @param storageTier the value to set
         * @return this builder
         */
        public Builder storageTier(StorageTier storageTier) {
            this.storageTier = storageTier;
            return this;
        }

        /** Archival state of an object. This field is set only for objects in Archive tier. */
        private ArchivalState archivalState;

        /**
         * Archival state of an object. This field is set only for objects in Archive tier.
         *
         * @param archivalState the value to set
         * @return this builder
         */
        public Builder archivalState(ArchivalState archivalState) {
            this.archivalState = archivalState;
            return this;
        }

        /**
         * Time that the object is returned to the archived state. This field is only present for
         * restored objects.
         */
        private java.util.Date timeOfArchival;

        /**
         * Time that the object is returned to the archived state. This field is only present for
         * restored objects.
         *
         * @param timeOfArchival the value to set
         * @return this builder
         */
        public Builder timeOfArchival(java.util.Date timeOfArchival) {
            this.timeOfArchival = timeOfArchival;
            return this;
        }

        /** VersionId of the object */
        private String versionId;

        /**
         * VersionId of the object
         *
         * @param versionId the value to set
         * @return this builder
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * The date and time after which the object is no longer cached by a browser, proxy, or
         * other caching entity. See [RFC 2616](https://tools.ietf.org/rfc/rfc2616#section-14.21).
         */
        private java.util.Date expires;

        /**
         * The date and time after which the object is no longer cached by a browser, proxy, or
         * other caching entity. See [RFC 2616](https://tools.ietf.org/rfc/rfc2616#section-14.21).
         *
         * @param expires the value to set
         * @return this builder
         */
        public Builder expires(java.util.Date expires) {
            this.expires = expires;
            return this;
        }

        /**
         * The returned java.io.InputStream instance, or null if {@link #isNotModified()} is true.
         */
        private java.io.InputStream inputStream;

        /**
         * The returned java.io.InputStream instance, or null if {@link #isNotModified()} is true.
         *
         * @param inputStream the value to set
         * @return this builder
         */
        public Builder inputStream(java.io.InputStream inputStream) {
            this.inputStream = inputStream;
            return this;
        }

        /**
         * Flag to indicate whether or not the object was modified. If this is true, the getter for
         * the object itself will return null. Callers should check this if they specified one of
         * the request params that might result in a conditional response (like
         * 'if-match'/'if-none-match').
         */
        private boolean isNotModified;

        /**
         * Flag to indicate whether or not the object was modified. If this is true, the getter for
         * the object itself will return null. Callers should check this if they specified one of
         * the request params that might result in a conditional response (like
         * 'if-match'/'if-none-match').
         *
         * @param true if the object was not modified
         */
        public Builder isNotModified(boolean isNotModified) {
            this.isNotModified = isNotModified;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetObjectResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
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

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetObjectResponse build() {
            return new GetObjectResponse(
                    __httpStatusCode__,
                    headers,
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
        sb.append(",opcClientRequestId=").append(String.valueOf(opcClientRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",eTag=").append(String.valueOf(eTag));
        sb.append(",opcMeta=").append(String.valueOf(opcMeta));
        sb.append(",contentLength=").append(String.valueOf(contentLength));
        sb.append(",contentRange=").append(String.valueOf(contentRange));
        sb.append(",contentMd5=").append(String.valueOf(contentMd5));
        sb.append(",opcMultipartMd5=").append(String.valueOf(opcMultipartMd5));
        sb.append(",contentType=").append(String.valueOf(contentType));
        sb.append(",contentLanguage=").append(String.valueOf(contentLanguage));
        sb.append(",contentEncoding=").append(String.valueOf(contentEncoding));
        sb.append(",cacheControl=").append(String.valueOf(cacheControl));
        sb.append(",contentDisposition=").append(String.valueOf(contentDisposition));
        sb.append(",lastModified=").append(String.valueOf(lastModified));
        sb.append(",storageTier=").append(String.valueOf(storageTier));
        sb.append(",archivalState=").append(String.valueOf(archivalState));
        sb.append(",timeOfArchival=").append(String.valueOf(timeOfArchival));
        sb.append(",versionId=").append(String.valueOf(versionId));
        sb.append(",expires=").append(String.valueOf(expires));
        sb.append(",inputStream=").append(String.valueOf(inputStream));
        sb.append(",isNotModified=").append(isNotModified);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetObjectResponse)) {
            return false;
        }

        GetObjectResponse other = (GetObjectResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.eTag, other.eTag)
                && java.util.Objects.equals(this.opcMeta, other.opcMeta)
                && java.util.Objects.equals(this.contentLength, other.contentLength)
                && java.util.Objects.equals(this.contentRange, other.contentRange)
                && java.util.Objects.equals(this.contentMd5, other.contentMd5)
                && java.util.Objects.equals(this.opcMultipartMd5, other.opcMultipartMd5)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.contentLanguage, other.contentLanguage)
                && java.util.Objects.equals(this.contentEncoding, other.contentEncoding)
                && java.util.Objects.equals(this.cacheControl, other.cacheControl)
                && java.util.Objects.equals(this.contentDisposition, other.contentDisposition)
                && java.util.Objects.equals(this.lastModified, other.lastModified)
                && java.util.Objects.equals(this.storageTier, other.storageTier)
                && java.util.Objects.equals(this.archivalState, other.archivalState)
                && java.util.Objects.equals(this.timeOfArchival, other.timeOfArchival)
                && java.util.Objects.equals(this.versionId, other.versionId)
                && java.util.Objects.equals(this.expires, other.expires)
                && java.util.Objects.equals(this.inputStream, other.inputStream)
                && this.isNotModified == other.isNotModified;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result = (result * PRIME) + (this.opcMeta == null ? 43 : this.opcMeta.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLength == null ? 43 : this.contentLength.hashCode());
        result = (result * PRIME) + (this.contentRange == null ? 43 : this.contentRange.hashCode());
        result = (result * PRIME) + (this.contentMd5 == null ? 43 : this.contentMd5.hashCode());
        result =
                (result * PRIME)
                        + (this.opcMultipartMd5 == null ? 43 : this.opcMultipartMd5.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLanguage == null ? 43 : this.contentLanguage.hashCode());
        result =
                (result * PRIME)
                        + (this.contentEncoding == null ? 43 : this.contentEncoding.hashCode());
        result = (result * PRIME) + (this.cacheControl == null ? 43 : this.cacheControl.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDisposition == null
                                ? 43
                                : this.contentDisposition.hashCode());
        result = (result * PRIME) + (this.lastModified == null ? 43 : this.lastModified.hashCode());
        result = (result * PRIME) + (this.storageTier == null ? 43 : this.storageTier.hashCode());
        result =
                (result * PRIME)
                        + (this.archivalState == null ? 43 : this.archivalState.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfArchival == null ? 43 : this.timeOfArchival.hashCode());
        result = (result * PRIME) + (this.versionId == null ? 43 : this.versionId.hashCode());
        result = (result * PRIME) + (this.expires == null ? 43 : this.expires.hashCode());
        result = (result * PRIME) + (this.inputStream == null ? 43 : this.inputStream.hashCode());
        result = (result * PRIME) + (this.isNotModified ? 79 : 97);
        return result;
    }
}
