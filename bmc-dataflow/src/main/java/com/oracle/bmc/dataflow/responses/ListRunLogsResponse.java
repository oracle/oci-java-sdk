/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.responses;

import com.oracle.bmc.dataflow.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class ListRunLogsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle assigned identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Retrieves the previous page of results.
     * When this header appears in the response, previous pages of results exist.
     * See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcPrevPage;

    /**
     * Retrieves the next page of results. When this header appears in the response,
     * additional pages of results remain. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * A list of com.oracle.bmc.dataflow.model.RunLogSummary instances.
     */
    private java.util.List<com.oracle.bmc.dataflow.model.RunLogSummary> items;

    private ListRunLogsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcPrevPage,
            String opcNextPage,
            java.util.List<com.oracle.bmc.dataflow.model.RunLogSummary> items) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcPrevPage = opcPrevPage;
        this.opcNextPage = opcNextPage;
        this.items = items;
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
        public Builder copy(ListRunLogsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcPrevPage(o.getOpcPrevPage());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }

        public ListRunLogsResponse build() {
            return new ListRunLogsResponse(
                    __httpStatusCode__, opcRequestId, opcPrevPage, opcNextPage, items);
        }
    }
}
