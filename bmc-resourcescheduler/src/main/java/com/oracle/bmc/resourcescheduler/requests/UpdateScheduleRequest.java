/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcescheduler.requests;

import com.oracle.bmc.resourcescheduler.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcescheduler/UpdateScheduleExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateScheduleRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
public class UpdateScheduleRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.resourcescheduler.model.UpdateScheduleDetails> {

    /**
     * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
     */
    private String scheduleId;

    /**
     * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
     */
    public String getScheduleId() {
        return scheduleId;
    }
    /**
     * The information about a schedule that will be updated.
     */
    private com.oracle.bmc.resourcescheduler.model.UpdateScheduleDetails updateScheduleDetails;

    /**
     * The information about a schedule that will be updated.
     */
    public com.oracle.bmc.resourcescheduler.model.UpdateScheduleDetails getUpdateScheduleDetails() {
        return updateScheduleDetails;
    }
    /**
     * This is used for optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous GET or POST response for
     * that resource. The resource will be updated or deleted only if the etag you provide
     * matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * This is used for optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous GET or POST response for
     * that resource. The resource will be updated or deleted only if the etag you provide
     * matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * This is a unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    private String opcRequestId;

    /**
     * This is a unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
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
    public com.oracle.bmc.resourcescheduler.model.UpdateScheduleDetails getBody$() {
        return updateScheduleDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateScheduleRequest,
                    com.oracle.bmc.resourcescheduler.model.UpdateScheduleDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
         */
        private String scheduleId = null;

        /**
         * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
         * @param scheduleId the value to set
         * @return this builder instance
         */
        public Builder scheduleId(String scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }

        /**
         * The information about a schedule that will be updated.
         */
        private com.oracle.bmc.resourcescheduler.model.UpdateScheduleDetails updateScheduleDetails =
                null;

        /**
         * The information about a schedule that will be updated.
         * @param updateScheduleDetails the value to set
         * @return this builder instance
         */
        public Builder updateScheduleDetails(
                com.oracle.bmc.resourcescheduler.model.UpdateScheduleDetails
                        updateScheduleDetails) {
            this.updateScheduleDetails = updateScheduleDetails;
            return this;
        }

        /**
         * This is used for optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response for
         * that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * This is used for optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response for
         * that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * This is a unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         */
        private String opcRequestId = null;

        /**
         * This is a unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
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
        public Builder copy(UpdateScheduleRequest o) {
            scheduleId(o.getScheduleId());
            updateScheduleDetails(o.getUpdateScheduleDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateScheduleRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateScheduleRequest
         */
        public UpdateScheduleRequest build() {
            UpdateScheduleRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.resourcescheduler.model.UpdateScheduleDetails body) {
            updateScheduleDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateScheduleRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateScheduleRequest
         */
        public UpdateScheduleRequest buildWithoutInvocationCallback() {
            UpdateScheduleRequest request = new UpdateScheduleRequest();
            request.scheduleId = scheduleId;
            request.updateScheduleDetails = updateScheduleDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateScheduleRequest(scheduleId, updateScheduleDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .scheduleId(scheduleId)
                .updateScheduleDetails(updateScheduleDetails)
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
        sb.append(",scheduleId=").append(String.valueOf(this.scheduleId));
        sb.append(",updateScheduleDetails=").append(String.valueOf(this.updateScheduleDetails));
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
        if (!(o instanceof UpdateScheduleRequest)) {
            return false;
        }

        UpdateScheduleRequest other = (UpdateScheduleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.scheduleId, other.scheduleId)
                && java.util.Objects.equals(this.updateScheduleDetails, other.updateScheduleDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.scheduleId == null ? 43 : this.scheduleId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateScheduleDetails == null
                                ? 43
                                : this.updateScheduleDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
