/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListMultipartUploadsResponse {

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * For pagination of a list of `MultipartUpload`s. If this header appears in the response, then
     * this is a partial list of multipart uploads. Include this value as the `page` parameter in a subsequent
     * GET request. For information about pagination, see [List Pagination](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/usingapi.htm).
     *
     */
    private String opcNextPage;

    /**
     * A list of MultipartUpload instances.
     */
    private java.util.List<MultipartUpload> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListMultipartUploadsResponse o) {
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }
    }
}
