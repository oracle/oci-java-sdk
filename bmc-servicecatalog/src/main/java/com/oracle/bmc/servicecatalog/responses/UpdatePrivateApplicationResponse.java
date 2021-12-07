/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.responses;

import com.oracle.bmc.servicecatalog.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class UpdatePrivateApplicationResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * The returned PrivateApplication instance.
     */
    private com.oracle.bmc.servicecatalog.model.PrivateApplication privateApplication;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcWorkRequestId",
        "etag",
        "privateApplication"
    })
    private UpdatePrivateApplicationResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcWorkRequestId,
            String etag,
            com.oracle.bmc.servicecatalog.model.PrivateApplication privateApplication) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.etag = etag;
        this.privateApplication = privateApplication;
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
        public Builder copy(UpdatePrivateApplicationResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            etag(o.getEtag());
            privateApplication(o.getPrivateApplication());

            return this;
        }

        public UpdatePrivateApplicationResponse build() {
            return new UpdatePrivateApplicationResponse(
                    __httpStatusCode__, opcRequestId, opcWorkRequestId, etag, privateApplication);
        }
    }
}
