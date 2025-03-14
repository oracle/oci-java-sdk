/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmcontrolplane.requests;

import com.oracle.bmc.apmcontrolplane.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmcontrolplane/GenerateDataKeysExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GenerateDataKeysRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GenerateDataKeysRequest
        extends com.oracle.bmc.requests.BmcRequest<
                java.util.List<com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails>> {

    /** List of new Data Keys to be generated. */
    private java.util.List<com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails>
            generateDataKeysListDetails;

    /** List of new Data Keys to be generated. */
    public java.util.List<com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails>
            getGenerateDataKeysListDetails() {
        return generateDataKeysListDetails;
    }
    /** The OCID of the APM domain. */
    private String apmDomainId;

    /** The OCID of the APM domain. */
    public String getApmDomainId() {
        return apmDomainId;
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
    public java.util.List<com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails> getBody$() {
        return generateDataKeysListDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GenerateDataKeysRequest,
                    java.util.List<com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails>> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** List of new Data Keys to be generated. */
        private java.util.List<com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails>
                generateDataKeysListDetails = null;

        /**
         * List of new Data Keys to be generated.
         *
         * @param generateDataKeysListDetails the value to set
         * @return this builder instance
         */
        public Builder generateDataKeysListDetails(
                java.util.List<com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails>
                        generateDataKeysListDetails) {
            this.generateDataKeysListDetails = generateDataKeysListDetails;
            return this;
        }

        /**
         * Singular setter. List of new Data Keys to be generated.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder generateDataKeysListDetails(
                com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails singularValue) {
            return this.generateDataKeysListDetails(java.util.Arrays.asList(singularValue));
        }

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
        public Builder copy(GenerateDataKeysRequest o) {
            generateDataKeysListDetails(o.getGenerateDataKeysListDetails());
            apmDomainId(o.getApmDomainId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GenerateDataKeysRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GenerateDataKeysRequest
         */
        public GenerateDataKeysRequest build() {
            GenerateDataKeysRequest request = buildWithoutInvocationCallback();
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
                java.util.List<com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails> body) {
            generateDataKeysListDetails(body);
            return this;
        }

        /**
         * Build the instance of GenerateDataKeysRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GenerateDataKeysRequest
         */
        public GenerateDataKeysRequest buildWithoutInvocationCallback() {
            GenerateDataKeysRequest request = new GenerateDataKeysRequest();
            request.generateDataKeysListDetails = generateDataKeysListDetails;
            request.apmDomainId = apmDomainId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new GenerateDataKeysRequest(generateDataKeysListDetails, apmDomainId, ifMatch,
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
                .generateDataKeysListDetails(generateDataKeysListDetails)
                .apmDomainId(apmDomainId)
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
        sb.append(",generateDataKeysListDetails=")
                .append(String.valueOf(this.generateDataKeysListDetails));
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
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
        if (!(o instanceof GenerateDataKeysRequest)) {
            return false;
        }

        GenerateDataKeysRequest other = (GenerateDataKeysRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.generateDataKeysListDetails, other.generateDataKeysListDetails)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.generateDataKeysListDetails == null
                                ? 43
                                : this.generateDataKeysListDetails.hashCode());
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
