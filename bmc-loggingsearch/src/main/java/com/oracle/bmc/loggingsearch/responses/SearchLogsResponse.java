/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loggingsearch.responses;

import com.oracle.bmc.loggingsearch.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190909")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class SearchLogsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Reserved for future use. Pagination is not supported in this API.
     *
     */
    private String opcNextPage;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned SearchResponse instance.
     */
    private com.oracle.bmc.loggingsearch.model.SearchResponse searchResponse;

    private SearchLogsResponse(
            int __httpStatusCode__,
            String opcNextPage,
            String opcRequestId,
            com.oracle.bmc.loggingsearch.model.SearchResponse searchResponse) {
        super(__httpStatusCode__);
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.searchResponse = searchResponse;
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
        public Builder copy(SearchLogsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            searchResponse(o.getSearchResponse());

            return this;
        }

        public SearchLogsResponse build() {
            return new SearchLogsResponse(
                    __httpStatusCode__, opcNextPage, opcRequestId, searchResponse);
        }
    }
}
