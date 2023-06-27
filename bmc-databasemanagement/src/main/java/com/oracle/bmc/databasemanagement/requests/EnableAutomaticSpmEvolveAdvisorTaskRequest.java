/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableAutomaticSpmEvolveAdvisorTaskExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * EnableAutomaticSpmEvolveAdvisorTaskRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class EnableAutomaticSpmEvolveAdvisorTaskRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model
                        .EnableAutomaticSpmEvolveAdvisorTaskDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /** The details required to enable Automatic SPM Evolve Advisor task. */
    private com.oracle.bmc.databasemanagement.model.EnableAutomaticSpmEvolveAdvisorTaskDetails
            enableAutomaticSpmEvolveAdvisorTaskDetails;

    /** The details required to enable Automatic SPM Evolve Advisor task. */
    public com.oracle.bmc.databasemanagement.model.EnableAutomaticSpmEvolveAdvisorTaskDetails
            getEnableAutomaticSpmEvolveAdvisorTaskDetails() {
        return enableAutomaticSpmEvolveAdvisorTaskDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasemanagement.model.EnableAutomaticSpmEvolveAdvisorTaskDetails
            getBody$() {
        return enableAutomaticSpmEvolveAdvisorTaskDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    EnableAutomaticSpmEvolveAdvisorTaskRequest,
                    com.oracle.bmc.databasemanagement.model
                            .EnableAutomaticSpmEvolveAdvisorTaskDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         */
        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         *
         * @param managedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /** The details required to enable Automatic SPM Evolve Advisor task. */
        private com.oracle.bmc.databasemanagement.model.EnableAutomaticSpmEvolveAdvisorTaskDetails
                enableAutomaticSpmEvolveAdvisorTaskDetails = null;

        /**
         * The details required to enable Automatic SPM Evolve Advisor task.
         *
         * @param enableAutomaticSpmEvolveAdvisorTaskDetails the value to set
         * @return this builder instance
         */
        public Builder enableAutomaticSpmEvolveAdvisorTaskDetails(
                com.oracle.bmc.databasemanagement.model.EnableAutomaticSpmEvolveAdvisorTaskDetails
                        enableAutomaticSpmEvolveAdvisorTaskDetails) {
            this.enableAutomaticSpmEvolveAdvisorTaskDetails =
                    enableAutomaticSpmEvolveAdvisorTaskDetails;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(EnableAutomaticSpmEvolveAdvisorTaskRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            enableAutomaticSpmEvolveAdvisorTaskDetails(
                    o.getEnableAutomaticSpmEvolveAdvisorTaskDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of EnableAutomaticSpmEvolveAdvisorTaskRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of EnableAutomaticSpmEvolveAdvisorTaskRequest
         */
        public EnableAutomaticSpmEvolveAdvisorTaskRequest build() {
            EnableAutomaticSpmEvolveAdvisorTaskRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasemanagement.model.EnableAutomaticSpmEvolveAdvisorTaskDetails
                        body) {
            enableAutomaticSpmEvolveAdvisorTaskDetails(body);
            return this;
        }

        /**
         * Build the instance of EnableAutomaticSpmEvolveAdvisorTaskRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of EnableAutomaticSpmEvolveAdvisorTaskRequest
         */
        public EnableAutomaticSpmEvolveAdvisorTaskRequest buildWithoutInvocationCallback() {
            EnableAutomaticSpmEvolveAdvisorTaskRequest request =
                    new EnableAutomaticSpmEvolveAdvisorTaskRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.enableAutomaticSpmEvolveAdvisorTaskDetails =
                    enableAutomaticSpmEvolveAdvisorTaskDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new EnableAutomaticSpmEvolveAdvisorTaskRequest(managedDatabaseId,
            // enableAutomaticSpmEvolveAdvisorTaskDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .enableAutomaticSpmEvolveAdvisorTaskDetails(
                        enableAutomaticSpmEvolveAdvisorTaskDetails)
                .opcRequestId(opcRequestId);
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
        sb.append(",managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(",enableAutomaticSpmEvolveAdvisorTaskDetails=")
                .append(String.valueOf(this.enableAutomaticSpmEvolveAdvisorTaskDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnableAutomaticSpmEvolveAdvisorTaskRequest)) {
            return false;
        }

        EnableAutomaticSpmEvolveAdvisorTaskRequest other =
                (EnableAutomaticSpmEvolveAdvisorTaskRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(
                        this.enableAutomaticSpmEvolveAdvisorTaskDetails,
                        other.enableAutomaticSpmEvolveAdvisorTaskDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedDatabaseId == null ? 43 : this.managedDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.enableAutomaticSpmEvolveAdvisorTaskDetails == null
                                ? 43
                                : this.enableAutomaticSpmEvolveAdvisorTaskDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
