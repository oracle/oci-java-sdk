/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.responses;

import com.oracle.bmc.oda.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateOdaInstanceResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Fully qualified URL for the newly created instance.
     */
    private String location;

    /**
     * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency control.
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status
     * of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you contact Oracle
     * about this request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned OdaInstance instance.
     */
    private com.oracle.bmc.oda.model.OdaInstance odaInstance;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "location",
        "etag",
        "opcWorkRequestId",
        "opcRequestId",
        "odaInstance"
    })
    private CreateOdaInstanceResponse(
            int __httpStatusCode__,
            String location,
            String etag,
            String opcWorkRequestId,
            String opcRequestId,
            com.oracle.bmc.oda.model.OdaInstance odaInstance) {
        super(__httpStatusCode__);
        this.location = location;
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.odaInstance = odaInstance;
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
        public Builder copy(CreateOdaInstanceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            location(o.getLocation());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            odaInstance(o.getOdaInstance());

            return this;
        }

        public CreateOdaInstanceResponse build() {
            return new CreateOdaInstanceResponse(
                    __httpStatusCode__,
                    location,
                    etag,
                    opcWorkRequestId,
                    opcRequestId,
                    odaInstance);
        }
    }
}
