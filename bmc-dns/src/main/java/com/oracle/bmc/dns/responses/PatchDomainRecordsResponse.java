/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.responses;

import com.oracle.bmc.dns.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class PatchDomainRecordsResponse {

    /**
     * For list pagination. When this header appears in the response, additional pages
     * of results remain. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * The total number of items that match the query.
     */
    private Integer opcTotalItems;

    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The current version of the record collection, ending with a
     * representation-specific suffix. This value may be used in If-Match
     * and If-None-Match headers for later requests of the same resource.
     *
     */
    private String eTag;

    /**
     * The returned RecordCollection instance.
     */
    private RecordCollection recordCollection;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(PatchDomainRecordsResponse o) {
            opcNextPage(o.getOpcNextPage());
            opcTotalItems(o.getOpcTotalItems());
            opcRequestId(o.getOpcRequestId());
            eTag(o.getETag());
            recordCollection(o.getRecordCollection());

            return this;
        }
    }
}
