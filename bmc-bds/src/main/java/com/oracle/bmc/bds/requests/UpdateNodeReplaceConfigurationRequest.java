/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.requests;

import com.oracle.bmc.bds.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/UpdateNodeReplaceConfigurationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateNodeReplaceConfigurationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public class UpdateNodeReplaceConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.bds.model.UpdateNodeReplaceConfigurationDetails> {

    /** The OCID of the cluster. */
    private String bdsInstanceId;

    /** The OCID of the cluster. */
    public String getBdsInstanceId() {
        return bdsInstanceId;
    }
    /** Unique Oracle-assigned identifier of the NodeReplaceConfiguration. */
    private String nodeReplaceConfigurationId;

    /** Unique Oracle-assigned identifier of the NodeReplaceConfiguration. */
    public String getNodeReplaceConfigurationId() {
        return nodeReplaceConfigurationId;
    }
    /** Details for updating the nodeReplaceConfiguration. */
    private com.oracle.bmc.bds.model.UpdateNodeReplaceConfigurationDetails
            updateNodeReplaceConfigurationDetails;

    /** Details for updating the nodeReplaceConfiguration. */
    public com.oracle.bmc.bds.model.UpdateNodeReplaceConfigurationDetails
            getUpdateNodeReplaceConfigurationDetails() {
        return updateNodeReplaceConfigurationDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
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
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error, without risk of executing that same action again. Retry tokens expire after 24
     * hours but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error, without risk of executing that same action again. Retry tokens expire after 24
     * hours but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
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
    public com.oracle.bmc.bds.model.UpdateNodeReplaceConfigurationDetails getBody$() {
        return updateNodeReplaceConfigurationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateNodeReplaceConfigurationRequest,
                    com.oracle.bmc.bds.model.UpdateNodeReplaceConfigurationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the cluster. */
        private String bdsInstanceId = null;

        /**
         * The OCID of the cluster.
         *
         * @param bdsInstanceId the value to set
         * @return this builder instance
         */
        public Builder bdsInstanceId(String bdsInstanceId) {
            this.bdsInstanceId = bdsInstanceId;
            return this;
        }

        /** Unique Oracle-assigned identifier of the NodeReplaceConfiguration. */
        private String nodeReplaceConfigurationId = null;

        /**
         * Unique Oracle-assigned identifier of the NodeReplaceConfiguration.
         *
         * @param nodeReplaceConfigurationId the value to set
         * @return this builder instance
         */
        public Builder nodeReplaceConfigurationId(String nodeReplaceConfigurationId) {
            this.nodeReplaceConfigurationId = nodeReplaceConfigurationId;
            return this;
        }

        /** Details for updating the nodeReplaceConfiguration. */
        private com.oracle.bmc.bds.model.UpdateNodeReplaceConfigurationDetails
                updateNodeReplaceConfigurationDetails = null;

        /**
         * Details for updating the nodeReplaceConfiguration.
         *
         * @param updateNodeReplaceConfigurationDetails the value to set
         * @return this builder instance
         */
        public Builder updateNodeReplaceConfigurationDetails(
                com.oracle.bmc.bds.model.UpdateNodeReplaceConfigurationDetails
                        updateNodeReplaceConfigurationDetails) {
            this.updateNodeReplaceConfigurationDetails = updateNodeReplaceConfigurationDetails;
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

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error, without risk of executing that same action again. Retry tokens expire after
         * 24 hours but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error, without risk of executing that same action again. Retry tokens expire after
         * 24 hours but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
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
        public Builder copy(UpdateNodeReplaceConfigurationRequest o) {
            bdsInstanceId(o.getBdsInstanceId());
            nodeReplaceConfigurationId(o.getNodeReplaceConfigurationId());
            updateNodeReplaceConfigurationDetails(o.getUpdateNodeReplaceConfigurationDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateNodeReplaceConfigurationRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateNodeReplaceConfigurationRequest
         */
        public UpdateNodeReplaceConfigurationRequest build() {
            UpdateNodeReplaceConfigurationRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.bds.model.UpdateNodeReplaceConfigurationDetails body) {
            updateNodeReplaceConfigurationDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateNodeReplaceConfigurationRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateNodeReplaceConfigurationRequest
         */
        public UpdateNodeReplaceConfigurationRequest buildWithoutInvocationCallback() {
            UpdateNodeReplaceConfigurationRequest request =
                    new UpdateNodeReplaceConfigurationRequest();
            request.bdsInstanceId = bdsInstanceId;
            request.nodeReplaceConfigurationId = nodeReplaceConfigurationId;
            request.updateNodeReplaceConfigurationDetails = updateNodeReplaceConfigurationDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new UpdateNodeReplaceConfigurationRequest(bdsInstanceId, nodeReplaceConfigurationId,
            // updateNodeReplaceConfigurationDetails, opcRequestId, ifMatch, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bdsInstanceId(bdsInstanceId)
                .nodeReplaceConfigurationId(nodeReplaceConfigurationId)
                .updateNodeReplaceConfigurationDetails(updateNodeReplaceConfigurationDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
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
        sb.append(",bdsInstanceId=").append(String.valueOf(this.bdsInstanceId));
        sb.append(",nodeReplaceConfigurationId=")
                .append(String.valueOf(this.nodeReplaceConfigurationId));
        sb.append(",updateNodeReplaceConfigurationDetails=")
                .append(String.valueOf(this.updateNodeReplaceConfigurationDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateNodeReplaceConfigurationRequest)) {
            return false;
        }

        UpdateNodeReplaceConfigurationRequest other = (UpdateNodeReplaceConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.bdsInstanceId, other.bdsInstanceId)
                && java.util.Objects.equals(
                        this.nodeReplaceConfigurationId, other.nodeReplaceConfigurationId)
                && java.util.Objects.equals(
                        this.updateNodeReplaceConfigurationDetails,
                        other.updateNodeReplaceConfigurationDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bdsInstanceId == null ? 43 : this.bdsInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeReplaceConfigurationId == null
                                ? 43
                                : this.nodeReplaceConfigurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateNodeReplaceConfigurationDetails == null
                                ? 43
                                : this.updateNodeReplaceConfigurationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
