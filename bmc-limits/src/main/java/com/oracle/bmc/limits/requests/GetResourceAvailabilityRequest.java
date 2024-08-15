/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limits.requests;

import com.oracle.bmc.limits.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limits/GetResourceAvailabilityExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetResourceAvailabilityRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181025")
public class GetResourceAvailabilityRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The service name of the target quota.
     */
    private String serviceName;

    /**
     * The service name of the target quota.
     */
    public String getServiceName() {
        return serviceName;
    }
    /**
     * The limit name for which to fetch the data.
     */
    private String limitName;

    /**
     * The limit name for which to fetch the data.
     */
    public String getLimitName() {
        return limitName;
    }
    /**
     * The OCID of the compartment for which data is being fetched.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment for which data is being fetched.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * This field is mandatory if the scopeType of the target resource limit is AD.
     * Otherwise, this field should be omitted.
     * If the above requirements are not met, the API returns a 400 - InvalidParameter response.
     *
     */
    private String availabilityDomain;

    /**
     * This field is mandatory if the scopeType of the target resource limit is AD.
     * Otherwise, this field should be omitted.
     * If the above requirements are not met, the API returns a 400 - InvalidParameter response.
     *
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The OCID of the subscription assigned to tenant
     *
     */
    private String subscriptionId;

    /**
     * The OCID of the subscription assigned to tenant
     *
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetResourceAvailabilityRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The service name of the target quota.
         */
        private String serviceName = null;

        /**
         * The service name of the target quota.
         * @param serviceName the value to set
         * @return this builder instance
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The limit name for which to fetch the data.
         */
        private String limitName = null;

        /**
         * The limit name for which to fetch the data.
         * @param limitName the value to set
         * @return this builder instance
         */
        public Builder limitName(String limitName) {
            this.limitName = limitName;
            return this;
        }

        /**
         * The OCID of the compartment for which data is being fetched.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment for which data is being fetched.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * This field is mandatory if the scopeType of the target resource limit is AD.
         * Otherwise, this field should be omitted.
         * If the above requirements are not met, the API returns a 400 - InvalidParameter response.
         *
         */
        private String availabilityDomain = null;

        /**
         * This field is mandatory if the scopeType of the target resource limit is AD.
         * Otherwise, this field should be omitted.
         * If the above requirements are not met, the API returns a 400 - InvalidParameter response.
         *
         * @param availabilityDomain the value to set
         * @return this builder instance
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
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
         * The OCID of the subscription assigned to tenant
         *
         */
        private String subscriptionId = null;

        /**
         * The OCID of the subscription assigned to tenant
         *
         * @param subscriptionId the value to set
         * @return this builder instance
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
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
        public Builder copy(GetResourceAvailabilityRequest o) {
            serviceName(o.getServiceName());
            limitName(o.getLimitName());
            compartmentId(o.getCompartmentId());
            availabilityDomain(o.getAvailabilityDomain());
            opcRequestId(o.getOpcRequestId());
            subscriptionId(o.getSubscriptionId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetResourceAvailabilityRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetResourceAvailabilityRequest
         */
        public GetResourceAvailabilityRequest build() {
            GetResourceAvailabilityRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetResourceAvailabilityRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetResourceAvailabilityRequest
         */
        public GetResourceAvailabilityRequest buildWithoutInvocationCallback() {
            GetResourceAvailabilityRequest request = new GetResourceAvailabilityRequest();
            request.serviceName = serviceName;
            request.limitName = limitName;
            request.compartmentId = compartmentId;
            request.availabilityDomain = availabilityDomain;
            request.opcRequestId = opcRequestId;
            request.subscriptionId = subscriptionId;
            return request;
            // new GetResourceAvailabilityRequest(serviceName, limitName, compartmentId, availabilityDomain, opcRequestId, subscriptionId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .serviceName(serviceName)
                .limitName(limitName)
                .compartmentId(compartmentId)
                .availabilityDomain(availabilityDomain)
                .opcRequestId(opcRequestId)
                .subscriptionId(subscriptionId);
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
        sb.append(",serviceName=").append(String.valueOf(this.serviceName));
        sb.append(",limitName=").append(String.valueOf(this.limitName));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetResourceAvailabilityRequest)) {
            return false;
        }

        GetResourceAvailabilityRequest other = (GetResourceAvailabilityRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.limitName, other.limitName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.limitName == null ? 43 : this.limitName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        return result;
    }
}
