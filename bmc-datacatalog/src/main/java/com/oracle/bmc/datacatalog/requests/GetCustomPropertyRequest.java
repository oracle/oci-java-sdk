/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetCustomPropertyExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetCustomPropertyRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class GetCustomPropertyRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique catalog identifier.
     */
    private String catalogId;

    /**
     * Unique catalog identifier.
     */
    public String getCatalogId() {
        return catalogId;
    }
    /**
     * Unique namespace identifier.
     */
    private String namespaceId;

    /**
     * Unique namespace identifier.
     */
    public String getNamespaceId() {
        return namespaceId;
    }
    /**
     * Unique Custom Property key
     */
    private String customPropertyKey;

    /**
     * Unique Custom Property key
     */
    public String getCustomPropertyKey() {
        return customPropertyKey;
    }
    /**
     * Specifies the fields to return in a custom property response.
     *
     */
    private java.util.List<Fields> fields;

    /**
     * Specifies the fields to return in a custom property response.
     *
     **/
    public enum Fields {
        Key("key"),
        DisplayName("displayName"),
        Description("description"),
        DataType("dataType"),
        NamespaceName("namespaceName"),
        LifecycleState("lifecycleState"),
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
        CreatedById("createdById"),
        UpdatedById("updatedById"),
        Properties("properties"),
        ;

        private final String value;
        private static java.util.Map<String, Fields> map;

        static {
            map = new java.util.HashMap<>();
            for (Fields v : Fields.values()) {
                map.put(v.getValue(), v);
            }
        }

        Fields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Fields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Fields: " + key);
        }
    };

    /**
     * Specifies the fields to return in a custom property response.
     *
     */
    public java.util.List<Fields> getFields() {
        return fields;
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
                    GetCustomPropertyRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique catalog identifier.
         */
        private String catalogId = null;

        /**
         * Unique catalog identifier.
         * @param catalogId the value to set
         * @return this builder instance
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * Unique namespace identifier.
         */
        private String namespaceId = null;

        /**
         * Unique namespace identifier.
         * @param namespaceId the value to set
         * @return this builder instance
         */
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * Unique Custom Property key
         */
        private String customPropertyKey = null;

        /**
         * Unique Custom Property key
         * @param customPropertyKey the value to set
         * @return this builder instance
         */
        public Builder customPropertyKey(String customPropertyKey) {
            this.customPropertyKey = customPropertyKey;
            return this;
        }

        /**
         * Specifies the fields to return in a custom property response.
         *
         */
        private java.util.List<Fields> fields = null;

        /**
         * Specifies the fields to return in a custom property response.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in a custom property response.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
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
        public Builder copy(GetCustomPropertyRequest o) {
            catalogId(o.getCatalogId());
            namespaceId(o.getNamespaceId());
            customPropertyKey(o.getCustomPropertyKey());
            fields(o.getFields());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetCustomPropertyRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetCustomPropertyRequest
         */
        public GetCustomPropertyRequest build() {
            GetCustomPropertyRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetCustomPropertyRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetCustomPropertyRequest
         */
        public GetCustomPropertyRequest buildWithoutInvocationCallback() {
            GetCustomPropertyRequest request = new GetCustomPropertyRequest();
            request.catalogId = catalogId;
            request.namespaceId = namespaceId;
            request.customPropertyKey = customPropertyKey;
            request.fields = fields;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetCustomPropertyRequest(catalogId, namespaceId, customPropertyKey, fields, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogId(catalogId)
                .namespaceId(namespaceId)
                .customPropertyKey(customPropertyKey)
                .fields(fields)
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
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",namespaceId=").append(String.valueOf(this.namespaceId));
        sb.append(",customPropertyKey=").append(String.valueOf(this.customPropertyKey));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetCustomPropertyRequest)) {
            return false;
        }

        GetCustomPropertyRequest other = (GetCustomPropertyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.namespaceId, other.namespaceId)
                && java.util.Objects.equals(this.customPropertyKey, other.customPropertyKey)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.namespaceId == null ? 43 : this.namespaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.customPropertyKey == null ? 43 : this.customPropertyKey.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
