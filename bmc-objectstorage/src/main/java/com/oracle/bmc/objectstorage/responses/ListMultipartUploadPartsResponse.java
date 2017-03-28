/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.responses;

import java.io.*;
import java.util.*;

import com.oracle.bmc.model.*;
import javax.ws.rs.core.*;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Builder(builderClassName = "Builder")
@Getter
public class ListMultipartUploadPartsResponse {

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, please provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * For pagination of a list of `MultipartUploadPartSummary`s. If this header appears in the response,
     * then this is a partial list of object parts. Include this value as the `page` parameter in a subsequent
     * GET request to get the next batch of object parts. For information about pagination, see
     * [List Pagination](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/usingapi.htm).
     *
     */
    private String opcNextPage;

    /**
     * A list of MultipartUploadPartSummary instances.
     */
    private List<MultipartUploadPartSummary> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListMultipartUploadPartsResponse o) {
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }
    }
}
