/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.requests;

import com.oracle.bmc.generativeai.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/UpdateGenerativeAiPrivateEndpointExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateGenerativeAiPrivateEndpointRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class UpdateGenerativeAiPrivateEndpointRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.generativeai.model.UpdateGenerativeAiPrivateEndpointDetails> {

    /** The unique id for a Generative AI private endpoint. */
    private String generativeAiPrivateEndpointId;

    /** The unique id for a Generative AI private endpoint. */
    public String getGenerativeAiPrivateEndpointId() {
        return generativeAiPrivateEndpointId;
    }
    /** Details for updating a Generative AI private endpoint. */
    private com.oracle.bmc.generativeai.model.UpdateGenerativeAiPrivateEndpointDetails
            updateGenerativeAiPrivateEndpointDetails;

    /** Details for updating a Generative AI private endpoint. */
    public com.oracle.bmc.generativeai.model.UpdateGenerativeAiPrivateEndpointDetails
            getUpdateGenerativeAiPrivateEndpointDetails() {
        return updateGenerativeAiPrivateEndpointDetails;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.generativeai.model.UpdateGenerativeAiPrivateEndpointDetails getBody$() {
        return updateGenerativeAiPrivateEndpointDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateGenerativeAiPrivateEndpointRequest,
                    com.oracle.bmc.generativeai.model.UpdateGenerativeAiPrivateEndpointDetails> {
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

        /** Details for updating a Generative AI private endpoint. */
        private com.oracle.bmc.generativeai.model.UpdateGenerativeAiPrivateEndpointDetails
                updateGenerativeAiPrivateEndpointDetails = null;

        /**
         * Details for updating a Generative AI private endpoint.
         *
         * @param updateGenerativeAiPrivateEndpointDetails the value to set
         * @return this builder instance
         */
        public Builder updateGenerativeAiPrivateEndpointDetails(
                com.oracle.bmc.generativeai.model.UpdateGenerativeAiPrivateEndpointDetails
                        updateGenerativeAiPrivateEndpointDetails) {
            this.updateGenerativeAiPrivateEndpointDetails =
                    updateGenerativeAiPrivateEndpointDetails;
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
        public Builder copy(UpdateGenerativeAiPrivateEndpointRequest o) {
            generativeAiPrivateEndpointId(o.getGenerativeAiPrivateEndpointId());
            updateGenerativeAiPrivateEndpointDetails(
                    o.getUpdateGenerativeAiPrivateEndpointDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateGenerativeAiPrivateEndpointRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateGenerativeAiPrivateEndpointRequest
         */
        public UpdateGenerativeAiPrivateEndpointRequest build() {
            UpdateGenerativeAiPrivateEndpointRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.generativeai.model.UpdateGenerativeAiPrivateEndpointDetails body) {
            updateGenerativeAiPrivateEndpointDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateGenerativeAiPrivateEndpointRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateGenerativeAiPrivateEndpointRequest
         */
        public UpdateGenerativeAiPrivateEndpointRequest buildWithoutInvocationCallback() {
            UpdateGenerativeAiPrivateEndpointRequest request =
                    new UpdateGenerativeAiPrivateEndpointRequest();
            request.generativeAiPrivateEndpointId = generativeAiPrivateEndpointId;
            request.updateGenerativeAiPrivateEndpointDetails =
                    updateGenerativeAiPrivateEndpointDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateGenerativeAiPrivateEndpointRequest(generativeAiPrivateEndpointId,
            // updateGenerativeAiPrivateEndpointDetails, opcRequestId, ifMatch);
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
                .updateGenerativeAiPrivateEndpointDetails(updateGenerativeAiPrivateEndpointDetails)
                .opcRequestId(opcRequestId)
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
        sb.append(",generativeAiPrivateEndpointId=")
                .append(String.valueOf(this.generativeAiPrivateEndpointId));
        sb.append(",updateGenerativeAiPrivateEndpointDetails=")
                .append(String.valueOf(this.updateGenerativeAiPrivateEndpointDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateGenerativeAiPrivateEndpointRequest)) {
            return false;
        }

        UpdateGenerativeAiPrivateEndpointRequest other =
                (UpdateGenerativeAiPrivateEndpointRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.generativeAiPrivateEndpointId, other.generativeAiPrivateEndpointId)
                && java.util.Objects.equals(
                        this.updateGenerativeAiPrivateEndpointDetails,
                        other.updateGenerativeAiPrivateEndpointDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
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
                        + (this.updateGenerativeAiPrivateEndpointDetails == null
                                ? 43
                                : this.updateGenerativeAiPrivateEndpointDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
