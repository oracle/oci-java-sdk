/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.responses;

import com.oracle.bmc.aianomalydetection.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateModelResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * The URI that identifies the entity described in the response body.
     *
     */
    private String location;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned Model instance.
     */
    private com.oracle.bmc.aianomalydetection.model.Model model;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "location",
        "opcWorkRequestId",
        "opcRequestId",
        "model"
    })
    private CreateModelResponse(
            int __httpStatusCode__,
            String etag,
            String location,
            String opcWorkRequestId,
            String opcRequestId,
            com.oracle.bmc.aianomalydetection.model.Model model) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.location = location;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.model = model;
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
        public Builder copy(CreateModelResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            location(o.getLocation());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            model(o.getModel());

            return this;
        }

        public CreateModelResponse build() {
            return new CreateModelResponse(
                    __httpStatusCode__, etag, location, opcWorkRequestId, opcRequestId, model);
        }
    }
}
