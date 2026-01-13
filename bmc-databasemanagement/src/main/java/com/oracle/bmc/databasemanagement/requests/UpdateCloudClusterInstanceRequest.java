/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateCloudClusterInstanceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateCloudClusterInstanceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class UpdateCloudClusterInstanceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model.UpdateCloudClusterInstanceDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud cluster instance.
     */
    private String cloudClusterInstanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud cluster instance.
     */
    public String getCloudClusterInstanceId() {
        return cloudClusterInstanceId;
    }
    /** The details required to update an cloud cluster instance. */
    private com.oracle.bmc.databasemanagement.model.UpdateCloudClusterInstanceDetails
            updateCloudClusterInstanceDetails;

    /** The details required to update an cloud cluster instance. */
    public com.oracle.bmc.databasemanagement.model.UpdateCloudClusterInstanceDetails
            getUpdateCloudClusterInstanceDetails() {
        return updateCloudClusterInstanceDetails;
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
    public com.oracle.bmc.databasemanagement.model.UpdateCloudClusterInstanceDetails getBody$() {
        return updateCloudClusterInstanceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateCloudClusterInstanceRequest,
                    com.oracle.bmc.databasemanagement.model.UpdateCloudClusterInstanceDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud cluster instance.
         */
        private String cloudClusterInstanceId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud cluster instance.
         *
         * @param cloudClusterInstanceId the value to set
         * @return this builder instance
         */
        public Builder cloudClusterInstanceId(String cloudClusterInstanceId) {
            this.cloudClusterInstanceId = cloudClusterInstanceId;
            return this;
        }

        /** The details required to update an cloud cluster instance. */
        private com.oracle.bmc.databasemanagement.model.UpdateCloudClusterInstanceDetails
                updateCloudClusterInstanceDetails = null;

        /**
         * The details required to update an cloud cluster instance.
         *
         * @param updateCloudClusterInstanceDetails the value to set
         * @return this builder instance
         */
        public Builder updateCloudClusterInstanceDetails(
                com.oracle.bmc.databasemanagement.model.UpdateCloudClusterInstanceDetails
                        updateCloudClusterInstanceDetails) {
            this.updateCloudClusterInstanceDetails = updateCloudClusterInstanceDetails;
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
        public Builder copy(UpdateCloudClusterInstanceRequest o) {
            cloudClusterInstanceId(o.getCloudClusterInstanceId());
            updateCloudClusterInstanceDetails(o.getUpdateCloudClusterInstanceDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateCloudClusterInstanceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateCloudClusterInstanceRequest
         */
        public UpdateCloudClusterInstanceRequest build() {
            UpdateCloudClusterInstanceRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasemanagement.model.UpdateCloudClusterInstanceDetails body) {
            updateCloudClusterInstanceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateCloudClusterInstanceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateCloudClusterInstanceRequest
         */
        public UpdateCloudClusterInstanceRequest buildWithoutInvocationCallback() {
            UpdateCloudClusterInstanceRequest request = new UpdateCloudClusterInstanceRequest();
            request.cloudClusterInstanceId = cloudClusterInstanceId;
            request.updateCloudClusterInstanceDetails = updateCloudClusterInstanceDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateCloudClusterInstanceRequest(cloudClusterInstanceId,
            // updateCloudClusterInstanceDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .cloudClusterInstanceId(cloudClusterInstanceId)
                .updateCloudClusterInstanceDetails(updateCloudClusterInstanceDetails)
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
        sb.append(",cloudClusterInstanceId=").append(String.valueOf(this.cloudClusterInstanceId));
        sb.append(",updateCloudClusterInstanceDetails=")
                .append(String.valueOf(this.updateCloudClusterInstanceDetails));
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
        if (!(o instanceof UpdateCloudClusterInstanceRequest)) {
            return false;
        }

        UpdateCloudClusterInstanceRequest other = (UpdateCloudClusterInstanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.cloudClusterInstanceId, other.cloudClusterInstanceId)
                && java.util.Objects.equals(
                        this.updateCloudClusterInstanceDetails,
                        other.updateCloudClusterInstanceDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.cloudClusterInstanceId == null
                                ? 43
                                : this.cloudClusterInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateCloudClusterInstanceDetails == null
                                ? 43
                                : this.updateCloudClusterInstanceDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
