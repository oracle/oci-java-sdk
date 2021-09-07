/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.responses;

import com.oracle.bmc.database.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class RemoteClonePluggableDatabaseResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the work request. Multiple OCID values are returned in a comma-separated list. Use {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with a work request OCID to track the status of the request.
     *
     */
    private String opcWorkRequestId;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned PluggableDatabase instance.
     */
    private com.oracle.bmc.database.model.PluggableDatabase pluggableDatabase;

    private RemoteClonePluggableDatabaseResponse(
            int __httpStatusCode__,
            String opcWorkRequestId,
            String etag,
            String opcRequestId,
            com.oracle.bmc.database.model.PluggableDatabase pluggableDatabase) {
        super(__httpStatusCode__);
        this.opcWorkRequestId = opcWorkRequestId;
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.pluggableDatabase = pluggableDatabase;
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
        public Builder copy(RemoteClonePluggableDatabaseResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcWorkRequestId(o.getOpcWorkRequestId());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            pluggableDatabase(o.getPluggableDatabase());

            return this;
        }

        public RemoteClonePluggableDatabaseResponse build() {
            return new RemoteClonePluggableDatabaseResponse(
                    __httpStatusCode__, opcWorkRequestId, etag, opcRequestId, pluggableDatabase);
        }
    }
}
