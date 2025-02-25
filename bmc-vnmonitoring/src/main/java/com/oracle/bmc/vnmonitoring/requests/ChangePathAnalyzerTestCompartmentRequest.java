/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.requests;

import com.oracle.bmc.vnmonitoring.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/vnmonitoring/ChangePathAnalyzerTestCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangePathAnalyzerTestCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangePathAnalyzerTestCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.vnmonitoring.model.ChangePathAnalyzerTestCompartmentDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code PathAnalyzerTest} resource.
     */
    private String pathAnalyzerTestId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code PathAnalyzerTest} resource.
     */
    public String getPathAnalyzerTestId() {
        return pathAnalyzerTestId;
    }
    /**
     * The information to update.
     */
    private com.oracle.bmc.vnmonitoring.model.ChangePathAnalyzerTestCompartmentDetails
            changePathAnalyzerTestCompartmentDetails;

    /**
     * The information to update.
     */
    public com.oracle.bmc.vnmonitoring.model.ChangePathAnalyzerTestCompartmentDetails
            getChangePathAnalyzerTestCompartmentDetails() {
        return changePathAnalyzerTestCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
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
    public com.oracle.bmc.vnmonitoring.model.ChangePathAnalyzerTestCompartmentDetails getBody$() {
        return changePathAnalyzerTestCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangePathAnalyzerTestCompartmentRequest,
                    com.oracle.bmc.vnmonitoring.model.ChangePathAnalyzerTestCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code PathAnalyzerTest} resource.
         */
        private String pathAnalyzerTestId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code PathAnalyzerTest} resource.
         * @param pathAnalyzerTestId the value to set
         * @return this builder instance
         */
        public Builder pathAnalyzerTestId(String pathAnalyzerTestId) {
            this.pathAnalyzerTestId = pathAnalyzerTestId;
            return this;
        }

        /**
         * The information to update.
         */
        private com.oracle.bmc.vnmonitoring.model.ChangePathAnalyzerTestCompartmentDetails
                changePathAnalyzerTestCompartmentDetails = null;

        /**
         * The information to update.
         * @param changePathAnalyzerTestCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changePathAnalyzerTestCompartmentDetails(
                com.oracle.bmc.vnmonitoring.model.ChangePathAnalyzerTestCompartmentDetails
                        changePathAnalyzerTestCompartmentDetails) {
            this.changePathAnalyzerTestCompartmentDetails =
                    changePathAnalyzerTestCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(ChangePathAnalyzerTestCompartmentRequest o) {
            pathAnalyzerTestId(o.getPathAnalyzerTestId());
            changePathAnalyzerTestCompartmentDetails(
                    o.getChangePathAnalyzerTestCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangePathAnalyzerTestCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangePathAnalyzerTestCompartmentRequest
         */
        public ChangePathAnalyzerTestCompartmentRequest build() {
            ChangePathAnalyzerTestCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.vnmonitoring.model.ChangePathAnalyzerTestCompartmentDetails body) {
            changePathAnalyzerTestCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangePathAnalyzerTestCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangePathAnalyzerTestCompartmentRequest
         */
        public ChangePathAnalyzerTestCompartmentRequest buildWithoutInvocationCallback() {
            ChangePathAnalyzerTestCompartmentRequest request =
                    new ChangePathAnalyzerTestCompartmentRequest();
            request.pathAnalyzerTestId = pathAnalyzerTestId;
            request.changePathAnalyzerTestCompartmentDetails =
                    changePathAnalyzerTestCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangePathAnalyzerTestCompartmentRequest(pathAnalyzerTestId, changePathAnalyzerTestCompartmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .pathAnalyzerTestId(pathAnalyzerTestId)
                .changePathAnalyzerTestCompartmentDetails(changePathAnalyzerTestCompartmentDetails)
                .ifMatch(ifMatch)
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
        sb.append(",pathAnalyzerTestId=").append(String.valueOf(this.pathAnalyzerTestId));
        sb.append(",changePathAnalyzerTestCompartmentDetails=")
                .append(String.valueOf(this.changePathAnalyzerTestCompartmentDetails));
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
        if (!(o instanceof ChangePathAnalyzerTestCompartmentRequest)) {
            return false;
        }

        ChangePathAnalyzerTestCompartmentRequest other =
                (ChangePathAnalyzerTestCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.pathAnalyzerTestId, other.pathAnalyzerTestId)
                && java.util.Objects.equals(
                        this.changePathAnalyzerTestCompartmentDetails,
                        other.changePathAnalyzerTestCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.pathAnalyzerTestId == null
                                ? 43
                                : this.pathAnalyzerTestId.hashCode());
        result =
                (result * PRIME)
                        + (this.changePathAnalyzerTestCompartmentDetails == null
                                ? 43
                                : this.changePathAnalyzerTestCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
