/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.requests;

import com.oracle.bmc.apmtraces.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/GetLogExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetLogRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GetLogRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The APM Domain ID for the intended request. */
    private String apmDomainId;

    /** The APM Domain ID for the intended request. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /** Log key. */
    private String logKey;

    /** Log key. */
    public String getLogKey() {
        return logKey;
    }
    /** Include logs with log time equal to or greater than this value. */
    private java.util.Date timeLogStartedGreaterThanOrEqualTo;

    /** Include logs with log time equal to or greater than this value. */
    public java.util.Date getTimeLogStartedGreaterThanOrEqualTo() {
        return timeLogStartedGreaterThanOrEqualTo;
    }
    /** Include logs with log time less than this value. */
    private java.util.Date timeLogEndedLessThan;

    /** Include logs with log time less than this value. */
    public java.util.Date getTimeLogEndedLessThan() {
        return timeLogEndedLessThan;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<GetLogRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The APM Domain ID for the intended request. */
        private String apmDomainId = null;

        /**
         * The APM Domain ID for the intended request.
         *
         * @param apmDomainId the value to set
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        /** Log key. */
        private String logKey = null;

        /**
         * Log key.
         *
         * @param logKey the value to set
         * @return this builder instance
         */
        public Builder logKey(String logKey) {
            this.logKey = logKey;
            return this;
        }

        /** Include logs with log time equal to or greater than this value. */
        private java.util.Date timeLogStartedGreaterThanOrEqualTo = null;

        /**
         * Include logs with log time equal to or greater than this value.
         *
         * @param timeLogStartedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeLogStartedGreaterThanOrEqualTo(
                java.util.Date timeLogStartedGreaterThanOrEqualTo) {
            this.timeLogStartedGreaterThanOrEqualTo = timeLogStartedGreaterThanOrEqualTo;
            return this;
        }

        /** Include logs with log time less than this value. */
        private java.util.Date timeLogEndedLessThan = null;

        /**
         * Include logs with log time less than this value.
         *
         * @param timeLogEndedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeLogEndedLessThan(java.util.Date timeLogEndedLessThan) {
            this.timeLogEndedLessThan = timeLogEndedLessThan;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(GetLogRequest o) {
            apmDomainId(o.getApmDomainId());
            logKey(o.getLogKey());
            timeLogStartedGreaterThanOrEqualTo(o.getTimeLogStartedGreaterThanOrEqualTo());
            timeLogEndedLessThan(o.getTimeLogEndedLessThan());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetLogRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetLogRequest
         */
        public GetLogRequest build() {
            GetLogRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetLogRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetLogRequest
         */
        public GetLogRequest buildWithoutInvocationCallback() {
            GetLogRequest request = new GetLogRequest();
            request.apmDomainId = apmDomainId;
            request.logKey = logKey;
            request.timeLogStartedGreaterThanOrEqualTo = timeLogStartedGreaterThanOrEqualTo;
            request.timeLogEndedLessThan = timeLogEndedLessThan;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new GetLogRequest(apmDomainId, logKey, timeLogStartedGreaterThanOrEqualTo,
            // timeLogEndedLessThan, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .logKey(logKey)
                .timeLogStartedGreaterThanOrEqualTo(timeLogStartedGreaterThanOrEqualTo)
                .timeLogEndedLessThan(timeLogEndedLessThan)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",logKey=").append(String.valueOf(this.logKey));
        sb.append(",timeLogStartedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeLogStartedGreaterThanOrEqualTo));
        sb.append(",timeLogEndedLessThan=").append(String.valueOf(this.timeLogEndedLessThan));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetLogRequest)) {
            return false;
        }

        GetLogRequest other = (GetLogRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(this.logKey, other.logKey)
                && java.util.Objects.equals(
                        this.timeLogStartedGreaterThanOrEqualTo,
                        other.timeLogStartedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeLogEndedLessThan, other.timeLogEndedLessThan)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result = (result * PRIME) + (this.logKey == null ? 43 : this.logKey.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLogStartedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeLogStartedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLogEndedLessThan == null
                                ? 43
                                : this.timeLogEndedLessThan.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
