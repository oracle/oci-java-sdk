/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.requests;

import com.oracle.bmc.nosql.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/nosql/DeleteIndexExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteIndexRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
public class DeleteIndexRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** A table name within the compartment, or a table OCID. */
    private String tableNameOrId;

    /** A table name within the compartment, or a table OCID. */
    public String getTableNameOrId() {
        return tableNameOrId;
    }
    /** The name of a table's index. */
    private String indexName;

    /** The name of a table's index. */
    public String getIndexName() {
        return indexName;
    }
    /**
     * The ID of a table's compartment. When a table is identified by name, the compartmentId is
     * often needed to provide context for interpreting the name.
     */
    private String compartmentId;

    /**
     * The ID of a table's compartment. When a table is identified by name, the compartmentId is
     * often needed to provide context for interpreting the name.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** Set as true to select "if exists" behavior. */
    private Boolean isIfExists;

    /** Set as true to select "if exists" behavior. */
    public Boolean getIsIfExists() {
        return isIfExists;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteIndexRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** A table name within the compartment, or a table OCID. */
        private String tableNameOrId = null;

        /**
         * A table name within the compartment, or a table OCID.
         *
         * @param tableNameOrId the value to set
         * @return this builder instance
         */
        public Builder tableNameOrId(String tableNameOrId) {
            this.tableNameOrId = tableNameOrId;
            return this;
        }

        /** The name of a table's index. */
        private String indexName = null;

        /**
         * The name of a table's index.
         *
         * @param indexName the value to set
         * @return this builder instance
         */
        public Builder indexName(String indexName) {
            this.indexName = indexName;
            return this;
        }

        /**
         * The ID of a table's compartment. When a table is identified by name, the compartmentId is
         * often needed to provide context for interpreting the name.
         */
        private String compartmentId = null;

        /**
         * The ID of a table's compartment. When a table is identified by name, the compartmentId is
         * often needed to provide context for interpreting the name.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** Set as true to select "if exists" behavior. */
        private Boolean isIfExists = null;

        /**
         * Set as true to select "if exists" behavior.
         *
         * @param isIfExists the value to set
         * @return this builder instance
         */
        public Builder isIfExists(Boolean isIfExists) {
            this.isIfExists = isIfExists;
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
        public Builder copy(DeleteIndexRequest o) {
            tableNameOrId(o.getTableNameOrId());
            indexName(o.getIndexName());
            compartmentId(o.getCompartmentId());
            isIfExists(o.getIsIfExists());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteIndexRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteIndexRequest
         */
        public DeleteIndexRequest build() {
            DeleteIndexRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteIndexRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteIndexRequest
         */
        public DeleteIndexRequest buildWithoutInvocationCallback() {
            DeleteIndexRequest request = new DeleteIndexRequest();
            request.tableNameOrId = tableNameOrId;
            request.indexName = indexName;
            request.compartmentId = compartmentId;
            request.isIfExists = isIfExists;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new DeleteIndexRequest(tableNameOrId, indexName, compartmentId, isIfExists, ifMatch,
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
                .tableNameOrId(tableNameOrId)
                .indexName(indexName)
                .compartmentId(compartmentId)
                .isIfExists(isIfExists)
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
        sb.append(",tableNameOrId=").append(String.valueOf(this.tableNameOrId));
        sb.append(",indexName=").append(String.valueOf(this.indexName));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",isIfExists=").append(String.valueOf(this.isIfExists));
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
        if (!(o instanceof DeleteIndexRequest)) {
            return false;
        }

        DeleteIndexRequest other = (DeleteIndexRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.tableNameOrId, other.tableNameOrId)
                && java.util.Objects.equals(this.indexName, other.indexName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isIfExists, other.isIfExists)
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
        result = (result * PRIME) + (this.indexName == null ? 43 : this.indexName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.isIfExists == null ? 43 : this.isIfExists.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
