/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.requests;

import com.oracle.bmc.recovery.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/recovery/ScheduleProtectedDatabaseDeletionExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ScheduleProtectedDatabaseDeletionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
public class ScheduleProtectedDatabaseDeletionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.recovery.model.ScheduleProtectedDatabaseDeletionDetails> {

    /**
     * The protected database OCID.
     */
    private String protectedDatabaseId;

    /**
     * The protected database OCID.
     */
    public String getProtectedDatabaseId() {
        return protectedDatabaseId;
    }
    /**
     * The details for scheduling deletion of the protected database
     */
    private com.oracle.bmc.recovery.model.ScheduleProtectedDatabaseDeletionDetails
            scheduleProtectedDatabaseDeletionDetails;

    /**
     * The details for scheduling deletion of the protected database
     */
    public com.oracle.bmc.recovery.model.ScheduleProtectedDatabaseDeletionDetails
            getScheduleProtectedDatabaseDeletionDetails() {
        return scheduleProtectedDatabaseDeletionDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
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
    public com.oracle.bmc.recovery.model.ScheduleProtectedDatabaseDeletionDetails getBody$() {
        return scheduleProtectedDatabaseDeletionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ScheduleProtectedDatabaseDeletionRequest,
                    com.oracle.bmc.recovery.model.ScheduleProtectedDatabaseDeletionDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The protected database OCID.
         */
        private String protectedDatabaseId = null;

        /**
         * The protected database OCID.
         * @param protectedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder protectedDatabaseId(String protectedDatabaseId) {
            this.protectedDatabaseId = protectedDatabaseId;
            return this;
        }

        /**
         * The details for scheduling deletion of the protected database
         */
        private com.oracle.bmc.recovery.model.ScheduleProtectedDatabaseDeletionDetails
                scheduleProtectedDatabaseDeletionDetails = null;

        /**
         * The details for scheduling deletion of the protected database
         * @param scheduleProtectedDatabaseDeletionDetails the value to set
         * @return this builder instance
         */
        public Builder scheduleProtectedDatabaseDeletionDetails(
                com.oracle.bmc.recovery.model.ScheduleProtectedDatabaseDeletionDetails
                        scheduleProtectedDatabaseDeletionDetails) {
            this.scheduleProtectedDatabaseDeletionDetails =
                    scheduleProtectedDatabaseDeletionDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(ScheduleProtectedDatabaseDeletionRequest o) {
            protectedDatabaseId(o.getProtectedDatabaseId());
            scheduleProtectedDatabaseDeletionDetails(
                    o.getScheduleProtectedDatabaseDeletionDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ScheduleProtectedDatabaseDeletionRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ScheduleProtectedDatabaseDeletionRequest
         */
        public ScheduleProtectedDatabaseDeletionRequest build() {
            ScheduleProtectedDatabaseDeletionRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.recovery.model.ScheduleProtectedDatabaseDeletionDetails body) {
            scheduleProtectedDatabaseDeletionDetails(body);
            return this;
        }

        /**
         * Build the instance of ScheduleProtectedDatabaseDeletionRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ScheduleProtectedDatabaseDeletionRequest
         */
        public ScheduleProtectedDatabaseDeletionRequest buildWithoutInvocationCallback() {
            ScheduleProtectedDatabaseDeletionRequest request =
                    new ScheduleProtectedDatabaseDeletionRequest();
            request.protectedDatabaseId = protectedDatabaseId;
            request.scheduleProtectedDatabaseDeletionDetails =
                    scheduleProtectedDatabaseDeletionDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ScheduleProtectedDatabaseDeletionRequest(protectedDatabaseId, scheduleProtectedDatabaseDeletionDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .protectedDatabaseId(protectedDatabaseId)
                .scheduleProtectedDatabaseDeletionDetails(scheduleProtectedDatabaseDeletionDetails)
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
        sb.append(",protectedDatabaseId=").append(String.valueOf(this.protectedDatabaseId));
        sb.append(",scheduleProtectedDatabaseDeletionDetails=")
                .append(String.valueOf(this.scheduleProtectedDatabaseDeletionDetails));
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
        if (!(o instanceof ScheduleProtectedDatabaseDeletionRequest)) {
            return false;
        }

        ScheduleProtectedDatabaseDeletionRequest other =
                (ScheduleProtectedDatabaseDeletionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.protectedDatabaseId, other.protectedDatabaseId)
                && java.util.Objects.equals(
                        this.scheduleProtectedDatabaseDeletionDetails,
                        other.scheduleProtectedDatabaseDeletionDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.protectedDatabaseId == null
                                ? 43
                                : this.protectedDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleProtectedDatabaseDeletionDetails == null
                                ? 43
                                : this.scheduleProtectedDatabaseDeletionDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
