/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.requests;

import com.oracle.bmc.generativeai.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/UpdateSemanticStoreExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateSemanticStoreRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class UpdateSemanticStoreRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.generativeai.model.UpdateSemanticStoreDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the SemanticStore.
     */
    private String semanticStoreId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the SemanticStore.
     */
    public String getSemanticStoreId() {
        return semanticStoreId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.generativeai.model.UpdateSemanticStoreDetails updateSemanticStoreDetails;

    /**
     * The information to be updated.
     */
    public com.oracle.bmc.generativeai.model.UpdateSemanticStoreDetails
            getUpdateSemanticStoreDetails() {
        return updateSemanticStoreDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous GET or POST response for
     * that resource. The resource will be updated or deleted only if the etag you provide
     * matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous GET or POST response for
     * that resource. The resource will be updated or deleted only if the etag you provide
     * matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
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
    public com.oracle.bmc.generativeai.model.UpdateSemanticStoreDetails getBody$() {
        return updateSemanticStoreDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateSemanticStoreRequest,
                    com.oracle.bmc.generativeai.model.UpdateSemanticStoreDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the SemanticStore.
         */
        private String semanticStoreId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the SemanticStore.
         * @param semanticStoreId the value to set
         * @return this builder instance
         */
        public Builder semanticStoreId(String semanticStoreId) {
            this.semanticStoreId = semanticStoreId;
            return this;
        }

        /**
         * The information to be updated.
         */
        private com.oracle.bmc.generativeai.model.UpdateSemanticStoreDetails
                updateSemanticStoreDetails = null;

        /**
         * The information to be updated.
         * @param updateSemanticStoreDetails the value to set
         * @return this builder instance
         */
        public Builder updateSemanticStoreDetails(
                com.oracle.bmc.generativeai.model.UpdateSemanticStoreDetails
                        updateSemanticStoreDetails) {
            this.updateSemanticStoreDetails = updateSemanticStoreDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response for
         * that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response for
         * that resource. The resource will be updated or deleted only if the etag you provide
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
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
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
        public Builder copy(UpdateSemanticStoreRequest o) {
            semanticStoreId(o.getSemanticStoreId());
            updateSemanticStoreDetails(o.getUpdateSemanticStoreDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateSemanticStoreRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateSemanticStoreRequest
         */
        public UpdateSemanticStoreRequest build() {
            UpdateSemanticStoreRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.generativeai.model.UpdateSemanticStoreDetails body) {
            updateSemanticStoreDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateSemanticStoreRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateSemanticStoreRequest
         */
        public UpdateSemanticStoreRequest buildWithoutInvocationCallback() {
            UpdateSemanticStoreRequest request = new UpdateSemanticStoreRequest();
            request.semanticStoreId = semanticStoreId;
            request.updateSemanticStoreDetails = updateSemanticStoreDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateSemanticStoreRequest(semanticStoreId, updateSemanticStoreDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .semanticStoreId(semanticStoreId)
                .updateSemanticStoreDetails(updateSemanticStoreDetails)
                .ifMatch(ifMatch)
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
        sb.append(",semanticStoreId=").append(String.valueOf(this.semanticStoreId));
        sb.append(",updateSemanticStoreDetails=")
                .append(String.valueOf(this.updateSemanticStoreDetails));
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
        if (!(o instanceof UpdateSemanticStoreRequest)) {
            return false;
        }

        UpdateSemanticStoreRequest other = (UpdateSemanticStoreRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.semanticStoreId, other.semanticStoreId)
                && java.util.Objects.equals(
                        this.updateSemanticStoreDetails, other.updateSemanticStoreDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.semanticStoreId == null ? 43 : this.semanticStoreId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateSemanticStoreDetails == null
                                ? 43
                                : this.updateSemanticStoreDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
