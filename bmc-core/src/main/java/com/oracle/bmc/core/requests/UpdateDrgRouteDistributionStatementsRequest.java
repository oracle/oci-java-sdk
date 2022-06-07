/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateDrgRouteDistributionStatementsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateDrgRouteDistributionStatementsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateDrgRouteDistributionStatementsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateDrgRouteDistributionStatementsDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route distribution.
     */
    private String drgRouteDistributionId;

    public String getDrgRouteDistributionId() {
        return drgRouteDistributionId;
    }
    /**
     * Request to update one or more route distribution statements in the route distribution.
     *
     */
    private com.oracle.bmc.core.model.UpdateDrgRouteDistributionStatementsDetails
            updateDrgRouteDistributionStatementsDetails;

    public com.oracle.bmc.core.model.UpdateDrgRouteDistributionStatementsDetails
            getUpdateDrgRouteDistributionStatementsDetails() {
        return updateDrgRouteDistributionStatementsDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.UpdateDrgRouteDistributionStatementsDetails getBody$() {
        return updateDrgRouteDistributionStatementsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDrgRouteDistributionStatementsRequest,
                    com.oracle.bmc.core.model.UpdateDrgRouteDistributionStatementsDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String drgRouteDistributionId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route distribution.
         * @return this builder instance
         */
        public Builder drgRouteDistributionId(String drgRouteDistributionId) {
            this.drgRouteDistributionId = drgRouteDistributionId;
            return this;
        }

        private com.oracle.bmc.core.model.UpdateDrgRouteDistributionStatementsDetails
                updateDrgRouteDistributionStatementsDetails = null;

        /**
         * Request to update one or more route distribution statements in the route distribution.
         *
         * @return this builder instance
         */
        public Builder updateDrgRouteDistributionStatementsDetails(
                com.oracle.bmc.core.model.UpdateDrgRouteDistributionStatementsDetails
                        updateDrgRouteDistributionStatementsDetails) {
            this.updateDrgRouteDistributionStatementsDetails =
                    updateDrgRouteDistributionStatementsDetails;
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
        public Builder copy(UpdateDrgRouteDistributionStatementsRequest o) {
            drgRouteDistributionId(o.getDrgRouteDistributionId());
            updateDrgRouteDistributionStatementsDetails(
                    o.getUpdateDrgRouteDistributionStatementsDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDrgRouteDistributionStatementsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateDrgRouteDistributionStatementsRequest
         */
        public UpdateDrgRouteDistributionStatementsRequest build() {
            UpdateDrgRouteDistributionStatementsRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.core.model.UpdateDrgRouteDistributionStatementsDetails body) {
            updateDrgRouteDistributionStatementsDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDrgRouteDistributionStatementsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDrgRouteDistributionStatementsRequest
         */
        public UpdateDrgRouteDistributionStatementsRequest buildWithoutInvocationCallback() {
            UpdateDrgRouteDistributionStatementsRequest request =
                    new UpdateDrgRouteDistributionStatementsRequest();
            request.drgRouteDistributionId = drgRouteDistributionId;
            request.updateDrgRouteDistributionStatementsDetails =
                    updateDrgRouteDistributionStatementsDetails;
            return request;
            // new UpdateDrgRouteDistributionStatementsRequest(drgRouteDistributionId, updateDrgRouteDistributionStatementsDetails);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .drgRouteDistributionId(drgRouteDistributionId)
                .updateDrgRouteDistributionStatementsDetails(
                        updateDrgRouteDistributionStatementsDetails);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",drgRouteDistributionId=").append(String.valueOf(this.drgRouteDistributionId));
        sb.append(",updateDrgRouteDistributionStatementsDetails=")
                .append(String.valueOf(this.updateDrgRouteDistributionStatementsDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrgRouteDistributionStatementsRequest)) {
            return false;
        }

        UpdateDrgRouteDistributionStatementsRequest other =
                (UpdateDrgRouteDistributionStatementsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.drgRouteDistributionId, other.drgRouteDistributionId)
                && java.util.Objects.equals(
                        this.updateDrgRouteDistributionStatementsDetails,
                        other.updateDrgRouteDistributionStatementsDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.drgRouteDistributionId == null
                                ? 43
                                : this.drgRouteDistributionId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDrgRouteDistributionStatementsDetails == null
                                ? 43
                                : this.updateDrgRouteDistributionStatementsDetails.hashCode());
        return result;
    }
}
