/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateResponderRecipeResponderRuleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateResponderRecipeResponderRuleRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class UpdateResponderRecipeResponderRuleRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.cloudguard.model.UpdateResponderRecipeResponderRuleDetails> {

    /** OCID of the responder recipe. */
    private String responderRecipeId;

    /** OCID of the responder recipe. */
    public String getResponderRecipeId() {
        return responderRecipeId;
    }
    /** Unique identifier of the responder rule. */
    private String responderRuleId;

    /** Unique identifier of the responder rule. */
    public String getResponderRuleId() {
        return responderRuleId;
    }
    /** The details to be updated for responder rule */
    private com.oracle.bmc.cloudguard.model.UpdateResponderRecipeResponderRuleDetails
            updateResponderRecipeResponderRuleDetails;

    /** The details to be updated for responder rule */
    public com.oracle.bmc.cloudguard.model.UpdateResponderRecipeResponderRuleDetails
            getUpdateResponderRecipeResponderRuleDetails() {
        return updateResponderRecipeResponderRuleDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.cloudguard.model.UpdateResponderRecipeResponderRuleDetails getBody$() {
        return updateResponderRecipeResponderRuleDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateResponderRecipeResponderRuleRequest,
                    com.oracle.bmc.cloudguard.model.UpdateResponderRecipeResponderRuleDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** OCID of the responder recipe. */
        private String responderRecipeId = null;

        /**
         * OCID of the responder recipe.
         *
         * @param responderRecipeId the value to set
         * @return this builder instance
         */
        public Builder responderRecipeId(String responderRecipeId) {
            this.responderRecipeId = responderRecipeId;
            return this;
        }

        /** Unique identifier of the responder rule. */
        private String responderRuleId = null;

        /**
         * Unique identifier of the responder rule.
         *
         * @param responderRuleId the value to set
         * @return this builder instance
         */
        public Builder responderRuleId(String responderRuleId) {
            this.responderRuleId = responderRuleId;
            return this;
        }

        /** The details to be updated for responder rule */
        private com.oracle.bmc.cloudguard.model.UpdateResponderRecipeResponderRuleDetails
                updateResponderRecipeResponderRuleDetails = null;

        /**
         * The details to be updated for responder rule
         *
         * @param updateResponderRecipeResponderRuleDetails the value to set
         * @return this builder instance
         */
        public Builder updateResponderRecipeResponderRuleDetails(
                com.oracle.bmc.cloudguard.model.UpdateResponderRecipeResponderRuleDetails
                        updateResponderRecipeResponderRuleDetails) {
            this.updateResponderRecipeResponderRuleDetails =
                    updateResponderRecipeResponderRuleDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateResponderRecipeResponderRuleRequest o) {
            responderRecipeId(o.getResponderRecipeId());
            responderRuleId(o.getResponderRuleId());
            updateResponderRecipeResponderRuleDetails(
                    o.getUpdateResponderRecipeResponderRuleDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateResponderRecipeResponderRuleRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateResponderRecipeResponderRuleRequest
         */
        public UpdateResponderRecipeResponderRuleRequest build() {
            UpdateResponderRecipeResponderRuleRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.cloudguard.model.UpdateResponderRecipeResponderRuleDetails body) {
            updateResponderRecipeResponderRuleDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateResponderRecipeResponderRuleRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateResponderRecipeResponderRuleRequest
         */
        public UpdateResponderRecipeResponderRuleRequest buildWithoutInvocationCallback() {
            UpdateResponderRecipeResponderRuleRequest request =
                    new UpdateResponderRecipeResponderRuleRequest();
            request.responderRecipeId = responderRecipeId;
            request.responderRuleId = responderRuleId;
            request.updateResponderRecipeResponderRuleDetails =
                    updateResponderRecipeResponderRuleDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateResponderRecipeResponderRuleRequest(responderRecipeId, responderRuleId,
            // updateResponderRecipeResponderRuleDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .responderRecipeId(responderRecipeId)
                .responderRuleId(responderRuleId)
                .updateResponderRecipeResponderRuleDetails(
                        updateResponderRecipeResponderRuleDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",responderRecipeId=").append(String.valueOf(this.responderRecipeId));
        sb.append(",responderRuleId=").append(String.valueOf(this.responderRuleId));
        sb.append(",updateResponderRecipeResponderRuleDetails=")
                .append(String.valueOf(this.updateResponderRecipeResponderRuleDetails));
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
        if (!(o instanceof UpdateResponderRecipeResponderRuleRequest)) {
            return false;
        }

        UpdateResponderRecipeResponderRuleRequest other =
                (UpdateResponderRecipeResponderRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.responderRecipeId, other.responderRecipeId)
                && java.util.Objects.equals(this.responderRuleId, other.responderRuleId)
                && java.util.Objects.equals(
                        this.updateResponderRecipeResponderRuleDetails,
                        other.updateResponderRecipeResponderRuleDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.responderRecipeId == null ? 43 : this.responderRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.responderRuleId == null ? 43 : this.responderRuleId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateResponderRecipeResponderRuleDetails == null
                                ? 43
                                : this.updateResponderRecipeResponderRuleDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
