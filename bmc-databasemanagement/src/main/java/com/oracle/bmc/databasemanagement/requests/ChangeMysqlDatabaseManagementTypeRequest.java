/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangeMysqlDatabaseManagementTypeExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeMysqlDatabaseManagementTypeRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ChangeMysqlDatabaseManagementTypeRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model.ChangeMysqlDatabaseManagementTypeDetails> {

    /** The OCID of the Managed MySQL Database. */
    private String managedMySqlDatabaseId;

    /** The OCID of the Managed MySQL Database. */
    public String getManagedMySqlDatabaseId() {
        return managedMySqlDatabaseId;
    }
    /** The details required to change the management type of a MySQL managed database. */
    private com.oracle.bmc.databasemanagement.model.ChangeMysqlDatabaseManagementTypeDetails
            changeMysqlDatabaseManagementTypeDetails;

    /** The details required to change the management type of a MySQL managed database. */
    public com.oracle.bmc.databasemanagement.model.ChangeMysqlDatabaseManagementTypeDetails
            getChangeMysqlDatabaseManagementTypeDetails() {
        return changeMysqlDatabaseManagementTypeDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    public com.oracle.bmc.databasemanagement.model.ChangeMysqlDatabaseManagementTypeDetails
            getBody$() {
        return changeMysqlDatabaseManagementTypeDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeMysqlDatabaseManagementTypeRequest,
                    com.oracle.bmc.databasemanagement.model
                            .ChangeMysqlDatabaseManagementTypeDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the Managed MySQL Database. */
        private String managedMySqlDatabaseId = null;

        /**
         * The OCID of the Managed MySQL Database.
         *
         * @param managedMySqlDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedMySqlDatabaseId(String managedMySqlDatabaseId) {
            this.managedMySqlDatabaseId = managedMySqlDatabaseId;
            return this;
        }

        /** The details required to change the management type of a MySQL managed database. */
        private com.oracle.bmc.databasemanagement.model.ChangeMysqlDatabaseManagementTypeDetails
                changeMysqlDatabaseManagementTypeDetails = null;

        /**
         * The details required to change the management type of a MySQL managed database.
         *
         * @param changeMysqlDatabaseManagementTypeDetails the value to set
         * @return this builder instance
         */
        public Builder changeMysqlDatabaseManagementTypeDetails(
                com.oracle.bmc.databasemanagement.model.ChangeMysqlDatabaseManagementTypeDetails
                        changeMysqlDatabaseManagementTypeDetails) {
            this.changeMysqlDatabaseManagementTypeDetails =
                    changeMysqlDatabaseManagementTypeDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(ChangeMysqlDatabaseManagementTypeRequest o) {
            managedMySqlDatabaseId(o.getManagedMySqlDatabaseId());
            changeMysqlDatabaseManagementTypeDetails(
                    o.getChangeMysqlDatabaseManagementTypeDetails());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeMysqlDatabaseManagementTypeRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeMysqlDatabaseManagementTypeRequest
         */
        public ChangeMysqlDatabaseManagementTypeRequest build() {
            ChangeMysqlDatabaseManagementTypeRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasemanagement.model.ChangeMysqlDatabaseManagementTypeDetails
                        body) {
            changeMysqlDatabaseManagementTypeDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeMysqlDatabaseManagementTypeRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeMysqlDatabaseManagementTypeRequest
         */
        public ChangeMysqlDatabaseManagementTypeRequest buildWithoutInvocationCallback() {
            ChangeMysqlDatabaseManagementTypeRequest request =
                    new ChangeMysqlDatabaseManagementTypeRequest();
            request.managedMySqlDatabaseId = managedMySqlDatabaseId;
            request.changeMysqlDatabaseManagementTypeDetails =
                    changeMysqlDatabaseManagementTypeDetails;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeMysqlDatabaseManagementTypeRequest(managedMySqlDatabaseId,
            // changeMysqlDatabaseManagementTypeDetails, opcRetryToken, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedMySqlDatabaseId(managedMySqlDatabaseId)
                .changeMysqlDatabaseManagementTypeDetails(changeMysqlDatabaseManagementTypeDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",managedMySqlDatabaseId=").append(String.valueOf(this.managedMySqlDatabaseId));
        sb.append(",changeMysqlDatabaseManagementTypeDetails=")
                .append(String.valueOf(this.changeMysqlDatabaseManagementTypeDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
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
        if (!(o instanceof ChangeMysqlDatabaseManagementTypeRequest)) {
            return false;
        }

        ChangeMysqlDatabaseManagementTypeRequest other =
                (ChangeMysqlDatabaseManagementTypeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.managedMySqlDatabaseId, other.managedMySqlDatabaseId)
                && java.util.Objects.equals(
                        this.changeMysqlDatabaseManagementTypeDetails,
                        other.changeMysqlDatabaseManagementTypeDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedMySqlDatabaseId == null
                                ? 43
                                : this.managedMySqlDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeMysqlDatabaseManagementTypeDetails == null
                                ? 43
                                : this.changeMysqlDatabaseManagementTypeDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
