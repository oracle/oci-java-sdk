/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.requests;

import com.oracle.bmc.tenantmanagercontrolplane.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/ListRecipientInvitationsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListRecipientInvitationsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
public class ListRecipientInvitationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The tenancy that sent the invitation. */
    private String senderTenancyId;

    /** The tenancy that sent the invitation. */
    public String getSenderTenancyId() {
        return senderTenancyId;
    }
    /** The lifecycle state of the resource. */
    private com.oracle.bmc.tenantmanagercontrolplane.model.LifecycleState lifecycleState;

    /** The lifecycle state of the resource. */
    public com.oracle.bmc.tenantmanagercontrolplane.model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** The status of the recipient invitation. */
    private com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitationStatus status;

    /** The status of the recipient invitation. */
    public com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitationStatus getStatus() {
        return status;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListRecipientInvitationsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The tenancy that sent the invitation. */
        private String senderTenancyId = null;

        /**
         * The tenancy that sent the invitation.
         *
         * @param senderTenancyId the value to set
         * @return this builder instance
         */
        public Builder senderTenancyId(String senderTenancyId) {
            this.senderTenancyId = senderTenancyId;
            return this;
        }

        /** The lifecycle state of the resource. */
        private com.oracle.bmc.tenantmanagercontrolplane.model.LifecycleState lifecycleState = null;

        /**
         * The lifecycle state of the resource.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.tenantmanagercontrolplane.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** The status of the recipient invitation. */
        private com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitationStatus status =
                null;

        /**
         * The status of the recipient invitation.
         *
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(
                com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitationStatus status) {
            this.status = status;
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
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(ListRecipientInvitationsRequest o) {
            compartmentId(o.getCompartmentId());
            senderTenancyId(o.getSenderTenancyId());
            lifecycleState(o.getLifecycleState());
            status(o.getStatus());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListRecipientInvitationsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListRecipientInvitationsRequest
         */
        public ListRecipientInvitationsRequest build() {
            ListRecipientInvitationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListRecipientInvitationsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListRecipientInvitationsRequest
         */
        public ListRecipientInvitationsRequest buildWithoutInvocationCallback() {
            ListRecipientInvitationsRequest request = new ListRecipientInvitationsRequest();
            request.compartmentId = compartmentId;
            request.senderTenancyId = senderTenancyId;
            request.lifecycleState = lifecycleState;
            request.status = status;
            request.opcRequestId = opcRequestId;
            request.page = page;
            return request;
            // new ListRecipientInvitationsRequest(compartmentId, senderTenancyId, lifecycleState,
            // status, opcRequestId, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .senderTenancyId(senderTenancyId)
                .lifecycleState(lifecycleState)
                .status(status)
                .opcRequestId(opcRequestId)
                .page(page);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",senderTenancyId=").append(String.valueOf(this.senderTenancyId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListRecipientInvitationsRequest)) {
            return false;
        }

        ListRecipientInvitationsRequest other = (ListRecipientInvitationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.senderTenancyId, other.senderTenancyId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.senderTenancyId == null ? 43 : this.senderTenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
