/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateCloudDbSystemDiscoveryExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateCloudDbSystemDiscoveryRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class UpdateCloudDbSystemDiscoveryRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model.UpdateCloudDbSystemDiscoveryDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud DB system discovery.
     */
    private String cloudDbSystemDiscoveryId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud DB system discovery.
     */
    public String getCloudDbSystemDiscoveryId() {
        return cloudDbSystemDiscoveryId;
    }
    /** The details required to update an cloud DB system discovery. */
    private com.oracle.bmc.databasemanagement.model.UpdateCloudDbSystemDiscoveryDetails
            updateCloudDbSystemDiscoveryDetails;

    /** The details required to update an cloud DB system discovery. */
    public com.oracle.bmc.databasemanagement.model.UpdateCloudDbSystemDiscoveryDetails
            getUpdateCloudDbSystemDiscoveryDetails() {
        return updateCloudDbSystemDiscoveryDetails;
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
    public com.oracle.bmc.databasemanagement.model.UpdateCloudDbSystemDiscoveryDetails getBody$() {
        return updateCloudDbSystemDiscoveryDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateCloudDbSystemDiscoveryRequest,
                    com.oracle.bmc.databasemanagement.model.UpdateCloudDbSystemDiscoveryDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud DB system discovery.
         */
        private String cloudDbSystemDiscoveryId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud DB system discovery.
         *
         * @param cloudDbSystemDiscoveryId the value to set
         * @return this builder instance
         */
        public Builder cloudDbSystemDiscoveryId(String cloudDbSystemDiscoveryId) {
            this.cloudDbSystemDiscoveryId = cloudDbSystemDiscoveryId;
            return this;
        }

        /** The details required to update an cloud DB system discovery. */
        private com.oracle.bmc.databasemanagement.model.UpdateCloudDbSystemDiscoveryDetails
                updateCloudDbSystemDiscoveryDetails = null;

        /**
         * The details required to update an cloud DB system discovery.
         *
         * @param updateCloudDbSystemDiscoveryDetails the value to set
         * @return this builder instance
         */
        public Builder updateCloudDbSystemDiscoveryDetails(
                com.oracle.bmc.databasemanagement.model.UpdateCloudDbSystemDiscoveryDetails
                        updateCloudDbSystemDiscoveryDetails) {
            this.updateCloudDbSystemDiscoveryDetails = updateCloudDbSystemDiscoveryDetails;
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
        public Builder copy(UpdateCloudDbSystemDiscoveryRequest o) {
            cloudDbSystemDiscoveryId(o.getCloudDbSystemDiscoveryId());
            updateCloudDbSystemDiscoveryDetails(o.getUpdateCloudDbSystemDiscoveryDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateCloudDbSystemDiscoveryRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateCloudDbSystemDiscoveryRequest
         */
        public UpdateCloudDbSystemDiscoveryRequest build() {
            UpdateCloudDbSystemDiscoveryRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasemanagement.model.UpdateCloudDbSystemDiscoveryDetails body) {
            updateCloudDbSystemDiscoveryDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateCloudDbSystemDiscoveryRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateCloudDbSystemDiscoveryRequest
         */
        public UpdateCloudDbSystemDiscoveryRequest buildWithoutInvocationCallback() {
            UpdateCloudDbSystemDiscoveryRequest request = new UpdateCloudDbSystemDiscoveryRequest();
            request.cloudDbSystemDiscoveryId = cloudDbSystemDiscoveryId;
            request.updateCloudDbSystemDiscoveryDetails = updateCloudDbSystemDiscoveryDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateCloudDbSystemDiscoveryRequest(cloudDbSystemDiscoveryId,
            // updateCloudDbSystemDiscoveryDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .cloudDbSystemDiscoveryId(cloudDbSystemDiscoveryId)
                .updateCloudDbSystemDiscoveryDetails(updateCloudDbSystemDiscoveryDetails)
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
        sb.append(",cloudDbSystemDiscoveryId=")
                .append(String.valueOf(this.cloudDbSystemDiscoveryId));
        sb.append(",updateCloudDbSystemDiscoveryDetails=")
                .append(String.valueOf(this.updateCloudDbSystemDiscoveryDetails));
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
        if (!(o instanceof UpdateCloudDbSystemDiscoveryRequest)) {
            return false;
        }

        UpdateCloudDbSystemDiscoveryRequest other = (UpdateCloudDbSystemDiscoveryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.cloudDbSystemDiscoveryId, other.cloudDbSystemDiscoveryId)
                && java.util.Objects.equals(
                        this.updateCloudDbSystemDiscoveryDetails,
                        other.updateCloudDbSystemDiscoveryDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.cloudDbSystemDiscoveryId == null
                                ? 43
                                : this.cloudDbSystemDiscoveryId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateCloudDbSystemDiscoveryDetails == null
                                ? 43
                                : this.updateCloudDbSystemDiscoveryDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
