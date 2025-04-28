/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetPeerTargetDatabaseExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetPeerTargetDatabaseRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetPeerTargetDatabaseRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the Data Safe target database. */
    private String targetDatabaseId;

    /** The OCID of the Data Safe target database. */
    public String getTargetDatabaseId() {
        return targetDatabaseId;
    }
    /** The unique id of the peer target database. */
    private Integer peerTargetDatabaseId;

    /** The unique id of the peer target database. */
    public Integer getPeerTargetDatabaseId() {
        return peerTargetDatabaseId;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetPeerTargetDatabaseRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the Data Safe target database. */
        private String targetDatabaseId = null;

        /**
         * The OCID of the Data Safe target database.
         *
         * @param targetDatabaseId the value to set
         * @return this builder instance
         */
        public Builder targetDatabaseId(String targetDatabaseId) {
            this.targetDatabaseId = targetDatabaseId;
            return this;
        }

        /** The unique id of the peer target database. */
        private Integer peerTargetDatabaseId = null;

        /**
         * The unique id of the peer target database.
         *
         * @param peerTargetDatabaseId the value to set
         * @return this builder instance
         */
        public Builder peerTargetDatabaseId(Integer peerTargetDatabaseId) {
            this.peerTargetDatabaseId = peerTargetDatabaseId;
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
        public Builder copy(GetPeerTargetDatabaseRequest o) {
            targetDatabaseId(o.getTargetDatabaseId());
            peerTargetDatabaseId(o.getPeerTargetDatabaseId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetPeerTargetDatabaseRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetPeerTargetDatabaseRequest
         */
        public GetPeerTargetDatabaseRequest build() {
            GetPeerTargetDatabaseRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetPeerTargetDatabaseRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetPeerTargetDatabaseRequest
         */
        public GetPeerTargetDatabaseRequest buildWithoutInvocationCallback() {
            GetPeerTargetDatabaseRequest request = new GetPeerTargetDatabaseRequest();
            request.targetDatabaseId = targetDatabaseId;
            request.peerTargetDatabaseId = peerTargetDatabaseId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetPeerTargetDatabaseRequest(targetDatabaseId, peerTargetDatabaseId,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .targetDatabaseId(targetDatabaseId)
                .peerTargetDatabaseId(peerTargetDatabaseId)
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
        sb.append(",targetDatabaseId=").append(String.valueOf(this.targetDatabaseId));
        sb.append(",peerTargetDatabaseId=").append(String.valueOf(this.peerTargetDatabaseId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetPeerTargetDatabaseRequest)) {
            return false;
        }

        GetPeerTargetDatabaseRequest other = (GetPeerTargetDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.targetDatabaseId, other.targetDatabaseId)
                && java.util.Objects.equals(this.peerTargetDatabaseId, other.peerTargetDatabaseId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.targetDatabaseId == null ? 43 : this.targetDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerTargetDatabaseId == null
                                ? 43
                                : this.peerTargetDatabaseId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
