/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.requests;

import com.oracle.bmc.dts.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/CreateTransferApplianceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateTransferApplianceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class CreateTransferApplianceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dts.model.CreateTransferApplianceDetails> {

    /**
     * ID of the Transfer Job
     */
    private String id;

    /**
     * ID of the Transfer Job
     */
    public String getId() {
        return id;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Creates a New Transfer Appliance
     */
    private com.oracle.bmc.dts.model.CreateTransferApplianceDetails createTransferApplianceDetails;

    /**
     * Creates a New Transfer Appliance
     */
    public com.oracle.bmc.dts.model.CreateTransferApplianceDetails
            getCreateTransferApplianceDetails() {
        return createTransferApplianceDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dts.model.CreateTransferApplianceDetails getBody$() {
        return createTransferApplianceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateTransferApplianceRequest,
                    com.oracle.bmc.dts.model.CreateTransferApplianceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * ID of the Transfer Job
         */
        private String id = null;

        /**
         * ID of the Transfer Job
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Creates a New Transfer Appliance
         */
        private com.oracle.bmc.dts.model.CreateTransferApplianceDetails
                createTransferApplianceDetails = null;

        /**
         * Creates a New Transfer Appliance
         * @param createTransferApplianceDetails the value to set
         * @return this builder instance
         */
        public Builder createTransferApplianceDetails(
                com.oracle.bmc.dts.model.CreateTransferApplianceDetails
                        createTransferApplianceDetails) {
            this.createTransferApplianceDetails = createTransferApplianceDetails;
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
        public Builder copy(CreateTransferApplianceRequest o) {
            id(o.getId());
            opcRetryToken(o.getOpcRetryToken());
            createTransferApplianceDetails(o.getCreateTransferApplianceDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateTransferApplianceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateTransferApplianceRequest
         */
        public CreateTransferApplianceRequest build() {
            CreateTransferApplianceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dts.model.CreateTransferApplianceDetails body) {
            createTransferApplianceDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateTransferApplianceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateTransferApplianceRequest
         */
        public CreateTransferApplianceRequest buildWithoutInvocationCallback() {
            CreateTransferApplianceRequest request = new CreateTransferApplianceRequest();
            request.id = id;
            request.opcRetryToken = opcRetryToken;
            request.createTransferApplianceDetails = createTransferApplianceDetails;
            return request;
            // new CreateTransferApplianceRequest(id, opcRetryToken, createTransferApplianceDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .id(id)
                .opcRetryToken(opcRetryToken)
                .createTransferApplianceDetails(createTransferApplianceDetails);
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
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",createTransferApplianceDetails=")
                .append(String.valueOf(this.createTransferApplianceDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTransferApplianceRequest)) {
            return false;
        }

        CreateTransferApplianceRequest other = (CreateTransferApplianceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(
                        this.createTransferApplianceDetails, other.createTransferApplianceDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result =
                (result * PRIME)
                        + (this.createTransferApplianceDetails == null
                                ? 43
                                : this.createTransferApplianceDetails.hashCode());
        return result;
    }
}
