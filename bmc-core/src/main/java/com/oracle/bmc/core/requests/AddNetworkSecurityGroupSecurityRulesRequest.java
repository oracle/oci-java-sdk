/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AddNetworkSecurityGroupSecurityRulesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use AddNetworkSecurityGroupSecurityRulesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class AddNetworkSecurityGroupSecurityRulesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.AddNetworkSecurityGroupSecurityRulesDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security group.
     */
    private String networkSecurityGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security group.
     */
    public String getNetworkSecurityGroupId() {
        return networkSecurityGroupId;
    }
    /**
     * Request with one or more security rules to be associated with the network security group.
     */
    private com.oracle.bmc.core.model.AddNetworkSecurityGroupSecurityRulesDetails
            addNetworkSecurityGroupSecurityRulesDetails;

    /**
     * Request with one or more security rules to be associated with the network security group.
     */
    public com.oracle.bmc.core.model.AddNetworkSecurityGroupSecurityRulesDetails
            getAddNetworkSecurityGroupSecurityRulesDetails() {
        return addNetworkSecurityGroupSecurityRulesDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.AddNetworkSecurityGroupSecurityRulesDetails getBody$() {
        return addNetworkSecurityGroupSecurityRulesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AddNetworkSecurityGroupSecurityRulesRequest,
                    com.oracle.bmc.core.model.AddNetworkSecurityGroupSecurityRulesDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security group.
         */
        private String networkSecurityGroupId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security group.
         * @param networkSecurityGroupId the value to set
         * @return this builder instance
         */
        public Builder networkSecurityGroupId(String networkSecurityGroupId) {
            this.networkSecurityGroupId = networkSecurityGroupId;
            return this;
        }

        /**
         * Request with one or more security rules to be associated with the network security group.
         */
        private com.oracle.bmc.core.model.AddNetworkSecurityGroupSecurityRulesDetails
                addNetworkSecurityGroupSecurityRulesDetails = null;

        /**
         * Request with one or more security rules to be associated with the network security group.
         * @param addNetworkSecurityGroupSecurityRulesDetails the value to set
         * @return this builder instance
         */
        public Builder addNetworkSecurityGroupSecurityRulesDetails(
                com.oracle.bmc.core.model.AddNetworkSecurityGroupSecurityRulesDetails
                        addNetworkSecurityGroupSecurityRulesDetails) {
            this.addNetworkSecurityGroupSecurityRulesDetails =
                    addNetworkSecurityGroupSecurityRulesDetails;
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
        public Builder copy(AddNetworkSecurityGroupSecurityRulesRequest o) {
            networkSecurityGroupId(o.getNetworkSecurityGroupId());
            addNetworkSecurityGroupSecurityRulesDetails(
                    o.getAddNetworkSecurityGroupSecurityRulesDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AddNetworkSecurityGroupSecurityRulesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of AddNetworkSecurityGroupSecurityRulesRequest
         */
        public AddNetworkSecurityGroupSecurityRulesRequest build() {
            AddNetworkSecurityGroupSecurityRulesRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.core.model.AddNetworkSecurityGroupSecurityRulesDetails body) {
            addNetworkSecurityGroupSecurityRulesDetails(body);
            return this;
        }

        /**
         * Build the instance of AddNetworkSecurityGroupSecurityRulesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AddNetworkSecurityGroupSecurityRulesRequest
         */
        public AddNetworkSecurityGroupSecurityRulesRequest buildWithoutInvocationCallback() {
            AddNetworkSecurityGroupSecurityRulesRequest request =
                    new AddNetworkSecurityGroupSecurityRulesRequest();
            request.networkSecurityGroupId = networkSecurityGroupId;
            request.addNetworkSecurityGroupSecurityRulesDetails =
                    addNetworkSecurityGroupSecurityRulesDetails;
            return request;
            // new AddNetworkSecurityGroupSecurityRulesRequest(networkSecurityGroupId, addNetworkSecurityGroupSecurityRulesDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .networkSecurityGroupId(networkSecurityGroupId)
                .addNetworkSecurityGroupSecurityRulesDetails(
                        addNetworkSecurityGroupSecurityRulesDetails);
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
        sb.append(",networkSecurityGroupId=").append(String.valueOf(this.networkSecurityGroupId));
        sb.append(",addNetworkSecurityGroupSecurityRulesDetails=")
                .append(String.valueOf(this.addNetworkSecurityGroupSecurityRulesDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddNetworkSecurityGroupSecurityRulesRequest)) {
            return false;
        }

        AddNetworkSecurityGroupSecurityRulesRequest other =
                (AddNetworkSecurityGroupSecurityRulesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.networkSecurityGroupId, other.networkSecurityGroupId)
                && java.util.Objects.equals(
                        this.addNetworkSecurityGroupSecurityRulesDetails,
                        other.addNetworkSecurityGroupSecurityRulesDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.networkSecurityGroupId == null
                                ? 43
                                : this.networkSecurityGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.addNetworkSecurityGroupSecurityRulesDetails == null
                                ? 43
                                : this.addNetworkSecurityGroupSecurityRulesDetails.hashCode());
        return result;
    }
}
