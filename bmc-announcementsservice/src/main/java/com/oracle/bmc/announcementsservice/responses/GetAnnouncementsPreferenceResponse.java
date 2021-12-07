/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.responses;

import com.oracle.bmc.announcementsservice.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetAnnouncementsPreferenceResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     *
     */
    private String opcRequestId;

    /**
     * The returned AnnouncementsPreferences instance.
     */
    private com.oracle.bmc.announcementsservice.model.AnnouncementsPreferences
            announcementsPreferences;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "announcementsPreferences"
    })
    private GetAnnouncementsPreferenceResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.announcementsservice.model.AnnouncementsPreferences
                    announcementsPreferences) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.announcementsPreferences = announcementsPreferences;
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
        public Builder copy(GetAnnouncementsPreferenceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            announcementsPreferences(o.getAnnouncementsPreferences());

            return this;
        }

        public GetAnnouncementsPreferenceResponse build() {
            return new GetAnnouncementsPreferenceResponse(
                    __httpStatusCode__, opcRequestId, announcementsPreferences);
        }
    }
}
