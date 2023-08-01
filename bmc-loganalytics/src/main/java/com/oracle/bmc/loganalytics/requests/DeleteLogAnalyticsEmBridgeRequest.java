/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/DeleteLogAnalyticsEmBridgeExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * DeleteLogAnalyticsEmBridgeRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class DeleteLogAnalyticsEmBridgeRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** The log analytics enterprise manager bridge OCID. */
    private String logAnalyticsEmBridgeId;

    /** The log analytics enterprise manager bridge OCID. */
    public String getLogAnalyticsEmBridgeId() {
        return logAnalyticsEmBridgeId;
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
    /** If true, delete entities created by this bridge */
    private Boolean isDeleteEntities;

    /** If true, delete entities created by this bridge */
    public Boolean getIsDeleteEntities() {
        return isDeleteEntities;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteLogAnalyticsEmBridgeRequest, java.lang.Void> {
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

        /** The log analytics enterprise manager bridge OCID. */
        private String logAnalyticsEmBridgeId = null;

        /**
         * The log analytics enterprise manager bridge OCID.
         *
         * @param logAnalyticsEmBridgeId the value to set
         * @return this builder instance
         */
        public Builder logAnalyticsEmBridgeId(String logAnalyticsEmBridgeId) {
            this.logAnalyticsEmBridgeId = logAnalyticsEmBridgeId;
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

        /** If true, delete entities created by this bridge */
        private Boolean isDeleteEntities = null;

        /**
         * If true, delete entities created by this bridge
         *
         * @param isDeleteEntities the value to set
         * @return this builder instance
         */
        public Builder isDeleteEntities(Boolean isDeleteEntities) {
            this.isDeleteEntities = isDeleteEntities;
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
        public Builder copy(DeleteLogAnalyticsEmBridgeRequest o) {
            namespaceName(o.getNamespaceName());
            logAnalyticsEmBridgeId(o.getLogAnalyticsEmBridgeId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            isDeleteEntities(o.getIsDeleteEntities());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteLogAnalyticsEmBridgeRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteLogAnalyticsEmBridgeRequest
         */
        public DeleteLogAnalyticsEmBridgeRequest build() {
            DeleteLogAnalyticsEmBridgeRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteLogAnalyticsEmBridgeRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteLogAnalyticsEmBridgeRequest
         */
        public DeleteLogAnalyticsEmBridgeRequest buildWithoutInvocationCallback() {
            DeleteLogAnalyticsEmBridgeRequest request = new DeleteLogAnalyticsEmBridgeRequest();
            request.namespaceName = namespaceName;
            request.logAnalyticsEmBridgeId = logAnalyticsEmBridgeId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.isDeleteEntities = isDeleteEntities;
            return request;
            // new DeleteLogAnalyticsEmBridgeRequest(namespaceName, logAnalyticsEmBridgeId, ifMatch,
            // opcRequestId, isDeleteEntities);
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
                .logAnalyticsEmBridgeId(logAnalyticsEmBridgeId)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .isDeleteEntities(isDeleteEntities);
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
        sb.append(",logAnalyticsEmBridgeId=").append(String.valueOf(this.logAnalyticsEmBridgeId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isDeleteEntities=").append(String.valueOf(this.isDeleteEntities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteLogAnalyticsEmBridgeRequest)) {
            return false;
        }

        DeleteLogAnalyticsEmBridgeRequest other = (DeleteLogAnalyticsEmBridgeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(
                        this.logAnalyticsEmBridgeId, other.logAnalyticsEmBridgeId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isDeleteEntities, other.isDeleteEntities);
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
                        + (this.logAnalyticsEmBridgeId == null
                                ? 43
                                : this.logAnalyticsEmBridgeId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.isDeleteEntities == null ? 43 : this.isDeleteEntities.hashCode());
        return result;
    }
}
