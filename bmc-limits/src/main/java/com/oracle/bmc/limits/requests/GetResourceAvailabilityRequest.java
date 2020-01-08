/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.limits.requests;

import com.oracle.bmc.limits.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: ")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class GetResourceAvailabilityRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The service name of the target quota.
     */
    private String serviceName;

    /**
     * The limit name for which to fetch the data.
     */
    private String limitName;

    /**
     * The OCID of the compartment for which data is being fetched.
     */
    private String compartmentId;

    /**
     * This field is mandatory if the scopeType of the target resource limit is AD.
     * Otherwise, this field should be omitted.
     * If the above requirements are not met, the API will return a 400 - InvalidParameter response.
     *
     */
    private String availabilityDomain;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
    }
}
