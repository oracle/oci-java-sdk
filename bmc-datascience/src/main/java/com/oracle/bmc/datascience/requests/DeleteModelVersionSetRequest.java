/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/DeleteModelVersionSetExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * DeleteModelVersionSetRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class DeleteModelVersionSetRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the model version set.
     */
    private String modelVersionSetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the model version set.
     */
    public String getModelVersionSetId() {
        return modelVersionSetId;
    }
    /**
     * By default, this parameter is false. A model version set can only be deleted if all the
     * models associate with it are already in the DELETED state. You can optionally specify the
     * deleteRelatedModels boolean query parameters to true, which deletes all associated models for
     * you.
     */
    private Boolean isDeleteRelatedModels;

    /**
     * By default, this parameter is false. A model version set can only be deleted if all the
     * models associate with it are already in the DELETED state. You can optionally specify the
     * deleteRelatedModels boolean query parameters to true, which deletes all associated models for
     * you.
     */
    public Boolean getIsDeleteRelatedModels() {
        return isDeleteRelatedModels;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteModelVersionSetRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the model version set.
         */
        private String modelVersionSetId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the model version set.
         *
         * @param modelVersionSetId the value to set
         * @return this builder instance
         */
        public Builder modelVersionSetId(String modelVersionSetId) {
            this.modelVersionSetId = modelVersionSetId;
            return this;
        }

        /**
         * By default, this parameter is false. A model version set can only be deleted if all the
         * models associate with it are already in the DELETED state. You can optionally specify the
         * deleteRelatedModels boolean query parameters to true, which deletes all associated models
         * for you.
         */
        private Boolean isDeleteRelatedModels = null;

        /**
         * By default, this parameter is false. A model version set can only be deleted if all the
         * models associate with it are already in the DELETED state. You can optionally specify the
         * deleteRelatedModels boolean query parameters to true, which deletes all associated models
         * for you.
         *
         * @param isDeleteRelatedModels the value to set
         * @return this builder instance
         */
        public Builder isDeleteRelatedModels(Boolean isDeleteRelatedModels) {
            this.isDeleteRelatedModels = isDeleteRelatedModels;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
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
        public Builder copy(DeleteModelVersionSetRequest o) {
            modelVersionSetId(o.getModelVersionSetId());
            isDeleteRelatedModels(o.getIsDeleteRelatedModels());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteModelVersionSetRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteModelVersionSetRequest
         */
        public DeleteModelVersionSetRequest build() {
            DeleteModelVersionSetRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteModelVersionSetRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteModelVersionSetRequest
         */
        public DeleteModelVersionSetRequest buildWithoutInvocationCallback() {
            DeleteModelVersionSetRequest request = new DeleteModelVersionSetRequest();
            request.modelVersionSetId = modelVersionSetId;
            request.isDeleteRelatedModels = isDeleteRelatedModels;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new DeleteModelVersionSetRequest(modelVersionSetId, isDeleteRelatedModels, ifMatch,
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
                .modelVersionSetId(modelVersionSetId)
                .isDeleteRelatedModels(isDeleteRelatedModels)
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
        sb.append(",modelVersionSetId=").append(String.valueOf(this.modelVersionSetId));
        sb.append(",isDeleteRelatedModels=").append(String.valueOf(this.isDeleteRelatedModels));
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
        if (!(o instanceof DeleteModelVersionSetRequest)) {
            return false;
        }

        DeleteModelVersionSetRequest other = (DeleteModelVersionSetRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.modelVersionSetId, other.modelVersionSetId)
                && java.util.Objects.equals(this.isDeleteRelatedModels, other.isDeleteRelatedModels)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.modelVersionSetId == null ? 43 : this.modelVersionSetId.hashCode());
        result =
                (result * PRIME)
                        + (this.isDeleteRelatedModels == null
                                ? 43
                                : this.isDeleteRelatedModels.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
