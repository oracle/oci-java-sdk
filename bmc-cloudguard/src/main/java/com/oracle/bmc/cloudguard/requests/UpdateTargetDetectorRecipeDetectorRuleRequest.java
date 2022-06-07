/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateTargetDetectorRecipeDetectorRuleExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateTargetDetectorRecipeDetectorRuleRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class UpdateTargetDetectorRecipeDetectorRuleRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.cloudguard.model.UpdateTargetDetectorRecipeDetectorRuleDetails> {

    /**
     * OCID of target
     */
    private String targetId;

    public String getTargetId() {
        return targetId;
    }
    /**
     * OCID of TargetDetectorRecipe
     */
    private String targetDetectorRecipeId;

    public String getTargetDetectorRecipeId() {
        return targetDetectorRecipeId;
    }
    /**
     * The id of DetectorRule
     */
    private String detectorRuleId;

    public String getDetectorRuleId() {
        return detectorRuleId;
    }
    /**
     * The details to be updated for DetectorRule.
     */
    private com.oracle.bmc.cloudguard.model.UpdateTargetDetectorRecipeDetectorRuleDetails
            updateTargetDetectorRecipeDetectorRuleDetails;

    public com.oracle.bmc.cloudguard.model.UpdateTargetDetectorRecipeDetectorRuleDetails
            getUpdateTargetDetectorRecipeDetectorRuleDetails() {
        return updateTargetDetectorRecipeDetectorRuleDetails;
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
    public com.oracle.bmc.cloudguard.model.UpdateTargetDetectorRecipeDetectorRuleDetails
            getBody$() {
        return updateTargetDetectorRecipeDetectorRuleDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateTargetDetectorRecipeDetectorRuleRequest,
                    com.oracle.bmc.cloudguard.model.UpdateTargetDetectorRecipeDetectorRuleDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String targetId = null;

        /**
         * OCID of target
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        private String targetDetectorRecipeId = null;

        /**
         * OCID of TargetDetectorRecipe
         * @return this builder instance
         */
        public Builder targetDetectorRecipeId(String targetDetectorRecipeId) {
            this.targetDetectorRecipeId = targetDetectorRecipeId;
            return this;
        }

        private String detectorRuleId = null;

        /**
         * The id of DetectorRule
         * @return this builder instance
         */
        public Builder detectorRuleId(String detectorRuleId) {
            this.detectorRuleId = detectorRuleId;
            return this;
        }

        private com.oracle.bmc.cloudguard.model.UpdateTargetDetectorRecipeDetectorRuleDetails
                updateTargetDetectorRecipeDetectorRuleDetails = null;

        /**
         * The details to be updated for DetectorRule.
         * @return this builder instance
         */
        public Builder updateTargetDetectorRecipeDetectorRuleDetails(
                com.oracle.bmc.cloudguard.model.UpdateTargetDetectorRecipeDetectorRuleDetails
                        updateTargetDetectorRecipeDetectorRuleDetails) {
            this.updateTargetDetectorRecipeDetectorRuleDetails =
                    updateTargetDetectorRecipeDetectorRuleDetails;
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
        public Builder copy(UpdateTargetDetectorRecipeDetectorRuleRequest o) {
            targetId(o.getTargetId());
            targetDetectorRecipeId(o.getTargetDetectorRecipeId());
            detectorRuleId(o.getDetectorRuleId());
            updateTargetDetectorRecipeDetectorRuleDetails(
                    o.getUpdateTargetDetectorRecipeDetectorRuleDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateTargetDetectorRecipeDetectorRuleRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateTargetDetectorRecipeDetectorRuleRequest
         */
        public UpdateTargetDetectorRecipeDetectorRuleRequest build() {
            UpdateTargetDetectorRecipeDetectorRuleRequest request =
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
                com.oracle.bmc.cloudguard.model.UpdateTargetDetectorRecipeDetectorRuleDetails
                        body) {
            updateTargetDetectorRecipeDetectorRuleDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateTargetDetectorRecipeDetectorRuleRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateTargetDetectorRecipeDetectorRuleRequest
         */
        public UpdateTargetDetectorRecipeDetectorRuleRequest buildWithoutInvocationCallback() {
            UpdateTargetDetectorRecipeDetectorRuleRequest request =
                    new UpdateTargetDetectorRecipeDetectorRuleRequest();
            request.targetId = targetId;
            request.targetDetectorRecipeId = targetDetectorRecipeId;
            request.detectorRuleId = detectorRuleId;
            request.updateTargetDetectorRecipeDetectorRuleDetails =
                    updateTargetDetectorRecipeDetectorRuleDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateTargetDetectorRecipeDetectorRuleRequest(targetId, targetDetectorRecipeId, detectorRuleId, updateTargetDetectorRecipeDetectorRuleDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .targetId(targetId)
                .targetDetectorRecipeId(targetDetectorRecipeId)
                .detectorRuleId(detectorRuleId)
                .updateTargetDetectorRecipeDetectorRuleDetails(
                        updateTargetDetectorRecipeDetectorRuleDetails)
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
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",targetDetectorRecipeId=").append(String.valueOf(this.targetDetectorRecipeId));
        sb.append(",detectorRuleId=").append(String.valueOf(this.detectorRuleId));
        sb.append(",updateTargetDetectorRecipeDetectorRuleDetails=")
                .append(String.valueOf(this.updateTargetDetectorRecipeDetectorRuleDetails));
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
        if (!(o instanceof UpdateTargetDetectorRecipeDetectorRuleRequest)) {
            return false;
        }

        UpdateTargetDetectorRecipeDetectorRuleRequest other =
                (UpdateTargetDetectorRecipeDetectorRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(
                        this.targetDetectorRecipeId, other.targetDetectorRecipeId)
                && java.util.Objects.equals(this.detectorRuleId, other.detectorRuleId)
                && java.util.Objects.equals(
                        this.updateTargetDetectorRecipeDetectorRuleDetails,
                        other.updateTargetDetectorRecipeDetectorRuleDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDetectorRecipeId == null
                                ? 43
                                : this.targetDetectorRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRuleId == null ? 43 : this.detectorRuleId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateTargetDetectorRecipeDetectorRuleDetails == null
                                ? 43
                                : this.updateTargetDetectorRecipeDetectorRuleDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
