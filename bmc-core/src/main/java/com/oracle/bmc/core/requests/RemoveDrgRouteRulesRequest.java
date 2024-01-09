/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/RemoveDrgRouteRulesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use RemoveDrgRouteRulesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class RemoveDrgRouteRulesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.RemoveDrgRouteRulesDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the DRG route table.
     */
    private String drgRouteTableId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the DRG route table.
     */
    public String getDrgRouteTableId() {
        return drgRouteTableId;
    }
    /** Request to remove one or more route rules in the DRG route table. */
    private com.oracle.bmc.core.model.RemoveDrgRouteRulesDetails removeDrgRouteRulesDetails;

    /** Request to remove one or more route rules in the DRG route table. */
    public com.oracle.bmc.core.model.RemoveDrgRouteRulesDetails getRemoveDrgRouteRulesDetails() {
        return removeDrgRouteRulesDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.RemoveDrgRouteRulesDetails getBody$() {
        return removeDrgRouteRulesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RemoveDrgRouteRulesRequest,
                    com.oracle.bmc.core.model.RemoveDrgRouteRulesDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the DRG route table.
         */
        private String drgRouteTableId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the DRG route table.
         *
         * @param drgRouteTableId the value to set
         * @return this builder instance
         */
        public Builder drgRouteTableId(String drgRouteTableId) {
            this.drgRouteTableId = drgRouteTableId;
            return this;
        }

        /** Request to remove one or more route rules in the DRG route table. */
        private com.oracle.bmc.core.model.RemoveDrgRouteRulesDetails removeDrgRouteRulesDetails =
                null;

        /**
         * Request to remove one or more route rules in the DRG route table.
         *
         * @param removeDrgRouteRulesDetails the value to set
         * @return this builder instance
         */
        public Builder removeDrgRouteRulesDetails(
                com.oracle.bmc.core.model.RemoveDrgRouteRulesDetails removeDrgRouteRulesDetails) {
            this.removeDrgRouteRulesDetails = removeDrgRouteRulesDetails;
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
        public Builder copy(RemoveDrgRouteRulesRequest o) {
            drgRouteTableId(o.getDrgRouteTableId());
            removeDrgRouteRulesDetails(o.getRemoveDrgRouteRulesDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RemoveDrgRouteRulesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RemoveDrgRouteRulesRequest
         */
        public RemoveDrgRouteRulesRequest build() {
            RemoveDrgRouteRulesRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.RemoveDrgRouteRulesDetails body) {
            removeDrgRouteRulesDetails(body);
            return this;
        }

        /**
         * Build the instance of RemoveDrgRouteRulesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RemoveDrgRouteRulesRequest
         */
        public RemoveDrgRouteRulesRequest buildWithoutInvocationCallback() {
            RemoveDrgRouteRulesRequest request = new RemoveDrgRouteRulesRequest();
            request.drgRouteTableId = drgRouteTableId;
            request.removeDrgRouteRulesDetails = removeDrgRouteRulesDetails;
            return request;
            // new RemoveDrgRouteRulesRequest(drgRouteTableId, removeDrgRouteRulesDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .drgRouteTableId(drgRouteTableId)
                .removeDrgRouteRulesDetails(removeDrgRouteRulesDetails);
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
        sb.append(",drgRouteTableId=").append(String.valueOf(this.drgRouteTableId));
        sb.append(",removeDrgRouteRulesDetails=")
                .append(String.valueOf(this.removeDrgRouteRulesDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveDrgRouteRulesRequest)) {
            return false;
        }

        RemoveDrgRouteRulesRequest other = (RemoveDrgRouteRulesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.drgRouteTableId, other.drgRouteTableId)
                && java.util.Objects.equals(
                        this.removeDrgRouteRulesDetails, other.removeDrgRouteRulesDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.drgRouteTableId == null ? 43 : this.drgRouteTableId.hashCode());
        result =
                (result * PRIME)
                        + (this.removeDrgRouteRulesDetails == null
                                ? 43
                                : this.removeDrgRouteRulesDetails.hashCode());
        return result;
    }
}
