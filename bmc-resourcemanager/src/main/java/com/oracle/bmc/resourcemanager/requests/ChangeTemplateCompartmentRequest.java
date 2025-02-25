/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.requests;

import com.oracle.bmc.resourcemanager.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ChangeTemplateCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeTemplateCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class ChangeTemplateCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.resourcemanager.model.ChangeTemplateCompartmentDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the template.
     */
    private String templateId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the template.
     */
    public String getTemplateId() {
        return templateId;
    }
    /**
     * The details for moving a template to a different compartment.
     */
    private com.oracle.bmc.resourcemanager.model.ChangeTemplateCompartmentDetails
            changeTemplateCompartmentDetails;

    /**
     * The details for moving a template to a different compartment.
     */
    public com.oracle.bmc.resourcemanager.model.ChangeTemplateCompartmentDetails
            getChangeTemplateCompartmentDetails() {
        return changeTemplateCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous {@code GET} or {@code POST} response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous {@code GET} or {@code POST} response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of retrying the same action. Retry tokens expire after
     * 24 hours, but can be invalidated before then due to conflicting operations. For example,
     * if a resource has been deleted and purged from the system, then a retry of the original
     * creation request may be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of retrying the same action. Retry tokens expire after
     * 24 hours, but can be invalidated before then due to conflicting operations. For example,
     * if a resource has been deleted and purged from the system, then a retry of the original
     * creation request may be rejected.
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
    public com.oracle.bmc.resourcemanager.model.ChangeTemplateCompartmentDetails getBody$() {
        return changeTemplateCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeTemplateCompartmentRequest,
                    com.oracle.bmc.resourcemanager.model.ChangeTemplateCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the template.
         */
        private String templateId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the template.
         * @param templateId the value to set
         * @return this builder instance
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * The details for moving a template to a different compartment.
         */
        private com.oracle.bmc.resourcemanager.model.ChangeTemplateCompartmentDetails
                changeTemplateCompartmentDetails = null;

        /**
         * The details for moving a template to a different compartment.
         * @param changeTemplateCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeTemplateCompartmentDetails(
                com.oracle.bmc.resourcemanager.model.ChangeTemplateCompartmentDetails
                        changeTemplateCompartmentDetails) {
            this.changeTemplateCompartmentDetails = changeTemplateCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous {@code GET} or {@code POST} response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous {@code GET} or {@code POST} response for that resource.  The resource
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of retrying the same action. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of retrying the same action. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected.
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
        public Builder copy(ChangeTemplateCompartmentRequest o) {
            templateId(o.getTemplateId());
            changeTemplateCompartmentDetails(o.getChangeTemplateCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeTemplateCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeTemplateCompartmentRequest
         */
        public ChangeTemplateCompartmentRequest build() {
            ChangeTemplateCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.resourcemanager.model.ChangeTemplateCompartmentDetails body) {
            changeTemplateCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeTemplateCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeTemplateCompartmentRequest
         */
        public ChangeTemplateCompartmentRequest buildWithoutInvocationCallback() {
            ChangeTemplateCompartmentRequest request = new ChangeTemplateCompartmentRequest();
            request.templateId = templateId;
            request.changeTemplateCompartmentDetails = changeTemplateCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeTemplateCompartmentRequest(templateId, changeTemplateCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .templateId(templateId)
                .changeTemplateCompartmentDetails(changeTemplateCompartmentDetails)
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
        sb.append(",templateId=").append(String.valueOf(this.templateId));
        sb.append(",changeTemplateCompartmentDetails=")
                .append(String.valueOf(this.changeTemplateCompartmentDetails));
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
        if (!(o instanceof ChangeTemplateCompartmentRequest)) {
            return false;
        }

        ChangeTemplateCompartmentRequest other = (ChangeTemplateCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.templateId, other.templateId)
                && java.util.Objects.equals(
                        this.changeTemplateCompartmentDetails,
                        other.changeTemplateCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.templateId == null ? 43 : this.templateId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeTemplateCompartmentDetails == null
                                ? 43
                                : this.changeTemplateCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
