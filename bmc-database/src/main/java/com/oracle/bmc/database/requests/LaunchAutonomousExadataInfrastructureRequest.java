/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/LaunchAutonomousExadataInfrastructureExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * LaunchAutonomousExadataInfrastructureRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class LaunchAutonomousExadataInfrastructureRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.LaunchAutonomousExadataInfrastructureDetails> {

    /**
     * **Deprecated.** Use the {@link
     * #createCloudExadataInfrastructure(CreateCloudExadataInfrastructureRequest)
     * createCloudExadataInfrastructure} or {@link
     * #createCloudAutonomousVmCluster(CreateCloudAutonomousVmClusterRequest)
     * createCloudAutonomousVmCluster} operations instead.
     */
    private com.oracle.bmc.database.model.LaunchAutonomousExadataInfrastructureDetails
            launchAutonomousExadataInfrastructureDetails;

    /**
     * **Deprecated.** Use the {@link
     * #createCloudExadataInfrastructure(CreateCloudExadataInfrastructureRequest)
     * createCloudExadataInfrastructure} or {@link
     * #createCloudAutonomousVmCluster(CreateCloudAutonomousVmClusterRequest)
     * createCloudAutonomousVmCluster} operations instead.
     */
    public com.oracle.bmc.database.model.LaunchAutonomousExadataInfrastructureDetails
            getLaunchAutonomousExadataInfrastructureDetails() {
        return launchAutonomousExadataInfrastructureDetails;
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
    public com.oracle.bmc.database.model.LaunchAutonomousExadataInfrastructureDetails getBody$() {
        return launchAutonomousExadataInfrastructureDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    LaunchAutonomousExadataInfrastructureRequest,
                    com.oracle.bmc.database.model.LaunchAutonomousExadataInfrastructureDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * **Deprecated.** Use the {@link
         * #createCloudExadataInfrastructure(CreateCloudExadataInfrastructureRequest)
         * createCloudExadataInfrastructure} or {@link
         * #createCloudAutonomousVmCluster(CreateCloudAutonomousVmClusterRequest)
         * createCloudAutonomousVmCluster} operations instead.
         */
        private com.oracle.bmc.database.model.LaunchAutonomousExadataInfrastructureDetails
                launchAutonomousExadataInfrastructureDetails = null;

        /**
         * **Deprecated.** Use the {@link
         * #createCloudExadataInfrastructure(CreateCloudExadataInfrastructureRequest)
         * createCloudExadataInfrastructure} or {@link
         * #createCloudAutonomousVmCluster(CreateCloudAutonomousVmClusterRequest)
         * createCloudAutonomousVmCluster} operations instead.
         *
         * @param launchAutonomousExadataInfrastructureDetails the value to set
         * @return this builder instance
         */
        public Builder launchAutonomousExadataInfrastructureDetails(
                com.oracle.bmc.database.model.LaunchAutonomousExadataInfrastructureDetails
                        launchAutonomousExadataInfrastructureDetails) {
            this.launchAutonomousExadataInfrastructureDetails =
                    launchAutonomousExadataInfrastructureDetails;
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
        public Builder copy(LaunchAutonomousExadataInfrastructureRequest o) {
            launchAutonomousExadataInfrastructureDetails(
                    o.getLaunchAutonomousExadataInfrastructureDetails());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of LaunchAutonomousExadataInfrastructureRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of LaunchAutonomousExadataInfrastructureRequest
         */
        public LaunchAutonomousExadataInfrastructureRequest build() {
            LaunchAutonomousExadataInfrastructureRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.LaunchAutonomousExadataInfrastructureDetails body) {
            launchAutonomousExadataInfrastructureDetails(body);
            return this;
        }

        /**
         * Build the instance of LaunchAutonomousExadataInfrastructureRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of LaunchAutonomousExadataInfrastructureRequest
         */
        public LaunchAutonomousExadataInfrastructureRequest buildWithoutInvocationCallback() {
            LaunchAutonomousExadataInfrastructureRequest request =
                    new LaunchAutonomousExadataInfrastructureRequest();
            request.launchAutonomousExadataInfrastructureDetails =
                    launchAutonomousExadataInfrastructureDetails;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new
            // LaunchAutonomousExadataInfrastructureRequest(launchAutonomousExadataInfrastructureDetails, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .launchAutonomousExadataInfrastructureDetails(
                        launchAutonomousExadataInfrastructureDetails)
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
        sb.append(",launchAutonomousExadataInfrastructureDetails=")
                .append(String.valueOf(this.launchAutonomousExadataInfrastructureDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LaunchAutonomousExadataInfrastructureRequest)) {
            return false;
        }

        LaunchAutonomousExadataInfrastructureRequest other =
                (LaunchAutonomousExadataInfrastructureRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.launchAutonomousExadataInfrastructureDetails,
                        other.launchAutonomousExadataInfrastructureDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.launchAutonomousExadataInfrastructureDetails == null
                                ? 43
                                : this.launchAutonomousExadataInfrastructureDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
