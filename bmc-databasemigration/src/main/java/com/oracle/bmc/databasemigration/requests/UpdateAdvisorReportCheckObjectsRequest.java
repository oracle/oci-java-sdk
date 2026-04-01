/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.requests;

import com.oracle.bmc.databasemigration.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/UpdateAdvisorReportCheckObjectsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateAdvisorReportCheckObjectsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public class UpdateAdvisorReportCheckObjectsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemigration.model.UpdateAdvisorReportCheckObjectsDetails> {

    /**
     * The OCID of the job
     *
     */
    private String jobId;

    /**
     * The OCID of the job
     *
     */
    public String getJobId() {
        return jobId;
    }
    /**
     * The ID of the advisor check
     *
     */
    private String advisorReportCheckId;

    /**
     * The ID of the advisor check
     *
     */
    public String getAdvisorReportCheckId() {
        return advisorReportCheckId;
    }
    /**
     * Collection of AdvisorReportCheckObjectSummary.
     *
     */
    private com.oracle.bmc.databasemigration.model.UpdateAdvisorReportCheckObjectsDetails
            updateAdvisorReportCheckObjectsDetails;

    /**
     * Collection of AdvisorReportCheckObjectSummary.
     *
     */
    public com.oracle.bmc.databasemigration.model.UpdateAdvisorReportCheckObjectsDetails
            getUpdateAdvisorReportCheckObjectsDetails() {
        return updateAdvisorReportCheckObjectsDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasemigration.model.UpdateAdvisorReportCheckObjectsDetails
            getBody$() {
        return updateAdvisorReportCheckObjectsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAdvisorReportCheckObjectsRequest,
                    com.oracle.bmc.databasemigration.model.UpdateAdvisorReportCheckObjectsDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the job
         *
         */
        private String jobId = null;

        /**
         * The OCID of the job
         *
         * @param jobId the value to set
         * @return this builder instance
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * The ID of the advisor check
         *
         */
        private String advisorReportCheckId = null;

        /**
         * The ID of the advisor check
         *
         * @param advisorReportCheckId the value to set
         * @return this builder instance
         */
        public Builder advisorReportCheckId(String advisorReportCheckId) {
            this.advisorReportCheckId = advisorReportCheckId;
            return this;
        }

        /**
         * Collection of AdvisorReportCheckObjectSummary.
         *
         */
        private com.oracle.bmc.databasemigration.model.UpdateAdvisorReportCheckObjectsDetails
                updateAdvisorReportCheckObjectsDetails = null;

        /**
         * Collection of AdvisorReportCheckObjectSummary.
         *
         * @param updateAdvisorReportCheckObjectsDetails the value to set
         * @return this builder instance
         */
        public Builder updateAdvisorReportCheckObjectsDetails(
                com.oracle.bmc.databasemigration.model.UpdateAdvisorReportCheckObjectsDetails
                        updateAdvisorReportCheckObjectsDetails) {
            this.updateAdvisorReportCheckObjectsDetails = updateAdvisorReportCheckObjectsDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(UpdateAdvisorReportCheckObjectsRequest o) {
            jobId(o.getJobId());
            advisorReportCheckId(o.getAdvisorReportCheckId());
            updateAdvisorReportCheckObjectsDetails(o.getUpdateAdvisorReportCheckObjectsDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAdvisorReportCheckObjectsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateAdvisorReportCheckObjectsRequest
         */
        public UpdateAdvisorReportCheckObjectsRequest build() {
            UpdateAdvisorReportCheckObjectsRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasemigration.model.UpdateAdvisorReportCheckObjectsDetails
                        body) {
            updateAdvisorReportCheckObjectsDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAdvisorReportCheckObjectsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAdvisorReportCheckObjectsRequest
         */
        public UpdateAdvisorReportCheckObjectsRequest buildWithoutInvocationCallback() {
            UpdateAdvisorReportCheckObjectsRequest request =
                    new UpdateAdvisorReportCheckObjectsRequest();
            request.jobId = jobId;
            request.advisorReportCheckId = advisorReportCheckId;
            request.updateAdvisorReportCheckObjectsDetails = updateAdvisorReportCheckObjectsDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateAdvisorReportCheckObjectsRequest(jobId, advisorReportCheckId, updateAdvisorReportCheckObjectsDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .jobId(jobId)
                .advisorReportCheckId(advisorReportCheckId)
                .updateAdvisorReportCheckObjectsDetails(updateAdvisorReportCheckObjectsDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",jobId=").append(String.valueOf(this.jobId));
        sb.append(",advisorReportCheckId=").append(String.valueOf(this.advisorReportCheckId));
        sb.append(",updateAdvisorReportCheckObjectsDetails=")
                .append(String.valueOf(this.updateAdvisorReportCheckObjectsDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAdvisorReportCheckObjectsRequest)) {
            return false;
        }

        UpdateAdvisorReportCheckObjectsRequest other = (UpdateAdvisorReportCheckObjectsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.jobId, other.jobId)
                && java.util.Objects.equals(this.advisorReportCheckId, other.advisorReportCheckId)
                && java.util.Objects.equals(
                        this.updateAdvisorReportCheckObjectsDetails,
                        other.updateAdvisorReportCheckObjectsDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.jobId == null ? 43 : this.jobId.hashCode());
        result =
                (result * PRIME)
                        + (this.advisorReportCheckId == null
                                ? 43
                                : this.advisorReportCheckId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateAdvisorReportCheckObjectsDetails == null
                                ? 43
                                : this.updateAdvisorReportCheckObjectsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
