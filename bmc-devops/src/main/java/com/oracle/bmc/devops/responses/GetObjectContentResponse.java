/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.responses;

import com.oracle.bmc.devops.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetObjectContentResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Content type refers to content of a file which is transferred via HTTP
     */
    private String contentType;

    /**
     * The Content-Disposition response-header field has been proposed as a means for the origin server to suggest a default filename if the user requests that the content is saved to a file.
     */
    private String contentDisposition;

    /**
     * The returned java.io.InputStream instance.
     */
    private java.io.InputStream inputStream;

    private GetObjectContentResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String contentType,
            String contentDisposition,
            java.io.InputStream inputStream) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.contentType = contentType;
        this.contentDisposition = contentDisposition;
        this.inputStream = inputStream;
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
        public Builder copy(GetObjectContentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            contentType(o.getContentType());
            contentDisposition(o.getContentDisposition());
            inputStream(o.getInputStream());

            return this;
        }

        public GetObjectContentResponse build() {
            return new GetObjectContentResponse(
                    __httpStatusCode__, opcRequestId, contentType, contentDisposition, inputStream);
        }
    }
}
