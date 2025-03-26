/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.requests;

import com.oracle.bmc.desktops.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/desktops/CreateDesktopPoolExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateDesktopPoolRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
public class CreateDesktopPoolRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.desktops.model.CreateDesktopPoolDetails> {

    /**
     * The details of the desktop pool to create.
     */
    private com.oracle.bmc.desktops.model.CreateDesktopPoolDetails createDesktopPoolDetails;

    /**
     * The details of the desktop pool to create.
     */
    public com.oracle.bmc.desktops.model.CreateDesktopPoolDetails getCreateDesktopPoolDetails() {
        return createDesktopPoolDetails;
    }
    /**
     * A token that uniquely identifies a request.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * The unique identifier of the request.
     */
    private String opcRequestId;

    /**
     * The unique identifier of the request.
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
    public com.oracle.bmc.desktops.model.CreateDesktopPoolDetails getBody$() {
        return createDesktopPoolDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateDesktopPoolRequest,
                    com.oracle.bmc.desktops.model.CreateDesktopPoolDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The details of the desktop pool to create.
         */
        private com.oracle.bmc.desktops.model.CreateDesktopPoolDetails createDesktopPoolDetails =
                null;

        /**
         * The details of the desktop pool to create.
         * @param createDesktopPoolDetails the value to set
         * @return this builder instance
         */
        public Builder createDesktopPoolDetails(
                com.oracle.bmc.desktops.model.CreateDesktopPoolDetails createDesktopPoolDetails) {
            this.createDesktopPoolDetails = createDesktopPoolDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request.
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * The unique identifier of the request.
         */
        private String opcRequestId = null;

        /**
         * The unique identifier of the request.
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
        public Builder copy(CreateDesktopPoolRequest o) {
            createDesktopPoolDetails(o.getCreateDesktopPoolDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateDesktopPoolRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateDesktopPoolRequest
         */
        public CreateDesktopPoolRequest build() {
            CreateDesktopPoolRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.desktops.model.CreateDesktopPoolDetails body) {
            createDesktopPoolDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateDesktopPoolRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateDesktopPoolRequest
         */
        public CreateDesktopPoolRequest buildWithoutInvocationCallback() {
            CreateDesktopPoolRequest request = new CreateDesktopPoolRequest();
            request.createDesktopPoolDetails = createDesktopPoolDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateDesktopPoolRequest(createDesktopPoolDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createDesktopPoolDetails(createDesktopPoolDetails)
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
        sb.append(",createDesktopPoolDetails=")
                .append(String.valueOf(this.createDesktopPoolDetails));
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
        if (!(o instanceof CreateDesktopPoolRequest)) {
            return false;
        }

        CreateDesktopPoolRequest other = (CreateDesktopPoolRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createDesktopPoolDetails, other.createDesktopPoolDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createDesktopPoolDetails == null
                                ? 43
                                : this.createDesktopPoolDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
