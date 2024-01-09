/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.autoscaling.requests;

import com.oracle.bmc.autoscaling.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/autoscaling/UpdateAutoScalingPolicyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateAutoScalingPolicyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public class UpdateAutoScalingPolicyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.autoscaling.model.UpdateAutoScalingPolicyDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * autoscaling configuration.
     */
    private String autoScalingConfigurationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * autoscaling configuration.
     */
    public String getAutoScalingConfigurationId() {
        return autoScalingConfigurationId;
    }
    /** The ID of the autoscaling policy. */
    private String autoScalingPolicyId;

    /** The ID of the autoscaling policy. */
    public String getAutoScalingPolicyId() {
        return autoScalingPolicyId;
    }
    /** Update details for an autoscaling policy. */
    private com.oracle.bmc.autoscaling.model.UpdateAutoScalingPolicyDetails
            updateAutoScalingPolicyDetails;

    /** Update details for an autoscaling policy. */
    public com.oracle.bmc.autoscaling.model.UpdateAutoScalingPolicyDetails
            getUpdateAutoScalingPolicyDetails() {
        return updateAutoScalingPolicyDetails;
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

    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
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
    public com.oracle.bmc.autoscaling.model.UpdateAutoScalingPolicyDetails getBody$() {
        return updateAutoScalingPolicyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAutoScalingPolicyRequest,
                    com.oracle.bmc.autoscaling.model.UpdateAutoScalingPolicyDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * autoscaling configuration.
         */
        private String autoScalingConfigurationId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * autoscaling configuration.
         *
         * @param autoScalingConfigurationId the value to set
         * @return this builder instance
         */
        public Builder autoScalingConfigurationId(String autoScalingConfigurationId) {
            this.autoScalingConfigurationId = autoScalingConfigurationId;
            return this;
        }

        /** The ID of the autoscaling policy. */
        private String autoScalingPolicyId = null;

        /**
         * The ID of the autoscaling policy.
         *
         * @param autoScalingPolicyId the value to set
         * @return this builder instance
         */
        public Builder autoScalingPolicyId(String autoScalingPolicyId) {
            this.autoScalingPolicyId = autoScalingPolicyId;
            return this;
        }

        /** Update details for an autoscaling policy. */
        private com.oracle.bmc.autoscaling.model.UpdateAutoScalingPolicyDetails
                updateAutoScalingPolicyDetails = null;

        /**
         * Update details for an autoscaling policy.
         *
         * @param updateAutoScalingPolicyDetails the value to set
         * @return this builder instance
         */
        public Builder updateAutoScalingPolicyDetails(
                com.oracle.bmc.autoscaling.model.UpdateAutoScalingPolicyDetails
                        updateAutoScalingPolicyDetails) {
            this.updateAutoScalingPolicyDetails = updateAutoScalingPolicyDetails;
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

        private String opcRequestId = null;

        /**
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
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
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
        public Builder copy(UpdateAutoScalingPolicyRequest o) {
            autoScalingConfigurationId(o.getAutoScalingConfigurationId());
            autoScalingPolicyId(o.getAutoScalingPolicyId());
            updateAutoScalingPolicyDetails(o.getUpdateAutoScalingPolicyDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAutoScalingPolicyRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateAutoScalingPolicyRequest
         */
        public UpdateAutoScalingPolicyRequest build() {
            UpdateAutoScalingPolicyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.autoscaling.model.UpdateAutoScalingPolicyDetails body) {
            updateAutoScalingPolicyDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAutoScalingPolicyRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAutoScalingPolicyRequest
         */
        public UpdateAutoScalingPolicyRequest buildWithoutInvocationCallback() {
            UpdateAutoScalingPolicyRequest request = new UpdateAutoScalingPolicyRequest();
            request.autoScalingConfigurationId = autoScalingConfigurationId;
            request.autoScalingPolicyId = autoScalingPolicyId;
            request.updateAutoScalingPolicyDetails = updateAutoScalingPolicyDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new UpdateAutoScalingPolicyRequest(autoScalingConfigurationId, autoScalingPolicyId,
            // updateAutoScalingPolicyDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .autoScalingConfigurationId(autoScalingConfigurationId)
                .autoScalingPolicyId(autoScalingPolicyId)
                .updateAutoScalingPolicyDetails(updateAutoScalingPolicyDetails)
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
        sb.append(",autoScalingConfigurationId=")
                .append(String.valueOf(this.autoScalingConfigurationId));
        sb.append(",autoScalingPolicyId=").append(String.valueOf(this.autoScalingPolicyId));
        sb.append(",updateAutoScalingPolicyDetails=")
                .append(String.valueOf(this.updateAutoScalingPolicyDetails));
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
        if (!(o instanceof UpdateAutoScalingPolicyRequest)) {
            return false;
        }

        UpdateAutoScalingPolicyRequest other = (UpdateAutoScalingPolicyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.autoScalingConfigurationId, other.autoScalingConfigurationId)
                && java.util.Objects.equals(this.autoScalingPolicyId, other.autoScalingPolicyId)
                && java.util.Objects.equals(
                        this.updateAutoScalingPolicyDetails, other.updateAutoScalingPolicyDetails)
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
                        + (this.autoScalingConfigurationId == null
                                ? 43
                                : this.autoScalingConfigurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.autoScalingPolicyId == null
                                ? 43
                                : this.autoScalingPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateAutoScalingPolicyDetails == null
                                ? 43
                                : this.updateAutoScalingPolicyDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
