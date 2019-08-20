/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.limits.responses;

import com.oracle.bmc.limits.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: ")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListLimitDefinitionsResponse {

    /**
     * For list pagination. When this header appears in the response, additional pages
     * of results remain. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
     * A list of LimitDefinitionSummary instances.
     */
    private java.util.List<LimitDefinitionSummary> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListLimitDefinitionsResponse o) {
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            items(o.getItems());

            return this;
        }
    }
}
