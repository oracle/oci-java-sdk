/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateCustomPropertyExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateCustomPropertyRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class UpdateCustomPropertyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datacatalog.model.UpdateCustomPropertyDetails> {

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
     * The information to be updated in the custom property.
     */
    private com.oracle.bmc.datacatalog.model.UpdateCustomPropertyDetails
            updateCustomPropertyDetails;

    /**
     * The information to be updated in the custom property.
     */
    public com.oracle.bmc.datacatalog.model.UpdateCustomPropertyDetails
            getUpdateCustomPropertyDetails() {
        return updateCustomPropertyDetails;
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
    public com.oracle.bmc.datacatalog.model.UpdateCustomPropertyDetails getBody$() {
        return updateCustomPropertyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateCustomPropertyRequest,
                    com.oracle.bmc.datacatalog.model.UpdateCustomPropertyDetails> {
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
         * The information to be updated in the custom property.
         */
        private com.oracle.bmc.datacatalog.model.UpdateCustomPropertyDetails
                updateCustomPropertyDetails = null;

        /**
         * The information to be updated in the custom property.
         * @param updateCustomPropertyDetails the value to set
         * @return this builder instance
         */
        public Builder updateCustomPropertyDetails(
                com.oracle.bmc.datacatalog.model.UpdateCustomPropertyDetails
                        updateCustomPropertyDetails) {
            this.updateCustomPropertyDetails = updateCustomPropertyDetails;
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
        public Builder copy(UpdateCustomPropertyRequest o) {
            catalogId(o.getCatalogId());
            namespaceId(o.getNamespaceId());
            customPropertyKey(o.getCustomPropertyKey());
            updateCustomPropertyDetails(o.getUpdateCustomPropertyDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateCustomPropertyRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateCustomPropertyRequest
         */
        public UpdateCustomPropertyRequest build() {
            UpdateCustomPropertyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datacatalog.model.UpdateCustomPropertyDetails body) {
            updateCustomPropertyDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateCustomPropertyRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateCustomPropertyRequest
         */
        public UpdateCustomPropertyRequest buildWithoutInvocationCallback() {
            UpdateCustomPropertyRequest request = new UpdateCustomPropertyRequest();
            request.catalogId = catalogId;
            request.namespaceId = namespaceId;
            request.customPropertyKey = customPropertyKey;
            request.updateCustomPropertyDetails = updateCustomPropertyDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateCustomPropertyRequest(catalogId, namespaceId, customPropertyKey, updateCustomPropertyDetails, ifMatch, opcRequestId);
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
                .updateCustomPropertyDetails(updateCustomPropertyDetails)
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
        sb.append(",namespaceId=").append(String.valueOf(this.namespaceId));
        sb.append(",customPropertyKey=").append(String.valueOf(this.customPropertyKey));
        sb.append(",updateCustomPropertyDetails=")
                .append(String.valueOf(this.updateCustomPropertyDetails));
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
        if (!(o instanceof UpdateCustomPropertyRequest)) {
            return false;
        }

        UpdateCustomPropertyRequest other = (UpdateCustomPropertyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.namespaceId, other.namespaceId)
                && java.util.Objects.equals(this.customPropertyKey, other.customPropertyKey)
                && java.util.Objects.equals(
                        this.updateCustomPropertyDetails, other.updateCustomPropertyDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
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
        result =
                (result * PRIME)
                        + (this.updateCustomPropertyDetails == null
                                ? 43
                                : this.updateCustomPropertyDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
