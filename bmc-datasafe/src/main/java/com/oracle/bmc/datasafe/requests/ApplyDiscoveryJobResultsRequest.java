/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ApplyDiscoveryJobResultsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ApplyDiscoveryJobResultsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ApplyDiscoveryJobResultsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.ApplyDiscoveryJobResultsDetails> {

    /** The OCID of the sensitive data model. */
    private String sensitiveDataModelId;

    /** The OCID of the sensitive data model. */
    public String getSensitiveDataModelId() {
        return sensitiveDataModelId;
    }
    /** Details to apply the discovery results to a sensitive data model. */
    private com.oracle.bmc.datasafe.model.ApplyDiscoveryJobResultsDetails
            applyDiscoveryJobResultsDetails;

    /** Details to apply the discovery results to a sensitive data model. */
    public com.oracle.bmc.datasafe.model.ApplyDiscoveryJobResultsDetails
            getApplyDiscoveryJobResultsDetails() {
        return applyDiscoveryJobResultsDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
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
    public com.oracle.bmc.datasafe.model.ApplyDiscoveryJobResultsDetails getBody$() {
        return applyDiscoveryJobResultsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ApplyDiscoveryJobResultsRequest,
                    com.oracle.bmc.datasafe.model.ApplyDiscoveryJobResultsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the sensitive data model. */
        private String sensitiveDataModelId = null;

        /**
         * The OCID of the sensitive data model.
         *
         * @param sensitiveDataModelId the value to set
         * @return this builder instance
         */
        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            this.sensitiveDataModelId = sensitiveDataModelId;
            return this;
        }

        /** Details to apply the discovery results to a sensitive data model. */
        private com.oracle.bmc.datasafe.model.ApplyDiscoveryJobResultsDetails
                applyDiscoveryJobResultsDetails = null;

        /**
         * Details to apply the discovery results to a sensitive data model.
         *
         * @param applyDiscoveryJobResultsDetails the value to set
         * @return this builder instance
         */
        public Builder applyDiscoveryJobResultsDetails(
                com.oracle.bmc.datasafe.model.ApplyDiscoveryJobResultsDetails
                        applyDiscoveryJobResultsDetails) {
            this.applyDiscoveryJobResultsDetails = applyDiscoveryJobResultsDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the etag from a previous GET or POST response for that
         * resource. The resource will be updated or deleted only if the etag you provide matches
         * the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the etag from a previous GET or POST response for that
         * resource. The resource will be updated or deleted only if the etag you provide matches
         * the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(ApplyDiscoveryJobResultsRequest o) {
            sensitiveDataModelId(o.getSensitiveDataModelId());
            applyDiscoveryJobResultsDetails(o.getApplyDiscoveryJobResultsDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ApplyDiscoveryJobResultsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ApplyDiscoveryJobResultsRequest
         */
        public ApplyDiscoveryJobResultsRequest build() {
            ApplyDiscoveryJobResultsRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.ApplyDiscoveryJobResultsDetails body) {
            applyDiscoveryJobResultsDetails(body);
            return this;
        }

        /**
         * Build the instance of ApplyDiscoveryJobResultsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ApplyDiscoveryJobResultsRequest
         */
        public ApplyDiscoveryJobResultsRequest buildWithoutInvocationCallback() {
            ApplyDiscoveryJobResultsRequest request = new ApplyDiscoveryJobResultsRequest();
            request.sensitiveDataModelId = sensitiveDataModelId;
            request.applyDiscoveryJobResultsDetails = applyDiscoveryJobResultsDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ApplyDiscoveryJobResultsRequest(sensitiveDataModelId,
            // applyDiscoveryJobResultsDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .sensitiveDataModelId(sensitiveDataModelId)
                .applyDiscoveryJobResultsDetails(applyDiscoveryJobResultsDetails)
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
        sb.append(",sensitiveDataModelId=").append(String.valueOf(this.sensitiveDataModelId));
        sb.append(",applyDiscoveryJobResultsDetails=")
                .append(String.valueOf(this.applyDiscoveryJobResultsDetails));
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
        if (!(o instanceof ApplyDiscoveryJobResultsRequest)) {
            return false;
        }

        ApplyDiscoveryJobResultsRequest other = (ApplyDiscoveryJobResultsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.sensitiveDataModelId, other.sensitiveDataModelId)
                && java.util.Objects.equals(
                        this.applyDiscoveryJobResultsDetails, other.applyDiscoveryJobResultsDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sensitiveDataModelId == null
                                ? 43
                                : this.sensitiveDataModelId.hashCode());
        result =
                (result * PRIME)
                        + (this.applyDiscoveryJobResultsDetails == null
                                ? 43
                                : this.applyDiscoveryJobResultsDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
