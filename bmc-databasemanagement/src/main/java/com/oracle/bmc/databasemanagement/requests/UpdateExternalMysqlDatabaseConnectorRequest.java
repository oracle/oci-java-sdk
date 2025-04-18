/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalMysqlDatabaseConnectorExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateExternalMysqlDatabaseConnectorRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class UpdateExternalMysqlDatabaseConnectorRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model
                        .UpdateExternalMySqlDatabaseConnectorDetails> {

    /** The OCID of the External MySQL Database Connector. */
    private String externalMySqlDatabaseConnectorId;

    /** The OCID of the External MySQL Database Connector. */
    public String getExternalMySqlDatabaseConnectorId() {
        return externalMySqlDatabaseConnectorId;
    }
    /** The details required to update MySQL database connector resource. */
    private com.oracle.bmc.databasemanagement.model.UpdateExternalMySqlDatabaseConnectorDetails
            updateExternalMySqlDatabaseConnectorDetails;

    /** The details required to update MySQL database connector resource. */
    public com.oracle.bmc.databasemanagement.model.UpdateExternalMySqlDatabaseConnectorDetails
            getUpdateExternalMySqlDatabaseConnectorDetails() {
        return updateExternalMySqlDatabaseConnectorDetails;
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
    public com.oracle.bmc.databasemanagement.model.UpdateExternalMySqlDatabaseConnectorDetails
            getBody$() {
        return updateExternalMySqlDatabaseConnectorDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateExternalMysqlDatabaseConnectorRequest,
                    com.oracle.bmc.databasemanagement.model
                            .UpdateExternalMySqlDatabaseConnectorDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the External MySQL Database Connector. */
        private String externalMySqlDatabaseConnectorId = null;

        /**
         * The OCID of the External MySQL Database Connector.
         *
         * @param externalMySqlDatabaseConnectorId the value to set
         * @return this builder instance
         */
        public Builder externalMySqlDatabaseConnectorId(String externalMySqlDatabaseConnectorId) {
            this.externalMySqlDatabaseConnectorId = externalMySqlDatabaseConnectorId;
            return this;
        }

        /** The details required to update MySQL database connector resource. */
        private com.oracle.bmc.databasemanagement.model.UpdateExternalMySqlDatabaseConnectorDetails
                updateExternalMySqlDatabaseConnectorDetails = null;

        /**
         * The details required to update MySQL database connector resource.
         *
         * @param updateExternalMySqlDatabaseConnectorDetails the value to set
         * @return this builder instance
         */
        public Builder updateExternalMySqlDatabaseConnectorDetails(
                com.oracle.bmc.databasemanagement.model.UpdateExternalMySqlDatabaseConnectorDetails
                        updateExternalMySqlDatabaseConnectorDetails) {
            this.updateExternalMySqlDatabaseConnectorDetails =
                    updateExternalMySqlDatabaseConnectorDetails;
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
        public Builder copy(UpdateExternalMysqlDatabaseConnectorRequest o) {
            externalMySqlDatabaseConnectorId(o.getExternalMySqlDatabaseConnectorId());
            updateExternalMySqlDatabaseConnectorDetails(
                    o.getUpdateExternalMySqlDatabaseConnectorDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateExternalMysqlDatabaseConnectorRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateExternalMysqlDatabaseConnectorRequest
         */
        public UpdateExternalMysqlDatabaseConnectorRequest build() {
            UpdateExternalMysqlDatabaseConnectorRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasemanagement.model.UpdateExternalMySqlDatabaseConnectorDetails
                        body) {
            updateExternalMySqlDatabaseConnectorDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateExternalMysqlDatabaseConnectorRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateExternalMysqlDatabaseConnectorRequest
         */
        public UpdateExternalMysqlDatabaseConnectorRequest buildWithoutInvocationCallback() {
            UpdateExternalMysqlDatabaseConnectorRequest request =
                    new UpdateExternalMysqlDatabaseConnectorRequest();
            request.externalMySqlDatabaseConnectorId = externalMySqlDatabaseConnectorId;
            request.updateExternalMySqlDatabaseConnectorDetails =
                    updateExternalMySqlDatabaseConnectorDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateExternalMysqlDatabaseConnectorRequest(externalMySqlDatabaseConnectorId,
            // updateExternalMySqlDatabaseConnectorDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .externalMySqlDatabaseConnectorId(externalMySqlDatabaseConnectorId)
                .updateExternalMySqlDatabaseConnectorDetails(
                        updateExternalMySqlDatabaseConnectorDetails)
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
        sb.append(",externalMySqlDatabaseConnectorId=")
                .append(String.valueOf(this.externalMySqlDatabaseConnectorId));
        sb.append(",updateExternalMySqlDatabaseConnectorDetails=")
                .append(String.valueOf(this.updateExternalMySqlDatabaseConnectorDetails));
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
        if (!(o instanceof UpdateExternalMysqlDatabaseConnectorRequest)) {
            return false;
        }

        UpdateExternalMysqlDatabaseConnectorRequest other =
                (UpdateExternalMysqlDatabaseConnectorRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.externalMySqlDatabaseConnectorId,
                        other.externalMySqlDatabaseConnectorId)
                && java.util.Objects.equals(
                        this.updateExternalMySqlDatabaseConnectorDetails,
                        other.updateExternalMySqlDatabaseConnectorDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.externalMySqlDatabaseConnectorId == null
                                ? 43
                                : this.externalMySqlDatabaseConnectorId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateExternalMySqlDatabaseConnectorDetails == null
                                ? 43
                                : this.updateExternalMySqlDatabaseConnectorDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
