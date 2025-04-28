/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExternalContainerDatabaseExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateExternalContainerDatabaseRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateExternalContainerDatabaseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdateExternalContainerDatabaseDetails> {

    /**
     * The ExternalContainerDatabase
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String externalContainerDatabaseId;

    /**
     * The ExternalContainerDatabase
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getExternalContainerDatabaseId() {
        return externalContainerDatabaseId;
    }
    /**
     * Request to update the properties of an {@link
     * #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest)
     * createExternalContainerDatabaseDetails} resource.
     */
    private com.oracle.bmc.database.model.UpdateExternalContainerDatabaseDetails
            updateExternalContainerDatabaseDetails;

    /**
     * Request to update the properties of an {@link
     * #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest)
     * createExternalContainerDatabaseDetails} resource.
     */
    public com.oracle.bmc.database.model.UpdateExternalContainerDatabaseDetails
            getUpdateExternalContainerDatabaseDetails() {
        return updateExternalContainerDatabaseDetails;
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
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
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
    public com.oracle.bmc.database.model.UpdateExternalContainerDatabaseDetails getBody$() {
        return updateExternalContainerDatabaseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateExternalContainerDatabaseRequest,
                    com.oracle.bmc.database.model.UpdateExternalContainerDatabaseDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ExternalContainerDatabase
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String externalContainerDatabaseId = null;

        /**
         * The ExternalContainerDatabase
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param externalContainerDatabaseId the value to set
         * @return this builder instance
         */
        public Builder externalContainerDatabaseId(String externalContainerDatabaseId) {
            this.externalContainerDatabaseId = externalContainerDatabaseId;
            return this;
        }

        /**
         * Request to update the properties of an {@link
         * #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest)
         * createExternalContainerDatabaseDetails} resource.
         */
        private com.oracle.bmc.database.model.UpdateExternalContainerDatabaseDetails
                updateExternalContainerDatabaseDetails = null;

        /**
         * Request to update the properties of an {@link
         * #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest)
         * createExternalContainerDatabaseDetails} resource.
         *
         * @param updateExternalContainerDatabaseDetails the value to set
         * @return this builder instance
         */
        public Builder updateExternalContainerDatabaseDetails(
                com.oracle.bmc.database.model.UpdateExternalContainerDatabaseDetails
                        updateExternalContainerDatabaseDetails) {
            this.updateExternalContainerDatabaseDetails = updateExternalContainerDatabaseDetails;
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

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(UpdateExternalContainerDatabaseRequest o) {
            externalContainerDatabaseId(o.getExternalContainerDatabaseId());
            updateExternalContainerDatabaseDetails(o.getUpdateExternalContainerDatabaseDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateExternalContainerDatabaseRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateExternalContainerDatabaseRequest
         */
        public UpdateExternalContainerDatabaseRequest build() {
            UpdateExternalContainerDatabaseRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.UpdateExternalContainerDatabaseDetails body) {
            updateExternalContainerDatabaseDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateExternalContainerDatabaseRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateExternalContainerDatabaseRequest
         */
        public UpdateExternalContainerDatabaseRequest buildWithoutInvocationCallback() {
            UpdateExternalContainerDatabaseRequest request =
                    new UpdateExternalContainerDatabaseRequest();
            request.externalContainerDatabaseId = externalContainerDatabaseId;
            request.updateExternalContainerDatabaseDetails = updateExternalContainerDatabaseDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateExternalContainerDatabaseRequest(externalContainerDatabaseId,
            // updateExternalContainerDatabaseDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .externalContainerDatabaseId(externalContainerDatabaseId)
                .updateExternalContainerDatabaseDetails(updateExternalContainerDatabaseDetails)
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
        sb.append(",externalContainerDatabaseId=")
                .append(String.valueOf(this.externalContainerDatabaseId));
        sb.append(",updateExternalContainerDatabaseDetails=")
                .append(String.valueOf(this.updateExternalContainerDatabaseDetails));
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
        if (!(o instanceof UpdateExternalContainerDatabaseRequest)) {
            return false;
        }

        UpdateExternalContainerDatabaseRequest other = (UpdateExternalContainerDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.externalContainerDatabaseId, other.externalContainerDatabaseId)
                && java.util.Objects.equals(
                        this.updateExternalContainerDatabaseDetails,
                        other.updateExternalContainerDatabaseDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.externalContainerDatabaseId == null
                                ? 43
                                : this.externalContainerDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateExternalContainerDatabaseDetails == null
                                ? 43
                                : this.updateExternalContainerDatabaseDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
