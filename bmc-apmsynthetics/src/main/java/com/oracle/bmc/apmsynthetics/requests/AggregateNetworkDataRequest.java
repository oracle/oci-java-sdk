/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.requests;

import com.oracle.bmc.apmsynthetics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/AggregateNetworkDataExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use AggregateNetworkDataRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class AggregateNetworkDataRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.apmsynthetics.model.AggregateNetworkDataDetails> {

    /**
     * The APM domain ID the request is intended for.
     *
     */
    private String apmDomainId;

    /**
     * The APM domain ID the request is intended for.
     *
     */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /**
     * The OCID of the monitor.
     */
    private String monitorId;

    /**
     * The OCID of the monitor.
     */
    public String getMonitorId() {
        return monitorId;
    }
    /**
     * Details of the vantage point and corresponding execution times.
     */
    private com.oracle.bmc.apmsynthetics.model.AggregateNetworkDataDetails
            aggregateNetworkDataDetails;

    /**
     * Details of the vantage point and corresponding execution times.
     */
    public com.oracle.bmc.apmsynthetics.model.AggregateNetworkDataDetails
            getAggregateNetworkDataDetails() {
        return aggregateNetworkDataDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.apmsynthetics.model.AggregateNetworkDataDetails getBody$() {
        return aggregateNetworkDataDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AggregateNetworkDataRequest,
                    com.oracle.bmc.apmsynthetics.model.AggregateNetworkDataDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The APM domain ID the request is intended for.
         *
         */
        private String apmDomainId = null;

        /**
         * The APM domain ID the request is intended for.
         *
         * @param apmDomainId the value to set
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        /**
         * The OCID of the monitor.
         */
        private String monitorId = null;

        /**
         * The OCID of the monitor.
         * @param monitorId the value to set
         * @return this builder instance
         */
        public Builder monitorId(String monitorId) {
            this.monitorId = monitorId;
            return this;
        }

        /**
         * Details of the vantage point and corresponding execution times.
         */
        private com.oracle.bmc.apmsynthetics.model.AggregateNetworkDataDetails
                aggregateNetworkDataDetails = null;

        /**
         * Details of the vantage point and corresponding execution times.
         * @param aggregateNetworkDataDetails the value to set
         * @return this builder instance
         */
        public Builder aggregateNetworkDataDetails(
                com.oracle.bmc.apmsynthetics.model.AggregateNetworkDataDetails
                        aggregateNetworkDataDetails) {
            this.aggregateNetworkDataDetails = aggregateNetworkDataDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
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
        public Builder copy(AggregateNetworkDataRequest o) {
            apmDomainId(o.getApmDomainId());
            monitorId(o.getMonitorId());
            aggregateNetworkDataDetails(o.getAggregateNetworkDataDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AggregateNetworkDataRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of AggregateNetworkDataRequest
         */
        public AggregateNetworkDataRequest build() {
            AggregateNetworkDataRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.apmsynthetics.model.AggregateNetworkDataDetails body) {
            aggregateNetworkDataDetails(body);
            return this;
        }

        /**
         * Build the instance of AggregateNetworkDataRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AggregateNetworkDataRequest
         */
        public AggregateNetworkDataRequest buildWithoutInvocationCallback() {
            AggregateNetworkDataRequest request = new AggregateNetworkDataRequest();
            request.apmDomainId = apmDomainId;
            request.monitorId = monitorId;
            request.aggregateNetworkDataDetails = aggregateNetworkDataDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new AggregateNetworkDataRequest(apmDomainId, monitorId, aggregateNetworkDataDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .monitorId(monitorId)
                .aggregateNetworkDataDetails(aggregateNetworkDataDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",monitorId=").append(String.valueOf(this.monitorId));
        sb.append(",aggregateNetworkDataDetails=")
                .append(String.valueOf(this.aggregateNetworkDataDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AggregateNetworkDataRequest)) {
            return false;
        }

        AggregateNetworkDataRequest other = (AggregateNetworkDataRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(this.monitorId, other.monitorId)
                && java.util.Objects.equals(
                        this.aggregateNetworkDataDetails, other.aggregateNetworkDataDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result = (result * PRIME) + (this.monitorId == null ? 43 : this.monitorId.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregateNetworkDataDetails == null
                                ? 43
                                : this.aggregateNetworkDataDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
