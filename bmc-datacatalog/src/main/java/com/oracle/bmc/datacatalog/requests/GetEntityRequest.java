/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetEntityExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetEntityRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class GetEntityRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * Unique data asset key.
     */
    private String dataAssetKey;

    /**
     * Unique data asset key.
     */
    public String getDataAssetKey() {
        return dataAssetKey;
    }
    /**
     * Unique entity key.
     */
    private String entityKey;

    /**
     * Unique entity key.
     */
    public String getEntityKey() {
        return entityKey;
    }
    /**
     * Indicates whether the list of objects and their relationships to this object will be provided in the response.
     */
    private Boolean isIncludeObjectRelationships;

    /**
     * Indicates whether the list of objects and their relationships to this object will be provided in the response.
     */
    public Boolean getIsIncludeObjectRelationships() {
        return isIncludeObjectRelationships;
    }
    /**
     * Specifies the fields to return in an entity response.
     *
     */
    private java.util.List<Fields> fields;

    /**
     * Specifies the fields to return in an entity response.
     *
     **/
    public enum Fields {
        Key("key"),
        DisplayName("displayName"),
        Description("description"),
        DataAssetKey("dataAssetKey"),
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
        CreatedById("createdById"),
        UpdatedById("updatedById"),
        LifecycleState("lifecycleState"),
        ExternalKey("externalKey"),
        TimeExternal("timeExternal"),
        TimeStatusUpdated("timeStatusUpdated"),
        IsLogical("isLogical"),
        IsPartition("isPartition"),
        FolderKey("folderKey"),
        FolderName("folderName"),
        TypeKey("typeKey"),
        Path("path"),
        HarvestStatus("harvestStatus"),
        LastJobKey("lastJobKey"),
        Uri("uri"),
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
     * Specifies the fields to return in an entity response.
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
                    GetEntityRequest, java.lang.Void> {
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
         * Unique data asset key.
         */
        private String dataAssetKey = null;

        /**
         * Unique data asset key.
         * @param dataAssetKey the value to set
         * @return this builder instance
         */
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            return this;
        }

        /**
         * Unique entity key.
         */
        private String entityKey = null;

        /**
         * Unique entity key.
         * @param entityKey the value to set
         * @return this builder instance
         */
        public Builder entityKey(String entityKey) {
            this.entityKey = entityKey;
            return this;
        }

        /**
         * Indicates whether the list of objects and their relationships to this object will be provided in the response.
         */
        private Boolean isIncludeObjectRelationships = null;

        /**
         * Indicates whether the list of objects and their relationships to this object will be provided in the response.
         * @param isIncludeObjectRelationships the value to set
         * @return this builder instance
         */
        public Builder isIncludeObjectRelationships(Boolean isIncludeObjectRelationships) {
            this.isIncludeObjectRelationships = isIncludeObjectRelationships;
            return this;
        }

        /**
         * Specifies the fields to return in an entity response.
         *
         */
        private java.util.List<Fields> fields = null;

        /**
         * Specifies the fields to return in an entity response.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in an entity response.
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
        public Builder copy(GetEntityRequest o) {
            catalogId(o.getCatalogId());
            dataAssetKey(o.getDataAssetKey());
            entityKey(o.getEntityKey());
            isIncludeObjectRelationships(o.getIsIncludeObjectRelationships());
            fields(o.getFields());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetEntityRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetEntityRequest
         */
        public GetEntityRequest build() {
            GetEntityRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetEntityRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetEntityRequest
         */
        public GetEntityRequest buildWithoutInvocationCallback() {
            GetEntityRequest request = new GetEntityRequest();
            request.catalogId = catalogId;
            request.dataAssetKey = dataAssetKey;
            request.entityKey = entityKey;
            request.isIncludeObjectRelationships = isIncludeObjectRelationships;
            request.fields = fields;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetEntityRequest(catalogId, dataAssetKey, entityKey, isIncludeObjectRelationships, fields, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogId(catalogId)
                .dataAssetKey(dataAssetKey)
                .entityKey(entityKey)
                .isIncludeObjectRelationships(isIncludeObjectRelationships)
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
        sb.append(",dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(",entityKey=").append(String.valueOf(this.entityKey));
        sb.append(",isIncludeObjectRelationships=")
                .append(String.valueOf(this.isIncludeObjectRelationships));
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
        if (!(o instanceof GetEntityRequest)) {
            return false;
        }

        GetEntityRequest other = (GetEntityRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.entityKey, other.entityKey)
                && java.util.Objects.equals(
                        this.isIncludeObjectRelationships, other.isIncludeObjectRelationships)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result = (result * PRIME) + (this.entityKey == null ? 43 : this.entityKey.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncludeObjectRelationships == null
                                ? 43
                                : this.isIncludeObjectRelationships.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
