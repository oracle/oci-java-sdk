/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ImplementOptimizerStatisticsAdvisorRecommendationsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ImplementOptimizerStatisticsAdvisorRecommendationsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ImplementOptimizerStatisticsAdvisorRecommendationsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model
                        .ImplementOptimizerStatisticsAdvisorRecommendationsDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /**
     * The name of the Optimizer Statistics Advisor execution.
     */
    private String executionName;

    /**
     * The name of the Optimizer Statistics Advisor execution.
     */
    public String getExecutionName() {
        return executionName;
    }
    /**
     * The Optimizer Statistics Advisor recommendations implementation request.
     */
    private com.oracle.bmc.databasemanagement.model
                    .ImplementOptimizerStatisticsAdvisorRecommendationsDetails
            implementOptimizerStatisticsAdvisorRecommendationsDetails;

    /**
     * The Optimizer Statistics Advisor recommendations implementation request.
     */
    public com.oracle.bmc.databasemanagement.model
                    .ImplementOptimizerStatisticsAdvisorRecommendationsDetails
            getImplementOptimizerStatisticsAdvisorRecommendationsDetails() {
        return implementOptimizerStatisticsAdvisorRecommendationsDetails;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
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
    public com.oracle.bmc.databasemanagement.model
                    .ImplementOptimizerStatisticsAdvisorRecommendationsDetails
            getBody$() {
        return implementOptimizerStatisticsAdvisorRecommendationsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ImplementOptimizerStatisticsAdvisorRecommendationsRequest,
                    com.oracle.bmc.databasemanagement.model
                            .ImplementOptimizerStatisticsAdvisorRecommendationsDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
         */
        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * @param managedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /**
         * The name of the Optimizer Statistics Advisor execution.
         */
        private String executionName = null;

        /**
         * The name of the Optimizer Statistics Advisor execution.
         * @param executionName the value to set
         * @return this builder instance
         */
        public Builder executionName(String executionName) {
            this.executionName = executionName;
            return this;
        }

        /**
         * The Optimizer Statistics Advisor recommendations implementation request.
         */
        private com.oracle.bmc.databasemanagement.model
                        .ImplementOptimizerStatisticsAdvisorRecommendationsDetails
                implementOptimizerStatisticsAdvisorRecommendationsDetails = null;

        /**
         * The Optimizer Statistics Advisor recommendations implementation request.
         * @param implementOptimizerStatisticsAdvisorRecommendationsDetails the value to set
         * @return this builder instance
         */
        public Builder implementOptimizerStatisticsAdvisorRecommendationsDetails(
                com.oracle.bmc.databasemanagement.model
                                .ImplementOptimizerStatisticsAdvisorRecommendationsDetails
                        implementOptimizerStatisticsAdvisorRecommendationsDetails) {
            this.implementOptimizerStatisticsAdvisorRecommendationsDetails =
                    implementOptimizerStatisticsAdvisorRecommendationsDetails;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(ImplementOptimizerStatisticsAdvisorRecommendationsRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            executionName(o.getExecutionName());
            implementOptimizerStatisticsAdvisorRecommendationsDetails(
                    o.getImplementOptimizerStatisticsAdvisorRecommendationsDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ImplementOptimizerStatisticsAdvisorRecommendationsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ImplementOptimizerStatisticsAdvisorRecommendationsRequest
         */
        public ImplementOptimizerStatisticsAdvisorRecommendationsRequest build() {
            ImplementOptimizerStatisticsAdvisorRecommendationsRequest request =
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
                com.oracle.bmc.databasemanagement.model
                                .ImplementOptimizerStatisticsAdvisorRecommendationsDetails
                        body) {
            implementOptimizerStatisticsAdvisorRecommendationsDetails(body);
            return this;
        }

        /**
         * Build the instance of ImplementOptimizerStatisticsAdvisorRecommendationsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ImplementOptimizerStatisticsAdvisorRecommendationsRequest
         */
        public ImplementOptimizerStatisticsAdvisorRecommendationsRequest
                buildWithoutInvocationCallback() {
            ImplementOptimizerStatisticsAdvisorRecommendationsRequest request =
                    new ImplementOptimizerStatisticsAdvisorRecommendationsRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.executionName = executionName;
            request.implementOptimizerStatisticsAdvisorRecommendationsDetails =
                    implementOptimizerStatisticsAdvisorRecommendationsDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new ImplementOptimizerStatisticsAdvisorRecommendationsRequest(managedDatabaseId, executionName, implementOptimizerStatisticsAdvisorRecommendationsDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .executionName(executionName)
                .implementOptimizerStatisticsAdvisorRecommendationsDetails(
                        implementOptimizerStatisticsAdvisorRecommendationsDetails)
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
        sb.append(",managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(",executionName=").append(String.valueOf(this.executionName));
        sb.append(",implementOptimizerStatisticsAdvisorRecommendationsDetails=")
                .append(
                        String.valueOf(
                                this.implementOptimizerStatisticsAdvisorRecommendationsDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImplementOptimizerStatisticsAdvisorRecommendationsRequest)) {
            return false;
        }

        ImplementOptimizerStatisticsAdvisorRecommendationsRequest other =
                (ImplementOptimizerStatisticsAdvisorRecommendationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(this.executionName, other.executionName)
                && java.util.Objects.equals(
                        this.implementOptimizerStatisticsAdvisorRecommendationsDetails,
                        other.implementOptimizerStatisticsAdvisorRecommendationsDetails)
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
                        + (this.executionName == null ? 43 : this.executionName.hashCode());
        result =
                (result * PRIME)
                        + (this.implementOptimizerStatisticsAdvisorRecommendationsDetails == null
                                ? 43
                                : this.implementOptimizerStatisticsAdvisorRecommendationsDetails
                                        .hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
