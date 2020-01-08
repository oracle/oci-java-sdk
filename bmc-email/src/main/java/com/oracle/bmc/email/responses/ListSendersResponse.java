/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.email.responses;

import com.oracle.bmc.email.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListSendersResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide the
     * request ID.
     *
     */
    private String opcRequestId;

    /**
     * For list pagination. When this header appears in the response, additional
     * pages of results remain. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * For list pagination. When this header appears in the response, previous pages
     * of results exist. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcPrevPage;

    /**
     * The total number of items returned from the request.
     *
     */
    private Integer opcTotalItems;

    /**
     * A list of SenderSummary instances.
     */
    private java.util.List<SenderSummary> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListSendersResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcPrevPage(o.getOpcPrevPage());
            opcTotalItems(o.getOpcTotalItems());
            items(o.getItems());

            return this;
        }
    }
}
