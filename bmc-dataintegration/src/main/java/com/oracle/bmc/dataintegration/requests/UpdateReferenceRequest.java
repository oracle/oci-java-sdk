/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdateReferenceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateReferenceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class UpdateReferenceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataintegration.model.UpdateReferenceDetails> {

    /**
     * The workspace ID.
     */
    private String workspaceId;

    /**
     * The workspace ID.
     */
    public String getWorkspaceId() {
        return workspaceId;
    }
    /**
     * The application key.
     */
    private String applicationKey;

    /**
     * The application key.
     */
    public String getApplicationKey() {
        return applicationKey;
    }
    /**
     * The reference key.
     */
    private String referenceKey;

    /**
     * The reference key.
     */
    public String getReferenceKey() {
        return referenceKey;
    }
    /**
     * The details needed to update the references.
     */
    private com.oracle.bmc.dataintegration.model.UpdateReferenceDetails updateReferenceDetails;

    /**
     * The details needed to update the references.
     */
    public com.oracle.bmc.dataintegration.model.UpdateReferenceDetails getUpdateReferenceDetails() {
        return updateReferenceDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value.
     * When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value.
     * When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dataintegration.model.UpdateReferenceDetails getBody$() {
        return updateReferenceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateReferenceRequest,
                    com.oracle.bmc.dataintegration.model.UpdateReferenceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The workspace ID.
         */
        private String workspaceId = null;

        /**
         * The workspace ID.
         * @param workspaceId the value to set
         * @return this builder instance
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * The application key.
         */
        private String applicationKey = null;

        /**
         * The application key.
         * @param applicationKey the value to set
         * @return this builder instance
         */
        public Builder applicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            return this;
        }

        /**
         * The reference key.
         */
        private String referenceKey = null;

        /**
         * The reference key.
         * @param referenceKey the value to set
         * @return this builder instance
         */
        public Builder referenceKey(String referenceKey) {
            this.referenceKey = referenceKey;
            return this;
        }

        /**
         * The details needed to update the references.
         */
        private com.oracle.bmc.dataintegration.model.UpdateReferenceDetails updateReferenceDetails =
                null;

        /**
         * The details needed to update the references.
         * @param updateReferenceDetails the value to set
         * @return this builder instance
         */
        public Builder updateReferenceDetails(
                com.oracle.bmc.dataintegration.model.UpdateReferenceDetails
                        updateReferenceDetails) {
            this.updateReferenceDetails = updateReferenceDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value.
         * When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value.
         * When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(UpdateReferenceRequest o) {
            workspaceId(o.getWorkspaceId());
            applicationKey(o.getApplicationKey());
            referenceKey(o.getReferenceKey());
            updateReferenceDetails(o.getUpdateReferenceDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateReferenceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateReferenceRequest
         */
        public UpdateReferenceRequest build() {
            UpdateReferenceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dataintegration.model.UpdateReferenceDetails body) {
            updateReferenceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateReferenceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateReferenceRequest
         */
        public UpdateReferenceRequest buildWithoutInvocationCallback() {
            UpdateReferenceRequest request = new UpdateReferenceRequest();
            request.workspaceId = workspaceId;
            request.applicationKey = applicationKey;
            request.referenceKey = referenceKey;
            request.updateReferenceDetails = updateReferenceDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new UpdateReferenceRequest(workspaceId, applicationKey, referenceKey, updateReferenceDetails, opcRequestId, ifMatch, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .workspaceId(workspaceId)
                .applicationKey(applicationKey)
                .referenceKey(referenceKey)
                .updateReferenceDetails(updateReferenceDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(",applicationKey=").append(String.valueOf(this.applicationKey));
        sb.append(",referenceKey=").append(String.valueOf(this.referenceKey));
        sb.append(",updateReferenceDetails=").append(String.valueOf(this.updateReferenceDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateReferenceRequest)) {
            return false;
        }

        UpdateReferenceRequest other = (UpdateReferenceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.applicationKey, other.applicationKey)
                && java.util.Objects.equals(this.referenceKey, other.referenceKey)
                && java.util.Objects.equals(
                        this.updateReferenceDetails, other.updateReferenceDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationKey == null ? 43 : this.applicationKey.hashCode());
        result = (result * PRIME) + (this.referenceKey == null ? 43 : this.referenceKey.hashCode());
        result =
                (result * PRIME)
                        + (this.updateReferenceDetails == null
                                ? 43
                                : this.updateReferenceDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
