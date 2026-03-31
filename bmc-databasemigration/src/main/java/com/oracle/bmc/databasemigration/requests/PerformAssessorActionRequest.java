/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.requests;

import com.oracle.bmc.databasemigration.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/PerformAssessorActionExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PerformAssessorActionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public class PerformAssessorActionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemigration.model.PerformAssessorActionDetails> {

    /**
     * The OCID of the Assessment
     *
     */
    private String assessmentId;

    /**
     * The OCID of the Assessment
     *
     */
    public String getAssessmentId() {
        return assessmentId;
    }
    /**
     * The name of the Assessor
     */
    private String assessorName;

    /**
     * The name of the Assessor
     */
    public String getAssessorName() {
        return assessorName;
    }
    /**
     * The Accessor Action
     */
    private String assessorAction;

    /**
     * The Accessor Action
     */
    public String getAssessorAction() {
        return assessorAction;
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
     * Assessor action details.
     */
    private com.oracle.bmc.databasemigration.model.PerformAssessorActionDetails
            performAssessorActionDetails;

    /**
     * Assessor action details.
     */
    public com.oracle.bmc.databasemigration.model.PerformAssessorActionDetails
            getPerformAssessorActionDetails() {
        return performAssessorActionDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasemigration.model.PerformAssessorActionDetails getBody$() {
        return performAssessorActionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PerformAssessorActionRequest,
                    com.oracle.bmc.databasemigration.model.PerformAssessorActionDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the Assessment
         *
         */
        private String assessmentId = null;

        /**
         * The OCID of the Assessment
         *
         * @param assessmentId the value to set
         * @return this builder instance
         */
        public Builder assessmentId(String assessmentId) {
            this.assessmentId = assessmentId;
            return this;
        }

        /**
         * The name of the Assessor
         */
        private String assessorName = null;

        /**
         * The name of the Assessor
         * @param assessorName the value to set
         * @return this builder instance
         */
        public Builder assessorName(String assessorName) {
            this.assessorName = assessorName;
            return this;
        }

        /**
         * The Accessor Action
         */
        private String assessorAction = null;

        /**
         * The Accessor Action
         * @param assessorAction the value to set
         * @return this builder instance
         */
        public Builder assessorAction(String assessorAction) {
            this.assessorAction = assessorAction;
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
         * Assessor action details.
         */
        private com.oracle.bmc.databasemigration.model.PerformAssessorActionDetails
                performAssessorActionDetails = null;

        /**
         * Assessor action details.
         * @param performAssessorActionDetails the value to set
         * @return this builder instance
         */
        public Builder performAssessorActionDetails(
                com.oracle.bmc.databasemigration.model.PerformAssessorActionDetails
                        performAssessorActionDetails) {
            this.performAssessorActionDetails = performAssessorActionDetails;
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
        public Builder copy(PerformAssessorActionRequest o) {
            assessmentId(o.getAssessmentId());
            assessorName(o.getAssessorName());
            assessorAction(o.getAssessorAction());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            performAssessorActionDetails(o.getPerformAssessorActionDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PerformAssessorActionRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of PerformAssessorActionRequest
         */
        public PerformAssessorActionRequest build() {
            PerformAssessorActionRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasemigration.model.PerformAssessorActionDetails body) {
            performAssessorActionDetails(body);
            return this;
        }

        /**
         * Build the instance of PerformAssessorActionRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PerformAssessorActionRequest
         */
        public PerformAssessorActionRequest buildWithoutInvocationCallback() {
            PerformAssessorActionRequest request = new PerformAssessorActionRequest();
            request.assessmentId = assessmentId;
            request.assessorName = assessorName;
            request.assessorAction = assessorAction;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.performAssessorActionDetails = performAssessorActionDetails;
            return request;
            // new PerformAssessorActionRequest(assessmentId, assessorName, assessorAction, opcRequestId, ifMatch, performAssessorActionDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .assessmentId(assessmentId)
                .assessorName(assessorName)
                .assessorAction(assessorAction)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .performAssessorActionDetails(performAssessorActionDetails);
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
        sb.append(",assessmentId=").append(String.valueOf(this.assessmentId));
        sb.append(",assessorName=").append(String.valueOf(this.assessorName));
        sb.append(",assessorAction=").append(String.valueOf(this.assessorAction));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",performAssessorActionDetails=")
                .append(String.valueOf(this.performAssessorActionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PerformAssessorActionRequest)) {
            return false;
        }

        PerformAssessorActionRequest other = (PerformAssessorActionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.assessmentId, other.assessmentId)
                && java.util.Objects.equals(this.assessorName, other.assessorName)
                && java.util.Objects.equals(this.assessorAction, other.assessorAction)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(
                        this.performAssessorActionDetails, other.performAssessorActionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.assessmentId == null ? 43 : this.assessmentId.hashCode());
        result = (result * PRIME) + (this.assessorName == null ? 43 : this.assessorName.hashCode());
        result =
                (result * PRIME)
                        + (this.assessorAction == null ? 43 : this.assessorAction.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.performAssessorActionDetails == null
                                ? 43
                                : this.performAssessorActionDetails.hashCode());
        return result;
    }
}
