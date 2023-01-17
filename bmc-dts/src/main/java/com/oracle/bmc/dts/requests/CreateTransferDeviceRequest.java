/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.requests;

import com.oracle.bmc.dts.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/CreateTransferDeviceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateTransferDeviceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class CreateTransferDeviceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dts.model.CreateTransferDeviceDetails> {

    /** ID of the Transfer Job */
    private String id;

    /** ID of the Transfer Job */
    public String getId() {
        return id;
    }
    /** Creates a New Transfer Device */
    private com.oracle.bmc.dts.model.CreateTransferDeviceDetails createTransferDeviceDetails;

    /** Creates a New Transfer Device */
    public com.oracle.bmc.dts.model.CreateTransferDeviceDetails getCreateTransferDeviceDetails() {
        return createTransferDeviceDetails;
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
    public com.oracle.bmc.dts.model.CreateTransferDeviceDetails getBody$() {
        return createTransferDeviceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateTransferDeviceRequest,
                    com.oracle.bmc.dts.model.CreateTransferDeviceDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** ID of the Transfer Job */
        private String id = null;

        /**
         * ID of the Transfer Job
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /** Creates a New Transfer Device */
        private com.oracle.bmc.dts.model.CreateTransferDeviceDetails createTransferDeviceDetails =
                null;

        /**
         * Creates a New Transfer Device
         *
         * @param createTransferDeviceDetails the value to set
         * @return this builder instance
         */
        public Builder createTransferDeviceDetails(
                com.oracle.bmc.dts.model.CreateTransferDeviceDetails createTransferDeviceDetails) {
            this.createTransferDeviceDetails = createTransferDeviceDetails;
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
        public Builder copy(CreateTransferDeviceRequest o) {
            id(o.getId());
            createTransferDeviceDetails(o.getCreateTransferDeviceDetails());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateTransferDeviceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateTransferDeviceRequest
         */
        public CreateTransferDeviceRequest build() {
            CreateTransferDeviceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dts.model.CreateTransferDeviceDetails body) {
            createTransferDeviceDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateTransferDeviceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateTransferDeviceRequest
         */
        public CreateTransferDeviceRequest buildWithoutInvocationCallback() {
            CreateTransferDeviceRequest request = new CreateTransferDeviceRequest();
            request.id = id;
            request.createTransferDeviceDetails = createTransferDeviceDetails;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateTransferDeviceRequest(id, createTransferDeviceDetails, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .id(id)
                .createTransferDeviceDetails(createTransferDeviceDetails)
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
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",createTransferDeviceDetails=")
                .append(String.valueOf(this.createTransferDeviceDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTransferDeviceRequest)) {
            return false;
        }

        CreateTransferDeviceRequest other = (CreateTransferDeviceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.createTransferDeviceDetails, other.createTransferDeviceDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.createTransferDeviceDetails == null
                                ? 43
                                : this.createTransferDeviceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
