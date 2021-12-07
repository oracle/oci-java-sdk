/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.responses;

import com.oracle.bmc.apmtraces.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class QueryResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The total number of items that match the query.
     *
     */
    private Integer opcTotalItems;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the page parameter for the
     * subsequent GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * The returned QueryResultResponse instance.
     */
    private com.oracle.bmc.apmtraces.model.QueryResultResponse queryResultResponse;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcTotalItems",
        "opcNextPage",
        "queryResultResponse"
    })
    private QueryResponse(
            int __httpStatusCode__,
            String opcRequestId,
            Integer opcTotalItems,
            String opcNextPage,
            com.oracle.bmc.apmtraces.model.QueryResultResponse queryResultResponse) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcTotalItems = opcTotalItems;
        this.opcNextPage = opcNextPage;
        this.queryResultResponse = queryResultResponse;
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
        public Builder copy(QueryResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcTotalItems(o.getOpcTotalItems());
            opcNextPage(o.getOpcNextPage());
            queryResultResponse(o.getQueryResultResponse());

            return this;
        }

        public QueryResponse build() {
            return new QueryResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcTotalItems,
                    opcNextPage,
                    queryResultResponse);
        }
    }
}
