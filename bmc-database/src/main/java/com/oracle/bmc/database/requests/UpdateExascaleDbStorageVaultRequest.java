/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExascaleDbStorageVaultExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateExascaleDbStorageVaultRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateExascaleDbStorageVaultRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdateExascaleDbStorageVaultDetails> {

    /**
     * The Exadata Database Storage Vault
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String exascaleDbStorageVaultId;

    /**
     * The Exadata Database Storage Vault
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getExascaleDbStorageVaultId() {
        return exascaleDbStorageVaultId;
    }
    /** Request to update the attributes of a Exadata Database Storage Vault. */
    private com.oracle.bmc.database.model.UpdateExascaleDbStorageVaultDetails
            updateExascaleDbStorageVaultDetails;

    /** Request to update the attributes of a Exadata Database Storage Vault. */
    public com.oracle.bmc.database.model.UpdateExascaleDbStorageVaultDetails
            getUpdateExascaleDbStorageVaultDetails() {
        return updateExascaleDbStorageVaultDetails;
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
    public com.oracle.bmc.database.model.UpdateExascaleDbStorageVaultDetails getBody$() {
        return updateExascaleDbStorageVaultDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateExascaleDbStorageVaultRequest,
                    com.oracle.bmc.database.model.UpdateExascaleDbStorageVaultDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Exadata Database Storage Vault
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String exascaleDbStorageVaultId = null;

        /**
         * The Exadata Database Storage Vault
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param exascaleDbStorageVaultId the value to set
         * @return this builder instance
         */
        public Builder exascaleDbStorageVaultId(String exascaleDbStorageVaultId) {
            this.exascaleDbStorageVaultId = exascaleDbStorageVaultId;
            return this;
        }

        /** Request to update the attributes of a Exadata Database Storage Vault. */
        private com.oracle.bmc.database.model.UpdateExascaleDbStorageVaultDetails
                updateExascaleDbStorageVaultDetails = null;

        /**
         * Request to update the attributes of a Exadata Database Storage Vault.
         *
         * @param updateExascaleDbStorageVaultDetails the value to set
         * @return this builder instance
         */
        public Builder updateExascaleDbStorageVaultDetails(
                com.oracle.bmc.database.model.UpdateExascaleDbStorageVaultDetails
                        updateExascaleDbStorageVaultDetails) {
            this.updateExascaleDbStorageVaultDetails = updateExascaleDbStorageVaultDetails;
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
        public Builder copy(UpdateExascaleDbStorageVaultRequest o) {
            exascaleDbStorageVaultId(o.getExascaleDbStorageVaultId());
            updateExascaleDbStorageVaultDetails(o.getUpdateExascaleDbStorageVaultDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateExascaleDbStorageVaultRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateExascaleDbStorageVaultRequest
         */
        public UpdateExascaleDbStorageVaultRequest build() {
            UpdateExascaleDbStorageVaultRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.UpdateExascaleDbStorageVaultDetails body) {
            updateExascaleDbStorageVaultDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateExascaleDbStorageVaultRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateExascaleDbStorageVaultRequest
         */
        public UpdateExascaleDbStorageVaultRequest buildWithoutInvocationCallback() {
            UpdateExascaleDbStorageVaultRequest request = new UpdateExascaleDbStorageVaultRequest();
            request.exascaleDbStorageVaultId = exascaleDbStorageVaultId;
            request.updateExascaleDbStorageVaultDetails = updateExascaleDbStorageVaultDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateExascaleDbStorageVaultRequest(exascaleDbStorageVaultId,
            // updateExascaleDbStorageVaultDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .exascaleDbStorageVaultId(exascaleDbStorageVaultId)
                .updateExascaleDbStorageVaultDetails(updateExascaleDbStorageVaultDetails)
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
        sb.append(",exascaleDbStorageVaultId=")
                .append(String.valueOf(this.exascaleDbStorageVaultId));
        sb.append(",updateExascaleDbStorageVaultDetails=")
                .append(String.valueOf(this.updateExascaleDbStorageVaultDetails));
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
        if (!(o instanceof UpdateExascaleDbStorageVaultRequest)) {
            return false;
        }

        UpdateExascaleDbStorageVaultRequest other = (UpdateExascaleDbStorageVaultRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.exascaleDbStorageVaultId, other.exascaleDbStorageVaultId)
                && java.util.Objects.equals(
                        this.updateExascaleDbStorageVaultDetails,
                        other.updateExascaleDbStorageVaultDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.exascaleDbStorageVaultId == null
                                ? 43
                                : this.exascaleDbStorageVaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateExascaleDbStorageVaultDetails == null
                                ? 43
                                : this.updateExascaleDbStorageVaultDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
