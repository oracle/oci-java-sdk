/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.responses;

import com.oracle.bmc.osmanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListModuleStreamsOnManagedInstanceResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the asynchronous request.
     * You can use this to query the status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For pagination of a list of items. When paging through a list, if this
     * header appears in the response, then a partial list might have been
     * returned. Include this value as the {@code page} parameter for the subsequent
     * GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * A list of com.oracle.bmc.osmanagement.model.ModuleStreamOnManagedInstanceSummary instances.
     */
    private java.util.List<com.oracle.bmc.osmanagement.model.ModuleStreamOnManagedInstanceSummary>
            items;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcWorkRequestId",
        "opcRequestId",
        "opcNextPage",
        "items"
    })
    private ListModuleStreamsOnManagedInstanceResponse(
            int __httpStatusCode__,
            String opcWorkRequestId,
            String opcRequestId,
            String opcNextPage,
            java.util.List<com.oracle.bmc.osmanagement.model.ModuleStreamOnManagedInstanceSummary>
                    items) {
        super(__httpStatusCode__);
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
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
        public Builder copy(ListModuleStreamsOnManagedInstanceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }

        public ListModuleStreamsOnManagedInstanceResponse build() {
            return new ListModuleStreamsOnManagedInstanceResponse(
                    __httpStatusCode__, opcWorkRequestId, opcRequestId, opcNextPage, items);
        }
    }
}
