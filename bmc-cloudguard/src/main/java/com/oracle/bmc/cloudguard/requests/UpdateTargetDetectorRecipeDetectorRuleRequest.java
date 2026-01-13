/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateTargetDetectorRecipeDetectorRuleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateTargetDetectorRecipeDetectorRuleRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class UpdateTargetDetectorRecipeDetectorRuleRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.cloudguard.model.UpdateTargetDetectorRecipeDetectorRuleDetails> {

    /** OCID of the target */
    private String targetId;

    /** OCID of the target */
    public String getTargetId() {
        return targetId;
    }
    /** OCID of the target detector recipe. */
    private String targetDetectorRecipeId;

    /** OCID of the target detector recipe. */
    public String getTargetDetectorRecipeId() {
        return targetDetectorRecipeId;
    }
    /** The unique identifier of the detector rule. */
    private String detectorRuleId;

    /** The unique identifier of the detector rule. */
    public String getDetectorRuleId() {
        return detectorRuleId;
    }
    /** The details to be updated for the detector rule */
    private com.oracle.bmc.cloudguard.model.UpdateTargetDetectorRecipeDetectorRuleDetails
            updateTargetDetectorRecipeDetectorRuleDetails;

    /** The details to be updated for the detector rule */
    public com.oracle.bmc.cloudguard.model.UpdateTargetDetectorRecipeDetectorRuleDetails
            getUpdateTargetDetectorRecipeDetectorRuleDetails() {
        return updateTargetDetectorRecipeDetectorRuleDetails;
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
    public com.oracle.bmc.cloudguard.model.UpdateTargetDetectorRecipeDetectorRuleDetails
            getBody$() {
        return updateTargetDetectorRecipeDetectorRuleDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateTargetDetectorRecipeDetectorRuleRequest,
                    com.oracle.bmc.cloudguard.model.UpdateTargetDetectorRecipeDetectorRuleDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** OCID of the target */
        private String targetId = null;

        /**
         * OCID of the target
         *
         * @param targetId the value to set
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /** OCID of the target detector recipe. */
        private String targetDetectorRecipeId = null;

        /**
         * OCID of the target detector recipe.
         *
         * @param targetDetectorRecipeId the value to set
         * @return this builder instance
         */
        public Builder targetDetectorRecipeId(String targetDetectorRecipeId) {
            this.targetDetectorRecipeId = targetDetectorRecipeId;
            return this;
        }

        /** The unique identifier of the detector rule. */
        private String detectorRuleId = null;

        /**
         * The unique identifier of the detector rule.
         *
         * @param detectorRuleId the value to set
         * @return this builder instance
         */
        public Builder detectorRuleId(String detectorRuleId) {
            this.detectorRuleId = detectorRuleId;
            return this;
        }

        /** The details to be updated for the detector rule */
        private com.oracle.bmc.cloudguard.model.UpdateTargetDetectorRecipeDetectorRuleDetails
                updateTargetDetectorRecipeDetectorRuleDetails = null;

        /**
         * The details to be updated for the detector rule
         *
         * @param updateTargetDetectorRecipeDetectorRuleDetails the value to set
         * @return this builder instance
         */
        public Builder updateTargetDetectorRecipeDetectorRuleDetails(
                com.oracle.bmc.cloudguard.model.UpdateTargetDetectorRecipeDetectorRuleDetails
                        updateTargetDetectorRecipeDetectorRuleDetails) {
            this.updateTargetDetectorRecipeDetectorRuleDetails =
                    updateTargetDetectorRecipeDetectorRuleDetails;
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
         * Build the instance of UpdateTargetDetectorRecipeDetectorRuleRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
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
         *
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
         * Build the instance of UpdateTargetDetectorRecipeDetectorRuleRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
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
            // new UpdateTargetDetectorRecipeDetectorRuleRequest(targetId, targetDetectorRecipeId,
            // detectorRuleId, updateTargetDetectorRecipeDetectorRuleDetails, ifMatch,
            // opcRequestId);
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
                .targetDetectorRecipeId(targetDetectorRecipeId)
                .detectorRuleId(detectorRuleId)
                .updateTargetDetectorRecipeDetectorRuleDetails(
                        updateTargetDetectorRecipeDetectorRuleDetails)
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
