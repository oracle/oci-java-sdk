/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.responses;

import com.oracle.bmc.announcementsservice.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public class ListAnnouncementSubscriptionsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned AnnouncementSubscriptionCollection instance.
     */
    private com.oracle.bmc.announcementsservice.model.AnnouncementSubscriptionCollection
            announcementSubscriptionCollection;

    public com.oracle.bmc.announcementsservice.model.AnnouncementSubscriptionCollection
            getAnnouncementSubscriptionCollection() {
        return announcementSubscriptionCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "announcementSubscriptionCollection"
    })
    private ListAnnouncementSubscriptionsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.announcementsservice.model.AnnouncementSubscriptionCollection
                    announcementSubscriptionCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.announcementSubscriptionCollection = announcementSubscriptionCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
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

        private com.oracle.bmc.announcementsservice.model.AnnouncementSubscriptionCollection
                announcementSubscriptionCollection;

        public Builder announcementSubscriptionCollection(
                com.oracle.bmc.announcementsservice.model.AnnouncementSubscriptionCollection
                        announcementSubscriptionCollection) {
            this.announcementSubscriptionCollection = announcementSubscriptionCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListAnnouncementSubscriptionsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            announcementSubscriptionCollection(o.getAnnouncementSubscriptionCollection());

            return this;
        }

        public ListAnnouncementSubscriptionsResponse build() {
            return new ListAnnouncementSubscriptionsResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    announcementSubscriptionCollection);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",announcementSubscriptionCollection=")
                .append(String.valueOf(announcementSubscriptionCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAnnouncementSubscriptionsResponse)) {
            return false;
        }

        ListAnnouncementSubscriptionsResponse other = (ListAnnouncementSubscriptionsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.announcementSubscriptionCollection,
                        other.announcementSubscriptionCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.announcementSubscriptionCollection == null
                                ? 43
                                : this.announcementSubscriptionCollection.hashCode());
        return result;
    }
}
