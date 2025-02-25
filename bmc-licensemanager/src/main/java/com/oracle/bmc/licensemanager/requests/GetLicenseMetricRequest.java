/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.requests;

import com.oracle.bmc.licensemanager.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/licensemanager/GetLicenseMetricExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetLicenseMetricRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
public class GetLicenseMetricRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) used for the license record, product license, and configuration.
     *
     */
    private String compartmentId;

    /**
     * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) used for the license record, product license, and configuration.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
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
    /**
     * Indicates if the given compartment is the root compartment.
     */
    private Boolean isCompartmentIdInSubtree;

    /**
     * Indicates if the given compartment is the root compartment.
     */
    public Boolean getIsCompartmentIdInSubtree() {
        return isCompartmentIdInSubtree;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetLicenseMetricRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) used for the license record, product license, and configuration.
         *
         */
        private String compartmentId = null;

        /**
         * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) used for the license record, product license, and configuration.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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
         * Indicates if the given compartment is the root compartment.
         */
        private Boolean isCompartmentIdInSubtree = null;

        /**
         * Indicates if the given compartment is the root compartment.
         * @param isCompartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder isCompartmentIdInSubtree(Boolean isCompartmentIdInSubtree) {
            this.isCompartmentIdInSubtree = isCompartmentIdInSubtree;
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
        public Builder copy(GetLicenseMetricRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            isCompartmentIdInSubtree(o.getIsCompartmentIdInSubtree());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetLicenseMetricRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetLicenseMetricRequest
         */
        public GetLicenseMetricRequest build() {
            GetLicenseMetricRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetLicenseMetricRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetLicenseMetricRequest
         */
        public GetLicenseMetricRequest buildWithoutInvocationCallback() {
            GetLicenseMetricRequest request = new GetLicenseMetricRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.isCompartmentIdInSubtree = isCompartmentIdInSubtree;
            return request;
            // new GetLicenseMetricRequest(compartmentId, opcRequestId, isCompartmentIdInSubtree);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .isCompartmentIdInSubtree(isCompartmentIdInSubtree);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isCompartmentIdInSubtree=")
                .append(String.valueOf(this.isCompartmentIdInSubtree));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetLicenseMetricRequest)) {
            return false;
        }

        GetLicenseMetricRequest other = (GetLicenseMetricRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.isCompartmentIdInSubtree, other.isCompartmentIdInSubtree);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.isCompartmentIdInSubtree == null
                                ? 43
                                : this.isCompartmentIdInSubtree.hashCode());
        return result;
    }
}
