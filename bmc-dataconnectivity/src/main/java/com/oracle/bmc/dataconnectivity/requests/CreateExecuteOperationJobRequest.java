/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.requests;

import com.oracle.bmc.dataconnectivity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataconnectivity/CreateExecuteOperationJobExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateExecuteOperationJobRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class CreateExecuteOperationJobRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataconnectivity.model.CreateExecuteOperationJobDetails> {

    /**
     * The registry OCID.
     */
    private String registryId;

    /**
     * The registry OCID.
     */
    public String getRegistryId() {
        return registryId;
    }
    /**
     * The connection key.
     */
    private String connectionKey;

    /**
     * The connection key.
     */
    public String getConnectionKey() {
        return connectionKey;
    }
    /**
     * The schema resource name used for retrieving schemas.
     */
    private String schemaResourceName;

    /**
     * The schema resource name used for retrieving schemas.
     */
    public String getSchemaResourceName() {
        return schemaResourceName;
    }
    /**
     * Request body parameter for execute operation job input.
     */
    private com.oracle.bmc.dataconnectivity.model.CreateExecuteOperationJobDetails
            createExecuteOperationJobDetails;

    /**
     * Request body parameter for execute operation job input.
     */
    public com.oracle.bmc.dataconnectivity.model.CreateExecuteOperationJobDetails
            getCreateExecuteOperationJobDetails() {
        return createExecuteOperationJobDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Endpoint ID used for getDataAssetFullDetails.
     */
    private String endpointId;

    /**
     * Endpoint ID used for getDataAssetFullDetails.
     */
    public String getEndpointId() {
        return endpointId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without the risk of executing that same action again.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without the risk of executing that same action again.
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
    public com.oracle.bmc.dataconnectivity.model.CreateExecuteOperationJobDetails getBody$() {
        return createExecuteOperationJobDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateExecuteOperationJobRequest,
                    com.oracle.bmc.dataconnectivity.model.CreateExecuteOperationJobDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The registry OCID.
         */
        private String registryId = null;

        /**
         * The registry OCID.
         * @param registryId the value to set
         * @return this builder instance
         */
        public Builder registryId(String registryId) {
            this.registryId = registryId;
            return this;
        }

        /**
         * The connection key.
         */
        private String connectionKey = null;

        /**
         * The connection key.
         * @param connectionKey the value to set
         * @return this builder instance
         */
        public Builder connectionKey(String connectionKey) {
            this.connectionKey = connectionKey;
            return this;
        }

        /**
         * The schema resource name used for retrieving schemas.
         */
        private String schemaResourceName = null;

        /**
         * The schema resource name used for retrieving schemas.
         * @param schemaResourceName the value to set
         * @return this builder instance
         */
        public Builder schemaResourceName(String schemaResourceName) {
            this.schemaResourceName = schemaResourceName;
            return this;
        }

        /**
         * Request body parameter for execute operation job input.
         */
        private com.oracle.bmc.dataconnectivity.model.CreateExecuteOperationJobDetails
                createExecuteOperationJobDetails = null;

        /**
         * Request body parameter for execute operation job input.
         * @param createExecuteOperationJobDetails the value to set
         * @return this builder instance
         */
        public Builder createExecuteOperationJobDetails(
                com.oracle.bmc.dataconnectivity.model.CreateExecuteOperationJobDetails
                        createExecuteOperationJobDetails) {
            this.createExecuteOperationJobDetails = createExecuteOperationJobDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Endpoint ID used for getDataAssetFullDetails.
         */
        private String endpointId = null;

        /**
         * Endpoint ID used for getDataAssetFullDetails.
         * @param endpointId the value to set
         * @return this builder instance
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without the risk of executing that same action again.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without the risk of executing that same action again.
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
        public Builder copy(CreateExecuteOperationJobRequest o) {
            registryId(o.getRegistryId());
            connectionKey(o.getConnectionKey());
            schemaResourceName(o.getSchemaResourceName());
            createExecuteOperationJobDetails(o.getCreateExecuteOperationJobDetails());
            opcRequestId(o.getOpcRequestId());
            endpointId(o.getEndpointId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateExecuteOperationJobRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateExecuteOperationJobRequest
         */
        public CreateExecuteOperationJobRequest build() {
            CreateExecuteOperationJobRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.dataconnectivity.model.CreateExecuteOperationJobDetails body) {
            createExecuteOperationJobDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateExecuteOperationJobRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateExecuteOperationJobRequest
         */
        public CreateExecuteOperationJobRequest buildWithoutInvocationCallback() {
            CreateExecuteOperationJobRequest request = new CreateExecuteOperationJobRequest();
            request.registryId = registryId;
            request.connectionKey = connectionKey;
            request.schemaResourceName = schemaResourceName;
            request.createExecuteOperationJobDetails = createExecuteOperationJobDetails;
            request.opcRequestId = opcRequestId;
            request.endpointId = endpointId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateExecuteOperationJobRequest(registryId, connectionKey, schemaResourceName, createExecuteOperationJobDetails, opcRequestId, endpointId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .registryId(registryId)
                .connectionKey(connectionKey)
                .schemaResourceName(schemaResourceName)
                .createExecuteOperationJobDetails(createExecuteOperationJobDetails)
                .opcRequestId(opcRequestId)
                .endpointId(endpointId)
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
        sb.append(",registryId=").append(String.valueOf(this.registryId));
        sb.append(",connectionKey=").append(String.valueOf(this.connectionKey));
        sb.append(",schemaResourceName=").append(String.valueOf(this.schemaResourceName));
        sb.append(",createExecuteOperationJobDetails=")
                .append(String.valueOf(this.createExecuteOperationJobDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",endpointId=").append(String.valueOf(this.endpointId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExecuteOperationJobRequest)) {
            return false;
        }

        CreateExecuteOperationJobRequest other = (CreateExecuteOperationJobRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.registryId, other.registryId)
                && java.util.Objects.equals(this.connectionKey, other.connectionKey)
                && java.util.Objects.equals(this.schemaResourceName, other.schemaResourceName)
                && java.util.Objects.equals(
                        this.createExecuteOperationJobDetails,
                        other.createExecuteOperationJobDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.endpointId, other.endpointId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.registryId == null ? 43 : this.registryId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionKey == null ? 43 : this.connectionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.schemaResourceName == null
                                ? 43
                                : this.schemaResourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.createExecuteOperationJobDetails == null
                                ? 43
                                : this.createExecuteOperationJobDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.endpointId == null ? 43 : this.endpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
