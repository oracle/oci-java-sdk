/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.responses;

import com.oracle.bmc.databasetools.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateDatabaseToolsPrivateEndpointResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * URI of the new resource which was created by the request.
     */
    private String location;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

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
     * The returned DatabaseToolsPrivateEndpoint instance.
     */
    private com.oracle.bmc.databasetools.model.DatabaseToolsPrivateEndpoint
            databaseToolsPrivateEndpoint;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "location",
        "etag",
        "opcWorkRequestId",
        "opcRequestId",
        "databaseToolsPrivateEndpoint"
    })
    private CreateDatabaseToolsPrivateEndpointResponse(
            int __httpStatusCode__,
            String location,
            String etag,
            String opcWorkRequestId,
            String opcRequestId,
            com.oracle.bmc.databasetools.model.DatabaseToolsPrivateEndpoint
                    databaseToolsPrivateEndpoint) {
        super(__httpStatusCode__);
        this.location = location;
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.databaseToolsPrivateEndpoint = databaseToolsPrivateEndpoint;
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
        public Builder copy(CreateDatabaseToolsPrivateEndpointResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            location(o.getLocation());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            databaseToolsPrivateEndpoint(o.getDatabaseToolsPrivateEndpoint());

            return this;
        }

        public CreateDatabaseToolsPrivateEndpointResponse build() {
            return new CreateDatabaseToolsPrivateEndpointResponse(
                    __httpStatusCode__,
                    location,
                    etag,
                    opcWorkRequestId,
                    opcRequestId,
                    databaseToolsPrivateEndpoint);
        }
    }
}
