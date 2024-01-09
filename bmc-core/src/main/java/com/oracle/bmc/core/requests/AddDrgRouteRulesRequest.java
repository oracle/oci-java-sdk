/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AddDrgRouteRulesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use AddDrgRouteRulesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class AddDrgRouteRulesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.AddDrgRouteRulesDetails> {

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
    /** Request for one or more route rules to be inserted into the DRG route table. */
    private com.oracle.bmc.core.model.AddDrgRouteRulesDetails addDrgRouteRulesDetails;

    /** Request for one or more route rules to be inserted into the DRG route table. */
    public com.oracle.bmc.core.model.AddDrgRouteRulesDetails getAddDrgRouteRulesDetails() {
        return addDrgRouteRulesDetails;
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
    public com.oracle.bmc.core.model.AddDrgRouteRulesDetails getBody$() {
        return addDrgRouteRulesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AddDrgRouteRulesRequest, com.oracle.bmc.core.model.AddDrgRouteRulesDetails> {
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

        /** Request for one or more route rules to be inserted into the DRG route table. */
        private com.oracle.bmc.core.model.AddDrgRouteRulesDetails addDrgRouteRulesDetails = null;

        /**
         * Request for one or more route rules to be inserted into the DRG route table.
         *
         * @param addDrgRouteRulesDetails the value to set
         * @return this builder instance
         */
        public Builder addDrgRouteRulesDetails(
                com.oracle.bmc.core.model.AddDrgRouteRulesDetails addDrgRouteRulesDetails) {
            this.addDrgRouteRulesDetails = addDrgRouteRulesDetails;
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
        public Builder copy(AddDrgRouteRulesRequest o) {
            drgRouteTableId(o.getDrgRouteTableId());
            addDrgRouteRulesDetails(o.getAddDrgRouteRulesDetails());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AddDrgRouteRulesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of AddDrgRouteRulesRequest
         */
        public AddDrgRouteRulesRequest build() {
            AddDrgRouteRulesRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.AddDrgRouteRulesDetails body) {
            addDrgRouteRulesDetails(body);
            return this;
        }

        /**
         * Build the instance of AddDrgRouteRulesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AddDrgRouteRulesRequest
         */
        public AddDrgRouteRulesRequest buildWithoutInvocationCallback() {
            AddDrgRouteRulesRequest request = new AddDrgRouteRulesRequest();
            request.drgRouteTableId = drgRouteTableId;
            request.addDrgRouteRulesDetails = addDrgRouteRulesDetails;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new AddDrgRouteRulesRequest(drgRouteTableId, addDrgRouteRulesDetails, opcRetryToken);
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
                .addDrgRouteRulesDetails(addDrgRouteRulesDetails)
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
        sb.append(",drgRouteTableId=").append(String.valueOf(this.drgRouteTableId));
        sb.append(",addDrgRouteRulesDetails=").append(String.valueOf(this.addDrgRouteRulesDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddDrgRouteRulesRequest)) {
            return false;
        }

        AddDrgRouteRulesRequest other = (AddDrgRouteRulesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.drgRouteTableId, other.drgRouteTableId)
                && java.util.Objects.equals(
                        this.addDrgRouteRulesDetails, other.addDrgRouteRulesDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
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
                        + (this.addDrgRouteRulesDetails == null
                                ? 43
                                : this.addDrgRouteRulesDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
