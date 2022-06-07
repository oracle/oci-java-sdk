/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListLogAnalyticsLogGroupsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then additional items may be available on the previous page of the list. Include this value as the {@code page} parameter for the
     * subsequent request to get the previous batch of items.
     *
     */
    private String opcPrevPage;

    public String getOpcPrevPage() {
        return opcPrevPage;
    }

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then additional items may be available on the next page of the list. Include this value as the {@code page} parameter for the
     * subsequent request to get the next batch of items.
     *
     */
    private String opcNextPage;

    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned LogAnalyticsLogGroupSummaryCollection instance.
     */
    private com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummaryCollection
            logAnalyticsLogGroupSummaryCollection;

    public com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummaryCollection
            getLogAnalyticsLogGroupSummaryCollection() {
        return logAnalyticsLogGroupSummaryCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcPrevPage",
        "opcRequestId",
        "opcNextPage",
        "logAnalyticsLogGroupSummaryCollection"
    })
    private ListLogAnalyticsLogGroupsResponse(
            int __httpStatusCode__,
            String opcPrevPage,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummaryCollection
                    logAnalyticsLogGroupSummaryCollection) {
        super(__httpStatusCode__);
        this.opcPrevPage = opcPrevPage;
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.logAnalyticsLogGroupSummaryCollection = logAnalyticsLogGroupSummaryCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcPrevPage;

        public Builder opcPrevPage(String opcPrevPage) {
            this.opcPrevPage = opcPrevPage;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String opcNextPage;

        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        private com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummaryCollection
                logAnalyticsLogGroupSummaryCollection;

        public Builder logAnalyticsLogGroupSummaryCollection(
                com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummaryCollection
                        logAnalyticsLogGroupSummaryCollection) {
            this.logAnalyticsLogGroupSummaryCollection = logAnalyticsLogGroupSummaryCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListLogAnalyticsLogGroupsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcPrevPage(o.getOpcPrevPage());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            logAnalyticsLogGroupSummaryCollection(o.getLogAnalyticsLogGroupSummaryCollection());

            return this;
        }

        public ListLogAnalyticsLogGroupsResponse build() {
            return new ListLogAnalyticsLogGroupsResponse(
                    __httpStatusCode__,
                    opcPrevPage,
                    opcRequestId,
                    opcNextPage,
                    logAnalyticsLogGroupSummaryCollection);
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
        sb.append(",opcPrevPage=").append(String.valueOf(opcPrevPage));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",logAnalyticsLogGroupSummaryCollection=")
                .append(String.valueOf(logAnalyticsLogGroupSummaryCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListLogAnalyticsLogGroupsResponse)) {
            return false;
        }

        ListLogAnalyticsLogGroupsResponse other = (ListLogAnalyticsLogGroupsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcPrevPage, other.opcPrevPage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.logAnalyticsLogGroupSummaryCollection,
                        other.logAnalyticsLogGroupSummaryCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcPrevPage == null ? 43 : this.opcPrevPage.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.logAnalyticsLogGroupSummaryCollection == null
                                ? 43
                                : this.logAnalyticsLogGroupSummaryCollection.hashCode());
        return result;
    }
}
