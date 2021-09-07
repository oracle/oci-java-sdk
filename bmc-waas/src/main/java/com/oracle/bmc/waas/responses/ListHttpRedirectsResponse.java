/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.responses;

import com.oracle.bmc.waas.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class ListHttpRedirectsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For list pagination. When this header appears in the response, additional pages of results may remain. For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String opcNextPage;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * A list of com.oracle.bmc.waas.model.HttpRedirectSummary instances.
     */
    private java.util.List<com.oracle.bmc.waas.model.HttpRedirectSummary> items;

    private ListHttpRedirectsResponse(
            int __httpStatusCode__,
            String opcNextPage,
            String opcRequestId,
            java.util.List<com.oracle.bmc.waas.model.HttpRedirectSummary> items) {
        super(__httpStatusCode__);
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.items = items;
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
        public Builder copy(ListHttpRedirectsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            items(o.getItems());

            return this;
        }

        public ListHttpRedirectsResponse build() {
            return new ListHttpRedirectsResponse(
                    __httpStatusCode__, opcNextPage, opcRequestId, items);
        }
    }
}
