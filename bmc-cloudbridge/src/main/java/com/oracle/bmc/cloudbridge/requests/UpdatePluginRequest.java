/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.requests;

import com.oracle.bmc.cloudbridge.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudbridge/UpdatePluginExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdatePluginRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public class UpdatePluginRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.cloudbridge.model.UpdatePluginDetails> {

    /**
     * Unique Agent identifier path parameter.
     */
    private String agentId;

    /**
     * Unique Agent identifier path parameter.
     */
    public String getAgentId() {
        return agentId;
    }
    /**
     * Unique plugin identifier path parameter.
     */
    private String pluginName;

    /**
     * Unique plugin identifier path parameter.
     */
    public String getPluginName() {
        return pluginName;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.cloudbridge.model.UpdatePluginDetails updatePluginDetails;

    /**
     * The information to be updated.
     */
    public com.oracle.bmc.cloudbridge.model.UpdatePluginDetails getUpdatePluginDetails() {
        return updatePluginDetails;
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
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
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
    public com.oracle.bmc.cloudbridge.model.UpdatePluginDetails getBody$() {
        return updatePluginDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePluginRequest, com.oracle.bmc.cloudbridge.model.UpdatePluginDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Agent identifier path parameter.
         */
        private String agentId = null;

        /**
         * Unique Agent identifier path parameter.
         * @param agentId the value to set
         * @return this builder instance
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * Unique plugin identifier path parameter.
         */
        private String pluginName = null;

        /**
         * Unique plugin identifier path parameter.
         * @param pluginName the value to set
         * @return this builder instance
         */
        public Builder pluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }

        /**
         * The information to be updated.
         */
        private com.oracle.bmc.cloudbridge.model.UpdatePluginDetails updatePluginDetails = null;

        /**
         * The information to be updated.
         * @param updatePluginDetails the value to set
         * @return this builder instance
         */
        public Builder updatePluginDetails(
                com.oracle.bmc.cloudbridge.model.UpdatePluginDetails updatePluginDetails) {
            this.updatePluginDetails = updatePluginDetails;
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
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(UpdatePluginRequest o) {
            agentId(o.getAgentId());
            pluginName(o.getPluginName());
            updatePluginDetails(o.getUpdatePluginDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePluginRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdatePluginRequest
         */
        public UpdatePluginRequest build() {
            UpdatePluginRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.cloudbridge.model.UpdatePluginDetails body) {
            updatePluginDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePluginRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePluginRequest
         */
        public UpdatePluginRequest buildWithoutInvocationCallback() {
            UpdatePluginRequest request = new UpdatePluginRequest();
            request.agentId = agentId;
            request.pluginName = pluginName;
            request.updatePluginDetails = updatePluginDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdatePluginRequest(agentId, pluginName, updatePluginDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .agentId(agentId)
                .pluginName(pluginName)
                .updatePluginDetails(updatePluginDetails)
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
        sb.append(",agentId=").append(String.valueOf(this.agentId));
        sb.append(",pluginName=").append(String.valueOf(this.pluginName));
        sb.append(",updatePluginDetails=").append(String.valueOf(this.updatePluginDetails));
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
        if (!(o instanceof UpdatePluginRequest)) {
            return false;
        }

        UpdatePluginRequest other = (UpdatePluginRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(this.pluginName, other.pluginName)
                && java.util.Objects.equals(this.updatePluginDetails, other.updatePluginDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result = (result * PRIME) + (this.pluginName == null ? 43 : this.pluginName.hashCode());
        result =
                (result * PRIME)
                        + (this.updatePluginDetails == null
                                ? 43
                                : this.updatePluginDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
