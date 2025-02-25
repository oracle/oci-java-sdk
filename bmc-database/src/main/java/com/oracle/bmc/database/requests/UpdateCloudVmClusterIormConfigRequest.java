/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateCloudVmClusterIormConfigExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateCloudVmClusterIormConfigRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateCloudVmClusterIormConfigRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.ExadataIormConfigUpdateDetails> {

    /**
     * The cloud VM cluster [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String cloudVmClusterId;

    /**
     * The cloud VM cluster [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getCloudVmClusterId() {
        return cloudVmClusterId;
    }
    /**
     * Request to perform database update.
     */
    private com.oracle.bmc.database.model.ExadataIormConfigUpdateDetails
            cloudVmClusterIormConfigUpdateDetails;

    /**
     * Request to perform database update.
     */
    public com.oracle.bmc.database.model.ExadataIormConfigUpdateDetails
            getCloudVmClusterIormConfigUpdateDetails() {
        return cloudVmClusterIormConfigUpdateDetails;
    }
    /**
     * Unique identifier for the request.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.ExadataIormConfigUpdateDetails getBody$() {
        return cloudVmClusterIormConfigUpdateDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateCloudVmClusterIormConfigRequest,
                    com.oracle.bmc.database.model.ExadataIormConfigUpdateDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The cloud VM cluster [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String cloudVmClusterId = null;

        /**
         * The cloud VM cluster [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param cloudVmClusterId the value to set
         * @return this builder instance
         */
        public Builder cloudVmClusterId(String cloudVmClusterId) {
            this.cloudVmClusterId = cloudVmClusterId;
            return this;
        }

        /**
         * Request to perform database update.
         */
        private com.oracle.bmc.database.model.ExadataIormConfigUpdateDetails
                cloudVmClusterIormConfigUpdateDetails = null;

        /**
         * Request to perform database update.
         * @param cloudVmClusterIormConfigUpdateDetails the value to set
         * @return this builder instance
         */
        public Builder cloudVmClusterIormConfigUpdateDetails(
                com.oracle.bmc.database.model.ExadataIormConfigUpdateDetails
                        cloudVmClusterIormConfigUpdateDetails) {
            this.cloudVmClusterIormConfigUpdateDetails = cloudVmClusterIormConfigUpdateDetails;
            return this;
        }

        /**
         * Unique identifier for the request.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
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
        public Builder copy(UpdateCloudVmClusterIormConfigRequest o) {
            cloudVmClusterId(o.getCloudVmClusterId());
            cloudVmClusterIormConfigUpdateDetails(o.getCloudVmClusterIormConfigUpdateDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateCloudVmClusterIormConfigRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateCloudVmClusterIormConfigRequest
         */
        public UpdateCloudVmClusterIormConfigRequest build() {
            UpdateCloudVmClusterIormConfigRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.database.model.ExadataIormConfigUpdateDetails body) {
            cloudVmClusterIormConfigUpdateDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateCloudVmClusterIormConfigRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateCloudVmClusterIormConfigRequest
         */
        public UpdateCloudVmClusterIormConfigRequest buildWithoutInvocationCallback() {
            UpdateCloudVmClusterIormConfigRequest request =
                    new UpdateCloudVmClusterIormConfigRequest();
            request.cloudVmClusterId = cloudVmClusterId;
            request.cloudVmClusterIormConfigUpdateDetails = cloudVmClusterIormConfigUpdateDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateCloudVmClusterIormConfigRequest(cloudVmClusterId, cloudVmClusterIormConfigUpdateDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .cloudVmClusterId(cloudVmClusterId)
                .cloudVmClusterIormConfigUpdateDetails(cloudVmClusterIormConfigUpdateDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",cloudVmClusterId=").append(String.valueOf(this.cloudVmClusterId));
        sb.append(",cloudVmClusterIormConfigUpdateDetails=")
                .append(String.valueOf(this.cloudVmClusterIormConfigUpdateDetails));
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
        if (!(o instanceof UpdateCloudVmClusterIormConfigRequest)) {
            return false;
        }

        UpdateCloudVmClusterIormConfigRequest other = (UpdateCloudVmClusterIormConfigRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.cloudVmClusterId, other.cloudVmClusterId)
                && java.util.Objects.equals(
                        this.cloudVmClusterIormConfigUpdateDetails,
                        other.cloudVmClusterIormConfigUpdateDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.cloudVmClusterId == null ? 43 : this.cloudVmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudVmClusterIormConfigUpdateDetails == null
                                ? 43
                                : this.cloudVmClusterIormConfigUpdateDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
