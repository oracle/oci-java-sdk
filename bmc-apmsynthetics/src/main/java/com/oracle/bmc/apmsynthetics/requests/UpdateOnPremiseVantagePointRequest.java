/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.requests;

import com.oracle.bmc.apmsynthetics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/UpdateOnPremiseVantagePointExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateOnPremiseVantagePointRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class UpdateOnPremiseVantagePointRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.apmsynthetics.model.UpdateOnPremiseVantagePointDetails> {

    /** The APM domain ID the request is intended for. */
    private String apmDomainId;

    /** The APM domain ID the request is intended for. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /** The OCID of the On-premise vantage point. */
    private String onPremiseVantagePointId;

    /** The OCID of the On-premise vantage point. */
    public String getOnPremiseVantagePointId() {
        return onPremiseVantagePointId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.apmsynthetics.model.UpdateOnPremiseVantagePointDetails
            updateOnPremiseVantagePointDetails;

    /** The information to be updated. */
    public com.oracle.bmc.apmsynthetics.model.UpdateOnPremiseVantagePointDetails
            getUpdateOnPremiseVantagePointDetails() {
        return updateOnPremiseVantagePointDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.apmsynthetics.model.UpdateOnPremiseVantagePointDetails getBody$() {
        return updateOnPremiseVantagePointDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOnPremiseVantagePointRequest,
                    com.oracle.bmc.apmsynthetics.model.UpdateOnPremiseVantagePointDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The APM domain ID the request is intended for. */
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

        /** The OCID of the On-premise vantage point. */
        private String onPremiseVantagePointId = null;

        /**
         * The OCID of the On-premise vantage point.
         *
         * @param onPremiseVantagePointId the value to set
         * @return this builder instance
         */
        public Builder onPremiseVantagePointId(String onPremiseVantagePointId) {
            this.onPremiseVantagePointId = onPremiseVantagePointId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.apmsynthetics.model.UpdateOnPremiseVantagePointDetails
                updateOnPremiseVantagePointDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateOnPremiseVantagePointDetails the value to set
         * @return this builder instance
         */
        public Builder updateOnPremiseVantagePointDetails(
                com.oracle.bmc.apmsynthetics.model.UpdateOnPremiseVantagePointDetails
                        updateOnPremiseVantagePointDetails) {
            this.updateOnPremiseVantagePointDetails = updateOnPremiseVantagePointDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
        public Builder copy(UpdateOnPremiseVantagePointRequest o) {
            apmDomainId(o.getApmDomainId());
            onPremiseVantagePointId(o.getOnPremiseVantagePointId());
            updateOnPremiseVantagePointDetails(o.getUpdateOnPremiseVantagePointDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOnPremiseVantagePointRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateOnPremiseVantagePointRequest
         */
        public UpdateOnPremiseVantagePointRequest build() {
            UpdateOnPremiseVantagePointRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.apmsynthetics.model.UpdateOnPremiseVantagePointDetails body) {
            updateOnPremiseVantagePointDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOnPremiseVantagePointRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOnPremiseVantagePointRequest
         */
        public UpdateOnPremiseVantagePointRequest buildWithoutInvocationCallback() {
            UpdateOnPremiseVantagePointRequest request = new UpdateOnPremiseVantagePointRequest();
            request.apmDomainId = apmDomainId;
            request.onPremiseVantagePointId = onPremiseVantagePointId;
            request.updateOnPremiseVantagePointDetails = updateOnPremiseVantagePointDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOnPremiseVantagePointRequest(apmDomainId, onPremiseVantagePointId,
            // updateOnPremiseVantagePointDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .onPremiseVantagePointId(onPremiseVantagePointId)
                .updateOnPremiseVantagePointDetails(updateOnPremiseVantagePointDetails)
                .ifMatch(ifMatch)
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",onPremiseVantagePointId=").append(String.valueOf(this.onPremiseVantagePointId));
        sb.append(",updateOnPremiseVantagePointDetails=")
                .append(String.valueOf(this.updateOnPremiseVantagePointDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOnPremiseVantagePointRequest)) {
            return false;
        }

        UpdateOnPremiseVantagePointRequest other = (UpdateOnPremiseVantagePointRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(
                        this.onPremiseVantagePointId, other.onPremiseVantagePointId)
                && java.util.Objects.equals(
                        this.updateOnPremiseVantagePointDetails,
                        other.updateOnPremiseVantagePointDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.onPremiseVantagePointId == null
                                ? 43
                                : this.onPremiseVantagePointId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOnPremiseVantagePointDetails == null
                                ? 43
                                : this.updateOnPremiseVantagePointDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
