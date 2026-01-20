/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetSecurityPolicyEntryStateExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetSecurityPolicyEntryStateRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetSecurityPolicyEntryStateRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the security policy deployment resource. */
    private String securityPolicyDeploymentId;

    /** The OCID of the security policy deployment resource. */
    public String getSecurityPolicyDeploymentId() {
        return securityPolicyDeploymentId;
    }
    /**
     * Unique security policy entry state identifier. The unique id for a given security policy
     * entry state can be obtained from the list api by passing the OCID of the corresponding
     * security policy deployment resource as the query parameter.
     */
    private String securityPolicyEntryStateId;

    /**
     * Unique security policy entry state identifier. The unique id for a given security policy
     * entry state can be obtained from the list api by passing the OCID of the corresponding
     * security policy deployment resource as the query parameter.
     */
    public String getSecurityPolicyEntryStateId() {
        return securityPolicyEntryStateId;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetSecurityPolicyEntryStateRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the security policy deployment resource. */
        private String securityPolicyDeploymentId = null;

        /**
         * The OCID of the security policy deployment resource.
         *
         * @param securityPolicyDeploymentId the value to set
         * @return this builder instance
         */
        public Builder securityPolicyDeploymentId(String securityPolicyDeploymentId) {
            this.securityPolicyDeploymentId = securityPolicyDeploymentId;
            return this;
        }

        /**
         * Unique security policy entry state identifier. The unique id for a given security policy
         * entry state can be obtained from the list api by passing the OCID of the corresponding
         * security policy deployment resource as the query parameter.
         */
        private String securityPolicyEntryStateId = null;

        /**
         * Unique security policy entry state identifier. The unique id for a given security policy
         * entry state can be obtained from the list api by passing the OCID of the corresponding
         * security policy deployment resource as the query parameter.
         *
         * @param securityPolicyEntryStateId the value to set
         * @return this builder instance
         */
        public Builder securityPolicyEntryStateId(String securityPolicyEntryStateId) {
            this.securityPolicyEntryStateId = securityPolicyEntryStateId;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(GetSecurityPolicyEntryStateRequest o) {
            securityPolicyDeploymentId(o.getSecurityPolicyDeploymentId());
            securityPolicyEntryStateId(o.getSecurityPolicyEntryStateId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetSecurityPolicyEntryStateRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetSecurityPolicyEntryStateRequest
         */
        public GetSecurityPolicyEntryStateRequest build() {
            GetSecurityPolicyEntryStateRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetSecurityPolicyEntryStateRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetSecurityPolicyEntryStateRequest
         */
        public GetSecurityPolicyEntryStateRequest buildWithoutInvocationCallback() {
            GetSecurityPolicyEntryStateRequest request = new GetSecurityPolicyEntryStateRequest();
            request.securityPolicyDeploymentId = securityPolicyDeploymentId;
            request.securityPolicyEntryStateId = securityPolicyEntryStateId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetSecurityPolicyEntryStateRequest(securityPolicyDeploymentId,
            // securityPolicyEntryStateId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .securityPolicyDeploymentId(securityPolicyDeploymentId)
                .securityPolicyEntryStateId(securityPolicyEntryStateId)
                .opcRequestId(opcRequestId);
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
        sb.append(",securityPolicyDeploymentId=")
                .append(String.valueOf(this.securityPolicyDeploymentId));
        sb.append(",securityPolicyEntryStateId=")
                .append(String.valueOf(this.securityPolicyEntryStateId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSecurityPolicyEntryStateRequest)) {
            return false;
        }

        GetSecurityPolicyEntryStateRequest other = (GetSecurityPolicyEntryStateRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.securityPolicyDeploymentId, other.securityPolicyDeploymentId)
                && java.util.Objects.equals(
                        this.securityPolicyEntryStateId, other.securityPolicyEntryStateId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.securityPolicyDeploymentId == null
                                ? 43
                                : this.securityPolicyDeploymentId.hashCode());
        result =
                (result * PRIME)
                        + (this.securityPolicyEntryStateId == null
                                ? 43
                                : this.securityPolicyEntryStateId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
