/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateAutonomousContainerDatabaseExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateAutonomousContainerDatabaseRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateAutonomousContainerDatabaseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.CreateAutonomousContainerDatabaseDetails> {

    /**
     * Request to create an Autonomous Container Database in a specified Autonomous Exadata
     * Infrastructure or in Autonomous VM Cluster.
     */
    private com.oracle.bmc.database.model.CreateAutonomousContainerDatabaseDetails
            createAutonomousContainerDatabaseDetails;

    /**
     * Request to create an Autonomous Container Database in a specified Autonomous Exadata
     * Infrastructure or in Autonomous VM Cluster.
     */
    public com.oracle.bmc.database.model.CreateAutonomousContainerDatabaseDetails
            getCreateAutonomousContainerDatabaseDetails() {
        return createAutonomousContainerDatabaseDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.CreateAutonomousContainerDatabaseDetails getBody$() {
        return createAutonomousContainerDatabaseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateAutonomousContainerDatabaseRequest,
                    com.oracle.bmc.database.model.CreateAutonomousContainerDatabaseDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Request to create an Autonomous Container Database in a specified Autonomous Exadata
         * Infrastructure or in Autonomous VM Cluster.
         */
        private com.oracle.bmc.database.model.CreateAutonomousContainerDatabaseDetails
                createAutonomousContainerDatabaseDetails = null;

        /**
         * Request to create an Autonomous Container Database in a specified Autonomous Exadata
         * Infrastructure or in Autonomous VM Cluster.
         *
         * @param createAutonomousContainerDatabaseDetails the value to set
         * @return this builder instance
         */
        public Builder createAutonomousContainerDatabaseDetails(
                com.oracle.bmc.database.model.CreateAutonomousContainerDatabaseDetails
                        createAutonomousContainerDatabaseDetails) {
            this.createAutonomousContainerDatabaseDetails =
                    createAutonomousContainerDatabaseDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
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
        public Builder copy(CreateAutonomousContainerDatabaseRequest o) {
            createAutonomousContainerDatabaseDetails(
                    o.getCreateAutonomousContainerDatabaseDetails());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateAutonomousContainerDatabaseRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateAutonomousContainerDatabaseRequest
         */
        public CreateAutonomousContainerDatabaseRequest build() {
            CreateAutonomousContainerDatabaseRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.CreateAutonomousContainerDatabaseDetails body) {
            createAutonomousContainerDatabaseDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateAutonomousContainerDatabaseRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateAutonomousContainerDatabaseRequest
         */
        public CreateAutonomousContainerDatabaseRequest buildWithoutInvocationCallback() {
            CreateAutonomousContainerDatabaseRequest request =
                    new CreateAutonomousContainerDatabaseRequest();
            request.createAutonomousContainerDatabaseDetails =
                    createAutonomousContainerDatabaseDetails;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new
            // CreateAutonomousContainerDatabaseRequest(createAutonomousContainerDatabaseDetails,
            // opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createAutonomousContainerDatabaseDetails(createAutonomousContainerDatabaseDetails)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",createAutonomousContainerDatabaseDetails=")
                .append(String.valueOf(this.createAutonomousContainerDatabaseDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutonomousContainerDatabaseRequest)) {
            return false;
        }

        CreateAutonomousContainerDatabaseRequest other =
                (CreateAutonomousContainerDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createAutonomousContainerDatabaseDetails,
                        other.createAutonomousContainerDatabaseDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createAutonomousContainerDatabaseDetails == null
                                ? 43
                                : this.createAutonomousContainerDatabaseDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
