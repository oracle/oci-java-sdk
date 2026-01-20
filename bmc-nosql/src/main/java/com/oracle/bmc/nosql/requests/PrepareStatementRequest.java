/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.requests;

import com.oracle.bmc.nosql.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/nosql/PrepareStatementExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use PrepareStatementRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
public class PrepareStatementRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ID of a table's compartment. */
    private String compartmentId;

    /** The ID of a table's compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A NoSQL SQL statement. */
    private String statement;

    /** A NoSQL SQL statement. */
    public String getStatement() {
        return statement;
    }
    /** Include a query execution plan in the result. */
    private Boolean isGetQueryPlan;

    /** Include a query execution plan in the result. */
    public Boolean getIsGetQueryPlan() {
        return isGetQueryPlan;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PrepareStatementRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ID of a table's compartment. */
        private String compartmentId = null;

        /**
         * The ID of a table's compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** A NoSQL SQL statement. */
        private String statement = null;

        /**
         * A NoSQL SQL statement.
         *
         * @param statement the value to set
         * @return this builder instance
         */
        public Builder statement(String statement) {
            this.statement = statement;
            return this;
        }

        /** Include a query execution plan in the result. */
        private Boolean isGetQueryPlan = null;

        /**
         * Include a query execution plan in the result.
         *
         * @param isGetQueryPlan the value to set
         * @return this builder instance
         */
        public Builder isGetQueryPlan(Boolean isGetQueryPlan) {
            this.isGetQueryPlan = isGetQueryPlan;
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
        public Builder copy(PrepareStatementRequest o) {
            compartmentId(o.getCompartmentId());
            statement(o.getStatement());
            isGetQueryPlan(o.getIsGetQueryPlan());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PrepareStatementRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of PrepareStatementRequest
         */
        public PrepareStatementRequest build() {
            PrepareStatementRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of PrepareStatementRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PrepareStatementRequest
         */
        public PrepareStatementRequest buildWithoutInvocationCallback() {
            PrepareStatementRequest request = new PrepareStatementRequest();
            request.compartmentId = compartmentId;
            request.statement = statement;
            request.isGetQueryPlan = isGetQueryPlan;
            request.opcRequestId = opcRequestId;
            return request;
            // new PrepareStatementRequest(compartmentId, statement, isGetQueryPlan, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .statement(statement)
                .isGetQueryPlan(isGetQueryPlan)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",statement=").append(String.valueOf(this.statement));
        sb.append(",isGetQueryPlan=").append(String.valueOf(this.isGetQueryPlan));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrepareStatementRequest)) {
            return false;
        }

        PrepareStatementRequest other = (PrepareStatementRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.statement, other.statement)
                && java.util.Objects.equals(this.isGetQueryPlan, other.isGetQueryPlan)
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
        result =
                (result * PRIME)
                        + (this.isGetQueryPlan == null ? 43 : this.isGetQueryPlan.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
