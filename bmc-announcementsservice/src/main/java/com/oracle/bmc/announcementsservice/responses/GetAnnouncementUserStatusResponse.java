/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.responses;

import com.oracle.bmc.announcementsservice.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetAnnouncementUserStatusResponse {

    /**
     *
     */
    private String opcRequestId;

    /**
     * The returned AnnouncementUserStatusDetails instance.
     */
    private AnnouncementUserStatusDetails announcementUserStatusDetails;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetAnnouncementUserStatusResponse o) {
            opcRequestId(o.getOpcRequestId());
            announcementUserStatusDetails(o.getAnnouncementUserStatusDetails());

            return this;
        }
    }
}
