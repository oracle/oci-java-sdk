/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.responses;

import com.oracle.bmc.usageapi.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class ListQueriesResponse {
    /**
     * HTTP status code returned by the operation.
     */
    private final int __httpStatusCode__;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For pagination of a list of Queries. If this header appears in the response, then this
     * is a partial list of Queries. Include this value as the `page` parameter in a subsequent
     * GET request, to get the next batch of Queries.
     *
     */
    private String opcNextPage;

    /**
     * The returned QueryCollection instance.
     */
    private QueryCollection queryCollection;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListQueriesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            queryCollection(o.getQueryCollection());

            return this;
        }
    }
}
