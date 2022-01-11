/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemanagerproxy.responses;

import com.oracle.bmc.servicemanagerproxy.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210914")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListServiceEnvironmentsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For list pagination. When this header appears in the response, additional pages
     * of results remain. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * The returned ServiceEnvironmentCollection instance.
     */
    private com.oracle.bmc.servicemanagerproxy.model.ServiceEnvironmentCollection
            serviceEnvironmentCollection;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "serviceEnvironmentCollection"
    })
    private ListServiceEnvironmentsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.servicemanagerproxy.model.ServiceEnvironmentCollection
                    serviceEnvironmentCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.serviceEnvironmentCollection = serviceEnvironmentCollection;
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
        public Builder copy(ListServiceEnvironmentsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            serviceEnvironmentCollection(o.getServiceEnvironmentCollection());

            return this;
        }

        public ListServiceEnvironmentsResponse build() {
            return new ListServiceEnvironmentsResponse(
                    __httpStatusCode__, opcRequestId, opcNextPage, serviceEnvironmentCollection);
        }
    }
}