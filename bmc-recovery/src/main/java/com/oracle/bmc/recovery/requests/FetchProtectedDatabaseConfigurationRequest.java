/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.requests;

import com.oracle.bmc.recovery.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/recovery/FetchProtectedDatabaseConfigurationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * FetchProtectedDatabaseConfigurationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
public class FetchProtectedDatabaseConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.recovery.model.FetchProtectedDatabaseConfigurationDetails> {

    /** The protected database OCID. */
    private String protectedDatabaseId;

    /** The protected database OCID. */
    public String getProtectedDatabaseId() {
        return protectedDatabaseId;
    }
    /** Which configuration to get */
    private com.oracle.bmc.recovery.model.FetchProtectedDatabaseConfigurationDetails
            fetchProtectedDatabaseConfigurationDetails;

    /** Which configuration to get */
    public com.oracle.bmc.recovery.model.FetchProtectedDatabaseConfigurationDetails
            getFetchProtectedDatabaseConfigurationDetails() {
        return fetchProtectedDatabaseConfigurationDetails;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.recovery.model.FetchProtectedDatabaseConfigurationDetails getBody$() {
        return fetchProtectedDatabaseConfigurationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    FetchProtectedDatabaseConfigurationRequest,
                    com.oracle.bmc.recovery.model.FetchProtectedDatabaseConfigurationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The protected database OCID. */
        private String protectedDatabaseId = null;

        /**
         * The protected database OCID.
         *
         * @param protectedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder protectedDatabaseId(String protectedDatabaseId) {
            this.protectedDatabaseId = protectedDatabaseId;
            return this;
        }

        /** Which configuration to get */
        private com.oracle.bmc.recovery.model.FetchProtectedDatabaseConfigurationDetails
                fetchProtectedDatabaseConfigurationDetails = null;

        /**
         * Which configuration to get
         *
         * @param fetchProtectedDatabaseConfigurationDetails the value to set
         * @return this builder instance
         */
        public Builder fetchProtectedDatabaseConfigurationDetails(
                com.oracle.bmc.recovery.model.FetchProtectedDatabaseConfigurationDetails
                        fetchProtectedDatabaseConfigurationDetails) {
            this.fetchProtectedDatabaseConfigurationDetails =
                    fetchProtectedDatabaseConfigurationDetails;
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
        public Builder copy(FetchProtectedDatabaseConfigurationRequest o) {
            protectedDatabaseId(o.getProtectedDatabaseId());
            fetchProtectedDatabaseConfigurationDetails(
                    o.getFetchProtectedDatabaseConfigurationDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of FetchProtectedDatabaseConfigurationRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of FetchProtectedDatabaseConfigurationRequest
         */
        public FetchProtectedDatabaseConfigurationRequest build() {
            FetchProtectedDatabaseConfigurationRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.recovery.model.FetchProtectedDatabaseConfigurationDetails body) {
            fetchProtectedDatabaseConfigurationDetails(body);
            return this;
        }

        /**
         * Build the instance of FetchProtectedDatabaseConfigurationRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of FetchProtectedDatabaseConfigurationRequest
         */
        public FetchProtectedDatabaseConfigurationRequest buildWithoutInvocationCallback() {
            FetchProtectedDatabaseConfigurationRequest request =
                    new FetchProtectedDatabaseConfigurationRequest();
            request.protectedDatabaseId = protectedDatabaseId;
            request.fetchProtectedDatabaseConfigurationDetails =
                    fetchProtectedDatabaseConfigurationDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new FetchProtectedDatabaseConfigurationRequest(protectedDatabaseId,
            // fetchProtectedDatabaseConfigurationDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .protectedDatabaseId(protectedDatabaseId)
                .fetchProtectedDatabaseConfigurationDetails(
                        fetchProtectedDatabaseConfigurationDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",protectedDatabaseId=").append(String.valueOf(this.protectedDatabaseId));
        sb.append(",fetchProtectedDatabaseConfigurationDetails=")
                .append(String.valueOf(this.fetchProtectedDatabaseConfigurationDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchProtectedDatabaseConfigurationRequest)) {
            return false;
        }

        FetchProtectedDatabaseConfigurationRequest other =
                (FetchProtectedDatabaseConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.protectedDatabaseId, other.protectedDatabaseId)
                && java.util.Objects.equals(
                        this.fetchProtectedDatabaseConfigurationDetails,
                        other.fetchProtectedDatabaseConfigurationDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.protectedDatabaseId == null
                                ? 43
                                : this.protectedDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.fetchProtectedDatabaseConfigurationDetails == null
                                ? 43
                                : this.fetchProtectedDatabaseConfigurationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
