/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateCustomPropertyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateCustomPropertyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class CreateCustomPropertyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datacatalog.model.CreateCustomPropertyDetails> {

    /** Unique catalog identifier. */
    private String catalogId;

    /** Unique catalog identifier. */
    public String getCatalogId() {
        return catalogId;
    }
    /** Unique namespace identifier. */
    private String namespaceId;

    /** Unique namespace identifier. */
    public String getNamespaceId() {
        return namespaceId;
    }
    /** The information used to create the Custom Property. */
    private com.oracle.bmc.datacatalog.model.CreateCustomPropertyDetails
            createCustomPropertyDetails;

    /** The information used to create the Custom Property. */
    public com.oracle.bmc.datacatalog.model.CreateCustomPropertyDetails
            getCreateCustomPropertyDetails() {
        return createCustomPropertyDetails;
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
    public com.oracle.bmc.datacatalog.model.CreateCustomPropertyDetails getBody$() {
        return createCustomPropertyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateCustomPropertyRequest,
                    com.oracle.bmc.datacatalog.model.CreateCustomPropertyDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique catalog identifier. */
        private String catalogId = null;

        /**
         * Unique catalog identifier.
         *
         * @param catalogId the value to set
         * @return this builder instance
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /** Unique namespace identifier. */
        private String namespaceId = null;

        /**
         * Unique namespace identifier.
         *
         * @param namespaceId the value to set
         * @return this builder instance
         */
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        /** The information used to create the Custom Property. */
        private com.oracle.bmc.datacatalog.model.CreateCustomPropertyDetails
                createCustomPropertyDetails = null;

        /**
         * The information used to create the Custom Property.
         *
         * @param createCustomPropertyDetails the value to set
         * @return this builder instance
         */
        public Builder createCustomPropertyDetails(
                com.oracle.bmc.datacatalog.model.CreateCustomPropertyDetails
                        createCustomPropertyDetails) {
            this.createCustomPropertyDetails = createCustomPropertyDetails;
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
        public Builder copy(CreateCustomPropertyRequest o) {
            catalogId(o.getCatalogId());
            namespaceId(o.getNamespaceId());
            createCustomPropertyDetails(o.getCreateCustomPropertyDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateCustomPropertyRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateCustomPropertyRequest
         */
        public CreateCustomPropertyRequest build() {
            CreateCustomPropertyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datacatalog.model.CreateCustomPropertyDetails body) {
            createCustomPropertyDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateCustomPropertyRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateCustomPropertyRequest
         */
        public CreateCustomPropertyRequest buildWithoutInvocationCallback() {
            CreateCustomPropertyRequest request = new CreateCustomPropertyRequest();
            request.catalogId = catalogId;
            request.namespaceId = namespaceId;
            request.createCustomPropertyDetails = createCustomPropertyDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateCustomPropertyRequest(catalogId, namespaceId, createCustomPropertyDetails,
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
                .catalogId(catalogId)
                .namespaceId(namespaceId)
                .createCustomPropertyDetails(createCustomPropertyDetails)
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
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",namespaceId=").append(String.valueOf(this.namespaceId));
        sb.append(",createCustomPropertyDetails=")
                .append(String.valueOf(this.createCustomPropertyDetails));
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
        if (!(o instanceof CreateCustomPropertyRequest)) {
            return false;
        }

        CreateCustomPropertyRequest other = (CreateCustomPropertyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.namespaceId, other.namespaceId)
                && java.util.Objects.equals(
                        this.createCustomPropertyDetails, other.createCustomPropertyDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.namespaceId == null ? 43 : this.namespaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.createCustomPropertyDetails == null
                                ? 43
                                : this.createCustomPropertyDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
