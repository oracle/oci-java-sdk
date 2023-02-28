/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetConsoleHistoryContentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetConsoleHistoryContentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetConsoleHistoryContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the console history. */
    private String instanceConsoleHistoryId;

    /** The OCID of the console history. */
    public String getInstanceConsoleHistoryId() {
        return instanceConsoleHistoryId;
    }
    /** Offset of the snapshot data to retrieve. */
    private Integer offset;

    /** Offset of the snapshot data to retrieve. */
    public Integer getOffset() {
        return offset;
    }
    /** Length of the snapshot data to retrieve. */
    private Integer length;

    /** Length of the snapshot data to retrieve. */
    public Integer getLength() {
        return length;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetConsoleHistoryContentRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the console history. */
        private String instanceConsoleHistoryId = null;

        /**
         * The OCID of the console history.
         *
         * @param instanceConsoleHistoryId the value to set
         * @return this builder instance
         */
        public Builder instanceConsoleHistoryId(String instanceConsoleHistoryId) {
            this.instanceConsoleHistoryId = instanceConsoleHistoryId;
            return this;
        }

        /** Offset of the snapshot data to retrieve. */
        private Integer offset = null;

        /**
         * Offset of the snapshot data to retrieve.
         *
         * @param offset the value to set
         * @return this builder instance
         */
        public Builder offset(Integer offset) {
            this.offset = offset;
            return this;
        }

        /** Length of the snapshot data to retrieve. */
        private Integer length = null;

        /**
         * Length of the snapshot data to retrieve.
         *
         * @param length the value to set
         * @return this builder instance
         */
        public Builder length(Integer length) {
            this.length = length;
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
        public Builder copy(GetConsoleHistoryContentRequest o) {
            instanceConsoleHistoryId(o.getInstanceConsoleHistoryId());
            offset(o.getOffset());
            length(o.getLength());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetConsoleHistoryContentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetConsoleHistoryContentRequest
         */
        public GetConsoleHistoryContentRequest build() {
            GetConsoleHistoryContentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetConsoleHistoryContentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetConsoleHistoryContentRequest
         */
        public GetConsoleHistoryContentRequest buildWithoutInvocationCallback() {
            GetConsoleHistoryContentRequest request = new GetConsoleHistoryContentRequest();
            request.instanceConsoleHistoryId = instanceConsoleHistoryId;
            request.offset = offset;
            request.length = length;
            return request;
            // new GetConsoleHistoryContentRequest(instanceConsoleHistoryId, offset, length);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .instanceConsoleHistoryId(instanceConsoleHistoryId)
                .offset(offset)
                .length(length);
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
        sb.append(",instanceConsoleHistoryId=")
                .append(String.valueOf(this.instanceConsoleHistoryId));
        sb.append(",offset=").append(String.valueOf(this.offset));
        sb.append(",length=").append(String.valueOf(this.length));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetConsoleHistoryContentRequest)) {
            return false;
        }

        GetConsoleHistoryContentRequest other = (GetConsoleHistoryContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.instanceConsoleHistoryId, other.instanceConsoleHistoryId)
                && java.util.Objects.equals(this.offset, other.offset)
                && java.util.Objects.equals(this.length, other.length);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.instanceConsoleHistoryId == null
                                ? 43
                                : this.instanceConsoleHistoryId.hashCode());
        result = (result * PRIME) + (this.offset == null ? 43 : this.offset.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        return result;
    }
}
