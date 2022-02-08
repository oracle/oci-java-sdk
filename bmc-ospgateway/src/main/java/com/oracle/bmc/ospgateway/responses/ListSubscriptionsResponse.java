/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.responses;

import com.oracle.bmc.ospgateway.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListSubscriptionsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For list pagination. If this header appears in the response, then this
     * is a partial list of invoices. Include this value as the {@code page} parameter in a subsequent
     * GET request to get the next batch of invoices.
     *
     */
    private String opcNextPage;

    /**
     * The total number of items that match the query.
     */
    private Integer opcTotalItems;

    /**
     * The returned SubscriptionCollection instance.
     */
    private com.oracle.bmc.ospgateway.model.SubscriptionCollection subscriptionCollection;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "opcTotalItems",
        "subscriptionCollection"
    })
    private ListSubscriptionsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            Integer opcTotalItems,
            com.oracle.bmc.ospgateway.model.SubscriptionCollection subscriptionCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.opcTotalItems = opcTotalItems;
        this.subscriptionCollection = subscriptionCollection;
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
        public Builder copy(ListSubscriptionsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcTotalItems(o.getOpcTotalItems());
            subscriptionCollection(o.getSubscriptionCollection());

            return this;
        }

        public ListSubscriptionsResponse build() {
            return new ListSubscriptionsResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    opcTotalItems,
                    subscriptionCollection);
        }
    }
}
