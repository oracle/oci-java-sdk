/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.requests;

import com.oracle.bmc.apmtraces.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/UpdateScheduledQueryExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateScheduledQueryRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class UpdateScheduledQueryRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.apmtraces.model.UpdateScheduledQueryDetails> {

    /** The APM Domain ID for the intended request. */
    private String apmDomainId;

    /** The APM Domain ID for the intended request. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /** Id of the scheduled query. */
    private String scheduledQueryId;

    /** Id of the scheduled query. */
    public String getScheduledQueryId() {
        return scheduledQueryId;
    }
    /** Request body containing the details about the scheduled query to be updated. */
    private com.oracle.bmc.apmtraces.model.UpdateScheduledQueryDetails updateScheduledQueryDetails;

    /** Request body containing the details about the scheduled query to be updated. */
    public com.oracle.bmc.apmtraces.model.UpdateScheduledQueryDetails
            getUpdateScheduledQueryDetails() {
        return updateScheduledQueryDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Indicates that the request is a dry run, if set to "true". A dry run request does not create
     * or modify the resource and is used only to perform validation on the submitted data.
     */
    private String opcDryRun;

    /**
     * Indicates that the request is a dry run, if set to "true". A dry run request does not create
     * or modify the resource and is used only to perform validation on the submitted data.
     */
    public String getOpcDryRun() {
        return opcDryRun;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.apmtraces.model.UpdateScheduledQueryDetails getBody$() {
        return updateScheduledQueryDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateScheduledQueryRequest,
                    com.oracle.bmc.apmtraces.model.UpdateScheduledQueryDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The APM Domain ID for the intended request. */
        private String apmDomainId = null;

        /**
         * The APM Domain ID for the intended request.
         *
         * @param apmDomainId the value to set
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        /** Id of the scheduled query. */
        private String scheduledQueryId = null;

        /**
         * Id of the scheduled query.
         *
         * @param scheduledQueryId the value to set
         * @return this builder instance
         */
        public Builder scheduledQueryId(String scheduledQueryId) {
            this.scheduledQueryId = scheduledQueryId;
            return this;
        }

        /** Request body containing the details about the scheduled query to be updated. */
        private com.oracle.bmc.apmtraces.model.UpdateScheduledQueryDetails
                updateScheduledQueryDetails = null;

        /**
         * Request body containing the details about the scheduled query to be updated.
         *
         * @param updateScheduledQueryDetails the value to set
         * @return this builder instance
         */
        public Builder updateScheduledQueryDetails(
                com.oracle.bmc.apmtraces.model.UpdateScheduledQueryDetails
                        updateScheduledQueryDetails) {
            this.updateScheduledQueryDetails = updateScheduledQueryDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Indicates that the request is a dry run, if set to "true". A dry run request does not
         * create or modify the resource and is used only to perform validation on the submitted
         * data.
         */
        private String opcDryRun = null;

        /**
         * Indicates that the request is a dry run, if set to "true". A dry run request does not
         * create or modify the resource and is used only to perform validation on the submitted
         * data.
         *
         * @param opcDryRun the value to set
         * @return this builder instance
         */
        public Builder opcDryRun(String opcDryRun) {
            this.opcDryRun = opcDryRun;
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
        public Builder copy(UpdateScheduledQueryRequest o) {
            apmDomainId(o.getApmDomainId());
            scheduledQueryId(o.getScheduledQueryId());
            updateScheduledQueryDetails(o.getUpdateScheduledQueryDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            opcDryRun(o.getOpcDryRun());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateScheduledQueryRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateScheduledQueryRequest
         */
        public UpdateScheduledQueryRequest build() {
            UpdateScheduledQueryRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.apmtraces.model.UpdateScheduledQueryDetails body) {
            updateScheduledQueryDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateScheduledQueryRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateScheduledQueryRequest
         */
        public UpdateScheduledQueryRequest buildWithoutInvocationCallback() {
            UpdateScheduledQueryRequest request = new UpdateScheduledQueryRequest();
            request.apmDomainId = apmDomainId;
            request.scheduledQueryId = scheduledQueryId;
            request.updateScheduledQueryDetails = updateScheduledQueryDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.opcDryRun = opcDryRun;
            return request;
            // new UpdateScheduledQueryRequest(apmDomainId, scheduledQueryId,
            // updateScheduledQueryDetails, ifMatch, opcRequestId, opcRetryToken, opcDryRun);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .scheduledQueryId(scheduledQueryId)
                .updateScheduledQueryDetails(updateScheduledQueryDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .opcDryRun(opcDryRun);
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",scheduledQueryId=").append(String.valueOf(this.scheduledQueryId));
        sb.append(",updateScheduledQueryDetails=")
                .append(String.valueOf(this.updateScheduledQueryDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcDryRun=").append(String.valueOf(this.opcDryRun));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateScheduledQueryRequest)) {
            return false;
        }

        UpdateScheduledQueryRequest other = (UpdateScheduledQueryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(this.scheduledQueryId, other.scheduledQueryId)
                && java.util.Objects.equals(
                        this.updateScheduledQueryDetails, other.updateScheduledQueryDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcDryRun, other.opcDryRun);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledQueryId == null ? 43 : this.scheduledQueryId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateScheduledQueryDetails == null
                                ? 43
                                : this.updateScheduledQueryDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcDryRun == null ? 43 : this.opcDryRun.hashCode());
        return result;
    }
}
