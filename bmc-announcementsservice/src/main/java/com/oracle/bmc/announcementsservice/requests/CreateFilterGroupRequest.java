/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.requests;

import com.oracle.bmc.announcementsservice.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/CreateFilterGroupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateFilterGroupRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public class CreateFilterGroupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.announcementsservice.model.CreateFilterGroupDetails> {

    /** The OCID of the announcement subscription. */
    private String announcementSubscriptionId;

    /** The OCID of the announcement subscription. */
    public String getAnnouncementSubscriptionId() {
        return announcementSubscriptionId;
    }
    /** Details of the new filter group. */
    private com.oracle.bmc.announcementsservice.model.CreateFilterGroupDetails
            createFilterGroupDetails;

    /** Details of the new filter group. */
    public com.oracle.bmc.announcementsservice.model.CreateFilterGroupDetails
            getCreateFilterGroupDetails() {
        return createFilterGroupDetails;
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
    /** The locking version, used for optimistic concurrency control. */
    private String ifMatch;

    /** The locking version, used for optimistic concurrency control. */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.announcementsservice.model.CreateFilterGroupDetails getBody$() {
        return createFilterGroupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateFilterGroupRequest,
                    com.oracle.bmc.announcementsservice.model.CreateFilterGroupDetails> {
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

        /** Details of the new filter group. */
        private com.oracle.bmc.announcementsservice.model.CreateFilterGroupDetails
                createFilterGroupDetails = null;

        /**
         * Details of the new filter group.
         *
         * @param createFilterGroupDetails the value to set
         * @return this builder instance
         */
        public Builder createFilterGroupDetails(
                com.oracle.bmc.announcementsservice.model.CreateFilterGroupDetails
                        createFilterGroupDetails) {
            this.createFilterGroupDetails = createFilterGroupDetails;
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
        public Builder copy(CreateFilterGroupRequest o) {
            announcementSubscriptionId(o.getAnnouncementSubscriptionId());
            createFilterGroupDetails(o.getCreateFilterGroupDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateFilterGroupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateFilterGroupRequest
         */
        public CreateFilterGroupRequest build() {
            CreateFilterGroupRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.announcementsservice.model.CreateFilterGroupDetails body) {
            createFilterGroupDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateFilterGroupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateFilterGroupRequest
         */
        public CreateFilterGroupRequest buildWithoutInvocationCallback() {
            CreateFilterGroupRequest request = new CreateFilterGroupRequest();
            request.announcementSubscriptionId = announcementSubscriptionId;
            request.createFilterGroupDetails = createFilterGroupDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new CreateFilterGroupRequest(announcementSubscriptionId, createFilterGroupDetails,
            // opcRetryToken, opcRequestId, ifMatch);
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
                .createFilterGroupDetails(createFilterGroupDetails)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",createFilterGroupDetails=")
                .append(String.valueOf(this.createFilterGroupDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
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
        if (!(o instanceof CreateFilterGroupRequest)) {
            return false;
        }

        CreateFilterGroupRequest other = (CreateFilterGroupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.announcementSubscriptionId, other.announcementSubscriptionId)
                && java.util.Objects.equals(
                        this.createFilterGroupDetails, other.createFilterGroupDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
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
                        + (this.createFilterGroupDetails == null
                                ? 43
                                : this.createFilterGroupDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
