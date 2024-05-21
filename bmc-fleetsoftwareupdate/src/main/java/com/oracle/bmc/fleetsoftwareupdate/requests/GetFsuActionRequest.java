/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.requests;

import com.oracle.bmc.fleetsoftwareupdate.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/GetFsuActionExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetFsuActionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public class GetFsuActionRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Exadata Fleet Update Action identifier.
     *
     */
    private String fsuActionId;

    /**
     * Unique Exadata Fleet Update Action identifier.
     *
     */
    public String getFsuActionId() {
        return fsuActionId;
    }
    /**
     * The client request ID for tracing.
     *
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetFsuActionRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Exadata Fleet Update Action identifier.
         *
         */
        private String fsuActionId = null;

        /**
         * Unique Exadata Fleet Update Action identifier.
         *
         * @param fsuActionId the value to set
         * @return this builder instance
         */
        public Builder fsuActionId(String fsuActionId) {
            this.fsuActionId = fsuActionId;
            return this;
        }

        /**
         * The client request ID for tracing.
         *
         */
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
        public Builder copy(GetFsuActionRequest o) {
            fsuActionId(o.getFsuActionId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetFsuActionRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetFsuActionRequest
         */
        public GetFsuActionRequest build() {
            GetFsuActionRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetFsuActionRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetFsuActionRequest
         */
        public GetFsuActionRequest buildWithoutInvocationCallback() {
            GetFsuActionRequest request = new GetFsuActionRequest();
            request.fsuActionId = fsuActionId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetFsuActionRequest(fsuActionId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().fsuActionId(fsuActionId).opcRequestId(opcRequestId);
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
        sb.append(",fsuActionId=").append(String.valueOf(this.fsuActionId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetFsuActionRequest)) {
            return false;
        }

        GetFsuActionRequest other = (GetFsuActionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fsuActionId, other.fsuActionId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fsuActionId == null ? 43 : this.fsuActionId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
