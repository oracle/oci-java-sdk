/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.requests;

import com.oracle.bmc.generativeai.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ChangeGenerativeAiPrivateEndpointCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeGenerativeAiPrivateEndpointCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class ChangeGenerativeAiPrivateEndpointCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.generativeai.model
                        .ChangeGenerativeAiPrivateEndpointCompartmentDetails> {

    /** The unique id for a Generative AI private endpoint. */
    private String generativeAiPrivateEndpointId;

    /** The unique id for a Generative AI private endpoint. */
    public String getGenerativeAiPrivateEndpointId() {
        return generativeAiPrivateEndpointId;
    }
    /** Details for changing a Generative AI private endpoint's compartment. */
    private com.oracle.bmc.generativeai.model.ChangeGenerativeAiPrivateEndpointCompartmentDetails
            changeGenerativeAiPrivateEndpointCompartmentDetails;

    /** Details for changing a Generative AI private endpoint's compartment. */
    public com.oracle.bmc.generativeai.model.ChangeGenerativeAiPrivateEndpointCompartmentDetails
            getChangeGenerativeAiPrivateEndpointCompartmentDetails() {
        return changeGenerativeAiPrivateEndpointCompartmentDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of running that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and removed from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of running that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and removed from the system, then a retry of the original creation
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
    public com.oracle.bmc.generativeai.model.ChangeGenerativeAiPrivateEndpointCompartmentDetails
            getBody$() {
        return changeGenerativeAiPrivateEndpointCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeGenerativeAiPrivateEndpointCompartmentRequest,
                    com.oracle.bmc.generativeai.model
                            .ChangeGenerativeAiPrivateEndpointCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique id for a Generative AI private endpoint. */
        private String generativeAiPrivateEndpointId = null;

        /**
         * The unique id for a Generative AI private endpoint.
         *
         * @param generativeAiPrivateEndpointId the value to set
         * @return this builder instance
         */
        public Builder generativeAiPrivateEndpointId(String generativeAiPrivateEndpointId) {
            this.generativeAiPrivateEndpointId = generativeAiPrivateEndpointId;
            return this;
        }

        /** Details for changing a Generative AI private endpoint's compartment. */
        private com.oracle.bmc.generativeai.model
                        .ChangeGenerativeAiPrivateEndpointCompartmentDetails
                changeGenerativeAiPrivateEndpointCompartmentDetails = null;

        /**
         * Details for changing a Generative AI private endpoint's compartment.
         *
         * @param changeGenerativeAiPrivateEndpointCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeGenerativeAiPrivateEndpointCompartmentDetails(
                com.oracle.bmc.generativeai.model
                                .ChangeGenerativeAiPrivateEndpointCompartmentDetails
                        changeGenerativeAiPrivateEndpointCompartmentDetails) {
            this.changeGenerativeAiPrivateEndpointCompartmentDetails =
                    changeGenerativeAiPrivateEndpointCompartmentDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of running that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if
         * a resource has been deleted and removed from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of running that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if
         * a resource has been deleted and removed from the system, then a retry of the original
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
        public Builder copy(ChangeGenerativeAiPrivateEndpointCompartmentRequest o) {
            generativeAiPrivateEndpointId(o.getGenerativeAiPrivateEndpointId());
            changeGenerativeAiPrivateEndpointCompartmentDetails(
                    o.getChangeGenerativeAiPrivateEndpointCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeGenerativeAiPrivateEndpointCompartmentRequest as configured
         * by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeGenerativeAiPrivateEndpointCompartmentRequest
         */
        public ChangeGenerativeAiPrivateEndpointCompartmentRequest build() {
            ChangeGenerativeAiPrivateEndpointCompartmentRequest request =
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
                com.oracle.bmc.generativeai.model
                                .ChangeGenerativeAiPrivateEndpointCompartmentDetails
                        body) {
            changeGenerativeAiPrivateEndpointCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeGenerativeAiPrivateEndpointCompartmentRequest as configured
         * by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeGenerativeAiPrivateEndpointCompartmentRequest
         */
        public ChangeGenerativeAiPrivateEndpointCompartmentRequest
                buildWithoutInvocationCallback() {
            ChangeGenerativeAiPrivateEndpointCompartmentRequest request =
                    new ChangeGenerativeAiPrivateEndpointCompartmentRequest();
            request.generativeAiPrivateEndpointId = generativeAiPrivateEndpointId;
            request.changeGenerativeAiPrivateEndpointCompartmentDetails =
                    changeGenerativeAiPrivateEndpointCompartmentDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new
            // ChangeGenerativeAiPrivateEndpointCompartmentRequest(generativeAiPrivateEndpointId,
            // changeGenerativeAiPrivateEndpointCompartmentDetails, opcRequestId, ifMatch,
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
                .generativeAiPrivateEndpointId(generativeAiPrivateEndpointId)
                .changeGenerativeAiPrivateEndpointCompartmentDetails(
                        changeGenerativeAiPrivateEndpointCompartmentDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
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
        sb.append(",generativeAiPrivateEndpointId=")
                .append(String.valueOf(this.generativeAiPrivateEndpointId));
        sb.append(",changeGenerativeAiPrivateEndpointCompartmentDetails=")
                .append(String.valueOf(this.changeGenerativeAiPrivateEndpointCompartmentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeGenerativeAiPrivateEndpointCompartmentRequest)) {
            return false;
        }

        ChangeGenerativeAiPrivateEndpointCompartmentRequest other =
                (ChangeGenerativeAiPrivateEndpointCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.generativeAiPrivateEndpointId, other.generativeAiPrivateEndpointId)
                && java.util.Objects.equals(
                        this.changeGenerativeAiPrivateEndpointCompartmentDetails,
                        other.changeGenerativeAiPrivateEndpointCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.generativeAiPrivateEndpointId == null
                                ? 43
                                : this.generativeAiPrivateEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeGenerativeAiPrivateEndpointCompartmentDetails == null
                                ? 43
                                : this.changeGenerativeAiPrivateEndpointCompartmentDetails
                                        .hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
