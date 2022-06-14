/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/CreateOperationsInsightsWarehouseUserExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateOperationsInsightsWarehouseUserRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class CreateOperationsInsightsWarehouseUserRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.opsi.model.CreateOperationsInsightsWarehouseUserDetails> {

    /**
     * Parameter using which an Operations Insights Warehouse user resource will be created.
     */
    private com.oracle.bmc.opsi.model.CreateOperationsInsightsWarehouseUserDetails
            createOperationsInsightsWarehouseUserDetails;

    /**
     * Parameter using which an Operations Insights Warehouse user resource will be created.
     */
    public com.oracle.bmc.opsi.model.CreateOperationsInsightsWarehouseUserDetails
            getCreateOperationsInsightsWarehouseUserDetails() {
        return createOperationsInsightsWarehouseUserDetails;
    }
    /**
     * A token that uniquely identifies a request that can be retried in case of a timeout or
     * server error without risk of executing the same action again. Retry tokens expire after 24
     * hours.
     * <p>
     *Note:* Retry tokens can be invalidated before the 24 hour time limit due to conflicting
     * operations, such as a resource being deleted or purged from the system.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request that can be retried in case of a timeout or
     * server error without risk of executing the same action again. Retry tokens expire after 24
     * hours.
     * <p>
     *Note:* Retry tokens can be invalidated before the 24 hour time limit due to conflicting
     * operations, such as a resource being deleted or purged from the system.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    public com.oracle.bmc.opsi.model.CreateOperationsInsightsWarehouseUserDetails getBody$() {
        return createOperationsInsightsWarehouseUserDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateOperationsInsightsWarehouseUserRequest,
                    com.oracle.bmc.opsi.model.CreateOperationsInsightsWarehouseUserDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Parameter using which an Operations Insights Warehouse user resource will be created.
         */
        private com.oracle.bmc.opsi.model.CreateOperationsInsightsWarehouseUserDetails
                createOperationsInsightsWarehouseUserDetails = null;

        /**
         * Parameter using which an Operations Insights Warehouse user resource will be created.
         * @param createOperationsInsightsWarehouseUserDetails the value to set
         * @return this builder instance
         */
        public Builder createOperationsInsightsWarehouseUserDetails(
                com.oracle.bmc.opsi.model.CreateOperationsInsightsWarehouseUserDetails
                        createOperationsInsightsWarehouseUserDetails) {
            this.createOperationsInsightsWarehouseUserDetails =
                    createOperationsInsightsWarehouseUserDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request that can be retried in case of a timeout or
         * server error without risk of executing the same action again. Retry tokens expire after 24
         * hours.
         * <p>
         *Note:* Retry tokens can be invalidated before the 24 hour time limit due to conflicting
         * operations, such as a resource being deleted or purged from the system.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request that can be retried in case of a timeout or
         * server error without risk of executing the same action again. Retry tokens expire after 24
         * hours.
         * <p>
         *Note:* Retry tokens can be invalidated before the 24 hour time limit due to conflicting
         * operations, such as a resource being deleted or purged from the system.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CreateOperationsInsightsWarehouseUserRequest o) {
            createOperationsInsightsWarehouseUserDetails(
                    o.getCreateOperationsInsightsWarehouseUserDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateOperationsInsightsWarehouseUserRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateOperationsInsightsWarehouseUserRequest
         */
        public CreateOperationsInsightsWarehouseUserRequest build() {
            CreateOperationsInsightsWarehouseUserRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.opsi.model.CreateOperationsInsightsWarehouseUserDetails body) {
            createOperationsInsightsWarehouseUserDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateOperationsInsightsWarehouseUserRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateOperationsInsightsWarehouseUserRequest
         */
        public CreateOperationsInsightsWarehouseUserRequest buildWithoutInvocationCallback() {
            CreateOperationsInsightsWarehouseUserRequest request =
                    new CreateOperationsInsightsWarehouseUserRequest();
            request.createOperationsInsightsWarehouseUserDetails =
                    createOperationsInsightsWarehouseUserDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateOperationsInsightsWarehouseUserRequest(createOperationsInsightsWarehouseUserDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createOperationsInsightsWarehouseUserDetails(
                        createOperationsInsightsWarehouseUserDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",createOperationsInsightsWarehouseUserDetails=")
                .append(String.valueOf(this.createOperationsInsightsWarehouseUserDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOperationsInsightsWarehouseUserRequest)) {
            return false;
        }

        CreateOperationsInsightsWarehouseUserRequest other =
                (CreateOperationsInsightsWarehouseUserRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createOperationsInsightsWarehouseUserDetails,
                        other.createOperationsInsightsWarehouseUserDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createOperationsInsightsWarehouseUserDetails == null
                                ? 43
                                : this.createOperationsInsightsWarehouseUserDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
