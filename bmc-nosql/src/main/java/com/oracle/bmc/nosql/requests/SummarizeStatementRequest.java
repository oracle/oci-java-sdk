/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.requests;

import com.oracle.bmc.nosql.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/nosql/SummarizeStatementExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SummarizeStatementRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
public class SummarizeStatementRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of a table's compartment.
     */
    private String compartmentId;

    /**
     * The ID of a table's compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A NoSQL SQL statement.
     */
    private String statement;

    /**
     * A NoSQL SQL statement.
     */
    public String getStatement() {
        return statement;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeStatementRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID of a table's compartment.
         */
        private String compartmentId = null;

        /**
         * The ID of a table's compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A NoSQL SQL statement.
         */
        private String statement = null;

        /**
         * A NoSQL SQL statement.
         * @param statement the value to set
         * @return this builder instance
         */
        public Builder statement(String statement) {
            this.statement = statement;
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
        public Builder copy(SummarizeStatementRequest o) {
            compartmentId(o.getCompartmentId());
            statement(o.getStatement());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeStatementRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SummarizeStatementRequest
         */
        public SummarizeStatementRequest build() {
            SummarizeStatementRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeStatementRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeStatementRequest
         */
        public SummarizeStatementRequest buildWithoutInvocationCallback() {
            SummarizeStatementRequest request = new SummarizeStatementRequest();
            request.compartmentId = compartmentId;
            request.statement = statement;
            request.opcRequestId = opcRequestId;
            return request;
            // new SummarizeStatementRequest(compartmentId, statement, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .statement(statement)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",statement=").append(String.valueOf(this.statement));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeStatementRequest)) {
            return false;
        }

        SummarizeStatementRequest other = (SummarizeStatementRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.statement, other.statement)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.statement == null ? 43 : this.statement.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
