/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/DeleteDetectorRecipeDetectorRuleDataSourceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * DeleteDetectorRecipeDetectorRuleDataSourceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class DeleteDetectorRecipeDetectorRuleDataSourceRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Detector recipe OCID */
    private String detectorRecipeId;

    /** Detector recipe OCID */
    public String getDetectorRecipeId() {
        return detectorRecipeId;
    }
    /** The unique identifier of a detector rule. */
    private String detectorRuleId;

    /** The unique identifier of a detector rule. */
    public String getDetectorRuleId() {
        return detectorRuleId;
    }
    /** Data source OCID. */
    private String dataSourceId;

    /** Data source OCID. */
    public String getDataSourceId() {
        return dataSourceId;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteDetectorRecipeDetectorRuleDataSourceRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Detector recipe OCID */
        private String detectorRecipeId = null;

        /**
         * Detector recipe OCID
         *
         * @param detectorRecipeId the value to set
         * @return this builder instance
         */
        public Builder detectorRecipeId(String detectorRecipeId) {
            this.detectorRecipeId = detectorRecipeId;
            return this;
        }

        /** The unique identifier of a detector rule. */
        private String detectorRuleId = null;

        /**
         * The unique identifier of a detector rule.
         *
         * @param detectorRuleId the value to set
         * @return this builder instance
         */
        public Builder detectorRuleId(String detectorRuleId) {
            this.detectorRuleId = detectorRuleId;
            return this;
        }

        /** Data source OCID. */
        private String dataSourceId = null;

        /**
         * Data source OCID.
         *
         * @param dataSourceId the value to set
         * @return this builder instance
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
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
        public Builder copy(DeleteDetectorRecipeDetectorRuleDataSourceRequest o) {
            detectorRecipeId(o.getDetectorRecipeId());
            detectorRuleId(o.getDetectorRuleId());
            dataSourceId(o.getDataSourceId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteDetectorRecipeDetectorRuleDataSourceRequest as configured by
         * this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteDetectorRecipeDetectorRuleDataSourceRequest
         */
        public DeleteDetectorRecipeDetectorRuleDataSourceRequest build() {
            DeleteDetectorRecipeDetectorRuleDataSourceRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteDetectorRecipeDetectorRuleDataSourceRequest as configured by
         * this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteDetectorRecipeDetectorRuleDataSourceRequest
         */
        public DeleteDetectorRecipeDetectorRuleDataSourceRequest buildWithoutInvocationCallback() {
            DeleteDetectorRecipeDetectorRuleDataSourceRequest request =
                    new DeleteDetectorRecipeDetectorRuleDataSourceRequest();
            request.detectorRecipeId = detectorRecipeId;
            request.detectorRuleId = detectorRuleId;
            request.dataSourceId = dataSourceId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new DeleteDetectorRecipeDetectorRuleDataSourceRequest(detectorRecipeId,
            // detectorRuleId, dataSourceId, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .detectorRecipeId(detectorRecipeId)
                .detectorRuleId(detectorRuleId)
                .dataSourceId(dataSourceId)
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
        sb.append(",detectorRecipeId=").append(String.valueOf(this.detectorRecipeId));
        sb.append(",detectorRuleId=").append(String.valueOf(this.detectorRuleId));
        sb.append(",dataSourceId=").append(String.valueOf(this.dataSourceId));
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
        if (!(o instanceof DeleteDetectorRecipeDetectorRuleDataSourceRequest)) {
            return false;
        }

        DeleteDetectorRecipeDetectorRuleDataSourceRequest other =
                (DeleteDetectorRecipeDetectorRuleDataSourceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.detectorRecipeId, other.detectorRecipeId)
                && java.util.Objects.equals(this.detectorRuleId, other.detectorRuleId)
                && java.util.Objects.equals(this.dataSourceId, other.dataSourceId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.detectorRecipeId == null ? 43 : this.detectorRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRuleId == null ? 43 : this.detectorRuleId.hashCode());
        result = (result * PRIME) + (this.dataSourceId == null ? 43 : this.dataSourceId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
