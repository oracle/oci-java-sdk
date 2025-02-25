/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/GetWindowsUpdateExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetWindowsUpdateRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class GetWindowsUpdateRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The unique identifier for the Windows update. Note that this is not an OCID, but is a unique identifier assigned by Microsoft.
     * Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
     *
     */
    private String windowsUpdateId;

    /**
     * The unique identifier for the Windows update. Note that this is not an OCID, but is a unique identifier assigned by Microsoft.
     * Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
     *
     */
    public String getWindowsUpdateId() {
        return windowsUpdateId;
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
                    GetWindowsUpdateRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The unique identifier for the Windows update. Note that this is not an OCID, but is a unique identifier assigned by Microsoft.
         * Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
         *
         */
        private String windowsUpdateId = null;

        /**
         * The unique identifier for the Windows update. Note that this is not an OCID, but is a unique identifier assigned by Microsoft.
         * Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
         *
         * @param windowsUpdateId the value to set
         * @return this builder instance
         */
        public Builder windowsUpdateId(String windowsUpdateId) {
            this.windowsUpdateId = windowsUpdateId;
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
        public Builder copy(GetWindowsUpdateRequest o) {
            windowsUpdateId(o.getWindowsUpdateId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetWindowsUpdateRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetWindowsUpdateRequest
         */
        public GetWindowsUpdateRequest build() {
            GetWindowsUpdateRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetWindowsUpdateRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetWindowsUpdateRequest
         */
        public GetWindowsUpdateRequest buildWithoutInvocationCallback() {
            GetWindowsUpdateRequest request = new GetWindowsUpdateRequest();
            request.windowsUpdateId = windowsUpdateId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetWindowsUpdateRequest(windowsUpdateId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().windowsUpdateId(windowsUpdateId).opcRequestId(opcRequestId);
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
        sb.append(",windowsUpdateId=").append(String.valueOf(this.windowsUpdateId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetWindowsUpdateRequest)) {
            return false;
        }

        GetWindowsUpdateRequest other = (GetWindowsUpdateRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.windowsUpdateId, other.windowsUpdateId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.windowsUpdateId == null ? 43 : this.windowsUpdateId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
