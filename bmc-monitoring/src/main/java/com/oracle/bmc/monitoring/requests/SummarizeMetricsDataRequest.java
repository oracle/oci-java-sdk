/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.monitoring.requests;

import com.oracle.bmc.monitoring.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class SummarizeMetricsDataRequest
        extends com.oracle.bmc.requests.BmcRequest<SummarizeMetricsDataDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the
     * resources monitored by the metric that you are searching for. Use tenancyId to search in
     * the root compartment.
     * <p>
     * Example: `ocid1.compartment.oc1..exampleuniqueID`
     *
     */
    private String compartmentId;

    /**
     * The dimensions used to filter for metrics.
     */
    private SummarizeMetricsDataDetails summarizeMetricsDataDetails;

    /**
     * Customer part of the request identifier token. If you need to contact Oracle about a particular
     * request, please provide the complete request ID.
     *
     */
    private String opcRequestId;

    /**
     * When true, returns resources from all compartments and subcompartments. The parameter can
     * only be set to true when compartmentId is the tenancy OCID (the tenancy is the root compartment).
     * A true value requires the user to have tenancy-level permissions. If this requirement is not met,
     * then the call is rejected. When false, returns resources from only the compartment specified in
     * compartmentId. Default is false.
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public SummarizeMetricsDataDetails getBody$() {
        return summarizeMetricsDataDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeMetricsDataRequest, SummarizeMetricsDataDetails> {
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
        public Builder copy(SummarizeMetricsDataRequest o) {
            compartmentId(o.getCompartmentId());
            summarizeMetricsDataDetails(o.getSummarizeMetricsDataDetails());
            opcRequestId(o.getOpcRequestId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeMetricsDataRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SummarizeMetricsDataRequest
         */
        public SummarizeMetricsDataRequest build() {
            SummarizeMetricsDataRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(SummarizeMetricsDataDetails body) {
            summarizeMetricsDataDetails(body);
            return this;
        }
    }
}
