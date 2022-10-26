/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.requests;

import com.oracle.bmc.databasemigration.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/RemoveMigrationObjectsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RemoveMigrationObjectsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
public class RemoveMigrationObjectsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemigration.model.MigrationObjectCollection> {

    /** The OCID of the migration */
    private String migrationId;

    /** The OCID of the migration */
    public String getMigrationId() {
        return migrationId;
    }
    /** Arrays of object. */
    private com.oracle.bmc.databasemigration.model.MigrationObjectCollection
            removeMigrationObjectsDetails;

    /** Arrays of object. */
    public com.oracle.bmc.databasemigration.model.MigrationObjectCollection
            getRemoveMigrationObjectsDetails() {
        return removeMigrationObjectsDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
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
    public com.oracle.bmc.databasemigration.model.MigrationObjectCollection getBody$() {
        return removeMigrationObjectsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RemoveMigrationObjectsRequest,
                    com.oracle.bmc.databasemigration.model.MigrationObjectCollection> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the migration */
        private String migrationId = null;

        /**
         * The OCID of the migration
         *
         * @param migrationId the value to set
         * @return this builder instance
         */
        public Builder migrationId(String migrationId) {
            this.migrationId = migrationId;
            return this;
        }

        /** Arrays of object. */
        private com.oracle.bmc.databasemigration.model.MigrationObjectCollection
                removeMigrationObjectsDetails = null;

        /**
         * Arrays of object.
         *
         * @param removeMigrationObjectsDetails the value to set
         * @return this builder instance
         */
        public Builder removeMigrationObjectsDetails(
                com.oracle.bmc.databasemigration.model.MigrationObjectCollection
                        removeMigrationObjectsDetails) {
            this.removeMigrationObjectsDetails = removeMigrationObjectsDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(RemoveMigrationObjectsRequest o) {
            migrationId(o.getMigrationId());
            removeMigrationObjectsDetails(o.getRemoveMigrationObjectsDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RemoveMigrationObjectsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RemoveMigrationObjectsRequest
         */
        public RemoveMigrationObjectsRequest build() {
            RemoveMigrationObjectsRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasemigration.model.MigrationObjectCollection body) {
            removeMigrationObjectsDetails(body);
            return this;
        }

        /**
         * Build the instance of RemoveMigrationObjectsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RemoveMigrationObjectsRequest
         */
        public RemoveMigrationObjectsRequest buildWithoutInvocationCallback() {
            RemoveMigrationObjectsRequest request = new RemoveMigrationObjectsRequest();
            request.migrationId = migrationId;
            request.removeMigrationObjectsDetails = removeMigrationObjectsDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new RemoveMigrationObjectsRequest(migrationId, removeMigrationObjectsDetails,
            // opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .migrationId(migrationId)
                .removeMigrationObjectsDetails(removeMigrationObjectsDetails)
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
        sb.append(",migrationId=").append(String.valueOf(this.migrationId));
        sb.append(",removeMigrationObjectsDetails=")
                .append(String.valueOf(this.removeMigrationObjectsDetails));
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
        if (!(o instanceof RemoveMigrationObjectsRequest)) {
            return false;
        }

        RemoveMigrationObjectsRequest other = (RemoveMigrationObjectsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.migrationId, other.migrationId)
                && java.util.Objects.equals(
                        this.removeMigrationObjectsDetails, other.removeMigrationObjectsDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.migrationId == null ? 43 : this.migrationId.hashCode());
        result =
                (result * PRIME)
                        + (this.removeMigrationObjectsDetails == null
                                ? 43
                                : this.removeMigrationObjectsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
