/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/UpdateModelDeploymentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateModelDeploymentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class UpdateModelDeploymentRequest
        extends com.oracle.bmc.requests.BmcRequest<UpdateModelDeploymentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the model deployment.
     */
    private String modelDeploymentId;

    /**
     * Details for updating a model deployment. Some of the properties of `modelDeploymentConfigurationDetails` or `CategoryLogDetails` can also be updated with zero down time when
     * the model deployment's lifecycle state is ACTIVE i.e `instanceShapeName` can be updated along with `modelId`, similarly `logId` can be updated along with `logGroupId`. But
     * `instanceShapeName` or `modelId` cannot be updated along with `logId` or `logGroupId`. All of the fields can be updated when the deployment is in the INACTIVE lifecycle state.
     * Changes will take effect the next time the model deployment is activated.
     *
     */
    private UpdateModelDeploymentDetails updateModelDeploymentDetails;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the `if-match` parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource is updated or deleted only if the `etag` you
     * provide matches the resource's current `etag` value.
     *
     */
    private String ifMatch;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public UpdateModelDeploymentDetails getBody$() {
        return updateModelDeploymentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateModelDeploymentRequest, UpdateModelDeploymentDetails> {
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
        public Builder copy(UpdateModelDeploymentRequest o) {
            modelDeploymentId(o.getModelDeploymentId());
            updateModelDeploymentDetails(o.getUpdateModelDeploymentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateModelDeploymentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateModelDeploymentRequest
         */
        public UpdateModelDeploymentRequest build() {
            UpdateModelDeploymentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(UpdateModelDeploymentDetails body) {
            updateModelDeploymentDetails(body);
            return this;
        }
    }
}
