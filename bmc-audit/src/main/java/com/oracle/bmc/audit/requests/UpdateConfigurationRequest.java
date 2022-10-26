/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.audit.requests;

import com.oracle.bmc.audit.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/audit/UpdateConfigurationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateConfigurationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
public class UpdateConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.audit.model.UpdateConfigurationDetails> {

    /** ID of the root compartment (tenancy) */
    private String compartmentId;

    /** ID of the root compartment (tenancy) */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The configuration properties */
    private com.oracle.bmc.audit.model.UpdateConfigurationDetails updateConfigurationDetails;

    /** The configuration properties */
    public com.oracle.bmc.audit.model.UpdateConfigurationDetails getUpdateConfigurationDetails() {
        return updateConfigurationDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.audit.model.UpdateConfigurationDetails getBody$() {
        return updateConfigurationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateConfigurationRequest,
                    com.oracle.bmc.audit.model.UpdateConfigurationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** ID of the root compartment (tenancy) */
        private String compartmentId = null;

        /**
         * ID of the root compartment (tenancy)
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The configuration properties */
        private com.oracle.bmc.audit.model.UpdateConfigurationDetails updateConfigurationDetails =
                null;

        /**
         * The configuration properties
         *
         * @param updateConfigurationDetails the value to set
         * @return this builder instance
         */
        public Builder updateConfigurationDetails(
                com.oracle.bmc.audit.model.UpdateConfigurationDetails updateConfigurationDetails) {
            this.updateConfigurationDetails = updateConfigurationDetails;
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
        public Builder copy(UpdateConfigurationRequest o) {
            compartmentId(o.getCompartmentId());
            updateConfigurationDetails(o.getUpdateConfigurationDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateConfigurationRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateConfigurationRequest
         */
        public UpdateConfigurationRequest build() {
            UpdateConfigurationRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.audit.model.UpdateConfigurationDetails body) {
            updateConfigurationDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateConfigurationRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateConfigurationRequest
         */
        public UpdateConfigurationRequest buildWithoutInvocationCallback() {
            UpdateConfigurationRequest request = new UpdateConfigurationRequest();
            request.compartmentId = compartmentId;
            request.updateConfigurationDetails = updateConfigurationDetails;
            return request;
            // new UpdateConfigurationRequest(compartmentId, updateConfigurationDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .updateConfigurationDetails(updateConfigurationDetails);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",updateConfigurationDetails=")
                .append(String.valueOf(this.updateConfigurationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConfigurationRequest)) {
            return false;
        }

        UpdateConfigurationRequest other = (UpdateConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.updateConfigurationDetails, other.updateConfigurationDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateConfigurationDetails == null
                                ? 43
                                : this.updateConfigurationDetails.hashCode());
        return result;
    }
}
