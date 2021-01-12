/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.responses;

import com.oracle.bmc.dataflow.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetRunLogResponse {

    /**
     * Unique Oracle assigned identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control.
     * See [ETags for Optimistic Concurrency Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
     *
     */
    private String etag;

    /**
     * Indicates the size of the data as described in RFC 2616, section 14.13.
     *
     */
    private Long contentLength;

    /**
     * Specifies the media type of the underlying data as described in RFC 2616, section 14.17.
     *
     */
    private String contentType;

    /**
     * Indicates the encoding of the data, as described in RFC 2616, section 14.11.
     *
     */
    private String contentEncoding;

    /**
     * The user-defined metadata for the log.
     *
     */
    private java.util.Map<String, String> opcMeta;

    /**
     * The returned java.io.InputStream instance.
     */
    private java.io.InputStream inputStream;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetRunLogResponse o) {
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            contentLength(o.getContentLength());
            contentType(o.getContentType());
            contentEncoding(o.getContentEncoding());
            opcMeta(o.getOpcMeta());
            inputStream(o.getInputStream());

            return this;
        }
    }
}
