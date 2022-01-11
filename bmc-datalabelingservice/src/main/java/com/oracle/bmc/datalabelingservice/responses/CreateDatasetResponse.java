/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservice.responses;

import com.oracle.bmc.datalabelingservice.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateDatasetResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The URI that identifies the entity described in the response body.
     *
     */
    private String contentLocation;

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
     * The returned Dataset instance.
     */
    private com.oracle.bmc.datalabelingservice.model.Dataset dataset;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "location",
        "contentLocation",
        "opcWorkRequestId",
        "opcRequestId",
        "dataset"
    })
    private CreateDatasetResponse(
            int __httpStatusCode__,
            String etag,
            String location,
            String contentLocation,
            String opcWorkRequestId,
            String opcRequestId,
            com.oracle.bmc.datalabelingservice.model.Dataset dataset) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.location = location;
        this.contentLocation = contentLocation;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.dataset = dataset;
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
        public Builder copy(CreateDatasetResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            location(o.getLocation());
            contentLocation(o.getContentLocation());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            dataset(o.getDataset());

            return this;
        }

        public CreateDatasetResponse build() {
            return new CreateDatasetResponse(
                    __httpStatusCode__,
                    etag,
                    location,
                    contentLocation,
                    opcWorkRequestId,
                    opcRequestId,
                    dataset);
        }
    }
}
