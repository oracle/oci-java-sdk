/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.requests;

import com.oracle.bmc.psql.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/psql/UpdateDbSystemDbInstanceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateDbSystemDbInstanceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
public class UpdateDbSystemDbInstanceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.psql.model.UpdateDbSystemDbInstanceDetails> {

    /**
     * A unique identifier for the database system.
     */
    private String dbSystemId;

    /**
     * A unique identifier for the database system.
     */
    public String getDbSystemId() {
        return dbSystemId;
    }
    /**
     * A unique identifier for the database instance node.
     */
    private String dbInstanceId;

    /**
     * A unique identifier for the database instance node.
     */
    public String getDbInstanceId() {
        return dbInstanceId;
    }
    /**
     * Database instance node update parameters.
     */
    private com.oracle.bmc.psql.model.UpdateDbSystemDbInstanceDetails
            updateDbSystemDbInstanceDetails;

    /**
     * Database instance node update parameters.
     */
    public com.oracle.bmc.psql.model.UpdateDbSystemDbInstanceDetails
            getUpdateDbSystemDbInstanceDetails() {
        return updateDbSystemDbInstanceDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, {@code retrytoken} could be expired or invalidated.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, {@code retrytoken} could be expired or invalidated.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.psql.model.UpdateDbSystemDbInstanceDetails getBody$() {
        return updateDbSystemDbInstanceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDbSystemDbInstanceRequest,
                    com.oracle.bmc.psql.model.UpdateDbSystemDbInstanceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * A unique identifier for the database system.
         */
        private String dbSystemId = null;

        /**
         * A unique identifier for the database system.
         * @param dbSystemId the value to set
         * @return this builder instance
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            return this;
        }

        /**
         * A unique identifier for the database instance node.
         */
        private String dbInstanceId = null;

        /**
         * A unique identifier for the database instance node.
         * @param dbInstanceId the value to set
         * @return this builder instance
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * Database instance node update parameters.
         */
        private com.oracle.bmc.psql.model.UpdateDbSystemDbInstanceDetails
                updateDbSystemDbInstanceDetails = null;

        /**
         * Database instance node update parameters.
         * @param updateDbSystemDbInstanceDetails the value to set
         * @return this builder instance
         */
        public Builder updateDbSystemDbInstanceDetails(
                com.oracle.bmc.psql.model.UpdateDbSystemDbInstanceDetails
                        updateDbSystemDbInstanceDetails) {
            this.updateDbSystemDbInstanceDetails = updateDbSystemDbInstanceDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, {@code retrytoken} could be expired or invalidated.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, {@code retrytoken} could be expired or invalidated.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(UpdateDbSystemDbInstanceRequest o) {
            dbSystemId(o.getDbSystemId());
            dbInstanceId(o.getDbInstanceId());
            updateDbSystemDbInstanceDetails(o.getUpdateDbSystemDbInstanceDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDbSystemDbInstanceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateDbSystemDbInstanceRequest
         */
        public UpdateDbSystemDbInstanceRequest build() {
            UpdateDbSystemDbInstanceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.psql.model.UpdateDbSystemDbInstanceDetails body) {
            updateDbSystemDbInstanceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDbSystemDbInstanceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDbSystemDbInstanceRequest
         */
        public UpdateDbSystemDbInstanceRequest buildWithoutInvocationCallback() {
            UpdateDbSystemDbInstanceRequest request = new UpdateDbSystemDbInstanceRequest();
            request.dbSystemId = dbSystemId;
            request.dbInstanceId = dbInstanceId;
            request.updateDbSystemDbInstanceDetails = updateDbSystemDbInstanceDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new UpdateDbSystemDbInstanceRequest(dbSystemId, dbInstanceId, updateDbSystemDbInstanceDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dbSystemId(dbSystemId)
                .dbInstanceId(dbInstanceId)
                .updateDbSystemDbInstanceDetails(updateDbSystemDbInstanceDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(",dbInstanceId=").append(String.valueOf(this.dbInstanceId));
        sb.append(",updateDbSystemDbInstanceDetails=")
                .append(String.valueOf(this.updateDbSystemDbInstanceDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDbSystemDbInstanceRequest)) {
            return false;
        }

        UpdateDbSystemDbInstanceRequest other = (UpdateDbSystemDbInstanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.dbInstanceId, other.dbInstanceId)
                && java.util.Objects.equals(
                        this.updateDbSystemDbInstanceDetails, other.updateDbSystemDbInstanceDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.dbInstanceId == null ? 43 : this.dbInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDbSystemDbInstanceDetails == null
                                ? 43
                                : this.updateDbSystemDbInstanceDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
