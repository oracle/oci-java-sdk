/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.requests;

import com.oracle.bmc.nosql.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/nosql/ChangeTableCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeTableCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
public class ChangeTableCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.nosql.model.ChangeTableCompartmentDetails> {

    /**
     * A table name within the compartment, or a table OCID.
     */
    private String tableNameOrId;

    /**
     * A table name within the compartment, or a table OCID.
     */
    public String getTableNameOrId() {
        return tableNameOrId;
    }
    /**
     * Specifications of the source and target compartments.
     */
    private com.oracle.bmc.nosql.model.ChangeTableCompartmentDetails changeTableCompartmentDetails;

    /**
     * Specifications of the source and target compartments.
     */
    public com.oracle.bmc.nosql.model.ChangeTableCompartmentDetails
            getChangeTableCompartmentDetails() {
        return changeTableCompartmentDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried
     * in case of a timeout or server error without risk of executing
     * that same action again. Retry tokens expire after 24 hours, but
     * can be invalidated before then due to conflicting
     * operations. For example, if a resource has been deleted and
     * purged from the system, then a retry of the original creation
     * request might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried
     * in case of a timeout or server error without risk of executing
     * that same action again. Retry tokens expire after 24 hours, but
     * can be invalidated before then due to conflicting
     * operations. For example, if a resource has been deleted and
     * purged from the system, then a retry of the original creation
     * request might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    public com.oracle.bmc.nosql.model.ChangeTableCompartmentDetails getBody$() {
        return changeTableCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeTableCompartmentRequest,
                    com.oracle.bmc.nosql.model.ChangeTableCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * A table name within the compartment, or a table OCID.
         */
        private String tableNameOrId = null;

        /**
         * A table name within the compartment, or a table OCID.
         * @param tableNameOrId the value to set
         * @return this builder instance
         */
        public Builder tableNameOrId(String tableNameOrId) {
            this.tableNameOrId = tableNameOrId;
            return this;
        }

        /**
         * Specifications of the source and target compartments.
         */
        private com.oracle.bmc.nosql.model.ChangeTableCompartmentDetails
                changeTableCompartmentDetails = null;

        /**
         * Specifications of the source and target compartments.
         * @param changeTableCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeTableCompartmentDetails(
                com.oracle.bmc.nosql.model.ChangeTableCompartmentDetails
                        changeTableCompartmentDetails) {
            this.changeTableCompartmentDetails = changeTableCompartmentDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried
         * in case of a timeout or server error without risk of executing
         * that same action again. Retry tokens expire after 24 hours, but
         * can be invalidated before then due to conflicting
         * operations. For example, if a resource has been deleted and
         * purged from the system, then a retry of the original creation
         * request might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried
         * in case of a timeout or server error without risk of executing
         * that same action again. Retry tokens expire after 24 hours, but
         * can be invalidated before then due to conflicting
         * operations. For example, if a resource has been deleted and
         * purged from the system, then a retry of the original creation
         * request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(ChangeTableCompartmentRequest o) {
            tableNameOrId(o.getTableNameOrId());
            changeTableCompartmentDetails(o.getChangeTableCompartmentDetails());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeTableCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeTableCompartmentRequest
         */
        public ChangeTableCompartmentRequest build() {
            ChangeTableCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.nosql.model.ChangeTableCompartmentDetails body) {
            changeTableCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeTableCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeTableCompartmentRequest
         */
        public ChangeTableCompartmentRequest buildWithoutInvocationCallback() {
            ChangeTableCompartmentRequest request = new ChangeTableCompartmentRequest();
            request.tableNameOrId = tableNameOrId;
            request.changeTableCompartmentDetails = changeTableCompartmentDetails;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeTableCompartmentRequest(tableNameOrId, changeTableCompartmentDetails, opcRetryToken, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .tableNameOrId(tableNameOrId)
                .changeTableCompartmentDetails(changeTableCompartmentDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",tableNameOrId=").append(String.valueOf(this.tableNameOrId));
        sb.append(",changeTableCompartmentDetails=")
                .append(String.valueOf(this.changeTableCompartmentDetails));
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
        if (!(o instanceof ChangeTableCompartmentRequest)) {
            return false;
        }

        ChangeTableCompartmentRequest other = (ChangeTableCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.tableNameOrId, other.tableNameOrId)
                && java.util.Objects.equals(
                        this.changeTableCompartmentDetails, other.changeTableCompartmentDetails)
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
                        + (this.tableNameOrId == null ? 43 : this.tableNameOrId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeTableCompartmentDetails == null
                                ? 43
                                : this.changeTableCompartmentDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
