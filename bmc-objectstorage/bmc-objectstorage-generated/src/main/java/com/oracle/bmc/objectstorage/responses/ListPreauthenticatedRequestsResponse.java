/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListPreauthenticatedRequestsResponse {

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * Paginating a list of pre-authenticated requests.
     * In the GET request, set the limit to the number of pre-authenticated requests that you want returned in
     * the response. If the opc-next-page header appears in the response, then this is a partial list and there
     * are additional pre-authenticated requests to get. Include the header's value as the `page` parameter in
     * the subsequent GET request to get the next batch of pre-authenticated requests. Repeat this process to
     * retrieve the entire list of pre-authenticated requests.
     *
     */
    private String opcNextPage;

    /**
     * A list of PreauthenticatedRequestSummary instances.
     */
    private java.util.List<PreauthenticatedRequestSummary> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListPreauthenticatedRequestsResponse o) {
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }
    }
}
