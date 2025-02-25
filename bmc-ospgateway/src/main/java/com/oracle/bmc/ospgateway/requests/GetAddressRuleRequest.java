/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.requests;

import com.oracle.bmc.ospgateway.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ospgateway/GetAddressRuleExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetAddressRuleRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
public class GetAddressRuleRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The home region's public name of the logged in user.
     *
     */
    private String ospHomeRegion;

    /**
     * The home region's public name of the logged in user.
     *
     */
    public String getOspHomeRegion() {
        return ospHomeRegion;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     *
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Country code for the address rule in ISO-3166-1 2-letter format.
     *
     */
    private String countryCode;

    /**
     * Country code for the address rule in ISO-3166-1 2-letter format.
     *
     */
    public String getCountryCode() {
        return countryCode;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetAddressRuleRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The home region's public name of the logged in user.
         *
         */
        private String ospHomeRegion = null;

        /**
         * The home region's public name of the logged in user.
         *
         * @param ospHomeRegion the value to set
         * @return this builder instance
         */
        public Builder ospHomeRegion(String ospHomeRegion) {
            this.ospHomeRegion = ospHomeRegion;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         *
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Country code for the address rule in ISO-3166-1 2-letter format.
         *
         */
        private String countryCode = null;

        /**
         * Country code for the address rule in ISO-3166-1 2-letter format.
         *
         * @param countryCode the value to set
         * @return this builder instance
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(GetAddressRuleRequest o) {
            ospHomeRegion(o.getOspHomeRegion());
            compartmentId(o.getCompartmentId());
            countryCode(o.getCountryCode());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetAddressRuleRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetAddressRuleRequest
         */
        public GetAddressRuleRequest build() {
            GetAddressRuleRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetAddressRuleRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetAddressRuleRequest
         */
        public GetAddressRuleRequest buildWithoutInvocationCallback() {
            GetAddressRuleRequest request = new GetAddressRuleRequest();
            request.ospHomeRegion = ospHomeRegion;
            request.compartmentId = compartmentId;
            request.countryCode = countryCode;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetAddressRuleRequest(ospHomeRegion, compartmentId, countryCode, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .ospHomeRegion(ospHomeRegion)
                .compartmentId(compartmentId)
                .countryCode(countryCode)
                .opcRequestId(opcRequestId);
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
        sb.append(",ospHomeRegion=").append(String.valueOf(this.ospHomeRegion));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",countryCode=").append(String.valueOf(this.countryCode));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAddressRuleRequest)) {
            return false;
        }

        GetAddressRuleRequest other = (GetAddressRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.ospHomeRegion, other.ospHomeRegion)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.countryCode, other.countryCode)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.ospHomeRegion == null ? 43 : this.ospHomeRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.countryCode == null ? 43 : this.countryCode.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
