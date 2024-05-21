/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RegisterAutonomousDatabaseDataSafeExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RegisterAutonomousDatabaseDataSafeRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class RegisterAutonomousDatabaseDataSafeRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.RegisterAutonomousDatabaseDataSafeDetails> {

    /**
     * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousDatabaseId;

    /**
     * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getAutonomousDatabaseId() {
        return autonomousDatabaseId;
    }
    /**
     * Unique identifier for the request.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Request to register an Autonomous Database with Data Safe.
     */
    private com.oracle.bmc.database.model.RegisterAutonomousDatabaseDataSafeDetails
            registerAutonomousDatabaseDataSafeDetails;

    /**
     * Request to register an Autonomous Database with Data Safe.
     */
    public com.oracle.bmc.database.model.RegisterAutonomousDatabaseDataSafeDetails
            getRegisterAutonomousDatabaseDataSafeDetails() {
        return registerAutonomousDatabaseDataSafeDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.RegisterAutonomousDatabaseDataSafeDetails getBody$() {
        return registerAutonomousDatabaseDataSafeDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RegisterAutonomousDatabaseDataSafeRequest,
                    com.oracle.bmc.database.model.RegisterAutonomousDatabaseDataSafeDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String autonomousDatabaseId = null;

        /**
         * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param autonomousDatabaseId the value to set
         * @return this builder instance
         */
        public Builder autonomousDatabaseId(String autonomousDatabaseId) {
            this.autonomousDatabaseId = autonomousDatabaseId;
            return this;
        }

        /**
         * Unique identifier for the request.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Request to register an Autonomous Database with Data Safe.
         */
        private com.oracle.bmc.database.model.RegisterAutonomousDatabaseDataSafeDetails
                registerAutonomousDatabaseDataSafeDetails = null;

        /**
         * Request to register an Autonomous Database with Data Safe.
         * @param registerAutonomousDatabaseDataSafeDetails the value to set
         * @return this builder instance
         */
        public Builder registerAutonomousDatabaseDataSafeDetails(
                com.oracle.bmc.database.model.RegisterAutonomousDatabaseDataSafeDetails
                        registerAutonomousDatabaseDataSafeDetails) {
            this.registerAutonomousDatabaseDataSafeDetails =
                    registerAutonomousDatabaseDataSafeDetails;
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
        public Builder copy(RegisterAutonomousDatabaseDataSafeRequest o) {
            autonomousDatabaseId(o.getAutonomousDatabaseId());
            opcRequestId(o.getOpcRequestId());
            registerAutonomousDatabaseDataSafeDetails(
                    o.getRegisterAutonomousDatabaseDataSafeDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RegisterAutonomousDatabaseDataSafeRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RegisterAutonomousDatabaseDataSafeRequest
         */
        public RegisterAutonomousDatabaseDataSafeRequest build() {
            RegisterAutonomousDatabaseDataSafeRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.RegisterAutonomousDatabaseDataSafeDetails body) {
            registerAutonomousDatabaseDataSafeDetails(body);
            return this;
        }

        /**
         * Build the instance of RegisterAutonomousDatabaseDataSafeRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RegisterAutonomousDatabaseDataSafeRequest
         */
        public RegisterAutonomousDatabaseDataSafeRequest buildWithoutInvocationCallback() {
            RegisterAutonomousDatabaseDataSafeRequest request =
                    new RegisterAutonomousDatabaseDataSafeRequest();
            request.autonomousDatabaseId = autonomousDatabaseId;
            request.opcRequestId = opcRequestId;
            request.registerAutonomousDatabaseDataSafeDetails =
                    registerAutonomousDatabaseDataSafeDetails;
            return request;
            // new RegisterAutonomousDatabaseDataSafeRequest(autonomousDatabaseId, opcRequestId, registerAutonomousDatabaseDataSafeDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .autonomousDatabaseId(autonomousDatabaseId)
                .opcRequestId(opcRequestId)
                .registerAutonomousDatabaseDataSafeDetails(
                        registerAutonomousDatabaseDataSafeDetails);
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
        sb.append(",autonomousDatabaseId=").append(String.valueOf(this.autonomousDatabaseId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",registerAutonomousDatabaseDataSafeDetails=")
                .append(String.valueOf(this.registerAutonomousDatabaseDataSafeDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegisterAutonomousDatabaseDataSafeRequest)) {
            return false;
        }

        RegisterAutonomousDatabaseDataSafeRequest other =
                (RegisterAutonomousDatabaseDataSafeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.autonomousDatabaseId, other.autonomousDatabaseId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.registerAutonomousDatabaseDataSafeDetails,
                        other.registerAutonomousDatabaseDataSafeDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.autonomousDatabaseId == null
                                ? 43
                                : this.autonomousDatabaseId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.registerAutonomousDatabaseDataSafeDetails == null
                                ? 43
                                : this.registerAutonomousDatabaseDataSafeDetails.hashCode());
        return result;
    }
}
