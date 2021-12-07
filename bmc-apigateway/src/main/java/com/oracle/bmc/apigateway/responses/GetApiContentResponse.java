/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.responses;

import com.oracle.bmc.apigateway.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetApiContentResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request
     * id.
     *
     */
    private String opcRequestId;

    /**
     * Base64 encoded Sha256 of the body.
     */
    private String xContentSha256;

    /**
     * The returned java.io.InputStream instance.
     */
    private java.io.InputStream inputStream;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "xContentSha256",
        "inputStream"
    })
    private GetApiContentResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            String xContentSha256,
            java.io.InputStream inputStream) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.xContentSha256 = xContentSha256;
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
        public Builder copy(GetApiContentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            xContentSha256(o.getXContentSha256());
            inputStream(o.getInputStream());

            return this;
        }

        public GetApiContentResponse build() {
            return new GetApiContentResponse(
                    __httpStatusCode__, etag, opcRequestId, xContentSha256, inputStream);
        }
    }
}
