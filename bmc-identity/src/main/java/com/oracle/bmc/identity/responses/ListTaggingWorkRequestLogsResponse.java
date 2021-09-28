/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.responses;

import com.oracle.bmc.identity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListTaggingWorkRequestLogsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The number of seconds that the client should wait before polling again.
     *
     */
    private Float retryAfter;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * A list of com.oracle.bmc.identity.model.TaggingWorkRequestLogSummary instances.
     */
    private java.util.List<com.oracle.bmc.identity.model.TaggingWorkRequestLogSummary> items;

    private ListTaggingWorkRequestLogsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            Float retryAfter,
            String opcNextPage,
            java.util.List<com.oracle.bmc.identity.model.TaggingWorkRequestLogSummary> items) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.retryAfter = retryAfter;
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
        public Builder copy(ListTaggingWorkRequestLogsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            retryAfter(o.getRetryAfter());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }

        public ListTaggingWorkRequestLogsResponse build() {
            return new ListTaggingWorkRequestLogsResponse(
                    __httpStatusCode__, opcRequestId, retryAfter, opcNextPage, items);
        }
    }
}
