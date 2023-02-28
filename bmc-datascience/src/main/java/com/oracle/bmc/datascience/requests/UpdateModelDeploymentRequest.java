/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/UpdateModelDeploymentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateModelDeploymentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class UpdateModelDeploymentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datascience.model.UpdateModelDeploymentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the model deployment.
     */
    private String modelDeploymentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the model deployment.
     */
    public String getModelDeploymentId() {
        return modelDeploymentId;
    }
    /**
     * Details for updating a model deployment. Some of the properties of {@code
     * modelDeploymentConfigurationDetails} or {@code CategoryLogDetails} can also be updated with
     * zero down time when the model deployment's lifecycle state is ACTIVE or NEEDS_ATTENTION i.e
     * {@code instanceShapeName}, {@code instanceCount} and {@code modelId}, separately {@code
     * loadBalancerShape} or {@code CategoryLogDetails} can also be updated independently. All of
     * the fields can be updated when the deployment is in the INACTIVE lifecycle state. Changes
     * will take effect the next time the model deployment is activated.
     */
    private com.oracle.bmc.datascience.model.UpdateModelDeploymentDetails
            updateModelDeploymentDetails;

    /**
     * Details for updating a model deployment. Some of the properties of {@code
     * modelDeploymentConfigurationDetails} or {@code CategoryLogDetails} can also be updated with
     * zero down time when the model deployment's lifecycle state is ACTIVE or NEEDS_ATTENTION i.e
     * {@code instanceShapeName}, {@code instanceCount} and {@code modelId}, separately {@code
     * loadBalancerShape} or {@code CategoryLogDetails} can also be updated independently. All of
     * the fields can be updated when the deployment is in the INACTIVE lifecycle state. Changes
     * will take effect the next time the model deployment is activated.
     */
    public com.oracle.bmc.datascience.model.UpdateModelDeploymentDetails
            getUpdateModelDeploymentDetails() {
        return updateModelDeploymentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
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
    public com.oracle.bmc.datascience.model.UpdateModelDeploymentDetails getBody$() {
        return updateModelDeploymentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateModelDeploymentRequest,
                    com.oracle.bmc.datascience.model.UpdateModelDeploymentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the model deployment.
         */
        private String modelDeploymentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the model deployment.
         *
         * @param modelDeploymentId the value to set
         * @return this builder instance
         */
        public Builder modelDeploymentId(String modelDeploymentId) {
            this.modelDeploymentId = modelDeploymentId;
            return this;
        }

        /**
         * Details for updating a model deployment. Some of the properties of {@code
         * modelDeploymentConfigurationDetails} or {@code CategoryLogDetails} can also be updated
         * with zero down time when the model deployment's lifecycle state is ACTIVE or
         * NEEDS_ATTENTION i.e {@code instanceShapeName}, {@code instanceCount} and {@code modelId},
         * separately {@code loadBalancerShape} or {@code CategoryLogDetails} can also be updated
         * independently. All of the fields can be updated when the deployment is in the INACTIVE
         * lifecycle state. Changes will take effect the next time the model deployment is
         * activated.
         */
        private com.oracle.bmc.datascience.model.UpdateModelDeploymentDetails
                updateModelDeploymentDetails = null;

        /**
         * Details for updating a model deployment. Some of the properties of {@code
         * modelDeploymentConfigurationDetails} or {@code CategoryLogDetails} can also be updated
         * with zero down time when the model deployment's lifecycle state is ACTIVE or
         * NEEDS_ATTENTION i.e {@code instanceShapeName}, {@code instanceCount} and {@code modelId},
         * separately {@code loadBalancerShape} or {@code CategoryLogDetails} can also be updated
         * independently. All of the fields can be updated when the deployment is in the INACTIVE
         * lifecycle state. Changes will take effect the next time the model deployment is
         * activated.
         *
         * @param updateModelDeploymentDetails the value to set
         * @return this builder instance
         */
        public Builder updateModelDeploymentDetails(
                com.oracle.bmc.datascience.model.UpdateModelDeploymentDetails
                        updateModelDeploymentDetails) {
            this.updateModelDeploymentDetails = updateModelDeploymentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
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
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
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
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.datascience.model.UpdateModelDeploymentDetails body) {
            updateModelDeploymentDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateModelDeploymentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateModelDeploymentRequest
         */
        public UpdateModelDeploymentRequest buildWithoutInvocationCallback() {
            UpdateModelDeploymentRequest request = new UpdateModelDeploymentRequest();
            request.modelDeploymentId = modelDeploymentId;
            request.updateModelDeploymentDetails = updateModelDeploymentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateModelDeploymentRequest(modelDeploymentId, updateModelDeploymentDetails,
            // ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .modelDeploymentId(modelDeploymentId)
                .updateModelDeploymentDetails(updateModelDeploymentDetails)
                .ifMatch(ifMatch)
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
        sb.append(",modelDeploymentId=").append(String.valueOf(this.modelDeploymentId));
        sb.append(",updateModelDeploymentDetails=")
                .append(String.valueOf(this.updateModelDeploymentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateModelDeploymentRequest)) {
            return false;
        }

        UpdateModelDeploymentRequest other = (UpdateModelDeploymentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.modelDeploymentId, other.modelDeploymentId)
                && java.util.Objects.equals(
                        this.updateModelDeploymentDetails, other.updateModelDeploymentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.modelDeploymentId == null ? 43 : this.modelDeploymentId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateModelDeploymentDetails == null
                                ? 43
                                : this.updateModelDeploymentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
