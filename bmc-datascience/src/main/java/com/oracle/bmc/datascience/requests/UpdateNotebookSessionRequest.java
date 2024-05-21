/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/UpdateNotebookSessionExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateNotebookSessionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class UpdateNotebookSessionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datascience.model.UpdateNotebookSessionDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the notebook session.
     */
    private String notebookSessionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the notebook session.
     */
    public String getNotebookSessionId() {
        return notebookSessionId;
    }
    /**
     * Details for updating a notebook session. {@code notebookSessionConfigurationDetails} can only be updated while the notebook session is in the {@code INACTIVE} state.
     * Changes to the {@code notebookSessionConfigurationDetails} take effect the next time the {@code ActivateNotebookSession} action is invoked on the notebook session resource.
     *
     */
    private com.oracle.bmc.datascience.model.UpdateNotebookSessionDetails
            updateNotebookSessionDetails;

    /**
     * Details for updating a notebook session. {@code notebookSessionConfigurationDetails} can only be updated while the notebook session is in the {@code INACTIVE} state.
     * Changes to the {@code notebookSessionConfigurationDetails} take effect the next time the {@code ActivateNotebookSession} action is invoked on the notebook session resource.
     *
     */
    public com.oracle.bmc.datascience.model.UpdateNotebookSessionDetails
            getUpdateNotebookSessionDetails() {
        return updateNotebookSessionDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource is updated or deleted only if the {@code etag} you
     * provide matches the resource's current {@code etag} value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource is updated or deleted only if the {@code etag} you
     * provide matches the resource's current {@code etag} value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datascience.model.UpdateNotebookSessionDetails getBody$() {
        return updateNotebookSessionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateNotebookSessionRequest,
                    com.oracle.bmc.datascience.model.UpdateNotebookSessionDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the notebook session.
         */
        private String notebookSessionId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the notebook session.
         * @param notebookSessionId the value to set
         * @return this builder instance
         */
        public Builder notebookSessionId(String notebookSessionId) {
            this.notebookSessionId = notebookSessionId;
            return this;
        }

        /**
         * Details for updating a notebook session. {@code notebookSessionConfigurationDetails} can only be updated while the notebook session is in the {@code INACTIVE} state.
         * Changes to the {@code notebookSessionConfigurationDetails} take effect the next time the {@code ActivateNotebookSession} action is invoked on the notebook session resource.
         *
         */
        private com.oracle.bmc.datascience.model.UpdateNotebookSessionDetails
                updateNotebookSessionDetails = null;

        /**
         * Details for updating a notebook session. {@code notebookSessionConfigurationDetails} can only be updated while the notebook session is in the {@code INACTIVE} state.
         * Changes to the {@code notebookSessionConfigurationDetails} take effect the next time the {@code ActivateNotebookSession} action is invoked on the notebook session resource.
         *
         * @param updateNotebookSessionDetails the value to set
         * @return this builder instance
         */
        public Builder updateNotebookSessionDetails(
                com.oracle.bmc.datascience.model.UpdateNotebookSessionDetails
                        updateNotebookSessionDetails) {
            this.updateNotebookSessionDetails = updateNotebookSessionDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
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
        public Builder copy(UpdateNotebookSessionRequest o) {
            notebookSessionId(o.getNotebookSessionId());
            updateNotebookSessionDetails(o.getUpdateNotebookSessionDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateNotebookSessionRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateNotebookSessionRequest
         */
        public UpdateNotebookSessionRequest build() {
            UpdateNotebookSessionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datascience.model.UpdateNotebookSessionDetails body) {
            updateNotebookSessionDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateNotebookSessionRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateNotebookSessionRequest
         */
        public UpdateNotebookSessionRequest buildWithoutInvocationCallback() {
            UpdateNotebookSessionRequest request = new UpdateNotebookSessionRequest();
            request.notebookSessionId = notebookSessionId;
            request.updateNotebookSessionDetails = updateNotebookSessionDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateNotebookSessionRequest(notebookSessionId, updateNotebookSessionDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .notebookSessionId(notebookSessionId)
                .updateNotebookSessionDetails(updateNotebookSessionDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",notebookSessionId=").append(String.valueOf(this.notebookSessionId));
        sb.append(",updateNotebookSessionDetails=")
                .append(String.valueOf(this.updateNotebookSessionDetails));
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
        if (!(o instanceof UpdateNotebookSessionRequest)) {
            return false;
        }

        UpdateNotebookSessionRequest other = (UpdateNotebookSessionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.notebookSessionId, other.notebookSessionId)
                && java.util.Objects.equals(
                        this.updateNotebookSessionDetails, other.updateNotebookSessionDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.notebookSessionId == null ? 43 : this.notebookSessionId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateNotebookSessionDetails == null
                                ? 43
                                : this.updateNotebookSessionDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
