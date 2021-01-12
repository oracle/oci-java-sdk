/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.responses;

import com.oracle.bmc.integration.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListWorkRequestErrorsResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For list pagination. When this header appears in the response, additional pages of results remain
     *
     */
    private String opcNextPage;

    /**
     * For list pagination. When this header appears in the response, additional pages of results have been previously returned
     *
     */
    private String opcPreviousPage;

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
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcPreviousPage(o.getOpcPreviousPage());
            items(o.getItems());

            return this;
        }
    }
}
