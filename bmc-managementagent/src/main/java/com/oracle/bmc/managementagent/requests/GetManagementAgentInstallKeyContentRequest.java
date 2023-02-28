/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.requests;

import com.oracle.bmc.managementagent.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/GetManagementAgentInstallKeyContentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetManagementAgentInstallKeyContentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public class GetManagementAgentInstallKeyContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Management Agent Install Key identifier */
    private String managementAgentInstallKeyId;

    /** Unique Management Agent Install Key identifier */
    public String getManagementAgentInstallKeyId() {
        return managementAgentInstallKeyId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** Filter to return input plugin names uncommented in the output. */
    private java.util.List<String> pluginName;

    /** Filter to return input plugin names uncommented in the output. */
    public java.util.List<String> getPluginName() {
        return pluginName;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetManagementAgentInstallKeyContentRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Management Agent Install Key identifier */
        private String managementAgentInstallKeyId = null;

        /**
         * Unique Management Agent Install Key identifier
         *
         * @param managementAgentInstallKeyId the value to set
         * @return this builder instance
         */
        public Builder managementAgentInstallKeyId(String managementAgentInstallKeyId) {
            this.managementAgentInstallKeyId = managementAgentInstallKeyId;
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

        /** Filter to return input plugin names uncommented in the output. */
        private java.util.List<String> pluginName = null;

        /**
         * Filter to return input plugin names uncommented in the output.
         *
         * @param pluginName the value to set
         * @return this builder instance
         */
        public Builder pluginName(java.util.List<String> pluginName) {
            this.pluginName = pluginName;
            return this;
        }

        /**
         * Singular setter. Filter to return input plugin names uncommented in the output.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder pluginName(String singularValue) {
            return this.pluginName(java.util.Arrays.asList(singularValue));
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
        public Builder copy(GetManagementAgentInstallKeyContentRequest o) {
            managementAgentInstallKeyId(o.getManagementAgentInstallKeyId());
            opcRequestId(o.getOpcRequestId());
            pluginName(o.getPluginName());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetManagementAgentInstallKeyContentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetManagementAgentInstallKeyContentRequest
         */
        public GetManagementAgentInstallKeyContentRequest build() {
            GetManagementAgentInstallKeyContentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetManagementAgentInstallKeyContentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetManagementAgentInstallKeyContentRequest
         */
        public GetManagementAgentInstallKeyContentRequest buildWithoutInvocationCallback() {
            GetManagementAgentInstallKeyContentRequest request =
                    new GetManagementAgentInstallKeyContentRequest();
            request.managementAgentInstallKeyId = managementAgentInstallKeyId;
            request.opcRequestId = opcRequestId;
            request.pluginName = pluginName;
            return request;
            // new GetManagementAgentInstallKeyContentRequest(managementAgentInstallKeyId,
            // opcRequestId, pluginName);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managementAgentInstallKeyId(managementAgentInstallKeyId)
                .opcRequestId(opcRequestId)
                .pluginName(pluginName);
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
        sb.append(",managementAgentInstallKeyId=")
                .append(String.valueOf(this.managementAgentInstallKeyId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",pluginName=").append(String.valueOf(this.pluginName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetManagementAgentInstallKeyContentRequest)) {
            return false;
        }

        GetManagementAgentInstallKeyContentRequest other =
                (GetManagementAgentInstallKeyContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.managementAgentInstallKeyId, other.managementAgentInstallKeyId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.pluginName, other.pluginName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managementAgentInstallKeyId == null
                                ? 43
                                : this.managementAgentInstallKeyId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.pluginName == null ? 43 : this.pluginName.hashCode());
        return result;
    }
}
