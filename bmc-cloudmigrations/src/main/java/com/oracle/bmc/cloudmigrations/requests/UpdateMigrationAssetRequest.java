/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.requests;

import com.oracle.bmc.cloudmigrations.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudmigrations/UpdateMigrationAssetExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateMigrationAssetRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
public class UpdateMigrationAssetRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.cloudmigrations.model.UpdateMigrationAssetDetails> {

    /** Unique migration asset identifier */
    private String migrationAssetId;

    /** Unique migration asset identifier */
    public String getMigrationAssetId() {
        return migrationAssetId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.cloudmigrations.model.UpdateMigrationAssetDetails
            updateMigrationAssetDetails;

    /** The information to be updated. */
    public com.oracle.bmc.cloudmigrations.model.UpdateMigrationAssetDetails
            getUpdateMigrationAssetDetails() {
        return updateMigrationAssetDetails;
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
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
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
    public com.oracle.bmc.cloudmigrations.model.UpdateMigrationAssetDetails getBody$() {
        return updateMigrationAssetDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateMigrationAssetRequest,
                    com.oracle.bmc.cloudmigrations.model.UpdateMigrationAssetDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique migration asset identifier */
        private String migrationAssetId = null;

        /**
         * Unique migration asset identifier
         *
         * @param migrationAssetId the value to set
         * @return this builder instance
         */
        public Builder migrationAssetId(String migrationAssetId) {
            this.migrationAssetId = migrationAssetId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.cloudmigrations.model.UpdateMigrationAssetDetails
                updateMigrationAssetDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateMigrationAssetDetails the value to set
         * @return this builder instance
         */
        public Builder updateMigrationAssetDetails(
                com.oracle.bmc.cloudmigrations.model.UpdateMigrationAssetDetails
                        updateMigrationAssetDetails) {
            this.updateMigrationAssetDetails = updateMigrationAssetDetails;
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
        public Builder copy(UpdateMigrationAssetRequest o) {
            migrationAssetId(o.getMigrationAssetId());
            updateMigrationAssetDetails(o.getUpdateMigrationAssetDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateMigrationAssetRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateMigrationAssetRequest
         */
        public UpdateMigrationAssetRequest build() {
            UpdateMigrationAssetRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.cloudmigrations.model.UpdateMigrationAssetDetails body) {
            updateMigrationAssetDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateMigrationAssetRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateMigrationAssetRequest
         */
        public UpdateMigrationAssetRequest buildWithoutInvocationCallback() {
            UpdateMigrationAssetRequest request = new UpdateMigrationAssetRequest();
            request.migrationAssetId = migrationAssetId;
            request.updateMigrationAssetDetails = updateMigrationAssetDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateMigrationAssetRequest(migrationAssetId, updateMigrationAssetDetails,
            // ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .migrationAssetId(migrationAssetId)
                .updateMigrationAssetDetails(updateMigrationAssetDetails)
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
        sb.append(",migrationAssetId=").append(String.valueOf(this.migrationAssetId));
        sb.append(",updateMigrationAssetDetails=")
                .append(String.valueOf(this.updateMigrationAssetDetails));
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
        if (!(o instanceof UpdateMigrationAssetRequest)) {
            return false;
        }

        UpdateMigrationAssetRequest other = (UpdateMigrationAssetRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.migrationAssetId, other.migrationAssetId)
                && java.util.Objects.equals(
                        this.updateMigrationAssetDetails, other.updateMigrationAssetDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.migrationAssetId == null ? 43 : this.migrationAssetId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateMigrationAssetDetails == null
                                ? 43
                                : this.updateMigrationAssetDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
