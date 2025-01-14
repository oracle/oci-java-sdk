/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateNetworkSecurityGroupSecurityRulesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateNetworkSecurityGroupSecurityRulesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateNetworkSecurityGroupSecurityRulesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateNetworkSecurityGroupSecurityRulesDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the network security group.
     */
    private String networkSecurityGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the network security group.
     */
    public String getNetworkSecurityGroupId() {
        return networkSecurityGroupId;
    }
    /**
     * Request with one or more security rules associated with the network security group that will
     * be updated.
     */
    private com.oracle.bmc.core.model.UpdateNetworkSecurityGroupSecurityRulesDetails
            updateNetworkSecurityGroupSecurityRulesDetails;

    /**
     * Request with one or more security rules associated with the network security group that will
     * be updated.
     */
    public com.oracle.bmc.core.model.UpdateNetworkSecurityGroupSecurityRulesDetails
            getUpdateNetworkSecurityGroupSecurityRulesDetails() {
        return updateNetworkSecurityGroupSecurityRulesDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.UpdateNetworkSecurityGroupSecurityRulesDetails getBody$() {
        return updateNetworkSecurityGroupSecurityRulesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateNetworkSecurityGroupSecurityRulesRequest,
                    com.oracle.bmc.core.model.UpdateNetworkSecurityGroupSecurityRulesDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the network security group.
         */
        private String networkSecurityGroupId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the network security group.
         *
         * @param networkSecurityGroupId the value to set
         * @return this builder instance
         */
        public Builder networkSecurityGroupId(String networkSecurityGroupId) {
            this.networkSecurityGroupId = networkSecurityGroupId;
            return this;
        }

        /**
         * Request with one or more security rules associated with the network security group that
         * will be updated.
         */
        private com.oracle.bmc.core.model.UpdateNetworkSecurityGroupSecurityRulesDetails
                updateNetworkSecurityGroupSecurityRulesDetails = null;

        /**
         * Request with one or more security rules associated with the network security group that
         * will be updated.
         *
         * @param updateNetworkSecurityGroupSecurityRulesDetails the value to set
         * @return this builder instance
         */
        public Builder updateNetworkSecurityGroupSecurityRulesDetails(
                com.oracle.bmc.core.model.UpdateNetworkSecurityGroupSecurityRulesDetails
                        updateNetworkSecurityGroupSecurityRulesDetails) {
            this.updateNetworkSecurityGroupSecurityRulesDetails =
                    updateNetworkSecurityGroupSecurityRulesDetails;
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
        public Builder copy(UpdateNetworkSecurityGroupSecurityRulesRequest o) {
            networkSecurityGroupId(o.getNetworkSecurityGroupId());
            updateNetworkSecurityGroupSecurityRulesDetails(
                    o.getUpdateNetworkSecurityGroupSecurityRulesDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateNetworkSecurityGroupSecurityRulesRequest as configured by
         * this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateNetworkSecurityGroupSecurityRulesRequest
         */
        public UpdateNetworkSecurityGroupSecurityRulesRequest build() {
            UpdateNetworkSecurityGroupSecurityRulesRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.core.model.UpdateNetworkSecurityGroupSecurityRulesDetails body) {
            updateNetworkSecurityGroupSecurityRulesDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateNetworkSecurityGroupSecurityRulesRequest as configured by
         * this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateNetworkSecurityGroupSecurityRulesRequest
         */
        public UpdateNetworkSecurityGroupSecurityRulesRequest buildWithoutInvocationCallback() {
            UpdateNetworkSecurityGroupSecurityRulesRequest request =
                    new UpdateNetworkSecurityGroupSecurityRulesRequest();
            request.networkSecurityGroupId = networkSecurityGroupId;
            request.updateNetworkSecurityGroupSecurityRulesDetails =
                    updateNetworkSecurityGroupSecurityRulesDetails;
            return request;
            // new UpdateNetworkSecurityGroupSecurityRulesRequest(networkSecurityGroupId,
            // updateNetworkSecurityGroupSecurityRulesDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .networkSecurityGroupId(networkSecurityGroupId)
                .updateNetworkSecurityGroupSecurityRulesDetails(
                        updateNetworkSecurityGroupSecurityRulesDetails);
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
        sb.append(",networkSecurityGroupId=").append(String.valueOf(this.networkSecurityGroupId));
        sb.append(",updateNetworkSecurityGroupSecurityRulesDetails=")
                .append(String.valueOf(this.updateNetworkSecurityGroupSecurityRulesDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateNetworkSecurityGroupSecurityRulesRequest)) {
            return false;
        }

        UpdateNetworkSecurityGroupSecurityRulesRequest other =
                (UpdateNetworkSecurityGroupSecurityRulesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.networkSecurityGroupId, other.networkSecurityGroupId)
                && java.util.Objects.equals(
                        this.updateNetworkSecurityGroupSecurityRulesDetails,
                        other.updateNetworkSecurityGroupSecurityRulesDetails);
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
                        + (this.updateNetworkSecurityGroupSecurityRulesDetails == null
                                ? 43
                                : this.updateNetworkSecurityGroupSecurityRulesDetails.hashCode());
        return result;
    }
}
