/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.requests;

import com.oracle.bmc.psql.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/psql/GetDbSystemExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetDbSystemRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
public class GetDbSystemRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** A unique identifier for the database system. */
    private String dbSystemId;

    /** A unique identifier for the database system. */
    public String getDbSystemId() {
        return dbSystemId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A filter to exclude database configuration when this query parameter is set to
     * OverrideDbConfig.
     */
    private java.util.List<ExcludedFields> excludedFields;

    /**
     * A filter to exclude database configuration when this query parameter is set to
     * OverrideDbConfig.
     */
    public enum ExcludedFields implements com.oracle.bmc.http.internal.BmcEnum {
        DbConfigurationParams("dbConfigurationParams"),
        ;

        private final String value;
        private static java.util.Map<String, ExcludedFields> map;

        static {
            map = new java.util.HashMap<>();
            for (ExcludedFields v : ExcludedFields.values()) {
                map.put(v.getValue(), v);
            }
        }

        ExcludedFields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExcludedFields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ExcludedFields: " + key);
        }
    };

    /**
     * A filter to exclude database configuration when this query parameter is set to
     * OverrideDbConfig.
     */
    public java.util.List<ExcludedFields> getExcludedFields() {
        return excludedFields;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDbSystemRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** A unique identifier for the database system. */
        private String dbSystemId = null;

        /**
         * A unique identifier for the database system.
         *
         * @param dbSystemId the value to set
         * @return this builder instance
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
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
         * A filter to exclude database configuration when this query parameter is set to
         * OverrideDbConfig.
         */
        private java.util.List<ExcludedFields> excludedFields = null;

        /**
         * A filter to exclude database configuration when this query parameter is set to
         * OverrideDbConfig.
         *
         * @param excludedFields the value to set
         * @return this builder instance
         */
        public Builder excludedFields(java.util.List<ExcludedFields> excludedFields) {
            this.excludedFields = excludedFields;
            return this;
        }

        /**
         * Singular setter. A filter to exclude database configuration when this query parameter is
         * set to OverrideDbConfig.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder excludedFields(ExcludedFields singularValue) {
            return this.excludedFields(java.util.Arrays.asList(singularValue));
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
        public Builder copy(GetDbSystemRequest o) {
            dbSystemId(o.getDbSystemId());
            opcRequestId(o.getOpcRequestId());
            excludedFields(o.getExcludedFields());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDbSystemRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDbSystemRequest
         */
        public GetDbSystemRequest build() {
            GetDbSystemRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDbSystemRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDbSystemRequest
         */
        public GetDbSystemRequest buildWithoutInvocationCallback() {
            GetDbSystemRequest request = new GetDbSystemRequest();
            request.dbSystemId = dbSystemId;
            request.opcRequestId = opcRequestId;
            request.excludedFields = excludedFields;
            return request;
            // new GetDbSystemRequest(dbSystemId, opcRequestId, excludedFields);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dbSystemId(dbSystemId)
                .opcRequestId(opcRequestId)
                .excludedFields(excludedFields);
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
        sb.append(",dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",excludedFields=").append(String.valueOf(this.excludedFields));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDbSystemRequest)) {
            return false;
        }

        GetDbSystemRequest other = (GetDbSystemRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.excludedFields, other.excludedFields);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.excludedFields == null ? 43 : this.excludedFields.hashCode());
        return result;
    }
}
