/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.requests;

import com.oracle.bmc.fusionapps.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/CreateEmailSubdomainExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateEmailSubdomainRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public class CreateEmailSubdomainRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.fusionapps.model.CreateEmailSubdomainDetails> {

    /**
     * unique FusionEnvironment identifier
     */
    private String fusionEnvironmentId;

    /**
     * unique FusionEnvironment identifier
     */
    public String getFusionEnvironmentId() {
        return fusionEnvironmentId;
    }
    /**
     * unique brand identifier
     */
    private String marketingBrandId;

    /**
     * unique brand identifier
     */
    public String getMarketingBrandId() {
        return marketingBrandId;
    }
    /**
     * Details for the new email subdomain
     */
    private com.oracle.bmc.fusionapps.model.CreateEmailSubdomainDetails createEmailSubdomainDetails;

    /**
     * Details for the new email subdomain
     */
    public com.oracle.bmc.fusionapps.model.CreateEmailSubdomainDetails
            getCreateEmailSubdomainDetails() {
        return createEmailSubdomainDetails;
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
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
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
    public com.oracle.bmc.fusionapps.model.CreateEmailSubdomainDetails getBody$() {
        return createEmailSubdomainDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateEmailSubdomainRequest,
                    com.oracle.bmc.fusionapps.model.CreateEmailSubdomainDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * unique FusionEnvironment identifier
         */
        private String fusionEnvironmentId = null;

        /**
         * unique FusionEnvironment identifier
         * @param fusionEnvironmentId the value to set
         * @return this builder instance
         */
        public Builder fusionEnvironmentId(String fusionEnvironmentId) {
            this.fusionEnvironmentId = fusionEnvironmentId;
            return this;
        }

        /**
         * unique brand identifier
         */
        private String marketingBrandId = null;

        /**
         * unique brand identifier
         * @param marketingBrandId the value to set
         * @return this builder instance
         */
        public Builder marketingBrandId(String marketingBrandId) {
            this.marketingBrandId = marketingBrandId;
            return this;
        }

        /**
         * Details for the new email subdomain
         */
        private com.oracle.bmc.fusionapps.model.CreateEmailSubdomainDetails
                createEmailSubdomainDetails = null;

        /**
         * Details for the new email subdomain
         * @param createEmailSubdomainDetails the value to set
         * @return this builder instance
         */
        public Builder createEmailSubdomainDetails(
                com.oracle.bmc.fusionapps.model.CreateEmailSubdomainDetails
                        createEmailSubdomainDetails) {
            this.createEmailSubdomainDetails = createEmailSubdomainDetails;
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
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(CreateEmailSubdomainRequest o) {
            fusionEnvironmentId(o.getFusionEnvironmentId());
            marketingBrandId(o.getMarketingBrandId());
            createEmailSubdomainDetails(o.getCreateEmailSubdomainDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateEmailSubdomainRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateEmailSubdomainRequest
         */
        public CreateEmailSubdomainRequest build() {
            CreateEmailSubdomainRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.fusionapps.model.CreateEmailSubdomainDetails body) {
            createEmailSubdomainDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateEmailSubdomainRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateEmailSubdomainRequest
         */
        public CreateEmailSubdomainRequest buildWithoutInvocationCallback() {
            CreateEmailSubdomainRequest request = new CreateEmailSubdomainRequest();
            request.fusionEnvironmentId = fusionEnvironmentId;
            request.marketingBrandId = marketingBrandId;
            request.createEmailSubdomainDetails = createEmailSubdomainDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateEmailSubdomainRequest(fusionEnvironmentId, marketingBrandId, createEmailSubdomainDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .fusionEnvironmentId(fusionEnvironmentId)
                .marketingBrandId(marketingBrandId)
                .createEmailSubdomainDetails(createEmailSubdomainDetails)
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
        sb.append(",fusionEnvironmentId=").append(String.valueOf(this.fusionEnvironmentId));
        sb.append(",marketingBrandId=").append(String.valueOf(this.marketingBrandId));
        sb.append(",createEmailSubdomainDetails=")
                .append(String.valueOf(this.createEmailSubdomainDetails));
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
        if (!(o instanceof CreateEmailSubdomainRequest)) {
            return false;
        }

        CreateEmailSubdomainRequest other = (CreateEmailSubdomainRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fusionEnvironmentId, other.fusionEnvironmentId)
                && java.util.Objects.equals(this.marketingBrandId, other.marketingBrandId)
                && java.util.Objects.equals(
                        this.createEmailSubdomainDetails, other.createEmailSubdomainDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.fusionEnvironmentId == null
                                ? 43
                                : this.fusionEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.marketingBrandId == null ? 43 : this.marketingBrandId.hashCode());
        result =
                (result * PRIME)
                        + (this.createEmailSubdomainDetails == null
                                ? 43
                                : this.createEmailSubdomainDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
