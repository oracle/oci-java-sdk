/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListWorkRequestsResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular.
     *
     */
    private String opcRequestId;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the `page` parameter for the
     * subsequent GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * A list of WorkRequestSummary instances.
     */
    private java.util.List<WorkRequestSummary> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListWorkRequestsResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcClientRequestId(o.getOpcClientRequestId());
            items(o.getItems());

            return this;
        }
    }
}
