/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.requests;

import com.oracle.bmc.disasterrecovery.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/UpdateDrPlanExecutionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateDrPlanExecutionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public class UpdateDrPlanExecutionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.disasterrecovery.model.UpdateDrPlanExecutionDetails> {

    /** Details of DR Plan Execution to update. */
    private com.oracle.bmc.disasterrecovery.model.UpdateDrPlanExecutionDetails
            updateDrPlanExecutionDetails;

    /** Details of DR Plan Execution to update. */
    public com.oracle.bmc.disasterrecovery.model.UpdateDrPlanExecutionDetails
            getUpdateDrPlanExecutionDetails() {
        return updateDrPlanExecutionDetails;
    }
    /**
     * The OCID of the DR Plan Execution.
     *
     * <p>Example: {@code ocid1.drplanexecution.oc1.iad.exampleocid}
     */
    private String drPlanExecutionId;

    /**
     * The OCID of the DR Plan Execution.
     *
     * <p>Example: {@code ocid1.drplanexecution.oc1.iad.exampleocid}
     */
    public String getDrPlanExecutionId() {
        return drPlanExecutionId;
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
    public com.oracle.bmc.disasterrecovery.model.UpdateDrPlanExecutionDetails getBody$() {
        return updateDrPlanExecutionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDrPlanExecutionRequest,
                    com.oracle.bmc.disasterrecovery.model.UpdateDrPlanExecutionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details of DR Plan Execution to update. */
        private com.oracle.bmc.disasterrecovery.model.UpdateDrPlanExecutionDetails
                updateDrPlanExecutionDetails = null;

        /**
         * Details of DR Plan Execution to update.
         *
         * @param updateDrPlanExecutionDetails the value to set
         * @return this builder instance
         */
        public Builder updateDrPlanExecutionDetails(
                com.oracle.bmc.disasterrecovery.model.UpdateDrPlanExecutionDetails
                        updateDrPlanExecutionDetails) {
            this.updateDrPlanExecutionDetails = updateDrPlanExecutionDetails;
            return this;
        }

        /**
         * The OCID of the DR Plan Execution.
         *
         * <p>Example: {@code ocid1.drplanexecution.oc1.iad.exampleocid}
         */
        private String drPlanExecutionId = null;

        /**
         * The OCID of the DR Plan Execution.
         *
         * <p>Example: {@code ocid1.drplanexecution.oc1.iad.exampleocid}
         *
         * @param drPlanExecutionId the value to set
         * @return this builder instance
         */
        public Builder drPlanExecutionId(String drPlanExecutionId) {
            this.drPlanExecutionId = drPlanExecutionId;
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
        public Builder copy(UpdateDrPlanExecutionRequest o) {
            updateDrPlanExecutionDetails(o.getUpdateDrPlanExecutionDetails());
            drPlanExecutionId(o.getDrPlanExecutionId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDrPlanExecutionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateDrPlanExecutionRequest
         */
        public UpdateDrPlanExecutionRequest build() {
            UpdateDrPlanExecutionRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.disasterrecovery.model.UpdateDrPlanExecutionDetails body) {
            updateDrPlanExecutionDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDrPlanExecutionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDrPlanExecutionRequest
         */
        public UpdateDrPlanExecutionRequest buildWithoutInvocationCallback() {
            UpdateDrPlanExecutionRequest request = new UpdateDrPlanExecutionRequest();
            request.updateDrPlanExecutionDetails = updateDrPlanExecutionDetails;
            request.drPlanExecutionId = drPlanExecutionId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateDrPlanExecutionRequest(updateDrPlanExecutionDetails, drPlanExecutionId,
            // ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updateDrPlanExecutionDetails(updateDrPlanExecutionDetails)
                .drPlanExecutionId(drPlanExecutionId)
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
        sb.append(",updateDrPlanExecutionDetails=")
                .append(String.valueOf(this.updateDrPlanExecutionDetails));
        sb.append(",drPlanExecutionId=").append(String.valueOf(this.drPlanExecutionId));
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
        if (!(o instanceof UpdateDrPlanExecutionRequest)) {
            return false;
        }

        UpdateDrPlanExecutionRequest other = (UpdateDrPlanExecutionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updateDrPlanExecutionDetails, other.updateDrPlanExecutionDetails)
                && java.util.Objects.equals(this.drPlanExecutionId, other.drPlanExecutionId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateDrPlanExecutionDetails == null
                                ? 43
                                : this.updateDrPlanExecutionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.drPlanExecutionId == null ? 43 : this.drPlanExecutionId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
