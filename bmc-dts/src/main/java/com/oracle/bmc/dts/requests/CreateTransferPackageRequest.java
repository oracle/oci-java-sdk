/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.requests;

import com.oracle.bmc.dts.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/CreateTransferPackageExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateTransferPackageRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class CreateTransferPackageRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dts.model.CreateTransferPackageDetails> {

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
     * Creates a New Transfer Package
     */
    private com.oracle.bmc.dts.model.CreateTransferPackageDetails createTransferPackageDetails;

    /**
     * Creates a New Transfer Package
     */
    public com.oracle.bmc.dts.model.CreateTransferPackageDetails getCreateTransferPackageDetails() {
        return createTransferPackageDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dts.model.CreateTransferPackageDetails getBody$() {
        return createTransferPackageDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateTransferPackageRequest,
                    com.oracle.bmc.dts.model.CreateTransferPackageDetails> {
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
         * Creates a New Transfer Package
         */
        private com.oracle.bmc.dts.model.CreateTransferPackageDetails createTransferPackageDetails =
                null;

        /**
         * Creates a New Transfer Package
         * @param createTransferPackageDetails the value to set
         * @return this builder instance
         */
        public Builder createTransferPackageDetails(
                com.oracle.bmc.dts.model.CreateTransferPackageDetails
                        createTransferPackageDetails) {
            this.createTransferPackageDetails = createTransferPackageDetails;
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
        public Builder copy(CreateTransferPackageRequest o) {
            id(o.getId());
            opcRetryToken(o.getOpcRetryToken());
            createTransferPackageDetails(o.getCreateTransferPackageDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateTransferPackageRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateTransferPackageRequest
         */
        public CreateTransferPackageRequest build() {
            CreateTransferPackageRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dts.model.CreateTransferPackageDetails body) {
            createTransferPackageDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateTransferPackageRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateTransferPackageRequest
         */
        public CreateTransferPackageRequest buildWithoutInvocationCallback() {
            CreateTransferPackageRequest request = new CreateTransferPackageRequest();
            request.id = id;
            request.opcRetryToken = opcRetryToken;
            request.createTransferPackageDetails = createTransferPackageDetails;
            return request;
            // new CreateTransferPackageRequest(id, opcRetryToken, createTransferPackageDetails);
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
                .createTransferPackageDetails(createTransferPackageDetails);
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
        sb.append(",createTransferPackageDetails=")
                .append(String.valueOf(this.createTransferPackageDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTransferPackageRequest)) {
            return false;
        }

        CreateTransferPackageRequest other = (CreateTransferPackageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(
                        this.createTransferPackageDetails, other.createTransferPackageDetails);
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
                        + (this.createTransferPackageDetails == null
                                ? 43
                                : this.createTransferPackageDetails.hashCode());
        return result;
    }
}
