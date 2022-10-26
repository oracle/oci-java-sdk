/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmcontrolplane.requests;

import com.oracle.bmc.apmcontrolplane.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmcontrolplane/ChangeApmDomainCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeApmDomainCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ChangeApmDomainCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.apmcontrolplane.model.ChangeApmDomainCompartmentDetails> {

    /** The OCID of the APM domain. */
    private String apmDomainId;

    /** The OCID of the APM domain. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /** The information to be used in changing compartment. */
    private com.oracle.bmc.apmcontrolplane.model.ChangeApmDomainCompartmentDetails
            changeApmDomainCompartmentDetails;

    /** The information to be used in changing compartment. */
    public com.oracle.bmc.apmcontrolplane.model.ChangeApmDomainCompartmentDetails
            getChangeApmDomainCompartmentDetails() {
        return changeApmDomainCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. Set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource. The resource will be updated or
     * deleted only if the etag you provide matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. Set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource. The resource will be updated or
     * deleted only if the etag you provide matches the resource's current etag value.
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
     * A token that uniquely identifies a request therefore it can be retried in case of a timeout
     * or server error without risk of executing that same action again. Retry tokens expire after
     * 24 hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request therefore it can be retried in case of a timeout
     * or server error without risk of executing that same action again. Retry tokens expire after
     * 24 hours, but can be invalidated before then due to conflicting operations. For example, if a
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
    public com.oracle.bmc.apmcontrolplane.model.ChangeApmDomainCompartmentDetails getBody$() {
        return changeApmDomainCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeApmDomainCompartmentRequest,
                    com.oracle.bmc.apmcontrolplane.model.ChangeApmDomainCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the APM domain. */
        private String apmDomainId = null;

        /**
         * The OCID of the APM domain.
         *
         * @param apmDomainId the value to set
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        /** The information to be used in changing compartment. */
        private com.oracle.bmc.apmcontrolplane.model.ChangeApmDomainCompartmentDetails
                changeApmDomainCompartmentDetails = null;

        /**
         * The information to be used in changing compartment.
         *
         * @param changeApmDomainCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeApmDomainCompartmentDetails(
                com.oracle.bmc.apmcontrolplane.model.ChangeApmDomainCompartmentDetails
                        changeApmDomainCompartmentDetails) {
            this.changeApmDomainCompartmentDetails = changeApmDomainCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. Set the {@code if-match} parameter to the value of
         * the etag from a previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's current etag
         * value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. Set the {@code if-match} parameter to the value of
         * the etag from a previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's current etag
         * value.
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
         * A token that uniquely identifies a request therefore it can be retried in case of a
         * timeout or server error without risk of executing that same action again. Retry tokens
         * expire after 24 hours, but can be invalidated before then due to conflicting operations.
         * For example, if a resource has been deleted and purged from the system, then a retry of
         * the original creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request therefore it can be retried in case of a
         * timeout or server error without risk of executing that same action again. Retry tokens
         * expire after 24 hours, but can be invalidated before then due to conflicting operations.
         * For example, if a resource has been deleted and purged from the system, then a retry of
         * the original creation request might be rejected.
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
        public Builder copy(ChangeApmDomainCompartmentRequest o) {
            apmDomainId(o.getApmDomainId());
            changeApmDomainCompartmentDetails(o.getChangeApmDomainCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeApmDomainCompartmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeApmDomainCompartmentRequest
         */
        public ChangeApmDomainCompartmentRequest build() {
            ChangeApmDomainCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.apmcontrolplane.model.ChangeApmDomainCompartmentDetails body) {
            changeApmDomainCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeApmDomainCompartmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeApmDomainCompartmentRequest
         */
        public ChangeApmDomainCompartmentRequest buildWithoutInvocationCallback() {
            ChangeApmDomainCompartmentRequest request = new ChangeApmDomainCompartmentRequest();
            request.apmDomainId = apmDomainId;
            request.changeApmDomainCompartmentDetails = changeApmDomainCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeApmDomainCompartmentRequest(apmDomainId, changeApmDomainCompartmentDetails,
            // ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .changeApmDomainCompartmentDetails(changeApmDomainCompartmentDetails)
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",changeApmDomainCompartmentDetails=")
                .append(String.valueOf(this.changeApmDomainCompartmentDetails));
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
        if (!(o instanceof ChangeApmDomainCompartmentRequest)) {
            return false;
        }

        ChangeApmDomainCompartmentRequest other = (ChangeApmDomainCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(
                        this.changeApmDomainCompartmentDetails,
                        other.changeApmDomainCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeApmDomainCompartmentDetails == null
                                ? 43
                                : this.changeApmDomainCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
