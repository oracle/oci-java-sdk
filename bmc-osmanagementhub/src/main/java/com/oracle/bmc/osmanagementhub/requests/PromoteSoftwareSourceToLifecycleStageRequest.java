/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/PromoteSoftwareSourceToLifecycleStageExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PromoteSoftwareSourceToLifecycleStageRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class PromoteSoftwareSourceToLifecycleStageRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.osmanagementhub.model.PromoteSoftwareSourceToLifecycleStageDetails> {

    /**
     * The OCID of the lifecycle stage.
     */
    private String lifecycleStageId;

    /**
     * The OCID of the lifecycle stage.
     */
    public String getLifecycleStageId() {
        return lifecycleStageId;
    }
    /**
     * Details for the software source promotion job.
     */
    private com.oracle.bmc.osmanagementhub.model.PromoteSoftwareSourceToLifecycleStageDetails
            promoteSoftwareSourceToLifecycleStageDetails;

    /**
     * Details for the software source promotion job.
     */
    public com.oracle.bmc.osmanagementhub.model.PromoteSoftwareSourceToLifecycleStageDetails
            getPromoteSoftwareSourceToLifecycleStageDetails() {
        return promoteSoftwareSourceToLifecycleStageDetails;
    }
    /**
     * The OCID for the software source.
     */
    private String softwareSourceId;

    /**
     * The OCID for the software source.
     */
    public String getSoftwareSourceId() {
        return softwareSourceId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.osmanagementhub.model.PromoteSoftwareSourceToLifecycleStageDetails
            getBody$() {
        return promoteSoftwareSourceToLifecycleStageDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PromoteSoftwareSourceToLifecycleStageRequest,
                    com.oracle.bmc.osmanagementhub.model
                            .PromoteSoftwareSourceToLifecycleStageDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the lifecycle stage.
         */
        private String lifecycleStageId = null;

        /**
         * The OCID of the lifecycle stage.
         * @param lifecycleStageId the value to set
         * @return this builder instance
         */
        public Builder lifecycleStageId(String lifecycleStageId) {
            this.lifecycleStageId = lifecycleStageId;
            return this;
        }

        /**
         * Details for the software source promotion job.
         */
        private com.oracle.bmc.osmanagementhub.model.PromoteSoftwareSourceToLifecycleStageDetails
                promoteSoftwareSourceToLifecycleStageDetails = null;

        /**
         * Details for the software source promotion job.
         * @param promoteSoftwareSourceToLifecycleStageDetails the value to set
         * @return this builder instance
         */
        public Builder promoteSoftwareSourceToLifecycleStageDetails(
                com.oracle.bmc.osmanagementhub.model.PromoteSoftwareSourceToLifecycleStageDetails
                        promoteSoftwareSourceToLifecycleStageDetails) {
            this.promoteSoftwareSourceToLifecycleStageDetails =
                    promoteSoftwareSourceToLifecycleStageDetails;
            return this;
        }

        /**
         * The OCID for the software source.
         */
        private String softwareSourceId = null;

        /**
         * The OCID for the software source.
         * @param softwareSourceId the value to set
         * @return this builder instance
         */
        public Builder softwareSourceId(String softwareSourceId) {
            this.softwareSourceId = softwareSourceId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
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
        public Builder copy(PromoteSoftwareSourceToLifecycleStageRequest o) {
            lifecycleStageId(o.getLifecycleStageId());
            promoteSoftwareSourceToLifecycleStageDetails(
                    o.getPromoteSoftwareSourceToLifecycleStageDetails());
            softwareSourceId(o.getSoftwareSourceId());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PromoteSoftwareSourceToLifecycleStageRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of PromoteSoftwareSourceToLifecycleStageRequest
         */
        public PromoteSoftwareSourceToLifecycleStageRequest build() {
            PromoteSoftwareSourceToLifecycleStageRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.osmanagementhub.model.PromoteSoftwareSourceToLifecycleStageDetails
                        body) {
            promoteSoftwareSourceToLifecycleStageDetails(body);
            return this;
        }

        /**
         * Build the instance of PromoteSoftwareSourceToLifecycleStageRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PromoteSoftwareSourceToLifecycleStageRequest
         */
        public PromoteSoftwareSourceToLifecycleStageRequest buildWithoutInvocationCallback() {
            PromoteSoftwareSourceToLifecycleStageRequest request =
                    new PromoteSoftwareSourceToLifecycleStageRequest();
            request.lifecycleStageId = lifecycleStageId;
            request.promoteSoftwareSourceToLifecycleStageDetails =
                    promoteSoftwareSourceToLifecycleStageDetails;
            request.softwareSourceId = softwareSourceId;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new PromoteSoftwareSourceToLifecycleStageRequest(lifecycleStageId, promoteSoftwareSourceToLifecycleStageDetails, softwareSourceId, opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .lifecycleStageId(lifecycleStageId)
                .promoteSoftwareSourceToLifecycleStageDetails(
                        promoteSoftwareSourceToLifecycleStageDetails)
                .softwareSourceId(softwareSourceId)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .ifMatch(ifMatch);
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
        sb.append(",lifecycleStageId=").append(String.valueOf(this.lifecycleStageId));
        sb.append(",promoteSoftwareSourceToLifecycleStageDetails=")
                .append(String.valueOf(this.promoteSoftwareSourceToLifecycleStageDetails));
        sb.append(",softwareSourceId=").append(String.valueOf(this.softwareSourceId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PromoteSoftwareSourceToLifecycleStageRequest)) {
            return false;
        }

        PromoteSoftwareSourceToLifecycleStageRequest other =
                (PromoteSoftwareSourceToLifecycleStageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.lifecycleStageId, other.lifecycleStageId)
                && java.util.Objects.equals(
                        this.promoteSoftwareSourceToLifecycleStageDetails,
                        other.promoteSoftwareSourceToLifecycleStageDetails)
                && java.util.Objects.equals(this.softwareSourceId, other.softwareSourceId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.lifecycleStageId == null ? 43 : this.lifecycleStageId.hashCode());
        result =
                (result * PRIME)
                        + (this.promoteSoftwareSourceToLifecycleStageDetails == null
                                ? 43
                                : this.promoteSoftwareSourceToLifecycleStageDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceId == null ? 43 : this.softwareSourceId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
