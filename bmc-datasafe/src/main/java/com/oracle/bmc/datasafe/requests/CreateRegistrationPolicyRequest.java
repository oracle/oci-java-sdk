/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateRegistrationPolicyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateRegistrationPolicyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class CreateRegistrationPolicyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.CreateRegistrationPolicyDetails> {

    /** Details of the Registration Policy */
    private com.oracle.bmc.datasafe.model.CreateRegistrationPolicyDetails
            createRegistrationPolicyDetails;

    /** Details of the Registration Policy */
    public com.oracle.bmc.datasafe.model.CreateRegistrationPolicyDetails
            getCreateRegistrationPolicyDetails() {
        return createRegistrationPolicyDetails;
    }
    /**
     * Indicates that the request is a dry run, if set to "true". A dry run request does not modify
     * the configuration item details and is used only to perform validation on the submitted data.
     */
    private Boolean opcDryRun;

    /**
     * Indicates that the request is a dry run, if set to "true". A dry run request does not modify
     * the configuration item details and is used only to perform validation on the submitted data.
     */
    public Boolean getOpcDryRun() {
        return opcDryRun;
    }
    /** Identifier of the cluster of the CDB associated to the registration policy being created. */
    private String xClusterId;

    /** Identifier of the cluster of the CDB associated to the registration policy being created. */
    public String getXClusterId() {
        return xClusterId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    public com.oracle.bmc.datasafe.model.CreateRegistrationPolicyDetails getBody$() {
        return createRegistrationPolicyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateRegistrationPolicyRequest,
                    com.oracle.bmc.datasafe.model.CreateRegistrationPolicyDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details of the Registration Policy */
        private com.oracle.bmc.datasafe.model.CreateRegistrationPolicyDetails
                createRegistrationPolicyDetails = null;

        /**
         * Details of the Registration Policy
         *
         * @param createRegistrationPolicyDetails the value to set
         * @return this builder instance
         */
        public Builder createRegistrationPolicyDetails(
                com.oracle.bmc.datasafe.model.CreateRegistrationPolicyDetails
                        createRegistrationPolicyDetails) {
            this.createRegistrationPolicyDetails = createRegistrationPolicyDetails;
            return this;
        }

        /**
         * Indicates that the request is a dry run, if set to "true". A dry run request does not
         * modify the configuration item details and is used only to perform validation on the
         * submitted data.
         */
        private Boolean opcDryRun = null;

        /**
         * Indicates that the request is a dry run, if set to "true". A dry run request does not
         * modify the configuration item details and is used only to perform validation on the
         * submitted data.
         *
         * @param opcDryRun the value to set
         * @return this builder instance
         */
        public Builder opcDryRun(Boolean opcDryRun) {
            this.opcDryRun = opcDryRun;
            return this;
        }

        /**
         * Identifier of the cluster of the CDB associated to the registration policy being created.
         */
        private String xClusterId = null;

        /**
         * Identifier of the cluster of the CDB associated to the registration policy being created.
         *
         * @param xClusterId the value to set
         * @return this builder instance
         */
        public Builder xClusterId(String xClusterId) {
            this.xClusterId = xClusterId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CreateRegistrationPolicyRequest o) {
            createRegistrationPolicyDetails(o.getCreateRegistrationPolicyDetails());
            opcDryRun(o.getOpcDryRun());
            xClusterId(o.getXClusterId());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateRegistrationPolicyRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateRegistrationPolicyRequest
         */
        public CreateRegistrationPolicyRequest build() {
            CreateRegistrationPolicyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.CreateRegistrationPolicyDetails body) {
            createRegistrationPolicyDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateRegistrationPolicyRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateRegistrationPolicyRequest
         */
        public CreateRegistrationPolicyRequest buildWithoutInvocationCallback() {
            CreateRegistrationPolicyRequest request = new CreateRegistrationPolicyRequest();
            request.createRegistrationPolicyDetails = createRegistrationPolicyDetails;
            request.opcDryRun = opcDryRun;
            request.xClusterId = xClusterId;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateRegistrationPolicyRequest(createRegistrationPolicyDetails, opcDryRun,
            // xClusterId, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createRegistrationPolicyDetails(createRegistrationPolicyDetails)
                .opcDryRun(opcDryRun)
                .xClusterId(xClusterId)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",createRegistrationPolicyDetails=")
                .append(String.valueOf(this.createRegistrationPolicyDetails));
        sb.append(",opcDryRun=").append(String.valueOf(this.opcDryRun));
        sb.append(",xClusterId=").append(String.valueOf(this.xClusterId));
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
        if (!(o instanceof CreateRegistrationPolicyRequest)) {
            return false;
        }

        CreateRegistrationPolicyRequest other = (CreateRegistrationPolicyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createRegistrationPolicyDetails, other.createRegistrationPolicyDetails)
                && java.util.Objects.equals(this.opcDryRun, other.opcDryRun)
                && java.util.Objects.equals(this.xClusterId, other.xClusterId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createRegistrationPolicyDetails == null
                                ? 43
                                : this.createRegistrationPolicyDetails.hashCode());
        result = (result * PRIME) + (this.opcDryRun == null ? 43 : this.opcDryRun.hashCode());
        result = (result * PRIME) + (this.xClusterId == null ? 43 : this.xClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
