/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/UpdateNamespaceMetadataExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateNamespaceMetadataRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class UpdateNamespaceMetadataRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.objectstorage.model.UpdateNamespaceMetadataDetails> {

    /**
     * The Object Storage namespace used for the request.
     */
    private String namespaceName;

    /**
     * Request object for update NamespaceMetadata.
     */
    private com.oracle.bmc.objectstorage.model.UpdateNamespaceMetadataDetails
            updateNamespaceMetadataDetails;

    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.objectstorage.model.UpdateNamespaceMetadataDetails getBody$() {
        return updateNamespaceMetadataDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateNamespaceMetadataRequest,
                    com.oracle.bmc.objectstorage.model.UpdateNamespaceMetadataDetails> {
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
        public Builder copy(UpdateNamespaceMetadataRequest o) {
            namespaceName(o.getNamespaceName());
            updateNamespaceMetadataDetails(o.getUpdateNamespaceMetadataDetails());
            opcClientRequestId(o.getOpcClientRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateNamespaceMetadataRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateNamespaceMetadataRequest
         */
        public UpdateNamespaceMetadataRequest build() {
            UpdateNamespaceMetadataRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.objectstorage.model.UpdateNamespaceMetadataDetails body) {
            updateNamespaceMetadataDetails(body);
            return this;
        }
    }
}
