/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcemanager.responses;

import com.oracle.bmc.resourcemanager.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListStacksResponse {

    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Retrieves the next page of paginated list items. If the `opc-next-page`
     * header appears in the response, additional pages of results remain.
     * To receive the next page, include the header value in the `page` param.
     * If the `opc-next-page` header does not appear in the response, there
     * are no more list items to get. For more information about list pagination,
     * see [List Pagination](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * A list of StackSummary instances.
     */
    private java.util.List<StackSummary> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListStacksResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }
    }
}
