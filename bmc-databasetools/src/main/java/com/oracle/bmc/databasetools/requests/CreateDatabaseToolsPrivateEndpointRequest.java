/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.requests;

import com.oracle.bmc.databasetools.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/CreateDatabaseToolsPrivateEndpointExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateDatabaseToolsPrivateEndpointRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
public class CreateDatabaseToolsPrivateEndpointRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasetools.model.CreateDatabaseToolsPrivateEndpointDetails> {

    /** Details for the new DatabaseToolsPrivateEndpoint. */
    private com.oracle.bmc.databasetools.model.CreateDatabaseToolsPrivateEndpointDetails
            createDatabaseToolsPrivateEndpointDetails;

    /** Details for the new DatabaseToolsPrivateEndpoint. */
    public com.oracle.bmc.databasetools.model.CreateDatabaseToolsPrivateEndpointDetails
            getCreateDatabaseToolsPrivateEndpointDetails() {
        return createDatabaseToolsPrivateEndpointDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     *
     * <p>Accepted characters: ASCII alphanumerics plus underscore (U+005F LOW LINE "_") and dash
     * (U+002D HYPHEN-MINUS "-")
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     *
     * <p>Accepted characters: ASCII alphanumerics plus underscore (U+005F LOW LINE "_") and dash
     * (U+002D HYPHEN-MINUS "-")
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    public com.oracle.bmc.databasetools.model.CreateDatabaseToolsPrivateEndpointDetails getBody$() {
        return createDatabaseToolsPrivateEndpointDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateDatabaseToolsPrivateEndpointRequest,
                    com.oracle.bmc.databasetools.model.CreateDatabaseToolsPrivateEndpointDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for the new DatabaseToolsPrivateEndpoint. */
        private com.oracle.bmc.databasetools.model.CreateDatabaseToolsPrivateEndpointDetails
                createDatabaseToolsPrivateEndpointDetails = null;

        /**
         * Details for the new DatabaseToolsPrivateEndpoint.
         *
         * @param createDatabaseToolsPrivateEndpointDetails the value to set
         * @return this builder instance
         */
        public Builder createDatabaseToolsPrivateEndpointDetails(
                com.oracle.bmc.databasetools.model.CreateDatabaseToolsPrivateEndpointDetails
                        createDatabaseToolsPrivateEndpointDetails) {
            this.createDatabaseToolsPrivateEndpointDetails =
                    createDatabaseToolsPrivateEndpointDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * <p>Accepted characters: ASCII alphanumerics plus underscore (U+005F LOW LINE "_") and
         * dash (U+002D HYPHEN-MINUS "-")
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * <p>Accepted characters: ASCII alphanumerics plus underscore (U+005F LOW LINE "_") and
         * dash (U+002D HYPHEN-MINUS "-")
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CreateDatabaseToolsPrivateEndpointRequest o) {
            createDatabaseToolsPrivateEndpointDetails(
                    o.getCreateDatabaseToolsPrivateEndpointDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateDatabaseToolsPrivateEndpointRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateDatabaseToolsPrivateEndpointRequest
         */
        public CreateDatabaseToolsPrivateEndpointRequest build() {
            CreateDatabaseToolsPrivateEndpointRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasetools.model.CreateDatabaseToolsPrivateEndpointDetails body) {
            createDatabaseToolsPrivateEndpointDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateDatabaseToolsPrivateEndpointRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateDatabaseToolsPrivateEndpointRequest
         */
        public CreateDatabaseToolsPrivateEndpointRequest buildWithoutInvocationCallback() {
            CreateDatabaseToolsPrivateEndpointRequest request =
                    new CreateDatabaseToolsPrivateEndpointRequest();
            request.createDatabaseToolsPrivateEndpointDetails =
                    createDatabaseToolsPrivateEndpointDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new
            // CreateDatabaseToolsPrivateEndpointRequest(createDatabaseToolsPrivateEndpointDetails,
            // opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createDatabaseToolsPrivateEndpointDetails(
                        createDatabaseToolsPrivateEndpointDetails)
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
        sb.append(",createDatabaseToolsPrivateEndpointDetails=")
                .append(String.valueOf(this.createDatabaseToolsPrivateEndpointDetails));
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
        if (!(o instanceof CreateDatabaseToolsPrivateEndpointRequest)) {
            return false;
        }

        CreateDatabaseToolsPrivateEndpointRequest other =
                (CreateDatabaseToolsPrivateEndpointRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createDatabaseToolsPrivateEndpointDetails,
                        other.createDatabaseToolsPrivateEndpointDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createDatabaseToolsPrivateEndpointDetails == null
                                ? 43
                                : this.createDatabaseToolsPrivateEndpointDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
