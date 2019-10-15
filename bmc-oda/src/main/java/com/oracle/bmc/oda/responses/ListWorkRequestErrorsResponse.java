/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.oda.responses;

import com.oracle.bmc.oda.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListWorkRequestErrorsResponse {

    /**
     * When you are paging through a list, if this header appears in the response,
     * then there might be additional items still to get. Include this value as the
     * `page` query parameter for the subsequent GET request.
     *
     */
    private String opcNextPage;

    /**
     * Unique Oracle-assigned identifier for the request. If you contact Oracle
     * about this request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * A list of WorkRequestError instances.
     */
    private java.util.List<WorkRequestError> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListWorkRequestErrorsResponse o) {
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            items(o.getItems());

            return this;
        }
    }
}
