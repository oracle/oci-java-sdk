/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.requests;

import com.oracle.bmc.announcementsservice.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/ChangeAnnouncementSubscriptionCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeAnnouncementSubscriptionCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public class ChangeAnnouncementSubscriptionCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.announcementsservice.model
                        .ChangeAnnouncementSubscriptionCompartmentDetails> {

    /** The OCID of the announcement subscription. */
    private String announcementSubscriptionId;

    /** The OCID of the announcement subscription. */
    public String getAnnouncementSubscriptionId() {
        return announcementSubscriptionId;
    }
    /** The compartment information to update. */
    private com.oracle.bmc.announcementsservice.model
                    .ChangeAnnouncementSubscriptionCompartmentDetails
            changeAnnouncementSubscriptionCompartmentDetails;

    /** The compartment information to update. */
    public com.oracle.bmc.announcementsservice.model
                    .ChangeAnnouncementSubscriptionCompartmentDetails
            getChangeAnnouncementSubscriptionCompartmentDetails() {
        return changeAnnouncementSubscriptionCompartmentDetails;
    }
    /** The locking version, used for optimistic concurrency control. */
    private String ifMatch;

    /** The locking version, used for optimistic concurrency control. */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the complete request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the complete request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.announcementsservice.model
                    .ChangeAnnouncementSubscriptionCompartmentDetails
            getBody$() {
        return changeAnnouncementSubscriptionCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeAnnouncementSubscriptionCompartmentRequest,
                    com.oracle.bmc.announcementsservice.model
                            .ChangeAnnouncementSubscriptionCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the announcement subscription. */
        private String announcementSubscriptionId = null;

        /**
         * The OCID of the announcement subscription.
         *
         * @param announcementSubscriptionId the value to set
         * @return this builder instance
         */
        public Builder announcementSubscriptionId(String announcementSubscriptionId) {
            this.announcementSubscriptionId = announcementSubscriptionId;
            return this;
        }

        /** The compartment information to update. */
        private com.oracle.bmc.announcementsservice.model
                        .ChangeAnnouncementSubscriptionCompartmentDetails
                changeAnnouncementSubscriptionCompartmentDetails = null;

        /**
         * The compartment information to update.
         *
         * @param changeAnnouncementSubscriptionCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeAnnouncementSubscriptionCompartmentDetails(
                com.oracle.bmc.announcementsservice.model
                                .ChangeAnnouncementSubscriptionCompartmentDetails
                        changeAnnouncementSubscriptionCompartmentDetails) {
            this.changeAnnouncementSubscriptionCompartmentDetails =
                    changeAnnouncementSubscriptionCompartmentDetails;
            return this;
        }

        /** The locking version, used for optimistic concurrency control. */
        private String ifMatch = null;

        /**
         * The locking version, used for optimistic concurrency control.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the complete request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the complete request ID.
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
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
         * @return this builder instance
         */
        public Builder copy(ChangeAnnouncementSubscriptionCompartmentRequest o) {
            announcementSubscriptionId(o.getAnnouncementSubscriptionId());
            changeAnnouncementSubscriptionCompartmentDetails(
                    o.getChangeAnnouncementSubscriptionCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeAnnouncementSubscriptionCompartmentRequest as configured by
         * this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeAnnouncementSubscriptionCompartmentRequest
         */
        public ChangeAnnouncementSubscriptionCompartmentRequest build() {
            ChangeAnnouncementSubscriptionCompartmentRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.announcementsservice.model
                                .ChangeAnnouncementSubscriptionCompartmentDetails
                        body) {
            changeAnnouncementSubscriptionCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeAnnouncementSubscriptionCompartmentRequest as configured by
         * this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeAnnouncementSubscriptionCompartmentRequest
         */
        public ChangeAnnouncementSubscriptionCompartmentRequest buildWithoutInvocationCallback() {
            ChangeAnnouncementSubscriptionCompartmentRequest request =
                    new ChangeAnnouncementSubscriptionCompartmentRequest();
            request.announcementSubscriptionId = announcementSubscriptionId;
            request.changeAnnouncementSubscriptionCompartmentDetails =
                    changeAnnouncementSubscriptionCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeAnnouncementSubscriptionCompartmentRequest(announcementSubscriptionId,
            // changeAnnouncementSubscriptionCompartmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .announcementSubscriptionId(announcementSubscriptionId)
                .changeAnnouncementSubscriptionCompartmentDetails(
                        changeAnnouncementSubscriptionCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
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
        sb.append(",announcementSubscriptionId=")
                .append(String.valueOf(this.announcementSubscriptionId));
        sb.append(",changeAnnouncementSubscriptionCompartmentDetails=")
                .append(String.valueOf(this.changeAnnouncementSubscriptionCompartmentDetails));
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
        if (!(o instanceof ChangeAnnouncementSubscriptionCompartmentRequest)) {
            return false;
        }

        ChangeAnnouncementSubscriptionCompartmentRequest other =
                (ChangeAnnouncementSubscriptionCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.announcementSubscriptionId, other.announcementSubscriptionId)
                && java.util.Objects.equals(
                        this.changeAnnouncementSubscriptionCompartmentDetails,
                        other.changeAnnouncementSubscriptionCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.announcementSubscriptionId == null
                                ? 43
                                : this.announcementSubscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeAnnouncementSubscriptionCompartmentDetails == null
                                ? 43
                                : this.changeAnnouncementSubscriptionCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
