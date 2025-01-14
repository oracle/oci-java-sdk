/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmcontrolplane.requests;

import com.oracle.bmc.apmcontrolplane.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmcontrolplane/RemoveDataKeysExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use RemoveDataKeysRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class RemoveDataKeysRequest
        extends com.oracle.bmc.requests.BmcRequest<
                java.util.List<com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails>> {

    /** The OCID of the APM domain. */
    private String apmDomainId;

    /** The OCID of the APM domain. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /** List of Data Keys to be removed. */
    private java.util.List<com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails>
            removeDataKeysListDetails;

    /** List of Data Keys to be removed. */
    public java.util.List<com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails>
            getRemoveDataKeysListDetails() {
        return removeDataKeysListDetails;
    }
    /**
     * For optimistic concurrency control. Set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource. The resource will be updated or
     * deleted only if the etag you provide matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. Set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource. The resource will be updated or
     * deleted only if the etag you provide matches the resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
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
    public java.util.List<com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails> getBody$() {
        return removeDataKeysListDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RemoveDataKeysRequest,
                    java.util.List<com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails>> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the APM domain. */
        private String apmDomainId = null;

        /**
         * The OCID of the APM domain.
         *
         * @param apmDomainId the value to set
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        /** List of Data Keys to be removed. */
        private java.util.List<com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails>
                removeDataKeysListDetails = null;

        /**
         * List of Data Keys to be removed.
         *
         * @param removeDataKeysListDetails the value to set
         * @return this builder instance
         */
        public Builder removeDataKeysListDetails(
                java.util.List<com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails>
                        removeDataKeysListDetails) {
            this.removeDataKeysListDetails = removeDataKeysListDetails;
            return this;
        }

        /**
         * Singular setter. List of Data Keys to be removed.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder removeDataKeysListDetails(
                com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails singularValue) {
            return this.removeDataKeysListDetails(java.util.Arrays.asList(singularValue));
        }

        /**
         * For optimistic concurrency control. Set the {@code if-match} parameter to the value of
         * the etag from a previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's current etag
         * value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. Set the {@code if-match} parameter to the value of
         * the etag from a previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's current etag
         * value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(RemoveDataKeysRequest o) {
            apmDomainId(o.getApmDomainId());
            removeDataKeysListDetails(o.getRemoveDataKeysListDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RemoveDataKeysRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RemoveDataKeysRequest
         */
        public RemoveDataKeysRequest build() {
            RemoveDataKeysRequest request = buildWithoutInvocationCallback();
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
                java.util.List<com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails> body) {
            removeDataKeysListDetails(body);
            return this;
        }

        /**
         * Build the instance of RemoveDataKeysRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RemoveDataKeysRequest
         */
        public RemoveDataKeysRequest buildWithoutInvocationCallback() {
            RemoveDataKeysRequest request = new RemoveDataKeysRequest();
            request.apmDomainId = apmDomainId;
            request.removeDataKeysListDetails = removeDataKeysListDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new RemoveDataKeysRequest(apmDomainId, removeDataKeysListDetails, ifMatch,
            // opcRequestId);
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
                .removeDataKeysListDetails(removeDataKeysListDetails)
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
        sb.append(",removeDataKeysListDetails=")
                .append(String.valueOf(this.removeDataKeysListDetails));
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
        if (!(o instanceof RemoveDataKeysRequest)) {
            return false;
        }

        RemoveDataKeysRequest other = (RemoveDataKeysRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(
                        this.removeDataKeysListDetails, other.removeDataKeysListDetails)
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
                        + (this.removeDataKeysListDetails == null
                                ? 43
                                : this.removeDataKeysListDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
