/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpdateResourceCategoriesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateResourceCategoriesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class UpdateResourceCategoriesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loganalytics.model.LogAnalyticsResourceCategoryDetails> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** Details for updating the specified category assignments of resources. */
    private com.oracle.bmc.loganalytics.model.LogAnalyticsResourceCategoryDetails
            updateResourceCategoriesDetails;

    /** Details for updating the specified category assignments of resources. */
    public com.oracle.bmc.loganalytics.model.LogAnalyticsResourceCategoryDetails
            getUpdateResourceCategoriesDetails() {
        return updateResourceCategoriesDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.loganalytics.model.LogAnalyticsResourceCategoryDetails getBody$() {
        return updateResourceCategoriesDetails;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateResourceCategoriesRequest,
                    com.oracle.bmc.loganalytics.model.LogAnalyticsResourceCategoryDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Logging Analytics namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /** Details for updating the specified category assignments of resources. */
        private com.oracle.bmc.loganalytics.model.LogAnalyticsResourceCategoryDetails
                updateResourceCategoriesDetails = null;

        /**
         * Details for updating the specified category assignments of resources.
         *
         * @param updateResourceCategoriesDetails the value to set
         * @return this builder instance
         */
        public Builder updateResourceCategoriesDetails(
                com.oracle.bmc.loganalytics.model.LogAnalyticsResourceCategoryDetails
                        updateResourceCategoriesDetails) {
            this.updateResourceCategoriesDetails = updateResourceCategoriesDetails;
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
        public Builder copy(UpdateResourceCategoriesRequest o) {
            namespaceName(o.getNamespaceName());
            updateResourceCategoriesDetails(o.getUpdateResourceCategoriesDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateResourceCategoriesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateResourceCategoriesRequest
         */
        public UpdateResourceCategoriesRequest build() {
            UpdateResourceCategoriesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.loganalytics.model.LogAnalyticsResourceCategoryDetails body) {
            updateResourceCategoriesDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateResourceCategoriesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateResourceCategoriesRequest
         */
        public UpdateResourceCategoriesRequest buildWithoutInvocationCallback() {
            UpdateResourceCategoriesRequest request = new UpdateResourceCategoriesRequest();
            request.namespaceName = namespaceName;
            request.updateResourceCategoriesDetails = updateResourceCategoriesDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateResourceCategoriesRequest(namespaceName, updateResourceCategoriesDetails,
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
                .namespaceName(namespaceName)
                .updateResourceCategoriesDetails(updateResourceCategoriesDetails)
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",updateResourceCategoriesDetails=")
                .append(String.valueOf(this.updateResourceCategoriesDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateResourceCategoriesRequest)) {
            return false;
        }

        UpdateResourceCategoriesRequest other = (UpdateResourceCategoriesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(
                        this.updateResourceCategoriesDetails, other.updateResourceCategoriesDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.updateResourceCategoriesDetails == null
                                ? 43
                                : this.updateResourceCategoriesDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
