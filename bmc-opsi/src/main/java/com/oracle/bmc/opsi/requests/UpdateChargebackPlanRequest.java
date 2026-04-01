/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateChargebackPlanExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateChargebackPlanRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class UpdateChargebackPlanRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.opsi.model.UpdateChargebackPlanDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Ops Insights chargeback plan.
     */
    private String chargebackplanId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Ops Insights chargeback plan.
     */
    public String getChargebackplanId() {
        return chargebackplanId;
    }
    /**
     * The details used to update a chargeback plan.
     */
    private com.oracle.bmc.opsi.model.UpdateChargebackPlanDetails updateChargebackPlanDetails;

    /**
     * The details used to update a chargeback plan.
     */
    public com.oracle.bmc.opsi.model.UpdateChargebackPlanDetails getUpdateChargebackPlanDetails() {
        return updateChargebackPlanDetails;
    }
    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous get, create, or update response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous get, create, or update response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
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
    public com.oracle.bmc.opsi.model.UpdateChargebackPlanDetails getBody$() {
        return updateChargebackPlanDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateChargebackPlanRequest,
                    com.oracle.bmc.opsi.model.UpdateChargebackPlanDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Ops Insights chargeback plan.
         */
        private String chargebackplanId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Ops Insights chargeback plan.
         * @param chargebackplanId the value to set
         * @return this builder instance
         */
        public Builder chargebackplanId(String chargebackplanId) {
            this.chargebackplanId = chargebackplanId;
            return this;
        }

        /**
         * The details used to update a chargeback plan.
         */
        private com.oracle.bmc.opsi.model.UpdateChargebackPlanDetails updateChargebackPlanDetails =
                null;

        /**
         * The details used to update a chargeback plan.
         * @param updateChargebackPlanDetails the value to set
         * @return this builder instance
         */
        public Builder updateChargebackPlanDetails(
                com.oracle.bmc.opsi.model.UpdateChargebackPlanDetails updateChargebackPlanDetails) {
            this.updateChargebackPlanDetails = updateChargebackPlanDetails;
            return this;
        }

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous get, create, or update response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous get, create, or update response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
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
        public Builder copy(UpdateChargebackPlanRequest o) {
            chargebackplanId(o.getChargebackplanId());
            updateChargebackPlanDetails(o.getUpdateChargebackPlanDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateChargebackPlanRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateChargebackPlanRequest
         */
        public UpdateChargebackPlanRequest build() {
            UpdateChargebackPlanRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.opsi.model.UpdateChargebackPlanDetails body) {
            updateChargebackPlanDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateChargebackPlanRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateChargebackPlanRequest
         */
        public UpdateChargebackPlanRequest buildWithoutInvocationCallback() {
            UpdateChargebackPlanRequest request = new UpdateChargebackPlanRequest();
            request.chargebackplanId = chargebackplanId;
            request.updateChargebackPlanDetails = updateChargebackPlanDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateChargebackPlanRequest(chargebackplanId, updateChargebackPlanDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .chargebackplanId(chargebackplanId)
                .updateChargebackPlanDetails(updateChargebackPlanDetails)
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
        sb.append(",chargebackplanId=").append(String.valueOf(this.chargebackplanId));
        sb.append(",updateChargebackPlanDetails=")
                .append(String.valueOf(this.updateChargebackPlanDetails));
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
        if (!(o instanceof UpdateChargebackPlanRequest)) {
            return false;
        }

        UpdateChargebackPlanRequest other = (UpdateChargebackPlanRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.chargebackplanId, other.chargebackplanId)
                && java.util.Objects.equals(
                        this.updateChargebackPlanDetails, other.updateChargebackPlanDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.chargebackplanId == null ? 43 : this.chargebackplanId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateChargebackPlanDetails == null
                                ? 43
                                : this.updateChargebackPlanDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
