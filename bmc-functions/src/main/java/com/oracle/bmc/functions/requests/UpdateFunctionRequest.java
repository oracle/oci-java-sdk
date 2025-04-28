/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.requests;

import com.oracle.bmc.functions.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/functions/UpdateFunctionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateFunctionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class UpdateFunctionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.functions.model.UpdateFunctionDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
     * function.
     */
    private String functionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
     * function.
     */
    public String getFunctionId() {
        return functionId;
    }
    /** The new function spec to apply */
    private com.oracle.bmc.functions.model.UpdateFunctionDetails updateFunctionDetails;

    /** The new function spec to apply */
    public com.oracle.bmc.functions.model.UpdateFunctionDetails getUpdateFunctionDetails() {
        return updateFunctionDetails;
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
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
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
    public com.oracle.bmc.functions.model.UpdateFunctionDetails getBody$() {
        return updateFunctionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateFunctionRequest, com.oracle.bmc.functions.model.UpdateFunctionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
         * function.
         */
        private String functionId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
         * function.
         *
         * @param functionId the value to set
         * @return this builder instance
         */
        public Builder functionId(String functionId) {
            this.functionId = functionId;
            return this;
        }

        /** The new function spec to apply */
        private com.oracle.bmc.functions.model.UpdateFunctionDetails updateFunctionDetails = null;

        /**
         * The new function spec to apply
         *
         * @param updateFunctionDetails the value to set
         * @return this builder instance
         */
        public Builder updateFunctionDetails(
                com.oracle.bmc.functions.model.UpdateFunctionDetails updateFunctionDetails) {
            this.updateFunctionDetails = updateFunctionDetails;
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
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
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
        public Builder copy(UpdateFunctionRequest o) {
            functionId(o.getFunctionId());
            updateFunctionDetails(o.getUpdateFunctionDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateFunctionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateFunctionRequest
         */
        public UpdateFunctionRequest build() {
            UpdateFunctionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.functions.model.UpdateFunctionDetails body) {
            updateFunctionDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateFunctionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateFunctionRequest
         */
        public UpdateFunctionRequest buildWithoutInvocationCallback() {
            UpdateFunctionRequest request = new UpdateFunctionRequest();
            request.functionId = functionId;
            request.updateFunctionDetails = updateFunctionDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateFunctionRequest(functionId, updateFunctionDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .functionId(functionId)
                .updateFunctionDetails(updateFunctionDetails)
                .ifMatch(ifMatch)
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
        sb.append(",functionId=").append(String.valueOf(this.functionId));
        sb.append(",updateFunctionDetails=").append(String.valueOf(this.updateFunctionDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateFunctionRequest)) {
            return false;
        }

        UpdateFunctionRequest other = (UpdateFunctionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.functionId, other.functionId)
                && java.util.Objects.equals(this.updateFunctionDetails, other.updateFunctionDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.functionId == null ? 43 : this.functionId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateFunctionDetails == null
                                ? 43
                                : this.updateFunctionDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
