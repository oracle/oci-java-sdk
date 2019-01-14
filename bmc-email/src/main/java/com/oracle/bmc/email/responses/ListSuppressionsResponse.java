/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.email.responses;

import com.oracle.bmc.email.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListSuppressionsResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide the
     * request ID.
     *
     */
    private String opcRequestId;

    /**
     * For pagination of a list of items. If this header appears in the
     * response, then a partial list might have been returned. Include
     * this value for the `page` parameter in subsequent GET
     * requests to return the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * A list of SuppressionSummary instances.
     */
    private java.util.List<SuppressionSummary> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListSuppressionsResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }
    }
}
