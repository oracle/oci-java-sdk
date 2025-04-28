/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateDetectorRecipeDetectorRuleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateDetectorRecipeDetectorRuleRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class UpdateDetectorRecipeDetectorRuleRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.cloudguard.model.UpdateDetectorRecipeDetectorRuleDetails> {

    /** Detector recipe OCID */
    private String detectorRecipeId;

    /** Detector recipe OCID */
    public String getDetectorRecipeId() {
        return detectorRecipeId;
    }
    /** The unique identifier of a detector rule. */
    private String detectorRuleId;

    /** The unique identifier of a detector rule. */
    public String getDetectorRuleId() {
        return detectorRuleId;
    }
    /** The details to be updated for DetectorRule */
    private com.oracle.bmc.cloudguard.model.UpdateDetectorRecipeDetectorRuleDetails
            updateDetectorRecipeDetectorRuleDetails;

    /** The details to be updated for DetectorRule */
    public com.oracle.bmc.cloudguard.model.UpdateDetectorRecipeDetectorRuleDetails
            getUpdateDetectorRecipeDetectorRuleDetails() {
        return updateDetectorRecipeDetectorRuleDetails;
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
    public com.oracle.bmc.cloudguard.model.UpdateDetectorRecipeDetectorRuleDetails getBody$() {
        return updateDetectorRecipeDetectorRuleDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDetectorRecipeDetectorRuleRequest,
                    com.oracle.bmc.cloudguard.model.UpdateDetectorRecipeDetectorRuleDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Detector recipe OCID */
        private String detectorRecipeId = null;

        /**
         * Detector recipe OCID
         *
         * @param detectorRecipeId the value to set
         * @return this builder instance
         */
        public Builder detectorRecipeId(String detectorRecipeId) {
            this.detectorRecipeId = detectorRecipeId;
            return this;
        }

        /** The unique identifier of a detector rule. */
        private String detectorRuleId = null;

        /**
         * The unique identifier of a detector rule.
         *
         * @param detectorRuleId the value to set
         * @return this builder instance
         */
        public Builder detectorRuleId(String detectorRuleId) {
            this.detectorRuleId = detectorRuleId;
            return this;
        }

        /** The details to be updated for DetectorRule */
        private com.oracle.bmc.cloudguard.model.UpdateDetectorRecipeDetectorRuleDetails
                updateDetectorRecipeDetectorRuleDetails = null;

        /**
         * The details to be updated for DetectorRule
         *
         * @param updateDetectorRecipeDetectorRuleDetails the value to set
         * @return this builder instance
         */
        public Builder updateDetectorRecipeDetectorRuleDetails(
                com.oracle.bmc.cloudguard.model.UpdateDetectorRecipeDetectorRuleDetails
                        updateDetectorRecipeDetectorRuleDetails) {
            this.updateDetectorRecipeDetectorRuleDetails = updateDetectorRecipeDetectorRuleDetails;
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
        public Builder copy(UpdateDetectorRecipeDetectorRuleRequest o) {
            detectorRecipeId(o.getDetectorRecipeId());
            detectorRuleId(o.getDetectorRuleId());
            updateDetectorRecipeDetectorRuleDetails(o.getUpdateDetectorRecipeDetectorRuleDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDetectorRecipeDetectorRuleRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateDetectorRecipeDetectorRuleRequest
         */
        public UpdateDetectorRecipeDetectorRuleRequest build() {
            UpdateDetectorRecipeDetectorRuleRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.cloudguard.model.UpdateDetectorRecipeDetectorRuleDetails body) {
            updateDetectorRecipeDetectorRuleDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDetectorRecipeDetectorRuleRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDetectorRecipeDetectorRuleRequest
         */
        public UpdateDetectorRecipeDetectorRuleRequest buildWithoutInvocationCallback() {
            UpdateDetectorRecipeDetectorRuleRequest request =
                    new UpdateDetectorRecipeDetectorRuleRequest();
            request.detectorRecipeId = detectorRecipeId;
            request.detectorRuleId = detectorRuleId;
            request.updateDetectorRecipeDetectorRuleDetails =
                    updateDetectorRecipeDetectorRuleDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateDetectorRecipeDetectorRuleRequest(detectorRecipeId, detectorRuleId,
            // updateDetectorRecipeDetectorRuleDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .detectorRecipeId(detectorRecipeId)
                .detectorRuleId(detectorRuleId)
                .updateDetectorRecipeDetectorRuleDetails(updateDetectorRecipeDetectorRuleDetails)
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
        sb.append(",detectorRecipeId=").append(String.valueOf(this.detectorRecipeId));
        sb.append(",detectorRuleId=").append(String.valueOf(this.detectorRuleId));
        sb.append(",updateDetectorRecipeDetectorRuleDetails=")
                .append(String.valueOf(this.updateDetectorRecipeDetectorRuleDetails));
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
        if (!(o instanceof UpdateDetectorRecipeDetectorRuleRequest)) {
            return false;
        }

        UpdateDetectorRecipeDetectorRuleRequest other = (UpdateDetectorRecipeDetectorRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.detectorRecipeId, other.detectorRecipeId)
                && java.util.Objects.equals(this.detectorRuleId, other.detectorRuleId)
                && java.util.Objects.equals(
                        this.updateDetectorRecipeDetectorRuleDetails,
                        other.updateDetectorRecipeDetectorRuleDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.detectorRecipeId == null ? 43 : this.detectorRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRuleId == null ? 43 : this.detectorRuleId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDetectorRecipeDetectorRuleDetails == null
                                ? 43
                                : this.updateDetectorRecipeDetectorRuleDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
