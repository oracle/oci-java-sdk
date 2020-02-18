/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.nosql.responses;

import com.oracle.bmc.nosql.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListTablesResponse {

    /**
     * For pagination of a list of items. When paging through a list,
     * if this header appears in the response, then a partial list
     * might have been returned. Include this value as the `page`
     * parameter for the subsequent GET request to get the next batch
     * of items.
     *
     */
    private String opcNextPage;

    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned TableCollection instance.
     */
    private TableCollection tableCollection;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListTablesResponse o) {
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            tableCollection(o.getTableCollection());

            return this;
        }
    }
}
