/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AddDrgRouteDistributionStatementsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * AddDrgRouteDistributionStatementsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class AddDrgRouteDistributionStatementsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.AddDrgRouteDistributionStatementsDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the route distribution.
     */
    private String drgRouteDistributionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the route distribution.
     */
    public String getDrgRouteDistributionId() {
        return drgRouteDistributionId;
    }
    /**
     * Request with one or more route distribution statements to be inserted into the route
     * distribution.
     */
    private com.oracle.bmc.core.model.AddDrgRouteDistributionStatementsDetails
            addDrgRouteDistributionStatementsDetails;

    /**
     * Request with one or more route distribution statements to be inserted into the route
     * distribution.
     */
    public com.oracle.bmc.core.model.AddDrgRouteDistributionStatementsDetails
            getAddDrgRouteDistributionStatementsDetails() {
        return addDrgRouteDistributionStatementsDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.AddDrgRouteDistributionStatementsDetails getBody$() {
        return addDrgRouteDistributionStatementsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AddDrgRouteDistributionStatementsRequest,
                    com.oracle.bmc.core.model.AddDrgRouteDistributionStatementsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the route distribution.
         */
        private String drgRouteDistributionId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the route distribution.
         *
         * @param drgRouteDistributionId the value to set
         * @return this builder instance
         */
        public Builder drgRouteDistributionId(String drgRouteDistributionId) {
            this.drgRouteDistributionId = drgRouteDistributionId;
            return this;
        }

        /**
         * Request with one or more route distribution statements to be inserted into the route
         * distribution.
         */
        private com.oracle.bmc.core.model.AddDrgRouteDistributionStatementsDetails
                addDrgRouteDistributionStatementsDetails = null;

        /**
         * Request with one or more route distribution statements to be inserted into the route
         * distribution.
         *
         * @param addDrgRouteDistributionStatementsDetails the value to set
         * @return this builder instance
         */
        public Builder addDrgRouteDistributionStatementsDetails(
                com.oracle.bmc.core.model.AddDrgRouteDistributionStatementsDetails
                        addDrgRouteDistributionStatementsDetails) {
            this.addDrgRouteDistributionStatementsDetails =
                    addDrgRouteDistributionStatementsDetails;
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
        public Builder copy(AddDrgRouteDistributionStatementsRequest o) {
            drgRouteDistributionId(o.getDrgRouteDistributionId());
            addDrgRouteDistributionStatementsDetails(
                    o.getAddDrgRouteDistributionStatementsDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AddDrgRouteDistributionStatementsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of AddDrgRouteDistributionStatementsRequest
         */
        public AddDrgRouteDistributionStatementsRequest build() {
            AddDrgRouteDistributionStatementsRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.core.model.AddDrgRouteDistributionStatementsDetails body) {
            addDrgRouteDistributionStatementsDetails(body);
            return this;
        }

        /**
         * Build the instance of AddDrgRouteDistributionStatementsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AddDrgRouteDistributionStatementsRequest
         */
        public AddDrgRouteDistributionStatementsRequest buildWithoutInvocationCallback() {
            AddDrgRouteDistributionStatementsRequest request =
                    new AddDrgRouteDistributionStatementsRequest();
            request.drgRouteDistributionId = drgRouteDistributionId;
            request.addDrgRouteDistributionStatementsDetails =
                    addDrgRouteDistributionStatementsDetails;
            return request;
            // new AddDrgRouteDistributionStatementsRequest(drgRouteDistributionId,
            // addDrgRouteDistributionStatementsDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .drgRouteDistributionId(drgRouteDistributionId)
                .addDrgRouteDistributionStatementsDetails(addDrgRouteDistributionStatementsDetails);
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
        sb.append(",drgRouteDistributionId=").append(String.valueOf(this.drgRouteDistributionId));
        sb.append(",addDrgRouteDistributionStatementsDetails=")
                .append(String.valueOf(this.addDrgRouteDistributionStatementsDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddDrgRouteDistributionStatementsRequest)) {
            return false;
        }

        AddDrgRouteDistributionStatementsRequest other =
                (AddDrgRouteDistributionStatementsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.drgRouteDistributionId, other.drgRouteDistributionId)
                && java.util.Objects.equals(
                        this.addDrgRouteDistributionStatementsDetails,
                        other.addDrgRouteDistributionStatementsDetails);
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
                        + (this.addDrgRouteDistributionStatementsDetails == null
                                ? 43
                                : this.addDrgRouteDistributionStatementsDetails.hashCode());
        return result;
    }
}
