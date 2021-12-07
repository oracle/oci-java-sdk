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
public class CreateCertificateResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The OCID of the work request. Use
     * {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with
     * this id to track the status
     * of the request.
     *
     */
    private String opcWorkRequestId;

    /**
     * Location of the resource.
     *
     */
    private String location;

    /**
     * The returned Certificate instance.
     */
    private com.oracle.bmc.apigateway.model.Certificate certificate;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "opcWorkRequestId",
        "location",
        "certificate"
    })
    private CreateCertificateResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            String opcWorkRequestId,
            String location,
            com.oracle.bmc.apigateway.model.Certificate certificate) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.location = location;
        this.certificate = certificate;
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
        public Builder copy(CreateCertificateResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            location(o.getLocation());
            certificate(o.getCertificate());

            return this;
        }

        public CreateCertificateResponse build() {
            return new CreateCertificateResponse(
                    __httpStatusCode__,
                    etag,
                    opcRequestId,
                    opcWorkRequestId,
                    location,
                    certificate);
        }
    }
}
