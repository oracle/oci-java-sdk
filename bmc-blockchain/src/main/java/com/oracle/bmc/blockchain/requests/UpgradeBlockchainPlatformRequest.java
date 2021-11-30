/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.requests;

import com.oracle.bmc.blockchain.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/UpgradeBlockchainPlatformExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpgradeBlockchainPlatformRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class UpgradeBlockchainPlatformRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.blockchain.model.UpgradeBlockchainPlatformDetails> {

    /**
     * Details for the new version to which it needs to be upgraded.
     */
    private com.oracle.bmc.blockchain.model.UpgradeBlockchainPlatformDetails
            upgradeBlockchainPlatformDetails;

    /**
     * Unique service identifier.
     */
    private String blockchainPlatformId;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.blockchain.model.UpgradeBlockchainPlatformDetails getBody$() {
        return upgradeBlockchainPlatformDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpgradeBlockchainPlatformRequest,
                    com.oracle.bmc.blockchain.model.UpgradeBlockchainPlatformDetails> {
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
        public Builder copy(UpgradeBlockchainPlatformRequest o) {
            upgradeBlockchainPlatformDetails(o.getUpgradeBlockchainPlatformDetails());
            blockchainPlatformId(o.getBlockchainPlatformId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpgradeBlockchainPlatformRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpgradeBlockchainPlatformRequest
         */
        public UpgradeBlockchainPlatformRequest build() {
            UpgradeBlockchainPlatformRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.blockchain.model.UpgradeBlockchainPlatformDetails body) {
            upgradeBlockchainPlatformDetails(body);
            return this;
        }
    }
}
