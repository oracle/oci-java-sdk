/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListReplicationSourcesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * For paginating a list of replication sources.
     * In the GET request, set the limit to the number of items that you want returned in the response.
     * If the {@code opc-next-page} header appears in the response, then this is a partial list and there are additional
     * policies to get. Include the header's value as the {@code page} parameter in the subsequent GET request to get the
     * next batch of policies. Repeat this process to retrieve the entire list of sources.
     * <p>
     * For more details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * A list of com.oracle.bmc.objectstorage.model.ReplicationSource instances.
     */
    private java.util.List<com.oracle.bmc.objectstorage.model.ReplicationSource> items;

    private ListReplicationSourcesResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcClientRequestId,
            String opcNextPage,
            java.util.List<com.oracle.bmc.objectstorage.model.ReplicationSource> items) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcClientRequestId = opcClientRequestId;
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
        public Builder copy(ListReplicationSourcesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcClientRequestId(o.getOpcClientRequestId());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }

        public ListReplicationSourcesResponse build() {
            return new ListReplicationSourcesResponse(
                    __httpStatusCode__, opcRequestId, opcClientRequestId, opcNextPage, items);
        }
    }
}
