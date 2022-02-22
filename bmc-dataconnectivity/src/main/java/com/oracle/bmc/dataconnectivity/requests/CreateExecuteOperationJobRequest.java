/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.requests;

import com.oracle.bmc.dataconnectivity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataconnectivity/CreateExecuteOperationJobExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateExecuteOperationJobRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateExecuteOperationJobRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataconnectivity.model.CreateExecuteOperationJobDetails> {

    /**
     * The registry Ocid.
     */
    private String registryId;

    /**
     * The connection key.
     */
    private String connectionKey;

    /**
     * The schema resource name used for retrieving schemas.
     */
    private String schemaResourceName;

    /**
     * Request body parameter for execute operation job input.
     */
    private com.oracle.bmc.dataconnectivity.model.CreateExecuteOperationJobDetails
            createExecuteOperationJobDetails;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Endpoint Id used for getDataAssetFullDetails.
     */
    private String endpointId;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again.
     *
     */
    private String opcRetryToken;

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
    }
}
