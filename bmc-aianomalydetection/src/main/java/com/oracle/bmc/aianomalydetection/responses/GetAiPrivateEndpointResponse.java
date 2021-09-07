/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.responses;

import com.oracle.bmc.aianomalydetection.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class GetAiPrivateEndpointResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * The returned AiPrivateEndpoint instance.
     */
    private com.oracle.bmc.aianomalydetection.model.AiPrivateEndpoint aiPrivateEndpoint;

    private GetAiPrivateEndpointResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            com.oracle.bmc.aianomalydetection.model.AiPrivateEndpoint aiPrivateEndpoint) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.aiPrivateEndpoint = aiPrivateEndpoint;
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
        public Builder copy(GetAiPrivateEndpointResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            aiPrivateEndpoint(o.getAiPrivateEndpoint());

            return this;
        }

        public GetAiPrivateEndpointResponse build() {
            return new GetAiPrivateEndpointResponse(
                    __httpStatusCode__, opcRequestId, etag, aiPrivateEndpoint);
        }
    }
}