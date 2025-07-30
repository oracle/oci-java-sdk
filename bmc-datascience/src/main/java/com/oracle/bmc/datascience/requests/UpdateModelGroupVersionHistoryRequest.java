/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/UpdateModelGroupVersionHistoryExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateModelGroupVersionHistoryRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class UpdateModelGroupVersionHistoryRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datascience.model.UpdateModelGroupVersionHistoryDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * modelGroupVersionHistory.
     */
    private String modelGroupVersionHistoryId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * modelGroupVersionHistory.
     */
    public String getModelGroupVersionHistoryId() {
        return modelGroupVersionHistoryId;
    }
    /** Details for updating a modelGroupVersionHistory. */
    private com.oracle.bmc.datascience.model.UpdateModelGroupVersionHistoryDetails
            updateModelGroupVersionHistoryDetails;

    /** Details for updating a modelGroupVersionHistory. */
    public com.oracle.bmc.datascience.model.UpdateModelGroupVersionHistoryDetails
            getUpdateModelGroupVersionHistoryDetails() {
        return updateModelGroupVersionHistoryDetails;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
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
    public com.oracle.bmc.datascience.model.UpdateModelGroupVersionHistoryDetails getBody$() {
        return updateModelGroupVersionHistoryDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateModelGroupVersionHistoryRequest,
                    com.oracle.bmc.datascience.model.UpdateModelGroupVersionHistoryDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * modelGroupVersionHistory.
         */
        private String modelGroupVersionHistoryId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * modelGroupVersionHistory.
         *
         * @param modelGroupVersionHistoryId the value to set
         * @return this builder instance
         */
        public Builder modelGroupVersionHistoryId(String modelGroupVersionHistoryId) {
            this.modelGroupVersionHistoryId = modelGroupVersionHistoryId;
            return this;
        }

        /** Details for updating a modelGroupVersionHistory. */
        private com.oracle.bmc.datascience.model.UpdateModelGroupVersionHistoryDetails
                updateModelGroupVersionHistoryDetails = null;

        /**
         * Details for updating a modelGroupVersionHistory.
         *
         * @param updateModelGroupVersionHistoryDetails the value to set
         * @return this builder instance
         */
        public Builder updateModelGroupVersionHistoryDetails(
                com.oracle.bmc.datascience.model.UpdateModelGroupVersionHistoryDetails
                        updateModelGroupVersionHistoryDetails) {
            this.updateModelGroupVersionHistoryDetails = updateModelGroupVersionHistoryDetails;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
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
         * for that resource. The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
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
        public Builder copy(UpdateModelGroupVersionHistoryRequest o) {
            modelGroupVersionHistoryId(o.getModelGroupVersionHistoryId());
            updateModelGroupVersionHistoryDetails(o.getUpdateModelGroupVersionHistoryDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateModelGroupVersionHistoryRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateModelGroupVersionHistoryRequest
         */
        public UpdateModelGroupVersionHistoryRequest build() {
            UpdateModelGroupVersionHistoryRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.datascience.model.UpdateModelGroupVersionHistoryDetails body) {
            updateModelGroupVersionHistoryDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateModelGroupVersionHistoryRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateModelGroupVersionHistoryRequest
         */
        public UpdateModelGroupVersionHistoryRequest buildWithoutInvocationCallback() {
            UpdateModelGroupVersionHistoryRequest request =
                    new UpdateModelGroupVersionHistoryRequest();
            request.modelGroupVersionHistoryId = modelGroupVersionHistoryId;
            request.updateModelGroupVersionHistoryDetails = updateModelGroupVersionHistoryDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateModelGroupVersionHistoryRequest(modelGroupVersionHistoryId,
            // updateModelGroupVersionHistoryDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .modelGroupVersionHistoryId(modelGroupVersionHistoryId)
                .updateModelGroupVersionHistoryDetails(updateModelGroupVersionHistoryDetails)
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
        sb.append(",modelGroupVersionHistoryId=")
                .append(String.valueOf(this.modelGroupVersionHistoryId));
        sb.append(",updateModelGroupVersionHistoryDetails=")
                .append(String.valueOf(this.updateModelGroupVersionHistoryDetails));
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
        if (!(o instanceof UpdateModelGroupVersionHistoryRequest)) {
            return false;
        }

        UpdateModelGroupVersionHistoryRequest other = (UpdateModelGroupVersionHistoryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.modelGroupVersionHistoryId, other.modelGroupVersionHistoryId)
                && java.util.Objects.equals(
                        this.updateModelGroupVersionHistoryDetails,
                        other.updateModelGroupVersionHistoryDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.modelGroupVersionHistoryId == null
                                ? 43
                                : this.modelGroupVersionHistoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateModelGroupVersionHistoryDetails == null
                                ? 43
                                : this.updateModelGroupVersionHistoryDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
