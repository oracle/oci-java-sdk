/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.requests;

import com.oracle.bmc.desktops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/desktops/DeleteDesktopPoolExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteDesktopPoolRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
public class DeleteDesktopPoolRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the desktop pool. */
    private String desktopPoolId;

    /** The OCID of the desktop pool. */
    public String getDesktopPoolId() {
        return desktopPoolId;
    }
    /** The unique identifier of the request. */
    private String opcRequestId;

    /** The unique identifier of the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** For optimistic concurrency control. */
    private String ifMatch;

    /** For optimistic concurrency control. */
    public String getIfMatch() {
        return ifMatch;
    }
    /** Whether the volumes are preserved when a desktop pool is deleted. */
    private Boolean areVolumesPreserved;

    /** Whether the volumes are preserved when a desktop pool is deleted. */
    public Boolean getAreVolumesPreserved() {
        return areVolumesPreserved;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteDesktopPoolRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the desktop pool. */
        private String desktopPoolId = null;

        /**
         * The OCID of the desktop pool.
         *
         * @param desktopPoolId the value to set
         * @return this builder instance
         */
        public Builder desktopPoolId(String desktopPoolId) {
            this.desktopPoolId = desktopPoolId;
            return this;
        }

        /** The unique identifier of the request. */
        private String opcRequestId = null;

        /**
         * The unique identifier of the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** For optimistic concurrency control. */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** Whether the volumes are preserved when a desktop pool is deleted. */
        private Boolean areVolumesPreserved = null;

        /**
         * Whether the volumes are preserved when a desktop pool is deleted.
         *
         * @param areVolumesPreserved the value to set
         * @return this builder instance
         */
        public Builder areVolumesPreserved(Boolean areVolumesPreserved) {
            this.areVolumesPreserved = areVolumesPreserved;
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
        public Builder copy(DeleteDesktopPoolRequest o) {
            desktopPoolId(o.getDesktopPoolId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            areVolumesPreserved(o.getAreVolumesPreserved());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteDesktopPoolRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteDesktopPoolRequest
         */
        public DeleteDesktopPoolRequest build() {
            DeleteDesktopPoolRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteDesktopPoolRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteDesktopPoolRequest
         */
        public DeleteDesktopPoolRequest buildWithoutInvocationCallback() {
            DeleteDesktopPoolRequest request = new DeleteDesktopPoolRequest();
            request.desktopPoolId = desktopPoolId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.areVolumesPreserved = areVolumesPreserved;
            return request;
            // new DeleteDesktopPoolRequest(desktopPoolId, opcRequestId, ifMatch,
            // areVolumesPreserved);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .desktopPoolId(desktopPoolId)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .areVolumesPreserved(areVolumesPreserved);
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
        sb.append(",desktopPoolId=").append(String.valueOf(this.desktopPoolId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",areVolumesPreserved=").append(String.valueOf(this.areVolumesPreserved));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteDesktopPoolRequest)) {
            return false;
        }

        DeleteDesktopPoolRequest other = (DeleteDesktopPoolRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.desktopPoolId, other.desktopPoolId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.areVolumesPreserved, other.areVolumesPreserved);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.desktopPoolId == null ? 43 : this.desktopPoolId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.areVolumesPreserved == null
                                ? 43
                                : this.areVolumesPreserved.hashCode());
        return result;
    }
}
