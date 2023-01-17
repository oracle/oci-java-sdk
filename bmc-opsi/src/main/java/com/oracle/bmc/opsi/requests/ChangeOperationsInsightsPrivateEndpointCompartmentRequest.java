/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ChangeOperationsInsightsPrivateEndpointCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeOperationsInsightsPrivateEndpointCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ChangeOperationsInsightsPrivateEndpointCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.opsi.model
                        .ChangeOperationsInsightsPrivateEndpointCompartmentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Operation Insights private endpoint.
     */
    private String operationsInsightsPrivateEndpointId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Operation Insights private endpoint.
     */
    public String getOperationsInsightsPrivateEndpointId() {
        return operationsInsightsPrivateEndpointId;
    }
    /**
     * The details used to change the compartment of a private endpoint
     */
    private com.oracle.bmc.opsi.model.ChangeOperationsInsightsPrivateEndpointCompartmentDetails
            changeOperationsInsightsPrivateEndpointCompartmentDetails;

    /**
     * The details used to change the compartment of a private endpoint
     */
    public com.oracle.bmc.opsi.model.ChangeOperationsInsightsPrivateEndpointCompartmentDetails
            getChangeOperationsInsightsPrivateEndpointCompartmentDetails() {
        return changeOperationsInsightsPrivateEndpointCompartmentDetails;
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.opsi.model.ChangeOperationsInsightsPrivateEndpointCompartmentDetails
            getBody$() {
        return changeOperationsInsightsPrivateEndpointCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeOperationsInsightsPrivateEndpointCompartmentRequest,
                    com.oracle.bmc.opsi.model
                            .ChangeOperationsInsightsPrivateEndpointCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Operation Insights private endpoint.
         */
        private String operationsInsightsPrivateEndpointId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Operation Insights private endpoint.
         * @param operationsInsightsPrivateEndpointId the value to set
         * @return this builder instance
         */
        public Builder operationsInsightsPrivateEndpointId(
                String operationsInsightsPrivateEndpointId) {
            this.operationsInsightsPrivateEndpointId = operationsInsightsPrivateEndpointId;
            return this;
        }

        /**
         * The details used to change the compartment of a private endpoint
         */
        private com.oracle.bmc.opsi.model.ChangeOperationsInsightsPrivateEndpointCompartmentDetails
                changeOperationsInsightsPrivateEndpointCompartmentDetails = null;

        /**
         * The details used to change the compartment of a private endpoint
         * @param changeOperationsInsightsPrivateEndpointCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeOperationsInsightsPrivateEndpointCompartmentDetails(
                com.oracle.bmc.opsi.model.ChangeOperationsInsightsPrivateEndpointCompartmentDetails
                        changeOperationsInsightsPrivateEndpointCompartmentDetails) {
            this.changeOperationsInsightsPrivateEndpointCompartmentDetails =
                    changeOperationsInsightsPrivateEndpointCompartmentDetails;
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
        public Builder copy(ChangeOperationsInsightsPrivateEndpointCompartmentRequest o) {
            operationsInsightsPrivateEndpointId(o.getOperationsInsightsPrivateEndpointId());
            changeOperationsInsightsPrivateEndpointCompartmentDetails(
                    o.getChangeOperationsInsightsPrivateEndpointCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeOperationsInsightsPrivateEndpointCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeOperationsInsightsPrivateEndpointCompartmentRequest
         */
        public ChangeOperationsInsightsPrivateEndpointCompartmentRequest build() {
            ChangeOperationsInsightsPrivateEndpointCompartmentRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.opsi.model.ChangeOperationsInsightsPrivateEndpointCompartmentDetails
                        body) {
            changeOperationsInsightsPrivateEndpointCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeOperationsInsightsPrivateEndpointCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeOperationsInsightsPrivateEndpointCompartmentRequest
         */
        public ChangeOperationsInsightsPrivateEndpointCompartmentRequest
                buildWithoutInvocationCallback() {
            ChangeOperationsInsightsPrivateEndpointCompartmentRequest request =
                    new ChangeOperationsInsightsPrivateEndpointCompartmentRequest();
            request.operationsInsightsPrivateEndpointId = operationsInsightsPrivateEndpointId;
            request.changeOperationsInsightsPrivateEndpointCompartmentDetails =
                    changeOperationsInsightsPrivateEndpointCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeOperationsInsightsPrivateEndpointCompartmentRequest(operationsInsightsPrivateEndpointId, changeOperationsInsightsPrivateEndpointCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .operationsInsightsPrivateEndpointId(operationsInsightsPrivateEndpointId)
                .changeOperationsInsightsPrivateEndpointCompartmentDetails(
                        changeOperationsInsightsPrivateEndpointCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",operationsInsightsPrivateEndpointId=")
                .append(String.valueOf(this.operationsInsightsPrivateEndpointId));
        sb.append(",changeOperationsInsightsPrivateEndpointCompartmentDetails=")
                .append(
                        String.valueOf(
                                this.changeOperationsInsightsPrivateEndpointCompartmentDetails));
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
        if (!(o instanceof ChangeOperationsInsightsPrivateEndpointCompartmentRequest)) {
            return false;
        }

        ChangeOperationsInsightsPrivateEndpointCompartmentRequest other =
                (ChangeOperationsInsightsPrivateEndpointCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.operationsInsightsPrivateEndpointId,
                        other.operationsInsightsPrivateEndpointId)
                && java.util.Objects.equals(
                        this.changeOperationsInsightsPrivateEndpointCompartmentDetails,
                        other.changeOperationsInsightsPrivateEndpointCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.operationsInsightsPrivateEndpointId == null
                                ? 43
                                : this.operationsInsightsPrivateEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeOperationsInsightsPrivateEndpointCompartmentDetails == null
                                ? 43
                                : this.changeOperationsInsightsPrivateEndpointCompartmentDetails
                                        .hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
