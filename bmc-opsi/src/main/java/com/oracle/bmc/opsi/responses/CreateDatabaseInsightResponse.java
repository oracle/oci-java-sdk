/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.responses;

import com.oracle.bmc.opsi.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class CreateDatabaseInsightResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * URI of the resource
     */
    private String location;

    /**
     * URI of the resource
     */
    private String contentLocation;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * The returned DatabaseInsight instance.
     */
    private com.oracle.bmc.opsi.model.DatabaseInsight databaseInsight;

    private CreateDatabaseInsightResponse(
            int __httpStatusCode__,
            String opcWorkRequestId,
            String opcRequestId,
            String location,
            String contentLocation,
            String etag,
            com.oracle.bmc.opsi.model.DatabaseInsight databaseInsight) {
        super(__httpStatusCode__);
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.location = location;
        this.contentLocation = contentLocation;
        this.etag = etag;
        this.databaseInsight = databaseInsight;
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
        public Builder copy(CreateDatabaseInsightResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            contentLocation(o.getContentLocation());
            etag(o.getEtag());
            databaseInsight(o.getDatabaseInsight());

            return this;
        }

        public CreateDatabaseInsightResponse build() {
            return new CreateDatabaseInsightResponse(
                    __httpStatusCode__,
                    opcWorkRequestId,
                    opcRequestId,
                    location,
                    contentLocation,
                    etag,
                    databaseInsight);
        }
    }
}
