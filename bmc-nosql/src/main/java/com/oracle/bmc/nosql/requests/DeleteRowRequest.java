/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.requests;

import com.oracle.bmc.nosql.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/nosql/DeleteRowExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteRowRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
public class DeleteRowRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** A table name within the compartment, or a table OCID. */
    private String tableNameOrId;

    /** A table name within the compartment, or a table OCID. */
    public String getTableNameOrId() {
        return tableNameOrId;
    }
    /**
     * An array of strings, each of the format "column-name:value", representing the primary key of
     * the row.
     */
    private java.util.List<String> key;

    /**
     * An array of strings, each of the format "column-name:value", representing the primary key of
     * the row.
     */
    public java.util.List<String> getKey() {
        return key;
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
    /**
     * If true, and the operation fails due to an option setting (ifVersion et al), then the
     * existing row will be returned.
     */
    private Boolean isGetReturnRow;

    /**
     * If true, and the operation fails due to an option setting (ifVersion et al), then the
     * existing row will be returned.
     */
    public Boolean getIsGetReturnRow() {
        return isGetReturnRow;
    }
    /** Timeout setting for this operation. */
    private Integer timeoutInMs;

    /** Timeout setting for this operation. */
    public Integer getTimeoutInMs() {
        return timeoutInMs;
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
                    DeleteRowRequest, java.lang.Void> {
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

        /**
         * An array of strings, each of the format "column-name:value", representing the primary key
         * of the row.
         */
        private java.util.List<String> key = null;

        /**
         * An array of strings, each of the format "column-name:value", representing the primary key
         * of the row.
         *
         * @param key the value to set
         * @return this builder instance
         */
        public Builder key(java.util.List<String> key) {
            this.key = key;
            return this;
        }

        /**
         * Singular setter. An array of strings, each of the format "column-name:value",
         * representing the primary key of the row.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder key(String singularValue) {
            return this.key(java.util.Arrays.asList(singularValue));
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

        /**
         * If true, and the operation fails due to an option setting (ifVersion et al), then the
         * existing row will be returned.
         */
        private Boolean isGetReturnRow = null;

        /**
         * If true, and the operation fails due to an option setting (ifVersion et al), then the
         * existing row will be returned.
         *
         * @param isGetReturnRow the value to set
         * @return this builder instance
         */
        public Builder isGetReturnRow(Boolean isGetReturnRow) {
            this.isGetReturnRow = isGetReturnRow;
            return this;
        }

        /** Timeout setting for this operation. */
        private Integer timeoutInMs = null;

        /**
         * Timeout setting for this operation.
         *
         * @param timeoutInMs the value to set
         * @return this builder instance
         */
        public Builder timeoutInMs(Integer timeoutInMs) {
            this.timeoutInMs = timeoutInMs;
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
        public Builder copy(DeleteRowRequest o) {
            tableNameOrId(o.getTableNameOrId());
            key(o.getKey());
            compartmentId(o.getCompartmentId());
            isGetReturnRow(o.getIsGetReturnRow());
            timeoutInMs(o.getTimeoutInMs());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteRowRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteRowRequest
         */
        public DeleteRowRequest build() {
            DeleteRowRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteRowRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteRowRequest
         */
        public DeleteRowRequest buildWithoutInvocationCallback() {
            DeleteRowRequest request = new DeleteRowRequest();
            request.tableNameOrId = tableNameOrId;
            request.key = key;
            request.compartmentId = compartmentId;
            request.isGetReturnRow = isGetReturnRow;
            request.timeoutInMs = timeoutInMs;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new DeleteRowRequest(tableNameOrId, key, compartmentId, isGetReturnRow, timeoutInMs,
            // ifMatch, opcRequestId);
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
                .key(key)
                .compartmentId(compartmentId)
                .isGetReturnRow(isGetReturnRow)
                .timeoutInMs(timeoutInMs)
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
        sb.append(",key=").append(String.valueOf(this.key));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",isGetReturnRow=").append(String.valueOf(this.isGetReturnRow));
        sb.append(",timeoutInMs=").append(String.valueOf(this.timeoutInMs));
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
        if (!(o instanceof DeleteRowRequest)) {
            return false;
        }

        DeleteRowRequest other = (DeleteRowRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.tableNameOrId, other.tableNameOrId)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isGetReturnRow, other.isGetReturnRow)
                && java.util.Objects.equals(this.timeoutInMs, other.timeoutInMs)
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
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isGetReturnRow == null ? 43 : this.isGetReturnRow.hashCode());
        result = (result * PRIME) + (this.timeoutInMs == null ? 43 : this.timeoutInMs.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
