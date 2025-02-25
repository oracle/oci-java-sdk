/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateAuditTrailExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateAuditTrailRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class UpdateAuditTrailRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.UpdateAuditTrailDetails> {

    /**
     * The OCID of the audit trail.
     */
    private String auditTrailId;

    /**
     * The OCID of the audit trail.
     */
    public String getAuditTrailId() {
        return auditTrailId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.datasafe.model.UpdateAuditTrailDetails updateAuditTrailDetails;

    /**
     * The information to be updated.
     */
    public com.oracle.bmc.datasafe.model.UpdateAuditTrailDetails getUpdateAuditTrailDetails() {
        return updateAuditTrailDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
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
    public com.oracle.bmc.datasafe.model.UpdateAuditTrailDetails getBody$() {
        return updateAuditTrailDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAuditTrailRequest,
                    com.oracle.bmc.datasafe.model.UpdateAuditTrailDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the audit trail.
         */
        private String auditTrailId = null;

        /**
         * The OCID of the audit trail.
         * @param auditTrailId the value to set
         * @return this builder instance
         */
        public Builder auditTrailId(String auditTrailId) {
            this.auditTrailId = auditTrailId;
            return this;
        }

        /**
         * The information to be updated.
         */
        private com.oracle.bmc.datasafe.model.UpdateAuditTrailDetails updateAuditTrailDetails =
                null;

        /**
         * The information to be updated.
         * @param updateAuditTrailDetails the value to set
         * @return this builder instance
         */
        public Builder updateAuditTrailDetails(
                com.oracle.bmc.datasafe.model.UpdateAuditTrailDetails updateAuditTrailDetails) {
            this.updateAuditTrailDetails = updateAuditTrailDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
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
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(UpdateAuditTrailRequest o) {
            auditTrailId(o.getAuditTrailId());
            updateAuditTrailDetails(o.getUpdateAuditTrailDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAuditTrailRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateAuditTrailRequest
         */
        public UpdateAuditTrailRequest build() {
            UpdateAuditTrailRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.UpdateAuditTrailDetails body) {
            updateAuditTrailDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAuditTrailRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAuditTrailRequest
         */
        public UpdateAuditTrailRequest buildWithoutInvocationCallback() {
            UpdateAuditTrailRequest request = new UpdateAuditTrailRequest();
            request.auditTrailId = auditTrailId;
            request.updateAuditTrailDetails = updateAuditTrailDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateAuditTrailRequest(auditTrailId, updateAuditTrailDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .auditTrailId(auditTrailId)
                .updateAuditTrailDetails(updateAuditTrailDetails)
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
        sb.append(",auditTrailId=").append(String.valueOf(this.auditTrailId));
        sb.append(",updateAuditTrailDetails=").append(String.valueOf(this.updateAuditTrailDetails));
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
        if (!(o instanceof UpdateAuditTrailRequest)) {
            return false;
        }

        UpdateAuditTrailRequest other = (UpdateAuditTrailRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.auditTrailId, other.auditTrailId)
                && java.util.Objects.equals(
                        this.updateAuditTrailDetails, other.updateAuditTrailDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.auditTrailId == null ? 43 : this.auditTrailId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateAuditTrailDetails == null
                                ? 43
                                : this.updateAuditTrailDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
