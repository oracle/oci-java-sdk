/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UploadLogEventsFileExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UploadLogEventsFileRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class UploadLogEventsFileRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The log group OCID that gets mapped to the uploaded logs.
     *
     */
    private String logGroupId;

    /**
     * The log group OCID that gets mapped to the uploaded logs.
     *
     */
    public String getLogGroupId() {
        return logGroupId;
    }
    /**
     * Log events data to be uploaded. The data could be uploaded with or without logSet information depending on whether logSet is enabled for the tenancy or not. Supported formats include
     * 1. json file : logSet (if needed) should be sent as "logSet" query parameter
     * 2. gzip file : logSet (if needed) should be sent as "logSet" query parameter
     * 3. zip file : containing multiple json files. LogSet information (if needed) should be appended to every filename in the zip.
     *    Supported filename format with logSet detail is &lt;filename&gt;_logSet=&lt;logset&gt;.json
     *
     */
    private java.io.InputStream uploadLogEventsFileDetails;

    /**
     * Log events data to be uploaded. The data could be uploaded with or without logSet information depending on whether logSet is enabled for the tenancy or not. Supported formats include
     * 1. json file : logSet (if needed) should be sent as "logSet" query parameter
     * 2. gzip file : logSet (if needed) should be sent as "logSet" query parameter
     * 3. zip file : containing multiple json files. LogSet information (if needed) should be appended to every filename in the zip.
     *    Supported filename format with logSet detail is &lt;filename&gt;_logSet=&lt;logset&gt;.json
     *
     */
    public java.io.InputStream getUploadLogEventsFileDetails() {
        return uploadLogEventsFileDetails;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The log set that gets associated with the uploaded logs.
     *
     */
    private String logSet;

    /**
     * The log set that gets associated with the uploaded logs.
     *
     */
    public String getLogSet() {
        return logSet;
    }
    /**
     * Identifies the type of request payload.
     *
     */
    private com.oracle.bmc.loganalytics.model.PayloadType payloadType;

    /**
     * Identifies the type of request payload.
     *
     */
    public com.oracle.bmc.loganalytics.model.PayloadType getPayloadType() {
        return payloadType;
    }
    /**
     * The content type of the log data.
     */
    private String contentType;

    /**
     * The content type of the log data.
     */
    public String getContentType() {
        return contentType;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Metadata key and value pairs separated by a semicolon. Example k1:v1;k2:v2;k3:v3
     *
     */
    private String opcMetaProperties;

    /**
     * Metadata key and value pairs separated by a semicolon. Example k1:v1;k2:v2;k3:v3
     *
     */
    public String getOpcMetaProperties() {
        return opcMetaProperties;
    }
    /**
     * A value of {@code 100-continue} requests preliminary verification of the request method, path, and headers before the request body is sent.
     * If no error results from such verification, the server will send a 100 (Continue) interim response to indicate readiness for the request body.
     * The only allowed value for this parameter is "100-Continue" (case-insensitive).
     *
     */
    private String expect;

    /**
     * A value of {@code 100-continue} requests preliminary verification of the request method, path, and headers before the request body is sent.
     * If no error results from such verification, the server will send a 100 (Continue) interim response to indicate readiness for the request body.
     * The only allowed value for this parameter is "100-Continue" (case-insensitive).
     *
     */
    public String getExpect() {
        return expect;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return uploadLogEventsFileDetails;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UploadLogEventsFileRequest, java.io.InputStream> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         */
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

        /**
         * The log group OCID that gets mapped to the uploaded logs.
         *
         */
        private String logGroupId = null;

        /**
         * The log group OCID that gets mapped to the uploaded logs.
         *
         * @param logGroupId the value to set
         * @return this builder instance
         */
        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            return this;
        }

        /**
         * Log events data to be uploaded. The data could be uploaded with or without logSet information depending on whether logSet is enabled for the tenancy or not. Supported formats include
         * 1. json file : logSet (if needed) should be sent as "logSet" query parameter
         * 2. gzip file : logSet (if needed) should be sent as "logSet" query parameter
         * 3. zip file : containing multiple json files. LogSet information (if needed) should be appended to every filename in the zip.
         *    Supported filename format with logSet detail is &lt;filename&gt;_logSet=&lt;logset&gt;.json
         *
         */
        private java.io.InputStream uploadLogEventsFileDetails = null;

        /**
         * Log events data to be uploaded. The data could be uploaded with or without logSet information depending on whether logSet is enabled for the tenancy or not. Supported formats include
         * 1. json file : logSet (if needed) should be sent as "logSet" query parameter
         * 2. gzip file : logSet (if needed) should be sent as "logSet" query parameter
         * 3. zip file : containing multiple json files. LogSet information (if needed) should be appended to every filename in the zip.
         *    Supported filename format with logSet detail is &lt;filename&gt;_logSet=&lt;logset&gt;.json
         *
         * @param uploadLogEventsFileDetails the value to set
         * @return this builder instance
         */
        public Builder uploadLogEventsFileDetails(java.io.InputStream uploadLogEventsFileDetails) {
            this.uploadLogEventsFileDetails = uploadLogEventsFileDetails;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The log set that gets associated with the uploaded logs.
         *
         */
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

        /**
         * Identifies the type of request payload.
         *
         */
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

        /**
         * The content type of the log data.
         */
        private String contentType = null;

        /**
         * The content type of the log data.
         * @param contentType the value to set
         * @return this builder instance
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Metadata key and value pairs separated by a semicolon. Example k1:v1;k2:v2;k3:v3
         *
         */
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
         * A value of {@code 100-continue} requests preliminary verification of the request method, path, and headers before the request body is sent.
         * If no error results from such verification, the server will send a 100 (Continue) interim response to indicate readiness for the request body.
         * The only allowed value for this parameter is "100-Continue" (case-insensitive).
         *
         */
        private String expect = null;

        /**
         * A value of {@code 100-continue} requests preliminary verification of the request method, path, and headers before the request body is sent.
         * If no error results from such verification, the server will send a 100 (Continue) interim response to indicate readiness for the request body.
         * The only allowed value for this parameter is "100-Continue" (case-insensitive).
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
        public Builder copy(UploadLogEventsFileRequest o) {
            namespaceName(o.getNamespaceName());
            logGroupId(o.getLogGroupId());
            uploadLogEventsFileDetails(o.getUploadLogEventsFileDetails());
            opcRequestId(o.getOpcRequestId());
            logSet(o.getLogSet());
            payloadType(o.getPayloadType());
            contentType(o.getContentType());
            opcRetryToken(o.getOpcRetryToken());
            opcMetaProperties(o.getOpcMetaProperties());
            expect(o.getExpect());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UploadLogEventsFileRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UploadLogEventsFileRequest
         */
        public UploadLogEventsFileRequest build() {
            UploadLogEventsFileRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(java.io.InputStream body) {
            uploadLogEventsFileDetails(body);
            return this;
        }

        /**
         * Build the instance of UploadLogEventsFileRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UploadLogEventsFileRequest
         */
        public UploadLogEventsFileRequest buildWithoutInvocationCallback() {
            UploadLogEventsFileRequest request = new UploadLogEventsFileRequest();
            request.namespaceName = namespaceName;
            request.logGroupId = logGroupId;
            request.uploadLogEventsFileDetails = uploadLogEventsFileDetails;
            request.opcRequestId = opcRequestId;
            request.logSet = logSet;
            request.payloadType = payloadType;
            request.contentType = contentType;
            request.opcRetryToken = opcRetryToken;
            request.opcMetaProperties = opcMetaProperties;
            request.expect = expect;
            return request;
            // new UploadLogEventsFileRequest(namespaceName, logGroupId, uploadLogEventsFileDetails, opcRequestId, logSet, payloadType, contentType, opcRetryToken, opcMetaProperties, expect);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .logGroupId(logGroupId)
                .uploadLogEventsFileDetails(uploadLogEventsFileDetails)
                .opcRequestId(opcRequestId)
                .logSet(logSet)
                .payloadType(payloadType)
                .contentType(contentType)
                .opcRetryToken(opcRetryToken)
                .opcMetaProperties(opcMetaProperties)
                .expect(expect);
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(",uploadLogEventsFileDetails=")
                .append(String.valueOf(this.uploadLogEventsFileDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",logSet=").append(String.valueOf(this.logSet));
        sb.append(",payloadType=").append(String.valueOf(this.payloadType));
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
        if (!(o instanceof UploadLogEventsFileRequest)) {
            return false;
        }

        UploadLogEventsFileRequest other = (UploadLogEventsFileRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.logGroupId, other.logGroupId)
                && java.util.Objects.equals(
                        this.uploadLogEventsFileDetails, other.uploadLogEventsFileDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.logSet, other.logSet)
                && java.util.Objects.equals(this.payloadType, other.payloadType)
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
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.uploadLogEventsFileDetails == null
                                ? 43
                                : this.uploadLogEventsFileDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.logSet == null ? 43 : this.logSet.hashCode());
        result = (result * PRIME) + (this.payloadType == null ? 43 : this.payloadType.hashCode());
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
