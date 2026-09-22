/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.requests;

import com.oracle.bmc.iot.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/iot/UpdateIotFlowRuntimeFlowsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateIotFlowRuntimeFlowsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
public class UpdateIotFlowRuntimeFlowsRequest extends com.oracle.bmc.requests.BmcRequest<Object> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an IoT flow runtime.
     */
    private String iotFlowRuntimeId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an IoT flow runtime.
     */
    public String getIotFlowRuntimeId() {
        return iotFlowRuntimeId;
    }
    /**
     * The opaque flows document for the IoT flow runtime.
     */
    private Object flowsDocument;

    /**
     * The opaque flows document for the IoT flow runtime.
     */
    public Object getFlowsDocument() {
        return flowsDocument;
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
     * Unique Oracle-assigned identifier for the request.
     * If you need to contact Oracle about a particular request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request.
     * If you need to contact Oracle about a particular request, provide the request ID.
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
    public Object getBody$() {
        return flowsDocument;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateIotFlowRuntimeFlowsRequest, Object> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an IoT flow runtime.
         */
        private String iotFlowRuntimeId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an IoT flow runtime.
         * @param iotFlowRuntimeId the value to set
         * @return this builder instance
         */
        public Builder iotFlowRuntimeId(String iotFlowRuntimeId) {
            this.iotFlowRuntimeId = iotFlowRuntimeId;
            return this;
        }

        /**
         * The opaque flows document for the IoT flow runtime.
         */
        private Object flowsDocument = null;

        /**
         * The opaque flows document for the IoT flow runtime.
         * @param flowsDocument the value to set
         * @return this builder instance
         */
        public Builder flowsDocument(Object flowsDocument) {
            this.flowsDocument = flowsDocument;
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
         * Unique Oracle-assigned identifier for the request.
         * If you need to contact Oracle about a particular request, provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request.
         * If you need to contact Oracle about a particular request, provide the request ID.
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
        public Builder copy(UpdateIotFlowRuntimeFlowsRequest o) {
            iotFlowRuntimeId(o.getIotFlowRuntimeId());
            flowsDocument(o.getFlowsDocument());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateIotFlowRuntimeFlowsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateIotFlowRuntimeFlowsRequest
         */
        public UpdateIotFlowRuntimeFlowsRequest build() {
            UpdateIotFlowRuntimeFlowsRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(Object body) {
            flowsDocument(body);
            return this;
        }

        /**
         * Build the instance of UpdateIotFlowRuntimeFlowsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateIotFlowRuntimeFlowsRequest
         */
        public UpdateIotFlowRuntimeFlowsRequest buildWithoutInvocationCallback() {
            UpdateIotFlowRuntimeFlowsRequest request = new UpdateIotFlowRuntimeFlowsRequest();
            request.iotFlowRuntimeId = iotFlowRuntimeId;
            request.flowsDocument = flowsDocument;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateIotFlowRuntimeFlowsRequest(iotFlowRuntimeId, flowsDocument, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .iotFlowRuntimeId(iotFlowRuntimeId)
                .flowsDocument(flowsDocument)
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
        sb.append(",iotFlowRuntimeId=").append(String.valueOf(this.iotFlowRuntimeId));
        sb.append(",flowsDocument=").append(String.valueOf(this.flowsDocument));
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
        if (!(o instanceof UpdateIotFlowRuntimeFlowsRequest)) {
            return false;
        }

        UpdateIotFlowRuntimeFlowsRequest other = (UpdateIotFlowRuntimeFlowsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.iotFlowRuntimeId, other.iotFlowRuntimeId)
                && java.util.Objects.equals(this.flowsDocument, other.flowsDocument)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.iotFlowRuntimeId == null ? 43 : this.iotFlowRuntimeId.hashCode());
        result =
                (result * PRIME)
                        + (this.flowsDocument == null ? 43 : this.flowsDocument.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
