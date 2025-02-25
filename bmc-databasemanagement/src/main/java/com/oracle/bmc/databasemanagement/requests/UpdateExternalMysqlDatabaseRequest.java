/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalMysqlDatabaseExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateExternalMysqlDatabaseRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class UpdateExternalMysqlDatabaseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model.UpdateExternalMySqlDatabaseDetails> {

    /**
     * The OCID of the External MySQL Database.
     */
    private String externalMySqlDatabaseId;

    /**
     * The OCID of the External MySQL Database.
     */
    public String getExternalMySqlDatabaseId() {
        return externalMySqlDatabaseId;
    }
    /**
     * The details required to update an external MySQL database resource.
     */
    private com.oracle.bmc.databasemanagement.model.UpdateExternalMySqlDatabaseDetails
            updateExternalMySqlDatabaseDetails;

    /**
     * The details required to update an external MySQL database resource.
     */
    public com.oracle.bmc.databasemanagement.model.UpdateExternalMySqlDatabaseDetails
            getUpdateExternalMySqlDatabaseDetails() {
        return updateExternalMySqlDatabaseDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
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
    public com.oracle.bmc.databasemanagement.model.UpdateExternalMySqlDatabaseDetails getBody$() {
        return updateExternalMySqlDatabaseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateExternalMysqlDatabaseRequest,
                    com.oracle.bmc.databasemanagement.model.UpdateExternalMySqlDatabaseDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the External MySQL Database.
         */
        private String externalMySqlDatabaseId = null;

        /**
         * The OCID of the External MySQL Database.
         * @param externalMySqlDatabaseId the value to set
         * @return this builder instance
         */
        public Builder externalMySqlDatabaseId(String externalMySqlDatabaseId) {
            this.externalMySqlDatabaseId = externalMySqlDatabaseId;
            return this;
        }

        /**
         * The details required to update an external MySQL database resource.
         */
        private com.oracle.bmc.databasemanagement.model.UpdateExternalMySqlDatabaseDetails
                updateExternalMySqlDatabaseDetails = null;

        /**
         * The details required to update an external MySQL database resource.
         * @param updateExternalMySqlDatabaseDetails the value to set
         * @return this builder instance
         */
        public Builder updateExternalMySqlDatabaseDetails(
                com.oracle.bmc.databasemanagement.model.UpdateExternalMySqlDatabaseDetails
                        updateExternalMySqlDatabaseDetails) {
            this.updateExternalMySqlDatabaseDetails = updateExternalMySqlDatabaseDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(UpdateExternalMysqlDatabaseRequest o) {
            externalMySqlDatabaseId(o.getExternalMySqlDatabaseId());
            updateExternalMySqlDatabaseDetails(o.getUpdateExternalMySqlDatabaseDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateExternalMysqlDatabaseRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateExternalMysqlDatabaseRequest
         */
        public UpdateExternalMysqlDatabaseRequest build() {
            UpdateExternalMysqlDatabaseRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasemanagement.model.UpdateExternalMySqlDatabaseDetails body) {
            updateExternalMySqlDatabaseDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateExternalMysqlDatabaseRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateExternalMysqlDatabaseRequest
         */
        public UpdateExternalMysqlDatabaseRequest buildWithoutInvocationCallback() {
            UpdateExternalMysqlDatabaseRequest request = new UpdateExternalMysqlDatabaseRequest();
            request.externalMySqlDatabaseId = externalMySqlDatabaseId;
            request.updateExternalMySqlDatabaseDetails = updateExternalMySqlDatabaseDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateExternalMysqlDatabaseRequest(externalMySqlDatabaseId, updateExternalMySqlDatabaseDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .externalMySqlDatabaseId(externalMySqlDatabaseId)
                .updateExternalMySqlDatabaseDetails(updateExternalMySqlDatabaseDetails)
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
        sb.append(",externalMySqlDatabaseId=").append(String.valueOf(this.externalMySqlDatabaseId));
        sb.append(",updateExternalMySqlDatabaseDetails=")
                .append(String.valueOf(this.updateExternalMySqlDatabaseDetails));
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
        if (!(o instanceof UpdateExternalMysqlDatabaseRequest)) {
            return false;
        }

        UpdateExternalMysqlDatabaseRequest other = (UpdateExternalMysqlDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.externalMySqlDatabaseId, other.externalMySqlDatabaseId)
                && java.util.Objects.equals(
                        this.updateExternalMySqlDatabaseDetails,
                        other.updateExternalMySqlDatabaseDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.externalMySqlDatabaseId == null
                                ? 43
                                : this.externalMySqlDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateExternalMySqlDatabaseDetails == null
                                ? 43
                                : this.updateExternalMySqlDatabaseDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
