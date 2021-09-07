/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.responses;

import com.oracle.bmc.announcementsservice.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class ListAnnouncementsPreferencesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     *
     */
    private String opcNextPage;

    /**
     *
     */
    private String opcRequestId;

    /**
     * A list of com.oracle.bmc.announcementsservice.model.AnnouncementsPreferencesSummary instances.
     */
    private java.util.List<
                    com.oracle.bmc.announcementsservice.model.AnnouncementsPreferencesSummary>
            items;

    private ListAnnouncementsPreferencesResponse(
            int __httpStatusCode__,
            String opcNextPage,
            String opcRequestId,
            java.util.List<
                            com.oracle.bmc.announcementsservice.model
                                    .AnnouncementsPreferencesSummary>
                    items) {
        super(__httpStatusCode__);
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
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
        public Builder copy(ListAnnouncementsPreferencesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            items(o.getItems());

            return this;
        }

        public ListAnnouncementsPreferencesResponse build() {
            return new ListAnnouncementsPreferencesResponse(
                    __httpStatusCode__, opcNextPage, opcRequestId, items);
        }
    }
}
