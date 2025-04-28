/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetRecalledDataSizeExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetRecalledDataSizeRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class GetRecalledDataSizeRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** This is the start of the time range for recalled data */
    private java.util.Date timeDataStarted;

    /** This is the start of the time range for recalled data */
    public java.util.Date getTimeDataStarted() {
        return timeDataStarted;
    }
    /** This is the end of the time range for recalled data */
    private java.util.Date timeDataEnded;

    /** This is the end of the time range for recalled data */
    public java.util.Date getTimeDataEnded() {
        return timeDataEnded;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetRecalledDataSizeRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Logging Analytics namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
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

        /** This is the start of the time range for recalled data */
        private java.util.Date timeDataStarted = null;

        /**
         * This is the start of the time range for recalled data
         *
         * @param timeDataStarted the value to set
         * @return this builder instance
         */
        public Builder timeDataStarted(java.util.Date timeDataStarted) {
            this.timeDataStarted = timeDataStarted;
            return this;
        }

        /** This is the end of the time range for recalled data */
        private java.util.Date timeDataEnded = null;

        /**
         * This is the end of the time range for recalled data
         *
         * @param timeDataEnded the value to set
         * @return this builder instance
         */
        public Builder timeDataEnded(java.util.Date timeDataEnded) {
            this.timeDataEnded = timeDataEnded;
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
        public Builder copy(GetRecalledDataSizeRequest o) {
            namespaceName(o.getNamespaceName());
            opcRequestId(o.getOpcRequestId());
            timeDataStarted(o.getTimeDataStarted());
            timeDataEnded(o.getTimeDataEnded());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetRecalledDataSizeRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetRecalledDataSizeRequest
         */
        public GetRecalledDataSizeRequest build() {
            GetRecalledDataSizeRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetRecalledDataSizeRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetRecalledDataSizeRequest
         */
        public GetRecalledDataSizeRequest buildWithoutInvocationCallback() {
            GetRecalledDataSizeRequest request = new GetRecalledDataSizeRequest();
            request.namespaceName = namespaceName;
            request.opcRequestId = opcRequestId;
            request.timeDataStarted = timeDataStarted;
            request.timeDataEnded = timeDataEnded;
            return request;
            // new GetRecalledDataSizeRequest(namespaceName, opcRequestId, timeDataStarted,
            // timeDataEnded);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .opcRequestId(opcRequestId)
                .timeDataStarted(timeDataStarted)
                .timeDataEnded(timeDataEnded);
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",timeDataStarted=").append(String.valueOf(this.timeDataStarted));
        sb.append(",timeDataEnded=").append(String.valueOf(this.timeDataEnded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetRecalledDataSizeRequest)) {
            return false;
        }

        GetRecalledDataSizeRequest other = (GetRecalledDataSizeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.timeDataStarted, other.timeDataStarted)
                && java.util.Objects.equals(this.timeDataEnded, other.timeDataEnded);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataStarted == null ? 43 : this.timeDataStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataEnded == null ? 43 : this.timeDataEnded.hashCode());
        return result;
    }
}
