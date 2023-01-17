/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.requests;

import com.oracle.bmc.announcementsservice.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/UpdateAnnouncementUserStatusExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateAnnouncementUserStatusRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public class UpdateAnnouncementUserStatusRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.announcementsservice.model.AnnouncementUserStatusDetails> {

    /**
     * The OCID of the announcement.
     */
    private String announcementId;

    /**
     * The OCID of the announcement.
     */
    public String getAnnouncementId() {
        return announcementId;
    }
    /**
     * The information to use to update the announcement's read status.
     */
    private com.oracle.bmc.announcementsservice.model.AnnouncementUserStatusDetails statusDetails;

    /**
     * The information to use to update the announcement's read status.
     */
    public com.oracle.bmc.announcementsservice.model.AnnouncementUserStatusDetails
            getStatusDetails() {
        return statusDetails;
    }
    /**
     * The locking version, used for optimistic concurrency control.
     */
    private String ifMatch;

    /**
     * The locking version, used for optimistic concurrency control.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the complete request ID.
     *
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the complete request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.announcementsservice.model.AnnouncementUserStatusDetails getBody$() {
        return statusDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAnnouncementUserStatusRequest,
                    com.oracle.bmc.announcementsservice.model.AnnouncementUserStatusDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the announcement.
         */
        private String announcementId = null;

        /**
         * The OCID of the announcement.
         * @param announcementId the value to set
         * @return this builder instance
         */
        public Builder announcementId(String announcementId) {
            this.announcementId = announcementId;
            return this;
        }

        /**
         * The information to use to update the announcement's read status.
         */
        private com.oracle.bmc.announcementsservice.model.AnnouncementUserStatusDetails
                statusDetails = null;

        /**
         * The information to use to update the announcement's read status.
         * @param statusDetails the value to set
         * @return this builder instance
         */
        public Builder statusDetails(
                com.oracle.bmc.announcementsservice.model.AnnouncementUserStatusDetails
                        statusDetails) {
            this.statusDetails = statusDetails;
            return this;
        }

        /**
         * The locking version, used for optimistic concurrency control.
         */
        private String ifMatch = null;

        /**
         * The locking version, used for optimistic concurrency control.
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the complete request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the complete request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

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
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
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
            retryConfiguration(o.getRetryConfiguration());
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
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.announcementsservice.model.AnnouncementUserStatusDetails body) {
            statusDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAnnouncementUserStatusRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAnnouncementUserStatusRequest
         */
        public UpdateAnnouncementUserStatusRequest buildWithoutInvocationCallback() {
            UpdateAnnouncementUserStatusRequest request = new UpdateAnnouncementUserStatusRequest();
            request.announcementId = announcementId;
            request.statusDetails = statusDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateAnnouncementUserStatusRequest(announcementId, statusDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .announcementId(announcementId)
                .statusDetails(statusDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",announcementId=").append(String.valueOf(this.announcementId));
        sb.append(",statusDetails=").append(String.valueOf(this.statusDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAnnouncementUserStatusRequest)) {
            return false;
        }

        UpdateAnnouncementUserStatusRequest other = (UpdateAnnouncementUserStatusRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.announcementId, other.announcementId)
                && java.util.Objects.equals(this.statusDetails, other.statusDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.announcementId == null ? 43 : this.announcementId.hashCode());
        result =
                (result * PRIME)
                        + (this.statusDetails == null ? 43 : this.statusDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
