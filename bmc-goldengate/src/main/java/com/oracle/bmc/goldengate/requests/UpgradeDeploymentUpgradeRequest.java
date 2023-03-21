/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.requests;

import com.oracle.bmc.goldengate.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/goldengate/UpgradeDeploymentUpgradeExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpgradeDeploymentUpgradeRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class UpgradeDeploymentUpgradeRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.goldengate.model.UpgradeDeploymentUpgradeDetails> {

    /**
     * A unique Deployment Upgrade identifier.
     *
     */
    private String deploymentUpgradeId;

    /**
     * A unique Deployment Upgrade identifier.
     *
     */
    public String getDeploymentUpgradeId() {
        return deploymentUpgradeId;
    }
    /**
     * A placeholder for any additional metadata to describe the deployment upgrade.
     *
     */
    private com.oracle.bmc.goldengate.model.UpgradeDeploymentUpgradeDetails
            upgradeDeploymentUpgradeDetails;

    /**
     * A placeholder for any additional metadata to describe the deployment upgrade.
     *
     */
    public com.oracle.bmc.goldengate.model.UpgradeDeploymentUpgradeDetails
            getUpgradeDeploymentUpgradeDetails() {
        return upgradeDeploymentUpgradeDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource.  The resource is updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource.  The resource is updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing.
     *
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried, in case of a timeout or server error,
     * without the risk of executing that same action again. Retry tokens expire after 24 hours but can be
     * invalidated before then due to conflicting operations. For example, if a resource was deleted and purged
     * from the system, then a retry of the original creation request is rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried, in case of a timeout or server error,
     * without the risk of executing that same action again. Retry tokens expire after 24 hours but can be
     * invalidated before then due to conflicting operations. For example, if a resource was deleted and purged
     * from the system, then a retry of the original creation request is rejected.
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
    public com.oracle.bmc.goldengate.model.UpgradeDeploymentUpgradeDetails getBody$() {
        return upgradeDeploymentUpgradeDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpgradeDeploymentUpgradeRequest,
                    com.oracle.bmc.goldengate.model.UpgradeDeploymentUpgradeDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * A unique Deployment Upgrade identifier.
         *
         */
        private String deploymentUpgradeId = null;

        /**
         * A unique Deployment Upgrade identifier.
         *
         * @param deploymentUpgradeId the value to set
         * @return this builder instance
         */
        public Builder deploymentUpgradeId(String deploymentUpgradeId) {
            this.deploymentUpgradeId = deploymentUpgradeId;
            return this;
        }

        /**
         * A placeholder for any additional metadata to describe the deployment upgrade.
         *
         */
        private com.oracle.bmc.goldengate.model.UpgradeDeploymentUpgradeDetails
                upgradeDeploymentUpgradeDetails = null;

        /**
         * A placeholder for any additional metadata to describe the deployment upgrade.
         *
         * @param upgradeDeploymentUpgradeDetails the value to set
         * @return this builder instance
         */
        public Builder upgradeDeploymentUpgradeDetails(
                com.oracle.bmc.goldengate.model.UpgradeDeploymentUpgradeDetails
                        upgradeDeploymentUpgradeDetails) {
            this.upgradeDeploymentUpgradeDetails = upgradeDeploymentUpgradeDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
         * resource.  The resource is updated or deleted only if the etag you provide matches the
         * resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
         * resource.  The resource is updated or deleted only if the etag you provide matches the
         * resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The client request ID for tracing.
         *
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried, in case of a timeout or server error,
         * without the risk of executing that same action again. Retry tokens expire after 24 hours but can be
         * invalidated before then due to conflicting operations. For example, if a resource was deleted and purged
         * from the system, then a retry of the original creation request is rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried, in case of a timeout or server error,
         * without the risk of executing that same action again. Retry tokens expire after 24 hours but can be
         * invalidated before then due to conflicting operations. For example, if a resource was deleted and purged
         * from the system, then a retry of the original creation request is rejected.
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
        public Builder copy(UpgradeDeploymentUpgradeRequest o) {
            deploymentUpgradeId(o.getDeploymentUpgradeId());
            upgradeDeploymentUpgradeDetails(o.getUpgradeDeploymentUpgradeDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpgradeDeploymentUpgradeRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpgradeDeploymentUpgradeRequest
         */
        public UpgradeDeploymentUpgradeRequest build() {
            UpgradeDeploymentUpgradeRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.goldengate.model.UpgradeDeploymentUpgradeDetails body) {
            upgradeDeploymentUpgradeDetails(body);
            return this;
        }

        /**
         * Build the instance of UpgradeDeploymentUpgradeRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpgradeDeploymentUpgradeRequest
         */
        public UpgradeDeploymentUpgradeRequest buildWithoutInvocationCallback() {
            UpgradeDeploymentUpgradeRequest request = new UpgradeDeploymentUpgradeRequest();
            request.deploymentUpgradeId = deploymentUpgradeId;
            request.upgradeDeploymentUpgradeDetails = upgradeDeploymentUpgradeDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new UpgradeDeploymentUpgradeRequest(deploymentUpgradeId, upgradeDeploymentUpgradeDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .deploymentUpgradeId(deploymentUpgradeId)
                .upgradeDeploymentUpgradeDetails(upgradeDeploymentUpgradeDetails)
                .ifMatch(ifMatch)
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
        sb.append(",deploymentUpgradeId=").append(String.valueOf(this.deploymentUpgradeId));
        sb.append(",upgradeDeploymentUpgradeDetails=")
                .append(String.valueOf(this.upgradeDeploymentUpgradeDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
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
        if (!(o instanceof UpgradeDeploymentUpgradeRequest)) {
            return false;
        }

        UpgradeDeploymentUpgradeRequest other = (UpgradeDeploymentUpgradeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.deploymentUpgradeId, other.deploymentUpgradeId)
                && java.util.Objects.equals(
                        this.upgradeDeploymentUpgradeDetails, other.upgradeDeploymentUpgradeDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.deploymentUpgradeId == null
                                ? 43
                                : this.deploymentUpgradeId.hashCode());
        result =
                (result * PRIME)
                        + (this.upgradeDeploymentUpgradeDetails == null
                                ? 43
                                : this.upgradeDeploymentUpgradeDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
