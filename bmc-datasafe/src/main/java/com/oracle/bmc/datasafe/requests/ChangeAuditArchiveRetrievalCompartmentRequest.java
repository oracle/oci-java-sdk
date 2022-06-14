/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeAuditArchiveRetrievalCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeAuditArchiveRetrievalCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ChangeAuditArchiveRetrievalCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.ChangeAuditArchiveRetrievalCompartmentDetails> {

    /**
     * OCID of the archive retrieval.
     */
    private String auditArchiveRetrievalId;

    /**
     * OCID of the archive retrieval.
     */
    public String getAuditArchiveRetrievalId() {
        return auditArchiveRetrievalId;
    }
    /**
     * The details used to change the compartment of a archive retrieval.
     */
    private com.oracle.bmc.datasafe.model.ChangeAuditArchiveRetrievalCompartmentDetails
            changeAuditArchiveRetrievalCompartmentDetails;

    /**
     * The details used to change the compartment of a archive retrieval.
     */
    public com.oracle.bmc.datasafe.model.ChangeAuditArchiveRetrievalCompartmentDetails
            getChangeAuditArchiveRetrievalCompartmentDetails() {
        return changeAuditArchiveRetrievalCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
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
    public com.oracle.bmc.datasafe.model.ChangeAuditArchiveRetrievalCompartmentDetails getBody$() {
        return changeAuditArchiveRetrievalCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeAuditArchiveRetrievalCompartmentRequest,
                    com.oracle.bmc.datasafe.model.ChangeAuditArchiveRetrievalCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * OCID of the archive retrieval.
         */
        private String auditArchiveRetrievalId = null;

        /**
         * OCID of the archive retrieval.
         * @param auditArchiveRetrievalId the value to set
         * @return this builder instance
         */
        public Builder auditArchiveRetrievalId(String auditArchiveRetrievalId) {
            this.auditArchiveRetrievalId = auditArchiveRetrievalId;
            return this;
        }

        /**
         * The details used to change the compartment of a archive retrieval.
         */
        private com.oracle.bmc.datasafe.model.ChangeAuditArchiveRetrievalCompartmentDetails
                changeAuditArchiveRetrievalCompartmentDetails = null;

        /**
         * The details used to change the compartment of a archive retrieval.
         * @param changeAuditArchiveRetrievalCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeAuditArchiveRetrievalCompartmentDetails(
                com.oracle.bmc.datasafe.model.ChangeAuditArchiveRetrievalCompartmentDetails
                        changeAuditArchiveRetrievalCompartmentDetails) {
            this.changeAuditArchiveRetrievalCompartmentDetails =
                    changeAuditArchiveRetrievalCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
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
        public Builder copy(ChangeAuditArchiveRetrievalCompartmentRequest o) {
            auditArchiveRetrievalId(o.getAuditArchiveRetrievalId());
            changeAuditArchiveRetrievalCompartmentDetails(
                    o.getChangeAuditArchiveRetrievalCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeAuditArchiveRetrievalCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeAuditArchiveRetrievalCompartmentRequest
         */
        public ChangeAuditArchiveRetrievalCompartmentRequest build() {
            ChangeAuditArchiveRetrievalCompartmentRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.datasafe.model.ChangeAuditArchiveRetrievalCompartmentDetails body) {
            changeAuditArchiveRetrievalCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeAuditArchiveRetrievalCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeAuditArchiveRetrievalCompartmentRequest
         */
        public ChangeAuditArchiveRetrievalCompartmentRequest buildWithoutInvocationCallback() {
            ChangeAuditArchiveRetrievalCompartmentRequest request =
                    new ChangeAuditArchiveRetrievalCompartmentRequest();
            request.auditArchiveRetrievalId = auditArchiveRetrievalId;
            request.changeAuditArchiveRetrievalCompartmentDetails =
                    changeAuditArchiveRetrievalCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeAuditArchiveRetrievalCompartmentRequest(auditArchiveRetrievalId, changeAuditArchiveRetrievalCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .auditArchiveRetrievalId(auditArchiveRetrievalId)
                .changeAuditArchiveRetrievalCompartmentDetails(
                        changeAuditArchiveRetrievalCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
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
        sb.append(",auditArchiveRetrievalId=").append(String.valueOf(this.auditArchiveRetrievalId));
        sb.append(",changeAuditArchiveRetrievalCompartmentDetails=")
                .append(String.valueOf(this.changeAuditArchiveRetrievalCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeAuditArchiveRetrievalCompartmentRequest)) {
            return false;
        }

        ChangeAuditArchiveRetrievalCompartmentRequest other =
                (ChangeAuditArchiveRetrievalCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.auditArchiveRetrievalId, other.auditArchiveRetrievalId)
                && java.util.Objects.equals(
                        this.changeAuditArchiveRetrievalCompartmentDetails,
                        other.changeAuditArchiveRetrievalCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.auditArchiveRetrievalId == null
                                ? 43
                                : this.auditArchiveRetrievalId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeAuditArchiveRetrievalCompartmentDetails == null
                                ? 43
                                : this.changeAuditArchiveRetrievalCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
