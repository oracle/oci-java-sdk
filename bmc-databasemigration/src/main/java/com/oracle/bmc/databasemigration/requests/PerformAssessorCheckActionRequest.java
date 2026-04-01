/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.requests;

import com.oracle.bmc.databasemigration.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/PerformAssessorCheckActionExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PerformAssessorCheckActionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public class PerformAssessorCheckActionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemigration.model.PerformAssessorCheckActionDetails> {

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
     * The Name of the assessor check
     */
    private String checkName;

    /**
     * The Name of the assessor check
     */
    public String getCheckName() {
        return checkName;
    }
    /**
     * The Accessor Check Action
     */
    private String assessorCheckAction;

    /**
     * The Accessor Check Action
     */
    public String getAssessorCheckAction() {
        return assessorCheckAction;
    }
    /**
     * Check action details.
     */
    private com.oracle.bmc.databasemigration.model.PerformAssessorCheckActionDetails
            performAssessorCheckActionDetails;

    /**
     * Check action details.
     */
    public com.oracle.bmc.databasemigration.model.PerformAssessorCheckActionDetails
            getPerformAssessorCheckActionDetails() {
        return performAssessorCheckActionDetails;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasemigration.model.PerformAssessorCheckActionDetails getBody$() {
        return performAssessorCheckActionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PerformAssessorCheckActionRequest,
                    com.oracle.bmc.databasemigration.model.PerformAssessorCheckActionDetails> {
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
         * The Name of the assessor check
         */
        private String checkName = null;

        /**
         * The Name of the assessor check
         * @param checkName the value to set
         * @return this builder instance
         */
        public Builder checkName(String checkName) {
            this.checkName = checkName;
            return this;
        }

        /**
         * The Accessor Check Action
         */
        private String assessorCheckAction = null;

        /**
         * The Accessor Check Action
         * @param assessorCheckAction the value to set
         * @return this builder instance
         */
        public Builder assessorCheckAction(String assessorCheckAction) {
            this.assessorCheckAction = assessorCheckAction;
            return this;
        }

        /**
         * Check action details.
         */
        private com.oracle.bmc.databasemigration.model.PerformAssessorCheckActionDetails
                performAssessorCheckActionDetails = null;

        /**
         * Check action details.
         * @param performAssessorCheckActionDetails the value to set
         * @return this builder instance
         */
        public Builder performAssessorCheckActionDetails(
                com.oracle.bmc.databasemigration.model.PerformAssessorCheckActionDetails
                        performAssessorCheckActionDetails) {
            this.performAssessorCheckActionDetails = performAssessorCheckActionDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(PerformAssessorCheckActionRequest o) {
            assessmentId(o.getAssessmentId());
            assessorName(o.getAssessorName());
            checkName(o.getCheckName());
            assessorCheckAction(o.getAssessorCheckAction());
            performAssessorCheckActionDetails(o.getPerformAssessorCheckActionDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PerformAssessorCheckActionRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of PerformAssessorCheckActionRequest
         */
        public PerformAssessorCheckActionRequest build() {
            PerformAssessorCheckActionRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasemigration.model.PerformAssessorCheckActionDetails body) {
            performAssessorCheckActionDetails(body);
            return this;
        }

        /**
         * Build the instance of PerformAssessorCheckActionRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PerformAssessorCheckActionRequest
         */
        public PerformAssessorCheckActionRequest buildWithoutInvocationCallback() {
            PerformAssessorCheckActionRequest request = new PerformAssessorCheckActionRequest();
            request.assessmentId = assessmentId;
            request.assessorName = assessorName;
            request.checkName = checkName;
            request.assessorCheckAction = assessorCheckAction;
            request.performAssessorCheckActionDetails = performAssessorCheckActionDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new PerformAssessorCheckActionRequest(assessmentId, assessorName, checkName, assessorCheckAction, performAssessorCheckActionDetails, opcRequestId, ifMatch, opcRetryToken);
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
                .checkName(checkName)
                .assessorCheckAction(assessorCheckAction)
                .performAssessorCheckActionDetails(performAssessorCheckActionDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",checkName=").append(String.valueOf(this.checkName));
        sb.append(",assessorCheckAction=").append(String.valueOf(this.assessorCheckAction));
        sb.append(",performAssessorCheckActionDetails=")
                .append(String.valueOf(this.performAssessorCheckActionDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PerformAssessorCheckActionRequest)) {
            return false;
        }

        PerformAssessorCheckActionRequest other = (PerformAssessorCheckActionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.assessmentId, other.assessmentId)
                && java.util.Objects.equals(this.assessorName, other.assessorName)
                && java.util.Objects.equals(this.checkName, other.checkName)
                && java.util.Objects.equals(this.assessorCheckAction, other.assessorCheckAction)
                && java.util.Objects.equals(
                        this.performAssessorCheckActionDetails,
                        other.performAssessorCheckActionDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.assessmentId == null ? 43 : this.assessmentId.hashCode());
        result = (result * PRIME) + (this.assessorName == null ? 43 : this.assessorName.hashCode());
        result = (result * PRIME) + (this.checkName == null ? 43 : this.checkName.hashCode());
        result =
                (result * PRIME)
                        + (this.assessorCheckAction == null
                                ? 43
                                : this.assessorCheckAction.hashCode());
        result =
                (result * PRIME)
                        + (this.performAssessorCheckActionDetails == null
                                ? 43
                                : this.performAssessorCheckActionDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
