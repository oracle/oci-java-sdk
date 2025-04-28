/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.requests;

import com.oracle.bmc.tenantmanagercontrolplane.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/UpdateDomainGovernanceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateDomainGovernanceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
public class UpdateDomainGovernanceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.tenantmanagercontrolplane.model.UpdateDomainGovernanceDetails> {

    /** The domain governance OCID. */
    private String domainGovernanceId;

    /** The domain governance OCID. */
    public String getDomainGovernanceId() {
        return domainGovernanceId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.tenantmanagercontrolplane.model.UpdateDomainGovernanceDetails
            updateDomainGovernanceDetails;

    /** The information to be updated. */
    public com.oracle.bmc.tenantmanagercontrolplane.model.UpdateDomainGovernanceDetails
            getUpdateDomainGovernanceDetails() {
        return updateDomainGovernanceDetails;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.tenantmanagercontrolplane.model.UpdateDomainGovernanceDetails getBody$() {
        return updateDomainGovernanceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDomainGovernanceRequest,
                    com.oracle.bmc.tenantmanagercontrolplane.model.UpdateDomainGovernanceDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The domain governance OCID. */
        private String domainGovernanceId = null;

        /**
         * The domain governance OCID.
         *
         * @param domainGovernanceId the value to set
         * @return this builder instance
         */
        public Builder domainGovernanceId(String domainGovernanceId) {
            this.domainGovernanceId = domainGovernanceId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.tenantmanagercontrolplane.model.UpdateDomainGovernanceDetails
                updateDomainGovernanceDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateDomainGovernanceDetails the value to set
         * @return this builder instance
         */
        public Builder updateDomainGovernanceDetails(
                com.oracle.bmc.tenantmanagercontrolplane.model.UpdateDomainGovernanceDetails
                        updateDomainGovernanceDetails) {
            this.updateDomainGovernanceDetails = updateDomainGovernanceDetails;
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
        public Builder copy(UpdateDomainGovernanceRequest o) {
            domainGovernanceId(o.getDomainGovernanceId());
            updateDomainGovernanceDetails(o.getUpdateDomainGovernanceDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDomainGovernanceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateDomainGovernanceRequest
         */
        public UpdateDomainGovernanceRequest build() {
            UpdateDomainGovernanceRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.tenantmanagercontrolplane.model.UpdateDomainGovernanceDetails body) {
            updateDomainGovernanceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDomainGovernanceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDomainGovernanceRequest
         */
        public UpdateDomainGovernanceRequest buildWithoutInvocationCallback() {
            UpdateDomainGovernanceRequest request = new UpdateDomainGovernanceRequest();
            request.domainGovernanceId = domainGovernanceId;
            request.updateDomainGovernanceDetails = updateDomainGovernanceDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateDomainGovernanceRequest(domainGovernanceId, updateDomainGovernanceDetails,
            // ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .domainGovernanceId(domainGovernanceId)
                .updateDomainGovernanceDetails(updateDomainGovernanceDetails)
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
        sb.append(",domainGovernanceId=").append(String.valueOf(this.domainGovernanceId));
        sb.append(",updateDomainGovernanceDetails=")
                .append(String.valueOf(this.updateDomainGovernanceDetails));
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
        if (!(o instanceof UpdateDomainGovernanceRequest)) {
            return false;
        }

        UpdateDomainGovernanceRequest other = (UpdateDomainGovernanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.domainGovernanceId, other.domainGovernanceId)
                && java.util.Objects.equals(
                        this.updateDomainGovernanceDetails, other.updateDomainGovernanceDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.domainGovernanceId == null
                                ? 43
                                : this.domainGovernanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDomainGovernanceDetails == null
                                ? 43
                                : this.updateDomainGovernanceDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
