/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/GetModuleStreamProfileExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetModuleStreamProfileRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class GetModuleStreamProfileRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the software source.
     */
    private String softwareSourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the software source.
     */
    public String getSoftwareSourceId() {
        return softwareSourceId;
    }
    /**
     * The name of the module stream profile.
     */
    private String profileName;

    /**
     * The name of the module stream profile.
     */
    public String getProfileName() {
        return profileName;
    }
    /**
     * The name of a module.
     *
     */
    private String moduleName;

    /**
     * The name of a module.
     *
     */
    public String getModuleName() {
        return moduleName;
    }
    /**
     * The name of the stream of the containing module.
     *
     */
    private String streamName;

    /**
     * The name of the stream of the containing module.
     *
     */
    public String getStreamName() {
        return streamName;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetModuleStreamProfileRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the software source.
         */
        private String softwareSourceId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the software source.
         * @param softwareSourceId the value to set
         * @return this builder instance
         */
        public Builder softwareSourceId(String softwareSourceId) {
            this.softwareSourceId = softwareSourceId;
            return this;
        }

        /**
         * The name of the module stream profile.
         */
        private String profileName = null;

        /**
         * The name of the module stream profile.
         * @param profileName the value to set
         * @return this builder instance
         */
        public Builder profileName(String profileName) {
            this.profileName = profileName;
            return this;
        }

        /**
         * The name of a module.
         *
         */
        private String moduleName = null;

        /**
         * The name of a module.
         *
         * @param moduleName the value to set
         * @return this builder instance
         */
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        /**
         * The name of the stream of the containing module.
         *
         */
        private String streamName = null;

        /**
         * The name of the stream of the containing module.
         *
         * @param streamName the value to set
         * @return this builder instance
         */
        public Builder streamName(String streamName) {
            this.streamName = streamName;
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
        public Builder copy(GetModuleStreamProfileRequest o) {
            softwareSourceId(o.getSoftwareSourceId());
            profileName(o.getProfileName());
            moduleName(o.getModuleName());
            streamName(o.getStreamName());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetModuleStreamProfileRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetModuleStreamProfileRequest
         */
        public GetModuleStreamProfileRequest build() {
            GetModuleStreamProfileRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetModuleStreamProfileRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetModuleStreamProfileRequest
         */
        public GetModuleStreamProfileRequest buildWithoutInvocationCallback() {
            GetModuleStreamProfileRequest request = new GetModuleStreamProfileRequest();
            request.softwareSourceId = softwareSourceId;
            request.profileName = profileName;
            request.moduleName = moduleName;
            request.streamName = streamName;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetModuleStreamProfileRequest(softwareSourceId, profileName, moduleName, streamName, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .softwareSourceId(softwareSourceId)
                .profileName(profileName)
                .moduleName(moduleName)
                .streamName(streamName)
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
        sb.append(",softwareSourceId=").append(String.valueOf(this.softwareSourceId));
        sb.append(",profileName=").append(String.valueOf(this.profileName));
        sb.append(",moduleName=").append(String.valueOf(this.moduleName));
        sb.append(",streamName=").append(String.valueOf(this.streamName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetModuleStreamProfileRequest)) {
            return false;
        }

        GetModuleStreamProfileRequest other = (GetModuleStreamProfileRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.softwareSourceId, other.softwareSourceId)
                && java.util.Objects.equals(this.profileName, other.profileName)
                && java.util.Objects.equals(this.moduleName, other.moduleName)
                && java.util.Objects.equals(this.streamName, other.streamName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.softwareSourceId == null ? 43 : this.softwareSourceId.hashCode());
        result = (result * PRIME) + (this.profileName == null ? 43 : this.profileName.hashCode());
        result = (result * PRIME) + (this.moduleName == null ? 43 : this.moduleName.hashCode());
        result = (result * PRIME) + (this.streamName == null ? 43 : this.streamName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
