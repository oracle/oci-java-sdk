/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.requests;

import com.oracle.bmc.disasterrecovery.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/UpdateDrPlanExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateDrPlanRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public class UpdateDrPlanRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.disasterrecovery.model.UpdateDrPlanDetails> {

    /** Details for updating the DR plan. */
    private com.oracle.bmc.disasterrecovery.model.UpdateDrPlanDetails updateDrPlanDetails;

    /** Details for updating the DR plan. */
    public com.oracle.bmc.disasterrecovery.model.UpdateDrPlanDetails getUpdateDrPlanDetails() {
        return updateDrPlanDetails;
    }
    /**
     * The OCID of the DR plan.
     *
     * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
     */
    private String drPlanId;

    /**
     * The OCID of the DR plan.
     *
     * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
     */
    public String getDrPlanId() {
        return drPlanId;
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
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
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
    public com.oracle.bmc.disasterrecovery.model.UpdateDrPlanDetails getBody$() {
        return updateDrPlanDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDrPlanRequest,
                    com.oracle.bmc.disasterrecovery.model.UpdateDrPlanDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for updating the DR plan. */
        private com.oracle.bmc.disasterrecovery.model.UpdateDrPlanDetails updateDrPlanDetails =
                null;

        /**
         * Details for updating the DR plan.
         *
         * @param updateDrPlanDetails the value to set
         * @return this builder instance
         */
        public Builder updateDrPlanDetails(
                com.oracle.bmc.disasterrecovery.model.UpdateDrPlanDetails updateDrPlanDetails) {
            this.updateDrPlanDetails = updateDrPlanDetails;
            return this;
        }

        /**
         * The OCID of the DR plan.
         *
         * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
         */
        private String drPlanId = null;

        /**
         * The OCID of the DR plan.
         *
         * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
         *
         * @param drPlanId the value to set
         * @return this builder instance
         */
        public Builder drPlanId(String drPlanId) {
            this.drPlanId = drPlanId;
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

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(UpdateDrPlanRequest o) {
            updateDrPlanDetails(o.getUpdateDrPlanDetails());
            drPlanId(o.getDrPlanId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDrPlanRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateDrPlanRequest
         */
        public UpdateDrPlanRequest build() {
            UpdateDrPlanRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.disasterrecovery.model.UpdateDrPlanDetails body) {
            updateDrPlanDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDrPlanRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDrPlanRequest
         */
        public UpdateDrPlanRequest buildWithoutInvocationCallback() {
            UpdateDrPlanRequest request = new UpdateDrPlanRequest();
            request.updateDrPlanDetails = updateDrPlanDetails;
            request.drPlanId = drPlanId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateDrPlanRequest(updateDrPlanDetails, drPlanId, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updateDrPlanDetails(updateDrPlanDetails)
                .drPlanId(drPlanId)
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
        sb.append(",updateDrPlanDetails=").append(String.valueOf(this.updateDrPlanDetails));
        sb.append(",drPlanId=").append(String.valueOf(this.drPlanId));
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
        if (!(o instanceof UpdateDrPlanRequest)) {
            return false;
        }

        UpdateDrPlanRequest other = (UpdateDrPlanRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.updateDrPlanDetails, other.updateDrPlanDetails)
                && java.util.Objects.equals(this.drPlanId, other.drPlanId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateDrPlanDetails == null
                                ? 43
                                : this.updateDrPlanDetails.hashCode());
        result = (result * PRIME) + (this.drPlanId == null ? 43 : this.drPlanId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
