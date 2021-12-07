/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.responses;

import com.oracle.bmc.resourcemanager.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListConfigurationSourceProvidersResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Retrieves the next page of paginated list items. If the {@code opc-next-page}
     * header appears in the response, additional pages of results remain.
     * To receive the next page, include the header value in the {@code page} param.
     * If the {@code opc-next-page} header does not appear in the response, there
     * are no more list items to get. For more information about list pagination,
     * see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * The returned ConfigurationSourceProviderCollection instance.
     */
    private com.oracle.bmc.resourcemanager.model.ConfigurationSourceProviderCollection
            configurationSourceProviderCollection;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "configurationSourceProviderCollection"
    })
    private ListConfigurationSourceProvidersResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.resourcemanager.model.ConfigurationSourceProviderCollection
                    configurationSourceProviderCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.configurationSourceProviderCollection = configurationSourceProviderCollection;
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
        public Builder copy(ListConfigurationSourceProvidersResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            configurationSourceProviderCollection(o.getConfigurationSourceProviderCollection());

            return this;
        }

        public ListConfigurationSourceProvidersResponse build() {
            return new ListConfigurationSourceProvidersResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    configurationSourceProviderCollection);
        }
    }
}
