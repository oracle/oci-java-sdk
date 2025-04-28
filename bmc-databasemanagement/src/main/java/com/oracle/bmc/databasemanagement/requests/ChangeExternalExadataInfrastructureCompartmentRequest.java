/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangeExternalExadataInfrastructureCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeExternalExadataInfrastructureCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ChangeExternalExadataInfrastructureCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model
                        .ChangeExternalExadataInfrastructureCompartmentDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata infrastructure.
     */
    private String externalExadataInfrastructureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata infrastructure.
     */
    public String getExternalExadataInfrastructureId() {
        return externalExadataInfrastructureId;
    }
    /** The details required to move the Exadata infrastructure from one compartment to another. */
    private com.oracle.bmc.databasemanagement.model
                    .ChangeExternalExadataInfrastructureCompartmentDetails
            changeExternalExadataInfrastructureCompartmentDetails;

    /** The details required to move the Exadata infrastructure from one compartment to another. */
    public com.oracle.bmc.databasemanagement.model
                    .ChangeExternalExadataInfrastructureCompartmentDetails
            getChangeExternalExadataInfrastructureCompartmentDetails() {
        return changeExternalExadataInfrastructureCompartmentDetails;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasemanagement.model
                    .ChangeExternalExadataInfrastructureCompartmentDetails
            getBody$() {
        return changeExternalExadataInfrastructureCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeExternalExadataInfrastructureCompartmentRequest,
                    com.oracle.bmc.databasemanagement.model
                            .ChangeExternalExadataInfrastructureCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata infrastructure.
         */
        private String externalExadataInfrastructureId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata infrastructure.
         *
         * @param externalExadataInfrastructureId the value to set
         * @return this builder instance
         */
        public Builder externalExadataInfrastructureId(String externalExadataInfrastructureId) {
            this.externalExadataInfrastructureId = externalExadataInfrastructureId;
            return this;
        }

        /**
         * The details required to move the Exadata infrastructure from one compartment to another.
         */
        private com.oracle.bmc.databasemanagement.model
                        .ChangeExternalExadataInfrastructureCompartmentDetails
                changeExternalExadataInfrastructureCompartmentDetails = null;

        /**
         * The details required to move the Exadata infrastructure from one compartment to another.
         *
         * @param changeExternalExadataInfrastructureCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeExternalExadataInfrastructureCompartmentDetails(
                com.oracle.bmc.databasemanagement.model
                                .ChangeExternalExadataInfrastructureCompartmentDetails
                        changeExternalExadataInfrastructureCompartmentDetails) {
            this.changeExternalExadataInfrastructureCompartmentDetails =
                    changeExternalExadataInfrastructureCompartmentDetails;
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
        public Builder copy(ChangeExternalExadataInfrastructureCompartmentRequest o) {
            externalExadataInfrastructureId(o.getExternalExadataInfrastructureId());
            changeExternalExadataInfrastructureCompartmentDetails(
                    o.getChangeExternalExadataInfrastructureCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeExternalExadataInfrastructureCompartmentRequest as configured
         * by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeExternalExadataInfrastructureCompartmentRequest
         */
        public ChangeExternalExadataInfrastructureCompartmentRequest build() {
            ChangeExternalExadataInfrastructureCompartmentRequest request =
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
                com.oracle.bmc.databasemanagement.model
                                .ChangeExternalExadataInfrastructureCompartmentDetails
                        body) {
            changeExternalExadataInfrastructureCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeExternalExadataInfrastructureCompartmentRequest as configured
         * by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeExternalExadataInfrastructureCompartmentRequest
         */
        public ChangeExternalExadataInfrastructureCompartmentRequest
                buildWithoutInvocationCallback() {
            ChangeExternalExadataInfrastructureCompartmentRequest request =
                    new ChangeExternalExadataInfrastructureCompartmentRequest();
            request.externalExadataInfrastructureId = externalExadataInfrastructureId;
            request.changeExternalExadataInfrastructureCompartmentDetails =
                    changeExternalExadataInfrastructureCompartmentDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new
            // ChangeExternalExadataInfrastructureCompartmentRequest(externalExadataInfrastructureId, changeExternalExadataInfrastructureCompartmentDetails, opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .externalExadataInfrastructureId(externalExadataInfrastructureId)
                .changeExternalExadataInfrastructureCompartmentDetails(
                        changeExternalExadataInfrastructureCompartmentDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .ifMatch(ifMatch);
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
        sb.append(",externalExadataInfrastructureId=")
                .append(String.valueOf(this.externalExadataInfrastructureId));
        sb.append(",changeExternalExadataInfrastructureCompartmentDetails=")
                .append(String.valueOf(this.changeExternalExadataInfrastructureCompartmentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeExternalExadataInfrastructureCompartmentRequest)) {
            return false;
        }

        ChangeExternalExadataInfrastructureCompartmentRequest other =
                (ChangeExternalExadataInfrastructureCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.externalExadataInfrastructureId, other.externalExadataInfrastructureId)
                && java.util.Objects.equals(
                        this.changeExternalExadataInfrastructureCompartmentDetails,
                        other.changeExternalExadataInfrastructureCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.externalExadataInfrastructureId == null
                                ? 43
                                : this.externalExadataInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeExternalExadataInfrastructureCompartmentDetails == null
                                ? 43
                                : this.changeExternalExadataInfrastructureCompartmentDetails
                                        .hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
