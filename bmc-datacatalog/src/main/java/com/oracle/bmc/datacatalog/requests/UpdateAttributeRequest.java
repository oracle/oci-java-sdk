/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateAttributeExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateAttributeRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class UpdateAttributeRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datacatalog.model.UpdateAttributeDetails> {

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
     * Unique attribute key.
     */
    private String attributeKey;

    /**
     * Unique attribute key.
     */
    public String getAttributeKey() {
        return attributeKey;
    }
    /**
     * The information to be updated in the attribute.
     */
    private com.oracle.bmc.datacatalog.model.UpdateAttributeDetails updateAttributeDetails;

    /**
     * The information to be updated in the attribute.
     */
    public com.oracle.bmc.datacatalog.model.UpdateAttributeDetails getUpdateAttributeDetails() {
        return updateAttributeDetails;
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
    public com.oracle.bmc.datacatalog.model.UpdateAttributeDetails getBody$() {
        return updateAttributeDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAttributeRequest,
                    com.oracle.bmc.datacatalog.model.UpdateAttributeDetails> {
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
         * Unique attribute key.
         */
        private String attributeKey = null;

        /**
         * Unique attribute key.
         * @param attributeKey the value to set
         * @return this builder instance
         */
        public Builder attributeKey(String attributeKey) {
            this.attributeKey = attributeKey;
            return this;
        }

        /**
         * The information to be updated in the attribute.
         */
        private com.oracle.bmc.datacatalog.model.UpdateAttributeDetails updateAttributeDetails =
                null;

        /**
         * The information to be updated in the attribute.
         * @param updateAttributeDetails the value to set
         * @return this builder instance
         */
        public Builder updateAttributeDetails(
                com.oracle.bmc.datacatalog.model.UpdateAttributeDetails updateAttributeDetails) {
            this.updateAttributeDetails = updateAttributeDetails;
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
        public Builder copy(UpdateAttributeRequest o) {
            catalogId(o.getCatalogId());
            dataAssetKey(o.getDataAssetKey());
            entityKey(o.getEntityKey());
            attributeKey(o.getAttributeKey());
            updateAttributeDetails(o.getUpdateAttributeDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAttributeRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateAttributeRequest
         */
        public UpdateAttributeRequest build() {
            UpdateAttributeRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datacatalog.model.UpdateAttributeDetails body) {
            updateAttributeDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAttributeRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAttributeRequest
         */
        public UpdateAttributeRequest buildWithoutInvocationCallback() {
            UpdateAttributeRequest request = new UpdateAttributeRequest();
            request.catalogId = catalogId;
            request.dataAssetKey = dataAssetKey;
            request.entityKey = entityKey;
            request.attributeKey = attributeKey;
            request.updateAttributeDetails = updateAttributeDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateAttributeRequest(catalogId, dataAssetKey, entityKey, attributeKey, updateAttributeDetails, ifMatch, opcRequestId);
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
                .attributeKey(attributeKey)
                .updateAttributeDetails(updateAttributeDetails)
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
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(",entityKey=").append(String.valueOf(this.entityKey));
        sb.append(",attributeKey=").append(String.valueOf(this.attributeKey));
        sb.append(",updateAttributeDetails=").append(String.valueOf(this.updateAttributeDetails));
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
        if (!(o instanceof UpdateAttributeRequest)) {
            return false;
        }

        UpdateAttributeRequest other = (UpdateAttributeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.entityKey, other.entityKey)
                && java.util.Objects.equals(this.attributeKey, other.attributeKey)
                && java.util.Objects.equals(
                        this.updateAttributeDetails, other.updateAttributeDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result = (result * PRIME) + (this.entityKey == null ? 43 : this.entityKey.hashCode());
        result = (result * PRIME) + (this.attributeKey == null ? 43 : this.attributeKey.hashCode());
        result =
                (result * PRIME)
                        + (this.updateAttributeDetails == null
                                ? 43
                                : this.updateAttributeDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
