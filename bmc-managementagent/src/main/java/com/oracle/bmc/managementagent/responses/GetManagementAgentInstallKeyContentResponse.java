/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.responses;

import com.oracle.bmc.managementagent.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetManagementAgentInstallKeyContentResponse
        extends com.oracle.bmc.responses.BmcResponse {
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
     * The content type of the body.
     */
    private String contentType;

    /**
     * The returned java.io.InputStream instance.
     */
    private java.io.InputStream inputStream;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "contentLength",
        "contentType",
        "inputStream"
    })
    private GetManagementAgentInstallKeyContentResponse(
            int __httpStatusCode__,
            String opcRequestId,
            Long contentLength,
            String contentType,
            java.io.InputStream inputStream) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.contentLength = contentLength;
        this.contentType = contentType;
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
        public Builder copy(GetManagementAgentInstallKeyContentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            contentLength(o.getContentLength());
            contentType(o.getContentType());
            inputStream(o.getInputStream());

            return this;
        }

        public GetManagementAgentInstallKeyContentResponse build() {
            return new GetManagementAgentInstallKeyContentResponse(
                    __httpStatusCode__, opcRequestId, contentLength, contentType, inputStream);
        }
    }
}
