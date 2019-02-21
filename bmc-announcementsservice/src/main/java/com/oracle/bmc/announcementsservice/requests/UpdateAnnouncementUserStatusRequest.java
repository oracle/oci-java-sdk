/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.announcementsservice.requests;

import com.oracle.bmc.announcementsservice.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class UpdateAnnouncementUserStatusRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The OCID of the announcement.
     */
    private String announcementId;

    /**
     * The information to use to update the announcement's read status.
     */
    private AnnouncementUserStatusDetails statusDetails;

    /**
     * The locking version, used for optimistic concurrency control.
     */
    private String ifMatch;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the complete request ID.
     *
     */
    private String opcRequestId;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateAnnouncementUserStatusRequest o) {
            announcementId(o.getAnnouncementId());
            statusDetails(o.getStatusDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            return this;
        }

        /**
         * Build the instance of UpdateAnnouncementUserStatusRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateAnnouncementUserStatusRequest
         */
        public UpdateAnnouncementUserStatusRequest build() {
            UpdateAnnouncementUserStatusRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
