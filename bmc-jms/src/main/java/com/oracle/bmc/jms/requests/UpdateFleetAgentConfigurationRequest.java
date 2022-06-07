/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.requests;

import com.oracle.bmc.jms.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/UpdateFleetAgentConfigurationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateFleetAgentConfigurationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class UpdateFleetAgentConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.jms.model.UpdateFleetAgentConfigurationDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Fleet.
     */
    private String fleetId;

    public String getFleetId() {
        return fleetId;
    }
    /**
     * The new details for the Fleet Agent Configuration.
     */
    private com.oracle.bmc.jms.model.UpdateFleetAgentConfigurationDetails
            updateFleetAgentConfigurationDetails;

    public com.oracle.bmc.jms.model.UpdateFleetAgentConfigurationDetails
            getUpdateFleetAgentConfigurationDetails() {
        return updateFleetAgentConfigurationDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * ETag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the ETag you
     * provide matches the resource's current ETag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.jms.model.UpdateFleetAgentConfigurationDetails getBody$() {
        return updateFleetAgentConfigurationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateFleetAgentConfigurationRequest,
                    com.oracle.bmc.jms.model.UpdateFleetAgentConfigurationDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String fleetId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Fleet.
         * @return this builder instance
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            return this;
        }

        private com.oracle.bmc.jms.model.UpdateFleetAgentConfigurationDetails
                updateFleetAgentConfigurationDetails = null;

        /**
         * The new details for the Fleet Agent Configuration.
         * @return this builder instance
         */
        public Builder updateFleetAgentConfigurationDetails(
                com.oracle.bmc.jms.model.UpdateFleetAgentConfigurationDetails
                        updateFleetAgentConfigurationDetails) {
            this.updateFleetAgentConfigurationDetails = updateFleetAgentConfigurationDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * ETag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the ETag you
         * provide matches the resource's current ETag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(UpdateFleetAgentConfigurationRequest o) {
            fleetId(o.getFleetId());
            updateFleetAgentConfigurationDetails(o.getUpdateFleetAgentConfigurationDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateFleetAgentConfigurationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateFleetAgentConfigurationRequest
         */
        public UpdateFleetAgentConfigurationRequest build() {
            UpdateFleetAgentConfigurationRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.jms.model.UpdateFleetAgentConfigurationDetails body) {
            updateFleetAgentConfigurationDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateFleetAgentConfigurationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateFleetAgentConfigurationRequest
         */
        public UpdateFleetAgentConfigurationRequest buildWithoutInvocationCallback() {
            UpdateFleetAgentConfigurationRequest request =
                    new UpdateFleetAgentConfigurationRequest();
            request.fleetId = fleetId;
            request.updateFleetAgentConfigurationDetails = updateFleetAgentConfigurationDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateFleetAgentConfigurationRequest(fleetId, updateFleetAgentConfigurationDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .fleetId(fleetId)
                .updateFleetAgentConfigurationDetails(updateFleetAgentConfigurationDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",fleetId=").append(String.valueOf(this.fleetId));
        sb.append(",updateFleetAgentConfigurationDetails=")
                .append(String.valueOf(this.updateFleetAgentConfigurationDetails));
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
        if (!(o instanceof UpdateFleetAgentConfigurationRequest)) {
            return false;
        }

        UpdateFleetAgentConfigurationRequest other = (UpdateFleetAgentConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(
                        this.updateFleetAgentConfigurationDetails,
                        other.updateFleetAgentConfigurationDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateFleetAgentConfigurationDetails == null
                                ? 43
                                : this.updateFleetAgentConfigurationDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
