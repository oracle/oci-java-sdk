/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateRegionSubscriptionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateRegionSubscriptionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateRegionSubscriptionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identity.model.CreateRegionSubscriptionDetails> {

    /** Request object for activate a new region. */
    private com.oracle.bmc.identity.model.CreateRegionSubscriptionDetails
            createRegionSubscriptionDetails;

    /** Request object for activate a new region. */
    public com.oracle.bmc.identity.model.CreateRegionSubscriptionDetails
            getCreateRegionSubscriptionDetails() {
        return createRegionSubscriptionDetails;
    }
    /** The OCID of the tenancy. */
    private String tenancyId;

    /** The OCID of the tenancy. */
    public String getTenancyId() {
        return tenancyId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
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
    public com.oracle.bmc.identity.model.CreateRegionSubscriptionDetails getBody$() {
        return createRegionSubscriptionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateRegionSubscriptionRequest,
                    com.oracle.bmc.identity.model.CreateRegionSubscriptionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Request object for activate a new region. */
        private com.oracle.bmc.identity.model.CreateRegionSubscriptionDetails
                createRegionSubscriptionDetails = null;

        /**
         * Request object for activate a new region.
         *
         * @param createRegionSubscriptionDetails the value to set
         * @return this builder instance
         */
        public Builder createRegionSubscriptionDetails(
                com.oracle.bmc.identity.model.CreateRegionSubscriptionDetails
                        createRegionSubscriptionDetails) {
            this.createRegionSubscriptionDetails = createRegionSubscriptionDetails;
            return this;
        }

        /** The OCID of the tenancy. */
        private String tenancyId = null;

        /**
         * The OCID of the tenancy.
         *
         * @param tenancyId the value to set
         * @return this builder instance
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (e.g., if a
         * resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (e.g., if a
         * resource has been deleted and purged from the system, then a retry of the original
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
        public Builder copy(CreateRegionSubscriptionRequest o) {
            createRegionSubscriptionDetails(o.getCreateRegionSubscriptionDetails());
            tenancyId(o.getTenancyId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateRegionSubscriptionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateRegionSubscriptionRequest
         */
        public CreateRegionSubscriptionRequest build() {
            CreateRegionSubscriptionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.identity.model.CreateRegionSubscriptionDetails body) {
            createRegionSubscriptionDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateRegionSubscriptionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateRegionSubscriptionRequest
         */
        public CreateRegionSubscriptionRequest buildWithoutInvocationCallback() {
            CreateRegionSubscriptionRequest request = new CreateRegionSubscriptionRequest();
            request.createRegionSubscriptionDetails = createRegionSubscriptionDetails;
            request.tenancyId = tenancyId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateRegionSubscriptionRequest(createRegionSubscriptionDetails, tenancyId,
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
                .createRegionSubscriptionDetails(createRegionSubscriptionDetails)
                .tenancyId(tenancyId)
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
        sb.append(",createRegionSubscriptionDetails=")
                .append(String.valueOf(this.createRegionSubscriptionDetails));
        sb.append(",tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateRegionSubscriptionRequest)) {
            return false;
        }

        CreateRegionSubscriptionRequest other = (CreateRegionSubscriptionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createRegionSubscriptionDetails, other.createRegionSubscriptionDetails)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createRegionSubscriptionDetails == null
                                ? 43
                                : this.createRegionSubscriptionDetails.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
