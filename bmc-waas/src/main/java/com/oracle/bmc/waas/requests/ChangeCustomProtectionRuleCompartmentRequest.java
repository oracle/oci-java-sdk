/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.requests;

import com.oracle.bmc.waas.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waas/ChangeCustomProtectionRuleCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeCustomProtectionRuleCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class ChangeCustomProtectionRuleCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.waas.model.ChangeCustomProtectionRuleCompartmentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the custom
     * protection rule. This number is generated when the custom protection rule is added to the
     * compartment.
     */
    private String customProtectionRuleId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the custom
     * protection rule. This number is generated when the custom protection rule is added to the
     * compartment.
     */
    public String getCustomProtectionRuleId() {
        return customProtectionRuleId;
    }

    private com.oracle.bmc.waas.model.ChangeCustomProtectionRuleCompartmentDetails
            changeCustomProtectionRuleCompartmentDetails;

    public com.oracle.bmc.waas.model.ChangeCustomProtectionRuleCompartmentDetails
            getChangeCustomProtectionRuleCompartmentDetails() {
        return changeCustomProtectionRuleCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous {@code GET} or
     * {@code POST} response for that resource. The resource will be updated or deleted only if the
     * etag provided matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous {@code GET} or
     * {@code POST} response for that resource. The resource will be updated or deleted only if the
     * etag provided matches the resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations *Example:* If a
     * resource has been deleted and purged from the system, then a retry of the original delete
     * request may be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations *Example:* If a
     * resource has been deleted and purged from the system, then a retry of the original delete
     * request may be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.waas.model.ChangeCustomProtectionRuleCompartmentDetails getBody$() {
        return changeCustomProtectionRuleCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeCustomProtectionRuleCompartmentRequest,
                    com.oracle.bmc.waas.model.ChangeCustomProtectionRuleCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the custom
         * protection rule. This number is generated when the custom protection rule is added to the
         * compartment.
         */
        private String customProtectionRuleId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the custom
         * protection rule. This number is generated when the custom protection rule is added to the
         * compartment.
         *
         * @param customProtectionRuleId the value to set
         * @return this builder instance
         */
        public Builder customProtectionRuleId(String customProtectionRuleId) {
            this.customProtectionRuleId = customProtectionRuleId;
            return this;
        }

        private com.oracle.bmc.waas.model.ChangeCustomProtectionRuleCompartmentDetails
                changeCustomProtectionRuleCompartmentDetails = null;

        /**
         * @param changeCustomProtectionRuleCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeCustomProtectionRuleCompartmentDetails(
                com.oracle.bmc.waas.model.ChangeCustomProtectionRuleCompartmentDetails
                        changeCustomProtectionRuleCompartmentDetails) {
            this.changeCustomProtectionRuleCompartmentDetails =
                    changeCustomProtectionRuleCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a previous
         * {@code GET} or {@code POST} response for that resource. The resource will be updated or
         * deleted only if the etag provided matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a previous
         * {@code GET} or {@code POST} response for that resource. The resource will be updated or
         * deleted only if the etag provided matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
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
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations *Example:* If
         * a resource has been deleted and purged from the system, then a retry of the original
         * delete request may be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations *Example:* If
         * a resource has been deleted and purged from the system, then a retry of the original
         * delete request may be rejected.
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
        public Builder copy(ChangeCustomProtectionRuleCompartmentRequest o) {
            customProtectionRuleId(o.getCustomProtectionRuleId());
            changeCustomProtectionRuleCompartmentDetails(
                    o.getChangeCustomProtectionRuleCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeCustomProtectionRuleCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeCustomProtectionRuleCompartmentRequest
         */
        public ChangeCustomProtectionRuleCompartmentRequest build() {
            ChangeCustomProtectionRuleCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.waas.model.ChangeCustomProtectionRuleCompartmentDetails body) {
            changeCustomProtectionRuleCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeCustomProtectionRuleCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeCustomProtectionRuleCompartmentRequest
         */
        public ChangeCustomProtectionRuleCompartmentRequest buildWithoutInvocationCallback() {
            ChangeCustomProtectionRuleCompartmentRequest request =
                    new ChangeCustomProtectionRuleCompartmentRequest();
            request.customProtectionRuleId = customProtectionRuleId;
            request.changeCustomProtectionRuleCompartmentDetails =
                    changeCustomProtectionRuleCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeCustomProtectionRuleCompartmentRequest(customProtectionRuleId,
            // changeCustomProtectionRuleCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .customProtectionRuleId(customProtectionRuleId)
                .changeCustomProtectionRuleCompartmentDetails(
                        changeCustomProtectionRuleCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",customProtectionRuleId=").append(String.valueOf(this.customProtectionRuleId));
        sb.append(",changeCustomProtectionRuleCompartmentDetails=")
                .append(String.valueOf(this.changeCustomProtectionRuleCompartmentDetails));
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
        if (!(o instanceof ChangeCustomProtectionRuleCompartmentRequest)) {
            return false;
        }

        ChangeCustomProtectionRuleCompartmentRequest other =
                (ChangeCustomProtectionRuleCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.customProtectionRuleId, other.customProtectionRuleId)
                && java.util.Objects.equals(
                        this.changeCustomProtectionRuleCompartmentDetails,
                        other.changeCustomProtectionRuleCompartmentDetails)
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
                        + (this.customProtectionRuleId == null
                                ? 43
                                : this.customProtectionRuleId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeCustomProtectionRuleCompartmentDetails == null
                                ? 43
                                : this.changeCustomProtectionRuleCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
