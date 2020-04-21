/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.responses;

import com.oracle.bmc.datascience.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetModelArtifactContentResponse {

    /**
     * For optimistic concurrency control. See [ETags for Optimistic Concurrency Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
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
     * The base-64 encoded MD5 hash of the body, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.15.
     * Unavailable for objects uploaded using multipart upload.
     * If the `content-md5` header is present, Object Storage performs an integrity check on the body of the HTTP request by computing the MD5 hash for the body and comparing it to the MD5 hash supplied in the header.
     * If the two hashes do not match, the object is rejected and an HTTP-400 Unmatched Content MD5 error is returned with the message:
     * \"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5 header (HEADER_MD5)\"
     *
     */
    private String contentMd5;

    /**
     * The artifact modification time, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
     */
    private java.util.Date lastModified;

    /**
     * The returned java.io.InputStream instance.
     */
    private java.io.InputStream inputStream;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetModelArtifactContentResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            contentLength(o.getContentLength());
            contentDisposition(o.getContentDisposition());
            contentMd5(o.getContentMd5());
            lastModified(o.getLastModified());
            inputStream(o.getInputStream());

            return this;
        }
    }
}
