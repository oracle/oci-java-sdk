/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.responses;

import com.oracle.bmc.dns.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class UpdateRRSetResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For list pagination. When this header appears in the response, additional pages
     * of results remain. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The total number of items that match the query.
     */
    private Integer opcTotalItems;

    public Integer getOpcTotalItems() {
        return opcTotalItems;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The current version of the resource, ending with a
     * representation-specific suffix. This value may be used in If-Match
     * and If-None-Match headers for later requests of the same resource.
     *
     */
    private String eTag;

    public String getETag() {
        return eTag;
    }

    /**
     * The returned RecordCollection instance.
     */
    private com.oracle.bmc.dns.model.RecordCollection recordCollection;

    public com.oracle.bmc.dns.model.RecordCollection getRecordCollection() {
        return recordCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcNextPage",
        "opcTotalItems",
        "opcRequestId",
        "eTag",
        "recordCollection"
    })
    private UpdateRRSetResponse(
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

        private String opcNextPage;

        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        private Integer opcTotalItems;

        public Builder opcTotalItems(Integer opcTotalItems) {
            this.opcTotalItems = opcTotalItems;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String eTag;

        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        private com.oracle.bmc.dns.model.RecordCollection recordCollection;

        public Builder recordCollection(
                com.oracle.bmc.dns.model.RecordCollection recordCollection) {
            this.recordCollection = recordCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateRRSetResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcNextPage(o.getOpcNextPage());
            opcTotalItems(o.getOpcTotalItems());
            opcRequestId(o.getOpcRequestId());
            eTag(o.getETag());
            recordCollection(o.getRecordCollection());

            return this;
        }

        public UpdateRRSetResponse build() {
            return new UpdateRRSetResponse(
                    __httpStatusCode__,
                    opcNextPage,
                    opcTotalItems,
                    opcRequestId,
                    eTag,
                    recordCollection);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",opcTotalItems=").append(String.valueOf(opcTotalItems));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",eTag=").append(String.valueOf(eTag));
        sb.append(",recordCollection=").append(String.valueOf(recordCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRRSetResponse)) {
            return false;
        }

        UpdateRRSetResponse other = (UpdateRRSetResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcTotalItems, other.opcTotalItems)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.eTag, other.eTag)
                && java.util.Objects.equals(this.recordCollection, other.recordCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.opcTotalItems == null ? 43 : this.opcTotalItems.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result =
                (result * PRIME)
                        + (this.recordCollection == null ? 43 : this.recordCollection.hashCode());
        return result;
    }
}
