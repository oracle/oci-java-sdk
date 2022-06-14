/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.requests;

import com.oracle.bmc.logging.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/logging/ChangeLogLogGroupExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeLogLogGroupRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public class ChangeLogLogGroupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.logging.model.ChangeLogLogGroupDetails> {

    /**
     * OCID of a log group to work with.
     */
    private String logGroupId;

    /**
     * OCID of a log group to work with.
     */
    public String getLogGroupId() {
        return logGroupId;
    }
    /**
     * OCID of a log to work with.
     */
    private String logId;

    /**
     * OCID of a log to work with.
     */
    public String getLogId() {
        return logId;
    }
    /**
     * Request to change the log group of a given log.
     */
    private com.oracle.bmc.logging.model.ChangeLogLogGroupDetails changeLogLogGroupDetails;

    /**
     * Request to change the log group of a given log.
     */
    public com.oracle.bmc.logging.model.ChangeLogLogGroupDetails getChangeLogLogGroupDetails() {
        return changeLogLogGroupDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code if-match} parameter to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code if-match} parameter to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.logging.model.ChangeLogLogGroupDetails getBody$() {
        return changeLogLogGroupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeLogLogGroupRequest,
                    com.oracle.bmc.logging.model.ChangeLogLogGroupDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * OCID of a log group to work with.
         */
        private String logGroupId = null;

        /**
         * OCID of a log group to work with.
         * @param logGroupId the value to set
         * @return this builder instance
         */
        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            return this;
        }

        /**
         * OCID of a log to work with.
         */
        private String logId = null;

        /**
         * OCID of a log to work with.
         * @param logId the value to set
         * @return this builder instance
         */
        public Builder logId(String logId) {
            this.logId = logId;
            return this;
        }

        /**
         * Request to change the log group of a given log.
         */
        private com.oracle.bmc.logging.model.ChangeLogLogGroupDetails changeLogLogGroupDetails =
                null;

        /**
         * Request to change the log group of a given log.
         * @param changeLogLogGroupDetails the value to set
         * @return this builder instance
         */
        public Builder changeLogLogGroupDetails(
                com.oracle.bmc.logging.model.ChangeLogLogGroupDetails changeLogLogGroupDetails) {
            this.changeLogLogGroupDetails = changeLogLogGroupDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
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
        public Builder copy(ChangeLogLogGroupRequest o) {
            logGroupId(o.getLogGroupId());
            logId(o.getLogId());
            changeLogLogGroupDetails(o.getChangeLogLogGroupDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeLogLogGroupRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeLogLogGroupRequest
         */
        public ChangeLogLogGroupRequest build() {
            ChangeLogLogGroupRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.logging.model.ChangeLogLogGroupDetails body) {
            changeLogLogGroupDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeLogLogGroupRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeLogLogGroupRequest
         */
        public ChangeLogLogGroupRequest buildWithoutInvocationCallback() {
            ChangeLogLogGroupRequest request = new ChangeLogLogGroupRequest();
            request.logGroupId = logGroupId;
            request.logId = logId;
            request.changeLogLogGroupDetails = changeLogLogGroupDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeLogLogGroupRequest(logGroupId, logId, changeLogLogGroupDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .logGroupId(logGroupId)
                .logId(logId)
                .changeLogLogGroupDetails(changeLogLogGroupDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(",logId=").append(String.valueOf(this.logId));
        sb.append(",changeLogLogGroupDetails=")
                .append(String.valueOf(this.changeLogLogGroupDetails));
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
        if (!(o instanceof ChangeLogLogGroupRequest)) {
            return false;
        }

        ChangeLogLogGroupRequest other = (ChangeLogLogGroupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.logGroupId, other.logGroupId)
                && java.util.Objects.equals(this.logId, other.logId)
                && java.util.Objects.equals(
                        this.changeLogLogGroupDetails, other.changeLogLogGroupDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result = (result * PRIME) + (this.logId == null ? 43 : this.logId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeLogLogGroupDetails == null
                                ? 43
                                : this.changeLogLogGroupDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
