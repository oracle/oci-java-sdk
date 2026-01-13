/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteDatabaseExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteDatabaseRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class DeleteDatabaseRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The database [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String databaseId;

    /**
     * The database [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getDatabaseId() {
        return databaseId;
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
     * Whether to perform a final backup of the database or not. Default is false.
     *
     * <p>If you previously used RMAN or dbcli to configure backups and then you switch to using the
     * Console or the API for backups, a new backup configuration is created and associated with
     * your database. This means that you can no longer rely on your previously configured unmanaged
     * backups to work.
     *
     * <p>This parameter is used in multiple APIs. Refer to the API description for details on how
     * the operation uses it.
     */
    private Boolean performFinalBackup;

    /**
     * Whether to perform a final backup of the database or not. Default is false.
     *
     * <p>If you previously used RMAN or dbcli to configure backups and then you switch to using the
     * Console or the API for backups, a new backup configuration is created and associated with
     * your database. This means that you can no longer rely on your previously configured unmanaged
     * backups to work.
     *
     * <p>This parameter is used in multiple APIs. Refer to the API description for details on how
     * the operation uses it.
     */
    public Boolean getPerformFinalBackup() {
        return performFinalBackup;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteDatabaseRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The database
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String databaseId = null;

        /**
         * The database
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param databaseId the value to set
         * @return this builder instance
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
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
         * Whether to perform a final backup of the database or not. Default is false.
         *
         * <p>If you previously used RMAN or dbcli to configure backups and then you switch to using
         * the Console or the API for backups, a new backup configuration is created and associated
         * with your database. This means that you can no longer rely on your previously configured
         * unmanaged backups to work.
         *
         * <p>This parameter is used in multiple APIs. Refer to the API description for details on
         * how the operation uses it.
         */
        private Boolean performFinalBackup = null;

        /**
         * Whether to perform a final backup of the database or not. Default is false.
         *
         * <p>If you previously used RMAN or dbcli to configure backups and then you switch to using
         * the Console or the API for backups, a new backup configuration is created and associated
         * with your database. This means that you can no longer rely on your previously configured
         * unmanaged backups to work.
         *
         * <p>This parameter is used in multiple APIs. Refer to the API description for details on
         * how the operation uses it.
         *
         * @param performFinalBackup the value to set
         * @return this builder instance
         */
        public Builder performFinalBackup(Boolean performFinalBackup) {
            this.performFinalBackup = performFinalBackup;
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
        public Builder copy(DeleteDatabaseRequest o) {
            databaseId(o.getDatabaseId());
            ifMatch(o.getIfMatch());
            performFinalBackup(o.getPerformFinalBackup());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteDatabaseRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteDatabaseRequest
         */
        public DeleteDatabaseRequest build() {
            DeleteDatabaseRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteDatabaseRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteDatabaseRequest
         */
        public DeleteDatabaseRequest buildWithoutInvocationCallback() {
            DeleteDatabaseRequest request = new DeleteDatabaseRequest();
            request.databaseId = databaseId;
            request.ifMatch = ifMatch;
            request.performFinalBackup = performFinalBackup;
            request.opcRequestId = opcRequestId;
            return request;
            // new DeleteDatabaseRequest(databaseId, ifMatch, performFinalBackup, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseId(databaseId)
                .ifMatch(ifMatch)
                .performFinalBackup(performFinalBackup)
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
        sb.append(",databaseId=").append(String.valueOf(this.databaseId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",performFinalBackup=").append(String.valueOf(this.performFinalBackup));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteDatabaseRequest)) {
            return false;
        }

        DeleteDatabaseRequest other = (DeleteDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.performFinalBackup, other.performFinalBackup)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.performFinalBackup == null
                                ? 43
                                : this.performFinalBackup.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
