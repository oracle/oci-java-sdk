/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.requests;

import com.oracle.bmc.fusionapps.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/UpdateRefreshActivityExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateRefreshActivityRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public class UpdateRefreshActivityRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.fusionapps.model.UpdateRefreshActivityDetails> {

    /** unique FusionEnvironment identifier */
    private String fusionEnvironmentId;

    /** unique FusionEnvironment identifier */
    public String getFusionEnvironmentId() {
        return fusionEnvironmentId;
    }
    /** The unique identifier (OCID) of the Refresh activity. */
    private String refreshActivityId;

    /** The unique identifier (OCID) of the Refresh activity. */
    public String getRefreshActivityId() {
        return refreshActivityId;
    }
    /** Details for the updating scheduled RefreshActivity. */
    private com.oracle.bmc.fusionapps.model.UpdateRefreshActivityDetails
            updateRefreshActivityDetails;

    /** Details for the updating scheduled RefreshActivity. */
    public com.oracle.bmc.fusionapps.model.UpdateRefreshActivityDetails
            getUpdateRefreshActivityDetails() {
        return updateRefreshActivityDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.fusionapps.model.UpdateRefreshActivityDetails getBody$() {
        return updateRefreshActivityDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateRefreshActivityRequest,
                    com.oracle.bmc.fusionapps.model.UpdateRefreshActivityDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique FusionEnvironment identifier */
        private String fusionEnvironmentId = null;

        /**
         * unique FusionEnvironment identifier
         *
         * @param fusionEnvironmentId the value to set
         * @return this builder instance
         */
        public Builder fusionEnvironmentId(String fusionEnvironmentId) {
            this.fusionEnvironmentId = fusionEnvironmentId;
            return this;
        }

        /** The unique identifier (OCID) of the Refresh activity. */
        private String refreshActivityId = null;

        /**
         * The unique identifier (OCID) of the Refresh activity.
         *
         * @param refreshActivityId the value to set
         * @return this builder instance
         */
        public Builder refreshActivityId(String refreshActivityId) {
            this.refreshActivityId = refreshActivityId;
            return this;
        }

        /** Details for the updating scheduled RefreshActivity. */
        private com.oracle.bmc.fusionapps.model.UpdateRefreshActivityDetails
                updateRefreshActivityDetails = null;

        /**
         * Details for the updating scheduled RefreshActivity.
         *
         * @param updateRefreshActivityDetails the value to set
         * @return this builder instance
         */
        public Builder updateRefreshActivityDetails(
                com.oracle.bmc.fusionapps.model.UpdateRefreshActivityDetails
                        updateRefreshActivityDetails) {
            this.updateRefreshActivityDetails = updateRefreshActivityDetails;
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
        public Builder copy(UpdateRefreshActivityRequest o) {
            fusionEnvironmentId(o.getFusionEnvironmentId());
            refreshActivityId(o.getRefreshActivityId());
            updateRefreshActivityDetails(o.getUpdateRefreshActivityDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateRefreshActivityRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateRefreshActivityRequest
         */
        public UpdateRefreshActivityRequest build() {
            UpdateRefreshActivityRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.fusionapps.model.UpdateRefreshActivityDetails body) {
            updateRefreshActivityDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateRefreshActivityRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateRefreshActivityRequest
         */
        public UpdateRefreshActivityRequest buildWithoutInvocationCallback() {
            UpdateRefreshActivityRequest request = new UpdateRefreshActivityRequest();
            request.fusionEnvironmentId = fusionEnvironmentId;
            request.refreshActivityId = refreshActivityId;
            request.updateRefreshActivityDetails = updateRefreshActivityDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateRefreshActivityRequest(fusionEnvironmentId, refreshActivityId,
            // updateRefreshActivityDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .fusionEnvironmentId(fusionEnvironmentId)
                .refreshActivityId(refreshActivityId)
                .updateRefreshActivityDetails(updateRefreshActivityDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",fusionEnvironmentId=").append(String.valueOf(this.fusionEnvironmentId));
        sb.append(",refreshActivityId=").append(String.valueOf(this.refreshActivityId));
        sb.append(",updateRefreshActivityDetails=")
                .append(String.valueOf(this.updateRefreshActivityDetails));
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
        if (!(o instanceof UpdateRefreshActivityRequest)) {
            return false;
        }

        UpdateRefreshActivityRequest other = (UpdateRefreshActivityRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fusionEnvironmentId, other.fusionEnvironmentId)
                && java.util.Objects.equals(this.refreshActivityId, other.refreshActivityId)
                && java.util.Objects.equals(
                        this.updateRefreshActivityDetails, other.updateRefreshActivityDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.fusionEnvironmentId == null
                                ? 43
                                : this.fusionEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshActivityId == null ? 43 : this.refreshActivityId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateRefreshActivityDetails == null
                                ? 43
                                : this.updateRefreshActivityDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
