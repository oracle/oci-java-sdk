/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/CreateDigitalAssistantExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateDigitalAssistantRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class CreateDigitalAssistantRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.oda.model.CreateDigitalAssistantDetails> {

    /** Unique Digital Assistant instance identifier. */
    private String odaInstanceId;

    /** Unique Digital Assistant instance identifier. */
    public String getOdaInstanceId() {
        return odaInstanceId;
    }
    /** Property values for creating the new Digital Assistant. */
    private com.oracle.bmc.oda.model.CreateDigitalAssistantDetails createDigitalAssistantDetails;

    /** Property values for creating the new Digital Assistant. */
    public com.oracle.bmc.oda.model.CreateDigitalAssistantDetails
            getCreateDigitalAssistantDetails() {
        return createDigitalAssistantDetails;
    }
    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so that you can retry the request if there's a
     * timeout or server error without the risk of executing that same action again.
     *
     * <p>Retry tokens expire after 24 hours, but they can become invalid before then if there are
     * conflicting operations. For example, if an instance was deleted and purged from the system,
     * then the service might reject a retry of the original creation request.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so that you can retry the request if there's a
     * timeout or server error without the risk of executing that same action again.
     *
     * <p>Retry tokens expire after 24 hours, but they can become invalid before then if there are
     * conflicting operations. For example, if an instance was deleted and purged from the system,
     * then the service might reject a retry of the original creation request.
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
    public com.oracle.bmc.oda.model.CreateDigitalAssistantDetails getBody$() {
        return createDigitalAssistantDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateDigitalAssistantRequest,
                    com.oracle.bmc.oda.model.CreateDigitalAssistantDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Digital Assistant instance identifier. */
        private String odaInstanceId = null;

        /**
         * Unique Digital Assistant instance identifier.
         *
         * @param odaInstanceId the value to set
         * @return this builder instance
         */
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            return this;
        }

        /** Property values for creating the new Digital Assistant. */
        private com.oracle.bmc.oda.model.CreateDigitalAssistantDetails
                createDigitalAssistantDetails = null;

        /**
         * Property values for creating the new Digital Assistant.
         *
         * @param createDigitalAssistantDetails the value to set
         * @return this builder instance
         */
        public Builder createDigitalAssistantDetails(
                com.oracle.bmc.oda.model.CreateDigitalAssistantDetails
                        createDigitalAssistantDetails) {
            this.createDigitalAssistantDetails = createDigitalAssistantDetails;
            return this;
        }

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so that you can retry the request if there's a
         * timeout or server error without the risk of executing that same action again.
         *
         * <p>Retry tokens expire after 24 hours, but they can become invalid before then if there
         * are conflicting operations. For example, if an instance was deleted and purged from the
         * system, then the service might reject a retry of the original creation request.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so that you can retry the request if there's a
         * timeout or server error without the risk of executing that same action again.
         *
         * <p>Retry tokens expire after 24 hours, but they can become invalid before then if there
         * are conflicting operations. For example, if an instance was deleted and purged from the
         * system, then the service might reject a retry of the original creation request.
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
        public Builder copy(CreateDigitalAssistantRequest o) {
            odaInstanceId(o.getOdaInstanceId());
            createDigitalAssistantDetails(o.getCreateDigitalAssistantDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateDigitalAssistantRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateDigitalAssistantRequest
         */
        public CreateDigitalAssistantRequest build() {
            CreateDigitalAssistantRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.oda.model.CreateDigitalAssistantDetails body) {
            createDigitalAssistantDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateDigitalAssistantRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateDigitalAssistantRequest
         */
        public CreateDigitalAssistantRequest buildWithoutInvocationCallback() {
            CreateDigitalAssistantRequest request = new CreateDigitalAssistantRequest();
            request.odaInstanceId = odaInstanceId;
            request.createDigitalAssistantDetails = createDigitalAssistantDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateDigitalAssistantRequest(odaInstanceId, createDigitalAssistantDetails,
            // opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .odaInstanceId(odaInstanceId)
                .createDigitalAssistantDetails(createDigitalAssistantDetails)
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
        sb.append(",odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(",createDigitalAssistantDetails=")
                .append(String.valueOf(this.createDigitalAssistantDetails));
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
        if (!(o instanceof CreateDigitalAssistantRequest)) {
            return false;
        }

        CreateDigitalAssistantRequest other = (CreateDigitalAssistantRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(
                        this.createDigitalAssistantDetails, other.createDigitalAssistantDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.odaInstanceId == null ? 43 : this.odaInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.createDigitalAssistantDetails == null
                                ? 43
                                : this.createDigitalAssistantDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
