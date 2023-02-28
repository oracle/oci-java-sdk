/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeComputeImageCapabilitySchemaCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeComputeImageCapabilitySchemaCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeComputeImageCapabilitySchemaCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeComputeImageCapabilitySchemaCompartmentDetails> {

    /** The id of the compute image capability schema or the image ocid */
    private String computeImageCapabilitySchemaId;

    /** The id of the compute image capability schema or the image ocid */
    public String getComputeImageCapabilitySchemaId() {
        return computeImageCapabilitySchemaId;
    }
    /** Compute Image Capability Schema change compartment details */
    private com.oracle.bmc.core.model.ChangeComputeImageCapabilitySchemaCompartmentDetails
            changeComputeImageCapabilitySchemaCompartmentDetails;

    /** Compute Image Capability Schema change compartment details */
    public com.oracle.bmc.core.model.ChangeComputeImageCapabilitySchemaCompartmentDetails
            getChangeComputeImageCapabilitySchemaCompartmentDetails() {
        return changeComputeImageCapabilitySchemaCompartmentDetails;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.ChangeComputeImageCapabilitySchemaCompartmentDetails
            getBody$() {
        return changeComputeImageCapabilitySchemaCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeComputeImageCapabilitySchemaCompartmentRequest,
                    com.oracle.bmc.core.model
                            .ChangeComputeImageCapabilitySchemaCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The id of the compute image capability schema or the image ocid */
        private String computeImageCapabilitySchemaId = null;

        /**
         * The id of the compute image capability schema or the image ocid
         *
         * @param computeImageCapabilitySchemaId the value to set
         * @return this builder instance
         */
        public Builder computeImageCapabilitySchemaId(String computeImageCapabilitySchemaId) {
            this.computeImageCapabilitySchemaId = computeImageCapabilitySchemaId;
            return this;
        }

        /** Compute Image Capability Schema change compartment details */
        private com.oracle.bmc.core.model.ChangeComputeImageCapabilitySchemaCompartmentDetails
                changeComputeImageCapabilitySchemaCompartmentDetails = null;

        /**
         * Compute Image Capability Schema change compartment details
         *
         * @param changeComputeImageCapabilitySchemaCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeComputeImageCapabilitySchemaCompartmentDetails(
                com.oracle.bmc.core.model.ChangeComputeImageCapabilitySchemaCompartmentDetails
                        changeComputeImageCapabilitySchemaCompartmentDetails) {
            this.changeComputeImageCapabilitySchemaCompartmentDetails =
                    changeComputeImageCapabilitySchemaCompartmentDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(ChangeComputeImageCapabilitySchemaCompartmentRequest o) {
            computeImageCapabilitySchemaId(o.getComputeImageCapabilitySchemaId());
            changeComputeImageCapabilitySchemaCompartmentDetails(
                    o.getChangeComputeImageCapabilitySchemaCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeComputeImageCapabilitySchemaCompartmentRequest as configured
         * by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeComputeImageCapabilitySchemaCompartmentRequest
         */
        public ChangeComputeImageCapabilitySchemaCompartmentRequest build() {
            ChangeComputeImageCapabilitySchemaCompartmentRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.core.model.ChangeComputeImageCapabilitySchemaCompartmentDetails
                        body) {
            changeComputeImageCapabilitySchemaCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeComputeImageCapabilitySchemaCompartmentRequest as configured
         * by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeComputeImageCapabilitySchemaCompartmentRequest
         */
        public ChangeComputeImageCapabilitySchemaCompartmentRequest
                buildWithoutInvocationCallback() {
            ChangeComputeImageCapabilitySchemaCompartmentRequest request =
                    new ChangeComputeImageCapabilitySchemaCompartmentRequest();
            request.computeImageCapabilitySchemaId = computeImageCapabilitySchemaId;
            request.changeComputeImageCapabilitySchemaCompartmentDetails =
                    changeComputeImageCapabilitySchemaCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new
            // ChangeComputeImageCapabilitySchemaCompartmentRequest(computeImageCapabilitySchemaId,
            // changeComputeImageCapabilitySchemaCompartmentDetails, ifMatch, opcRequestId,
            // opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .computeImageCapabilitySchemaId(computeImageCapabilitySchemaId)
                .changeComputeImageCapabilitySchemaCompartmentDetails(
                        changeComputeImageCapabilitySchemaCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",computeImageCapabilitySchemaId=")
                .append(String.valueOf(this.computeImageCapabilitySchemaId));
        sb.append(",changeComputeImageCapabilitySchemaCompartmentDetails=")
                .append(String.valueOf(this.changeComputeImageCapabilitySchemaCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeComputeImageCapabilitySchemaCompartmentRequest)) {
            return false;
        }

        ChangeComputeImageCapabilitySchemaCompartmentRequest other =
                (ChangeComputeImageCapabilitySchemaCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.computeImageCapabilitySchemaId, other.computeImageCapabilitySchemaId)
                && java.util.Objects.equals(
                        this.changeComputeImageCapabilitySchemaCompartmentDetails,
                        other.changeComputeImageCapabilitySchemaCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.computeImageCapabilitySchemaId == null
                                ? 43
                                : this.computeImageCapabilitySchemaId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeComputeImageCapabilitySchemaCompartmentDetails == null
                                ? 43
                                : this.changeComputeImageCapabilitySchemaCompartmentDetails
                                        .hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
