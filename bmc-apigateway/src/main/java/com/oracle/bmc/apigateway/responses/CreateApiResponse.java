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
public class CreateApiResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * The OCID of the work request. Use
     * {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with
     * this id to track the status
     * of the request.
     *
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request
     * id.
     *
     */
    private String opcRequestId;

    /**
     * Location of the resource.
     *
     */
    private String location;

    /**
     * The returned Api instance.
     */
    private com.oracle.bmc.apigateway.model.Api api;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcWorkRequestId",
        "opcRequestId",
        "location",
        "api"
    })
    private CreateApiResponse(
            int __httpStatusCode__,
            String etag,
            String opcWorkRequestId,
            String opcRequestId,
            String location,
            com.oracle.bmc.apigateway.model.Api api) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.location = location;
        this.api = api;
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
        public Builder copy(CreateApiResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            api(o.getApi());

            return this;
        }

        public CreateApiResponse build() {
            return new CreateApiResponse(
                    __httpStatusCode__, etag, opcWorkRequestId, opcRequestId, location, api);
        }
    }
}
