/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.requests;

import com.oracle.bmc.usageapi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/usageapi/UpdateEmailRecipientsGroupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateEmailRecipientsGroupRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
public class UpdateEmailRecipientsGroupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.usageapi.model.UpdateEmailRecipientsGroupDetails> {

    /** The information to be updated. */
    private com.oracle.bmc.usageapi.model.UpdateEmailRecipientsGroupDetails
            updateEmailRecipientsGroupDetails;

    /** The information to be updated. */
    public com.oracle.bmc.usageapi.model.UpdateEmailRecipientsGroupDetails
            getUpdateEmailRecipientsGroupDetails() {
        return updateEmailRecipientsGroupDetails;
    }
    /** The email recipients group OCID. */
    private String emailRecipientsGroupId;

    /** The email recipients group OCID. */
    public String getEmailRecipientsGroupId() {
        return emailRecipientsGroupId;
    }
    /** The usage statement subscription unique OCID. */
    private String subscriptionId;

    /** The usage statement subscription unique OCID. */
    public String getSubscriptionId() {
        return subscriptionId;
    }
    /** The compartment ID in which to list resources. */
    private String compartmentId;

    /** The compartment ID in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted, only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted, only if the etag you provide matches the
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
    public com.oracle.bmc.usageapi.model.UpdateEmailRecipientsGroupDetails getBody$() {
        return updateEmailRecipientsGroupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateEmailRecipientsGroupRequest,
                    com.oracle.bmc.usageapi.model.UpdateEmailRecipientsGroupDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The information to be updated. */
        private com.oracle.bmc.usageapi.model.UpdateEmailRecipientsGroupDetails
                updateEmailRecipientsGroupDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateEmailRecipientsGroupDetails the value to set
         * @return this builder instance
         */
        public Builder updateEmailRecipientsGroupDetails(
                com.oracle.bmc.usageapi.model.UpdateEmailRecipientsGroupDetails
                        updateEmailRecipientsGroupDetails) {
            this.updateEmailRecipientsGroupDetails = updateEmailRecipientsGroupDetails;
            return this;
        }

        /** The email recipients group OCID. */
        private String emailRecipientsGroupId = null;

        /**
         * The email recipients group OCID.
         *
         * @param emailRecipientsGroupId the value to set
         * @return this builder instance
         */
        public Builder emailRecipientsGroupId(String emailRecipientsGroupId) {
            this.emailRecipientsGroupId = emailRecipientsGroupId;
            return this;
        }

        /** The usage statement subscription unique OCID. */
        private String subscriptionId = null;

        /**
         * The usage statement subscription unique OCID.
         *
         * @param subscriptionId the value to set
         * @return this builder instance
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /** The compartment ID in which to list resources. */
        private String compartmentId = null;

        /**
         * The compartment ID in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
         * for that resource. The resource will be updated or deleted, only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted, only if the etag you provide
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
        public Builder copy(UpdateEmailRecipientsGroupRequest o) {
            updateEmailRecipientsGroupDetails(o.getUpdateEmailRecipientsGroupDetails());
            emailRecipientsGroupId(o.getEmailRecipientsGroupId());
            subscriptionId(o.getSubscriptionId());
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateEmailRecipientsGroupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateEmailRecipientsGroupRequest
         */
        public UpdateEmailRecipientsGroupRequest build() {
            UpdateEmailRecipientsGroupRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.usageapi.model.UpdateEmailRecipientsGroupDetails body) {
            updateEmailRecipientsGroupDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateEmailRecipientsGroupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateEmailRecipientsGroupRequest
         */
        public UpdateEmailRecipientsGroupRequest buildWithoutInvocationCallback() {
            UpdateEmailRecipientsGroupRequest request = new UpdateEmailRecipientsGroupRequest();
            request.updateEmailRecipientsGroupDetails = updateEmailRecipientsGroupDetails;
            request.emailRecipientsGroupId = emailRecipientsGroupId;
            request.subscriptionId = subscriptionId;
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateEmailRecipientsGroupRequest(updateEmailRecipientsGroupDetails,
            // emailRecipientsGroupId, subscriptionId, compartmentId, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updateEmailRecipientsGroupDetails(updateEmailRecipientsGroupDetails)
                .emailRecipientsGroupId(emailRecipientsGroupId)
                .subscriptionId(subscriptionId)
                .compartmentId(compartmentId)
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
        sb.append(",updateEmailRecipientsGroupDetails=")
                .append(String.valueOf(this.updateEmailRecipientsGroupDetails));
        sb.append(",emailRecipientsGroupId=").append(String.valueOf(this.emailRecipientsGroupId));
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
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
        if (!(o instanceof UpdateEmailRecipientsGroupRequest)) {
            return false;
        }

        UpdateEmailRecipientsGroupRequest other = (UpdateEmailRecipientsGroupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updateEmailRecipientsGroupDetails,
                        other.updateEmailRecipientsGroupDetails)
                && java.util.Objects.equals(
                        this.emailRecipientsGroupId, other.emailRecipientsGroupId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateEmailRecipientsGroupDetails == null
                                ? 43
                                : this.updateEmailRecipientsGroupDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.emailRecipientsGroupId == null
                                ? 43
                                : this.emailRecipientsGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
