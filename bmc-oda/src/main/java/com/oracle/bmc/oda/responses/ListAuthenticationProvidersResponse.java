/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.responses;

import com.oracle.bmc.oda.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListAuthenticationProvidersResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * When you are paging through a list, if this header appears in the response,
     * then there might be additional items still to get. Include this value as the
     * {@code page} query parameter for the subsequent GET request.
     *
     */
    private String opcNextPage;

    /**
     * The total number of results that match the query.
     *
     */
    private Integer opcTotalItems;

    /**
     * The returned AuthenticationProviderCollection instance.
     */
    private com.oracle.bmc.oda.model.AuthenticationProviderCollection
            authenticationProviderCollection;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "opcTotalItems",
        "authenticationProviderCollection"
    })
    private ListAuthenticationProvidersResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            Integer opcTotalItems,
            com.oracle.bmc.oda.model.AuthenticationProviderCollection
                    authenticationProviderCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.opcTotalItems = opcTotalItems;
        this.authenticationProviderCollection = authenticationProviderCollection;
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
        public Builder copy(ListAuthenticationProvidersResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcTotalItems(o.getOpcTotalItems());
            authenticationProviderCollection(o.getAuthenticationProviderCollection());

            return this;
        }

        public ListAuthenticationProvidersResponse build() {
            return new ListAuthenticationProvidersResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    opcTotalItems,
                    authenticationProviderCollection);
        }
    }
}
