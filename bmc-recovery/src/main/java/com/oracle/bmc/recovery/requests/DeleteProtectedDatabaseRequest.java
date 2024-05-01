/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.requests;

import com.oracle.bmc.recovery.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/recovery/DeleteProtectedDatabaseExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * DeleteProtectedDatabaseRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
public class DeleteProtectedDatabaseRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The protected database OCID. */
    private String protectedDatabaseId;

    /** The protected database OCID. */
    public String getProtectedDatabaseId() {
        return protectedDatabaseId;
    }
    /**
     * Defines a preferred schedule to delete a protected database after you terminate the source
     * database. * The default schedule is DELETE_AFTER_72_HOURS, so that the delete operation can
     * occur 72 hours (3 days) after the source database is terminated . * The alternate schedule is
     * DELETE_AFTER_RETENTION_PERIOD. Specify this option if you want to delete a protected database
     * only after the policy-defined backup retention period expires.
     */
    private com.oracle.bmc.recovery.model.DeletionSchedule deletionSchedule;

    /**
     * Defines a preferred schedule to delete a protected database after you terminate the source
     * database. * The default schedule is DELETE_AFTER_72_HOURS, so that the delete operation can
     * occur 72 hours (3 days) after the source database is terminated . * The alternate schedule is
     * DELETE_AFTER_RETENTION_PERIOD. Specify this option if you want to delete a protected database
     * only after the policy-defined backup retention period expires.
     */
    public com.oracle.bmc.recovery.model.DeletionSchedule getDeletionSchedule() {
        return deletionSchedule;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteProtectedDatabaseRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The protected database OCID. */
        private String protectedDatabaseId = null;

        /**
         * The protected database OCID.
         *
         * @param protectedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder protectedDatabaseId(String protectedDatabaseId) {
            this.protectedDatabaseId = protectedDatabaseId;
            return this;
        }

        /**
         * Defines a preferred schedule to delete a protected database after you terminate the
         * source database. * The default schedule is DELETE_AFTER_72_HOURS, so that the delete
         * operation can occur 72 hours (3 days) after the source database is terminated . * The
         * alternate schedule is DELETE_AFTER_RETENTION_PERIOD. Specify this option if you want to
         * delete a protected database only after the policy-defined backup retention period
         * expires.
         */
        private com.oracle.bmc.recovery.model.DeletionSchedule deletionSchedule = null;

        /**
         * Defines a preferred schedule to delete a protected database after you terminate the
         * source database. * The default schedule is DELETE_AFTER_72_HOURS, so that the delete
         * operation can occur 72 hours (3 days) after the source database is terminated . * The
         * alternate schedule is DELETE_AFTER_RETENTION_PERIOD. Specify this option if you want to
         * delete a protected database only after the policy-defined backup retention period
         * expires.
         *
         * @param deletionSchedule the value to set
         * @return this builder instance
         */
        public Builder deletionSchedule(
                com.oracle.bmc.recovery.model.DeletionSchedule deletionSchedule) {
            this.deletionSchedule = deletionSchedule;
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
        public Builder copy(DeleteProtectedDatabaseRequest o) {
            protectedDatabaseId(o.getProtectedDatabaseId());
            deletionSchedule(o.getDeletionSchedule());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteProtectedDatabaseRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteProtectedDatabaseRequest
         */
        public DeleteProtectedDatabaseRequest build() {
            DeleteProtectedDatabaseRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteProtectedDatabaseRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteProtectedDatabaseRequest
         */
        public DeleteProtectedDatabaseRequest buildWithoutInvocationCallback() {
            DeleteProtectedDatabaseRequest request = new DeleteProtectedDatabaseRequest();
            request.protectedDatabaseId = protectedDatabaseId;
            request.deletionSchedule = deletionSchedule;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new DeleteProtectedDatabaseRequest(protectedDatabaseId, deletionSchedule, ifMatch,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .protectedDatabaseId(protectedDatabaseId)
                .deletionSchedule(deletionSchedule)
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
        sb.append(",protectedDatabaseId=").append(String.valueOf(this.protectedDatabaseId));
        sb.append(",deletionSchedule=").append(String.valueOf(this.deletionSchedule));
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
        if (!(o instanceof DeleteProtectedDatabaseRequest)) {
            return false;
        }

        DeleteProtectedDatabaseRequest other = (DeleteProtectedDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.protectedDatabaseId, other.protectedDatabaseId)
                && java.util.Objects.equals(this.deletionSchedule, other.deletionSchedule)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.protectedDatabaseId == null
                                ? 43
                                : this.protectedDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.deletionSchedule == null ? 43 : this.deletionSchedule.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
