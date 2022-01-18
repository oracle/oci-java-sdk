/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.visualbuilder.responses;

import com.oracle.bmc.visualbuilder.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210601")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListWorkRequestErrorsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned WorkRequestErrorCollection instance.
     */
    private com.oracle.bmc.visualbuilder.model.WorkRequestErrorCollection
            workRequestErrorCollection;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "opcPreviousPage",
        "workRequestErrorCollection"
    })
    private ListWorkRequestErrorsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            String opcPreviousPage,
            com.oracle.bmc.visualbuilder.model.WorkRequestErrorCollection
                    workRequestErrorCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.opcPreviousPage = opcPreviousPage;
        this.workRequestErrorCollection = workRequestErrorCollection;
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
        public Builder copy(ListWorkRequestErrorsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcPreviousPage(o.getOpcPreviousPage());
            workRequestErrorCollection(o.getWorkRequestErrorCollection());

            return this;
        }

        public ListWorkRequestErrorsResponse build() {
            return new ListWorkRequestErrorsResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    opcPreviousPage,
                    workRequestErrorCollection);
        }
    }
}
