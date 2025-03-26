/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateExternalMySqlDatabaseConnectorExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateExternalMySqlDatabaseConnectorRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class CreateExternalMySqlDatabaseConnectorRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model
                        .CreateExternalMySqlDatabaseConnectorDetails> {

    /**
     * The details required to create an external MySQL database connector resource.
     */
    private com.oracle.bmc.databasemanagement.model.CreateExternalMySqlDatabaseConnectorDetails
            createExternalMySqlDatabaseConnectorDetails;

    /**
     * The details required to create an external MySQL database connector resource.
     */
    public com.oracle.bmc.databasemanagement.model.CreateExternalMySqlDatabaseConnectorDetails
            getCreateExternalMySqlDatabaseConnectorDetails() {
        return createExternalMySqlDatabaseConnectorDetails;
    }
    /**
     * Parameter indicating whether database connection needs to be tested.
     */
    private Boolean isTestConnectionParam;

    /**
     * Parameter indicating whether database connection needs to be tested.
     */
    public Boolean getIsTestConnectionParam() {
        return isTestConnectionParam;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
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
    public com.oracle.bmc.databasemanagement.model.CreateExternalMySqlDatabaseConnectorDetails
            getBody$() {
        return createExternalMySqlDatabaseConnectorDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateExternalMySqlDatabaseConnectorRequest,
                    com.oracle.bmc.databasemanagement.model
                            .CreateExternalMySqlDatabaseConnectorDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The details required to create an external MySQL database connector resource.
         */
        private com.oracle.bmc.databasemanagement.model.CreateExternalMySqlDatabaseConnectorDetails
                createExternalMySqlDatabaseConnectorDetails = null;

        /**
         * The details required to create an external MySQL database connector resource.
         * @param createExternalMySqlDatabaseConnectorDetails the value to set
         * @return this builder instance
         */
        public Builder createExternalMySqlDatabaseConnectorDetails(
                com.oracle.bmc.databasemanagement.model.CreateExternalMySqlDatabaseConnectorDetails
                        createExternalMySqlDatabaseConnectorDetails) {
            this.createExternalMySqlDatabaseConnectorDetails =
                    createExternalMySqlDatabaseConnectorDetails;
            return this;
        }

        /**
         * Parameter indicating whether database connection needs to be tested.
         */
        private Boolean isTestConnectionParam = null;

        /**
         * Parameter indicating whether database connection needs to be tested.
         * @param isTestConnectionParam the value to set
         * @return this builder instance
         */
        public Builder isTestConnectionParam(Boolean isTestConnectionParam) {
            this.isTestConnectionParam = isTestConnectionParam;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
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
        public Builder copy(CreateExternalMySqlDatabaseConnectorRequest o) {
            createExternalMySqlDatabaseConnectorDetails(
                    o.getCreateExternalMySqlDatabaseConnectorDetails());
            isTestConnectionParam(o.getIsTestConnectionParam());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateExternalMySqlDatabaseConnectorRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateExternalMySqlDatabaseConnectorRequest
         */
        public CreateExternalMySqlDatabaseConnectorRequest build() {
            CreateExternalMySqlDatabaseConnectorRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasemanagement.model.CreateExternalMySqlDatabaseConnectorDetails
                        body) {
            createExternalMySqlDatabaseConnectorDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateExternalMySqlDatabaseConnectorRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateExternalMySqlDatabaseConnectorRequest
         */
        public CreateExternalMySqlDatabaseConnectorRequest buildWithoutInvocationCallback() {
            CreateExternalMySqlDatabaseConnectorRequest request =
                    new CreateExternalMySqlDatabaseConnectorRequest();
            request.createExternalMySqlDatabaseConnectorDetails =
                    createExternalMySqlDatabaseConnectorDetails;
            request.isTestConnectionParam = isTestConnectionParam;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateExternalMySqlDatabaseConnectorRequest(createExternalMySqlDatabaseConnectorDetails, isTestConnectionParam, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createExternalMySqlDatabaseConnectorDetails(
                        createExternalMySqlDatabaseConnectorDetails)
                .isTestConnectionParam(isTestConnectionParam)
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
        sb.append(",createExternalMySqlDatabaseConnectorDetails=")
                .append(String.valueOf(this.createExternalMySqlDatabaseConnectorDetails));
        sb.append(",isTestConnectionParam=").append(String.valueOf(this.isTestConnectionParam));
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
        if (!(o instanceof CreateExternalMySqlDatabaseConnectorRequest)) {
            return false;
        }

        CreateExternalMySqlDatabaseConnectorRequest other =
                (CreateExternalMySqlDatabaseConnectorRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createExternalMySqlDatabaseConnectorDetails,
                        other.createExternalMySqlDatabaseConnectorDetails)
                && java.util.Objects.equals(this.isTestConnectionParam, other.isTestConnectionParam)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createExternalMySqlDatabaseConnectorDetails == null
                                ? 43
                                : this.createExternalMySqlDatabaseConnectorDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isTestConnectionParam == null
                                ? 43
                                : this.isTestConnectionParam.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
