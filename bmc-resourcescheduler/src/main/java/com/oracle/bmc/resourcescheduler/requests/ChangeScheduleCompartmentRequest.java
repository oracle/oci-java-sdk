/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcescheduler.requests;

import com.oracle.bmc.resourcescheduler.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcescheduler/ChangeScheduleCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeScheduleCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
public class ChangeScheduleCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.resourcescheduler.model.ChangeScheduleCompartmentDetails> {

    /**
     * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the schedule.
     */
    private String scheduleId;

    /**
     * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the schedule.
     */
    public String getScheduleId() {
        return scheduleId;
    }
    /** This is the change schedule compartment details that will be updated. */
    private com.oracle.bmc.resourcescheduler.model.ChangeScheduleCompartmentDetails
            changeScheduleCompartmentDetails;

    /** This is the change schedule compartment details that will be updated. */
    public com.oracle.bmc.resourcescheduler.model.ChangeScheduleCompartmentDetails
            getChangeScheduleCompartmentDetails() {
        return changeScheduleCompartmentDetails;
    }
    /**
     * This is used for optimistic concurrency control. In the PUT or DELETE call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous GET or POST
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * This is used for optimistic concurrency control. In the PUT or DELETE call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous GET or POST
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * This is a unique Oracle-assigned identifier for the request. If you need to contact Oracle
     * about a particular request, please provide the request ID. The only valid characters for
     * request IDs are letters, numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * This is a unique Oracle-assigned identifier for the request. If you need to contact Oracle
     * about a particular request, please provide the request ID. The only valid characters for
     * request IDs are letters, numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * This is a token that uniquely identifies a request so it can be retried in case of a timeout
     * or server error without risk of running that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and removed from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * This is a token that uniquely identifies a request so it can be retried in case of a timeout
     * or server error without risk of running that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and removed from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.resourcescheduler.model.ChangeScheduleCompartmentDetails getBody$() {
        return changeScheduleCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeScheduleCompartmentRequest,
                    com.oracle.bmc.resourcescheduler.model.ChangeScheduleCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the schedule.
         */
        private String scheduleId = null;

        /**
         * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the schedule.
         *
         * @param scheduleId the value to set
         * @return this builder instance
         */
        public Builder scheduleId(String scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }

        /** This is the change schedule compartment details that will be updated. */
        private com.oracle.bmc.resourcescheduler.model.ChangeScheduleCompartmentDetails
                changeScheduleCompartmentDetails = null;

        /**
         * This is the change schedule compartment details that will be updated.
         *
         * @param changeScheduleCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeScheduleCompartmentDetails(
                com.oracle.bmc.resourcescheduler.model.ChangeScheduleCompartmentDetails
                        changeScheduleCompartmentDetails) {
            this.changeScheduleCompartmentDetails = changeScheduleCompartmentDetails;
            return this;
        }

        /**
         * This is used for optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a previous GET
         * or POST response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * This is used for optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a previous GET
         * or POST response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
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
         * Oracle about a particular request, please provide the request ID. The only valid
         * characters for request IDs are letters, numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * This is a unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID. The only valid
         * characters for request IDs are letters, numbers, underscore, and dash.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * This is a token that uniquely identifies a request so it can be retried in case of a
         * timeout or server error without risk of running that same action again. Retry tokens
         * expire after 24 hours, but can be invalidated before then due to conflicting operations.
         * For example, if a resource has been deleted and removed from the system, then a retry of
         * the original creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * This is a token that uniquely identifies a request so it can be retried in case of a
         * timeout or server error without risk of running that same action again. Retry tokens
         * expire after 24 hours, but can be invalidated before then due to conflicting operations.
         * For example, if a resource has been deleted and removed from the system, then a retry of
         * the original creation request might be rejected.
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
        public Builder copy(ChangeScheduleCompartmentRequest o) {
            scheduleId(o.getScheduleId());
            changeScheduleCompartmentDetails(o.getChangeScheduleCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeScheduleCompartmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeScheduleCompartmentRequest
         */
        public ChangeScheduleCompartmentRequest build() {
            ChangeScheduleCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.resourcescheduler.model.ChangeScheduleCompartmentDetails body) {
            changeScheduleCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeScheduleCompartmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeScheduleCompartmentRequest
         */
        public ChangeScheduleCompartmentRequest buildWithoutInvocationCallback() {
            ChangeScheduleCompartmentRequest request = new ChangeScheduleCompartmentRequest();
            request.scheduleId = scheduleId;
            request.changeScheduleCompartmentDetails = changeScheduleCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeScheduleCompartmentRequest(scheduleId, changeScheduleCompartmentDetails,
            // ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .scheduleId(scheduleId)
                .changeScheduleCompartmentDetails(changeScheduleCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",scheduleId=").append(String.valueOf(this.scheduleId));
        sb.append(",changeScheduleCompartmentDetails=")
                .append(String.valueOf(this.changeScheduleCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeScheduleCompartmentRequest)) {
            return false;
        }

        ChangeScheduleCompartmentRequest other = (ChangeScheduleCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.scheduleId, other.scheduleId)
                && java.util.Objects.equals(
                        this.changeScheduleCompartmentDetails,
                        other.changeScheduleCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.scheduleId == null ? 43 : this.scheduleId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeScheduleCompartmentDetails == null
                                ? 43
                                : this.changeScheduleCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
