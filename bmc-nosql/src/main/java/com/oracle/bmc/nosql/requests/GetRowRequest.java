/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.requests;

import com.oracle.bmc.nosql.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/nosql/GetRowExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetRowRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
public class GetRowRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
    /** Consistency requirement for a read operation. */
    private Consistency consistency;

    /** Consistency requirement for a read operation. */
    public enum Consistency implements com.oracle.bmc.http.internal.BmcEnum {
        Eventual("EVENTUAL"),
        Absolute("ABSOLUTE"),
        ;

        private final String value;
        private static java.util.Map<String, Consistency> map;

        static {
            map = new java.util.HashMap<>();
            for (Consistency v : Consistency.values()) {
                map.put(v.getValue(), v);
            }
        }

        Consistency(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Consistency create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Consistency: " + key);
        }
    };

    /** Consistency requirement for a read operation. */
    public Consistency getConsistency() {
        return consistency;
    }
    /** Timeout setting for this operation. */
    private Integer timeoutInMs;

    /** Timeout setting for this operation. */
    public Integer getTimeoutInMs() {
        return timeoutInMs;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<GetRowRequest, java.lang.Void> {
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

        /** Consistency requirement for a read operation. */
        private Consistency consistency = null;

        /**
         * Consistency requirement for a read operation.
         *
         * @param consistency the value to set
         * @return this builder instance
         */
        public Builder consistency(Consistency consistency) {
            this.consistency = consistency;
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
        public Builder copy(GetRowRequest o) {
            tableNameOrId(o.getTableNameOrId());
            key(o.getKey());
            compartmentId(o.getCompartmentId());
            consistency(o.getConsistency());
            timeoutInMs(o.getTimeoutInMs());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetRowRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetRowRequest
         */
        public GetRowRequest build() {
            GetRowRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetRowRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetRowRequest
         */
        public GetRowRequest buildWithoutInvocationCallback() {
            GetRowRequest request = new GetRowRequest();
            request.tableNameOrId = tableNameOrId;
            request.key = key;
            request.compartmentId = compartmentId;
            request.consistency = consistency;
            request.timeoutInMs = timeoutInMs;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetRowRequest(tableNameOrId, key, compartmentId, consistency, timeoutInMs,
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
                .key(key)
                .compartmentId(compartmentId)
                .consistency(consistency)
                .timeoutInMs(timeoutInMs)
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
        sb.append(",consistency=").append(String.valueOf(this.consistency));
        sb.append(",timeoutInMs=").append(String.valueOf(this.timeoutInMs));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetRowRequest)) {
            return false;
        }

        GetRowRequest other = (GetRowRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.tableNameOrId, other.tableNameOrId)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.consistency, other.consistency)
                && java.util.Objects.equals(this.timeoutInMs, other.timeoutInMs)
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
        result = (result * PRIME) + (this.consistency == null ? 43 : this.consistency.hashCode());
        result = (result * PRIME) + (this.timeoutInMs == null ? 43 : this.timeoutInMs.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
