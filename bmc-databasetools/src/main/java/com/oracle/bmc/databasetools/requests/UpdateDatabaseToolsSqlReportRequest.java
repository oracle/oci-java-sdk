/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.requests;

import com.oracle.bmc.databasetools.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/UpdateDatabaseToolsSqlReportExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateDatabaseToolsSqlReportRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
public class UpdateDatabaseToolsSqlReportRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasetools.model.UpdateDatabaseToolsSqlReportDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * Database Tools SQL Report.
     */
    private String databaseToolsSqlReportId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * Database Tools SQL Report.
     */
    public String getDatabaseToolsSqlReportId() {
        return databaseToolsSqlReportId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.databasetools.model.UpdateDatabaseToolsSqlReportDetails
            updateDatabaseToolsSqlReportDetails;

    /** The information to be updated. */
    public com.oracle.bmc.databasetools.model.UpdateDatabaseToolsSqlReportDetails
            getUpdateDatabaseToolsSqlReportDetails() {
        return updateDatabaseToolsSqlReportDetails;
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
    /** Whether to override locks (if any exist). */
    private Boolean isLockOverride;

    /** Whether to override locks (if any exist). */
    public Boolean getIsLockOverride() {
        return isLockOverride;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasetools.model.UpdateDatabaseToolsSqlReportDetails getBody$() {
        return updateDatabaseToolsSqlReportDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDatabaseToolsSqlReportRequest,
                    com.oracle.bmc.databasetools.model.UpdateDatabaseToolsSqlReportDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * Database Tools SQL Report.
         */
        private String databaseToolsSqlReportId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * Database Tools SQL Report.
         *
         * @param databaseToolsSqlReportId the value to set
         * @return this builder instance
         */
        public Builder databaseToolsSqlReportId(String databaseToolsSqlReportId) {
            this.databaseToolsSqlReportId = databaseToolsSqlReportId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.databasetools.model.UpdateDatabaseToolsSqlReportDetails
                updateDatabaseToolsSqlReportDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateDatabaseToolsSqlReportDetails the value to set
         * @return this builder instance
         */
        public Builder updateDatabaseToolsSqlReportDetails(
                com.oracle.bmc.databasetools.model.UpdateDatabaseToolsSqlReportDetails
                        updateDatabaseToolsSqlReportDetails) {
            this.updateDatabaseToolsSqlReportDetails = updateDatabaseToolsSqlReportDetails;
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

        /** Whether to override locks (if any exist). */
        private Boolean isLockOverride = null;

        /**
         * Whether to override locks (if any exist).
         *
         * @param isLockOverride the value to set
         * @return this builder instance
         */
        public Builder isLockOverride(Boolean isLockOverride) {
            this.isLockOverride = isLockOverride;
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
        public Builder copy(UpdateDatabaseToolsSqlReportRequest o) {
            databaseToolsSqlReportId(o.getDatabaseToolsSqlReportId());
            updateDatabaseToolsSqlReportDetails(o.getUpdateDatabaseToolsSqlReportDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            isLockOverride(o.getIsLockOverride());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDatabaseToolsSqlReportRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateDatabaseToolsSqlReportRequest
         */
        public UpdateDatabaseToolsSqlReportRequest build() {
            UpdateDatabaseToolsSqlReportRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasetools.model.UpdateDatabaseToolsSqlReportDetails body) {
            updateDatabaseToolsSqlReportDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDatabaseToolsSqlReportRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDatabaseToolsSqlReportRequest
         */
        public UpdateDatabaseToolsSqlReportRequest buildWithoutInvocationCallback() {
            UpdateDatabaseToolsSqlReportRequest request = new UpdateDatabaseToolsSqlReportRequest();
            request.databaseToolsSqlReportId = databaseToolsSqlReportId;
            request.updateDatabaseToolsSqlReportDetails = updateDatabaseToolsSqlReportDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.isLockOverride = isLockOverride;
            return request;
            // new UpdateDatabaseToolsSqlReportRequest(databaseToolsSqlReportId,
            // updateDatabaseToolsSqlReportDetails, ifMatch, opcRequestId, isLockOverride);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseToolsSqlReportId(databaseToolsSqlReportId)
                .updateDatabaseToolsSqlReportDetails(updateDatabaseToolsSqlReportDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .isLockOverride(isLockOverride);
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
        sb.append(",databaseToolsSqlReportId=")
                .append(String.valueOf(this.databaseToolsSqlReportId));
        sb.append(",updateDatabaseToolsSqlReportDetails=")
                .append(String.valueOf(this.updateDatabaseToolsSqlReportDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isLockOverride=").append(String.valueOf(this.isLockOverride));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDatabaseToolsSqlReportRequest)) {
            return false;
        }

        UpdateDatabaseToolsSqlReportRequest other = (UpdateDatabaseToolsSqlReportRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.databaseToolsSqlReportId, other.databaseToolsSqlReportId)
                && java.util.Objects.equals(
                        this.updateDatabaseToolsSqlReportDetails,
                        other.updateDatabaseToolsSqlReportDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isLockOverride, other.isLockOverride);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.databaseToolsSqlReportId == null
                                ? 43
                                : this.databaseToolsSqlReportId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDatabaseToolsSqlReportDetails == null
                                ? 43
                                : this.updateDatabaseToolsSqlReportDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.isLockOverride == null ? 43 : this.isLockOverride.hashCode());
        return result;
    }
}
