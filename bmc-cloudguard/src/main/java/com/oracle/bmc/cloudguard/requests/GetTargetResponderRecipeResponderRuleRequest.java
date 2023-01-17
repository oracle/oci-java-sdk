/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetTargetResponderRecipeResponderRuleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetTargetResponderRecipeResponderRuleRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class GetTargetResponderRecipeResponderRuleRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** OCID of target */
    private String targetId;

    /** OCID of target */
    public String getTargetId() {
        return targetId;
    }
    /** OCID of TargetResponderRecipe */
    private String targetResponderRecipeId;

    /** OCID of TargetResponderRecipe */
    public String getTargetResponderRecipeId() {
        return targetResponderRecipeId;
    }
    /** The id of ResponderRule */
    private String responderRuleId;

    /** The id of ResponderRule */
    public String getResponderRuleId() {
        return responderRuleId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetTargetResponderRecipeResponderRuleRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** OCID of target */
        private String targetId = null;

        /**
         * OCID of target
         *
         * @param targetId the value to set
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /** OCID of TargetResponderRecipe */
        private String targetResponderRecipeId = null;

        /**
         * OCID of TargetResponderRecipe
         *
         * @param targetResponderRecipeId the value to set
         * @return this builder instance
         */
        public Builder targetResponderRecipeId(String targetResponderRecipeId) {
            this.targetResponderRecipeId = targetResponderRecipeId;
            return this;
        }

        /** The id of ResponderRule */
        private String responderRuleId = null;

        /**
         * The id of ResponderRule
         *
         * @param responderRuleId the value to set
         * @return this builder instance
         */
        public Builder responderRuleId(String responderRuleId) {
            this.responderRuleId = responderRuleId;
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
        public Builder copy(GetTargetResponderRecipeResponderRuleRequest o) {
            targetId(o.getTargetId());
            targetResponderRecipeId(o.getTargetResponderRecipeId());
            responderRuleId(o.getResponderRuleId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetTargetResponderRecipeResponderRuleRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetTargetResponderRecipeResponderRuleRequest
         */
        public GetTargetResponderRecipeResponderRuleRequest build() {
            GetTargetResponderRecipeResponderRuleRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetTargetResponderRecipeResponderRuleRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetTargetResponderRecipeResponderRuleRequest
         */
        public GetTargetResponderRecipeResponderRuleRequest buildWithoutInvocationCallback() {
            GetTargetResponderRecipeResponderRuleRequest request =
                    new GetTargetResponderRecipeResponderRuleRequest();
            request.targetId = targetId;
            request.targetResponderRecipeId = targetResponderRecipeId;
            request.responderRuleId = responderRuleId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetTargetResponderRecipeResponderRuleRequest(targetId, targetResponderRecipeId,
            // responderRuleId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .targetId(targetId)
                .targetResponderRecipeId(targetResponderRecipeId)
                .responderRuleId(responderRuleId)
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
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",targetResponderRecipeId=").append(String.valueOf(this.targetResponderRecipeId));
        sb.append(",responderRuleId=").append(String.valueOf(this.responderRuleId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTargetResponderRecipeResponderRuleRequest)) {
            return false;
        }

        GetTargetResponderRecipeResponderRuleRequest other =
                (GetTargetResponderRecipeResponderRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(
                        this.targetResponderRecipeId, other.targetResponderRecipeId)
                && java.util.Objects.equals(this.responderRuleId, other.responderRuleId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResponderRecipeId == null
                                ? 43
                                : this.targetResponderRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.responderRuleId == null ? 43 : this.responderRuleId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
