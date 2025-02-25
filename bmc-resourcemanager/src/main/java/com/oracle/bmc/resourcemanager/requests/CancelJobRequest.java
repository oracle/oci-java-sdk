/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.requests;

import com.oracle.bmc.resourcemanager.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/CancelJobExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CancelJobRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class CancelJobRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     */
    private String jobId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     */
    public String getJobId() {
        return jobId;
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
     * Indicates whether a forced cancellation is requested for the job while it was running.
     * A forced cancellation can result in an incorrect state file.
     * For example, the state file might not reflect the exact state of the provisioned resources.
     *
     */
    private Boolean isForced;

    /**
     * Indicates whether a forced cancellation is requested for the job while it was running.
     * A forced cancellation can result in an incorrect state file.
     * For example, the state file might not reflect the exact state of the provisioned resources.
     *
     */
    public Boolean getIsForced() {
        return isForced;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CancelJobRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
         */
        private String jobId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
         * @param jobId the value to set
         * @return this builder instance
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
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
         * Indicates whether a forced cancellation is requested for the job while it was running.
         * A forced cancellation can result in an incorrect state file.
         * For example, the state file might not reflect the exact state of the provisioned resources.
         *
         */
        private Boolean isForced = null;

        /**
         * Indicates whether a forced cancellation is requested for the job while it was running.
         * A forced cancellation can result in an incorrect state file.
         * For example, the state file might not reflect the exact state of the provisioned resources.
         *
         * @param isForced the value to set
         * @return this builder instance
         */
        public Builder isForced(Boolean isForced) {
            this.isForced = isForced;
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
        public Builder copy(CancelJobRequest o) {
            jobId(o.getJobId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            isForced(o.getIsForced());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CancelJobRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CancelJobRequest
         */
        public CancelJobRequest build() {
            CancelJobRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of CancelJobRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CancelJobRequest
         */
        public CancelJobRequest buildWithoutInvocationCallback() {
            CancelJobRequest request = new CancelJobRequest();
            request.jobId = jobId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.isForced = isForced;
            return request;
            // new CancelJobRequest(jobId, opcRequestId, ifMatch, isForced);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .jobId(jobId)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .isForced(isForced);
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
        sb.append(",jobId=").append(String.valueOf(this.jobId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",isForced=").append(String.valueOf(this.isForced));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CancelJobRequest)) {
            return false;
        }

        CancelJobRequest other = (CancelJobRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.jobId, other.jobId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.isForced, other.isForced);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.jobId == null ? 43 : this.jobId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.isForced == null ? 43 : this.isForced.hashCode());
        return result;
    }
}
