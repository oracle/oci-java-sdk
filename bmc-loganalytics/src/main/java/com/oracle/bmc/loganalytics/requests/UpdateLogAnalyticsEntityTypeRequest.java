/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpdateLogAnalyticsEntityTypeExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateLogAnalyticsEntityTypeRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class UpdateLogAnalyticsEntityTypeRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loganalytics.model.UpdateLogAnalyticsEntityTypeDetails> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * Log analytics entity type update details.
     */
    private com.oracle.bmc.loganalytics.model.UpdateLogAnalyticsEntityTypeDetails
            updateLogAnalyticsEntityTypeDetails;

    public com.oracle.bmc.loganalytics.model.UpdateLogAnalyticsEntityTypeDetails
            getUpdateLogAnalyticsEntityTypeDetails() {
        return updateLogAnalyticsEntityTypeDetails;
    }
    /**
     * Log analytics entity type name.
     *
     */
    private String entityTypeName;

    public String getEntityTypeName() {
        return entityTypeName;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
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

    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.loganalytics.model.UpdateLogAnalyticsEntityTypeDetails getBody$() {
        return updateLogAnalyticsEntityTypeDetails;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateLogAnalyticsEntityTypeRequest,
                    com.oracle.bmc.loganalytics.model.UpdateLogAnalyticsEntityTypeDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        private com.oracle.bmc.loganalytics.model.UpdateLogAnalyticsEntityTypeDetails
                updateLogAnalyticsEntityTypeDetails = null;

        /**
         * Log analytics entity type update details.
         * @return this builder instance
         */
        public Builder updateLogAnalyticsEntityTypeDetails(
                com.oracle.bmc.loganalytics.model.UpdateLogAnalyticsEntityTypeDetails
                        updateLogAnalyticsEntityTypeDetails) {
            this.updateLogAnalyticsEntityTypeDetails = updateLogAnalyticsEntityTypeDetails;
            return this;
        }

        private String entityTypeName = null;

        /**
         * Log analytics entity type name.
         *
         * @return this builder instance
         */
        public Builder entityTypeName(String entityTypeName) {
            this.entityTypeName = entityTypeName;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateLogAnalyticsEntityTypeRequest o) {
            namespaceName(o.getNamespaceName());
            updateLogAnalyticsEntityTypeDetails(o.getUpdateLogAnalyticsEntityTypeDetails());
            entityTypeName(o.getEntityTypeName());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateLogAnalyticsEntityTypeRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateLogAnalyticsEntityTypeRequest
         */
        public UpdateLogAnalyticsEntityTypeRequest build() {
            UpdateLogAnalyticsEntityTypeRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.loganalytics.model.UpdateLogAnalyticsEntityTypeDetails body) {
            updateLogAnalyticsEntityTypeDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateLogAnalyticsEntityTypeRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateLogAnalyticsEntityTypeRequest
         */
        public UpdateLogAnalyticsEntityTypeRequest buildWithoutInvocationCallback() {
            UpdateLogAnalyticsEntityTypeRequest request = new UpdateLogAnalyticsEntityTypeRequest();
            request.namespaceName = namespaceName;
            request.updateLogAnalyticsEntityTypeDetails = updateLogAnalyticsEntityTypeDetails;
            request.entityTypeName = entityTypeName;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateLogAnalyticsEntityTypeRequest(namespaceName, updateLogAnalyticsEntityTypeDetails, entityTypeName, opcRequestId, ifMatch);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .updateLogAnalyticsEntityTypeDetails(updateLogAnalyticsEntityTypeDetails)
                .entityTypeName(entityTypeName)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",updateLogAnalyticsEntityTypeDetails=")
                .append(String.valueOf(this.updateLogAnalyticsEntityTypeDetails));
        sb.append(",entityTypeName=").append(String.valueOf(this.entityTypeName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateLogAnalyticsEntityTypeRequest)) {
            return false;
        }

        UpdateLogAnalyticsEntityTypeRequest other = (UpdateLogAnalyticsEntityTypeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(
                        this.updateLogAnalyticsEntityTypeDetails,
                        other.updateLogAnalyticsEntityTypeDetails)
                && java.util.Objects.equals(this.entityTypeName, other.entityTypeName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
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
                        + (this.updateLogAnalyticsEntityTypeDetails == null
                                ? 43
                                : this.updateLogAnalyticsEntityTypeDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.entityTypeName == null ? 43 : this.entityTypeName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
