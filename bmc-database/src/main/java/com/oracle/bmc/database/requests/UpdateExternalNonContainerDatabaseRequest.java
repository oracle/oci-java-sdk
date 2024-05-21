/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExternalNonContainerDatabaseExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateExternalNonContainerDatabaseRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateExternalNonContainerDatabaseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdateExternalNonContainerDatabaseDetails> {

    /**
     * The external non-container database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String externalNonContainerDatabaseId;

    /**
     * The external non-container database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getExternalNonContainerDatabaseId() {
        return externalNonContainerDatabaseId;
    }
    /**
     * Request to update the properties of an external non-container database.
     */
    private com.oracle.bmc.database.model.UpdateExternalNonContainerDatabaseDetails
            updateExternalNonContainerDatabaseDetails;

    /**
     * Request to update the properties of an external non-container database.
     */
    public com.oracle.bmc.database.model.UpdateExternalNonContainerDatabaseDetails
            getUpdateExternalNonContainerDatabaseDetails() {
        return updateExternalNonContainerDatabaseDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
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
    public com.oracle.bmc.database.model.UpdateExternalNonContainerDatabaseDetails getBody$() {
        return updateExternalNonContainerDatabaseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateExternalNonContainerDatabaseRequest,
                    com.oracle.bmc.database.model.UpdateExternalNonContainerDatabaseDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The external non-container database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String externalNonContainerDatabaseId = null;

        /**
         * The external non-container database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param externalNonContainerDatabaseId the value to set
         * @return this builder instance
         */
        public Builder externalNonContainerDatabaseId(String externalNonContainerDatabaseId) {
            this.externalNonContainerDatabaseId = externalNonContainerDatabaseId;
            return this;
        }

        /**
         * Request to update the properties of an external non-container database.
         */
        private com.oracle.bmc.database.model.UpdateExternalNonContainerDatabaseDetails
                updateExternalNonContainerDatabaseDetails = null;

        /**
         * Request to update the properties of an external non-container database.
         * @param updateExternalNonContainerDatabaseDetails the value to set
         * @return this builder instance
         */
        public Builder updateExternalNonContainerDatabaseDetails(
                com.oracle.bmc.database.model.UpdateExternalNonContainerDatabaseDetails
                        updateExternalNonContainerDatabaseDetails) {
            this.updateExternalNonContainerDatabaseDetails =
                    updateExternalNonContainerDatabaseDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique identifier for the request.
         *
         */
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
        public Builder copy(UpdateExternalNonContainerDatabaseRequest o) {
            externalNonContainerDatabaseId(o.getExternalNonContainerDatabaseId());
            updateExternalNonContainerDatabaseDetails(
                    o.getUpdateExternalNonContainerDatabaseDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateExternalNonContainerDatabaseRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateExternalNonContainerDatabaseRequest
         */
        public UpdateExternalNonContainerDatabaseRequest build() {
            UpdateExternalNonContainerDatabaseRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.database.model.UpdateExternalNonContainerDatabaseDetails body) {
            updateExternalNonContainerDatabaseDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateExternalNonContainerDatabaseRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateExternalNonContainerDatabaseRequest
         */
        public UpdateExternalNonContainerDatabaseRequest buildWithoutInvocationCallback() {
            UpdateExternalNonContainerDatabaseRequest request =
                    new UpdateExternalNonContainerDatabaseRequest();
            request.externalNonContainerDatabaseId = externalNonContainerDatabaseId;
            request.updateExternalNonContainerDatabaseDetails =
                    updateExternalNonContainerDatabaseDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateExternalNonContainerDatabaseRequest(externalNonContainerDatabaseId, updateExternalNonContainerDatabaseDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .externalNonContainerDatabaseId(externalNonContainerDatabaseId)
                .updateExternalNonContainerDatabaseDetails(
                        updateExternalNonContainerDatabaseDetails)
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
        sb.append(",externalNonContainerDatabaseId=")
                .append(String.valueOf(this.externalNonContainerDatabaseId));
        sb.append(",updateExternalNonContainerDatabaseDetails=")
                .append(String.valueOf(this.updateExternalNonContainerDatabaseDetails));
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
        if (!(o instanceof UpdateExternalNonContainerDatabaseRequest)) {
            return false;
        }

        UpdateExternalNonContainerDatabaseRequest other =
                (UpdateExternalNonContainerDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.externalNonContainerDatabaseId, other.externalNonContainerDatabaseId)
                && java.util.Objects.equals(
                        this.updateExternalNonContainerDatabaseDetails,
                        other.updateExternalNonContainerDatabaseDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.externalNonContainerDatabaseId == null
                                ? 43
                                : this.externalNonContainerDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateExternalNonContainerDatabaseDetails == null
                                ? 43
                                : this.updateExternalNonContainerDatabaseDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
