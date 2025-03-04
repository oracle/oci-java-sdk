/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UploadDiscoveryDataExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UploadDiscoveryDataRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class UploadDiscoveryDataRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** Discovery data */
    private java.io.InputStream uploadDiscoveryDataDetails;

    /** Discovery data */
    public java.io.InputStream getUploadDiscoveryDataDetails() {
        return uploadDiscoveryDataDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** Metadata key and value pairs separated by a semicolon. Example k1:v1;k2:v2;k3:v3 */
    private String opcMetaProperties;

    /** Metadata key and value pairs separated by a semicolon. Example k1:v1;k2:v2;k3:v3 */
    public String getOpcMetaProperties() {
        return opcMetaProperties;
    }
    /** Discovery data type */
    private DiscoveryDataType discoveryDataType;

    /** Discovery data type */
    public enum DiscoveryDataType implements com.oracle.bmc.http.internal.BmcEnum {
        Entity("ENTITY"),
        K8SObjects("K8S_OBJECTS"),
        ;

        private final String value;
        private static java.util.Map<String, DiscoveryDataType> map;

        static {
            map = new java.util.HashMap<>();
            for (DiscoveryDataType v : DiscoveryDataType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DiscoveryDataType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DiscoveryDataType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DiscoveryDataType: " + key);
        }
    };

    /** Discovery data type */
    public DiscoveryDataType getDiscoveryDataType() {
        return discoveryDataType;
    }
    /** The log group OCID that gets mapped to the logs in the discovery data. */
    private String logGroupId;

    /** The log group OCID that gets mapped to the logs in the discovery data. */
    public String getLogGroupId() {
        return logGroupId;
    }
    /** Identifies the type of request payload. */
    private com.oracle.bmc.loganalytics.model.PayloadType payloadType;

    /** Identifies the type of request payload. */
    public com.oracle.bmc.loganalytics.model.PayloadType getPayloadType() {
        return payloadType;
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
        return uploadDiscoveryDataDetails;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UploadDiscoveryDataRequest, java.io.InputStream> {
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

        /** Discovery data */
        private java.io.InputStream uploadDiscoveryDataDetails = null;

        /**
         * Discovery data
         *
         * @param uploadDiscoveryDataDetails the value to set
         * @return this builder instance
         */
        public Builder uploadDiscoveryDataDetails(java.io.InputStream uploadDiscoveryDataDetails) {
            this.uploadDiscoveryDataDetails = uploadDiscoveryDataDetails;
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

        /** Discovery data type */
        private DiscoveryDataType discoveryDataType = null;

        /**
         * Discovery data type
         *
         * @param discoveryDataType the value to set
         * @return this builder instance
         */
        public Builder discoveryDataType(DiscoveryDataType discoveryDataType) {
            this.discoveryDataType = discoveryDataType;
            return this;
        }

        /** The log group OCID that gets mapped to the logs in the discovery data. */
        private String logGroupId = null;

        /**
         * The log group OCID that gets mapped to the logs in the discovery data.
         *
         * @param logGroupId the value to set
         * @return this builder instance
         */
        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            return this;
        }

        /** Identifies the type of request payload. */
        private com.oracle.bmc.loganalytics.model.PayloadType payloadType = null;

        /**
         * Identifies the type of request payload.
         *
         * @param payloadType the value to set
         * @return this builder instance
         */
        public Builder payloadType(com.oracle.bmc.loganalytics.model.PayloadType payloadType) {
            this.payloadType = payloadType;
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
        public Builder copy(UploadDiscoveryDataRequest o) {
            namespaceName(o.getNamespaceName());
            uploadDiscoveryDataDetails(o.getUploadDiscoveryDataDetails());
            opcRequestId(o.getOpcRequestId());
            opcMetaProperties(o.getOpcMetaProperties());
            discoveryDataType(o.getDiscoveryDataType());
            logGroupId(o.getLogGroupId());
            payloadType(o.getPayloadType());
            contentType(o.getContentType());
            opcRetryToken(o.getOpcRetryToken());
            expect(o.getExpect());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UploadDiscoveryDataRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UploadDiscoveryDataRequest
         */
        public UploadDiscoveryDataRequest build() {
            UploadDiscoveryDataRequest request = buildWithoutInvocationCallback();
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
            uploadDiscoveryDataDetails(body);
            return this;
        }

        /**
         * Build the instance of UploadDiscoveryDataRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UploadDiscoveryDataRequest
         */
        public UploadDiscoveryDataRequest buildWithoutInvocationCallback() {
            UploadDiscoveryDataRequest request = new UploadDiscoveryDataRequest();
            request.namespaceName = namespaceName;
            request.uploadDiscoveryDataDetails = uploadDiscoveryDataDetails;
            request.opcRequestId = opcRequestId;
            request.opcMetaProperties = opcMetaProperties;
            request.discoveryDataType = discoveryDataType;
            request.logGroupId = logGroupId;
            request.payloadType = payloadType;
            request.contentType = contentType;
            request.opcRetryToken = opcRetryToken;
            request.expect = expect;
            return request;
            // new UploadDiscoveryDataRequest(namespaceName, uploadDiscoveryDataDetails,
            // opcRequestId, opcMetaProperties, discoveryDataType, logGroupId, payloadType,
            // contentType, opcRetryToken, expect);
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
                .uploadDiscoveryDataDetails(uploadDiscoveryDataDetails)
                .opcRequestId(opcRequestId)
                .opcMetaProperties(opcMetaProperties)
                .discoveryDataType(discoveryDataType)
                .logGroupId(logGroupId)
                .payloadType(payloadType)
                .contentType(contentType)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",uploadDiscoveryDataDetails=")
                .append(String.valueOf(this.uploadDiscoveryDataDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcMetaProperties=").append(String.valueOf(this.opcMetaProperties));
        sb.append(",discoveryDataType=").append(String.valueOf(this.discoveryDataType));
        sb.append(",logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(",payloadType=").append(String.valueOf(this.payloadType));
        sb.append(",contentType=").append(String.valueOf(this.contentType));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",expect=").append(String.valueOf(this.expect));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadDiscoveryDataRequest)) {
            return false;
        }

        UploadDiscoveryDataRequest other = (UploadDiscoveryDataRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(
                        this.uploadDiscoveryDataDetails, other.uploadDiscoveryDataDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcMetaProperties, other.opcMetaProperties)
                && java.util.Objects.equals(this.discoveryDataType, other.discoveryDataType)
                && java.util.Objects.equals(this.logGroupId, other.logGroupId)
                && java.util.Objects.equals(this.payloadType, other.payloadType)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
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
                        + (this.uploadDiscoveryDataDetails == null
                                ? 43
                                : this.uploadDiscoveryDataDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcMetaProperties == null ? 43 : this.opcMetaProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.discoveryDataType == null ? 43 : this.discoveryDataType.hashCode());
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result = (result * PRIME) + (this.payloadType == null ? 43 : this.payloadType.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.expect == null ? 43 : this.expect.hashCode());
        return result;
    }
}
