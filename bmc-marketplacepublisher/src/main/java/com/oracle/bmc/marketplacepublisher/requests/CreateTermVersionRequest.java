/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.requests;

import com.oracle.bmc.marketplacepublisher.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplacepublisher/CreateTermVersionExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateTermVersionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class CreateTermVersionRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /**
     * The term version file to upload.
     */
    private java.io.InputStream createTermVersionContent;

    /**
     * The term version file to upload.
     */
    public java.io.InputStream getCreateTermVersionContent() {
        return createTermVersionContent;
    }
    /**
     * Unique OCID identifier for the term.
     */
    private String termId;

    /**
     * Unique OCID identifier for the term.
     */
    public String getTermId() {
        return termId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The name of the resource.
     */
    private String displayName;

    /**
     * The name of the resource.
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return createTermVersionContent;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateTermVersionRequest, java.io.InputStream> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The term version file to upload.
         */
        private java.io.InputStream createTermVersionContent = null;

        /**
         * The term version file to upload.
         * @param createTermVersionContent the value to set
         * @return this builder instance
         */
        public Builder createTermVersionContent(java.io.InputStream createTermVersionContent) {
            this.createTermVersionContent = createTermVersionContent;
            return this;
        }

        /**
         * Unique OCID identifier for the term.
         */
        private String termId = null;

        /**
         * Unique OCID identifier for the term.
         * @param termId the value to set
         * @return this builder instance
         */
        public Builder termId(String termId) {
            this.termId = termId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The name of the resource.
         */
        private String displayName = null;

        /**
         * The name of the resource.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
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
        public Builder copy(CreateTermVersionRequest o) {
            createTermVersionContent(o.getCreateTermVersionContent());
            termId(o.getTermId());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            displayName(o.getDisplayName());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateTermVersionRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateTermVersionRequest
         */
        public CreateTermVersionRequest build() {
            CreateTermVersionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(java.io.InputStream body) {
            createTermVersionContent(body);
            return this;
        }

        /**
         * Build the instance of CreateTermVersionRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateTermVersionRequest
         */
        public CreateTermVersionRequest buildWithoutInvocationCallback() {
            CreateTermVersionRequest request = new CreateTermVersionRequest();
            request.createTermVersionContent = createTermVersionContent;
            request.termId = termId;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.displayName = displayName;
            return request;
            // new CreateTermVersionRequest(createTermVersionContent, termId, opcRetryToken, opcRequestId, displayName);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createTermVersionContent(createTermVersionContent)
                .termId(termId)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .displayName(displayName);
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
        sb.append(",createTermVersionContent=")
                .append(String.valueOf(this.createTermVersionContent));
        sb.append(",termId=").append(String.valueOf(this.termId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTermVersionRequest)) {
            return false;
        }

        CreateTermVersionRequest other = (CreateTermVersionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createTermVersionContent, other.createTermVersionContent)
                && java.util.Objects.equals(this.termId, other.termId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.displayName, other.displayName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createTermVersionContent == null
                                ? 43
                                : this.createTermVersionContent.hashCode());
        result = (result * PRIME) + (this.termId == null ? 43 : this.termId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        return result;
    }
}
