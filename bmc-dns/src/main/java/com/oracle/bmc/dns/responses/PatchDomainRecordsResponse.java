/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.responses;

import com.oracle.bmc.dns.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class PatchDomainRecordsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The current version of the resource, ending with a
     * representation-specific suffix. This value may be used in If-Match
     * and If-None-Match headers for later requests of the same resource.
     *
     */
    private String eTag;

    /**
     * The returned RecordCollection instance.
     */
    private com.oracle.bmc.dns.model.RecordCollection recordCollection;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcNextPage",
        "opcTotalItems",
        "opcRequestId",
        "eTag",
        "recordCollection"
    })
    private PatchDomainRecordsResponse(
            int __httpStatusCode__,
            String opcNextPage,
            Integer opcTotalItems,
            String opcRequestId,
            String eTag,
            com.oracle.bmc.dns.model.RecordCollection recordCollection) {
        super(__httpStatusCode__);
        this.opcNextPage = opcNextPage;
        this.opcTotalItems = opcTotalItems;
        this.opcRequestId = opcRequestId;
        this.eTag = eTag;
        this.recordCollection = recordCollection;
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
        public Builder copy(PatchDomainRecordsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcNextPage(o.getOpcNextPage());
            opcTotalItems(o.getOpcTotalItems());
            opcRequestId(o.getOpcRequestId());
            eTag(o.getETag());
            recordCollection(o.getRecordCollection());

            return this;
        }

        public PatchDomainRecordsResponse build() {
            return new PatchDomainRecordsResponse(
                    __httpStatusCode__,
                    opcNextPage,
                    opcTotalItems,
                    opcRequestId,
                    eTag,
                    recordCollection);
        }
    }
}
