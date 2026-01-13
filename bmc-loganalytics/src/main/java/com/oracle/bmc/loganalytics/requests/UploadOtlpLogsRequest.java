/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UploadOtlpLogsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UploadOtlpLogsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class UploadOtlpLogsRequest extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** The log group OCID to which the log data in this upload will be mapped to. */
    private String opcMetaLoggrpid;

    /** The log group OCID to which the log data in this upload will be mapped to. */
    public String getOpcMetaLoggrpid() {
        return opcMetaLoggrpid;
    }
    /**
     * Accepts log data in OTLP JSON-encoded Protobuf format. Sample format:
     * https://github.com/open-telemetry/opentelemetry-proto/blob/v1.3.1/examples/logs.json
     */
    private java.io.InputStream uploadOtlpLogsDetails;

    /**
     * Accepts log data in OTLP JSON-encoded Protobuf format. Sample format:
     * https://github.com/open-telemetry/opentelemetry-proto/blob/v1.3.1/examples/logs.json
     */
    public java.io.InputStream getUploadOtlpLogsDetails() {
        return uploadOtlpLogsDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The log set that gets associated with the uploaded logs. */
    private String logSet;

    /** The log set that gets associated with the uploaded logs. */
    public String getLogSet() {
        return logSet;
    }
    /** The content type of the log data. */
    private String contentType;

    /** The content type of the log data. */
    public String getContentType() {
        return contentType;
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
    /** Metadata key and value pairs separated by a semicolon. Example k1:v1;k2:v2;k3:v3 */
    private String opcMetaProperties;

    /** Metadata key and value pairs separated by a semicolon. Example k1:v1;k2:v2;k3:v3 */
    public String getOpcMetaProperties() {
        return opcMetaProperties;
    }
    /**
     * A value of {@code 100-continue} requests preliminary verification of the request method,
     * path, and headers before the request body is sent. If no error results from such
     * verification, the server will send a 100 (Continue) interim response to indicate readiness
     * for the request body. The only allowed value for this parameter is "100-Continue"
     * (case-insensitive).
     */
    private String expect;

    /**
     * A value of {@code 100-continue} requests preliminary verification of the request method,
     * path, and headers before the request body is sent. If no error results from such
     * verification, the server will send a 100 (Continue) interim response to indicate readiness
     * for the request body. The only allowed value for this parameter is "100-Continue"
     * (case-insensitive).
     */
    public String getExpect() {
        return expect;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return uploadOtlpLogsDetails;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UploadOtlpLogsRequest, java.io.InputStream> {
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

        /** The log group OCID to which the log data in this upload will be mapped to. */
        private String opcMetaLoggrpid = null;

        /**
         * The log group OCID to which the log data in this upload will be mapped to.
         *
         * @param opcMetaLoggrpid the value to set
         * @return this builder instance
         */
        public Builder opcMetaLoggrpid(String opcMetaLoggrpid) {
            this.opcMetaLoggrpid = opcMetaLoggrpid;
            return this;
        }

        /**
         * Accepts log data in OTLP JSON-encoded Protobuf format. Sample format:
         * https://github.com/open-telemetry/opentelemetry-proto/blob/v1.3.1/examples/logs.json
         */
        private java.io.InputStream uploadOtlpLogsDetails = null;

        /**
         * Accepts log data in OTLP JSON-encoded Protobuf format. Sample format:
         * https://github.com/open-telemetry/opentelemetry-proto/blob/v1.3.1/examples/logs.json
         *
         * @param uploadOtlpLogsDetails the value to set
         * @return this builder instance
         */
        public Builder uploadOtlpLogsDetails(java.io.InputStream uploadOtlpLogsDetails) {
            this.uploadOtlpLogsDetails = uploadOtlpLogsDetails;
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

        /** The log set that gets associated with the uploaded logs. */
        private String logSet = null;

        /**
         * The log set that gets associated with the uploaded logs.
         *
         * @param logSet the value to set
         * @return this builder instance
         */
        public Builder logSet(String logSet) {
            this.logSet = logSet;
            return this;
        }

        /** The content type of the log data. */
        private String contentType = null;

        /**
         * The content type of the log data.
         *
         * @param contentType the value to set
         * @return this builder instance
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
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

        /** Metadata key and value pairs separated by a semicolon. Example k1:v1;k2:v2;k3:v3 */
        private String opcMetaProperties = null;

        /**
         * Metadata key and value pairs separated by a semicolon. Example k1:v1;k2:v2;k3:v3
         *
         * @param opcMetaProperties the value to set
         * @return this builder instance
         */
        public Builder opcMetaProperties(String opcMetaProperties) {
            this.opcMetaProperties = opcMetaProperties;
            return this;
        }

        /**
         * A value of {@code 100-continue} requests preliminary verification of the request method,
         * path, and headers before the request body is sent. If no error results from such
         * verification, the server will send a 100 (Continue) interim response to indicate
         * readiness for the request body. The only allowed value for this parameter is
         * "100-Continue" (case-insensitive).
         */
        private String expect = null;

        /**
         * A value of {@code 100-continue} requests preliminary verification of the request method,
         * path, and headers before the request body is sent. If no error results from such
         * verification, the server will send a 100 (Continue) interim response to indicate
         * readiness for the request body. The only allowed value for this parameter is
         * "100-Continue" (case-insensitive).
         *
         * @param expect the value to set
         * @return this builder instance
         */
        public Builder expect(String expect) {
            this.expect = expect;
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
        public Builder copy(UploadOtlpLogsRequest o) {
            namespaceName(o.getNamespaceName());
            opcMetaLoggrpid(o.getOpcMetaLoggrpid());
            uploadOtlpLogsDetails(o.getUploadOtlpLogsDetails());
            opcRequestId(o.getOpcRequestId());
            logSet(o.getLogSet());
            contentType(o.getContentType());
            opcRetryToken(o.getOpcRetryToken());
            opcMetaProperties(o.getOpcMetaProperties());
            expect(o.getExpect());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UploadOtlpLogsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UploadOtlpLogsRequest
         */
        public UploadOtlpLogsRequest build() {
            UploadOtlpLogsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(java.io.InputStream body) {
            uploadOtlpLogsDetails(body);
            return this;
        }

        /**
         * Build the instance of UploadOtlpLogsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UploadOtlpLogsRequest
         */
        public UploadOtlpLogsRequest buildWithoutInvocationCallback() {
            UploadOtlpLogsRequest request = new UploadOtlpLogsRequest();
            request.namespaceName = namespaceName;
            request.opcMetaLoggrpid = opcMetaLoggrpid;
            request.uploadOtlpLogsDetails = uploadOtlpLogsDetails;
            request.opcRequestId = opcRequestId;
            request.logSet = logSet;
            request.contentType = contentType;
            request.opcRetryToken = opcRetryToken;
            request.opcMetaProperties = opcMetaProperties;
            request.expect = expect;
            return request;
            // new UploadOtlpLogsRequest(namespaceName, opcMetaLoggrpid, uploadOtlpLogsDetails,
            // opcRequestId, logSet, contentType, opcRetryToken, opcMetaProperties, expect);
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
                .opcMetaLoggrpid(opcMetaLoggrpid)
                .uploadOtlpLogsDetails(uploadOtlpLogsDetails)
                .opcRequestId(opcRequestId)
                .logSet(logSet)
                .contentType(contentType)
                .opcRetryToken(opcRetryToken)
                .opcMetaProperties(opcMetaProperties)
                .expect(expect);
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
        sb.append(",opcMetaLoggrpid=").append(String.valueOf(this.opcMetaLoggrpid));
        sb.append(",uploadOtlpLogsDetails=").append(String.valueOf(this.uploadOtlpLogsDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",logSet=").append(String.valueOf(this.logSet));
        sb.append(",contentType=").append(String.valueOf(this.contentType));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcMetaProperties=").append(String.valueOf(this.opcMetaProperties));
        sb.append(",expect=").append(String.valueOf(this.expect));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadOtlpLogsRequest)) {
            return false;
        }

        UploadOtlpLogsRequest other = (UploadOtlpLogsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.opcMetaLoggrpid, other.opcMetaLoggrpid)
                && java.util.Objects.equals(this.uploadOtlpLogsDetails, other.uploadOtlpLogsDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.logSet, other.logSet)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcMetaProperties, other.opcMetaProperties)
                && java.util.Objects.equals(this.expect, other.expect);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.opcMetaLoggrpid == null ? 43 : this.opcMetaLoggrpid.hashCode());
        result =
                (result * PRIME)
                        + (this.uploadOtlpLogsDetails == null
                                ? 43
                                : this.uploadOtlpLogsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.logSet == null ? 43 : this.logSet.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result =
                (result * PRIME)
                        + (this.opcMetaProperties == null ? 43 : this.opcMetaProperties.hashCode());
        result = (result * PRIME) + (this.expect == null ? 43 : this.expect.hashCode());
        return result;
    }
}
