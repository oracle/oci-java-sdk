/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.responses;

import com.oracle.bmc.opsi.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class HeadAwrHubObjectResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     * @return the value
     */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
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
     * The user-defined metadata for the Awr Hub object.
     */
    private java.util.Map<String, String> opcMeta;

    /**
     * The user-defined metadata for the Awr Hub object.
     * @return the value
     */
    public java.util.Map<String, String> getOpcMeta() {
        return opcMeta;
    }

    /**
     * The Awr Hub object size in bytes.
     */
    private Long contentLength;

    /**
     * The Awr Hub object size in bytes.
     * @return the value
     */
    public Long getContentLength() {
        return contentLength;
    }

    /**
     * Content-MD5 header.
     */
    private String contentMd5;

    /**
     * Content-MD5 header.
     * @return the value
     */
    public String getContentMd5() {
        return contentMd5;
    }

    /**
     *
     */
    private String opcMultipartMd5;

    /**
     *
     * @return the value
     */
    public String getOpcMultipartMd5() {
        return opcMultipartMd5;
    }

    /**
     * Content-Type header.
     */
    private String contentType;

    /**
     * Content-Type header.
     * @return the value
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Content-Language header.
     */
    private String contentLanguage;

    /**
     * Content-Language header.
     * @return the value
     */
    public String getContentLanguage() {
        return contentLanguage;
    }

    /**
     * Content-Encoding header.
     */
    private String contentEncoding;

    /**
     * Content-Encoding header.
     * @return the value
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * Cache-Control header.
     */
    private String cacheControl;

    /**
     * Cache-Control header.
     * @return the value
     */
    public String getCacheControl() {
        return cacheControl;
    }

    /**
     * Content-Disposition header.
     */
    private String contentDisposition;

    /**
     * Content-Disposition header.
     * @return the value
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * The Awr Hub object modification time.
     */
    private java.util.Date lastModified;

    /**
     * The Awr Hub object modification time.
     * @return the value
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * The storage tier that the Awr Hub object is stored in.
     */
    private StorageTier storageTier;

    /**
     * The storage tier that the Awr Hub object is stored in.
     * @return the value
     */
    public StorageTier getStorageTier() {
        return storageTier;
    }

    /**
     * The storage tier that the Awr Hub object is stored in.
     **/
    public enum StorageTier {
        Standard("STANDARD"),
        Infrequentaccess("INFREQUENTACCESS"),
        Archive("ARCHIVE"),
        ;

        private final String value;
        private static java.util.Map<String, StorageTier> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageTier v : StorageTier.values()) {
                map.put(v.getValue(), v);
            }
        }

        StorageTier(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageTier create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid StorageTier: " + key);
        }
    };

    /**
     * Archival state of an Awr Hub object. This field is set only for Awr Hub objects in Archive tier.
     */
    private ArchivalState archivalState;

    /**
     * Archival state of an Awr Hub object. This field is set only for Awr Hub objects in Archive tier.
     * @return the value
     */
    public ArchivalState getArchivalState() {
        return archivalState;
    }

    /**
     * Archival state of an Awr Hub object. This field is set only for Awr Hub objects in Archive tier.
     **/
    public enum ArchivalState {
        Archived("ARCHIVED"),
        Restoring("RESTORING"),
        Restored("RESTORED"),
        ;

        private final String value;
        private static java.util.Map<String, ArchivalState> map;

        static {
            map = new java.util.HashMap<>();
            for (ArchivalState v : ArchivalState.values()) {
                map.put(v.getValue(), v);
            }
        }

        ArchivalState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ArchivalState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ArchivalState: " + key);
        }
    };

    /**
     * Time that the Awr Hub object is returned to the archived state.
     */
    private java.util.Date timeOfArchival;

    /**
     * Time that the Awr Hub object is returned to the archived state.
     * @return the value
     */
    public java.util.Date getTimeOfArchival() {
        return timeOfArchival;
    }

    /**
     * VersionId of the requested Awr Hub object.
     */
    private String versionId;

    /**
     * VersionId of the requested Awr Hub object.
     * @return the value
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Flag to indicate whether or not the object was modified.  If this is true,
     * the getter for the object itself will return null.  Callers should check this
     * if they specified one of the request params that might result in a conditional
     * response (like 'if-match'/'if-none-match').
     */
    private boolean isNotModified;

    /**
     * Flag to indicate whether or not the object was modified.  If this is true,
     * the getter for the object itself will return null.  Callers should check this
     * if they specified one of the request params that might result in a conditional
     * response (like 'if-match'/'if-none-match').
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
        "etag",
        "opcMeta",
        "contentLength",
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
        "isNotModified"
    })
    private HeadAwrHubObjectResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcClientRequestId,
            String opcRequestId,
            String etag,
            java.util.Map<String, String> opcMeta,
            Long contentLength,
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
            boolean isNotModified) {
        super(__httpStatusCode__, headers);
        this.opcClientRequestId = opcClientRequestId;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.opcMeta = opcMeta;
        this.contentLength = contentLength;
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
        this.isNotModified = isNotModified;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
         */
        private String opcClientRequestId;

        /**
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
         * @param opcClientRequestId the value to set
         * @return this builder
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         */
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
         * The user-defined metadata for the Awr Hub object.
         */
        private java.util.Map<String, String> opcMeta;

        /**
         * The user-defined metadata for the Awr Hub object.
         * @param opcMeta the value to set
         * @return this builder
         */
        public Builder opcMeta(java.util.Map<String, String> opcMeta) {
            this.opcMeta = opcMeta;
            return this;
        }

        /**
         * The Awr Hub object size in bytes.
         */
        private Long contentLength;

        /**
         * The Awr Hub object size in bytes.
         * @param contentLength the value to set
         * @return this builder
         */
        public Builder contentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        /**
         * Content-MD5 header.
         */
        private String contentMd5;

        /**
         * Content-MD5 header.
         * @param contentMd5 the value to set
         * @return this builder
         */
        public Builder contentMd5(String contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }

        /**
         *
         */
        private String opcMultipartMd5;

        /**
         *
         * @param opcMultipartMd5 the value to set
         * @return this builder
         */
        public Builder opcMultipartMd5(String opcMultipartMd5) {
            this.opcMultipartMd5 = opcMultipartMd5;
            return this;
        }

        /**
         * Content-Type header.
         */
        private String contentType;

        /**
         * Content-Type header.
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Content-Language header.
         */
        private String contentLanguage;

        /**
         * Content-Language header.
         * @param contentLanguage the value to set
         * @return this builder
         */
        public Builder contentLanguage(String contentLanguage) {
            this.contentLanguage = contentLanguage;
            return this;
        }

        /**
         * Content-Encoding header.
         */
        private String contentEncoding;

        /**
         * Content-Encoding header.
         * @param contentEncoding the value to set
         * @return this builder
         */
        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * Cache-Control header.
         */
        private String cacheControl;

        /**
         * Cache-Control header.
         * @param cacheControl the value to set
         * @return this builder
         */
        public Builder cacheControl(String cacheControl) {
            this.cacheControl = cacheControl;
            return this;
        }

        /**
         * Content-Disposition header.
         */
        private String contentDisposition;

        /**
         * Content-Disposition header.
         * @param contentDisposition the value to set
         * @return this builder
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * The Awr Hub object modification time.
         */
        private java.util.Date lastModified;

        /**
         * The Awr Hub object modification time.
         * @param lastModified the value to set
         * @return this builder
         */
        public Builder lastModified(java.util.Date lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * The storage tier that the Awr Hub object is stored in.
         */
        private StorageTier storageTier;

        /**
         * The storage tier that the Awr Hub object is stored in.
         * @param storageTier the value to set
         * @return this builder
         */
        public Builder storageTier(StorageTier storageTier) {
            this.storageTier = storageTier;
            return this;
        }

        /**
         * Archival state of an Awr Hub object. This field is set only for Awr Hub objects in Archive tier.
         */
        private ArchivalState archivalState;

        /**
         * Archival state of an Awr Hub object. This field is set only for Awr Hub objects in Archive tier.
         * @param archivalState the value to set
         * @return this builder
         */
        public Builder archivalState(ArchivalState archivalState) {
            this.archivalState = archivalState;
            return this;
        }

        /**
         * Time that the Awr Hub object is returned to the archived state.
         */
        private java.util.Date timeOfArchival;

        /**
         * Time that the Awr Hub object is returned to the archived state.
         * @param timeOfArchival the value to set
         * @return this builder
         */
        public Builder timeOfArchival(java.util.Date timeOfArchival) {
            this.timeOfArchival = timeOfArchival;
            return this;
        }

        /**
         * VersionId of the requested Awr Hub object.
         */
        private String versionId;

        /**
         * VersionId of the requested Awr Hub object.
         * @param versionId the value to set
         * @return this builder
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * Flag to indicate whether or not the object was modified.  If this is true,
         * the getter for the object itself will return null.  Callers should check this
         * if they specified one of the request params that might result in a conditional
         * response (like 'if-match'/'if-none-match').
         */
        private boolean isNotModified;

        /**
         * Flag to indicate whether or not the object was modified.  If this is true,
         * the getter for the object itself will return null.  Callers should check this
         * if they specified one of the request params that might result in a conditional
         * response (like 'if-match'/'if-none-match').
         * @param true if the object was not modified
         */
        public Builder isNotModified(boolean isNotModified) {
            this.isNotModified = isNotModified;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(HeadAwrHubObjectResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            opcMeta(o.getOpcMeta());
            contentLength(o.getContentLength());
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

            isNotModified(o.isNotModified());
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public HeadAwrHubObjectResponse build() {
            return new HeadAwrHubObjectResponse(
                    __httpStatusCode__,
                    headers,
                    opcClientRequestId,
                    opcRequestId,
                    etag,
                    opcMeta,
                    contentLength,
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
                    isNotModified);
        }
    }

    /**
     * Return a new builder for this response object.
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcMeta=").append(String.valueOf(opcMeta));
        sb.append(",contentLength=").append(String.valueOf(contentLength));
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
        sb.append(",isNotModified=").append(isNotModified);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HeadAwrHubObjectResponse)) {
            return false;
        }

        HeadAwrHubObjectResponse other = (HeadAwrHubObjectResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcMeta, other.opcMeta)
                && java.util.Objects.equals(this.contentLength, other.contentLength)
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
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcMeta == null ? 43 : this.opcMeta.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLength == null ? 43 : this.contentLength.hashCode());
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
        result = (result * PRIME) + (this.isNotModified ? 79 : 97);
        return result;
    }
}
