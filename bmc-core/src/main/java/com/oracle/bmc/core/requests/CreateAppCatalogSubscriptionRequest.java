/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateAppCatalogSubscriptionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateAppCatalogSubscriptionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateAppCatalogSubscriptionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.CreateAppCatalogSubscriptionDetails> {

    /**
     * Request for the creation of a subscription for listing resource version for a compartment.
     */
    private com.oracle.bmc.core.model.CreateAppCatalogSubscriptionDetails
            createAppCatalogSubscriptionDetails;

    /**
     * Request for the creation of a subscription for listing resource version for a compartment.
     */
    public com.oracle.bmc.core.model.CreateAppCatalogSubscriptionDetails
            getCreateAppCatalogSubscriptionDetails() {
        return createAppCatalogSubscriptionDetails;
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
    public com.oracle.bmc.core.model.CreateAppCatalogSubscriptionDetails getBody$() {
        return createAppCatalogSubscriptionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateAppCatalogSubscriptionRequest,
                    com.oracle.bmc.core.model.CreateAppCatalogSubscriptionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Request for the creation of a subscription for listing resource version for a
         * compartment.
         */
        private com.oracle.bmc.core.model.CreateAppCatalogSubscriptionDetails
                createAppCatalogSubscriptionDetails = null;

        /**
         * Request for the creation of a subscription for listing resource version for a
         * compartment.
         *
         * @param createAppCatalogSubscriptionDetails the value to set
         * @return this builder instance
         */
        public Builder createAppCatalogSubscriptionDetails(
                com.oracle.bmc.core.model.CreateAppCatalogSubscriptionDetails
                        createAppCatalogSubscriptionDetails) {
            this.createAppCatalogSubscriptionDetails = createAppCatalogSubscriptionDetails;
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
        public Builder copy(CreateAppCatalogSubscriptionRequest o) {
            createAppCatalogSubscriptionDetails(o.getCreateAppCatalogSubscriptionDetails());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateAppCatalogSubscriptionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateAppCatalogSubscriptionRequest
         */
        public CreateAppCatalogSubscriptionRequest build() {
            CreateAppCatalogSubscriptionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.CreateAppCatalogSubscriptionDetails body) {
            createAppCatalogSubscriptionDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateAppCatalogSubscriptionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateAppCatalogSubscriptionRequest
         */
        public CreateAppCatalogSubscriptionRequest buildWithoutInvocationCallback() {
            CreateAppCatalogSubscriptionRequest request = new CreateAppCatalogSubscriptionRequest();
            request.createAppCatalogSubscriptionDetails = createAppCatalogSubscriptionDetails;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateAppCatalogSubscriptionRequest(createAppCatalogSubscriptionDetails,
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
                .createAppCatalogSubscriptionDetails(createAppCatalogSubscriptionDetails)
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
        sb.append(",createAppCatalogSubscriptionDetails=")
                .append(String.valueOf(this.createAppCatalogSubscriptionDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAppCatalogSubscriptionRequest)) {
            return false;
        }

        CreateAppCatalogSubscriptionRequest other = (CreateAppCatalogSubscriptionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createAppCatalogSubscriptionDetails,
                        other.createAppCatalogSubscriptionDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createAppCatalogSubscriptionDetails == null
                                ? 43
                                : this.createAppCatalogSubscriptionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
