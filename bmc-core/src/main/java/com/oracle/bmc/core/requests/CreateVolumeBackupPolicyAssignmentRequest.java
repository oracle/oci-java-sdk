/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateVolumeBackupPolicyAssignmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateVolumeBackupPolicyAssignmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateVolumeBackupPolicyAssignmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.CreateVolumeBackupPolicyAssignmentDetails> {

    /**
     * Request to assign a specified policy to a particular volume.
     */
    private com.oracle.bmc.core.model.CreateVolumeBackupPolicyAssignmentDetails
            createVolumeBackupPolicyAssignmentDetails;

    /**
     * Request to assign a specified policy to a particular volume.
     */
    public com.oracle.bmc.core.model.CreateVolumeBackupPolicyAssignmentDetails
            getCreateVolumeBackupPolicyAssignmentDetails() {
        return createVolumeBackupPolicyAssignmentDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.CreateVolumeBackupPolicyAssignmentDetails getBody$() {
        return createVolumeBackupPolicyAssignmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateVolumeBackupPolicyAssignmentRequest,
                    com.oracle.bmc.core.model.CreateVolumeBackupPolicyAssignmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Request to assign a specified policy to a particular volume.
         */
        private com.oracle.bmc.core.model.CreateVolumeBackupPolicyAssignmentDetails
                createVolumeBackupPolicyAssignmentDetails = null;

        /**
         * Request to assign a specified policy to a particular volume.
         * @param createVolumeBackupPolicyAssignmentDetails the value to set
         * @return this builder instance
         */
        public Builder createVolumeBackupPolicyAssignmentDetails(
                com.oracle.bmc.core.model.CreateVolumeBackupPolicyAssignmentDetails
                        createVolumeBackupPolicyAssignmentDetails) {
            this.createVolumeBackupPolicyAssignmentDetails =
                    createVolumeBackupPolicyAssignmentDetails;
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
        public Builder copy(CreateVolumeBackupPolicyAssignmentRequest o) {
            createVolumeBackupPolicyAssignmentDetails(
                    o.getCreateVolumeBackupPolicyAssignmentDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateVolumeBackupPolicyAssignmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateVolumeBackupPolicyAssignmentRequest
         */
        public CreateVolumeBackupPolicyAssignmentRequest build() {
            CreateVolumeBackupPolicyAssignmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.core.model.CreateVolumeBackupPolicyAssignmentDetails body) {
            createVolumeBackupPolicyAssignmentDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateVolumeBackupPolicyAssignmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateVolumeBackupPolicyAssignmentRequest
         */
        public CreateVolumeBackupPolicyAssignmentRequest buildWithoutInvocationCallback() {
            CreateVolumeBackupPolicyAssignmentRequest request =
                    new CreateVolumeBackupPolicyAssignmentRequest();
            request.createVolumeBackupPolicyAssignmentDetails =
                    createVolumeBackupPolicyAssignmentDetails;
            return request;
            // new CreateVolumeBackupPolicyAssignmentRequest(createVolumeBackupPolicyAssignmentDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createVolumeBackupPolicyAssignmentDetails(
                        createVolumeBackupPolicyAssignmentDetails);
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
        sb.append(",createVolumeBackupPolicyAssignmentDetails=")
                .append(String.valueOf(this.createVolumeBackupPolicyAssignmentDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVolumeBackupPolicyAssignmentRequest)) {
            return false;
        }

        CreateVolumeBackupPolicyAssignmentRequest other =
                (CreateVolumeBackupPolicyAssignmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createVolumeBackupPolicyAssignmentDetails,
                        other.createVolumeBackupPolicyAssignmentDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createVolumeBackupPolicyAssignmentDetails == null
                                ? 43
                                : this.createVolumeBackupPolicyAssignmentDetails.hashCode());
        return result;
    }
}
