/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ChangeTagNamespaceCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeTagNamespaceCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeTagNamespaceCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identity.model.ChangeTagNamespaceCompartmentDetail> {

    /**
     * The OCID of the tag namespace.
     *
     */
    private String tagNamespaceId;

    public String getTagNamespaceId() {
        return tagNamespaceId;
    }
    /**
     * Request object for changing the compartment of a tag namespace.
     */
    private com.oracle.bmc.identity.model.ChangeTagNamespaceCompartmentDetail
            changeTagNamespaceCompartmentDetail;

    public com.oracle.bmc.identity.model.ChangeTagNamespaceCompartmentDetail
            getChangeTagNamespaceCompartmentDetail() {
        return changeTagNamespaceCompartmentDetail;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.identity.model.ChangeTagNamespaceCompartmentDetail getBody$() {
        return changeTagNamespaceCompartmentDetail;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeTagNamespaceCompartmentRequest,
                    com.oracle.bmc.identity.model.ChangeTagNamespaceCompartmentDetail> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String tagNamespaceId = null;

        /**
         * The OCID of the tag namespace.
         *
         * @return this builder instance
         */
        public Builder tagNamespaceId(String tagNamespaceId) {
            this.tagNamespaceId = tagNamespaceId;
            return this;
        }

        private com.oracle.bmc.identity.model.ChangeTagNamespaceCompartmentDetail
                changeTagNamespaceCompartmentDetail = null;

        /**
         * Request object for changing the compartment of a tag namespace.
         * @return this builder instance
         */
        public Builder changeTagNamespaceCompartmentDetail(
                com.oracle.bmc.identity.model.ChangeTagNamespaceCompartmentDetail
                        changeTagNamespaceCompartmentDetail) {
            this.changeTagNamespaceCompartmentDetail = changeTagNamespaceCompartmentDetail;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
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
        public Builder copy(ChangeTagNamespaceCompartmentRequest o) {
            tagNamespaceId(o.getTagNamespaceId());
            changeTagNamespaceCompartmentDetail(o.getChangeTagNamespaceCompartmentDetail());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeTagNamespaceCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeTagNamespaceCompartmentRequest
         */
        public ChangeTagNamespaceCompartmentRequest build() {
            ChangeTagNamespaceCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.identity.model.ChangeTagNamespaceCompartmentDetail body) {
            changeTagNamespaceCompartmentDetail(body);
            return this;
        }

        /**
         * Build the instance of ChangeTagNamespaceCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeTagNamespaceCompartmentRequest
         */
        public ChangeTagNamespaceCompartmentRequest buildWithoutInvocationCallback() {
            ChangeTagNamespaceCompartmentRequest request =
                    new ChangeTagNamespaceCompartmentRequest();
            request.tagNamespaceId = tagNamespaceId;
            request.changeTagNamespaceCompartmentDetail = changeTagNamespaceCompartmentDetail;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeTagNamespaceCompartmentRequest(tagNamespaceId, changeTagNamespaceCompartmentDetail, opcRetryToken);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .tagNamespaceId(tagNamespaceId)
                .changeTagNamespaceCompartmentDetail(changeTagNamespaceCompartmentDetail)
                .opcRetryToken(opcRetryToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",tagNamespaceId=").append(String.valueOf(this.tagNamespaceId));
        sb.append(",changeTagNamespaceCompartmentDetail=")
                .append(String.valueOf(this.changeTagNamespaceCompartmentDetail));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeTagNamespaceCompartmentRequest)) {
            return false;
        }

        ChangeTagNamespaceCompartmentRequest other = (ChangeTagNamespaceCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.tagNamespaceId, other.tagNamespaceId)
                && java.util.Objects.equals(
                        this.changeTagNamespaceCompartmentDetail,
                        other.changeTagNamespaceCompartmentDetail)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.tagNamespaceId == null ? 43 : this.tagNamespaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeTagNamespaceCompartmentDetail == null
                                ? 43
                                : this.changeTagNamespaceCompartmentDetail.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
