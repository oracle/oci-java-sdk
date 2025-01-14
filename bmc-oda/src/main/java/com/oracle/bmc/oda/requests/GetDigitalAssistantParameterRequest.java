/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/GetDigitalAssistantParameterExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetDigitalAssistantParameterRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class GetDigitalAssistantParameterRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Digital Assistant instance identifier. */
    private String odaInstanceId;

    /** Unique Digital Assistant instance identifier. */
    public String getOdaInstanceId() {
        return odaInstanceId;
    }
    /** Unique Digital Assistant identifier. */
    private String digitalAssistantId;

    /** Unique Digital Assistant identifier. */
    public String getDigitalAssistantId() {
        return digitalAssistantId;
    }
    /** The name of a Digital Assistant Parameter. This is unique with the Digital Assistant. */
    private String parameterName;

    /** The name of a Digital Assistant Parameter. This is unique with the Digital Assistant. */
    public String getParameterName() {
        return parameterName;
    }
    /**
     * The If-None-Match HTTP request header makes the request conditional. For GET methods, the
     * service will return the requested resource, with a 200 status, only if it doesn't have an
     * ETag matching the given ones. When the condition fails for GET methods, then the service will
     * return HTTP status code 304 (Not Modified).
     */
    private String ifNoneMatch;

    /**
     * The If-None-Match HTTP request header makes the request conditional. For GET methods, the
     * service will return the requested resource, with a 200 status, only if it doesn't have an
     * ETag matching the given ones. When the condition fails for GET methods, then the service will
     * return HTTP status code 304 (Not Modified).
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }
    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDigitalAssistantParameterRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Digital Assistant instance identifier. */
        private String odaInstanceId = null;

        /**
         * Unique Digital Assistant instance identifier.
         *
         * @param odaInstanceId the value to set
         * @return this builder instance
         */
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            return this;
        }

        /** Unique Digital Assistant identifier. */
        private String digitalAssistantId = null;

        /**
         * Unique Digital Assistant identifier.
         *
         * @param digitalAssistantId the value to set
         * @return this builder instance
         */
        public Builder digitalAssistantId(String digitalAssistantId) {
            this.digitalAssistantId = digitalAssistantId;
            return this;
        }

        /** The name of a Digital Assistant Parameter. This is unique with the Digital Assistant. */
        private String parameterName = null;

        /**
         * The name of a Digital Assistant Parameter. This is unique with the Digital Assistant.
         *
         * @param parameterName the value to set
         * @return this builder instance
         */
        public Builder parameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }

        /**
         * The If-None-Match HTTP request header makes the request conditional. For GET methods, the
         * service will return the requested resource, with a 200 status, only if it doesn't have an
         * ETag matching the given ones. When the condition fails for GET methods, then the service
         * will return HTTP status code 304 (Not Modified).
         */
        private String ifNoneMatch = null;

        /**
         * The If-None-Match HTTP request header makes the request conditional. For GET methods, the
         * service will return the requested resource, with a 200 status, only if it doesn't have an
         * ETag matching the given ones. When the condition fails for GET methods, then the service
         * will return HTTP status code 304 (Not Modified).
         *
         * @param ifNoneMatch the value to set
         * @return this builder instance
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
            return this;
        }

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
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
        public Builder copy(GetDigitalAssistantParameterRequest o) {
            odaInstanceId(o.getOdaInstanceId());
            digitalAssistantId(o.getDigitalAssistantId());
            parameterName(o.getParameterName());
            ifNoneMatch(o.getIfNoneMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDigitalAssistantParameterRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDigitalAssistantParameterRequest
         */
        public GetDigitalAssistantParameterRequest build() {
            GetDigitalAssistantParameterRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDigitalAssistantParameterRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDigitalAssistantParameterRequest
         */
        public GetDigitalAssistantParameterRequest buildWithoutInvocationCallback() {
            GetDigitalAssistantParameterRequest request = new GetDigitalAssistantParameterRequest();
            request.odaInstanceId = odaInstanceId;
            request.digitalAssistantId = digitalAssistantId;
            request.parameterName = parameterName;
            request.ifNoneMatch = ifNoneMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetDigitalAssistantParameterRequest(odaInstanceId, digitalAssistantId,
            // parameterName, ifNoneMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .odaInstanceId(odaInstanceId)
                .digitalAssistantId(digitalAssistantId)
                .parameterName(parameterName)
                .ifNoneMatch(ifNoneMatch)
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
        sb.append(",odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(",digitalAssistantId=").append(String.valueOf(this.digitalAssistantId));
        sb.append(",parameterName=").append(String.valueOf(this.parameterName));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDigitalAssistantParameterRequest)) {
            return false;
        }

        GetDigitalAssistantParameterRequest other = (GetDigitalAssistantParameterRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.digitalAssistantId, other.digitalAssistantId)
                && java.util.Objects.equals(this.parameterName, other.parameterName)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.odaInstanceId == null ? 43 : this.odaInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.digitalAssistantId == null
                                ? 43
                                : this.digitalAssistantId.hashCode());
        result =
                (result * PRIME)
                        + (this.parameterName == null ? 43 : this.parameterName.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
