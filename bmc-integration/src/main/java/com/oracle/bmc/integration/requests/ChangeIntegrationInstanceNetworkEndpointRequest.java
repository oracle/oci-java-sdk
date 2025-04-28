/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.requests;

import com.oracle.bmc.integration.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/integration/ChangeIntegrationInstanceNetworkEndpointExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeIntegrationInstanceNetworkEndpointRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
public class ChangeIntegrationInstanceNetworkEndpointRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.integration.model.ChangeIntegrationInstanceNetworkEndpointDetails> {

    /** Unique Integration Instance identifier. */
    private String integrationInstanceId;

    /** Unique Integration Instance identifier. */
    public String getIntegrationInstanceId() {
        return integrationInstanceId;
    }
    /** Details for the updated Integration instance network endpoint */
    private com.oracle.bmc.integration.model.ChangeIntegrationInstanceNetworkEndpointDetails
            changeIntegrationInstanceNetworkEndpointDetails;

    /** Details for the updated Integration instance network endpoint */
    public com.oracle.bmc.integration.model.ChangeIntegrationInstanceNetworkEndpointDetails
            getChangeIntegrationInstanceNetworkEndpointDetails() {
        return changeIntegrationInstanceNetworkEndpointDetails;
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
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.integration.model.ChangeIntegrationInstanceNetworkEndpointDetails
            getBody$() {
        return changeIntegrationInstanceNetworkEndpointDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeIntegrationInstanceNetworkEndpointRequest,
                    com.oracle.bmc.integration.model
                            .ChangeIntegrationInstanceNetworkEndpointDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Integration Instance identifier. */
        private String integrationInstanceId = null;

        /**
         * Unique Integration Instance identifier.
         *
         * @param integrationInstanceId the value to set
         * @return this builder instance
         */
        public Builder integrationInstanceId(String integrationInstanceId) {
            this.integrationInstanceId = integrationInstanceId;
            return this;
        }

        /** Details for the updated Integration instance network endpoint */
        private com.oracle.bmc.integration.model.ChangeIntegrationInstanceNetworkEndpointDetails
                changeIntegrationInstanceNetworkEndpointDetails = null;

        /**
         * Details for the updated Integration instance network endpoint
         *
         * @param changeIntegrationInstanceNetworkEndpointDetails the value to set
         * @return this builder instance
         */
        public Builder changeIntegrationInstanceNetworkEndpointDetails(
                com.oracle.bmc.integration.model.ChangeIntegrationInstanceNetworkEndpointDetails
                        changeIntegrationInstanceNetworkEndpointDetails) {
            this.changeIntegrationInstanceNetworkEndpointDetails =
                    changeIntegrationInstanceNetworkEndpointDetails;
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
        public Builder copy(ChangeIntegrationInstanceNetworkEndpointRequest o) {
            integrationInstanceId(o.getIntegrationInstanceId());
            changeIntegrationInstanceNetworkEndpointDetails(
                    o.getChangeIntegrationInstanceNetworkEndpointDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeIntegrationInstanceNetworkEndpointRequest as configured by
         * this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeIntegrationInstanceNetworkEndpointRequest
         */
        public ChangeIntegrationInstanceNetworkEndpointRequest build() {
            ChangeIntegrationInstanceNetworkEndpointRequest request =
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
                com.oracle.bmc.integration.model.ChangeIntegrationInstanceNetworkEndpointDetails
                        body) {
            changeIntegrationInstanceNetworkEndpointDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeIntegrationInstanceNetworkEndpointRequest as configured by
         * this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeIntegrationInstanceNetworkEndpointRequest
         */
        public ChangeIntegrationInstanceNetworkEndpointRequest buildWithoutInvocationCallback() {
            ChangeIntegrationInstanceNetworkEndpointRequest request =
                    new ChangeIntegrationInstanceNetworkEndpointRequest();
            request.integrationInstanceId = integrationInstanceId;
            request.changeIntegrationInstanceNetworkEndpointDetails =
                    changeIntegrationInstanceNetworkEndpointDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeIntegrationInstanceNetworkEndpointRequest(integrationInstanceId,
            // changeIntegrationInstanceNetworkEndpointDetails, ifMatch, opcRequestId,
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
                .integrationInstanceId(integrationInstanceId)
                .changeIntegrationInstanceNetworkEndpointDetails(
                        changeIntegrationInstanceNetworkEndpointDetails)
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
        sb.append(",integrationInstanceId=").append(String.valueOf(this.integrationInstanceId));
        sb.append(",changeIntegrationInstanceNetworkEndpointDetails=")
                .append(String.valueOf(this.changeIntegrationInstanceNetworkEndpointDetails));
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
        if (!(o instanceof ChangeIntegrationInstanceNetworkEndpointRequest)) {
            return false;
        }

        ChangeIntegrationInstanceNetworkEndpointRequest other =
                (ChangeIntegrationInstanceNetworkEndpointRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.integrationInstanceId, other.integrationInstanceId)
                && java.util.Objects.equals(
                        this.changeIntegrationInstanceNetworkEndpointDetails,
                        other.changeIntegrationInstanceNetworkEndpointDetails)
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
                        + (this.integrationInstanceId == null
                                ? 43
                                : this.integrationInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeIntegrationInstanceNetworkEndpointDetails == null
                                ? 43
                                : this.changeIntegrationInstanceNetworkEndpointDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
