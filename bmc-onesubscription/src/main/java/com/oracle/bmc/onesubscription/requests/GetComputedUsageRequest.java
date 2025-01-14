/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.requests;

import com.oracle.bmc.onesubscription.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/onesubscription/GetComputedUsageExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetComputedUsageRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class GetComputedUsageRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Computed Usage Id */
    private String computedUsageId;

    /** The Computed Usage Id */
    public String getComputedUsageId() {
        return computedUsageId;
    }
    /** The OCID of the root compartment. */
    private String compartmentId;

    /** The OCID of the root compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Partial response refers to an optimization technique offered by the RESTful web APIs to
     * return only the information (fields) required by the client. This parameter is used to
     * control what fields to return.
     */
    private java.util.List<String> fields;

    /**
     * Partial response refers to an optimization technique offered by the RESTful web APIs to
     * return only the information (fields) required by the client. This parameter is used to
     * control what fields to return.
     */
    public java.util.List<String> getFields() {
        return fields;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetComputedUsageRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Computed Usage Id */
        private String computedUsageId = null;

        /**
         * The Computed Usage Id
         *
         * @param computedUsageId the value to set
         * @return this builder instance
         */
        public Builder computedUsageId(String computedUsageId) {
            this.computedUsageId = computedUsageId;
            return this;
        }

        /** The OCID of the root compartment. */
        private String compartmentId = null;

        /**
         * The OCID of the root compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Partial response refers to an optimization technique offered by the RESTful web APIs to
         * return only the information (fields) required by the client. This parameter is used to
         * control what fields to return.
         */
        private java.util.List<String> fields = null;

        /**
         * Partial response refers to an optimization technique offered by the RESTful web APIs to
         * return only the information (fields) required by the client. This parameter is used to
         * control what fields to return.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Partial response refers to an optimization technique offered by the
         * RESTful web APIs to return only the information (fields) required by the client. This
         * parameter is used to control what fields to return.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(String singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
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
        public Builder copy(GetComputedUsageRequest o) {
            computedUsageId(o.getComputedUsageId());
            compartmentId(o.getCompartmentId());
            fields(o.getFields());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetComputedUsageRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetComputedUsageRequest
         */
        public GetComputedUsageRequest build() {
            GetComputedUsageRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetComputedUsageRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetComputedUsageRequest
         */
        public GetComputedUsageRequest buildWithoutInvocationCallback() {
            GetComputedUsageRequest request = new GetComputedUsageRequest();
            request.computedUsageId = computedUsageId;
            request.compartmentId = compartmentId;
            request.fields = fields;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetComputedUsageRequest(computedUsageId, compartmentId, fields, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .computedUsageId(computedUsageId)
                .compartmentId(compartmentId)
                .fields(fields)
                .opcRequestId(opcRequestId);
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
        sb.append(",computedUsageId=").append(String.valueOf(this.computedUsageId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetComputedUsageRequest)) {
            return false;
        }

        GetComputedUsageRequest other = (GetComputedUsageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.computedUsageId, other.computedUsageId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.computedUsageId == null ? 43 : this.computedUsageId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
