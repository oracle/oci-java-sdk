/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class RemoveNetworkSecurityGroupSecurityRulesRequest
        extends com.oracle.bmc.requests.BmcRequest<RemoveNetworkSecurityGroupSecurityRulesDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network security group.
     */
    private String networkSecurityGroupId;

    /**
     * Request with one or more security rules associated with the network security group that
     * will be removed.
     *
     */
    private RemoveNetworkSecurityGroupSecurityRulesDetails
            removeNetworkSecurityGroupSecurityRulesDetails;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public RemoveNetworkSecurityGroupSecurityRulesDetails getBody$() {
        return removeNetworkSecurityGroupSecurityRulesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RemoveNetworkSecurityGroupSecurityRulesRequest,
                    RemoveNetworkSecurityGroupSecurityRulesDetails> {
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
        public Builder copy(RemoveNetworkSecurityGroupSecurityRulesRequest o) {
            networkSecurityGroupId(o.getNetworkSecurityGroupId());
            removeNetworkSecurityGroupSecurityRulesDetails(
                    o.getRemoveNetworkSecurityGroupSecurityRulesDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RemoveNetworkSecurityGroupSecurityRulesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RemoveNetworkSecurityGroupSecurityRulesRequest
         */
        public RemoveNetworkSecurityGroupSecurityRulesRequest build() {
            RemoveNetworkSecurityGroupSecurityRulesRequest request =
                    buildWithoutInvocationCallback();
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
        public Builder body$(RemoveNetworkSecurityGroupSecurityRulesDetails body) {
            removeNetworkSecurityGroupSecurityRulesDetails(body);
            return this;
        }
    }
}
