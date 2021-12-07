/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.responses;

import com.oracle.bmc.database.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateAutonomousContainerDatabaseResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you must contact Oracle about
     * a particular request, then provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the work request. Multiple OCID values are returned in a comma-separated list. Use {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with a work request OCID to track the status of the request.
     *
     */
    private String opcWorkRequestId;

    /**
     * The returned AutonomousContainerDatabase instance.
     */
    private com.oracle.bmc.database.model.AutonomousContainerDatabase autonomousContainerDatabase;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "opcWorkRequestId",
        "autonomousContainerDatabase"
    })
    private CreateAutonomousContainerDatabaseResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            String opcWorkRequestId,
            com.oracle.bmc.database.model.AutonomousContainerDatabase autonomousContainerDatabase) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.autonomousContainerDatabase = autonomousContainerDatabase;
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
        public Builder copy(CreateAutonomousContainerDatabaseResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            autonomousContainerDatabase(o.getAutonomousContainerDatabase());

            return this;
        }

        public CreateAutonomousContainerDatabaseResponse build() {
            return new CreateAutonomousContainerDatabaseResponse(
                    __httpStatusCode__,
                    etag,
                    opcRequestId,
                    opcWorkRequestId,
                    autonomousContainerDatabase);
        }
    }
}
