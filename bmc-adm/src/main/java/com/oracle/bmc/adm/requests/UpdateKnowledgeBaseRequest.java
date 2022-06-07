/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.requests;

import com.oracle.bmc.adm.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/UpdateKnowledgeBaseExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateKnowledgeBaseRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public class UpdateKnowledgeBaseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.adm.model.UpdateKnowledgeBaseDetails> {

    /**
     * The Oracle Cloud Identifier ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of a Knowledge Base, as a URL path parameter.
     */
    private String knowledgeBaseId;

    public String getKnowledgeBaseId() {
        return knowledgeBaseId;
    }
    /**
     * The details to update a Knowledge Base.
     */
    private com.oracle.bmc.adm.model.UpdateKnowledgeBaseDetails updateKnowledgeBaseDetails;

    public com.oracle.bmc.adm.model.UpdateKnowledgeBaseDetails getUpdateKnowledgeBaseDetails() {
        return updateKnowledgeBaseDetails;
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
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.adm.model.UpdateKnowledgeBaseDetails getBody$() {
        return updateKnowledgeBaseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateKnowledgeBaseRequest,
                    com.oracle.bmc.adm.model.UpdateKnowledgeBaseDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String knowledgeBaseId = null;

        /**
         * The Oracle Cloud Identifier ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of a Knowledge Base, as a URL path parameter.
         * @return this builder instance
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        private com.oracle.bmc.adm.model.UpdateKnowledgeBaseDetails updateKnowledgeBaseDetails =
                null;

        /**
         * The details to update a Knowledge Base.
         * @return this builder instance
         */
        public Builder updateKnowledgeBaseDetails(
                com.oracle.bmc.adm.model.UpdateKnowledgeBaseDetails updateKnowledgeBaseDetails) {
            this.updateKnowledgeBaseDetails = updateKnowledgeBaseDetails;
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

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(UpdateKnowledgeBaseRequest o) {
            knowledgeBaseId(o.getKnowledgeBaseId());
            updateKnowledgeBaseDetails(o.getUpdateKnowledgeBaseDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateKnowledgeBaseRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateKnowledgeBaseRequest
         */
        public UpdateKnowledgeBaseRequest build() {
            UpdateKnowledgeBaseRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.adm.model.UpdateKnowledgeBaseDetails body) {
            updateKnowledgeBaseDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateKnowledgeBaseRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateKnowledgeBaseRequest
         */
        public UpdateKnowledgeBaseRequest buildWithoutInvocationCallback() {
            UpdateKnowledgeBaseRequest request = new UpdateKnowledgeBaseRequest();
            request.knowledgeBaseId = knowledgeBaseId;
            request.updateKnowledgeBaseDetails = updateKnowledgeBaseDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateKnowledgeBaseRequest(knowledgeBaseId, updateKnowledgeBaseDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .knowledgeBaseId(knowledgeBaseId)
                .updateKnowledgeBaseDetails(updateKnowledgeBaseDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",knowledgeBaseId=").append(String.valueOf(this.knowledgeBaseId));
        sb.append(",updateKnowledgeBaseDetails=")
                .append(String.valueOf(this.updateKnowledgeBaseDetails));
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
        if (!(o instanceof UpdateKnowledgeBaseRequest)) {
            return false;
        }

        UpdateKnowledgeBaseRequest other = (UpdateKnowledgeBaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.knowledgeBaseId, other.knowledgeBaseId)
                && java.util.Objects.equals(
                        this.updateKnowledgeBaseDetails, other.updateKnowledgeBaseDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.knowledgeBaseId == null ? 43 : this.knowledgeBaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateKnowledgeBaseDetails == null
                                ? 43
                                : this.updateKnowledgeBaseDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
