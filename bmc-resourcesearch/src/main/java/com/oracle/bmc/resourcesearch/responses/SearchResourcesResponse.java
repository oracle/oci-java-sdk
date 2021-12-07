/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcesearch.responses;

import com.oracle.bmc.resourcesearch.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180409")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class SearchResourcesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Pagination token
     */
    private String opcNextPage;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned ResourceSummaryCollection instance.
     */
    private com.oracle.bmc.resourcesearch.model.ResourceSummaryCollection resourceSummaryCollection;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcNextPage",
        "opcRequestId",
        "resourceSummaryCollection"
    })
    private SearchResourcesResponse(
            int __httpStatusCode__,
            String opcNextPage,
            String opcRequestId,
            com.oracle.bmc.resourcesearch.model.ResourceSummaryCollection
                    resourceSummaryCollection) {
        super(__httpStatusCode__);
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.resourceSummaryCollection = resourceSummaryCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(SearchResourcesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            resourceSummaryCollection(o.getResourceSummaryCollection());

            return this;
        }

        public SearchResourcesResponse build() {
            return new SearchResourcesResponse(
                    __httpStatusCode__, opcNextPage, opcRequestId, resourceSummaryCollection);
        }
    }
}
