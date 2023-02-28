/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateDrgRouteRulesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateDrgRouteRulesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateDrgRouteRulesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateDrgRouteRulesDetails> {

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
    /** Request to update one or more route rules in the DRG route table. */
    private com.oracle.bmc.core.model.UpdateDrgRouteRulesDetails updateDrgRouteRulesDetails;

    /** Request to update one or more route rules in the DRG route table. */
    public com.oracle.bmc.core.model.UpdateDrgRouteRulesDetails getUpdateDrgRouteRulesDetails() {
        return updateDrgRouteRulesDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.UpdateDrgRouteRulesDetails getBody$() {
        return updateDrgRouteRulesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDrgRouteRulesRequest,
                    com.oracle.bmc.core.model.UpdateDrgRouteRulesDetails> {
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

        /** Request to update one or more route rules in the DRG route table. */
        private com.oracle.bmc.core.model.UpdateDrgRouteRulesDetails updateDrgRouteRulesDetails =
                null;

        /**
         * Request to update one or more route rules in the DRG route table.
         *
         * @param updateDrgRouteRulesDetails the value to set
         * @return this builder instance
         */
        public Builder updateDrgRouteRulesDetails(
                com.oracle.bmc.core.model.UpdateDrgRouteRulesDetails updateDrgRouteRulesDetails) {
            this.updateDrgRouteRulesDetails = updateDrgRouteRulesDetails;
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
        public Builder copy(UpdateDrgRouteRulesRequest o) {
            drgRouteTableId(o.getDrgRouteTableId());
            updateDrgRouteRulesDetails(o.getUpdateDrgRouteRulesDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDrgRouteRulesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateDrgRouteRulesRequest
         */
        public UpdateDrgRouteRulesRequest build() {
            UpdateDrgRouteRulesRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdateDrgRouteRulesDetails body) {
            updateDrgRouteRulesDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDrgRouteRulesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDrgRouteRulesRequest
         */
        public UpdateDrgRouteRulesRequest buildWithoutInvocationCallback() {
            UpdateDrgRouteRulesRequest request = new UpdateDrgRouteRulesRequest();
            request.drgRouteTableId = drgRouteTableId;
            request.updateDrgRouteRulesDetails = updateDrgRouteRulesDetails;
            return request;
            // new UpdateDrgRouteRulesRequest(drgRouteTableId, updateDrgRouteRulesDetails);
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
                .updateDrgRouteRulesDetails(updateDrgRouteRulesDetails);
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
        sb.append(",updateDrgRouteRulesDetails=")
                .append(String.valueOf(this.updateDrgRouteRulesDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrgRouteRulesRequest)) {
            return false;
        }

        UpdateDrgRouteRulesRequest other = (UpdateDrgRouteRulesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.drgRouteTableId, other.drgRouteTableId)
                && java.util.Objects.equals(
                        this.updateDrgRouteRulesDetails, other.updateDrgRouteRulesDetails);
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
                        + (this.updateDrgRouteRulesDetails == null
                                ? 43
                                : this.updateDrgRouteRulesDetails.hashCode());
        return result;
    }
}
