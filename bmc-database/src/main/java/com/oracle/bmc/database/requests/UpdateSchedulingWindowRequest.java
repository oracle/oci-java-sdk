/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateSchedulingWindowExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateSchedulingWindowRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateSchedulingWindowRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdateSchedulingWindowDetails> {

    /**
     * The Scheduling Policy
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String schedulingPolicyId;

    /**
     * The Scheduling Policy
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getSchedulingPolicyId() {
        return schedulingPolicyId;
    }
    /**
     * The Scheduling Window
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String schedulingWindowId;

    /**
     * The Scheduling Window
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getSchedulingWindowId() {
        return schedulingWindowId;
    }
    /** Request to update the properties of a Scheduling Window. */
    private com.oracle.bmc.database.model.UpdateSchedulingWindowDetails
            updateSchedulingWindowDetails;

    /** Request to update the properties of a Scheduling Window. */
    public com.oracle.bmc.database.model.UpdateSchedulingWindowDetails
            getUpdateSchedulingWindowDetails() {
        return updateSchedulingWindowDetails;
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
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
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
    public com.oracle.bmc.database.model.UpdateSchedulingWindowDetails getBody$() {
        return updateSchedulingWindowDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateSchedulingWindowRequest,
                    com.oracle.bmc.database.model.UpdateSchedulingWindowDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Scheduling Policy
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String schedulingPolicyId = null;

        /**
         * The Scheduling Policy
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param schedulingPolicyId the value to set
         * @return this builder instance
         */
        public Builder schedulingPolicyId(String schedulingPolicyId) {
            this.schedulingPolicyId = schedulingPolicyId;
            return this;
        }

        /**
         * The Scheduling Window
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String schedulingWindowId = null;

        /**
         * The Scheduling Window
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param schedulingWindowId the value to set
         * @return this builder instance
         */
        public Builder schedulingWindowId(String schedulingWindowId) {
            this.schedulingWindowId = schedulingWindowId;
            return this;
        }

        /** Request to update the properties of a Scheduling Window. */
        private com.oracle.bmc.database.model.UpdateSchedulingWindowDetails
                updateSchedulingWindowDetails = null;

        /**
         * Request to update the properties of a Scheduling Window.
         *
         * @param updateSchedulingWindowDetails the value to set
         * @return this builder instance
         */
        public Builder updateSchedulingWindowDetails(
                com.oracle.bmc.database.model.UpdateSchedulingWindowDetails
                        updateSchedulingWindowDetails) {
            this.updateSchedulingWindowDetails = updateSchedulingWindowDetails;
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

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(UpdateSchedulingWindowRequest o) {
            schedulingPolicyId(o.getSchedulingPolicyId());
            schedulingWindowId(o.getSchedulingWindowId());
            updateSchedulingWindowDetails(o.getUpdateSchedulingWindowDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateSchedulingWindowRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateSchedulingWindowRequest
         */
        public UpdateSchedulingWindowRequest build() {
            UpdateSchedulingWindowRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.database.model.UpdateSchedulingWindowDetails body) {
            updateSchedulingWindowDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateSchedulingWindowRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateSchedulingWindowRequest
         */
        public UpdateSchedulingWindowRequest buildWithoutInvocationCallback() {
            UpdateSchedulingWindowRequest request = new UpdateSchedulingWindowRequest();
            request.schedulingPolicyId = schedulingPolicyId;
            request.schedulingWindowId = schedulingWindowId;
            request.updateSchedulingWindowDetails = updateSchedulingWindowDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateSchedulingWindowRequest(schedulingPolicyId, schedulingWindowId,
            // updateSchedulingWindowDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .schedulingPolicyId(schedulingPolicyId)
                .schedulingWindowId(schedulingWindowId)
                .updateSchedulingWindowDetails(updateSchedulingWindowDetails)
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
        sb.append(",schedulingPolicyId=").append(String.valueOf(this.schedulingPolicyId));
        sb.append(",schedulingWindowId=").append(String.valueOf(this.schedulingWindowId));
        sb.append(",updateSchedulingWindowDetails=")
                .append(String.valueOf(this.updateSchedulingWindowDetails));
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
        if (!(o instanceof UpdateSchedulingWindowRequest)) {
            return false;
        }

        UpdateSchedulingWindowRequest other = (UpdateSchedulingWindowRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.schedulingPolicyId, other.schedulingPolicyId)
                && java.util.Objects.equals(this.schedulingWindowId, other.schedulingWindowId)
                && java.util.Objects.equals(
                        this.updateSchedulingWindowDetails, other.updateSchedulingWindowDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.schedulingPolicyId == null
                                ? 43
                                : this.schedulingPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.schedulingWindowId == null
                                ? 43
                                : this.schedulingWindowId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateSchedulingWindowDetails == null
                                ? 43
                                : this.updateSchedulingWindowDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
