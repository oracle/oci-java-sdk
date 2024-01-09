/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeregisterAutonomousDatabaseDataSafeExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * DeregisterAutonomousDatabaseDataSafeRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class DeregisterAutonomousDatabaseDataSafeRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.DeregisterAutonomousDatabaseDataSafeDetails> {

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
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** Details for deregistering an Autonomous Database with Data Safe. */
    private com.oracle.bmc.database.model.DeregisterAutonomousDatabaseDataSafeDetails
            deregisterAutonomousDatabaseDataSafeDetails;

    /** Details for deregistering an Autonomous Database with Data Safe. */
    public com.oracle.bmc.database.model.DeregisterAutonomousDatabaseDataSafeDetails
            getDeregisterAutonomousDatabaseDataSafeDetails() {
        return deregisterAutonomousDatabaseDataSafeDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.DeregisterAutonomousDatabaseDataSafeDetails getBody$() {
        return deregisterAutonomousDatabaseDataSafeDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeregisterAutonomousDatabaseDataSafeRequest,
                    com.oracle.bmc.database.model.DeregisterAutonomousDatabaseDataSafeDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The database
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String autonomousDatabaseId = null;

        /**
         * The database
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param autonomousDatabaseId the value to set
         * @return this builder instance
         */
        public Builder autonomousDatabaseId(String autonomousDatabaseId) {
            this.autonomousDatabaseId = autonomousDatabaseId;
            return this;
        }

        /** Unique identifier for the request. */
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

        /** Details for deregistering an Autonomous Database with Data Safe. */
        private com.oracle.bmc.database.model.DeregisterAutonomousDatabaseDataSafeDetails
                deregisterAutonomousDatabaseDataSafeDetails = null;

        /**
         * Details for deregistering an Autonomous Database with Data Safe.
         *
         * @param deregisterAutonomousDatabaseDataSafeDetails the value to set
         * @return this builder instance
         */
        public Builder deregisterAutonomousDatabaseDataSafeDetails(
                com.oracle.bmc.database.model.DeregisterAutonomousDatabaseDataSafeDetails
                        deregisterAutonomousDatabaseDataSafeDetails) {
            this.deregisterAutonomousDatabaseDataSafeDetails =
                    deregisterAutonomousDatabaseDataSafeDetails;
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
        public Builder copy(DeregisterAutonomousDatabaseDataSafeRequest o) {
            autonomousDatabaseId(o.getAutonomousDatabaseId());
            opcRequestId(o.getOpcRequestId());
            deregisterAutonomousDatabaseDataSafeDetails(
                    o.getDeregisterAutonomousDatabaseDataSafeDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeregisterAutonomousDatabaseDataSafeRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeregisterAutonomousDatabaseDataSafeRequest
         */
        public DeregisterAutonomousDatabaseDataSafeRequest build() {
            DeregisterAutonomousDatabaseDataSafeRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.DeregisterAutonomousDatabaseDataSafeDetails body) {
            deregisterAutonomousDatabaseDataSafeDetails(body);
            return this;
        }

        /**
         * Build the instance of DeregisterAutonomousDatabaseDataSafeRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeregisterAutonomousDatabaseDataSafeRequest
         */
        public DeregisterAutonomousDatabaseDataSafeRequest buildWithoutInvocationCallback() {
            DeregisterAutonomousDatabaseDataSafeRequest request =
                    new DeregisterAutonomousDatabaseDataSafeRequest();
            request.autonomousDatabaseId = autonomousDatabaseId;
            request.opcRequestId = opcRequestId;
            request.deregisterAutonomousDatabaseDataSafeDetails =
                    deregisterAutonomousDatabaseDataSafeDetails;
            return request;
            // new DeregisterAutonomousDatabaseDataSafeRequest(autonomousDatabaseId, opcRequestId,
            // deregisterAutonomousDatabaseDataSafeDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .autonomousDatabaseId(autonomousDatabaseId)
                .opcRequestId(opcRequestId)
                .deregisterAutonomousDatabaseDataSafeDetails(
                        deregisterAutonomousDatabaseDataSafeDetails);
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
        sb.append(",autonomousDatabaseId=").append(String.valueOf(this.autonomousDatabaseId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",deregisterAutonomousDatabaseDataSafeDetails=")
                .append(String.valueOf(this.deregisterAutonomousDatabaseDataSafeDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeregisterAutonomousDatabaseDataSafeRequest)) {
            return false;
        }

        DeregisterAutonomousDatabaseDataSafeRequest other =
                (DeregisterAutonomousDatabaseDataSafeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.autonomousDatabaseId, other.autonomousDatabaseId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.deregisterAutonomousDatabaseDataSafeDetails,
                        other.deregisterAutonomousDatabaseDataSafeDetails);
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
                        + (this.deregisterAutonomousDatabaseDataSafeDetails == null
                                ? 43
                                : this.deregisterAutonomousDatabaseDataSafeDetails.hashCode());
        return result;
    }
}
